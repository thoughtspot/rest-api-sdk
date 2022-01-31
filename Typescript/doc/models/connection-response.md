
# Connection Response

## Structure

`ConnectionResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the connection |
| `description` | `string \| undefined` | Optional | Description associated with the connection |
| `type` | `string \| undefined` | Optional | Type of the connection. The database associated with this type can be obtained from the response returned by the /api/rest/v2/connection/types API endpoint. |
| `id` | `string \| undefined` | Optional | GUID of the connection |
| `scheduled` | `boolean \| undefined` | Optional | Indicates if the data sync is scheduled for this connection |
| `connectionType` | `string \| undefined` | Optional | - |
| `configuration` | `string \| undefined` | Optional | Configuration properties of the connection |
| `isExternal` | `boolean \| undefined` | Optional | - |
| `isDeprecated` | `boolean \| undefined` | Optional | Indicates if the connection is deprecated |
| `isDeleted` | `boolean \| undefined` | Optional | Indicates if the connection is deleted |
| `isHidden` | `boolean \| undefined` | Optional | Indicates if the connection is hideen |
| `complete` | `boolean \| undefined` | Optional | Indicates if the all the properties of connection is provided |
| `indexVersion` | `number \| undefined` | Optional | - |
| `generationNum` | `number \| undefined` | Optional | - |
| `created` | `string \| undefined` | Optional | Date and time when the connection was created |
| `modified` | `string \| undefined` | Optional | Date and time of last modification of the connection |
| `author` | [`UserNameAndID \| undefined`](/doc/models/user-name-and-id.md) | Optional | - |
| `modifiedBy` | [`UserNameAndID \| undefined`](/doc/models/user-name-and-id.md) | Optional | - |
| `owner` | [`UserNameAndID \| undefined`](/doc/models/user-name-and-id.md) | Optional | - |
| `tags` | `string[] \| undefined` | Optional | List of tags assigned to the connection |
| `tables` | [`TableList[] \| undefined`](/doc/models/table-list.md) | Optional | List of tables linked to this connection |

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

