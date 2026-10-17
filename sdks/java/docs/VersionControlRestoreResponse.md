

# VersionControlRestoreResponse

Admission receipt for a restore run. The revision was resolved and the run has started; it says nothing about what was restored. The restore commit is not here because it does not exist until the run pushes it: read it from run search as the run's revision, along with the per-object outcomes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **String** | ID of this run, and the trace key across the API, the worker, the Git commit and the logs. |  |
|**targetRevision** | **String** | Revision whose content is restored, in full form. Pinned at admission. |  |
|**acceptedTimeInMillis** | **Float** | Admission time, in milliseconds since the Unix epoch. |  |


## Implemented Interfaces

* Serializable


