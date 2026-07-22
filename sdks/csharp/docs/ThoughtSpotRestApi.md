# ThoughtSpot.RestApi.Sdk.Api.ThoughtSpotRestApi

All URIs are relative to *https://localhost:443*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ActivateUser**](ThoughtSpotRestApi.md#activateuser) | **POST** /api/rest/2.0/users/activate |  |
| [**AssignChangeAuthor**](ThoughtSpotRestApi.md#assignchangeauthor) | **POST** /api/rest/2.0/security/metadata/assign |  |
| [**AssignTag**](ThoughtSpotRestApi.md#assigntag) | **POST** /api/rest/2.0/tags/assign |  |
| [**ChangeUserPassword**](ThoughtSpotRestApi.md#changeuserpassword) | **POST** /api/rest/2.0/users/change-password |  |
| [**CommitBranch**](ThoughtSpotRestApi.md#commitbranch) | **POST** /api/rest/2.0/vcs/git/branches/commit |  |
| [**ConfigureAuthSettings**](ThoughtSpotRestApi.md#configureauthsettings) | **POST** /api/rest/2.0/auth/configure |  |
| [**ConfigureCommunicationChannelPreferences**](ThoughtSpotRestApi.md#configurecommunicationchannelpreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/configure |  |
| [**ConfigureSecuritySettings**](ThoughtSpotRestApi.md#configuresecuritysettings) | **POST** /api/rest/2.0/system/security-settings/configure |  |
| [**ConnectionConfigurationSearch**](ThoughtSpotRestApi.md#connectionconfigurationsearch) | **POST** /api/rest/2.0/connection-configurations/search |  |
| [**ConvertWorksheetToModel**](ThoughtSpotRestApi.md#convertworksheettomodel) | **POST** /api/rest/2.0/metadata/worksheets/convert |  |
| [**CopyObject**](ThoughtSpotRestApi.md#copyobject) | **POST** /api/rest/2.0/metadata/copyobject |  |
| [**CreateAgentConversation**](ThoughtSpotRestApi.md#createagentconversation) | **POST** /api/rest/2.0/ai/agent/conversation/create |  |
| [**CreateCalendar**](ThoughtSpotRestApi.md#createcalendar) | **POST** /api/rest/2.0/calendars/create |  |
| [**CreateCollection**](ThoughtSpotRestApi.md#createcollection) | **POST** /api/rest/2.0/collections/create |  |
| [**CreateConfig**](ThoughtSpotRestApi.md#createconfig) | **POST** /api/rest/2.0/vcs/git/config/create |  |
| [**CreateConnection**](ThoughtSpotRestApi.md#createconnection) | **POST** /api/rest/2.0/connection/create |  |
| [**CreateConnectionConfiguration**](ThoughtSpotRestApi.md#createconnectionconfiguration) | **POST** /api/rest/2.0/connection-configurations/create |  |
| [**CreateConversation**](ThoughtSpotRestApi.md#createconversation) | **POST** /api/rest/2.0/ai/conversation/create |  |
| [**CreateCustomAction**](ThoughtSpotRestApi.md#createcustomaction) | **POST** /api/rest/2.0/customization/custom-actions |  |
| [**CreateEmailCustomization**](ThoughtSpotRestApi.md#createemailcustomization) | **POST** /api/rest/2.0/customization/email |  |
| [**CreateOrg**](ThoughtSpotRestApi.md#createorg) | **POST** /api/rest/2.0/orgs/create |  |
| [**CreateRole**](ThoughtSpotRestApi.md#createrole) | **POST** /api/rest/2.0/roles/create |  |
| [**CreateSchedule**](ThoughtSpotRestApi.md#createschedule) | **POST** /api/rest/2.0/schedules/create |  |
| [**CreateTag**](ThoughtSpotRestApi.md#createtag) | **POST** /api/rest/2.0/tags/create |  |
| [**CreateUser**](ThoughtSpotRestApi.md#createuser) | **POST** /api/rest/2.0/users/create |  |
| [**CreateUserGroup**](ThoughtSpotRestApi.md#createusergroup) | **POST** /api/rest/2.0/groups/create |  |
| [**CreateVariable**](ThoughtSpotRestApi.md#createvariable) | **POST** /api/rest/2.0/template/variables/create |  |
| [**CreateWebhookConfiguration**](ThoughtSpotRestApi.md#createwebhookconfiguration) | **POST** /api/rest/2.0/webhooks/create |  |
| [**DbtConnection**](ThoughtSpotRestApi.md#dbtconnection) | **POST** /api/rest/2.0/dbt/dbt-connection |  |
| [**DbtGenerateSyncTml**](ThoughtSpotRestApi.md#dbtgeneratesynctml) | **POST** /api/rest/2.0/dbt/generate-sync-tml |  |
| [**DbtGenerateTml**](ThoughtSpotRestApi.md#dbtgeneratetml) | **POST** /api/rest/2.0/dbt/generate-tml |  |
| [**DbtSearch**](ThoughtSpotRestApi.md#dbtsearch) | **POST** /api/rest/2.0/dbt/search |  |
| [**DeactivateUser**](ThoughtSpotRestApi.md#deactivateuser) | **POST** /api/rest/2.0/users/deactivate |  |
| [**DeleteCalendar**](ThoughtSpotRestApi.md#deletecalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/delete |  |
| [**DeleteCollection**](ThoughtSpotRestApi.md#deletecollection) | **POST** /api/rest/2.0/collections/delete |  |
| [**DeleteConfig**](ThoughtSpotRestApi.md#deleteconfig) | **POST** /api/rest/2.0/vcs/git/config/delete |  |
| [**DeleteConnection**](ThoughtSpotRestApi.md#deleteconnection) | **POST** /api/rest/2.0/connection/delete |  |
| [**DeleteConnectionConfiguration**](ThoughtSpotRestApi.md#deleteconnectionconfiguration) | **POST** /api/rest/2.0/connection-configurations/delete |  |
| [**DeleteConnectionV2**](ThoughtSpotRestApi.md#deleteconnectionv2) | **POST** /api/rest/2.0/connections/{connection_identifier}/delete |  |
| [**DeleteConversation**](ThoughtSpotRestApi.md#deleteconversation) | **DELETE** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete |  |
| [**DeleteCustomAction**](ThoughtSpotRestApi.md#deletecustomaction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete |  |
| [**DeleteDbtConnection**](ThoughtSpotRestApi.md#deletedbtconnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier}/delete |  |
| [**DeleteEmailCustomization**](ThoughtSpotRestApi.md#deleteemailcustomization) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete |  |
| [**DeleteManualTranslations**](ThoughtSpotRestApi.md#deletemanualtranslations) | **POST** /api/rest/2.0/localizations/manual-translation/delete |  |
| [**DeleteMetadata**](ThoughtSpotRestApi.md#deletemetadata) | **POST** /api/rest/2.0/metadata/delete |  |
| [**DeleteOrg**](ThoughtSpotRestApi.md#deleteorg) | **POST** /api/rest/2.0/orgs/{org_identifier}/delete |  |
| [**DeleteOrgEmailCustomization**](ThoughtSpotRestApi.md#deleteorgemailcustomization) | **POST** /api/rest/2.0/customization/email/delete |  |
| [**DeleteRole**](ThoughtSpotRestApi.md#deleterole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete |  |
| [**DeleteSchedule**](ThoughtSpotRestApi.md#deleteschedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete |  |
| [**DeleteStyleFonts**](ThoughtSpotRestApi.md#deletestylefonts) | **POST** /api/rest/2.0/customization/styles/fonts/delete |  |
| [**DeleteTag**](ThoughtSpotRestApi.md#deletetag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete |  |
| [**DeleteUser**](ThoughtSpotRestApi.md#deleteuser) | **POST** /api/rest/2.0/users/{user_identifier}/delete |  |
| [**DeleteUserGroup**](ThoughtSpotRestApi.md#deleteusergroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete |  |
| [**DeleteVariable**](ThoughtSpotRestApi.md#deletevariable) | **POST** /api/rest/2.0/template/variables/{identifier}/delete |  |
| [**DeleteVariables**](ThoughtSpotRestApi.md#deletevariables) | **POST** /api/rest/2.0/template/variables/delete |  |
| [**DeleteWebhookConfigurations**](ThoughtSpotRestApi.md#deletewebhookconfigurations) | **POST** /api/rest/2.0/webhooks/delete |  |
| [**DeployCommit**](ThoughtSpotRestApi.md#deploycommit) | **POST** /api/rest/2.0/vcs/git/commits/deploy |  |
| [**DownloadConnectionMetadataChanges**](ThoughtSpotRestApi.md#downloadconnectionmetadatachanges) | **POST** /api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier} |  |
| [**ExportAnswerReport**](ThoughtSpotRestApi.md#exportanswerreport) | **POST** /api/rest/2.0/report/answer |  |
| [**ExportLiveboardReport**](ThoughtSpotRestApi.md#exportliveboardreport) | **POST** /api/rest/2.0/report/liveboard |  |
| [**ExportManualTranslations**](ThoughtSpotRestApi.md#exportmanualtranslations) | **POST** /api/rest/2.0/localizations/manual-translation/export |  |
| [**ExportMetadataTML**](ThoughtSpotRestApi.md#exportmetadatatml) | **POST** /api/rest/2.0/metadata/tml/export |  |
| [**ExportMetadataTMLBatched**](ThoughtSpotRestApi.md#exportmetadatatmlbatched) | **POST** /api/rest/2.0/metadata/tml/export/batch |  |
| [**ExportStyleLogos**](ThoughtSpotRestApi.md#exportstylelogos) | **POST** /api/rest/2.0/customization/styles/logos/export |  |
| [**FetchAnswerData**](ThoughtSpotRestApi.md#fetchanswerdata) | **POST** /api/rest/2.0/metadata/answer/data |  |
| [**FetchAnswerSqlQuery**](ThoughtSpotRestApi.md#fetchanswersqlquery) | **POST** /api/rest/2.0/metadata/answer/sql |  |
| [**FetchAsyncImportTaskStatus**](ThoughtSpotRestApi.md#fetchasyncimporttaskstatus) | **POST** /api/rest/2.0/metadata/tml/async/status |  |
| [**FetchColumnSecurityRules**](ThoughtSpotRestApi.md#fetchcolumnsecurityrules) | **POST** /api/rest/2.0/security/column/rules/fetch |  |
| [**FetchConnectionDiffStatus**](ThoughtSpotRestApi.md#fetchconnectiondiffstatus) | **POST** /api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier} |  |
| [**FetchLiveboardData**](ThoughtSpotRestApi.md#fetchliveboarddata) | **POST** /api/rest/2.0/metadata/liveboard/data |  |
| [**FetchLiveboardSqlQuery**](ThoughtSpotRestApi.md#fetchliveboardsqlquery) | **POST** /api/rest/2.0/metadata/liveboard/sql |  |
| [**FetchLogs**](ThoughtSpotRestApi.md#fetchlogs) | **POST** /api/rest/2.0/logs/fetch |  |
| [**FetchObjectPrivileges**](ThoughtSpotRestApi.md#fetchobjectprivileges) | **POST** /api/rest/2.0/security/metadata/fetch-object-privileges |  |
| [**FetchPermissionsOfPrincipals**](ThoughtSpotRestApi.md#fetchpermissionsofprincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions |  |
| [**FetchPermissionsOnMetadata**](ThoughtSpotRestApi.md#fetchpermissionsonmetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions |  |
| [**ForceLogoutUsers**](ThoughtSpotRestApi.md#forcelogoutusers) | **POST** /api/rest/2.0/users/force-logout |  |
| [**GenerateCSV**](ThoughtSpotRestApi.md#generatecsv) | **POST** /api/rest/2.0/calendars/generate-csv |  |
| [**GetAgentInstructions**](ThoughtSpotRestApi.md#getagentinstructions) | **GET** /api/rest/2.0/ai/agent/instructions/get |  |
| [**GetConversation**](ThoughtSpotRestApi.md#getconversation) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages |  |
| [**GetConversationList**](ThoughtSpotRestApi.md#getconversationlist) | **GET** /api/rest/2.0/ai/agent/conversations |  |
| [**GetCurrentUserInfo**](ThoughtSpotRestApi.md#getcurrentuserinfo) | **GET** /api/rest/2.0/auth/session/user |  |
| [**GetCurrentUserToken**](ThoughtSpotRestApi.md#getcurrentusertoken) | **GET** /api/rest/2.0/auth/session/token |  |
| [**GetCustomAccessToken**](ThoughtSpotRestApi.md#getcustomaccesstoken) | **POST** /api/rest/2.0/auth/token/custom |  |
| [**GetDataSourceSuggestions**](ThoughtSpotRestApi.md#getdatasourcesuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions |  |
| [**GetFullAccessToken**](ThoughtSpotRestApi.md#getfullaccesstoken) | **POST** /api/rest/2.0/auth/token/full |  |
| [**GetManualTranslationBundle**](ThoughtSpotRestApi.md#getmanualtranslationbundle) | **POST** /api/rest/2.0/localizations/manual-translation/locales/{locale}/export |  |
| [**GetNLInstructions**](ThoughtSpotRestApi.md#getnlinstructions) | **POST** /api/rest/2.0/ai/instructions/get |  |
| [**GetObjectAccessToken**](ThoughtSpotRestApi.md#getobjectaccesstoken) | **POST** /api/rest/2.0/auth/token/object |  |
| [**GetRelevantQuestions**](ThoughtSpotRestApi.md#getrelevantquestions) | **POST** /api/rest/2.0/ai/relevant-questions/ |  |
| [**GetSystemConfig**](ThoughtSpotRestApi.md#getsystemconfig) | **GET** /api/rest/2.0/system/config |  |
| [**GetSystemInformation**](ThoughtSpotRestApi.md#getsysteminformation) | **GET** /api/rest/2.0/system |  |
| [**GetSystemOverrideInfo**](ThoughtSpotRestApi.md#getsystemoverrideinfo) | **GET** /api/rest/2.0/system/config-overrides |  |
| [**GetWebhookStorageConfig**](ThoughtSpotRestApi.md#getwebhookstorageconfig) | **GET** /api/rest/2.0/webhooks/storage-config |  |
| [**ImportManualTranslations**](ThoughtSpotRestApi.md#importmanualtranslations) | **POST** /api/rest/2.0/localizations/manual-translation/import |  |
| [**ImportMetadataTML**](ThoughtSpotRestApi.md#importmetadatatml) | **POST** /api/rest/2.0/metadata/tml/import |  |
| [**ImportMetadataTMLAsync**](ThoughtSpotRestApi.md#importmetadatatmlasync) | **POST** /api/rest/2.0/metadata/tml/async/import |  |
| [**ImportUserGroups**](ThoughtSpotRestApi.md#importusergroups) | **POST** /api/rest/2.0/groups/import |  |
| [**ImportUsers**](ThoughtSpotRestApi.md#importusers) | **POST** /api/rest/2.0/users/import |  |
| [**LoadAnswer**](ThoughtSpotRestApi.md#loadanswer) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details |  |
| [**Login**](ThoughtSpotRestApi.md#login) | **POST** /api/rest/2.0/auth/session/login |  |
| [**Logout**](ThoughtSpotRestApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout |  |
| [**ManageObjectPrivilege**](ThoughtSpotRestApi.md#manageobjectprivilege) | **POST** /api/rest/2.0/security/metadata/manage-object-privilege |  |
| [**ParameterizeMetadata**](ThoughtSpotRestApi.md#parameterizemetadata) | **POST** /api/rest/2.0/metadata/parameterize |  |
| [**ParameterizeMetadataFields**](ThoughtSpotRestApi.md#parameterizemetadatafields) | **POST** /api/rest/2.0/metadata/parameterize-fields |  |
| [**PublishMetadata**](ThoughtSpotRestApi.md#publishmetadata) | **POST** /api/rest/2.0/security/metadata/publish |  |
| [**PutVariableValues**](ThoughtSpotRestApi.md#putvariablevalues) | **POST** /api/rest/2.0/template/variables/{identifier}/update-values |  |
| [**QueryGetDecomposedQuery**](ThoughtSpotRestApi.md#querygetdecomposedquery) | **POST** /api/rest/2.0/ai/analytical-questions |  |
| [**ResetUserPassword**](ThoughtSpotRestApi.md#resetuserpassword) | **POST** /api/rest/2.0/users/reset-password |  |
| [**RevertCommit**](ThoughtSpotRestApi.md#revertcommit) | **POST** /api/rest/2.0/vcs/git/commits/{commit_id}/revert |  |
| [**RevokeRefreshTokens**](ThoughtSpotRestApi.md#revokerefreshtokens) | **POST** /api/rest/2.0/connections/{connection_identifier}/revoke-refresh-tokens |  |
| [**RevokeToken**](ThoughtSpotRestApi.md#revoketoken) | **POST** /api/rest/2.0/auth/token/revoke |  |
| [**SearchAuthSettings**](ThoughtSpotRestApi.md#searchauthsettings) | **POST** /api/rest/2.0/auth/search |  |
| [**SearchCalendars**](ThoughtSpotRestApi.md#searchcalendars) | **POST** /api/rest/2.0/calendars/search |  |
| [**SearchChannelHistory**](ThoughtSpotRestApi.md#searchchannelhistory) | **POST** /api/rest/2.0/jobs/history/communication-channels/search |  |
| [**SearchCollections**](ThoughtSpotRestApi.md#searchcollections) | **POST** /api/rest/2.0/collections/search |  |
| [**SearchCommits**](ThoughtSpotRestApi.md#searchcommits) | **POST** /api/rest/2.0/vcs/git/commits/search |  |
| [**SearchCommunicationChannelPreferences**](ThoughtSpotRestApi.md#searchcommunicationchannelpreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/search |  |
| [**SearchConfig**](ThoughtSpotRestApi.md#searchconfig) | **POST** /api/rest/2.0/vcs/git/config/search |  |
| [**SearchConnection**](ThoughtSpotRestApi.md#searchconnection) | **POST** /api/rest/2.0/connection/search |  |
| [**SearchCustomActions**](ThoughtSpotRestApi.md#searchcustomactions) | **POST** /api/rest/2.0/customization/custom-actions/search |  |
| [**SearchData**](ThoughtSpotRestApi.md#searchdata) | **POST** /api/rest/2.0/searchdata |  |
| [**SearchEmailCustomization**](ThoughtSpotRestApi.md#searchemailcustomization) | **POST** /api/rest/2.0/customization/email/search |  |
| [**SearchMetadata**](ThoughtSpotRestApi.md#searchmetadata) | **POST** /api/rest/2.0/metadata/search |  |
| [**SearchOrgs**](ThoughtSpotRestApi.md#searchorgs) | **POST** /api/rest/2.0/orgs/search |  |
| [**SearchRoles**](ThoughtSpotRestApi.md#searchroles) | **POST** /api/rest/2.0/roles/search |  |
| [**SearchSchedules**](ThoughtSpotRestApi.md#searchschedules) | **POST** /api/rest/2.0/schedules/search |  |
| [**SearchSecuritySettings**](ThoughtSpotRestApi.md#searchsecuritysettings) | **POST** /api/rest/2.0/system/security-settings/search |  |
| [**SearchStyleCustomizations**](ThoughtSpotRestApi.md#searchstylecustomizations) | **POST** /api/rest/2.0/customization/styles/search |  |
| [**SearchStyleFonts**](ThoughtSpotRestApi.md#searchstylefonts) | **POST** /api/rest/2.0/customization/styles/fonts/search |  |
| [**SearchTags**](ThoughtSpotRestApi.md#searchtags) | **POST** /api/rest/2.0/tags/search |  |
| [**SearchUserGroups**](ThoughtSpotRestApi.md#searchusergroups) | **POST** /api/rest/2.0/groups/search |  |
| [**SearchUsers**](ThoughtSpotRestApi.md#searchusers) | **POST** /api/rest/2.0/users/search |  |
| [**SearchVariables**](ThoughtSpotRestApi.md#searchvariables) | **POST** /api/rest/2.0/template/variables/search |  |
| [**SearchWebhookConfigurations**](ThoughtSpotRestApi.md#searchwebhookconfigurations) | **POST** /api/rest/2.0/webhooks/search |  |
| [**SendAgentConversationMessage**](ThoughtSpotRestApi.md#sendagentconversationmessage) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send |  |
| [**SendAgentConversationMessageStreaming**](ThoughtSpotRestApi.md#sendagentconversationmessagestreaming) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream |  |
| [**SendAgentMessage**](ThoughtSpotRestApi.md#sendagentmessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse |  |
| [**SendAgentMessageStreaming**](ThoughtSpotRestApi.md#sendagentmessagestreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse |  |
| [**SendMessage**](ThoughtSpotRestApi.md#sendmessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse |  |
| [**SetAgentInstructions**](ThoughtSpotRestApi.md#setagentinstructions) | **PUT** /api/rest/2.0/ai/agent/instructions/set |  |
| [**SetNLInstructions**](ThoughtSpotRestApi.md#setnlinstructions) | **POST** /api/rest/2.0/ai/instructions/set |  |
| [**ShareMetadata**](ThoughtSpotRestApi.md#sharemetadata) | **POST** /api/rest/2.0/security/metadata/share |  |
| [**SingleAnswer**](ThoughtSpotRestApi.md#singleanswer) | **POST** /api/rest/2.0/ai/answer/create |  |
| [**StopConversation**](ThoughtSpotRestApi.md#stopconversation) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response |  |
| [**SyncMetadata**](ThoughtSpotRestApi.md#syncmetadata) | **POST** /api/rest/2.0/connections/{connection_identifier}/resync-metadata |  |
| [**UnassignTag**](ThoughtSpotRestApi.md#unassigntag) | **POST** /api/rest/2.0/tags/unassign |  |
| [**UnparameterizeMetadata**](ThoughtSpotRestApi.md#unparameterizemetadata) | **POST** /api/rest/2.0/metadata/unparameterize |  |
| [**UnpublishMetadata**](ThoughtSpotRestApi.md#unpublishmetadata) | **POST** /api/rest/2.0/security/metadata/unpublish |  |
| [**UpdateCalendar**](ThoughtSpotRestApi.md#updatecalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/update |  |
| [**UpdateCollection**](ThoughtSpotRestApi.md#updatecollection) | **POST** /api/rest/2.0/collections/{collection_identifier}/update |  |
| [**UpdateColumnSecurityRules**](ThoughtSpotRestApi.md#updatecolumnsecurityrules) | **POST** /api/rest/2.0/security/column/rules/update |  |
| [**UpdateConfig**](ThoughtSpotRestApi.md#updateconfig) | **POST** /api/rest/2.0/vcs/git/config/update |  |
| [**UpdateConnection**](ThoughtSpotRestApi.md#updateconnection) | **POST** /api/rest/2.0/connection/update |  |
| [**UpdateConnectionConfiguration**](ThoughtSpotRestApi.md#updateconnectionconfiguration) | **POST** /api/rest/2.0/connection-configurations/{configuration_identifier}/update |  |
| [**UpdateConnectionStatus**](ThoughtSpotRestApi.md#updateconnectionstatus) | **POST** /api/rest/2.0/connections/{connection_identifier}/status |  |
| [**UpdateConnectionV2**](ThoughtSpotRestApi.md#updateconnectionv2) | **POST** /api/rest/2.0/connections/{connection_identifier}/update |  |
| [**UpdateConversation**](ThoughtSpotRestApi.md#updateconversation) | **POST** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update |  |
| [**UpdateCustomAction**](ThoughtSpotRestApi.md#updatecustomaction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update |  |
| [**UpdateDbtConnection**](ThoughtSpotRestApi.md#updatedbtconnection) | **POST** /api/rest/2.0/dbt/update-dbt-connection |  |
| [**UpdateEmailCustomization**](ThoughtSpotRestApi.md#updateemailcustomization) | **POST** /api/rest/2.0/customization/email/update |  |
| [**UpdateMetadataHeader**](ThoughtSpotRestApi.md#updatemetadataheader) | **POST** /api/rest/2.0/metadata/headers/update |  |
| [**UpdateMetadataObjId**](ThoughtSpotRestApi.md#updatemetadataobjid) | **POST** /api/rest/2.0/metadata/update-obj-id |  |
| [**UpdateOrg**](ThoughtSpotRestApi.md#updateorg) | **POST** /api/rest/2.0/orgs/{org_identifier}/update |  |
| [**UpdateRole**](ThoughtSpotRestApi.md#updaterole) | **POST** /api/rest/2.0/roles/{role_identifier}/update |  |
| [**UpdateSchedule**](ThoughtSpotRestApi.md#updateschedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update |  |
| [**UpdateStyleCustomization**](ThoughtSpotRestApi.md#updatestylecustomization) | **POST** /api/rest/2.0/customization/styles/update |  |
| [**UpdateStyleFont**](ThoughtSpotRestApi.md#updatestylefont) | **POST** /api/rest/2.0/customization/styles/fonts/{font_identifier}/update |  |
| [**UpdateSystemConfig**](ThoughtSpotRestApi.md#updatesystemconfig) | **POST** /api/rest/2.0/system/config-update |  |
| [**UpdateTag**](ThoughtSpotRestApi.md#updatetag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update |  |
| [**UpdateUser**](ThoughtSpotRestApi.md#updateuser) | **POST** /api/rest/2.0/users/{user_identifier}/update |  |
| [**UpdateUserGroup**](ThoughtSpotRestApi.md#updateusergroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update |  |
| [**UpdateVariable**](ThoughtSpotRestApi.md#updatevariable) | **POST** /api/rest/2.0/template/variables/{identifier}/update |  |
| [**UpdateVariableValues**](ThoughtSpotRestApi.md#updatevariablevalues) | **POST** /api/rest/2.0/template/variables/update-values |  |
| [**UpdateWebhookConfiguration**](ThoughtSpotRestApi.md#updatewebhookconfiguration) | **POST** /api/rest/2.0/webhooks/{webhook_identifier}/update |  |
| [**UploadStyleFont**](ThoughtSpotRestApi.md#uploadstylefont) | **POST** /api/rest/2.0/customization/styles/fonts/upload |  |
| [**ValidateCommunicationChannel**](ThoughtSpotRestApi.md#validatecommunicationchannel) | **POST** /api/rest/2.0/system/communication-channels/validate |  |
| [**ValidateEmailCustomization**](ThoughtSpotRestApi.md#validateemailcustomization) | **POST** /api/rest/2.0/customization/email/validate |  |
| [**ValidateMerge**](ThoughtSpotRestApi.md#validatemerge) | **POST** /api/rest/2.0/vcs/git/branches/validate |  |
| [**ValidateToken**](ThoughtSpotRestApi.md#validatetoken) | **POST** /api/rest/2.0/auth/token/validate |  |

<a id="activateuser"></a>
# **ActivateUser**
> User ActivateUser (ActivateUserRequest activateUserRequest)



  Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ActivateUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var activateUserRequest = new ActivateUserRequest(); // ActivateUserRequest | 

            try
            {
                User result = apiInstance.ActivateUser(activateUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ActivateUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ActivateUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<User> response = apiInstance.ActivateUserWithHttpInfo(activateUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ActivateUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **activateUserRequest** | [**ActivateUserRequest**](ActivateUserRequest.md) |  |  |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User activated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="assignchangeauthor"></a>
# **AssignChangeAuthor**
> void AssignChangeAuthor (AssignChangeAuthorRequest assignChangeAuthorRequest)



  Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class AssignChangeAuthorExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var assignChangeAuthorRequest = new AssignChangeAuthorRequest(); // AssignChangeAuthorRequest | 

            try
            {
                apiInstance.AssignChangeAuthor(assignChangeAuthorRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.AssignChangeAuthor: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AssignChangeAuthorWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.AssignChangeAuthorWithHttpInfo(assignChangeAuthorRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.AssignChangeAuthorWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assignChangeAuthorRequest** | [**AssignChangeAuthorRequest**](AssignChangeAuthorRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Author assignment for given metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="assigntag"></a>
# **AssignTag**
> void AssignTag (AssignTagRequest assignTagRequest)



  Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class AssignTagExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var assignTagRequest = new AssignTagRequest(); // AssignTagRequest | 

            try
            {
                apiInstance.AssignTag(assignTagRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.AssignTag: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AssignTagWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.AssignTagWithHttpInfo(assignTagRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.AssignTagWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **assignTagRequest** | [**AssignTagRequest**](AssignTagRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Tags successfully assigned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="changeuserpassword"></a>
# **ChangeUserPassword**
> void ChangeUserPassword (ChangeUserPasswordRequest changeUserPasswordRequest)



  Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ChangeUserPasswordExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var changeUserPasswordRequest = new ChangeUserPasswordRequest(); // ChangeUserPasswordRequest | 

            try
            {
                apiInstance.ChangeUserPassword(changeUserPasswordRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ChangeUserPassword: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ChangeUserPasswordWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ChangeUserPasswordWithHttpInfo(changeUserPasswordRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ChangeUserPasswordWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **changeUserPasswordRequest** | [**ChangeUserPasswordRequest**](ChangeUserPasswordRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User password change operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="commitbranch"></a>
# **CommitBranch**
> CommitResponse CommitBranch (CommitBranchRequest commitBranchRequest)



  Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CommitBranchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var commitBranchRequest = new CommitBranchRequest(); // CommitBranchRequest | 

            try
            {
                CommitResponse result = apiInstance.CommitBranch(commitBranchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CommitBranch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CommitBranchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CommitResponse> response = apiInstance.CommitBranchWithHttpInfo(commitBranchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CommitBranchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **commitBranchRequest** | [**CommitBranchRequest**](CommitBranchRequest.md) |  |  |

### Return type

[**CommitResponse**](CommitResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully committed the metadata objects |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="configureauthsettings"></a>
# **ConfigureAuthSettings**
> void ConfigureAuthSettings (ConfigureAuthSettingsRequest configureAuthSettingsRequest)



  Version: 26.6.0.cl or later   Enables or disables authentication at cluster or org level for the specified auth type. Currently supports `TRUSTED_AUTH`.  #### Required privileges  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` privilege is required.  #### Usage guidelines  Use `cluster_preferences` to enable or disable authentication at the cluster level. Cluster-level settings can only be configured from the Primary Org. - `ENABLED` — Generates a new access token if one does not exist. An existing token is preserved. - `DISABLED` — Revokes the existing cluster-level access token.  Use `org_preferences` to enable or disable authentication for one or more Orgs. Each entry must include an `org_identifier` (unique ID or name) and an `auth_status`. Org-level configuration requires the per-Org authentication feature to be enabled on your instance. - `ENABLED` — Generates a new org-level access token if one does not exist. - `DISABLED` — Revokes the existing org-level access token for that Org.  Both `cluster_preferences` and `org_preferences` are optional. Omitting a field leaves the corresponding settings unchanged. If both are omitted, the API returns `204 No Content` without making any changes.  **Note**: Cluster-level and org-level settings are independent of each other. Enabling or disabling one does not affect the other.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ConfigureAuthSettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var configureAuthSettingsRequest = new ConfigureAuthSettingsRequest(); // ConfigureAuthSettingsRequest | 

            try
            {
                apiInstance.ConfigureAuthSettings(configureAuthSettingsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ConfigureAuthSettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConfigureAuthSettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ConfigureAuthSettingsWithHttpInfo(configureAuthSettingsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ConfigureAuthSettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configureAuthSettingsRequest** | [**ConfigureAuthSettingsRequest**](ConfigureAuthSettingsRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Trusted authentication settings configured successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="configurecommunicationchannelpreferences"></a>
# **ConfigureCommunicationChannelPreferences**
> void ConfigureCommunicationChannelPreferences (ConfigureCommunicationChannelPreferencesRequest configureCommunicationChannelPreferencesRequest)



 Version: 10.14.0.cl or later   Configure communication channel preferences. - Use `cluster_preferences` to update the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to specify Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ConfigureCommunicationChannelPreferencesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var configureCommunicationChannelPreferencesRequest = new ConfigureCommunicationChannelPreferencesRequest(); // ConfigureCommunicationChannelPreferencesRequest | 

            try
            {
                apiInstance.ConfigureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ConfigureCommunicationChannelPreferences: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConfigureCommunicationChannelPreferencesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ConfigureCommunicationChannelPreferencesWithHttpInfo(configureCommunicationChannelPreferencesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ConfigureCommunicationChannelPreferencesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configureCommunicationChannelPreferencesRequest** | [**ConfigureCommunicationChannelPreferencesRequest**](ConfigureCommunicationChannelPreferencesRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Communication channel preferences successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="configuresecuritysettings"></a>
# **ConfigureSecuritySettings**
> void ConfigureSecuritySettings (ConfigureSecuritySettingsRequest configureSecuritySettingsRequest)



  Version: 26.2.0.cl or later   Configure security settings for your ThoughtSpot application instance. - Use `cluster_preferences` to update cluster-level security settings including CORS whitelisted URLs, CSP settings, SAML redirect URLs, partitioned cookies, and non-embed access configuration. - Use `org_preferences` to configure Org-specific security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this allows configuring CORS and non-embed access settings specific to the Org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. Cluster-level SAML and script-src settings require `ADMINISTRATION` privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ConfigureSecuritySettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var configureSecuritySettingsRequest = new ConfigureSecuritySettingsRequest(); // ConfigureSecuritySettingsRequest | 

            try
            {
                apiInstance.ConfigureSecuritySettings(configureSecuritySettingsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ConfigureSecuritySettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConfigureSecuritySettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ConfigureSecuritySettingsWithHttpInfo(configureSecuritySettingsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ConfigureSecuritySettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configureSecuritySettingsRequest** | [**ConfigureSecuritySettingsRequest**](ConfigureSecuritySettingsRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully configured the security settings. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="connectionconfigurationsearch"></a>
# **ConnectionConfigurationSearch**
> List&lt;ConnectionConfigurationResponse&gt; ConnectionConfigurationSearch (ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest)



  Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ConnectionConfigurationSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionConfigurationSearchRequest = new ConnectionConfigurationSearchRequest(); // ConnectionConfigurationSearchRequest | 

            try
            {
                List<ConnectionConfigurationResponse> result = apiInstance.ConnectionConfigurationSearch(connectionConfigurationSearchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ConnectionConfigurationSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConnectionConfigurationSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ConnectionConfigurationResponse>> response = apiInstance.ConnectionConfigurationSearchWithHttpInfo(connectionConfigurationSearchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ConnectionConfigurationSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionConfigurationSearchRequest** | [**ConnectionConfigurationSearchRequest**](ConnectionConfigurationSearchRequest.md) |  |  |

### Return type

[**List&lt;ConnectionConfigurationResponse&gt;**](ConnectionConfigurationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Configuration fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="convertworksheettomodel"></a>
# **ConvertWorksheetToModel**
> ResponseWorksheetToModelConversion ConvertWorksheetToModel (ConvertWorksheetToModelRequest convertWorksheetToModelRequest)



 Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (Can manage data models).  - --  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when `convert_all` is set to `false`.        - Leave empty or omit when `convert_all` is set to `true`.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when `convert_all` is set to `true` and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - `true`: Converts all Worksheets in the system, except those specified in `exclude_worksheet_ids`.        - `false`: Converts only the Worksheets listed in `worksheet_ids`.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - `true`: Applies conversion changes directly to ThoughtSpot.      - `false`: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  - --  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting `convert_all` to `false` and specifying a small number of `worksheet_ids`.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use `apply_changes: false` to preview the impact of the conversion before applying changes.  - --  ## Examples  ### Convert Specific Worksheets ```json {   \"worksheet_ids\": [\"guid1\", \"guid2\", \"guid3\"],   \"exclude_worksheet_ids\": [],   \"convert_all\": false,   \"apply_changes\": true } ```  ### Convert All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [],   \"convert_all\": true,   \"apply_changes\": true } ```  ### Exclude Specific Worksheets While Converting All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [\"abc\"],   \"convert_all\": true,   \"apply_changes\": true } ```     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ConvertWorksheetToModelExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var convertWorksheetToModelRequest = new ConvertWorksheetToModelRequest(); // ConvertWorksheetToModelRequest | 

            try
            {
                ResponseWorksheetToModelConversion result = apiInstance.ConvertWorksheetToModel(convertWorksheetToModelRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ConvertWorksheetToModel: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ConvertWorksheetToModelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseWorksheetToModelConversion> response = apiInstance.ConvertWorksheetToModelWithHttpInfo(convertWorksheetToModelRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ConvertWorksheetToModelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **convertWorksheetToModelRequest** | [**ConvertWorksheetToModelRequest**](ConvertWorksheetToModelRequest.md) |  |  |

### Return type

[**ResponseWorksheetToModelConversion**](ResponseWorksheetToModelConversion.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conversion of worksheets to model done successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="copyobject"></a>
# **CopyObject**
> ResponseCopyObject CopyObject (CopyObjectRequest copyObjectRequest)



 Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CopyObjectExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var copyObjectRequest = new CopyObjectRequest(); // CopyObjectRequest | 

            try
            {
                ResponseCopyObject result = apiInstance.CopyObject(copyObjectRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CopyObject: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CopyObjectWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseCopyObject> response = apiInstance.CopyObjectWithHttpInfo(copyObjectRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CopyObjectWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **copyObjectRequest** | [**CopyObjectRequest**](CopyObjectRequest.md) |  |  |

### Return type

[**ResponseCopyObject**](ResponseCopyObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a copy of the object |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Object not found |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createagentconversation"></a>
# **CreateAgentConversation**
> AgentConversation CreateAgentConversation (CreateAgentConversationRequest createAgentConversationRequest)



  Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include the `metadata_context` parameter to define the conversation context. The context type can be one of:  - `DATA_SOURCE` *(available from 26.5.0.cl)*: targets a specific data source. Provide `data_source_identifier` in `data_source_context` for a single data source, or `data_source_identifiers` for multi-data-source context. The deprecated `guid` field is accepted for backwards compatibility. - `AUTO_MODE` *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user's queries.  > **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase `data_source` enum value with the `guid` field instead of the above. Example: `{ \"type\": \"data_source\", \"data_source_context\": { \"guid\": \"<worksheet-id>\" } }`.  The `conversation_settings` parameter controls which Spotter capabilities are enabled for the conversation:  - `enable_contextual_change_analysis` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_natural_language_answer_generation` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_reasoning` (default: `true`, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to `false` has no effect on versions >= 26.2.0.cl - `enable_save_chat` (default: `false`, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history  If the request is successful, the response includes a unique `conversation_identifier` that must be passed to `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming` to send messages within this conversation. The response also includes `conversation_id` with the same value for backwards compatibility; use `conversation_identifier` for new integrations.  #### Example request  ```json {   \"metadata_context\": {     \"type\": \"DATA_SOURCE\",     \"data_source_context\": {       \"data_source_identifier\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\"     }   },   \"conversation_settings\": {} } ```  #### Error responses  | Code | Description                                                                                                                             | | - -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > > - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateAgentConversationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createAgentConversationRequest = new CreateAgentConversationRequest(); // CreateAgentConversationRequest | 

            try
            {
                AgentConversation result = apiInstance.CreateAgentConversation(createAgentConversationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateAgentConversation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateAgentConversationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AgentConversation> response = apiInstance.CreateAgentConversationWithHttpInfo(createAgentConversationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateAgentConversationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createAgentConversationRequest** | [**CreateAgentConversationRequest**](CreateAgentConversationRequest.md) |  |  |

### Return type

[**AgentConversation**](AgentConversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createcalendar"></a>
# **CreateCalendar**
> CalendarResponse CreateCalendar (CreateCalendarRequest createCalendarRequest)



  Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - `FROM_EXISTING_TABLE` - Creates calendar from the table reference provided in the API request.  - `FROM_INPUT_PARAMS` - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * `MONTH_OFFSET`. The default calendar type. A `MONTH_OFFSET` calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the `month_offset` value is set as `April`, the calendar year begins in April.  * `4-4-5`. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * `4-5-4`. Each quarter in the calendar will include two 4-week months with a 5-week month between. * `5-4-4`. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the `MM/DD/YYYY` format. For `MONTH_OFFSET` calendars, ensure that the `start_date` matches the month specified in the `month_offset` attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_EXISTING_TABLE\", } ```  To create a calendar from scratch:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_INPUT_PARAMS\",   \"calendar_type\": \"MONTH_OFFSET\",   \"month_offset\": \"April\",   \"start_day_of_week\": \"Monday\",   \"quarter_name_prefix\": \"Q\",   \"year_name_prefix\": \"FY\",   \"start_date\": \"04/01/2025\",   \"end_date\": \"04/31/2025\" } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateCalendarExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createCalendarRequest = new CreateCalendarRequest(); // CreateCalendarRequest | 

            try
            {
                CalendarResponse result = apiInstance.CreateCalendar(createCalendarRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateCalendar: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCalendarWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CalendarResponse> response = apiInstance.CreateCalendarWithHttpInfo(createCalendarRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateCalendarWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCalendarRequest** | [**CreateCalendarRequest**](CreateCalendarRequest.md) |  |  |

### Return type

[**CalendarResponse**](CalendarResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom calendar created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createcollection"></a>
# **CreateCollection**
> Collection CreateCollection (CreateCollectionRequest createCollectionRequest)



  Version: 26.4.0.cl or later   Creates a new collection in ThoughtSpot.  Collections allow you to organize and group related metadata objects such as Liveboards, Answers, worksheets, and other data objects. You can also create nested collections (sub-collections) to build a hierarchical structure.  #### Supported operations  The API endpoint lets you perform the following operations:  * Create a new collection * Add metadata objects (Liveboards, Answers, Logical Tables) to the collection * Create nested collections by adding sub-collections      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateCollectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createCollectionRequest = new CreateCollectionRequest(); // CreateCollectionRequest | 

            try
            {
                Collection result = apiInstance.CreateCollection(createCollectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateCollection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCollectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Collection> response = apiInstance.CreateCollectionWithHttpInfo(createCollectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateCollectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCollectionRequest** | [**CreateCollectionRequest**](CreateCollectionRequest.md) |  |  |

### Return type

**Collection**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection created successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createconfig"></a>
# **CreateConfig**
> RepoConfigObject CreateConfig (CreateConfigRequest createConfigRequest)



  Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createConfigRequest = new CreateConfigRequest(); // CreateConfigRequest | 

            try
            {
                RepoConfigObject result = apiInstance.CreateConfig(createConfigRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RepoConfigObject> response = apiInstance.CreateConfigWithHttpInfo(createConfigRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createConfigRequest** | [**CreateConfigRequest**](CreateConfigRequest.md) |  |  |

### Return type

[**RepoConfigObject**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully configured local repository |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createconnection"></a>
# **CreateConnection**
> CreateConnectionResponse CreateConnection (CreateConnectionRequest createConnectionRequest)



  Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"authenticationType\": \"SERVICE_ACCOUNT\",      \"databases\": [\"DB1\", \"DB2\"],      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.  #### Create a connection with tables  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) and `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege is required.  To create a connection with tables:  1. Pass these parameters in your API request. * Name of the connection. * Type of the data warehouse to connect to. * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"authenticationType\": \"SERVICE_ACCOUNT\",      \"databases\": [\"DB1\", \"DB2\", \"AllDatatypes\"],      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.  **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.  The optional `databases` property in `data_warehouse_config` accepts a list of database names. When specified, ThoughtSpot persists this list on the connection and uses it to scope metadata fetching to only the specified databases in subsequent table add and remove operations. If omitted, all databases in the data warehouse are accessible for metadata operations.  The `databases` and `externalDatabases` serve different purposes. `databases` is a flat list of database names that controls which databases are scanned during metadata operations. `externalDatabases` defines the full table hierarchy and determines which tables are linked into ThoughtSpot.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createConnectionRequest = new CreateConnectionRequest(); // CreateConnectionRequest | 

            try
            {
                CreateConnectionResponse result = apiInstance.CreateConnection(createConnectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CreateConnectionResponse> response = apiInstance.CreateConnectionWithHttpInfo(createConnectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createConnectionRequest** | [**CreateConnectionRequest**](CreateConnectionRequest.md) |  |  |

### Return type

[**CreateConnectionResponse**](CreateConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection to the datasource successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createconnectionconfiguration"></a>
# **CreateConnectionConfiguration**
> ConnectionConfigurationResponse CreateConnectionConfiguration (CreateConnectionConfigurationRequest createConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in `configuration`. The following example shows the configuration attributes:   ```    {      \"user\":\"DEV_USER\",      \"password\":\"TestConn123\",      \"role\":\"DEV\",      \"warehouse\":\"DEV_WH\"     }   ```  * If the `policy_type` is `PRINCIPALS`, then `policy_principals` is a required field. * If the `policy_type` is `PROCESSES`, then `policy_processes` is a required field. * If the `policy_type` is `NO_POLICY`, then `policy_principals` and `policy_processes` are not required fields.  #### Parameterized Connection Support For parameterized connections that use OAuth authentication, only the same_as_parent and policy_process_options  attributes are allowed in the API request. These attributes are not applicable to connections that are not parameterized.       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateConnectionConfigurationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createConnectionConfigurationRequest = new CreateConnectionConfigurationRequest(); // CreateConnectionConfigurationRequest | 

            try
            {
                ConnectionConfigurationResponse result = apiInstance.CreateConnectionConfiguration(createConnectionConfigurationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConnectionConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateConnectionConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ConnectionConfigurationResponse> response = apiInstance.CreateConnectionConfigurationWithHttpInfo(createConnectionConfigurationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConnectionConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createConnectionConfigurationRequest** | [**CreateConnectionConfigurationRequest**](CreateConnectionConfigurationRequest.md) |  |  |

### Return type

[**ConnectionConfigurationResponse**](ConnectionConfigurationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection configuration successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createconversation"></a>
# **CreateConversation**
> Conversation CreateConversation (CreateConversationRequest createConversationRequest)



 Version: 10.4.0.cl or later   Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `metadata_identifier`: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - `tokens`: a token string to set initial context for the conversation (e.g., `\"[sales],[item type],[state]\"`)  If the request is successful, ThoughtSpot returns a unique `conversation_identifier` that must be passed to `sendMessage` to continue the conversation.  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateConversationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createConversationRequest = new CreateConversationRequest(); // CreateConversationRequest | 

            try
            {
                Conversation result = apiInstance.CreateConversation(createConversationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConversation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateConversationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Conversation> response = apiInstance.CreateConversationWithHttpInfo(createConversationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateConversationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md) |  |  |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createcustomaction"></a>
# **CreateCustomAction**
> ResponseCustomAction CreateCustomAction (CreateCustomActionRequest createCustomActionRequest)



  Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateCustomActionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createCustomActionRequest = new CreateCustomActionRequest(); // CreateCustomActionRequest | 

            try
            {
                ResponseCustomAction result = apiInstance.CreateCustomAction(createCustomActionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateCustomAction: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCustomActionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseCustomAction> response = apiInstance.CreateCustomActionWithHttpInfo(createCustomActionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateCustomActionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCustomActionRequest** | [**CreateCustomActionRequest**](CreateCustomActionRequest.md) |  |  |

### Return type

[**ResponseCustomAction**](ResponseCustomAction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom action created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createemailcustomization"></a>
# **CreateEmailCustomization**
> CreateEmailCustomizationResponse CreateEmailCustomization (CreateEmailCustomizationRequest createEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",       \"cta_text_font_color\": \"#FFFFFF\",       \"primary_bg_color\": \"#D3DEF0\",       \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",      \"font_family\": \"\",       \"product_name\": \"ThoughtSpot\",       \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",    \"footer_phone\": \"(800) 508-7008\",       \"replacement_value_for_liveboard\": \"Dashboard\",       \"replacement_value_for_answer\": \"Chart\",       \"replacement_value_for_spot_iq\": \"AI Insights\",       \"hide_footer_phone\": false,       \"hide_footer_address\": false,       \"hide_product_name\": false,       \"hide_manage_notification\": false,       \"hide_mobile_app_nudge\": false,       \"hide_privacy_policy\": false,       \"hide_ts_vocabulary_definitions\": false,       \"hide_error_message\": false,       \"hide_unsubscribe_link\": false,       \"hide_notification_status\": false,       \"hide_modify_alert\": false,       \"company_website_url\": \"https://your-website.com/\",       \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",       \"contact_support_url\": \"https://link-to-contact-support.com/\",       \"hide_contact_support_url\": false,    \"hide_logo_url\" : false   } } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createEmailCustomizationRequest = new CreateEmailCustomizationRequest(); // CreateEmailCustomizationRequest | 

            try
            {
                CreateEmailCustomizationResponse result = apiInstance.CreateEmailCustomization(createEmailCustomizationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CreateEmailCustomizationResponse> response = apiInstance.CreateEmailCustomizationWithHttpInfo(createEmailCustomizationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createEmailCustomizationRequest** | [**CreateEmailCustomizationRequest**](CreateEmailCustomizationRequest.md) |  |  |

### Return type

[**CreateEmailCustomizationResponse**](CreateEmailCustomizationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createorg"></a>
# **CreateOrg**
> OrgResponse CreateOrg (CreateOrgRequest createOrgRequest)



  Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateOrgExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createOrgRequest = new CreateOrgRequest(); // CreateOrgRequest | 

            try
            {
                OrgResponse result = apiInstance.CreateOrg(createOrgRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateOrg: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateOrgWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<OrgResponse> response = apiInstance.CreateOrgWithHttpInfo(createOrgRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateOrgWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createOrgRequest** | [**CreateOrgRequest**](CreateOrgRequest.md) |  |  |

### Return type

[**OrgResponse**](OrgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createrole"></a>
# **CreateRole**
> RoleResponse CreateRole (CreateRoleRequest createRoleRequest)



  Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateRoleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createRoleRequest = new CreateRoleRequest(); // CreateRoleRequest | 

            try
            {
                RoleResponse result = apiInstance.CreateRole(createRoleRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateRole: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateRoleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RoleResponse> response = apiInstance.CreateRoleWithHttpInfo(createRoleRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateRoleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createRoleRequest** | [**CreateRoleRequest**](CreateRoleRequest.md) |  |  |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Role successfully created. |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createschedule"></a>
# **CreateSchedule**
> ResponseSchedule CreateSchedule (CreateScheduleRequest createScheduleRequest)



 Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  If RBAC is enabled, creating a schedule also requires the download privilege that corresponds to the selected `file_format`: `CSV` and `XLSX` require the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege, and `PDF` requires the `CAN_DOWNLOAD_VISUALS` (**Can download visuals**) privilege.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If `PDF` is set as the `file_format`, enable `pdf_options` to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server's time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateScheduleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createScheduleRequest = new CreateScheduleRequest(); // CreateScheduleRequest | 

            try
            {
                ResponseSchedule result = apiInstance.CreateSchedule(createScheduleRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateSchedule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateScheduleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseSchedule> response = apiInstance.CreateScheduleWithHttpInfo(createScheduleRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateScheduleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md) |  |  |

### Return type

[**ResponseSchedule**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createtag"></a>
# **CreateTag**
> Tag CreateTag (CreateTagRequest createTagRequest)



  Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateTagExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createTagRequest = new CreateTagRequest(); // CreateTagRequest | 

            try
            {
                Tag result = apiInstance.CreateTag(createTagRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateTag: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateTagWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Tag> response = apiInstance.CreateTagWithHttpInfo(createTagRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateTagWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createTagRequest** | [**CreateTagRequest**](CreateTagRequest.md) |  |  |

### Return type

[**Tag**](Tag.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tag successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createuser"></a>
# **CreateUser**
> User CreateUser (CreateUserRequest createUserRequest)



  Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createUserRequest = new CreateUserRequest(); // CreateUserRequest | 

            try
            {
                User result = apiInstance.CreateUser(createUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<User> response = apiInstance.CreateUserWithHttpInfo(createUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md) |  |  |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createusergroup"></a>
# **CreateUserGroup**
> UserGroupResponse CreateUserGroup (CreateUserGroupRequest createUserGroupRequest)



  Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateUserGroupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createUserGroupRequest = new CreateUserGroupRequest(); // CreateUserGroupRequest | 

            try
            {
                UserGroupResponse result = apiInstance.CreateUserGroup(createUserGroupRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateUserGroup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateUserGroupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<UserGroupResponse> response = apiInstance.CreateUserGroupWithHttpInfo(createUserGroupRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateUserGroupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createUserGroupRequest** | [**CreateUserGroupRequest**](CreateUserGroupRequest.md) |  |  |

### Return type

[**UserGroupResponse**](UserGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createvariable"></a>
# **CreateVariable**
> Variable CreateVariable (CreateVariableRequest createVariableRequest)



 Create a variable which can be used for parameterizing metadata objects    Version: 26.4.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this. * FORMULA_VARIABLE - For Formula variables, introduced in 10.15.0.cl  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The data type of the variable, only specify for formula variables (defaults to null)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateVariableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createVariableRequest = new CreateVariableRequest(); // CreateVariableRequest | 

            try
            {
                Variable result = apiInstance.CreateVariable(createVariableRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateVariable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateVariableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Variable> response = apiInstance.CreateVariableWithHttpInfo(createVariableRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateVariableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createVariableRequest** | [**CreateVariableRequest**](CreateVariableRequest.md) |  |  |

### Return type

[**Variable**](Variable.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createwebhookconfiguration"></a>
# **CreateWebhookConfiguration**
> WebhookResponse CreateWebhookConfiguration (CreateWebhookConfigurationRequest createWebhookConfigurationRequest)



  Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class CreateWebhookConfigurationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var createWebhookConfigurationRequest = new CreateWebhookConfigurationRequest(); // CreateWebhookConfigurationRequest | 

            try
            {
                WebhookResponse result = apiInstance.CreateWebhookConfiguration(createWebhookConfigurationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.CreateWebhookConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateWebhookConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<WebhookResponse> response = apiInstance.CreateWebhookConfigurationWithHttpInfo(createWebhookConfigurationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.CreateWebhookConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createWebhookConfigurationRequest** | [**CreateWebhookConfigurationRequest**](CreateWebhookConfigurationRequest.md) |  |  |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook configuration created successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtconnection"></a>
# **DbtConnection**
> Object DbtConnection (string connectionName, string databaseName, string? importType = null, string? accessToken = null, string? dbtUrl = null, string? accountId = null, string? projectId = null, string? dbtEnvId = null, string? projectName = null, FileParameter? fileContent = null)



  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DbtConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionName = "connectionName_example";  // string | Name of the connection.
            var databaseName = "databaseName_example";  // string | Name of the Database.
            var importType = "DBT_CLOUD";  // string? | Mention type of Import (optional)  (default to DBT_CLOUD)
            var accessToken = "accessToken_example";  // string? | Access token is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var dbtUrl = "dbtUrl_example";  // string? | DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var accountId = "accountId_example";  // string? | Account ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var projectId = "projectId_example";  // string? | Project ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var dbtEnvId = "dbtEnvId_example";  // string? | DBT Environment ID\\\" (optional) 
            var projectName = "projectName_example";  // string? | Name of the project (optional) 
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is 'ZIP_FILE' (optional) 

            try
            {
                Object result = apiInstance.DbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DbtConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DbtConnectionWithHttpInfo(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DbtConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionName** | **string** | Name of the connection. |  |
| **databaseName** | **string** | Name of the Database. |  |
| **importType** | **string?** | Mention type of Import | [optional] [default to DBT_CLOUD] |
| **accessToken** | **string?** | Access token is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **dbtUrl** | **string?** | DBT URL is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **accountId** | **string?** | Account ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **projectId** | **string?** | Project ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **dbtEnvId** | **string?** | DBT Environment ID\\\&quot; | [optional]  |
| **projectName** | **string?** | Name of the project | [optional]  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is &#39;ZIP_FILE&#39; | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succesfully created DBT Connection. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtgeneratesynctml"></a>
# **DbtGenerateSyncTml**
> Object DbtGenerateSyncTml (string dbtConnectionIdentifier, FileParameter? fileContent = null, bool? includeSemanticReport = null)



  Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DbtGenerateSyncTmlExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT connection.
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional) 
            var includeSemanticReport = true;  // bool? | If true, includes a `semantic_report` per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. (optional) 

            try
            {
                Object result = apiInstance.DbtGenerateSyncTml(dbtConnectionIdentifier, fileContent, includeSemanticReport);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DbtGenerateSyncTml: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtGenerateSyncTmlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DbtGenerateSyncTmlWithHttpInfo(dbtConnectionIdentifier, fileContent, includeSemanticReport);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DbtGenerateSyncTmlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT connection. |  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ | [optional]  |
| **includeSemanticReport** | **bool?** | If true, includes a &#x60;semantic_report&#x60; per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sync Table and Worksheet TML&#39;s are successfully generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtgeneratetml"></a>
# **DbtGenerateTml**
> Object DbtGenerateTml (string dbtConnectionIdentifier, string modelTables, string importWorksheets, string? worksheets = null, FileParameter? fileContent = null, bool? includeSemanticReport = null)



  Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DbtGenerateTmlExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT connection.
            var modelTables = "modelTables_example";  // string | List of Models and their respective Tables Example: '[{\\\"model_name\\\": \\\"model_name\\\", \\\"model_path\\\": \\\"model_path\\\", \\\"tables\\\": [\\\"table_name\\\"]}]'
            var importWorksheets = "ALL";  // string | Mention the worksheet tmls to import
            var worksheets = "worksheets_example";  // string? | List of worksheets is mandatory when import_Worksheets is type SELECTED Example: [\\\"worksheet_name\\\"] (optional) 
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ (optional) 
            var includeSemanticReport = true;  // bool? | If true, includes a `semantic_report` per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. (optional) 

            try
            {
                Object result = apiInstance.DbtGenerateTml(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, includeSemanticReport);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DbtGenerateTml: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtGenerateTmlWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.DbtGenerateTmlWithHttpInfo(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, includeSemanticReport);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DbtGenerateTmlWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT connection. |  |
| **modelTables** | **string** | List of Models and their respective Tables Example: &#39;[{\\\&quot;model_name\\\&quot;: \\\&quot;model_name\\\&quot;, \\\&quot;model_path\\\&quot;: \\\&quot;model_path\\\&quot;, \\\&quot;tables\\\&quot;: [\\\&quot;table_name\\\&quot;]}]&#39; |  |
| **importWorksheets** | **string** | Mention the worksheet tmls to import |  |
| **worksheets** | **string?** | List of worksheets is mandatory when import_Worksheets is type SELECTED Example: [\\\&quot;worksheet_name\\\&quot;] | [optional]  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’ | [optional]  |
| **includeSemanticReport** | **bool?** | If true, includes a &#x60;semantic_report&#x60; per model showing which components were imported or skipped. Each component includes its name, type (such as dimension, measure, or metric), import status, SQL expression, and the corresponding generated ThoughtSpot formula. | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Required Table and Worksheet TML&#39;s are successfully generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="dbtsearch"></a>
# **DbtSearch**
> List&lt;DbtSearchResponse&gt; DbtSearch ()



  Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DbtSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                List<DbtSearchResponse> result = apiInstance.DbtSearch();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DbtSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DbtSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<DbtSearchResponse>> response = apiInstance.DbtSearchWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DbtSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;DbtSearchResponse&gt;**](DbtSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved list of DBT connections successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deactivateuser"></a>
# **DeactivateUser**
> ResponseActivationURL DeactivateUser (DeactivateUserRequest deactivateUserRequest)



  Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeactivateUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deactivateUserRequest = new DeactivateUserRequest(); // DeactivateUserRequest | 

            try
            {
                ResponseActivationURL result = apiInstance.DeactivateUser(deactivateUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeactivateUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeactivateUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseActivationURL> response = apiInstance.DeactivateUserWithHttpInfo(deactivateUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeactivateUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deactivateUserRequest** | [**DeactivateUserRequest**](DeactivateUserRequest.md) |  |  |

### Return type

[**ResponseActivationURL**](ResponseActivationURL.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deactivated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletecalendar"></a>
# **DeleteCalendar**
> void DeleteCalendar (string calendarIdentifier)



  Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteCalendarExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var calendarIdentifier = "calendarIdentifier_example";  // string | Unique ID or name of the Calendar.

            try
            {
                apiInstance.DeleteCalendar(calendarIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteCalendar: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteCalendarWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteCalendarWithHttpInfo(calendarIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteCalendarWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **calendarIdentifier** | **string** | Unique ID or name of the Calendar. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom calendar successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletecollection"></a>
# **DeleteCollection**
> CollectionDeleteResponse DeleteCollection (DeleteCollectionRequest deleteCollectionRequest)



  Version: 26.4.0.cl or later   Deletes one or more collections from ThoughtSpot.  #### Delete options  * **delete_children**: When set to `true`, deletes the child objects (metadata items) within the collection that the user has access to. Objects that the user does not have permission to delete will be skipped. * **dry_run**: When set to `true`, performs a preview of the deletion operation without actually deleting anything. The response shows what would be deleted, allowing you to review before committing the deletion.  #### Response  The response includes: * **metadata_deleted**: List of metadata objects that were successfully deleted * **metadata_skipped**: List of metadata objects that were skipped due to lack of permissions or other constraints      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteCollectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteCollectionRequest = new DeleteCollectionRequest(); // DeleteCollectionRequest | 

            try
            {
                CollectionDeleteResponse result = apiInstance.DeleteCollection(deleteCollectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteCollection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteCollectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CollectionDeleteResponse> response = apiInstance.DeleteCollectionWithHttpInfo(deleteCollectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteCollectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteCollectionRequest** | [**DeleteCollectionRequest**](DeleteCollectionRequest.md) |  |  |

### Return type

[**CollectionDeleteResponse**](CollectionDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collections deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Resource not found. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteconfig"></a>
# **DeleteConfig**
> void DeleteConfig (DeleteConfigRequest deleteConfigRequest)



  Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteConfigRequest = new DeleteConfigRequest(); // DeleteConfigRequest | 

            try
            {
                apiInstance.DeleteConfig(deleteConfigRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteConfigWithHttpInfo(deleteConfigRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteConfigRequest** | [**DeleteConfigRequest**](DeleteConfigRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteconnection"></a>
# **DeleteConnection**
> void DeleteConnection (DeleteConnectionRequest deleteConnectionRequest)



  Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteConnectionRequest = new DeleteConnectionRequest(); // DeleteConnectionRequest | 

            try
            {
                apiInstance.DeleteConnection(deleteConnectionRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteConnectionWithHttpInfo(deleteConnectionRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteConnectionRequest** | [**DeleteConnectionRequest**](DeleteConnectionRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteconnectionconfiguration"></a>
# **DeleteConnectionConfiguration**
> void DeleteConnectionConfiguration (DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteConnectionConfigurationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteConnectionConfigurationRequest = new DeleteConnectionConfigurationRequest(); // DeleteConnectionConfigurationRequest | 

            try
            {
                apiInstance.DeleteConnectionConfiguration(deleteConnectionConfigurationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConnectionConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteConnectionConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteConnectionConfigurationWithHttpInfo(deleteConnectionConfigurationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConnectionConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteConnectionConfigurationRequest** | [**DeleteConnectionConfigurationRequest**](DeleteConnectionConfigurationRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection Configurations successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteconnectionv2"></a>
# **DeleteConnectionV2**
> void DeleteConnectionV2 (string connectionIdentifier)



  Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteConnectionV2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | Unique ID or name of the connection.

            try
            {
                apiInstance.DeleteConnectionV2(connectionIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConnectionV2: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteConnectionV2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteConnectionV2WithHttpInfo(connectionIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConnectionV2WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | Unique ID or name of the connection. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteconversation"></a>
# **DeleteConversation**
> void DeleteConversation (string conversationIdentifier)



 Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires `CAN_USE_SPOTTER` privilege and ownership of the conversation being deleted.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation to delete, as returned by `createAgentConversation` or `getConversationList`  A successful request returns an empty `204 No Content` response. The deleted conversation no longer appears in `getConversationList`.  #### Example request  ```bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete ```  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given `conversation_identifier` for the authenticated user. |  > ###### Note: > > - Deletion is permanent and cannot be undone. Ensure the correct `conversation_identifier` is used before calling this endpoint. > - Only conversations created with `enable_save_chat: true` are persisted and can be deleted via this endpoint. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteConversationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier of the conversation to delete.

            try
            {
                apiInstance.DeleteConversation(conversationIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConversation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteConversationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteConversationWithHttpInfo(conversationIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteConversationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier of the conversation to delete. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted the agent conversation. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletecustomaction"></a>
# **DeleteCustomAction**
> void DeleteCustomAction (string customActionIdentifier)



  Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteCustomActionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var customActionIdentifier = "customActionIdentifier_example";  // string | Unique ID or name of the custom action.

            try
            {
                apiInstance.DeleteCustomAction(customActionIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteCustomAction: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteCustomActionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteCustomActionWithHttpInfo(customActionIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteCustomActionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **customActionIdentifier** | **string** | Unique ID or name of the custom action. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom action is successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletedbtconnection"></a>
# **DeleteDbtConnection**
> void DeleteDbtConnection (string dbtConnectionIdentifier)



  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteDbtConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT Connection.

            try
            {
                apiInstance.DeleteDbtConnection(dbtConnectionIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteDbtConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteDbtConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteDbtConnectionWithHttpInfo(dbtConnectionIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteDbtConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT Connection. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | DBT Connection successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteemailcustomization"></a>
# **DeleteEmailCustomization**
> void DeleteEmailCustomization (string templateIdentifier)



 Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `template_identifier` from the response. - Use that `template_identifier` as a parameter in this API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var templateIdentifier = "templateIdentifier_example";  // string | Unique ID or name of the email customization.

            try
            {
                apiInstance.DeleteEmailCustomization(templateIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteEmailCustomizationWithHttpInfo(templateIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateIdentifier** | **string** | Unique ID or name of the email customization. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Email Customization configuration successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletemanualtranslations"></a>
# **DeleteManualTranslations**
> void DeleteManualTranslations (DeleteManualTranslationsRequest deleteManualTranslationsRequest)



 Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to `ORG` scope if not specified. - Set `scope` to `CLUSTER` to delete translations uploaded in the All-Org context.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteManualTranslationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteManualTranslationsRequest = new DeleteManualTranslationsRequest(); // DeleteManualTranslationsRequest | 

            try
            {
                apiInstance.DeleteManualTranslations(deleteManualTranslationsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteManualTranslations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteManualTranslationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteManualTranslationsWithHttpInfo(deleteManualTranslationsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteManualTranslationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteManualTranslationsRequest** | [**DeleteManualTranslationsRequest**](DeleteManualTranslationsRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted manual translations. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletemetadata"></a>
# **DeleteMetadata**
> void DeleteMetadata (DeleteMetadataRequest deleteMetadataRequest)



  Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteMetadataRequest = new DeleteMetadataRequest(); // DeleteMetadataRequest | 

            try
            {
                apiInstance.DeleteMetadata(deleteMetadataRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteMetadataWithHttpInfo(deleteMetadataRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteMetadataRequest** | [**DeleteMetadataRequest**](DeleteMetadataRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Metadata objects successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteorg"></a>
# **DeleteOrg**
> void DeleteOrg (string orgIdentifier)



  Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteOrgExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var orgIdentifier = "orgIdentifier_example";  // string | ID or name of the Org

            try
            {
                apiInstance.DeleteOrg(orgIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteOrg: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteOrgWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteOrgWithHttpInfo(orgIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteOrgWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **orgIdentifier** | **string** | ID or name of the Org |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Organization successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteorgemailcustomization"></a>
# **DeleteOrgEmailCustomization**
> void DeleteOrgEmailCustomization (DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `org_identifier` from the response. - Use that `org_identifier` as a parameter in this API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteOrgEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteOrgEmailCustomizationRequest = new DeleteOrgEmailCustomizationRequest(); // DeleteOrgEmailCustomizationRequest | 

            try
            {
                apiInstance.DeleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteOrgEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteOrgEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteOrgEmailCustomizationWithHttpInfo(deleteOrgEmailCustomizationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteOrgEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteOrgEmailCustomizationRequest** | [**DeleteOrgEmailCustomizationRequest**](DeleteOrgEmailCustomizationRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Email Customization configuration successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleterole"></a>
# **DeleteRole**
> void DeleteRole (string roleIdentifier)



  Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteRoleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var roleIdentifier = "roleIdentifier_example";  // string | Unique ID or name of the Role. ReadOnly roles cannot be deleted.

            try
            {
                apiInstance.DeleteRole(roleIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteRole: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteRoleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteRoleWithHttpInfo(roleIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteRoleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **roleIdentifier** | **string** | Unique ID or name of the Role. ReadOnly roles cannot be deleted. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Role successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteschedule"></a>
# **DeleteSchedule**
> void DeleteSchedule (string scheduleIdentifier)



 Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteScheduleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var scheduleIdentifier = "scheduleIdentifier_example";  // string | Unique ID or name of the scheduled job.

            try
            {
                apiInstance.DeleteSchedule(scheduleIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteSchedule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteScheduleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteScheduleWithHttpInfo(scheduleIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteScheduleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **scheduleIdentifier** | **string** | Unique ID or name of the scheduled job. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Schedule successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletestylefonts"></a>
# **DeleteStyleFonts**
> StyleFontDeleteData DeleteStyleFonts (DeleteStyleFontsRequest deleteStyleFontsRequest)



  Version: 26.7.0.cl or later   Deletes one or more custom fonts from the cluster-level or org-level font library. If a deleted font is assigned to visualization areas, those assignments automatically fallback to the cluster/system default font. The response lists all affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually delete fonts, you must explicitly pass dry_run: false.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Provide one or more font UUIDs or names in `font_identifiers`. - Set `scope` to `CLUSTER` to delete from the cluster-level library. Set `scope` to `ORG` (default) to delete from the authenticated user's org library. - Use `dry_run: true` to preview which visualization areas would be affected without actually deleting the font. The response lists affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the font file using `uploadStyleFont` if needed.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteStyleFontsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteStyleFontsRequest = new DeleteStyleFontsRequest(); // DeleteStyleFontsRequest | 

            try
            {
                StyleFontDeleteData result = apiInstance.DeleteStyleFonts(deleteStyleFontsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteStyleFonts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteStyleFontsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<StyleFontDeleteData> response = apiInstance.DeleteStyleFontsWithHttpInfo(deleteStyleFontsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteStyleFontsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteStyleFontsRequest** | [**DeleteStyleFontsRequest**](DeleteStyleFontsRequest.md) |  |  |

### Return type

[**StyleFontDeleteData**](StyleFontDeleteData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Font deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletetag"></a>
# **DeleteTag**
> void DeleteTag (string tagIdentifier)



  Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteTagExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var tagIdentifier = "tagIdentifier_example";  // string | Tag identifier Tag name or Tag id.

            try
            {
                apiInstance.DeleteTag(tagIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteTag: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteTagWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteTagWithHttpInfo(tagIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteTagWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tagIdentifier** | **string** | Tag identifier Tag name or Tag id. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Tag successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteuser"></a>
# **DeleteUser**
> void DeleteUser (string userIdentifier)



  Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var userIdentifier = "userIdentifier_example";  // string | GUID / name of the user

            try
            {
                apiInstance.DeleteUser(userIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteUserWithHttpInfo(userIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userIdentifier** | **string** | GUID / name of the user |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deleteusergroup"></a>
# **DeleteUserGroup**
> void DeleteUserGroup (string groupIdentifier)



  Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteUserGroupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var groupIdentifier = "groupIdentifier_example";  // string | GUID or name of the group.

            try
            {
                apiInstance.DeleteUserGroup(groupIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteUserGroup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteUserGroupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteUserGroupWithHttpInfo(groupIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteUserGroupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **groupIdentifier** | **string** | GUID or name of the group. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User group successfully deleted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletevariable"></a>
# **DeleteVariable**
> void DeleteVariable (string identifier)



 Delete a variable    Version: 10.14.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/template/variables/delete](/api/rest/2.0/template/variables/delete) instead.  Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn't exist * The variable is being used by other objects      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteVariableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var identifier = "identifier_example";  // string | Unique id or name of the variable

            try
            {
                apiInstance.DeleteVariable(identifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteVariable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteVariableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteVariableWithHttpInfo(identifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteVariableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **identifier** | **string** | Unique id or name of the variable |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleting the variable is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletevariables"></a>
# **DeleteVariables**
> void DeleteVariables (DeleteVariablesRequest deleteVariablesRequest)



 Delete variable(s)    Version: 26.4.0.cl or later   Allows deleting multiple variables from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifiers (IDs or names)  The operation will fail if: * The user lacks required permissions * Any of the variables don't exist * Any of the variables are being used by other objects      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteVariablesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteVariablesRequest = new DeleteVariablesRequest(); // DeleteVariablesRequest | 

            try
            {
                apiInstance.DeleteVariables(deleteVariablesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteVariables: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteVariablesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.DeleteVariablesWithHttpInfo(deleteVariablesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteVariablesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteVariablesRequest** | [**DeleteVariablesRequest**](DeleteVariablesRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deletion of variable(s) is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletewebhookconfigurations"></a>
# **DeleteWebhookConfigurations**
> WebhookDeleteResponse DeleteWebhookConfigurations (DeleteWebhookConfigurationsRequest deleteWebhookConfigurationsRequest)



  Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeleteWebhookConfigurationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deleteWebhookConfigurationsRequest = new DeleteWebhookConfigurationsRequest(); // DeleteWebhookConfigurationsRequest | 

            try
            {
                WebhookDeleteResponse result = apiInstance.DeleteWebhookConfigurations(deleteWebhookConfigurationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteWebhookConfigurations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteWebhookConfigurationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<WebhookDeleteResponse> response = apiInstance.DeleteWebhookConfigurationsWithHttpInfo(deleteWebhookConfigurationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeleteWebhookConfigurationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deleteWebhookConfigurationsRequest** | [**DeleteWebhookConfigurationsRequest**](DeleteWebhookConfigurationsRequest.md) |  |  |

### Return type

[**WebhookDeleteResponse**](WebhookDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook configurations deleted successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deploycommit"></a>
# **DeployCommit**
> List&lt;DeployResponse&gt; DeployCommit (DeployCommitRequest deployCommitRequest)



  Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DeployCommitExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var deployCommitRequest = new DeployCommitRequest(); // DeployCommitRequest | 

            try
            {
                List<DeployResponse> result = apiInstance.DeployCommit(deployCommitRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DeployCommit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeployCommitWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<DeployResponse>> response = apiInstance.DeployCommitWithHttpInfo(deployCommitRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DeployCommitWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deployCommitRequest** | [**DeployCommitRequest**](DeployCommitRequest.md) |  |  |

### Return type

[**List&lt;DeployResponse&gt;**](DeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deployed the changes |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="downloadconnectionmetadatachanges"></a>
# **DownloadConnectionMetadataChanges**
> FileParameter DownloadConnectionMetadataChanges (string connectionIdentifier)



  Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class DownloadConnectionMetadataChangesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | GUID of the connection

            try
            {
                FileParameter result = apiInstance.DownloadConnectionMetadataChanges(connectionIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.DownloadConnectionMetadataChanges: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DownloadConnectionMetadataChangesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.DownloadConnectionMetadataChangesWithHttpInfo(connectionIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.DownloadConnectionMetadataChangesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | GUID of the connection |  |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export metadata changes. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportanswerreport"></a>
# **ExportAnswerReport**
> FileParameter ExportAnswerReport (ExportAnswerReportRequest exportAnswerReportRequest)



  Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is not enabled, the `DATADOWNLOADING` (**Can download Data**) privilege is required. If RBAC is enabled, the required download privilege depends on the selected `file_format`: `CSV`, `XLSX`, and `PDF` require the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege, and `PNG` requires the `CAN_DOWNLOAD_VISUALS` (**Can download visuals**) privilege. For an Answer, the `PDF` export is a table PDF, which is why it falls under `CAN_DOWNLOAD_DETAILED_DATA` rather than `CAN_DOWNLOAD_VISUALS`.  #### Usage guidelines  In the request body, specify the GUID or name of the Answer and set `file_format`. The default file format is CSV.  Use the `type` parameter to specify whether the Answer being exported is a saved Answer (`SAVED`) or a pinned Answer on a Liveboard (`PINNED`). Defaults to `SAVED`. When using `PINNED`, the `metadata_identifier` must be the container id.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ExportAnswerReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var exportAnswerReportRequest = new ExportAnswerReportRequest(); // ExportAnswerReportRequest | 

            try
            {
                FileParameter result = apiInstance.ExportAnswerReport(exportAnswerReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ExportAnswerReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportAnswerReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.ExportAnswerReportWithHttpInfo(exportAnswerReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ExportAnswerReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportAnswerReportRequest** | [**ExportAnswerReportRequest**](ExportAnswerReportRequest.md) |  |  |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export report file of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportliveboardreport"></a>
# **ExportLiveboardReport**
> FileParameter ExportLiveboardReport (ExportLiveboardReportRequest exportLiveboardReportRequest)



  Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF, PNG, CSV, or XLSX file format. The default `file_format` is CSV.  Requires at least view access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is not enabled, the `DATADOWNLOADING` (**Can download Data**) privilege is required. If RBAC is enabled, the required download privilege depends on the selected `file_format`: `CSV` and `XLSX` require the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege, and `PNG` and `PDF` require the `CAN_DOWNLOAD_VISUALS` (**Can download visuals**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  **NOTE**:   * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  * Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  * To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).   * Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in the PNG format in the resolution of your choice. To enable this on your instance, contact ThoughtSpot support. When this feature is enabled, the options `include_cover_page`,`include_filter_page` within the `png_options` will not be available for PNG exports.  * Starting with the ThoughtSpot Cloud 26.2.0.cl release,    * Liveboards can be exported in CSV format.      * All visualizations within a Liveboard can be exported as individual CSV files.      * When exporting multiple visualizations or the entire Liveboard, the system returns the report as a compressed ZIP file containing the separate CSV files for each visualization.    * Liveboards can also be exported in XLSX format.      * All selected visualizations are consolidated into a single Excel workbook (.xlsx), with each visualization placed in its own worksheet (tab).      * XLSX exports are limited to a maximum of 255 worksheets (tabs) per workbook.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ExportLiveboardReportExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var exportLiveboardReportRequest = new ExportLiveboardReportRequest(); // ExportLiveboardReportRequest | 

            try
            {
                FileParameter result = apiInstance.ExportLiveboardReport(exportLiveboardReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ExportLiveboardReport: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportLiveboardReportWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.ExportLiveboardReportWithHttpInfo(exportLiveboardReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ExportLiveboardReportWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportLiveboardReportRequest** | [**ExportLiveboardReportRequest**](ExportLiveboardReportRequest.md) |  |  |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export report file of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportmanualtranslations"></a>
# **ExportManualTranslations**
> FileParameter ExportManualTranslations (ExportManualTranslationsRequest exportManualTranslationsRequest)



 Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: `content`, `locale`, `translated-content`. - Defaults to `ORG` scope if not specified. - Set `scope` to `CLUSTER` to export translations from the All-Org context. - Returns a `404` error if no translations exist for the targeted org or cluster scope.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ExportManualTranslationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var exportManualTranslationsRequest = new ExportManualTranslationsRequest(); // ExportManualTranslationsRequest | 

            try
            {
                FileParameter result = apiInstance.ExportManualTranslations(exportManualTranslationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ExportManualTranslations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportManualTranslationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.ExportManualTranslationsWithHttpInfo(exportManualTranslationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ExportManualTranslationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportManualTranslationsRequest** | [**ExportManualTranslationsRequest**](ExportManualTranslationsRequest.md) |  |  |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CSV file downloaded successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | No translations file found. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportmetadatatml"></a>
# **ExportMetadataTML**
> List&lt;Object&gt; ExportMetadataTML (ExportMetadataTMLRequest exportMetadataTMLRequest)



  Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as `identifier`, and set the `type` as `FEEDBACK` in the `metadata` array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as `identifier`, set the `type` as `LOGIAL_TABLE` in the `metadata` array, and set `export_with_associated_feedbacks` in `export_options` to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ExportMetadataTMLExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var exportMetadataTMLRequest = new ExportMetadataTMLRequest(); // ExportMetadataTMLRequest | 

            try
            {
                List<Object> result = apiInstance.ExportMetadataTML(exportMetadataTMLRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ExportMetadataTML: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportMetadataTMLWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Object>> response = apiInstance.ExportMetadataTMLWithHttpInfo(exportMetadataTMLRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ExportMetadataTMLWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportMetadataTMLRequest** | [**ExportMetadataTMLRequest**](ExportMetadataTMLRequest.md) |  |  |

### Return type

**List<Object>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export TMLs of specified metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportmetadatatmlbatched"></a>
# **ExportMetadataTMLBatched**
> Object ExportMetadataTMLBatched (ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest)



  Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires `DATAMANAGEMENT` (**Can manage data**) and `USERMANAGEMENT` (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for `USER`, `GROUP`, and `ROLES` metadata types.  - `batch_offset` Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - `batch_size` Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - `edoc_format` Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - `export_dependent` Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - `all_orgs_override` Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ExportMetadataTMLBatchedExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var exportMetadataTMLBatchedRequest = new ExportMetadataTMLBatchedRequest(); // ExportMetadataTMLBatchedRequest | 

            try
            {
                Object result = apiInstance.ExportMetadataTMLBatched(exportMetadataTMLBatchedRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ExportMetadataTMLBatched: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportMetadataTMLBatchedWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.ExportMetadataTMLBatchedWithHttpInfo(exportMetadataTMLBatchedRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ExportMetadataTMLBatchedWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportMetadataTMLBatchedRequest** | [**ExportMetadataTMLBatchedRequest**](ExportMetadataTMLBatchedRequest.md) |  |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export TMLs of specified metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="exportstylelogos"></a>
# **ExportStyleLogos**
> FileParameter ExportStyleLogos (ExportStyleLogosRequest exportStyleLogosRequest, string? accept = null)



  Version: 26.7.0.cl or later   Downloads the active logos (default and wide slots) at the requested scope as a single ZIP archive containing both logo image files. If no custom logo has been uploaded at the ORG scope, the archive contains the resolved logo falling through from the cluster. If no cluster logo has been uploaded, no file is returned.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to download cluster-level logos. - Set `scope` to `ORG` (default) to download logos for the authenticated user's org. - The response is a ZIP archive (`application/zip`). Save the response body directly to a `.zip` file. - The archive always contains two files — one for the DEFAULT slot and one for the WIDE slot — even if no custom logo is set at the requested scope.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ExportStyleLogosExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var exportStyleLogosRequest = new ExportStyleLogosRequest(); // ExportStyleLogosRequest | 
            var accept = "application/zip";  // string? |  (optional)  (default to application/zip)

            try
            {
                FileParameter result = apiInstance.ExportStyleLogos(exportStyleLogosRequest, accept);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ExportStyleLogos: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportStyleLogosWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FileParameter> response = apiInstance.ExportStyleLogosWithHttpInfo(exportStyleLogosRequest, accept);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ExportStyleLogosWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportStyleLogosRequest** | [**ExportStyleLogosRequest**](ExportStyleLogosRequest.md) |  |  |
| **accept** | **string?** |  | [optional] [default to application/zip] |

### Return type

[**FileParameter**](FileParameter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Logo ZIP archive retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchanswerdata"></a>
# **FetchAnswerData**
> AnswerDataResponse FetchAnswerData (FetchAnswerDataRequest fetchAnswerDataRequest)



  Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege is also required.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchAnswerDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchAnswerDataRequest = new FetchAnswerDataRequest(); // FetchAnswerDataRequest | 

            try
            {
                AnswerDataResponse result = apiInstance.FetchAnswerData(fetchAnswerDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchAnswerData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchAnswerDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AnswerDataResponse> response = apiInstance.FetchAnswerDataWithHttpInfo(fetchAnswerDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchAnswerDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchAnswerDataRequest** | [**FetchAnswerDataRequest**](FetchAnswerDataRequest.md) |  |  |

### Return type

[**AnswerDataResponse**](AnswerDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching data of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchanswersqlquery"></a>
# **FetchAnswerSqlQuery**
> SqlQueryResponse FetchAnswerSqlQuery (FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest)



  Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchAnswerSqlQueryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchAnswerSqlQueryRequest = new FetchAnswerSqlQueryRequest(); // FetchAnswerSqlQueryRequest | 

            try
            {
                SqlQueryResponse result = apiInstance.FetchAnswerSqlQuery(fetchAnswerSqlQueryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchAnswerSqlQuery: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchAnswerSqlQueryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SqlQueryResponse> response = apiInstance.FetchAnswerSqlQueryWithHttpInfo(fetchAnswerSqlQueryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchAnswerSqlQueryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchAnswerSqlQueryRequest** | [**FetchAnswerSqlQueryRequest**](FetchAnswerSqlQueryRequest.md) |  |  |

### Return type

[**SqlQueryResponse**](SqlQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching SQL query of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchasyncimporttaskstatus"></a>
# **FetchAsyncImportTaskStatus**
> GetAsyncImportStatusResponse FetchAsyncImportTaskStatus (FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest)



  Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchAsyncImportTaskStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchAsyncImportTaskStatusRequest = new FetchAsyncImportTaskStatusRequest(); // FetchAsyncImportTaskStatusRequest | 

            try
            {
                GetAsyncImportStatusResponse result = apiInstance.FetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchAsyncImportTaskStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchAsyncImportTaskStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<GetAsyncImportStatusResponse> response = apiInstance.FetchAsyncImportTaskStatusWithHttpInfo(fetchAsyncImportTaskStatusRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchAsyncImportTaskStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchAsyncImportTaskStatusRequest** | [**FetchAsyncImportTaskStatusRequest**](FetchAsyncImportTaskStatusRequest.md) |  |  |

### Return type

[**GetAsyncImportStatusResponse**](GetAsyncImportStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Async TML Import Task statuses fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchcolumnsecurityrules"></a>
# **FetchColumnSecurityRules**
> List&lt;ColumnSecurityRuleResponse&gt; FetchColumnSecurityRules (FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest)



 Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either `identifier` (GUID or name) or `obj_identifier` (object ID) - At least one of `identifier` or `obj_identifier` must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables  #### Example request  ```json {   \"tables\": [     {       \"identifier\": \"table-guid\",       \"obj_identifier\": \"table-object-id\"     }   ] } ```  #### Response format  The API returns an array of `ColumnSecurityRuleResponse` objects wrapped in a `data` field. Each `ColumnSecurityRuleResponse` object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  ```json {   \"data\": [     {       \"guid\": \"table-guid\",       \"objId\": \"table-object-id\",       \"columnSecurityRules\": [         {           \"column\": {             \"id\": \"col_123\",             \"name\": \"Salary\"           },           \"groups\": [             {               \"id\": \"group_1\",               \"name\": \"HR Department\"             }           ],           \"sourceTableDetails\": {             \"id\": \"source-table-guid\",             \"name\": \"Employee_Data\"           }         }       ]     }   ] } ```     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchColumnSecurityRulesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchColumnSecurityRulesRequest = new FetchColumnSecurityRulesRequest(); // FetchColumnSecurityRulesRequest | 

            try
            {
                List<ColumnSecurityRuleResponse> result = apiInstance.FetchColumnSecurityRules(fetchColumnSecurityRulesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchColumnSecurityRules: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchColumnSecurityRulesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ColumnSecurityRuleResponse>> response = apiInstance.FetchColumnSecurityRulesWithHttpInfo(fetchColumnSecurityRulesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchColumnSecurityRulesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchColumnSecurityRulesRequest** | [**FetchColumnSecurityRulesRequest**](FetchColumnSecurityRulesRequest.md) |  |  |

### Return type

[**List&lt;ColumnSecurityRuleResponse&gt;**](ColumnSecurityRuleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched column security rules |  -  |
| **400** | Bad request - Table not found or invalid parameters |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden - User doesn&#39;t have permission to access security rules for this table |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchconnectiondiffstatus"></a>
# **FetchConnectionDiffStatus**
> FetchConnectionDiffStatusResponse FetchConnectionDiffStatus (string connectionIdentifier)



  Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchConnectionDiffStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | GUID of the connection

            try
            {
                FetchConnectionDiffStatusResponse result = apiInstance.FetchConnectionDiffStatus(connectionIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchConnectionDiffStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchConnectionDiffStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<FetchConnectionDiffStatusResponse> response = apiInstance.FetchConnectionDiffStatusWithHttpInfo(connectionIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchConnectionDiffStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | GUID of the connection |  |

### Return type

[**FetchConnectionDiffStatusResponse**](FetchConnectionDiffStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | true/false |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchliveboarddata"></a>
# **FetchLiveboardData**
> LiveboardDataResponse FetchLiveboardData (FetchLiveboardDataRequest fetchLiveboardDataRequest)



  Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege is also required.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchLiveboardDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchLiveboardDataRequest = new FetchLiveboardDataRequest(); // FetchLiveboardDataRequest | 

            try
            {
                LiveboardDataResponse result = apiInstance.FetchLiveboardData(fetchLiveboardDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchLiveboardData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchLiveboardDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<LiveboardDataResponse> response = apiInstance.FetchLiveboardDataWithHttpInfo(fetchLiveboardDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchLiveboardDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchLiveboardDataRequest** | [**FetchLiveboardDataRequest**](FetchLiveboardDataRequest.md) |  |  |

### Return type

[**LiveboardDataResponse**](LiveboardDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching data of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchliveboardsqlquery"></a>
# **FetchLiveboardSqlQuery**
> SqlQueryResponse FetchLiveboardSqlQuery (FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest)



  Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchLiveboardSqlQueryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchLiveboardSqlQueryRequest = new FetchLiveboardSqlQueryRequest(); // FetchLiveboardSqlQueryRequest | 

            try
            {
                SqlQueryResponse result = apiInstance.FetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchLiveboardSqlQuery: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchLiveboardSqlQueryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SqlQueryResponse> response = apiInstance.FetchLiveboardSqlQueryWithHttpInfo(fetchLiveboardSqlQueryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchLiveboardSqlQueryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchLiveboardSqlQueryRequest** | [**FetchLiveboardSqlQueryRequest**](FetchLiveboardSqlQueryRequest.md) |  |  |

### Return type

[**SqlQueryResponse**](SqlQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching SQL query of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchlogs"></a>
# **FetchLogs**
> List&lt;LogResponse&gt; FetchLogs (FetchLogsRequest fetchLogsRequest)



  Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchLogsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchLogsRequest = new FetchLogsRequest(); // FetchLogsRequest | 

            try
            {
                List<LogResponse> result = apiInstance.FetchLogs(fetchLogsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchLogs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchLogsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<LogResponse>> response = apiInstance.FetchLogsWithHttpInfo(fetchLogsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchLogsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchLogsRequest** | [**FetchLogsRequest**](FetchLogsRequest.md) |  |  |

### Return type

[**List&lt;LogResponse&gt;**](LogResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Log fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchobjectprivileges"></a>
# **FetchObjectPrivileges**
> ObjectPrivilegesOfMetadataResponse FetchObjectPrivileges (FetchObjectPrivilegesRequest fetchObjectPrivilegesRequest)



  Version: 26.3.0.cl or later   This API fetches the object privileges present for the given list of principals (user or group), on the given set of objects. It supports pagination, which can be enabled and configured using the request parameters. It provides users access to certain features based on privilege based access control.  #### Usage guidelines  - Specify the `type` (`USER` or `USER_GROUP`) and `identifier` (either GUID or name) of the principals for which you want to retrieve object privilege information in the `principals` array. - Specify the `type`  (`LOGICAL_TABLE`)  and `identifier` (either GUID or name) of the metadata objects for which you want to retrieve object privilege information in the `metadata` array. Only `LOGICAL_TABLE` metadata type is supported for now. It may be extended for other metadata types in future. - To control the offset from where principals have to be fetched, use `record_offset`. When `record_offset` is 0, information is fetched from the beginning. - To control the number of principals to be fetched, use `record_size`. Default `record_size` is 20. - Ensure `record_offset` for a subsequent request is one more than the value of `record_size` of the previous request. - Ensure using correct Authorization Bearer Token corresponding to specific user & org.   #### Example request  ```json {   \"principals\": [     {       \"type\": \"type-1\",       \"identifier\": \"principal-guid-or-name-1\"     },     {       \"type\": \"type-2\",       \"identifier\": \"principal-guid-or-name-2\"     }   ],   \"metadata\": [     {       \"type\": \"metadata-type-1\",       \"identifier\": \"metadata-guid-or-name-1\"     },     {       \"type\": \"metadata-type-2\",       \"identifier\": \"metadata-guid-or-name-2\"     }   ],   \"record_offset\": 0,   \"record_size\": 20 } ```   #### Response format  The API returns an array of `metadata_object_privileges` objects wrapped in JSON. Each `metadata_object_privileges` object contains: - Metadata information (GUID, name and type) - Array of `principal_object_privilege_info`. - Each `principal_object_privilege_info` contains:   - Principal type. All principals of this type are listed as described below.   - Array of `principal_object_privileges`.   - Each `principal_object_privileges` contains:     - Principal information (GUID, name, subtype)     - List of applied object level privileges.  #### Example response  ```json {     \"metadata_object_privileges\": [       {         \"metadata_id\": \"metadata-guid-1\",         \"metadata_name\": \"metadata-name-1\",         \"metadata_type\": \"metadata-type-1\",         \"principal_object_privilege_info\": [           {             \"principal_type\": \"principal-type-1\",             \"principal_object_privileges\": [               {                 \"principal_id\": \"principal-guid-1\",                 \"principal_name\": \"principal-name-1\",                 \"principal_sub_type\": \"principal-sub-type-1\",                 \"object_privileges\": \"[object-privilege-1, object-privilege-2]\"               },               {                 \"principal_id\": \"principal-guid-2\",                 \"principal_name\": \"principal-name-2\",                 \"principal_sub_type\": \"principal-sub-type-2\",                 \"object_privileges\": \"[object-privilege-1, object-privilege-2]\"               }             ]           },           {             \"principal_type\": \"principal-type-2\",             \"principal_object_privileges\": [               {                 \"principal_id\": \"principal-guid-3\",                 \"principal_name\": \"principal-guid-4\",                 \"principal_sub_type\": \"principal-sub-type-4\",                 \"object_privileges\": \"[object-privilege-1]\"               }             ]           }         ]       },       {         \"metadata_id\": \"metadata-guid-2\",         \"metadata_name\": \"metadata-name-2\",         \"metadata_type\": \"metadata-type-2\",         \"principal_object_privilege_info\": [           {             \"principal_type\": \"principal-type-1\",             \"principal_object_privileges\": [               {                 \"principal_id\": \"principal-guid-1\",                 \"principal_name\": \"principal-name-1\",                 \"principal_sub_type\": \"principal-sub-type-1\",                 \"object_privileges\": \"[object-privilege-3, object-privilege-4]\"               },               {                 \"principal_id\": \"principal-guid-2\",                 \"principal_name\": \"principal-name-2\",                 \"principal_sub_type\": \"principal-sub-type-2\",                 \"object_privileges\": \"[object-privilege-4]\"               }             ]           }         ]       }     ] } ```     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchObjectPrivilegesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchObjectPrivilegesRequest = new FetchObjectPrivilegesRequest(); // FetchObjectPrivilegesRequest | 

            try
            {
                ObjectPrivilegesOfMetadataResponse result = apiInstance.FetchObjectPrivileges(fetchObjectPrivilegesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchObjectPrivileges: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchObjectPrivilegesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ObjectPrivilegesOfMetadataResponse> response = apiInstance.FetchObjectPrivilegesWithHttpInfo(fetchObjectPrivilegesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchObjectPrivilegesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchObjectPrivilegesRequest** | [**FetchObjectPrivilegesRequest**](FetchObjectPrivilegesRequest.md) |  |  |

### Return type

[**ObjectPrivilegesOfMetadataResponse**](ObjectPrivilegesOfMetadataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching defined object privileges of metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchpermissionsofprincipals"></a>
# **FetchPermissionsOfPrincipals**
> PermissionOfPrincipalsResponse FetchPermissionsOfPrincipals (FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest)



  Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchPermissionsOfPrincipalsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchPermissionsOfPrincipalsRequest = new FetchPermissionsOfPrincipalsRequest(); // FetchPermissionsOfPrincipalsRequest | 

            try
            {
                PermissionOfPrincipalsResponse result = apiInstance.FetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchPermissionsOfPrincipals: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchPermissionsOfPrincipalsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<PermissionOfPrincipalsResponse> response = apiInstance.FetchPermissionsOfPrincipalsWithHttpInfo(fetchPermissionsOfPrincipalsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchPermissionsOfPrincipalsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchPermissionsOfPrincipalsRequest** | [**FetchPermissionsOfPrincipalsRequest**](FetchPermissionsOfPrincipalsRequest.md) |  |  |

### Return type

[**PermissionOfPrincipalsResponse**](PermissionOfPrincipalsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching permissions of principals is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="fetchpermissionsonmetadata"></a>
# **FetchPermissionsOnMetadata**
> PermissionOfMetadataResponse FetchPermissionsOnMetadata (FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest)



  Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class FetchPermissionsOnMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fetchPermissionsOnMetadataRequest = new FetchPermissionsOnMetadataRequest(); // FetchPermissionsOnMetadataRequest | 

            try
            {
                PermissionOfMetadataResponse result = apiInstance.FetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.FetchPermissionsOnMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FetchPermissionsOnMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<PermissionOfMetadataResponse> response = apiInstance.FetchPermissionsOnMetadataWithHttpInfo(fetchPermissionsOnMetadataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.FetchPermissionsOnMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fetchPermissionsOnMetadataRequest** | [**FetchPermissionsOnMetadataRequest**](FetchPermissionsOnMetadataRequest.md) |  |  |

### Return type

[**PermissionOfMetadataResponse**](PermissionOfMetadataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching permissions of metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="forcelogoutusers"></a>
# **ForceLogoutUsers**
> void ForceLogoutUsers (ForceLogoutUsersRequest forceLogoutUsersRequest)



  Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ForceLogoutUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var forceLogoutUsersRequest = new ForceLogoutUsersRequest(); // ForceLogoutUsersRequest | 

            try
            {
                apiInstance.ForceLogoutUsers(forceLogoutUsersRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ForceLogoutUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ForceLogoutUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ForceLogoutUsersWithHttpInfo(forceLogoutUsersRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ForceLogoutUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **forceLogoutUsersRequest** | [**ForceLogoutUsersRequest**](ForceLogoutUsersRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Force logging out of users operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="generatecsv"></a>
# **GenerateCSV**
> Object GenerateCSV (GenerateCSVRequest generateCSVRequest)



  Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \"month offset\" calendars, the start date must match the month defined in the `month_offset` attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GenerateCSVExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var generateCSVRequest = new GenerateCSVRequest(); // GenerateCSVRequest | 

            try
            {
                Object result = apiInstance.GenerateCSV(generateCSVRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GenerateCSV: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GenerateCSVWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.GenerateCSVWithHttpInfo(generateCSVRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GenerateCSVWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **generateCSVRequest** | [**GenerateCSVRequest**](GenerateCSVRequest.md) |  |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Generate custom calendar data based on specifications, as a CSV file. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getagentinstructions"></a>
# **GetAgentInstructions**
> AgentInstructions GetAgentInstructions ()



 Version: 26.6.0.cl or later   Retrieves the admin instructions currently configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations.  Requires admin privileges. Only users with org admin access can retrieve agent instructions.  #### Usage guidelines  No input parameters are required. The API returns the stored `AgentInstructions` record for the caller's tenant and org.  If no instructions have been configured yet, the API returns a record with an empty `instructions` field and `null` values for `id`, `created_at`, `updated_at`, and `last_updated_by`.  If the request is successful, the response includes:  - `id`: unique identifier of the instructions record - `instructions`: the configured instructions text - `created_at`: ISO timestamp when the instructions were first saved - `updated_at`: ISO timestamp when the instructions were last updated - `last_updated_by`: user ID of the admin who last updated the instructions (may be `null` for older records)  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to read agent instructions. |  > ###### Note: > > - Use `setAgentInstructions` to create or update agent instructions. > - Available from version 26.6.0.cl and later.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetAgentInstructionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                AgentInstructions result = apiInstance.GetAgentInstructions();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetAgentInstructions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetAgentInstructionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AgentInstructions> response = apiInstance.GetAgentInstructionsWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetAgentInstructionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**AgentInstructions**](AgentInstructions.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getconversation"></a>
# **GetConversation**
> ConversationMessageResponse GetConversation (string conversationIdentifier)



 Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a `SYSTEM` source are omitted. The full answer payload is not embedded; fetch it separately via `loadAnswer` using the `answer_id` on each `answer` response item. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user's message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via `loadAnswer` using the `answer_id` on each `answer` response item.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` _(path parameter)_: the unique ID of the conversation, as returned by `createAgentConversation` or `getConversationList`.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | - -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `messages`             | `ConversationMessage[]`                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | `code_execution_files` | `CodeExecutionFileMetadata[]`               | List of sanitized file metadata entries (one per `file_id`). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | - -- -- -- -- -- -- -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `message_id`          | `String`                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | `timestamp_in_millis` | `Long`                       | Milliseconds since Unix epoch for the turn.                                                                    | | `user_prompt`         | `UserPrompt`                 | User-authored prompt that started the turn (message and attachments). `null` for liveboard-started synthetic first turns. | | `response_items`      | `ConversationResponseItem[]` | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | - -- -- -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `message`     | `UserMessage`          | User query that started the turn. `null` for liveboard-started synthetic first turns.                | | `attachments` | `UserAttachmentItem[]` | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | - -- -- -- -- -- - | - -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | | `message_id` | `String` | Unique identifier of the user-source message. | | `content`    | `String` | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by `type`. Only `\"file\"` or `\"resource\"` are valid values. Only the fields for the indicated variant are populated. See `ConversationResponseItem` below for the field definitions of the `file` and `resource` variants — `UserAttachmentItem` uses the same fields.  #### ConversationResponseItem fields  Every item carries a `type` discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | - -- -- -- -- -- -- -- -- -- -- | - -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `type`                | `String`  | Discriminator. One of `\"text\"`, `\"tool_call\"`, `\"tool_result\"`, `\"answer\"`, `\"file\"`, `\"resource\"`, `\"search_datasets\"`.       | | `timestamp_in_millis` | `Long`    | Milliseconds since Unix epoch when this item was produced.                                                                     | | `is_thinking`         | `Boolean` | `true` when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | `step_title`          | `String`  | Human-readable label for the agent step producing this item (e.g. `\"Searching\"`, `\"Visualising\"`).                             |  Variant-specific fields:  - **`text`** — agent text output: `content` (String), `content_type` (`ContentMimeType` enum), `file_reference` (FileReference). - **`tool_call`** — agent invoked a tool: `tool_call_id` (String), `tool_name` (String), `arguments` (JSON object). - **`tool_result`** — result returned from a tool invocation: `tool_call_id`, `tool_name`, `content`, `content_type` (`ContentMimeType` enum), `success` (Boolean). - **`answer`** — slim reference to a saved answer: `answer_id` (String), `tool_call_id`, `tool_name`. - **`file`** — uploaded or generated files: `files` (`PublicFileInfo[]`). - **`resource`** — MCP connector resource: `title`, `uri`, `name`, `mime_type`, `description`, `size` (Int), `connector_id`, `connector_name`, `connector_slug`, `transport_type` (`TransportType` enum). - **`search_datasets`** — dataset discovery result: `text` (String), `data_sources` (`DataSourceInfo[]`).  Clients should switch on `type` and ignore unknown variants for forward-compatibility.  #### content_type values  `content_type` is the `ContentMimeType` enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | - -- -- -- -- -- -- -- -- -- -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `TEXT_PLAIN`                | `text/plain`                | Plain text. Default for `tool_result`.               | | `TEXT_MARKDOWN`             | `text/markdown`             | Markdown. Default for `text`.                        | | `TEXT_X_MARKDOWN_WITH_CODE` | `text/x-markdown-with-code` | Markdown whose body starts with a fenced code block. | | `TEXT_HTML`                 | `text/html`                 | Raw HTML.                                            |  #### transport_type values  `transport_type` is the `TransportType` enum used on the `resource` variant.  | Value              | Meaning                                       | | - -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | | `STREAMABLE_HTTP`  | Streamable HTTP transport (default for MCP).  | | `SSE`              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | - -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `file_id`                | `String` | Unique identifier of the code-execution-generated file.      | | `display_name`           | `String` | Human-readable file name.                                    | | `created_time_in_millis` | `Long`   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference `file_id` against `code_execution_files` to retrieve full metadata including the `expired` flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | - -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | `file_id`                | `String` | Unique identifier of the file.                           | | `display_name`           | `String` | Human-readable file name.                                | | `file_type`              | `String` | File type such as `csv`, `pdf`, or `png`.                | | `created_time_in_millis` | `Long`   | Milliseconds since Unix epoch when the file was created. | | `size_bytes`             | `Int`    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the `code_execution_files` array contains:  | Field                    | Type      | Description                                                                                                                     | | - -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | | `file_id`                | `String`  | Unique identifier of the file.                                                                                                  | | `display_name`           | `String`  | Human-readable file name.                                                                                                       | | `file_type`              | `String`  | File type such as `csv`, `pdf`, or `png`.                                                                                       | | `created_time_in_millis` | `Long`    | Milliseconds since Unix epoch when the file was created.                                                                        | | `expired`                | `Boolean` | When `true`, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each `AnswerResponseItem` in the response contains an `answer_id` field. Pass this value as the `answer_identifier` parameter to `loadAnswer` to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages ```  #### Example response  ```json {   \"messages\": [     {       \"message_id\": \"node_u_01\",       \"timestamp_in_millis\": 1744000000000,       \"user_prompt\": {         \"message\": {           \"message_id\": \"msg_u_01\",           \"content\": \"Show me revenue by region as a chart.\"         },         \"attachments\": []       },       \"response_items\": [         {           \"type\": \"tool_call\",           \"tool_call_id\": \"toolu_01ABC\",           \"tool_name\": \"search_datasets\",           \"step_title\": \"Searching datasets\",           \"arguments\": { \"query\": \"revenue\" },           \"timestamp_in_millis\": 1744000001000,           \"is_thinking\": false         },         {           \"type\": \"answer\",           \"answer_id\": \"ans_01XYZ\",           \"tool_call_id\": \"toolu_02DEF\",           \"tool_name\": \"fetch_and_visualize\",           \"step_title\": \"Visualising\",           \"timestamp_in_millis\": 1744000004000,           \"is_thinking\": false         },         {           \"type\": \"text\",           \"content\": \"Revenue is highest in APAC.\",           \"content_type\": \"TEXT_MARKDOWN\",           \"timestamp_in_millis\": 1744000005000,           \"is_thinking\": false,           \"step_title\": null,           \"file_reference\": {             \"file_id\": \"revenue_by_region.csv\",             \"display_name\": \"revenue_by_region.csv\",             \"created_time_in_millis\": 1744027200000           }         }       ]     }   ],   \"code_execution_files\": [     {       \"file_id\": \"revenue_by_region.csv\",       \"display_name\": \"revenue_by_region.csv\",       \"file_type\": \"csv\",       \"created_time_in_millis\": 1744027200000,       \"expired\": false     }   ] } ```  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. `user_prompt` is `null`, and `response_items` contains a single `answer` item referencing the seed visualization.  ```json {   \"messages\": [     {       \"message_id\": \"ROOT_NODE\",       \"timestamp_in_millis\": 1743999000000,       \"user_prompt\": null,       \"response_items\": [         {           \"type\": \"answer\",           \"answer_id\": \"lb_seed_01\",           \"tool_call_id\": null,           \"tool_name\": null,           \"step_title\": null,           \"timestamp_in_millis\": 1743999000000,           \"is_thinking\": false         }       ]     }   ],   \"code_execution_files\": [] } ```  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | - -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  > ###### Note: > > - Messages with an internal `SYSTEM` source are always dropped from the response. > - In-progress turns are still returned with an empty `response_items` array so clients can render the user message immediately. > - Do not assume every `tool_call` has a paired `tool_result` or `answer` — an interrupted conversation can leave a dangling call. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetConversationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier of the conversation to load.

            try
            {
                ConversationMessageResponse result = apiInstance.GetConversation(conversationIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetConversation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetConversationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ConversationMessageResponse> response = apiInstance.GetConversationWithHttpInfo(conversationIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetConversationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier of the conversation to load. |  |

### Return type

[**ConversationMessageResponse**](ConversationMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getconversationlist"></a>
# **GetConversationList**
> AgentConversationHistoryResponse GetConversationList (int? limit = null, int? offset = null, bool? skipEmpty = null)



 Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with `enable_save_chat: true` are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with `enable_save_chat: true` in `createAgentConversation` are returned.  Requires `CAN_USE_SPOTTER` privilege.  #### Usage guidelines  The request supports the following optional query parameters:  - `limit`: maximum number of conversations to return. Use this together with `offset` for pagination. - `offset`: number of conversations to skip before returning results. Defaults to `0`. - `skip_empty`: when `true` (default), conversations with no messages are excluded from the results. Set to `false` to include empty conversations.  If the request is successful, the response includes a `conversations` array. Each entry contains:  - `conversation_identifier`: the unique ID of the conversation, used as input to `sendAgentConversationMessage`, `updateConversation`, `deleteConversation`, `stopConversation`, and `loadAnswer` - `conversation_title`: the display name of the conversation - `created_at`: ISO 8601 timestamp of when the conversation was created - `updated_at`: ISO 8601 timestamp of the most recent update to the conversation - `data_source_identifiers`: list of unique IDs of the data sources associated with the conversation - `data_source_names`: array of `{ id, name }` objects for the data sources associated with the conversation  #### Pagination  Use `limit` and `offset` to page through large result sets:  ``` GET /api/rest/2.0/ai/agent/conversations?limit=20&offset=0   → first page GET /api/rest/2.0/ai/agent/conversations?limit=20&offset=20  → second page ```  #### Pagination and `has_more`  The response includes a `has_more: Boolean` field. When `true`, there are additional conversations beyond the current page — increment `offset` by `limit` to fetch the next page. When `has_more` is `false`, the current page is the last. Note that `total_count` is not returned; use `has_more` to drive paging controls.  #### Example response  ```json {   \"conversations\": [     {       \"conversation_identifier\": \"abc123\",       \"conversation_title\": \"Sales by Region Q1\",       \"created_at\": \"2026-03-01T10:00:00Z\",       \"updated_at\": \"2026-03-05T14:23:00Z\",       \"data_source_identifiers\": [\"ds-001\"],       \"data_source_names\": [{ \"id\": \"ds-001\", \"name\": \"Retail Sales\" }]     }   ],   \"has_more\": false } ```  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege. |  > ###### Note: > > - Only conversations created with `enable_save_chat: true` appear in this list. Conversations created with `enable_save_chat: false` (the default) are not persisted and cannot be retrieved. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetConversationListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var limit = 30;  // int? | Maximum number of conversations to return. Used for pagination. (optional)  (default to 30)
            var offset = 0;  // int? | Number of conversations to skip before returning results. Used for pagination. (optional)  (default to 0)
            var skipEmpty = true;  // bool? | When true, excludes conversations with no messages. Defaults to true. (optional)  (default to true)

            try
            {
                AgentConversationHistoryResponse result = apiInstance.GetConversationList(limit, offset, skipEmpty);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetConversationList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetConversationListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AgentConversationHistoryResponse> response = apiInstance.GetConversationListWithHttpInfo(limit, offset, skipEmpty);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetConversationListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int?** | Maximum number of conversations to return. Used for pagination. | [optional] [default to 30] |
| **offset** | **int?** | Number of conversations to skip before returning results. Used for pagination. | [optional] [default to 0] |
| **skipEmpty** | **bool?** | When true, excludes conversations with no messages. Defaults to true. | [optional] [default to true] |

### Return type

[**AgentConversationHistoryResponse**](AgentConversationHistoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcurrentuserinfo"></a>
# **GetCurrentUserInfo**
> User GetCurrentUserInfo ()



  Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user's privilege and object access permissions.  **NOTE**: In ThoughtSpot, users with cluster administration privileges can access all Orgs by default. However, unless the administrator is explicitly added to an Org, the Orgs list in the session information returned by the API will include only the Primary Org. To include other Orgs in the API response, you must explicitly add the administrator to each Org in the Admin settings page in the UI or via user REST API.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetCurrentUserInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                User result = apiInstance.GetCurrentUserInfo();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetCurrentUserInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCurrentUserInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<User> response = apiInstance.GetCurrentUserInfoWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetCurrentUserInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch current session user detail successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcurrentusertoken"></a>
# **GetCurrentUserToken**
> GetTokenResponse GetCurrentUserToken ()



  Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetCurrentUserTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                GetTokenResponse result = apiInstance.GetCurrentUserToken();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetCurrentUserToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCurrentUserTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<GetTokenResponse> response = apiInstance.GetCurrentUserTokenWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetCurrentUserTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**GetTokenResponse**](GetTokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching token for current user successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcustomaccesstoken"></a>
# **GetCustomAccessToken**
> AccessToken GetCustomAccessToken (GetCustomAccessTokenRequest getCustomAccessTokenRequest)



  Version: 10.4.0.cl or later   Creates an authentication token that provides values for the formula variables in the Row Level Security (RLS) rules for a given user. Recommended for use cases that require Attribute-based access control (ABAC) via RLS.  #### Required privileges  To add a new user and assign privileges during auto-creation, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source are required.  To configure formula variables for all Orgs on your instance or the Primary Org, cluster administration privileges are required. Org administrators can configure formula variables for their respective Orgs. If Role-Based Access Control (RBAC) is enabled, users with the `CAN_MANAGE_VARIABLES` (**Can manage variables**) role privilege can also create and manage variables for their Org context.  #### Usage guidelines  You can generate a token by providing a `username` and `password`, or by using a `secret_key`. To generate a `secret_key`, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: * When both `password` and `secret_key` are included in the API request, `password` takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with `username`  and `password` returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### ABAC via RLS  To implement ABAC via RLS and assign security entitlements to users during session creation, generate a token with custom variable values. The values set in the authentication token are applied to the formula variables referenced in RLS rules at the table level, which determines the data each user can access based on their entitlements.  The variable values can be configured to persist for a specific set of Models in user sessions initiated with the token, allowing different RLS rules to be set for different data models. Once defined, the rules are added to the user's `variable_values` object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/abac-via-rls-variables).  ##### Formula variables Before defining variable values, ensure the variables are created and available on your instance. To create a formula variable, you can use the **Create variable** (`/api/rest/2.0/template/variables/create`) REST API endpoint, with the variable `type` set as `Formula_Variable` in the API request.  The API doesn't support `\"persist_option\": \"RESET\"` and `\"persist_option\": \"NONE\"` when `variable_values` are defined  in the request. If you are using `variable_values` for token generation, you must use other supported persist options such as `APPEND` or `REPLACE`.  If you want to use `RESET` or `NONE`, do not pass any `variable_values`. In such cases, `variable_values` will remain unaffected.  #### Supported objects  The supported object type is `LOGICAL_TABLE`. When using `object_id` with `variable_values`, models are supported.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the username does not exist in ThoughtSpot. If the username already exists in ThoughtSpot and `auto_create` is set to `true`, user properties such as display name, email, Org and group entitlements will not be updated with new values. Setting `auto_create` to `true` does not create formula variables. Hence, this setting will not be applicable to `variable_values`.  #### Important point to note All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as `APPEND` and `REPLACE` will persist `variable_values` on the user profile when the token is created.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetCustomAccessTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var getCustomAccessTokenRequest = new GetCustomAccessTokenRequest(); // GetCustomAccessTokenRequest | 

            try
            {
                AccessToken result = apiInstance.GetCustomAccessToken(getCustomAccessTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetCustomAccessToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCustomAccessTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AccessToken> response = apiInstance.GetCustomAccessTokenWithHttpInfo(getCustomAccessTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetCustomAccessTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getCustomAccessTokenRequest** | [**GetCustomAccessTokenRequest**](GetCustomAccessTokenRequest.md) |  |  |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ABAC token creation was successful. |  -  |
| **400** | Invalid request. This could be due to missing or incorrect parameters. |  -  |
| **401** | Unauthorized access. The request could not be authenticated. |  -  |
| **403** | Forbidden access. The user does not have permission to access this resource. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getdatasourcesuggestions"></a>
# **GetDataSourceSuggestions**
> EurekaDataSourceSuggestionResponse GetDataSourceSuggestions (GetDataSourceSuggestionsRequest getDataSourceSuggestionsRequest)



 Version: 10.15.0.cl or later   Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - `query`: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - `confidence`: a float score indicating the model's confidence in the relevance of the suggestion - `details`: metadata about the data source   - `data_source_identifier`: the unique ID of the data source   - `data_source_name`: the display name of the data source   - `description`: a description of the data source - `reasoning`: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the underlying metadata entities. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetDataSourceSuggestionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var getDataSourceSuggestionsRequest = new GetDataSourceSuggestionsRequest(); // GetDataSourceSuggestionsRequest | 

            try
            {
                EurekaDataSourceSuggestionResponse result = apiInstance.GetDataSourceSuggestions(getDataSourceSuggestionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetDataSourceSuggestions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDataSourceSuggestionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<EurekaDataSourceSuggestionResponse> response = apiInstance.GetDataSourceSuggestionsWithHttpInfo(getDataSourceSuggestionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetDataSourceSuggestionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getDataSourceSuggestionsRequest** | [**GetDataSourceSuggestionsRequest**](GetDataSourceSuggestionsRequest.md) |  |  |

### Return type

[**EurekaDataSourceSuggestionResponse**](EurekaDataSourceSuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getfullaccesstoken"></a>
# **GetFullAccessToken**
> Token GetFullAccessToken (GetFullAccessTokenRequest getFullAccessTokenRequest)



  Version: 9.0.0.cl or later   Generates an authentication token for creating a full session in ThoughtSpot for a given user. Recommended for use cases that do not require Attribute-based access control (ABAC) via Row Level Security (RLS).  #### Usage guidelines  You can generate a token for a user by providing a `username` and `password`, or by using the `secret_key` generated for your instance. To generate a `secret_key`, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: * When both `password` and `secret_key` are included in the API request, `password` takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with `username` and `password` returns an error. You can switch to token-based authentication with  `secret_key` or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `true` if the username does not exist in ThoughtSpot. If the user already exists in ThoughtSpot and `auto_create` is set to `true`, user properties such as display name, email and group assignment will be updated.  To add a new user and assign privileges during auto-creation, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetFullAccessTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var getFullAccessTokenRequest = new GetFullAccessTokenRequest(); // GetFullAccessTokenRequest | 

            try
            {
                Token result = apiInstance.GetFullAccessToken(getFullAccessTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetFullAccessToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetFullAccessTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Token> response = apiInstance.GetFullAccessTokenWithHttpInfo(getFullAccessTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetFullAccessTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getFullAccessTokenRequest** | [**GetFullAccessTokenRequest**](GetFullAccessTokenRequest.md) |  |  |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bearer auth token creation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getmanualtranslationbundle"></a>
# **GetManualTranslationBundle**
> Object GetManualTranslationBundle (string locale)



 Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - `locale` parameter must be a hyphenated locale code (for example, `fr-fr`, `de-de`, `JA-JP`). - Returns a JSON object with a `translations` map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty `translations` map (not an error) if no entries exist at either level.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetManualTranslationBundleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var locale = "locale_example";  // string | Locale code for which to retrieve translations.  For example, `fr-fr`, `de-de`, `JA-JP`.

            try
            {
                Object result = apiInstance.GetManualTranslationBundle(locale);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetManualTranslationBundle: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetManualTranslationBundleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.GetManualTranslationBundleWithHttpInfo(locale);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetManualTranslationBundleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **locale** | **string** | Locale code for which to retrieve translations.  For example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;. |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Translation bundle retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | No translations found for the requested locale. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getnlinstructions"></a>
# **GetNLInstructions**
> EurekaGetNLInstructionsResponse GetNLInstructions (GetNLInstructionsRequest getNLInstructionsRequest)



 Version: 10.15.0.cl or later   Retrieves existing natural language (NL) instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - `data_source_identifier`: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - `nl_instructions_info`: an array of instruction objects, each containing:   - `instructions`: the configured text instructions for AI processing   - `scope`: the scope of the instruction — currently only `GLOBAL` is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Use this API to review currently configured instructions before modifying them with `setNLInstructions`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetNLInstructionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var getNLInstructionsRequest = new GetNLInstructionsRequest(); // GetNLInstructionsRequest | 

            try
            {
                EurekaGetNLInstructionsResponse result = apiInstance.GetNLInstructions(getNLInstructionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetNLInstructions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetNLInstructionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<EurekaGetNLInstructionsResponse> response = apiInstance.GetNLInstructionsWithHttpInfo(getNLInstructionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetNLInstructionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getNLInstructionsRequest** | [**GetNLInstructionsRequest**](GetNLInstructionsRequest.md) |  |  |

### Return type

[**EurekaGetNLInstructionsResponse**](EurekaGetNLInstructionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getobjectaccesstoken"></a>
# **GetObjectAccessToken**
> Token GetObjectAccessToken (GetObjectAccessTokenRequest getObjectAccessTokenRequest)



  Version: 9.0.0.cl or later   Generates an authentication token that provides access to a specific metadata object. This object list is intersected with the list of objects the user is allowed to access via group membership. For more information, see [Object security](https://docs.thoughtspot.com/cloud/latest/security-data-object#object_security).  #### Usage guidelines  You can generate a token for a user by providing a `username` and `password`, or by using the `secret_key` generated for your instance. To generate a `secret_key`, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: * When both `password` and `secret_key` are included in the API request, `password` takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with `username` and `password` returns an error. You can switch to token-based authentication with `secret_key` or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, user properties such as display name, email, and group assignment will be updated.  To add a new user and assign privileges, the `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note  All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetObjectAccessTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var getObjectAccessTokenRequest = new GetObjectAccessTokenRequest(); // GetObjectAccessTokenRequest | 

            try
            {
                Token result = apiInstance.GetObjectAccessToken(getObjectAccessTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetObjectAccessToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetObjectAccessTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Token> response = apiInstance.GetObjectAccessTokenWithHttpInfo(getObjectAccessTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetObjectAccessTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getObjectAccessTokenRequest** | [**GetObjectAccessTokenRequest**](GetObjectAccessTokenRequest.md) |  |  |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bearer auth token creation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getrelevantquestions"></a>
# **GetRelevantQuestions**
> EurekaGetRelevantQuestionsResponse GetRelevantQuestions (GetRelevantQuestionsRequest getRelevantQuestionsRequest)



 Version: 10.13.0.cl or later   Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - `query`: the natural language question to decompose into analytical sub-questions - `metadata_context`: at least one of the following context identifiers to guide question generation:   - `conversation_identifier` — an existing conversation session ID   - `answer_identifiers` — a list of Answer GUIDs   - `liveboard_identifiers` — a list of Liveboard GUIDs   - `data_source_identifiers` — a list of data source GUIDs  Optional parameters for refining the output: - `ai_context`: additional context to improve response quality   - `content` — supplementary text or CSV data as string input   - `instructions` — custom text instructions for the AI system - `limit_relevant_questions`: maximum number of questions to return (default: `5`) - `bypass_cache`: if `true`, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - `query`: the generated sub-question - `data_source_identifier`: the unique ID of the data source the question targets - `data_source_name`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetRelevantQuestionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var getRelevantQuestionsRequest = new GetRelevantQuestionsRequest(); // GetRelevantQuestionsRequest | 

            try
            {
                EurekaGetRelevantQuestionsResponse result = apiInstance.GetRelevantQuestions(getRelevantQuestionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetRelevantQuestions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetRelevantQuestionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<EurekaGetRelevantQuestionsResponse> response = apiInstance.GetRelevantQuestionsWithHttpInfo(getRelevantQuestionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetRelevantQuestionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getRelevantQuestionsRequest** | [**GetRelevantQuestionsRequest**](GetRelevantQuestionsRequest.md) |  |  |

### Return type

[**EurekaGetRelevantQuestionsResponse**](EurekaGetRelevantQuestionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsystemconfig"></a>
# **GetSystemConfig**
> SystemConfig GetSystemConfig ()



  Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetSystemConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                SystemConfig result = apiInstance.GetSystemConfig();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetSystemConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSystemConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SystemConfig> response = apiInstance.GetSystemConfigWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetSystemConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**SystemConfig**](SystemConfig.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster config information. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsysteminformation"></a>
# **GetSystemInformation**
> SystemInfo GetSystemInformation ()



  Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetSystemInformationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                SystemInfo result = apiInstance.GetSystemInformation();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetSystemInformation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSystemInformationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SystemInfo> response = apiInstance.GetSystemInformationWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetSystemInformationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**SystemInfo**](SystemInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster information. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getsystemoverrideinfo"></a>
# **GetSystemOverrideInfo**
> SystemOverrideInfo GetSystemOverrideInfo ()



  Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetSystemOverrideInfoExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                SystemOverrideInfo result = apiInstance.GetSystemOverrideInfo();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetSystemOverrideInfo: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetSystemOverrideInfoWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SystemOverrideInfo> response = apiInstance.GetSystemOverrideInfoWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetSystemOverrideInfoWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**SystemOverrideInfo**](SystemOverrideInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster configuration which can be overridden. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getwebhookstorageconfig"></a>
# **GetWebhookStorageConfig**
> List&lt;WebhookStorageConfigInfo&gt; GetWebhookStorageConfig ()



  Version: 26.7.0.cl or later   Returns cluster-level storage setup information for configuring customer-managed storage. Use this endpoint to obtain the IAM identity details required before configuring a webhook storage destination. For S3 destinations, returns the platform AWS account ID and IAM trust policy template. For GCS destinations, returns the platform GCP service account email and the IAM role to grant for service account impersonation.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class GetWebhookStorageConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                List<WebhookStorageConfigInfo> result = apiInstance.GetWebhookStorageConfig();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.GetWebhookStorageConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetWebhookStorageConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<WebhookStorageConfigInfo>> response = apiInstance.GetWebhookStorageConfigWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.GetWebhookStorageConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;WebhookStorageConfigInfo&gt;**](WebhookStorageConfigInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Storage setup information retrieved successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importmanualtranslations"></a>
# **ImportManualTranslations**
> void ImportManualTranslations (FileParameter translationsFile, string? scope = null)



 Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**), `ORG_ADMINISTRATION` (**Can administer Org**), or `APPLICATION_ADMINISTRATION` (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: `content`, `locale`, `translated-content`. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only `.csv` files are accepted. - The import performs an **upsert**: existing entries matched by `(org_id, locale, content)` are updated; new entries are inserted. Entries not in the upload are left untouched. - Set `scope` to `CLUSTER` to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ImportManualTranslationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var translationsFile = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter | CSV file containing translations. The file must have three columns: `content`, `locale`, `translated-content`. Max file size: 30 MB. Max rows: 10,000.
            var scope = "ORG";  // string? | Org scope for the import. `ORG` (default) targets the calling user's current org. `CLUSTER` targets the All-Org context. (optional)  (default to ORG)

            try
            {
                apiInstance.ImportManualTranslations(translationsFile, scope);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ImportManualTranslations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportManualTranslationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ImportManualTranslationsWithHttpInfo(translationsFile, scope);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ImportManualTranslationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **translationsFile** | **FileParameter****FileParameter** | CSV file containing translations. The file must have three columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. Max file size: 30 MB. Max rows: 10,000. |  |
| **scope** | **string?** | Org scope for the import. &#x60;ORG&#x60; (default) targets the calling user&#39;s current org. &#x60;CLUSTER&#x60; targets the All-Org context. | [optional] [default to ORG] |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully imported manual translations. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importmetadatatml"></a>
# **ImportMetadataTML**
> List&lt;Object&gt; ImportMetadataTML (ImportMetadataTMLRequest importMetadataTMLRequest)



  Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ImportMetadataTMLExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var importMetadataTMLRequest = new ImportMetadataTMLRequest(); // ImportMetadataTMLRequest | 

            try
            {
                List<Object> result = apiInstance.ImportMetadataTML(importMetadataTMLRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ImportMetadataTML: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportMetadataTMLWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Object>> response = apiInstance.ImportMetadataTMLWithHttpInfo(importMetadataTMLRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ImportMetadataTMLWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **importMetadataTMLRequest** | [**ImportMetadataTMLRequest**](ImportMetadataTMLRequest.md) |  |  |

### Return type

**List<Object>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import metadata objects using specified TMLs is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importmetadatatmlasync"></a>
# **ImportMetadataTMLAsync**
> ImportEPackAsyncTaskStatus ImportMetadataTMLAsync (ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest)



  Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ImportMetadataTMLAsyncExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var importMetadataTMLAsyncRequest = new ImportMetadataTMLAsyncRequest(); // ImportMetadataTMLAsyncRequest | 

            try
            {
                ImportEPackAsyncTaskStatus result = apiInstance.ImportMetadataTMLAsync(importMetadataTMLAsyncRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ImportMetadataTMLAsync: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportMetadataTMLAsyncWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ImportEPackAsyncTaskStatus> response = apiInstance.ImportMetadataTMLAsyncWithHttpInfo(importMetadataTMLAsyncRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ImportMetadataTMLAsyncWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **importMetadataTMLAsyncRequest** | [**ImportMetadataTMLAsyncRequest**](ImportMetadataTMLAsyncRequest.md) |  |  |

### Return type

[**ImportEPackAsyncTaskStatus**](ImportEPackAsyncTaskStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Async TML Import Task submitted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importusergroups"></a>
# **ImportUserGroups**
> ImportUserGroupsResponse ImportUserGroups (ImportUserGroupsRequest importUserGroupsRequest)



  Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ImportUserGroupsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var importUserGroupsRequest = new ImportUserGroupsRequest(); // ImportUserGroupsRequest | 

            try
            {
                ImportUserGroupsResponse result = apiInstance.ImportUserGroups(importUserGroupsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ImportUserGroups: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportUserGroupsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ImportUserGroupsResponse> response = apiInstance.ImportUserGroupsWithHttpInfo(importUserGroupsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ImportUserGroupsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **importUserGroupsRequest** | [**ImportUserGroupsRequest**](ImportUserGroupsRequest.md) |  |  |

### Return type

[**ImportUserGroupsResponse**](ImportUserGroupsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import user groups operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="importusers"></a>
# **ImportUsers**
> ImportUsersResponse ImportUsers (ImportUsersRequest importUsersRequest)



  Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ImportUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var importUsersRequest = new ImportUsersRequest(); // ImportUsersRequest | 

            try
            {
                ImportUsersResponse result = apiInstance.ImportUsers(importUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ImportUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ImportUsersResponse> response = apiInstance.ImportUsersWithHttpInfo(importUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ImportUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **importUsersRequest** | [**ImportUsersRequest**](ImportUsersRequest.md) |  |  |

### Return type

[**ImportUsersResponse**](ImportUsersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import users operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="loadanswer"></a>
# **LoadAnswer**
> LoadAnswerResponse LoadAnswer (string conversationIdentifier, string answerIdentifier)



 Loads the full answer payload for a specific answer item in an agent conversation. Returns structured answer data including the TML query, token breakdown, visualization metadata, and agent context state. Pass the `answer_id` from an `AnswerResponseItem` in the `getConversation` response as the `answer_identifier` parameter. Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.    Version: 26.7.0.cl or later   Loads the answer details for a specific answer item in an agent conversation. Returns structured answer data including the TML token list, visualization metadata, and agent context state. Use this endpoint to retrieve the full answer representation for an answer item — for example, to re-render a chart, export a query, or inspect the generated TML.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation, as returned by `createAgentConversation` - `answer_identifier` *(path parameter)*: the `answer_id` field from an `AnswerResponseItem` in the `getConversation` response  If the request is successful, the response contains an `answer` object with the following fields:  | Field | Type | Description | |- -- -- --|- -- -- -|- -- -- -- -- -- --| | `title` | `String` | Display title of the generated answer (e.g., `\"sales by month\"`). | | `description` | `String` | Optional description of the answer. | | `session_identifier` | `String` | Unique identifier of the session in which this answer was generated. | | `generation_number` | `Int` | Generation sequence number of this answer within the session. | | `tokens` | `[String]` | Ordered list of TML token strings that make up the answer query (e.g., `[\"[sales]\", \"[date].'monthly'\"]`). | | `visualization_type` | `VizType` | Suggested visualization type: `Chart`, `Table`, or `Undefined`. `null` if no suggestion is available. | | `formulas` | `[String]` | List of formula names referenced in the answer. Empty if none are used. | | `parameters` | `[String]` | List of parameter names applied to the answer. Empty if none are used. | | `sub_queries` | `[JSON]` | List of sub-query objects used in the answer. Empty if none are present. | | `ac_state` | `ACState` | Agent context state, including `transaction_identifier` and `generation_number`, used to correlate this answer with a specific agent turn. |  #### ACState fields  | Field | Type | Description | |- -- -- --|- -- -- -|- -- -- -- -- -- --| | `transaction_identifier` | `String` | Unique identifier of the agent transaction that produced this answer. | | `generation_number` | `Int` | Generation number within the transaction. |  #### Example request  ```bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details ```  #### Example response  ```json {   \"answer\": {     \"title\": \"sales by month\",     \"description\": \"\",     \"session_identifier\": \"7b00b801-73f4-4639-af5e-e775584ceba6\",     \"generation_number\": 1,     \"tokens\": [\"[sales]\", \"[date].'monthly'\"],     \"visualization_type\": null,     \"formulas\": [],     \"parameters\": [],     \"sub_queries\": [],     \"ac_state\": {       \"transaction_identifier\": \"7f6c9948-b4c7-4098-bb1f-6c67bc0e5699\",       \"generation_number\": 1     }   } } ```  #### Typical usage scenario  1. Call `getConversation` to retrieve the full conversation history. 2. Locate an `AnswerResponseItem` in `response_items` — note its `answer_id` field. 3. Call `loadAnswer` with the `conversation_identifier` and `answer_id` as `answer_identifier`. 4. The returned `tokens` array can be used to open the answer in the ThoughtSpot search interface or rendered as pill chips in the UI.  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation or message exists with the given identifiers for the authenticated user. | | 422  | Unprocessable Entity — the message does not contain an answer of the expected type. |  > ###### Note: > > - This endpoint only loads answer-type messages. Other message types are not supported. > - `visualization_type` may be `null` if the agent did not produce a visualization suggestion for this answer. > - `formulas`, `parameters`, and `sub_queries` are returned as empty arrays when not applicable — they are never `null`. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class LoadAnswerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier of the conversation.
            var answerIdentifier = "answerIdentifier_example";  // string | Unique identifier of the answer to load. Use the `answer_id` field from an `AnswerResponseItem` returned by `getConversation`.

            try
            {
                LoadAnswerResponse result = apiInstance.LoadAnswer(conversationIdentifier, answerIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.LoadAnswer: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LoadAnswerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<LoadAnswerResponse> response = apiInstance.LoadAnswerWithHttpInfo(conversationIdentifier, answerIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.LoadAnswerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier of the conversation. |  |
| **answerIdentifier** | **string** | Unique identifier of the answer to load. Use the &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; returned by &#x60;getConversation&#x60;. |  |

### Return type

[**LoadAnswerResponse**](LoadAnswerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="login"></a>
# **Login**
> void Login (LoginRequest loginRequest)



  Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class LoginExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var loginRequest = new LoginRequest(); // LoginRequest | 

            try
            {
                apiInstance.Login(loginRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.Login: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LoginWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.LoginWithHttpInfo(loginRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.LoginWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **loginRequest** | [**LoginRequest**](LoginRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User login successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="logout"></a>
# **Logout**
> void Logout ()



  Version: 9.0.0.cl or later    Logs out a user from their current session.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class LogoutExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                apiInstance.Logout();
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.Logout: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LogoutWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.LogoutWithHttpInfo();
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.LogoutWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User logout successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="manageobjectprivilege"></a>
# **ManageObjectPrivilege**
> void ManageObjectPrivilege (ManageObjectPrivilegeRequest manageObjectPrivilegeRequest)



  Version: 26.3.0.cl or later   This API allows the addition or deletion of object level privileges for a set of users and groups, on a set of metadata objects. It provides users to access certain features based on privilege based access control.  #### Usage guidelines  - Specify the `operation`. The supported operations are: `ADD`, `REMOVE`. - Specify the type of the objects on which the object privileges are being provided in `metadata_type`. Only `LOGICAL_TABLE` metadata type is supported for now. It may be extended for other metadata types in future. - Specify the list of object privilege types in the `object_privilege_types` array. The supported object privilege types are: `SPOTTER_COACHING_PRIVILEGE`. - Specify the identifiers (either GUID or name) for the metadata objects in the `metadata_identifiers` array. - Specify the `type` (`USER` or `USER_GROUP`) and `identifier` (either GUID or name) of the principals to which you want to apply the given operation and given object privileges in the `principals` array. - Ensure using correct Authorization Bearer Token corresponding to specific user & org.  #### Example request  ```json {   \"operation\": \"operation-type\",   \"metadata_type\": \"metadata-type\",   \"object_privilege_types\": [\"privilege-type-1\", \"privilege-type-2\"],   \"metadata_identifiers\": [\"metadata-guid-or-name-1\", \"metadata-guid-or-name-1\"],   \"principals\": [     {       \"type\": \"type-1\",        \"identifier\": \"principal-guid-or-name-1\"     },     {       \"type\": \"type-2\",       \"identifier\": \"principal-guid-or-name-2\"     }   ] } ```  > ###### Note: > * Only admin users, users with edit access and users with coaching privilege on a given data-model can add or remove principals related to SPOTTER_COACHING_PRIVILEGE       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ManageObjectPrivilegeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var manageObjectPrivilegeRequest = new ManageObjectPrivilegeRequest(); // ManageObjectPrivilegeRequest | 

            try
            {
                apiInstance.ManageObjectPrivilege(manageObjectPrivilegeRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ManageObjectPrivilege: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ManageObjectPrivilegeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ManageObjectPrivilegeWithHttpInfo(manageObjectPrivilegeRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ManageObjectPrivilegeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **manageObjectPrivilegeRequest** | [**ManageObjectPrivilegeRequest**](ManageObjectPrivilegeRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Object privileges added/removed successfully |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized access |  -  |
| **403** | Forbidden access |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="parameterizemetadata"></a>
# **ParameterizeMetadata**
> void ParameterizeMetadata (ParameterizeMetadataRequest parameterizeMetadataRequest)



 Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/metadata/parameterize-fields](/api/rest/2.0/metadata/parameterize-fields) instead.  Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be parameterized.  For Connection Config, the only supported field name is: * impersonate_user      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ParameterizeMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var parameterizeMetadataRequest = new ParameterizeMetadataRequest(); // ParameterizeMetadataRequest | 

            try
            {
                apiInstance.ParameterizeMetadata(parameterizeMetadataRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ParameterizeMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ParameterizeMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ParameterizeMetadataWithHttpInfo(parameterizeMetadataRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ParameterizeMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **parameterizeMetadataRequest** | [**ParameterizeMetadataRequest**](ParameterizeMetadataRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Parameterize successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="parameterizemetadatafields"></a>
# **ParameterizeMetadataFields**
> void ParameterizeMetadataFields (ParameterizeMetadataFieldsRequest parameterizeMetadataFieldsRequest)



 Parameterize multiple fields of metadata objects. For example [schemaName, databaseName] for LOGICAL_TABLE.    Version: 26.5.0.cl or later   Allows parameterizing multiple fields of metadata objects in ThoughtSpot. For example, you can parameterize [schemaName, databaseName] for LOGICAL_TABLE.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table, the field type must be `ATTRIBUTE` and field names can include: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_names specifies the exact properties of the Connection or Connection Config that need to be parameterized.  For Connection Config, supported field names include: * impersonate_user  You can parameterize multiple fields at once by providing an array of field names.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ParameterizeMetadataFieldsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var parameterizeMetadataFieldsRequest = new ParameterizeMetadataFieldsRequest(); // ParameterizeMetadataFieldsRequest | 

            try
            {
                apiInstance.ParameterizeMetadataFields(parameterizeMetadataFieldsRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ParameterizeMetadataFields: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ParameterizeMetadataFieldsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ParameterizeMetadataFieldsWithHttpInfo(parameterizeMetadataFieldsRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ParameterizeMetadataFieldsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **parameterizeMetadataFieldsRequest** | [**ParameterizeMetadataFieldsRequest**](ParameterizeMetadataFieldsRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Parameterize successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="publishmetadata"></a>
# **PublishMetadata**
> void PublishMetadata (PublishMetadataRequest publishMetadataRequest)



  Version: 26.5.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it's dependencies to the org admins of the orgs to which it is being published.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class PublishMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var publishMetadataRequest = new PublishMetadataRequest(); // PublishMetadataRequest | 

            try
            {
                apiInstance.PublishMetadata(publishMetadataRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.PublishMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PublishMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.PublishMetadataWithHttpInfo(publishMetadataRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.PublishMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **publishMetadataRequest** | [**PublishMetadataRequest**](PublishMetadataRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Publishing metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="putvariablevalues"></a>
# **PutVariableValues**
> void PutVariableValues (string identifier, PutVariableValuesRequest putVariableValuesRequest)



 Update values for a variable    Version: 26.4.0.cl or later   Allows updating values for a specific variable in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to the variable * Replacing existing values * Deleting values from the variable * Resetting all values  When updating variable values, you need to specify: * The variable identifier (ID or name) * The values to add/replace/remove * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constraints for the given variable, scope is ignored      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class PutVariableValuesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var identifier = "identifier_example";  // string | Unique ID or name of the variable
            var putVariableValuesRequest = new PutVariableValuesRequest(); // PutVariableValuesRequest | 

            try
            {
                apiInstance.PutVariableValues(identifier, putVariableValuesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.PutVariableValues: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PutVariableValuesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.PutVariableValuesWithHttpInfo(identifier, putVariableValuesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.PutVariableValuesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **identifier** | **string** | Unique ID or name of the variable |  |
| **putVariableValuesRequest** | [**PutVariableValuesRequest**](PutVariableValuesRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Variable values updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="querygetdecomposedquery"></a>
# **QueryGetDecomposedQuery**
> EurekaDecomposeQueryResponse QueryGetDecomposedQuery (QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest)



 Version: 10.7.0.cl or later   **Deprecated** — Use `getRelevantQuestions` instead (available from 10.13.0.cl).  Breaks down a topical or goal-oriented natural language question into smaller, actionable analytical sub-questions, each mapped to a relevant data source for independent execution.  Requires `CAN_USE_SPOTTER` privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request accepts the following parameters:  - `nlsRequest`: contains the user `query` to decompose, along with optional `instructions` and `bypassCache` flag - `worksheetIds`: list of data source identifiers to scope the decomposition - `answerIds`: list of Answer GUIDs whose data guides the response - `liveboardIds`: list of Liveboard GUIDs whose data guides the response - `conversationId`: an existing conversation session ID for context continuity - `content`: supplementary text or CSV data to improve response quality - `maxDecomposedQueries`: maximum number of sub-questions to return (default: `5`)  If the request is successful, the API returns a `decomposedQueryResponse` containing a list of `decomposedQueries`, each with: - `query`: the generated analytical sub-question - `worksheetId`: the unique ID of the data source the question targets - `worksheetName`: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view access to the referenced metadata objects. |  > ###### Note: > * This endpoint is deprecated since 10.13.0.cl. Use `getRelevantQuestions` for new integrations. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class QueryGetDecomposedQueryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var queryGetDecomposedQueryRequest = new QueryGetDecomposedQueryRequest(); // QueryGetDecomposedQueryRequest | 

            try
            {
                EurekaDecomposeQueryResponse result = apiInstance.QueryGetDecomposedQuery(queryGetDecomposedQueryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.QueryGetDecomposedQuery: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QueryGetDecomposedQueryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<EurekaDecomposeQueryResponse> response = apiInstance.QueryGetDecomposedQueryWithHttpInfo(queryGetDecomposedQueryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.QueryGetDecomposedQueryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **queryGetDecomposedQueryRequest** | [**QueryGetDecomposedQueryRequest**](QueryGetDecomposedQueryRequest.md) |  |  |

### Return type

[**EurekaDecomposeQueryResponse**](EurekaDecomposeQueryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="resetuserpassword"></a>
# **ResetUserPassword**
> void ResetUserPassword (ResetUserPasswordRequest resetUserPasswordRequest)



  Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ResetUserPasswordExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var resetUserPasswordRequest = new ResetUserPasswordRequest(); // ResetUserPasswordRequest | 

            try
            {
                apiInstance.ResetUserPassword(resetUserPasswordRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ResetUserPassword: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ResetUserPasswordWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ResetUserPasswordWithHttpInfo(resetUserPasswordRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ResetUserPasswordWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **resetUserPasswordRequest** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User password reset operation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="revertcommit"></a>
# **RevertCommit**
> RevertResponse RevertCommit (string commitId, RevertCommitRequest revertCommitRequest)



  Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class RevertCommitExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var commitId = "commitId_example";  // string | Commit id to which the object should be reverted
            var revertCommitRequest = new RevertCommitRequest(); // RevertCommitRequest | 

            try
            {
                RevertResponse result = apiInstance.RevertCommit(commitId, revertCommitRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.RevertCommit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RevertCommitWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RevertResponse> response = apiInstance.RevertCommitWithHttpInfo(commitId, revertCommitRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.RevertCommitWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **commitId** | **string** | Commit id to which the object should be reverted |  |
| **revertCommitRequest** | [**RevertCommitRequest**](RevertCommitRequest.md) |  |  |

### Return type

[**RevertResponse**](RevertResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reverted the object to the commit point specified |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="revokerefreshtokens"></a>
# **RevokeRefreshTokens**
> RevokeRefreshTokensResponse RevokeRefreshTokens (string connectionIdentifier, RevokeRefreshTokensRequest revokeRefreshTokensRequest)



  Version: 26.2.0.cl or later   Revokes OAuth refresh tokens for users who no longer require access to a data warehouse connection. When a token is revoked, the affected user's session for that connection is terminated, and they must re-authenticate to regain access.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on the ThoughtSpot instance, users with `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege can also make API requests to revoke tokens for connection users.  #### Usage guidelines  You can specify different combinations of identifiers to control which refresh tokens are revoked.  - **connection_identifier**: Revokes refresh tokens for all users of the connection, except the connection author. - **connection_identifier** and **user_identifiers**: Revokes refresh tokens only for the users specified in the request. If the name or ID of the connection author is included in the request, their token will also be revoked. - **connection_identifier** and **configuration_identifiers**: Revokes refresh tokens for all users on the specified configurations, except the configuration author. - **connection_identifier**, **configuration_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users on the specified configurations. - **connection_identifier** and **org_identifiers**: Revokes refresh tokens for the specified Orgs. Applicable only for published connections. - **connection_identifier**, **org_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users in the specified Orgs. Applicable only for published connections.  **NOTE**: The `org_identifiers` parameter is only applicable for published connections. Using this parameter for unpublished connections will result in an error. Ensure that the connections are published before making the API request.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class RevokeRefreshTokensExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | Unique ID or name of the connection whose refresh tokens need to be revoked. All the users associated with the connection will have their refresh tokens revoked except the author.
            var revokeRefreshTokensRequest = new RevokeRefreshTokensRequest(); // RevokeRefreshTokensRequest | 

            try
            {
                RevokeRefreshTokensResponse result = apiInstance.RevokeRefreshTokens(connectionIdentifier, revokeRefreshTokensRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.RevokeRefreshTokens: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RevokeRefreshTokensWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RevokeRefreshTokensResponse> response = apiInstance.RevokeRefreshTokensWithHttpInfo(connectionIdentifier, revokeRefreshTokensRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.RevokeRefreshTokensWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | Unique ID or name of the connection whose refresh tokens need to be revoked. All the users associated with the connection will have their refresh tokens revoked except the author. |  |
| **revokeRefreshTokensRequest** | [**RevokeRefreshTokensRequest**](RevokeRefreshTokensRequest.md) |  |  |

### Return type

[**RevokeRefreshTokensResponse**](RevokeRefreshTokensResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token(s) successfully revoked. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Object not found |  -  |
| **409** | Conflict |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="revoketoken"></a>
# **RevokeToken**
> void RevokeToken (RevokeTokenRequest revokeTokenRequest)



  Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class RevokeTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var revokeTokenRequest = new RevokeTokenRequest(); // RevokeTokenRequest | 

            try
            {
                apiInstance.RevokeToken(revokeTokenRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.RevokeToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RevokeTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.RevokeTokenWithHttpInfo(revokeTokenRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.RevokeTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **revokeTokenRequest** | [**RevokeTokenRequest**](RevokeTokenRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Token successfully revoked. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchauthsettings"></a>
# **SearchAuthSettings**
> SearchAuthSettingsResponse SearchAuthSettings (SearchAuthSettingsRequest searchAuthSettingsRequest)



  Version: 26.6.0.cl or later   Returns the authentication configuration for the specified auth type at cluster and org level. Currently supports `TRUSTED_AUTH`.  #### Required privileges  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `CONTROL_TRUSTED_AUTH` (**Can Enable or Disable Trusted Authentication**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH` privilege is required.  #### Usage guidelines  Use `scope` to control which level of settings are returned: - `CLUSTER` — Returns cluster-level authentication status and access tokens. Accessible only from the Primary Org. - `ORG` — Returns org-level authentication status and access tokens for the current Org. Requires the per-Org authentication feature to be enabled on your instance. - If `scope` is omitted, both cluster and org-level settings are returned based on the caller's org context and feature availability.  The `access_tokens` array in `cluster_preferences` or `org_preferences` is omitted when no token is configured at that level.  **Note**: Access tokens returned in the response are sensitive credentials. Treat them with the same care as passwords.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchAuthSettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchAuthSettingsRequest = new SearchAuthSettingsRequest(); // SearchAuthSettingsRequest | 

            try
            {
                SearchAuthSettingsResponse result = apiInstance.SearchAuthSettings(searchAuthSettingsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchAuthSettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchAuthSettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SearchAuthSettingsResponse> response = apiInstance.SearchAuthSettingsWithHttpInfo(searchAuthSettingsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchAuthSettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchAuthSettingsRequest** | [**SearchAuthSettingsRequest**](SearchAuthSettingsRequest.md) |  |  |

### Return type

[**SearchAuthSettingsResponse**](SearchAuthSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication settings retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcalendars"></a>
# **SearchCalendars**
> List&lt;CalendarResponse&gt; SearchCalendars (SearchCalendarsRequest searchCalendarsRequest)



  Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as `name_pattern` and `sort_options` as search filters.  The `name_pattern` parameter filters and returns only those objects that match the specified pattern. Use `%` as a wildcard for pattern matching.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchCalendarsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchCalendarsRequest = new SearchCalendarsRequest(); // SearchCalendarsRequest | 

            try
            {
                List<CalendarResponse> result = apiInstance.SearchCalendars(searchCalendarsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCalendars: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCalendarsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<CalendarResponse>> response = apiInstance.SearchCalendarsWithHttpInfo(searchCalendarsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCalendarsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCalendarsRequest** | [**SearchCalendarsRequest**](SearchCalendarsRequest.md) |  |  |

### Return type

[**List&lt;CalendarResponse&gt;**](CalendarResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom calendar fetched successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchchannelhistory"></a>
# **SearchChannelHistory**
> SearchChannelHistoryResponse SearchChannelHistory (SearchChannelHistoryRequest searchChannelHistoryRequest)



  Version: 26.4.0.cl or later   Searches delivery history for communication channels such as webhooks. Returns channel-level delivery status for each job execution record. Use this to monitor channel health and delivery success rates across events.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.  **NOTE**: When `channel_type` is `WEBHOOK`, the following constraints apply:  - `job_ids`, `channel_identifiers`, and `events` each accept at most one element. - When `job_ids` is provided, it is used as the sole lookup key and other filter fields are ignored. - When `job_ids` is not provided, `channel_identifiers` and `events` are both required, each containing exactly one element. - Records older than the configured retention period are not returned. - Use `start_epoch_time_in_millis` and/or `end_epoch_time_in_millis` to narrow results to a specific time window.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchChannelHistoryExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchChannelHistoryRequest = new SearchChannelHistoryRequest(); // SearchChannelHistoryRequest | 

            try
            {
                SearchChannelHistoryResponse result = apiInstance.SearchChannelHistory(searchChannelHistoryRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchChannelHistory: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchChannelHistoryWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SearchChannelHistoryResponse> response = apiInstance.SearchChannelHistoryWithHttpInfo(searchChannelHistoryRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchChannelHistoryWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchChannelHistoryRequest** | [**SearchChannelHistoryRequest**](SearchChannelHistoryRequest.md) |  |  |

### Return type

[**SearchChannelHistoryResponse**](SearchChannelHistoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel status logs retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcollections"></a>
# **SearchCollections**
> CollectionSearchResponse SearchCollections (SearchCollectionsRequest searchCollectionsRequest)



  Version: 26.4.0.cl or later   Gets a list of collections available in ThoughtSpot.  To get details of a specific collection, specify the collection GUID or name. You can also filter the API response based on the collection name pattern, author, and other criteria.  #### Search options  * **name_pattern**: Use '%' as a wildcard character to match collection names * **collection_identifiers**: Search for specific collections by their GUIDs or names * **include_metadata**: When set to `true`, includes the metadata objects within each collection in the response  **NOTE**: In addition to the GUID and name, `collection_identifiers` accepts a Custom object ID if one is configured for the collection. The response also includes the `obj_id` field for each collection that has one set.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available collections, set `record_size` to `-1`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchCollectionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchCollectionsRequest = new SearchCollectionsRequest(); // SearchCollectionsRequest | 

            try
            {
                CollectionSearchResponse result = apiInstance.SearchCollections(searchCollectionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCollections: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCollectionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CollectionSearchResponse> response = apiInstance.SearchCollectionsWithHttpInfo(searchCollectionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCollectionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCollectionsRequest** | [**SearchCollectionsRequest**](SearchCollectionsRequest.md) |  |  |

### Return type

[**CollectionSearchResponse**](CollectionSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved list of collections |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcommits"></a>
# **SearchCommits**
> List&lt;CommitHistoryResponse&gt; SearchCommits (SearchCommitsRequest searchCommitsRequest)



  Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchCommitsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchCommitsRequest = new SearchCommitsRequest(); // SearchCommitsRequest | 

            try
            {
                List<CommitHistoryResponse> result = apiInstance.SearchCommits(searchCommitsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCommits: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCommitsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<CommitHistoryResponse>> response = apiInstance.SearchCommitsWithHttpInfo(searchCommitsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCommitsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCommitsRequest** | [**SearchCommitsRequest**](SearchCommitsRequest.md) |  |  |

### Return type

[**List&lt;CommitHistoryResponse&gt;**](CommitHistoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Commit history of the metadata object |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcommunicationchannelpreferences"></a>
# **SearchCommunicationChannelPreferences**
> CommunicationChannelPreferencesResponse SearchCommunicationChannelPreferences (SearchCommunicationChannelPreferencesRequest searchCommunicationChannelPreferencesRequest)



 Version: 10.14.0.cl or later   Fetch communication channel preferences. - Use `cluster_preferences` to fetch the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to fetch any Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchCommunicationChannelPreferencesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchCommunicationChannelPreferencesRequest = new SearchCommunicationChannelPreferencesRequest(); // SearchCommunicationChannelPreferencesRequest | 

            try
            {
                CommunicationChannelPreferencesResponse result = apiInstance.SearchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCommunicationChannelPreferences: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCommunicationChannelPreferencesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CommunicationChannelPreferencesResponse> response = apiInstance.SearchCommunicationChannelPreferencesWithHttpInfo(searchCommunicationChannelPreferencesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCommunicationChannelPreferencesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCommunicationChannelPreferencesRequest** | [**SearchCommunicationChannelPreferencesRequest**](SearchCommunicationChannelPreferencesRequest.md) |  |  |

### Return type

[**CommunicationChannelPreferencesResponse**](CommunicationChannelPreferencesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Communication channel preferences retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchconfig"></a>
# **SearchConfig**
> List&lt;RepoConfigObject&gt; SearchConfig (SearchConfigRequest searchConfigRequest)



  Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchConfigRequest = new SearchConfigRequest(); // SearchConfigRequest | 

            try
            {
                List<RepoConfigObject> result = apiInstance.SearchConfig(searchConfigRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<RepoConfigObject>> response = apiInstance.SearchConfigWithHttpInfo(searchConfigRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchConfigRequest** | [**SearchConfigRequest**](SearchConfigRequest.md) |  |  |

### Return type

[**List&lt;RepoConfigObject&gt;**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchconnection"></a>
# **SearchConnection**
> List&lt;SearchConnectionResponse&gt; SearchConnection (SearchConnectionRequest searchConnectionRequest)



  Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth).   - `KEY_PAIR`: For connections that require Key Pair account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PKCE`: For connections that require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo  connections only.   - `EXTOAUTH_WITH_PKCE`: For connections that require External OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PEZ`: For connections that require OAuth With PEZ account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Amazon Redshift connections only.   - `OAUTH_WITH_SERVICE_PRINCIPAL`: For connections that require OAuth With Service Principal account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `PERSONAL_ACCESS_TOKEN`: For connections that require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `OAUTH_CLIENT_CREDENTIALS`: For connections that require OAuth Client Credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only. - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: In addition to the connection GUID and name, the `identifier` field on each entry in `connections` accepts a Custom object ID if one is configured for the connection. The response also includes the `obj_id` field for each connection that has one set.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchConnectionRequest = new SearchConnectionRequest(); // SearchConnectionRequest | 

            try
            {
                List<SearchConnectionResponse> result = apiInstance.SearchConnection(searchConnectionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<SearchConnectionResponse>> response = apiInstance.SearchConnectionWithHttpInfo(searchConnectionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchConnectionRequest** | [**SearchConnectionRequest**](SearchConnectionRequest.md) |  |  |

### Return type

[**List&lt;SearchConnectionResponse&gt;**](SearchConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of connections to the datasource. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchcustomactions"></a>
# **SearchCustomActions**
> List&lt;ResponseCustomAction&gt; SearchCustomActions (SearchCustomActionsRequest searchCustomActionsRequest)



  Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchCustomActionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchCustomActionsRequest = new SearchCustomActionsRequest(); // SearchCustomActionsRequest | 

            try
            {
                List<ResponseCustomAction> result = apiInstance.SearchCustomActions(searchCustomActionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCustomActions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchCustomActionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ResponseCustomAction>> response = apiInstance.SearchCustomActionsWithHttpInfo(searchCustomActionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchCustomActionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchCustomActionsRequest** | [**SearchCustomActionsRequest**](SearchCustomActionsRequest.md) |  |  |

### Return type

[**List&lt;ResponseCustomAction&gt;**](ResponseCustomAction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom action search is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchdata"></a>
# **SearchData**
> SearchDataResponse SearchData (SearchDataRequest searchDataRequest)



  Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege is also required.  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchDataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchDataRequest = new SearchDataRequest(); // SearchDataRequest | 

            try
            {
                SearchDataResponse result = apiInstance.SearchData(searchDataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchData: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchDataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SearchDataResponse> response = apiInstance.SearchDataWithHttpInfo(searchDataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchDataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchDataRequest** | [**SearchDataRequest**](SearchDataRequest.md) |  |  |

### Return type

[**SearchDataResponse**](SearchDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetching data of specified metadata object is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchemailcustomization"></a>
# **SearchEmailCustomization**
> List&lt;CreateEmailCustomizationResponse&gt; SearchEmailCustomization (SearchEmailCustomizationRequest searchEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchEmailCustomizationRequest = new SearchEmailCustomizationRequest(); // SearchEmailCustomizationRequest | 

            try
            {
                List<CreateEmailCustomizationResponse> result = apiInstance.SearchEmailCustomization(searchEmailCustomizationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<CreateEmailCustomizationResponse>> response = apiInstance.SearchEmailCustomizationWithHttpInfo(searchEmailCustomizationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchEmailCustomizationRequest** | [**SearchEmailCustomizationRequest**](SearchEmailCustomizationRequest.md) |  |  |

### Return type

[**List&lt;CreateEmailCustomizationResponse&gt;**](CreateEmailCustomizationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchmetadata"></a>
# **SearchMetadata**
> List&lt;MetadataSearchResponse&gt; SearchMetadata (SearchMetadataRequest searchMetadataRequest)



  Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To filter metadata objects within type `LOGICAL_TABLE`, set the `subtypes` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE` & subtypes as `[WORKSHEET]`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use `include_discoverable_objects` as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the `liveboard_response_format` as V2. Default value is V1. - To retrieve only objects that are published, set the `include_only_published_objects` as true. Default value is false.  **NOTE**: `obj_identifier` is supported for the following object types: `LIVEBOARD`, `ANSWER`, `LOGICAL_TABLE`, `LOGICAL_COLUMN`, `CONNECTION`, `USER_GROUP`, `COLLECTION`. The response includes the `metadata_obj_id` field for objects that have a Custom object ID set.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `subtypes` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` - `include_only_published_objects` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchMetadataRequest = new SearchMetadataRequest(); // SearchMetadataRequest | 

            try
            {
                List<MetadataSearchResponse> result = apiInstance.SearchMetadata(searchMetadataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<MetadataSearchResponse>> response = apiInstance.SearchMetadataWithHttpInfo(searchMetadataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchMetadataRequest** | [**SearchMetadataRequest**](SearchMetadataRequest.md) |  |  |

### Return type

[**List&lt;MetadataSearchResponse&gt;**](MetadataSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata objects search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchorgs"></a>
# **SearchOrgs**
> List&lt;OrgResponse&gt; SearchOrgs (SearchOrgsRequest searchOrgsRequest)



  Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchOrgsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchOrgsRequest = new SearchOrgsRequest(); // SearchOrgsRequest | 

            try
            {
                List<OrgResponse> result = apiInstance.SearchOrgs(searchOrgsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchOrgs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchOrgsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<OrgResponse>> response = apiInstance.SearchOrgsWithHttpInfo(searchOrgsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchOrgsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchOrgsRequest** | [**SearchOrgsRequest**](SearchOrgsRequest.md) |  |  |

### Return type

[**List&lt;OrgResponse&gt;**](OrgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchroles"></a>
# **SearchRoles**
> List&lt;SearchRoleResponse&gt; SearchRoles (SearchRolesRequest searchRolesRequest)



  Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.  **NOTE**: In addition to the GUID and name, `role_identifiers` accepts a Custom object ID if one is configured for the role. The response also includes the `obj_id` field for each role that has one set.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchRolesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchRolesRequest = new SearchRolesRequest(); // SearchRolesRequest | 

            try
            {
                List<SearchRoleResponse> result = apiInstance.SearchRoles(searchRolesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchRoles: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchRolesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<SearchRoleResponse>> response = apiInstance.SearchRolesWithHttpInfo(searchRolesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchRolesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchRolesRequest** | [**SearchRolesRequest**](SearchRolesRequest.md) |  |  |

### Return type

[**List&lt;SearchRoleResponse&gt;**](SearchRoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Roles search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Internal error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchschedules"></a>
# **SearchSchedules**
> List&lt;ResponseSchedule&gt; SearchSchedules (SearchSchedulesRequest searchSchedulesRequest)



 Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchSchedulesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchSchedulesRequest = new SearchSchedulesRequest(); // SearchSchedulesRequest | 

            try
            {
                List<ResponseSchedule> result = apiInstance.SearchSchedules(searchSchedulesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchSchedules: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchSchedulesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ResponseSchedule>> response = apiInstance.SearchSchedulesWithHttpInfo(searchSchedulesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchSchedulesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchSchedulesRequest** | [**SearchSchedulesRequest**](SearchSchedulesRequest.md) |  |  |

### Return type

[**List&lt;ResponseSchedule&gt;**](ResponseSchedule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchsecuritysettings"></a>
# **SearchSecuritySettings**
> SecuritySettingsResponse SearchSecuritySettings (SearchSecuritySettingsRequest searchSecuritySettingsRequest)



  Version: 26.2.0.cl or later   Fetch security settings for your ThoughtSpot application instance. - Use `scope: CLUSTER` to retrieve cluster-level security settings, including CORS and CSP allowlists, SAML redirect URLs, and settings that control access to non-embedded pages. - Use `scope: ORG` to retrieve Org-level security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this returns CORS and non-embed access settings specific to the Org. - If `scope` is not specified, returns both cluster and Org-specific settings based on user privileges.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchSecuritySettingsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchSecuritySettingsRequest = new SearchSecuritySettingsRequest(); // SearchSecuritySettingsRequest | 

            try
            {
                SecuritySettingsResponse result = apiInstance.SearchSecuritySettings(searchSecuritySettingsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchSecuritySettings: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchSecuritySettingsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SecuritySettingsResponse> response = apiInstance.SearchSecuritySettingsWithHttpInfo(searchSecuritySettingsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchSecuritySettingsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchSecuritySettingsRequest** | [**SearchSecuritySettingsRequest**](SearchSecuritySettingsRequest.md) |  |  |

### Return type

[**SecuritySettingsResponse**](SecuritySettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of security settings. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchstylecustomizations"></a>
# **SearchStyleCustomizations**
> List&lt;StylePreference&gt; SearchStyleCustomizations (SearchStyleCustomizationsRequest searchStyleCustomizationsRequest)



  Version: 26.7.0.cl or later   Retrieves style preferences at cluster level or for the authenticated user's org. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to retrieve cluster-level style defaults. - Set `scope` to `ORG` (default) to retrieve preferences for the authenticated user's org. - Each field in the response includes an `is_overridden` flag indicating whether the value was explicitly set at the requested scope or inherited from a parent scope (cluster or system default).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchStyleCustomizationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchStyleCustomizationsRequest = new SearchStyleCustomizationsRequest(); // SearchStyleCustomizationsRequest | 

            try
            {
                List<StylePreference> result = apiInstance.SearchStyleCustomizations(searchStyleCustomizationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchStyleCustomizations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchStyleCustomizationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<StylePreference>> response = apiInstance.SearchStyleCustomizationsWithHttpInfo(searchStyleCustomizationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchStyleCustomizationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchStyleCustomizationsRequest** | [**SearchStyleCustomizationsRequest**](SearchStyleCustomizationsRequest.md) |  |  |

### Return type

[**List&lt;StylePreference&gt;**](StylePreference.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Style preferences retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchstylefonts"></a>
# **SearchStyleFonts**
> List&lt;StyleFontRecord&gt; SearchStyleFonts (SearchStyleFontsRequest searchStyleFontsRequest)



  Version: 26.7.0.cl or later   Returns custom fonts from the cluster-level or org-level font library. Omitting all filter fields returns all fonts in the target scope.  When `include_font_assignments` is `true`, the response includes only the visualization areas explicitly assigned to each font. For cluster-scoped fonts, `org` is returned as `null`.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Set `scope` to `CLUSTER` to search the cluster-level library. Set `scope` to `ORG` (default) to search the authenticated user's org library. - Use `font_identifier` to look up a specific font by UUID or name. - Use `name_pattern` for partial, case-insensitive name matching. - Set `include_font_assignments` to `true` to include visualization areas this font is currently assigned to. Defaults to `false`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchStyleFontsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchStyleFontsRequest = new SearchStyleFontsRequest(); // SearchStyleFontsRequest | 

            try
            {
                List<StyleFontRecord> result = apiInstance.SearchStyleFonts(searchStyleFontsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchStyleFonts: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchStyleFontsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<StyleFontRecord>> response = apiInstance.SearchStyleFontsWithHttpInfo(searchStyleFontsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchStyleFontsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchStyleFontsRequest** | [**SearchStyleFontsRequest**](SearchStyleFontsRequest.md) |  |  |

### Return type

[**List&lt;StyleFontRecord&gt;**](StyleFontRecord.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom fonts retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchtags"></a>
# **SearchTags**
> List&lt;Tag&gt; SearchTags (SearchTagsRequest searchTagsRequest)



  Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchTagsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchTagsRequest = new SearchTagsRequest(); // SearchTagsRequest | 

            try
            {
                List<Tag> result = apiInstance.SearchTags(searchTagsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchTags: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchTagsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Tag>> response = apiInstance.SearchTagsWithHttpInfo(searchTagsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchTagsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchTagsRequest** | [**SearchTagsRequest**](SearchTagsRequest.md) |  |  |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchusergroups"></a>
# **SearchUserGroups**
> List&lt;UserGroupResponse&gt; SearchUserGroups (SearchUserGroupsRequest searchUserGroupsRequest)



  Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: In addition to the GUID and name, `group_identifier` accepts a Custom object ID if one is configured for the group. The response also includes the `obj_id` field for each group that has one set.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchUserGroupsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchUserGroupsRequest = new SearchUserGroupsRequest(); // SearchUserGroupsRequest | 

            try
            {
                List<UserGroupResponse> result = apiInstance.SearchUserGroups(searchUserGroupsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchUserGroups: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchUserGroupsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<UserGroupResponse>> response = apiInstance.SearchUserGroupsWithHttpInfo(searchUserGroupsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchUserGroupsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchUserGroupsRequest** | [**SearchUserGroupsRequest**](SearchUserGroupsRequest.md) |  |  |

### Return type

[**List&lt;UserGroupResponse&gt;**](UserGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchusers"></a>
# **SearchUsers**
> List&lt;User&gt; SearchUsers (SearchUsersRequest searchUsersRequest)



  Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchUsersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchUsersRequest = new SearchUsersRequest(); // SearchUsersRequest | 

            try
            {
                List<User> result = apiInstance.SearchUsers(searchUsersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchUsers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchUsersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<User>> response = apiInstance.SearchUsersWithHttpInfo(searchUsersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchUsersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchUsersRequest** | [**SearchUsersRequest**](SearchUsersRequest.md) |  |  |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User search result. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchvariables"></a>
# **SearchVariables**
> List&lt;Variable&gt; SearchVariables (SearchVariablesRequest searchVariablesRequest)



 Search variables    Version: 26.4.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values  The values can be filtered by scope: * org_identifier * principal_identifier * model_identifier      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchVariablesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchVariablesRequest = new SearchVariablesRequest(); // SearchVariablesRequest | 

            try
            {
                List<Variable> result = apiInstance.SearchVariables(searchVariablesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchVariables: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchVariablesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<Variable>> response = apiInstance.SearchVariablesWithHttpInfo(searchVariablesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchVariablesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchVariablesRequest** | [**SearchVariablesRequest**](SearchVariablesRequest.md) |  |  |

### Return type

[**List&lt;Variable&gt;**](Variable.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of variables is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchwebhookconfigurations"></a>
# **SearchWebhookConfigurations**
> WebhookSearchResponse SearchWebhookConfigurations (SearchWebhookConfigurationsRequest searchWebhookConfigurationsRequest)



  Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SearchWebhookConfigurationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var searchWebhookConfigurationsRequest = new SearchWebhookConfigurationsRequest(); // SearchWebhookConfigurationsRequest | 

            try
            {
                WebhookSearchResponse result = apiInstance.SearchWebhookConfigurations(searchWebhookConfigurationsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SearchWebhookConfigurations: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchWebhookConfigurationsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<WebhookSearchResponse> response = apiInstance.SearchWebhookConfigurationsWithHttpInfo(searchWebhookConfigurationsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SearchWebhookConfigurationsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchWebhookConfigurationsRequest** | [**SearchWebhookConfigurationsRequest**](SearchWebhookConfigurationsRequest.md) |  |  |

### Return type

[**WebhookSearchResponse**](WebhookSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook configurations retrieved successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sendagentconversationmessage"></a>
# **SendAgentConversationMessage**
> Object SendAgentConversationMessage (string conversationIdentifier, SendAgentConversationMessageRequest sendAgentConversationMessageRequest)



  Version: 26.5.0.cl or later   Sends natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - `type`: the kind of response — `text`, `answer`, or `error` - `message`: the main content of the response - `metadata`: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - For real-time streamed responses, use `sendAgentConversationMessageStreaming` instead.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SendAgentConversationMessageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier for the conversation (used to track context)
            var sendAgentConversationMessageRequest = new SendAgentConversationMessageRequest(); // SendAgentConversationMessageRequest | 

            try
            {
                Object result = apiInstance.SendAgentConversationMessage(conversationIdentifier, sendAgentConversationMessageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentConversationMessage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SendAgentConversationMessageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.SendAgentConversationMessageWithHttpInfo(conversationIdentifier, sendAgentConversationMessageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentConversationMessageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier for the conversation (used to track context) |  |
| **sendAgentConversationMessageRequest** | [**SendAgentConversationMessageRequest**](SendAgentConversationMessageRequest.md) |  |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sendagentconversationmessagestreaming"></a>
# **SendAgentConversationMessageStreaming**
> SendAgentMessageResponse SendAgentConversationMessageStreaming (string conversationIdentifier, SendAgentConversationMessageStreamingRequest sendAgentConversationMessageStreamingRequest)



  Version: 26.5.0.cl or later   Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | | - -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is Generally Available from version 26.5.0.cl. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE). > - For the complete response in a single payload, use `sendAgentConversationMessage` instead.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SendAgentConversationMessageStreamingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier for the conversation (used to track context)
            var sendAgentConversationMessageStreamingRequest = new SendAgentConversationMessageStreamingRequest(); // SendAgentConversationMessageStreamingRequest | 

            try
            {
                SendAgentMessageResponse result = apiInstance.SendAgentConversationMessageStreaming(conversationIdentifier, sendAgentConversationMessageStreamingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentConversationMessageStreaming: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SendAgentConversationMessageStreamingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SendAgentMessageResponse> response = apiInstance.SendAgentConversationMessageStreamingWithHttpInfo(conversationIdentifier, sendAgentConversationMessageStreamingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentConversationMessageStreamingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier for the conversation (used to track context) |  |
| **sendAgentConversationMessageStreamingRequest** | [**SendAgentConversationMessageStreamingRequest**](SendAgentConversationMessageStreamingRequest.md) |  |  |

### Return type

[**SendAgentMessageResponse**](SendAgentMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sendagentmessage"></a>
# **SendAgentMessage**
> Object SendAgentMessage (string conversationIdentifier, SendAgentMessageRequest sendAgentMessageRequest)



 Version: 26.2.0.cl or later   **Deprecated** — Use `sendAgentConversationMessage` instead.  Send natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - `type`: the kind of response — `text`, `answer`, or `error` - `message`: the main content of the response - `metadata`: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is deprecated. Use `sendAgentConversationMessage` for new integrations. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SendAgentMessageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier for the conversation (used to track context)
            var sendAgentMessageRequest = new SendAgentMessageRequest(); // SendAgentMessageRequest | 

            try
            {
                Object result = apiInstance.SendAgentMessage(conversationIdentifier, sendAgentMessageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentMessage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SendAgentMessageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.SendAgentMessageWithHttpInfo(conversationIdentifier, sendAgentMessageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentMessageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier for the conversation (used to track context) |  |
| **sendAgentMessageRequest** | [**SendAgentMessageRequest**](SendAgentMessageRequest.md) |  |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sendagentmessagestreaming"></a>
# **SendAgentMessageStreaming**
> SendAgentMessageResponse SendAgentMessageStreaming (SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest)



 Version: 26.2.0.cl or later   **Deprecated** — Use `sendAgentConversationMessageStreaming` instead.  Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires `CAN_USE_SPOTTER` privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by `conversation_identifier`. A conversation must first be created using the `createAgentConversation` API.  #### Usage guidelines  The request must include:  - `conversation_identifier`: the unique session ID returned by `createAgentConversation`, used for context continuity and message tracking - `messages`: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form `data: [{\"type\": \"...\", ...}]` — a JSON array of event objects. Event types include:  - `ack`: confirms receipt of the request (`node_id`) - `conv_title`: conversation title (`title`, `conv_id`) - `notification`: status updates on operations (`group_id`, `metadata`, `code` — e.g. `TOOL_CALL_NOTIFICATION`, `nls_start`, `FINAL_RESPONSE_NOTIFICATION`) - `text-chunk`: incremental content chunks (`id`, `group_id`, `metadata` with `format` and `type` such as `thinking` or `text`, `content`) - `text`: full text block with same structure as `text-chunk` - `answer`: structured answer with metadata (`id`, `group_id`, `metadata` with `sage_query`, `session_id`, `title`, etc., `title`) - `error`: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks permission on the referenced conversation. |  > ###### Note: > > - This endpoint is deprecated. Use `sendAgentConversationMessageStreaming` for new integrations. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > - The streaming protocol uses Server-Sent Events (SSE).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SendAgentMessageStreamingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var sendAgentMessageStreamingRequest = new SendAgentMessageStreamingRequest(); // SendAgentMessageStreamingRequest | 

            try
            {
                SendAgentMessageResponse result = apiInstance.SendAgentMessageStreaming(sendAgentMessageStreamingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentMessageStreaming: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SendAgentMessageStreamingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SendAgentMessageResponse> response = apiInstance.SendAgentMessageStreamingWithHttpInfo(sendAgentMessageStreamingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SendAgentMessageStreamingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sendAgentMessageStreamingRequest** | [**SendAgentMessageStreamingRequest**](SendAgentMessageStreamingRequest.md) |  |  |

### Return type

[**SendAgentMessageResponse**](SendAgentMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sendmessage"></a>
# **SendMessage**
> List&lt;ResponseMessage&gt; SendMessage (string conversationIdentifier, SendMessageRequest sendMessageRequest)



 Version: 10.4.0.cl or later   Sends a follow-up message to an existing conversation within the context of a data model.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the `createConversation` API.  #### Usage guidelines  The request must include: - `conversation_identifier`: the unique session ID returned by `createConversation` - `metadata_identifier`: the unique ID of the data source used for the conversation - `message`: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SendMessageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier of the conversation.
            var sendMessageRequest = new SendMessageRequest(); // SendMessageRequest | 

            try
            {
                List<ResponseMessage> result = apiInstance.SendMessage(conversationIdentifier, sendMessageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SendMessage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SendMessageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<ResponseMessage>> response = apiInstance.SendMessageWithHttpInfo(conversationIdentifier, sendMessageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SendMessageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier of the conversation. |  |
| **sendMessageRequest** | [**SendMessageRequest**](SendMessageRequest.md) |  |  |

### Return type

[**List&lt;ResponseMessage&gt;**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="setagentinstructions"></a>
# **SetAgentInstructions**
> AgentInstructions SetAgentInstructions (SetAgentInstructionsRequest setAgentInstructionsRequest)



 Version: 26.6.0.cl or later   Creates or updates the admin instructions for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations. If instructions already exist for the org, they are replaced (upsert semantics).  Requires admin privileges. Only users with org admin access can set agent instructions.  #### Usage guidelines  The request must include:  - `instructions`: the instructions text to apply to the agent (maximum 5000 characters)  Instructions are validated against system guardrails before being saved. If the instructions contain content that conflicts with guardrails, the request is rejected with a `409` error and the existing instructions remain unchanged.  If the request is successful, the response includes the saved `AgentInstructions` record:  - `id`: unique identifier of the record - `instructions`: the saved instructions text - `created_at`: ISO timestamp when the instructions were first created - `updated_at`: ISO timestamp of this update - `last_updated_by`: user ID of the admin who performed this update  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 400  | Bad request — the request body is missing required fields or the `instructions` field exceeds the maximum allowed length of 5000 characters. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to set agent instructions. | | 409  | Conflict — the provided instructions conflict with system guardrails. Review and revise the instructions text before retrying. | | 500  | Internal server error. |  > ###### Note: > > - This operation uses upsert semantics: it creates the instructions record if none exists, or replaces the existing one. > - Instructions take effect immediately for new conversations created after the update. > - Use `getAgentInstructions` to retrieve the current instructions before making changes. > - Available from version 26.6.0.cl and later.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SetAgentInstructionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var setAgentInstructionsRequest = new SetAgentInstructionsRequest(); // SetAgentInstructionsRequest | 

            try
            {
                AgentInstructions result = apiInstance.SetAgentInstructions(setAgentInstructionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SetAgentInstructions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SetAgentInstructionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<AgentInstructions> response = apiInstance.SetAgentInstructionsWithHttpInfo(setAgentInstructionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SetAgentInstructionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **setAgentInstructionsRequest** | [**SetAgentInstructionsRequest**](SetAgentInstructionsRequest.md) |  |  |

### Return type

[**AgentInstructions**](AgentInstructions.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="setnlinstructions"></a>
# **SetNLInstructions**
> EurekaSetNLInstructionsResponse SetNLInstructions (SetNLInstructionsRequest setNLInstructionsRequest)



 Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires `CAN_USE_SPOTTER` privilege, either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - `data_source_identifier`: The unique ID of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - `success`: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege, lacks edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, or the bearer token does not correspond to the org where the data model exists. |  > ###### Note: > > - To use this API, the user needs either edit access or `SPOTTER_COACHING_PRIVILEGE` on the data model, and must use the bearer token corresponding to the org where the data model exists. > - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > - Available from version 10.15.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SetNLInstructionsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var setNLInstructionsRequest = new SetNLInstructionsRequest(); // SetNLInstructionsRequest | 

            try
            {
                EurekaSetNLInstructionsResponse result = apiInstance.SetNLInstructions(setNLInstructionsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SetNLInstructions: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SetNLInstructionsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<EurekaSetNLInstructionsResponse> response = apiInstance.SetNLInstructionsWithHttpInfo(setNLInstructionsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SetNLInstructionsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **setNLInstructionsRequest** | [**SetNLInstructionsRequest**](SetNLInstructionsRequest.md) |  |  |

### Return type

[**EurekaSetNLInstructionsResponse**](EurekaSetNLInstructionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sharemetadata"></a>
# **ShareMetadata**
> void ShareMetadata (ShareMetadataRequest shareMetadataRequest)



  Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  #### Supported metadata objects: * Liveboards * Visualizations * Answers * Models * Views * Connections * Collections  #### Object permissions  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. The `READ_ONLY` permission grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.  #### Sharing a visualization  * Sharing a visualization implicitly shares the entire Liveboard with the recipient. * Object permissions set for a shared visualization also apply to the Liveboard unless overridden by another API request or via UI. * If email notifications for object sharing are enabled, a notification with a link to the shared visualization will be sent to the recipient’s email address. Although this link opens the shared visualization, recipients can also access other visualizations in the Liveboard.  #### Sharing a collection  Collections support **dual permissions** that provide fine-grained control:  * **Collection permissions** (`share_mode`) - controls access to the collection itself (view, edit, delete the collection) * **Content permissions** (`content_share_mode`) - controls access to objects within the collection (view, edit objects inside)  **Default Behavior:** - If only `share_mode` is specified, the content permissions default to `READ_ONLY` (except when `share_mode` is `NO_ACCESS`, then content also gets `NO_ACCESS`) - To give users edit access to collection contents, explicitly set `content_share_mode: \"MODIFY\"`  ## Examples  The following JSON examples can be copy-pasted as request bodies for the REST v2 API endpoint:  ```bash POST /callosum/v1/v2/security/metadata/share Content-Type: application/x-www-form-urlencoded ```  ### Basic collection sharing Share a collection with read-only access:  ```json {   \"metadata_type\": \"COLLECTION\",   \"metadata_identifiers\": [\"Sales Reports Collection\"],   \"permissions\": [{     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"alice@company.com\"     },     \"share_mode\": \"READ_ONLY\"   }],   \"notification\": {     \"message\": \"I've shared the Sales Reports collection with you\",     \"notify_on_share\": true   } } ```  ### Collection sharing with dual permissions Share a collection with different permissions for the collection vs. its contents:  ```json {   \"metadata_type\": \"COLLECTION\",   \"metadata_identifiers\": [\"Marketing Analytics\"],   \"permissions\": [{     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"bob@company.com\"     },     \"share_mode\": \"MODIFY\",     \"content_share_mode\": \"READ_ONLY\"   }, {     \"principal\": {       \"type\": \"USER_GROUP\",       \"identifier\": \"Marketing Team\"     },     \"share_mode\": \"READ_ONLY\",     \"content_share_mode\": \"READ_ONLY\"   }],   \"notification\": {     \"emails\": [\"bob@company.com\"],     \"message\": \"You can edit the collection but content is read-only\",     \"enable_custom_url\": false,     \"notify_on_share\": true   },   \"has_lenient_discoverability\": false } ```  ### Multiple collections sharing Share multiple collections with different users:  ```json {   \"metadata\": [     {       \"type\": \"COLLECTION\",       \"identifier\": \"Q4 Reports\"     },     {       \"type\": \"COLLECTION\",       \"identifier\": \"Executive Dashboard Collection\"     }   ],   \"permissions\": [{     \"principal\": {       \"type\": \"USER_GROUP\",       \"identifier\": \"Executives\"     },     \"share_mode\": \"MODIFY\"   }, {     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"manager@company.com\"     },     \"share_mode\": \"READ_ONLY\",     \"content_share_mode\": \"MODIFY\"   }],   \"notification\": {     \"message\": \"Sharing quarterly collections with leadership team\",     \"notify_on_share\": true   } } ```  ### Remove collection access Remove access to a collection by setting share_mode to NO_ACCESS:  ```json {   \"metadata_type\": \"COLLECTION\",   \"metadata_identifiers\": [\"Confidential Reports\"],   \"permissions\": [{     \"principal\": {       \"type\": \"USER\",       \"identifier\": \"former-employee@company.com\"     },     \"share_mode\": \"NO_ACCESS\"   }],   \"notification\": {     \"notify_on_share\": false   } } ```  ### Collection Permission Scenarios  **Scenario 1: Collection Admin** - `share_mode: MODIFY` + `content_share_mode: MODIFY` = Full control over collection and its contents  **Scenario 2: Collection Curator** - `share_mode: MODIFY` + `content_share_mode: READ_ONLY` = Can manage collection structure but not edit contents  **Scenario 3: Content Editor** - `share_mode: READ_ONLY` + `content_share_mode: MODIFY` = Can edit objects within collection but can't change collection itself  **Scenario 4: Viewer** - `share_mode: READ_ONLY` + `content_share_mode: READ_ONLY` = View-only access to collection and contents      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ShareMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var shareMetadataRequest = new ShareMetadataRequest(); // ShareMetadataRequest | 

            try
            {
                apiInstance.ShareMetadata(shareMetadataRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ShareMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ShareMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ShareMetadataWithHttpInfo(shareMetadataRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ShareMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **shareMetadataRequest** | [**ShareMetadataRequest**](ShareMetadataRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Sharing metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="singleanswer"></a>
# **SingleAnswer**
> ResponseMessage SingleAnswer (SingleAnswerRequest singleAnswerRequest)



 Version: 10.4.0.cl or later   Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires `CAN_USE_SPOTTER` privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - `query`: a natural language question (e.g., \"What were total sales last quarter?\") - `metadata_identifier`: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - `session_identifier`: the unique ID of the generated response - `generation_number`: the generation number of the response - `message_type`: the type of the response (e.g., `TSAnswer`) - `visualization_type`: the generated visualization type (`Chart`, `Table`, or `Undefined`) - `tokens` / `display_tokens`: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks view permission on the specified metadata object. |  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SingleAnswerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var singleAnswerRequest = new SingleAnswerRequest(); // SingleAnswerRequest | 

            try
            {
                ResponseMessage result = apiInstance.SingleAnswer(singleAnswerRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SingleAnswer: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SingleAnswerWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<ResponseMessage> response = apiInstance.SingleAnswerWithHttpInfo(singleAnswerRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SingleAnswerWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **singleAnswerRequest** | [**SingleAnswerRequest**](SingleAnswerRequest.md) |  |  |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Common successful response |  -  |
| **201** | Common error response |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="stopconversation"></a>
# **StopConversation**
> void StopConversation (string conversationIdentifier)



 Stops an in-progress agent conversation response.    Version: 26.6.0.cl or later   <span>Version: 26.6.0.cl or later   Stops an in-progress agent response for the specified conversation. Use this endpoint to cancel a response that is actively being generated — for example, when the user navigates away, reformulates their question, or no longer needs the current result.  Requires `CAN_USE_SPOTTER` privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation whose active response should be stopped, as returned by `createAgentConversation`  A successful request returns an empty `204 No Content` response. If there is no active response in progress at the time of the call, the request is still treated as successful.  After stopping a response, the conversation session remains active. You can continue sending messages using `sendAgentConversationMessage` or `sendAgentConversationMessageStreaming`.  #### Example request  ```bash POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response ```  #### Typical usage scenario  This endpoint is useful when integrating Spotter into a chat UI where users can cancel a long-running query. For example:  1. User sends a message via `sendAgentConversationMessageStreaming`. 2. User clicks a \"Stop generating\" button while the response is streaming. 3. Your client calls `stopConversation` with the active `conversation_identifier`. 4. The stream is terminated and the user can ask a new question.  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or lacks access to the specified conversation. |  > ###### Note: > > - Calling this endpoint when no response is in progress does not return an error. > - The conversation context is preserved after stopping — previous messages and answers remain accessible. > - Available from version 26.6.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > - This feature is available only for **Spotter 3** (`SPOTTER3`) version.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class StopConversationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier of the conversation to stop.

            try
            {
                apiInstance.StopConversation(conversationIdentifier);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.StopConversation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StopConversationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.StopConversationWithHttpInfo(conversationIdentifier);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.StopConversationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier of the conversation to stop. |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully stopped the in-progress agent conversation response for the given. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="syncmetadata"></a>
# **SyncMetadata**
> SyncMetadataResponse SyncMetadata (string connectionIdentifier, SyncMetadataRequest syncMetadataRequest)



  Version: 26.5.0.cl or later   Synchronizes connection metadata attributes from your Cloud Data Warehouse (CDW) with ThoughtSpot.  Requires the  `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege is required.  #### Usage guidelines  To synchronize attributes from a CDW, specify the connection GUID or name in the `connection_identifier` path parameter and  `sync_attributes` in the request body. Default attribute is `[\"DESCRIPTION\"]`.  ##### Hierarchical schema  * Connection: The connection object for the sync operation. * Tables: Tables for the sync operation. When no table is specified, all tables are synchronized. * Columns: If the table is specified, you can add the columns for the sync operation. If no columns are specified, all columns in the specified table are considered for the sync operation.  To set the scope for the sync operation:  * Connection-level: To sync all tables and columns, pass an empty request body, or only the attributes in the request body. * Table-level: To synchronize specific tables and their columns, specify the table identifiers in the `tables` array. * Column-level: To synchronize specific columns, specify the table identifier as the key and column identifiers as the value in the `tables` array.  ``` {   \"tables\": [     {\"table-guid-1\": [\"column-guid-1\", \"column-guid-2\"]},     \"table-guid-2\"   ],   \"sync_attributes\": [\"DESCRIPTION\"] } ```  ##### API response  If the sync operation is successful, the API returns the following information:  * Status of the sync operation. For example, `SUCCESS`, `PARTIAL_SUCCESS`, or `NO_UPDATE`. * Number of tables and columns that were updated. * Number of tables and columns with the sync failed status when the overall sync status is `PARTIAL_SUCCESS`. * Message text indicating the sync results.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class SyncMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | Unique ID or name of the connection.
            var syncMetadataRequest = new SyncMetadataRequest(); // SyncMetadataRequest | 

            try
            {
                SyncMetadataResponse result = apiInstance.SyncMetadata(connectionIdentifier, syncMetadataRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.SyncMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SyncMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<SyncMetadataResponse> response = apiInstance.SyncMetadataWithHttpInfo(connectionIdentifier, syncMetadataRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.SyncMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | Unique ID or name of the connection. |  |
| **syncMetadataRequest** | [**SyncMetadataRequest**](SyncMetadataRequest.md) |  |  |

### Return type

[**SyncMetadataResponse**](SyncMetadataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata synced successfully. |  -  |
| **400** | Invalid request parameters or hierarchy. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Connection, table, or column not found. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="unassigntag"></a>
# **UnassignTag**
> void UnassignTag (UnassignTagRequest unassignTagRequest)



  Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UnassignTagExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var unassignTagRequest = new UnassignTagRequest(); // UnassignTagRequest | 

            try
            {
                apiInstance.UnassignTag(unassignTagRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UnassignTag: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UnassignTagWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UnassignTagWithHttpInfo(unassignTagRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UnassignTagWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **unassignTagRequest** | [**UnassignTagRequest**](UnassignTagRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Tags successfully unassigned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="unparameterizemetadata"></a>
# **UnparameterizeMetadata**
> void UnparameterizeMetadata (UnparameterizeMetadataRequest unparameterizeMetadataRequest)



 Remove parameterization from fields in metadata objects.    Version: 26.5.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be unparameterized.  For Connection Config, the only supported field name is: * impersonate_user      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UnparameterizeMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var unparameterizeMetadataRequest = new UnparameterizeMetadataRequest(); // UnparameterizeMetadataRequest | 

            try
            {
                apiInstance.UnparameterizeMetadata(unparameterizeMetadataRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UnparameterizeMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UnparameterizeMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UnparameterizeMetadataWithHttpInfo(unparameterizeMetadataRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UnparameterizeMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **unparameterizeMetadataRequest** | [**UnparameterizeMetadataRequest**](UnparameterizeMetadataRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfuly removed parameters. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="unpublishmetadata"></a>
# **UnpublishMetadata**
> void UnpublishMetadata (UnpublishMetadataRequest unpublishMetadataRequest)



  Version: 26.5.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UnpublishMetadataExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var unpublishMetadataRequest = new UnpublishMetadataRequest(); // UnpublishMetadataRequest | 

            try
            {
                apiInstance.UnpublishMetadata(unpublishMetadataRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UnpublishMetadata: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UnpublishMetadataWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UnpublishMetadataWithHttpInfo(unpublishMetadataRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UnpublishMetadataWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **unpublishMetadataRequest** | [**UnpublishMetadataRequest**](UnpublishMetadataRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Unpublishing metadata objects is successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecalendar"></a>
# **UpdateCalendar**
> void UpdateCalendar (string calendarIdentifier, UpdateCalendarRequest updateCalendarRequest)



  Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * `FROM_INPUT_PARAMS` to update the calendar properties with the values defined in the API request. * `FROM_EXISTING_TABLE` Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  ``` {   \"update_method\": \"FROM_EXISTING_TABLE\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   } } ```  Update a custom calendar with the attributes defined in the API request:  ``` {   \"update_method\": \"FROM_INPUT_PARAMS\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   },   \"month_offset\": \"August\",   \"start_day_of_week\": \"Monday\",   \"start_date\": \"08/01/2025\",   \"end_date\": \"07/31/2026\" } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateCalendarExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var calendarIdentifier = "calendarIdentifier_example";  // string | Unique Id or name of the calendar.
            var updateCalendarRequest = new UpdateCalendarRequest(); // UpdateCalendarRequest | 

            try
            {
                apiInstance.UpdateCalendar(calendarIdentifier, updateCalendarRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateCalendar: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateCalendarWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateCalendarWithHttpInfo(calendarIdentifier, updateCalendarRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateCalendarWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **calendarIdentifier** | **string** | Unique Id or name of the calendar. |  |
| **updateCalendarRequest** | [**UpdateCalendarRequest**](UpdateCalendarRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom calendar updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecollection"></a>
# **UpdateCollection**
> void UpdateCollection (string collectionIdentifier, UpdateCollectionRequest updateCollectionRequest)



  Version: 26.4.0.cl or later   Updates an existing collection in ThoughtSpot.  #### Supported operations  This API endpoint lets you perform the following operations:  * Update collection name and description * Change visibility settings * Add metadata objects to the collection (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace all metadata objects in the collection (operation: REPLACE)  #### Operation types  * **ADD**: Adds the specified metadata objects to the existing collection without removing current items * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**: Replaces all existing metadata objects with the specified items (default behavior)      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateCollectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var collectionIdentifier = "collectionIdentifier_example";  // string | Unique GUID of the collection. Note: Collection names cannot be used as identifiers since duplicate names are allowed.
            var updateCollectionRequest = new UpdateCollectionRequest(); // UpdateCollectionRequest | 

            try
            {
                apiInstance.UpdateCollection(collectionIdentifier, updateCollectionRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateCollection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateCollectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateCollectionWithHttpInfo(collectionIdentifier, updateCollectionRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateCollectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **collectionIdentifier** | **string** | Unique GUID of the collection. Note: Collection names cannot be used as identifiers since duplicate names are allowed. |  |
| **updateCollectionRequest** | [**UpdateCollectionRequest**](UpdateCollectionRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Collection updated successfully. No content returned. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Resource not found. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecolumnsecurityrules"></a>
# **UpdateColumnSecurityRules**
> void UpdateColumnSecurityRules (UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest)



 Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \"all or none\" policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either `identifier` (GUID or name) or `obj_identifier` (object ID) - Use `clear_csr: true` to remove all column security rules from the table - For each column, specify the security rule using `column_security_rules` array - Use `is_unsecured: true` to mark a specific column as unprotected - Use `group_access` operations to manage group associations:   - `ADD`: Add groups to the column's access list   - `REMOVE`: Remove groups from the column's access list   - `REPLACE`: Replace all existing groups with the specified groups  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data (if RBAC is disabled) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  ```json {   \"identifier\": \"table-guid\",   \"obj_identifier\": \"table-object-id\",   \"clear_csr\": false,   \"column_security_rules\": [     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"ADD\",           \"group_identifiers\": [\"hr_group_id\", \"hr_group_name\", \"finance_group_id\"]         }       ]     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": true     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"REPLACE\",           \"group_identifiers\": [\"management_group_id\", \"management_group_name\"]         }       ]     }   ] } ```  #### Request Body Schema  - `identifier` (string, optional): GUID or name of the table for which we want to create column security rules - `obj_identifier` (string, optional): The object ID of the table - `clear_csr` (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - `column_security_rules` (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - `column_identifier` (string, required): Column identifier (col_id or name) - `is_unsecured` (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - `group_access` (array of objects, optional): Array of group operation objects  Each group operation object contains: - `operation` (string, required): Operation type - ADD, REMOVE, or REPLACE - `group_identifiers` (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column's access list - **REMOVE**: Removes the specified groups from the column's access list   - **REPLACE**: Replaces all existing groups with the specified groups      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateColumnSecurityRulesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateColumnSecurityRulesRequest = new UpdateColumnSecurityRulesRequest(); // UpdateColumnSecurityRulesRequest | 

            try
            {
                apiInstance.UpdateColumnSecurityRules(updateColumnSecurityRulesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateColumnSecurityRules: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateColumnSecurityRulesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateColumnSecurityRulesWithHttpInfo(updateColumnSecurityRulesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateColumnSecurityRulesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateColumnSecurityRulesRequest** | [**UpdateColumnSecurityRulesRequest**](UpdateColumnSecurityRulesRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully updated column security rules |  -  |
| **400** | Bad request - Invalid parameters or table not found |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden - User doesn&#39;t have permission to modify security rules for this table |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconfig"></a>
# **UpdateConfig**
> RepoConfigObject UpdateConfig (UpdateConfigRequest updateConfigRequest)



  Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateConfigRequest = new UpdateConfigRequest(); // UpdateConfigRequest | 

            try
            {
                RepoConfigObject result = apiInstance.UpdateConfig(updateConfigRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RepoConfigObject> response = apiInstance.UpdateConfigWithHttpInfo(updateConfigRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateConfigRequest** | [**UpdateConfigRequest**](UpdateConfigRequest.md) |  |  |

### Return type

[**RepoConfigObject**](RepoConfigObject.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated local repository configuration |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconnection"></a>
# **UpdateConnection**
> void UpdateConnection (UpdateConnectionRequest updateConnectionRequest)



  Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateConnectionRequest = new UpdateConnectionRequest(); // UpdateConnectionRequest | 

            try
            {
                apiInstance.UpdateConnection(updateConnectionRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateConnectionWithHttpInfo(updateConnectionRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateConnectionRequest** | [**UpdateConnectionRequest**](UpdateConnectionRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconnectionconfiguration"></a>
# **UpdateConnectionConfiguration**
> void UpdateConnectionConfiguration (string configurationIdentifier, UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the `policy_type`  * Edit the type of authentication  * Enable or disable a configuration  #### Parameterized Connection Support For parameterized oauth based connections, only the `same_as_parent` and `policy_process_options` attributes are allowed. These attributes are not applicable to connections that are not parameterized.   **NOTE**: When updating a configuration where `disabled` is `true`, you must reset `disabled` to `true` in your update request payload. If not explicitly set again, the API will default `disabled` to `false`.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConnectionConfigurationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var configurationIdentifier = "configurationIdentifier_example";  // string | Unique ID or name of the configuration.
            var updateConnectionConfigurationRequest = new UpdateConnectionConfigurationRequest(); // UpdateConnectionConfigurationRequest | 

            try
            {
                apiInstance.UpdateConnectionConfiguration(configurationIdentifier, updateConnectionConfigurationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConnectionConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateConnectionConfigurationWithHttpInfo(configurationIdentifier, updateConnectionConfigurationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **configurationIdentifier** | **string** | Unique ID or name of the configuration. |  |
| **updateConnectionConfigurationRequest** | [**UpdateConnectionConfigurationRequest**](UpdateConnectionConfigurationRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconnectionstatus"></a>
# **UpdateConnectionStatus**
> void UpdateConnectionStatus (string connectionIdentifier, UpdateConnectionStatusRequest updateConnectionStatusRequest)



  Version: 26.6.0.cl or later   Activates or deactivates a connection. A deactivated connection cannot be used for queries or operations until it is activated again.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required. Only the connection owner or an administrator can perform this operation.  #### Usage guidelines  To update the status of a connection, specify the connection GUID or name in the `connection_identifier` path parameter and the desired `status` in the request body.  - **ACTIVATED**: Enables the connection. Queries and operations can resume on an activated connection. - **DEACTIVATED**: Disables the connection. It does not remove the connection metadata, but only makes the connection unavailable for queries and operations. You can reactivate a deactivated connection by setting \"status\": \"ACTIVATED\".       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConnectionStatusExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | Unique ID or name of the connection.
            var updateConnectionStatusRequest = new UpdateConnectionStatusRequest(); // UpdateConnectionStatusRequest | 

            try
            {
                apiInstance.UpdateConnectionStatus(connectionIdentifier, updateConnectionStatusRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionStatus: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConnectionStatusWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateConnectionStatusWithHttpInfo(connectionIdentifier, updateConnectionStatusRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionStatusWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | Unique ID or name of the connection. |  |
| **updateConnectionStatusRequest** | [**UpdateConnectionStatusRequest**](UpdateConnectionStatusRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection status updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **404** | Object not found |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconnectionv2"></a>
# **UpdateConnectionV2**
> void UpdateConnectionV2 (string connectionIdentifier, UpdateConnectionV2Request updateConnectionV2Request)



  Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`.        **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.     * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:    * This is an example of updating a single table in a empty connection:           ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"databases\": [\"DB2\", \"DB3\", \"DEVELOPMENT\"],         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"DEMORENAME\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"Col1\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col2\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col3\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col312\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col4\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```        * This is an example of updating a single table in an existing connection with tables:            ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"databases\": [\"DB2\", \"DB3\", \"DEVELOPMENT\"],         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"CUSTOMER\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [],                     \"relationships\": []                   },                   {                     \"name\": \"tpch5k_falcon_default_schema_users\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"user_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"product_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"user_cost\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```  3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.    **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not  specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.    * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a Snowflake connection:    ```    {       \"configuration\":{          \"accountName\":\"thoughtspot_partner\",          \"user\":\"tsadmin\",          \"password\":\"TestConn123\",          \"role\":\"sysadmin\",          \"warehouse\":\"MEDIUM_WH\"       },       \"databases\":[\"DB1\", \"DB2\"],       \"externalDatabases\":[        ]    }    ```  The optional `databases` property in `data_warehouse_config` accepts a list of database names. When specified, ThoughtSpot persists this list on the connection and uses it to scope metadata fetching to only the specified databases in subsequent table add and remove operations. If omitted, all databases in the data warehouse are accessible for metadata operations.  The `databases` and `externalDatabases` serve different purposes. `databases` is a flat list of database names that controls which databases are scanned during metadata operations. `externalDatabases` defines the full table hierarchy and determines which tables are linked into ThoughtSpot.       

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConnectionV2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var connectionIdentifier = "connectionIdentifier_example";  // string | Unique ID or name of the connection.
            var updateConnectionV2Request = new UpdateConnectionV2Request(); // UpdateConnectionV2Request | 

            try
            {
                apiInstance.UpdateConnectionV2(connectionIdentifier, updateConnectionV2Request);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionV2: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConnectionV2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateConnectionV2WithHttpInfo(connectionIdentifier, updateConnectionV2Request);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConnectionV2WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **connectionIdentifier** | **string** | Unique ID or name of the connection. |  |
| **updateConnectionV2Request** | [**UpdateConnectionV2Request**](UpdateConnectionV2Request.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateconversation"></a>
# **UpdateConversation**
> void UpdateConversation (string conversationIdentifier, UpdateConversationRequest updateConversationRequest)



 Updates attributes of an existing agent conversation. Currently only the display title can be updated; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body.    Version: 26.7.0.cl or later   Updates attributes of an existing saved agent conversation. Currently only the conversation's display `title` can be updated; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Requires `CAN_USE_SPOTTER` privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - `conversation_identifier` *(path parameter)*: the unique ID of the conversation to update, as returned by `createAgentConversation` or `getConversationList` - At least one updatable attribute in the request body:     - `title` *(optional)*: the new display name for the conversation. When provided, must be a non-empty string.  A successful request returns an empty `204 No Content` response. Updated attributes are reflected immediately in subsequent calls to `getConversationList`.  #### Example request  ```bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \"title\": \"Revenue Breakdown by Product Line\" } ```  #### Error responses  | Code | Description | |- -- -- -|- -- -- -- -- -- --| | 400  | Bad Request — the request body is empty or `title` is provided as an empty string. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have `CAN_USE_SPOTTER` privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given `conversation_identifier` for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  > ###### Note: > > - Only conversations created with `enable_save_chat: true` can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. > - Available from version 26.7.0.cl and later. > - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateConversationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var conversationIdentifier = "conversationIdentifier_example";  // string | Unique identifier of the conversation to update.
            var updateConversationRequest = new UpdateConversationRequest(); // UpdateConversationRequest | 

            try
            {
                apiInstance.UpdateConversation(conversationIdentifier, updateConversationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConversation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateConversationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateConversationWithHttpInfo(conversationIdentifier, updateConversationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateConversationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **conversationIdentifier** | **string** | Unique identifier of the conversation to update. |  |
| **updateConversationRequest** | [**UpdateConversationRequest**](UpdateConversationRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully updated the agent conversation. |  -  |
| **400** | Operation failed |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Operation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatecustomaction"></a>
# **UpdateCustomAction**
> void UpdateCustomAction (string customActionIdentifier, UpdateCustomActionRequest updateCustomActionRequest)



  Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateCustomActionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var customActionIdentifier = "customActionIdentifier_example";  // string | Unique ID or name of the custom action.
            var updateCustomActionRequest = new UpdateCustomActionRequest(); // UpdateCustomActionRequest | 

            try
            {
                apiInstance.UpdateCustomAction(customActionIdentifier, updateCustomActionRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateCustomAction: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateCustomActionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateCustomActionWithHttpInfo(customActionIdentifier, updateCustomActionRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateCustomActionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **customActionIdentifier** | **string** | Unique ID or name of the custom action. |  |
| **updateCustomActionRequest** | [**UpdateCustomActionRequest**](UpdateCustomActionRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Custom action updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatedbtconnection"></a>
# **UpdateDbtConnection**
> Object UpdateDbtConnection (string dbtConnectionIdentifier, string? connectionName = null, string? databaseName = null, string? importType = null, string? accessToken = null, string? dbtUrl = null, string? accountId = null, string? projectId = null, string? dbtEnvId = null, string? projectName = null, FileParameter? fileContent = null)



  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateDbtConnectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var dbtConnectionIdentifier = "dbtConnectionIdentifier_example";  // string | Unique ID of the DBT Connection.
            var connectionName = "connectionName_example";  // string? | Name of the connection. (optional) 
            var databaseName = "databaseName_example";  // string? | Name of the Database. (optional) 
            var importType = "DBT_CLOUD";  // string? | Mention type of Import (optional)  (default to DBT_CLOUD)
            var accessToken = "accessToken_example";  // string? | Access token is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var dbtUrl = "dbtUrl_example";  // string? | DBT URL is mandatory when Import_Type is DBT_CLOUD. (optional) 
            var accountId = "accountId_example";  // string? | Account ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var projectId = "projectId_example";  // string? | Project ID is mandatory when Import_Type is DBT_CLOUD (optional) 
            var dbtEnvId = "dbtEnvId_example";  // string? | DBT Environment ID\\\" (optional) 
            var projectName = "projectName_example";  // string? | Name of the project (optional) 
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is 'ZIP_FILE' (optional) 

            try
            {
                Object result = apiInstance.UpdateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateDbtConnection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateDbtConnectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<Object> response = apiInstance.UpdateDbtConnectionWithHttpInfo(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateDbtConnectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **dbtConnectionIdentifier** | **string** | Unique ID of the DBT Connection. |  |
| **connectionName** | **string?** | Name of the connection. | [optional]  |
| **databaseName** | **string?** | Name of the Database. | [optional]  |
| **importType** | **string?** | Mention type of Import | [optional] [default to DBT_CLOUD] |
| **accessToken** | **string?** | Access token is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **dbtUrl** | **string?** | DBT URL is mandatory when Import_Type is DBT_CLOUD. | [optional]  |
| **accountId** | **string?** | Account ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **projectId** | **string?** | Project ID is mandatory when Import_Type is DBT_CLOUD | [optional]  |
| **dbtEnvId** | **string?** | DBT Environment ID\\\&quot; | [optional]  |
| **projectName** | **string?** | Name of the project | [optional]  |
| **fileContent** | **FileParameter?****FileParameter?** | Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is &#39;ZIP_FILE&#39; | [optional]  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DBT Connection successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateemailcustomization"></a>
# **UpdateEmailCustomization**
> void UpdateEmailCustomization (UpdateEmailCustomizationRequest updateEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",      \"cta_text_font_color\": \"#FFFFFF\",      \"primary_bg_color\": \"#D3DEF0\",         \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",        \"font_family\": \"\",      \"product_name\": \"ThoughtSpot\",      \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",      \"footer_phone\": \"(800) 508-7008\",         \"replacement_value_for_liveboard\": \"Dashboard\",      \"replacement_value_for_answer\": \"Chart\",      \"replacement_value_for_spot_iq\": \"AI Insights\",         \"hide_footer_phone\": false,         \"hide_footer_address\": false,         \"hide_product_name\": false,      \"hide_manage_notification\": false,      \"hide_mobile_app_nudge\": false,      \"hide_privacy_policy\": false,       \"hide_ts_vocabulary_definitions\": false,      \"hide_error_message\": false,      \"hide_unsubscribe_link\": false,         \"hide_notification_status\": false,      \"hide_modify_alert\": false,      \"company_website_url\": \"https://your-website.com/\",      \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",         \"contact_support_url\": \"https://link-to-contact-support.com/\",         \"hide_contact_support_url\": false,      \"hide_logo_url\" : false   } } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateEmailCustomizationRequest = new UpdateEmailCustomizationRequest(); // UpdateEmailCustomizationRequest | 

            try
            {
                apiInstance.UpdateEmailCustomization(updateEmailCustomizationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateEmailCustomizationWithHttpInfo(updateEmailCustomizationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateEmailCustomizationRequest** | [**UpdateEmailCustomizationRequest**](UpdateEmailCustomizationRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Email Customization configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatemetadataheader"></a>
# **UpdateMetadataHeader**
> void UpdateMetadataHeader (UpdateMetadataHeaderRequest updateMetadataHeaderRequest)



 Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  - --  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either `identifier` or `obj_identifier`, but not both. Both fields cannot be empty.       - When `org_identifier` is set to `-1`, only the `identifier` value is accepted; `obj_identifier` is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide `org_guid` or `org_name` to uniquely identify the organization where changes need to be applied. .      - Provide `-1` if changes have to be applied across all the org.  - --  ## Note Currently, this API is enabled only for updating the `obj_identifier` attribute. Only `text` will be allowed in attribute's value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  - --  ## Examples  ### Only `identifier` is given  ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"obj_identifier\": \"\",       \"type\": \"LOGICAL_COLUMN\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgGuid\" } ```  ### Only `obj_identifier` is given ```json {   \"headers_update\":   [     {       \"obj_identifier\": \"custom_object_id\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgName\" } ```  ### Executing update for all org `-1` ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```  ### Optional `type` is not provided ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateMetadataHeaderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateMetadataHeaderRequest = new UpdateMetadataHeaderRequest(); // UpdateMetadataHeaderRequest | 

            try
            {
                apiInstance.UpdateMetadataHeader(updateMetadataHeaderRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateMetadataHeader: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateMetadataHeaderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateMetadataHeaderWithHttpInfo(updateMetadataHeaderRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateMetadataHeaderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateMetadataHeaderRequest** | [**UpdateMetadataHeaderRequest**](UpdateMetadataHeaderRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Headers update was successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatemetadataobjid"></a>
# **UpdateMetadataObjId**
> void UpdateMetadataObjId (UpdateMetadataObjIdRequest updateMetadataObjIdRequest)



 Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  - --  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either `current_obj_id` alone OR use `metadata_identifier` with `type` (when needed).       - When using `metadata_identifier`, the `type` field is required if using a name instead of a GUID.       - The `new_obj_id` field is always required.  - --  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using `current_obj_id`, ensure it matches the existing object ID exactly.    - When using `metadata_identifier` with a name, ensure the `type` is specified correctly.    - Verify that the `new_obj_id` follows your naming conventions and is unique within your system.  - --  ## Examples  ### Using current_obj_id ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with GUID ```json {   \"metadata\": [     {       \"metadata_identifier\": \"01234567-89ab-cdef-0123-456789abcdef\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with name and type ```json {   \"metadata\": [     {       \"metadata_identifier\": \"My Answer\",       \"type\": \"ANSWER\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Multiple objects update ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id_1\",       \"new_obj_id\": \"new_object_id_1\"     },     {       \"metadata_identifier\": \"My Worksheet\",       \"type\": \"LOGICAL_TABLE\",       \"new_obj_id\": \"new_object_id_2\"     }   ] } ```      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateMetadataObjIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateMetadataObjIdRequest = new UpdateMetadataObjIdRequest(); // UpdateMetadataObjIdRequest | 

            try
            {
                apiInstance.UpdateMetadataObjId(updateMetadataObjIdRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateMetadataObjId: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateMetadataObjIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateMetadataObjIdWithHttpInfo(updateMetadataObjIdRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateMetadataObjIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateMetadataObjIdRequest** | [**UpdateMetadataObjIdRequest**](UpdateMetadataObjIdRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Headers update was successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateorg"></a>
# **UpdateOrg**
> void UpdateOrg (string orgIdentifier, UpdateOrgRequest updateOrgRequest)



  Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateOrgExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var orgIdentifier = "orgIdentifier_example";  // string | ID or name of the Org
            var updateOrgRequest = new UpdateOrgRequest(); // UpdateOrgRequest | 

            try
            {
                apiInstance.UpdateOrg(orgIdentifier, updateOrgRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateOrg: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateOrgWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateOrgWithHttpInfo(orgIdentifier, updateOrgRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateOrgWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **orgIdentifier** | **string** | ID or name of the Org |  |
| **updateOrgRequest** | [**UpdateOrgRequest**](UpdateOrgRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Organization successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updaterole"></a>
# **UpdateRole**
> RoleResponse UpdateRole (string roleIdentifier, UpdateRoleRequest updateRoleRequest)



  Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateRoleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var roleIdentifier = "roleIdentifier_example";  // string | Unique ID or name of the Role.
            var updateRoleRequest = new UpdateRoleRequest(); // UpdateRoleRequest | 

            try
            {
                RoleResponse result = apiInstance.UpdateRole(roleIdentifier, updateRoleRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateRole: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateRoleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<RoleResponse> response = apiInstance.UpdateRoleWithHttpInfo(roleIdentifier, updateRoleRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateRoleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **roleIdentifier** | **string** | Unique ID or name of the Role. |  |
| **updateRoleRequest** | [**UpdateRoleRequest**](UpdateRoleRequest.md) |  |  |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Role successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateschedule"></a>
# **UpdateSchedule**
> void UpdateSchedule (string scheduleIdentifier, UpdateScheduleRequest updateScheduleRequest)



 Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  If RBAC is enabled, changing a schedule's `file_format` also requires the download privilege that corresponds to the selected format: `CSV` and `XLSX` require the `CAN_DOWNLOAD_DETAILED_DATA` (**Can download detailed data**) privilege, and `PDF` requires the `CAN_DOWNLOAD_VISUALS` (**Can download visuals**) privilege.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateScheduleExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var scheduleIdentifier = "scheduleIdentifier_example";  // string | Unique ID or name of the schedule.
            var updateScheduleRequest = new UpdateScheduleRequest(); // UpdateScheduleRequest | 

            try
            {
                apiInstance.UpdateSchedule(scheduleIdentifier, updateScheduleRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateSchedule: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateScheduleWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateScheduleWithHttpInfo(scheduleIdentifier, updateScheduleRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateScheduleWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **scheduleIdentifier** | **string** | Unique ID or name of the schedule. |  |
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Schedule successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatestylecustomization"></a>
# **UpdateStyleCustomization**
> void UpdateStyleCustomization (string scope, string? operation = null, StyleResetOptionsInput? resetOptions = null, NavigationPanelInput? navigationPanel = null, StyleColorPaletteInput? chartColorPalette = null, string? embeddedFooterText = null, VisualizationFontsInput? visualizationFonts = null, FileParameter? defaultLogo = null, FileParameter? wideLogo = null)



  Version: 26.7.0.cl or later   Updates style preferences at cluster level or for the authenticated user's org, including navigation panel color, chart color palette, embedded footer text, logo, and font assignments per visualization area. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an Org-level preference falls back to Cluster-level preference, which on reset falls back to system defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**)  privilege.  #### Usage guidelines  Two operations are supported via the `operation` field:  - **REPLACE** (default): Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**: Reverts specific fields to defaults. Specify which fields to reset using `reset_options.style` (for style fields) and `reset_options.visualization_areas` (for font assignments). Fields not listed in `reset_options` are not affected.  #### Logo upload  Logo files are uploaded as binary fields using `multipart/form-data`:  - `default_logo`: Square app icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. - `wide_logo`: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted formats: PNG, JPG.  To reset a logo to the default, use `operation: RESET` with `reset_options.style` set to `DEFAULT_LOGO` or `WIDE_LOGO`.  #### Navigation panel color  Set `navigation_panel.theme` to one of:  - `DARK`: Default dark theme. - `TWO_TONE`: Dual-tone panel style. - `CUSTOM`: User-defined color. Provide `navigation_panel.base_color` as a 6-digit hex string (e.g. `#2359B6`).  #### Chart color palette  Provide exactly 8 color entries in `chart_color_palette.colors`. Each entry requires a `primary` hex color. If `secondary` shades are omitted, the server auto-generates 4 shades from the primary color.  #### Font assignments  Specify `visualization_fonts.chart_visualization_fonts`, `visualization_fonts.table_visualization_fonts`, and `visualization_fonts.advanced_chart_visualization_fonts` to assign custom fonts to specific visualization areas. Only provide the areas you want to update; omitted areas remain unchanged.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateStyleCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var scope = "CLUSTER";  // string | Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user's org. (default to ORG)
            var operation = "REPLACE";  // string? | Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults. (optional)  (default to REPLACE)
            var resetOptions = new StyleResetOptionsInput?(); // StyleResetOptionsInput? | Fields to reset when operation is RESET. Specify style fields and visualization areas to revert to defaults. (optional) 
            var navigationPanel = new NavigationPanelInput?(); // NavigationPanelInput? | Navigation panel color. Provide theme and, when theme is CUSTOM, also provide base_color. (optional) 
            var chartColorPalette = new StyleColorPaletteInput?(); // StyleColorPaletteInput? | Chart color palette. When provided with operation REPLACE, exactly 8 color entries must be specified in colors. (optional) 
            var embeddedFooterText = "embeddedFooterText_example";  // string? | Custom footer text for the embedded application. An empty string clears the footer. (optional) 
            var visualizationFonts = new VisualizationFontsInput?(); // VisualizationFontsInput? | Font assignments per visualization area. Provide only the areas to update; omitted areas remain unchanged. (optional) 
            var defaultLogo = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG. (optional) 
            var wideLogo = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? | Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG. (optional) 

            try
            {
                apiInstance.UpdateStyleCustomization(scope, operation, resetOptions, navigationPanel, chartColorPalette, embeddedFooterText, visualizationFonts, defaultLogo, wideLogo);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateStyleCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateStyleCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateStyleCustomizationWithHttpInfo(scope, operation, resetOptions, navigationPanel, chartColorPalette, embeddedFooterText, visualizationFonts, defaultLogo, wideLogo);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateStyleCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **scope** | **string** | Scope at which to apply the preferences. CLUSTER sets cluster-level defaults for all orgs. ORG applies to the authenticated user&#39;s org. | [default to ORG] |
| **operation** | **string?** | Operation to perform. REPLACE (default) applies the provided fields and leaves omitted fields unchanged. RESET reverts fields listed in reset_options to defaults. | [optional] [default to REPLACE] |
| **resetOptions** | [**StyleResetOptionsInput?**](StyleResetOptionsInput?.md) | Fields to reset when operation is RESET. Specify style fields and visualization areas to revert to defaults. | [optional]  |
| **navigationPanel** | [**NavigationPanelInput?**](NavigationPanelInput?.md) | Navigation panel color. Provide theme and, when theme is CUSTOM, also provide base_color. | [optional]  |
| **chartColorPalette** | [**StyleColorPaletteInput?**](StyleColorPaletteInput?.md) | Chart color palette. When provided with operation REPLACE, exactly 8 color entries must be specified in colors. | [optional]  |
| **embeddedFooterText** | **string?** | Custom footer text for the embedded application. An empty string clears the footer. | [optional]  |
| **visualizationFonts** | [**VisualizationFontsInput?**](VisualizationFontsInput?.md) | Font assignments per visualization area. Provide only the areas to update; omitted areas remain unchanged. | [optional]  |
| **defaultLogo** | **FileParameter?****FileParameter?** | Binary image for the DEFAULT logo slot (square app icon and favicon; recommended 140x140 px). Accepted formats: PNG, JPG. | [optional]  |
| **wideLogo** | **FileParameter?****FileParameter?** | Binary image for the WIDE logo slot (horizontal top nav bar logo; recommended 230x45 px). Accepted formats: PNG, JPG. | [optional]  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Style preferences updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatestylefont"></a>
# **UpdateStyleFont**
> void UpdateStyleFont (string fontIdentifier, UpdateStyleFontRequest updateStyleFontRequest)



  Version: 26.7.0.cl or later   Updates the metadata of an existing custom font in the cluster-level or org-level font library. Only the fields provided in the request are modified; omitted fields remain unchanged.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Identify the font using `font_identifier` (UUID or name). - Set `scope` to `CLUSTER` to target the cluster-level library. Set `scope` to `ORG` (default) to target the authenticated user's org library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and re-upload using `uploadStyleFont`. - `color` must be a valid 6-digit hex string (e.g. `#333333`) if provided.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateStyleFontExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var fontIdentifier = "fontIdentifier_example";  // string | UUID or name of the font to update.
            var updateStyleFontRequest = new UpdateStyleFontRequest(); // UpdateStyleFontRequest | 

            try
            {
                apiInstance.UpdateStyleFont(fontIdentifier, updateStyleFontRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateStyleFont: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateStyleFontWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateStyleFontWithHttpInfo(fontIdentifier, updateStyleFontRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateStyleFontWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fontIdentifier** | **string** | UUID or name of the font to update. |  |
| **updateStyleFontRequest** | [**UpdateStyleFontRequest**](UpdateStyleFontRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Font metadata updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatesystemconfig"></a>
# **UpdateSystemConfig**
> void UpdateSystemConfig (UpdateSystemConfigRequest updateSystemConfigRequest)



  Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateSystemConfigExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateSystemConfigRequest = new UpdateSystemConfigRequest(); // UpdateSystemConfigRequest | 

            try
            {
                apiInstance.UpdateSystemConfig(updateSystemConfigRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateSystemConfig: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateSystemConfigWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateSystemConfigWithHttpInfo(updateSystemConfigRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateSystemConfigWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateSystemConfigRequest** | [**UpdateSystemConfigRequest**](UpdateSystemConfigRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Configuration successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatetag"></a>
# **UpdateTag**
> void UpdateTag (string tagIdentifier, UpdateTagRequest updateTagRequest)



  Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateTagExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var tagIdentifier = "tagIdentifier_example";  // string | Name or Id of the tag.
            var updateTagRequest = new UpdateTagRequest(); // UpdateTagRequest | 

            try
            {
                apiInstance.UpdateTag(tagIdentifier, updateTagRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateTag: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateTagWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateTagWithHttpInfo(tagIdentifier, updateTagRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateTagWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **tagIdentifier** | **string** | Name or Id of the tag. |  |
| **updateTagRequest** | [**UpdateTagRequest**](UpdateTagRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Tag successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateuser"></a>
# **UpdateUser**
> void UpdateUser (string userIdentifier, UpdateUserRequest updateUserRequest)



  Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateUserExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var userIdentifier = "userIdentifier_example";  // string | GUID / name of the user
            var updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 

            try
            {
                apiInstance.UpdateUser(userIdentifier, updateUserRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateUser: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateUserWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateUserWithHttpInfo(userIdentifier, updateUserRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateUserWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userIdentifier** | **string** | GUID / name of the user |  |
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateusergroup"></a>
# **UpdateUserGroup**
> void UpdateUserGroup (string groupIdentifier, UpdateUserGroupRequest updateUserGroupRequest)



  Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateUserGroupExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var groupIdentifier = "groupIdentifier_example";  // string | GUID or name of the group.
            var updateUserGroupRequest = new UpdateUserGroupRequest(); // UpdateUserGroupRequest | 

            try
            {
                apiInstance.UpdateUserGroup(groupIdentifier, updateUserGroupRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateUserGroup: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateUserGroupWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateUserGroupWithHttpInfo(groupIdentifier, updateUserGroupRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateUserGroupWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **groupIdentifier** | **string** | GUID or name of the group. |  |
| **updateUserGroupRequest** | [**UpdateUserGroupRequest**](UpdateUserGroupRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User group successfully updated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatevariable"></a>
# **UpdateVariable**
> void UpdateVariable (string identifier, UpdateVariableRequest updateVariableRequest)



 Update a variable's name    Version: 26.4.0.cl or later   Allows updating a variable's name in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows updating: * The variable name     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateVariableExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var identifier = "identifier_example";  // string | Unique id or name of the variable to update.
            var updateVariableRequest = new UpdateVariableRequest(); // UpdateVariableRequest | 

            try
            {
                apiInstance.UpdateVariable(identifier, updateVariableRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateVariable: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateVariableWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateVariableWithHttpInfo(identifier, updateVariableRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateVariableWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **identifier** | **string** | Unique id or name of the variable to update. |  |
| **updateVariableRequest** | [**UpdateVariableRequest**](UpdateVariableRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Variable name updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatevariablevalues"></a>
# **UpdateVariableValues**
> void UpdateVariableValues (UpdateVariableValuesRequest updateVariableValuesRequest)



 Update values for multiple variables    Version: 10.14.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/template/variables/{identifier}/update-values](/api/rest/2.0/template/variables/%7Bidentifier%7D/update-values) instead.  Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constrains for a given variable, scope is ignored      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateVariableValuesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var updateVariableValuesRequest = new UpdateVariableValuesRequest(); // UpdateVariableValuesRequest | 

            try
            {
                apiInstance.UpdateVariableValues(updateVariableValuesRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateVariableValues: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateVariableValuesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateVariableValuesWithHttpInfo(updateVariableValuesRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateVariableValuesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateVariableValuesRequest** | [**UpdateVariableValuesRequest**](UpdateVariableValuesRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Variable values updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatewebhookconfiguration"></a>
# **UpdateWebhookConfiguration**
> void UpdateWebhookConfiguration (string webhookIdentifier, UpdateWebhookConfigurationRequest updateWebhookConfigurationRequest)



  Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UpdateWebhookConfigurationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var webhookIdentifier = "webhookIdentifier_example";  // string | Unique ID or name of the webhook configuration.
            var updateWebhookConfigurationRequest = new UpdateWebhookConfigurationRequest(); // UpdateWebhookConfigurationRequest | 

            try
            {
                apiInstance.UpdateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateWebhookConfiguration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateWebhookConfigurationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.UpdateWebhookConfigurationWithHttpInfo(webhookIdentifier, updateWebhookConfigurationRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UpdateWebhookConfigurationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **webhookIdentifier** | **string** | Unique ID or name of the webhook configuration. |  |
| **updateWebhookConfigurationRequest** | [**UpdateWebhookConfigurationRequest**](UpdateWebhookConfigurationRequest.md) |  |  |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Webhook configuration updated successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="uploadstylefont"></a>
# **UploadStyleFont**
> StyleFontUploadData UploadStyleFont (string name, FileParameter fileContent, string? scope = null, string? weight = null, string? style = null, string? color = null)



  Version: 26.7.0.cl or later   Uploads a custom font to the cluster-level or org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only available within that org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege.  #### Usage guidelines  - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are rejected with an error. - Set `scope` to `CLUSTER` to upload to the cluster-level library. Set `scope` to `ORG` (default) to upload to the authenticated user's org library. - `weight` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `LIGHT`, `BOLD`. - `style` defaults to `NORMAL` if omitted. Supported values: `NORMAL`, `ITALIC`, `OBLIQUE`. - `color` defaults to `#000000` (black) if omitted. Provide as a 6-digit hex string (e.g. `#333333`). - The uploaded font can be assigned to visualization areas using the `updateStyleCustomization` endpoint.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class UploadStyleFontExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var name = "name_example";  // string | Display name for the font (e.g. \\\"Acme Sans\\\"). Must be unique within the target scope; returns an error if a font with this name already exists.
            var fileContent = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter | Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload.
            var scope = "CLUSTER";  // string? | Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user's org library. Defaults to ORG if omitted. (optional)  (default to ORG)
            var weight = "NORMAL";  // string? | Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted. (optional)  (default to NORMAL)
            var style = "NORMAL";  // string? | Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted. (optional)  (default to NORMAL)
            var color = "color_example";  // string? | Color of the font as a 6-digit hex string (e.g. \\\"#333333\\\"). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed. (optional) 

            try
            {
                StyleFontUploadData result = apiInstance.UploadStyleFont(name, fileContent, scope, weight, style, color);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.UploadStyleFont: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UploadStyleFontWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<StyleFontUploadData> response = apiInstance.UploadStyleFontWithHttpInfo(name, fileContent, scope, weight, style, color);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.UploadStyleFontWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** | Display name for the font (e.g. \\\&quot;Acme Sans\\\&quot;). Must be unique within the target scope; returns an error if a font with this name already exists. |  |
| **fileContent** | **FileParameter****FileParameter** | Binary WOFF or WOFF2 font file to upload. Only WOFF and WOFF2 formats are accepted; TTF and OTF are rejected. The file is validated on upload. |  |
| **scope** | **string?** | Scope of the font library to upload to. CLUSTER uploads to the cluster-level library, making the font available as a default for all orgs. ORG uploads to the authenticated user&#39;s org library. Defaults to ORG if omitted. | [optional] [default to ORG] |
| **weight** | **string?** | Weight of the font. Supported values: NORMAL, LIGHT, BOLD. Defaults to NORMAL if omitted. | [optional] [default to NORMAL] |
| **style** | **string?** | Style of the font. Supported values: NORMAL, ITALIC, OBLIQUE. Defaults to NORMAL if omitted. | [optional] [default to NORMAL] |
| **color** | **string?** | Color of the font as a 6-digit hex string (e.g. \\\&quot;#333333\\\&quot;). Defaults to #000000 (black) if omitted. Returns an error if the value is malformed. | [optional]  |

### Return type

[**StyleFontUploadData**](StyleFontUploadData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Font uploaded successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="validatecommunicationchannel"></a>
# **ValidateCommunicationChannel**
> CommunicationChannelValidateResponse ValidateCommunicationChannel (ValidateCommunicationChannelRequest validateCommunicationChannelRequest)



 Version: 26.4.0.cl or later   Validates a communication channel configuration to ensure it is properly set up and can receive events. - Use `channel_type` to specify the type of communication channel to validate (e.g., WEBHOOK). - Use `channel_identifier` to provide the unique identifier or name for the communication channel. - Use `event_type` to specify the event type to validate for this channel.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. For webhook channels, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ValidateCommunicationChannelExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var validateCommunicationChannelRequest = new ValidateCommunicationChannelRequest(); // ValidateCommunicationChannelRequest | 

            try
            {
                CommunicationChannelValidateResponse result = apiInstance.ValidateCommunicationChannel(validateCommunicationChannelRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateCommunicationChannel: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ValidateCommunicationChannelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<CommunicationChannelValidateResponse> response = apiInstance.ValidateCommunicationChannelWithHttpInfo(validateCommunicationChannelRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateCommunicationChannelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **validateCommunicationChannelRequest** | [**ValidateCommunicationChannelRequest**](ValidateCommunicationChannelRequest.md) |  |  |

### Return type

[**CommunicationChannelValidateResponse**](CommunicationChannelValidateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | communication channel configuration validated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="validateemailcustomization"></a>
# **ValidateEmailCustomization**
> void ValidateEmailCustomization ()



 Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ValidateEmailCustomizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);

            try
            {
                apiInstance.ValidateEmailCustomization();
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateEmailCustomization: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ValidateEmailCustomizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    apiInstance.ValidateEmailCustomizationWithHttpInfo();
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateEmailCustomizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Triggered test email for customization configuration |  -  |
| **400** | Invalid request. |  -  |
| **403** | Unauthorized access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="validatemerge"></a>
# **ValidateMerge**
> List&lt;DeployResponse&gt; ValidateMerge (ValidateMergeRequest validateMergeRequest)



  Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ValidateMergeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var validateMergeRequest = new ValidateMergeRequest(); // ValidateMergeRequest | 

            try
            {
                List<DeployResponse> result = apiInstance.ValidateMerge(validateMergeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateMerge: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ValidateMergeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<DeployResponse>> response = apiInstance.ValidateMergeWithHttpInfo(validateMergeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateMergeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **validateMergeRequest** | [**ValidateMergeRequest**](ValidateMergeRequest.md) |  |  |

### Return type

[**List&lt;DeployResponse&gt;**](DeployResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | validation done successfully |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="validatetoken"></a>
# **ValidateToken**
> TokenValidationResponse ValidateToken (ValidateTokenRequest validateTokenRequest)



  Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using ThoughtSpot.RestApi.Sdk.Api;
using ThoughtSpot.RestApi.Sdk.Client;
using ThoughtSpot.RestApi.Sdk.Model;

namespace Example
{
    public class ValidateTokenExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost:443";
            // Configure Bearer token for authorization: bearerAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ThoughtSpotRestApi(httpClient, config, httpClientHandler);
            var validateTokenRequest = new ValidateTokenRequest(); // ValidateTokenRequest | 

            try
            {
                TokenValidationResponse result = apiInstance.ValidateToken(validateTokenRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateToken: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ValidateTokenWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<TokenValidationResponse> response = apiInstance.ValidateTokenWithHttpInfo(validateTokenRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ThoughtSpotRestApi.ValidateTokenWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **validateTokenRequest** | [**ValidateTokenRequest**](ValidateTokenRequest.md) |  |  |

### Return type

[**TokenValidationResponse**](TokenValidationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token validation successful. |  -  |
| **400** | Invalid request. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden access. |  -  |
| **500** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

