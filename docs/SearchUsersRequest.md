# ThoughtSpot.Client.Model.SearchUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserIdentifier** | **string** | GUID / name of the user to search | [optional] 
**DisplayName** | **string** | A unique display name string for the user account, usually their first and last name | [optional] 
**NamePattern** | **string** | A pattern to match case-insensitive name of the User object. | [optional] 
**Visibility** | **string** | Visibility of the user | [optional] 
**Email** | **string** | Email of the user account | [optional] 
**GroupIdentifiers** | **List&lt;string&gt;** | GUID or name of the group to which the user belongs | [optional] 
**Privileges** | **List&lt;SearchUsersRequest.PrivilegesEnum&gt;** | Privileges assigned to the user | [optional] 
**AccountType** | **string** | Type of the account | [optional] 
**AccountStatus** | **string** | Current status of the user account. | [optional] 
**NotifyOnShare** | **bool?** | User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet. | [optional] 
**ShowOnboardingExperience** | **bool?** | The user preference for revisiting the onboarding experience | [optional] 
**OnboardingExperienceCompleted** | **bool?** | Indicates if the user has completed the onboarding walkthrough | [optional] 
**OrgIdentifiers** | **List&lt;string&gt;** | IDs or names of the Orgs to which the user belongs | [optional] 
**HomeLiveboardIdentifier** | **string** | Unique ID or name of the user&#39;s home Liveboard. | [optional] 
**FavoriteMetadata** | [**List&lt;FavoriteMetadataInput&gt;**](FavoriteMetadataInput.md) | Metadata objects which are assigned as favorites of the user. | [optional] 
**RecordOffset** | **int** | The starting record number from where the records should be included. | [optional] [default to 0]
**RecordSize** | **int** | The number of records that should be included. | [optional] [default to 10]
**SortOptions** | [**SortOptions**](SortOptions.md) | Sort options. | [optional] 
**RoleIdentifiers** | **List&lt;string&gt;** | Filters by the role assigned to the user. | [optional] 
**IncludeFavoriteMetadata** | **bool?** | Indicates if the user&#39;s favorite objects should be displayed. | [optional] [default to false]
**IncludeVariableValues** | **bool?** | Indicates if the user&#39;s formula variable values should be included in the response. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

