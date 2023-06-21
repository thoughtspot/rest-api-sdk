## thoughtspot-rest-api-sdk@2.0

This generator creates TypeScript/JavaScript client that utilizes fetch-api.

### Building

To build and compile the  typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

Navigate to the folder of your consuming project and run one of the following commands.

_published:_

```
npm install thoughtspot-rest-api-sdk@2.0 --save
```

_unPublished (not recommended):_

```
npm install PATH_TO_GENERATED_PACKAGE --save
```

### Usage

Below code snippet shows how to create a simple config and use it to 
call the getUsers and getUserGroups apis.

```
import * as ThoughtSpotRestApiSdk from "thoughtspot-rest-api-sdk";

const BASE_URL = "<CLUSTER-URL>";

// creates a simple AuthConfig which uses getFullAccessToken for Auth
const createBearerAuthenticationConfig = (
  url,
  params: ThoughtSpotRestApiSdk.GetFullAccessTokenRequest
) => {
  const serverConfig: ThoughtSpotRestApiSdk.BaseServerConfiguration =
    new ThoughtSpotRestApiSdk.ServerConfiguration<{}>(url, {});

  const config = ThoughtSpotRestApiSdk.createConfiguration({
    baseServer: serverConfig,
  });
  const authApiClient = new ThoughtSpotRestApiSdk.AuthenticationApi(config);

  const authConfig: ThoughtSpotRestApiSdk.AuthMethodsConfiguration = {
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

  const apiConfig = ThoughtSpotRestApiSdk.createConfiguration({
    authMethods: authConfig,
    baseServer: serverConfig,
  });

  return apiConfig;
};

const main = async () => {
  const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "tsadmin",
    password: "admin",
  });

  const tsRestApiClient = new ThoughtSpotRestApiSdk.ThoughtSpotRestApi(config);

  try {
    // Get all the users in the cluster
    const users = await tsRestApiClient.searchUsers();
    console.log("Users on the cluster : ");
    users.forEach((user) => {
      console.log(user.name, user.email);
    });

    // Get all the user groups on the cluster
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
```
