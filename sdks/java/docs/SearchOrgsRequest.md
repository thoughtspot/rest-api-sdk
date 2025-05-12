

# SearchOrgsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | ID or name of the Org |  [optional] |
|**description** | **String** | Description of the Org |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the Org |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the Org |  [optional] |
|**userIdentifiers** | **List&lt;String&gt;** | GUIDs or names of the users for which you want to retrieve the Orgs data |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SHOW | &quot;SHOW&quot; |
| HIDDEN | &quot;HIDDEN&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| IN_ACTIVE | &quot;IN_ACTIVE&quot; |


## Implemented Interfaces

* Serializable


