

# UpdateConnectionConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionIdentifier** | **String** | Unique ID or name of the connection. |  |
|**name** | **String** | Name of the configuration to update. |  [optional] |
|**description** | **String** | Description of the configuration. |  [optional] |
|**sameAsParent** | **Boolean** | Specifies whether the connection configuration should inherit all properties and authentication type from its parent connection. This attribute is only applicable to parameterized connections. When set to true, the configuration uses only the connection properties and authentication type inherited from the parent.    Version: 26.2.0.cl or later  |  [optional] |
|**policyProcessOptions** | [**PolicyProcessOptionsInput**](PolicyProcessOptionsInput.md) | This attribute is only applicable to parameterized connections. Ensure that the policy is set to Processes to allow the configuration to be used exclusively for system processes.    Version: 26.2.0.cl or later  |  [optional] |
|**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) | Type of authentication. |  [optional] |
|**_configuration** | **Object** | Configuration properties in JSON. |  [optional] |
|**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) | Type of policy. |  [optional] |
|**policyPrincipals** | **List&lt;String&gt;** | Unique ID or name of the User and User Groups. |  [optional] |
|**policyProcesses** | [**List&lt;PolicyProcessesEnum&gt;**](#List&lt;PolicyProcessesEnum&gt;) | Action that the query performed on the data warehouse, such as SAGE_INDEXING and ROW_COUNT_STATS. |  [optional] |
|**disable** | **Boolean** | Indicates whether the configuration enable/disable. |  [optional] |



## Enum: AuthenticationTypeEnum

| Name | Value |
|---- | -----|
| SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot; |
| OAUTH | &quot;OAUTH&quot; |
| OAUTH_WITH_SERVICE_PRINCIPAL | &quot;OAUTH_WITH_SERVICE_PRINCIPAL&quot; |
| EXTOAUTH | &quot;EXTOAUTH&quot; |
| KEY_PAIR | &quot;KEY_PAIR&quot; |
| EXTOAUTH_WITH_PKCE | &quot;EXTOAUTH_WITH_PKCE&quot; |
| OAUTH_WITH_PKCE | &quot;OAUTH_WITH_PKCE&quot; |
| PERSONAL_ACCESS_TOKEN | &quot;PERSONAL_ACCESS_TOKEN&quot; |
| OAUTH_CLIENT_CREDENTIALS | &quot;OAUTH_CLIENT_CREDENTIALS&quot; |



## Enum: PolicyTypeEnum

| Name | Value |
|---- | -----|
| NO_POLICY | &quot;NO_POLICY&quot; |
| PRINCIPALS | &quot;PRINCIPALS&quot; |
| PROCESSES | &quot;PROCESSES&quot; |



## Enum: List&lt;PolicyProcessesEnum&gt;

| Name | Value |
|---- | -----|
| SAGE_INDEXING | &quot;SAGE_INDEXING&quot; |
| ROW_COUNT_STATS | &quot;ROW_COUNT_STATS&quot; |


## Implemented Interfaces

* Serializable


