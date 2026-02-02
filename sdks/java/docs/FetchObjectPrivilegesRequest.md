

# FetchObjectPrivilegesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**List&lt;ObjectPrivilegesMetadataInput&gt;**](ObjectPrivilegesMetadataInput.md) | Metadata objects for which you want to fetch object privileges. For now only LOGICAL_TABLE is supported. It may be extended to other metadata types in the future. |  |
|**principals** | [**List&lt;PrincipalsInput&gt;**](PrincipalsInput.md) | User or group objects for which you want to fetch object privileges. If not specified, the API returns all users and groups that have object privileges on the specified metadata objects. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included for each metadata type. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included for each metadata type. |  [optional] |


## Implemented Interfaces

* Serializable


