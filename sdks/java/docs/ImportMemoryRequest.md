

# ImportMemoryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | The full serialized memory payload to import (YAML) — typically a previous &#x60;exportMemory&#x60; response&#39;s &#x60;content&#x60;, edited locally and re-submitted. |  |
|**dryRun** | **Boolean** | Required. When &#x60;true&#x60;, validate the payload and return preview counts and row failures without writing anything. Pass &#x60;false&#x60; to apply the import. The caller must choose explicitly so a real import is never triggered by omission. |  |


## Implemented Interfaces

* Serializable


