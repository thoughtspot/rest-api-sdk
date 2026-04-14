

# AuthOrgPreference

Org-level authentication preferences for a single org.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**org** | [**AuthOrgInfo**](AuthOrgInfo.md) |  |  [optional] |
|**authStatus** | [**AuthStatusEnum**](#AuthStatusEnum) | Whether authentication is enabled or disabled for this org. |  [optional] |
|**accessTokens** | [**List&lt;AuthSettingsAccessToken&gt;**](AuthSettingsAccessToken.md) | Org-level access tokens. Absent when no token is configured or the feature flag is off. |  [optional] |



## Enum: AuthStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |


## Implemented Interfaces

* Serializable


