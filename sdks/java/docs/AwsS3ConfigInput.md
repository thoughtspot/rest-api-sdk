

# AwsS3ConfigInput

Input type for AWS S3 storage configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucketName** | **String** | Name of the S3 bucket where webhook payloads will be stored. |  |
|**region** | **String** | AWS region where the S3 bucket is located. |  |
|**roleArn** | **String** | ARN of the IAM role to assume for S3 access. |  |
|**externalId** | **String** | External ID for secure cross-account role assumption. |  |
|**pathPrefix** | **String** | Optional path prefix for organizing objects within the bucket. |  [optional] |


## Implemented Interfaces

* Serializable


