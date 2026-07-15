# ThoughtSpot.RestApi.Sdk.Model.CreateConnectionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Unique name for the connection. | 
**Description** | **string** | Description of the connection. | [optional] 
**DataWarehouseType** | **string** | Type of the data warehouse. | 
**DataWarehouseConfig** | **Object** | Connection configuration attributes in JSON format. To create a connection with tables, include table attributes. See the documentation above for sample JSON. | 
**Validate** | **bool?** | Validates the connection metadata if tables are included. If you are creating a connection without tables, specify &#x60;false&#x60;. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

