# ThoughtSpot.Client.Model.ImportUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserIdentifier** | **string** | Unique ID or name of the user. | 
**DisplayName** | **string** | Display name of the user. | 
**Password** | **string** | Password of the user. | [optional] 
**AccountType** | **string** | Type of the user account. | [optional] 
**AccountStatus** | **string** | Status of the user account. | [optional] 
**Email** | **string** | Email address of the user. | [optional] 
**OrgIdentifiers** | **List&lt;string&gt;** | ID or name of the Orgs to which the user belongs. | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | ID or name of the groups to which the user belongs. | [optional] 
**Visibility** | **string** | Visibility of the users. The SHARABLE property makes a user visible to other users and group, who can share objects with the user. | [optional] 
**NotifyOnShare** | **bool?** | Notify user when other users or groups share metadata objects | [optional] [default to true]
**ShowOnboardingExperience** | **bool?** | Show or hide the new user onboarding walkthroughs | [optional] 
**OnboardingExperienceCompleted** | **bool?** | Revisit the new user onboarding walkthroughs | [optional] 
**HomeLiveboardIdentifier** | **string** | Unique ID or name of the default Liveboard assigned to the user. | [optional] 
**FavoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects to add to the user&#39;s favorites list. | [optional] 
**PreferredLocale** | **string** | Locale for the user. When setting this value, do not set use_browser_language to true, otherwise the browser&#39;s language setting will take precedence and the preferred_locale value will be ignored. | [optional] 
**UseBrowserLanguage** | **bool?** | Flag to indicate whether to use the browser locale for the user in the UI. When set to true, the preferred_locale value is unset and the browser&#39;s language setting takes precedence.    Version: 26.3.0.cl or later  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

