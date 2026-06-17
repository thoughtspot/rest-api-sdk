# ThoughtSpot.Client.Model.CreateUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the user. The username string must be unique. | 
**DisplayName** | **string** | A unique display name string for the user account, usually their first and last name | 
**Password** | **string** | Password for the user account. For IAMv2 users, you must set this password if you do not want to trigger an activation email. | [optional] 
**Email** | **string** | Email of the user account | 
**AccountType** | **string** | Type of the account. | [optional] [default to AccountTypeEnum.LOCALUSER]
**AccountStatus** | **string** | Current status of the user account. The &#x60;SUSPENDED&#x60; user state indicates a transitional state applicable to IAMv2 users only. | [optional] [default to AccountStatusEnum.ACTIVE]
**OrgIdentifiers** | **List&lt;string&gt;** | List of Org IDs to which the user belongs. | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | GUIDs or names of the groups to which the newly created user belongs. | [optional] 
**Visibility** | **string** | Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object. | [optional] [default to VisibilityEnum.SHARABLE]
**NotifyOnShare** | **bool?** | User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet. | [optional] [default to true]
**ShowOnboardingExperience** | **bool?** | The user preference for revisiting the onboarding experience. | [optional] [default to true]
**OnboardingExperienceCompleted** | **bool?** | flag to get the on-boarding experience is completed or not. | [optional] [default to false]
**HomeLiveboardIdentifier** | **string** | GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in. | [optional] 
**FavoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects to add to the user&#39;s favorites list. | [optional] 
**PreferredLocale** | **string** | Locale for the user. When setting this value, do not set use_browser_language to true, otherwise the browser&#39;s language setting will take precedence and the preferred_locale value will be ignored. | [optional] 
**UseBrowserLanguage** | **bool?** | Flag to indicate whether to use the browser locale for the user in the UI. When set to true, the preferred_locale value is unset and the browser&#39;s language setting takes precedence.    Version: 26.3.0.cl or later  | [optional] 
**ExtendedProperties** | **Object** | Properties for the user | [optional] 
**ExtendedPreferences** | **Object** | Preferences for the user | [optional] 
**TriggerWelcomeEmail** | **bool?** | Flag to indicate whether welcome email should be sent to user. This parameter is applied only on clusters on which IAM is disabled. | [optional] 
**TriggerActivationEmail** | **bool?** | Flag to indicate whether activation email should be sent to the user. Default value for IAMv2 users is set to true. Users must either set this to false, or enter a valid  password if they do not want to trigger an activation email. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

