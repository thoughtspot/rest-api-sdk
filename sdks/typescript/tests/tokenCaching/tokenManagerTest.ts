import chai from "chai";
import chaiAsPromised from "chai-as-promised";
import { DEFAULT_REFRESH_BUFFER_MS, TokenManager, TokenResult, extractTokenExpiry } from "../../auth/tokenManager";
import { createBearerAuthenticationConfig } from "../../utils/config";
import { PromiseThoughtSpotRestApi } from "../../types/PromiseAPI";
import { MockThoughtSpotServer, sleep } from "./mockThoughtSpotServer";

chai.use(chaiAsPromised);
const expect = chai.expect;

const fakeClock = (start = 1_000_000) => {
  let t = start;
  return { now: () => t, advance: (ms: number) => void (t += ms) };
};

const countingFetcher = (results: TokenResult[]) => {
  let calls = 0;
  const fn = async () => results[Math.min(calls++, results.length - 1)];
  return { fn, calls: () => calls };
};

describe("TokenManager", () => {
  it("fetches lazily on first use, then serves the cache", async () => {
    const f = countingFetcher(["a"]);
    const m = new TokenManager(f.fn);
    expect(f.calls()).to.equal(0);
    expect(await m.getToken()).to.equal("a");
    expect(await m.getToken()).to.equal("a");
    expect(f.calls()).to.equal(1);
  });

  it("refreshes only once fewer than the buffer (default 30s) remains", async () => {
    const clock = fakeClock();
    const f = countingFetcher([
      { token: "a", expiresAt: clock.now() + 300_000 },
      { token: "b", expiresAt: clock.now() + 600_000 },
    ]);
    const m = new TokenManager(f.fn, { now: clock.now });

    expect(await m.getToken()).to.equal("a");
    clock.advance(300_000 - DEFAULT_REFRESH_BUFFER_MS - 1);
    expect(await m.getToken()).to.equal("a");
    clock.advance(2);
    expect(await m.getToken()).to.equal("b");
    expect(f.calls()).to.equal(2);
  });

  it("honours a client-level buffer and lets a per-token tokenBufferMs override it", async () => {
    const clock = fakeClock();
    const f = countingFetcher([{ token: "a", expiresAt: clock.now() + 100_000 }, "b"]);
    const m = new TokenManager(f.fn, { now: clock.now, refreshBufferMs: 60_000 });
    await m.getToken();
    clock.advance(41_000);
    expect(await m.getToken()).to.equal("b");

    const g = countingFetcher([{ token: "a", expiresAt: clock.now() + 100_000, tokenBufferMs: 10_000 }, "b"]);
    const m2 = new TokenManager(g.fn, { now: clock.now, refreshBufferMs: 60_000 });
    await m2.getToken();
    clock.advance(41_000);
    expect(await m2.getToken()).to.equal("a");
  });

  it("never proactively refreshes a token without expiresAt, however old", async () => {
    const clock = fakeClock();
    const f = countingFetcher(["a", "b"]);
    const m = new TokenManager(f.fn, { now: clock.now });
    await m.getToken();
    clock.advance(10 * 365 * 24 * 3600 * 1000);
    expect(await m.getToken()).to.equal("a");
    expect(f.calls()).to.equal(1);
  });

  it("collapses concurrent cold, expiry and 401 fetches into one getToken call", async () => {
    const clock = fakeClock();
    let calls = 0;
    const slow = async (): Promise<TokenResult> => {
      calls++;
      await sleep(20);
      return { token: `t${calls}`, expiresAt: clock.now() + 300_000 };
    };
    const m = new TokenManager(slow, { now: clock.now });

    const cold = await Promise.all(Array.from({ length: 50 }, () => m.getToken()));
    expect(new Set(cold)).to.deep.equal(new Set(["t1"]));
    expect(calls).to.equal(1);

    clock.advance(290_000);
    const expiry = await Promise.all(Array.from({ length: 50 }, () => m.getToken()));
    expect(new Set(expiry)).to.deep.equal(new Set(["t2"]));
    expect(calls).to.equal(2);

    const after401 = await Promise.all(Array.from({ length: 50 }, () => m.refreshAfterUnauthorized("t2")));
    expect(new Set(after401)).to.deep.equal(new Set(["t3"]));
    expect(calls).to.equal(3);
  });

  it("does not refetch for a 401 on a token that was already replaced", async () => {
    const f = countingFetcher(["a", "b"]);
    const m = new TokenManager(f.fn);
    await m.getToken();
    expect(await m.refreshAfterUnauthorized("a")).to.equal("b");
    expect(await m.refreshAfterUnauthorized("a")).to.equal("b");
    expect(f.calls()).to.equal(2);
  });

  it("returns null after a 401 when getToken throws, and recovers on the next call", async () => {
    let fail = false;
    let n = 0;
    const m = new TokenManager(() => {
      if (fail) throw new Error("auth down");
      return `t${++n}`;
    });
    await m.getToken();
    fail = true;
    expect(await m.refreshAfterUnauthorized("t1")).to.equal(null);
    fail = false;
    expect(await m.getToken()).to.equal("t2");
  });

  it("does not cache a failed fetch, so the next caller retries", async () => {
    let n = 0;
    const m = new TokenManager(async () => {
      if (++n === 1) throw new Error("boom");
      return "ok";
    });
    await expect(m.getToken()).to.be.rejectedWith("boom");
    expect(await m.getToken()).to.equal("ok");
  });

  it("reuses the cached token when an early refresh fails, and rejects once it has expired", async () => {
    const clock = fakeClock();
    let fail = false;
    let n = 0;
    const logs: string[] = [];
    const m = new TokenManager(async () => {
      if (fail) throw new Error("auth down");
      return { token: `t${++n}`, expiresAt: clock.now() + 300_000 };
    }, { now: clock.now, logger: (s) => logs.push(s) });

    expect(await m.getToken()).to.equal("t1");
    clock.advance(300_000 - DEFAULT_REFRESH_BUFFER_MS + 1_000);
    fail = true;
    expect(await m.getToken()).to.equal("t1");
    expect(await m.getToken()).to.equal("t1");
    expect(logs.filter((l) => l.includes("using the cached token"))).to.have.length(2);
    expect(logs.join("\n")).to.not.contain("t1");

    clock.advance(DEFAULT_REFRESH_BUFFER_MS);
    await expect(m.getToken()).to.be.rejectedWith("auth down");

    fail = false;
    expect(await m.getToken()).to.equal("t2");
  });

  it("warns once when getToken returns a token that already expires within the buffer", async () => {
    const clock = fakeClock();
    const logs: string[] = [];
    const m = new TokenManager(
      () => ({ token: "short", expiresAt: clock.now() + 10_000 }),
      { now: clock.now, logger: (s) => logs.push(s) }
    );
    await m.getToken();
    await m.getToken();
    await m.getToken();
    expect(logs.filter((l) => l.includes("expires within the refresh buffer"))).to.have.length(1);
    expect(logs.filter((l) => l.startsWith("calling getToken"))).to.have.length(3);
  });

  describe("expiry embedded in a plain-string token", () => {
    const b64 = (s: string) => Buffer.from(s, "binary").toString("base64");
    const b64url = (s: string) => b64(s).replace(/\+/g, "-").replace(/\//g, "_").replace(/=+$/, "");
    const hash = "$shiro1$SHA-256$500000$c2FsdA==$aGFzaA==";
    const v1 = (expiry: number) => b64url(`0f0dd0f7-7411-4195-a4aa-0dc6b58413c9:${expiry}:${hash}`);
    const v2 = (user: string, expiry: number) => b64url(`${user}:${b64(`0f0dd0f7-7411-4195-a4aa-0dc6b58413c9:${expiry}:${hash}`)}`);
    const jwt = (exp: number) => `${b64url('{"alg":"HS256"}')}.${b64url(JSON.stringify({ sub: "u", exp }))}.sig`;
    const sec = (ms: number) => Math.floor(ms / 1000);

    it("reads seconds or milliseconds from v1, v2 (username with ':') and JWT tokens", () => {
      const at = 1_900_000_000_000;
      expect(extractTokenExpiry(v1(sec(at)))).to.equal(at);
      expect(extractTokenExpiry(v1(at))).to.equal(at);
      expect(extractTokenExpiry(v2("tsadmin", sec(at)))).to.equal(at);
      expect(extractTokenExpiry(v2("dom:ain:user", at))).to.equal(at);
      expect(extractTokenExpiry(jwt(sec(at)))).to.equal(at);
    });

    it("returns null for opaque, legacy and malformed tokens", () => {
      expect(extractTokenExpiry("tok-1")).to.equal(null);
      expect(extractTokenExpiry(b64url(hash))).to.equal(null);
      expect(extractTokenExpiry(b64url(`tsadmin:${b64(hash)}`))).to.equal(null);
      expect(extractTokenExpiry(b64url("a::b"))).to.equal(null);
      expect(extractTokenExpiry(b64url("a:12abc:b"))).to.equal(null);
      expect(extractTokenExpiry("a.b.c")).to.equal(null);
      expect(extractTokenExpiry(`${b64url("{}")}.${b64url('{"exp":"soon"}')}.sig`)).to.equal(null);
    });

    it("refreshes a string token before its embedded expiry, with no 401", async () => {
      const clock = fakeClock(1_800_000_000_000);
      const first = v2("tsadmin", sec(clock.now() + 300_000));
      const f = countingFetcher([first, v1(sec(clock.now() + 900_000))]);
      const m = new TokenManager(f.fn, { now: clock.now });

      expect(await m.getToken()).to.equal(first);
      clock.advance(300_000 - DEFAULT_REFRESH_BUFFER_MS - 1_000);
      expect(await m.getToken()).to.equal(first);
      clock.advance(1_000);
      expect(await m.getToken()).to.not.equal(first);
      expect(f.calls()).to.equal(2);
    });

    it("lets an explicit expiresAt win over the embedded one", async () => {
      const clock = fakeClock(1_800_000_000_000);
      const f = countingFetcher([{ token: jwt(sec(clock.now() + 60_000)), expiresAt: clock.now() + 600_000 }, "b"]);
      const m = new TokenManager(f.fn, { now: clock.now });
      await m.getToken();
      clock.advance(120_000);
      await m.getToken();
      expect(f.calls()).to.equal(1);
    });

    it("ignores an embedded expiry already in the past, so it does not fetch on every request", async () => {
      const clock = fakeClock(1_800_000_000_000);
      const logs: string[] = [];
      const f = countingFetcher([v1(sec(clock.now() - 60_000)), "b"]);
      const m = new TokenManager(f.fn, { now: clock.now, logger: (s) => logs.push(s) });
      await m.getToken();
      await m.getToken();
      expect(f.calls()).to.equal(1);
      expect(logs.some((l) => l.includes("expires within the refresh buffer"))).to.equal(false);
      expect(await m.refreshAfterUnauthorized(v1(sec(clock.now() - 60_000)))).to.equal("b");
    });
  });

  it("rejects empty tokens", async () => {
    const m = new TokenManager(() => "");
    await expect(m.getToken()).to.be.rejectedWith("non-empty token");
  });

  it("logs why getToken ran and never the token", async () => {
    const clock = fakeClock();
    const logs: string[] = [];
    const m = new TokenManager(
      () => ({ token: "SECRET-TOKEN", expiresAt: clock.now() + 60_000 }),
      { now: clock.now, logger: (s) => logs.push(s) }
    );
    await m.getToken();
    clock.advance(40_000);
    await m.getToken();
    await m.refreshAfterUnauthorized("SECRET-TOKEN");
    expect(logs).to.deep.equal([
      "calling getToken (reason: cold)",
      "calling getToken (reason: expiry)",
      "calling getToken (reason: 401)",
    ]);
    expect(logs.join("\n")).to.not.contain("SECRET-TOKEN");
  });
});

describe("createBearerAuthenticationConfig token handling", function () {
  const server = new MockThoughtSpotServer();
  let url: string;
  before(async () => { url = await server.start(); });
  after(() => server.stop());
  beforeEach(() => server.reset());

  const client = (arg: any, opts?: any) =>
    new PromiseThoughtSpotRestApi(createBearerAuthenticationConfig(url, arg, opts));
  const cached = (getToken: () => any, opts?: any) => client({ getToken }, opts);

  it("accepts a getToken that returns a plain string and a {token, expiresAt} object", async () => {
    const asString = cached(async () => server.mint().token);
    const asObject = cached(async () => server.mint());
    for (const api of [asString, asObject]) {
      await api.getCurrentUserInfo();
      await api.getCurrentUserInfo();
    }
    expect(server.stats.mints).to.equal(2);
    expect(server.stats.unauthorized).to.equal(0);
  });

  it("sends a static token string as is and never refreshes it", async () => {
    const { token } = server.mint();
    const api = client(token);
    await api.getCurrentUserInfo();
    server.revokeAll();
    await expect(api.getCurrentUserInfo()).to.be.rejectedWith(/HTTP-Code: 401/);
    expect(server.stats.mints).to.equal(1);
    expect(server.stats.apiCalls).to.equal(2);
  });

  it("calls a plain function on every request and does not retry a 401 (unchanged behaviour)", async () => {
    let calls = 0;
    const api = client(async () => { calls++; return server.mint().token; });
    await api.getCurrentUserInfo();
    await api.getCurrentUserInfo();
    expect(calls).to.equal(2);

    const rejected = client(async () => "never-valid");
    await expect(rejected.getCurrentUserInfo()).to.be.rejectedWith(/HTTP-Code: 401/);
    expect(server.stats.apiCalls).to.equal(3);
  });

  it("calls getToken with its object as this", async () => {
    const source = { prefix: "", async getToken() { return this.prefix + server.mint().token; } };
    await client(source).getCurrentUserInfo();
    expect(server.stats.unauthorized).to.equal(0);
  });

  it("mints from a GetFullAccessTokenRequest once and reuses the token", async () => {
    const api = client({ username: "tsadmin", password: "admin" });
    for (let i = 0; i < 10; i++) await api.getCurrentUserInfo();
    expect(server.stats.mints).to.equal(1);
  });

  it("does not share the cache across clients", async () => {
    const a = cached(async () => server.mint());
    const b = cached(async () => server.mint());
    await a.getCurrentUserInfo();
    await b.getCurrentUserInfo();
    expect(server.stats.mints).to.equal(2);
  });

  it("clears the cache and retries once on 401, resending with the new token", async () => {
    let getTokenCalls = 0;
    const api = cached(async () => { getTokenCalls++; return server.mint(); });
    await api.getCurrentUserInfo();
    server.revokeAll();
    await api.getCurrentUserInfo();
    expect(getTokenCalls).to.equal(2);
    expect(server.stats.unauthorized).to.equal(1);
    expect(server.stats.apiCalls).to.equal(3);
  });

  it("raises an unauthorized error when the retry is also rejected, after exactly one retry", async () => {
    let getTokenCalls = 0;
    const api = cached(async () => { getTokenCalls++; return { token: "never-valid" }; });
    await expect(api.getCurrentUserInfo()).to.be.rejectedWith(/HTTP-Code: 401/);
    expect(getTokenCalls).to.equal(2);
    expect(server.stats.apiCalls).to.equal(2);
  });

  it("surfaces the original 401 when getToken fails during the refresh", async () => {
    let calls = 0;
    const api = cached(async () => {
      if (++calls === 1) return server.mint();
      throw new Error("auth down");
    });
    await api.getCurrentUserInfo();
    server.revokeAll();
    await expect(api.getCurrentUserInfo()).to.be.rejectedWith(/HTTP-Code: 401/);
    expect(server.stats.apiCalls).to.equal(2);
  });

  const SESSION_USER = "/api/rest/2.0/auth/session/user";

  it("rule 3: creating the config neither calls getToken nor mints", async () => {
    let calls = 0;
    cached(async () => { calls++; return server.mint(); });
    client({ username: "tsadmin", password: "admin" });
    expect(calls).to.equal(0);
    expect(server.stats.mints).to.equal(0);
    expect(server.requests).to.have.length(0);
  });

  it("rule 4: reuses the cached token without any validation request", async () => {
    const api = client({ username: "tsadmin", password: "admin" });
    for (let i = 0; i < 5; i++) await api.getCurrentUserInfo();
    expect(server.requests.map((r) => r.path)).to.deep.equal([
      "/api/rest/2.0/auth/token/full",
      ...Array(5).fill(SESSION_USER),
    ]);
  });

  it("rule 6: after a 401, resends a POST with the same body and the new token", async () => {
    let calls = 0;
    const api = cached(async () => { calls++; return server.mint(); });
    await api.searchUsers({ record_size: 5, user_identifier: "tsadmin" });
    server.revokeAll();
    server.requests = [];
    await api.searchUsers({ record_size: 5, user_identifier: "tsadmin" });

    const [rejected, retried] = server.requests;
    expect(server.requests).to.have.length(2);
    expect(rejected.method).to.equal("POST");
    expect(retried.body).to.equal(rejected.body);
    expect(JSON.parse(retried.body)).to.include({ record_size: 5, user_identifier: "tsadmin" });
    expect(retried.authorization).to.not.equal(rejected.authorization);
    expect(retried.authorization).to.equal(`Bearer ${server.lastMinted!.token}`);
    expect(calls).to.equal(2);
  });

  it("retry safety: after a 401, resends a multipart upload with its fields and file intact", async () => {
    const api = cached(async () => server.mint());
    await api.getCurrentUserInfo();
    server.revokeAll();
    server.requests = [];
    const file = Object.assign(new Blob(["manifest-file-content"]), { name: "manifest.zip" });
    await api.dbtConnection("conn", "db", undefined, undefined, undefined, undefined, undefined, undefined, undefined, file);

    const [rejected, retried] = server.requests;
    expect(server.requests).to.have.length(2);
    for (const r of [rejected, retried]) {
      expect(r.contentType).to.match(/^multipart\/form-data/);
      expect(r.body).to.contain('name="connection_name"').and.contain("conn");
      expect(r.body).to.contain('filename="manifest.zip"').and.contain("manifest-file-content");
    }
    expect(retried.body.length).to.equal(rejected.body.length);
  });

  it("does not send the request when getToken fails on a cold start, and tries again next time", async () => {
    let fail = true;
    const api = cached(async () => {
      if (fail) throw new Error("auth down");
      return server.mint();
    });
    await expect(api.getCurrentUserInfo()).to.be.rejectedWith("auth down");
    expect(server.requests).to.have.length(0);

    fail = false;
    await api.getCurrentUserInfo();
    expect(server.requests).to.have.length(1);
  });

  it("rule 9: tokenLogger gets the reason for each getToken call and never a token", async () => {
    const logs: string[] = [];
    const api = cached(async () => server.mint(), { tokenLogger: (m: string) => logs.push(m) });
    await api.getCurrentUserInfo();
    server.revokeAll();
    await api.getCurrentUserInfo();
    expect(logs).to.deep.equal(["calling getToken (reason: cold)", "calling getToken (reason: 401)"]);
    expect(logs.join("\n")).to.not.match(/tok-\d+/);
  });

  it("a 401 on a request sent without a Bearer token is returned as is", async () => {
    let calls = 0;
    const api = cached(async () => { calls++; return server.mint(); });
    await api.getCurrentUserInfo();
    const config = createBearerAuthenticationConfig(url, { getToken: async () => { calls++; return server.mint(); } });
    const unauthenticated = new PromiseThoughtSpotRestApi({ ...config, authMethods: {} } as any);
    await expect(unauthenticated.getCurrentUserInfo()).to.be.rejectedWith(/HTTP-Code: 401/);
    expect(calls).to.equal(1);
  });

  it("rule 5: refreshes before expiry with the default 30s buffer and honours refreshBufferMs", async () => {
    let calls = 0;
    const fetchToken = async () => { calls++; return server.mint(60_000); };

    const withDefault = cached(fetchToken);
    await withDefault.getCurrentUserInfo();
    await withDefault.getCurrentUserInfo();
    expect(calls).to.equal(1);

    calls = 0;
    const withWideBuffer = cached(fetchToken, { refreshBufferMs: 90_000 });
    await withWideBuffer.getCurrentUserInfo();
    await withWideBuffer.getCurrentUserInfo();
    expect(calls).to.equal(2);
  });

  it("GetFullAccessTokenRequest: uses expiration_time_in_millis to refresh before expiry", async () => {
    server.options.tokenTtlMs = 10_000;
    const api = client({ username: "tsadmin", password: "admin" });
    for (let i = 0; i < 3; i++) await api.getCurrentUserInfo();
    expect(server.stats.mints).to.equal(3);
    expect(server.stats.unauthorized).to.equal(0);
  });

  it("GetFullAccessTokenRequest: a failed mint reaches the caller and the next request mints again", async () => {
    server.failNextMints(1);
    const api = client({ username: "tsadmin", password: "admin" });
    await expect(api.getCurrentUserInfo()).to.be.rejectedWith(/HTTP-Code: 500/);
    expect(server.requests.map((r) => r.path)).to.not.include(SESSION_USER);
    await api.getCurrentUserInfo();
    expect(server.stats.apiCalls).to.equal(1);
  });

  it("trade-off: a string-only token is replaced after one 401 and the request still succeeds", async () => {
    let calls = 0;
    const api = cached(async () => { calls++; return server.mint().token; });
    await api.getCurrentUserInfo();
    server.revokeAll();
    await api.getCurrentUserInfo();
    expect(calls).to.equal(2);
    expect(server.stats.unauthorized).to.equal(1);
    expect(server.stats.apiCalls).to.equal(3);
  });

  it("rule 7: concurrent requests on a cold client share one getToken call", async () => {
    let calls = 0;
    const api = cached(async () => { calls++; return server.mint(); });
    const results = await Promise.allSettled(Array.from({ length: 20 }, () => api.getCurrentUserInfo()));
    expect(results.every((r) => r.status === "fulfilled")).to.equal(true);
    expect(calls).to.equal(1);
  });

  it("rule 7: concurrent requests rejected with 401 share one refresh and all succeed", async () => {
    let calls = 0;
    const api = cached(async () => { calls++; return server.mint(); });
    await api.getCurrentUserInfo();
    server.revokeAll();
    const results = await Promise.allSettled(Array.from({ length: 20 }, () => api.getCurrentUserInfo()));
    expect(results.every((r) => r.status === "fulfilled")).to.equal(true);
    expect(calls).to.equal(2);
  });
});
