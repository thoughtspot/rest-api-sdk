# ThoughtSpot.RestApi.Sdk.Model.ImportMetadataTMLAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataTmls** | **List&lt;string&gt;** | Details of TML objects. | 
**CreateNew** | **bool?** | If selected, creates TML objects with new GUIDs. | [optional] [default to false]
**AllOrgsOverride** | **bool?** | If import is happening from all orgs context. | [optional] [default to false]
**ImportPolicy** | **string** | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Policy to be followed while importing the TML. Valid values are [PARTIAL_OBJECT, PARTIAL, VALIDATE_ONLY, ALL_OR_NONE] | [optional] [default to ImportPolicyEnum.PARTIALOBJECT]
**SkipDiffCheck** | **bool?** | &lt;div&gt;Version: 10.6.0.cl or later &lt;/div&gt;  Boolean Flag to skip TML diff check before processing object TMLs. | [optional] [default to false]
**EnableLargeMetadataValidation** | **bool?** | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Boolean to indicate if the large metadata validation should be enabled. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

