# ThoughtSpotRestApi

All URIs are relative to *CLUSTER_URL*

| Method | HTTP request |
|------------- | ------------- |
| [**activateUser**](ThoughtSpotRestApi.md#activateUser) | **POST** /api/rest/2.0/users/activate |
| [**assignChangeAuthor**](ThoughtSpotRestApi.md#assignChangeAuthor) | **POST** /api/rest/2.0/security/metadata/assign |
| [**assignTag**](ThoughtSpotRestApi.md#assignTag) | **POST** /api/rest/2.0/tags/assign |
| [**changeUserPassword**](ThoughtSpotRestApi.md#changeUserPassword) | **POST** /api/rest/2.0/users/change-password |
| [**commitBranch**](ThoughtSpotRestApi.md#commitBranch) | **POST** /api/rest/2.0/vcs/git/branches/commit |
| [**configureAuthSettings**](ThoughtSpotRestApi.md#configureAuthSettings) | **POST** /api/rest/2.0/auth/configure |
| [**configureCommunicationChannelPreferences**](ThoughtSpotRestApi.md#configureCommunicationChannelPreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/configure |
| [**configureSecuritySettings**](ThoughtSpotRestApi.md#configureSecuritySettings) | **POST** /api/rest/2.0/system/security-settings/configure |
| [**connectionConfigurationSearch**](ThoughtSpotRestApi.md#connectionConfigurationSearch) | **POST** /api/rest/2.0/connection-configurations/search |
| [**convertWorksheetToModel**](ThoughtSpotRestApi.md#convertWorksheetToModel) | **POST** /api/rest/2.0/metadata/worksheets/convert |
| [**copyObject**](ThoughtSpotRestApi.md#copyObject) | **POST** /api/rest/2.0/metadata/copyobject |
| [**createAgentConversation**](ThoughtSpotRestApi.md#createAgentConversation) | **POST** /api/rest/2.0/ai/agent/conversation/create |
| [**createCalendar**](ThoughtSpotRestApi.md#createCalendar) | **POST** /api/rest/2.0/calendars/create |
| [**createCollection**](ThoughtSpotRestApi.md#createCollection) | **POST** /api/rest/2.0/collections/create |
| [**createConfig**](ThoughtSpotRestApi.md#createConfig) | **POST** /api/rest/2.0/vcs/git/config/create |
| [**createConnection**](ThoughtSpotRestApi.md#createConnection) | **POST** /api/rest/2.0/connection/create |
| [**createConnectionConfiguration**](ThoughtSpotRestApi.md#createConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/create |
| [**createConversation**](ThoughtSpotRestApi.md#createConversation) | **POST** /api/rest/2.0/ai/conversation/create |
| [**createCustomAction**](ThoughtSpotRestApi.md#createCustomAction) | **POST** /api/rest/2.0/customization/custom-actions |
| [**createEmailCustomization**](ThoughtSpotRestApi.md#createEmailCustomization) | **POST** /api/rest/2.0/customization/email |
| [**createOrg**](ThoughtSpotRestApi.md#createOrg) | **POST** /api/rest/2.0/orgs/create |
| [**createRole**](ThoughtSpotRestApi.md#createRole) | **POST** /api/rest/2.0/roles/create |
| [**createSchedule**](ThoughtSpotRestApi.md#createSchedule) | **POST** /api/rest/2.0/schedules/create |
| [**createTag**](ThoughtSpotRestApi.md#createTag) | **POST** /api/rest/2.0/tags/create |
| [**createUser**](ThoughtSpotRestApi.md#createUser) | **POST** /api/rest/2.0/users/create |
| [**createUserGroup**](ThoughtSpotRestApi.md#createUserGroup) | **POST** /api/rest/2.0/groups/create |
| [**createVariable**](ThoughtSpotRestApi.md#createVariable) | **POST** /api/rest/2.0/template/variables/create |
| [**createWebhookConfiguration**](ThoughtSpotRestApi.md#createWebhookConfiguration) | **POST** /api/rest/2.0/webhooks/create |
| [**dbtConnection**](ThoughtSpotRestApi.md#dbtConnection) | **POST** /api/rest/2.0/dbt/dbt-connection |
| [**dbtGenerateSyncTml**](ThoughtSpotRestApi.md#dbtGenerateSyncTml) | **POST** /api/rest/2.0/dbt/generate-sync-tml |
| [**dbtGenerateTml**](ThoughtSpotRestApi.md#dbtGenerateTml) | **POST** /api/rest/2.0/dbt/generate-tml |
| [**dbtSearch**](ThoughtSpotRestApi.md#dbtSearch) | **POST** /api/rest/2.0/dbt/search |
| [**deactivateUser**](ThoughtSpotRestApi.md#deactivateUser) | **POST** /api/rest/2.0/users/deactivate |
| [**deleteCalendar**](ThoughtSpotRestApi.md#deleteCalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/delete |
| [**deleteCollection**](ThoughtSpotRestApi.md#deleteCollection) | **POST** /api/rest/2.0/collections/delete |
| [**deleteConfig**](ThoughtSpotRestApi.md#deleteConfig) | **POST** /api/rest/2.0/vcs/git/config/delete |
| [**deleteConnection**](ThoughtSpotRestApi.md#deleteConnection) | **POST** /api/rest/2.0/connection/delete |
| [**deleteConnectionConfiguration**](ThoughtSpotRestApi.md#deleteConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/delete |
| [**deleteConnectionV2**](ThoughtSpotRestApi.md#deleteConnectionV2) | **POST** /api/rest/2.0/connections/{connection_identifier}/delete |
| [**deleteConversation**](ThoughtSpotRestApi.md#deleteConversation) | **DELETE** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete |
| [**deleteCustomAction**](ThoughtSpotRestApi.md#deleteCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete |
| [**deleteDbtConnection**](ThoughtSpotRestApi.md#deleteDbtConnection) | **POST** /api/rest/2.0/dbt/{dbt_connection_identifier}/delete |
| [**deleteEmailCustomization**](ThoughtSpotRestApi.md#deleteEmailCustomization) | **POST** /api/rest/2.0/customization/email/{template_identifier}/delete |
| [**deleteManualTranslations**](ThoughtSpotRestApi.md#deleteManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/delete |
| [**deleteMetadata**](ThoughtSpotRestApi.md#deleteMetadata) | **POST** /api/rest/2.0/metadata/delete |
| [**deleteOrg**](ThoughtSpotRestApi.md#deleteOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/delete |
| [**deleteOrgEmailCustomization**](ThoughtSpotRestApi.md#deleteOrgEmailCustomization) | **POST** /api/rest/2.0/customization/email/delete |
| [**deleteRole**](ThoughtSpotRestApi.md#deleteRole) | **POST** /api/rest/2.0/roles/{role_identifier}/delete |
| [**deleteSchedule**](ThoughtSpotRestApi.md#deleteSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/delete |
| [**deleteStyleFonts**](ThoughtSpotRestApi.md#deleteStyleFonts) | **POST** /api/rest/2.0/customization/styles/fonts/delete |
| [**deleteTag**](ThoughtSpotRestApi.md#deleteTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/delete |
| [**deleteUser**](ThoughtSpotRestApi.md#deleteUser) | **POST** /api/rest/2.0/users/{user_identifier}/delete |
| [**deleteUserGroup**](ThoughtSpotRestApi.md#deleteUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/delete |
| [**deleteVariable**](ThoughtSpotRestApi.md#deleteVariable) | **POST** /api/rest/2.0/template/variables/{identifier}/delete |
| [**deleteVariables**](ThoughtSpotRestApi.md#deleteVariables) | **POST** /api/rest/2.0/template/variables/delete |
| [**deleteWebhookConfigurations**](ThoughtSpotRestApi.md#deleteWebhookConfigurations) | **POST** /api/rest/2.0/webhooks/delete |
| [**deployCommit**](ThoughtSpotRestApi.md#deployCommit) | **POST** /api/rest/2.0/vcs/git/commits/deploy |
| [**downloadConnectionMetadataChanges**](ThoughtSpotRestApi.md#downloadConnectionMetadataChanges) | **POST** /api/rest/2.0/connections/download-connection-metadata-changes/{connection_identifier} |
| [**exportAnswerReport**](ThoughtSpotRestApi.md#exportAnswerReport) | **POST** /api/rest/2.0/report/answer |
| [**exportLiveboardReport**](ThoughtSpotRestApi.md#exportLiveboardReport) | **POST** /api/rest/2.0/report/liveboard |
| [**exportManualTranslations**](ThoughtSpotRestApi.md#exportManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/export |
| [**exportMetadataTML**](ThoughtSpotRestApi.md#exportMetadataTML) | **POST** /api/rest/2.0/metadata/tml/export |
| [**exportMetadataTMLBatched**](ThoughtSpotRestApi.md#exportMetadataTMLBatched) | **POST** /api/rest/2.0/metadata/tml/export/batch |
| [**exportStyleLogos**](ThoughtSpotRestApi.md#exportStyleLogos) | **POST** /api/rest/2.0/customization/styles/logos/export |
| [**fetchAnswerData**](ThoughtSpotRestApi.md#fetchAnswerData) | **POST** /api/rest/2.0/metadata/answer/data |
| [**fetchAnswerSqlQuery**](ThoughtSpotRestApi.md#fetchAnswerSqlQuery) | **POST** /api/rest/2.0/metadata/answer/sql |
| [**fetchAsyncImportTaskStatus**](ThoughtSpotRestApi.md#fetchAsyncImportTaskStatus) | **POST** /api/rest/2.0/metadata/tml/async/status |
| [**fetchColumnSecurityRules**](ThoughtSpotRestApi.md#fetchColumnSecurityRules) | **POST** /api/rest/2.0/security/column/rules/fetch |
| [**fetchConnectionDiffStatus**](ThoughtSpotRestApi.md#fetchConnectionDiffStatus) | **POST** /api/rest/2.0/connections/fetch-connection-diff-status/{connection_identifier} |
| [**fetchLiveboardData**](ThoughtSpotRestApi.md#fetchLiveboardData) | **POST** /api/rest/2.0/metadata/liveboard/data |
| [**fetchLiveboardSqlQuery**](ThoughtSpotRestApi.md#fetchLiveboardSqlQuery) | **POST** /api/rest/2.0/metadata/liveboard/sql |
| [**fetchLogs**](ThoughtSpotRestApi.md#fetchLogs) | **POST** /api/rest/2.0/logs/fetch |
| [**fetchObjectPrivileges**](ThoughtSpotRestApi.md#fetchObjectPrivileges) | **POST** /api/rest/2.0/security/metadata/fetch-object-privileges |
| [**fetchPermissionsOfPrincipals**](ThoughtSpotRestApi.md#fetchPermissionsOfPrincipals) | **POST** /api/rest/2.0/security/principals/fetch-permissions |
| [**fetchPermissionsOnMetadata**](ThoughtSpotRestApi.md#fetchPermissionsOnMetadata) | **POST** /api/rest/2.0/security/metadata/fetch-permissions |
| [**forceLogoutUsers**](ThoughtSpotRestApi.md#forceLogoutUsers) | **POST** /api/rest/2.0/users/force-logout |
| [**generateCSV**](ThoughtSpotRestApi.md#generateCSV) | **POST** /api/rest/2.0/calendars/generate-csv |
| [**getAgentInstructions**](ThoughtSpotRestApi.md#getAgentInstructions) | **GET** /api/rest/2.0/ai/agent/instructions/get |
| [**getConversation**](ThoughtSpotRestApi.md#getConversation) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages |
| [**getConversationList**](ThoughtSpotRestApi.md#getConversationList) | **GET** /api/rest/2.0/ai/agent/conversations |
| [**getCurrentUserInfo**](ThoughtSpotRestApi.md#getCurrentUserInfo) | **GET** /api/rest/2.0/auth/session/user |
| [**getCurrentUserToken**](ThoughtSpotRestApi.md#getCurrentUserToken) | **GET** /api/rest/2.0/auth/session/token |
| [**getCustomAccessToken**](ThoughtSpotRestApi.md#getCustomAccessToken) | **POST** /api/rest/2.0/auth/token/custom |
| [**getDataSourceSuggestions**](ThoughtSpotRestApi.md#getDataSourceSuggestions) | **POST** /api/rest/2.0/ai/data-source-suggestions |
| [**getFullAccessToken**](ThoughtSpotRestApi.md#getFullAccessToken) | **POST** /api/rest/2.0/auth/token/full |
| [**getManualTranslationBundle**](ThoughtSpotRestApi.md#getManualTranslationBundle) | **POST** /api/rest/2.0/localizations/manual-translation/locales/{locale}/export |
| [**getNLInstructions**](ThoughtSpotRestApi.md#getNLInstructions) | **POST** /api/rest/2.0/ai/instructions/get |
| [**getObjectAccessToken**](ThoughtSpotRestApi.md#getObjectAccessToken) | **POST** /api/rest/2.0/auth/token/object |
| [**getRelevantQuestions**](ThoughtSpotRestApi.md#getRelevantQuestions) | **POST** /api/rest/2.0/ai/relevant-questions/ |
| [**getSystemConfig**](ThoughtSpotRestApi.md#getSystemConfig) | **GET** /api/rest/2.0/system/config |
| [**getSystemInformation**](ThoughtSpotRestApi.md#getSystemInformation) | **GET** /api/rest/2.0/system |
| [**getSystemOverrideInfo**](ThoughtSpotRestApi.md#getSystemOverrideInfo) | **GET** /api/rest/2.0/system/config-overrides |
| [**getWebhookStorageConfig**](ThoughtSpotRestApi.md#getWebhookStorageConfig) | **GET** /api/rest/2.0/webhooks/storage-config |
| [**importManualTranslations**](ThoughtSpotRestApi.md#importManualTranslations) | **POST** /api/rest/2.0/localizations/manual-translation/import |
| [**importMetadataTML**](ThoughtSpotRestApi.md#importMetadataTML) | **POST** /api/rest/2.0/metadata/tml/import |
| [**importMetadataTMLAsync**](ThoughtSpotRestApi.md#importMetadataTMLAsync) | **POST** /api/rest/2.0/metadata/tml/async/import |
| [**importUserGroups**](ThoughtSpotRestApi.md#importUserGroups) | **POST** /api/rest/2.0/groups/import |
| [**importUsers**](ThoughtSpotRestApi.md#importUsers) | **POST** /api/rest/2.0/users/import |
| [**loadAnswer**](ThoughtSpotRestApi.md#loadAnswer) | **GET** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details |
| [**login**](ThoughtSpotRestApi.md#login) | **POST** /api/rest/2.0/auth/session/login |
| [**logout**](ThoughtSpotRestApi.md#logout) | **POST** /api/rest/2.0/auth/session/logout |
| [**manageObjectPrivilege**](ThoughtSpotRestApi.md#manageObjectPrivilege) | **POST** /api/rest/2.0/security/metadata/manage-object-privilege |
| [**parameterizeMetadata**](ThoughtSpotRestApi.md#parameterizeMetadata) | **POST** /api/rest/2.0/metadata/parameterize |
| [**parameterizeMetadataFields**](ThoughtSpotRestApi.md#parameterizeMetadataFields) | **POST** /api/rest/2.0/metadata/parameterize-fields |
| [**publishMetadata**](ThoughtSpotRestApi.md#publishMetadata) | **POST** /api/rest/2.0/security/metadata/publish |
| [**putVariableValues**](ThoughtSpotRestApi.md#putVariableValues) | **POST** /api/rest/2.0/template/variables/{identifier}/update-values |
| [**queryGetDecomposedQuery**](ThoughtSpotRestApi.md#queryGetDecomposedQuery) | **POST** /api/rest/2.0/ai/analytical-questions |
| [**resetUserPassword**](ThoughtSpotRestApi.md#resetUserPassword) | **POST** /api/rest/2.0/users/reset-password |
| [**revertCommit**](ThoughtSpotRestApi.md#revertCommit) | **POST** /api/rest/2.0/vcs/git/commits/{commit_id}/revert |
| [**revokeRefreshTokens**](ThoughtSpotRestApi.md#revokeRefreshTokens) | **POST** /api/rest/2.0/connections/{connection_identifier}/revoke-refresh-tokens |
| [**revokeToken**](ThoughtSpotRestApi.md#revokeToken) | **POST** /api/rest/2.0/auth/token/revoke |
| [**searchAuthSettings**](ThoughtSpotRestApi.md#searchAuthSettings) | **POST** /api/rest/2.0/auth/search |
| [**searchCalendars**](ThoughtSpotRestApi.md#searchCalendars) | **POST** /api/rest/2.0/calendars/search |
| [**searchChannelHistory**](ThoughtSpotRestApi.md#searchChannelHistory) | **POST** /api/rest/2.0/jobs/history/communication-channels/search |
| [**searchCollections**](ThoughtSpotRestApi.md#searchCollections) | **POST** /api/rest/2.0/collections/search |
| [**searchCommits**](ThoughtSpotRestApi.md#searchCommits) | **POST** /api/rest/2.0/vcs/git/commits/search |
| [**searchCommunicationChannelPreferences**](ThoughtSpotRestApi.md#searchCommunicationChannelPreferences) | **POST** /api/rest/2.0/system/preferences/communication-channels/search |
| [**searchConfig**](ThoughtSpotRestApi.md#searchConfig) | **POST** /api/rest/2.0/vcs/git/config/search |
| [**searchConnection**](ThoughtSpotRestApi.md#searchConnection) | **POST** /api/rest/2.0/connection/search |
| [**searchCustomActions**](ThoughtSpotRestApi.md#searchCustomActions) | **POST** /api/rest/2.0/customization/custom-actions/search |
| [**searchData**](ThoughtSpotRestApi.md#searchData) | **POST** /api/rest/2.0/searchdata |
| [**searchEmailCustomization**](ThoughtSpotRestApi.md#searchEmailCustomization) | **POST** /api/rest/2.0/customization/email/search |
| [**searchMetadata**](ThoughtSpotRestApi.md#searchMetadata) | **POST** /api/rest/2.0/metadata/search |
| [**searchOrgs**](ThoughtSpotRestApi.md#searchOrgs) | **POST** /api/rest/2.0/orgs/search |
| [**searchRoles**](ThoughtSpotRestApi.md#searchRoles) | **POST** /api/rest/2.0/roles/search |
| [**searchSchedules**](ThoughtSpotRestApi.md#searchSchedules) | **POST** /api/rest/2.0/schedules/search |
| [**searchSecuritySettings**](ThoughtSpotRestApi.md#searchSecuritySettings) | **POST** /api/rest/2.0/system/security-settings/search |
| [**searchStyleCustomizations**](ThoughtSpotRestApi.md#searchStyleCustomizations) | **POST** /api/rest/2.0/customization/styles/search |
| [**searchStyleFonts**](ThoughtSpotRestApi.md#searchStyleFonts) | **POST** /api/rest/2.0/customization/styles/fonts/search |
| [**searchTags**](ThoughtSpotRestApi.md#searchTags) | **POST** /api/rest/2.0/tags/search |
| [**searchUserGroups**](ThoughtSpotRestApi.md#searchUserGroups) | **POST** /api/rest/2.0/groups/search |
| [**searchUsers**](ThoughtSpotRestApi.md#searchUsers) | **POST** /api/rest/2.0/users/search |
| [**searchVariables**](ThoughtSpotRestApi.md#searchVariables) | **POST** /api/rest/2.0/template/variables/search |
| [**searchWebhookConfigurations**](ThoughtSpotRestApi.md#searchWebhookConfigurations) | **POST** /api/rest/2.0/webhooks/search |
| [**sendAgentConversationMessage**](ThoughtSpotRestApi.md#sendAgentConversationMessage) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send |
| [**sendAgentConversationMessageStreaming**](ThoughtSpotRestApi.md#sendAgentConversationMessageStreaming) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/send/stream |
| [**sendAgentMessage**](ThoughtSpotRestApi.md#sendAgentMessage) | **POST** /api/rest/2.0/ai/agent/{conversation_identifier}/converse |
| [**sendAgentMessageStreaming**](ThoughtSpotRestApi.md#sendAgentMessageStreaming) | **POST** /api/rest/2.0/ai/agent/converse/sse |
| [**sendMessage**](ThoughtSpotRestApi.md#sendMessage) | **POST** /api/rest/2.0/ai/conversation/{conversation_identifier}/converse |
| [**setAgentInstructions**](ThoughtSpotRestApi.md#setAgentInstructions) | **PUT** /api/rest/2.0/ai/agent/instructions/set |
| [**setNLInstructions**](ThoughtSpotRestApi.md#setNLInstructions) | **POST** /api/rest/2.0/ai/instructions/set |
| [**shareMetadata**](ThoughtSpotRestApi.md#shareMetadata) | **POST** /api/rest/2.0/security/metadata/share |
| [**singleAnswer**](ThoughtSpotRestApi.md#singleAnswer) | **POST** /api/rest/2.0/ai/answer/create |
| [**stopConversation**](ThoughtSpotRestApi.md#stopConversation) | **POST** /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response |
| [**syncMetadata**](ThoughtSpotRestApi.md#syncMetadata) | **POST** /api/rest/2.0/connections/{connection_identifier}/resync-metadata |
| [**unassignTag**](ThoughtSpotRestApi.md#unassignTag) | **POST** /api/rest/2.0/tags/unassign |
| [**unparameterizeMetadata**](ThoughtSpotRestApi.md#unparameterizeMetadata) | **POST** /api/rest/2.0/metadata/unparameterize |
| [**unpublishMetadata**](ThoughtSpotRestApi.md#unpublishMetadata) | **POST** /api/rest/2.0/security/metadata/unpublish |
| [**updateCalendar**](ThoughtSpotRestApi.md#updateCalendar) | **POST** /api/rest/2.0/calendars/{calendar_identifier}/update |
| [**updateCollection**](ThoughtSpotRestApi.md#updateCollection) | **POST** /api/rest/2.0/collections/{collection_identifier}/update |
| [**updateColumnSecurityRules**](ThoughtSpotRestApi.md#updateColumnSecurityRules) | **POST** /api/rest/2.0/security/column/rules/update |
| [**updateConfig**](ThoughtSpotRestApi.md#updateConfig) | **POST** /api/rest/2.0/vcs/git/config/update |
| [**updateConnection**](ThoughtSpotRestApi.md#updateConnection) | **POST** /api/rest/2.0/connection/update |
| [**updateConnectionConfiguration**](ThoughtSpotRestApi.md#updateConnectionConfiguration) | **POST** /api/rest/2.0/connection-configurations/{configuration_identifier}/update |
| [**updateConnectionStatus**](ThoughtSpotRestApi.md#updateConnectionStatus) | **POST** /api/rest/2.0/connections/{connection_identifier}/status |
| [**updateConnectionV2**](ThoughtSpotRestApi.md#updateConnectionV2) | **POST** /api/rest/2.0/connections/{connection_identifier}/update |
| [**updateConversation**](ThoughtSpotRestApi.md#updateConversation) | **POST** /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update |
| [**updateCustomAction**](ThoughtSpotRestApi.md#updateCustomAction) | **POST** /api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update |
| [**updateDbtConnection**](ThoughtSpotRestApi.md#updateDbtConnection) | **POST** /api/rest/2.0/dbt/update-dbt-connection |
| [**updateEmailCustomization**](ThoughtSpotRestApi.md#updateEmailCustomization) | **POST** /api/rest/2.0/customization/email/update |
| [**updateMetadataHeader**](ThoughtSpotRestApi.md#updateMetadataHeader) | **POST** /api/rest/2.0/metadata/headers/update |
| [**updateMetadataObjId**](ThoughtSpotRestApi.md#updateMetadataObjId) | **POST** /api/rest/2.0/metadata/update-obj-id |
| [**updateOrg**](ThoughtSpotRestApi.md#updateOrg) | **POST** /api/rest/2.0/orgs/{org_identifier}/update |
| [**updateRole**](ThoughtSpotRestApi.md#updateRole) | **POST** /api/rest/2.0/roles/{role_identifier}/update |
| [**updateSchedule**](ThoughtSpotRestApi.md#updateSchedule) | **POST** /api/rest/2.0/schedules/{schedule_identifier}/update |
| [**updateStyleCustomization**](ThoughtSpotRestApi.md#updateStyleCustomization) | **POST** /api/rest/2.0/customization/styles/update |
| [**updateStyleFont**](ThoughtSpotRestApi.md#updateStyleFont) | **POST** /api/rest/2.0/customization/styles/fonts/{font_identifier}/update |
| [**updateSystemConfig**](ThoughtSpotRestApi.md#updateSystemConfig) | **POST** /api/rest/2.0/system/config-update |
| [**updateTag**](ThoughtSpotRestApi.md#updateTag) | **POST** /api/rest/2.0/tags/{tag_identifier}/update |
| [**updateUser**](ThoughtSpotRestApi.md#updateUser) | **POST** /api/rest/2.0/users/{user_identifier}/update |
| [**updateUserGroup**](ThoughtSpotRestApi.md#updateUserGroup) | **POST** /api/rest/2.0/groups/{group_identifier}/update |
| [**updateVariable**](ThoughtSpotRestApi.md#updateVariable) | **POST** /api/rest/2.0/template/variables/{identifier}/update |
| [**updateVariableValues**](ThoughtSpotRestApi.md#updateVariableValues) | **POST** /api/rest/2.0/template/variables/update-values |
| [**updateWebhookConfiguration**](ThoughtSpotRestApi.md#updateWebhookConfiguration) | **POST** /api/rest/2.0/webhooks/{webhook_identifier}/update |
| [**uploadStyleFont**](ThoughtSpotRestApi.md#uploadStyleFont) | **POST** /api/rest/2.0/customization/styles/fonts/upload |
| [**validateCommunicationChannel**](ThoughtSpotRestApi.md#validateCommunicationChannel) | **POST** /api/rest/2.0/system/communication-channels/validate |
| [**validateEmailCustomization**](ThoughtSpotRestApi.md#validateEmailCustomization) | **POST** /api/rest/2.0/customization/email/validate |
| [**validateMerge**](ThoughtSpotRestApi.md#validateMerge) | **POST** /api/rest/2.0/vcs/git/branches/validate |
| [**validateToken**](ThoughtSpotRestApi.md#validateToken) | **POST** /api/rest/2.0/auth/token/validate |


<a id="activateUser"></a>
# **activateUser**
> User activateUser(activateUserRequest)



  Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **activateUserRequest** | [**ActivateUserRequest**](ActivateUserRequest.md)

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

<a id="assignChangeAuthor"></a>
# **assignChangeAuthor**
> assignChangeAuthor(assignChangeAuthorRequest)



  Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and edit access to the objects are required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **assignChangeAuthorRequest** | [**AssignChangeAuthorRequest**](AssignChangeAuthorRequest.md)

### Return type

null (empty response body)

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

<a id="assignTag"></a>
# **assignTag**
> assignTag(assignTagRequest)



  Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **assignTagRequest** | [**AssignTagRequest**](AssignTagRequest.md)

### Return type

null (empty response body)

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

<a id="changeUserPassword"></a>
# **changeUserPassword**
> changeUserPassword(changeUserPasswordRequest)



  Version: 9.0.0.cl or later   Updates the current password of the user.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **changeUserPasswordRequest** | [**ChangeUserPasswordRequest**](ChangeUserPasswordRequest.md)

### Return type

null (empty response body)

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

<a id="commitBranch"></a>
# **commitBranch**
> CommitResponse commitBranch(commitBranchRequest)



  Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **commitBranchRequest** | [**CommitBranchRequest**](CommitBranchRequest.md)

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

<a id="configureAuthSettings"></a>
# **configureAuthSettings**
> configureAuthSettings(configureAuthSettingsRequest)



  Version: 26.6.0.cl or later   Enables or disables authentication at cluster or org level for the specified auth type. Currently supports &#x60;TRUSTED_AUTH&#x60;.  #### Required privileges  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;CONTROL_TRUSTED_AUTH&#x60; (**Can Enable or Disable Trusted Authentication**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60; privilege is required.  #### Usage guidelines  Use &#x60;cluster_preferences&#x60; to enable or disable authentication at the cluster level. Cluster-level settings can only be configured from the Primary Org. - &#x60;ENABLED&#x60; — Generates a new access token if one does not exist. An existing token is preserved. - &#x60;DISABLED&#x60; — Revokes the existing cluster-level access token.  Use &#x60;org_preferences&#x60; to enable or disable authentication for one or more Orgs. Each entry must include an &#x60;org_identifier&#x60; (unique ID or name) and an &#x60;auth_status&#x60;. Org-level configuration requires the per-Org authentication feature to be enabled on your instance. - &#x60;ENABLED&#x60; — Generates a new org-level access token if one does not exist. - &#x60;DISABLED&#x60; — Revokes the existing org-level access token for that Org.  Both &#x60;cluster_preferences&#x60; and &#x60;org_preferences&#x60; are optional. Omitting a field leaves the corresponding settings unchanged. If both are omitted, the API returns &#x60;204 No Content&#x60; without making any changes.  **Note**: Cluster-level and org-level settings are independent of each other. Enabling or disabling one does not affect the other.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **configureAuthSettingsRequest** | [**ConfigureAuthSettingsRequest**](ConfigureAuthSettingsRequest.md)

### Return type

null (empty response body)

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

<a id="configureCommunicationChannelPreferences"></a>
# **configureCommunicationChannelPreferences**
> configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest)



 Version: 10.14.0.cl or later   Configure communication channel preferences. - Use &#x60;cluster_preferences&#x60; to update the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use &#x60;org_preferences&#x60; to specify Org-specific preferences that override the defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **configureCommunicationChannelPreferencesRequest** | [**ConfigureCommunicationChannelPreferencesRequest**](ConfigureCommunicationChannelPreferencesRequest.md)

### Return type

null (empty response body)

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

<a id="configureSecuritySettings"></a>
# **configureSecuritySettings**
> configureSecuritySettings(configureSecuritySettingsRequest)



  Version: 26.2.0.cl or later   Configure security settings for your ThoughtSpot application instance. - Use &#x60;cluster_preferences&#x60; to update cluster-level security settings including CORS whitelisted URLs, CSP settings, SAML redirect URLs, partitioned cookies, and non-embed access configuration. - Use &#x60;org_preferences&#x60; to configure Org-specific security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this allows configuring CORS and non-embed access settings specific to the Org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. Cluster-level SAML and script-src settings require &#x60;ADMINISTRATION&#x60; privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **configureSecuritySettingsRequest** | [**ConfigureSecuritySettingsRequest**](ConfigureSecuritySettingsRequest.md)

### Return type

null (empty response body)

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

<a id="connectionConfigurationSearch"></a>
# **connectionConfigurationSearch**
> List&lt;ConnectionConfigurationResponse&gt; connectionConfigurationSearch(connectionConfigurationSearchRequest)



  Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionConfigurationSearchRequest** | [**ConnectionConfigurationSearchRequest**](ConnectionConfigurationSearchRequest.md)

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

<a id="convertWorksheetToModel"></a>
# **convertWorksheetToModel**
> ResponseWorksheetToModelConversion convertWorksheetToModel(convertWorksheetToModelRequest)



 Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when &#x60;convert_all&#x60; is set to &#x60;false&#x60;.        - Leave empty or omit when &#x60;convert_all&#x60; is set to &#x60;true&#x60;.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when &#x60;convert_all&#x60; is set to &#x60;true&#x60; and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - &#x60;true&#x60;: Converts all Worksheets in the system, except those specified in &#x60;exclude_worksheet_ids&#x60;.        - &#x60;false&#x60;: Converts only the Worksheets listed in &#x60;worksheet_ids&#x60;.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - &#x60;true&#x60;: Applies conversion changes directly to ThoughtSpot.      - &#x60;false&#x60;: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting &#x60;convert_all&#x60; to &#x60;false&#x60; and specifying a small number of &#x60;worksheet_ids&#x60;.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use &#x60;apply_changes: false&#x60; to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [\&quot;guid1\&quot;, \&quot;guid2\&quot;, \&quot;guid3\&quot;],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: false,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Convert All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;  ### Exclude Specific Worksheets While Converting All Accessible Worksheets &#x60;&#x60;&#x60;json {   \&quot;worksheet_ids\&quot;: [],   \&quot;exclude_worksheet_ids\&quot;: [\&quot;abc\&quot;],   \&quot;convert_all\&quot;: true,   \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;     

### Parameters

| Name | Type |
|------------- | ------------- |
| **convertWorksheetToModelRequest** | [**ConvertWorksheetToModelRequest**](ConvertWorksheetToModelRequest.md)

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

<a id="copyObject"></a>
# **copyObject**
> ResponseCopyObject copyObject(copyObjectRequest)



 Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **copyObjectRequest** | [**CopyObjectRequest**](CopyObjectRequest.md)

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

<a id="createAgentConversation"></a>
# **createAgentConversation**
> AgentConversation createAgentConversation(createAgentConversationRequest)



  Version: 26.2.0.cl or later   Creates a new Spotter agent conversation based on the provided context and settings. The endpoint was in Beta from 26.2.0.cl through 26.4.0.cl.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include the &#x60;metadata_context&#x60; parameter to define the conversation context. The context type can be one of:  - &#x60;DATA_SOURCE&#x60; *(available from 26.5.0.cl)*: targets a specific data source. Provide &#x60;data_source_identifier&#x60; in &#x60;data_source_context&#x60; for a single data source, or &#x60;data_source_identifiers&#x60; for multi-data-source context. The deprecated &#x60;guid&#x60; field is accepted for backwards compatibility. - &#x60;AUTO_MODE&#x60; *(available from 26.5.0.cl)*: automatically discovers and selects the most relevant datasets for the user&#39;s queries.  &gt; **Note for callers on versions 26.2.0.cl – 26.4.0.cl (Beta):** use the lowercase &#x60;data_source&#x60; enum value with the &#x60;guid&#x60; field instead of the above. Example: &#x60;{ \&quot;type\&quot;: \&quot;data_source\&quot;, \&quot;data_source_context\&quot;: { \&quot;guid\&quot;: \&quot;&lt;worksheet-id&gt;\&quot; } }&#x60;.  The &#x60;conversation_settings&#x60; parameter controls which Spotter capabilities are enabled for the conversation:  - &#x60;enable_contextual_change_analysis&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_natural_language_answer_generation&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_reasoning&#x60; (default: &#x60;true&#x60;, **deprecated from 26.2.0.cl**) — always enabled in Spotter 3; setting this to &#x60;false&#x60; has no effect on versions &gt;&#x3D; 26.2.0.cl - &#x60;enable_save_chat&#x60; (default: &#x60;false&#x60;, *available from 26.5.0.cl*) — enables saving the conversation for later retrieval via conversation history  If the request is successful, the response includes a unique &#x60;conversation_identifier&#x60; that must be passed to &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60; to send messages within this conversation. The response also includes &#x60;conversation_id&#x60; with the same value for backwards compatibility; use &#x60;conversation_identifier&#x60; for new integrations.  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;metadata_context\&quot;: {     \&quot;type\&quot;: \&quot;DATA_SOURCE\&quot;,     \&quot;data_source_context\&quot;: {       \&quot;data_source_identifier\&quot;: \&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890\&quot;     }   },   \&quot;conversation_settings\&quot;: {} } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description                                                                                                                             | | ---- | --------------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; &gt; - This endpoint was in Beta from 26.2.0.cl through 26.4.0.cl and is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createAgentConversationRequest** | [**CreateAgentConversationRequest**](CreateAgentConversationRequest.md)

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

<a id="createCalendar"></a>
# **createCalendar**
> CalendarResponse createCalendar(createCalendarRequest)



  Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - &#x60;FROM_EXISTING_TABLE&#x60; - Creates calendar from the table reference provided in the API request.  - &#x60;FROM_INPUT_PARAMS&#x60; - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60; attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is not.   Similarly, connectors such as ClickHouse require you to specify the &#x60;database_name&#x60; and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * &#x60;MONTH_OFFSET&#x60;. The default calendar type. A &#x60;MONTH_OFFSET&#x60; calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the &#x60;month_offset&#x60; value is set as &#x60;April&#x60;, the calendar year begins in April.  * &#x60;4-4-5&#x60;. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * &#x60;4-5-4&#x60;. Each quarter in the calendar will include two 4-week months with a 5-week month between. * &#x60;5-4-4&#x60;. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the &#x60;MM/DD/YYYY&#x60; format. For &#x60;MONTH_OFFSET&#x60; calendars, ensure that the &#x60;start_date&#x60; matches the month specified in the &#x60;month_offset&#x60; attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  &#x60;&#x60;&#x60; {   \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,     \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;,     \&quot;database_name\&quot;: \&quot;RETAILAPPAREL\&quot;,     \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot;   },   \&quot;creation_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;, } &#x60;&#x60;&#x60;  To create a calendar from scratch:  &#x60;&#x60;&#x60; {   \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,     \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;,     \&quot;database_name\&quot;: \&quot;RETAILAPPAREL\&quot;,     \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot;   },   \&quot;creation_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;,   \&quot;calendar_type\&quot;: \&quot;MONTH_OFFSET\&quot;,   \&quot;month_offset\&quot;: \&quot;April\&quot;,   \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,   \&quot;quarter_name_prefix\&quot;: \&quot;Q\&quot;,   \&quot;year_name_prefix\&quot;: \&quot;FY\&quot;,   \&quot;start_date\&quot;: \&quot;04/01/2025\&quot;,   \&quot;end_date\&quot;: \&quot;04/31/2025\&quot; } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createCalendarRequest** | [**CreateCalendarRequest**](CreateCalendarRequest.md)

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

<a id="createCollection"></a>
# **createCollection**
> Collection createCollection(createCollectionRequest)



  Version: 26.4.0.cl or later   Creates a new collection in ThoughtSpot.  Collections allow you to organize and group related metadata objects such as Liveboards, Answers, worksheets, and other data objects. You can also create nested collections (sub-collections) to build a hierarchical structure.  #### Supported operations  The API endpoint lets you perform the following operations:  * Create a new collection * Add metadata objects (Liveboards, Answers, Logical Tables) to the collection * Create nested collections by adding sub-collections      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createCollectionRequest** | [**CreateCollectionRequest**](CreateCollectionRequest.md)

### Return type

[**Collection**](Collection.md)

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

<a id="createConfig"></a>
# **createConfig**
> RepoConfigObject createConfig(createConfigRequest)



  Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has &#x60;repo&#x60; scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid&#x3D;git-integration).  **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConfigRequest** | [**CreateConfigRequest**](CreateConfigRequest.md)

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

<a id="createConnection"></a>
# **createConnection**
> CreateConnectionResponse createConnection(createConnectionRequest)



  Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes for a SnowFlake connection:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;authenticationType\&quot;: \&quot;SERVICE_ACCOUNT\&quot;,      \&quot;databases\&quot;: [\&quot;DB1\&quot;, \&quot;DB2\&quot;],      \&quot;externalDatabases\&quot;:[       ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;false&#x60;.  **NOTE:** If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.  #### Create a connection with tables  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) and &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege is required.  To create a connection with tables:  1. Pass these parameters in your API request. * Name of the connection. * Type of the data warehouse to connect to. * A JSON map of configuration attributes, database details, and table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:   &#x60;&#x60;&#x60;   {      \&quot;configuration\&quot;:{         \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,         \&quot;user\&quot;:\&quot;tsadmin\&quot;,         \&quot;password\&quot;:\&quot;TestConn123\&quot;,         \&quot;role\&quot;:\&quot;sysadmin\&quot;,         \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;      },      \&quot;authenticationType\&quot;: \&quot;SERVICE_ACCOUNT\&quot;,      \&quot;databases\&quot;: [\&quot;DB1\&quot;, \&quot;DB2\&quot;, \&quot;AllDatatypes\&quot;],      \&quot;externalDatabases\&quot;:[         {            \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,            \&quot;isAutoCreated\&quot;:false,            \&quot;schemas\&quot;:[               {                  \&quot;name\&quot;:\&quot;alldatatypes\&quot;,                  \&quot;tables\&quot;:[                     {                        \&quot;name\&quot;:\&quot;allDatatypes\&quot;,                        \&quot;type\&quot;:\&quot;TABLE\&quot;,                        \&quot;description\&quot;:\&quot;\&quot;,                        \&quot;selected\&quot;:true,                        \&quot;linked\&quot;:true,                        \&quot;columns\&quot;:[                           {                              \&quot;name\&quot;:\&quot;CNUMBER\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           },                           {                              \&quot;name\&quot;:\&quot;CDECIMAL\&quot;,                              \&quot;type\&quot;:\&quot;INT64\&quot;,                              \&quot;canImport\&quot;:true,                              \&quot;selected\&quot;:true,                              \&quot;isLinkedActive\&quot;:true,                              \&quot;isImported\&quot;:false,                              \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,                              \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,                              \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot;                           }                        ]                     }                  ]               }            ]         }      ]   }   &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to &#x60;true&#x60;.  **NOTE:** If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.  The optional &#x60;databases&#x60; property in &#x60;data_warehouse_config&#x60; accepts a list of database names. When specified, ThoughtSpot persists this list on the connection and uses it to scope metadata fetching to only the specified databases in subsequent table add and remove operations. If omitted, all databases in the data warehouse are accessible for metadata operations.  The &#x60;databases&#x60; and &#x60;externalDatabases&#x60; serve different purposes. &#x60;databases&#x60; is a flat list of database names that controls which databases are scanned during metadata operations. &#x60;externalDatabases&#x60; defines the full table hierarchy and determines which tables are linked into ThoughtSpot.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConnectionRequest** | [**CreateConnectionRequest**](CreateConnectionRequest.md)

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

<a id="createConnectionConfiguration"></a>
# **createConnectionConfiguration**
> ConnectionConfigurationResponse createConnectionConfiguration(createConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in &#x60;configuration&#x60;. The following example shows the configuration attributes:   &#x60;&#x60;&#x60;    {      \&quot;user\&quot;:\&quot;DEV_USER\&quot;,      \&quot;password\&quot;:\&quot;TestConn123\&quot;,      \&quot;role\&quot;:\&quot;DEV\&quot;,      \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot;     }   &#x60;&#x60;&#x60;  * If the &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60; are not required fields.  #### Parameterized Connection Support For parameterized connections that use OAuth authentication, only the same_as_parent and policy_process_options  attributes are allowed in the API request. These attributes are not applicable to connections that are not parameterized.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConnectionConfigurationRequest** | [**CreateConnectionConfigurationRequest**](CreateConnectionConfigurationRequest.md)

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

<a id="createConversation"></a>
# **createConversation**
> Conversation createConversation(createConversationRequest)



 Version: 10.4.0.cl or later   Creates a new conversation session tied to a specific data model for AI-driven natural language querying.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - &#x60;metadata_identifier&#x60;: the unique ID of the data source that provides context for the conversation  Optionally, you can provide: - &#x60;tokens&#x60;: a token string to set initial context for the conversation (e.g., &#x60;\&quot;[sales],[item type],[state]\&quot;&#x60;)  If the request is successful, ThoughtSpot returns a unique &#x60;conversation_identifier&#x60; that must be passed to &#x60;sendMessage&#x60; to continue the conversation.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md)

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

<a id="createCustomAction"></a>
# **createCustomAction**
> ResponseCustomAction createCustomAction(createCustomActionRequest)



  Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in &#x60;group_identifiers&#x60;.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in &#x60;default_action_config&#x60; property and specify the GUID or name of the object in &#x60;associate_metadata&#x60;.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createCustomActionRequest** | [**CreateCustomActionRequest**](CreateCustomActionRequest.md)

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

<a id="createEmailCustomization"></a>
# **createEmailCustomization**
> CreateEmailCustomizationResponse createEmailCustomization(createEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows a sample set of customization configuration:  &#x60;&#x60;&#x60; {   {       \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;,       \&quot;cta_text_font_color\&quot;: \&quot;#FFFFFF\&quot;,       \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,       \&quot;logo_url\&quot;: \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,      \&quot;font_family\&quot;: \&quot;\&quot;,       \&quot;product_name\&quot;: \&quot;ThoughtSpot\&quot;,       \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000 Mountain View, CA 94041\&quot;,    \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,       \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,       \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,       \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,       \&quot;hide_footer_phone\&quot;: false,       \&quot;hide_footer_address\&quot;: false,       \&quot;hide_product_name\&quot;: false,       \&quot;hide_manage_notification\&quot;: false,       \&quot;hide_mobile_app_nudge\&quot;: false,       \&quot;hide_privacy_policy\&quot;: false,       \&quot;hide_ts_vocabulary_definitions\&quot;: false,       \&quot;hide_error_message\&quot;: false,       \&quot;hide_unsubscribe_link\&quot;: false,       \&quot;hide_notification_status\&quot;: false,       \&quot;hide_modify_alert\&quot;: false,       \&quot;company_website_url\&quot;: \&quot;https://your-website.com/\&quot;,       \&quot;company_privacy_policy_url\&quot; : \&quot;https://link-to-privacy-policy.com/\&quot;,       \&quot;contact_support_url\&quot;: \&quot;https://link-to-contact-support.com/\&quot;,       \&quot;hide_contact_support_url\&quot;: false,    \&quot;hide_logo_url\&quot; : false   } } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createEmailCustomizationRequest** | [**CreateEmailCustomizationRequest**](CreateEmailCustomizationRequest.md)

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

<a id="createOrg"></a>
# **createOrg**
> OrgResponse createOrg(createOrgRequest)



  Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createOrgRequest** | [**CreateOrgRequest**](CreateOrgRequest.md)

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

<a id="createRole"></a>
# **createRole**
> RoleResponse createRole(createRoleRequest)



  Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createRoleRequest** | [**CreateRoleRequest**](CreateRoleRequest.md)

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

<a id="createSchedule"></a>
# **createSchedule**
> ResponseSchedule createSchedule(createScheduleRequest)



 Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.  If RBAC is enabled, creating a schedule also requires the download privilege that corresponds to the selected &#x60;file_format&#x60;: &#x60;CSV&#x60; and &#x60;XLSX&#x60; require the &#x60;CAN_DOWNLOAD_DETAILED_DATA&#x60; (**Can download detailed data**) privilege, and &#x60;PDF&#x60; requires the &#x60;CAN_DOWNLOAD_VISUALS&#x60; (**Can download visuals**) privilege.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: &lt;your content&gt;** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If &#x60;PDF&#x60; is set as the &#x60;file_format&#x60;, enable &#x60;pdf_options&#x60; to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the &#x60;visualization_identifiers&#x60; array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the &#x60;frequency&#x60; parameters are defined, you can set the time zone to a value that matches your server&#39;s time zone. For example, &#x60;US/Central&#x60;, &#x60;Etc/UTC&#x60;, &#x60;CET&#x60;. The default time zone is &#x60;America/Los_Angeles&#x60;.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     

### Parameters

| Name | Type |
|------------- | ------------- |
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md)

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

<a id="createTag"></a>
# **createTag**
> Tag createTag(createTagRequest)



  Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createTagRequest** | [**CreateTagRequest**](CreateTagRequest.md)

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

<a id="createUser"></a>
# **createUser**
> User createUser(createUserRequest)



  Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)

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

<a id="createUserGroup"></a>
# **createUserGroup**
> UserGroupResponse createUserGroup(createUserGroupRequest)



  Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createUserGroupRequest** | [**CreateUserGroupRequest**](CreateUserGroupRequest.md)

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

<a id="createVariable"></a>
# **createVariable**
> Variable createVariable(createVariableRequest)



 Create a variable which can be used for parameterizing metadata objects    Version: 26.4.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this. * FORMULA_VARIABLE - For Formula variables, introduced in 10.15.0.cl  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The data type of the variable, only specify for formula variables (defaults to null)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid     

### Parameters

| Name | Type |
|------------- | ------------- |
| **createVariableRequest** | [**CreateVariableRequest**](CreateVariableRequest.md)

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

<a id="createWebhookConfiguration"></a>
# **createWebhookConfiguration**
> WebhookResponse createWebhookConfiguration(createWebhookConfigurationRequest)



  Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **createWebhookConfigurationRequest** | [**CreateWebhookConfigurationRequest**](CreateWebhookConfigurationRequest.md)

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

<a id="dbtConnection"></a>
# **dbtConnection**
> Object dbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent)



  Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionName** | **String**
| **databaseName** | **String**
| **importType** | **String**
| **accessToken** | **String**
| **dbtUrl** | **String**
| **accountId** | **String**
| **projectId** | **String**
| **dbtEnvId** | **String**
| **projectName** | **String**
| **fileContent** | **File**

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

<a id="dbtGenerateSyncTml"></a>
# **dbtGenerateSyncTml**
> Object dbtGenerateSyncTml(dbtConnectionIdentifier, fileContent, includeSemanticReport)



  Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**
| **fileContent** | **File**
| **includeSemanticReport** | **Boolean**

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

<a id="dbtGenerateTml"></a>
# **dbtGenerateTml**
> Object dbtGenerateTml(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, includeSemanticReport)



  Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**
| **modelTables** | **String**
| **importWorksheets** | **String**
| **worksheets** | **String**
| **fileContent** | **File**
| **includeSemanticReport** | **Boolean**

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

<a id="dbtSearch"></a>
# **dbtSearch**
> List&lt;DbtSearchResponse&gt; dbtSearch()



  Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      

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

<a id="deactivateUser"></a>
# **deactivateUser**
> ResponseActivationURL deactivateUser(deactivateUserRequest)



  Version: 9.7.0.cl or later   Deactivates a user account.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deactivateUserRequest** | [**DeactivateUserRequest**](DeactivateUserRequest.md)

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

<a id="deleteCalendar"></a>
# **deleteCalendar**
> deleteCalendar(calendarIdentifier)



  Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        

### Parameters

| Name | Type |
|------------- | ------------- |
| **calendarIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteCollection"></a>
# **deleteCollection**
> CollectionDeleteResponse deleteCollection(deleteCollectionRequest)



  Version: 26.4.0.cl or later   Deletes one or more collections from ThoughtSpot.  #### Delete options  * **delete_children**: When set to &#x60;true&#x60;, deletes the child objects (metadata items) within the collection that the user has access to. Objects that the user does not have permission to delete will be skipped. * **dry_run**: When set to &#x60;true&#x60;, performs a preview of the deletion operation without actually deleting anything. The response shows what would be deleted, allowing you to review before committing the deletion.  #### Response  The response includes: * **metadata_deleted**: List of metadata objects that were successfully deleted * **metadata_skipped**: List of metadata objects that were skipped due to lack of permissions or other constraints      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteCollectionRequest** | [**DeleteCollectionRequest**](DeleteCollectionRequest.md)

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

<a id="deleteConfig"></a>
# **deleteConfig**
> deleteConfig(deleteConfigRequest)



  Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteConfigRequest** | [**DeleteConfigRequest**](DeleteConfigRequest.md)

### Return type

null (empty response body)

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

<a id="deleteConnection"></a>
# **deleteConnection**
> deleteConnection(deleteConnectionRequest)



  Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteConnectionRequest** | [**DeleteConnectionRequest**](DeleteConnectionRequest.md)

### Return type

null (empty response body)

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

<a id="deleteConnectionConfiguration"></a>
# **deleteConnectionConfiguration**
> deleteConnectionConfiguration(deleteConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteConnectionConfigurationRequest** | [**DeleteConnectionConfigurationRequest**](DeleteConnectionConfigurationRequest.md)

### Return type

null (empty response body)

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

<a id="deleteConnectionV2"></a>
# **deleteConnectionV2**
> deleteConnectionV2(connectionIdentifier)



  Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteConversation"></a>
# **deleteConversation**
> deleteConversation(conversationIdentifier)



 Deletes an existing agent conversation.    Version: 26.7.0.cl or later   Permanently deletes an existing saved agent conversation and all its associated messages. This operation is irreversible — deleted conversations cannot be recovered.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being deleted.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to delete, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;  A successful request returns an empty &#x60;204 No Content&#x60; response. The deleted conversation no longer appears in &#x60;getConversationList&#x60;.  #### Example request  &#x60;&#x60;&#x60;bash DELETE /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/delete &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. |  &gt; ###### Note: &gt; &gt; - Deletion is permanent and cannot be undone. Ensure the correct &#x60;conversation_identifier&#x60; is used before calling this endpoint. &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; are persisted and can be deleted via this endpoint. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteCustomAction"></a>
# **deleteCustomAction**
> deleteCustomAction(customActionIdentifier)



  Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **customActionIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteDbtConnection"></a>
# **deleteDbtConnection**
> deleteDbtConnection(dbtConnectionIdentifier)



  Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteEmailCustomization"></a>
# **deleteEmailCustomization**
> deleteEmailCustomization(templateIdentifier)



 Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60; as a parameter in this API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **templateIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteManualTranslations"></a>
# **deleteManualTranslations**
> deleteManualTranslations(deleteManualTranslationsRequest)



 Delete manual translations.    Version: 26.7.0.cl or later   Deletes all manual translations for the org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - This deletes **all** translation entries for the targeted org. The operation cannot be undone. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete translations uploaded in the All-Org context.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteManualTranslationsRequest** | [**DeleteManualTranslationsRequest**](DeleteManualTranslationsRequest.md)

### Return type

null (empty response body)

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

<a id="deleteMetadata"></a>
# **deleteMetadata**
> deleteMetadata(deleteMetadataRequest)



  Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteMetadataRequest** | [**DeleteMetadataRequest**](DeleteMetadataRequest.md)

### Return type

null (empty response body)

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

<a id="deleteOrg"></a>
# **deleteOrg**
> deleteOrg(orgIdentifier)



  Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **orgIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteOrgEmailCustomization"></a>
# **deleteOrgEmailCustomization**
> deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the &#x60;org_identifier&#x60; from the response. - Use that &#x60;org_identifier&#x60; as a parameter in this API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteOrgEmailCustomizationRequest** | [**DeleteOrgEmailCustomizationRequest**](DeleteOrgEmailCustomizationRequest.md)

### Return type

null (empty response body)

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

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(roleIdentifier)



  Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **roleIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(scheduleIdentifier)



 Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or &#x60;ADMINISTRATION&#x60; (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **scheduleIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteStyleFonts"></a>
# **deleteStyleFonts**
> StyleFontDeleteData deleteStyleFonts(deleteStyleFontsRequest)



  Version: 26.7.0.cl or later   Deletes one or more custom fonts from the cluster-level or org-level font library. If a deleted font is assigned to visualization areas, those assignments automatically fallback to the cluster/system default font. The response lists all affected areas where the font was explicitly set. Note: dry_run defaults to true. To actually delete fonts, you must explicitly pass dry_run: false.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Provide one or more font UUIDs or names in &#x60;font_identifiers&#x60;. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to delete from the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to delete from the authenticated user&#39;s org library. - Use &#x60;dry_run: true&#x60; to preview which visualization areas would be affected without actually deleting the font. The response lists affected assignments; no changes are applied. - Deletions cannot be undone. Re-upload the font file using &#x60;uploadStyleFont&#x60; if needed.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteStyleFontsRequest** | [**DeleteStyleFontsRequest**](DeleteStyleFontsRequest.md)

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

<a id="deleteTag"></a>
# **deleteTag**
> deleteTag(tagIdentifier)



  Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **tagIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(userIdentifier)



  Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **userIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteUserGroup"></a>
# **deleteUserGroup**
> deleteUserGroup(groupIdentifier)



  Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **groupIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteVariable"></a>
# **deleteVariable**
> deleteVariable(identifier)



 Delete a variable    Version: 10.14.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/template/variables/delete](/api/rest/2.0/template/variables/delete) instead.  Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn&#39;t exist * The variable is being used by other objects      

### Parameters

| Name | Type |
|------------- | ------------- |
| **identifier** | **String**

### Return type

null (empty response body)

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

<a id="deleteVariables"></a>
# **deleteVariables**
> deleteVariables(deleteVariablesRequest)



 Delete variable(s)    Version: 26.4.0.cl or later   Allows deleting multiple variables from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifiers (IDs or names)  The operation will fail if: * The user lacks required permissions * Any of the variables don&#39;t exist * Any of the variables are being used by other objects      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteVariablesRequest** | [**DeleteVariablesRequest**](DeleteVariablesRequest.md)

### Return type

null (empty response body)

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

<a id="deleteWebhookConfigurations"></a>
# **deleteWebhookConfigurations**
> WebhookDeleteResponse deleteWebhookConfigurations(deleteWebhookConfigurationsRequest)



  Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deleteWebhookConfigurationsRequest** | [**DeleteWebhookConfigurationsRequest**](DeleteWebhookConfigurationsRequest.md)

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

<a id="deployCommit"></a>
# **deployCommit**
> List&lt;DeployResponse&gt; deployCommit(deployCommitRequest)



  Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a &#x60;commit_id&#x60; is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **deployCommitRequest** | [**DeployCommitRequest**](DeployCommitRequest.md)

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

<a id="downloadConnectionMetadataChanges"></a>
# **downloadConnectionMetadataChanges**
> File downloadConnectionMetadataChanges(connectionIdentifier)



  Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**

### Return type

[**File**](File.md)

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

<a id="exportAnswerReport"></a>
# **exportAnswerReport**
> File exportAnswerReport(exportAnswerReportRequest)



  Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer.  #### Usage guidelines  In the request body, specify the GUID or name of the Answer and set &#x60;file_format&#x60;. The default file format is CSV.  Use the &#x60;type&#x60; parameter to specify whether the Answer being exported is a saved Answer (&#x60;SAVED&#x60;) or a pinned Answer on a Liveboard (&#x60;PINNED&#x60;). Defaults to &#x60;SAVED&#x60;. When using &#x60;PINNED&#x60;, the &#x60;metadata_identifier&#x60; must be the container id.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportAnswerReportRequest** | [**ExportAnswerReportRequest**](ExportAnswerReportRequest.md)

### Return type

[**File**](File.md)

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

<a id="exportLiveboardReport"></a>
# **exportLiveboardReport**
> File exportLiveboardReport(exportLiveboardReportRequest)



  Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF, PNG, CSV, or XLSX file format. The default &#x60;file_format&#x60; is CSV.  Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  **NOTE**:   * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  * Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  * To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).   * Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in the PNG format in the resolution of your choice. To enable this on your instance, contact ThoughtSpot support. When this feature is enabled, the options &#x60;include_cover_page&#x60;,&#x60;include_filter_page&#x60; within the &#x60;png_options&#x60; will not be available for PNG exports.  * Starting with the ThoughtSpot Cloud 26.2.0.cl release,    * Liveboards can be exported in CSV format.      * All visualizations within a Liveboard can be exported as individual CSV files.      * When exporting multiple visualizations or the entire Liveboard, the system returns the report as a compressed ZIP file containing the separate CSV files for each visualization.    * Liveboards can also be exported in XLSX format.      * All selected visualizations are consolidated into a single Excel workbook (.xlsx), with each visualization placed in its own worksheet (tab).      * XLSX exports are limited to a maximum of 255 worksheets (tabs) per workbook.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportLiveboardReportRequest** | [**ExportLiveboardReportRequest**](ExportLiveboardReportRequest.md)

### Return type

[**File**](File.md)

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

<a id="exportManualTranslations"></a>
# **exportManualTranslations**
> File exportManualTranslations(exportManualTranslationsRequest)



 Export manual translations as a CSV file.    Version: 26.7.0.cl or later   Downloads all manual translations for the org as a CSV file.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The response is a CSV file with columns: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Defaults to &#x60;ORG&#x60; scope if not specified. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to export translations from the All-Org context. - Returns a &#x60;404&#x60; error if no translations exist for the targeted org or cluster scope.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportManualTranslationsRequest** | [**ExportManualTranslationsRequest**](ExportManualTranslationsRequest.md)

### Return type

[**File**](File.md)

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

<a id="exportMetadataTML"></a>
# **exportMetadataTML**
> List&lt;Object&gt; exportMetadataTML(exportMetadataTMLRequest)



  Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires &#x60;DATADOWNLOADING&#x60; (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60; to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as &#x60;identifier&#x60;, and set the &#x60;type&#x60; as &#x60;FEEDBACK&#x60; in the &#x60;metadata&#x60; array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as &#x60;identifier&#x60;, set the &#x60;type&#x60; as &#x60;LOGIAL_TABLE&#x60; in the &#x60;metadata&#x60; array, and set &#x60;export_with_associated_feedbacks&#x60; in &#x60;export_options&#x60; to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportMetadataTMLRequest** | [**ExportMetadataTMLRequest**](ExportMetadataTMLRequest.md)

### Return type

**List&lt;Object&gt;**

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

<a id="exportMetadataTMLBatched"></a>
# **exportMetadataTMLBatched**
> Object exportMetadataTMLBatched(exportMetadataTMLBatchedRequest)



  Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and &#x60;USERMANAGEMENT&#x60; (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for &#x60;USER&#x60;, &#x60;GROUP&#x60;, and &#x60;ROLES&#x60; metadata types.  - &#x60;batch_offset&#x60; Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - &#x60;batch_size&#x60; Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - &#x60;edoc_format&#x60; Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - &#x60;export_dependent&#x60; Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - &#x60;all_orgs_override&#x60; Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportMetadataTMLBatchedRequest** | [**ExportMetadataTMLBatchedRequest**](ExportMetadataTMLBatchedRequest.md)

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

<a id="exportStyleLogos"></a>
# **exportStyleLogos**
> exportStyleLogos(exportStyleLogosRequest)



  Version: 26.7.0.cl or later   Downloads the active logos (default and wide slots) at the requested scope as a single ZIP archive containing both logo image files. If no custom logo has been uploaded at the ORG scope, the archive contains the resolved logo falling through from the cluster. If no cluster logo has been uploaded, no file is returned.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to download cluster-level logos. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to download logos for the authenticated user&#39;s org. - The response is a ZIP archive (&#x60;application/zip&#x60;). Save the response body directly to a &#x60;.zip&#x60; file. - The archive always contains two files — one for the DEFAULT slot and one for the WIDE slot — even if no custom logo is set at the requested scope.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **exportStyleLogosRequest** | [**ExportStyleLogosRequest**](ExportStyleLogosRequest.md)

### Return type

null (empty response body)

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

<a id="fetchAnswerData"></a>
# **fetchAnswerData**
> AnswerDataResponse fetchAnswerData(fetchAnswerDataRequest)



  Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CAN_DOWNLOAD_DETAILED_DATA&#x60; (**Can download detailed data**) privilege is also required.  The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchAnswerDataRequest** | [**FetchAnswerDataRequest**](FetchAnswerDataRequest.md)

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

<a id="fetchAnswerSqlQuery"></a>
# **fetchAnswerSqlQuery**
> SqlQueryResponse fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest)



  Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {    \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,    \&quot;metadata_name\&quot;:\&quot;Total sales\&quot;,    \&quot;metadata_type\&quot;:\&quot;ANSWER\&quot;,    \&quot;sql_queries\&quot;:[       {          \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,          \&quot;metadata_name\&quot;:\&quot;Total sales -test\&quot;,          \&quot;sql_query\&quot;:\&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTNAME\\\&quot; \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;STORENAME\\\&quot; \\\&quot;ca_3\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_4\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_5\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_3\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_PRODUCTS\\\&quot; \\\&quot;ta_2\\\&quot;\\n    ON \\\&quot;ta_3\\\&quot;.\\\&quot;PRODUCTID\\\&quot; &#x3D; \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTID\\\&quot;\\nGROUP BY \\n  \\\&quot;ca_1\\\&quot;, \\n  \\\&quot;ca_2\\\&quot;, \\n  \\\&quot;ca_3\\\&quot;\\n\&quot;       }    ] } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchAnswerSqlQueryRequest** | [**FetchAnswerSqlQueryRequest**](FetchAnswerSqlQueryRequest.md)

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

<a id="fetchAsyncImportTaskStatus"></a>
# **fetchAsyncImportTaskStatus**
> GetAsyncImportStatusResponse fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest)



  Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchAsyncImportTaskStatusRequest** | [**FetchAsyncImportTaskStatusRequest**](FetchAsyncImportTaskStatusRequest.md)

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

<a id="fetchColumnSecurityRules"></a>
# **fetchColumnSecurityRules**
> List&lt;ColumnSecurityRuleResponse&gt; fetchColumnSecurityRules(fetchColumnSecurityRulesRequest)



 Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - At least one of &#x60;identifier&#x60; or &#x60;obj_identifier&#x60; must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;tables\&quot;: [     {       \&quot;identifier\&quot;: \&quot;table-guid\&quot;,       \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;     }   ] } &#x60;&#x60;&#x60;  #### Response format  The API returns an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60; field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [     {       \&quot;guid\&quot;: \&quot;table-guid\&quot;,       \&quot;objId\&quot;: \&quot;table-object-id\&quot;,       \&quot;columnSecurityRules\&quot;: [         {           \&quot;column\&quot;: {             \&quot;id\&quot;: \&quot;col_123\&quot;,             \&quot;name\&quot;: \&quot;Salary\&quot;           },           \&quot;groups\&quot;: [             {               \&quot;id\&quot;: \&quot;group_1\&quot;,               \&quot;name\&quot;: \&quot;HR Department\&quot;             }           ],           \&quot;sourceTableDetails\&quot;: {             \&quot;id\&quot;: \&quot;source-table-guid\&quot;,             \&quot;name\&quot;: \&quot;Employee_Data\&quot;           }         }       ]     }   ] } &#x60;&#x60;&#x60;     

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchColumnSecurityRulesRequest** | [**FetchColumnSecurityRulesRequest**](FetchColumnSecurityRulesRequest.md)

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

<a id="fetchConnectionDiffStatus"></a>
# **fetchConnectionDiffStatus**
> FetchConnectionDiffStatusResponse fetchConnectionDiffStatus(connectionIdentifier)



  Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as &#x60;connection_identifier&#x60; in the API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**

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

<a id="fetchLiveboardData"></a>
# **fetchLiveboardData**
> LiveboardDataResponse fetchLiveboardData(fetchLiveboardDataRequest)



  Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CAN_DOWNLOAD_DETAILED_DATA&#x60; (**Can download detailed data**) privilege is also required.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the &#x60;transient_pinboard_content&#x60; script generated from the &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchLiveboardDataRequest** | [**FetchLiveboardDataRequest**](FetchLiveboardDataRequest.md)

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

<a id="fetchLiveboardSqlQuery"></a>
# **fetchLiveboardSqlQuery**
> SqlQueryResponse fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest)



  Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60; {   \&quot;metadata_id\&quot;: \&quot;fa68ae91-7588-4136-bacd-d71fb12dda69\&quot;,   \&quot;metadata_name\&quot;: \&quot;Total Sales\&quot;,   \&quot;metadata_type\&quot;: \&quot;LIVEBOARD\&quot;,   \&quot;sql_queries\&quot;: [     {       \&quot;metadata_id\&quot;: \&quot;b3b6d2b9-089a-490c-8e16-b144650b7843\&quot;,       \&quot;metadata_name\&quot;: \&quot;Total quantity purchased, Total sales by region\&quot;,       \&quot;sql_query\&quot;: \&quot;SELECT \\n  \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_2\\\&quot;, \\n  CASE\\n    WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;) IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)\\n    ELSE 0\\n  END \\\&quot;ca_3\\\&quot;\\nFROM \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot; \\\&quot;ta_2\\\&quot;\\n  JOIN \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot; \\\&quot;ta_1\\\&quot;\\n    ON \\\&quot;ta_2\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D; \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\nGROUP BY \\\&quot;ca_1\\\&quot;\&quot;     }   ] } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchLiveboardSqlQueryRequest** | [**FetchLiveboardSqlQueryRequest**](FetchLiveboardSqlQueryRequest.md)

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

<a id="fetchLogs"></a>
# **fetchLogs**
> List&lt;LogResponse&gt; fetchLogs(fetchLogsRequest)



  Version: 9.0.0.cl or later   Fetches security audit logs.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchLogsRequest** | [**FetchLogsRequest**](FetchLogsRequest.md)

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

<a id="fetchObjectPrivileges"></a>
# **fetchObjectPrivileges**
> ObjectPrivilegesOfMetadataResponse fetchObjectPrivileges(fetchObjectPrivilegesRequest)



  Version: 26.3.0.cl or later   This API fetches the object privileges present for the given list of principals (user or group), on the given set of objects. It supports pagination, which can be enabled and configured using the request parameters. It provides users access to certain features based on privilege based access control.  #### Usage guidelines  - Specify the &#x60;type&#x60; (&#x60;USER&#x60; or &#x60;USER_GROUP&#x60;) and &#x60;identifier&#x60; (either GUID or name) of the principals for which you want to retrieve object privilege information in the &#x60;principals&#x60; array. - Specify the &#x60;type&#x60;  (&#x60;LOGICAL_TABLE&#x60;)  and &#x60;identifier&#x60; (either GUID or name) of the metadata objects for which you want to retrieve object privilege information in the &#x60;metadata&#x60; array. Only &#x60;LOGICAL_TABLE&#x60; metadata type is supported for now. It may be extended for other metadata types in future. - To control the offset from where principals have to be fetched, use &#x60;record_offset&#x60;. When &#x60;record_offset&#x60; is 0, information is fetched from the beginning. - To control the number of principals to be fetched, use &#x60;record_size&#x60;. Default &#x60;record_size&#x60; is 20. - Ensure &#x60;record_offset&#x60; for a subsequent request is one more than the value of &#x60;record_size&#x60; of the previous request. - Ensure using correct Authorization Bearer Token corresponding to specific user &amp; org.   #### Example request  &#x60;&#x60;&#x60;json {   \&quot;principals\&quot;: [     {       \&quot;type\&quot;: \&quot;type-1\&quot;,       \&quot;identifier\&quot;: \&quot;principal-guid-or-name-1\&quot;     },     {       \&quot;type\&quot;: \&quot;type-2\&quot;,       \&quot;identifier\&quot;: \&quot;principal-guid-or-name-2\&quot;     }   ],   \&quot;metadata\&quot;: [     {       \&quot;type\&quot;: \&quot;metadata-type-1\&quot;,       \&quot;identifier\&quot;: \&quot;metadata-guid-or-name-1\&quot;     },     {       \&quot;type\&quot;: \&quot;metadata-type-2\&quot;,       \&quot;identifier\&quot;: \&quot;metadata-guid-or-name-2\&quot;     }   ],   \&quot;record_offset\&quot;: 0,   \&quot;record_size\&quot;: 20 } &#x60;&#x60;&#x60;   #### Response format  The API returns an array of &#x60;metadata_object_privileges&#x60; objects wrapped in JSON. Each &#x60;metadata_object_privileges&#x60; object contains: - Metadata information (GUID, name and type) - Array of &#x60;principal_object_privilege_info&#x60;. - Each &#x60;principal_object_privilege_info&#x60; contains:   - Principal type. All principals of this type are listed as described below.   - Array of &#x60;principal_object_privileges&#x60;.   - Each &#x60;principal_object_privileges&#x60; contains:     - Principal information (GUID, name, subtype)     - List of applied object level privileges.  #### Example response  &#x60;&#x60;&#x60;json {     \&quot;metadata_object_privileges\&quot;: [       {         \&quot;metadata_id\&quot;: \&quot;metadata-guid-1\&quot;,         \&quot;metadata_name\&quot;: \&quot;metadata-name-1\&quot;,         \&quot;metadata_type\&quot;: \&quot;metadata-type-1\&quot;,         \&quot;principal_object_privilege_info\&quot;: [           {             \&quot;principal_type\&quot;: \&quot;principal-type-1\&quot;,             \&quot;principal_object_privileges\&quot;: [               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-1\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-1\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-1\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-1, object-privilege-2]\&quot;               },               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-2\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-2\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-2\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-1, object-privilege-2]\&quot;               }             ]           },           {             \&quot;principal_type\&quot;: \&quot;principal-type-2\&quot;,             \&quot;principal_object_privileges\&quot;: [               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-3\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-guid-4\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-4\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-1]\&quot;               }             ]           }         ]       },       {         \&quot;metadata_id\&quot;: \&quot;metadata-guid-2\&quot;,         \&quot;metadata_name\&quot;: \&quot;metadata-name-2\&quot;,         \&quot;metadata_type\&quot;: \&quot;metadata-type-2\&quot;,         \&quot;principal_object_privilege_info\&quot;: [           {             \&quot;principal_type\&quot;: \&quot;principal-type-1\&quot;,             \&quot;principal_object_privileges\&quot;: [               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-1\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-1\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-1\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-3, object-privilege-4]\&quot;               },               {                 \&quot;principal_id\&quot;: \&quot;principal-guid-2\&quot;,                 \&quot;principal_name\&quot;: \&quot;principal-name-2\&quot;,                 \&quot;principal_sub_type\&quot;: \&quot;principal-sub-type-2\&quot;,                 \&quot;object_privileges\&quot;: \&quot;[object-privilege-4]\&quot;               }             ]           }         ]       }     ] } &#x60;&#x60;&#x60;     

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchObjectPrivilegesRequest** | [**FetchObjectPrivilegesRequest**](FetchObjectPrivilegesRequest.md)

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

<a id="fetchPermissionsOfPrincipals"></a>
# **fetchPermissionsOfPrincipals**
> PermissionOfPrincipalsResponse fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest)



  Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchPermissionsOfPrincipalsRequest** | [**FetchPermissionsOfPrincipalsRequest**](FetchPermissionsOfPrincipalsRequest.md)

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

<a id="fetchPermissionsOnMetadata"></a>
# **fetchPermissionsOnMetadata**
> PermissionOfMetadataResponse fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest)



  Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata object. * To get permission details for a specific user or group, add &#x60;type&#x60; and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fetchPermissionsOnMetadataRequest** | [**FetchPermissionsOnMetadataRequest**](FetchPermissionsOnMetadataRequest.md)

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

<a id="forceLogoutUsers"></a>
# **forceLogoutUsers**
> forceLogoutUsers(forceLogoutUsersRequest)



  Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **forceLogoutUsersRequest** | [**ForceLogoutUsersRequest**](ForceLogoutUsersRequest.md)

### Return type

null (empty response body)

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

<a id="generateCSV"></a>
# **generateCSV**
> Object generateCSV(generateCSVRequest)



  Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \&quot;month offset\&quot; calendars, the start date must match the month defined in the &#x60;month_offset&#x60; attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **generateCSVRequest** | [**GenerateCSVRequest**](GenerateCSVRequest.md)

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

<a id="getAgentInstructions"></a>
# **getAgentInstructions**
> AgentInstructions getAgentInstructions()



 Version: 26.6.0.cl or later   Retrieves the admin instructions currently configured for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations.  Requires admin privileges. Only users with org admin access can retrieve agent instructions.  #### Usage guidelines  No input parameters are required. The API returns the stored &#x60;AgentInstructions&#x60; record for the caller&#39;s tenant and org.  If no instructions have been configured yet, the API returns a record with an empty &#x60;instructions&#x60; field and &#x60;null&#x60; values for &#x60;id&#x60;, &#x60;created_at&#x60;, &#x60;updated_at&#x60;, and &#x60;last_updated_by&#x60;.  If the request is successful, the response includes:  - &#x60;id&#x60;: unique identifier of the instructions record - &#x60;instructions&#x60;: the configured instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first saved - &#x60;updated_at&#x60;: ISO timestamp when the instructions were last updated - &#x60;last_updated_by&#x60;: user ID of the admin who last updated the instructions (may be &#x60;null&#x60; for older records)  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to read agent instructions. |  &gt; ###### Note: &gt; &gt; - Use &#x60;setAgentInstructions&#x60; to create or update agent instructions. &gt; - Available from version 26.6.0.cl and later.      

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

<a id="getConversation"></a>
# **getConversation**
> ConversationMessageResponse getConversation(conversationIdentifier)



 Retrieves the full public-safe content of a saved agent conversation: ordered turns (user messages and agent response items) and sanitized code-execution file metadata. Internal graph or branch state, Azure file identifiers, and messages with a &#x60;SYSTEM&#x60; source are omitted. The full answer payload is not embedded; fetch it separately via &#x60;loadAnswer&#x60; using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.    Version: 26.7.0.cl or later   Retrieves the full public-safe content of a saved agent conversation. Returns ordered conversation messages — each carrying an optional user prompt (the user&#39;s message and any attachments) and the agent response items produced for that turn — plus sanitized metadata for any files generated by the code-execution tool.   Use this endpoint to render a persisted conversation in a UI, build an audit trail, or post-process a completed conversation. The full answer payload is not embedded — fetch it separately via &#x60;loadAnswer&#x60; using the &#x60;answer_id&#x60; on each &#x60;answer&#x60; response item.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; _(path parameter)_: the unique ID of the conversation, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60;.  If the request is successful, the response contains two top-level fields:  | Field                  | Type                                        | Description                                                                                                                                          | | ---------------------- | ------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | | &#x60;messages&#x60;             | &#x60;ConversationMessage[]&#x60;                     | Ordered oldest to newest. Empty array when the conversation has no messages.                                                                         | | &#x60;code_execution_files&#x60; | &#x60;CodeExecutionFileMetadata[]&#x60;               | List of sanitized file metadata entries (one per &#x60;file_id&#x60;). Covers all code-execution-generated files referenced anywhere in the conversation. Empty array when there are none. |  No other top-level fields are returned.  #### ConversationMessage fields  | Field                 | Type                         | Description                                                                                                    | | --------------------- | ---------------------------- | -------------------------------------------------------------------------------------------------------------- | | &#x60;message_id&#x60;          | &#x60;String&#x60;                     | Stable identifier for the turn. For liveboard-started synthetic first turns, this is the root node identifier. | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;                       | Milliseconds since Unix epoch for the turn.                                                                    | | &#x60;user_prompt&#x60;         | &#x60;UserPrompt&#x60;                 | User-authored prompt that started the turn (message and attachments). &#x60;null&#x60; for liveboard-started synthetic first turns. | | &#x60;response_items&#x60;      | &#x60;ConversationResponseItem[]&#x60; | Agent-side output produced in response to this turn. Empty array for in-progress turns.                        |  #### UserPrompt fields  | Field         | Type                   | Description                                                                                          | | ------------- | ---------------------- | ---------------------------------------------------------------------------------------------------- | | &#x60;message&#x60;     | &#x60;UserMessage&#x60;          | User query that started the turn. &#x60;null&#x60; for liveboard-started synthetic first turns.                | | &#x60;attachments&#x60; | &#x60;UserAttachmentItem[]&#x60; | Files or connector resources attached to the user message. Empty array when there are no attachments. |  #### UserMessage fields  | Field        | Type     | Description                                   | | ------------ | -------- | --------------------------------------------- | | &#x60;message_id&#x60; | &#x60;String&#x60; | Unique identifier of the user-source message. | | &#x60;content&#x60;    | &#x60;String&#x60; | Text body of the user query.                  |  #### UserAttachmentItem fields  Discriminated by &#x60;type&#x60;. Only &#x60;\&quot;file\&quot;&#x60; or &#x60;\&quot;resource\&quot;&#x60; are valid values. Only the fields for the indicated variant are populated. See &#x60;ConversationResponseItem&#x60; below for the field definitions of the &#x60;file&#x60; and &#x60;resource&#x60; variants — &#x60;UserAttachmentItem&#x60; uses the same fields.  #### ConversationResponseItem fields  Every item carries a &#x60;type&#x60; discriminator and these shared fields:  | Field                 | Type      | Description                                                                                                                    | | --------------------- | --------- | ------------------------------------------------------------------------------------------------------------------------------ | | &#x60;type&#x60;                | &#x60;String&#x60;  | Discriminator. One of &#x60;\&quot;text\&quot;&#x60;, &#x60;\&quot;tool_call\&quot;&#x60;, &#x60;\&quot;tool_result\&quot;&#x60;, &#x60;\&quot;answer\&quot;&#x60;, &#x60;\&quot;file\&quot;&#x60;, &#x60;\&quot;resource\&quot;&#x60;, &#x60;\&quot;search_datasets\&quot;&#x60;.       | | &#x60;timestamp_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when this item was produced.                                                                     | | &#x60;is_thinking&#x60;         | &#x60;Boolean&#x60; | &#x60;true&#x60; when the item represents internal agent reasoning rather than user-facing output. Consumers may hide or collapse these. | | &#x60;step_title&#x60;          | &#x60;String&#x60;  | Human-readable label for the agent step producing this item (e.g. &#x60;\&quot;Searching\&quot;&#x60;, &#x60;\&quot;Visualising\&quot;&#x60;).                             |  Variant-specific fields:  - **&#x60;text&#x60;** — agent text output: &#x60;content&#x60; (String), &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;file_reference&#x60; (FileReference). - **&#x60;tool_call&#x60;** — agent invoked a tool: &#x60;tool_call_id&#x60; (String), &#x60;tool_name&#x60; (String), &#x60;arguments&#x60; (JSON object). - **&#x60;tool_result&#x60;** — result returned from a tool invocation: &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;, &#x60;content&#x60;, &#x60;content_type&#x60; (&#x60;ContentMimeType&#x60; enum), &#x60;success&#x60; (Boolean). - **&#x60;answer&#x60;** — slim reference to a saved answer: &#x60;answer_id&#x60; (String), &#x60;tool_call_id&#x60;, &#x60;tool_name&#x60;. - **&#x60;file&#x60;** — uploaded or generated files: &#x60;files&#x60; (&#x60;PublicFileInfo[]&#x60;). - **&#x60;resource&#x60;** — MCP connector resource: &#x60;title&#x60;, &#x60;uri&#x60;, &#x60;name&#x60;, &#x60;mime_type&#x60;, &#x60;description&#x60;, &#x60;size&#x60; (Int), &#x60;connector_id&#x60;, &#x60;connector_name&#x60;, &#x60;connector_slug&#x60;, &#x60;transport_type&#x60; (&#x60;TransportType&#x60; enum). - **&#x60;search_datasets&#x60;** — dataset discovery result: &#x60;text&#x60; (String), &#x60;data_sources&#x60; (&#x60;DataSourceInfo[]&#x60;).  Clients should switch on &#x60;type&#x60; and ignore unknown variants for forward-compatibility.  #### content_type values  &#x60;content_type&#x60; is the &#x60;ContentMimeType&#x60; enum. The following values are defined:  | Value                       | Wire MIME                   | Meaning                                              | | --------------------------- | --------------------------- | ---------------------------------------------------- | | &#x60;TEXT_PLAIN&#x60;                | &#x60;text/plain&#x60;                | Plain text. Default for &#x60;tool_result&#x60;.               | | &#x60;TEXT_MARKDOWN&#x60;             | &#x60;text/markdown&#x60;             | Markdown. Default for &#x60;text&#x60;.                        | | &#x60;TEXT_X_MARKDOWN_WITH_CODE&#x60; | &#x60;text/x-markdown-with-code&#x60; | Markdown whose body starts with a fenced code block. | | &#x60;TEXT_HTML&#x60;                 | &#x60;text/html&#x60;                 | Raw HTML.                                            |  #### transport_type values  &#x60;transport_type&#x60; is the &#x60;TransportType&#x60; enum used on the &#x60;resource&#x60; variant.  | Value              | Meaning                                       | | ------------------ | --------------------------------------------- | | &#x60;STREAMABLE_HTTP&#x60;  | Streamable HTTP transport (default for MCP).  | | &#x60;SSE&#x60;              | Server-sent events transport.                 |  #### FileReference fields  | Field                    | Type     | Description                                                  | | ------------------------ | -------- | ------------------------------------------------------------ | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the code-execution-generated file.      | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                    | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created.     |  Cross-reference &#x60;file_id&#x60; against &#x60;code_execution_files&#x60; to retrieve full metadata including the &#x60;expired&#x60; flag before attempting a download.  #### PublicFileInfo fields  | Field                    | Type     | Description                                              | | ------------------------ | -------- | -------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60; | Unique identifier of the file.                           | | &#x60;display_name&#x60;           | &#x60;String&#x60; | Human-readable file name.                                | | &#x60;file_type&#x60;              | &#x60;String&#x60; | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;   | Milliseconds since Unix epoch when the file was created. | | &#x60;size_bytes&#x60;             | &#x60;Int&#x60;    | File size in bytes.                                      |  #### CodeExecutionFileMetadata fields  Each entry in the &#x60;code_execution_files&#x60; array contains:  | Field                    | Type      | Description                                                                                                                     | | ------------------------ | --------- | ------------------------------------------------------------------------------------------------------------------------------- | | &#x60;file_id&#x60;                | &#x60;String&#x60;  | Unique identifier of the file.                                                                                                  | | &#x60;display_name&#x60;           | &#x60;String&#x60;  | Human-readable file name.                                                                                                       | | &#x60;file_type&#x60;              | &#x60;String&#x60;  | File type such as &#x60;csv&#x60;, &#x60;pdf&#x60;, or &#x60;png&#x60;.                                                                                       | | &#x60;created_time_in_millis&#x60; | &#x60;Long&#x60;    | Milliseconds since Unix epoch when the file was created.                                                                        | | &#x60;expired&#x60;                | &#x60;Boolean&#x60; | When &#x60;true&#x60;, the underlying file is no longer retrievable from code-execution storage; UIs should disable download and preview. |  #### Loading answer payloads  Each &#x60;AnswerResponseItem&#x60; in the response contains an &#x60;answer_id&#x60; field. Pass this value as the &#x60;answer_identifier&#x60; parameter to &#x60;loadAnswer&#x60; to retrieve the full answer payload (TML tokens, visualization metadata) for that item.  #### Example request  &#x60;&#x60;&#x60;bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/messages &#x60;&#x60;&#x60;  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;node_u_01\&quot;,       \&quot;timestamp_in_millis\&quot;: 1744000000000,       \&quot;user_prompt\&quot;: {         \&quot;message\&quot;: {           \&quot;message_id\&quot;: \&quot;msg_u_01\&quot;,           \&quot;content\&quot;: \&quot;Show me revenue by region as a chart.\&quot;         },         \&quot;attachments\&quot;: []       },       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;tool_call\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_01ABC\&quot;,           \&quot;tool_name\&quot;: \&quot;search_datasets\&quot;,           \&quot;step_title\&quot;: \&quot;Searching datasets\&quot;,           \&quot;arguments\&quot;: { \&quot;query\&quot;: \&quot;revenue\&quot; },           \&quot;timestamp_in_millis\&quot;: 1744000001000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;ans_01XYZ\&quot;,           \&quot;tool_call_id\&quot;: \&quot;toolu_02DEF\&quot;,           \&quot;tool_name\&quot;: \&quot;fetch_and_visualize\&quot;,           \&quot;step_title\&quot;: \&quot;Visualising\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000004000,           \&quot;is_thinking\&quot;: false         },         {           \&quot;type\&quot;: \&quot;text\&quot;,           \&quot;content\&quot;: \&quot;Revenue is highest in APAC.\&quot;,           \&quot;content_type\&quot;: \&quot;TEXT_MARKDOWN\&quot;,           \&quot;timestamp_in_millis\&quot;: 1744000005000,           \&quot;is_thinking\&quot;: false,           \&quot;step_title\&quot;: null,           \&quot;file_reference\&quot;: {             \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,             \&quot;created_time_in_millis\&quot;: 1744027200000           }         }       ]     }   ],   \&quot;code_execution_files\&quot;: [     {       \&quot;file_id\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;display_name\&quot;: \&quot;revenue_by_region.csv\&quot;,       \&quot;file_type\&quot;: \&quot;csv\&quot;,       \&quot;created_time_in_millis\&quot;: 1744027200000,       \&quot;expired\&quot;: false     }   ] } &#x60;&#x60;&#x60;  #### Example: liveboard-started conversation  When a conversation is initiated from a saved liveboard visualization rather than a user query, the first turn is synthetic. &#x60;user_prompt&#x60; is &#x60;null&#x60;, and &#x60;response_items&#x60; contains a single &#x60;answer&#x60; item referencing the seed visualization.  &#x60;&#x60;&#x60;json {   \&quot;messages\&quot;: [     {       \&quot;message_id\&quot;: \&quot;ROOT_NODE\&quot;,       \&quot;timestamp_in_millis\&quot;: 1743999000000,       \&quot;user_prompt\&quot;: null,       \&quot;response_items\&quot;: [         {           \&quot;type\&quot;: \&quot;answer\&quot;,           \&quot;answer_id\&quot;: \&quot;lb_seed_01\&quot;,           \&quot;tool_call_id\&quot;: null,           \&quot;tool_name\&quot;: null,           \&quot;step_title\&quot;: null,           \&quot;timestamp_in_millis\&quot;: 1743999000000,           \&quot;is_thinking\&quot;: false         }       ]     }   ],   \&quot;code_execution_files\&quot;: [] } &#x60;&#x60;&#x60;  Subsequent turns follow the normal user-to-agent pattern.  #### Error responses  | Code | Description                                                                                                                 | | ---- | --------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                        | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation exists with the given identifier for the authenticated user.                                    |  &gt; ###### Note: &gt; &gt; - Messages with an internal &#x60;SYSTEM&#x60; source are always dropped from the response. &gt; - In-progress turns are still returned with an empty &#x60;response_items&#x60; array so clients can render the user message immediately. &gt; - Do not assume every &#x60;tool_call&#x60; has a paired &#x60;tool_result&#x60; or &#x60;answer&#x60; — an interrupted conversation can leave a dangling call. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**

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

<a id="getConversationList"></a>
# **getConversationList**
> AgentConversationHistoryResponse getConversationList(limit, offset, skipEmpty)



 Retrieves the list of saved agent conversations for the currently authenticated user. Only conversations created with &#x60;enable_save_chat: true&#x60; are returned.    Version: 26.7.0.cl or later   Retrieves a paginated list of saved agent conversations for the currently authenticated user. Only conversations that were created with &#x60;enable_save_chat: true&#x60; in &#x60;createAgentConversation&#x60; are returned.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege.  #### Usage guidelines  The request supports the following optional query parameters:  - &#x60;limit&#x60;: maximum number of conversations to return. Use this together with &#x60;offset&#x60; for pagination. - &#x60;offset&#x60;: number of conversations to skip before returning results. Defaults to &#x60;0&#x60;. - &#x60;skip_empty&#x60;: when &#x60;true&#x60; (default), conversations with no messages are excluded from the results. Set to &#x60;false&#x60; to include empty conversations.  If the request is successful, the response includes a &#x60;conversations&#x60; array. Each entry contains:  - &#x60;conversation_identifier&#x60;: the unique ID of the conversation, used as input to &#x60;sendAgentConversationMessage&#x60;, &#x60;updateConversation&#x60;, &#x60;deleteConversation&#x60;, &#x60;stopConversation&#x60;, and &#x60;loadAnswer&#x60; - &#x60;conversation_title&#x60;: the display name of the conversation - &#x60;created_at&#x60;: ISO 8601 timestamp of when the conversation was created - &#x60;updated_at&#x60;: ISO 8601 timestamp of the most recent update to the conversation - &#x60;data_source_identifiers&#x60;: list of unique IDs of the data sources associated with the conversation - &#x60;data_source_names&#x60;: array of &#x60;{ id, name }&#x60; objects for the data sources associated with the conversation  #### Pagination  Use &#x60;limit&#x60; and &#x60;offset&#x60; to page through large result sets:  &#x60;&#x60;&#x60; GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;0   → first page GET /api/rest/2.0/ai/agent/conversations?limit&#x3D;20&amp;offset&#x3D;20  → second page &#x60;&#x60;&#x60;  #### Pagination and &#x60;has_more&#x60;  The response includes a &#x60;has_more: Boolean&#x60; field. When &#x60;true&#x60;, there are additional conversations beyond the current page — increment &#x60;offset&#x60; by &#x60;limit&#x60; to fetch the next page. When &#x60;has_more&#x60; is &#x60;false&#x60;, the current page is the last. Note that &#x60;total_count&#x60; is not returned; use &#x60;has_more&#x60; to drive paging controls.  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;conversations\&quot;: [     {       \&quot;conversation_identifier\&quot;: \&quot;abc123\&quot;,       \&quot;conversation_title\&quot;: \&quot;Sales by Region Q1\&quot;,       \&quot;created_at\&quot;: \&quot;2026-03-01T10:00:00Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2026-03-05T14:23:00Z\&quot;,       \&quot;data_source_identifiers\&quot;: [\&quot;ds-001\&quot;],       \&quot;data_source_names\&quot;: [{ \&quot;id\&quot;: \&quot;ds-001\&quot;, \&quot;name\&quot;: \&quot;Retail Sales\&quot; }]     }   ],   \&quot;has_more\&quot;: false } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege. |  &gt; ###### Note: &gt; &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; appear in this list. Conversations created with &#x60;enable_save_chat: false&#x60; (the default) are not persisted and cannot be retrieved. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **limit** | **Integer**
| **offset** | **Integer**
| **skipEmpty** | **Boolean**

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

<a id="getCurrentUserInfo"></a>
# **getCurrentUserInfo**
> User getCurrentUserInfo()



  Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user&#39;s privilege and object access permissions.  **NOTE**: In ThoughtSpot, users with cluster administration privileges can access all Orgs by default. However, unless the administrator is explicitly added to an Org, the Orgs list in the session information returned by the API will include only the Primary Org. To include other Orgs in the API response, you must explicitly add the administrator to each Org in the Admin settings page in the UI or via user REST API.     

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

<a id="getCurrentUserToken"></a>
# **getCurrentUserToken**
> GetTokenResponse getCurrentUserToken()



  Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      

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

<a id="getCustomAccessToken"></a>
# **getCustomAccessToken**
> AccessToken getCustomAccessToken(getCustomAccessTokenRequest)



  Version: 10.4.0.cl or later   Creates an authentication token that provides values for the formula variables in the Row Level Security (RLS) rules for a given user. Recommended for use cases that require Attribute-based access control (ABAC) via RLS.  #### Required privileges  To add a new user and assign privileges during auto-creation, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60; (**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source are required.  To configure formula variables for all Orgs on your instance or the Primary Org, cluster administration privileges are required. Org administrators can configure formula variables for their respective Orgs. If Role-Based Access Control (RBAC) is enabled, users with the &#x60;CAN_MANAGE_VARIABLES&#x60; (**Can manage variables**) role privilege can also create and manage variables for their Org context.  #### Usage guidelines  You can generate a token by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using a &#x60;secret_key&#x60;. To generate a &#x60;secret_key&#x60;, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: * When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with &#x60;username&#x60;  and &#x60;password&#x60; returns an error. You can switch to token-based authentication with  &#x60;secret_key&#x60;  or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### ABAC via RLS  To implement ABAC via RLS and assign security entitlements to users during session creation, generate a token with custom variable values. The values set in the authentication token are applied to the formula variables referenced in RLS rules at the table level, which determines the data each user can access based on their entitlements.  The variable values can be configured to persist for a specific set of Models in user sessions initiated with the token, allowing different RLS rules to be set for different data models. Once defined, the rules are added to the user&#39;s &#x60;variable_values&#x60; object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/abac-via-rls-variables).  ##### Formula variables Before defining variable values, ensure the variables are created and available on your instance. To create a formula variable, you can use the **Create variable** (&#x60;/api/rest/2.0/template/variables/create&#x60;) REST API endpoint, with the variable &#x60;type&#x60; set as &#x60;Formula_Variable&#x60; in the API request.  The API doesn&#39;t support &#x60;\&quot;persist_option\&quot;: \&quot;RESET\&quot;&#x60; and &#x60;\&quot;persist_option\&quot;: \&quot;NONE\&quot;&#x60; when &#x60;variable_values&#x60; are defined  in the request. If you are using &#x60;variable_values&#x60; for token generation, you must use other supported persist options such as &#x60;APPEND&#x60; or &#x60;REPLACE&#x60;.  If you want to use &#x60;RESET&#x60; or &#x60;NONE&#x60;, do not pass any &#x60;variable_values&#x60;. In such cases, &#x60;variable_values&#x60; will remain unaffected.  #### Supported objects  The supported object type is &#x60;LOGICAL_TABLE&#x60;. When using &#x60;object_id&#x60; with &#x60;variable_values&#x60;, models are supported.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60;  Set &#x60;auto_create&#x60; to &#x60;true&#x60; if the username does not exist in ThoughtSpot. If the username already exists in ThoughtSpot and &#x60;auto_create&#x60; is set to &#x60;true&#x60;, user properties such as display name, email, Org and group entitlements will not be updated with new values. Setting &#x60;auto_create&#x60; to &#x60;true&#x60; does not create formula variables. Hence, this setting will not be applicable to &#x60;variable_values&#x60;.  #### Important point to note All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created. Persist options such as &#x60;APPEND&#x60; and &#x60;REPLACE&#x60; will persist &#x60;variable_values&#x60; on the user profile when the token is created.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getCustomAccessTokenRequest** | [**GetCustomAccessTokenRequest**](GetCustomAccessTokenRequest.md)

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

<a id="getDataSourceSuggestions"></a>
# **getDataSourceSuggestions**
> EurekaDataSourceSuggestionResponse getDataSourceSuggestions(getDataSourceSuggestionsRequest)



 Version: 10.15.0.cl or later   Suggests the most relevant data sources for a given natural language query, ranked by confidence with LLM-generated reasoning.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include: - &#x60;query&#x60;: the natural language question to find relevant data sources for  If the request is successful, the API returns a ranked list of suggested data sources, each containing: - &#x60;confidence&#x60;: a float score indicating the model&#39;s confidence in the relevance of the suggestion - &#x60;details&#x60;: metadata about the data source   - &#x60;data_source_identifier&#x60;: the unique ID of the data source   - &#x60;data_source_name&#x60;: the display name of the data source   - &#x60;description&#x60;: a description of the data source - &#x60;reasoning&#x60;: LLM-generated rationale explaining why the data source was recommended  #### Error responses  | Code | Description                                                                                                                                | |------|--------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                       | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the underlying metadata entities. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. &gt; * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getDataSourceSuggestionsRequest** | [**GetDataSourceSuggestionsRequest**](GetDataSourceSuggestionsRequest.md)

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

<a id="getFullAccessToken"></a>
# **getFullAccessToken**
> Token getFullAccessToken(getFullAccessTokenRequest)



  Version: 9.0.0.cl or later   Generates an authentication token for creating a full session in ThoughtSpot for a given user. Recommended for use cases that do not require Attribute-based access control (ABAC) via Row Level Security (RLS).  #### Usage guidelines  You can generate a token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the &#x60;secret_key&#x60; generated for your instance. To generate a &#x60;secret_key&#x60;, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: * When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with &#x60;username&#x60; and &#x60;password&#x60; returns an error. You can switch to token-based authentication with  &#x60;secret_key&#x60; or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60;  Set &#x60;auto_create&#x60; to &#x60;true&#x60; if the username does not exist in ThoughtSpot. If the user already exists in ThoughtSpot and &#x60;auto_create&#x60; is set to &#x60;true&#x60;, user properties such as display name, email and group assignment will be updated.  To add a new user and assign privileges during auto-creation, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60; (**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getFullAccessTokenRequest** | [**GetFullAccessTokenRequest**](GetFullAccessTokenRequest.md)

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

<a id="getManualTranslationBundle"></a>
# **getManualTranslationBundle**
> Object getManualTranslationBundle(locale)



 Get translations bundle for a locale.    Version: 26.7.0.cl or later   Retrieves all translations for a specific locale as a JSON map.  Available to all authenticated users. No additional privileges are required.  #### Usage guidelines  - &#x60;locale&#x60; parameter must be a hyphenated locale code (for example, &#x60;fr-fr&#x60;, &#x60;de-de&#x60;, &#x60;JA-JP&#x60;). - Returns a JSON object with a &#x60;translations&#x60; map where each key is the original string and each value is the translated string. - If the org has no translations for the requested locale, the endpoint falls back to cluster-level translations. - Returns an empty &#x60;translations&#x60; map (not an error) if no entries exist at either level.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **locale** | **String**

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

<a id="getNLInstructions"></a>
# **getNLInstructions**
> EurekaGetNLInstructionsResponse getNLInstructions(getNLInstructionsRequest)



 Version: 10.15.0.cl or later   Retrieves existing natural language (NL) instructions configured for a specific data model. These instructions guide the AI system in understanding data context and generating more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, at least view access on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  The request must include:  - &#x60;data_source_identifier&#x60;: the unique ID of the data model to retrieve instructions for  If the request is successful, the API returns:  - &#x60;nl_instructions_info&#x60;: an array of instruction objects, each containing:   - &#x60;instructions&#x60;: the configured text instructions for AI processing   - &#x60;scope&#x60;: the scope of the instruction — currently only &#x60;GLOBAL&#x60; is supported  #### Instructions scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  #### Error responses  | Code | Description                                                                                                                                                                                        | |------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks view access on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs at least view access on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Use this API to review currently configured instructions before modifying them with &#x60;setNLInstructions&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getNLInstructionsRequest** | [**GetNLInstructionsRequest**](GetNLInstructionsRequest.md)

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

<a id="getObjectAccessToken"></a>
# **getObjectAccessToken**
> Token getObjectAccessToken(getObjectAccessTokenRequest)



  Version: 9.0.0.cl or later   Generates an authentication token that provides access to a specific metadata object. This object list is intersected with the list of objects the user is allowed to access via group membership. For more information, see [Object security](https://docs.thoughtspot.com/cloud/latest/security-data-object#object_security).  #### Usage guidelines  You can generate a token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using the &#x60;secret_key&#x60; generated for your instance. To generate a &#x60;secret_key&#x60;, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/trusted-auth-secret-key) in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: * When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence. * If [Multi-Factor Authentication (MFA)](https://docs.thoughtspot.com/cloud/latest/authentication-local-mfa) is enabled on your instance, the API login request with &#x60;username&#x60; and &#x60;password&#x60; returns an error. You can switch to token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for assistance.  The token obtained from ThoughtSpot is valid for 5 minutes by default. You can configure the token expiration time as required.  #### Just-in-time provisioning  For [just-in-time user creation and provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning), specify the following attributes in the API request:  * &#x60;auto_create&#x60; * &#x60;username&#x60; * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60;  Set &#x60;auto_create&#x60; to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60;, user properties such as display name, email, and group assignment will be updated.  To add a new user and assign privileges, the &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege is required. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note  All options in the token creation APIs that define user access to data in ThoughtSpot will take effect during token creation, not when the token is used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when the authentication token is created.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getObjectAccessTokenRequest** | [**GetObjectAccessTokenRequest**](GetObjectAccessTokenRequest.md)

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

<a id="getRelevantQuestions"></a>
# **getRelevantQuestions**
> EurekaGetRelevantQuestionsResponse getRelevantQuestions(getRelevantQuestionsRequest)



 Version: 10.13.0.cl or later   Breaks down a natural language query into a series of smaller analytical sub-questions, each mapped to a relevant data source.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request must include: - &#x60;query&#x60;: the natural language question to decompose into analytical sub-questions - &#x60;metadata_context&#x60;: at least one of the following context identifiers to guide question generation:   - &#x60;conversation_identifier&#x60; — an existing conversation session ID   - &#x60;answer_identifiers&#x60; — a list of Answer GUIDs   - &#x60;liveboard_identifiers&#x60; — a list of Liveboard GUIDs   - &#x60;data_source_identifiers&#x60; — a list of data source GUIDs  Optional parameters for refining the output: - &#x60;ai_context&#x60;: additional context to improve response quality   - &#x60;content&#x60; — supplementary text or CSV data as string input   - &#x60;instructions&#x60; — custom text instructions for the AI system - &#x60;limit_relevant_questions&#x60;: maximum number of questions to return (default: &#x60;5&#x60;) - &#x60;bypass_cache&#x60;: if &#x60;true&#x60;, forces fresh computation instead of returning cached results  If the request is successful, the API returns a list of relevant analytical questions, each containing: - &#x60;query&#x60;: the generated sub-question - &#x60;data_source_identifier&#x60;: the unique ID of the data source the question targets - &#x60;data_source_name&#x60;: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view access to the referenced metadata objects. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **getRelevantQuestionsRequest** | [**GetRelevantQuestionsRequest**](GetRelevantQuestionsRequest.md)

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

<a id="getSystemConfig"></a>
# **getSystemConfig**
> SystemConfig getSystemConfig()



  Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires &#x60;ADMINISTRATION&#x60;(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      

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

<a id="getSystemInformation"></a>
# **getSystemInformation**
> SystemInfo getSystemInformation()



  Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        

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

<a id="getSystemOverrideInfo"></a>
# **getSystemOverrideInfo**
> SystemOverrideInfo getSystemOverrideInfo()



  Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        

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

<a id="getWebhookStorageConfig"></a>
# **getWebhookStorageConfig**
> List&lt;WebhookStorageConfigInfo&gt; getWebhookStorageConfig()



  Version: 26.7.0.cl or later   Returns cluster-level storage setup information for configuring customer-managed storage. Use this endpoint to obtain the IAM identity details required before configuring a webhook storage destination. For S3 destinations, returns the platform AWS account ID and IAM trust policy template. For GCS destinations, returns the platform GCP service account email and the IAM role to grant for service account impersonation.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

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

<a id="importManualTranslations"></a>
# **importManualTranslations**
> importManualTranslations(translationsFile, scope)



 Import manual translations from a CSV file.    Version: 26.7.0.cl or later   Uploads a CSV file containing manual translations and upserts them into the database.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**), &#x60;ORG_ADMINISTRATION&#x60; (**Can administer Org**), or &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can administer application**) privilege.  #### Usage guidelines  - The CSV file must have exactly three columns in this order: &#x60;content&#x60;, &#x60;locale&#x60;, &#x60;translated-content&#x60;. - Maximum file size: **30 MB**. Maximum rows: **10,000**. - Only &#x60;.csv&#x60; files are accepted. - The import performs an **upsert**: existing entries matched by &#x60;(org_id, locale, content)&#x60; are updated; new entries are inserted. Entries not in the upload are left untouched. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload translations to the All-Org context. Cluster-level translations act as defaults for orgs that have no translations for a locale.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **translationsFile** | **File**
| **scope** | **String**

### Return type

null (empty response body)

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

<a id="importMetadataTML"></a>
# **importMetadataTML**
> List&lt;Object&gt; importMetadataTML(importMetadataTMLRequest)



  Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the &#x60;fqn&#x60; property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding &#x60;fqn&#x60; helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **importMetadataTMLRequest** | [**ImportMetadataTMLRequest**](ImportMetadataTMLRequest.md)

### Return type

**List&lt;Object&gt;**

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

<a id="importMetadataTMLAsync"></a>
# **importMetadataTMLAsync**
> ImportEPackAsyncTaskStatus importMetadataTMLAsync(importMetadataTMLAsyncRequest)



  Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via &#x60;/api/rest/2.0/metadata/tml/async/status&#x60; API endpoint.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **importMetadataTMLAsyncRequest** | [**ImportMetadataTMLAsyncRequest**](ImportMetadataTMLAsyncRequest.md)

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

<a id="importUserGroups"></a>
# **importUserGroups**
> ImportUserGroupsResponse importUserGroups(importUserGroupsRequest)



  Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **importUserGroupsRequest** | [**ImportUserGroupsRequest**](ImportUserGroupsRequest.md)

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

<a id="importUsers"></a>
# **importUsers**
> ImportUsersResponse importUsers(importUsersRequest)



  Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a &#x60;default_password&#x60; in the API request is optional. * If &#x60;delete_unspecified_users&#x60; is set to &#x60;true&#x60;, the users not specified in the API request, excluding the &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and &#x60;su&#x60; users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **importUsersRequest** | [**ImportUsersRequest**](ImportUsersRequest.md)

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

<a id="loadAnswer"></a>
# **loadAnswer**
> LoadAnswerResponse loadAnswer(conversationIdentifier, answerIdentifier)



 Loads the full answer payload for a specific answer item in an agent conversation. Returns structured answer data including the TML query, token breakdown, visualization metadata, and agent context state. Pass the &#x60;answer_id&#x60; from an &#x60;AnswerResponseItem&#x60; in the &#x60;getConversation&#x60; response as the &#x60;answer_identifier&#x60; parameter. Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.    Version: 26.7.0.cl or later   Loads the answer details for a specific answer item in an agent conversation. Returns structured answer data including the TML token list, visualization metadata, and agent context state. Use this endpoint to retrieve the full answer representation for an answer item — for example, to re-render a chart, export a query, or inspect the generated TML.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation, as returned by &#x60;createAgentConversation&#x60; - &#x60;answer_identifier&#x60; *(path parameter)*: the &#x60;answer_id&#x60; field from an &#x60;AnswerResponseItem&#x60; in the &#x60;getConversation&#x60; response  If the request is successful, the response contains an &#x60;answer&#x60; object with the following fields:  | Field | Type | Description | |-------|------|-------------| | &#x60;title&#x60; | &#x60;String&#x60; | Display title of the generated answer (e.g., &#x60;\&quot;sales by month\&quot;&#x60;). | | &#x60;description&#x60; | &#x60;String&#x60; | Optional description of the answer. | | &#x60;session_identifier&#x60; | &#x60;String&#x60; | Unique identifier of the session in which this answer was generated. | | &#x60;generation_number&#x60; | &#x60;Int&#x60; | Generation sequence number of this answer within the session. | | &#x60;tokens&#x60; | &#x60;[String]&#x60; | Ordered list of TML token strings that make up the answer query (e.g., &#x60;[\&quot;[sales]\&quot;, \&quot;[date].&#39;monthly&#39;\&quot;]&#x60;). | | &#x60;visualization_type&#x60; | &#x60;VizType&#x60; | Suggested visualization type: &#x60;Chart&#x60;, &#x60;Table&#x60;, or &#x60;Undefined&#x60;. &#x60;null&#x60; if no suggestion is available. | | &#x60;formulas&#x60; | &#x60;[String]&#x60; | List of formula names referenced in the answer. Empty if none are used. | | &#x60;parameters&#x60; | &#x60;[String]&#x60; | List of parameter names applied to the answer. Empty if none are used. | | &#x60;sub_queries&#x60; | &#x60;[JSON]&#x60; | List of sub-query objects used in the answer. Empty if none are present. | | &#x60;ac_state&#x60; | &#x60;ACState&#x60; | Agent context state, including &#x60;transaction_identifier&#x60; and &#x60;generation_number&#x60;, used to correlate this answer with a specific agent turn. |  #### ACState fields  | Field | Type | Description | |-------|------|-------------| | &#x60;transaction_identifier&#x60; | &#x60;String&#x60; | Unique identifier of the agent transaction that produced this answer. | | &#x60;generation_number&#x60; | &#x60;Int&#x60; | Generation number within the transaction. |  #### Example request  &#x60;&#x60;&#x60;bash GET /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/answers/{answer_identifier}/details &#x60;&#x60;&#x60;  #### Example response  &#x60;&#x60;&#x60;json {   \&quot;answer\&quot;: {     \&quot;title\&quot;: \&quot;sales by month\&quot;,     \&quot;description\&quot;: \&quot;\&quot;,     \&quot;session_identifier\&quot;: \&quot;7b00b801-73f4-4639-af5e-e775584ceba6\&quot;,     \&quot;generation_number\&quot;: 1,     \&quot;tokens\&quot;: [\&quot;[sales]\&quot;, \&quot;[date].&#39;monthly&#39;\&quot;],     \&quot;visualization_type\&quot;: null,     \&quot;formulas\&quot;: [],     \&quot;parameters\&quot;: [],     \&quot;sub_queries\&quot;: [],     \&quot;ac_state\&quot;: {       \&quot;transaction_identifier\&quot;: \&quot;7f6c9948-b4c7-4098-bb1f-6c67bc0e5699\&quot;,       \&quot;generation_number\&quot;: 1     }   } } &#x60;&#x60;&#x60;  #### Typical usage scenario  1. Call &#x60;getConversation&#x60; to retrieve the full conversation history. 2. Locate an &#x60;AnswerResponseItem&#x60; in &#x60;response_items&#x60; — note its &#x60;answer_id&#x60; field. 3. Call &#x60;loadAnswer&#x60; with the &#x60;conversation_identifier&#x60; and &#x60;answer_id&#x60; as &#x60;answer_identifier&#x60;. 4. The returned &#x60;tokens&#x60; array can be used to open the answer in the ThoughtSpot search interface or rendered as pill chips in the UI.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. | | 404  | Not Found — no conversation or message exists with the given identifiers for the authenticated user. | | 422  | Unprocessable Entity — the message does not contain an answer of the expected type. |  &gt; ###### Note: &gt; &gt; - This endpoint only loads answer-type messages. Other message types are not supported. &gt; - &#x60;visualization_type&#x60; may be &#x60;null&#x60; if the agent did not produce a visualization suggestion for this answer. &gt; - &#x60;formulas&#x60;, &#x60;parameters&#x60;, and &#x60;sub_queries&#x60; are returned as empty arrays when not applicable — they are never &#x60;null&#x60;. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **answerIdentifier** | **String**

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

<a id="login"></a>
# **login**
> login(loginRequest)



  Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (&#x60;username&#x60;  and &#x60;password&#x60; ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **loginRequest** | [**LoginRequest**](LoginRequest.md)

### Return type

null (empty response body)

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

<a id="logout"></a>
# **logout**
> logout()



  Version: 9.0.0.cl or later    Logs out a user from their current session.      

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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

<a id="manageObjectPrivilege"></a>
# **manageObjectPrivilege**
> manageObjectPrivilege(manageObjectPrivilegeRequest)



  Version: 26.3.0.cl or later   This API allows the addition or deletion of object level privileges for a set of users and groups, on a set of metadata objects. It provides users to access certain features based on privilege based access control.  #### Usage guidelines  - Specify the &#x60;operation&#x60;. The supported operations are: &#x60;ADD&#x60;, &#x60;REMOVE&#x60;. - Specify the type of the objects on which the object privileges are being provided in &#x60;metadata_type&#x60;. Only &#x60;LOGICAL_TABLE&#x60; metadata type is supported for now. It may be extended for other metadata types in future. - Specify the list of object privilege types in the &#x60;object_privilege_types&#x60; array. The supported object privilege types are: &#x60;SPOTTER_COACHING_PRIVILEGE&#x60;. - Specify the identifiers (either GUID or name) for the metadata objects in the &#x60;metadata_identifiers&#x60; array. - Specify the &#x60;type&#x60; (&#x60;USER&#x60; or &#x60;USER_GROUP&#x60;) and &#x60;identifier&#x60; (either GUID or name) of the principals to which you want to apply the given operation and given object privileges in the &#x60;principals&#x60; array. - Ensure using correct Authorization Bearer Token corresponding to specific user &amp; org.  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;operation\&quot;: \&quot;operation-type\&quot;,   \&quot;metadata_type\&quot;: \&quot;metadata-type\&quot;,   \&quot;object_privilege_types\&quot;: [\&quot;privilege-type-1\&quot;, \&quot;privilege-type-2\&quot;],   \&quot;metadata_identifiers\&quot;: [\&quot;metadata-guid-or-name-1\&quot;, \&quot;metadata-guid-or-name-1\&quot;],   \&quot;principals\&quot;: [     {       \&quot;type\&quot;: \&quot;type-1\&quot;,        \&quot;identifier\&quot;: \&quot;principal-guid-or-name-1\&quot;     },     {       \&quot;type\&quot;: \&quot;type-2\&quot;,       \&quot;identifier\&quot;: \&quot;principal-guid-or-name-2\&quot;     }   ] } &#x60;&#x60;&#x60;  &gt; ###### Note: &gt; * Only admin users, users with edit access and users with coaching privilege on a given data-model can add or remove principals related to SPOTTER_COACHING_PRIVILEGE       

### Parameters

| Name | Type |
|------------- | ------------- |
| **manageObjectPrivilegeRequest** | [**ManageObjectPrivilegeRequest**](ManageObjectPrivilegeRequest.md)

### Return type

null (empty response body)

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

<a id="parameterizeMetadata"></a>
# **parameterizeMetadata**
> parameterizeMetadata(parameterizeMetadataRequest)



 Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/metadata/parameterize-fields](/api/rest/2.0/metadata/parameterize-fields) instead.  Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always &#x60;CONNECTION_PROPERTY&#x60;. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be parameterized.  For Connection Config, the only supported field name is: * impersonate_user      

### Parameters

| Name | Type |
|------------- | ------------- |
| **parameterizeMetadataRequest** | [**ParameterizeMetadataRequest**](ParameterizeMetadataRequest.md)

### Return type

null (empty response body)

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

<a id="parameterizeMetadataFields"></a>
# **parameterizeMetadataFields**
> parameterizeMetadataFields(parameterizeMetadataFieldsRequest)



 Parameterize multiple fields of metadata objects. For example [schemaName, databaseName] for LOGICAL_TABLE.    Version: 26.5.0.cl or later   Allows parameterizing multiple fields of metadata objects in ThoughtSpot. For example, you can parameterize [schemaName, databaseName] for LOGICAL_TABLE.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table, the field type must be &#x60;ATTRIBUTE&#x60; and field names can include: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always &#x60;CONNECTION_PROPERTY&#x60;. In this case, field_names specifies the exact properties of the Connection or Connection Config that need to be parameterized.  For Connection Config, supported field names include: * impersonate_user  You can parameterize multiple fields at once by providing an array of field names.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **parameterizeMetadataFieldsRequest** | [**ParameterizeMetadataFieldsRequest**](ParameterizeMetadataFieldsRequest.md)

### Return type

null (empty response body)

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

<a id="publishMetadata"></a>
# **publishMetadata**
> publishMetadata(publishMetadataRequest)



  Version: 26.5.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it&#39;s dependencies to the org admins of the orgs to which it is being published.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **publishMetadataRequest** | [**PublishMetadataRequest**](PublishMetadataRequest.md)

### Return type

null (empty response body)

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

<a id="putVariableValues"></a>
# **putVariableValues**
> putVariableValues(identifier, putVariableValuesRequest)



 Update values for a variable    Version: 26.4.0.cl or later   Allows updating values for a specific variable in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to the variable * Replacing existing values * Deleting values from the variable * Resetting all values  When updating variable values, you need to specify: * The variable identifier (ID or name) * The values to add/replace/remove * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constraints for the given variable, scope is ignored      

### Parameters

| Name | Type |
|------------- | ------------- |
| **identifier** | **String**
| **putVariableValuesRequest** | [**PutVariableValuesRequest**](PutVariableValuesRequest.md)

### Return type

null (empty response body)

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

<a id="queryGetDecomposedQuery"></a>
# **queryGetDecomposedQuery**
> EurekaDecomposeQueryResponse queryGetDecomposedQuery(queryGetDecomposedQueryRequest)



 Version: 10.7.0.cl or later   **Deprecated** — Use &#x60;getRelevantQuestions&#x60; instead (available from 10.13.0.cl).  Breaks down a topical or goal-oriented natural language question into smaller, actionable analytical sub-questions, each mapped to a relevant data source for independent execution.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view-level access to the referenced metadata objects.  #### Usage guidelines  The request accepts the following parameters:  - &#x60;nlsRequest&#x60;: contains the user &#x60;query&#x60; to decompose, along with optional &#x60;instructions&#x60; and &#x60;bypassCache&#x60; flag - &#x60;worksheetIds&#x60;: list of data source identifiers to scope the decomposition - &#x60;answerIds&#x60;: list of Answer GUIDs whose data guides the response - &#x60;liveboardIds&#x60;: list of Liveboard GUIDs whose data guides the response - &#x60;conversationId&#x60;: an existing conversation session ID for context continuity - &#x60;content&#x60;: supplementary text or CSV data to improve response quality - &#x60;maxDecomposedQueries&#x60;: maximum number of sub-questions to return (default: &#x60;5&#x60;)  If the request is successful, the API returns a &#x60;decomposedQueryResponse&#x60; containing a list of &#x60;decomposedQueries&#x60;, each with: - &#x60;query&#x60;: the generated analytical sub-question - &#x60;worksheetId&#x60;: the unique ID of the data source the question targets - &#x60;worksheetName&#x60;: the display name of the corresponding data source  #### Error responses  | Code | Description                                                                                                                           | |------|---------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                  | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view access to the referenced metadata objects. |  &gt; ###### Note: &gt; * This endpoint is deprecated since 10.13.0.cl. Use &#x60;getRelevantQuestions&#x60; for new integrations. &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter — please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **queryGetDecomposedQueryRequest** | [**QueryGetDecomposedQueryRequest**](QueryGetDecomposedQueryRequest.md)

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

<a id="resetUserPassword"></a>
# **resetUserPassword**
> resetUserPassword(resetUserPasswordRequest)



  Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **resetUserPasswordRequest** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md)

### Return type

null (empty response body)

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

<a id="revertCommit"></a>
# **revertCommit**
> RevertResponse revertCommit(commitId, revertCommitRequest)



  Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the &#x60;commit_id&#x60;. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **commitId** | **String**
| **revertCommitRequest** | [**RevertCommitRequest**](RevertCommitRequest.md)

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

<a id="revokeRefreshTokens"></a>
# **revokeRefreshTokens**
> RevokeRefreshTokensResponse revokeRefreshTokens(connectionIdentifier, revokeRefreshTokensRequest)



  Version: 26.2.0.cl or later   Revokes OAuth refresh tokens for users who no longer require access to a data warehouse connection. When a token is revoked, the affected user&#39;s session for that connection is terminated, and they must re-authenticate to regain access.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on the ThoughtSpot instance, users with &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege can also make API requests to revoke tokens for connection users.  #### Usage guidelines  You can specify different combinations of identifiers to control which refresh tokens are revoked.  - **connection_identifier**: Revokes refresh tokens for all users of the connection, except the connection author. - **connection_identifier** and **user_identifiers**: Revokes refresh tokens only for the users specified in the request. If the name or ID of the connection author is included in the request, their token will also be revoked. - **connection_identifier** and **configuration_identifiers**: Revokes refresh tokens for all users on the specified configurations, except the configuration author. - **connection_identifier**, **configuration_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users on the specified configurations. - **connection_identifier** and **org_identifiers**: Revokes refresh tokens for the specified Orgs. Applicable only for published connections. - **connection_identifier**, **org_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users in the specified Orgs. Applicable only for published connections.  **NOTE**: The &#x60;org_identifiers&#x60; parameter is only applicable for published connections. Using this parameter for unpublished connections will result in an error. Ensure that the connections are published before making the API request.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**
| **revokeRefreshTokensRequest** | [**RevokeRefreshTokensRequest**](RevokeRefreshTokensRequest.md)

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

<a id="revokeToken"></a>
# **revokeToken**
> revokeToken(revokeTokenRequest)



  Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **revokeTokenRequest** | [**RevokeTokenRequest**](RevokeTokenRequest.md)

### Return type

null (empty response body)

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

<a id="searchAuthSettings"></a>
# **searchAuthSettings**
> SearchAuthSettingsResponse searchAuthSettings(searchAuthSettingsRequest)



  Version: 26.6.0.cl or later   Returns the authentication configuration for the specified auth type at cluster and org level. Currently supports &#x60;TRUSTED_AUTH&#x60;.  #### Required privileges  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;CONTROL_TRUSTED_AUTH&#x60; (**Can Enable or Disable Trusted Authentication**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CONTROL_TRUSTED_AUTH&#x60; privilege is required.  #### Usage guidelines  Use &#x60;scope&#x60; to control which level of settings are returned: - &#x60;CLUSTER&#x60; — Returns cluster-level authentication status and access tokens. Accessible only from the Primary Org. - &#x60;ORG&#x60; — Returns org-level authentication status and access tokens for the current Org. Requires the per-Org authentication feature to be enabled on your instance. - If &#x60;scope&#x60; is omitted, both cluster and org-level settings are returned based on the caller&#39;s org context and feature availability.  The &#x60;access_tokens&#x60; array in &#x60;cluster_preferences&#x60; or &#x60;org_preferences&#x60; is omitted when no token is configured at that level.  **Note**: Access tokens returned in the response are sensitive credentials. Treat them with the same care as passwords.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchAuthSettingsRequest** | [**SearchAuthSettingsRequest**](SearchAuthSettingsRequest.md)

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

<a id="searchCalendars"></a>
# **searchCalendars**
> List&lt;CalendarResponse&gt; searchCalendars(searchCalendarsRequest)



  Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as &#x60;name_pattern&#x60; and &#x60;sort_options&#x60; as search filters.  The &#x60;name_pattern&#x60; parameter filters and returns only those objects that match the specified pattern. Use &#x60;%&#x60; as a wildcard for pattern matching.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCalendarsRequest** | [**SearchCalendarsRequest**](SearchCalendarsRequest.md)

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

<a id="searchChannelHistory"></a>
# **searchChannelHistory**
> SearchChannelHistoryResponse searchChannelHistory(searchChannelHistoryRequest)



  Version: 26.4.0.cl or later   Searches delivery history for communication channels such as webhooks. Returns channel-level delivery status for each job execution record. Use this to monitor channel health and delivery success rates across events.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.  **NOTE**: When &#x60;channel_type&#x60; is &#x60;WEBHOOK&#x60;, the following constraints apply:  - &#x60;job_ids&#x60;, &#x60;channel_identifiers&#x60;, and &#x60;events&#x60; each accept at most one element. - When &#x60;job_ids&#x60; is provided, it is used as the sole lookup key and other filter fields are ignored. - When &#x60;job_ids&#x60; is not provided, &#x60;channel_identifiers&#x60; and &#x60;events&#x60; are both required, each containing exactly one element. - Records older than the configured retention period are not returned. - Use &#x60;start_epoch_time_in_millis&#x60; and/or &#x60;end_epoch_time_in_millis&#x60; to narrow results to a specific time window.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchChannelHistoryRequest** | [**SearchChannelHistoryRequest**](SearchChannelHistoryRequest.md)

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

<a id="searchCollections"></a>
# **searchCollections**
> CollectionSearchResponse searchCollections(searchCollectionsRequest)



  Version: 26.4.0.cl or later   Gets a list of collections available in ThoughtSpot.  To get details of a specific collection, specify the collection GUID or name. You can also filter the API response based on the collection name pattern, author, and other criteria.  #### Search options  * **name_pattern**: Use &#39;%&#39; as a wildcard character to match collection names * **collection_identifiers**: Search for specific collections by their GUIDs or names * **include_metadata**: When set to &#x60;true&#x60;, includes the metadata objects within each collection in the response  **NOTE**: If the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60; parameter. To search across all available collections, set &#x60;record_size&#x60; to &#x60;-1&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCollectionsRequest** | [**SearchCollectionsRequest**](SearchCollectionsRequest.md)

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

<a id="searchCommits"></a>
# **searchCommits**
> List&lt;CommitHistoryResponse&gt; searchCommits(searchCommitsRequest)



  Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege and edit access to the metadata objects.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCommitsRequest** | [**SearchCommitsRequest**](SearchCommitsRequest.md)

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

<a id="searchCommunicationChannelPreferences"></a>
# **searchCommunicationChannelPreferences**
> CommunicationChannelPreferencesResponse searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest)



 Version: 10.14.0.cl or later   Fetch communication channel preferences. - Use &#x60;cluster_preferences&#x60; to fetch the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use &#x60;org_preferences&#x60; to fetch any Org-specific preferences that override the defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCommunicationChannelPreferencesRequest** | [**SearchCommunicationChannelPreferencesRequest**](SearchCommunicationChannelPreferencesRequest.md)

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

<a id="searchConfig"></a>
# **searchConfig**
> List&lt;RepoConfigObject&gt; searchConfig(searchConfigRequest)



  Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchConfigRequest** | [**SearchConfigRequest**](SearchConfigRequest.md)

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

<a id="searchConnection"></a>
# **searchConnection**
> List&lt;SearchConnectionResponse&gt; searchConnection(searchConnectionRequest)



  Version: 9.2.0.cl or later   Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To fetch details of a connection object, specify the connection object GUID or name. The &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific database, schema, table, or column from a connection object, define the object type in &#x60;data_warehouse_object_type&#x60; and object properties in the &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (&#x60;database&#x60; &gt; &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;).  &#x60;&#x60;&#x60; {   \&quot;connections\&quot;: [     {       \&quot;identifier\&quot;: \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;,       \&quot;data_warehouse_objects\&quot;: [         {           \&quot;database\&quot;: \&quot;NEBULADEV\&quot;,           \&quot;schema\&quot;: \&quot;INFORMATION_SCHEMA\&quot;,           \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,           \&quot;column\&quot;: \&quot;ROLE_NAME\&quot;         }       ]     }   ],   \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60;  - To fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the &#x60;configuration&#x60; string as &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a specific table, specify the table, for example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;. - To query connections by &#x60;authentication_type&#x60;, specify &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60; are:   - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - &#x60;OAUTH&#x60;: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - &#x60;EXTOAUTH&#x60;: For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth).   - &#x60;KEY_PAIR&#x60;: For connections that require Key Pair account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - &#x60;OAUTH_WITH_PKCE&#x60;: For connections that require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo  connections only.   - &#x60;EXTOAUTH_WITH_PKCE&#x60;: For connections that require External OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - &#x60;OAUTH_WITH_PEZ&#x60;: For connections that require OAuth With PEZ account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Amazon Redshift connections only.   - &#x60;OAUTH_WITH_SERVICE_PRINCIPAL&#x60;: For connections that require OAuth With Service Principal account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - &#x60;PERSONAL_ACCESS_TOKEN&#x60;: For connections that require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - &#x60;OAUTH_CLIENT_CREDENTIALS&#x60;: For connections that require OAuth Client Credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only. - To include more details about connection objects in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than &#x60;data_warehouse_types&#x60; or &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchConnectionRequest** | [**SearchConnectionRequest**](SearchConnectionRequest.md)

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

<a id="searchCustomActions"></a>
# **searchCustomActions**
> List&lt;ResponseCustomAction&gt; searchCustomActions(searchCustomActionsRequest)



  Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchCustomActionsRequest** | [**SearchCustomActionsRequest**](SearchCustomActionsRequest.md)

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

<a id="searchData"></a>
# **searchData**
> SearchDataResponse searchData(searchDataRequest)



  Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the &#x60;CAN_DOWNLOAD_DETAILED_DATA&#x60; (**Can download detailed data**) privilege is also required.  #### Usage guidelines  To search data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the &#x60;query_string&#x60; attribute in the API request as shown in the following example:  &#x60;&#x60;&#x60; {   \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,   \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, } &#x60;&#x60;&#x60;  For more information about the &#x60;query_string&#x60; format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchDataRequest** | [**SearchDataRequest**](SearchDataRequest.md)

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

<a id="searchEmailCustomization"></a>
# **searchEmailCustomization**
> List&lt;CreateEmailCustomizationResponse&gt; searchEmailCustomization(searchEmailCustomizationRequest)



 Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchEmailCustomizationRequest** | [**SearchEmailCustomizationRequest**](SearchEmailCustomizationRequest.md)

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

<a id="searchMetadata"></a>
# **searchMetadata**
> List&lt;MetadataSearchResponse&gt; searchMetadata(searchMetadataRequest)



  Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the &#x60;type&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60;. - To filter metadata objects within type &#x60;LOGICAL_TABLE&#x60;, set the &#x60;subtypes&#x60; attribute. For example, to fetch a Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60; &amp; subtypes as &#x60;[WORKSHEET]&#x60;. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like &#x60;include_auto_created_objects&#x60;, &#x60;include_dependent_objects&#x60;, &#x60;include_headers&#x60;, &#x60;include_incomplete_objects&#x60;, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use &#x60;include_discoverable_objects&#x60; as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the &#x60;liveboard_response_format&#x60; as V2. Default value is V1. - To retrieve only objects that are published, set the &#x60;include_only_published_objects&#x60; as true. Default value is false.  **NOTE**: The following parameters support pagination of metadata records:  - &#x60;tag_identifiers&#x60; - &#x60;type&#x60; - &#x60;subtypes&#x60; - &#x60;created_by_user_identifiers&#x60; - &#x60;modified_by_user_identifiers&#x60; - &#x60;owned_by_user_identifiers&#x60; - &#x60;exclude_objects&#x60; - &#x60;include_auto_created_objects&#x60; - &#x60;favorite_object_options&#x60; - &#x60;include_only_published_objects&#x60; If you are using other parameters to search metadata, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchMetadataRequest** | [**SearchMetadataRequest**](SearchMetadataRequest.md)

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

<a id="searchOrgs"></a>
# **searchOrgs**
> List&lt;OrgResponse&gt; searchOrgs(searchOrgsRequest)



  Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchOrgsRequest** | [**SearchOrgsRequest**](SearchOrgsRequest.md)

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

<a id="searchRoles"></a>
# **searchRoles**
> List&lt;SearchRoleResponse&gt; searchRoles(searchRolesRequest)



  Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchRolesRequest** | [**SearchRolesRequest**](SearchRolesRequest.md)

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

<a id="searchSchedules"></a>
# **searchSchedules**
> List&lt;ResponseSchedule&gt; searchSchedules(searchSchedulesRequest)



 Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than &#x60;metadata&#x60;, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for accurate results.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchSchedulesRequest** | [**SearchSchedulesRequest**](SearchSchedulesRequest.md)

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

<a id="searchSecuritySettings"></a>
# **searchSecuritySettings**
> SecuritySettingsResponse searchSecuritySettings(searchSecuritySettingsRequest)



  Version: 26.2.0.cl or later   Fetch security settings for your ThoughtSpot application instance. - Use &#x60;scope: CLUSTER&#x60; to retrieve cluster-level security settings, including CORS and CSP allowlists, SAML redirect URLs, and settings that control access to non-embedded pages. - Use &#x60;scope: ORG&#x60; to retrieve Org-level security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this returns CORS and non-embed access settings specific to the Org. - If &#x60;scope&#x60; is not specified, returns both cluster and Org-specific settings based on user privileges.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchSecuritySettingsRequest** | [**SearchSecuritySettingsRequest**](SearchSecuritySettingsRequest.md)

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

<a id="searchStyleCustomizations"></a>
# **searchStyleCustomizations**
> List&lt;StylePreference&gt; searchStyleCustomizations(searchStyleCustomizationsRequest)



  Version: 26.7.0.cl or later   Retrieves style preferences at cluster level or for the authenticated user&#39;s org. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to retrieve cluster-level style defaults. - Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to retrieve preferences for the authenticated user&#39;s org. - Each field in the response includes an &#x60;is_overridden&#x60; flag indicating whether the value was explicitly set at the requested scope or inherited from a parent scope (cluster or system default).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchStyleCustomizationsRequest** | [**SearchStyleCustomizationsRequest**](SearchStyleCustomizationsRequest.md)

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

<a id="searchStyleFonts"></a>
# **searchStyleFonts**
> List&lt;StyleFontRecord&gt; searchStyleFonts(searchStyleFontsRequest)



  Version: 26.7.0.cl or later   Returns custom fonts from the cluster-level or org-level font library. Omitting all filter fields returns all fonts in the target scope.  When &#x60;include_font_assignments&#x60; is &#x60;true&#x60;, the response includes only the visualization areas explicitly assigned to each font. For cluster-scoped fonts, &#x60;org&#x60; is returned as &#x60;null&#x60;.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to search the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to search the authenticated user&#39;s org library. - Use &#x60;font_identifier&#x60; to look up a specific font by UUID or name. - Use &#x60;name_pattern&#x60; for partial, case-insensitive name matching. - Set &#x60;include_font_assignments&#x60; to &#x60;true&#x60; to include visualization areas this font is currently assigned to. Defaults to &#x60;false&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchStyleFontsRequest** | [**SearchStyleFontsRequest**](SearchStyleFontsRequest.md)

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

<a id="searchTags"></a>
# **searchTags**
> List&lt;Tag&gt; searchTags(searchTagsRequest)



  Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchTagsRequest** | [**SearchTagsRequest**](SearchTagsRequest.md)

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

<a id="searchUserGroups"></a>
# **searchUserGroups**
> List&lt;UserGroupResponse&gt; searchUserGroups(searchUserGroupsRequest)



  Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchUserGroupsRequest** | [**SearchUserGroupsRequest**](SearchUserGroupsRequest.md)

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

<a id="searchUsers"></a>
# **searchUsers**
> List&lt;User&gt; searchUsers(searchUsersRequest)



  Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60; parameter. To search across all available users, set &#x60;record_size&#x60; to &#x60;-1&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchUsersRequest** | [**SearchUsersRequest**](SearchUsersRequest.md)

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

<a id="searchVariables"></a>
# **searchVariables**
> List&lt;Variable&gt; searchVariables(searchVariablesRequest)



 Search variables    Version: 26.4.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values  The values can be filtered by scope: * org_identifier * principal_identifier * model_identifier      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchVariablesRequest** | [**SearchVariablesRequest**](SearchVariablesRequest.md)

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

<a id="searchWebhookConfigurations"></a>
# **searchWebhookConfigurations**
> WebhookSearchResponse searchWebhookConfigurations(searchWebhookConfigurationsRequest)



  Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **searchWebhookConfigurationsRequest** | [**SearchWebhookConfigurationsRequest**](SearchWebhookConfigurationsRequest.md)

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

<a id="sendAgentConversationMessage"></a>
# **sendAgentConversationMessage**
> Object sendAgentConversationMessage(conversationIdentifier, sendAgentConversationMessageRequest)



  Version: 26.5.0.cl or later   Sends natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - &#x60;type&#x60;: the kind of response — &#x60;text&#x60;, &#x60;answer&#x60;, or &#x60;error&#x60; - &#x60;message&#x60;: the main content of the response - &#x60;metadata&#x60;: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - For real-time streamed responses, use &#x60;sendAgentConversationMessageStreaming&#x60; instead.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendAgentConversationMessageRequest** | [**SendAgentConversationMessageRequest**](SendAgentConversationMessageRequest.md)

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

<a id="sendAgentConversationMessageStreaming"></a>
# **sendAgentConversationMessageStreaming**
> SendAgentMessageResponse sendAgentConversationMessageStreaming(conversationIdentifier, sendAgentConversationMessageStreamingRequest)



  Version: 26.5.0.cl or later   Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form &#x60;data: [{\&quot;type\&quot;: \&quot;...\&quot;, ...}]&#x60; — a JSON array of event objects. Event types include:  - &#x60;ack&#x60;: confirms receipt of the request (&#x60;node_id&#x60;) - &#x60;conv_title&#x60;: conversation title (&#x60;title&#x60;, &#x60;conv_id&#x60;) - &#x60;notification&#x60;: status updates on operations (&#x60;group_id&#x60;, &#x60;metadata&#x60;, &#x60;code&#x60; — e.g. &#x60;TOOL_CALL_NOTIFICATION&#x60;, &#x60;nls_start&#x60;, &#x60;FINAL_RESPONSE_NOTIFICATION&#x60;) - &#x60;text-chunk&#x60;: incremental content chunks (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;format&#x60; and &#x60;type&#x60; such as &#x60;thinking&#x60; or &#x60;text&#x60;, &#x60;content&#x60;) - &#x60;text&#x60;: full text block with same structure as &#x60;text-chunk&#x60; - &#x60;answer&#x60;: structured answer with metadata (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;sage_query&#x60;, &#x60;session_id&#x60;, &#x60;title&#x60;, etc., &#x60;title&#x60;) - &#x60;error&#x60;: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | | ---- | -------------------------------------------------------------------------------------------------------------------------------- | | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is Generally Available from version 26.5.0.cl. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - The streaming protocol uses Server-Sent Events (SSE). &gt; - For the complete response in a single payload, use &#x60;sendAgentConversationMessage&#x60; instead.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendAgentConversationMessageStreamingRequest** | [**SendAgentConversationMessageStreamingRequest**](SendAgentConversationMessageStreamingRequest.md)

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

<a id="sendAgentMessage"></a>
# **sendAgentMessage**
> Object sendAgentMessage(conversationIdentifier, sendAgentMessageRequest)



 Version: 26.2.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessage&#x60; instead.  Send natural language messages to an existing Spotter agent conversation and returns the complete response synchronously.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  The API returns an array of response objects, each containing:  - &#x60;type&#x60;: the kind of response — &#x60;text&#x60;, &#x60;answer&#x60;, or &#x60;error&#x60; - &#x60;message&#x60;: the main content of the response - &#x60;metadata&#x60;: additional information depending on the message type (e.g., answer metadata includes analytics and visualization details)  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated. Use &#x60;sendAgentConversationMessage&#x60; for new integrations. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendAgentMessageRequest** | [**SendAgentMessageRequest**](SendAgentMessageRequest.md)

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

<a id="sendAgentMessageStreaming"></a>
# **sendAgentMessageStreaming**
> SendAgentMessageResponse sendAgentMessageStreaming(sendAgentMessageStreamingRequest)



 Version: 26.2.0.cl or later   **Deprecated** — Use &#x60;sendAgentConversationMessageStreaming&#x60; instead.  Sends one or more natural language messages to an existing Spotter agent conversation and returns the response as a real-time Server-Sent Events stream.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the metadata object associated with the conversation. The user must have access to the conversation session referenced by &#x60;conversation_identifier&#x60;. A conversation must first be created using the &#x60;createAgentConversation&#x60; API.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createAgentConversation&#x60;, used for context continuity and message tracking - &#x60;messages&#x60;: an array of one or more text messages to send to the agent  If the request is valid, the API returns a Server-Sent Events (SSE) stream. Each line has the form &#x60;data: [{\&quot;type\&quot;: \&quot;...\&quot;, ...}]&#x60; — a JSON array of event objects. Event types include:  - &#x60;ack&#x60;: confirms receipt of the request (&#x60;node_id&#x60;) - &#x60;conv_title&#x60;: conversation title (&#x60;title&#x60;, &#x60;conv_id&#x60;) - &#x60;notification&#x60;: status updates on operations (&#x60;group_id&#x60;, &#x60;metadata&#x60;, &#x60;code&#x60; — e.g. &#x60;TOOL_CALL_NOTIFICATION&#x60;, &#x60;nls_start&#x60;, &#x60;FINAL_RESPONSE_NOTIFICATION&#x60;) - &#x60;text-chunk&#x60;: incremental content chunks (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;format&#x60; and &#x60;type&#x60; such as &#x60;thinking&#x60; or &#x60;text&#x60;, &#x60;content&#x60;) - &#x60;text&#x60;: full text block with same structure as &#x60;text-chunk&#x60; - &#x60;answer&#x60;: structured answer with metadata (&#x60;id&#x60;, &#x60;group_id&#x60;, &#x60;metadata&#x60; with &#x60;sage_query&#x60;, &#x60;session_id&#x60;, &#x60;title&#x60;, etc., &#x60;title&#x60;) - &#x60;error&#x60;: if a failure occurs  #### Error responses  | Code | Description                                                                                                                      | |------|----------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                             | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks permission on the referenced conversation. |  &gt; ###### Note: &gt; &gt; - This endpoint is deprecated. Use &#x60;sendAgentConversationMessageStreaming&#x60; for new integrations. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. &gt; - The streaming protocol uses Server-Sent Events (SSE).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **sendAgentMessageStreamingRequest** | [**SendAgentMessageStreamingRequest**](SendAgentMessageStreamingRequest.md)

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

<a id="sendMessage"></a>
# **sendMessage**
> List&lt;ResponseMessage&gt; sendMessage(conversationIdentifier, sendMessageRequest)



 Version: 10.4.0.cl or later   Sends a follow-up message to an existing conversation within the context of a data model.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request. A conversation must first be created using the &#x60;createConversation&#x60; API.  #### Usage guidelines  The request must include: - &#x60;conversation_identifier&#x60;: the unique session ID returned by &#x60;createConversation&#x60; - &#x60;metadata_identifier&#x60;: the unique ID of the data source used for the conversation - &#x60;message&#x60;: a natural language string with the follow-up question  If the request is successful, the API returns an array of response messages, each containing: - &#x60;session_identifier&#x60;: the unique ID of the generated response - &#x60;generation_number&#x60;: the generation number of the response - &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) - &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;, &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; / &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **sendMessageRequest** | [**SendMessageRequest**](SendMessageRequest.md)

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

<a id="setAgentInstructions"></a>
# **setAgentInstructions**
> AgentInstructions setAgentInstructions(setAgentInstructionsRequest)



 Version: 26.6.0.cl or later   Creates or updates the admin instructions for the AI agent (Spotter). Admin instructions are tenant- and org-scoped text that guide agent behavior across all conversations. If instructions already exist for the org, they are replaced (upsert semantics).  Requires admin privileges. Only users with org admin access can set agent instructions.  #### Usage guidelines  The request must include:  - &#x60;instructions&#x60;: the instructions text to apply to the agent (maximum 5000 characters)  Instructions are validated against system guardrails before being saved. If the instructions contain content that conflicts with guardrails, the request is rejected with a &#x60;409&#x60; error and the existing instructions remain unchanged.  If the request is successful, the response includes the saved &#x60;AgentInstructions&#x60; record:  - &#x60;id&#x60;: unique identifier of the record - &#x60;instructions&#x60;: the saved instructions text - &#x60;created_at&#x60;: ISO timestamp when the instructions were first created - &#x60;updated_at&#x60;: ISO timestamp of this update - &#x60;last_updated_by&#x60;: user ID of the admin who performed this update  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad request — the request body is missing required fields or the &#x60;instructions&#x60; field exceeds the maximum allowed length of 5000 characters. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have org admin privileges required to set agent instructions. | | 409  | Conflict — the provided instructions conflict with system guardrails. Review and revise the instructions text before retrying. | | 500  | Internal server error. |  &gt; ###### Note: &gt; &gt; - This operation uses upsert semantics: it creates the instructions record if none exists, or replaces the existing one. &gt; - Instructions take effect immediately for new conversations created after the update. &gt; - Use &#x60;getAgentInstructions&#x60; to retrieve the current instructions before making changes. &gt; - Available from version 26.6.0.cl and later.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **setAgentInstructionsRequest** | [**SetAgentInstructionsRequest**](SetAgentInstructionsRequest.md)

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

<a id="setNLInstructions"></a>
# **setNLInstructions**
> EurekaSetNLInstructionsResponse setNLInstructions(setNLInstructionsRequest)



 Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege, either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and a bearer token corresponding to the org where the data model exists.  #### Usage guidelines  To set NL instructions for a data-model, the request must include:  - &#x60;data_source_identifier&#x60;: The unique ID of the data-model for which to set NL instructions - &#x60;nl_instructions_info&#x60;: An array of instruction objects, each containing:   - &#x60;instructions&#x60;: Array of text instructions for the LLM   - &#x60;scope&#x60;: The scope of the instruction (&#x60;GLOBAL&#x60;). Currently only &#x60;GLOBAL&#x60; is supported. It can be extended to data-model-user scope in future.  #### Instructions scope  - **GLOBAL**: instructions that apply to all users querying this data model  If the request is successful, the API returns:  - &#x60;success&#x60;: a boolean indicating whether the operation completed successfully  #### Error responses  | Code | Description                                                                                                                                                                                                                        | |------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                                                                                                               | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege, lacks edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, or the bearer token does not correspond to the org where the data model exists. |  &gt; ###### Note: &gt; &gt; - To use this API, the user needs either edit access or &#x60;SPOTTER_COACHING_PRIVILEGE&#x60; on the data model, and must use the bearer token corresponding to the org where the data model exists. &gt; - This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; - Available from version 10.15.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **setNLInstructionsRequest** | [**SetNLInstructionsRequest**](SetNLInstructionsRequest.md)

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

<a id="shareMetadata"></a>
# **shareMetadata**
> shareMetadata(shareMetadataRequest)



  Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  #### Supported metadata objects: * Liveboards * Visualizations * Answers * Models * Views * Connections * Collections  #### Object permissions  You can provide &#x60;READ_ONLY&#x60; or &#x60;MODIFY&#x60; access when sharing an object with another user or group. The &#x60;READ_ONLY&#x60; permission grants view access to the shared object, whereas &#x60;MODIFY&#x60; provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to &#x60;NO_ACCESS&#x60;.  #### Sharing a visualization  * Sharing a visualization implicitly shares the entire Liveboard with the recipient. * Object permissions set for a shared visualization also apply to the Liveboard unless overridden by another API request or via UI. * If email notifications for object sharing are enabled, a notification with a link to the shared visualization will be sent to the recipient’s email address. Although this link opens the shared visualization, recipients can also access other visualizations in the Liveboard.  #### Sharing a collection  Collections support **dual permissions** that provide fine-grained control:  * **Collection permissions** (&#x60;share_mode&#x60;) - controls access to the collection itself (view, edit, delete the collection) * **Content permissions** (&#x60;content_share_mode&#x60;) - controls access to objects within the collection (view, edit objects inside)  **Default Behavior:** - If only &#x60;share_mode&#x60; is specified, the content permissions default to &#x60;READ_ONLY&#x60; (except when &#x60;share_mode&#x60; is &#x60;NO_ACCESS&#x60;, then content also gets &#x60;NO_ACCESS&#x60;) - To give users edit access to collection contents, explicitly set &#x60;content_share_mode: \&quot;MODIFY\&quot;&#x60;  ## Examples  The following JSON examples can be copy-pasted as request bodies for the REST v2 API endpoint:  &#x60;&#x60;&#x60;bash POST /callosum/v1/v2/security/metadata/share Content-Type: application/x-www-form-urlencoded &#x60;&#x60;&#x60;  ### Basic collection sharing Share a collection with read-only access:  &#x60;&#x60;&#x60;json {   \&quot;metadata_type\&quot;: \&quot;COLLECTION\&quot;,   \&quot;metadata_identifiers\&quot;: [\&quot;Sales Reports Collection\&quot;],   \&quot;permissions\&quot;: [{     \&quot;principal\&quot;: {       \&quot;type\&quot;: \&quot;USER\&quot;,       \&quot;identifier\&quot;: \&quot;alice@company.com\&quot;     },     \&quot;share_mode\&quot;: \&quot;READ_ONLY\&quot;   }],   \&quot;notification\&quot;: {     \&quot;message\&quot;: \&quot;I&#39;ve shared the Sales Reports collection with you\&quot;,     \&quot;notify_on_share\&quot;: true   } } &#x60;&#x60;&#x60;  ### Collection sharing with dual permissions Share a collection with different permissions for the collection vs. its contents:  &#x60;&#x60;&#x60;json {   \&quot;metadata_type\&quot;: \&quot;COLLECTION\&quot;,   \&quot;metadata_identifiers\&quot;: [\&quot;Marketing Analytics\&quot;],   \&quot;permissions\&quot;: [{     \&quot;principal\&quot;: {       \&quot;type\&quot;: \&quot;USER\&quot;,       \&quot;identifier\&quot;: \&quot;bob@company.com\&quot;     },     \&quot;share_mode\&quot;: \&quot;MODIFY\&quot;,     \&quot;content_share_mode\&quot;: \&quot;READ_ONLY\&quot;   }, {     \&quot;principal\&quot;: {       \&quot;type\&quot;: \&quot;USER_GROUP\&quot;,       \&quot;identifier\&quot;: \&quot;Marketing Team\&quot;     },     \&quot;share_mode\&quot;: \&quot;READ_ONLY\&quot;,     \&quot;content_share_mode\&quot;: \&quot;READ_ONLY\&quot;   }],   \&quot;notification\&quot;: {     \&quot;emails\&quot;: [\&quot;bob@company.com\&quot;],     \&quot;message\&quot;: \&quot;You can edit the collection but content is read-only\&quot;,     \&quot;enable_custom_url\&quot;: false,     \&quot;notify_on_share\&quot;: true   },   \&quot;has_lenient_discoverability\&quot;: false } &#x60;&#x60;&#x60;  ### Multiple collections sharing Share multiple collections with different users:  &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;type\&quot;: \&quot;COLLECTION\&quot;,       \&quot;identifier\&quot;: \&quot;Q4 Reports\&quot;     },     {       \&quot;type\&quot;: \&quot;COLLECTION\&quot;,       \&quot;identifier\&quot;: \&quot;Executive Dashboard Collection\&quot;     }   ],   \&quot;permissions\&quot;: [{     \&quot;principal\&quot;: {       \&quot;type\&quot;: \&quot;USER_GROUP\&quot;,       \&quot;identifier\&quot;: \&quot;Executives\&quot;     },     \&quot;share_mode\&quot;: \&quot;MODIFY\&quot;   }, {     \&quot;principal\&quot;: {       \&quot;type\&quot;: \&quot;USER\&quot;,       \&quot;identifier\&quot;: \&quot;manager@company.com\&quot;     },     \&quot;share_mode\&quot;: \&quot;READ_ONLY\&quot;,     \&quot;content_share_mode\&quot;: \&quot;MODIFY\&quot;   }],   \&quot;notification\&quot;: {     \&quot;message\&quot;: \&quot;Sharing quarterly collections with leadership team\&quot;,     \&quot;notify_on_share\&quot;: true   } } &#x60;&#x60;&#x60;  ### Remove collection access Remove access to a collection by setting share_mode to NO_ACCESS:  &#x60;&#x60;&#x60;json {   \&quot;metadata_type\&quot;: \&quot;COLLECTION\&quot;,   \&quot;metadata_identifiers\&quot;: [\&quot;Confidential Reports\&quot;],   \&quot;permissions\&quot;: [{     \&quot;principal\&quot;: {       \&quot;type\&quot;: \&quot;USER\&quot;,       \&quot;identifier\&quot;: \&quot;former-employee@company.com\&quot;     },     \&quot;share_mode\&quot;: \&quot;NO_ACCESS\&quot;   }],   \&quot;notification\&quot;: {     \&quot;notify_on_share\&quot;: false   } } &#x60;&#x60;&#x60;  ### Collection Permission Scenarios  **Scenario 1: Collection Admin** - &#x60;share_mode: MODIFY&#x60; + &#x60;content_share_mode: MODIFY&#x60; &#x3D; Full control over collection and its contents  **Scenario 2: Collection Curator** - &#x60;share_mode: MODIFY&#x60; + &#x60;content_share_mode: READ_ONLY&#x60; &#x3D; Can manage collection structure but not edit contents  **Scenario 3: Content Editor** - &#x60;share_mode: READ_ONLY&#x60; + &#x60;content_share_mode: MODIFY&#x60; &#x3D; Can edit objects within collection but can&#39;t change collection itself  **Scenario 4: Viewer** - &#x60;share_mode: READ_ONLY&#x60; + &#x60;content_share_mode: READ_ONLY&#x60; &#x3D; View-only access to collection and contents      

### Parameters

| Name | Type |
|------------- | ------------- |
| **shareMetadataRequest** | [**ShareMetadataRequest**](ShareMetadataRequest.md)

### Return type

null (empty response body)

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

<a id="singleAnswer"></a>
# **singleAnswer**
> ResponseMessage singleAnswer(singleAnswerRequest)



 Version: 10.4.0.cl or later   Processes a natural language query against a specified data model and returns a single AI-generated answer without requiring a conversation session.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and at least view access to the metadata object specified in the request.  #### Usage guidelines  The request must include: - &#x60;query&#x60;: a natural language question (e.g., \&quot;What were total sales last quarter?\&quot;) - &#x60;metadata_identifier&#x60;: the unique ID of the data source to query against  If the request is successful, the API returns a response message containing: - &#x60;session_identifier&#x60;: the unique ID of the generated response - &#x60;generation_number&#x60;: the generation number of the response - &#x60;message_type&#x60;: the type of the response (e.g., &#x60;TSAnswer&#x60;) - &#x60;visualization_type&#x60;: the generated visualization type (&#x60;Chart&#x60;, &#x60;Table&#x60;, or &#x60;Undefined&#x60;) - &#x60;tokens&#x60; / &#x60;display_tokens&#x60;: the search tokens and user-friendly display tokens for the response  #### Error responses  | Code | Description                                                                                                                             | |------|-----------------------------------------------------------------------------------------------------------------------------------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid.                                                                    | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks view permission on the specified metadata object. |  &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **singleAnswerRequest** | [**SingleAnswerRequest**](SingleAnswerRequest.md)

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

<a id="stopConversation"></a>
# **stopConversation**
> stopConversation(conversationIdentifier)



 Stops an in-progress agent conversation response.    Version: 26.6.0.cl or later   &lt;span&gt;Version: 26.6.0.cl or later   Stops an in-progress agent response for the specified conversation. Use this endpoint to cancel a response that is actively being generated — for example, when the user navigates away, reformulates their question, or no longer needs the current result.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and access to the specified conversation.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation whose active response should be stopped, as returned by &#x60;createAgentConversation&#x60;  A successful request returns an empty &#x60;204 No Content&#x60; response. If there is no active response in progress at the time of the call, the request is still treated as successful.  After stopping a response, the conversation session remains active. You can continue sending messages using &#x60;sendAgentConversationMessage&#x60; or &#x60;sendAgentConversationMessageStreaming&#x60;.  #### Example request  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversation/{conversation_identifier}/stop-response &#x60;&#x60;&#x60;  #### Typical usage scenario  This endpoint is useful when integrating Spotter into a chat UI where users can cancel a long-running query. For example:  1. User sends a message via &#x60;sendAgentConversationMessageStreaming&#x60;. 2. User clicks a \&quot;Stop generating\&quot; button while the response is streaming. 3. Your client calls &#x60;stopConversation&#x60; with the active &#x60;conversation_identifier&#x60;. 4. The stream is terminated and the user can ask a new question.  #### Error responses  | Code | Description | |------|-------------| | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or lacks access to the specified conversation. |  &gt; ###### Note: &gt; &gt; - Calling this endpoint when no response is in progress does not return an error. &gt; - The conversation context is preserved after stopping — previous messages and answers remain accessible. &gt; - Available from version 26.6.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. &gt; - This feature is available only for **Spotter 3** (&#x60;SPOTTER3&#x60;) version.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**

### Return type

null (empty response body)

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

<a id="syncMetadata"></a>
# **syncMetadata**
> SyncMetadataResponse syncMetadata(connectionIdentifier, syncMetadataRequest)



  Version: 26.5.0.cl or later   Synchronizes connection metadata attributes from your Cloud Data Warehouse (CDW) with ThoughtSpot.  Requires the  &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege is required.  #### Usage guidelines  To synchronize attributes from a CDW, specify the connection GUID or name in the &#x60;connection_identifier&#x60; path parameter and  &#x60;sync_attributes&#x60; in the request body. Default attribute is &#x60;[\&quot;DESCRIPTION\&quot;]&#x60;.  ##### Hierarchical schema  * Connection: The connection object for the sync operation. * Tables: Tables for the sync operation. When no table is specified, all tables are synchronized. * Columns: If the table is specified, you can add the columns for the sync operation. If no columns are specified, all columns in the specified table are considered for the sync operation.  To set the scope for the sync operation:  * Connection-level: To sync all tables and columns, pass an empty request body, or only the attributes in the request body. * Table-level: To synchronize specific tables and their columns, specify the table identifiers in the &#x60;tables&#x60; array. * Column-level: To synchronize specific columns, specify the table identifier as the key and column identifiers as the value in the &#x60;tables&#x60; array.  &#x60;&#x60;&#x60; {   \&quot;tables\&quot;: [     {\&quot;table-guid-1\&quot;: [\&quot;column-guid-1\&quot;, \&quot;column-guid-2\&quot;]},     \&quot;table-guid-2\&quot;   ],   \&quot;sync_attributes\&quot;: [\&quot;DESCRIPTION\&quot;] } &#x60;&#x60;&#x60;  ##### API response  If the sync operation is successful, the API returns the following information:  * Status of the sync operation. For example, &#x60;SUCCESS&#x60;, &#x60;PARTIAL_SUCCESS&#x60;, or &#x60;NO_UPDATE&#x60;. * Number of tables and columns that were updated. * Number of tables and columns with the sync failed status when the overall sync status is &#x60;PARTIAL_SUCCESS&#x60;. * Message text indicating the sync results.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**
| **syncMetadataRequest** | [**SyncMetadataRequest**](SyncMetadataRequest.md)

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

<a id="unassignTag"></a>
# **unassignTag**
> unassignTag(unassignTagRequest)



  Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **unassignTagRequest** | [**UnassignTagRequest**](UnassignTagRequest.md)

### Return type

null (empty response body)

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

<a id="unparameterizeMetadata"></a>
# **unparameterizeMetadata**
> unparameterizeMetadata(unparameterizeMetadataRequest)



 Remove parameterization from fields in metadata objects.    Version: 26.5.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always &#x60;CONNECTION_PROPERTY&#x60;. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be unparameterized.  For Connection Config, the only supported field name is: * impersonate_user      

### Parameters

| Name | Type |
|------------- | ------------- |
| **unparameterizeMetadataRequest** | [**UnparameterizeMetadataRequest**](UnparameterizeMetadataRequest.md)

### Return type

null (empty response body)

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

<a id="unpublishMetadata"></a>
# **unpublishMetadata**
> unpublishMetadata(unpublishMetadataRequest)



  Version: 26.5.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting &#x60;force&#x60; to true - this will break all dependent objects in the unpublished organizations      

### Parameters

| Name | Type |
|------------- | ------------- |
| **unpublishMetadataRequest** | [**UnpublishMetadataRequest**](UnpublishMetadataRequest.md)

### Return type

null (empty response body)

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

<a id="updateCalendar"></a>
# **updateCalendar**
> updateCalendar(calendarIdentifier, updateCalendarRequest)



  Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * &#x60;FROM_INPUT_PARAMS&#x60; to update the calendar properties with the values defined in the API request. * &#x60;FROM_EXISTING_TABLE&#x60; Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60; attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is not.   Similarly, connectors such as ClickHouse require you to specify the &#x60;database_name&#x60; and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  &#x60;&#x60;&#x60; {   \&quot;update_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;,     \&quot;database_name\&quot;: \&quot;db1\&quot;,     \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,     \&quot;schame_name\&quot;: \&quot;schemaVar\&quot;   } } &#x60;&#x60;&#x60;  Update a custom calendar with the attributes defined in the API request:  &#x60;&#x60;&#x60; {   \&quot;update_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;,   \&quot;table_reference\&quot;: {     \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;,     \&quot;database_name\&quot;: \&quot;db1\&quot;,     \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,     \&quot;schame_name\&quot;: \&quot;schemaVar\&quot;   },   \&quot;month_offset\&quot;: \&quot;August\&quot;,   \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,   \&quot;start_date\&quot;: \&quot;08/01/2025\&quot;,   \&quot;end_date\&quot;: \&quot;07/31/2026\&quot; } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **calendarIdentifier** | **String**
| **updateCalendarRequest** | [**UpdateCalendarRequest**](UpdateCalendarRequest.md)

### Return type

null (empty response body)

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

<a id="updateCollection"></a>
# **updateCollection**
> updateCollection(collectionIdentifier, updateCollectionRequest)



  Version: 26.4.0.cl or later   Updates an existing collection in ThoughtSpot.  #### Supported operations  This API endpoint lets you perform the following operations:  * Update collection name and description * Change visibility settings * Add metadata objects to the collection (operation: ADD) * Remove metadata objects from the collection (operation: REMOVE) * Replace all metadata objects in the collection (operation: REPLACE)  #### Operation types  * **ADD**: Adds the specified metadata objects to the existing collection without removing current items * **REMOVE**: Removes only the specified metadata objects from the collection * **REPLACE**: Replaces all existing metadata objects with the specified items (default behavior)      

### Parameters

| Name | Type |
|------------- | ------------- |
| **collectionIdentifier** | **String**
| **updateCollectionRequest** | [**UpdateCollectionRequest**](UpdateCollectionRequest.md)

### Return type

null (empty response body)

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

<a id="updateColumnSecurityRules"></a>
# **updateColumnSecurityRules**
> updateColumnSecurityRules(updateColumnSecurityRulesRequest)



 Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \&quot;all or none\&quot; policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - Use &#x60;clear_csr: true&#x60; to remove all column security rules from the table - For each column, specify the security rule using &#x60;column_security_rules&#x60; array - Use &#x60;is_unsecured: true&#x60; to mark a specific column as unprotected - Use &#x60;group_access&#x60; operations to manage group associations:   - &#x60;ADD&#x60;: Add groups to the column&#39;s access list   - &#x60;REMOVE&#x60;: Remove groups from the column&#39;s access list   - &#x60;REPLACE&#x60;: Replace all existing groups with the specified groups  #### Required permissions  - &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data (if RBAC is disabled) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  &#x60;&#x60;&#x60;json {   \&quot;identifier\&quot;: \&quot;table-guid\&quot;,   \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;,   \&quot;clear_csr\&quot;: false,   \&quot;column_security_rules\&quot;: [     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: false,       \&quot;group_access\&quot;: [         {           \&quot;operation\&quot;: \&quot;ADD\&quot;,           \&quot;group_identifiers\&quot;: [\&quot;hr_group_id\&quot;, \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;]         }       ]     },     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: true     },     {       \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,       \&quot;is_unsecured\&quot;: false,       \&quot;group_access\&quot;: [         {           \&quot;operation\&quot;: \&quot;REPLACE\&quot;,           \&quot;group_identifiers\&quot;: [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;]         }       ]     }   ] } &#x60;&#x60;&#x60;  #### Request Body Schema  - &#x60;identifier&#x60; (string, optional): GUID or name of the table for which we want to create column security rules - &#x60;obj_identifier&#x60; (string, optional): The object ID of the table - &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - &#x60;column_security_rules&#x60; (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) - &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - &#x60;group_access&#x60; (array of objects, optional): Array of group operation objects  Each group operation object contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column&#39;s access list - **REMOVE**: Removes the specified groups from the column&#39;s access list   - **REPLACE**: Replaces all existing groups with the specified groups      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateColumnSecurityRulesRequest** | [**UpdateColumnSecurityRulesRequest**](UpdateColumnSecurityRulesRequest.md)

### Return type

null (empty response body)

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

<a id="updateConfig"></a>
# **updateConfig**
> RepoConfigObject updateConfig(updateConfigRequest)



  Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**) privilege.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateConfigRequest** | [**UpdateConfigRequest**](UpdateConfigRequest.md)

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

<a id="updateConnection"></a>
# **updateConnection**
> updateConnection(updateConnectionRequest)



  Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateConnectionRequest** | [**UpdateConnectionRequest**](UpdateConnectionRequest.md)

### Return type

null (empty response body)

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

<a id="updateConnectionConfiguration"></a>
# **updateConnectionConfiguration**
> updateConnectionConfiguration(configurationIdentifier, updateConnectionConfigurationRequest)



  Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the &#x60;policy_type&#x60;  * Edit the type of authentication  * Enable or disable a configuration  #### Parameterized Connection Support For parameterized oauth based connections, only the &#x60;same_as_parent&#x60; and &#x60;policy_process_options&#x60; attributes are allowed. These attributes are not applicable to connections that are not parameterized.   **NOTE**: When updating a configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **configurationIdentifier** | **String**
| **updateConnectionConfigurationRequest** | [**UpdateConnectionConfigurationRequest**](UpdateConnectionConfigurationRequest.md)

### Return type

null (empty response body)

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

<a id="updateConnectionStatus"></a>
# **updateConnectionStatus**
> updateConnectionStatus(connectionIdentifier, updateConnectionStatusRequest)



  Version: 26.6.0.cl or later   Activates or deactivates a connection. A deactivated connection cannot be used for queries or operations until it is activated again.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required. Only the connection owner or an administrator can perform this operation.  #### Usage guidelines  To update the status of a connection, specify the connection GUID or name in the &#x60;connection_identifier&#x60; path parameter and the desired &#x60;status&#x60; in the request body.  - **ACTIVATED**: Enables the connection. Queries and operations can resume on an activated connection. - **DEACTIVATED**: Disables the connection. It does not remove the connection metadata, but only makes the connection unavailable for queries and operations. You can reactivate a deactivated connection by setting \&quot;status\&quot;: \&quot;ACTIVATED\&quot;.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**
| **updateConnectionStatusRequest** | [**UpdateConnectionStatusRequest**](UpdateConnectionStatusRequest.md)

### Return type

null (empty response body)

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

<a id="updateConnectionV2"></a>
# **updateConnectionV2**
> updateConnectionV2(connectionIdentifier, updateConnectionV2Request)



  Version: 10.4.0.cl or later   Updates a connection object.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in &#x60;data_warehouse_config&#x60;.    b. Set &#x60;validate&#x60; to &#x60;true&#x60;.        **NOTE:** If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.     * A JSON map of configuration attributes, database details, and table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:    * This is an example of updating a single table in a empty connection:           &#x60;&#x60;&#x60;       {         \&quot;authenticationType\&quot;: \&quot;SERVICE_ACCOUNT\&quot;,         \&quot;databases\&quot;: [\&quot;DB2\&quot;, \&quot;DB3\&quot;, \&quot;DEVELOPMENT\&quot;],         \&quot;externalDatabases\&quot;: [           {             \&quot;name\&quot;: \&quot;DEVELOPMENT\&quot;,             \&quot;isAutoCreated\&quot;: false,             \&quot;schemas\&quot;: [               {                 \&quot;name\&quot;: \&quot;TS_dataset\&quot;,                 \&quot;tables\&quot;: [                   {                     \&quot;name\&quot;: \&quot;DEMORENAME\&quot;,                     \&quot;type\&quot;: \&quot;TABLE\&quot;,                     \&quot;description\&quot;: \&quot;\&quot;,                     \&quot;selected\&quot;: true,                     \&quot;linked\&quot;: true,                     \&quot;gid\&quot;: 0,                     \&quot;datasetId\&quot;: \&quot;-1\&quot;,                     \&quot;subType\&quot;: \&quot;\&quot;,                     \&quot;reportId\&quot;: \&quot;\&quot;,                     \&quot;viewId\&quot;: \&quot;\&quot;,                     \&quot;columns\&quot;: [                       {                         \&quot;name\&quot;: \&quot;Col1\&quot;,                         \&quot;type\&quot;: \&quot;VARCHAR\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       },                       {                         \&quot;name\&quot;: \&quot;Col2\&quot;,                         \&quot;type\&quot;: \&quot;VARCHAR\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       },                       {                         \&quot;name\&quot;: \&quot;Col3\&quot;,                         \&quot;type\&quot;: \&quot;VARCHAR\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       },                       {                         \&quot;name\&quot;: \&quot;Col312\&quot;,                         \&quot;type\&quot;: \&quot;VARCHAR\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       },                       {                         \&quot;name\&quot;: \&quot;Col4\&quot;,                         \&quot;type\&quot;: \&quot;VARCHAR\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       }                     ],                     \&quot;relationships\&quot;: []                   }                 ]               }             ]           }         ],         \&quot;configuration\&quot;: {           \&quot;password\&quot;: \&quot;\&quot;,           \&quot;database\&quot;: \&quot;DEVELOPMENT\&quot;,           \&quot;role\&quot;: \&quot;DEV\&quot;,           \&quot;accountName\&quot;: \&quot;thoughtspot_partner\&quot;,           \&quot;warehouse\&quot;: \&quot;DEMO_WH\&quot;,           \&quot;user\&quot;: \&quot;DEV_USER\&quot;         }       }       &#x60;&#x60;&#x60;        * This is an example of updating a single table in an existing connection with tables:            &#x60;&#x60;&#x60;       {         \&quot;authenticationType\&quot;: \&quot;SERVICE_ACCOUNT\&quot;,         \&quot;databases\&quot;: [\&quot;DB2\&quot;, \&quot;DB3\&quot;, \&quot;DEVELOPMENT\&quot;],         \&quot;externalDatabases\&quot;: [           {             \&quot;name\&quot;: \&quot;DEVELOPMENT\&quot;,             \&quot;isAutoCreated\&quot;: false,             \&quot;schemas\&quot;: [               {                 \&quot;name\&quot;: \&quot;TS_dataset\&quot;,                 \&quot;tables\&quot;: [                   {                     \&quot;name\&quot;: \&quot;CUSTOMER\&quot;,                     \&quot;type\&quot;: \&quot;TABLE\&quot;,                     \&quot;description\&quot;: \&quot;\&quot;,                     \&quot;selected\&quot;: true,                     \&quot;linked\&quot;: true,                     \&quot;gid\&quot;: 0,                     \&quot;datasetId\&quot;: \&quot;-1\&quot;,                     \&quot;subType\&quot;: \&quot;\&quot;,                     \&quot;reportId\&quot;: \&quot;\&quot;,                     \&quot;viewId\&quot;: \&quot;\&quot;,                     \&quot;columns\&quot;: [],                     \&quot;relationships\&quot;: []                   },                   {                     \&quot;name\&quot;: \&quot;tpch5k_falcon_default_schema_users\&quot;,                     \&quot;type\&quot;: \&quot;TABLE\&quot;,                     \&quot;description\&quot;: \&quot;\&quot;,                     \&quot;selected\&quot;: true,                     \&quot;linked\&quot;: true,                     \&quot;gid\&quot;: 0,                     \&quot;datasetId\&quot;: \&quot;-1\&quot;,                     \&quot;subType\&quot;: \&quot;\&quot;,                     \&quot;reportId\&quot;: \&quot;\&quot;,                     \&quot;viewId\&quot;: \&quot;\&quot;,                     \&quot;columns\&quot;: [                       {                         \&quot;name\&quot;: \&quot;user_id\&quot;,                         \&quot;type\&quot;: \&quot;INT64\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       },                       {                         \&quot;name\&quot;: \&quot;product_id\&quot;,                         \&quot;type\&quot;: \&quot;INT64\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       },                       {                         \&quot;name\&quot;: \&quot;user_cost\&quot;,                         \&quot;type\&quot;: \&quot;INT64\&quot;,                         \&quot;canImport\&quot;: true,                         \&quot;selected\&quot;: true,                         \&quot;description\&quot;: \&quot;\&quot;,                         \&quot;isLinkedActive\&quot;: true,                         \&quot;isAggregate\&quot;: false                       }                     ],                     \&quot;relationships\&quot;: []                   }                 ]               }             ]           }         ],         \&quot;configuration\&quot;: {           \&quot;password\&quot;: \&quot;\&quot;,           \&quot;database\&quot;: \&quot;DEVELOPMENT\&quot;,           \&quot;role\&quot;: \&quot;DEV\&quot;,           \&quot;accountName\&quot;: \&quot;thoughtspot_partner\&quot;,           \&quot;warehouse\&quot;: \&quot;DEMO_WH\&quot;,           \&quot;user\&quot;: \&quot;DEV_USER\&quot;         }       }       &#x60;&#x60;&#x60;  3. If you are updating a configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.    **NOTE:** If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not  specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.    * A JSON map of configuration attributes in &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes for a Snowflake connection:    &#x60;&#x60;&#x60;    {       \&quot;configuration\&quot;:{          \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,          \&quot;user\&quot;:\&quot;tsadmin\&quot;,          \&quot;password\&quot;:\&quot;TestConn123\&quot;,          \&quot;role\&quot;:\&quot;sysadmin\&quot;,          \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot;       },       \&quot;databases\&quot;:[\&quot;DB1\&quot;, \&quot;DB2\&quot;],       \&quot;externalDatabases\&quot;:[        ]    }    &#x60;&#x60;&#x60;  The optional &#x60;databases&#x60; property in &#x60;data_warehouse_config&#x60; accepts a list of database names. When specified, ThoughtSpot persists this list on the connection and uses it to scope metadata fetching to only the specified databases in subsequent table add and remove operations. If omitted, all databases in the data warehouse are accessible for metadata operations.  The &#x60;databases&#x60; and &#x60;externalDatabases&#x60; serve different purposes. &#x60;databases&#x60; is a flat list of database names that controls which databases are scanned during metadata operations. &#x60;externalDatabases&#x60; defines the full table hierarchy and determines which tables are linked into ThoughtSpot.       

### Parameters

| Name | Type |
|------------- | ------------- |
| **connectionIdentifier** | **String**
| **updateConnectionV2Request** | [**UpdateConnectionV2Request**](UpdateConnectionV2Request.md)

### Return type

null (empty response body)

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

<a id="updateConversation"></a>
# **updateConversation**
> updateConversation(conversationIdentifier, updateConversationRequest)



 Updates attributes of an existing agent conversation. Currently only the display title can be updated; additional conversation attributes may be supported in future versions. At least one updatable attribute must be provided in the request body.    Version: 26.7.0.cl or later   Updates attributes of an existing saved agent conversation. Currently only the conversation&#39;s display &#x60;title&#x60; can be updated; additional updatable attributes may be supported in future versions. At least one updatable attribute must be supplied in the request body.  Requires &#x60;CAN_USE_SPOTTER&#x60; privilege and ownership of the conversation being updated.  #### Usage guidelines  The request must include:  - &#x60;conversation_identifier&#x60; *(path parameter)*: the unique ID of the conversation to update, as returned by &#x60;createAgentConversation&#x60; or &#x60;getConversationList&#x60; - At least one updatable attribute in the request body:     - &#x60;title&#x60; *(optional)*: the new display name for the conversation. When provided, must be a non-empty string.  A successful request returns an empty &#x60;204 No Content&#x60; response. Updated attributes are reflected immediately in subsequent calls to &#x60;getConversationList&#x60;.  #### Example request  &#x60;&#x60;&#x60;bash POST /api/rest/2.0/ai/agent/conversations/{conversation_identifier}/update Content-Type: application/json  {   \&quot;title\&quot;: \&quot;Revenue Breakdown by Product Line\&quot; } &#x60;&#x60;&#x60;  #### Error responses  | Code | Description | |------|-------------| | 400  | Bad Request — the request body is empty or &#x60;title&#x60; is provided as an empty string. | | 401  | Unauthorized — authentication token is missing, expired, or invalid. | | 403  | Forbidden — the authenticated user does not have &#x60;CAN_USE_SPOTTER&#x60; privilege or does not own the specified conversation. | | 404  | Not Found — no conversation exists with the given &#x60;conversation_identifier&#x60; for the authenticated user. | | 422  | Unprocessable Entity — the request body is malformed or contains an invalid field value. |  &gt; ###### Note: &gt; &gt; - Only conversations created with &#x60;enable_save_chat: true&#x60; can be updated. Unsaved conversations are not persisted and do not have a retrievable identifier. &gt; - Available from version 26.7.0.cl and later. &gt; - This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **conversationIdentifier** | **String**
| **updateConversationRequest** | [**UpdateConversationRequest**](UpdateConversationRequest.md)

### Return type

null (empty response body)

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

<a id="updateCustomAction"></a>
# **updateCustomAction**
> updateCustomAction(customActionIdentifier, updateCustomActionRequest)



  Version: 9.6.0.cl or later   Updates a custom action.  Requires &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **customActionIdentifier** | **String**
| **updateCustomActionRequest** | [**UpdateCustomActionRequest**](UpdateCustomActionRequest.md)

### Return type

null (empty response body)

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

<a id="updateDbtConnection"></a>
# **updateDbtConnection**
> Object updateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent)



  Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) - &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **dbtConnectionIdentifier** | **String**
| **connectionName** | **String**
| **databaseName** | **String**
| **importType** | **String**
| **accessToken** | **String**
| **dbtUrl** | **String**
| **accountId** | **String**
| **projectId** | **String**
| **dbtEnvId** | **String**
| **projectName** | **String**
| **fileContent** | **File**

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

<a id="updateEmailCustomization"></a>
# **updateEmailCustomization**
> updateEmailCustomization(updateEmailCustomizationRequest)



 Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes &#x60;template_properties&#x60;. The following example shows a sample set of customization configuration:  &#x60;&#x60;&#x60; {   {       \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;,      \&quot;cta_text_font_color\&quot;: \&quot;#FFFFFF\&quot;,      \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,         \&quot;logo_url\&quot;: \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,        \&quot;font_family\&quot;: \&quot;\&quot;,      \&quot;product_name\&quot;: \&quot;ThoughtSpot\&quot;,      \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000 Mountain View, CA 94041\&quot;,      \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,         \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,      \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,      \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,         \&quot;hide_footer_phone\&quot;: false,         \&quot;hide_footer_address\&quot;: false,         \&quot;hide_product_name\&quot;: false,      \&quot;hide_manage_notification\&quot;: false,      \&quot;hide_mobile_app_nudge\&quot;: false,      \&quot;hide_privacy_policy\&quot;: false,       \&quot;hide_ts_vocabulary_definitions\&quot;: false,      \&quot;hide_error_message\&quot;: false,      \&quot;hide_unsubscribe_link\&quot;: false,         \&quot;hide_notification_status\&quot;: false,      \&quot;hide_modify_alert\&quot;: false,      \&quot;company_website_url\&quot;: \&quot;https://your-website.com/\&quot;,      \&quot;company_privacy_policy_url\&quot; : \&quot;https://link-to-privacy-policy.com/\&quot;,         \&quot;contact_support_url\&quot;: \&quot;https://link-to-contact-support.com/\&quot;,         \&quot;hide_contact_support_url\&quot;: false,      \&quot;hide_logo_url\&quot; : false   } } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateEmailCustomizationRequest** | [**UpdateEmailCustomizationRequest**](UpdateEmailCustomizationRequest.md)

### Return type

null (empty response body)

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

<a id="updateMetadataHeader"></a>
# **updateMetadataHeader**
> updateMetadataHeader(updateMetadataHeaderRequest)



 Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either &#x60;identifier&#x60; or &#x60;obj_identifier&#x60;, but not both. Both fields cannot be empty.       - When &#x60;org_identifier&#x60; is set to &#x60;-1&#x60;, only the &#x60;identifier&#x60; value is accepted; &#x60;obj_identifier&#x60; is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide &#x60;org_guid&#x60; or &#x60;org_name&#x60; to uniquely identify the organization where changes need to be applied. .      - Provide &#x60;-1&#x60; if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the &#x60;obj_identifier&#x60; attribute. Only &#x60;text&#x60; will be allowed in attribute&#39;s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only &#x60;identifier&#x60; is given  &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;obj_identifier\&quot;: \&quot;\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_COLUMN\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgGuid\&quot; } &#x60;&#x60;&#x60;  ### Only &#x60;obj_identifier&#x60; is given &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;obj_identifier\&quot;: \&quot;custom_object_id\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: \&quot;orgName\&quot; } &#x60;&#x60;&#x60;  ### Executing update for all org &#x60;-1&#x60; &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;  ### Optional &#x60;type&#x60; is not provided &#x60;&#x60;&#x60;json {   \&quot;headers_update\&quot;:   [     {       \&quot;identifier\&quot;: \&quot;guid_1\&quot;,       \&quot;attributes\&quot;:       [         {           \&quot;name\&quot;: \&quot;obj_id\&quot;,           \&quot;value\&quot;: \&quot;custom_object_id\&quot;         }       ]     }   ],   \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;     

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateMetadataHeaderRequest** | [**UpdateMetadataHeaderRequest**](UpdateMetadataHeaderRequest.md)

### Return type

null (empty response body)

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

<a id="updateMetadataObjId"></a>
# **updateMetadataObjId**
> updateMetadataObjId(updateMetadataObjIdRequest)



 Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either &#x60;current_obj_id&#x60; alone OR use &#x60;metadata_identifier&#x60; with &#x60;type&#x60; (when needed).       - When using &#x60;metadata_identifier&#x60;, the &#x60;type&#x60; field is required if using a name instead of a GUID.       - The &#x60;new_obj_id&#x60; field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using &#x60;current_obj_id&#x60;, ensure it matches the existing object ID exactly.    - When using &#x60;metadata_identifier&#x60; with a name, ensure the &#x60;type&#x60; is specified correctly.    - Verify that the &#x60;new_obj_id&#x60; follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with GUID &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;01234567-89ab-cdef-0123-456789abcdef\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Using metadata_identifier with name and type &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;metadata_identifier\&quot;: \&quot;My Answer\&quot;,       \&quot;type\&quot;: \&quot;ANSWER\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot;     }   ] } &#x60;&#x60;&#x60;  ### Multiple objects update &#x60;&#x60;&#x60;json {   \&quot;metadata\&quot;: [     {       \&quot;current_obj_id\&quot;: \&quot;existing_object_id_1\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_1\&quot;     },     {       \&quot;metadata_identifier\&quot;: \&quot;My Worksheet\&quot;,       \&quot;type\&quot;: \&quot;LOGICAL_TABLE\&quot;,       \&quot;new_obj_id\&quot;: \&quot;new_object_id_2\&quot;     }   ] } &#x60;&#x60;&#x60;      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateMetadataObjIdRequest** | [**UpdateMetadataObjIdRequest**](UpdateMetadataObjIdRequest.md)

### Return type

null (empty response body)

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

<a id="updateOrg"></a>
# **updateOrg**
> updateOrg(orgIdentifier, updateOrgRequest)



  Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **orgIdentifier** | **String**
| **updateOrgRequest** | [**UpdateOrgRequest**](UpdateOrgRequest.md)

### Return type

null (empty response body)

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

<a id="updateRole"></a>
# **updateRole**
> RoleResponse updateRole(roleIdentifier, updateRoleRequest)



  Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage roles**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **roleIdentifier** | **String**
| **updateRoleRequest** | [**UpdateRoleRequest**](UpdateRoleRequest.md)

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

<a id="updateSchedule"></a>
# **updateSchedule**
> updateSchedule(scheduleIdentifier, updateScheduleRequest)



 Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.  If RBAC is enabled, changing a schedule&#39;s &#x60;file_format&#x60; also requires the download privilege that corresponds to the selected format: &#x60;CSV&#x60; and &#x60;XLSX&#x60; require the &#x60;CAN_DOWNLOAD_DETAILED_DATA&#x60; (**Can download detailed data**) privilege, and &#x60;PDF&#x60; requires the &#x60;CAN_DOWNLOAD_VISUALS&#x60; (**Can download visuals**) privilege.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **scheduleIdentifier** | **String**
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md)

### Return type

null (empty response body)

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

<a id="updateStyleCustomization"></a>
# **updateStyleCustomization**
> updateStyleCustomization(scope, operation, resetOptions, navigationPanel, chartColorPalette, embeddedFooterText, visualizationFonts, defaultLogo, wideLogo)



  Version: 26.7.0.cl or later   Updates style preferences at cluster level or for the authenticated user&#39;s org, including navigation panel color, chart color palette, embedded footer text, logo, and font assignments per visualization area. Cluster-level preferences serve as defaults for all orgs. Org-level preferences override cluster defaults. Resetting an Org-level preference falls back to Cluster-level preference, which on reset falls back to system defaults.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**)  privilege.  #### Usage guidelines  Two operations are supported via the &#x60;operation&#x60; field:  - **REPLACE** (default): Applies the fields provided in the request. Omitted fields remain unchanged. - **RESET**: Reverts specific fields to defaults. Specify which fields to reset using &#x60;reset_options.style&#x60; (for style fields) and &#x60;reset_options.visualization_areas&#x60; (for font assignments). Fields not listed in &#x60;reset_options&#x60; are not affected.  #### Logo upload  Logo files are uploaded as binary fields using &#x60;multipart/form-data&#x60;:  - &#x60;default_logo&#x60;: Square app icon and favicon. Recommended size: 140×140 px. Accepted formats: PNG, JPG. - &#x60;wide_logo&#x60;: Horizontal top nav bar logo. Recommended size: 230×45 px. Accepted formats: PNG, JPG.  To reset a logo to the default, use &#x60;operation: RESET&#x60; with &#x60;reset_options.style&#x60; set to &#x60;DEFAULT_LOGO&#x60; or &#x60;WIDE_LOGO&#x60;.  #### Navigation panel color  Set &#x60;navigation_panel.theme&#x60; to one of:  - &#x60;DARK&#x60;: Default dark theme. - &#x60;TWO_TONE&#x60;: Dual-tone panel style. - &#x60;CUSTOM&#x60;: User-defined color. Provide &#x60;navigation_panel.base_color&#x60; as a 6-digit hex string (e.g. &#x60;#2359B6&#x60;).  #### Chart color palette  Provide exactly 8 color entries in &#x60;chart_color_palette.colors&#x60;. Each entry requires a &#x60;primary&#x60; hex color. If &#x60;secondary&#x60; shades are omitted, the server auto-generates 4 shades from the primary color.  #### Font assignments  Specify &#x60;visualization_fonts.chart_visualization_fonts&#x60;, &#x60;visualization_fonts.table_visualization_fonts&#x60;, and &#x60;visualization_fonts.advanced_chart_visualization_fonts&#x60; to assign custom fonts to specific visualization areas. Only provide the areas you want to update; omitted areas remain unchanged.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **scope** | **String**
| **operation** | **String**
| **resetOptions** | [**StyleResetOptionsInput**](StyleResetOptionsInput.md)
| **navigationPanel** | [**NavigationPanelInput**](NavigationPanelInput.md)
| **chartColorPalette** | [**StyleColorPaletteInput**](StyleColorPaletteInput.md)
| **embeddedFooterText** | **String**
| **visualizationFonts** | [**VisualizationFontsInput**](VisualizationFontsInput.md)
| **defaultLogo** | **File**
| **wideLogo** | **File**

### Return type

null (empty response body)

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

<a id="updateStyleFont"></a>
# **updateStyleFont**
> updateStyleFont(fontIdentifier, updateStyleFontRequest)



  Version: 26.7.0.cl or later   Updates the metadata of an existing custom font in the cluster-level or org-level font library. Only the fields provided in the request are modified; omitted fields remain unchanged.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Identify the font using &#x60;font_identifier&#x60; (UUID or name). - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to target the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to target the authenticated user&#39;s org library. - To replace the font file itself (WOFF/WOFF2 binary), delete the existing font and re-upload using &#x60;uploadStyleFont&#x60;. - &#x60;name&#x60; must be unique within the target scope if provided. - &#x60;color&#x60; must be a valid 6-digit hex string (e.g. &#x60;#333333&#x60;) if provided.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **fontIdentifier** | **String**
| **updateStyleFontRequest** | [**UpdateStyleFontRequest**](UpdateStyleFontRequest.md)

### Return type

null (empty response body)

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

<a id="updateSystemConfig"></a>
# **updateSystemConfig**
> updateSystemConfig(updateSystemConfigRequest)



  Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateSystemConfigRequest** | [**UpdateSystemConfigRequest**](UpdateSystemConfigRequest.md)

### Return type

null (empty response body)

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

<a id="updateTag"></a>
# **updateTag**
> updateTag(tagIdentifier, updateTagRequest)



  Version: 9.0.0.cl or later   Updates a tag object.  You can modify the &#x60;name&#x60; and &#x60;color&#x60; properties of a tag object.    Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and delete tags.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **tagIdentifier** | **String**
| **updateTagRequest** | [**UpdateTagRequest**](UpdateTagRequest.md)

### Return type

null (empty response body)

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

<a id="updateUser"></a>
# **updateUser**
> updateUser(userIdentifier, updateUserRequest)



  Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **userIdentifier** | **String**
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)

### Return type

null (empty response body)

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

<a id="updateUserGroup"></a>
# **updateUserGroup**
> updateUserGroup(groupIdentifier, updateUserGroupRequest)



  Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      

### Parameters

| Name | Type |
|------------- | ------------- |
| **groupIdentifier** | **String**
| **updateUserGroupRequest** | [**UpdateUserGroupRequest**](UpdateUserGroupRequest.md)

### Return type

null (empty response body)

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

<a id="updateVariable"></a>
# **updateVariable**
> updateVariable(identifier, updateVariableRequest)



 Update a variable&#39;s name    Version: 26.4.0.cl or later   Allows updating a variable&#39;s name in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows updating: * The variable name     

### Parameters

| Name | Type |
|------------- | ------------- |
| **identifier** | **String**
| **updateVariableRequest** | [**UpdateVariableRequest**](UpdateVariableRequest.md)

### Return type

null (empty response body)

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

<a id="updateVariableValues"></a>
# **updateVariableValues**
> updateVariableValues(updateVariableValuesRequest)



 Update values for multiple variables    Version: 10.14.0.cl or later   **Note:** This API endpoint is deprecated and will be removed from ThoughtSpot in a future release. Use [POST /api/rest/2.0/template/variables/{identifier}/update-values](/api/rest/2.0/template/variables/%7Bidentifier%7D/update-values) instead.  Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constrains for a given variable, scope is ignored      

### Parameters

| Name | Type |
|------------- | ------------- |
| **updateVariableValuesRequest** | [**UpdateVariableValuesRequest**](UpdateVariableValuesRequest.md)

### Return type

null (empty response body)

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

<a id="updateWebhookConfiguration"></a>
# **updateWebhookConfiguration**
> updateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest)



  Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **webhookIdentifier** | **String**
| **updateWebhookConfigurationRequest** | [**UpdateWebhookConfigurationRequest**](UpdateWebhookConfigurationRequest.md)

### Return type

null (empty response body)

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

<a id="uploadStyleFont"></a>
# **uploadStyleFont**
> StyleFontUploadData uploadStyleFont(name, fileContent, scope, weight, style, color)



  Version: 26.7.0.cl or later   Uploads a custom font to the cluster-level or org-level font library. Cluster-level fonts are available as defaults for all orgs. Org-level fonts are only available within that org.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.  #### Usage guidelines  - Only **WOFF** and **WOFF2** font formats are accepted. TTF and OTF files are rejected with an error. - The &#x60;name&#x60; field must be unique within the target scope. Uploading a font with a name that already exists returns an error. - Set &#x60;scope&#x60; to &#x60;CLUSTER&#x60; to upload to the cluster-level library. Set &#x60;scope&#x60; to &#x60;ORG&#x60; (default) to upload to the authenticated user&#39;s org library. - &#x60;weight&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;LIGHT&#x60;, &#x60;BOLD&#x60;. - &#x60;style&#x60; defaults to &#x60;NORMAL&#x60; if omitted. Supported values: &#x60;NORMAL&#x60;, &#x60;ITALIC&#x60;, &#x60;OBLIQUE&#x60;. - &#x60;color&#x60; defaults to &#x60;#000000&#x60; (black) if omitted. Provide as a 6-digit hex string (e.g. &#x60;#333333&#x60;). - The uploaded font can be assigned to visualization areas using the &#x60;updateStyleCustomization&#x60; endpoint.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **name** | **String**
| **fileContent** | **File**
| **scope** | **String**
| **weight** | **String**
| **style** | **String**
| **color** | **String**

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

<a id="validateCommunicationChannel"></a>
# **validateCommunicationChannel**
> CommunicationChannelValidateResponse validateCommunicationChannel(validateCommunicationChannelRequest)



 Version: 26.4.0.cl or later   Validates a communication channel configuration to ensure it is properly set up and can receive events. - Use &#x60;channel_type&#x60; to specify the type of communication channel to validate (e.g., WEBHOOK). - Use &#x60;channel_identifier&#x60; to provide the unique identifier or name for the communication channel. - Use &#x60;event_type&#x60; to specify the event type to validate for this channel.  Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. For webhook channels, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to perform this action.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **validateCommunicationChannelRequest** | [**ValidateCommunicationChannelRequest**](ValidateCommunicationChannelRequest.md)

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

<a id="validateEmailCustomization"></a>
# **validateEmailCustomization**
> validateEmailCustomization()



 Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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

<a id="validateMerge"></a>
# **validateMerge**
> List&lt;DeployResponse&gt; validateMerge(validateMergeRequest)



  Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) privilege and edit access to the metadata objects.      

### Parameters

| Name | Type |
|------------- | ------------- |
| **validateMergeRequest** | [**ValidateMergeRequest**](ValidateMergeRequest.md)

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

<a id="validateToken"></a>
# **validateToken**
> TokenValidationResponse validateToken(validateTokenRequest)



  Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      

### Parameters

| Name | Type |
|------------- | ------------- |
| **validateTokenRequest** | [**ValidateTokenRequest**](ValidateTokenRequest.md)

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

