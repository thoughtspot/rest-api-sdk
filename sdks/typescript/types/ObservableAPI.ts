import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { AIContext } from '../models/AIContext';
import { APIKey } from '../models/APIKey';
import { APIKeyInput } from '../models/APIKeyInput';
import { AccessToken } from '../models/AccessToken';
import { ActionConfig } from '../models/ActionConfig';
import { ActionConfigInput } from '../models/ActionConfigInput';
import { ActionConfigInputCreate } from '../models/ActionConfigInputCreate';
import { ActionDetails } from '../models/ActionDetails';
import { ActionDetailsInput } from '../models/ActionDetailsInput';
import { ActionDetailsInputCreate } from '../models/ActionDetailsInputCreate';
import { ActivateUserRequest } from '../models/ActivateUserRequest';
import { AgentConversation } from '../models/AgentConversation';
import { AnswerContent } from '../models/AnswerContent';
import { AnswerContextInput } from '../models/AnswerContextInput';
import { AnswerDataResponse } from '../models/AnswerDataResponse';
import { AssignChangeAuthorRequest } from '../models/AssignChangeAuthorRequest';
import { AssignTagRequest } from '../models/AssignTagRequest';
import { AssociateMetadataInput } from '../models/AssociateMetadataInput';
import { AssociateMetadataInputCreate } from '../models/AssociateMetadataInputCreate';
import { Authentication } from '../models/Authentication';
import { AuthenticationInput } from '../models/AuthenticationInput';
import { Author } from '../models/Author';
import { AuthorMetadataTypeInput } from '../models/AuthorMetadataTypeInput';
import { AuthorType } from '../models/AuthorType';
import { AwsS3Config } from '../models/AwsS3Config';
import { AwsS3ConfigInput } from '../models/AwsS3ConfigInput';
import { BasicAuth } from '../models/BasicAuth';
import { BasicAuthInput } from '../models/BasicAuthInput';
import { CALLBACK } from '../models/CALLBACK';
import { CALLBACKInput } from '../models/CALLBACKInput';
import { CALLBACKInputMandatory } from '../models/CALLBACKInputMandatory';
import { CalendarResponse } from '../models/CalendarResponse';
import { ChangeUserPasswordRequest } from '../models/ChangeUserPasswordRequest';
import { ClusterNonEmbedAccess } from '../models/ClusterNonEmbedAccess';
import { ClusterNonEmbedAccessInput } from '../models/ClusterNonEmbedAccessInput';
import { Column } from '../models/Column';
import { ColumnSecurityRule } from '../models/ColumnSecurityRule';
import { ColumnSecurityRuleColumn } from '../models/ColumnSecurityRuleColumn';
import { ColumnSecurityRuleGroup } from '../models/ColumnSecurityRuleGroup';
import { ColumnSecurityRuleGroupOperation } from '../models/ColumnSecurityRuleGroupOperation';
import { ColumnSecurityRuleResponse } from '../models/ColumnSecurityRuleResponse';
import { ColumnSecurityRuleSourceTable } from '../models/ColumnSecurityRuleSourceTable';
import { ColumnSecurityRuleTableInput } from '../models/ColumnSecurityRuleTableInput';
import { ColumnSecurityRuleUpdate } from '../models/ColumnSecurityRuleUpdate';
import { CommitBranchRequest } from '../models/CommitBranchRequest';
import { CommitFileType } from '../models/CommitFileType';
import { CommitHistoryResponse } from '../models/CommitHistoryResponse';
import { CommitResponse } from '../models/CommitResponse';
import { CommiterType } from '../models/CommiterType';
import { CommunicationChannelPreferencesResponse } from '../models/CommunicationChannelPreferencesResponse';
import { ConfigureCommunicationChannelPreferencesRequest } from '../models/ConfigureCommunicationChannelPreferencesRequest';
import { ConfigureSecuritySettingsRequest } from '../models/ConfigureSecuritySettingsRequest';
import { ConfigureSecuritySettingsRequestClusterPreferences } from '../models/ConfigureSecuritySettingsRequestClusterPreferences';
import { ConnectionConfigurationResponse } from '../models/ConnectionConfigurationResponse';
import { ConnectionConfigurationSearchRequest } from '../models/ConnectionConfigurationSearchRequest';
import { ConnectionInput } from '../models/ConnectionInput';
import { ContextPayloadV2Input } from '../models/ContextPayloadV2Input';
import { Conversation } from '../models/Conversation';
import { ConversationSettingsInput } from '../models/ConversationSettingsInput';
import { ConvertWorksheetToModelRequest } from '../models/ConvertWorksheetToModelRequest';
import { CopyObjectRequest } from '../models/CopyObjectRequest';
import { CreateAgentConversationRequest } from '../models/CreateAgentConversationRequest';
import { CreateAgentConversationRequestConversationSettings } from '../models/CreateAgentConversationRequestConversationSettings';
import { CreateAgentConversationRequestMetadataContext } from '../models/CreateAgentConversationRequestMetadataContext';
import { CreateCalendarRequest } from '../models/CreateCalendarRequest';
import { CreateCalendarRequestTableReference } from '../models/CreateCalendarRequestTableReference';
import { CreateConfigRequest } from '../models/CreateConfigRequest';
import { CreateConnectionConfigurationRequest } from '../models/CreateConnectionConfigurationRequest';
import { CreateConnectionConfigurationRequestPolicyProcessOptions } from '../models/CreateConnectionConfigurationRequestPolicyProcessOptions';
import { CreateConnectionRequest } from '../models/CreateConnectionRequest';
import { CreateConnectionResponse } from '../models/CreateConnectionResponse';
import { CreateConversationRequest } from '../models/CreateConversationRequest';
import { CreateCustomActionRequest } from '../models/CreateCustomActionRequest';
import { CreateCustomActionRequestActionDetails } from '../models/CreateCustomActionRequestActionDetails';
import { CreateCustomActionRequestDefaultActionConfig } from '../models/CreateCustomActionRequestDefaultActionConfig';
import { CreateEmailCustomizationRequest } from '../models/CreateEmailCustomizationRequest';
import { CreateEmailCustomizationRequestTemplateProperties } from '../models/CreateEmailCustomizationRequestTemplateProperties';
import { CreateEmailCustomizationResponse } from '../models/CreateEmailCustomizationResponse';
import { CreateOrgRequest } from '../models/CreateOrgRequest';
import { CreateRoleRequest } from '../models/CreateRoleRequest';
import { CreateScheduleRequest } from '../models/CreateScheduleRequest';
import { CreateScheduleRequestFrequency } from '../models/CreateScheduleRequestFrequency';
import { CreateScheduleRequestLiveboardOptions } from '../models/CreateScheduleRequestLiveboardOptions';
import { CreateScheduleRequestPdfOptions } from '../models/CreateScheduleRequestPdfOptions';
import { CreateScheduleRequestRecipientDetails } from '../models/CreateScheduleRequestRecipientDetails';
import { CreateTagRequest } from '../models/CreateTagRequest';
import { CreateUserGroupRequest } from '../models/CreateUserGroupRequest';
import { CreateUserRequest } from '../models/CreateUserRequest';
import { CreateVariableRequest } from '../models/CreateVariableRequest';
import { CreateWebhookConfigurationRequest } from '../models/CreateWebhookConfigurationRequest';
import { CreateWebhookConfigurationRequestAuthentication } from '../models/CreateWebhookConfigurationRequestAuthentication';
import { CreateWebhookConfigurationRequestSignatureVerification } from '../models/CreateWebhookConfigurationRequestSignatureVerification';
import { CreateWebhookConfigurationRequestStorageDestination } from '../models/CreateWebhookConfigurationRequestStorageDestination';
import { CronExpression } from '../models/CronExpression';
import { CronExpressionInput } from '../models/CronExpressionInput';
import { CspSettings } from '../models/CspSettings';
import { CspSettingsInput } from '../models/CspSettingsInput';
import { CustomActionMetadataTypeInput } from '../models/CustomActionMetadataTypeInput';
import { DataSource } from '../models/DataSource';
import { DataSourceContextInput } from '../models/DataSourceContextInput';
import { DataWarehouseObjectInput } from '../models/DataWarehouseObjectInput';
import { DataWarehouseObjects } from '../models/DataWarehouseObjects';
import { Database } from '../models/Database';
import { DbtSearchResponse } from '../models/DbtSearchResponse';
import { DeactivateUserRequest } from '../models/DeactivateUserRequest';
import { DefaultActionConfig } from '../models/DefaultActionConfig';
import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
import { DefaultActionConfigInputCreate } from '../models/DefaultActionConfigInputCreate';
import { DefaultActionConfigSearchInput } from '../models/DefaultActionConfigSearchInput';
import { DeleteConfigRequest } from '../models/DeleteConfigRequest';
import { DeleteConnectionConfigurationRequest } from '../models/DeleteConnectionConfigurationRequest';
import { DeleteConnectionRequest } from '../models/DeleteConnectionRequest';
import { DeleteMetadataRequest } from '../models/DeleteMetadataRequest';
import { DeleteMetadataTypeInput } from '../models/DeleteMetadataTypeInput';
import { DeleteOrgEmailCustomizationRequest } from '../models/DeleteOrgEmailCustomizationRequest';
import { DeleteWebhookConfigurationsRequest } from '../models/DeleteWebhookConfigurationsRequest';
import { DeployCommitRequest } from '../models/DeployCommitRequest';
import { DeployResponse } from '../models/DeployResponse';
import { EntityHeader } from '../models/EntityHeader';
import { ErrorResponse } from '../models/ErrorResponse';
import { EurekaDataSourceSuggestionResponse } from '../models/EurekaDataSourceSuggestionResponse';
import { EurekaDecomposeQueryResponse } from '../models/EurekaDecomposeQueryResponse';
import { EurekaGetNLInstructionsResponse } from '../models/EurekaGetNLInstructionsResponse';
import { EurekaGetRelevantQuestionsResponse } from '../models/EurekaGetRelevantQuestionsResponse';
import { EurekaLLMDecomposeQueryResponse } from '../models/EurekaLLMDecomposeQueryResponse';
import { EurekaLLMSuggestedQuery } from '../models/EurekaLLMSuggestedQuery';
import { EurekaRelevantQuestion } from '../models/EurekaRelevantQuestion';
import { EurekaSetNLInstructionsResponse } from '../models/EurekaSetNLInstructionsResponse';
import { EventChannelConfig } from '../models/EventChannelConfig';
import { EventChannelConfigInput } from '../models/EventChannelConfigInput';
import { ExcludeMetadataListItemInput } from '../models/ExcludeMetadataListItemInput';
import { ExportAnswerReportRequest } from '../models/ExportAnswerReportRequest';
import { ExportAnswerReportRequestRegionalSettings } from '../models/ExportAnswerReportRequestRegionalSettings';
import { ExportLiveboardReportRequest } from '../models/ExportLiveboardReportRequest';
import { ExportLiveboardReportRequestPdfOptions } from '../models/ExportLiveboardReportRequestPdfOptions';
import { ExportLiveboardReportRequestPngOptions } from '../models/ExportLiveboardReportRequestPngOptions';
import { ExportMetadataTMLBatchedRequest } from '../models/ExportMetadataTMLBatchedRequest';
import { ExportMetadataTMLRequest } from '../models/ExportMetadataTMLRequest';
import { ExportMetadataTMLRequestExportOptions } from '../models/ExportMetadataTMLRequestExportOptions';
import { ExportMetadataTypeInput } from '../models/ExportMetadataTypeInput';
import { ExportOptions } from '../models/ExportOptions';
import { ExternalTableInput } from '../models/ExternalTableInput';
import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { FavoriteMetadataItem } from '../models/FavoriteMetadataItem';
import { FavoriteObjectOptionsInput } from '../models/FavoriteObjectOptionsInput';
import { FetchAnswerDataRequest } from '../models/FetchAnswerDataRequest';
import { FetchAnswerSqlQueryRequest } from '../models/FetchAnswerSqlQueryRequest';
import { FetchAsyncImportTaskStatusRequest } from '../models/FetchAsyncImportTaskStatusRequest';
import { FetchColumnSecurityRulesRequest } from '../models/FetchColumnSecurityRulesRequest';
import { FetchConnectionDiffStatusResponse } from '../models/FetchConnectionDiffStatusResponse';
import { FetchLiveboardDataRequest } from '../models/FetchLiveboardDataRequest';
import { FetchLiveboardSqlQueryRequest } from '../models/FetchLiveboardSqlQueryRequest';
import { FetchLogsRequest } from '../models/FetchLogsRequest';
import { FetchPermissionsOfPrincipalsRequest } from '../models/FetchPermissionsOfPrincipalsRequest';
import { FetchPermissionsOnMetadataRequest } from '../models/FetchPermissionsOnMetadataRequest';
import { FilterRules } from '../models/FilterRules';
import { ForceLogoutUsersRequest } from '../models/ForceLogoutUsersRequest';
import { Frequency } from '../models/Frequency';
import { FrequencyInput } from '../models/FrequencyInput';
import { GenerateCSVRequest } from '../models/GenerateCSVRequest';
import { GenericInfo } from '../models/GenericInfo';
import { GetAsyncImportStatusResponse } from '../models/GetAsyncImportStatusResponse';
import { GetCustomAccessTokenRequest } from '../models/GetCustomAccessTokenRequest';
import { GetDataSourceSuggestionsRequest } from '../models/GetDataSourceSuggestionsRequest';
import { GetFullAccessTokenRequest } from '../models/GetFullAccessTokenRequest';
import { GetFullAccessTokenRequestUserParameters } from '../models/GetFullAccessTokenRequestUserParameters';
import { GetNLInstructionsRequest } from '../models/GetNLInstructionsRequest';
import { GetObjectAccessTokenRequest } from '../models/GetObjectAccessTokenRequest';
import { GetRelevantQuestionsRequest } from '../models/GetRelevantQuestionsRequest';
import { GetRelevantQuestionsRequestAiContext } from '../models/GetRelevantQuestionsRequestAiContext';
import { GetRelevantQuestionsRequestMetadataContext } from '../models/GetRelevantQuestionsRequestMetadataContext';
import { GetTokenResponse } from '../models/GetTokenResponse';
import { GroupInfo } from '../models/GroupInfo';
import { GroupObject } from '../models/GroupObject';
import { GroupsImportListInput } from '../models/GroupsImportListInput';
import { HeaderAttributeInput } from '../models/HeaderAttributeInput';
import { HeaderUpdateInput } from '../models/HeaderUpdateInput';
import { ImportEPackAsyncTaskStatus } from '../models/ImportEPackAsyncTaskStatus';
import { ImportMetadataTMLAsyncRequest } from '../models/ImportMetadataTMLAsyncRequest';
import { ImportMetadataTMLRequest } from '../models/ImportMetadataTMLRequest';
import { ImportUser } from '../models/ImportUser';
import { ImportUserGroupsRequest } from '../models/ImportUserGroupsRequest';
import { ImportUserGroupsResponse } from '../models/ImportUserGroupsResponse';
import { ImportUserType } from '../models/ImportUserType';
import { ImportUsersRequest } from '../models/ImportUsersRequest';
import { ImportUsersResponse } from '../models/ImportUsersResponse';
import { InputEurekaNLSRequest } from '../models/InputEurekaNLSRequest';
import { JWTMetadataObject } from '../models/JWTMetadataObject';
import { JWTParameter } from '../models/JWTParameter';
import { JWTUserOptions } from '../models/JWTUserOptions';
import { JWTUserOptionsFull } from '../models/JWTUserOptionsFull';
import { LBContextInput } from '../models/LBContextInput';
import { LiveboardContent } from '../models/LiveboardContent';
import { LiveboardDataResponse } from '../models/LiveboardDataResponse';
import { LiveboardOptions } from '../models/LiveboardOptions';
import { LiveboardOptionsInput } from '../models/LiveboardOptionsInput';
import { LogResponse } from '../models/LogResponse';
import { LoginRequest } from '../models/LoginRequest';
import { MetadataAssociationItem } from '../models/MetadataAssociationItem';
import { MetadataContext } from '../models/MetadataContext';
import { MetadataInput } from '../models/MetadataInput';
import { MetadataListItemInput } from '../models/MetadataListItemInput';
import { MetadataObject } from '../models/MetadataObject';
import { MetadataResponse } from '../models/MetadataResponse';
import { MetadataSearchResponse } from '../models/MetadataSearchResponse';
import { MetadataSearchSortOptions } from '../models/MetadataSearchSortOptions';
import { ModelTableList } from '../models/ModelTableList';
import { NLInstructionsInfo } from '../models/NLInstructionsInfo';
import { NLInstructionsInfoInput } from '../models/NLInstructionsInfoInput';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
import { ObjectPrivilegesMetadataInput } from '../models/ObjectPrivilegesMetadataInput';
import { ObjectPrivilegesOfMetadataResponse } from '../models/ObjectPrivilegesOfMetadataResponse';
import { Org } from '../models/Org';
import { OrgChannelConfigInput } from '../models/OrgChannelConfigInput';
import { OrgChannelConfigResponse } from '../models/OrgChannelConfigResponse';
import { OrgDetails } from '../models/OrgDetails';
import { OrgInfo } from '../models/OrgInfo';
import { OrgNonEmbedAccess } from '../models/OrgNonEmbedAccess';
import { OrgNonEmbedAccessInput } from '../models/OrgNonEmbedAccessInput';
import { OrgPreferenceSearchCriteriaInput } from '../models/OrgPreferenceSearchCriteriaInput';
import { OrgResponse } from '../models/OrgResponse';
import { OrgType } from '../models/OrgType';
import { ParameterValues } from '../models/ParameterValues';
import { ParameterizeMetadataRequest } from '../models/ParameterizeMetadataRequest';
import { ParametersListItem } from '../models/ParametersListItem';
import { ParametersListItemInput } from '../models/ParametersListItemInput';
import { PdfOptions } from '../models/PdfOptions';
import { PdfOptionsInput } from '../models/PdfOptionsInput';
import { PermissionInput } from '../models/PermissionInput';
import { PermissionOfMetadataResponse } from '../models/PermissionOfMetadataResponse';
import { PermissionOfPrincipalsResponse } from '../models/PermissionOfPrincipalsResponse';
import { PermissionsMetadataTypeInput } from '../models/PermissionsMetadataTypeInput';
import { PngOptionsInput } from '../models/PngOptionsInput';
import { PolicyProcessOptions } from '../models/PolicyProcessOptions';
import { PolicyProcessOptionsInput } from '../models/PolicyProcessOptionsInput';
import { PrincipalsInput } from '../models/PrincipalsInput';
import { PrincipalsListItem } from '../models/PrincipalsListItem';
import { PrincipalsListItemInput } from '../models/PrincipalsListItemInput';
import { PublishMetadataListItem } from '../models/PublishMetadataListItem';
import { PublishMetadataRequest } from '../models/PublishMetadataRequest';
import { QueryGetDecomposedQueryRequest } from '../models/QueryGetDecomposedQueryRequest';
import { QueryGetDecomposedQueryRequestNlsRequest } from '../models/QueryGetDecomposedQueryRequestNlsRequest';
import { RecipientDetails } from '../models/RecipientDetails';
import { RecipientDetailsInput } from '../models/RecipientDetailsInput';
import { RegionalSettingsInput } from '../models/RegionalSettingsInput';
import { RepoConfigObject } from '../models/RepoConfigObject';
import { ResetUserPasswordRequest } from '../models/ResetUserPasswordRequest';
import { ResponseActivationURL } from '../models/ResponseActivationURL';
import { ResponseCopyObject } from '../models/ResponseCopyObject';
import { ResponseCustomAction } from '../models/ResponseCustomAction';
import { ResponseFailedEntities } from '../models/ResponseFailedEntities';
import { ResponseFailedEntity } from '../models/ResponseFailedEntity';
import { ResponseIncompleteEntities } from '../models/ResponseIncompleteEntities';
import { ResponseIncompleteEntity } from '../models/ResponseIncompleteEntity';
import { ResponseMessage } from '../models/ResponseMessage';
import { ResponsePostUpgradeFailedEntities } from '../models/ResponsePostUpgradeFailedEntities';
import { ResponsePostUpgradeFailedEntity } from '../models/ResponsePostUpgradeFailedEntity';
import { ResponseSchedule } from '../models/ResponseSchedule';
import { ResponseScheduleRun } from '../models/ResponseScheduleRun';
import { ResponseSuccessfulEntities } from '../models/ResponseSuccessfulEntities';
import { ResponseSuccessfulEntity } from '../models/ResponseSuccessfulEntity';
import { ResponseWorksheetToModelConversion } from '../models/ResponseWorksheetToModelConversion';
import { RevertCommitRequest } from '../models/RevertCommitRequest';
import { RevertResponse } from '../models/RevertResponse';
import { RevertedMetadata } from '../models/RevertedMetadata';
import { RevokeRefreshTokensRequest } from '../models/RevokeRefreshTokensRequest';
import { RevokeRefreshTokensResponse } from '../models/RevokeRefreshTokensResponse';
import { RevokeTokenRequest } from '../models/RevokeTokenRequest';
import { RiseGQLArgWrapper } from '../models/RiseGQLArgWrapper';
import { RiseSetter } from '../models/RiseSetter';
import { Role } from '../models/Role';
import { RoleResponse } from '../models/RoleResponse';
import { RuntimeFilter } from '../models/RuntimeFilter';
import { RuntimeFilters } from '../models/RuntimeFilters';
import { RuntimeParamOverride } from '../models/RuntimeParamOverride';
import { RuntimeParameters } from '../models/RuntimeParameters';
import { RuntimeSort } from '../models/RuntimeSort';
import { RuntimeSorts } from '../models/RuntimeSorts';
import { ScheduleHistoryRunsOptionsInput } from '../models/ScheduleHistoryRunsOptionsInput';
import { SchedulesPdfOptionsInput } from '../models/SchedulesPdfOptionsInput';
import { SchemaObject } from '../models/SchemaObject';
import { Scope } from '../models/Scope';
import { ScriptSrcUrls } from '../models/ScriptSrcUrls';
import { ScriptSrcUrlsInput } from '../models/ScriptSrcUrlsInput';
import { SearchCalendarsRequest } from '../models/SearchCalendarsRequest';
import { SearchCalendarsRequestSortOptions } from '../models/SearchCalendarsRequestSortOptions';
import { SearchCommitsRequest } from '../models/SearchCommitsRequest';
import { SearchCommunicationChannelPreferencesRequest } from '../models/SearchCommunicationChannelPreferencesRequest';
import { SearchConfigRequest } from '../models/SearchConfigRequest';
import { SearchConnectionRequest } from '../models/SearchConnectionRequest';
import { SearchConnectionRequestSortOptions } from '../models/SearchConnectionRequestSortOptions';
import { SearchConnectionResponse } from '../models/SearchConnectionResponse';
import { SearchCustomActionsRequest } from '../models/SearchCustomActionsRequest';
import { SearchCustomActionsRequestDefaultActionConfig } from '../models/SearchCustomActionsRequestDefaultActionConfig';
import { SearchDataRequest } from '../models/SearchDataRequest';
import { SearchDataResponse } from '../models/SearchDataResponse';
import { SearchEmailCustomizationRequest } from '../models/SearchEmailCustomizationRequest';
import { SearchMetadataRequest } from '../models/SearchMetadataRequest';
import { SearchMetadataRequestFavoriteObjectOptions } from '../models/SearchMetadataRequestFavoriteObjectOptions';
import { SearchMetadataRequestSortOptions } from '../models/SearchMetadataRequestSortOptions';
import { SearchOrgsRequest } from '../models/SearchOrgsRequest';
import { SearchRoleResponse } from '../models/SearchRoleResponse';
import { SearchRolesRequest } from '../models/SearchRolesRequest';
import { SearchSchedulesRequest } from '../models/SearchSchedulesRequest';
import { SearchSchedulesRequestHistoryRunsOptions } from '../models/SearchSchedulesRequestHistoryRunsOptions';
import { SearchSchedulesRequestSortOptions } from '../models/SearchSchedulesRequestSortOptions';
import { SearchSecuritySettingsRequest } from '../models/SearchSecuritySettingsRequest';
import { SearchTagsRequest } from '../models/SearchTagsRequest';
import { SearchUserGroupsRequest } from '../models/SearchUserGroupsRequest';
import { SearchUserGroupsRequestSortOptions } from '../models/SearchUserGroupsRequestSortOptions';
import { SearchUsersRequest } from '../models/SearchUsersRequest';
import { SearchUsersRequestSortOptions } from '../models/SearchUsersRequestSortOptions';
import { SearchVariablesRequest } from '../models/SearchVariablesRequest';
import { SearchWebhookConfigurationsRequest } from '../models/SearchWebhookConfigurationsRequest';
import { SearchWebhookConfigurationsRequestSortOptions } from '../models/SearchWebhookConfigurationsRequestSortOptions';
import { SecuritySettingsClusterPreferences } from '../models/SecuritySettingsClusterPreferences';
import { SecuritySettingsClusterPreferencesInput } from '../models/SecuritySettingsClusterPreferencesInput';
import { SecuritySettingsOrgDetails } from '../models/SecuritySettingsOrgDetails';
import { SecuritySettingsOrgPreferences } from '../models/SecuritySettingsOrgPreferences';
import { SecuritySettingsOrgPreferencesInput } from '../models/SecuritySettingsOrgPreferencesInput';
import { SecuritySettingsResponse } from '../models/SecuritySettingsResponse';
import { SendAgentMessageRequest } from '../models/SendAgentMessageRequest';
import { SendAgentMessageResponse } from '../models/SendAgentMessageResponse';
import { SendAgentMessageStreamingRequest } from '../models/SendAgentMessageStreamingRequest';
import { SendMessageRequest } from '../models/SendMessageRequest';
import { SetNLInstructionsRequest } from '../models/SetNLInstructionsRequest';
import { ShareMetadataRequest } from '../models/ShareMetadataRequest';
import { ShareMetadataTypeInput } from '../models/ShareMetadataTypeInput';
import { SharePermissionsInput } from '../models/SharePermissionsInput';
import { SingleAnswerRequest } from '../models/SingleAnswerRequest';
import { SortOption } from '../models/SortOption';
import { SortOptionInput } from '../models/SortOptionInput';
import { SortOptions } from '../models/SortOptions';
import { SortingOptions } from '../models/SortingOptions';
import { SqlQuery } from '../models/SqlQuery';
import { SqlQueryResponse } from '../models/SqlQueryResponse';
import { StorageConfig } from '../models/StorageConfig';
import { StorageConfigInput } from '../models/StorageConfigInput';
import { StorageDestination } from '../models/StorageDestination';
import { StorageDestinationInput } from '../models/StorageDestinationInput';
import { SystemConfig } from '../models/SystemConfig';
import { SystemInfo } from '../models/SystemInfo';
import { SystemOverrideInfo } from '../models/SystemOverrideInfo';
import { Table } from '../models/Table';
import { Tag } from '../models/Tag';
import { TagMetadataTypeInput } from '../models/TagMetadataTypeInput';
import { TemplatePropertiesInputCreate } from '../models/TemplatePropertiesInputCreate';
import { Token } from '../models/Token';
import { TokenAccessScopeObject } from '../models/TokenAccessScopeObject';
import { TokenValidationResponse } from '../models/TokenValidationResponse';
import { URL } from '../models/URL';
import { URLInput } from '../models/URLInput';
import { URLInputMandatory } from '../models/URLInputMandatory';
import { UnparameterizeMetadataRequest } from '../models/UnparameterizeMetadataRequest';
import { UnpublishMetadataRequest } from '../models/UnpublishMetadataRequest';
import { UpdateCalendarRequest } from '../models/UpdateCalendarRequest';
import { UpdateCalendarRequestTableReference } from '../models/UpdateCalendarRequestTableReference';
import { UpdateColumnSecurityRulesRequest } from '../models/UpdateColumnSecurityRulesRequest';
import { UpdateConfigRequest } from '../models/UpdateConfigRequest';
import { UpdateConnectionConfigurationRequest } from '../models/UpdateConnectionConfigurationRequest';
import { UpdateConnectionRequest } from '../models/UpdateConnectionRequest';
import { UpdateConnectionV2Request } from '../models/UpdateConnectionV2Request';
import { UpdateCustomActionRequest } from '../models/UpdateCustomActionRequest';
import { UpdateCustomActionRequestActionDetails } from '../models/UpdateCustomActionRequestActionDetails';
import { UpdateCustomActionRequestDefaultActionConfig } from '../models/UpdateCustomActionRequestDefaultActionConfig';
import { UpdateEmailCustomizationRequest } from '../models/UpdateEmailCustomizationRequest';
import { UpdateMetadataHeaderRequest } from '../models/UpdateMetadataHeaderRequest';
import { UpdateMetadataObjIdRequest } from '../models/UpdateMetadataObjIdRequest';
import { UpdateObjIdInput } from '../models/UpdateObjIdInput';
import { UpdateOrgRequest } from '../models/UpdateOrgRequest';
import { UpdateRoleRequest } from '../models/UpdateRoleRequest';
import { UpdateScheduleRequest } from '../models/UpdateScheduleRequest';
import { UpdateScheduleRequestFrequency } from '../models/UpdateScheduleRequestFrequency';
import { UpdateScheduleRequestLiveboardOptions } from '../models/UpdateScheduleRequestLiveboardOptions';
import { UpdateScheduleRequestPdfOptions } from '../models/UpdateScheduleRequestPdfOptions';
import { UpdateScheduleRequestRecipientDetails } from '../models/UpdateScheduleRequestRecipientDetails';
import { UpdateSystemConfigRequest } from '../models/UpdateSystemConfigRequest';
import { UpdateTagRequest } from '../models/UpdateTagRequest';
import { UpdateUserGroupRequest } from '../models/UpdateUserGroupRequest';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { UpdateVariableRequest } from '../models/UpdateVariableRequest';
import { UpdateVariableValuesRequest } from '../models/UpdateVariableValuesRequest';
import { UpdateWebhookConfigurationRequest } from '../models/UpdateWebhookConfigurationRequest';
import { User } from '../models/User';
import { UserGroup } from '../models/UserGroup';
import { UserGroupResponse } from '../models/UserGroupResponse';
import { UserInfo } from '../models/UserInfo';
import { UserObject } from '../models/UserObject';
import { UserParameterOptions } from '../models/UserParameterOptions';
import { UserPrincipal } from '../models/UserPrincipal';
import { ValidateMergeRequest } from '../models/ValidateMergeRequest';
import { ValidateTokenRequest } from '../models/ValidateTokenRequest';
import { ValueScopeInput } from '../models/ValueScopeInput';
import { Variable } from '../models/Variable';
import { VariableDetailInput } from '../models/VariableDetailInput';
import { VariableUpdateAssignmentInput } from '../models/VariableUpdateAssignmentInput';
import { VariableUpdateScopeInput } from '../models/VariableUpdateScopeInput';
import { VariableValue } from '../models/VariableValue';
import { VariableValues } from '../models/VariableValues';
import { WebhookAuthApiKey } from '../models/WebhookAuthApiKey';
import { WebhookAuthApiKeyInput } from '../models/WebhookAuthApiKeyInput';
import { WebhookAuthBasicAuth } from '../models/WebhookAuthBasicAuth';
import { WebhookAuthBasicAuthInput } from '../models/WebhookAuthBasicAuthInput';
import { WebhookAuthOAuth2 } from '../models/WebhookAuthOAuth2';
import { WebhookAuthOAuth2Input } from '../models/WebhookAuthOAuth2Input';
import { WebhookAuthentication } from '../models/WebhookAuthentication';
import { WebhookAuthenticationInput } from '../models/WebhookAuthenticationInput';
import { WebhookDeleteFailure } from '../models/WebhookDeleteFailure';
import { WebhookDeleteResponse } from '../models/WebhookDeleteResponse';
import { WebhookOrg } from '../models/WebhookOrg';
import { WebhookPagination } from '../models/WebhookPagination';
import { WebhookResponse } from '../models/WebhookResponse';
import { WebhookSearchResponse } from '../models/WebhookSearchResponse';
import { WebhookSignatureVerification } from '../models/WebhookSignatureVerification';
import { WebhookSignatureVerificationInput } from '../models/WebhookSignatureVerificationInput';
import { WebhookSortOptionsInput } from '../models/WebhookSortOptionsInput';
import { WebhookUser } from '../models/WebhookUser';

