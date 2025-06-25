import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

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
import { AnswerContent } from '../models/AnswerContent';
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
import { BasicAuth } from '../models/BasicAuth';
import { BasicAuthInput } from '../models/BasicAuthInput';
import { CALLBACK } from '../models/CALLBACK';
import { CALLBACKInput } from '../models/CALLBACKInput';
import { CALLBACKInputMandatory } from '../models/CALLBACKInputMandatory';
import { ChangeUserPasswordRequest } from '../models/ChangeUserPasswordRequest';
import { Column } from '../models/Column';
import { CommitBranchRequest } from '../models/CommitBranchRequest';
import { CommitFileType } from '../models/CommitFileType';
import { CommitHistoryResponse } from '../models/CommitHistoryResponse';
import { CommitResponse } from '../models/CommitResponse';
import { CommiterType } from '../models/CommiterType';
import { ConnectionInput } from '../models/ConnectionInput';
import { Conversation } from '../models/Conversation';
import { ConvertWorksheetToModelRequest } from '../models/ConvertWorksheetToModelRequest';
import { CopyObjectRequest } from '../models/CopyObjectRequest';
import { CreateConfigRequest } from '../models/CreateConfigRequest';
import { CreateConnectionRequest } from '../models/CreateConnectionRequest';
import { CreateConnectionResponse } from '../models/CreateConnectionResponse';
import { CreateConversationRequest } from '../models/CreateConversationRequest';
import { CreateCustomActionRequest } from '../models/CreateCustomActionRequest';
import { CreateCustomActionRequestActionDetails } from '../models/CreateCustomActionRequestActionDetails';
import { CreateCustomActionRequestDefaultActionConfig } from '../models/CreateCustomActionRequestDefaultActionConfig';
import { CreateEmailCustomisationRequest } from '../models/CreateEmailCustomisationRequest';
import { CreateEmailCustomisationResponse } from '../models/CreateEmailCustomisationResponse';
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
import { CronExpression } from '../models/CronExpression';
import { CronExpressionInput } from '../models/CronExpressionInput';
import { CustomActionMetadataTypeInput } from '../models/CustomActionMetadataTypeInput';
import { DataWarehouseObjectInput } from '../models/DataWarehouseObjectInput';
import { DataWarehouseObjects } from '../models/DataWarehouseObjects';
import { Database } from '../models/Database';
import { DbtConnectionRequest } from '../models/DbtConnectionRequest';
import { DbtGenerateSyncTmlRequest } from '../models/DbtGenerateSyncTmlRequest';
import { DbtGenerateTmlRequest } from '../models/DbtGenerateTmlRequest';
import { DbtSearchResponse } from '../models/DbtSearchResponse';
import { DeactivateUserRequest } from '../models/DeactivateUserRequest';
import { DefaultActionConfig } from '../models/DefaultActionConfig';
import { DefaultActionConfigInput } from '../models/DefaultActionConfigInput';
import { DefaultActionConfigInputCreate } from '../models/DefaultActionConfigInputCreate';
import { DefaultActionConfigSearchInput } from '../models/DefaultActionConfigSearchInput';
import { DeleteConfigRequest } from '../models/DeleteConfigRequest';
import { DeleteConnectionRequest } from '../models/DeleteConnectionRequest';
import { DeleteMetadataRequest } from '../models/DeleteMetadataRequest';
import { DeleteMetadataTypeInput } from '../models/DeleteMetadataTypeInput';
import { DeployCommitRequest } from '../models/DeployCommitRequest';
import { DeployResponse } from '../models/DeployResponse';
import { ErrorResponse } from '../models/ErrorResponse';
import { EurekaDecomposeQueryResponse } from '../models/EurekaDecomposeQueryResponse';
import { EurekaLLMDecomposeQueryResponse } from '../models/EurekaLLMDecomposeQueryResponse';
import { EurekaLLMSuggestedQuery } from '../models/EurekaLLMSuggestedQuery';
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
import { FavoriteMetadataInput } from '../models/FavoriteMetadataInput';
import { FavoriteMetadataItem } from '../models/FavoriteMetadataItem';
import { FavoriteObjectOptionsInput } from '../models/FavoriteObjectOptionsInput';
import { FetchAnswerDataRequest } from '../models/FetchAnswerDataRequest';
import { FetchAnswerSqlQueryRequest } from '../models/FetchAnswerSqlQueryRequest';
import { FetchAsyncImportTaskStatusRequest } from '../models/FetchAsyncImportTaskStatusRequest';
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
import { GenericInfo } from '../models/GenericInfo';
import { GetAsyncImportStatusResponse } from '../models/GetAsyncImportStatusResponse';
import { GetCustomAccessTokenRequest } from '../models/GetCustomAccessTokenRequest';
import { GetFullAccessTokenRequest } from '../models/GetFullAccessTokenRequest';
import { GetObjectAccessTokenRequest } from '../models/GetObjectAccessTokenRequest';
import { GetTokenResponse } from '../models/GetTokenResponse';
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
import { InputVariableValue } from '../models/InputVariableValue';
import { JWTMetadataObject } from '../models/JWTMetadataObject';
import { JWTParameter } from '../models/JWTParameter';
import { JWTUserOptions } from '../models/JWTUserOptions';
import { JWTUserOptionsFull } from '../models/JWTUserOptionsFull';
import { LiveboardContent } from '../models/LiveboardContent';
import { LiveboardDataResponse } from '../models/LiveboardDataResponse';
import { LiveboardOptions } from '../models/LiveboardOptions';
import { LiveboardOptionsInput } from '../models/LiveboardOptionsInput';
import { LogResponse } from '../models/LogResponse';
import { LoginRequest } from '../models/LoginRequest';
import { MetadataAssociationItem } from '../models/MetadataAssociationItem';
import { MetadataInput } from '../models/MetadataInput';
import { MetadataListItemInput } from '../models/MetadataListItemInput';
import { MetadataObject } from '../models/MetadataObject';
import { MetadataResponse } from '../models/MetadataResponse';
import { MetadataSearchResponse } from '../models/MetadataSearchResponse';
import { MetadataSearchSortOptions } from '../models/MetadataSearchSortOptions';
import { ModelTableList } from '../models/ModelTableList';
import { ObjectIDAndName } from '../models/ObjectIDAndName';
import { Org } from '../models/Org';
import { OrgInfo } from '../models/OrgInfo';
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
import { SearchCommitsRequest } from '../models/SearchCommitsRequest';
import { SearchConfigRequest } from '../models/SearchConfigRequest';
import { SearchConnectionRequest } from '../models/SearchConnectionRequest';
import { SearchConnectionRequestSortOptions } from '../models/SearchConnectionRequestSortOptions';
import { SearchConnectionResponse } from '../models/SearchConnectionResponse';
import { SearchCustomActionsRequest } from '../models/SearchCustomActionsRequest';
import { SearchCustomActionsRequestDefaultActionConfig } from '../models/SearchCustomActionsRequestDefaultActionConfig';
import { SearchDataRequest } from '../models/SearchDataRequest';
import { SearchDataResponse } from '../models/SearchDataResponse';
import { SearchMetadataRequest } from '../models/SearchMetadataRequest';
import { SearchMetadataRequestFavoriteObjectOptions } from '../models/SearchMetadataRequestFavoriteObjectOptions';
import { SearchMetadataRequestSortOptions } from '../models/SearchMetadataRequestSortOptions';
import { SearchOrgsRequest } from '../models/SearchOrgsRequest';
import { SearchRoleResponse } from '../models/SearchRoleResponse';
import { SearchRolesRequest } from '../models/SearchRolesRequest';
import { SearchSchedulesRequest } from '../models/SearchSchedulesRequest';
import { SearchSchedulesRequestHistoryRunsOptions } from '../models/SearchSchedulesRequestHistoryRunsOptions';
import { SearchSchedulesRequestSortOptions } from '../models/SearchSchedulesRequestSortOptions';
import { SearchTagsRequest } from '../models/SearchTagsRequest';
import { SearchUserGroupsRequest } from '../models/SearchUserGroupsRequest';
import { SearchUserGroupsRequestSortOptions } from '../models/SearchUserGroupsRequestSortOptions';
import { SearchUsersRequest } from '../models/SearchUsersRequest';
import { SearchUsersRequestSortOptions } from '../models/SearchUsersRequestSortOptions';
import { SearchVariablesRequest } from '../models/SearchVariablesRequest';
import { SendMessageRequest } from '../models/SendMessageRequest';
import { ShareMetadataRequest } from '../models/ShareMetadataRequest';
import { ShareMetadataTypeInput } from '../models/ShareMetadataTypeInput';
import { SharePermissionsInput } from '../models/SharePermissionsInput';
import { SingleAnswerRequest } from '../models/SingleAnswerRequest';
import { SortOptionInput } from '../models/SortOptionInput';
import { SortOptions } from '../models/SortOptions';
import { SortingOptions } from '../models/SortingOptions';
import { SqlQuery } from '../models/SqlQuery';
import { SqlQueryResponse } from '../models/SqlQueryResponse';
import { SystemConfig } from '../models/SystemConfig';
import { SystemInfo } from '../models/SystemInfo';
import { Table } from '../models/Table';
import { Tag } from '../models/Tag';
import { TagMetadataTypeInput } from '../models/TagMetadataTypeInput';
import { Token } from '../models/Token';
import { TokenAccessScopeObject } from '../models/TokenAccessScopeObject';
import { TokenValidationResponse } from '../models/TokenValidationResponse';
import { URL } from '../models/URL';
import { URLInput } from '../models/URLInput';
import { URLInputMandatory } from '../models/URLInputMandatory';
import { UnparameterizeMetadataRequest } from '../models/UnparameterizeMetadataRequest';
import { UnpublishMetadataRequest } from '../models/UnpublishMetadataRequest';
import { UpdateConfigRequest } from '../models/UpdateConfigRequest';
import { UpdateConnectionRequest } from '../models/UpdateConnectionRequest';
import { UpdateConnectionV2Request } from '../models/UpdateConnectionV2Request';
import { UpdateCustomActionRequest } from '../models/UpdateCustomActionRequest';
import { UpdateCustomActionRequestActionDetails } from '../models/UpdateCustomActionRequestActionDetails';
import { UpdateCustomActionRequestDefaultActionConfig } from '../models/UpdateCustomActionRequestDefaultActionConfig';
import { UpdateDbtConnectionRequest } from '../models/UpdateDbtConnectionRequest';
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
import { User } from '../models/User';
import { UserGroup } from '../models/UserGroup';
import { UserGroupResponse } from '../models/UserGroupResponse';
import { UserInfo } from '../models/UserInfo';
import { UserObject } from '../models/UserObject';
import { UserParameterOptions } from '../models/UserParameterOptions';
import { ValidateMergeRequest } from '../models/ValidateMergeRequest';
import { ValidateTokenRequest } from '../models/ValidateTokenRequest';
import { Variable } from '../models/Variable';
import { VariableDetailInput } from '../models/VariableDetailInput';
import { VariableValue } from '../models/VariableValue';
import { VariableValueInput } from '../models/VariableValueInput';
import { ObservableAIApi } from './ObservableAPI';

