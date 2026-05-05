

# SyncMetadataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tables** | **Object** | Array of tables to sync. Each element can be: - String: Table identifier (GUID or name) to sync   all columns for that table. - Object: {tableId: [columnIds]} to sync specific   columns. If not provided, syncs all tables in the connection. |  [optional] |
|**syncAttributes** | [**List&lt;SyncAttributesEnum&gt;**](#List&lt;SyncAttributesEnum&gt;) | List of sync_attributes to sync from CDW. The default value is DESCRIPTION. |  [optional] |



## Enum: List&lt;SyncAttributesEnum&gt;

| Name | Value |
|---- | -----|
| DESCRIPTION | &quot;DESCRIPTION&quot; |


## Implemented Interfaces

* Serializable


