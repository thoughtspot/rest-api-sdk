

# Scope


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | **String** | Object access scope type. |  |
|**orgId** | **Integer** | Unique identifier of the Org. |  [optional] |
|**metadataId** | **String** | Unique identifier of the metadata. |  [optional] |
|**orgScope** | [**OrgScopeEnum**](#OrgScopeEnum) | Org scope the token is authorized for. Absent for a legacy single-org token.   Version: 26.10.0.cl or later  |  [optional] |
|**orgIds** | [**List&lt;OrgInfo&gt;**](OrgInfo.md) | Orgs the token is authorized for when org_scope is SPECIFIC_ORGS.   Version: 26.10.0.cl or later  |  [optional] |



## Enum: OrgScopeEnum

| Name | Value |
|---- | -----|
| SPECIFIC_ORGS | &quot;SPECIFIC_ORGS&quot; |
| ALL_MEMBER_ORGS | &quot;ALL_MEMBER_ORGS&quot; |


## Implemented Interfaces

* Serializable


