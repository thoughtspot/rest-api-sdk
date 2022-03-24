
# Tspublic Rest V2 Session Gettoken Request

## Structure

`TspublicRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `UserName` | `string` | Required | Username of the user account |
| `Password` | `string` | Optional | The password of the user account |
| `SecretKey` | `string` | Optional | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. |
| `AccessLevel` | [`Models.AccessLevelEnum?`](../../doc/models/access-level-enum.md) | Optional | User access privilege.<br><br>FULL - Creates a session with full access.<br><br>REPORT_BOOK_VIEW - Allow view access to the specified visualizations.<br>**Default**: `AccessLevelEnum.FULL` |
| `TokenExpiryDuration` | `string` | Optional | Provide duration in seconds after which the token should expire |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": null,
  "secretKey": null,
  "accessLevel": null,
  "tokenExpiryDuration": null
}
```
