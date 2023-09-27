## @thoughtspot/rest-api-sdk@1.0.0

This generator creates TypeScript/JavaScript client that utilizes fetch-api.

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

Navigate to the folder of your consuming project and run one of the following commands.

_published:_

```
npm install @thoughtspot/rest-api-sdk@1.0.0 --save
```

_unPublished (not recommended):_

```
npm install PATH_TO_GENERATED_PACKAGE --save
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