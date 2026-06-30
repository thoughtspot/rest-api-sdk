

# WebhookStorageSetupConfig

Storage setup configuration for a specific upload path. The populated fields depend on config_type: AWS_TO_S3_STORAGE: aws_account_id, trust_policy_template, setup_instructions. GCP_TO_S3_STORAGE: gcp_service_account_id, oidc_provider, trust_policy_template, setup_instructions. GCP_TO_GCS_STORAGE: service_account_email, required_role, setup_instructions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configType** | [**ConfigTypeEnum**](#ConfigTypeEnum) | Discriminator identifying the upload path. One of: AWS_TO_S3_STORAGE, GCP_TO_S3_STORAGE, GCP_TO_GCS_STORAGE. |  |
|**awsAccountId** | **String** | AWS Account ID of the platform. Populated for AWS_TO_S3_STORAGE. Include in your IAM role trust policy. |  [optional] |
|**gcpServiceAccountId** | **String** | GCP service account numeric ID of the platform (the &#39;sub&#39; claim in OIDC tokens). Populated for GCP_TO_S3_STORAGE. |  [optional] |
|**oidcProvider** | **String** | OIDC identity provider URL. Populated for GCP_TO_S3_STORAGE; always &#39;accounts.google.com&#39; for GCP. |  [optional] |
|**trustPolicyTemplate** | **Object** | Sample IAM trust policy JSON. Populated for AWS_TO_S3_STORAGE and GCP_TO_S3_STORAGE. |  [optional] |
|**serviceAccountEmail** | **String** | GCP service account email of the platform. Populated for GCP_TO_GCS_STORAGE. Grant it roles/iam.serviceAccountTokenCreator on your service account. |  [optional] |
|**requiredRole** | **String** | IAM role the customer must grant to the platform service account. Populated for GCP_TO_GCS_STORAGE. |  [optional] |
|**setupInstructions** | **List&lt;String&gt;** | Step-by-step instructions to configure the storage destination. |  |



## Enum: ConfigTypeEnum

| Name | Value |
|---- | -----|
| AWS_TO_S3_STORAGE | &quot;AWS_TO_S3_STORAGE&quot; |
| GCP_TO_S3_STORAGE | &quot;GCP_TO_S3_STORAGE&quot; |
| GCP_TO_GCS_STORAGE | &quot;GCP_TO_GCS_STORAGE&quot; |


## Implemented Interfaces

* Serializable


