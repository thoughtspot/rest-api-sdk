

# AgentEventPart

One piece of text from Spotter, with a flag marking reasoning apart from the answer itself.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The text to render. Text arrives incrementally, so concatenate parts in the order received.    Version: 26.12.0.cl or later  |  |
|**thought** | **Boolean** | &#x60;true&#x60; when this text is Spotter&#39;s reasoning rather than its answer. Use it to render reasoning separately, or to hide it. Absent otherwise; treat absence as &#x60;false&#x60;.    Version: 26.12.0.cl or later  |  [optional] |


## Implemented Interfaces

* Serializable


