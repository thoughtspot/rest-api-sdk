# REST API Setup and Configuration
Welcome to the Thoughtspot REST API v2.0 Setup and Configuration guide! This document provides a comprehensive overview to help developers in using
the Thoughtspot REST API for your application needs. The REST API allows you to interact with your Thoughtspot server and manage resources effectively.
This document is designed to help developers connect with the API and manage resources securely.

## REST API Base URL and Suffix
**Base URL**: In the context of a REST API, the base URL is the foundational URL that serves as the starting point for all API requests.
It typically represents the root endpoint for accessing the API's resources. The base URL includes the protocol (HTTP or HTTPS), the domain name (or IP address), and
often a version number.

**Suffix (or Endpoint)** : The suffix (or endpoint) is appended to the base URL to specify a particular resource or action within the API.
It usually represents specific data or functions provided by the API.

**ThoughtSpot Base URL**
```
https://<domain-name-or-ip-address>/api/rest/2.0/
```

**Example: Complete API Request URL for "Getting Current User Info"**
```
GET https://<domain-name-or-ip-address>/api/rest/2.0/auth/session/user
```

## Authentication Types
Authentication is crucial for protecting the API endpoints and ensuring that only authorized users can access or modify resources.
To ensure secure communication between the client and server, the API supports various authentication methods. Below are the supported
authentication types for ThoughtSpot REST API:

**NOTE**: All API requests generated from Playground are authenticated using the Bearer token included with the `Authorization` header passed along with the request.
This token is generated and set each time you open the REST API Playground and navigate to an API endpoint. The token is generated for the logged-in user and is valid for 24 hours.
However for programming needs, Developers can choose one of the below Auth mechansim to Authenticate and invoke API Request.

### Cookie-based authentication
In this method, the REST client sends an API request to the `api/rest/2.0/auth/session/login` endpoint with the username and password. Upon successful login, session Cookie named `JSESSIONID` is returned in the response header. This `JSESSIONID` cookie then needs to be used to authenticate the client in subsequent API calls.

For more details: https://developers.thoughtspot.com/docs/api-authv2#loginTS


### Token-based authentication
In this method, the REST clients obtain a "Auth Token" also known as "Bearer Token" or "Trusted Auth Token" from ThoughtSpot and use this token in their subsequent API calls to authorize their requests.

Once obtained, the "Auth Token" needs to be passed in `Authorization` header as:
`Authorization: Bearer {AUTH_TOKEN}`

**NOTE**: `By default, the token obtained from ThoughtSpot is valid for 5 minutes (300 seconds). If a REST client tries to make an API call with an expired token, the server returns an error. In such cases, obtain a new token and use it in your subsequent API calls. If you want to use the token for more than 5 minutes, set the token expiry duration to a higher value.`


For more details: https://developers.thoughtspot.com/docs/api-authv2#bearerToken

Below are two supported method(s) to obtain the "Auth Token"!

#### Using Username and Password
In this method you must have `Username` and `Password` of a User for whom you want to obtain a token. Token can be obtained using below API end-points based on the use cases.

* **Get a token for full access**: `POST /api/rest/2.0/auth/token/full`
https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_for_full_access

* **To get object accesss token**: `POST /api/rest/2.0/auth/token/object`
https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_to_access_a_specific_object


#### Using Username and Secret-key
In this method you must have `Secret Key` and `Username` of a user for whom you want to obtain a token. To request a token on behalf of another user, you need administrator privileges and a secret key that allows you to securely pass the authentication details of an embedded application user.

To obtain `Secret Key` enable Trusted Authentication of ThoughtSpot Instance: https://developers.thoughtspot.com/docs/trusted-auth#trusted-auth-enable

* **Get a token for full access**: `POST /api/rest/2.0/auth/token/full`
https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_for_full_access_2

* **To get object accesss token**: `POST /api/rest/2.0/auth/token/object`
https://developers.thoughtspot.com/docs/api-authv2#_get_a_token_to_access_a_specific_object_2

# Conclusion
By following the above guidelines, you can effectively set up and configure authentication for your REST API. Choose the authentication method that best suits
your application's needs and ensure secure access to your resources. For more detailed information, refer to the specific documentation for each authentication type.

Happy coding!

# Further References
* Complete Guide to ThoughtSpot REST APIs : https://developers.thoughtspot.com/docs/rest-apis
* Get started with REST API v2.0: https://developers.thoughtspot.com/docs/rest-apiv2-getstarted
* REST API v2.0 authentication : https://developers.thoughtspot.com/docs/api-authv2
* REST API v2.0 Reference : https://developers.thoughtspot.com/docs/rest-apiv2-reference
* REST API v2.0 SDKs : https://developers.thoughtspot.com/docs/rest-api-sdk
