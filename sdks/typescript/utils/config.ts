import { AuthMethodsConfiguration, TokenProvider } from "../auth/auth";
import { createConfiguration } from "../configuration";
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
  * @param paramOrTokenProvider either a GetFullAccessTokenRequest or a TokenProvider , 
  * Pass a GetFullAccessTokenRequest which contains the object body required to get a full access token , or
  * function which returns a promise of a string which is the full access token
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
  paramOrTokenProvider: GetFullAccessTokenRequest | (() => Promise<string>),
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

  let configTokenProvider;

  if (paramOrTokenProvider.hasOwnProperty("username")) {
    // user passed a GetFullAccessTokenRequest
    configTokenProvider = {
      getToken: async () => {
        const token = (await authApiClient.getFullAccessToken(paramOrTokenProvider as GetFullAccessTokenRequest)).token;
        return token;
      },
    }
  } else if (typeof paramOrTokenProvider === "function") {
    // user passed a function which returns a token
    configTokenProvider = {
      getToken: paramOrTokenProvider,
    }
  }
  else {
    throw new Error("Pass a proper GetFullAccessTokenRequest or a function which returns a token");
  }

  const authConfig: AuthMethodsConfiguration = {
    bearerAuth: {
      tokenProvider: configTokenProvider as TokenProvider,
    },
  };

  const globalConfig = createConfiguration({
    authMethods: authConfig,
    baseServer: serverConfig,
    promiseMiddleware: middleware, 
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