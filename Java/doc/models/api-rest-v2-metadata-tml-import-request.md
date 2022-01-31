
# Api Rest V2 Metadata Tml Import Request

## Structure

`ApiRestV2MetadataTmlImportRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ObjectTML` | `List<String>` | Required | A JSON array of TML objects to upload, in YAML or JSON format.<br><br>If in YAML format within the JSON array, use escape characters for YAML quotes, and new line characters when there is a new line.<br><br>Example:<br><br>To import a single object, ["guid: 3729c085-8659-48fd-9479-a67bd7307496\npinboard:\n name: …"]<br><br>To import multiple objects, ["guid: 3729c085-8659-48fd-9479-a67bd7307496\npinboard:\n name: …", "guid: 5739d025-8659-48fd-9479-a67bd7704212\npinboard:\n name: …"] | List<String> getObjectTML() | setObjectTML(List<String> objectTML) |
| `ImportPolicy` | [`ImportPolicyEnum`](/doc/models/import-policy-enum.md) | Optional | Policy to follow during import.<br><br>PARTIAL - Imports all objects that validate successfully, and ignores objects that do not validate successfully.<br><br>ALL_OR_NONE Imports the objects that validate successfully.<br><br>VALIDATE_ONLY Validates the objects but does not import them.<br>**Default**: `ImportPolicyEnum.PARTIAL` | ImportPolicyEnum getImportPolicy() | setImportPolicy(ImportPolicyEnum importPolicy) |
| `ForceCreate` | `Boolean` | Optional | Specifies if you are updating or creating objects. To create new objects, specify true.<br><br>By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true.<br>**Default**: `false` | Boolean getForceCreate() | setForceCreate(Boolean forceCreate) |

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

