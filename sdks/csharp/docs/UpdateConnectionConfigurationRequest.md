# ThoughtSpot.RestApi.Sdk.Model.UpdateConnectionConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConnectionIdentifier** | **string** | Unique ID or name of the connection. | 
**Name** | **string** | Name of the configuration to update. | [optional] 
**Description** | **string** | Description of the configuration. | [optional] 
**SameAsParent** | **bool?** | Specifies whether the connection configuration should inherit all properties and authentication type from its parent connection. This attribute is only applicable to parameterized connections. When set to true, the configuration uses only the connection properties and authentication type inherited from the parent.    Version: 26.2.0.cl or later  | [optional] [default to false]
**PolicyProcessOptions** | [**PolicyProcessOptionsInput**](PolicyProcessOptionsInput.md) | This attribute is only applicable to parameterized connections. Ensure that the policy is set to Processes to allow the configuration to be used exclusively for system processes.    Version: 26.2.0.cl or later  | [optional] 
**AuthenticationType** | **string** | Type of authentication. | [optional] 
**VarConfiguration** | **Object** | Configuration properties in JSON. | [optional] 
**PolicyType** | **string** | Type of policy. | [optional] 
**PolicyPrincipals** | **List&lt;string&gt;** | Unique ID or name of the User and User Groups. | [optional] 
**PolicyProcesses** | **List&lt;UpdateConnectionConfigurationRequest.PolicyProcessesEnum&gt;** | Action that the query performed on the data warehouse, such as SAGE_INDEXING and ROW_COUNT_STATS. | [optional] 
**Disable** | **bool?** | Indicates whether the configuration enable/disable. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

