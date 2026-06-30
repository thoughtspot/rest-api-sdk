

# WebhookStorageConfigInfo

Cluster-level storage setup information for configuring customer-managed storage.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storageType** | [**StorageTypeEnum**](#StorageTypeEnum) | Type of storage destination. |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Storage destination provider. |  |
|**config** | [**WebhookStorageSetupConfig**](WebhookStorageSetupConfig.md) |  |  |



## Enum: StorageTypeEnum

| Name | Value |
|---- | -----|
| OBJECT_STORAGE | &quot;OBJECT_STORAGE&quot; |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| AWS_S3 | &quot;AWS_S3&quot; |
| GCP_GCS | &quot;GCP_GCS&quot; |


## Implemented Interfaces

* Serializable


