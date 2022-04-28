
# Tspublic Rest V2 Security Permission Tsobject Search Request

## Structure

`TspublicRestV2SecurityPermissionTsobjectSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tsObject` | [`TsObjectSearchInput[]`](../../doc/models/ts-object-search-input.md) | Required | A JSON Array of GUIDs and type of metadata object. |
| `principal` | [`UserNameAndIDInput[] \| undefined`](../../doc/models/user-name-and-id-input.md) | Optional | A JSON array of principal names or GUIDs. When both are given then id is considered. |
| `includeDependent` | [`SearchPermissionOnObjectsIncludeDependentEnum \| undefined`](../../doc/models/search-permission-on-objects-include-dependent-enum.md) | Optional | When this field is set to true, the API response includes the permission details for the dependent objects<br>**Default**: `SearchPermissionOnObjectsIncludeDependentEnum.False` |

## Example (as JSON)

```json
{
  "tsObject": [
    {
      "type": "DATAOBJECT",
      "id": [
        "id2"
      ]
    },
    {
      "type": "COLUMN",
      "id": [
        "id3",
        "id4"
      ]
    }
  ],
  "principal": null,
  "includeDependent": null
}
```

