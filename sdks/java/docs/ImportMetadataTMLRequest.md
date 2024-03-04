

# ImportMetadataTMLRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataTmls** | **List&lt;String&gt;** | Details of TML objects. |  |
|**importPolicy** | [**ImportPolicyEnum**](#ImportPolicyEnum) | Specifies the import policy for the TML import. |  [optional] |
|**createNew** | **Boolean** | If selected, creates TML objects with new GUIDs. |  [optional] |



## Enum: ImportPolicyEnum

| Name | Value |
|---- | -----|
| PARTIAL | &quot;PARTIAL&quot; |
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |



