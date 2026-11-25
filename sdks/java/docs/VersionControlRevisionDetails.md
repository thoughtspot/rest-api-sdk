

# VersionControlRevisionDetails

The revision the target branch points at after a promotion. Absent on a dry run, since nothing was written.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**revision** | **String** | Identifier of the revision. For a Git-backed repository this is the commit SHA. |  |
|**message** | **String** | Commit message used. |  [optional] |
|**committedTimeInMillis** | **Float** | Commit time, in milliseconds since the Unix epoch. |  |
|**author** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  |  |


## Implemented Interfaces

* Serializable


