
# Liveboard Query Response

## Structure

`LiveboardQueryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the Liveboard | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the Liveboard | String getId() | setId(String id) |
| `Viz` | [`List<VizType>`](../../doc/models/viz-type.md) | Optional | SQL query associated with the saved Answer | List<VizType> getViz() | setViz(List<VizType> viz) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "viz": null
}
```