import { AIApiRequestFactory, AIApiResponseProcessor} from "../apis/AIApi";
export class ObservableAIApi {
    private requestFactory: AIApiRequestFactory;
    private responseProcessor: AIApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AIApiRequestFactory,
        responseProcessor?: AIApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AIApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AIApiResponseProcessor();
    }

    /**
     * Version: 10.13.0.cl or later 
     * @param createAgentConversationRequest 
     */
    public createAgentConversation(createAgentConversationRequest: CreateAgentConversationRequest, _options?: Configuration): Observable<AgentConversation> {
        const requestContextPromise = this.requestFactory.createAgentConversation(createAgentConversationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createAgentConversation(rsp)));
            }));
    }

    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest 
     */
    public createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Observable<Conversation> {
        const requestContextPromise = this.requestFactory.createConversation(createConversationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConversation(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   Provides relevant data source recommendations for a user-submitted natural language query.  To use this API, the user must have at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include a `query` string via the request body.  The returned results include metadata such as: - `confidence`: a float indicating the model\'s confidence in the relevance of each recommendation - `details`: includes `data_source_identifier`, `data_source_name`, and `description` of each recommended data source - `reasoning`: rationale provided by the LLM to explain why each data source was recommended  If the API request is successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant reasoning.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param getDataSourceSuggestionsRequest 
     */
    public getDataSourceSuggestions(getDataSourceSuggestionsRequest: GetDataSourceSuggestionsRequest, _options?: Configuration): Observable<EurekaDataSourceSuggestionResponse> {
        const requestContextPromise = this.requestFactory.getDataSourceSuggestions(getDataSourceSuggestionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getDataSourceSuggestions(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to retrieve existing natural language (NL) instructions for a specific data-model. These instructions guide the AI system in understanding data context and generating more accurate responses when processing natural language queries.  #### Usage guidelines  To retrieve NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID of the data-model to retrieve NL instructions  The API returns a response object with: - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for natural language processing   - `scope`: The scope of the instruction (`GLOBAL`). It can be extended to data-model-user scope in future.  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  > ###### Note: > * To use this API, the user needs atleast view access on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Use this API to view currently configured instructions before modifying them with `setNLInstructions`.     
     * @param getNLInstructionsRequest 
     */
    public getNLInstructions(getNLInstructionsRequest: GetNLInstructionsRequest, _options?: Configuration): Observable<EurekaGetNLInstructionsResponse> {
        const requestContextPromise = this.requestFactory.getNLInstructions(getNLInstructionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getNLInstructions(rsp)));
            }));
    }

    /**
     *  Version: 10.13.0.cl or later   Breaks down a user-submitted query into a series of analytical sub-questions using relevant contextual metadata.  To use this API, the user must have at least view-level access to the referenced metadata objects.  #### Usage guidelines  To accurately generate relevant questions, the request must include at least one of the following metadata identifiers within `metadata_context` : `conversation_identifier`, `answer_identifiers`, `liveboard_identifiers`, or `data_source_identifiers`.  You can further enhance the quality and precision of breakdown by providing additional `ai_context` such as:  - `content`: User provided content like text data, csv data as a string message to provide context & potentially improve the quality of the response. - `instructions`: User specific text instructions sent to AI system for processing the query.  Additional optional parameters include:  - `limit_relevant_questions`: Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. - `bypass_cache`: If set to true, forces fresh computation instead of returning cached results.  If the API request is successful, ThoughtSpot returns a list of relevant analytical queries, each aligned with the user\'s original question. Each returned question includes the query string, along with the identifier and name of the corresponding data source.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     
     * @param getRelevantQuestionsRequest 
     */
    public getRelevantQuestions(getRelevantQuestionsRequest: GetRelevantQuestionsRequest, _options?: Configuration): Observable<EurekaGetRelevantQuestionsResponse> {
        const requestContextPromise = this.requestFactory.getRelevantQuestions(getRelevantQuestionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRelevantQuestions(rsp)));
            }));
    }

    /**
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest 
     */
    public queryGetDecomposedQuery(queryGetDecomposedQueryRequest: QueryGetDecomposedQueryRequest, _options?: Configuration): Observable<EurekaDecomposeQueryResponse> {
        const requestContextPromise = this.requestFactory.queryGetDecomposedQuery(queryGetDecomposedQueryRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.queryGetDecomposedQuery(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  The API returns a array of object with a type, message, and metadata. - `type`: Type of the message — text, answer, or error. - `message`: Main content of the response. - `metadata`: Additional info depending on the message type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     * @param sendAgentMessageRequest 
     */
    public sendAgentMessage(conversationIdentifier: string, sendAgentMessageRequest: SendAgentMessageRequest, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.sendAgentMessage(conversationIdentifier, sendAgentMessageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sendAgentMessage(rsp)));
            }));
    }

    /**
     *  Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  Additionally, user can specify what tool can be included `conversation_settings` parameter, which supports: - `enable_contextual_change_analysis` (default: false) - `enable_natural_language_answer_generation` (default: true) - `enable_reasoning` (default: false)  If the request is valid, the API returns a stream of messages in real time, including: - `ack`: confirms receipt of the request - `text / text-chunk`: content chunks, optionally formatted (e.g., markdown) - `answer`: the final structured response with metadata and analytics - `error`: if a failure occurs - `notification`: notification messages for operation being performed  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > * The streaming protocol uses Server-Sent Events (SSE)     
     * @param sendAgentMessageStreamingRequest 
     */
    public sendAgentMessageStreaming(sendAgentMessageStreamingRequest: SendAgentMessageStreamingRequest, _options?: Configuration): Observable<SendAgentMessageResponse> {
        const requestContextPromise = this.requestFactory.sendAgentMessageStreaming(sendAgentMessageStreamingRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sendAgentMessageStreaming(rsp)));
            }));
    }

    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest 
     */
    public sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Observable<Array<ResponseMessage>> {
        const requestContextPromise = this.requestFactory.sendMessage(conversationIdentifier, sendMessageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sendMessage(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  #### Usage guidelines  To set NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  The API returns a response object with: - `success`: Boolean indicating whether the operation was successful  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally for that data-model across the system  > ###### Note: > * To use this API, the user needs either edit access or SPOTTER_COACHING_PRIVILEGE on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
     * @param setNLInstructionsRequest 
     */
    public setNLInstructions(setNLInstructionsRequest: SetNLInstructionsRequest, _options?: Configuration): Observable<EurekaSetNLInstructionsResponse> {
        const requestContextPromise = this.requestFactory.setNLInstructions(setNLInstructionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.setNLInstructions(rsp)));
            }));
    }

    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest 
     */
    public singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Observable<ResponseMessage> {
        const requestContextPromise = this.requestFactory.singleAnswer(singleAnswerRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.singleAnswer(rsp)));
            }));
    }

}

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class ObservableAuthenticationApi {
    private requestFactory: AuthenticationApiRequestFactory;
    private responseProcessor: AuthenticationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AuthenticationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AuthenticationApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.     
     */
    public getCurrentUserInfo(_options?: Configuration): Observable<User> {
        const requestContextPromise = this.requestFactory.getCurrentUserInfo(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCurrentUserInfo(rsp)));
            }));
    }

    /**
     *   Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      
     */
    public getCurrentUserToken(_options?: Configuration): Observable<GetTokenResponse> {
        const requestContextPromise = this.requestFactory.getCurrentUserToken(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCurrentUserToken(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  Specify the object type as `LOGICAL_TABLE`.   For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values. If `auto_create` is set to `true`, it won\'t create formula variables and hence won\'t be applicable for `variable_values`.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.  ##### Formula Variables Before using variables_values, variables must be created using Create Variable API with type as Formula_Variable (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used when variable_values are provided in the request. If you are working with variable_values, you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do not pass any variable_values. In such cases, variable_values will remain unaffected. When using object_id with variable_values, models are supported.      
     * @param getCustomAccessTokenRequest 
     */
    public getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Observable<AccessToken> {
        const requestContextPromise = this.requestFactory.getCustomAccessToken(getCustomAccessTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCustomAccessToken(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getFullAccessTokenRequest 
     */
    public getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Observable<Token> {
        const requestContextPromise = this.requestFactory.getFullAccessToken(getFullAccessTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getFullAccessToken(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getObjectAccessTokenRequest 
     */
    public getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Observable<Token> {
        const requestContextPromise = this.requestFactory.getObjectAccessToken(getObjectAccessTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getObjectAccessToken(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     
     * @param loginRequest 
     */
    public login(loginRequest: LoginRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.login(loginRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.login(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.      
     */
    public logout(_options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.logout(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.logout(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param revokeTokenRequest 
     */
    public revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.revokeToken(revokeTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.revokeToken(rsp)));
            }));
    }

    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param validateTokenRequest 
     */
    public validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Observable<TokenValidationResponse> {
        const requestContextPromise = this.requestFactory.validateToken(validateTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.validateToken(rsp)));
            }));
    }

}

import { ConnectionConfigurationsApiRequestFactory, ConnectionConfigurationsApiResponseProcessor} from "../apis/ConnectionConfigurationsApi";
export class ObservableConnectionConfigurationsApi {
    private requestFactory: ConnectionConfigurationsApiRequestFactory;
    private responseProcessor: ConnectionConfigurationsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ConnectionConfigurationsApiRequestFactory,
        responseProcessor?: ConnectionConfigurationsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ConnectionConfigurationsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ConnectionConfigurationsApiResponseProcessor();
    }

    /**
     *   Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      
     * @param connectionConfigurationSearchRequest 
     */
    public connectionConfigurationSearch(connectionConfigurationSearchRequest: ConnectionConfigurationSearchRequest, _options?: Configuration): Observable<Array<ConnectionConfigurationResponse>> {
        const requestContextPromise = this.requestFactory.connectionConfigurationSearch(connectionConfigurationSearchRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.connectionConfigurationSearch(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in `configuration`. The following example shows the configuration attributes:   ```    {      \"user\":\"DEV_USER\",      \"password\":\"TestConn123\",      \"role\":\"DEV\",      \"warehouse\":\"DEV_WH\"     }   ```  * If the `policy_type` is `PRINCIPALS`, then `policy_principals` is a required field. * If the `policy_type` is `PROCESSES`, then `policy_processes` is a required field. * If the `policy_type` is `NO_POLICY`, then `policy_principals` and `policy_processes` are not required fields.  #### Parameterized Connection Support For parameterized connections that use OAuth authentication, only the same_as_parent and policy_process_options  attributes are allowed in the API request. These attributes are not applicable to connections that are not parameterized.       
     * @param createConnectionConfigurationRequest 
     */
    public createConnectionConfiguration(createConnectionConfigurationRequest: CreateConnectionConfigurationRequest, _options?: Configuration): Observable<ConnectionConfigurationResponse> {
        const requestContextPromise = this.requestFactory.createConnectionConfiguration(createConnectionConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConnectionConfiguration(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param deleteConnectionConfigurationRequest 
     */
    public deleteConnectionConfiguration(deleteConnectionConfigurationRequest: DeleteConnectionConfigurationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConnectionConfiguration(deleteConnectionConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConnectionConfiguration(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the `policy_type`  * Edit the type of authentication  * Enable or disable a configuration  #### Parameterized Connection Support For parameterized oauth based connections, only the `same_as_parent` and `policy_process_options` attributes are allowed. These attributes are not applicable to connections that are not parameterized.   **NOTE**: When updating a configuration where `disabled` is `true`, you must reset `disabled` to `true` in your update request payload. If not explicitly set again, the API will default `disabled` to `false`.      
     * @param configurationIdentifier Unique ID or name of the configuration.
     * @param updateConnectionConfigurationRequest 
     */
    public updateConnectionConfiguration(configurationIdentifier: string, updateConnectionConfigurationRequest: UpdateConnectionConfigurationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateConnectionConfiguration(configurationIdentifier, updateConnectionConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConnectionConfiguration(rsp)));
            }));
    }

}

import { ConnectionsApiRequestFactory, ConnectionsApiResponseProcessor} from "../apis/ConnectionsApi";
export class ObservableConnectionsApi {
    private requestFactory: ConnectionsApiRequestFactory;
    private responseProcessor: ConnectionsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ConnectionsApiRequestFactory,
        responseProcessor?: ConnectionsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ConnectionsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ConnectionsApiResponseProcessor();
    }

    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Observable<CreateConnectionResponse> {
        const requestContextPromise = this.requestFactory.createConnection(createConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConnection(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     
     * @param deleteConnectionRequest 
     */
    public deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConnection(deleteConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConnection(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    public deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConnectionV2(connectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConnectionV2(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Observable<HttpFile> {
        const requestContextPromise = this.requestFactory.downloadConnectionMetadataChanges(connectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.downloadConnectionMetadataChanges(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Observable<FetchConnectionDiffStatusResponse> {
        const requestContextPromise = this.requestFactory.fetchConnectionDiffStatus(connectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchConnectionDiffStatus(rsp)));
            }));
    }

    /**
     *   Version: 26.2.0.cl or later   Revokes OAuth refresh tokens for users who no longer require access to a data warehouse connection. When a token is revoked, the affected user\'s session for that connection is terminated, and they must re-authenticate to regain access.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on the ThoughtSpot instance, users with `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege can also make API requests to revoke tokens for connection users.  #### Usage guidelines  You can specify different combinations of identifiers to control which refresh tokens are revoked.  - **connection_identifier**: Revokes refresh tokens for all users of the connection, except the connection author. - **connection_identifier** and **user_identifiers**: Revokes refresh tokens only for the users specified in the request. If the name or ID of the connection author is included in the request, their token will also be revoked. - **connection_identifier** and **configuration_identifiers**: Revokes refresh tokens for all users on the specified configurations, except the configuration author. - **connection_identifier**, **configuration_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users on the specified configurations. - **connection_identifier** and **org_identifiers**: Revokes refresh tokens for the specified Orgs. Applicable only for published connections. - **connection_identifier**, **org_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users in the specified Orgs. Applicable only for published connections.  **NOTE**: The `org_identifiers` parameter is only applicable for published connections. Using this parameter for unpublished connections will result in an error. Ensure that the connections are published before making the API request.      
     * @param connectionIdentifier Unique ID or name of the connection whose refresh tokens need to be revoked. All the users associated with the connection will have their refresh tokens revoked except the author.
     * @param revokeRefreshTokensRequest 
     */
    public revokeRefreshTokens(connectionIdentifier: string, revokeRefreshTokensRequest: RevokeRefreshTokensRequest, _options?: Configuration): Observable<RevokeRefreshTokensResponse> {
        const requestContextPromise = this.requestFactory.revokeRefreshTokens(connectionIdentifier, revokeRefreshTokensRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.revokeRefreshTokens(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth).   - `KEY_PAIR`: For connections that require Key Pair account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PKCE`: For connections that require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo  connections only.   - `EXTOAUTH_WITH_PKCE`: For connections that require External OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PEZ`: For connections that require OAuth With PEZ account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Amazon Redshift connections only.   - `OAUTH_WITH_SERVICE_PRINCIPAL`: For connections that require OAuth With Service Principal account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `PERSONAL_ACCESS_TOKEN`: For connections that require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `OAUTH_CLIENT_CREDENTIALS`: For connections that require OAuth Client Credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only. - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      
     * @param searchConnectionRequest 
     */
    public searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Observable<Array<SearchConnectionResponse>> {
        const requestContextPromise = this.requestFactory.searchConnection(searchConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchConnection(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateConnection(updateConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConnection(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`.        **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.     * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:    * This is an example of updating a single table in a empty connection:           ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"DEMORENAME\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"Col1\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col2\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col3\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col312\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col4\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```        * This is an example of updating a single table in an existing connection with tables:            ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"CUSTOMER\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [],                     \"relationships\": []                   },                   {                     \"name\": \"tpch5k_falcon_default_schema_users\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"user_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"product_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"user_cost\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```  3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.    **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not  specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.    * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a Snowflake connection:    ```    {       \"configuration\":{          \"accountName\":\"thoughtspot_partner\",          \"user\":\"tsadmin\",          \"password\":\"TestConn123\",          \"role\":\"sysadmin\",          \"warehouse\":\"MEDIUM_WH\"       },       \"externalDatabases\":[        ]    }    ```      
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request 
     */
    public updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateConnectionV2(connectionIdentifier, updateConnectionV2Request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConnectionV2(rsp)));
            }));
    }

}

import { CustomActionApiRequestFactory, CustomActionApiResponseProcessor} from "../apis/CustomActionApi";
export class ObservableCustomActionApi {
    private requestFactory: CustomActionApiRequestFactory;
    private responseProcessor: CustomActionApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomActionApiRequestFactory,
        responseProcessor?: CustomActionApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CustomActionApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CustomActionApiResponseProcessor();
    }

    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param createCustomActionRequest 
     */
    public createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Observable<ResponseCustomAction> {
        const requestContextPromise = this.requestFactory.createCustomAction(createCustomActionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createCustomAction(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    public deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteCustomAction(customActionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteCustomAction(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param searchCustomActionsRequest 
     */
    public searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Observable<Array<ResponseCustomAction>> {
        const requestContextPromise = this.requestFactory.searchCustomActions(searchCustomActionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCustomActions(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest 
     */
    public updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateCustomAction(rsp)));
            }));
    }

}

import { CustomCalendarsApiRequestFactory, CustomCalendarsApiResponseProcessor} from "../apis/CustomCalendarsApi";
export class ObservableCustomCalendarsApi {
    private requestFactory: CustomCalendarsApiRequestFactory;
    private responseProcessor: CustomCalendarsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomCalendarsApiRequestFactory,
        responseProcessor?: CustomCalendarsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CustomCalendarsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CustomCalendarsApiResponseProcessor();
    }

    /**
     *   Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - `FROM_EXISTING_TABLE` - Creates calendar from the table reference provided in the API request.  - `FROM_INPUT_PARAMS` - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * `MONTH_OFFSET`. The default calendar type. A `MONTH_OFFSET` calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the `month_offset` value is set as `April`, the calendar year begins in April.  * `4-4-5`. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * `4-5-4`. Each quarter in the calendar will include two 4-week months with a 5-week month between. * `5-4-4`. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the `MM/DD/YYYY` format. For `MONTH_OFFSET` calendars, ensure that the `start_date` matches the month specified in the `month_offset` attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_EXISTING_TABLE\", } ```  To create a calendar from scratch:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_INPUT_PARAMS\",   \"calendar_type\": \"MONTH_OFFSET\",   \"month_offset\": \"April\",   \"start_day_of_week\": \"Monday\",   \"quarter_name_prefix\": \"Q\",   \"year_name_prefix\": \"FY\",   \"start_date\": \"04/01/2025\",   \"end_date\": \"04/31/2025\" } ```      
     * @param createCalendarRequest 
     */
    public createCalendar(createCalendarRequest: CreateCalendarRequest, _options?: Configuration): Observable<CalendarResponse> {
        const requestContextPromise = this.requestFactory.createCalendar(createCalendarRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createCalendar(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        
     * @param calendarIdentifier Unique ID or name of the Calendar.
     */
    public deleteCalendar(calendarIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteCalendar(calendarIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteCalendar(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \"month offset\" calendars, the start date must match the month defined in the `month_offset` attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      
     * @param generateCSVRequest 
     */
    public generateCSV(generateCSVRequest: GenerateCSVRequest, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.generateCSV(generateCSVRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.generateCSV(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as `name_pattern` and `sort_options` as search filters.  The `name_pattern` parameter filters and returns only those objects that match the specified pattern. Use `%` as a wildcard for pattern matching.      
     * @param searchCalendarsRequest 
     */
    public searchCalendars(searchCalendarsRequest: SearchCalendarsRequest, _options?: Configuration): Observable<Array<CalendarResponse>> {
        const requestContextPromise = this.requestFactory.searchCalendars(searchCalendarsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCalendars(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * `FROM_INPUT_PARAMS` to update the calendar properties with the values defined in the API request. * `FROM_EXISTING_TABLE` Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  ``` {   \"update_method\": \"FROM_EXISTING_TABLE\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   } } ```  Update a custom calendar with the attributes defined in the API request:  ``` {   \"update_method\": \"FROM_INPUT_PARAMS\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   },   \"month_offset\": \"August\",   \"start_day_of_week\": \"Monday\",   \"start_date\": \"08/01/2025\",   \"end_date\": \"07/31/2026\" } ```      
     * @param calendarIdentifier Unique Id or name of the calendar.
     * @param updateCalendarRequest 
     */
    public updateCalendar(calendarIdentifier: string, updateCalendarRequest: UpdateCalendarRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateCalendar(calendarIdentifier, updateCalendarRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateCalendar(rsp)));
            }));
    }

}

import { DBTApiRequestFactory, DBTApiResponseProcessor} from "../apis/DBTApi";
export class ObservableDBTApi {
    private requestFactory: DBTApiRequestFactory;
    private responseProcessor: DBTApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DBTApiRequestFactory,
        responseProcessor?: DBTApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DBTApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DBTApiResponseProcessor();
    }

    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      
     * @param connectionName Name of the connection.
     * @param databaseName Name of the Database.
     * @param importType Mention type of Import
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD.
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD.
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD
     * @param dbtEnvId DBT Environment ID\\\&quot;
     * @param projectName Name of the project
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\&#39;ZIP_FILE\\\&#39;
     */
    public dbtConnection(connectionName: string, databaseName: string, importType?: string, accessToken?: string, dbtUrl?: string, accountId?: string, projectId?: string, dbtEnvId?: string, projectName?: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtConnection(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtConnectionIdentifier Unique ID of the DBT connection.
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
     */
    public dbtGenerateSyncTml(dbtConnectionIdentifier: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dbtGenerateSyncTml(dbtConnectionIdentifier, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtGenerateSyncTml(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      
     * @param dbtConnectionIdentifier Unique ID of the DBT connection.
     * @param modelTables List of Models and their respective Tables Example: \\\&#39;[{\\\&quot;model_name\\\&quot;: \\\&quot;model_name\\\&quot;, \\\&quot;tables\\\&quot;: [\\\&quot;table_name\\\&quot;]}]\\\&#39;
     * @param importWorksheets Mention the worksheet tmls to import
     * @param worksheets List of worksheets is mandatory when import_Worksheets is type SELECTED Example: [\\\&quot;worksheet_name\\\&quot;]
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
     */
    public dbtGenerateTml(dbtConnectionIdentifier: string, modelTables: string, importWorksheets: string, worksheets?: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dbtGenerateTml(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtGenerateTml(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      
     */
    public dbtSearch(_options?: Configuration): Observable<Array<DbtSearchResponse>> {
        const requestContextPromise = this.requestFactory.dbtSearch(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtSearch(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    public deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteDbtConnection(dbtConnectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteDbtConnection(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     * @param connectionName Name of the connection.
     * @param databaseName Name of the Database.
     * @param importType Mention type of Import
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD.
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD.
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD
     * @param dbtEnvId DBT Environment ID\\\&quot;
     * @param projectName Name of the project
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\&#39;ZIP_FILE\\\&#39;
     */
    public updateDbtConnection(dbtConnectionIdentifier: string, connectionName?: string, databaseName?: string, importType?: string, accessToken?: string, dbtUrl?: string, accountId?: string, projectId?: string, dbtEnvId?: string, projectName?: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.updateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateDbtConnection(rsp)));
            }));
    }

}

import { DataApiRequestFactory, DataApiResponseProcessor} from "../apis/DataApi";
export class ObservableDataApi {
    private requestFactory: DataApiRequestFactory;
    private responseProcessor: DataApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DataApiRequestFactory,
        responseProcessor?: DataApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DataApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DataApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     
     * @param fetchAnswerDataRequest 
     */
    public fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Observable<AnswerDataResponse> {
        const requestContextPromise = this.requestFactory.fetchAnswerData(fetchAnswerDataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchAnswerData(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     
     * @param fetchLiveboardDataRequest 
     */
    public fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Observable<LiveboardDataResponse> {
        const requestContextPromise = this.requestFactory.fetchLiveboardData(fetchLiveboardDataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchLiveboardData(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       
     * @param searchDataRequest 
     */
    public searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Observable<SearchDataResponse> {
        const requestContextPromise = this.requestFactory.searchData(searchDataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchData(rsp)));
            }));
    }

}

import { EmailCustomizationApiRequestFactory, EmailCustomizationApiResponseProcessor} from "../apis/EmailCustomizationApi";
export class ObservableEmailCustomizationApi {
    private requestFactory: EmailCustomizationApiRequestFactory;
    private responseProcessor: EmailCustomizationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EmailCustomizationApiRequestFactory,
        responseProcessor?: EmailCustomizationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EmailCustomizationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EmailCustomizationApiResponseProcessor();
    }

    /**
     *  Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",      \"cta_text_font_color\": \"#FFFFFF\",      \"primary_bg_color\": \"#D3DEF0\",       \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",      \"font_family\": \"\",      \"product_name\": \"ThoughtSpot\",      \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",      \"footer_phone\": \"(800) 508-7008\",       \"replacement_value_for_liveboard\": \"Dashboard\",      \"replacement_value_for_answer\": \"Chart\",      \"replacement_value_for_spot_iq\": \"AI Insights\",       \"hide_footer_phone\": false,       \"hide_footer_address\": false,       \"hide_product_name\": false,      \"hide_manage_notification\": false,      \"hide_mobile_app_nudge\": false,      \"hide_privacy_policy\": false,      \"hide_ts_vocabulary_definitions\": false,      \"hide_error_message\": false,      \"hide_unsubscribe_link\": false,       \"hide_notification_status\": false,      \"hide_modify_alert\": false,      \"company_website_url\": \"https://your-website.com/\",      \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",       \"contact_support_url\": \"https://link-to-contact-support.com/\",       \"hide_contact_support_url\": false   } } ```      
     * @param createEmailCustomizationRequest 
     */
    public createEmailCustomization(createEmailCustomizationRequest: CreateEmailCustomizationRequest, _options?: Configuration): Observable<CreateEmailCustomizationResponse> {
        const requestContextPromise = this.requestFactory.createEmailCustomization(createEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEmailCustomization(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `template_identifier` from the response. - Use that `template_identifier` as a parameter in this API request.      
     * @param templateIdentifier Unique ID or name of the email customization.
     */
    public deleteEmailCustomization(templateIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteEmailCustomization(templateIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteEmailCustomization(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `org_identifier` from the response. - Use that `org_identifier` as a parameter in this API request.      
     * @param deleteOrgEmailCustomizationRequest 
     */
    public deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest: DeleteOrgEmailCustomizationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteOrgEmailCustomization(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      
     * @param searchEmailCustomizationRequest 
     */
    public searchEmailCustomization(searchEmailCustomizationRequest: SearchEmailCustomizationRequest, _options?: Configuration): Observable<Array<CreateEmailCustomizationResponse>> {
        const requestContextPromise = this.requestFactory.searchEmailCustomization(searchEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchEmailCustomization(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",      \"cta_text_font_color\": \"#FFFFFF\",      \"primary_bg_color\": \"#D3DEF0\",       \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",      \"font_family\": \"\",      \"product_name\": \"ThoughtSpot\",      \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",      \"footer_phone\": \"(800) 508-7008\",       \"replacement_value_for_liveboard\": \"Dashboard\",      \"replacement_value_for_answer\": \"Chart\",      \"replacement_value_for_spot_iq\": \"AI Insights\",       \"hide_footer_phone\": false,       \"hide_footer_address\": false,       \"hide_product_name\": false,      \"hide_manage_notification\": false,      \"hide_mobile_app_nudge\": false,      \"hide_privacy_policy\": false,      \"hide_ts_vocabulary_definitions\": false,      \"hide_error_message\": false,      \"hide_unsubscribe_link\": false,       \"hide_notification_status\": false,      \"hide_modify_alert\": false,      \"company_website_url\": \"https://your-website.com/\",      \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",       \"contact_support_url\": \"https://link-to-contact-support.com/\",       \"hide_contact_support_url\": false   } } ```      
     * @param updateEmailCustomizationRequest 
     */
    public updateEmailCustomization(updateEmailCustomizationRequest: UpdateEmailCustomizationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateEmailCustomization(updateEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateEmailCustomization(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      
     */
    public validateEmailCustomization(_options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.validateEmailCustomization(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.validateEmailCustomization(rsp)));
            }));
    }

}

import { GroupsApiRequestFactory, GroupsApiResponseProcessor} from "../apis/GroupsApi";
export class ObservableGroupsApi {
    private requestFactory: GroupsApiRequestFactory;
    private responseProcessor: GroupsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: GroupsApiRequestFactory,
        responseProcessor?: GroupsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new GroupsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new GroupsApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     * @param createUserGroupRequest 
     */
    public createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Observable<UserGroupResponse> {
        const requestContextPromise = this.requestFactory.createUserGroup(createUserGroupRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createUserGroup(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.      
     * @param groupIdentifier GUID or name of the group.
     */
    public deleteUserGroup(groupIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteUserGroup(groupIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteUserGroup(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     * @param importUserGroupsRequest 
     */
    public importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Observable<ImportUserGroupsResponse> {
        const requestContextPromise = this.requestFactory.importUserGroups(importUserGroupsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importUserGroups(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchUserGroupsRequest 
     */
    public searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Observable<Array<UserGroupResponse>> {
        const requestContextPromise = this.requestFactory.searchUserGroups(searchUserGroupsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchUserGroups(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateUserGroup(rsp)));
            }));
    }

}

import { LogApiRequestFactory, LogApiResponseProcessor} from "../apis/LogApi";
export class ObservableLogApi {
    private requestFactory: LogApiRequestFactory;
    private responseProcessor: LogApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: LogApiRequestFactory,
        responseProcessor?: LogApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new LogApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new LogApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      
     * @param fetchLogsRequest 
     */
    public fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Observable<Array<LogResponse>> {
        const requestContextPromise = this.requestFactory.fetchLogs(fetchLogsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchLogs(rsp)));
            }));
    }

}

import { MetadataApiRequestFactory, MetadataApiResponseProcessor} from "../apis/MetadataApi";
export class ObservableMetadataApi {
    private requestFactory: MetadataApiRequestFactory;
    private responseProcessor: MetadataApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MetadataApiRequestFactory,
        responseProcessor?: MetadataApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MetadataApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MetadataApiResponseProcessor();
    }

    /**
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when `convert_all` is set to `false`.        - Leave empty or omit when `convert_all` is set to `true`.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when `convert_all` is set to `true` and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - `true`: Converts all Worksheets in the system, except those specified in `exclude_worksheet_ids`.        - `false`: Converts only the Worksheets listed in `worksheet_ids`.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - `true`: Applies conversion changes directly to ThoughtSpot.      - `false`: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting `convert_all` to `false` and specifying a small number of `worksheet_ids`.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use `apply_changes: false` to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets ```json {   \"worksheet_ids\": [\"guid1\", \"guid2\", \"guid3\"],   \"exclude_worksheet_ids\": [],   \"convert_all\": false,   \"apply_changes\": true } ```  ### Convert All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [],   \"convert_all\": true,   \"apply_changes\": true } ```  ### Exclude Specific Worksheets While Converting All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [\"abc\"],   \"convert_all\": true,   \"apply_changes\": true } ```     
     * @param convertWorksheetToModelRequest 
     */
    public convertWorksheetToModel(convertWorksheetToModelRequest: ConvertWorksheetToModelRequest, _options?: Configuration): Observable<ResponseWorksheetToModelConversion> {
        const requestContextPromise = this.requestFactory.convertWorksheetToModel(convertWorksheetToModelRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convertWorksheetToModel(rsp)));
            }));
    }

    /**
     *  Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest 
     */
    public copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Observable<ResponseCopyObject> {
        const requestContextPromise = this.requestFactory.copyObject(copyObjectRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.copyObject(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest 
     */
    public deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteMetadata(deleteMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteMetadata(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as `identifier`, and set the `type` as `FEEDBACK` in the `metadata` array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as `identifier`, set the `type` as `LOGIAL_TABLE` in the `metadata` array, and set `export_with_associated_feedbacks` in `export_options` to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest 
     */
    public exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Observable<Array<any>> {
        const requestContextPromise = this.requestFactory.exportMetadataTML(exportMetadataTMLRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportMetadataTML(rsp)));
            }));
    }

    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires `DATAMANAGEMENT` (**Can manage data**) and `USERMANAGEMENT` (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for `USER`, `GROUP`, and `ROLES` metadata types.  - `batch_offset` Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - `batch_size` Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - `edoc_format` Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - `export_dependent` Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - `all_orgs_override` Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest 
     */
    public exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.exportMetadataTMLBatched(exportMetadataTMLBatchedRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportMetadataTMLBatched(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      
     * @param fetchAnswerSqlQueryRequest 
     */
    public fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Observable<SqlQueryResponse> {
        const requestContextPromise = this.requestFactory.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchAnswerSqlQuery(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest 
     */
    public fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Observable<GetAsyncImportStatusResponse> {
        const requestContextPromise = this.requestFactory.fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchAsyncImportTaskStatus(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      
     * @param fetchLiveboardSqlQueryRequest 
     */
    public fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Observable<SqlQueryResponse> {
        const requestContextPromise = this.requestFactory.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchLiveboardSqlQuery(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest 
     */
    public importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Observable<Array<any>> {
        const requestContextPromise = this.requestFactory.importMetadataTML(importMetadataTMLRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importMetadataTML(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest 
     */
    public importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Observable<ImportEPackAsyncTaskStatus> {
        const requestContextPromise = this.requestFactory.importMetadataTMLAsync(importMetadataTMLAsyncRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importMetadataTMLAsync(rsp)));
            }));
    }

    /**
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be parameterized.  For Connection Config, the only supported field name is: * impersonate_user      
     * @param parameterizeMetadataRequest 
     */
    public parameterizeMetadata(parameterizeMetadataRequest: ParameterizeMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.parameterizeMetadata(parameterizeMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.parameterizeMetadata(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To filter metadata objects within type `LOGICAL_TABLE`, set the `subtypes` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE` & subtypes as `[WORKSHEET]`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use `include_discoverable_objects` as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the `liveboard_response_format` as V2. Default value is V1. - To retrieve only objects that are published, set the `include_only_published_objects` as true. Default value is false.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `subtypes` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` - `include_only_published_objects` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchMetadataRequest 
     */
    public searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Observable<Array<MetadataSearchResponse>> {
        const requestContextPromise = this.requestFactory.searchMetadata(searchMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchMetadata(rsp)));
            }));
    }

    /**
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be unparameterized.  For Connection Config, the only supported field name is: * impersonate_user      
     * @param unparameterizeMetadataRequest 
     */
    public unparameterizeMetadata(unparameterizeMetadataRequest: UnparameterizeMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.unparameterizeMetadata(unparameterizeMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.unparameterizeMetadata(rsp)));
            }));
    }

    /**
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either `identifier` or `obj_identifier`, but not both. Both fields cannot be empty.       - When `org_identifier` is set to `-1`, only the `identifier` value is accepted; `obj_identifier` is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide `org_guid` or `org_name` to uniquely identify the organization where changes need to be applied. .      - Provide `-1` if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the `obj_identifier` attribute. Only `text` will be allowed in attribute\'s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only `identifier` is given  ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"obj_identifier\": \"\",       \"type\": \"LOGICAL_COLUMN\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgGuid\" } ```  ### Only `obj_identifier` is given ```json {   \"headers_update\":   [     {       \"obj_identifier\": \"custom_object_id\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgName\" } ```  ### Executing update for all org `-1` ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```  ### Optional `type` is not provided ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```     
     * @param updateMetadataHeaderRequest 
     */
    public updateMetadataHeader(updateMetadataHeaderRequest: UpdateMetadataHeaderRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateMetadataHeader(updateMetadataHeaderRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateMetadataHeader(rsp)));
            }));
    }

    /**
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either `current_obj_id` alone OR use `metadata_identifier` with `type` (when needed).       - When using `metadata_identifier`, the `type` field is required if using a name instead of a GUID.       - The `new_obj_id` field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using `current_obj_id`, ensure it matches the existing object ID exactly.    - When using `metadata_identifier` with a name, ensure the `type` is specified correctly.    - Verify that the `new_obj_id` follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with GUID ```json {   \"metadata\": [     {       \"metadata_identifier\": \"01234567-89ab-cdef-0123-456789abcdef\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with name and type ```json {   \"metadata\": [     {       \"metadata_identifier\": \"My Answer\",       \"type\": \"ANSWER\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Multiple objects update ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id_1\",       \"new_obj_id\": \"new_object_id_1\"     },     {       \"metadata_identifier\": \"My Worksheet\",       \"type\": \"LOGICAL_TABLE\",       \"new_obj_id\": \"new_object_id_2\"     }   ] } ```      
     * @param updateMetadataObjIdRequest 
     */
    public updateMetadataObjId(updateMetadataObjIdRequest: UpdateMetadataObjIdRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateMetadataObjId(updateMetadataObjIdRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateMetadataObjId(rsp)));
            }));
    }

}

import { OrgsApiRequestFactory, OrgsApiResponseProcessor} from "../apis/OrgsApi";
export class ObservableOrgsApi {
    private requestFactory: OrgsApiRequestFactory;
    private responseProcessor: OrgsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: OrgsApiRequestFactory,
        responseProcessor?: OrgsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new OrgsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new OrgsApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param createOrgRequest 
     */
    public createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Observable<OrgResponse> {
        const requestContextPromise = this.requestFactory.createOrg(createOrgRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createOrg(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      
     * @param orgIdentifier ID or name of the Org
     */
    public deleteOrg(orgIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteOrg(orgIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteOrg(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param searchOrgsRequest 
     */
    public searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Observable<Array<OrgResponse>> {
        const requestContextPromise = this.requestFactory.searchOrgs(searchOrgsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchOrgs(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest 
     */
    public updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateOrg(orgIdentifier, updateOrgRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateOrg(rsp)));
            }));
    }

}

import { ReportsApiRequestFactory, ReportsApiResponseProcessor} from "../apis/ReportsApi";
export class ObservableReportsApi {
    private requestFactory: ReportsApiRequestFactory;
    private responseProcessor: ReportsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsApiRequestFactory,
        responseProcessor?: ReportsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ReportsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ReportsApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.       
     * @param exportAnswerReportRequest 
     */
    public exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Observable<HttpFile> {
        const requestContextPromise = this.requestFactory.exportAnswerReport(exportAnswerReportRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportAnswerReport(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF, PNG, CSV, or XLSX file format.  Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF exports, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are available for PNG exports. CSV and XLSX exports do not support customization options.  **NOTE**: The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).    **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in the PNG format in the resolution of your choice. To enable this on your instance, contact ThoughtSpot support. When this feature is enabled, the options `include_cover_page`,`include_filter_page` within the `png_options` will not be available for PNG exports.  **NOTE**: Starting with the ThoughtSpot Cloud 26.2.0.cl release, Liveboards can be exported in CSV format. All visualizations in the Liveboard can be exported as individual CSV files. If multiple visualizations are selected or if the entire Liveboard is exported, the output is returned as a .zip file containing the CSV files for each visualization.  **NOTE**: Starting with the ThoughtSpot Cloud 26.2.0.cl release, Liveboards can be exported in XLSX format. All selected visualizations are consolidated into a single Excel workbook (.xlsx), with each visualization placed in its own worksheet (tab). XLSX exports are limited to 255 worksheets (tabs) per workbook.      
     * @param exportLiveboardReportRequest 
     */
    public exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Observable<HttpFile> {
        const requestContextPromise = this.requestFactory.exportLiveboardReport(exportLiveboardReportRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportLiveboardReport(rsp)));
            }));
    }

}

import { RolesApiRequestFactory, RolesApiResponseProcessor} from "../apis/RolesApi";
export class ObservableRolesApi {
    private requestFactory: RolesApiRequestFactory;
    private responseProcessor: RolesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: RolesApiRequestFactory,
        responseProcessor?: RolesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new RolesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new RolesApiResponseProcessor();
    }

    /**
     *   Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param createRoleRequest 
     */
    public createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Observable<RoleResponse> {
        const requestContextPromise = this.requestFactory.createRole(createRoleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createRole(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role. ReadOnly roles cannot be deleted.
     */
    public deleteRole(roleIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteRole(roleIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteRole(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      
     * @param searchRolesRequest 
     */
    public searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Observable<Array<SearchRoleResponse>> {
        const requestContextPromise = this.requestFactory.searchRoles(searchRolesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchRoles(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest 
     */
    public updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Observable<RoleResponse> {
        const requestContextPromise = this.requestFactory.updateRole(roleIdentifier, updateRoleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateRole(rsp)));
            }));
    }

}

import { SchedulesApiRequestFactory, SchedulesApiResponseProcessor} from "../apis/SchedulesApi";
export class ObservableSchedulesApi {
    private requestFactory: SchedulesApiRequestFactory;
    private responseProcessor: SchedulesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: SchedulesApiRequestFactory,
        responseProcessor?: SchedulesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new SchedulesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new SchedulesApiResponseProcessor();
    }

    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If `PDF` is set as the `file_format`, enable `pdf_options` to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     
     * @param createScheduleRequest 
     */
    public createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Observable<ResponseSchedule> {
        const requestContextPromise = this.requestFactory.createSchedule(createScheduleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createSchedule(rsp)));
            }));
    }

    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.      
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    public deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteSchedule(scheduleIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteSchedule(rsp)));
            }));
    }

    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.      
     * @param searchSchedulesRequest 
     */
    public searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Observable<Array<ResponseSchedule>> {
        const requestContextPromise = this.requestFactory.searchSchedules(searchSchedulesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchSchedules(rsp)));
            }));
    }

    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest 
     */
    public updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateSchedule(rsp)));
            }));
    }

}

import { SecurityApiRequestFactory, SecurityApiResponseProcessor} from "../apis/SecurityApi";
export class ObservableSecurityApi {
    private requestFactory: SecurityApiRequestFactory;
    private responseProcessor: SecurityApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: SecurityApiRequestFactory,
        responseProcessor?: SecurityApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new SecurityApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new SecurityApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      
     * @param assignChangeAuthorRequest 
     */
    public assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.assignChangeAuthor(assignChangeAuthorRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.assignChangeAuthor(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either `identifier` (GUID or name) or `obj_identifier` (object ID) - At least one of `identifier` or `obj_identifier` must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables  #### Example request  ```json {   \"tables\": [     {       \"identifier\": \"table-guid\",       \"obj_identifier\": \"table-object-id\"     }   ] } ```  #### Response format  The API returns an array of `ColumnSecurityRuleResponse` objects wrapped in a `data` field. Each `ColumnSecurityRuleResponse` object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  ```json {   \"data\": [     {       \"guid\": \"table-guid\",       \"objId\": \"table-object-id\",       \"columnSecurityRules\": [         {           \"column\": {             \"id\": \"col_123\",             \"name\": \"Salary\"           },           \"groups\": [             {               \"id\": \"group_1\",               \"name\": \"HR Department\"             }           ],           \"sourceTableDetails\": {             \"id\": \"source-table-guid\",             \"name\": \"Employee_Data\"           }         }       ]     }   ] } ```     
     * @param fetchColumnSecurityRulesRequest 
     */
    public fetchColumnSecurityRules(fetchColumnSecurityRulesRequest: FetchColumnSecurityRulesRequest, _options?: Configuration): Observable<Array<ColumnSecurityRuleResponse>> {
        const requestContextPromise = this.requestFactory.fetchColumnSecurityRules(fetchColumnSecurityRulesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchColumnSecurityRules(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Observable<PermissionOfPrincipalsResponse> {
        const requestContextPromise = this.requestFactory.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchPermissionsOfPrincipals(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Observable<PermissionOfMetadataResponse> {
        const requestContextPromise = this.requestFactory.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchPermissionsOnMetadata(rsp)));
            }));
    }

    /**
     *  Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it\'s dependencies to the org admins of the orgs to which it is being published.      
     * @param publishMetadataRequest 
     */
    public publishMetadata(publishMetadataRequest: PublishMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.publishMetadata(publishMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.publishMetadata(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views * Connections  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.      
     * @param shareMetadataRequest 
     */
    public shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.shareMetadata(shareMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.shareMetadata(rsp)));
            }));
    }

    /**
     *  Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      
     * @param unpublishMetadataRequest 
     */
    public unpublishMetadata(unpublishMetadataRequest: UnpublishMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.unpublishMetadata(unpublishMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.unpublishMetadata(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \"all or none\" policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either `identifier` (GUID or name) or `obj_identifier` (object ID) - Use `clear_csr: true` to remove all column security rules from the table - For each column, specify the security rule using `column_security_rules` array - Use `is_unsecured: true` to mark a specific column as unprotected - Use `group_access` operations to manage group associations:   - `ADD`: Add groups to the column\'s access list   - `REMOVE`: Remove groups from the column\'s access list   - `REPLACE`: Replace all existing groups with the specified groups  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data (if RBAC is disabled) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  ```json {   \"identifier\": \"table-guid\",   \"obj_identifier\": \"table-object-id\",   \"clear_csr\": false,   \"column_security_rules\": [     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"ADD\",           \"group_identifiers\": [\"hr_group_id\", \"hr_group_name\", \"finance_group_id\"]         }       ]     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": true     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"REPLACE\",           \"group_identifiers\": [\"management_group_id\", \"management_group_name\"]         }       ]     }   ] } ```  #### Request Body Schema  - `identifier` (string, optional): GUID or name of the table for which we want to create column security rules - `obj_identifier` (string, optional): The object ID of the table - `clear_csr` (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - `column_security_rules` (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - `column_identifier` (string, required): Column identifier (col_id or name) - `is_unsecured` (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - `group_access` (array of objects, optional): Array of group operation objects  Each group operation object contains: - `operation` (string, required): Operation type - ADD, REMOVE, or REPLACE - `group_identifiers` (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column\'s access list - **REMOVE**: Removes the specified groups from the column\'s access list   - **REPLACE**: Replaces all existing groups with the specified groups      
     * @param updateColumnSecurityRulesRequest 
     */
    public updateColumnSecurityRules(updateColumnSecurityRulesRequest: UpdateColumnSecurityRulesRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateColumnSecurityRules(updateColumnSecurityRulesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateColumnSecurityRules(rsp)));
            }));
    }

}

import { SystemApiRequestFactory, SystemApiResponseProcessor} from "../apis/SystemApi";
export class ObservableSystemApi {
    private requestFactory: SystemApiRequestFactory;
    private responseProcessor: SystemApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: SystemApiRequestFactory,
        responseProcessor?: SystemApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new SystemApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new SystemApiResponseProcessor();
    }

    /**
     *  Version: 10.14.0.cl or later   Configure communication channel preferences. - Use `cluster_preferences` to update the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to specify Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      
     * @param configureCommunicationChannelPreferencesRequest 
     */
    public configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest: ConfigureCommunicationChannelPreferencesRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.configureCommunicationChannelPreferences(rsp)));
            }));
    }

    /**
     *  Version: 26.2.0.cl or later   Configure security settings for your ThoughtSpot application instance. - Use `cluster_preferences` to update cluster-level security settings including CORS whitelisted URLs, CSP settings, SAML redirect URLs, partitioned cookies, and non-embed access configuration. - Use `org_preferences` to configure Org-specific security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this allows configuring CORS and non-embed access settings specific to the Org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. Cluster-level SAML and script-src settings require `ADMINISTRATION` privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     
     * @param configureSecuritySettingsRequest 
     */
    public configureSecuritySettings(configureSecuritySettingsRequest: ConfigureSecuritySettingsRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.configureSecuritySettings(configureSecuritySettingsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.configureSecuritySettings(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      
     */
    public getSystemConfig(_options?: Configuration): Observable<SystemConfig> {
        const requestContextPromise = this.requestFactory.getSystemConfig(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getSystemConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemInformation(_options?: Configuration): Observable<SystemInfo> {
        const requestContextPromise = this.requestFactory.getSystemInformation(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getSystemInformation(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemOverrideInfo(_options?: Configuration): Observable<SystemOverrideInfo> {
        const requestContextPromise = this.requestFactory.getSystemOverrideInfo(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getSystemOverrideInfo(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Fetch communication channel preferences. - Use `cluster_preferences` to fetch the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to fetch any Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      
     * @param searchCommunicationChannelPreferencesRequest 
     */
    public searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest: SearchCommunicationChannelPreferencesRequest, _options?: Configuration): Observable<CommunicationChannelPreferencesResponse> {
        const requestContextPromise = this.requestFactory.searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCommunicationChannelPreferences(rsp)));
            }));
    }

    /**
     *  Version: 26.2.0.cl or later   Fetch security settings for your ThoughtSpot application instance. - Use `scope: CLUSTER` to retrieve cluster-level security settings, including CORS and CSP allowlists, SAML redirect URLs, and settings that control access to non-embedded pages. - Use `scope: ORG` to retrieve Org-level security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this returns CORS and non-embed access settings specific to the Org. - If `scope` is not specified, returns both cluster and Org-specific settings based on user privileges.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     
     * @param searchSecuritySettingsRequest 
     */
    public searchSecuritySettings(searchSecuritySettingsRequest: SearchSecuritySettingsRequest, _options?: Configuration): Observable<SecuritySettingsResponse> {
        const requestContextPromise = this.requestFactory.searchSecuritySettings(searchSecuritySettingsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchSecuritySettings(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.      
     * @param updateSystemConfigRequest 
     */
    public updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateSystemConfig(updateSystemConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateSystemConfig(rsp)));
            }));
    }

}

import { TagsApiRequestFactory, TagsApiResponseProcessor} from "../apis/TagsApi";
export class ObservableTagsApi {
    private requestFactory: TagsApiRequestFactory;
    private responseProcessor: TagsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: TagsApiRequestFactory,
        responseProcessor?: TagsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new TagsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new TagsApiResponseProcessor();
    }

    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.assignTag(assignTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.assignTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param createTagRequest 
     */
    public createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Observable<Tag> {
        const requestContextPromise = this.requestFactory.createTag(createTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public deleteTag(tagIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteTag(tagIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      
     * @param searchTagsRequest 
     */
    public searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Observable<Array<Tag>> {
        const requestContextPromise = this.requestFactory.searchTags(searchTagsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchTags(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.unassignTag(assignTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.unassignTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateTag(tagIdentifier, updateTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateTag(rsp)));
            }));
    }

}

import { ThoughtSpotRestApiRequestFactory, ThoughtSpotRestApiResponseProcessor} from "../apis/ThoughtSpotRestApi";
export class ObservableThoughtSpotRestApi {
    private requestFactory: ThoughtSpotRestApiRequestFactory;
    private responseProcessor: ThoughtSpotRestApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ThoughtSpotRestApiRequestFactory,
        responseProcessor?: ThoughtSpotRestApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ThoughtSpotRestApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ThoughtSpotRestApiResponseProcessor();
    }

    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      
     * @param activateUserRequest 
     */
    public activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Observable<User> {
        const requestContextPromise = this.requestFactory.activateUser(activateUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.activateUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      
     * @param assignChangeAuthorRequest 
     */
    public assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.assignChangeAuthor(assignChangeAuthorRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.assignChangeAuthor(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.assignTag(assignTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.assignTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param changeUserPasswordRequest 
     */
    public changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.changeUserPassword(changeUserPasswordRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.changeUserPassword(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitBranchRequest 
     */
    public commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Observable<CommitResponse> {
        const requestContextPromise = this.requestFactory.commitBranch(commitBranchRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.commitBranch(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Configure communication channel preferences. - Use `cluster_preferences` to update the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to specify Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      
     * @param configureCommunicationChannelPreferencesRequest 
     */
    public configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest: ConfigureCommunicationChannelPreferencesRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.configureCommunicationChannelPreferences(configureCommunicationChannelPreferencesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.configureCommunicationChannelPreferences(rsp)));
            }));
    }

    /**
     *  Version: 26.2.0.cl or later   Configure security settings for your ThoughtSpot application instance. - Use `cluster_preferences` to update cluster-level security settings including CORS whitelisted URLs, CSP settings, SAML redirect URLs, partitioned cookies, and non-embed access configuration. - Use `org_preferences` to configure Org-specific security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this allows configuring CORS and non-embed access settings specific to the Org.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. Cluster-level SAML and script-src settings require `ADMINISTRATION` privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     
     * @param configureSecuritySettingsRequest 
     */
    public configureSecuritySettings(configureSecuritySettingsRequest: ConfigureSecuritySettingsRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.configureSecuritySettings(configureSecuritySettingsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.configureSecuritySettings(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Gets connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines * To get a list of all configurations available in the ThoughtSpot system, send the API request with only the connection name or GUID in the request body. * To fetch details of a configuration object, specify the configuration object name or GUID.      
     * @param connectionConfigurationSearchRequest 
     */
    public connectionConfigurationSearch(connectionConfigurationSearchRequest: ConnectionConfigurationSearchRequest, _options?: Configuration): Observable<Array<ConnectionConfigurationResponse>> {
        const requestContextPromise = this.requestFactory.connectionConfigurationSearch(connectionConfigurationSearchRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.connectionConfigurationSearch(rsp)));
            }));
    }

    /**
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when `convert_all` is set to `false`.        - Leave empty or omit when `convert_all` is set to `true`.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when `convert_all` is set to `true` and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - `true`: Converts all Worksheets in the system, except those specified in `exclude_worksheet_ids`.        - `false`: Converts only the Worksheets listed in `worksheet_ids`.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - `true`: Applies conversion changes directly to ThoughtSpot.      - `false`: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting `convert_all` to `false` and specifying a small number of `worksheet_ids`.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use `apply_changes: false` to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets ```json {   \"worksheet_ids\": [\"guid1\", \"guid2\", \"guid3\"],   \"exclude_worksheet_ids\": [],   \"convert_all\": false,   \"apply_changes\": true } ```  ### Convert All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [],   \"convert_all\": true,   \"apply_changes\": true } ```  ### Exclude Specific Worksheets While Converting All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [\"abc\"],   \"convert_all\": true,   \"apply_changes\": true } ```     
     * @param convertWorksheetToModelRequest 
     */
    public convertWorksheetToModel(convertWorksheetToModelRequest: ConvertWorksheetToModelRequest, _options?: Configuration): Observable<ResponseWorksheetToModelConversion> {
        const requestContextPromise = this.requestFactory.convertWorksheetToModel(convertWorksheetToModelRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convertWorksheetToModel(rsp)));
            }));
    }

    /**
     *  Makes a copy of an Answer or Liveboard    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest 
     */
    public copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Observable<ResponseCopyObject> {
        const requestContextPromise = this.requestFactory.copyObject(copyObjectRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.copyObject(rsp)));
            }));
    }

    /**
     * Version: 10.13.0.cl or later 
     * @param createAgentConversationRequest 
     */
    public createAgentConversation(createAgentConversationRequest: CreateAgentConversationRequest, _options?: Configuration): Observable<AgentConversation> {
        const requestContextPromise = this.requestFactory.createAgentConversation(createAgentConversationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createAgentConversation(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Creates a new [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.   #### Usage guidelines  You can create a custom calendar from scratch or an existing Table in ThoughtSpot. For both methods of calendar creation, the following parameters are required:  * Name of the custom calendar. * Calendar creation method. To create a calendar from an existing table, specify the method:   - `FROM_EXISTING_TABLE` - Creates calendar from the table reference provided in the API request.  - `FROM_INPUT_PARAMS` - Creates a calendar from the parameters defined in the API request.  * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  **NOTE**: If you are creating a calendar from an existing table, ensure that the referenced table matches the required DDL for custom calendars. If the schema does not match, the API returns an error.  ##### Calendar type The API allows you to create the following types of calendars:  * `MONTH_OFFSET`. The default calendar type. A `MONTH_OFFSET` calendar is offset by a few months from the standard calendar months (January to December) and the year begins with the month defined in the request. For example, if the `month_offset` value is set as `April`, the calendar year begins in April.  * `4-4-5`. Each quarter in the calendar will include two 4-week months followed by one 5-week month. * `4-5-4`. Each quarter in the calendar will include two 4-week months with a 5-week month between. * `5-4-4`. Each quarter begins with a 5-week month, followed by two 4-week months.  To start and end the calendar on a specific date, specify the dates in the `MM/DD/YYYY` format. For `MONTH_OFFSET` calendars, ensure that the `start_date` matches the month specified in the `month_offset` attribute.  You can also set the starting day of the week and customize the prefixes for year and quarter labels.  #### Examples  To create a calendar from an existing table:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_EXISTING_TABLE\", } ```  To create a calendar from scratch:  ``` {   \"name\": \"MyCustomCalendar1\",   \"table_reference\": {     \"connection_identifier\": \"4db8ea22-2ff4-4224-b05a-26674717e468\",     \"table_name\": \"MyCalendarTable\",     \"database_name\": \"RETAILAPPAREL\",     \"schema_name\": \"PUBLIC\"   },   \"creation_method\": \"FROM_INPUT_PARAMS\",   \"calendar_type\": \"MONTH_OFFSET\",   \"month_offset\": \"April\",   \"start_day_of_week\": \"Monday\",   \"quarter_name_prefix\": \"Q\",   \"year_name_prefix\": \"FY\",   \"start_date\": \"04/01/2025\",   \"end_date\": \"04/31/2025\" } ```      
     * @param createCalendarRequest 
     */
    public createCalendar(createCalendarRequest: CreateCalendarRequest, _options?: Configuration): Observable<CalendarResponse> {
        const requestContextPromise = this.requestFactory.createCalendar(createCalendarRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createCalendar(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.      
     * @param createConfigRequest 
     */
    public createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Observable<RepoConfigObject> {
        const requestContextPromise = this.requestFactory.createConfig(createConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Observable<CreateConnectionResponse> {
        const requestContextPromise = this.requestFactory.createConnection(createConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConnection(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Creates an additional configuration to an existing connection to a data warehouse.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Usage guidelines   * A JSON map of configuration attributes in `configuration`. The following example shows the configuration attributes:   ```    {      \"user\":\"DEV_USER\",      \"password\":\"TestConn123\",      \"role\":\"DEV\",      \"warehouse\":\"DEV_WH\"     }   ```  * If the `policy_type` is `PRINCIPALS`, then `policy_principals` is a required field. * If the `policy_type` is `PROCESSES`, then `policy_processes` is a required field. * If the `policy_type` is `NO_POLICY`, then `policy_principals` and `policy_processes` are not required fields.  #### Parameterized Connection Support For parameterized connections that use OAuth authentication, only the same_as_parent and policy_process_options  attributes are allowed in the API request. These attributes are not applicable to connections that are not parameterized.       
     * @param createConnectionConfigurationRequest 
     */
    public createConnectionConfiguration(createConnectionConfigurationRequest: CreateConnectionConfigurationRequest, _options?: Configuration): Observable<ConnectionConfigurationResponse> {
        const requestContextPromise = this.requestFactory.createConnectionConfiguration(createConnectionConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConnectionConfiguration(rsp)));
            }));
    }

    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest 
     */
    public createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Observable<Conversation> {
        const requestContextPromise = this.requestFactory.createConversation(createConversationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConversation(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param createCustomActionRequest 
     */
    public createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Observable<ResponseCustomAction> {
        const requestContextPromise = this.requestFactory.createCustomAction(createCustomActionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createCustomAction(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Creates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To create a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",      \"cta_text_font_color\": \"#FFFFFF\",      \"primary_bg_color\": \"#D3DEF0\",       \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",      \"font_family\": \"\",      \"product_name\": \"ThoughtSpot\",      \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",      \"footer_phone\": \"(800) 508-7008\",       \"replacement_value_for_liveboard\": \"Dashboard\",      \"replacement_value_for_answer\": \"Chart\",      \"replacement_value_for_spot_iq\": \"AI Insights\",       \"hide_footer_phone\": false,       \"hide_footer_address\": false,       \"hide_product_name\": false,      \"hide_manage_notification\": false,      \"hide_mobile_app_nudge\": false,      \"hide_privacy_policy\": false,      \"hide_ts_vocabulary_definitions\": false,      \"hide_error_message\": false,      \"hide_unsubscribe_link\": false,       \"hide_notification_status\": false,      \"hide_modify_alert\": false,      \"company_website_url\": \"https://your-website.com/\",      \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",       \"contact_support_url\": \"https://link-to-contact-support.com/\",       \"hide_contact_support_url\": false   } } ```      
     * @param createEmailCustomizationRequest 
     */
    public createEmailCustomization(createEmailCustomizationRequest: CreateEmailCustomizationRequest, _options?: Configuration): Observable<CreateEmailCustomizationResponse> {
        const requestContextPromise = this.requestFactory.createEmailCustomization(createEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEmailCustomization(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param createOrgRequest 
     */
    public createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Observable<OrgResponse> {
        const requestContextPromise = this.requestFactory.createOrg(createOrgRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createOrg(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param createRoleRequest 
     */
    public createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Observable<RoleResponse> {
        const requestContextPromise = this.requestFactory.createRole(createRoleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createRole(rsp)));
            }));
    }

    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If `PDF` is set as the `file_format`, enable `pdf_options` to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     
     * @param createScheduleRequest 
     */
    public createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Observable<ResponseSchedule> {
        const requestContextPromise = this.requestFactory.createSchedule(createScheduleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createSchedule(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param createTagRequest 
     */
    public createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Observable<Tag> {
        const requestContextPromise = this.requestFactory.createTag(createTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param createUserRequest 
     */
    public createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Observable<User> {
        const requestContextPromise = this.requestFactory.createUser(createUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     * @param createUserGroupRequest 
     */
    public createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Observable<UserGroupResponse> {
        const requestContextPromise = this.requestFactory.createUserGroup(createUserGroupRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createUserGroup(rsp)));
            }));
    }

    /**
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.14.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this. * FORMULA_VARIABLE - For Formula variables, introduced in 10.15.0.cl  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The data type of the variable, only specify for formula variables (defaults to null)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid     
     * @param createVariableRequest 
     */
    public createVariable(createVariableRequest: CreateVariableRequest, _options?: Configuration): Observable<Variable> {
        const requestContextPromise = this.requestFactory.createVariable(createVariableRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createVariable(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param createWebhookConfigurationRequest 
     */
    public createWebhookConfiguration(createWebhookConfigurationRequest: CreateWebhookConfigurationRequest, _options?: Configuration): Observable<WebhookResponse> {
        const requestContextPromise = this.requestFactory.createWebhookConfiguration(createWebhookConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createWebhookConfiguration(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      
     * @param connectionName Name of the connection.
     * @param databaseName Name of the Database.
     * @param importType Mention type of Import
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD.
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD.
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD
     * @param dbtEnvId DBT Environment ID\\\&quot;
     * @param projectName Name of the project
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\&#39;ZIP_FILE\\\&#39;
     */
    public dbtConnection(connectionName: string, databaseName: string, importType?: string, accessToken?: string, dbtUrl?: string, accountId?: string, projectId?: string, dbtEnvId?: string, projectName?: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dbtConnection(connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtConnection(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtConnectionIdentifier Unique ID of the DBT connection.
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
     */
    public dbtGenerateSyncTml(dbtConnectionIdentifier: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dbtGenerateSyncTml(dbtConnectionIdentifier, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtGenerateSyncTml(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      
     * @param dbtConnectionIdentifier Unique ID of the DBT connection.
     * @param modelTables List of Models and their respective Tables Example: \\\&#39;[{\\\&quot;model_name\\\&quot;: \\\&quot;model_name\\\&quot;, \\\&quot;tables\\\&quot;: [\\\&quot;table_name\\\&quot;]}]\\\&#39;
     * @param importWorksheets Mention the worksheet tmls to import
     * @param worksheets List of worksheets is mandatory when import_Worksheets is type SELECTED Example: [\\\&quot;worksheet_name\\\&quot;]
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
     */
    public dbtGenerateTml(dbtConnectionIdentifier: string, modelTables: string, importWorksheets: string, worksheets?: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dbtGenerateTml(dbtConnectionIdentifier, modelTables, importWorksheets, worksheets, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtGenerateTml(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      
     */
    public dbtSearch(_options?: Configuration): Observable<Array<DbtSearchResponse>> {
        const requestContextPromise = this.requestFactory.dbtSearch(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dbtSearch(rsp)));
            }));
    }

    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      
     * @param deactivateUserRequest 
     */
    public deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Observable<ResponseActivationURL> {
        const requestContextPromise = this.requestFactory.deactivateUser(deactivateUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deactivateUser(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Deletes a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines To delete a custom calendar, specify the calendar ID as a path parameter in the request URL.        
     * @param calendarIdentifier Unique ID or name of the Calendar.
     */
    public deleteCalendar(calendarIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteCalendar(calendarIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteCalendar(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      
     * @param deleteConfigRequest 
     */
    public deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConfig(deleteConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     
     * @param deleteConnectionRequest 
     */
    public deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConnection(deleteConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConnection(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Deletes connection configuration objects.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param deleteConnectionConfigurationRequest 
     */
    public deleteConnectionConfiguration(deleteConnectionConfigurationRequest: DeleteConnectionConfigurationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConnectionConfiguration(deleteConnectionConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConnectionConfiguration(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    public deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConnectionV2(connectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConnectionV2(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    public deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteCustomAction(customActionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteCustomAction(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    public deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteDbtConnection(dbtConnectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteDbtConnection(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `template_identifier` from the response. - Use that `template_identifier` as a parameter in this API request.      
     * @param templateIdentifier Unique ID or name of the email customization.
     */
    public deleteEmailCustomization(templateIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteEmailCustomization(templateIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteEmailCustomization(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest 
     */
    public deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteMetadata(deleteMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteMetadata(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      
     * @param orgIdentifier ID or name of the Org
     */
    public deleteOrg(orgIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteOrg(orgIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteOrg(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Deletes the configuration for the email customization.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  - Call the search API endpoint to get the `org_identifier` from the response. - Use that `org_identifier` as a parameter in this API request.      
     * @param deleteOrgEmailCustomizationRequest 
     */
    public deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest: DeleteOrgEmailCustomizationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteOrgEmailCustomization(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role. ReadOnly roles cannot be deleted.
     */
    public deleteRole(roleIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteRole(roleIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteRole(rsp)));
            }));
    }

    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.      
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    public deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteSchedule(scheduleIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteSchedule(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public deleteTag(tagIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteTag(tagIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     */
    public deleteUser(userIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteUser(userIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.      
     * @param groupIdentifier GUID or name of the group.
     */
    public deleteUserGroup(groupIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteUserGroup(groupIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteUserGroup(rsp)));
            }));
    }

    /**
     *  Delete a variable   Version: 10.14.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn\'t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable
     */
    public deleteVariable(identifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteVariable(identifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteVariable(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param deleteWebhookConfigurationsRequest 
     */
    public deleteWebhookConfigurations(deleteWebhookConfigurationsRequest: DeleteWebhookConfigurationsRequest, _options?: Configuration): Observable<WebhookDeleteResponse> {
        const requestContextPromise = this.requestFactory.deleteWebhookConfigurations(deleteWebhookConfigurationsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteWebhookConfigurations(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param deployCommitRequest 
     */
    public deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Observable<Array<DeployResponse>> {
        const requestContextPromise = this.requestFactory.deployCommit(deployCommitRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deployCommit(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Observable<HttpFile> {
        const requestContextPromise = this.requestFactory.downloadConnectionMetadataChanges(connectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.downloadConnectionMetadataChanges(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.       
     * @param exportAnswerReportRequest 
     */
    public exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Observable<HttpFile> {
        const requestContextPromise = this.requestFactory.exportAnswerReport(exportAnswerReportRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportAnswerReport(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF, PNG, CSV, or XLSX file format.  Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF exports, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are available for PNG exports. CSV and XLSX exports do not support customization options.  **NOTE**: The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).    **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in the PNG format in the resolution of your choice. To enable this on your instance, contact ThoughtSpot support. When this feature is enabled, the options `include_cover_page`,`include_filter_page` within the `png_options` will not be available for PNG exports.  **NOTE**: Starting with the ThoughtSpot Cloud 26.2.0.cl release, Liveboards can be exported in CSV format. All visualizations in the Liveboard can be exported as individual CSV files. If multiple visualizations are selected or if the entire Liveboard is exported, the output is returned as a .zip file containing the CSV files for each visualization.  **NOTE**: Starting with the ThoughtSpot Cloud 26.2.0.cl release, Liveboards can be exported in XLSX format. All selected visualizations are consolidated into a single Excel workbook (.xlsx), with each visualization placed in its own worksheet (tab). XLSX exports are limited to 255 worksheets (tabs) per workbook.      
     * @param exportLiveboardReportRequest 
     */
    public exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Observable<HttpFile> {
        const requestContextPromise = this.requestFactory.exportLiveboardReport(exportLiveboardReportRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportLiveboardReport(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as `identifier`, and set the `type` as `FEEDBACK` in the `metadata` array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as `identifier`, set the `type` as `LOGIAL_TABLE` in the `metadata` array, and set `export_with_associated_feedbacks` in `export_options` to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest 
     */
    public exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Observable<Array<any>> {
        const requestContextPromise = this.requestFactory.exportMetadataTML(exportMetadataTMLRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportMetadataTML(rsp)));
            }));
    }

    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires `DATAMANAGEMENT` (**Can manage data**) and `USERMANAGEMENT` (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for `USER`, `GROUP`, and `ROLES` metadata types.  - `batch_offset` Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - `batch_size` Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - `edoc_format` Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - `export_dependent` Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - `all_orgs_override` Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest 
     */
    public exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.exportMetadataTMLBatched(exportMetadataTMLBatchedRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.exportMetadataTMLBatched(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     
     * @param fetchAnswerDataRequest 
     */
    public fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Observable<AnswerDataResponse> {
        const requestContextPromise = this.requestFactory.fetchAnswerData(fetchAnswerDataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchAnswerData(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      
     * @param fetchAnswerSqlQueryRequest 
     */
    public fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Observable<SqlQueryResponse> {
        const requestContextPromise = this.requestFactory.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchAnswerSqlQuery(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest 
     */
    public fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Observable<GetAsyncImportStatusResponse> {
        const requestContextPromise = this.requestFactory.fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchAsyncImportTaskStatus(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Fetches column security rules for specified tables.  This API endpoint retrieves column-level security rules configured for tables. It returns information about which columns are secured and which groups have access to those columns.  #### Usage guidelines  - Provide an array of table identifiers using either `identifier` (GUID or name) or `obj_identifier` (object ID) - At least one of `identifier` or `obj_identifier` must be provided for each table - The API returns column security rules for all specified tables - Users must have appropriate permissions to access security rules for the specified tables  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables  #### Example request  ```json {   \"tables\": [     {       \"identifier\": \"table-guid\",       \"obj_identifier\": \"table-object-id\"     }   ] } ```  #### Response format  The API returns an array of `ColumnSecurityRuleResponse` objects wrapped in a `data` field. Each `ColumnSecurityRuleResponse` object contains: - Table information (GUID and object ID)   - Array of column security rules with column details, group access, and source table information  #### Example response  ```json {   \"data\": [     {       \"guid\": \"table-guid\",       \"objId\": \"table-object-id\",       \"columnSecurityRules\": [         {           \"column\": {             \"id\": \"col_123\",             \"name\": \"Salary\"           },           \"groups\": [             {               \"id\": \"group_1\",               \"name\": \"HR Department\"             }           ],           \"sourceTableDetails\": {             \"id\": \"source-table-guid\",             \"name\": \"Employee_Data\"           }         }       ]     }   ] } ```     
     * @param fetchColumnSecurityRulesRequest 
     */
    public fetchColumnSecurityRules(fetchColumnSecurityRulesRequest: FetchColumnSecurityRulesRequest, _options?: Configuration): Observable<Array<ColumnSecurityRuleResponse>> {
        const requestContextPromise = this.requestFactory.fetchColumnSecurityRules(fetchColumnSecurityRulesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchColumnSecurityRules(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Observable<FetchConnectionDiffStatusResponse> {
        const requestContextPromise = this.requestFactory.fetchConnectionDiffStatus(connectionIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchConnectionDiffStatus(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     
     * @param fetchLiveboardDataRequest 
     */
    public fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Observable<LiveboardDataResponse> {
        const requestContextPromise = this.requestFactory.fetchLiveboardData(fetchLiveboardDataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchLiveboardData(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      
     * @param fetchLiveboardSqlQueryRequest 
     */
    public fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Observable<SqlQueryResponse> {
        const requestContextPromise = this.requestFactory.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchLiveboardSqlQuery(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      
     * @param fetchLogsRequest 
     */
    public fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Observable<Array<LogResponse>> {
        const requestContextPromise = this.requestFactory.fetchLogs(fetchLogsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchLogs(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Observable<PermissionOfPrincipalsResponse> {
        const requestContextPromise = this.requestFactory.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchPermissionsOfPrincipals(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Observable<PermissionOfMetadataResponse> {
        const requestContextPromise = this.requestFactory.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.fetchPermissionsOnMetadata(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param forceLogoutUsersRequest 
     */
    public forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.forceLogoutUsers(forceLogoutUsersRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.forceLogoutUsers(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Exports a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  Use this API to download a custom calendar in the CSV file format. In your API request, specify the following parameters.  * Start and end date of the calendar. For \"month offset\" calendars, the start date must match the month defined in the `month_offset` attribute.  You can also specify optional parameters such as the starting day of the week and prefixes for the quarter and year labels.      
     * @param generateCSVRequest 
     */
    public generateCSV(generateCSVRequest: GenerateCSVRequest, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.generateCSV(generateCSVRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.generateCSV(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Retrieves details of the current user session for the token provided in the request header.  Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.     
     */
    public getCurrentUserInfo(_options?: Configuration): Observable<User> {
        const requestContextPromise = this.requestFactory.getCurrentUserInfo(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCurrentUserInfo(rsp)));
            }));
    }

    /**
     *   Version: 9.4.0.cl or later   Retrieves details of the current session token for the bearer token provided in the request header.  This API endpoint does not create a new token. Instead, it returns details about the token, including the token string, creation time, expiration time, and the associated user.  Use this endpoint to introspect your current session token, debug authentication issues, or when a frontend application needs session token details.  Any ThoughtSpot user with a valid bearer token can access this endpoint and send an API request      
     */
    public getCurrentUserToken(_options?: Configuration): Observable<GetTokenResponse> {
        const requestContextPromise = this.requestFactory.getCurrentUserToken(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCurrentUserToken(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  Specify the object type as `LOGICAL_TABLE`.   For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values. If `auto_create` is set to `true`, it won\'t create formula variables and hence won\'t be applicable for `variable_values`.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.  ##### Formula Variables Before using variables_values, variables must be created using Create Variable API with type as Formula_Variable (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used when variable_values are provided in the request. If you are working with variable_values, you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do not pass any variable_values. In such cases, variable_values will remain unaffected. When using object_id with variable_values, models are supported.      
     * @param getCustomAccessTokenRequest 
     */
    public getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Observable<AccessToken> {
        const requestContextPromise = this.requestFactory.getCustomAccessToken(getCustomAccessTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getCustomAccessToken(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   Provides relevant data source recommendations for a user-submitted natural language query.  To use this API, the user must have at least view-level access to the underlying metadata entities referenced in the response.  #### Usage guidelines  The request must include a `query` string via the request body.  The returned results include metadata such as: - `confidence`: a float indicating the model\'s confidence in the relevance of each recommendation - `details`: includes `data_source_identifier`, `data_source_name`, and `description` of each recommended data source - `reasoning`: rationale provided by the LLM to explain why each data source was recommended  If the API request is successful, ThoughtSpot returns a ranked list of data sources, each annotated with relevant reasoning.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before it is made Generally Available. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster.      
     * @param getDataSourceSuggestionsRequest 
     */
    public getDataSourceSuggestions(getDataSourceSuggestionsRequest: GetDataSourceSuggestionsRequest, _options?: Configuration): Observable<EurekaDataSourceSuggestionResponse> {
        const requestContextPromise = this.requestFactory.getDataSourceSuggestions(getDataSourceSuggestionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getDataSourceSuggestions(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getFullAccessTokenRequest 
     */
    public getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Observable<Token> {
        const requestContextPromise = this.requestFactory.getFullAccessToken(getFullAccessTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getFullAccessToken(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to retrieve existing natural language (NL) instructions for a specific data-model. These instructions guide the AI system in understanding data context and generating more accurate responses when processing natural language queries.  #### Usage guidelines  To retrieve NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID of the data-model to retrieve NL instructions  The API returns a response object with: - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for natural language processing   - `scope`: The scope of the instruction (`GLOBAL`). It can be extended to data-model-user scope in future.  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally across the system on the given data-model (currently only global instructions are supported)  > ###### Note: > * To use this API, the user needs atleast view access on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Use this API to view currently configured instructions before modifying them with `setNLInstructions`.     
     * @param getNLInstructionsRequest 
     */
    public getNLInstructions(getNLInstructionsRequest: GetNLInstructionsRequest, _options?: Configuration): Observable<EurekaGetNLInstructionsResponse> {
        const requestContextPromise = this.requestFactory.getNLInstructions(getNLInstructionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getNLInstructions(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getObjectAccessTokenRequest 
     */
    public getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Observable<Token> {
        const requestContextPromise = this.requestFactory.getObjectAccessToken(getObjectAccessTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getObjectAccessToken(rsp)));
            }));
    }

    /**
     *  Version: 10.13.0.cl or later   Breaks down a user-submitted query into a series of analytical sub-questions using relevant contextual metadata.  To use this API, the user must have at least view-level access to the referenced metadata objects.  #### Usage guidelines  To accurately generate relevant questions, the request must include at least one of the following metadata identifiers within `metadata_context` : `conversation_identifier`, `answer_identifiers`, `liveboard_identifiers`, or `data_source_identifiers`.  You can further enhance the quality and precision of breakdown by providing additional `ai_context` such as:  - `content`: User provided content like text data, csv data as a string message to provide context & potentially improve the quality of the response. - `instructions`: User specific text instructions sent to AI system for processing the query.  Additional optional parameters include:  - `limit_relevant_questions`: Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. - `bypass_cache`: If set to true, forces fresh computation instead of returning cached results.  If the API request is successful, ThoughtSpot returns a list of relevant analytical queries, each aligned with the user\'s original question. Each returned question includes the query string, along with the identifier and name of the corresponding data source.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     
     * @param getRelevantQuestionsRequest 
     */
    public getRelevantQuestions(getRelevantQuestionsRequest: GetRelevantQuestionsRequest, _options?: Configuration): Observable<EurekaGetRelevantQuestionsResponse> {
        const requestContextPromise = this.requestFactory.getRelevantQuestions(getRelevantQuestionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRelevantQuestions(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      
     */
    public getSystemConfig(_options?: Configuration): Observable<SystemConfig> {
        const requestContextPromise = this.requestFactory.getSystemConfig(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getSystemConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemInformation(_options?: Configuration): Observable<SystemInfo> {
        const requestContextPromise = this.requestFactory.getSystemInformation(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getSystemInformation(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemOverrideInfo(_options?: Configuration): Observable<SystemOverrideInfo> {
        const requestContextPromise = this.requestFactory.getSystemOverrideInfo(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getSystemOverrideInfo(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest 
     */
    public importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Observable<Array<any>> {
        const requestContextPromise = this.requestFactory.importMetadataTML(importMetadataTMLRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importMetadataTML(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest 
     */
    public importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Observable<ImportEPackAsyncTaskStatus> {
        const requestContextPromise = this.requestFactory.importMetadataTMLAsync(importMetadataTMLAsyncRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importMetadataTMLAsync(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     * @param importUserGroupsRequest 
     */
    public importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Observable<ImportUserGroupsResponse> {
        const requestContextPromise = this.requestFactory.importUserGroups(importUserGroupsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importUserGroups(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param importUsersRequest 
     */
    public importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Observable<ImportUsersResponse> {
        const requestContextPromise = this.requestFactory.importUsers(importUsersRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importUsers(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     
     * @param loginRequest 
     */
    public login(loginRequest: LoginRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.login(loginRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.login(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.      
     */
    public logout(_options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.logout(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.logout(rsp)));
            }));
    }

    /**
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be parameterized.  For Connection Config, the only supported field name is: * impersonate_user      
     * @param parameterizeMetadataRequest 
     */
    public parameterizeMetadata(parameterizeMetadataRequest: ParameterizeMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.parameterizeMetadata(parameterizeMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.parameterizeMetadata(rsp)));
            }));
    }

    /**
     *  Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it\'s dependencies to the org admins of the orgs to which it is being published.      
     * @param publishMetadataRequest 
     */
    public publishMetadata(publishMetadataRequest: PublishMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.publishMetadata(publishMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.publishMetadata(rsp)));
            }));
    }

    /**
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest 
     */
    public queryGetDecomposedQuery(queryGetDecomposedQueryRequest: QueryGetDecomposedQueryRequest, _options?: Configuration): Observable<EurekaDecomposeQueryResponse> {
        const requestContextPromise = this.requestFactory.queryGetDecomposedQuery(queryGetDecomposedQueryRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.queryGetDecomposedQuery(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param resetUserPasswordRequest 
     */
    public resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.resetUserPassword(resetUserPasswordRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.resetUserPassword(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest 
     */
    public revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Observable<RevertResponse> {
        const requestContextPromise = this.requestFactory.revertCommit(commitId, revertCommitRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.revertCommit(rsp)));
            }));
    }

    /**
     *   Version: 26.2.0.cl or later   Revokes OAuth refresh tokens for users who no longer require access to a data warehouse connection. When a token is revoked, the affected user\'s session for that connection is terminated, and they must re-authenticate to regain access.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on the ThoughtSpot instance, users with `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege can also make API requests to revoke tokens for connection users.  #### Usage guidelines  You can specify different combinations of identifiers to control which refresh tokens are revoked.  - **connection_identifier**: Revokes refresh tokens for all users of the connection, except the connection author. - **connection_identifier** and **user_identifiers**: Revokes refresh tokens only for the users specified in the request. If the name or ID of the connection author is included in the request, their token will also be revoked. - **connection_identifier** and **configuration_identifiers**: Revokes refresh tokens for all users on the specified configurations, except the configuration author. - **connection_identifier**, **configuration_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users on the specified configurations. - **connection_identifier** and **org_identifiers**: Revokes refresh tokens for the specified Orgs. Applicable only for published connections. - **connection_identifier**, **org_identifiers**, and **user_identifiers**: Revokes refresh tokens for the specified users in the specified Orgs. Applicable only for published connections.  **NOTE**: The `org_identifiers` parameter is only applicable for published connections. Using this parameter for unpublished connections will result in an error. Ensure that the connections are published before making the API request.      
     * @param connectionIdentifier Unique ID or name of the connection whose refresh tokens need to be revoked. All the users associated with the connection will have their refresh tokens revoked except the author.
     * @param revokeRefreshTokensRequest 
     */
    public revokeRefreshTokens(connectionIdentifier: string, revokeRefreshTokensRequest: RevokeRefreshTokensRequest, _options?: Configuration): Observable<RevokeRefreshTokensResponse> {
        const requestContextPromise = this.requestFactory.revokeRefreshTokens(connectionIdentifier, revokeRefreshTokensRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.revokeRefreshTokens(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param revokeTokenRequest 
     */
    public revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.revokeToken(revokeTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.revokeToken(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Gets a list of [custom calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  By default, the API returns a list of custom calendars for all connection objects. To retrieve custom calendar details for a particular connection, specify the connection ID. You can also use other search parameters such as `name_pattern` and `sort_options` as search filters.  The `name_pattern` parameter filters and returns only those objects that match the specified pattern. Use `%` as a wildcard for pattern matching.      
     * @param searchCalendarsRequest 
     */
    public searchCalendars(searchCalendarsRequest: SearchCalendarsRequest, _options?: Configuration): Observable<Array<CalendarResponse>> {
        const requestContextPromise = this.requestFactory.searchCalendars(searchCalendarsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCalendars(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param searchCommitsRequest 
     */
    public searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Observable<Array<CommitHistoryResponse>> {
        const requestContextPromise = this.requestFactory.searchCommits(searchCommitsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCommits(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Fetch communication channel preferences. - Use `cluster_preferences` to fetch the default preferences for your ThoughtSpot application instance. - If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use `org_preferences` to fetch any Org-specific preferences that override the defaults.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege are also authorized to perform this action.      
     * @param searchCommunicationChannelPreferencesRequest 
     */
    public searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest: SearchCommunicationChannelPreferencesRequest, _options?: Configuration): Observable<CommunicationChannelPreferencesResponse> {
        const requestContextPromise = this.requestFactory.searchCommunicationChannelPreferences(searchCommunicationChannelPreferencesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCommunicationChannelPreferences(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      
     * @param searchConfigRequest 
     */
    public searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Observable<Array<RepoConfigObject>> {
        const requestContextPromise = this.requestFactory.searchConfig(searchConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth).   - `KEY_PAIR`: For connections that require Key Pair account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PKCE`: For connections that require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo  connections only.   - `EXTOAUTH_WITH_PKCE`: For connections that require External OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only.   - `OAUTH_WITH_PEZ`: For connections that require OAuth With PEZ account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Amazon Redshift connections only.   - `OAUTH_WITH_SERVICE_PRINCIPAL`: For connections that require OAuth With Service Principal account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `PERSONAL_ACCESS_TOKEN`: For connections that require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Databricks connections only.   - `OAUTH_CLIENT_CREDENTIALS`: For connections that require OAuth Client Credentials to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is supported on Snowflake connections only. - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      
     * @param searchConnectionRequest 
     */
    public searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Observable<Array<SearchConnectionResponse>> {
        const requestContextPromise = this.requestFactory.searchConnection(searchConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchConnection(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param searchCustomActionsRequest 
     */
    public searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Observable<Array<ResponseCustomAction>> {
        const requestContextPromise = this.requestFactory.searchCustomActions(searchCustomActionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCustomActions(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       
     * @param searchDataRequest 
     */
    public searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Observable<SearchDataResponse> {
        const requestContextPromise = this.requestFactory.searchData(searchDataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchData(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Search the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      
     * @param searchEmailCustomizationRequest 
     */
    public searchEmailCustomization(searchEmailCustomizationRequest: SearchEmailCustomizationRequest, _options?: Configuration): Observable<Array<CreateEmailCustomizationResponse>> {
        const requestContextPromise = this.requestFactory.searchEmailCustomization(searchEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchEmailCustomization(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To filter metadata objects within type `LOGICAL_TABLE`, set the `subtypes` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE` & subtypes as `[WORKSHEET]`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use `include_discoverable_objects` as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the `liveboard_response_format` as V2. Default value is V1. - To retrieve only objects that are published, set the `include_only_published_objects` as true. Default value is false.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `subtypes` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` - `include_only_published_objects` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchMetadataRequest 
     */
    public searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Observable<Array<MetadataSearchResponse>> {
        const requestContextPromise = this.requestFactory.searchMetadata(searchMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchMetadata(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param searchOrgsRequest 
     */
    public searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Observable<Array<OrgResponse>> {
        const requestContextPromise = this.requestFactory.searchOrgs(searchOrgsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchOrgs(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      
     * @param searchRolesRequest 
     */
    public searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Observable<Array<SearchRoleResponse>> {
        const requestContextPromise = this.requestFactory.searchRoles(searchRolesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchRoles(rsp)));
            }));
    }

    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.      
     * @param searchSchedulesRequest 
     */
    public searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Observable<Array<ResponseSchedule>> {
        const requestContextPromise = this.requestFactory.searchSchedules(searchSchedulesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchSchedules(rsp)));
            }));
    }

    /**
     *  Version: 26.2.0.cl or later   Fetch security settings for your ThoughtSpot application instance. - Use `scope: CLUSTER` to retrieve cluster-level security settings, including CORS and CSP allowlists, SAML redirect URLs, and settings that control access to non-embedded pages. - Use `scope: ORG` to retrieve Org-level security settings. If your instance has [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), this returns CORS and non-embed access settings specific to the Org. - If `scope` is not specified, returns both cluster and Org-specific settings based on user privileges.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. See [Security Settings](https://developers.thoughtspot.com/docs/security-settings) for more details.     
     * @param searchSecuritySettingsRequest 
     */
    public searchSecuritySettings(searchSecuritySettingsRequest: SearchSecuritySettingsRequest, _options?: Configuration): Observable<SecuritySettingsResponse> {
        const requestContextPromise = this.requestFactory.searchSecuritySettings(searchSecuritySettingsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchSecuritySettings(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      
     * @param searchTagsRequest 
     */
    public searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Observable<Array<Tag>> {
        const requestContextPromise = this.requestFactory.searchTags(searchTagsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchTags(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchUserGroupsRequest 
     */
    public searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Observable<Array<UserGroupResponse>> {
        const requestContextPromise = this.requestFactory.searchUserGroups(searchUserGroupsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchUserGroups(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.      
     * @param searchUsersRequest 
     */
    public searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Observable<Array<User>> {
        const requestContextPromise = this.requestFactory.searchUsers(searchUsersRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchUsers(rsp)));
            }));
    }

    /**
     *  Search variables   Version: 10.14.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values  The values can be filtered by scope: * org_identifier * principal_identifier * model_identifier      
     * @param searchVariablesRequest 
     */
    public searchVariables(searchVariablesRequest: SearchVariablesRequest, _options?: Configuration): Observable<Array<Variable>> {
        const requestContextPromise = this.requestFactory.searchVariables(searchVariablesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchVariables(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param searchWebhookConfigurationsRequest 
     */
    public searchWebhookConfigurations(searchWebhookConfigurationsRequest: SearchWebhookConfigurationsRequest, _options?: Configuration): Observable<WebhookSearchResponse> {
        const requestContextPromise = this.requestFactory.searchWebhookConfigurations(searchWebhookConfigurationsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchWebhookConfigurations(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  The API returns a array of object with a type, message, and metadata. - `type`: Type of the message — text, answer, or error. - `message`: Main content of the response. - `metadata`: Additional info depending on the message type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.     
     * @param conversationIdentifier Unique identifier for the conversation (used to track context)
     * @param sendAgentMessageRequest 
     */
    public sendAgentMessage(conversationIdentifier: string, sendAgentMessageRequest: SendAgentMessageRequest, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.sendAgentMessage(conversationIdentifier, sendAgentMessageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sendAgentMessage(rsp)));
            }));
    }

    /**
     *  Version: 10.13.0.cl or later   This API allows users to initiate or continue an agent (Spotter) conversation by submitting one or more natural language messages.  To use this API, the user must have access to the relevant conversational session (via conversation_identifier) and submit at least one message.   #### Usage guidelines  To initiate or continue a conversation, the request must include: - `conversation_identifier`: a unique session ID for continuity and message tracking - `messages`: an array of one or more text messages, each with a value and type  Additionally, user can specify what tool can be included `conversation_settings` parameter, which supports: - `enable_contextual_change_analysis` (default: false) - `enable_natural_language_answer_generation` (default: true) - `enable_reasoning` (default: false)  If the request is valid, the API returns a stream of messages in real time, including: - `ack`: confirms receipt of the request - `text / text-chunk`: content chunks, optionally formatted (e.g., markdown) - `answer`: the final structured response with metadata and analytics - `error`: if a failure occurs - `notification`: notification messages for operation being performed  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster. > * The streaming protocol uses Server-Sent Events (SSE)     
     * @param sendAgentMessageStreamingRequest 
     */
    public sendAgentMessageStreaming(sendAgentMessageStreamingRequest: SendAgentMessageStreamingRequest, _options?: Configuration): Observable<SendAgentMessageResponse> {
        const requestContextPromise = this.requestFactory.sendAgentMessageStreaming(sendAgentMessageStreamingRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sendAgentMessageStreaming(rsp)));
            }));
    }

    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest 
     */
    public sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Observable<Array<ResponseMessage>> {
        const requestContextPromise = this.requestFactory.sendMessage(conversationIdentifier, sendMessageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.sendMessage(rsp)));
            }));
    }

    /**
     *  Version: 10.15.0.cl or later   This API allows users to set natural language (NL) instructions for a specific data-model to improve AI-generated answers and query processing. These instructions help guide the AI system to better understand the data context and provide more accurate responses.  #### Usage guidelines  To set NL instructions for a data-model, the request must include: - `data_source_identifier`: The unique ID of the data-model for which to set NL instructions - `nl_instructions_info`: An array of instruction objects, each containing:   - `instructions`: Array of text instructions for the LLM   - `scope`: The scope of the instruction (`GLOBAL`). Currently only `GLOBAL` is supported. It can be extended to data-model-user scope in future.  The API returns a response object with: - `success`: Boolean indicating whether the operation was successful  #### Instructions Scope  - **GLOBAL**: Instructions that apply globally for that data-model across the system  > ###### Note: > * To use this API, the user needs either edit access or SPOTTER_COACHING_PRIVILEGE on the data-model and they must use corresponding org related bearerToken where the data-model exists. > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * Available from version 10.15.0.cl and later. > * This endpoint requires Spotter — please contact ThoughtSpot Support to enable Spotter on your cluster. > * Instructions help improve the accuracy and relevance of AI-generated responses for the specified data-model.      
     * @param setNLInstructionsRequest 
     */
    public setNLInstructions(setNLInstructionsRequest: SetNLInstructionsRequest, _options?: Configuration): Observable<EurekaSetNLInstructionsResponse> {
        const requestContextPromise = this.requestFactory.setNLInstructions(setNLInstructionsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.setNLInstructions(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views * Connections  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.      
     * @param shareMetadataRequest 
     */
    public shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.shareMetadata(shareMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.shareMetadata(rsp)));
            }));
    }

    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest 
     */
    public singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Observable<ResponseMessage> {
        const requestContextPromise = this.requestFactory.singleAnswer(singleAnswerRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.singleAnswer(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.unassignTag(assignTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.unassignTag(rsp)));
            }));
    }

    /**
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections * Connection Configs  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection or Connection Config, the field type is always `CONNECTION_PROPERTY`. In this case, field_name specifies the exact property of the Connection or Connection Config that needs to be unparameterized.  For Connection Config, the only supported field name is: * impersonate_user      
     * @param unparameterizeMetadataRequest 
     */
    public unparameterizeMetadata(unparameterizeMetadataRequest: UnparameterizeMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.unparameterizeMetadata(unparameterizeMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.unparameterizeMetadata(rsp)));
            }));
    }

    /**
     *  Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      
     * @param unpublishMetadataRequest 
     */
    public unpublishMetadata(unpublishMetadataRequest: UnpublishMetadataRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.unpublishMetadata(unpublishMetadataRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.unpublishMetadata(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Updates the properties of a [custom calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal).  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot instance, the `CAN_MANAGE_CUSTOM_CALENDAR` (**Can manage custom calendars**) privilege is required.  #### Usage guidelines  You can update the properties of a calendar using one of the following methods: * `FROM_INPUT_PARAMS` to update the calendar properties with the values defined in the API request. * `FROM_EXISTING_TABLE` Creates a calendar from the parameters defined in the API request.  To update a custom calendar, specify the calendar ID as a path parameter in the request URL and the following parameters in the request body:    * Connection ID and Table name * Database and schema name attributes:   For most Cloud Data Warehouse (CDW) connectors, both `database_name` and `schema_name` attributes are required.     However, the attribute requirements are conditional and vary based on the connector type and its metadata structure. For example, for connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL, the `schema_name` is required, whereas the `database_name` attribute is not.   Similarly, connectors such as ClickHouse require you to specify the `database_name` and the schema specification in such cases is optional.  The API allows you to modify the calendar type, month offset value, start and end date, starting day of the week, and prefixes assigned to the year and quarter labels.     #### Examples  Update a custom calendar using an existing Table in ThoughtSpot:  ``` {   \"update_method\": \"FROM_EXISTING_TABLE\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   } } ```  Update a custom calendar with the attributes defined in the API request:  ``` {   \"update_method\": \"FROM_INPUT_PARAMS\",   \"table_reference\": {     \"connection_identifier\": \"Connection1\",     \"database_name\": \"db1\",     \"table_name\": \"custom_calendar_2025\",     \"schame_name\": \"schemaVar\"   },   \"month_offset\": \"August\",   \"start_day_of_week\": \"Monday\",   \"start_date\": \"08/01/2025\",   \"end_date\": \"07/31/2026\" } ```      
     * @param calendarIdentifier Unique Id or name of the calendar.
     * @param updateCalendarRequest 
     */
    public updateCalendar(calendarIdentifier: string, updateCalendarRequest: UpdateCalendarRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateCalendar(calendarIdentifier, updateCalendarRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateCalendar(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Creates, updates, or deletes column security rules for specified tables.  This API endpoint allows you to create, update, or delete column-level security rules on columns of a table. The operation follows an \"all or none\" policy: if defining security rules for any of the provided columns fails, the entire operation will be rolled back, and no rules will be created.  #### Usage guidelines  - Provide table identifier using either `identifier` (GUID or name) or `obj_identifier` (object ID) - Use `clear_csr: true` to remove all column security rules from the table - For each column, specify the security rule using `column_security_rules` array - Use `is_unsecured: true` to mark a specific column as unprotected - Use `group_access` operations to manage group associations:   - `ADD`: Add groups to the column\'s access list   - `REMOVE`: Remove groups from the column\'s access list   - `REPLACE`: Replace all existing groups with the specified groups  #### Required permissions  - `ADMINISTRATION` - Can administer ThoughtSpot - `DATAMANAGEMENT` - Can manage data (if RBAC is disabled) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` - Can manage worksheet views and tables (if RBAC is enabled)  #### Example request  ```json {   \"identifier\": \"table-guid\",   \"obj_identifier\": \"table-object-id\",   \"clear_csr\": false,   \"column_security_rules\": [     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"ADD\",           \"group_identifiers\": [\"hr_group_id\", \"hr_group_name\", \"finance_group_id\"]         }       ]     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": true     },     {       \"column_identifier\": \"col id or col name\",       \"is_unsecured\": false,       \"group_access\": [         {           \"operation\": \"REPLACE\",           \"group_identifiers\": [\"management_group_id\", \"management_group_name\"]         }       ]     }   ] } ```  #### Request Body Schema  - `identifier` (string, optional): GUID or name of the table for which we want to create column security rules - `obj_identifier` (string, optional): The object ID of the table - `clear_csr` (boolean, optional): If true, then all the secured columns will be marked as unprotected, and all the group associations will be removed - `column_security_rules` (array of objects, required): An array where each object defines the security rule for a specific column  Each column security rule object contains: - `column_identifier` (string, required): Column identifier (col_id or name) - `is_unsecured` (boolean, optional): If true, the column will be marked as unprotected and all groups associated with it will be removed - `group_access` (array of objects, optional): Array of group operation objects  Each group operation object contains: - `operation` (string, required): Operation type - ADD, REMOVE, or REPLACE - `group_identifiers` (array of strings, required): Array of group identifiers (name or GUID) on which the operation will be performed  #### Response  This API does not return any response body. A successful operation returns HTTP 200 status code.  #### Operation Types  - **ADD**: Adds the specified groups to the column\'s access list - **REMOVE**: Removes the specified groups from the column\'s access list   - **REPLACE**: Replaces all existing groups with the specified groups      
     * @param updateColumnSecurityRulesRequest 
     */
    public updateColumnSecurityRules(updateColumnSecurityRulesRequest: UpdateColumnSecurityRulesRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateColumnSecurityRules(updateColumnSecurityRulesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateColumnSecurityRules(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      
     * @param updateConfigRequest 
     */
    public updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Observable<RepoConfigObject> {
        const requestContextPromise = this.requestFactory.updateConfig(updateConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateConnection(updateConnectionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConnection(rsp)));
            }));
    }

    /**
     *   Version: 10.12.0.cl or later   Updates a connection configuration object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Supported operations This API endpoint lets you perform the following operations in a single API request:   * Edit the name or description of the configuration  * Edit the configuration properties  * Edit the `policy_type`  * Edit the type of authentication  * Enable or disable a configuration  #### Parameterized Connection Support For parameterized oauth based connections, only the `same_as_parent` and `policy_process_options` attributes are allowed. These attributes are not applicable to connections that are not parameterized.   **NOTE**: When updating a configuration where `disabled` is `true`, you must reset `disabled` to `true` in your update request payload. If not explicitly set again, the API will default `disabled` to `false`.      
     * @param configurationIdentifier Unique ID or name of the configuration.
     * @param updateConnectionConfigurationRequest 
     */
    public updateConnectionConfiguration(configurationIdentifier: string, updateConnectionConfigurationRequest: UpdateConnectionConfigurationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateConnectionConfiguration(configurationIdentifier, updateConnectionConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConnectionConfiguration(rsp)));
            }));
    }

    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`.        **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.     * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:    * This is an example of updating a single table in a empty connection:           ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"DEMORENAME\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"Col1\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col2\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col3\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col312\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"Col4\",                         \"type\": \"VARCHAR\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```        * This is an example of updating a single table in an existing connection with tables:            ```       {         \"authenticationType\": \"SERVICE_ACCOUNT\",         \"externalDatabases\": [           {             \"name\": \"DEVELOPMENT\",             \"isAutoCreated\": false,             \"schemas\": [               {                 \"name\": \"TS_dataset\",                 \"tables\": [                   {                     \"name\": \"CUSTOMER\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [],                     \"relationships\": []                   },                   {                     \"name\": \"tpch5k_falcon_default_schema_users\",                     \"type\": \"TABLE\",                     \"description\": \"\",                     \"selected\": true,                     \"linked\": true,                     \"gid\": 0,                     \"datasetId\": \"-1\",                     \"subType\": \"\",                     \"reportId\": \"\",                     \"viewId\": \"\",                     \"columns\": [                       {                         \"name\": \"user_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"product_id\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       },                       {                         \"name\": \"user_cost\",                         \"type\": \"INT64\",                         \"canImport\": true,                         \"selected\": true,                         \"description\": \"\",                         \"isLinkedActive\": true,                         \"isAggregate\": false                       }                     ],                     \"relationships\": []                   }                 ]               }             ]           }         ],         \"configuration\": {           \"password\": \"\",           \"database\": \"DEVELOPMENT\",           \"role\": \"DEV\",           \"accountName\": \"thoughtspot_partner\",           \"warehouse\": \"DEMO_WH\",           \"user\": \"DEV_USER\"         }       }       ```  3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.    **NOTE:** If the `authentication_type` is anything other than SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload. If you do not  specify authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type.    * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a Snowflake connection:    ```    {       \"configuration\":{          \"accountName\":\"thoughtspot_partner\",          \"user\":\"tsadmin\",          \"password\":\"TestConn123\",          \"role\":\"sysadmin\",          \"warehouse\":\"MEDIUM_WH\"       },       \"externalDatabases\":[        ]    }    ```      
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request 
     */
    public updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateConnectionV2(connectionIdentifier, updateConnectionV2Request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConnectionV2(rsp)));
            }));
    }

    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest 
     */
    public updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateCustomAction(rsp)));
            }));
    }

    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     * @param connectionName Name of the connection.
     * @param databaseName Name of the Database.
     * @param importType Mention type of Import
     * @param accessToken Access token is mandatory when Import_Type is DBT_CLOUD.
     * @param dbtUrl DBT URL is mandatory when Import_Type is DBT_CLOUD.
     * @param accountId Account ID is mandatory when Import_Type is DBT_CLOUD
     * @param projectId Project ID is mandatory when Import_Type is DBT_CLOUD
     * @param dbtEnvId DBT Environment ID\\\&quot;
     * @param projectName Name of the project
     * @param fileContent Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \\\&#39;ZIP_FILE\\\&#39;
     */
    public updateDbtConnection(dbtConnectionIdentifier: string, connectionName?: string, databaseName?: string, importType?: string, accessToken?: string, dbtUrl?: string, accountId?: string, projectId?: string, dbtEnvId?: string, projectName?: string, fileContent?: HttpFile, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.updateDbtConnection(dbtConnectionIdentifier, connectionName, databaseName, importType, accessToken, dbtUrl, accountId, projectId, dbtEnvId, projectName, fileContent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateDbtConnection(rsp)));
            }));
    }

    /**
     *  Version: 10.12.0.cl or later   Updates a customization configuration for the notification email.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.  #### Usage guidelines  To update a custom configuration pass these parameters in your API request:  - A JSON map of configuration attributes `template_properties`. The following example shows a sample set of customization configuration:  ``` {   {       \"cta_button_bg_color\": \"#444DEA\",      \"cta_text_font_color\": \"#FFFFFF\",      \"primary_bg_color\": \"#D3DEF0\",       \"logo_url\": \"https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\",      \"font_family\": \"\",      \"product_name\": \"ThoughtSpot\",      \"footer_address\": \"444 Castro St, Suite 1000 Mountain View, CA 94041\",      \"footer_phone\": \"(800) 508-7008\",       \"replacement_value_for_liveboard\": \"Dashboard\",      \"replacement_value_for_answer\": \"Chart\",      \"replacement_value_for_spot_iq\": \"AI Insights\",       \"hide_footer_phone\": false,       \"hide_footer_address\": false,       \"hide_product_name\": false,      \"hide_manage_notification\": false,      \"hide_mobile_app_nudge\": false,      \"hide_privacy_policy\": false,      \"hide_ts_vocabulary_definitions\": false,      \"hide_error_message\": false,      \"hide_unsubscribe_link\": false,       \"hide_notification_status\": false,      \"hide_modify_alert\": false,      \"company_website_url\": \"https://your-website.com/\",      \"company_privacy_policy_url\" : \"https://link-to-privacy-policy.com/\",       \"contact_support_url\": \"https://link-to-contact-support.com/\",       \"hide_contact_support_url\": false   } } ```      
     * @param updateEmailCustomizationRequest 
     */
    public updateEmailCustomization(updateEmailCustomizationRequest: UpdateEmailCustomizationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateEmailCustomization(updateEmailCustomizationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateEmailCustomization(rsp)));
            }));
    }

    /**
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either `identifier` or `obj_identifier`, but not both. Both fields cannot be empty.       - When `org_identifier` is set to `-1`, only the `identifier` value is accepted; `obj_identifier` is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide `org_guid` or `org_name` to uniquely identify the organization where changes need to be applied. .      - Provide `-1` if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the `obj_identifier` attribute. Only `text` will be allowed in attribute\'s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only `identifier` is given  ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"obj_identifier\": \"\",       \"type\": \"LOGICAL_COLUMN\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgGuid\" } ```  ### Only `obj_identifier` is given ```json {   \"headers_update\":   [     {       \"obj_identifier\": \"custom_object_id\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgName\" } ```  ### Executing update for all org `-1` ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```  ### Optional `type` is not provided ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```     
     * @param updateMetadataHeaderRequest 
     */
    public updateMetadataHeader(updateMetadataHeaderRequest: UpdateMetadataHeaderRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateMetadataHeader(updateMetadataHeaderRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateMetadataHeader(rsp)));
            }));
    }

    /**
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either `current_obj_id` alone OR use `metadata_identifier` with `type` (when needed).       - When using `metadata_identifier`, the `type` field is required if using a name instead of a GUID.       - The `new_obj_id` field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using `current_obj_id`, ensure it matches the existing object ID exactly.    - When using `metadata_identifier` with a name, ensure the `type` is specified correctly.    - Verify that the `new_obj_id` follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with GUID ```json {   \"metadata\": [     {       \"metadata_identifier\": \"01234567-89ab-cdef-0123-456789abcdef\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with name and type ```json {   \"metadata\": [     {       \"metadata_identifier\": \"My Answer\",       \"type\": \"ANSWER\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Multiple objects update ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id_1\",       \"new_obj_id\": \"new_object_id_1\"     },     {       \"metadata_identifier\": \"My Worksheet\",       \"type\": \"LOGICAL_TABLE\",       \"new_obj_id\": \"new_object_id_2\"     }   ] } ```      
     * @param updateMetadataObjIdRequest 
     */
    public updateMetadataObjId(updateMetadataObjIdRequest: UpdateMetadataObjIdRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateMetadataObjId(updateMetadataObjIdRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateMetadataObjId(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest 
     */
    public updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateOrg(orgIdentifier, updateOrgRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateOrg(rsp)));
            }));
    }

    /**
     *   Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest 
     */
    public updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Observable<RoleResponse> {
        const requestContextPromise = this.requestFactory.updateRole(roleIdentifier, updateRoleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateRole(rsp)));
            }));
    }

    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest 
     */
    public updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateSchedule(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.      
     * @param updateSystemConfigRequest 
     */
    public updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateSystemConfig(updateSystemConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateSystemConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateTag(tagIdentifier, updateTagRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateTag(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateUser(userIdentifier, updateUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateUserGroup(rsp)));
            }));
    }

    /**
     *  Update a variable\'s name   Version: 10.14.0.cl or later   Allows updating a variable\'s name in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows updating: * The variable name     
     * @param identifier Unique id or name of the variable to update.
     * @param updateVariableRequest 
     */
    public updateVariable(identifier: string, updateVariableRequest: UpdateVariableRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateVariable(identifier, updateVariableRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateVariable(rsp)));
            }));
    }

    /**
     *  Update values for multiple variables   Version: 10.14.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constrains for a given variable, scope is ignored      
     * @param updateVariableValuesRequest 
     */
    public updateVariableValues(updateVariableValuesRequest: UpdateVariableValuesRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateVariableValues(updateVariableValuesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateVariableValues(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param webhookIdentifier Unique ID or name of the webhook configuration.
     * @param updateWebhookConfigurationRequest 
     */
    public updateWebhookConfiguration(webhookIdentifier: string, updateWebhookConfigurationRequest: UpdateWebhookConfigurationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateWebhookConfiguration(rsp)));
            }));
    }

    /**
     *  Version: 10.10.0.cl or later   Validates the email customization configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.      
     */
    public validateEmailCustomization(_options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.validateEmailCustomization(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.validateEmailCustomization(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param validateMergeRequest 
     */
    public validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Observable<Array<DeployResponse>> {
        const requestContextPromise = this.requestFactory.validateMerge(validateMergeRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.validateMerge(rsp)));
            }));
    }

    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param validateTokenRequest 
     */
    public validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Observable<TokenValidationResponse> {
        const requestContextPromise = this.requestFactory.validateToken(validateTokenRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.validateToken(rsp)));
            }));
    }

}

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class ObservableUsersApi {
    private requestFactory: UsersApiRequestFactory;
    private responseProcessor: UsersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UsersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UsersApiResponseProcessor();
    }

    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      
     * @param activateUserRequest 
     */
    public activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Observable<User> {
        const requestContextPromise = this.requestFactory.activateUser(activateUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.activateUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param changeUserPasswordRequest 
     */
    public changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.changeUserPassword(changeUserPasswordRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.changeUserPassword(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param createUserRequest 
     */
    public createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Observable<User> {
        const requestContextPromise = this.requestFactory.createUser(createUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createUser(rsp)));
            }));
    }

    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      
     * @param deactivateUserRequest 
     */
    public deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Observable<ResponseActivationURL> {
        const requestContextPromise = this.requestFactory.deactivateUser(deactivateUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deactivateUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     */
    public deleteUser(userIdentifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteUser(userIdentifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteUser(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param forceLogoutUsersRequest 
     */
    public forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.forceLogoutUsers(forceLogoutUsersRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.forceLogoutUsers(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param importUsersRequest 
     */
    public importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Observable<ImportUsersResponse> {
        const requestContextPromise = this.requestFactory.importUsers(importUsersRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.importUsers(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param resetUserPasswordRequest 
     */
    public resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.resetUserPassword(resetUserPasswordRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.resetUserPassword(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.      
     * @param searchUsersRequest 
     */
    public searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Observable<Array<User>> {
        const requestContextPromise = this.requestFactory.searchUsers(searchUsersRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchUsers(rsp)));
            }));
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateUser(userIdentifier, updateUserRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateUser(rsp)));
            }));
    }

}

import { VariableApiRequestFactory, VariableApiResponseProcessor} from "../apis/VariableApi";
export class ObservableVariableApi {
    private requestFactory: VariableApiRequestFactory;
    private responseProcessor: VariableApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VariableApiRequestFactory,
        responseProcessor?: VariableApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VariableApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VariableApiResponseProcessor();
    }

    /**
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.14.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this. * FORMULA_VARIABLE - For Formula variables, introduced in 10.15.0.cl  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The data type of the variable, only specify for formula variables (defaults to null)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid     
     * @param createVariableRequest 
     */
    public createVariable(createVariableRequest: CreateVariableRequest, _options?: Configuration): Observable<Variable> {
        const requestContextPromise = this.requestFactory.createVariable(createVariableRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createVariable(rsp)));
            }));
    }

    /**
     *  Delete a variable   Version: 10.14.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn\'t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable
     */
    public deleteVariable(identifier: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteVariable(identifier, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteVariable(rsp)));
            }));
    }

    /**
     *  Search variables   Version: 10.14.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values  The values can be filtered by scope: * org_identifier * principal_identifier * model_identifier      
     * @param searchVariablesRequest 
     */
    public searchVariables(searchVariablesRequest: SearchVariablesRequest, _options?: Configuration): Observable<Array<Variable>> {
        const requestContextPromise = this.requestFactory.searchVariables(searchVariablesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchVariables(rsp)));
            }));
    }

    /**
     *  Update a variable\'s name   Version: 10.14.0.cl or later   Allows updating a variable\'s name in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows updating: * The variable name     
     * @param identifier Unique id or name of the variable to update.
     * @param updateVariableRequest 
     */
    public updateVariable(identifier: string, updateVariableRequest: UpdateVariableRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateVariable(identifier, updateVariableRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateVariable(rsp)));
            }));
    }

    /**
     *  Update values for multiple variables   Version: 10.14.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current organization scope.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE, RESET)  Behaviour based on operation type: * ADD - Adds values to the variable if this is a list type variable, else same as replace. * REPLACE - Replaces all values of a given set of constraints with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables if this is a list type variable, else clears value. * RESET - Removes all constrains for a given variable, scope is ignored      
     * @param updateVariableValuesRequest 
     */
    public updateVariableValues(updateVariableValuesRequest: UpdateVariableValuesRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateVariableValues(updateVariableValuesRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateVariableValues(rsp)));
            }));
    }

}

import { VersionControlApiRequestFactory, VersionControlApiResponseProcessor} from "../apis/VersionControlApi";
export class ObservableVersionControlApi {
    private requestFactory: VersionControlApiRequestFactory;
    private responseProcessor: VersionControlApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionControlApiRequestFactory,
        responseProcessor?: VersionControlApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VersionControlApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VersionControlApiResponseProcessor();
    }

    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitBranchRequest 
     */
    public commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Observable<CommitResponse> {
        const requestContextPromise = this.requestFactory.commitBranch(commitBranchRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.commitBranch(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.      
     * @param createConfigRequest 
     */
    public createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Observable<RepoConfigObject> {
        const requestContextPromise = this.requestFactory.createConfig(createConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      
     * @param deleteConfigRequest 
     */
    public deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.deleteConfig(deleteConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param deployCommitRequest 
     */
    public deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Observable<Array<DeployResponse>> {
        const requestContextPromise = this.requestFactory.deployCommit(deployCommitRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deployCommit(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest 
     */
    public revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Observable<RevertResponse> {
        const requestContextPromise = this.requestFactory.revertCommit(commitId, revertCommitRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.revertCommit(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param searchCommitsRequest 
     */
    public searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Observable<Array<CommitHistoryResponse>> {
        const requestContextPromise = this.requestFactory.searchCommits(searchCommitsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchCommits(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      
     * @param searchConfigRequest 
     */
    public searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Observable<Array<RepoConfigObject>> {
        const requestContextPromise = this.requestFactory.searchConfig(searchConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_SETUP_VERSION_CONTROL` (**Can set up version control**) privilege.      
     * @param updateConfigRequest 
     */
    public updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Observable<RepoConfigObject> {
        const requestContextPromise = this.requestFactory.updateConfig(updateConfigRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateConfig(rsp)));
            }));
    }

    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param validateMergeRequest 
     */
    public validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Observable<Array<DeployResponse>> {
        const requestContextPromise = this.requestFactory.validateMerge(validateMergeRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.validateMerge(rsp)));
            }));
    }

}

import { WebhooksApiRequestFactory, WebhooksApiResponseProcessor} from "../apis/WebhooksApi";
export class ObservableWebhooksApi {
    private requestFactory: WebhooksApiRequestFactory;
    private responseProcessor: WebhooksApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhooksApiRequestFactory,
        responseProcessor?: WebhooksApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WebhooksApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WebhooksApiResponseProcessor();
    }

    /**
     *  Version: 10.14.0.cl or later   Creates a new webhook configuration to receive notifications for specified events. The webhook will be triggered when the configured events occur in the system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param createWebhookConfigurationRequest 
     */
    public createWebhookConfiguration(createWebhookConfigurationRequest: CreateWebhookConfigurationRequest, _options?: Configuration): Observable<WebhookResponse> {
        const requestContextPromise = this.requestFactory.createWebhookConfiguration(createWebhookConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createWebhookConfiguration(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Deletes one or more webhook configurations by their unique id or name. Returns status of each deletion operation, including successfully deleted webhooks and any failures with error details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param deleteWebhookConfigurationsRequest 
     */
    public deleteWebhookConfigurations(deleteWebhookConfigurationsRequest: DeleteWebhookConfigurationsRequest, _options?: Configuration): Observable<WebhookDeleteResponse> {
        const requestContextPromise = this.requestFactory.deleteWebhookConfigurations(deleteWebhookConfigurationsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteWebhookConfigurations(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Searches for webhook configurations based on various criteria such as Org, webhook identifier, event type, with support for pagination and sorting. Returns matching webhook configurations with their complete details.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param searchWebhookConfigurationsRequest 
     */
    public searchWebhookConfigurations(searchWebhookConfigurationsRequest: SearchWebhookConfigurationsRequest, _options?: Configuration): Observable<WebhookSearchResponse> {
        const requestContextPromise = this.requestFactory.searchWebhookConfigurations(searchWebhookConfigurationsRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.searchWebhookConfigurations(rsp)));
            }));
    }

    /**
     *  Version: 10.14.0.cl or later   Updates an existing webhook configuration by its unique id or name. Only the provided fields will be updated.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DEVELOPER` (**Has developer privilege**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with `CAN_MANAGE_WEBHOOKS` (**Can manage webhooks**) privilege are also authorized to perform this action.      
     * @param webhookIdentifier Unique ID or name of the webhook configuration.
     * @param updateWebhookConfigurationRequest 
     */
    public updateWebhookConfiguration(webhookIdentifier: string, updateWebhookConfigurationRequest: UpdateWebhookConfigurationRequest, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.updateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateWebhookConfiguration(rsp)));
            }));
    }

}
