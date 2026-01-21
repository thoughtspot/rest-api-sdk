

# AwsS3Config

AWS S3 storage configuration details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucketName** | **String** | Name of the S3 bucket where webhook payloads are stored. |  |
|**region** | **String** | AWS region where the S3 bucket is located. |  |
|**roleArn** | **String** | ARN of the IAM role used for S3 access. |  |
|**externalId** | **String** | External ID for secure cross-account role assumption. |  [optional] |
|**pathPrefix** | **String** | Path prefix for organizing objects within the bucket. |  [optional] |


## Implemented Interfaces

* Serializable


