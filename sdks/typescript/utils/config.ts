import { AuthMethodsConfiguration, TokenProvider } from "../auth/auth";
import { createConfiguration } from "../configuration";
import { GetFullAccessTokenRequest } from "../models/GetFullAccessTokenRequest";
import { BaseServerConfiguration, ServerConfiguration } from "../servers";
import { PromiseAuthenticationApi } from "../types/PromiseAPI";

/**
 * Creates promise middleware for adding custom headers to requests
 * @param additionalHeaders - Optional headers to add to every request
 * @returns Single middleware object or undefined if no headers provided
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
      post: (responseContext: any) => {
        return Promise.resolve(responseContext);
      }
    };
};

/**
 * creates a bearer authentication configuration using params or a token provider
 * @param thoughtSpotHost : the base url of the server
 * @param paramOrTokenProvider either a GetFullAccessTokenRequest or a TokenProvider , 
 * Pass a GetFullAccessTokenRequest which contains the object body required to get a full access token , or
 * function which returns a promise of a string which is the full access token
 * @param options - Optional configuration for custom headers and other settings
 * @returns Configured client ready for authenticated API calls 
 */
export const createBearerAuthenticationConfig = (
  thoughtSpotHost: string,
  paramOrTokenProvider: GetFullAccessTokenRequest | (() => Promise<string>),
  options?: { additionalHeaders : Record<string, string>}
) => {
  const serverConfig: BaseServerConfiguration = new ServerConfiguration<{}>(
    thoughtSpotHost,
    {}
  );  

  const optionsAdditionalHeaders = options?.additionalHeaders;
  let middleware = [];
  if (optionsAdditionalHeaders && Object.keys(optionsAdditionalHeaders).length > 0) {
    middleware.push(createAdditionalHeadersMiddleware(optionsAdditionalHeaders));
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
  options?: { additionalHeaders : Record<string, string>}
) => {
  const thoughtSpotServer = new ServerConfiguration(thoughtSpotHost, {});
  
  const optionsAdditionalHeaders = options?.additionalHeaders;
  let middleware = [];
  if (optionsAdditionalHeaders && Object.keys(optionsAdditionalHeaders).length > 0) {
    middleware.push(createAdditionalHeadersMiddleware(optionsAdditionalHeaders));
  }

  const basicClientConfig = createConfiguration({
    baseServer: thoughtSpotServer,
    promiseMiddleware: middleware,
  });
  return basicClientConfig;
}