import { TokenProvider } from "./auth";

/**
 * What a customer's getToken function may return. `expiresAt` is epoch milliseconds
 * and maps directly to `expiration_time_in_millis` from `/auth/token/*`.
 */
export type TokenResult =
  | string
  | { token: string; expiresAt?: number; tokenBufferMs?: number };

export type TokenFetchReason = "cold" | "expiry" | "401";

export const DEFAULT_REFRESH_BUFFER_MS = 30_000;

export interface TokenManagerOptions {
  /** Milliseconds before `expiresAt` at which the token is refreshed. Defaults to 30s. */
  refreshBufferMs?: number;
  /** Receives a message each time getToken is called and why. Never receives a token. */
  logger?: (message: string) => void;
  /** Clock source, overridable for tests. */
  now?: () => number;
}

interface CachedToken {
  token: string;
  expiresAt?: number;
  tokenBufferMs?: number;
}

const decodeBase64 = (value: string): string | null => {
  const b64 = value.replace(/-/g, "+").replace(/_/g, "/");
  const padded = b64 + "=".repeat((4 - (b64.length % 4)) % 4);
  const g = globalThis as any;
  try {
    if (typeof g.atob === "function") {
      return g.atob(padded);
    }
    if (g.Buffer) {
      return g.Buffer.from(padded, "base64").toString("binary");
    }
  } catch {
    // not base64
  }
  return null;
};

const toEpochMs = (ts: number): number => (ts < 1e12 ? ts * 1000 : ts);

const epochFromColonParts = (decoded: string | null): number | null => {
  const parts = decoded?.split(":");
  if (!parts || parts.length < 3 || !/^\d+$/.test(parts[1])) {
    return null;
  }
  return toEpochMs(Number(parts[1]));
};

const jwtExpiry = (token: string): number | null => {
  const parts = token.split(".");
  if (parts.length !== 3) {
    return null;
  }
  try {
    const exp = JSON.parse(decodeBase64(parts[1]) ?? "").exp;
    return typeof exp === "number" ? toEpochMs(exp) : null;
  } catch {
    return null;
  }
};

/**
 * Best-effort expiry hint from the token itself, when `embedExpiryInAuthToken` is on:
 * `base64(userId:expiry:hash)`, `base64(username:base64(userId:expiry:hash))` or a JWT `exp`.
 */
export const extractTokenExpiry = (token: string): number | null => {
  const jwt = jwtExpiry(token);
  if (jwt !== null) {
    return jwt;
  }
  const decoded = decodeBase64(token);
  // username may contain ":" but the inner base64 cannot, so split on the last one
  const inner = decoded && decoded.includes(":") ? decodeBase64(decoded.slice(decoded.lastIndexOf(":") + 1)) : null;
  return epochFromColonParts(inner) ?? epochFromColonParts(decoded);
};

const normalize = (result: TokenResult, now: number): CachedToken => {
  const cached = typeof result === "string" ? { token: result } : result;
  if (!cached || typeof cached.token !== "string" || cached.token === "") {
    throw new Error("getToken must return a non-empty token string or { token, expiresAt }");
  }
  if (cached.expiresAt !== undefined) {
    return cached;
  }
  const hinted = extractTokenExpiry(cached.token);
  // a misread or stale value must not force a fetch on every request; the 401 retry covers it
  return hinted !== null && hinted > now ? { ...cached, expiresAt: hinted } : cached;
};

const errorName = (e: unknown): string => (e instanceof Error ? e.name : typeof e);

/**
 * Caches the token returned by a customer's getToken function, refreshes it ahead of
 * expiry and deduplicates concurrent fetches. One instance per client, never shared.
 */
export class TokenManager implements TokenProvider {
  private cached: CachedToken | null = null;
  private inflight: Promise<CachedToken> | null = null;
  private warnedShortLived = false;
  private readonly refreshBufferMs: number;
  private readonly logger: (message: string) => void;
  private readonly now: () => number;

  public constructor(
    private readonly fetchToken: () => Promise<TokenResult> | TokenResult,
    options: TokenManagerOptions = {}
  ) {
    this.refreshBufferMs = options.refreshBufferMs ?? DEFAULT_REFRESH_BUFFER_MS;
    this.logger = options.logger ?? (() => {});
    this.now = options.now ?? Date.now;
  }

  public async getToken(): Promise<string> {
    const current = this.cached;
    if (current) {
      if (!this.isExpiring(current)) {
        return current.token;
      }
      try {
        return (await this.requestNew("expiry")).token;
      } catch (e) {
        // a failed early refresh must not fail a request the cached token can still serve
        if ((current.expiresAt ?? 0) <= this.now()) {
          throw e;
        }
        this.logger(
          `warning: getToken failed while refreshing a still-valid token (${errorName(e)}); using the cached token`
        );
        return current.token;
      }
    }
    return (await this.requestNew("cold")).token;
  }

  /**
   * Called when `failedToken` was rejected with a 401. Returns a replacement token,
   * or null when getToken itself fails so the caller can surface the original 401.
   */
  public async refreshAfterUnauthorized(failedToken: string): Promise<string | null> {
    const current = this.cached;
    if (current && current.token !== failedToken) {
      // a concurrent request already replaced the rejected token
      return current.token;
    }
    this.cached = null;
    try {
      return (await this.requestNew("401")).token;
    } catch (e) {
      this.logger(`getToken failed after 401: ${(e as Error)?.message ?? e}`);
      return null;
    }
  }

  private isExpiring(current: CachedToken): boolean {
    if (current.expiresAt === undefined) {
      return false;
    }
    const buffer = current.tokenBufferMs ?? this.refreshBufferMs;
    return current.expiresAt - this.now() <= buffer;
  }

  private requestNew(reason: TokenFetchReason): Promise<CachedToken> {
    if (!this.inflight) {
      this.inflight = this.fetchNew(reason).finally(() => {
        this.inflight = null;
      });
    }
    return this.inflight;
  }

  private async fetchNew(reason: TokenFetchReason): Promise<CachedToken> {
    this.logger(`calling getToken (reason: ${reason})`);
    const fresh = normalize(await this.fetchToken(), this.now());
    this.cached = fresh;
    this.warnIfShortLived(fresh);
    return fresh;
  }

  private warnIfShortLived(fresh: CachedToken): void {
    if (this.warnedShortLived || !this.isExpiring(fresh)) {
      return;
    }
    this.warnedShortLived = true;
    this.logger(
      "warning: getToken returned a token that expires within the refresh buffer, so getToken will be " +
        "called on every request. Check that expiresAt is epoch milliseconds and that the token lifetime " +
        "exceeds refreshBufferMs."
    );
  }
}
