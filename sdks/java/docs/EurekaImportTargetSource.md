

# EurekaImportTargetSource

Identifies the target object a group of import counts applies to. `type` is the source kind (currently `DATA_MODEL`) and `identifier` is the object's GUID.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Identifier (GUID) of the target object these counts apply to. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Source object kind (currently &#x60;DATA_MODEL&#x60;). |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATA_MODEL | &quot;DATA_MODEL&quot; |


## Implemented Interfaces

* Serializable


