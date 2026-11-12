# ThoughtSpot.RestApi.Sdk.Model.StopConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SpotterExperienceVersion** | **string** | Version of the Spotter experience the conversation runs on. A conversation stays on the version that created it, so pass the value used when it was created. - &#x60;V1&#x60; (default): the Spotter conversation API available before   26.12.0.cl. Used when the parameter is omitted. - &#x60;V2&#x60;: the new Spotter experience, the same one behind the Liveboard side   panel (New); new Spotter capabilities ship here. Requires a cluster admin   to set Spotter 3 Liveboard experience to Liveboard side panel (New);   otherwise the request returns a 400.    Version: 26.12.0.cl or later  | [optional] [default to SpotterExperienceVersionEnum.V1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

