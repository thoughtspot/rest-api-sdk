
Welcome to the Thoughtspot REST API v2.0 Setup and usage guide! This document provides a comprehensive overview of ThoughtSpot REST APIs and describes how to access and manage ThoughtSpot resources and objects programmatically. By using the guidelines listed on this page, you can successfully set up and configure authentication for your REST APIs, and make subsequent API calls.

## Base URL and suffix
**Base URL**: For REST APIs, the base URL is the foundational URL that serves as the starting point for all API requests.
It usually represents the root endpoint for accessing the API's resources. The base URL includes the protocol (HTTP or HTTPS), the domain name (or IP address), and
often a version number.

**Suffix (or endpoint)**: The suffix (or endpoint) is appended to the base URL to specify a particular resource or action within the API.
It usually represents specific data or functions provided by the API.

**ThoughtSpot base URL**

`https://<domain-name-or-ip-address>/api/rest/2.0/`

**Example of complete API request URL for "Getting Current User Info"**

`GET https://<domain-name-or-ip-address>/api/rest/2.0/auth/session/user`

## Types of authentication
Authentication is crucial to protect the API endpoints and allow only authorized users to access or modify the resources.
To ensure secure communication between the client and server, the API supports various authentication options. Select the authentication method that best suits your application's setup and ensure secure access to your resources:

> **Note:** All API requests generated from Playground are authenticated using the Bearer token included with the `Authorization` header passed along with the request.
This token is generated and set each time you open the REST API Playground and navigate to an API endpoint. The token is generated for the logged-in user and is valid for 24 hours.
However, for programming needs, developers can use one of the following authentication methods to authenticate users and invoke APIs.

### Cookie-based authentication
In this method, when a REST client sends an API request to the `api/rest/2.0/auth/session/login` endpoint with the `username` and `password`, upon successful login, a cookie `JSESSIONID` is assigned to the client session.  This `JSESSIONID` cookie is then used to authenticate the client in subsequent API calls.

The cookie-based authentication method is useful when REST clients use the browser for API calls. For more information, see [Cookie-based authentication](https://developers.thoughtspot.com/docs/api-authv2#loginTS).

> **Note:** Applications embedding ThoughtSpot can also use this method in conjunction with the Visual Embed SDK and reuse the cookie that is already set.

### Token-based authentication
In this method, the REST clients obtain a Bearer token or Trusted authentication token from ThoughtSpot and use it in their subsequent API calls to authorize their requests. The authentication token needs to be passed in the `Authorization` header as:
`Authorization: Bearer {AUTH_TOKEN}`.

> **Note:** By default, the token obtained from ThoughtSpot is valid for 5 minutes (300 seconds). If a REST client tries to make an API call with an expired token, the server returns an error. In such cases, get a new token and use it in your subsequent API calls. If you want to use the token for more than 5 minutes, set the token expiry duration to a higher value.

Based on your client setup, use one of the following methods to get an authentication token:

#### Using username and secret key (Recommended)
In this method, you must pass the `secret_key` and the `username` to authenticate to ThoughtSpot and obtain a token. To request a token on behalf of another user, you need administrator privileges and a `secret_key` that allows you to securely pass the authentication details of an embedded application user.

The `secret_key` is generated and available if [Trusted Authentication is enabled on your ThoughtSpot Instance](https://developers.thoughtspot.com/docs/trusted-auth#trusted-auth-enable).

- Get a token for full access: `POST /api/rest/2.0/auth/token/full`                  
- Get a token for object access: `POST /api/rest/2.0/auth/token/object`            

For more information about the API parameters, request format, and response, see [REST API v2 Authentication](https://developers.thoughtspot.com/docs/api-authv2#trusted-auth-v2).

#### Using username and password
In this method, you must have the `username` and `password` of the user to authenticate to ThoughtSpot and obtain a token. The following API endpoints can be used to obtain the token:

- Get a token for full access: `POST /api/rest/2.0/auth/token/full`                
- Get a token for object access: `POST /api/rest/2.0/auth/token/object`                        

For more information about the API parameters, request format, and response, see [REST API v2 Authentication](https://developers.thoughtspot.com/docs/api-authv2#_basic_authentication).

##### Request and response examples
The following example sends `username` and `secret_key` in the `POST` request body to the `/api/rest/2.0/auth/token/full` API endpoint to obtain an authentication token:

```
curl -X POST \
  --url 'https://{ThoughtSpot-Host}/api/rest/2.0/auth/token/full'  \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json' \
  --data-raw '{
  "username": "tsUserA",
  "validity_time_in_sec": 300,
  "auto_create": false,
  "secret_key": "2657f6f9-6aa9-4432-99f2-bf0d70f240ac"
}'
```
If the request is successful, the API returns the authentication token assigned to the user specified in the request.

```
{
   "token":"{AUTH_TOKEN}",
   "creation_time_in_millis": 1729835030710,
   "expiration_time_in_millis": 1729835330494,
   "scope":{
      "access_type":"FULL",
      "org_id":0,
      "metadata_id":null
   },
   "valid_for_user_id":"fd873d1e-11cc-4246-8ee2-78e78d2b5840",
   "valid_for_username":"tsUserA"
}
```

Include the authentication token obtained from ThoughtSpot in the `Authorization` header of your subsequent API requests as shown in this example:

```
curl -X POST \
  --url 'https://{ThoughtSpot-host}/api/rest/2.0/metadata/search' \
  -H 'Authorization: Bearer {AUTH_TOKEN}' \
  -H 'Accept: application/json' \
  -H 'Content-Type: application/json' \
  --data-raw '{
  "metadata": [
    {
      "type": "LIVEBOARD"
    }
  ]
}'
```

# Additional resources
Refer to the following resources for additional information on REST APIs and SDK:
* [REST API v2.0 Reference](https://developers.thoughtspot.com/docs/rest-apiv2-reference)
* [REST API v2.0 SDKs](https://developers.thoughtspot.com/docs/rest-api-sdk)
* [Get started with REST API v2.0](https://developers.thoughtspot.com/docs/rest-apiv2-getstarted)
* [REST API v2.0 authentication](https://developers.thoughtspot.com/docs/api-authv2)

To get help and assistance, contact ThoughtSpot support or connect with the ThoughtSpot Developer Community on [Discord](https://discord.com/invite/JHPGwCkvjQ).

Happy coding!
