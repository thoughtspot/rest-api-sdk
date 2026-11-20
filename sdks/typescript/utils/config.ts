import { AuthMethodsConfiguration, TokenProvider } from "../auth/auth";
import { TokenManager, TokenResult } from "../auth/tokenManager";
import { createConfiguration } from "../configuration";
import { TokenRefreshHttpLibrary } from "../http/tokenRefreshHttpLibrary";
import { IsomorphicFetchHttpLibrary } from "../http/isomorphic-fetch";
import { GetFullAccessTokenRequest } from "../models/GetFullAccessTokenRequest";
import { BaseServerConfiguration, ServerConfiguration } from "../servers";
import { PromiseAuthenticationApi } from "../types/PromiseAPI";

/**
 * Options for additional configuration settings
 */
export interface ConfigurationOptions {
  /**
   * Additional headers to be included in every request
   * @example
   * ```typescript
   * {
   *   additionalHeaders: {
   *     "Accept-Language": "en-US",
   *   }
   * }
   * ```
   */
  additionalHeaders?: Record<string, string>;
  /**
   * Milliseconds before a token's `expiresAt` at which it is refreshed. Defaults to 30000.
   * Keep it well below the token validity, otherwise every request refetches.
   */
  refreshBufferMs?: number;
  /** Receives a message whenever the token function is called and why. Never receives a token. */
  tokenLogger?: (message: string) => void;
}

/**
 * Creates promise middleware for adding custom headers to requests
 * @param additionalHeaders - Optional headers to add to every request
 * @returns Middleware object for handling custom headers
 */
const createAdditionalHeadersMiddleware = (additionalHeaders: Record<string, string>) => {
  return {
      /**
       * Pre-request middleware to add custom headers to every API call
       * @param requestContext - The request context to modify
       */
      pre: (requestContext: any) => {
        Object.entries(additionalHeaders).forEach(([headerName, headerValue]) => {
          requestContext.setHeaderParam(headerName, headerValue);
        });
        return Promise.resolve(requestContext);
      },
      /**
       * Post-request middleware for response processing
       * @param responseContext - The response context
       */
      post: (responseContext: any) => Promise.resolve(responseContext),
    };
};

/**
  * creates a bearer authentication configuration using params or a token provider
  * @param thoughtSpotHost thoughtSpotHost URL
  * @param paramOrTokenProvider a GetFullAccessTokenRequest, `{ getToken }`, a token function or a static token string.
  * - GetFullAccessTokenRequest: the SDK gets a token from `/auth/token/full` and caches it.
  * - `{ getToken }`: getToken returns a token string or `{ token, expiresAt }` (`expiresAt` in epoch ms, e.g.
  *   `expiration_time_in_millis` from `/auth/token/*`). The SDK caches the result, calls getToken again
  *   `refreshBufferMs` before `expiresAt` and after a 401.
  * - A function returning a token string: called on every request, never cached.
  * - A static string: sent as is and never refreshed.
  * @param options - Optional configuration for custom headers and other settings
  * @returns Configuration object ready for authenticated API calls 
  * @example
  * ```typescript
  * const configWithTokenProvider = createBearerAuthenticationConfig(
  *   "CLUSTER_SERVER_URL", 
  *   YOUR_TOKEN_PROVIDER, 
  *   {
  *     additionalHeaders: {
  *       "Accept-Language": "en-US",
  *     }
  *   }
  * );
 */
export const createBearerAuthenticationConfig = (
  thoughtSpotHost: string,
  paramOrTokenProvider:
    | GetFullAccessTokenRequest
    | { getToken: () => Promise<TokenResult> | TokenResult }
    | (() => Promise<string> | string)
    | string,
  options?: ConfigurationOptions
) => {
  const serverConfig: BaseServerConfiguration = new ServerConfiguration<{}>(
    thoughtSpotHost,
    {}
  );  

  const additionalHeaders = options?.additionalHeaders;
  let middleware = [];
  if (additionalHeaders && Object.keys(additionalHeaders).length > 0) {
    middleware.push(createAdditionalHeadersMiddleware(additionalHeaders));
  }
  
  const config = createConfiguration({
    baseServer: serverConfig,
    promiseMiddleware: middleware,
  });

  const authApiClient = new PromiseAuthenticationApi(config);

  let tokenProvider: TokenProvider;
  let tokenManager: TokenManager | undefined;
  const managerOptions = {
    refreshBufferMs: options?.refreshBufferMs,
    logger: options?.tokenLogger,
  };

  if (typeof paramOrTokenProvider === "string") {
    tokenProvider = { getToken: () => paramOrTokenProvider };
  } else if (typeof paramOrTokenProvider === "function") {
    tokenProvider = { getToken: paramOrTokenProvider };
  } else if (paramOrTokenProvider && "getToken" in paramOrTokenProvider) {
    const source = paramOrTokenProvider;
    tokenProvider = tokenManager = new TokenManager(() => source.getToken(), managerOptions);
  } else if (paramOrTokenProvider?.hasOwnProperty("username")) {
    tokenProvider = tokenManager = new TokenManager(async () => {
      const resp = await authApiClient.getFullAccessToken(paramOrTokenProvider as GetFullAccessTokenRequest);
      return { token: resp.token, expiresAt: resp.expiration_time_in_millis };
    }, managerOptions);
  } else {
    throw new Error("Pass a proper GetFullAccessTokenRequest, { getToken }, a token string or a function which returns a token");
  }

  const authConfig: AuthMethodsConfiguration = {
    bearerAuth: {
      tokenProvider,
    },
  };

  const globalConfig = createConfiguration({
    authMethods: authConfig,
    baseServer: serverConfig,
    promiseMiddleware: middleware,
    httpApi: tokenManager
      ? new TokenRefreshHttpLibrary(new IsomorphicFetchHttpLibrary(), tokenManager)
      : undefined,
  });

  return globalConfig;
};

/**
 * creates a basic configuration using params which does not require authentication
 * @param thoughtSpotHost : the base url of the server
 * @param options - Optional configuration for additional headers and other settings
 * @returns Basic client configuration for unauthenticated API calls
 */
export const createBasicConfig = (
  thoughtSpotHost: string,
  options?: ConfigurationOptions
) => {
  const thoughtSpotServer = new ServerConfiguration(thoughtSpotHost, {});
  
  const additionalHeaders = options?.additionalHeaders;
  let middleware = [];
  if (additionalHeaders && Object.keys(additionalHeaders).length > 0) {
    middleware.push(createAdditionalHeadersMiddleware(additionalHeaders));
  }

  const basicClientConfig = createConfiguration({
    baseServer: thoughtSpotServer,
    promiseMiddleware: middleware,
  });
  return basicClientConfig;
}