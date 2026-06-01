

# SecuritySettingsOrgPreferences

Org-level security preferences.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**org** | [**SecuritySettingsOrgDetails**](SecuritySettingsOrgDetails.md) |  |  [optional] |
|**corsWhitelistedUrls** | **List&lt;String&gt;** | Allowed origins for CORS for this org. |  [optional] |
|**nonEmbedAccess** | [**OrgNonEmbedAccess**](OrgNonEmbedAccess.md) |  |  [optional] |
|**trustedAuthStatus** | [**TrustedAuthStatusEnum**](#TrustedAuthStatusEnum) | Trusted authentication status for this org.    Version: 26.6.0.cl or later  |  [optional] |



## Enum: TrustedAuthStatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |


## Implemented Interfaces

* Serializable


