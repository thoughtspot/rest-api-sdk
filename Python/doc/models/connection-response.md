
# Connection Response

## Structure

`ConnectionResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the connection |
| `description` | `string` | Optional | Description associated with the connection |
| `mtype` | `string` | Optional | Type of the connection. The database associated with this type can be obtained from the response returned by the /api/rest/v2/connection/types API endpoint. |
| `id` | `string` | Optional | GUID of the connection |
| `scheduled` | `bool` | Optional | Indicates if the data sync is scheduled for this connection |
| `connection_type` | `string` | Optional | - |
| `configuration` | `string` | Optional | Configuration properties of the connection |
| `is_external` | `bool` | Optional | - |
| `is_deprecated` | `bool` | Optional | Indicates if the connection is deprecated |
| `is_deleted` | `bool` | Optional | Indicates if the connection is deleted |
| `is_hidden` | `bool` | Optional | Indicates if the connection is hideen |
| `complete` | `bool` | Optional | Indicates if the all the properties of connection is provided |
| `index_version` | `int` | Optional | - |
| `generation_num` | `int` | Optional | - |
| `created` | `string` | Optional | Date and time when the connection was created |
| `modified` | `string` | Optional | Date and time of last modification of the connection |
| `author` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `modified_by` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID`](/doc/models/user-name-and-id.md) | Optional | - |
| `tags` | `List of string` | Optional | List of tags assigned to the connection |
| `tables` | [`List of TableList`](/doc/models/table-list.md) | Optional | List of tables linked to this connection |

## Example (as JSON)

```json
{
  "name": null,
  "description": null,
  "type": null,
  "id": null,
  "scheduled": null,
  "connectionType": null,
  "configuration": null,
  "isExternal": null,
  "isDeprecated": null,
  "isDeleted": null,
  "isHidden": null,
  "complete": null,
  "indexVersion": null,
  "generationNum": null,
  "created": null,
  "modified": null,
  "author": null,
  "modifiedBy": null,
  "owner": null,
  "tags": null,
  "tables": null
}
```

