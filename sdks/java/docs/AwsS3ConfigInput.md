

# AwsS3ConfigInput

Input type for AWS S3 storage configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucketName** | **String** | Name of the S3 bucket where webhook payloads will be stored. Example: \&quot;my-webhook-files\&quot; |  |
|**region** | **String** | AWS region where the S3 bucket is located. Example: \&quot;us-west-2\&quot; |  |
|**roleArn** | **String** | ARN of the IAM role to assume for S3 access. Example: \&quot;arn:aws:iam::123456789012:role/ThoughtSpotDeliveryRole\&quot; |  |
|**externalId** | **String** | External ID for secure cross-account role assumption. Example: \&quot;ts-webhook-a1b2c3d4-7890\&quot; |  [optional] |
|**pathPrefix** | **String** | Optional path prefix for organizing objects within the bucket. Example: \&quot;thoughtspot-webhooks/\&quot; |  [optional] |


## Implemented Interfaces

* Serializable


