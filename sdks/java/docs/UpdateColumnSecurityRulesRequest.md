

# UpdateColumnSecurityRulesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | GUID or name of the table for which we want to create column security rules |  [optional] |
|**objIdentifier** | **String** | The object ID of the table |  [optional] |
|**clearCsr** | **Boolean** | If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed |  [optional] |
|**columnSecurityRules** | [**List&lt;ColumnSecurityRuleUpdate&gt;**](ColumnSecurityRuleUpdate.md) | Array where each object defines the security rule for a specific column |  |


## Implemented Interfaces

* Serializable


