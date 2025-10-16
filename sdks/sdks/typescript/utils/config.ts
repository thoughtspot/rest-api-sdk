import { AuthMethodsConfiguration, TokenProvider } from "../auth/auth";
import { createConfiguration } from "../configuration";
import { GetFullAccessTokenRequest } from "../models/GetFullAccessTokenRequest";
import { BaseServerConfiguration, ServerConfiguration } from "../servers";
import { PromiseAuthenticationApi } from "../types/PromiseAPI";

/**
 * creates a bearer authentication configuration using params or a token provider
 * @param thoughtSpotHost : the base url of the server
 * @param paramOrTokenProvider either a GetFullAccessTokenRequest or a TokenProvider , 
 * Pass a GetFullAccessTokenRequest which contains the object body required to get a full access token , or
 * function which returns a promise of a string which is the full access token
 */
export const createBearerAuthenticationConfig = (
  thoughtSpotHost: string,
  paramOrTokenProvider: GetFullAccessTokenRequest | (() => Promise<string>)
) => {
  const serverConfig: BaseServerConfiguration = new ServerConfiguration<{}>(
    thoughtSpotHost,
    {}
  );

  const config = createConfiguration({
    baseServer: serverConfig,
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
 */
export const createBasicConfig = (
  thoughtSpotHost: string,
) => {
  const thoughtSpotServer = new ServerConfiguration(thoughtSpotHost, {});
  const basicClientConfig = createConfiguration({
    baseServer: thoughtSpotServer,
  });
  return basicClientConfig;
}