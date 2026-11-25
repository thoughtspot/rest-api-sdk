

# OrgNonEmbedAccessInput

Input for org-level non-embed access configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockFullAppAccess** | **Boolean** | Block full application access for non-embedded usage. |  [optional] |
|**groupsIdentifiersWithAccess** | **List&lt;String&gt;** | Group identifiers that are allowed non-embed full app access. Can only be set if block_full_app_access is true. Replaces the existing list. Groups not included in the request lose access. |  [optional] |


## Implemented Interfaces

* Serializable


