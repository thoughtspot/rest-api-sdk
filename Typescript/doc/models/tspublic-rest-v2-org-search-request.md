
# Tspublic Rest V2 Org Search Request

## Structure

`TspublicRestV2OrgSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string \| undefined` | Optional | Name of the organization. |
| `id` | `string \| undefined` | Optional | The ID of the organization. |
| `showDeleted` | [`SearchOrgsShowDeletedEnum \| undefined`](../../doc/models/search-orgs-show-deleted-enum.md) | Optional | When set to true, the response will include the details of deleted organization also.<br>**Default**: `SearchOrgsShowDeletedEnum.False` |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "showDeleted": null
}
```

