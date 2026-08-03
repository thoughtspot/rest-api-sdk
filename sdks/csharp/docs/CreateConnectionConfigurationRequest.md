# ThoughtSpot.RestApi.Sdk.Model.CreateConnectionConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Unique name for the configuration. | 
**Description** | **string** | Description of the configuration. | [optional] 
**ConnectionIdentifier** | **string** | Unique ID or name of the connection. | 
**SameAsParent** | **bool?** | Specifies whether the connection configuration should inherit all properties and authentication type from its parent connection. This attribute is only applicable to parameterized connections. When set to true, the configuration uses only the connection properties and authentication type inherited from the parent.    Version: 26.2.0.cl or later  | [optional] [default to false]
**PolicyProcessOptions** | [**PolicyProcessOptionsInput**](PolicyProcessOptionsInput.md) | This attribute is only applicable to parameterized connections. Ensure that the policy is set to Processes to allow the configuration to be used exclusively for system processes.    Version: 26.2.0.cl or later  | [optional] 
**AuthenticationType** | **string** | Type of authentication used for the connection. | [optional] [default to AuthenticationTypeEnum.SERVICEACCOUNT]
**VarConfiguration** | **Object** | Configuration properties in JSON. | 
**PolicyType** | **string** | Type of policy. | [optional] [default to PolicyTypeEnum.NOPOLICY]
**PolicyPrincipals** | **List&lt;string&gt;** | Unique ID or name of the User and User Groups. | [optional] 
**PolicyProcesses** | **List&lt;CreateConnectionConfigurationRequest.PolicyProcessesEnum&gt;** | Action that the query performed on the data warehouse, such as SAGE_INDEXING and ROW_COUNT_STATS. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

