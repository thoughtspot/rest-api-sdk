# rest-api-sdk-temp

Java client for ThoughtSpot's [v2 Rest APIs](https://developers.thoughtspot.com/docs/rest-api-v2).

## Consuming

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.github.pallavts</groupId>
  <artifactId>rest-api-sdk-temp</artifactId>
  <version>0.0.1</version>
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
     implementation "io.github.pallavts:rest-api-sdk-temp:0.0.1"
  }
```

## Usage

Below code snippet shows how to create a simple config and use it to call get the user's information:

```java
package org.example;

// Import classes:
import org.thoughtspot.client.ApiClientConfiguration;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.api.ThoughtSpotRestApi;
import org.thoughtspot.client.model.GetFullAccessTokenRequest;
import org.thoughtspot.client.model.Token;
import org.thoughtspot.client.model.User;

public class Example {
  private static final String BASE_PATH = *CLUSTER_URL*;

  public static void main(String[] args) {
    try {
        // Create configuration for the ThoughtSpot API client
        ApiClientConfiguration apiClientConfiguration = new ApiClientConfiguration.Builder()
                .basePath(BASE_PATH)
                .verifyingSsl(false) // Disable SSL verification for testing purposes
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
        User currentUser = tsRestApi.getCurrentUserInfo();  // Optionally, use .{REQUEST}WithHttpInfo() (eg: .getCurrentUserInfoWithHttpInfo()) if you want the response details
        System.out.println("Current User: " + currentUser.toJson());
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