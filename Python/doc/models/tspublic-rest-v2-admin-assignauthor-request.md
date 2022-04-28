
# Tspublic Rest V2 Admin Assignauthor Request

## Structure

`TspublicRestV2AdminAssignauthorRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ts_object_id` | `List of string` | Required | A JSON array of GUIDs of the metadata objects. |
| `name` | `string` | Optional | User name of the user account. |
| `id` | `string` | Optional | The GUID of the user account. |

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

