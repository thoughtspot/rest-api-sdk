

# SecuritySettingsOrgPreferencesInput

Input for org-level security preferences configuration. Note: cross-org operations are not supported currently.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | Unique identifier or name of the org |  |
|**corsWhitelistedUrls** | **List&lt;String&gt;** | Allowed origins for CORS for this org. |  [optional] |
|**nonEmbedAccess** | [**OrgNonEmbedAccessInput**](OrgNonEmbedAccessInput.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


