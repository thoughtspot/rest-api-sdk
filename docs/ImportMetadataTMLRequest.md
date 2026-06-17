# ThoughtSpot.Client.Model.ImportMetadataTMLRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MetadataTmls** | **List&lt;string&gt;** | Details of TML objects.  **Note: importing TML in YAML format, when coming directly from our Playground, is currently requires manual formatting. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)** | 
**ImportPolicy** | **string** | Specifies the import policy for the TML import. | [optional] [default to ImportPolicyEnum.PARTIAL]
**CreateNew** | **bool?** | If selected, creates TML objects with new GUIDs. | [optional] [default to false]
**AllOrgsOverride** | **bool?** | If import is happening from all orgs context. | [optional] [default to false]
**SkipDiffCheck** | **bool?** | &lt;div&gt;Version: 10.6.0.cl or later &lt;/div&gt;  Boolean Flag to skip TML diff check before processing object TMLs. | [optional] [default to false]
**EnableLargeMetadataValidation** | **bool?** | &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt;  Boolean to indicate if the large metadata validation should be enabled. | [optional] [default to false]
**EnablePersonalizedViewUpsert** | **bool?** | &lt;div&gt;Version: 26.8.0.cl or later &lt;/div&gt;  Boolean flag to enable update/insert of personalized views in liveboard. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

