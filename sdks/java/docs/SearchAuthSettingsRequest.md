

# SearchAuthSettingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Type of authentication mechanism to retrieve settings for. Currently supports TRUSTED_AUTH. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of auth settings to retrieve. When absent, both cluster and org settings are returned (subject to caller privileges). Set to CLUSTER to retrieve only cluster-level settings, or ORG to retrieve only org-level settings. |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| TRUSTED_AUTH | &quot;TRUSTED_AUTH&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


