# ThoughtSpot.Client.Model.WebhookStorageSetupConfig
Storage setup configuration for a specific upload path. The populated fields depend on config_type: AWS_TO_S3_STORAGE: aws_account_id, trust_policy_template, setup_instructions. GCP_TO_S3_STORAGE: gcp_service_account_id, oidc_provider, trust_policy_template, setup_instructions. GCP_TO_GCS_STORAGE: service_account_email, required_role, setup_instructions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConfigType** | **string** | Discriminator identifying the upload path. One of: AWS_TO_S3_STORAGE, GCP_TO_S3_STORAGE, GCP_TO_GCS_STORAGE. | 
**AwsAccountId** | **string** | AWS Account ID of the platform. Populated for AWS_TO_S3_STORAGE. Include in your IAM role trust policy. | [optional] 
**GcpServiceAccountId** | **string** | GCP service account numeric ID of the platform (the &#39;sub&#39; claim in OIDC tokens). Populated for GCP_TO_S3_STORAGE. | [optional] 
**OidcProvider** | **string** | OIDC identity provider URL. Populated for GCP_TO_S3_STORAGE; always &#39;accounts.google.com&#39; for GCP. | [optional] 
**TrustPolicyTemplate** | **Object** | Sample IAM trust policy JSON. Populated for AWS_TO_S3_STORAGE and GCP_TO_S3_STORAGE. | [optional] 
**ServiceAccountEmail** | **string** | GCP service account email of the platform. Populated for GCP_TO_GCS_STORAGE. Grant it roles/iam.serviceAccountTokenCreator on your service account. | [optional] 
**RequiredRole** | **string** | IAM role the customer must grant to the platform service account. Populated for GCP_TO_GCS_STORAGE. | [optional] 
**SetupInstructions** | **List&lt;string&gt;** | Step-by-step instructions to configure the storage destination. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

