
# Metadata Tag Response

## Structure

`MetadataTagResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the tag |
| `id` | `string \| undefined` | Optional | GUID of the tag |
| `clientState` | [`ClientState \| undefined`](../../doc/models/client-state.md) | Optional | - |
| `indexVersion` | `number \| undefined` | Optional | - |
| `generationNum` | `number \| undefined` | Optional | - |
| `isDeleted` | `boolean \| undefined` | Optional | Indicates if the tag is deleted |
| `isHidden` | `boolean \| undefined` | Optional | Indicates if the tag is hidden |
| `isExternal` | `boolean \| undefined` | Optional | Indicates if the tag is from external system |
| `isDeprecated` | `boolean \| undefined` | Optional | - |
| `created` | `number \| undefined` | Optional | Date and time when group was created |
| `modified` | `number \| undefined` | Optional | Date and time of last modification of the group |
| `modifiedBy` | [`TagNameAndID \| undefined`](../../doc/models/tag-name-and-id.md) | Optional | - |
| `author` | [`TagNameAndID \| undefined`](../../doc/models/tag-name-and-id.md) | Optional | - |
| `owner` | [`TagNameAndID \| undefined`](../../doc/models/tag-name-and-id.md) | Optional | - |

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

