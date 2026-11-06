# ThoughtSpot.RestApi.Sdk.Model.VersionControlCommitObjectInput
One object to version on the commit endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | **string** | GUID, object ID, or name of the metadata object, such as a Liveboard or an Answer. It is resolved in your Org and sent to version control by its cross-Org object ID, so object IDs must be enabled on the cluster. | 
**Type** | **string** | Type of the metadata object. Required when the identifier is a name, since a name can belong to more than one type. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

