# ThoughtSpot.Client.Model.ChannelValidationDetail
Validation detail result for a sub-step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ValidationStep** | **string** | The validation step that was performed. | 
**Status** | **string** | Status of this validation step. | 
**HttpStatus** | **int?** | HTTP status code returned by the channel (if applicable). | [optional] 
**ErrorMessage** | **string** | Error message from the channel or validation process. | [optional] 
**AwsS3Info** | [**ChannelValidationAwsS3Info**](ChannelValidationAwsS3Info.md) |  | [optional] 
**GcpGcsInfo** | [**ChannelValidationGcpGcsInfo**](ChannelValidationGcpGcsInfo.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

