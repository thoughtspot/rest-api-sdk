

# SearchAuthSettingsResponse

Response for searchAuthSettings. Contains auth type and cluster/org-level preferences.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Type of authentication mechanism returned. |  [optional] |
|**clusterPreferences** | [**AuthClusterPreferences**](AuthClusterPreferences.md) |  |  [optional] |
|**orgPreferences** | [**List&lt;AuthOrgPreference&gt;**](AuthOrgPreference.md) | Org-level authentication configurations. Present when org scope was requested and per-org auth feature is enabled. |  [optional] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| TRUSTED_AUTH | &quot;TRUSTED_AUTH&quot; |


## Implemented Interfaces

* Serializable


