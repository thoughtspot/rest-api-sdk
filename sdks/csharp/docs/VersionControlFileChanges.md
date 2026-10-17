# ThoughtSpot.RestApi.Sdk.Model.VersionControlFileChanges
Files a promotion changed, or would change on a dry run, one list per kind of change. Every list is present and empty when that kind has none, so total_count is the sum of their lengths.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalCount** | **int** | Total files changed, across all kinds of change. | 
**Added** | **List&lt;string&gt;** | Repository paths of files added. | 
**Modified** | **List&lt;string&gt;** | Repository paths of files modified. | 
**Deleted** | **List&lt;string&gt;** | Repository paths of files deleted. | 
**Conflicts** | **List&lt;string&gt;** | Repository paths of files that conflicted and were resolved in favor of the side named by conflict_policy. Empty under FAIL_REQUEST, which fails the request rather than returning a body whenever anything conflicts. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

