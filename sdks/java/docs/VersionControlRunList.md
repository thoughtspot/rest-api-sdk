

# VersionControlRunList

A page of runs in your Org, newest first.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runs** | [**List&lt;VersionControlRunStatus&gt;**](VersionControlRunStatus.md) | Current outcome of each matching run, newest first. |  |
|**lastBatch** | **Boolean** | True when no runs follow this page, so a caller that receives a full page knows whether to ask for the next one. |  [optional] |


## Implemented Interfaces

* Serializable


