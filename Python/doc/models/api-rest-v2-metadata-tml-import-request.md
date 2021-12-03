
# Api Rest V2 Metadata Tml Import Request

## Structure

`ApiRestV2MetadataTmlImportRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `object_tml` | `List of string` | Required | A JSON array of TML objects to upload, in YAML or JSON format. If in YAML format within the JSON array, use escape characters for YAML quotes, and new line characters when there is a new line |
| `import_policy` | [`ImportPolicyEnum`](/doc/models/import-policy-enum.md) | Optional | Policy to follow during import<br>**Default**: `'PARTIAL'` |
| `force_create` | `bool` | Optional | Specifies if you are updating or creating objects. To create new objects, specify true. By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true.<br>**Default**: `False` |

## Example (as JSON)

```json
{
  "objectTML": [
    "objectTML7"
  ],
  "importPolicy": null,
  "forceCreate": null
}
```

