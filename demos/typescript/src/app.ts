import {
  AuthenticationApi,
  GetFullAccessTokenRequest,
  ServerConfiguration,
  createConfiguration,
  BaseServerConfiguration,
  AuthMethodsConfiguration,
  TsRestApi,
} from "thoughtspot-rest-api-sdk";

const BASE_URL = "http://127.0.0.1:4123";

const createBearerAuthenticationConfig = (
  url,
  params: GetFullAccessTokenRequest
) => {
  const serverConfig: BaseServerConfiguration = new ServerConfiguration<{}>(
    url,
    {}
  );

  const config = createConfiguration({
    baseServer: serverConfig,
  });
  const authApiClient = new AuthenticationApi(config);

  const authConfig: AuthMethodsConfiguration = {
    bearerAuth: {
      tokenProvider: {
        getToken: async () => {
          console.log("Calling Auth api to get token...");
          const token = (await authApiClient.getFullAccessToken(params)).token;

          console.log("Received token : ", token);

          return token;
        },
      },
    },
  };

  const globalConfig = createConfiguration({
    authMethods: authConfig,
    baseServer: serverConfig,
  });

  return globalConfig;
};

const main = async () => {
  // getting the token

  const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
  });

  const tsRestApiClient = new TsRestApi(config);

  try {
    const users = await tsRestApiClient.searchUsers();
    console.log("Users on the cluster : ");
    users.forEach((user) => {
      console.log(user.name, user.email);
    });
    console.log("UserGroups on the cluster : ");
    const groups = await tsRestApiClient.searchUserGroups();
    groups.forEach((group) => {
      console.log(group.name, group.displayName);
    });
  } catch (e) {
    console.log(e);
  }
};

main();
