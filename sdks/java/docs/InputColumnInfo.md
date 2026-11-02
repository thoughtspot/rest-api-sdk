

# InputColumnInfo

A single input table column, with its display name and unique ID. Returned by both createInputTable (all columns of the new table) and createInputTableColumn (the columns just added).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Display name of the column. |  |
|**id** | **String** | Unique ID of the column. |  |
|**mappedColumnId** | **String** | Unique ID of the model column this input column maps to (its join-key source in the linked model). Empty for brand-new columns that do not map to any model column. |  [optional] |


## Implemented Interfaces

* Serializable


