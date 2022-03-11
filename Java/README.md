
# Getting Started with RESTAPI SDK

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.github.thoughtspot</groupId>
  <artifactId>rest-api-sdk-lib</artifactId>
  <version>1.9.0</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.github.thoughtspot/rest-api-sdk-lib/1.9.0


## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `xRequestedBy` | `String` | Mandatory header with value Thougtspot to accept the external RestAPI requests<br>*Default*: `"ThoughtSpot"` |
| `acceptLanguage` | `String` | response format<br>*Default*: `"application/json"` |
| `contentType` | `String` | body content type for post request<br>*Default*: `"application/json"` |
| `baseUrl` | `String` | *Default*: `"https://localhost:443"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
RESTAPISDKClient client = new RESTAPISDKClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .xRequestedBy("ThoughtSpot")
    .acceptLanguage("application/json")
    .contentType("application/json")
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .baseUrl("https://localhost:443")
    .build();
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## Guide
[API Reference](https://github.com/thoughtspot/rest-api-sdk/blob/main/Java/doc/README.md)

## Live Playground
We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.

