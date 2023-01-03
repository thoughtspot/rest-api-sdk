
# Tspublic Rest V2 Admin Assignauthor Request

## Structure

`TspublicRestV2AdminAssignauthorRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TsObjectId` | `List<String>` | Required | A JSON array of GUIDs of the metadata objects. | List<String> getTsObjectId() | setTsObjectId(List<String> tsObjectId) |
| `Name` | `String` | Optional | User name of the user account | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the user account | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "tsObjectId": [
    "tsObjectId1",
    "tsObjectId2",
    "tsObjectId3"
  ],
  "name": null,
  "id": null
}
```

