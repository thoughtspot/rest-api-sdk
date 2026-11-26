import http from "http";
import { AddressInfo } from "net";

export interface MockServerOptions {
  /** Validity of each minted token. */
  tokenTtlMs?: number;
  /** Delay before /auth/token/full responds, to widen race windows. */
  mintLatencyMs?: number;
  /** Delay before an authenticated endpoint responds. */
  apiLatencyMs?: number;
}

export interface ServerAttempt {
  /** Value of the X-Req-Id header, which lets a UI group a 401 and its retry. */
  reqId: string | undefined;
  token: string;
  status: number;
}

export interface ServerRequest {
  method: string;
  path: string;
  authorization: string | undefined;
  contentType: string | undefined;
  body: string;
}

export interface MockServerStats {
  mints: number;
  apiCalls: number;
  unauthorized: number;
  /** Highest number of /auth/token/full requests being served at once. */
  maxConcurrentMints: number;
  /** Successful calls per token. */
  usage: Record<string, number>;
}

const USER = { id: "u1", name: "tsadmin", display_name: "Admin", visibility: "SHARABLE" };

/**
 * Minimal stand-in for ThoughtSpot: mints tokens on /auth/token/full and enforces them on
 * GET /auth/session/user. Tokens expire server-side and can be revoked, which is what makes
 * the SDK's 401 path reachable.
 */
export class MockThoughtSpotServer {
  public options: Required<MockServerOptions>;
  public stats: MockServerStats = newStats();
  private server: http.Server;
  private tokens = new Map<string, number>();
  private activeMints = 0;
  private seq = 0;
  private mintFailures = 0;
  /** Most recently minted token, for UIs that show a countdown. */
  public attempts: ServerAttempt[] = [];
  /** Every request received, in order, with its raw body. */
  public requests: ServerRequest[] = [];
  public onMint: ((m: { token: string; expiresAt: number }) => void) | null = null;
  public lastMinted: { token: string; expiresAt: number } | null = null;

  public constructor(options: MockServerOptions = {}) {
    this.options = {
      tokenTtlMs: options.tokenTtlMs ?? 300_000,
      mintLatencyMs: options.mintLatencyMs ?? 0,
      apiLatencyMs: options.apiLatencyMs ?? 0,
    };
    this.server = http.createServer((req, res) => this.handle(req, res));
  }

  public async start(): Promise<string> {
    await new Promise<void>((resolve) => this.server.listen(0, "127.0.0.1", resolve));
    return this.url;
  }

  public async stop(): Promise<void> {
    this.server.closeAllConnections();
    await new Promise<void>((resolve) => this.server.close(() => resolve()));
  }

  public get url(): string {
    return `http://127.0.0.1:${(this.server.address() as AddressInfo).port}`;
  }

  public reset(options: MockServerOptions = {}): void {
    this.options = { tokenTtlMs: 300_000, mintLatencyMs: 0, apiLatencyMs: 0, ...options };
    this.stats = newStats();
    this.tokens.clear();
    this.mintFailures = 0;
    this.lastMinted = null;
    this.attempts = [];
    this.requests = [];
  }

  /** Mints a token directly, as a customer's own backend would. */
  public mint(ttlMs = this.options.tokenTtlMs): { token: string; expiresAt: number } {
    const token = `tok-${++this.seq}`;
    const expiresAt = Date.now() + ttlMs;
    this.tokens.set(token, expiresAt);
    this.stats.mints++;
    this.lastMinted = { token, expiresAt };
    this.onMint?.({ token, expiresAt });
    return { token, expiresAt };
  }

  public revokeAll(): void {
    this.tokens.clear();
  }

  public failNextMints(count: number): void {
    this.mintFailures = count;
  }

  private handle(req: http.IncomingMessage, res: http.ServerResponse): void {
    const path = (req.url ?? "").split("?")[0];
    const chunks: Buffer[] = [];
    req.on("data", (chunk: Buffer) => chunks.push(chunk));
    req.on("end", () => {
      if (this.requests.length < 50_000) {
        this.requests.push({
          method: req.method ?? "",
          path,
          authorization: req.headers.authorization,
          contentType: req.headers["content-type"],
          body: Buffer.concat(chunks).toString("utf8"),
        });
      }
      if (path === "/api/rest/2.0/auth/token/full") {
        void this.handleMint(res);
      } else if (path === "/api/rest/2.0/auth/session/user") {
        void this.handleApi(req, res, USER);
      } else if (path.startsWith("/api/rest/2.0/")) {
        void this.handleApi(req, res, path.endsWith("/search") ? [] : {});
      } else {
        this.send(res, 404, { error: "not found" });
      }
    });
  }

  private async handleMint(res: http.ServerResponse): Promise<void> {
    this.activeMints++;
    this.stats.maxConcurrentMints = Math.max(this.stats.maxConcurrentMints, this.activeMints);
    try {
      await sleep(this.options.mintLatencyMs);
      if (this.mintFailures > 0) {
        this.mintFailures--;
        this.stats.mints++;
        return this.send(res, 500, { error: "mint failed" });
      }
      const { token, expiresAt } = this.mint();
      this.send(res, 200, {
        token,
        creation_time_in_millis: Date.now(),
        expiration_time_in_millis: expiresAt,
        valid_for_user_id: "u1",
        valid_for_username: "tsadmin",
      });
    } finally {
      this.activeMints--;
    }
  }

  private async handleApi(req: http.IncomingMessage, res: http.ServerResponse, payload: unknown): Promise<void> {
    this.stats.apiCalls++;
    await sleep(this.options.apiLatencyMs);
    const token = (req.headers.authorization ?? "").replace(/^Bearer /, "");
    const expiresAt = this.tokens.get(token);
    if (expiresAt === undefined || expiresAt <= Date.now()) {
      this.stats.unauthorized++;
      this.record(req, token, 401);
      return this.send(res, 401, { error: { message: "unauthorized" } });
    }
    this.stats.usage[token] = (this.stats.usage[token] ?? 0) + 1;
    this.record(req, token, 200);
    this.send(res, 200, payload);
  }

  private record(req: http.IncomingMessage, token: string, status: number): void {
    if (this.attempts.length < 50_000) {
      this.attempts.push({ reqId: req.headers["x-req-id"] as string | undefined, token, status });
    }
  }

  private send(res: http.ServerResponse, status: number, body: unknown): void {
    res.writeHead(status, { "Content-Type": "application/json" });
    res.end(JSON.stringify(body));
  }
}

function newStats(): MockServerStats {
  return { mints: 0, apiCalls: 0, unauthorized: 0, maxConcurrentMints: 0, usage: {} };
}

export const sleep = (ms: number) => new Promise<void>((r) => setTimeout(r, ms));
