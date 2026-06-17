# ThoughtSpot.Client.Model.UpdateUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the user. The username string must be unique. | [optional] 
**DisplayName** | **string** | A unique display name string for the user account, usually their first and last name | [optional] 
**Visibility** | **string** | Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object. | [optional] 
**Email** | **string** | Email of the user account | [optional] 
**AccountStatus** | **string** | Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a transitional state applicable to IAMv2 users only. | [optional] 
**NotifyOnShare** | **bool?** | User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet. | [optional] 
**ShowOnboardingExperience** | **bool?** | The user preference for revisiting the onboarding experience. | [optional] 
**OnboardingExperienceCompleted** | **bool?** | Indicates if the user has completed the onboarding and allows turning off the onboarding walkthrough. | [optional] 
**AccountType** | **string** | Type of the account. | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | GUIDs or names of the groups. | [optional] 
**HomeLiveboardIdentifier** | **string** | GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in. | [optional] 
**FavoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects to add to the user&#39;s favorites list. | [optional] 
**OrgIdentifiers** | **List&lt;string&gt;** | IDs of the Orgs. | [optional] 
**Operation** | **string** | Type of update operation. Default operation type is REPLACE | [optional] [default to OperationEnum.REPLACE]
**PreferredLocale** | **string** | Locale for the user. When setting this value, do not set use_browser_language to true, otherwise the browser&#39;s language setting will take precedence and the preferred_locale value will be ignored. | [optional] 
**UseBrowserLanguage** | **bool?** | Flag to indicate whether to use the browser locale for the user in the UI. When set to true, the preferred_locale value is unset and the browser&#39;s language setting takes precedence.    Version: 26.3.0.cl or later  | [optional] 
**ExtendedProperties** | **Object** | Properties for the user | [optional] 
**ExtendedPreferences** | **Object** | Preferences for the user | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

