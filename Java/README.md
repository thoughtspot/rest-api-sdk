# Getting Started with RESTAPI SDK

## Install the Rest API SDK

The latest version of SDK is available in MVN package manager - https://search.maven.org/artifact/io.github.thoughtspot/rest-api-sdk-lib.

Depending on the build tool used in your system, add this package as dependency in the project and build it. When using Apache Maven build tool, add below to the pom.xml of the project.

```
<dependency>
    <groupId>io.github.thoughtspot</groupId>
    <artifactId>rest-api-sdk-lib</artifactId>
    <version>1.6.6</version>
</dependency>
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://github.com/thoughtspot/rest-api-sdk/blob/main/Java/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `contentType` | `String` | body content type for post request<br>*Default*: `"application/json"` |
| `acceptLanguage` | `String` | response format<br>*Default*: `"application/json"` |
| `baseUrl` | `String` | *Default*: `"https://localhost:443"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance.<br>* See available [builder methods here](https://github.com/thoughtspot/rest-api-sdk/blob/main/Java/doc/http-client-configuration-builder.md). |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
RESTAPISDKClient client = new RESTAPISDKClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .contentType("application/json")
    .acceptLanguage("application/json")
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

