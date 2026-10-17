

# VersionControlCommitResponse

Admission receipt for a versioning run. It confirms the request was accepted and identifies the run; it says nothing about what was committed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **String** | ID of this run, and the trace key across the API, the worker, the Git commit and the logs. Pass it to run search to read per-object outcomes. |  |
|**acceptedTimeInMillis** | **Float** | Admission time, in milliseconds since the Unix epoch. |  |
|**author** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  |  |


## Implemented Interfaces

* Serializable


