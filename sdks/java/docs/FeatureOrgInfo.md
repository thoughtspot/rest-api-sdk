

# FeatureOrgInfo

Lightweight Org identifier and display name, as returned in feature assignment responses. The field names org_id / org_name intentionally deviate from the bare id / name used by the shared Org type: they are the literal wire keys emitted by the Callosum backend, so they are load-bearing for Prism's response field mapping and cannot be renamed without a backend change.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgId** | **Integer** | Numeric ID of the Org. |  |
|**orgName** | **String** | Display name of the Org. |  |


## Implemented Interfaces

* Serializable


