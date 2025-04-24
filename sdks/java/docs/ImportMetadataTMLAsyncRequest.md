

# ImportMetadataTMLAsyncRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadataTmls** | **List&lt;String&gt;** | Details of TML objects. |  |
|**createNew** | **Boolean** | If selected, creates TML objects with new GUIDs. |  [optional] |
|**allOrgsContext** | **Boolean** | If import is happening from all orgs context. |  [optional] |
|**skipCdwValidationForTables** | **Boolean** | Boolean to indicate if the CDW validation for table imports should be skipped. |  [optional] |
|**importPolicy** | [**ImportPolicyEnum**](#ImportPolicyEnum) | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Policy to be followed while importing the TML. Valid values are [PARTIAL_OBJECT, PARTIAL, VALIDATE_ONLY, ALL_OR_NONE] |  [optional] |
|**enableLargeMetadataValidation** | **Boolean** | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Boolean to indicate if the large metadata validation should be enabled. |  [optional] |



## Enum: ImportPolicyEnum

| Name | Value |
|---- | -----|
| PARTIAL | &quot;PARTIAL&quot; |
| ALL_OR_NONE | &quot;ALL_OR_NONE&quot; |
| VALIDATE_ONLY | &quot;VALIDATE_ONLY&quot; |
| PARTIAL_OBJECT | &quot;PARTIAL_OBJECT&quot; |



