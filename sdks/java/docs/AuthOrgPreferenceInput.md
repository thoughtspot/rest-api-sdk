

# AuthOrgPreferenceInput

Input for org-level auth configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | Unique ID or name of the org to configure. |  |
|**authStatus** | [**AuthStatusEnum**](#AuthStatusEnum) | Enable or disable authentication for this org. When enabled, a new token is generated if one does not exist. When disabled, the existing token is revoked. |  [optional] |



## Enum: AuthStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |


## Implemented Interfaces

* Serializable


