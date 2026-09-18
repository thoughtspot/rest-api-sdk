

# AccessTokenScope

The set of Orgs a token is authorized to operate in, recorded at issuance. Used for token types (e.g. AccessToken) that have no other {@code scope} field of their own.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgScope** | [**OrgScopeEnum**](#OrgScopeEnum) | Org scope the token is authorized for: SPECIFIC_ORGS or ALL_MEMBER_ORGS. |  |
|**orgIds** | [**List&lt;OrgInfo&gt;**](OrgInfo.md) | Orgs the token is authorized for when org_scope is SPECIFIC_ORGS. |  [optional] |



## Enum: OrgScopeEnum

| Name | Value |
|---- | -----|
| SPECIFIC_ORGS | &quot;SPECIFIC_ORGS&quot; |
| ALL_MEMBER_ORGS | &quot;ALL_MEMBER_ORGS&quot; |


## Implemented Interfaces

* Serializable


