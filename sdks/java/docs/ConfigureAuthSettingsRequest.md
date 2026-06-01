

# ConfigureAuthSettingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Type of authentication mechanism to configure. Currently supports TRUSTED_AUTH. |  |
|**clusterPreferences** | [**AuthClusterPreferencesInput**](AuthClusterPreferencesInput.md) | Cluster-level authentication preferences. Omit to leave the existing cluster setting unchanged. |  [optional] |
|**orgPreferences** | [**List&lt;AuthOrgPreferenceInput&gt;**](AuthOrgPreferenceInput.md) | Org-level authentication preferences. Each entry identifies an org and the desired status. Omit to leave existing org settings unchanged. |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| TRUSTED_AUTH | &quot;TRUSTED_AUTH&quot; |


## Implemented Interfaces

* Serializable


