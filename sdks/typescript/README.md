## @thoughtspot/rest-api-sdk@2.32.0

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

### Token caching

Pass `{ getToken }`, where `getToken` returns a token string or `{ token, expiresAt }` (`expiresAt` in
epoch ms, e.g. `expiration_time_in_millis` from `/auth/token/*`). The SDK caches the token per client, calls
`getToken` again shortly before `expiresAt`, and on a 401 refreshes the token and retries the request once.
Concurrent requests share a single token fetch.

```
import {
  ThoughtSpotRestApi,
  createBearerAuthenticationConfig
} from "@thoughtspot/rest-api-sdk";

const config = createBearerAuthenticationConfig(BASE_URL, {
  getToken: async () => {
    const t = await myBackend.fetchThoughtSpotToken();
    return { token: t.token, expiresAt: t.expiration_time_in_millis };
  },
});
const tsRestApiClient = new ThoughtSpotRestApi(config);
```

The second argument can be:

| Value | Behaviour |
| --- | --- |
| `GetFullAccessTokenRequest` | SDK gets the token from `/auth/token/full` and refreshes it before it expires |
| `{ getToken: () => string }` | Token cached; `getToken` called again only after a 401 |
| `{ getToken: () => { token, expiresAt?, tokenBufferMs? } }` | Also refreshed `refreshBufferMs` before `expiresAt`. `tokenBufferMs` overrides the buffer for that token |
| `() => string` | Called on every request. Not cached, no retry on 401. Use when you cache tokens yourself |
| `string` | Sent as is, never refreshed |

Options (third argument, alongside `additionalHeaders`):

- `refreshBufferMs`: how long before `expiresAt` to refresh. Default `30000`. Keep it well below the token
  lifetime, otherwise every request fetches a new token.
- `tokenLogger(message)`: called each time the token function runs, with the reason. Never receives a token.
  Also receives warnings: when a refresh fails while the cached token is still valid (the SDK keeps using it
  until it expires), and once when `getToken` returns a token that already expires within the refresh buffer.

---

**NOTE:** For self certified ssl certificates, use the following config:

```
process.env.NODE_TLS_REJECT_UNAUTHORIZED = "0"
```

---

## Live Playground

We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2_0) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.
