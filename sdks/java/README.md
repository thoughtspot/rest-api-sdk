# rest-api-sdk-lib

Java client for ThoughtSpot's [v2 Rest APIs](https://developers.thoughtspot.com/docs/rest-api-v2).

## Consuming

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.github.thoughtspot</groupId>
  <artifactId>rest-api-sdk-lib</artifactId>
  <version>2.13.0-beta</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
     implementation "io.github.thoughtspot:rest-api-sdk-lib:2.13.0-beta"
  }
```

## Usage

Below code snippet shows how to create a simple config and use it to call get the user's information:

```java
package org.example;

// Import classes:
import com.thoughtspot.client.ApiClientConfiguration;
import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.api.ThoughtSpotRestApi;
import com.thoughtspot.client.model.GetFullAccessTokenRequest;
import com.thoughtspot.client.model.Token;
import com.thoughtspot.client.model.User;

public class Example {
  private static final String BASE_PATH = *CLUSTER_URL*;

  public static void main(String[] args) {
    try {
        // Create configuration for the ThoughtSpot API client
        ApiClientConfiguration apiClientConfiguration = new ApiClientConfiguration.Builder()
                .basePath(BASE_PATH)
                .verifyingSsl(false) // Disable SSL verification for testing purposes
                .readTimeoutMillis(30000) // Extended read timeout to 30 seconds
                .build();

        // Create an instance of the ThoughtSpot API client
        ThoughtSpotRestApi tsRestApi = new ThoughtSpotRestApi(apiClientConfiguration);

        // Authenticate the user and retrieve the full access token
        GetFullAccessTokenRequest getFullAccessTokenRequest = new GetFullAccessTokenRequest()
                .username(USERNAME)
                .password(PASSWORD);
        Token response = tsRestApi.getFullAccessToken(getFullAccessTokenRequest);

        // Update the API client configuration with the access token
        apiClientConfiguration = apiClientConfiguration.toBuilder()
                .bearerTokenSupplier(response::getToken) // You can pass your own token supplier here
                .build();

        // Apply the updated configuration to the ThoughtSpot API client
        tsRestApi.applyApiClientConfiguration(apiClientConfiguration);

        // Current user information
        User currentUser = tsRestApi.getCurrentUserInfo();
        System.out.println("Current User: " + currentUser.toJson());

        // Optionally, use .{REQUEST}WithHttpInfo() to get response details
        ApiResponse<User> currentUserResponse = tsRestApi.getCurrentUserInfoWithHttpInfo();
        System.out.println("Current User: " + currentUserResponse.getData().toString());
        System.out.println("Status code: " + currentUserResponse.getStatusCode());
        System.out.println("Response headers: " + currentUserResponse.getHeaders().toString());
    } catch (ApiException e) {
        System.err.println("Exception when calling ThoughtSpot API");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
  }
}
```

## Live Playground

We recommend that you browse through the [api playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2_0) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.

## Documentation for API Endpoints

You can find the full documentation for all available API endpoints in the [ThoughtSpotRestApi](docs/ThoughtSpotRestApi.md) file.

<a id="documentation-for-authorization"></a>
## Authorization

Authentication schemes defined for the APIs:
<a id="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP Bearer Token authentication


## Author

This SDK is developed and maintained by **ThoughtSpot**.

- **Organization Name**: ThoughtSpot
- **GitHub**: [thoughtspot](https://github.com/thoughtspot)
- **Website**: [www.thoughtspot.com](https://www.thoughtspot.com/)
- **Email**: [support@thoughtspot.com](mailto:support@thoughtspot.com)

## Contributors

- [Pallav Pandey](https://github.com/pallavpp)

## License

For full details, please refer to the [license documentation](https://github.com/thoughtspot/rest-api-sdk/blob/release/LICENSE.md).