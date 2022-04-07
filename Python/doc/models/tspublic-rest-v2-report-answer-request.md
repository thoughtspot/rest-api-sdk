
# Tspublic Rest V2 Report Answer Request

## Structure

`TspublicRestV2ReportAnswerRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | GUID of the Answer to download. |
| `mtype` | [`Type16Enum`](../../doc/models/type-16-enum.md) | Required | Type of file to be generated.<br>**Default**: `'CSV'` |

## Example (as JSON)

```json
{
  "id": null,
  "type": "CSV"
}
```

