

# S3StorageSetupConfig

S3 storage setup configuration containing ThoughtSpot-managed fields required for cross-account storage access setup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thoughtspotAwsAccountId** | **String** | ThoughtSpot&#39;s AWS account ID to use in the trust policy. Populated for AWS clusters. |  [optional] |
|**thoughtspotGcpServiceAccountId** | **String** | ThoughtSpot&#39;s GCP service account ID for workload identity federation. Populated for GCP clusters. |  [optional] |
|**oidcProvider** | **String** | OIDC provider URL for GCP workload identity federation. Populated for GCP clusters. |  [optional] |
|**trustPolicyTemplate** | **Object** | IAM trust policy template to attach to the cross-account role. |  |
|**setupInstructions** | **List&lt;String&gt;** | Step-by-step instructions for configuring storage access. |  |


## Implemented Interfaces

* Serializable


