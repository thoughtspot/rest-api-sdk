
# Tspublic Rest V2 Session Gettoken Request

## Structure

`TspublicRestV2SessionGettokenRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `user_name` | `string` | Required | Username of the user account |
| `password` | `string` | Optional | The password of the user account |
| `secret_key` | `string` | Optional | The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. |
| `access_level` | [`AccessLevelEnum`](../../doc/models/access-level-enum.md) | Optional | User access privilege.<br><br>FULL - Creates a session with full access.<br><br>REPORT_BOOK_VIEW - Allow view access to the specified visualizations.<br>**Default**: `'FULL'` |
| `ts_object_id` | `string` | Optional | GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object. |
| `token_expiry_duration` | `string` | Optional | Provide duration in seconds after which the token should expire |

## Example (as JSON)

```json
{
  "userName": "userName2",
  "password": null,
  "secretKey": null,
  "accessLevel": null,
  "tsObjectId": null,
  "tokenExpiryDuration": null
}
```

