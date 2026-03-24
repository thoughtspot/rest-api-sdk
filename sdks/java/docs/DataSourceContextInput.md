

# DataSourceContextInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataSourceIdentifier** | **String** | Unique identifier of the data source. Required when context type is DATA_SOURCE and &#x60;data_source_identifiers&#x60; is not provided. At least one of &#x60;data_source_identifier&#x60; or &#x60;data_source_identifiers&#x60; must be supplied for DATA_SOURCE context; omit only when context type is AUTO_MODE.    Version: 26.5.0.cl or later  |  [optional] |
|**dataSourceIdentifiers** | **List&lt;String&gt;** | Unique identifiers of data sources for multi-data-source context. Required when context type is DATA_SOURCE and &#x60;data_source_identifier&#x60; is not provided.    Version: 26.5.0.cl or later  |  [optional] |
|**guid** | **String** | Deprecated. Use &#x60;data_source_identifier&#x60; instead. Previously required when neither &#x60;data_source_identifier&#x60; nor &#x60;data_source_identifiers&#x60; was provided for DATA_SOURCE context.    Version: 26.2.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


