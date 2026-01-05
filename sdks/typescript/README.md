## @thoughtspot/rest-api-sdk@2.23.0

TypeScript/JavaScript client for ThoughtSpot's v2 [Rest APIs](https://developers.thoughtspot.com/docs/rest-api-v2).

### Consuming

Navigate to the folder of your consuming project and run the following command.

```
npm install @thoughtspot/rest-api-sdk --save
```

### Usage

Below code snippet shows how to create a simple config and use it to 
call the getUsers and getUserGroups apis.

```
import {
  ThoughtSpotRestApi,
  createBearerAuthenticationConfig
} from "@thoughtspot/rest-api-sdk";

const BASE_URL = "CLUSTER_URL";

const main = async () => {
  // getting the token
  const config = createBearerAuthenticationConfig(BASE_URL, {
    username: "YOUR_USERNAME",
    password: "YOUR_PASSWORD",
  });

  // create a thoughtspot client
  const tsRestApiClient = new ThoughtSpotRestApi(config);

  try {
    const users = await tsRestApiClient.searchUsers();
    console.log("Users on the cluster : ");
    users.forEach((user) => {
      console.log(user.name, user.email);
    });
  } catch (e) {
    console.log(e);
  }
};

main();
```

---

**NOTE:** For self certified ssl certificates, use the following config:

```
process.env.NODE_TLS_REJECT_UNAUTHORIZED = "0"
```

---

## Live Playground

We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2_0) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.
