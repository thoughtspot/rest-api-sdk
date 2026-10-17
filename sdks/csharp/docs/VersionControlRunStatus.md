# ThoughtSpot.RestApi.Sdk.Model.VersionControlRunStatus
Current outcome of one run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | ID of the run, as returned when it was admitted. | 
**Type** | **string** | Which operation admitted the run. | 
**State** | **string** | Where the run stands. | 
**Message** | **string** | What happened, in prose. Always present when state is FAILED. | [optional] 
**AcceptedTimeInMillis** | **float** | Admission time, in milliseconds since the Unix epoch. | 
**EndTimeInMillis** | **float?** | Time the run reached a terminal state, in milliseconds since the Unix epoch. Absent while state is RUNNING. | [optional] 
**Author** | [**VersionControlPrincipal**](VersionControlPrincipal.md) |  | 
**Branch** | **string** | Branch the run used, which is the Org&#39;s configured branch at admission. A later edit to the Org&#39;s configuration does not change it. | 
**Revision** | **string** | On a commit, the commit this run produced. On a deploy, the revision being deployed. On a restore, the restore commit. Absent until the commit is pushed, and on a run that failed before pushing. | [optional] 
**Objects** | [**List&lt;VersionControlObjectResult&gt;**](VersionControlObjectResult.md) | Per-object outcomes known so far. This grows while state is RUNNING, and is complete once the run is terminal. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

