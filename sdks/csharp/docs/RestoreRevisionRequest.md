# ThoughtSpot.RestApi.Sdk.Model.RestoreRevisionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TargetRevision** | **string** | Revision whose content the branch and the Org are restored to, for example a Git commit SHA. It must be reachable from your Org&#39;s configured branch, and must not be its head, since restoring the head changes nothing. | 
**RestorePolicy** | **string** | How far the run goes and how it settles per-object failures. Same values and meaning as deploy_policy on the deploy endpoint; under VALIDATE_ONLY nothing is committed either. | [optional] [default to RestorePolicyEnum.ALLORNONE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

