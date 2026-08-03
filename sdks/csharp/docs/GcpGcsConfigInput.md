# ThoughtSpot.RestApi.Sdk.Model.GcpGcsConfigInput
Input type for GCP GCS storage configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BucketName** | **string** | Name of the GCS bucket where webhook payloads will be stored. Example: \&quot;my-webhook-files\&quot; | 
**ServiceAccountEmail** | **string** | Email of the GCP service account to impersonate for bucket access. The platform&#39;s service account must be granted roles/iam.serviceAccountTokenCreator on this SA. Example: \&quot;my-sa@my-project.iam.gserviceaccount.com\&quot; | 
**PathPrefix** | **string** | Optional path prefix for organizing objects within the bucket. Example: \&quot;webhooks/\&quot; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

