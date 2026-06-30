

# EurekaMemorySources

A single typed scope group identifying objects whose memory entries should be exported. One group binds a single `type` to a set of `identifiers`; pass a list of groups to `exportMemory` to scope the export to multiple objects in one call. Each group maps to one filter group on the eureka request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Source object type for this group. Must be &#x60;DATA_MODEL&#x60;. |  |
|**identifiers** | **List&lt;String&gt;** | Data-models to export memory for. Each entry may be a GUID or a human-readable obj_id; the eureka-agent resolves obj_ids before forwarding. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATA_MODEL | &quot;DATA_MODEL&quot; |


## Implemented Interfaces

* Serializable


