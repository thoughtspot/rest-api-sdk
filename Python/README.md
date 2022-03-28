
# Getting Started with RESTAPI SDK

## Install the Package

The package is compatible with Python versions `3 >=3.7, <= 3.9`.
Install the package from PyPi using the following pip command:

```python
pip install thoughtspot-rest-api-sdk==1.10.0
```

You can also view the package at:
https://pypi.python.org/pypi/thoughtspot-rest-api-sdk

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `accept_language` | `string` | response format<br>*Default*: `'application/json'` |
| `content_type` | `string` | body content type for post request<br>*Default*: `'application/json'` |
| `base_url` | `string` | *Default*: `'https://localhost:443'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `http_client_instance` | `HttpClient` | The Http Client passed from the sdk user for making requests |
| `override_http_client_configuration` | `bool` | The value which determines to override properties of the passed Http Client from the sdk user |
| `http_call_back` | `HttpCallBack` | The callback value that is invoked before and after an HTTP call is made to an endpoint |
| `timeout` | `float` | The value to use for connection timeout. <br> **Default: 60** |
| `max_retries` | `int` | The number of times to retry an endpoint call if it fails. <br> **Default: 0** |
| `backoff_factor` | `float` | A backoff factor to apply between attempts after the second try. <br> **Default: 2** |
| `retry_statuses` | `Array of int` | The http statuses on which retry is to be done. <br> **Default: [408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524]** |
| `retry_methods` | `Array of string` | The http methods on which retry is to be done. <br> **Default: ['GET', 'PUT', 'GET', 'PUT']** |
| `skip_ssl_cert_verification` | `boolean` | Set to true to allow skipping ssl certificate verification |
| `access_token` | `string` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```python
from restapisdk.restapisdk_client import RestapisdkClient
from restapisdk.configuration import Environment

client = RestapisdkClient(
    accept_language='application/json',
    content_type='application/json',
    access_token='AccessToken',
    environment=Environment.PRODUCTION,
    base_url = 'https://localhost:443',)
```

## Authorization

This API uses `OAuth 2 Bearer token`.

## Guide
[API Reference](https://github.com/thoughtspot/rest-api-sdk/blob/1.10.0/Typescript/doc/README.md)
## Live Playground
We recommend that you browse through the [code playground](https://try-everywhere.thoughtspot.cloud/v2/#/everywhere/api/rest/playgroundV2) before you start constructing your API requests. The playground offers an interactive portal with comprehensive information about the API endpoints, request and response workflows.
