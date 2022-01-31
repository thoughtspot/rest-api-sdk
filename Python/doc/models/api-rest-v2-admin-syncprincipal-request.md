
# Api Rest V2 Admin Syncprincipal Request

## Structure

`ApiRestV2AdminSyncprincipalRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `principal_object` | `List of string` | Required | A JSON array of principal objects containing all users and groups present in the external system.<br><br>Example:<br><br>{<br><br>"name": "Customer Success",<br><br>"displayName": "Customer Success",<br><br>"description": "CS",<br><br>"created": 1568926267025,<br><br>"modified": 1568926982242,<br><br>"principalTypeEnum": "LOCAL_GROUP",<br><br>"groupNames": [],<br><br>"visibility": "DEFAULT"<br><br>},<br><br>{<br><br>"name": "test",<br><br>"displayName": "test one",<br><br>"created": 1587573621279,<br><br>"modified": 1587573621674,<br><br>"mail": "test2@test.com",<br><br>"principalTypeEnum": "LOCAL_USER",<br><br>"groupNames": [ "Administrator", "All" ],<br><br>"visibility": "DEFAULT"<br><br>}<br><br>You can leave the created and modified dates blank for new users.<br><br>You can specify if the principal is a user (LOCAL_USER) or user group (LOCAL_GROUP) in the principalTypeEnum keyword.<br><br>Set visibility to NON_SHARABLE, if you do not want the user to be able to share ThoughtSpot objects with other users in this group. |
| `update_modified` | `bool` | Optional | Specifies whether to apply the changes to users and groups already in the cluster based on the principal object list input.<br>**Default**: `False` |
| `delete_removed` | `bool` | Optional | Specifies whether to delete the users and groups already in the cluster if not present in the principal object list input.<br>**Default**: `False` |
| `new_user_password` | `string` | Optional | Assign a password for new users added during the sync operation.<br><br>All new users added will have this password. It is mandatory to provide value for this field if new users are included in the input list. |

## Example (as JSON)

```json
{
  "principalObject": [
    "principalObject4",
    "principalObject5",
    "principalObject6"
  ],
  "updateModified": null,
  "deleteRemoved": null,
  "newUserPassword": null
}
```
