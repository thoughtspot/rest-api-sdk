
# Tspublic Rest V2 Security Permission Principal Search Request

## Structure

`TspublicRestV2SecurityPermissionPrincipalSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Principal` | [`List<Models.UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Required | A JSON array of principal names or GUIDs to be included in the request. When both are given then id is considered. |
| `TsObject` | [`List<Models.TsObjectSearchInput>`](../../doc/models/ts-object-search-input.md) | Optional | A JSON Array of GUIDs and type of metadata object. |

## Example (as JSON)

```json
{
  "principal": [
    {
      "name": null,
      "id": null
    },
    {
      "name": null,
      "id": null
    }
  ],
  "tsObject": null
}
```

