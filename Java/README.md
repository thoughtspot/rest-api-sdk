
# Getting Started with ThoughtSpot Public REST API

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.github.thoughtspot</groupId>
  <artifactId>rest-api-sdk-lib</artifactId>
  <version>1.13.1</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.github.thoughtspot/rest-api-sdk-lib/1.13.1

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project ThoughtSpotPublicRESTAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `baseUrl` | `String` | *Default*: `"https://localhost:443"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
ThoughtSpotPublicRESTAPIClient client = new ThoughtSpotPublicRESTAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .baseUrl("https://localhost:443")
    .build();
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [User](doc/controllers/user.md)
* [Group](doc/controllers/group.md)
* [Metadata](doc/controllers/metadata.md)
* [Database](doc/controllers/database.md)
* [Connection](doc/controllers/connection.md)
* [Data](doc/controllers/data.md)
* [Logs](doc/controllers/logs.md)
* [Custom Actions](doc/controllers/custom-actions.md)
* [Security](doc/controllers/security.md)
* [Org](doc/controllers/org.md)
* [Session](doc/controllers/session.md)
* [Admin](doc/controllers/admin.md)
* [Report](doc/controllers/report.md)
* [Materialization](doc/controllers/materialization.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