import { AIApiRequestFactory, AIApiResponseProcessor} from "../apis/AIApi";
export class PromiseAIApi {
    private api: ObservableAIApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AIApiRequestFactory,
        responseProcessor?: AIApiResponseProcessor
    ) {
        this.api = new ObservableAIApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest 
     */
    public createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<Conversation> {
        const result = this.api.createConversation(createConversationRequest, _options);
        return result.toPromise();
    }

    /**
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest 
     */
    public queryGetDecomposedQuery(queryGetDecomposedQueryRequest: QueryGetDecomposedQueryRequest, _options?: Configuration): Promise<EurekaDecomposeQueryResponse> {
        const result = this.api.queryGetDecomposedQuery(queryGetDecomposedQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest 
     */
    public sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<Array<ResponseMessage>> {
        const result = this.api.sendMessage(conversationIdentifier, sendMessageRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest 
     */
    public singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<ResponseMessage> {
        const result = this.api.singleAnswer(singleAnswerRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAuthenticationApi } from './ObservableAPI';

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class PromiseAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.      
     */
    public getCurrentUserInfo(_options?: Configuration): Promise<User> {
        const result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    }

    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.      
     */
    public getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse> {
        const result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  Specify the object type as `LOGICAL_TABLE`.  The `LIVEBOARD` and `ANSWER` object types are not supported.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.      
     * @param getCustomAccessTokenRequest 
     */
    public getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Promise<AccessToken> {
        const result = this.api.getCustomAccessToken(getCustomAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getFullAccessTokenRequest 
     */
    public getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getObjectAccessTokenRequest 
     */
    public getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     
     * @param loginRequest 
     */
    public login(loginRequest: LoginRequest, _options?: Configuration): Promise<void> {
        const result = this.api.login(loginRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.      
     */
    public logout(_options?: Configuration): Promise<void> {
        const result = this.api.logout(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param revokeTokenRequest 
     */
    public revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<void> {
        const result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param validateTokenRequest 
     */
    public validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Promise<TokenValidationResponse> {
        const result = this.api.validateToken(validateTokenRequest, _options);
        return result.toPromise();
    }


}



import { ObservableConnectionsApi } from './ObservableAPI';

import { ConnectionsApiRequestFactory, ConnectionsApiResponseProcessor} from "../apis/ConnectionsApi";
export class PromiseConnectionsApi {
    private api: ObservableConnectionsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConnectionsApiRequestFactory,
        responseProcessor?: ConnectionsApiResponseProcessor
    ) {
        this.api = new ObservableConnectionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse> {
        const result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     
     * @param deleteConnectionRequest 
     */
    public deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    public deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConnectionV2(connectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.downloadConnectionMetadataChanges(connectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<FetchConnectionDiffStatusResponse> {
        const result = this.api.fetchConnectionDiffStatus(connectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      
     * @param searchConnectionRequest 
     */
    public searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>> {
        const result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request 
     */
    public updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<void> {
        const result = this.api.updateConnectionV2(connectionIdentifier, updateConnectionV2Request, _options);
        return result.toPromise();
    }


}



import { ObservableCustomActionApi } from './ObservableAPI';

import { CustomActionApiRequestFactory, CustomActionApiResponseProcessor} from "../apis/CustomActionApi";
export class PromiseCustomActionApi {
    private api: ObservableCustomActionApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomActionApiRequestFactory,
        responseProcessor?: CustomActionApiResponseProcessor
    ) {
        this.api = new ObservableCustomActionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param createCustomActionRequest 
     */
    public createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction> {
        const result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    public deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param searchCustomActionsRequest 
     */
    public searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>> {
        const result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest 
     */
    public updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableDBTApi } from './ObservableAPI';

import { DBTApiRequestFactory, DBTApiResponseProcessor} from "../apis/DBTApi";
export class PromiseDBTApi {
    private api: ObservableDBTApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DBTApiRequestFactory,
        responseProcessor?: DBTApiResponseProcessor
    ) {
        this.api = new ObservableDBTApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      
     * @param dbtConnectionRequest 
     */
    public dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<any> {
        const result = this.api.dbtConnection(dbtConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtGenerateSyncTmlRequest 
     */
    public dbtGenerateSyncTml(dbtGenerateSyncTmlRequest: DbtGenerateSyncTmlRequest, _options?: Configuration): Promise<any> {
        const result = this.api.dbtGenerateSyncTml(dbtGenerateSyncTmlRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      
     * @param dbtGenerateTmlRequest 
     */
    public dbtGenerateTml(dbtGenerateTmlRequest: DbtGenerateTmlRequest, _options?: Configuration): Promise<any> {
        const result = this.api.dbtGenerateTml(dbtGenerateTmlRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      
     */
    public dbtSearch(_options?: Configuration): Promise<Array<DbtSearchResponse>> {
        const result = this.api.dbtSearch(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    public deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteDbtConnection(dbtConnectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      
     * @param updateDbtConnectionRequest 
     */
    public updateDbtConnection(updateDbtConnectionRequest: UpdateDbtConnectionRequest, _options?: Configuration): Promise<any> {
        const result = this.api.updateDbtConnection(updateDbtConnectionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableDataApi } from './ObservableAPI';

import { DataApiRequestFactory, DataApiResponseProcessor} from "../apis/DataApi";
export class PromiseDataApi {
    private api: ObservableDataApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataApiRequestFactory,
        responseProcessor?: DataApiResponseProcessor
    ) {
        this.api = new ObservableDataApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     
     * @param fetchAnswerDataRequest 
     */
    public fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse> {
        const result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     
     * @param fetchLiveboardDataRequest 
     */
    public fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse> {
        const result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       
     * @param searchDataRequest 
     */
    public searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse> {
        const result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    }


}



import { ObservableEmailCustomisationApi } from './ObservableAPI';

import { EmailCustomisationApiRequestFactory, EmailCustomisationApiResponseProcessor} from "../apis/EmailCustomisationApi";
export class PromiseEmailCustomisationApi {
    private api: ObservableEmailCustomisationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EmailCustomisationApiRequestFactory,
        responseProcessor?: EmailCustomisationApiResponseProcessor
    ) {
        this.api = new ObservableEmailCustomisationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *  Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes `template_properties`. The following example shows the configuration attribures for a csutom configuration:  ``` {     {     \"logoUrl\": \"<logo_url>\",     \"homeUrl\": \"<home_url>\",     \"productName\": \"<Company Name in the Mail>\",     \"footerAddress\": \"<address to be visible in the footer>\",     \"ctaButtonBgColor\": \"#444DEA\",     \"ctaTextFontColor\": \"#FFFFFF\",     \"primaryBgColor\": \"#D3DEF0\",     \"hideMobileAppNudge\": <true/false>,     \"hideTsVocabularyDefinitions\": <true/false>e,     \"hideProductName\": <true/false>,     \"hideFooterPhone\": <true/false>,     \"hideFooterAddress\": <true/false>,     \"hidePrivacyPolicy\": <true/false>,     \"hideManageNotification\": <true/false>,     \"fontfamily\": \"<to maintain a single font in the entire email>\"   } } ```      
     * @param createEmailCustomisationRequest 
     */
    public createEmailCustomisation(createEmailCustomisationRequest: CreateEmailCustomisationRequest, _options?: Configuration): Promise<CreateEmailCustomisationResponse> {
        const result = this.api.createEmailCustomisation(createEmailCustomisationRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the `template_identifier` in the API request.  Note: `template_identifier` can be fetched from search API request.      
     * @param templateIdentifier Unique ID or name of the email customization.
     */
    public deleteEmailCustomisation(templateIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteEmailCustomisation(templateIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      
     */
    public searchEmailCustomisation(_options?: Configuration): Promise<Array<CreateEmailCustomisationResponse>> {
        const result = this.api.searchEmailCustomisation(_options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.      
     */
    public validateEmailCustomisation(_options?: Configuration): Promise<void> {
        const result = this.api.validateEmailCustomisation(_options);
        return result.toPromise();
    }


}



import { ObservableGroupsApi } from './ObservableAPI';

import { GroupsApiRequestFactory, GroupsApiResponseProcessor} from "../apis/GroupsApi";
export class PromiseGroupsApi {
    private api: ObservableGroupsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GroupsApiRequestFactory,
        responseProcessor?: GroupsApiResponseProcessor
    ) {
        this.api = new ObservableGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     * @param createUserGroupRequest 
     */
    public createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse> {
        const result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.      
     * @param groupIdentifier GUID or name of the group.
     */
    public deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     * @param importUserGroupsRequest 
     */
    public importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse> {
        const result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchUserGroupsRequest 
     */
    public searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>> {
        const result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    }


}



import { ObservableLogApi } from './ObservableAPI';

import { LogApiRequestFactory, LogApiResponseProcessor} from "../apis/LogApi";
export class PromiseLogApi {
    private api: ObservableLogApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LogApiRequestFactory,
        responseProcessor?: LogApiResponseProcessor
    ) {
        this.api = new ObservableLogApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      
     * @param fetchLogsRequest 
     */
    public fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>> {
        const result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    }


}



import { ObservableMetadataApi } from './ObservableAPI';

import { MetadataApiRequestFactory, MetadataApiResponseProcessor} from "../apis/MetadataApi";
export class PromiseMetadataApi {
    private api: ObservableMetadataApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MetadataApiRequestFactory,
        responseProcessor?: MetadataApiResponseProcessor
    ) {
        this.api = new ObservableMetadataApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when `convert_all` is set to `false`.        - Leave empty or omit when `convert_all` is set to `true`.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when `convert_all` is set to `true` and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - `true`: Converts all Worksheets in the system, except those specified in `exclude_worksheet_ids`.        - `false`: Converts only the Worksheets listed in `worksheet_ids`.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - `true`: Applies conversion changes directly to ThoughtSpot.      - `false`: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting `convert_all` to `false` and specifying a small number of `worksheet_ids`.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use `apply_changes: false` to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets ```json {   \"worksheet_ids\": [\"guid1\", \"guid2\", \"guid3\"],   \"exclude_worksheet_ids\": [],   \"convert_all\": false,   \"apply_changes\": true } ```  ### Convert All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [],   \"convert_all\": true,   \"apply_changes\": true } ```  ### Exclude Specific Worksheets While Converting All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [\"abc\"],   \"convert_all\": true,   \"apply_changes\": true } ```     
     * @param convertWorksheetToModelRequest 
     */
    public convertWorksheetToModel(convertWorksheetToModelRequest: ConvertWorksheetToModelRequest, _options?: Configuration): Promise<ResponseWorksheetToModelConversion> {
        const result = this.api.convertWorksheetToModel(convertWorksheetToModelRequest, _options);
        return result.toPromise();
    }

    /**
     *  Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest 
     */
    public copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Promise<ResponseCopyObject> {
        const result = this.api.copyObject(copyObjectRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest 
     */
    public deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as `identifier`, and set the `type` as `FEEDBACK` in the `metadata` array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as `identifier`, set the `type` as `LOGIAL_TABLE` in the `metadata` array, and set `export_with_associated_feedbacks` in `export_options` to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest 
     */
    public exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires `DATAMANAGEMENT` (**Can manage data**) and `USERMANAGEMENT` (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for `USER`, `GROUP`, and `ROLES` metadata types.  - `batch_offset` Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - `batch_size` Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - `edoc_format` Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - `export_dependent` Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - `all_orgs_override` Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest 
     */
    public exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Promise<any> {
        const result = this.api.exportMetadataTMLBatched(exportMetadataTMLBatchedRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      
     * @param fetchAnswerSqlQueryRequest 
     */
    public fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest 
     */
    public fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Promise<GetAsyncImportStatusResponse> {
        const result = this.api.fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      
     * @param fetchLiveboardSqlQueryRequest 
     */
    public fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest 
     */
    public importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest 
     */
    public importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Promise<ImportEPackAsyncTaskStatus> {
        const result = this.api.importMetadataTMLAsync(importMetadataTMLAsyncRequest, _options);
        return result.toPromise();
    }

    /**
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always `CONNECTION_PROPERTY`. We use the field_name in this case to specify the exact property of a connection which needs to be parameterized.      
     * @param parameterizeMetadataRequest 
     */
    public parameterizeMetadata(parameterizeMetadataRequest: ParameterizeMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.parameterizeMetadata(parameterizeMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To filter metadata objects within type `LOGICAL_TABLE`, set the `subtypes` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE` & subtypes as `[WORKSHEET]`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use `include_discoverable_objects` as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the `liveboard_response_format` as V2. Default value is V1.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `subtypes` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchMetadataRequest 
     */
    public searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>> {
        const result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always `CONNECTION_PROPERTY`. We use the field_name in this case to specify the exact property of a connection which needs to be unparameterized.      
     * @param unparameterizeMetadataRequest 
     */
    public unparameterizeMetadata(unparameterizeMetadataRequest: UnparameterizeMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unparameterizeMetadata(unparameterizeMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either `identifier` or `obj_identifier`, but not both. Both fields cannot be empty.       - When `org_identifier` is set to `-1`, only the `identifier` value is accepted; `obj_identifier` is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide `org_guid` or `org_name` to uniquely identify the organization where changes need to be applied. .      - Provide `-1` if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the `obj_identifier` attribute. Only `text` will be allowed in attribute\'s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only `identifier` is given  ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"obj_identifier\": \"\",       \"type\": \"LOGICAL_COLUMN\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgGuid\" } ```  ### Only `obj_identifier` is given ```json {   \"headers_update\":   [     {       \"obj_identifier\": \"custom_object_id\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgName\" } ```  ### Executing update for all org `-1` ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```  ### Optional `type` is not provided ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```     
     * @param updateMetadataHeaderRequest 
     */
    public updateMetadataHeader(updateMetadataHeaderRequest: UpdateMetadataHeaderRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateMetadataHeader(updateMetadataHeaderRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either `current_obj_id` alone OR use `metadata_identifier` with `type` (when needed).       - When using `metadata_identifier`, the `type` field is required if using a name instead of a GUID.       - The `new_obj_id` field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using `current_obj_id`, ensure it matches the existing object ID exactly.    - When using `metadata_identifier` with a name, ensure the `type` is specified correctly.    - Verify that the `new_obj_id` follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with GUID ```json {   \"metadata\": [     {       \"metadata_identifier\": \"01234567-89ab-cdef-0123-456789abcdef\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with name and type ```json {   \"metadata\": [     {       \"metadata_identifier\": \"My Answer\",       \"type\": \"ANSWER\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Multiple objects update ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id_1\",       \"new_obj_id\": \"new_object_id_1\"     },     {       \"metadata_identifier\": \"My Worksheet\",       \"type\": \"LOGICAL_TABLE\",       \"new_obj_id\": \"new_object_id_2\"     }   ] } ```      
     * @param updateMetadataObjIdRequest 
     */
    public updateMetadataObjId(updateMetadataObjIdRequest: UpdateMetadataObjIdRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateMetadataObjId(updateMetadataObjIdRequest, _options);
        return result.toPromise();
    }


}



import { ObservableOrgsApi } from './ObservableAPI';

import { OrgsApiRequestFactory, OrgsApiResponseProcessor} from "../apis/OrgsApi";
export class PromiseOrgsApi {
    private api: ObservableOrgsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: OrgsApiRequestFactory,
        responseProcessor?: OrgsApiResponseProcessor
    ) {
        this.api = new ObservableOrgsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param createOrgRequest 
     */
    public createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse> {
        const result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      
     * @param orgIdentifier ID or name of the Org
     */
    public deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param searchOrgsRequest 
     */
    public searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>> {
        const result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest 
     */
    public updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    }


}



import { ObservableReportsApi } from './ObservableAPI';

import { ReportsApiRequestFactory, ReportsApiResponseProcessor} from "../apis/ReportsApi";
export class PromiseReportsApi {
    private api: ObservableReportsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsApiRequestFactory,
        responseProcessor?: ReportsApiResponseProcessor
    ) {
        this.api = new ObservableReportsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       
     * @param exportAnswerReportRequest 
     */
    public exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF or PNG file format.  Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is PDF. For PDF downloads, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  **NOTE**: The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).       
     * @param exportLiveboardReportRequest 
     */
    public exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    }


}



import { ObservableRolesApi } from './ObservableAPI';

import { RolesApiRequestFactory, RolesApiResponseProcessor} from "../apis/RolesApi";
export class PromiseRolesApi {
    private api: ObservableRolesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RolesApiRequestFactory,
        responseProcessor?: RolesApiResponseProcessor
    ) {
        this.api = new ObservableRolesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param createRoleRequest 
     */
    public createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role. ReadOnly roles cannot be deleted.
     */
    public deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      
     * @param searchRolesRequest 
     */
    public searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>> {
        const result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest 
     */
    public updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSchedulesApi } from './ObservableAPI';

import { SchedulesApiRequestFactory, SchedulesApiResponseProcessor} from "../apis/SchedulesApi";
export class PromiseSchedulesApi {
    private api: ObservableSchedulesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SchedulesApiRequestFactory,
        responseProcessor?: SchedulesApiResponseProcessor
    ) {
        this.api = new ObservableSchedulesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If `PDF` is set as the `file_format`, enable `pdf_options` to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     
     * @param createScheduleRequest 
     */
    public createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule> {
        const result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    }

    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.      
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    public deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.      
     * @param searchSchedulesRequest 
     */
    public searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>> {
        const result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest 
     */
    public updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSecurityApi } from './ObservableAPI';

import { SecurityApiRequestFactory, SecurityApiResponseProcessor} from "../apis/SecurityApi";
export class PromiseSecurityApi {
    private api: ObservableSecurityApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SecurityApiRequestFactory,
        responseProcessor?: SecurityApiResponseProcessor
    ) {
        this.api = new ObservableSecurityApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      
     * @param assignChangeAuthorRequest 
     */
    public assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<PermissionOfPrincipalsResponse> {
        const result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<PermissionOfMetadataResponse> {
        const result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it\'s dependencies to the org admins of the orgs to which it is being published.      
     * @param publishMetadataRequest 
     */
    public publishMetadata(publishMetadataRequest: PublishMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.publishMetadata(publishMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views * Connections  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.      
     * @param shareMetadataRequest 
     */
    public shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      
     * @param unpublishMetadataRequest 
     */
    public unpublishMetadata(unpublishMetadataRequest: UnpublishMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unpublishMetadata(unpublishMetadataRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSystemApi } from './ObservableAPI';

import { SystemApiRequestFactory, SystemApiResponseProcessor} from "../apis/SystemApi";
export class PromiseSystemApi {
    private api: ObservableSystemApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SystemApiRequestFactory,
        responseProcessor?: SystemApiResponseProcessor
    ) {
        this.api = new ObservableSystemApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      
     */
    public getSystemConfig(_options?: Configuration): Promise<SystemConfig> {
        const result = this.api.getSystemConfig(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemInformation(_options?: Configuration): Promise<SystemInfo> {
        const result = this.api.getSystemInformation(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemOverrideInfo(_options?: Configuration): Promise<any> {
        const result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.      
     * @param updateSystemConfigRequest 
     */
    public updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    }


}



import { ObservableTagsApi } from './ObservableAPI';

import { TagsApiRequestFactory, TagsApiResponseProcessor} from "../apis/TagsApi";
export class PromiseTagsApi {
    private api: ObservableTagsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TagsApiRequestFactory,
        responseProcessor?: TagsApiResponseProcessor
    ) {
        this.api = new ObservableTagsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param createTagRequest 
     */
    public createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag> {
        const result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      
     * @param searchTagsRequest 
     */
    public searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>> {
        const result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    }


}



import { ObservableThoughtSpotRestApi } from './ObservableAPI';

import { ThoughtSpotRestApiRequestFactory, ThoughtSpotRestApiResponseProcessor} from "../apis/ThoughtSpotRestApi";
export class PromiseThoughtSpotRestApi {
    private api: ObservableThoughtSpotRestApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ThoughtSpotRestApiRequestFactory,
        responseProcessor?: ThoughtSpotRestApiResponseProcessor
    ) {
        this.api = new ObservableThoughtSpotRestApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      
     * @param activateUserRequest 
     */
    public activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.activateUser(activateUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.      
     * @param assignChangeAuthorRequest 
     */
    public assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignChangeAuthor(assignChangeAuthorRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.assignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param changeUserPasswordRequest 
     */
    public changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitBranchRequest 
     */
    public commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse> {
        const result = this.api.commitBranch(commitBranchRequest, _options);
        return result.toPromise();
    }

    /**
     *  Convert worksheets to models    Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (Can manage data models).  ---  ## Usage Guidelines  ### Parameters  1. **worksheet_ids**      - **Description:** A comma-separated list of GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted.      - **Usage:**        - Used only when `convert_all` is set to `false`.        - Leave empty or omit when `convert_all` is set to `true`.  2. **exclude_worksheet_ids**      - **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from conversion.      - **Usage:**        - Useful when `convert_all` is set to `true` and specific Worksheets should not be converted.  3. **convert_all**      - **Description:** Sets the scope of conversion.    - **Options:**        - `true`: Converts all Worksheets in the system, except those specified in `exclude_worksheet_ids`.        - `false`: Converts only the Worksheets listed in `worksheet_ids`.  4. **apply_changes**      - **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a preview before applying any changes.Used for validation of conversion.    - **Options:**        - `true`: Applies conversion changes directly to ThoughtSpot.      - `false`: Generates only a preview of the changes and does not apply any changes to ThoughtSpot  ---  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the conversion process  2. **Partial Conversion for Testing:**      Test the conversion process by setting `convert_all` to `false` and specifying a small number of `worksheet_ids`.  3. **Verify Dependencies:**      Check for dependent objects, such as Tables and Connections, to avoid invalid references.  4. **Review Changes:**      Use `apply_changes: false` to preview the impact of the conversion before applying changes.  ---  ## Examples  ### Convert Specific Worksheets ```json {   \"worksheet_ids\": [\"guid1\", \"guid2\", \"guid3\"],   \"exclude_worksheet_ids\": [],   \"convert_all\": false,   \"apply_changes\": true } ```  ### Convert All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [],   \"convert_all\": true,   \"apply_changes\": true } ```  ### Exclude Specific Worksheets While Converting All Accessible Worksheets ```json {   \"worksheet_ids\": [],   \"exclude_worksheet_ids\": [\"abc\"],   \"convert_all\": true,   \"apply_changes\": true } ```     
     * @param convertWorksheetToModelRequest 
     */
    public convertWorksheetToModel(convertWorksheetToModelRequest: ConvertWorksheetToModelRequest, _options?: Configuration): Promise<ResponseWorksheetToModelConversion> {
        const result = this.api.convertWorksheetToModel(convertWorksheetToModelRequest, _options);
        return result.toPromise();
    }

    /**
     *  Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.      
     * @param copyObjectRequest 
     */
    public copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Promise<ResponseCopyObject> {
        const result = this.api.copyObject(copyObjectRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.      
     * @param createConfigRequest 
     */
    public createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.createConfig(createConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.      
     * @param createConnectionRequest 
     */
    public createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse> {
        const result = this.api.createConnection(createConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param createConversationRequest 
     */
    public createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<Conversation> {
        const result = this.api.createConversation(createConversationRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param createCustomActionRequest 
     */
    public createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction> {
        const result = this.api.createCustomAction(createCustomActionRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Creates a custom configuration for the email customisation  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To create a custom confuguration:  1. Pass these parameters in your API request.  - A JSON map of configuration attributes `template_properties`. The following example shows the configuration attribures for a csutom configuration:  ``` {     {     \"logoUrl\": \"<logo_url>\",     \"homeUrl\": \"<home_url>\",     \"productName\": \"<Company Name in the Mail>\",     \"footerAddress\": \"<address to be visible in the footer>\",     \"ctaButtonBgColor\": \"#444DEA\",     \"ctaTextFontColor\": \"#FFFFFF\",     \"primaryBgColor\": \"#D3DEF0\",     \"hideMobileAppNudge\": <true/false>,     \"hideTsVocabularyDefinitions\": <true/false>e,     \"hideProductName\": <true/false>,     \"hideFooterPhone\": <true/false>,     \"hideFooterAddress\": <true/false>,     \"hidePrivacyPolicy\": <true/false>,     \"hideManageNotification\": <true/false>,     \"fontfamily\": \"<to maintain a single font in the entire email>\"   } } ```      
     * @param createEmailCustomisationRequest 
     */
    public createEmailCustomisation(createEmailCustomisationRequest: CreateEmailCustomisationRequest, _options?: Configuration): Promise<CreateEmailCustomisationResponse> {
        const result = this.api.createEmailCustomisation(createEmailCustomisationRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param createOrgRequest 
     */
    public createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse> {
        const result = this.api.createOrg(createOrgRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param createRoleRequest 
     */
    public createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.createRole(createRoleRequest, _options);
        return result.toPromise();
    }

    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * For Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS formats. Schedules created in CSV formats for such Liveboards will fail to run. If `PDF` is set as the `file_format`, enable `pdf_options` to get the correct attachment. Not doing so may cause the attachment to be rendered empty. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. Please ensure that when setting the schedule frequency for _minute of the object_, only values that are multiples of 5 are included. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).     
     * @param createScheduleRequest 
     */
    public createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule> {
        const result = this.api.createSchedule(createScheduleRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param createTagRequest 
     */
    public createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag> {
        const result = this.api.createTag(createTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param createUserRequest 
     */
    public createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard      
     * @param createUserGroupRequest 
     */
    public createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse> {
        const result = this.api.createUserGroup(createUserGroupRequest, _options);
        return result.toPromise();
    }

    /**
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.9.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this.  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The variable values (optional)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid * The variable values are invalid for the specified type       
     * @param createVariableRequest 
     */
    public createVariable(createVariableRequest: CreateVariableRequest, _options?: Configuration): Promise<Variable> {
        const result = this.api.createVariable(createVariableRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.      
     * @param dbtConnectionRequest 
     */
    public dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<any> {
        const result = this.api.dbtConnection(dbtConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtGenerateSyncTmlRequest 
     */
    public dbtGenerateSyncTml(dbtGenerateSyncTmlRequest: DbtGenerateSyncTmlRequest, _options?: Configuration): Promise<any> {
        const result = this.api.dbtGenerateSyncTml(dbtGenerateSyncTmlRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.      
     * @param dbtGenerateTmlRequest 
     */
    public dbtGenerateTml(dbtGenerateTmlRequest: DbtGenerateTmlRequest, _options?: Configuration): Promise<any> {
        const result = this.api.dbtGenerateTml(dbtGenerateTmlRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.      
     */
    public dbtSearch(_options?: Configuration): Promise<Array<DbtSearchResponse>> {
        const result = this.api.dbtSearch(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      
     * @param deactivateUserRequest 
     */
    public deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<ResponseActivationURL> {
        const result = this.api.deactivateUser(deactivateUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.      
     * @param deleteConfigRequest 
     */
    public deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConfig(deleteConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later    **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your connection objects.    #### Usage guidelines  Deletes a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.     
     * @param deleteConnectionRequest 
     */
    public deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConnection(deleteConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.      
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    public deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConnectionV2(connectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    public deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteCustomAction(customActionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)      
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    public deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteDbtConnection(dbtConnectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Deletes the configuration for the email customisation.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  Deletes the configuration available for the cluster/org. Pass the `template_identifier` in the API request.  Note: `template_identifier` can be fetched from search API request.      
     * @param templateIdentifier Unique ID or name of the email customization.
     */
    public deleteEmailCustomisation(templateIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteEmailCustomisation(templateIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.       
     * @param deleteMetadataRequest 
     */
    public deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteMetadata(deleteMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.      
     * @param orgIdentifier ID or name of the Org
     */
    public deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteOrg(orgIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role. ReadOnly roles cannot be deleted.
     */
    public deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteRole(roleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.      
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    public deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteSchedule(scheduleIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    public deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteTag(tagIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     */
    public deleteUser(userIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.      
     * @param groupIdentifier GUID or name of the group.
     */
    public deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUserGroup(groupIdentifier, _options);
        return result.toPromise();
    }

    /**
     *  Delete a variable   Version: 10.9.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn\'t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable
     */
    public deleteVariable(identifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteVariable(identifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param deployCommitRequest 
     */
    public deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.deployCommit(deployCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.downloadConnectionMetadataChanges(connectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires at least view access to the Answer.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  **NOTE**: * The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with tables.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       
     * @param exportAnswerReportRequest 
     */
    public exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.exportAnswerReport(exportAnswerReportRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Exports a Liveboard and its visualizations in PDF or PNG file format.  Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is PDF. For PDF downloads, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  **NOTE**: The downloadable file returned in API response file is extensionless. Please rename the downloaded file by typing in the relevant extension.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).       
     * @param exportLiveboardReportRequest 
     */
    public exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.exportLiveboardReport(exportLiveboardReportRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation. * To export only the TML of feedbacks associated with an object, set the GUID of the object as `identifier`, and set the `type` as `FEEDBACK` in the `metadata` array. * To export the TML of an object along with the feedbacks associated with it, set the GUID of the object as `identifier`, set the `type` as `LOGIAL_TABLE` in the `metadata` array, and set `export_with_associated_feedbacks` in `export_options` to true.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).  For more information on feedbacks, see [Feedback Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).     
     * @param exportMetadataTMLRequest 
     */
    public exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.exportMetadataTML(exportMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  ### **Permissions Required**  Requires `DATAMANAGEMENT` (**Can manage data**) and `USERMANAGEMENT` (**Can manage users**) privileges.  #### **Usage Guidelines**  This API is only applicable for `USER`, `GROUP`, and `ROLES` metadata types.  - `batch_offset` Indicates the starting position within the complete dataset from which the API should begin returning objects. Useful for paginating results efficiently. - `batch_size` Specifies the number of objects or items to retrieve in a single request. Helps control response size for better performance. - `edoc_format` Defines the format of the TML content. The exported metadata can be in JSON or YAML format. - `export_dependent` Specifies whether to include dependent metadata objects in the export. Ensures related objects are also retrieved if needed. - `all_orgs_override` Indicates whether the export operation applies across all organizations. Useful for multi-tenant environments where cross-org exports are required.      
     * @param exportMetadataTMLBatchedRequest 
     */
    public exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Promise<any> {
        const result = this.api.exportMetadataTMLBatched(exportMetadataTMLBatchedRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).     
     * @param fetchAnswerDataRequest 
     */
    public fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse> {
        const result = this.api.fetchAnswerData(fetchAnswerDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```      
     * @param fetchAnswerSqlQueryRequest 
     */
    public fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.     
     * @param fetchAsyncImportTaskStatusRequest 
     */
    public fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Promise<GetAsyncImportStatusResponse> {
        const result = this.api.fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.      
     * @param connectionIdentifier GUID of the connection
     */
    public fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<FetchConnectionDiffStatusResponse> {
        const result = this.api.fetchConnectionDiffStatus(connectionIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).     
     * @param fetchLiveboardDataRequest 
     */
    public fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse> {
        const result = this.api.fetchLiveboardData(fetchLiveboardDataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```      
     * @param fetchLiveboardSqlQueryRequest 
     */
    public fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse> {
        const result = this.api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).      
     * @param fetchLogsRequest 
     */
    public fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>> {
        const result = this.api.fetchLogs(fetchLogsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.        
     * @param fetchPermissionsOfPrincipalsRequest 
     */
    public fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<PermissionOfPrincipalsResponse> {
        const result = this.api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.      
     * @param fetchPermissionsOnMetadataRequest 
     */
    public fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<PermissionOfMetadataResponse> {
        const result = this.api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param forceLogoutUsersRequest 
     */
    public forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<void> {
        const result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.      
     */
    public getCurrentUserInfo(_options?: Configuration): Promise<User> {
        const result = this.api.getCurrentUserInfo(_options);
        return result.toPromise();
    }

    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.      
     */
    public getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse> {
        const result = this.api.getCurrentUserToken(_options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  Specify the object type as `LOGICAL_TABLE`.  The `LIVEBOARD` and `ANSWER` object types are not supported.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.      
     * @param getCustomAccessTokenRequest 
     */
    public getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Promise<AccessToken> {
        const result = this.api.getCustomAccessToken(getCustomAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getFullAccessTokenRequest 
     */
    public getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getFullAccessToken(getFullAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. You can switch to token-based authentication with  `secret_key`  or contact ThoughtSpot Support for assistance.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created.      
     * @param getObjectAccessTokenRequest 
     */
    public getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token> {
        const result = this.api.getObjectAccessToken(getObjectAccessTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.      
     */
    public getSystemConfig(_options?: Configuration): Promise<SystemConfig> {
        const result = this.api.getSystemConfig(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemInformation(_options?: Configuration): Promise<SystemInfo> {
        const result = this.api.getSystemInformation(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.        
     */
    public getSystemOverrideInfo(_options?: Configuration): Promise<any> {
        const result = this.api.getSystemOverrideInfo(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).      
     * @param importMetadataTMLRequest 
     */
    public importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.importMetadataTML(importMetadataTMLRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.      
     * @param importMetadataTMLAsyncRequest 
     */
    public importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Promise<ImportEPackAsyncTaskStatus> {
        const result = this.api.importMetadataTMLAsync(importMetadataTMLAsyncRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.      
     * @param importUserGroupsRequest 
     */
    public importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse> {
        const result = this.api.importUserGroups(importUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param importUsersRequest 
     */
    public importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse> {
        const result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API login request with basic authentication (`username`  and `password` ) returns an error. Contact ThoughtSpot Support for assistance.  A successful login returns a session cookie that can be used in your subsequent API requests.     
     * @param loginRequest 
     */
    public login(loginRequest: LoginRequest, _options?: Configuration): Promise<void> {
        const result = this.api.login(loginRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.      
     */
    public logout(_options?: Configuration): Promise<void> {
        const result = this.api.logout(_options);
        return result.toPromise();
    }

    /**
     *  Parameterize fields in metadata objects.   Version: 10.9.0.cl or later   Allows parameterizing fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows parameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always `CONNECTION_PROPERTY`. We use the field_name in this case to specify the exact property of a connection which needs to be parameterized.      
     * @param parameterizeMetadataRequest 
     */
    public parameterizeMetadata(parameterizeMetadataRequest: ParameterizeMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.parameterizeMetadata(parameterizeMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.9.0.cl or later   Allows publishing metadata objects across organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  This API will essentially share the objects along with it\'s dependencies to the org admins of the orgs to which it is being published.      
     * @param publishMetadataRequest 
     */
    public publishMetadata(publishMetadataRequest: PublishMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.publishMetadata(publishMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     * Version: 10.7.0.cl or later 
     * @param queryGetDecomposedQueryRequest 
     */
    public queryGetDecomposedQuery(queryGetDecomposedQueryRequest: QueryGetDecomposedQueryRequest, _options?: Configuration): Promise<EurekaDecomposeQueryResponse> {
        const result = this.api.queryGetDecomposedQuery(queryGetDecomposedQueryRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param resetUserPasswordRequest 
     */
    public resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest 
     */
    public revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse> {
        const result = this.api.revertCommit(commitId, revertCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param revokeTokenRequest 
     */
    public revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<void> {
        const result = this.api.revokeToken(revokeTokenRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param searchCommitsRequest 
     */
    public searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>> {
        const result = this.api.searchCommits(searchCommitsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.      
     * @param searchConfigRequest 
     */
    public searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>> {
        const result = this.api.searchConfig(searchConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.      
     * @param searchConnectionRequest 
     */
    public searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>> {
        const result = this.api.searchConnection(searchConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.      
     * @param searchCustomActionsRequest 
     */
    public searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>> {
        const result = this.api.searchCustomActions(searchCustomActionsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).       
     * @param searchDataRequest 
     */
    public searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse> {
        const result = this.api.searchData(searchDataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Search the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.  #### Usage guidelines  To get the list of configurations set in the cluster/org.      
     */
    public searchEmailCustomisation(_options?: Configuration): Promise<Array<CreateEmailCustomisationResponse>> {
        const result = this.api.searchEmailCustomisation(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To filter metadata objects within type `LOGICAL_TABLE`, set the `subtypes` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE` & subtypes as `[WORKSHEET]`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response. - To get discoverable objects when linientmodel is enabled you can use `include_discoverable_objects` as true else false. Default value is true. - For liveboard metadata type, to get the newer format, set the `liveboard_response_format` as V2. Default value is V1.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `subtypes` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchMetadataRequest 
     */
    public searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>> {
        const result = this.api.searchMetadata(searchMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param searchOrgsRequest 
     */
    public searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>> {
        const result = this.api.searchOrgs(searchOrgsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.      
     * @param searchRolesRequest 
     */
    public searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>> {
        const result = this.api.searchRoles(searchRolesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.      
     * @param searchSchedulesRequest 
     */
    public searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>> {
        const result = this.api.searchSchedules(searchSchedulesRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.      
     * @param searchTagsRequest 
     */
    public searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>> {
        const result = this.api.searchTags(searchTagsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.      
     * @param searchUserGroupsRequest 
     */
    public searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>> {
        const result = this.api.searchUserGroups(searchUserGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.      
     * @param searchUsersRequest 
     */
    public searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<Array<User>> {
        const result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *  Search variables   Version: 10.9.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA_ONLY - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values       
     * @param searchVariablesRequest 
     */
    public searchVariables(searchVariablesRequest: SearchVariablesRequest, _options?: Configuration): Promise<Array<Variable>> {
        const result = this.api.searchVariables(searchVariablesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest 
     */
    public sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<Array<ResponseMessage>> {
        const result = this.api.sendMessage(conversationIdentifier, sendMessageRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views * Connections  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.      
     * @param shareMetadataRequest 
     */
    public shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.shareMetadata(shareMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.      
     * @param singleAnswerRequest 
     */
    public singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<ResponseMessage> {
        const result = this.api.singleAnswer(singleAnswerRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.      
     * @param assignTagRequest 
     */
    public unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unassignTag(assignTagRequest, _options);
        return result.toPromise();
    }

    /**
     *  Remove parameterization from fields in metadata objects.   Version: 10.9.0.cl or later   Allows removing parameterization from fields in metadata objects in ThoughtSpot.  Requires appropriate permissions to modify the metadata object.  The API endpoint allows unparameterizing the following types of metadata objects: * Logical Tables * Connections  For a Logical Table the field type must be `ATTRIBUTE` and field name can be one of: * databaseName * schemaName * tableName  For a Connection the field type is always `CONNECTION_PROPERTY`. We use the field_name in this case to specify the exact property of a connection which needs to be unparameterized.      
     * @param unparameterizeMetadataRequest 
     */
    public unparameterizeMetadata(unparameterizeMetadataRequest: UnparameterizeMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unparameterizeMetadata(unparameterizeMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.9.0.cl or later   Allows unpublishing metadata objects from organizations in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables  When unpublishing objects, you can: * Include dependencies by setting `include_dependencies` to true - this will unpublish all dependent objects if no other published object is using them * Force unpublish by setting `force` to true - this will break all dependent objects in the unpublished organizations      
     * @param unpublishMetadataRequest 
     */
    public unpublishMetadata(unpublishMetadataRequest: UnpublishMetadataRequest, _options?: Configuration): Promise<void> {
        const result = this.api.unpublishMetadata(unpublishMetadataRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.      
     * @param updateConfigRequest 
     */
    public updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.updateConfig(updateConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   **Important**: This endpoint is deprecated and will be removed from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your connection objects.  #### Usage guidelines  Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param updateConnectionRequest 
     */
    public updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateConnection(updateConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.      
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request 
     */
    public updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<void> {
        const result = this.api.updateConnectionV2(connectionIdentifier, updateConnectionV2Request, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).      
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest 
     */
    public updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateCustomAction(customActionIdentifier, updateCustomActionRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.      
     * @param updateDbtConnectionRequest 
     */
    public updateDbtConnection(updateDbtConnectionRequest: UpdateDbtConnectionRequest, _options?: Configuration): Promise<any> {
        const result = this.api.updateDbtConnection(updateDbtConnectionRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update header attributes for a given list of header objects.   Version: 10.6.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **headers_update**      - **Description:** List of header objects with their attributes to be updated. Each object contains a list of attributes to be updated in the header.    - **Usage:**       - You must provide either `identifier` or `obj_identifier`, but not both. Both fields cannot be empty.       - When `org_identifier` is set to `-1`, only the `identifier` value is accepted; `obj_identifier` is not allowed.  2. **org_identifier**      - **Description:** GUID (Globally Unique Identifier) or name of the organization.      - **Usage:**      - Leaving this field empty assumes that the changes should be applied to the current organization       - Provide `org_guid` or `org_name` to uniquely identify the organization where changes need to be applied. .      - Provide `-1` if changes have to be applied across all the org.  ---  ## Note Currently, this API is enabled only for updating the `obj_identifier` attribute. Only `text` will be allowed in attribute\'s value.  ## Best Practices  1. **Backup Before Conversion:**      Always export metadata as a backup before initiating the update process  ---  ## Examples  ### Only `identifier` is given  ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"obj_identifier\": \"\",       \"type\": \"LOGICAL_COLUMN\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgGuid\" } ```  ### Only `obj_identifier` is given ```json {   \"headers_update\":   [     {       \"obj_identifier\": \"custom_object_id\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": \"orgName\" } ```  ### Executing update for all org `-1` ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"type\": \"ANSWER\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```  ### Optional `type` is not provided ```json {   \"headers_update\":   [     {       \"identifier\": \"guid_1\",       \"attributes\":       [         {           \"name\": \"obj_id\",           \"value\": \"custom_object_id\"         }       ]     }   ],   \"org_identifier\": -1 } ```     
     * @param updateMetadataHeaderRequest 
     */
    public updateMetadataHeader(updateMetadataHeaderRequest: UpdateMetadataHeaderRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateMetadataHeader(updateMetadataHeaderRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update object IDs for given metadata objects.   Version: 10.8.0.cl or later   ## Prerequisites - **Privileges Required:**   - `DATAMANAGEMENT` (Can manage data) or `ADMINISTRATION` (Can administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):**   - `ORG_ADMINISTRATION` (Can manage orgs).  ---  ## Usage Guidelines  ### Parameters  1. **metadata**      - **Description:** List of metadata objects to update their object IDs.    - **Usage:**       - Use either `current_obj_id` alone OR use `metadata_identifier` with `type` (when needed).       - When using `metadata_identifier`, the `type` field is required if using a name instead of a GUID.       - The `new_obj_id` field is always required.  ---  ## Note This API is specifically designed for updating object IDs of metadata objects. It internally uses the header update mechanism to perform the changes.  ## Best Practices  1. **Backup Before Update:**      Always export metadata as a backup before initiating the update process.  2. **Validation:**    - When using `current_obj_id`, ensure it matches the existing object ID exactly.    - When using `metadata_identifier` with a name, ensure the `type` is specified correctly.    - Verify that the `new_obj_id` follows your naming conventions and is unique within your system.  ---  ## Examples  ### Using current_obj_id ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with GUID ```json {   \"metadata\": [     {       \"metadata_identifier\": \"01234567-89ab-cdef-0123-456789abcdef\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Using metadata_identifier with name and type ```json {   \"metadata\": [     {       \"metadata_identifier\": \"My Answer\",       \"type\": \"ANSWER\",       \"new_obj_id\": \"new_object_id\"     }   ] } ```  ### Multiple objects update ```json {   \"metadata\": [     {       \"current_obj_id\": \"existing_object_id_1\",       \"new_obj_id\": \"new_object_id_1\"     },     {       \"metadata_identifier\": \"My Worksheet\",       \"type\": \"LOGICAL_TABLE\",       \"new_obj_id\": \"new_object_id_2\"     }   ] } ```      
     * @param updateMetadataObjIdRequest 
     */
    public updateMetadataObjId(updateMetadataObjIdRequest: UpdateMetadataObjIdRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateMetadataObjId(updateMetadataObjIdRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.      
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest 
     */
    public updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateOrg(orgIdentifier, updateOrgRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.      
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest 
     */
    public updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse> {
        const result = this.api.updateRole(roleIdentifier, updateRoleRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.      
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest 
     */
    public updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSchedule(scheduleIdentifier, updateScheduleRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.      
     * @param updateSystemConfigRequest 
     */
    public updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateSystemConfig(updateSystemConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.      
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest 
     */
    public updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateTag(tagIdentifier, updateTagRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings      
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest 
     */
    public updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUserGroup(groupIdentifier, updateUserGroupRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update a variable\'s properties   Version: 10.9.0.cl or later   Allows updating a variable\'s properties in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows updating: * The variable name * The variable values  When updating variable values, you need to specify: * The operation to perform (ADD, REPLACE, REMOVE) * The new values to add/replace/remove  When the operation is ADD, a value any pre-existing value with the same set of constraints will be replaced. When the operation is REPLACE, all values of the variable are replaced with the values specified. When the operation is REMOVE, all values with the given set of conditions are removed.      
     * @param identifier Unique id or name of the variable to update.
     * @param updateVariableRequest 
     */
    public updateVariable(identifier: string, updateVariableRequest: UpdateVariableRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateVariable(identifier, updateVariableRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update values for multiple variables   Version: 10.9.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE)  Behaviour based on operation type: * ADD - Adds values to the variable. Any pre-existing values with the same conditions are replaced. * REPLACE - Replaces all values of a given org with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables.      
     * @param updateVariableValuesRequest 
     */
    public updateVariableValues(updateVariableValuesRequest: UpdateVariableValuesRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateVariableValues(updateVariableValuesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Version: 10.10.0.cl or later   Validates the email customisation configuration if any set for the ThoughtSpot system.  #### Pre-requisites  Requires `DEVELOPER` (**has developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `_Has developer privilege` privilege is required. Coms should be enabled on the cluster.      
     */
    public validateEmailCustomisation(_options?: Configuration): Promise<void> {
        const result = this.api.validateEmailCustomisation(_options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param validateMergeRequest 
     */
    public validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.validateMerge(validateMergeRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).      
     * @param validateTokenRequest 
     */
    public validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Promise<TokenValidationResponse> {
        const result = this.api.validateToken(validateTokenRequest, _options);
        return result.toPromise();
    }


}



import { ObservableUsersApi } from './ObservableAPI';

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class PromiseUsersApi {
    private api: ObservableUsersApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.      
     * @param activateUserRequest 
     */
    public activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.activateUser(activateUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param changeUserPasswordRequest 
     */
    public changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.changeUserPassword(changeUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param createUserRequest 
     */
    public createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User> {
        const result = this.api.createUser(createUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.      
     * @param deactivateUserRequest 
     */
    public deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<ResponseActivationURL> {
        const result = this.api.deactivateUser(deactivateUserRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     */
    public deleteUser(userIdentifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteUser(userIdentifier, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param forceLogoutUsersRequest 
     */
    public forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<void> {
        const result = this.api.forceLogoutUsers(forceLogoutUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param importUsersRequest 
     */
    public importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse> {
        const result = this.api.importUsers(importUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param resetUserPasswordRequest 
     */
    public resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void> {
        const result = this.api.resetUserPassword(resetUserPasswordRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.      
     * @param searchUsersRequest 
     */
    public searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<Array<User>> {
        const result = this.api.searchUsers(searchUsersRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.      
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest 
     */
    public updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateUser(userIdentifier, updateUserRequest, _options);
        return result.toPromise();
    }


}



import { ObservableVariableApi } from './ObservableAPI';

import { VariableApiRequestFactory, VariableApiResponseProcessor} from "../apis/VariableApi";
export class PromiseVariableApi {
    private api: ObservableVariableApi

    public constructor(
        configuration: Configuration,
        requestFactory?: VariableApiRequestFactory,
        responseProcessor?: VariableApiResponseProcessor
    ) {
        this.api = new ObservableVariableApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *  Create a variable which can be used for parameterizing metadata objects   Version: 10.9.0.cl or later   Allows creating a variable which can be used for parameterizing metadata objects in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For connection properties per principal. In order to use this please contact support to enable this.  When creating a variable, you need to specify: * The variable type * A unique name for the variable * Whether the variable contains sensitive values (defaults to false) * The variable values (optional)  The operation will fail if: * The user lacks required permissions * The variable name already exists * The variable type is invalid * The variable values are invalid for the specified type       
     * @param createVariableRequest 
     */
    public createVariable(createVariableRequest: CreateVariableRequest, _options?: Configuration): Promise<Variable> {
        const result = this.api.createVariable(createVariableRequest, _options);
        return result.toPromise();
    }

    /**
     *  Delete a variable   Version: 10.9.0.cl or later   Allows deleting a variable from ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint requires: * The variable identifier (ID or name)  The operation will fail if: * The user lacks required permissions * The variable doesn\'t exist * The variable is being used by other objects      
     * @param identifier Unique id or name of the variable
     */
    public deleteVariable(identifier: string, _options?: Configuration): Promise<void> {
        const result = this.api.deleteVariable(identifier, _options);
        return result.toPromise();
    }

    /**
     *  Search variables   Version: 10.9.0.cl or later   Allows searching for variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint supports searching variables by: * Variable identifier (ID or name) * Variable type * Name pattern (case-insensitive, supports % for wildcard)  The search results can be formatted in three ways: * METADATA_ONLY - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns variable metadata and values * EDITABLE_METADATA_AND_VALUES - Returns only editable variable metadata and values       
     * @param searchVariablesRequest 
     */
    public searchVariables(searchVariablesRequest: SearchVariablesRequest, _options?: Configuration): Promise<Array<Variable>> {
        const result = this.api.searchVariables(searchVariablesRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update a variable\'s properties   Version: 10.9.0.cl or later   Allows updating a variable\'s properties in ThoughtSpot.  Requires ADMINISTRATION role and TENANT scope.  The API endpoint allows updating: * The variable name * The variable values  When updating variable values, you need to specify: * The operation to perform (ADD, REPLACE, REMOVE) * The new values to add/replace/remove  When the operation is ADD, a value any pre-existing value with the same set of constraints will be replaced. When the operation is REPLACE, all values of the variable are replaced with the values specified. When the operation is REMOVE, all values with the given set of conditions are removed.      
     * @param identifier Unique id or name of the variable to update.
     * @param updateVariableRequest 
     */
    public updateVariable(identifier: string, updateVariableRequest: UpdateVariableRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateVariable(identifier, updateVariableRequest, _options);
        return result.toPromise();
    }

    /**
     *  Update values for multiple variables   Version: 10.9.0.cl or later   Allows updating values for multiple variables in ThoughtSpot.  Requires ADMINISTRATION role.  The API endpoint allows: * Adding new values to variables * Replacing existing values * Deleting values from variables  When updating variable values, you need to specify: * The variable identifiers * The values to add/replace/remove for each variable * The operation to perform (ADD, REPLACE, REMOVE)  Behaviour based on operation type: * ADD - Adds values to the variable. Any pre-existing values with the same conditions are replaced. * REPLACE - Replaces all values of a given org with the current set of values. * REMOVE - Removes any values which match the set of conditions of the variables.      
     * @param updateVariableValuesRequest 
     */
    public updateVariableValues(updateVariableValuesRequest: UpdateVariableValuesRequest, _options?: Configuration): Promise<void> {
        const result = this.api.updateVariableValues(updateVariableValuesRequest, _options);
        return result.toPromise();
    }


}



import { ObservableVersionControlApi } from './ObservableAPI';

import { VersionControlApiRequestFactory, VersionControlApiResponseProcessor} from "../apis/VersionControlApi";
export class PromiseVersionControlApi {
    private api: ObservableVersionControlApi

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionControlApiRequestFactory,
        responseProcessor?: VersionControlApiResponseProcessor
    ) {
        this.api = new ObservableVersionControlApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitBranchRequest 
     */
    public commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse> {
        const result = this.api.commitBranch(commitBranchRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.      
     * @param createConfigRequest 
     */
    public createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.createConfig(createConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.      
     * @param deleteConfigRequest 
     */
    public deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<void> {
        const result = this.api.deleteConfig(deleteConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param deployCommitRequest 
     */
    public deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.deployCommit(deployCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).      
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest 
     */
    public revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse> {
        const result = this.api.revertCommit(commitId, revertCommitRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param searchCommitsRequest 
     */
    public searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>> {
        const result = this.api.searchCommits(searchCommitsRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.      
     * @param searchConfigRequest 
     */
    public searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>> {
        const result = this.api.searchConfig(searchConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.      
     * @param updateConfigRequest 
     */
    public updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject> {
        const result = this.api.updateConfig(updateConfigRequest, _options);
        return result.toPromise();
    }

    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.      
     * @param validateMergeRequest 
     */
    public validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>> {
        const result = this.api.validateMerge(validateMergeRequest, _options);
        return result.toPromise();
    }


}



