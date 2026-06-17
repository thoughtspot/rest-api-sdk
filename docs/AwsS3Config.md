# ThoughtSpot.Client.Model.AwsS3Config
AWS S3 storage configuration details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BucketName** | **string** | Name of the S3 bucket where webhook payloads are stored. | 
**Region** | **string** | AWS region where the S3 bucket is located. | 
**RoleArn** | **string** | ARN of the IAM role used for S3 access. | 
**ExternalId** | **string** | External ID for secure cross-account role assumption. | [optional] 
**PathPrefix** | **string** | Path prefix for organizing objects within the bucket. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

