# ThoughtSpot.RestApi.Sdk.Model.ImportDiagnostic
A group of importMemory diagnostic messages that share a severity / disposition. This is the single, uniform channel for fatal errors, rollbacks, and non-fatal observations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SubStatus** | **string** | Severity / disposition category these messages share (e.g. &#x60;WARNING&#x60;, &#x60;FAILURE&#x60;, &#x60;ROLLED_BACK&#x60;). | [optional] 
**Messages** | **List&lt;string&gt;** | Human-readable messages for this category (e.g. the details of a &#x60;WARNING&#x60;, or the failure cause for a &#x60;FAILURE&#x60;). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

