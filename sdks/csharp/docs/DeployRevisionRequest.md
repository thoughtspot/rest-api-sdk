# ThoughtSpot.RestApi.Sdk.Model.DeployRevisionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TargetRevision** | **string** | Revision to deploy, for example a Git commit SHA. Omit this to resolve and pin the head of your Org&#39;s configured branch. Either way the revision must be reachable from that branch. | [optional] 
**DeployType** | **string** | What to compare the revision against. DELTA compares it with the revision this Org last received, which is what makes the Org converge on the branch. FULL ignores the deploy marker, treats every object at the revision as a change, and observes no removals. | [optional] [default to DeployTypeEnum.DELTA]
**DeployPolicy** | **string** | How far the run goes and how it settles per-object failures. | [optional] [default to DeployPolicyEnum.ALLORNONE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

