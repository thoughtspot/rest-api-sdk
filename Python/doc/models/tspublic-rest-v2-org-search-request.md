
# Tspublic Rest V2 Org Search Request

## Structure

`TspublicRestV2OrgSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `string` | Optional | Name of the organization. |
| `id` | `int` | Optional | The ID of the organization. |
| `show_deleted` | [`SearchOrgsShowDeletedEnum`](../../doc/models/search-orgs-show-deleted-enum.md) | Optional | When set to true, the response will include the details of deleted organization also.<br>**Default**: `'false'` |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "showDeleted": null
}
```

