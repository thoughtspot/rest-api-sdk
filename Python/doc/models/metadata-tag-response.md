
# Metadata Tag Response

## Structure

`MetadataTagResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the tag |
| `id` | `string` | Optional | GUID of the tag |
| `client_state` | [`ClientState`](/doc/models/client-state.md) | Optional | - |
| `index_version` | `int` | Optional | - |
| `generation_num` | `int` | Optional | - |
| `is_deleted` | `bool` | Optional | Indicates if the tag is deleted |
| `is_hidden` | `bool` | Optional | Indicates if the tag is hidden |
| `is_external` | `bool` | Optional | Indicates if the tag is from external system |
| `is_deprecated` | `bool` | Optional | - |
| `created` | `float` | Optional | Date and time when group was created |
| `modified` | `float` | Optional | Date and time of last modification of the group |
| `modified_by` | [`TagNameAndID`](/doc/models/tag-name-and-id.md) | Optional | - |
| `author` | [`TagNameAndID`](/doc/models/tag-name-and-id.md) | Optional | - |
| `owner` | [`TagNameAndID`](/doc/models/tag-name-and-id.md) | Optional | - |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "clientState": null,
  "indexVersion": null,
  "generationNum": null,
  "isDeleted": null,
  "isHidden": null,
  "isExternal": null,
  "isDeprecated": null,
  "created": null,
  "modified": null,
  "modifiedBy": null,
  "author": null,
  "owner": null
}
```

