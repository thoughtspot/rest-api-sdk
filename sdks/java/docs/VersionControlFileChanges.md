

# VersionControlFileChanges

Files a promotion changed, or would change on a dry run, one list per kind of change. Every list is present and empty when that kind has none, so total_count is the sum of their lengths.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Integer** | Total files changed, across all kinds of change. |  |
|**added** | **List&lt;String&gt;** | Repository paths of files added. |  |
|**modified** | **List&lt;String&gt;** | Repository paths of files modified. |  |
|**deleted** | **List&lt;String&gt;** | Repository paths of files deleted. |  |
|**conflicts** | **List&lt;String&gt;** | Repository paths of files that conflicted and were resolved in favor of the side named by conflict_policy. Empty under FAIL_REQUEST, which fails the request rather than returning a body whenever anything conflicts. |  |


## Implemented Interfaces

* Serializable


