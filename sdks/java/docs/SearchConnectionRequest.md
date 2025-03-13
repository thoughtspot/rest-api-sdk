

# SearchConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connections** | [**List&lt;ConnectionInput&gt;**](ConnectionInput.md) | List of connections and name pattern |  [optional] |
|**dataWarehouseTypes** | [**List&lt;DataWarehouseTypesEnum&gt;**](#List&lt;DataWarehouseTypesEnum&gt;) | Array of types of data warehouse defined for the connection. |  [optional] |
|**recordOffset** | **Integer** | The starting record number from where the records should be included. |  [optional] |
|**recordSize** | **Integer** | The number of records that should be included. |  [optional] |
|**tagIdentifiers** | **List&lt;String&gt;** | Unique ID or name of tags. |  [optional] |
|**dataWarehouseObjectType** | [**DataWarehouseObjectTypeEnum**](#DataWarehouseObjectTypeEnum) | Data warehouse object type. |  [optional] |
|**sortOptions** | [**SearchConnectionRequestSortOptions**](SearchConnectionRequestSortOptions.md) |  |  [optional] |
|**includeDetails** | **Boolean** | Indicates whether to include complete details of the connection objects. |  [optional] |
|**_configuration** | **Object** | Configuration values. If empty we are fetching configuration from datasource based on given connection id. If required you can provide config details to fetch specific details. Example input: {}, {\&quot;warehouse\&quot;:\&quot;SMALL_WH\&quot;,\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}. This is only applicable when data_warehouse_object_type is selected. |  [optional] |
|**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) | List of authentication types to fetch data_ware_house_objects from external Data warehouse. This is only applicable when data_warehouse_object_type is selected. |  [optional] |



## Enum: List&lt;DataWarehouseTypesEnum&gt;

| Name | Value |
|---- | -----|
| SNOWFLAKE | &quot;SNOWFLAKE&quot; |
| AMAZON_REDSHIFT | &quot;AMAZON_REDSHIFT&quot; |
| GOOGLE_BIGQUERY | &quot;GOOGLE_BIGQUERY&quot; |
| AZURE_SYNAPSE | &quot;AZURE_SYNAPSE&quot; |
| TERADATA | &quot;TERADATA&quot; |
| SAP_HANA | &quot;SAP_HANA&quot; |
| STARBURST | &quot;STARBURST&quot; |
| ORACLE_ADW | &quot;ORACLE_ADW&quot; |
| DATABRICKS | &quot;DATABRICKS&quot; |
| DENODO | &quot;DENODO&quot; |
| DREMIO | &quot;DREMIO&quot; |
| TRINO | &quot;TRINO&quot; |
| PRESTO | &quot;PRESTO&quot; |
| POSTGRES | &quot;POSTGRES&quot; |
| SQLSERVER | &quot;SQLSERVER&quot; |
| MYSQL | &quot;MYSQL&quot; |
| GENERIC_JDBC | &quot;GENERIC_JDBC&quot; |
| AMAZON_RDS_POSTGRESQL | &quot;AMAZON_RDS_POSTGRESQL&quot; |
| AMAZON_AURORA_POSTGRESQL | &quot;AMAZON_AURORA_POSTGRESQL&quot; |
| AMAZON_RDS_MYSQL | &quot;AMAZON_RDS_MYSQL&quot; |
| AMAZON_AURORA_MYSQL | &quot;AMAZON_AURORA_MYSQL&quot; |
| LOOKER | &quot;LOOKER&quot; |
| AMAZON_ATHENA | &quot;AMAZON_ATHENA&quot; |
| SINGLESTORE | &quot;SINGLESTORE&quot; |
| GCP_SQLSERVER | &quot;GCP_SQLSERVER&quot; |
| GCP_ALLOYDB_POSTGRESQL | &quot;GCP_ALLOYDB_POSTGRESQL&quot; |
| GCP_POSTGRESQL | &quot;GCP_POSTGRESQL&quot; |
| GCP_MYSQL | &quot;GCP_MYSQL&quot; |
| MODE | &quot;MODE&quot; |
| GOOGLE_SHEETS | &quot;GOOGLE_SHEETS&quot; |
| FALCON | &quot;FALCON&quot; |
| FALCON_ONPREM | &quot;FALCON_ONPREM&quot; |
| CLICKHOUSE | &quot;CLICKHOUSE&quot; |



## Enum: DataWarehouseObjectTypeEnum

| Name | Value |
|---- | -----|
| DATABASE | &quot;DATABASE&quot; |
| SCHEMA | &quot;SCHEMA&quot; |
| TABLE | &quot;TABLE&quot; |
| COLUMN | &quot;COLUMN&quot; |



## Enum: AuthenticationTypeEnum

| Name | Value |
|---- | -----|
| SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot; |
| OAUTH | &quot;OAUTH&quot; |
| IAM | &quot;IAM&quot; |
| EXTOAUTH | &quot;EXTOAUTH&quot; |
| OAUTH_WITH_SERVICE_PRINCIPAL | &quot;OAUTH_WITH_SERVICE_PRINCIPAL&quot; |
| PERSONAL_ACCESS_TOKEN | &quot;PERSONAL_ACCESS_TOKEN&quot; |



