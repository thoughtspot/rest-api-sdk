# ThoughtSpot.RestApi.Sdk.Model.VersionControlCommitObjectInput
One object to version on the commit endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Identifier** | **string** | Object ID of the metadata object, such as a Liveboard or an Answer. This is the cross-Org object ID, not the Org-local GUID and not the object name, and it requires object IDs to be enabled on the cluster. | 
**Type** | **string** | Type of the metadata object. Required when the identifier is a name, since a name can belong to more than one type. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

