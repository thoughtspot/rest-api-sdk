
# Tspublic Rest V2 Customaction Search Request

## Structure

`TspublicRestV2CustomactionSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Tag` | `List<String>` | Optional | A JSON array of tag GUIDs.<br><br>If tags are applied to worksheets, search answers, or Liveboard visualizations, and custom actions are associated to these objects, you can use this parameter to filter the custom action data by tags. | List<String> getTag() | setTag(List<String> tag) |

## Example (as JSON)

```json
{
  "tag": null
}
```

