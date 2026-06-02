

# AuthClusterPreferences

Cluster-level authentication preferences.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authStatus** | [**AuthStatusEnum**](#AuthStatusEnum) | Whether authentication is enabled or disabled at the cluster level. |  [optional] |
|**accessTokens** | [**List&lt;AuthSettingsAccessToken&gt;**](AuthSettingsAccessToken.md) | Cluster-level access tokens. Absent when no token is configured. |  [optional] |



## Enum: AuthStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |


## Implemented Interfaces

* Serializable


