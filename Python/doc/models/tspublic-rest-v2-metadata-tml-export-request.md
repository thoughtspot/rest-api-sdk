
# Tspublic Rest V2 Metadata Tml Export Request

## Structure

`TspublicRestV2MetadataTmlExportRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `List of string` | Required | A JSON array of GUIDs of the objects. |
| `format_type` | [`FormatTypeEnum`](../../doc/models/format-type-enum.md) | Optional | The format in which to export the objects<br>**Default**: `'YAML'` |
| `export_associated` | [`ExportAssociatedEnum`](../../doc/models/export-associated-enum.md) | Optional | Specifies if you would like to export the associated objects. To export the objects associated with the objects specified in id, set the value to true. When set to true, the API exports any underlying worksheets, tables, or views for a given object.<br><br>By default, the API does not export these underlying objects<br>**Default**: `'false'` |

## Example (as JSON)

```json
{
  "id": [
    "id0"
  ],
  "formatType": null,
  "exportAssociated": null
}
```

