import { HttpLibrary, RequestContext, ResponseContext } from "./http";
import { from, Observable } from '../rxjsStub';
import { TokenManager } from "../auth/tokenManager";

const BEARER_PREFIX = "Bearer ";

const findAuthorization = (request: RequestContext): string | undefined => {
  const headers = request.getHeaders();
  const key = Object.keys(headers).find((k) => k.toLowerCase() === "authorization");
  return key ? headers[key] : undefined;
};

/**
 * Wraps an HttpLibrary so a 401 clears the cached token, fetches a new one and resends
 * the request once. Lives at the transport layer rather than in middleware `post`
 * because only here is the original request still available to resend.
 */
export class TokenRefreshHttpLibrary implements HttpLibrary {
  public constructor(
    private readonly inner: HttpLibrary,
    private readonly tokenManager: TokenManager
  ) {}

  public send(request: RequestContext): Observable<ResponseContext> {
    return from(this.sendWithRetry(request));
  }

  private async sendWithRetry(request: RequestContext): Promise<ResponseContext> {
    const response = await this.inner.send(request).toPromise();
    if (response.httpStatusCode !== 401) {
      return response;
    }

    const sent = findAuthorization(request);
    if (!sent?.startsWith(BEARER_PREFIX)) {
      return response;
    }

    const newToken = await this.tokenManager.refreshAfterUnauthorized(sent.slice(BEARER_PREFIX.length));
    if (newToken === null) {
      return response;
    }

    request.setHeaderParam("Authorization", BEARER_PREFIX + newToken);
    return this.inner.send(request).toPromise();
  }
}
