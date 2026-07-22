# ThoughtSpot.RestApi.Sdk.Model.User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier of the user. | 
**Name** | **string** | Name of the user. | 
**DisplayName** | **string** | Display name of the user. | 
**Visibility** | **string** | Visibility of the users. The &#x60;SHARABLE&#x60; property makes a user visible to other users and group, who can share objects with the user. | 
**AuthorId** | **string** | Unique identifier of author of the user. | [optional] 
**CanChangePassword** | **bool?** | Defines whether the user can change their password. | [optional] 
**CompleteDetail** | **bool?** | Defines whether the response has complete detail of the user. | [optional] 
**CreationTimeInMillis** | **float?** | Creation time of the user in milliseconds. | [optional] 
**CurrentOrg** | [**Org**](Org.md) |  | [optional] 
**Deleted** | **bool?** | Indicates whether the user is deleted. | [optional] 
**Deprecated** | **bool?** | Indicates whether the user is deprecated. | [optional] 
**AccountType** | **string** | Type of the user account. | [optional] 
**AccountStatus** | **string** | Status of the user account. | [optional] 
**Email** | **string** | Email of the user. | [optional] 
**ExpirationTimeInMillis** | **float?** | Expiration time of the user in milliseconds. | [optional] 
**External** | **bool?** | Indicates whether the user is external. | [optional] 
**FavoriteMetadata** | [**List&lt;FavoriteMetadataItem&gt;**](FavoriteMetadataItem.md) | Metadata objects to add to the users&#39; favorites list. | [optional] 
**FirstLoginTimeInMillis** | **float?** | Timestamp of the first login session of the user in milliseconds. | [optional] 
**GroupMask** | **int?** | Group mask of the user. | [optional] 
**Hidden** | **bool?** | Indicates whether the user is hidden. | [optional] 
**HomeLiveboard** | [**ObjectIDAndName**](ObjectIDAndName.md) |  | [optional] 
**IncompleteDetails** | **Object** | Incomplete details of user if any present. | [optional] 
**IsFirstLogin** | **bool?** | Indicates whether it is first login of the user. | [optional] 
**ModificationTimeInMillis** | **float?** | Last modified time of the user in milliseconds. | [optional] 
**ModifierId** | **string** | Unique identifier of modifier of the user. | [optional] 
**NotifyOnShare** | **bool?** | User preference for receiving email notifications on shared Answers or Liveboard. | [optional] 
**OnboardingExperienceCompleted** | **bool?** | The user preference for turning off the onboarding experience. | [optional] 
**Orgs** | [**List&lt;Org&gt;**](Org.md) | Orgs to which the user belongs. | [optional] 
**OwnerId** | **string** | Unique identifier of owner of the user. | [optional] 
**ParentType** | **string** | Parent type of the user. | [optional] 
**Privileges** | **List&lt;string&gt;** | Privileges which are assigned to the user. | [optional] 
**ShowOnboardingExperience** | **bool?** | User&#39;s preference to revisit the new user onboarding experience. | [optional] 
**SuperUser** | **bool?** | Indicates whether the user is a super user. | [optional] 
**SystemUser** | **bool?** | Indicates whether the user is a system user. | [optional] 
**Tags** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Tags associated with the user. | [optional] 
**TenantId** | **string** | Unique identifier of tenant of the user. | [optional] 
**UserGroups** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Groups to which the user is assigned. | [optional] 
**UserInheritedGroups** | [**List&lt;ObjectIDAndName&gt;**](ObjectIDAndName.md) | Inherited User Groups which the user is part of. | [optional] 
**WelcomeEmailSent** | **bool?** | Indicates whether welcome email is sent for the user. | [optional] 
**OrgPrivileges** | **Object** | Privileges which are assigned to the user with org. | [optional] 
**PreferredLocale** | **string** | Locale for the user. | [optional] 
**UseBrowserLanguage** | **bool?** | Flag to indicate whether to use the browser locale for the user in the UI. When set to true, the preferred_locale value is unset and the browser&#39;s language setting takes precedence.    Version: 26.3.0.cl or later  | [optional] 
**ExtendedProperties** | **Object** | Properties for the user | [optional] 
**ExtendedPreferences** | **Object** | Preferences for the user | [optional] 
**UserParameters** | **Object** | User Parameters which are specified for the user via JWToken | [optional] 
**AccessControlProperties** | **Object** | Access Control Properties which are specified for the user via JWToken | [optional] 
**VariableValues** | **Object** | Formula Variables which are specified for the user via JWToken | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

