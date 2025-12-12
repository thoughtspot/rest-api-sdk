

# ConnectionConfigurationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configurationIdentifier** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**_configuration** | **Object** |  |  [optional] |
|**policyPrincipals** | [**List&lt;UserPrincipal&gt;**](UserPrincipal.md) |  |  [optional] |
|**policyProcesses** | [**List&lt;PolicyProcessesEnum&gt;**](#List&lt;PolicyProcessesEnum&gt;) |  |  [optional] |
|**disabled** | **Boolean** |  |  [optional] |
|**dataWarehouseType** | [**DataWarehouseTypeEnum**](#DataWarehouseTypeEnum) |  |  [optional] |
|**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) |  |  [optional] |
|**sameAsParent** | **Boolean** |  |  [optional] |
|**policyProcessOptions** | [**PolicyProcessOptions**](PolicyProcessOptions.md) |  |  [optional] |



## Enum: List&lt;PolicyProcessesEnum&gt;

| Name | Value |
|---- | -----|
| SAGE_INDEXING | &quot;SAGE_INDEXING&quot; |
| ROW_COUNT_STATS | &quot;ROW_COUNT_STATS&quot; |



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



## Enum: PolicyTypeEnum

| Name | Value |
|---- | -----|
| NO_POLICY | &quot;NO_POLICY&quot; |
| PRINCIPALS | &quot;PRINCIPALS&quot; |
| PROCESSES | &quot;PROCESSES&quot; |


## Implemented Interfaces

* Serializable


