# Session

```csharp
SessionController sessionController = client.SessionController;
```

## Class Name

`SessionController`

## Methods

* [Restapi V2 Login](../../doc/controllers/session.md#restapi-v2-login)
* [Restapi V2 Get Token](../../doc/controllers/session.md#restapi-v2-get-token)


# Restapi V2 Login

You can programmatically create login session for a user in ThoughtSpot using this endpoint.

You can create session by either providing userName and password as inputs in this request body or by including "Authorization" header with the token generated through the endpoint /tspublic/rest/v2/session/gettoken.

userName and password input is given precedence over "Authorization" header, when both are included in the request.

```csharp
RestapiV2LoginAsync(
    string userName = null,
    string password = null,
    bool? rememberMe = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Query, Optional | Username of the user account |
| `password` | `string` | Query, Optional | The password of the user account |
| `rememberMe` | `bool?` | Query, Optional | A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls. |

## Response Type

[`Task<Models.SessionLoginResponse>`](../../doc/models/session-login-response.md)

## Example Usage

```csharp
try
{
    SessionLoginResponse result = await sessionController.RestapiV2LoginAsync(null, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Restapi V2 Get Token

To programmatically create session token for a user in ThoughtSpot, use this endpoint.

You can generate the token for a user by providing password or secret key from the cluster.

You need to enable trusted authentication to generate secret key. To generate secret key, follow below steps.

1. Click the Develop tab.

2. Under Customizations, click Settings.

3. To enable trusted authentication, turn on the toggle.

4. A secret_key for trusted authentication is generated.

5. Click the clipboard icon to copy the token.

Password is given precedence over secretKey input, when both are included in the request.

```csharp
RestapiV2GetTokenAsync(
    string userName,
    string password = null,
    string secretKey = null,
    Models.AccessLevelEnum? accessLevel = null,
    string tsObjectId = null,
    string tokenExpiryDuration = null,
    string orgId = null)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userName` | `string` | Query, Required | Username of the user account |
| `password` | `string` | Query, Optional | The password of the user account |
| `secretKey` | `string` | Query, Optional | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. |
| `accessLevel` | [`Models.AccessLevelEnum?`](../../doc/models/access-level-enum.md) | Query, Optional | User access privilege.<br><br>FULL - Creates a session with full access.<br><br>REPORT_BOOK_VIEW - Allow view access to the specified visualizations. |
| `tsObjectId` | `string` | Query, Optional | GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object. |
| `tokenExpiryDuration` | `string` | Query, Optional | Duration in seconds after which the token expires |
| `orgId` | `string` | Query, Optional | Id of the organization to be associated with the user login. If no input is provided then last logged in organization will be considered |

## Response Type

[`Task<Models.SessionLoginResponse>`](../../doc/models/session-login-response.md)

## Example Usage

```csharp
string userName = "userName2";

try
{
    SessionLoginResponse result = await sessionController.RestapiV2GetTokenAsync(userName, null, null, null, null, null, null);
}
catch (ApiException e){};
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 500 | Operation failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

