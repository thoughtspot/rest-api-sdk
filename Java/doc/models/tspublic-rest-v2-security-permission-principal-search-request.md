
# Tspublic Rest V2 Security Permission Principal Search Request

## Structure

`TspublicRestV2SecurityPermissionPrincipalSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Principal` | [`List<UserNameAndIDInput>`](../../doc/models/user-name-and-id-input.md) | Required | A JSON array of principal names or GUIDs to be included in the request. When both are given then id is considered. | List<UserNameAndIDInput> getPrincipal() | setPrincipal(List<UserNameAndIDInput> principal) |
| `TsObject` | [`List<TsObjectSearchInput>`](../../doc/models/ts-object-search-input.md) | Optional | A JSON Array of GUIDs and type of metadata object. | List<TsObjectSearchInput> getTsObject() | setTsObject(List<TsObjectSearchInput> tsObject) |

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

