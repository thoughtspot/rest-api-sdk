

# AuthClusterPreferencesInput

Input for cluster-level auth configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authStatus** | [**AuthStatusEnum**](#AuthStatusEnum) | Enable or disable authentication at the cluster level. When enabled, a new token is generated if one does not exist. When disabled, the existing token is revoked. |  [optional] |



## Enum: AuthStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |


## Implemented Interfaces

* Serializable


