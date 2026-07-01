

# GcpGcsConfigInput

Input type for GCP GCS storage configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucketName** | **String** | Name of the GCS bucket where webhook payloads will be stored. Example: \&quot;my-webhook-files\&quot; |  |
|**serviceAccountEmail** | **String** | Email of the GCP service account to impersonate for bucket access. The platform&#39;s service account must be granted roles/iam.serviceAccountTokenCreator on this SA. Example: \&quot;my-sa@my-project.iam.gserviceaccount.com\&quot; |  |
|**pathPrefix** | **String** | Optional path prefix for organizing objects within the bucket. Example: \&quot;webhooks/\&quot; |  [optional] |


## Implemented Interfaces

* Serializable


