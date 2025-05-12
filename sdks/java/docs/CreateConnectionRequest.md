

# CreateConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name for the connection. |  |
|**description** | **String** | Description of the connection. |  [optional] |
|**dataWarehouseType** | [**DataWarehouseTypeEnum**](#DataWarehouseTypeEnum) | Type of the data warehouse. |  |
|**dataWarehouseConfig** | **Object** | Connection configuration attributes in JSON format. To create a connection with tables, include table attributes. See the documentation above for sample JSON. |  |
|**validate** | **Boolean** | Validates the connection metadata if tables are included. If you are creating a connection without tables, specify &#x60;false&#x60;. |  [optional] |



## Enum: DataWarehouseTypeEnum

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


## Implemented Interfaces

* Serializable


