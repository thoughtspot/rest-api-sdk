

# UsageSummary

A user's combined Spotter usage position across every pool they draw from. Totals are sums over the pools: a user in two groups with limits of 100 and 50 has a total limit of 150.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pools** | [**List&lt;UsageData&gt;**](UsageData.md) | The individual pools the user draws from. |  |
|**totalUsage** | **Object** | Questions consumed across all of the user&#39;s pools. |  [optional] |
|**totalWarningLimit** | **Object** | Sum of the warning limits of the user&#39;s pools. |  [optional] |
|**totalLimit** | **Object** | Sum of the limits of the user&#39;s pools. |  [optional] |
|**totalRemaining** | **Object** | Questions the user can still ask before reaching the limit. Absent when &#x60;has_unlimited_pool&#x60; is &#x60;true&#x60;. |  [optional] |
|**isAtWarning** | **Boolean** | &#x60;true&#x60; when usage has reached the combined warning limit. |  |
|**isAtLimit** | **Boolean** | &#x60;true&#x60; when usage has reached the combined limit and further Spotter questions are blocked. |  |
|**hasUnlimitedPool** | **Boolean** | &#x60;true&#x60; when at least one of the user&#39;s pools has no limit, which makes the user unlimited. |  |


## Implemented Interfaces

* Serializable


