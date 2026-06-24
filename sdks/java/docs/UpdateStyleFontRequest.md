

# UpdateStyleFontRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of the font library containing this font. CLUSTER targets the cluster-level library. ORG targets the authenticated user&#39;s org library. Defaults to ORG if omitted. |  [optional] |
|**name** | **String** | New display name for the font. |  [optional] |
|**weight** | [**WeightEnum**](#WeightEnum) | New weight for the font. Supported values: NORMAL, LIGHT, BOLD. |  [optional] |
|**style** | [**StyleEnum**](#StyleEnum) | New style for the font. Supported values: NORMAL, ITALIC, OBLIQUE. |  [optional] |
|**color** | **String** | New color for the font as a 6-digit hex string (e.g. \&quot;#333333\&quot;). Returns an error if the value is malformed. |  [optional] |



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


