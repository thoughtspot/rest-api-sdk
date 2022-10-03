
# Tspublic Rest V2 Org Search Request

## Structure

`TspublicRestV2OrgSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the organization. | String getName() | setName(String name) |
| `Id` | `Integer` | Optional | The ID of the organization. | Integer getId() | setId(Integer id) |
| `ShowDeleted` | [`SearchOrgsShowDeletedEnum`](../../doc/models/search-orgs-show-deleted-enum.md) | Optional | When set to true, the response will include the details of deleted organization also.<br>**Default**: `SearchOrgsShowDeletedEnum.ENUM_FALSE` | SearchOrgsShowDeletedEnum getShowDeleted() | setShowDeleted(SearchOrgsShowDeletedEnum showDeleted) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "showDeleted": null
}
```

