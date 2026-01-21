

# SearchSecuritySettingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of security settings to retrieve. CLUSTER returns cluster-level settings, ORG returns org-level settings for the current org. If not specified, returns both cluster and org settings based on user privileges. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


