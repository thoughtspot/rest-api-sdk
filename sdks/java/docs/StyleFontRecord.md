

# StyleFontRecord

A custom font record in the font library.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique UUID identifier of the font. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope indicating whether this font belongs to the cluster or org library. |  [optional] |
|**org** | [**StyleOrgInfo**](StyleOrgInfo.md) |  |  [optional] |
|**name** | **String** | Display name of the font. |  |
|**weight** | [**WeightEnum**](#WeightEnum) | Weight of the font. |  [optional] |
|**style** | [**StyleEnum**](#StyleEnum) | Style of the font. |  [optional] |
|**color** | **String** | Color of the font as a 6-digit hex string. |  [optional] |
|**creationTimeInMillis** | **Float** | Timestamp in milliseconds when the font was uploaded. |  [optional] |
|**assignments** | [**List&lt;StyleFontAssignment&gt;**](StyleFontAssignment.md) | Visualization areas currently assigned to this font. Empty if not assigned to any area. Populated only when include_font_assignments is true. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |



## Enum: WeightEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| LIGHT | &quot;LIGHT&quot; |
| BOLD | &quot;BOLD&quot; |



## Enum: StyleEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| ITALIC | &quot;ITALIC&quot; |
| OBLIQUE | &quot;OBLIQUE&quot; |


## Implemented Interfaces

* Serializable


