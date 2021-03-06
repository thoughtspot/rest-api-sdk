
# Tspublic Rest V2 Session Gettoken Request

## Structure

`TspublicRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `UserName` | `string` | Required | Username of the user account |
| `Password` | `string` | Optional | The password of the user account |
| `SecretKey` | `string` | Optional | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. |
| `AccessLevel` | [`Models.GetTokenAccessLevelEnum?`](../../doc/models/get-token-access-level-enum.md) | Optional | User access privilege.<br><br>FULL - Creates a session with full access.<br><br>REPORT_BOOK_VIEW - Allow view access to the specified visualizations.<br>**Default**: `GetTokenAccessLevelEnum.FULL` |
| `TsObjectId` | `string` | Optional | GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object. |
| `TokenExpiryDuration` | `string` | Optional | Provide duration in seconds after which the token should expire |
| `OrgId` | `string` | Optional | This is applicable only if organization feature is enabled in the cluster.<br><br>Id of the organization to be associated with the user login. If no input is provided then last logged in organization will be considered. |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": null,
  "secretKey": null,
  "accessLevel": null,
  "tsObjectId": null,
  "tokenExpiryDuration": null,
  "orgId": null
}
```

