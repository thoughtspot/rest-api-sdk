

# ImportMetadataTMLRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataTmls** | **List&lt;String&gt;** | Details of TML objects. **Note: importing TML in YAML format, when coming directly from our Playground, is currently requires manual formatting. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)** |  |
|**importPolicy** | [**ImportPolicyEnum**](#ImportPolicyEnum) | Specifies the import policy for the TML import. |  [optional] |
|**createNew** | **Boolean** | If selected, creates TML objects with new GUIDs. |  [optional] |
|**allOrgsContext** | **Boolean** | If import is happening from all orgs context. |  [optional] |



## Enum: ImportPolicyEnum

| Name | Value |
|---- | -----|
| PARTIAL | &quot;PARTIAL&quot; |
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |
| PARTIAL_OBJECT | &quot;PARTIAL_OBJECT&quot; |



