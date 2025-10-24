

# ColumnSecurityRuleUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnIdentifier** | **String** | Column identifier (col_id or name) |  |
|**isUnsecured** | **Boolean** | If true, the column will be marked as unprotected and all groups associated with it will be removed |  [optional] |
|**groupAccess** | [**List&lt;ColumnSecurityRuleGroupOperation&gt;**](ColumnSecurityRuleGroupOperation.md) | Array of group operation objects that specifies the actions for groups to be associated with a column |  [optional] |


## Implemented Interfaces

* Serializable


