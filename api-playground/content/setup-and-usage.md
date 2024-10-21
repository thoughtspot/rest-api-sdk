
Welcome to the Thoughtspot REST API v2.0 Setup and usage guide! This document provides a comprehensive overview of ThoughtSpot REST APIs and describes how to access and manage ThoughtSpot resources and objects programmatically.

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
To ensure secure communication between the client and server, the API supports various authentication options. Below are the supported
authentication types for ThoughtSpot REST API:

> **Note:** All API requests generated from Playground are authenticated using the Bearer token included with the `Authorization` header passed along with the request.
This token is generated and set each time you open the REST API Playground and navigate to an API endpoint. The token is generated for the logged-in user and is valid for 24 hours.
However, for programming needs, developers can use one of the following authentication methods to authenticate users and invoke APIs.

### Cookie-based authentication
In this method, the REST client sends an API request to the `api/rest/2.0/auth/session/login` endpoint with the `username` and `password`. The client session is assigned a cookie `JSESSIONID` upon successful login. This `JSESSIONID` cookie is then used to authenticate the client in subsequent API calls.

For more details: [Cookie-based authentication](https://developers.thoughtspot.com/docs/api-authv2#loginTS).

### Token-based authentication
In this method, the REST clients obtain a Bearer token or Trusted authentication token from ThoughtSpot and use it in their subsequent API calls to authorize their requests.

Once obtained, the authentication token needs to be passed in the `Authorization` header as:
`Authorization: Bearer {AUTH_TOKEN}`

> **Note:** By default, the token obtained from ThoughtSpot is valid for 5 minutes (300 seconds). If a REST client tries to make an API call with an expired token, the server returns an error. In such cases, get a new token and use it in your subsequent API calls. If you want to use the token for more than 5 minutes, set the token expiry duration to a higher value.

Based on your client setup, you can use one of the following methods to obtain an authentication token. For more details, see [Token-based authentication](https://developers.thoughtspot.com/docs/api-authv2#bearerToken).

#### Using username and password
In this method, you must have the `username` and `password` of the user to authenticate to ThoughtSpot and obtain a token. The following API endpoints can be used to obtain the token:

- [Get a token for full access](#restV2-playground?apiResourceId=http/api-endpoints/authentication/get-full-access-token): `POST /api/rest/2.0/auth/token/full`                
For additional details, see [ThoughtSpot Developer Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_for_full_access).

- [Get a token for object access](#/http/api-endpoints/authentication/get-object-access-token): `POST /api/rest/2.0/auth/token/object`                        
For additional details, see [ThoughtSpot Developer Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_to_access_a_specific_object).

#### Using username and secret key
In this method, you must pass the `secret_key` and the `username` to authenticate to ThoughtSpot and obtain a token. To request a token on behalf of another user, you need administrator privileges and a `secret_key` that allows you to securely pass the authentication details of an embedded application user.

The `secret_key` is generated and available if [Trusted Authentication is enabled on your ThoughtSpot Instance](https://developers.thoughtspot.com/docs/trusted-auth#trusted-auth-enable).

- [Get a token for full access](#/http/api-endpoints/authentication/get-full-access-token): `POST /api/rest/2.0/auth/token/full`                  
For additional details, see [ThoughtSpot Developer Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_for_full_access_2).

- [Get a token for object access](#/http/api-endpoints/authentication/get-object-access-token): `POST /api/rest/2.0/auth/token/object`            
For additional details, see [ThoughtSpot Developer Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_to_access_a_specific_object_2).

By using the guidelines listed on this page, you can successfully set up and configure authentication for your REST APIs. Select the authentication method that best aligns with your application's setup and ensure secure access to your resources. For more information, refer to the documentation listed in the **Additional resources**  section.

# Additional resources
* [Get started with REST API v2.0](https://developers.thoughtspot.com/docs/rest-apiv2-getstarted)
* [REST API v2.0 authentication](https://developers.thoughtspot.com/docs/api-authv2)
* [REST API v2.0 Reference](https://developers.thoughtspot.com/docs/rest-apiv2-reference)
* [REST API v2.0 SDKs](https://developers.thoughtspot.com/docs/rest-api-sdk)

If you need further assistance, contact ThoughtSpot support or connect with the ThoughtSpot Developer Community on [Discord](https://discord.com/invite/JHPGwCkvjQ).

Happy coding!
