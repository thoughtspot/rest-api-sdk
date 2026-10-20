# ThoughtSpot.RestApi.Sdk.Model.UsageSummary
A user's combined Spotter usage position across every pool they draw from. Totals are sums over the pools: a user in two groups with limits of 100 and 50 has a total limit of 150.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pools** | [**List&lt;UsageData&gt;**](UsageData.md) | The individual pools the user draws from. | 
**TotalUsage** | **Object** | Questions consumed across all of the user&#39;s pools. | [optional] 
**TotalWarningLimit** | **Object** | Sum of the warning limits of the user&#39;s pools. | [optional] 
**TotalLimit** | **Object** | Sum of the limits of the user&#39;s pools. | [optional] 
**TotalRemaining** | **Object** | Questions the user can still ask before reaching the limit. Absent when &#x60;has_unlimited_pool&#x60; is &#x60;true&#x60;. | [optional] 
**IsAtWarning** | **bool** | &#x60;true&#x60; when usage has reached the combined warning limit. | 
**IsAtLimit** | **bool** | &#x60;true&#x60; when usage has reached the combined limit and further Spotter questions are blocked. | 
**HasUnlimitedPool** | **bool** | &#x60;true&#x60; when at least one of the user&#39;s pools has no limit, which makes the user unlimited. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

