# ThoughtSpot.RestApi.Sdk.Model.SearchConnectionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Connections** | [**List&lt;ConnectionInput&gt;**](ConnectionInput.md) | List of connections and name pattern | [optional] 
**DataWarehouseTypes** | **List&lt;SearchConnectionRequest.DataWarehouseTypesEnum&gt;** | Array of types of data warehouse defined for the connection. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included. | [optional] [default to 10]
**TagIdentifiers** | **List&lt;string&gt;** | Unique ID or name of tags. | [optional] 
**DataWarehouseObjectType** | **string** | Data warehouse object type. | [optional] 
**SortOptions** | [**SortOptionInput**](SortOptionInput.md) | Sort options. | [optional] 
**IncludeDetails** | **bool?** | Indicates whether to include complete details of the connection objects. | [optional] 
**VarConfiguration** | **Object** | Configuration values. If empty we are fetching configuration from datasource based on given connection id. If required you can provide config details to fetch specific details. Example input: {}, {\&quot;warehouse\&quot;:\&quot;SMALL_WH\&quot;,\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}. This is only applicable when data_warehouse_object_type is selected. | [optional] 
**AuthenticationType** | **string** | List of authentication types to fetch data_ware_house_objects from external Data warehouse. This is only applicable when data_warehouse_object_type is selected. | [optional] [default to AuthenticationTypeEnum.SERVICEACCOUNT]
**ShowResolvedParameters** | **bool?** | &lt;div&gt;Version: 10.9.0.cl or later &lt;/div&gt;  Indicates whether to show resolved parameterised values. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

