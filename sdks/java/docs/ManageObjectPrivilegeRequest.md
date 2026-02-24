

# ManageObjectPrivilegeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) | Operation to perform to manage object privileges. Available operations are: &#x60;ADD&#x60;, &#x60;REMOVE&#x60;. |  |
|**metadataType** | [**MetadataTypeEnum**](#MetadataTypeEnum) | Type of metadata objects on which you want to perform the operation. For now only LOGICAL_TABLE is supported. It may be extended to other metadata types in the future. |  |
|**objectPrivilegeTypes** | [**List&lt;ObjectPrivilegeTypesEnum&gt;**](#List&lt;ObjectPrivilegeTypesEnum&gt;) | List of object privilege types on which you want to perform the operation. |  |
|**metadataIdentifiers** | **List&lt;String&gt;** | List of metadata identifiers (GUID or name) on which you want to perform the operation. |  |
|**principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects (GUID or name) to which you want to apply the given operation and given object privileges. |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| REMOVE | &quot;REMOVE&quot; |



## Enum: MetadataTypeEnum

| Name | Value |
|---- | -----|
| LOGICAL_TABLE | &quot;LOGICAL_TABLE&quot; |



## Enum: List&lt;ObjectPrivilegeTypesEnum&gt;

| Name | Value |
|---- | -----|
| SPOTTER_COACHING_PRIVILEGE | &quot;SPOTTER_COACHING_PRIVILEGE&quot; |


## Implemented Interfaces

* Serializable


