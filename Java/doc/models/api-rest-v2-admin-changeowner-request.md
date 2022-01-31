
# Api Rest V2 Admin Changeowner Request

## Structure

`ApiRestV2AdminChangeownerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MetaObjectId` | `List<String>` | Required | A JSON array of GUIDs of the metadata objects.<br><br>To change owner of all the objects owned by a user, provide single input as ALL.<br><br>If multiple object ids along with ALL is provided as input, then ALL will be considered. | List<String> getMetaObjectId() | setMetaObjectId(List<String> metaObjectId) |
| `FromUser` | [`FromUserNameAndIDInput`](/doc/models/from-user-name-and-id-input.md) | Required | A JSON object of name or GUIDs of the current owner of the objects. When both are given then id is considered.<br><br>If a list of object ids are provided as input for metaObjectId, then only for those ids that have owner as the value provided in fromUser, the owner will be changed.<br><br>Provide either name or id as input. When both are given user id will be considered. | FromUserNameAndIDInput getFromUser() | setFromUser(FromUserNameAndIDInput fromUser) |
| `ToUser` | [`ToUserNameAndIDInput`](/doc/models/to-user-name-and-id-input.md) | Required | A JSON object of name or GUIDs of the new owner for the objects. When both are given then id is considered. | ToUserNameAndIDInput getToUser() | setToUser(ToUserNameAndIDInput toUser) |

## Example (as JSON)

```json
{
  "metaObjectId": [
    "metaObjectId3",
    "metaObjectId4"
  ],
  "fromUser": {
    "name": null,
    "id": null
  },
  "toUser": {
    "name": null,
    "id": null
  }
}
```

