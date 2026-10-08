

# VersionControlDeployResponse

Admission receipt for a deploy run. It identifies the run and the revisions it was admitted against; it says nothing about what was imported.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **String** | ID of this run, and the trace key across the API, the worker and the logs. Pass it to run search to read per-object outcomes. |  |
|**targetDeploymentRevision** | **String** | Revision this run was admitted against, pinned at admission. Resolved from the head of the configured branch when target_revision was omitted. |  |
|**lastDeployedRevision** | **String** | Revision the Org last received, which this run compared against. Absent when there was none: the Org&#39;s first deploy, or deploy_type FULL. |  [optional] |
|**acceptedTimeInMillis** | **Float** | Admission time, in milliseconds since the Unix epoch. |  |


## Implemented Interfaces

* Serializable


