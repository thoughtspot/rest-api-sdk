
# Tspublic Rest V2 Org Update Request

## Structure

`TspublicRestV2OrgUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the organization. | String getName() | setName(String name) |
| `Id` | `Integer` | Optional | The ID of the organization. | Integer getId() | setId(Integer id) |
| `Description` | `String` | Optional | Description text for the organization. | String getDescription() | setDescription(String description) |
| `Active` | [`UpdateOrgActiveEnum`](../../doc/models/update-org-active-enum.md) | Optional | Status of the organization. | UpdateOrgActiveEnum getActive() | setActive(UpdateOrgActiveEnum active) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "description": null,
  "active": null
}
```

