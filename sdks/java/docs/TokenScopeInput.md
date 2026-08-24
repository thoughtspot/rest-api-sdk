

# TokenScopeInput

The set of Orgs a token is authorized to operate in, recorded at issuance. Only applicable to a Tenant Administrator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgScope** | [**OrgScopeEnum**](#OrgScopeEnum) | The set of Orgs this token is authorized to operate in. SPECIFIC_ORGS authorizes the token for the Orgs listed in org_identifiers; ALL_MEMBER_ORGS authorizes it for all Orgs the user is a member of.   Version: 26.10.0.cl or later  |  |
|**orgIdentifiers** | **List&lt;String&gt;** | ID or name of the Orgs the token is authorized for. Required when org_scope is SPECIFIC_ORGS; ignored when org_scope is ALL_MEMBER_ORGS.   Version: 26.10.0.cl or later  |  [optional] |



## Enum: OrgScopeEnum

| Name | Value |
|---- | -----|
| SPECIFIC_ORGS | &quot;SPECIFIC_ORGS&quot; |
| ALL_MEMBER_ORGS | &quot;ALL_MEMBER_ORGS&quot; |


## Implemented Interfaces

* Serializable


