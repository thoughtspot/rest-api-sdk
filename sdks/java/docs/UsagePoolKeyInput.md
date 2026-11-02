

# UsagePoolKeyInput

Identifies a Spotter usage pool by the entity it meters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Type of entity the pool meters: &#x60;USER&#x60;, &#x60;USER_GROUP&#x60;, or &#x60;ORG&#x60;. Must match the scope the cluster meters at. |  |
|**entityIdentifier** | **String** | GUID of the user or user group, or the ID of the Org, that the pool meters. |  |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| USER_GROUP | &quot;USER_GROUP&quot; |
| ORG | &quot;ORG&quot; |


## Implemented Interfaces

* Serializable


