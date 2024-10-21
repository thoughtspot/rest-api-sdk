# REST API Setup and Usage
Welcome to the Thoughtspot REST API v2.0 Setup and Usage guide! This document provides a comprehensive overview to help developers use
the Thoughtspot REST APIs for their application specific requirements. The REST API lets you interact with the Thoughtspot server and manage resources effectively.
This document is designed to help developers connect with the APIs ensuring secure access to resources.

## REST API Base URL and Suffix
**Base URL**: For REST APIs, the base URL is the foundational URL that serves as the starting point for all API requests.
It usually represents the root endpoint for accessing the API's resources. The base URL includes the protocol (HTTP or HTTPS), the domain name (or IP address), and
often a version number as well.

**Suffix (or endpoint)**: The suffix (or endpoint) is appended to the base URL to specify a particular resource or action within the API.
It usually represents specific data or functions provided by the API.

**ThoughtSpot base URL**
```
https://<domain-name-or-ip-address>/api/rest/2.0/
```

**Example of complete API request URL for "Getting Current User Info"**
```
GET https://<domain-name-or-ip-address>/api/rest/2.0/auth/session/user
```

## Types of Authentication
Authentication is crucial for protecting the API endpoints and ensuring only authorized users can access or modify the resources.
To ensure secure communication between the client and server, the API supports various authentication options. Below are the supported
authentication types for ThoughtSpot REST API:

> **Note:** All API requests generated from Playground are authenticated using the Bearer token included with the `Authorization` header passed along with the request.
This token is generated and set each time you open the REST API Playground and navigate to an API endpoint. The token is generated for the logged-in user and is valid for 24 hours.
However for programming needs, developers can choose one of the below mentioned authentication methods to authenticate users and invoke API Requests.

### Cookie-based authentication
In this method, the REST client sends an API request to the `api/rest/2.0/auth/session/login` endpoint with the `username` and `password`. The client session is assigned a cookie `JSESSIONID` upon successful login. This `JSESSIONID` cookie is then used to authenticate the client in subsequent API calls.

For more details: [Cookie-based authentication](https://developers.thoughtspot.com/docs/api-authv2#loginTS)

### Token-based authentication
In this method, the REST clients obtain a bearer authentication token or trusted authentication token from ThoughtSpot and use this token in their subsequent API calls to authorize their requests.

Once obtained, the authentication token needs to be passed in the `Authorization` header as:
`Authorization: Bearer {AUTH_TOKEN}`

> **Note:** By default, the token obtained from ThoughtSpot is valid for 5 minutes (300 seconds). If a REST client tries to make an API call with an expired token, the server returns an error. In such cases, obtain a new token and use it in your subsequent API calls. If you want to use the token for more than 5 minutes, set the token expiry duration to a higher value.

Based on your client setup, you can use one of the following methods to obtain an authentication token. For more details: [Token-based authentication](https://developers.thoughtspot.com/docs/api-authv2#bearerToken)

#### Using username and password
In this method, you must have the `username` and `password` of the user to authenticate to ThoughtSpot and obtain a token. The following API endpoints can be used to obtain the token:

- **Get token for full access**: `POST /api/rest/2.0/auth/token/full`
  - **For details refer**: [Full access token with username and password](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_for_full_access)

- **Get token for object access**: `POST /api/rest/2.0/auth/token/object`
  - **For details refer**: [Object access token with username and password](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_to_access_a_specific_object)

#### Using username and secret-key
In this method, you must have a `secret key` and `username` of the user to authenticate to ThoughtSpot and obtain a token. To request a token on behalf of another user, you need administrator privileges and a secret key that allows you to securely pass the authentication details of an embedded application user.

To obtain the `secret key` enable Trusted Authentication of ThoughtSpot Instance: [How to enable Trusted Authentication?](https://developers.thoughtspot.com/docs/trusted-auth#trusted-auth-enable)

- **Get token for full access**: `POST /api/rest/2.0/auth/token/full`
  - **For details refer**: [Full access token with username and secret-key](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_for_full_access_2)

- **Get token for object access**: `POST /api/rest/2.0/auth/token/object`
  - **For details refer**: [Object access token with username and secret-key](https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_to_access_a_specific_object_2)

By adhering to the guidelines outlined above, you can successfully set up and configure authentication for your REST APIs. Select the authentication method that best aligns with your application's requirements to ensure secure access to your resources. For more information, refer the documentation mentioned in [Additional resources](#/develop/api/rest/playgroundV2_0?apiResourceId=http%2Fgetting-started%2Fsetup-and-usage%2Fadditional-resources) section.

# Additional resources
* [Complete Guide to ThoughtSpot REST APIs](https://developers.thoughtspot.com/docs/rest-apis)
* [Get started with REST API v2.0](https://developers.thoughtspot.com/docs/rest-apiv2-getstarted)
* [REST API v2.0 authentication](https://developers.thoughtspot.com/docs/api-authv2)
* [REST API v2.0 Reference](https://developers.thoughtspot.com/docs/rest-apiv2-reference)
* [REST API v2.0 SDKs](https://developers.thoughtspot.com/docs/rest-api-sdk)

If you have any questions or need further assistance, feel free to reach out to our support team or connect with ThoughtSpot Developer Community on [Discord](https://discord.com/invite/JHPGwCkvjQ).

Happy coding!
