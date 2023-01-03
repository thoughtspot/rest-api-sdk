
# Tspublic Rest V2 Org Search Request

## Structure

`TspublicRestV2OrgSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the organization. | String getName() | setName(String name) |
| `Id` | `Integer` | Optional | The ID of the organization. | Integer getId() | setId(Integer id) |
| `ShowDeleted` | `Boolean` | Optional | When set to true, the response will include the details of deleted organization also.<br>**Default**: `false` | Boolean getShowDeleted() | setShowDeleted(Boolean showDeleted) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "showDeleted": null
}
```

