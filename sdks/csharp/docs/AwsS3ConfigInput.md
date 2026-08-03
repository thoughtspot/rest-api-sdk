# ThoughtSpot.RestApi.Sdk.Model.AwsS3ConfigInput
Input type for AWS S3 storage configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BucketName** | **string** | Name of the S3 bucket where webhook payloads will be stored. Example: \&quot;my-webhook-files\&quot; | 
**Region** | **string** | AWS region where the S3 bucket is located. Example: \&quot;us-west-2\&quot; | 
**RoleArn** | **string** | ARN of the IAM role to assume for S3 access. Example: \&quot;arn:aws:iam::123456789012:role/WebhookDeliveryRole\&quot; | 
**ExternalId** | **string** | External ID for secure cross-account role assumption. Example: \&quot;ts-webhook-a1b2c3d4-7890\&quot; | [optional] 
**PathPrefix** | **string** | Optional path prefix for organizing objects within the bucket. Example: \&quot;webhook-deliveries/\&quot; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

