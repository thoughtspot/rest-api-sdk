

# SearchOrgsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgIdentifier** | **String** | ID or name of the Org |  [optional] |
|**description** | **String** | Description of the Org |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Visibility of the Org |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the Org |  [optional] |
|**userIdentifiers** | **List&lt;String&gt;** | GUIDs or names of the users for which you want to retrieve the Orgs data |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included.    Version: 27.1.0.cl or later  |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included.    Version: 27.1.0.cl or later  |  [optional] |



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


