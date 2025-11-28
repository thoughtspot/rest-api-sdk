/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.api;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.model.AccessToken;
import com.thoughtspot.client.model.ActivateUserRequest;
import com.thoughtspot.client.model.AgentConversation;
import com.thoughtspot.client.model.AnswerDataResponse;
import com.thoughtspot.client.model.AssignChangeAuthorRequest;
import com.thoughtspot.client.model.AssignTagRequest;
import com.thoughtspot.client.model.CalendarResponse;
import com.thoughtspot.client.model.ChangeUserPasswordRequest;
import com.thoughtspot.client.model.ColumnSecurityRuleResponse;
import com.thoughtspot.client.model.CommitBranchRequest;
import com.thoughtspot.client.model.CommitHistoryResponse;
import com.thoughtspot.client.model.CommitResponse;
import com.thoughtspot.client.model.CommunicationChannelPreferencesResponse;
import com.thoughtspot.client.model.ConfigureCommunicationChannelPreferencesRequest;
import com.thoughtspot.client.model.ConnectionConfigurationResponse;
import com.thoughtspot.client.model.ConnectionConfigurationSearchRequest;
import com.thoughtspot.client.model.Conversation;
import com.thoughtspot.client.model.ConvertWorksheetToModelRequest;
import com.thoughtspot.client.model.CopyObjectRequest;
import com.thoughtspot.client.model.CreateAgentConversationRequest;
import com.thoughtspot.client.model.CreateCalendarRequest;
import com.thoughtspot.client.model.CreateConfigRequest;
import com.thoughtspot.client.model.CreateConnectionConfigurationRequest;
import com.thoughtspot.client.model.CreateConnectionRequest;
import com.thoughtspot.client.model.CreateConnectionResponse;
import com.thoughtspot.client.model.CreateConversationRequest;
import com.thoughtspot.client.model.CreateCustomActionRequest;
import com.thoughtspot.client.model.CreateEmailCustomizationRequest;
import com.thoughtspot.client.model.CreateEmailCustomizationResponse;
import com.thoughtspot.client.model.CreateOrgRequest;
import com.thoughtspot.client.model.CreateRoleRequest;
import com.thoughtspot.client.model.CreateScheduleRequest;
import com.thoughtspot.client.model.CreateTagRequest;
import com.thoughtspot.client.model.CreateUserGroupRequest;
import com.thoughtspot.client.model.CreateUserRequest;
import com.thoughtspot.client.model.CreateVariableRequest;
import com.thoughtspot.client.model.CreateWebhookConfigurationRequest;
import com.thoughtspot.client.model.DbtSearchResponse;
import com.thoughtspot.client.model.DeactivateUserRequest;
import com.thoughtspot.client.model.DeleteConfigRequest;
import com.thoughtspot.client.model.DeleteConnectionConfigurationRequest;
import com.thoughtspot.client.model.DeleteConnectionRequest;
import com.thoughtspot.client.model.DeleteMetadataRequest;
import com.thoughtspot.client.model.DeleteOrgEmailCustomizationRequest;
import com.thoughtspot.client.model.DeleteWebhookConfigurationsRequest;
import com.thoughtspot.client.model.DeployCommitRequest;
import com.thoughtspot.client.model.DeployResponse;
import com.thoughtspot.client.model.EurekaDecomposeQueryResponse;
import com.thoughtspot.client.model.EurekaGetRelevantQuestionsResponse;
import com.thoughtspot.client.model.ExportAnswerReportRequest;
import com.thoughtspot.client.model.ExportLiveboardReportRequest;
import com.thoughtspot.client.model.ExportMetadataTMLBatchedRequest;
import com.thoughtspot.client.model.ExportMetadataTMLRequest;
import com.thoughtspot.client.model.FetchAnswerDataRequest;
import com.thoughtspot.client.model.FetchAnswerSqlQueryRequest;
import com.thoughtspot.client.model.FetchAsyncImportTaskStatusRequest;
import com.thoughtspot.client.model.FetchColumnSecurityRulesRequest;
import com.thoughtspot.client.model.FetchConnectionDiffStatusResponse;
import com.thoughtspot.client.model.FetchLiveboardDataRequest;
import com.thoughtspot.client.model.FetchLiveboardSqlQueryRequest;
import com.thoughtspot.client.model.FetchLogsRequest;
import com.thoughtspot.client.model.FetchPermissionsOfPrincipalsRequest;
import com.thoughtspot.client.model.FetchPermissionsOnMetadataRequest;
import com.thoughtspot.client.model.ForceLogoutUsersRequest;
import com.thoughtspot.client.model.GenerateCSVRequest;
import com.thoughtspot.client.model.GetAsyncImportStatusResponse;
import com.thoughtspot.client.model.GetCustomAccessTokenRequest;
import com.thoughtspot.client.model.GetFullAccessTokenRequest;
import com.thoughtspot.client.model.GetObjectAccessTokenRequest;
import com.thoughtspot.client.model.GetRelevantQuestionsRequest;
import com.thoughtspot.client.model.GetTokenResponse;
import com.thoughtspot.client.model.ImportEPackAsyncTaskStatus;
import com.thoughtspot.client.model.ImportMetadataTMLAsyncRequest;
import com.thoughtspot.client.model.ImportMetadataTMLRequest;
import com.thoughtspot.client.model.ImportUserGroupsRequest;
import com.thoughtspot.client.model.ImportUserGroupsResponse;
import com.thoughtspot.client.model.ImportUsersRequest;
import com.thoughtspot.client.model.ImportUsersResponse;
import com.thoughtspot.client.model.LiveboardDataResponse;
import com.thoughtspot.client.model.LogResponse;
import com.thoughtspot.client.model.LoginRequest;
import com.thoughtspot.client.model.MetadataSearchResponse;
import com.thoughtspot.client.model.OrgResponse;
import com.thoughtspot.client.model.ParameterizeMetadataRequest;
import com.thoughtspot.client.model.PermissionOfMetadataResponse;
import com.thoughtspot.client.model.PermissionOfPrincipalsResponse;
import com.thoughtspot.client.model.PublishMetadataRequest;
import com.thoughtspot.client.model.QueryGetDecomposedQueryRequest;
import com.thoughtspot.client.model.RepoConfigObject;
import com.thoughtspot.client.model.ResetUserPasswordRequest;
import com.thoughtspot.client.model.ResponseActivationURL;
import com.thoughtspot.client.model.ResponseCopyObject;
import com.thoughtspot.client.model.ResponseCustomAction;
import com.thoughtspot.client.model.ResponseMessage;
import com.thoughtspot.client.model.ResponseSchedule;
import com.thoughtspot.client.model.ResponseWorksheetToModelConversion;
import com.thoughtspot.client.model.RevertCommitRequest;
import com.thoughtspot.client.model.RevertResponse;
import com.thoughtspot.client.model.RevokeTokenRequest;
import com.thoughtspot.client.model.RoleResponse;
import com.thoughtspot.client.model.SearchCalendarsRequest;
import com.thoughtspot.client.model.SearchCommitsRequest;
import com.thoughtspot.client.model.SearchCommunicationChannelPreferencesRequest;
import com.thoughtspot.client.model.SearchConfigRequest;
import com.thoughtspot.client.model.SearchConnectionRequest;
import com.thoughtspot.client.model.SearchConnectionResponse;
import com.thoughtspot.client.model.SearchCustomActionsRequest;
import com.thoughtspot.client.model.SearchDataRequest;
import com.thoughtspot.client.model.SearchDataResponse;
import com.thoughtspot.client.model.SearchEmailCustomizationRequest;
import com.thoughtspot.client.model.SearchMetadataRequest;
import com.thoughtspot.client.model.SearchOrgsRequest;
import com.thoughtspot.client.model.SearchRoleResponse;
import com.thoughtspot.client.model.SearchRolesRequest;
import com.thoughtspot.client.model.SearchSchedulesRequest;
import com.thoughtspot.client.model.SearchTagsRequest;
import com.thoughtspot.client.model.SearchUserGroupsRequest;
import com.thoughtspot.client.model.SearchUsersRequest;
import com.thoughtspot.client.model.SearchVariablesRequest;
import com.thoughtspot.client.model.SearchWebhookConfigurationsRequest;
import com.thoughtspot.client.model.SendAgentMessageResponse;
import com.thoughtspot.client.model.SendAgentMessageStreamingRequest;
import com.thoughtspot.client.model.SendMessageRequest;
import com.thoughtspot.client.model.ShareMetadataRequest;
import com.thoughtspot.client.model.SingleAnswerRequest;
import com.thoughtspot.client.model.SqlQueryResponse;
import com.thoughtspot.client.model.SystemConfig;
import com.thoughtspot.client.model.SystemInfo;
import com.thoughtspot.client.model.SystemOverrideInfo;
import com.thoughtspot.client.model.Tag;
import com.thoughtspot.client.model.Token;
import com.thoughtspot.client.model.TokenValidationResponse;
import com.thoughtspot.client.model.UnparameterizeMetadataRequest;
import com.thoughtspot.client.model.UnpublishMetadataRequest;
import com.thoughtspot.client.model.UpdateCalendarRequest;
import com.thoughtspot.client.model.UpdateColumnSecurityRulesRequest;
import com.thoughtspot.client.model.UpdateConfigRequest;
import com.thoughtspot.client.model.UpdateConnectionConfigurationRequest;
import com.thoughtspot.client.model.UpdateConnectionRequest;
import com.thoughtspot.client.model.UpdateConnectionV2Request;
import com.thoughtspot.client.model.UpdateCustomActionRequest;
import com.thoughtspot.client.model.UpdateEmailCustomizationRequest;
import com.thoughtspot.client.model.UpdateMetadataHeaderRequest;
import com.thoughtspot.client.model.UpdateMetadataObjIdRequest;
import com.thoughtspot.client.model.UpdateOrgRequest;
import com.thoughtspot.client.model.UpdateRoleRequest;
import com.thoughtspot.client.model.UpdateScheduleRequest;
import com.thoughtspot.client.model.UpdateSystemConfigRequest;
import com.thoughtspot.client.model.UpdateTagRequest;
import com.thoughtspot.client.model.UpdateUserGroupRequest;
import com.thoughtspot.client.model.UpdateUserRequest;
import com.thoughtspot.client.model.UpdateVariableRequest;
import com.thoughtspot.client.model.UpdateVariableValuesRequest;
import com.thoughtspot.client.model.UpdateWebhookConfigurationRequest;
import com.thoughtspot.client.model.User;
import com.thoughtspot.client.model.UserGroupResponse;
import com.thoughtspot.client.model.ValidateMergeRequest;
import com.thoughtspot.client.model.ValidateTokenRequest;
import com.thoughtspot.client.model.Variable;
import com.thoughtspot.client.model.WebhookDeleteResponse;
import com.thoughtspot.client.model.WebhookResponse;
import com.thoughtspot.client.model.WebhookSearchResponse;
import java.io.File;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for ThoughtSpotRestApi */
@Disabled
public class ThoughtSpotRestApiTest {

    private final ThoughtSpotRestApi api = new ThoughtSpotRestApi();

    /**
     * Version: 9.7.0.cl or later Activates a deactivated user account. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer Thoughtspot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To activate
     * an inactive user account, the API request body must include the following information: -
     * Username or the GUID of the user account. - Auth token generated for the deactivated user.
     * The auth token is sent in the API response when a user is deactivated. - Password for the
     * user account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateUserTest() throws ApiException {
        ActivateUserRequest activateUserRequest = null;
        User response = api.activateUser(activateUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Transfers the ownership of one or several objects from one user to
     * another. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege and
     * edit access to the objects are required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignChangeAuthorTest() throws ApiException {
        AssignChangeAuthorRequest assignChangeAuthorRequest = null;
        api.assignChangeAuthor(assignChangeAuthorRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Assigns tags to Liveboards, Answers, Tables, and Worksheets.
     * Requires edit access to the metadata object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignTagTest() throws ApiException {
        AssignTagRequest assignTagRequest = null;
        api.assignTag(assignTagRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates the current password of the user. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeUserPasswordTest() throws ApiException {
        ChangeUserPasswordRequest changeUserPasswordRequest = null;
        api.changeUserPassword(changeUserPasswordRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Commits TML files of metadata objects to the Git branch configured
     * on your instance. Requires at least edit access to objects used in the commit operation.
     * Before using this endpoint to push your commits: * Enable Git integration on your instance. *
     * Make sure the Git repository and branch details are configured on your instance. For more
     * information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/git-integration).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commitBranchTest() throws ApiException {
        CommitBranchRequest commitBranchRequest = null;
        CommitResponse response = api.commitBranch(commitBranchRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Configure communication channel preferences. - Use
     * &#x60;cluster_preferences&#x60; to update the default preferences for your ThoughtSpot
     * application instance. - If your instance has
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use
     * &#x60;org_preferences&#x60; to specify Org-specific preferences that override the defaults.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60;
     * (**Has developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are
     * also authorized to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void configureCommunicationChannelPreferencesTest() throws ApiException {
        ConfigureCommunicationChannelPreferencesRequest
                configureCommunicationChannelPreferencesRequest = null;
        api.configureCommunicationChannelPreferences(
                configureCommunicationChannelPreferencesRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Gets connection configuration objects. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. #### Usage guidelines * To get a list of all
     * configurations available in the ThoughtSpot system, send the API request with only the
     * connection name or GUID in the request body. * To fetch details of a configuration object,
     * specify the configuration object name or GUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void connectionConfigurationSearchTest() throws ApiException {
        ConnectionConfigurationSearchRequest connectionConfigurationSearchRequest = null;
        List<ConnectionConfigurationResponse> response =
                api.connectionConfigurationSearch(connectionConfigurationSearchRequest);
        // TODO: test validations
    }

    /**
     * Convert worksheets to models Version: 10.6.0.cl or later ## Prerequisites - **Privileges
     * Required:** - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or &#x60;ADMINISTRATION&#x60; (Can
     * administer ThoughtSpot). - **Additional Privileges (if RBAC is enabled):** -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (Can manage data models). --- ## Usage
     * Guidelines ### Parameters 1. **worksheet_ids** - **Description:** A comma-separated list of
     * GUIDs (Globally Unique Identifiers) specifying the Worksheets to be converted. - **Usage:** -
     * Used only when &#x60;convert_all&#x60; is set to &#x60;false&#x60;. - Leave empty or omit
     * when &#x60;convert_all&#x60; is set to &#x60;true&#x60;. 2. **exclude_worksheet_ids** -
     * **Description:** A comma-separated list of GUIDs specifying Worksheets to be excluded from
     * conversion. - **Usage:** - Useful when &#x60;convert_all&#x60; is set to &#x60;true&#x60; and
     * specific Worksheets should not be converted. 3. **convert_all** - **Description:** Sets the
     * scope of conversion. - **Options:** - &#x60;true&#x60;: Converts all Worksheets in the
     * system, except those specified in &#x60;exclude_worksheet_ids&#x60;. - &#x60;false&#x60;:
     * Converts only the Worksheets listed in &#x60;worksheet_ids&#x60;. 4. **apply_changes** -
     * **Description:** Specifies whether to apply changes directly to ThoughtSpot or to generate a
     * preview before applying any changes.Used for validation of conversion. - **Options:** -
     * &#x60;true&#x60;: Applies conversion changes directly to ThoughtSpot. - &#x60;false&#x60;:
     * Generates only a preview of the changes and does not apply any changes to ThoughtSpot --- ##
     * Best Practices 1. **Backup Before Conversion:** Always export metadata as a backup before
     * initiating the conversion process 2. **Partial Conversion for Testing:** Test the conversion
     * process by setting &#x60;convert_all&#x60; to &#x60;false&#x60; and specifying a small number
     * of &#x60;worksheet_ids&#x60;. 3. **Verify Dependencies:** Check for dependent objects, such
     * as Tables and Connections, to avoid invalid references. 4. **Review Changes:** Use
     * &#x60;apply_changes: false&#x60; to preview the impact of the conversion before applying
     * changes. --- ## Examples ### Convert Specific Worksheets &#x60;&#x60;&#x60;json {
     * \&quot;worksheet_ids\&quot;: [\&quot;guid1\&quot;, \&quot;guid2\&quot;, \&quot;guid3\&quot;],
     * \&quot;exclude_worksheet_ids\&quot;: [], \&quot;convert_all\&quot;: false,
     * \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60; ### Convert All Accessible Worksheets
     * &#x60;&#x60;&#x60;json { \&quot;worksheet_ids\&quot;: [],
     * \&quot;exclude_worksheet_ids\&quot;: [], \&quot;convert_all\&quot;: true,
     * \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60; ### Exclude Specific Worksheets While
     * Converting All Accessible Worksheets &#x60;&#x60;&#x60;json { \&quot;worksheet_ids\&quot;:
     * [], \&quot;exclude_worksheet_ids\&quot;: [\&quot;abc\&quot;], \&quot;convert_all\&quot;:
     * true, \&quot;apply_changes\&quot;: true } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertWorksheetToModelTest() throws ApiException {
        ConvertWorksheetToModelRequest convertWorksheetToModelRequest = null;
        ResponseWorksheetToModelConversion response =
                api.convertWorksheetToModel(convertWorksheetToModelRequest);
        // TODO: test validations
    }

    /**
     * Makes a copy of an Answer or Liveboard Version: 10.3.0.cl or later Creates a copy of a
     * metadata object. Requires at least view access to the metadata object being copied. Upon
     * successful execution, the API creates a copy of the metadata object specified in the API
     * request and returns the ID of the new object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void copyObjectTest() throws ApiException {
        CopyObjectRequest copyObjectRequest = null;
        ResponseCopyObject response = api.copyObject(copyObjectRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.13.0.cl or later
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAgentConversationTest() throws ApiException {
        CreateAgentConversationRequest createAgentConversationRequest = null;
        AgentConversation response = api.createAgentConversation(createAgentConversationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Creates a new [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can create a custom calendar from scratch or
     * an existing Table in ThoughtSpot. For both methods of calendar creation, the following
     * parameters are required: * Name of the custom calendar. * Calendar creation method. To create
     * a calendar from an existing table, specify the method: - &#x60;FROM_EXISTING_TABLE&#x60; -
     * Creates calendar from the table reference provided in the API request. -
     * &#x60;FROM_INPUT_PARAMS&#x60; - Creates a calendar from the parameters defined in the API
     * request. * Connection ID and Table name * Database and schema name attributes: For most Cloud
     * Data Warehouse (CDW) connectors, both &#x60;database_name&#x60; and &#x60;schema_name&#x60;
     * attributes are required. However, the attribute requirements are conditional and vary based
     * on the connector type and its metadata structure. For example, for connectors such as
     * Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL, Oracle, and GCP_MYSQL,
     * the &#x60;schema_name&#x60; is required, whereas the &#x60;database_name&#x60; attribute is
     * not. Similarly, connectors such as ClickHouse require you to specify the
     * &#x60;database_name&#x60; and the schema specification in such cases is optional. **NOTE**:
     * If you are creating a calendar from an existing table, ensure that the referenced table
     * matches the required DDL for custom calendars. If the schema does not match, the API returns
     * an error. ##### Calendar type The API allows you to create the following types of calendars:
     * * &#x60;MONTH_OFFSET&#x60;. The default calendar type. A &#x60;MONTH_OFFSET&#x60; calendar is
     * offset by a few months from the standard calendar months (January to December) and the year
     * begins with the month defined in the request. For example, if the &#x60;month_offset&#x60;
     * value is set as &#x60;April&#x60;, the calendar year begins in April. * &#x60;4-4-5&#x60;.
     * Each quarter in the calendar will include two 4-week months followed by one 5-week month. *
     * &#x60;4-5-4&#x60;. Each quarter in the calendar will include two 4-week months with a 5-week
     * month between. * &#x60;5-4-4&#x60;. Each quarter begins with a 5-week month, followed by two
     * 4-week months. To start and end the calendar on a specific date, specify the dates in the
     * &#x60;MM/DD/YYYY&#x60; format. For &#x60;MONTH_OFFSET&#x60; calendars, ensure that the
     * &#x60;start_date&#x60; matches the month specified in the &#x60;month_offset&#x60; attribute.
     * You can also set the starting day of the week and customize the prefixes for year and quarter
     * labels. #### Examples To create a calendar from an existing table: &#x60;&#x60;&#x60; {
     * \&quot;name\&quot;: \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;, } &#x60;&#x60;&#x60; To
     * create a calendar from scratch: &#x60;&#x60;&#x60; { \&quot;name\&quot;:
     * \&quot;MyCustomCalendar1\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;4db8ea22-2ff4-4224-b05a-26674717e468\&quot;,
     * \&quot;table_name\&quot;: \&quot;MyCalendarTable\&quot;, \&quot;database_name\&quot;:
     * \&quot;RETAILAPPAREL\&quot;, \&quot;schema_name\&quot;: \&quot;PUBLIC\&quot; },
     * \&quot;creation_method\&quot;: \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;calendar_type\&quot;:
     * \&quot;MONTH_OFFSET\&quot;, \&quot;month_offset\&quot;: \&quot;April\&quot;,
     * \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;, \&quot;quarter_name_prefix\&quot;:
     * \&quot;Q\&quot;, \&quot;year_name_prefix\&quot;: \&quot;FY\&quot;, \&quot;start_date\&quot;:
     * \&quot;04/01/2025\&quot;, \&quot;end_date\&quot;: \&quot;04/31/2025\&quot; }
     * &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCalendarTest() throws ApiException {
        CreateCalendarRequest createCalendarRequest = null;
        CalendarResponse response = api.createCalendar(createCalendarRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Allows you to connect a ThoughtSpot instance to a Git repository.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up
     * version control**) privilege. You can use this API endpoint to connect your ThoughtSpot
     * development and production environments to the development and production branches of a Git
     * repository. Before using this endpoint to connect your ThoughtSpot instance to a Git
     * repository, check the following prerequisites: * You have a Git repository. If you are using
     * GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to
     * GitHub. For information about generating a token, see [GitHub
     * Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).
     * * Your access token has &#x60;repo&#x60; scope that grants full access to public and private
     * repositories. * Your Git repository has a branch that can be configured as a default branch
     * in ThoughtSpot. For more information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/?pageid&#x3D;git-integration).
     * **Note**: ThoughtSpot supports only GitHub / itHub Enterprise for CI/CD.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConfigTest() throws ApiException {
        CreateConfigRequest createConfigRequest = null;
        RepoConfigObject response = api.createConfig(createConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Creates a connection to a data warehouse for live query services.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. #### Create a connection without tables To create a connection without tables: 1.
     * Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a SnowFlake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60; 2. Set &#x60;validate&#x60; to
     * &#x60;false&#x60;. #### Create a connection with tables To create a connection with tables:
     * 1. Pass these parameters in your API request. * Name of the connection. * Type of the data
     * warehouse to connect to. * A JSON map of configuration attributes, database details, and
     * table properties in &#x60;data_warehouse_config&#x60; as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ { \&quot;name\&quot;:\&quot;AllDatatypes\&quot;,
     * \&quot;isAutoCreated\&quot;:false, \&quot;schemas\&quot;:[ {
     * \&quot;name\&quot;:\&quot;alldatatypes\&quot;, \&quot;tables\&quot;:[ {
     * \&quot;name\&quot;:\&quot;allDatatypes\&quot;, \&quot;type\&quot;:\&quot;TABLE\&quot;,
     * \&quot;description\&quot;:\&quot;\&quot;, \&quot;selected\&quot;:true,
     * \&quot;linked\&quot;:true, \&quot;columns\&quot;:[ {
     * \&quot;name\&quot;:\&quot;CNUMBER\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; }, {
     * \&quot;name\&quot;:\&quot;CDECIMAL\&quot;, \&quot;type\&quot;:\&quot;INT64\&quot;,
     * \&quot;canImport\&quot;:true, \&quot;selected\&quot;:true, \&quot;isLinkedActive\&quot;:true,
     * \&quot;isImported\&quot;:false, \&quot;tableName\&quot;:\&quot;allDatatypes\&quot;,
     * \&quot;schemaName\&quot;:\&quot;alldatatypes\&quot;,
     * \&quot;dbName\&quot;:\&quot;AllDatatypes\&quot; } ] } ] } ] } ] } &#x60;&#x60;&#x60; 2. Set
     * &#x60;validate&#x60; to &#x60;true&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectionTest() throws ApiException {
        CreateConnectionRequest createConnectionRequest = null;
        CreateConnectionResponse response = api.createConnection(createConnectionRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Creates an additional configuration to an existing connection to
     * a data warehouse. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. #### Usage guidelines * A JSON map of configuration attributes in
     * &#x60;configuration&#x60;. The following example shows the configuration attributes:
     * &#x60;&#x60;&#x60; { \&quot;user\&quot;:\&quot;DEV_USER\&quot;,
     * \&quot;password\&quot;:\&quot;TestConn123\&quot;, \&quot;role\&quot;:\&quot;DEV\&quot;,
     * \&quot;warehouse\&quot;:\&quot;DEV_WH\&quot; } &#x60;&#x60;&#x60; * If the
     * &#x60;policy_type&#x60; is &#x60;PRINCIPALS&#x60;, then &#x60;policy_principals&#x60; is a
     * required field. * If the &#x60;policy_type&#x60; is &#x60;PROCESSES&#x60;, then
     * &#x60;policy_processes&#x60; is a required field. * If the &#x60;policy_type&#x60; is
     * &#x60;NO_POLICY&#x60;, then &#x60;policy_principals&#x60; and &#x60;policy_processes&#x60;
     * are not required fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectionConfigurationTest() throws ApiException {
        CreateConnectionConfigurationRequest createConnectionConfigurationRequest = null;
        ConnectionConfigurationResponse response =
                api.createConnectionConfiguration(createConnectionConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Creates a Conversation object to start an AI-driven conversation
     * based on a specific data model. Requires at least view access to the metadata object
     * specified in the request. #### Usage guidelines This API requires the
     * &#x60;metadata_identifier&#x60; parameter to define the context for the conversation. You can
     * also specify the tokens to initiate the conversation as shown in this example:
     * &#x60;\&quot;tokens\&quot;: \&quot;[tea],[sales],[type]\&quot;&#x60; If the API request is
     * successful, ThoughtSpot returns the ID of the conversation. &gt; ###### Note: &gt; * This
     * endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made
     * Generally Available. &gt; * This endpoint requires Spotter - please contact ThoughtSpot
     * support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConversationTest() throws ApiException {
        CreateConversationRequest createConversationRequest = null;
        Conversation response = api.createConversation(createConversationRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.6.0.cl or later Creates a custom action that appears as a menu action on a saved
     * Answer or Liveboard visualization. Requires &#x60;DEVELOPER&#x60; (**Has Developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. #### Usage Guidelines The API lets you create the following types of custom
     * actions: * URL-based action Allows pushing data to an external URL. * Callback action
     * Triggers a callback to the host application and initiates a response payload on an embedded
     * ThoughtSpot instance. By default, custom actions are visible to only administrator or
     * developer users. To make a custom action available to other users, and specify the groups in
     * &#x60;group_identifiers&#x60;. By default, the custom action is set as a _global_ action on
     * all visualizations and saved Answers. To assign a custom action to specific Liveboard
     * visualization, saved Answer, or Worksheet, set &#x60;visibility&#x60; to &#x60;false&#x60; in
     * &#x60;default_action_config&#x60; property and specify the GUID or name of the object in
     * &#x60;associate_metadata&#x60;. For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomActionTest() throws ApiException {
        CreateCustomActionRequest createCustomActionRequest = null;
        ResponseCustomAction response = api.createCustomAction(createCustomActionRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Creates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To create a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmailCustomizationTest() throws ApiException {
        CreateEmailCustomizationRequest createEmailCustomizationRequest = null;
        CreateEmailCustomizationResponse response =
                api.createEmailCustomization(createEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates an Org object. To use this API, the
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in
     * your cluster. Requires cluster administration (**Can administer Org**) privileges. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrgTest() throws ApiException {
        CreateOrgRequest createOrgRequest = null;
        OrgResponse response = api.createOrg(createOrgRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Creates a Role object in ThoughtSpot. Available only if
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance. To create a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage
     * roles**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        CreateRoleRequest createRoleRequest = null;
        RoleResponse response = api.createRole(createRoleRequest);
        // TODO: test validations
    }

    /**
     * Create schedule. Version: 9.4.0.cl or later Creates a Liveboard schedule job. Requires at
     * least edit access to Liveboards. To create a schedule on behalf of another user, you need
     * &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can
     * schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required. #### Usage
     * guidelines * The description text is mandatory. The description text appears as
     * **Description: &lt;your content&gt;** in the Liveboard schedule email notifications. * For
     * Liveboards with both charts and tables, schedule creation is only supported in PDF and XLS
     * formats. Schedules created in CSV formats for such Liveboards will fail to run. If
     * &#x60;PDF&#x60; is set as the &#x60;file_format&#x60;, enable &#x60;pdf_options&#x60; to get
     * the correct attachment. Not doing so may cause the attachment to be rendered empty. * To
     * include only specific visualizations, specify the visualization GUIDs in the
     * &#x60;visualization_identifiers&#x60; array. * You can schedule a Liveboard job to run
     * periodically by setting frequency parameters. You can set the schedule to run daily, weekly,
     * monthly or every n minutes or hours. The scheduled job can also be configured to run at a
     * specific time of the day or on specific days of the week or month. Please ensure that when
     * setting the schedule frequency for _minute of the object_, only values that are multiples of
     * 5 are included. * If the &#x60;frequency&#x60; parameters are defined, you can set the time
     * zone to a value that matches your server&#39;s time zone. For example,
     * &#x60;US/Central&#x60;, &#x60;Etc/UTC&#x60;, &#x60;CET&#x60;. The default time zone is
     * &#x60;America/Los_Angeles&#x60;. For more information about Liveboard jobs, see [ThoughtSpot
     * Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createScheduleTest() throws ApiException {
        CreateScheduleRequest createScheduleRequest = null;
        ResponseSchedule response = api.createSchedule(createScheduleRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates a tag object. Tags are labels that identify a metadata
     * object. For example, you can create a tag to designate subject areas, such as sales, HR,
     * marketing, and finance. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and
     * delete tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        CreateTagRequest createTagRequest = null;
        Tag response = api.createTag(createTagRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates a user in ThoughtSpot. The API endpoint allows you to
     * configure several user properties such as email address, account status, share notification
     * preferences, and sharing visibility. You can provision the user to
     * [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard,
     * Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for
     * the user, and set user preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        CreateUserRequest createUserRequest = null;
        User response = api.createUser(createUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * About groups Groups in ThoughtSpot are used by the administrators to define privileges and
     * organize users based on their roles and access requirements. To know more about groups and
     * privileges, see [ThoughtSpot Product
     * Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges). #### Supported
     * operations The API endpoint lets you perform the following operations: * Assign privileges *
     * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserGroupTest() throws ApiException {
        CreateUserGroupRequest createUserGroupRequest = null;
        UserGroupResponse response = api.createUserGroup(createUserGroupRequest);
        // TODO: test validations
    }

    /**
     * Create a variable which can be used for parameterizing metadata objects Version: 10.14.0.cl
     * or later Allows creating a variable which can be used for parameterizing metadata objects in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES
     * permission allows you to manage Formula Variables in the current organization scope. The API
     * endpoint supports the following types of variables: * CONNECTION_PROPERTY - For connection
     * properties * TABLE_MAPPING - For table mappings * CONNECTION_PROPERTY_PER_PRINCIPAL - For
     * connection properties per principal. In order to use this please contact support to enable
     * this. * FORMULA_VARIABLE - For Formula variables, introduced in 10.15.0.cl When creating a
     * variable, you need to specify: * The variable type * A unique name for the variable * Whether
     * the variable contains sensitive values (defaults to false) * The data type of the variable,
     * only specify for formula variables (defaults to null) The operation will fail if: * The user
     * lacks required permissions * The variable name already exists * The variable type is invalid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVariableTest() throws ApiException {
        CreateVariableRequest createVariableRequest = null;
        Variable response = api.createVariable(createVariableRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Creates a new webhook configuration to receive notifications for
     * specified events. The webhook will be triggered when the configured events occur in the
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to
     * perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookConfigurationTest() throws ApiException {
        CreateWebhookConfigurationRequest createWebhookConfigurationRequest = null;
        WebhookResponse response =
                api.createWebhookConfiguration(createWebhookConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Creates a DBT connection object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About create
     * DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials
     * for cloud . The API needs embrace connection, embrace database name, DBT url, import type,
     * DBT account identifier, DBT project identifier, DBT access token and environment details (or)
     * embrace connection, embrace database name, import type, file_content to create a connection
     * object. To know more about DBT, see ThoughtSpot Product Documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtConnectionTest() throws ApiException {
        String connectionName = null;
        String databaseName = null;
        String importType = null;
        String accessToken = null;
        String dbtUrl = null;
        String accountId = null;
        String projectId = null;
        String dbtEnvId = null;
        String projectName = null;
        File fileContent = null;
        Object response =
                api.dbtConnection(
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Resynchronize the existing list of models, tables, worksheet tml’s
     * and import them to Thoughtspot based on the DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtGenerateSyncTmlTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        File fileContent = null;
        Object response = api.dbtGenerateSyncTml(dbtConnectionIdentifier, fileContent);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Generate required table and worksheet and import them. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege, along with an existing DBT
     * connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About
     * generate TML Models and Worksheets to be imported can be selected by the user as part of the
     * API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtGenerateTmlTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        String modelTables = null;
        String importWorksheets = null;
        String worksheets = null;
        File fileContent = null;
        Object response =
                api.dbtGenerateTml(
                        dbtConnectionIdentifier,
                        modelTables,
                        importWorksheets,
                        worksheets,
                        fileContent);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Gets a list of DBT connection objects by user and organization,
     * available on the ThoughtSpot system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege or &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About search
     * DBT connection To get details of a specific DBT connection identifier, database connection
     * identifier, database connection name, database name, project name, project identifier,
     * environment identifier , import type and author.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dbtSearchTest() throws ApiException {
        List<DbtSearchResponse> response = api.dbtSearch();
        // TODO: test validations
    }

    /**
     * Version: 9.7.0.cl or later Deactivates a user account. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. To deactivate a
     * user account, the API request body must include the following information: - Username or the
     * GUID of the user account - Base URL of the ThoughtSpot instance If the API request is
     * successful, ThoughtSpot returns the activation URL in the response. The activation URL is
     * valid for 14 days and can be used to re-activate the account and reset the password of the
     * deactivated account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateUserTest() throws ApiException {
        DeactivateUserRequest deactivateUserRequest = null;
        ResponseActivationURL response = api.deactivateUser(deactivateUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Deletes a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines To delete a custom calendar, specify the
     * calendar ID as a path parameter in the request URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCalendarTest() throws ApiException {
        String calendarIdentifier = null;
        api.deleteCalendar(calendarIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Deletes Git repository configuration from your ThoughtSpot
     * instance. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up
     * version control**) privilege.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConfigTest() throws ApiException {
        DeleteConfigRequest deleteConfigRequest = null;
        api.deleteConfig(deleteConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and will be removed
     * from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Delete
     * Connection V2](#/http/api-endpoints/connections/delete-connection-v2) endpoint to delete your
     * connection objects. #### Usage guidelines Deletes a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. **Note**: If a connection has dependent objects, make
     * sure you remove its associations before the delete operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionTest() throws ApiException {
        DeleteConnectionRequest deleteConnectionRequest = null;
        api.deleteConnection(deleteConnectionRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Deletes connection configuration objects. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionConfigurationTest() throws ApiException {
        DeleteConnectionConfigurationRequest deleteConnectionConfigurationRequest = null;
        api.deleteConnectionConfiguration(deleteConnectionConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Deletes a connection object. **Note**: If a connection has
     * dependent objects, make sure you remove its associations before the delete operation.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the
     * connection object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionV2Test() throws ApiException {
        String connectionIdentifier = null;
        api.deleteConnectionV2(connectionIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.6.0.cl or later Removes the custom action specified in the API request. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomActionTest() throws ApiException {
        String customActionIdentifier = null;
        api.deleteCustomAction(customActionIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Removes the specified DBT connection object from the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDbtConnectionTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        api.deleteDbtConnection(dbtConnectionIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the
     * &#x60;template_identifier&#x60; from the response. - Use that &#x60;template_identifier&#x60;
     * as a parameter in this API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmailCustomizationTest() throws ApiException {
        String templateIdentifier = null;
        api.deleteEmailCustomization(templateIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Removes the specified metadata object from the ThoughtSpot system.
     * Requires edit access to the metadata object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMetadataTest() throws ApiException {
        DeleteMetadataRequest deleteMetadataRequest = null;
        api.deleteMetadata(deleteMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Deletes an Org object from the ThoughtSpot system. Requires
     * cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required. When you delete
     * an Org, all its users and objects created in that Org context are removed. However, if the
     * users in the deleted Org also exists in other Orgs, they are removed only from the deleted
     * Org.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgTest() throws ApiException {
        String orgIdentifier = null;
        api.deleteOrg(orgIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Deletes the configuration for the email customization. ####
     * Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines - Call the search API endpoint to get the &#x60;org_identifier&#x60;
     * from the response. - Use that &#x60;org_identifier&#x60; as a parameter in this API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgEmailCustomizationTest() throws ApiException {
        DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest = null;
        api.deleteOrgEmailCustomization(deleteOrgEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Deletes a Role object from the ThoughtSpot system. Available only
     * if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance. To delete a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage
     * roles**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        String roleIdentifier = null;
        api.deleteRole(roleIdentifier);
        // TODO: test validations
    }

    /**
     * Deletes a scheduled job. Version: 9.4.0.cl or later Deletes a scheduled Liveboard job.
     * Requires at least edit access to Liveboard or &#x60;ADMINISTRATION&#x60; (**Can administer
     * Org**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteScheduleTest() throws ApiException {
        String scheduleIdentifier = null;
        api.deleteSchedule(scheduleIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Deletes a tag object from the ThoughtSpot system Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit,
     * and delete tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tagIdentifier = null;
        api.deleteTag(tagIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Deletes a user from the ThoughtSpot system. If you want to remove
     * a user from a specific Org but not from ThoughtSpot, update the group and Org mapping
     * properties of the user object via a POST API call to the
     * [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user)
     * endpoint. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userIdentifier = null;
        api.deleteUser(userIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Removes the specified group object from the ThoughtSpot system.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserGroupTest() throws ApiException {
        String groupIdentifier = null;
        api.deleteUserGroup(groupIdentifier);
        // TODO: test validations
    }

    /**
     * Delete a variable Version: 10.14.0.cl or later Allows deleting a variable from ThoughtSpot.
     * Requires ADMINISTRATION role and TENANT scope. The CAN_MANAGE_VARIABLES permission allows you
     * to manage Formula Variables in the current organization scope. The API endpoint requires: *
     * The variable identifier (ID or name) The operation will fail if: * The user lacks required
     * permissions * The variable doesn&#39;t exist * The variable is being used by other objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVariableTest() throws ApiException {
        String identifier = null;
        api.deleteVariable(identifier);
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Deletes one or more webhook configurations by their unique id or
     * name. Returns status of each deletion operation, including successfully deleted webhooks and
     * any failures with error details. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**)
     * privilege are also authorized to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookConfigurationsTest() throws ApiException {
        DeleteWebhookConfigurationsRequest deleteWebhookConfigurationsRequest = null;
        WebhookDeleteResponse response =
                api.deleteWebhookConfigurations(deleteWebhookConfigurationsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Allows you to deploy a commit and publish TML content to your
     * ThoughtSpot instance. Requires at least edit access to the objects used in the deploy
     * operation. The API deploys the head of the branch unless a &#x60;commit_id&#x60; is specified
     * in the API request. If the branch name is not defined in the request, the default branch is
     * considered for deploying commits. For more information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/git-integration).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deployCommitTest() throws ApiException {
        DeployCommitRequest deployCommitRequest = null;
        List<DeployResponse> response = api.deployCommit(deployCommitRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Exports the difference in connection metadata between CDW and
     * ThoughtSpot Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) To download the
     * connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadConnectionMetadataChangesTest() throws ApiException {
        String connectionIdentifier = null;
        File response = api.downloadConnectionMetadataChanges(connectionIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Exports an Answer in the given file format. You can download the
     * Answer data as a PDF, PNG, CSV, or XLSX file. Requires at least view access to the Answer.
     * #### Usage guidelines In the request body, the GUID or name of the Answer and set
     * &#x60;file_format&#x60;. The default file format is CSV. **NOTE**: * The downloadable file
     * returned in API response file is extensionless. Please rename the downloaded file by typing
     * in the relevant extension. * HTML rendering is not supported for PDF exports of Answers with
     * tables. Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportAnswerReportTest() throws ApiException {
        ExportAnswerReportRequest exportAnswerReportRequest = null;
        File response = api.exportAnswerReport(exportAnswerReportRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Exports a Liveboard and its visualizations in PDF, PNG, or CSV
     * file format. Requires at least view access to the Liveboard. #### Usage guidelines In the
     * request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with
     * specific visualizations, add GUIDs or names of the visualizations. The default
     * &#x60;file_format&#x60; is CSV. For PDF exports, you can specify additional parameters to
     * customize the page orientation and include or exclude the cover page, logo, footer text, and
     * page numbers. Similar customization options are available for PNG exports. CSV exports do not
     * support customization options. **NOTE**: The downloadable file returned in API response file
     * is extensionless. Please rename the downloaded file by typing in the relevant extension.
     * Optionally, you can define [runtime
     * overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides)
     * to apply to the Answer data. To include unsaved changes in the report, pass the
     * &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes, including ad hoc
     * changes to visualizations. For more information, see [Liveboard Report
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * **NOTE**: Starting with ThoughtSpot Cloud 10.9.0.cl release, the Liveboard can be exported in
     * the PNG format in the resolution of your choice. To enable this on your instance, contact
     * ThoughtSpot support. When this feature is enabled, the options
     * &#x60;include_cover_page&#x60;,&#x60;include_filter_page&#x60; within the
     * &#x60;png_options&#x60; will not be available for PNG exports. **NOTE**: Starting with the
     * ThoughtSpot Cloud 26.2.0.cl release, Liveboards can be exported in CSV format. All
     * visualizations in the Liveboard can be exported as individual CSV files. If multiple
     * visualizations are selected or if the entire Liveboard is exported, the output is returned as
     * a .zip file containing the CSV files for each visualization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportLiveboardReportTest() throws ApiException {
        ExportLiveboardReportRequest exportLiveboardReportRequest = null;
        File response = api.exportLiveboardReport(exportLiveboardReportRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml)
     * representation of metadata objects in JSON or YAML format. Requires
     * &#x60;DATADOWNLOADING&#x60; (**Can download Data**) and at least view access to the metadata
     * object. #### Usage guidelines * You can export one or several objects by passing metadata
     * object GUIDs in the &#x60;metadata&#x60; array. * When exporting TML content for a Liveboard
     * or Answer object, you can set &#x60;export_associated&#x60; to &#x60;true&#x60; to retrieve
     * TML content for underlying Worksheets, Tables, or Views, including the GUID of each object
     * within the headers. When &#x60;export_associated&#x60; is set to &#x60;true&#x60;, consider
     * retrieving one metadata object at a time. * Set &#x60;export_fqns&#x60; to &#x60;true&#x60;
     * to add FQNs of the referenced objects in the TML content. For example, if you send an API
     * request to retrieve TML for a Liveboard and its associated objects, the API returns the TML
     * content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if
     * ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when
     * importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the
     * referenced objects manually during the import operation. * To export only the TML of
     * feedbacks associated with an object, set the GUID of the object as &#x60;identifier&#x60;,
     * and set the &#x60;type&#x60; as &#x60;FEEDBACK&#x60; in the &#x60;metadata&#x60; array. * To
     * export the TML of an object along with the feedbacks associated with it, set the GUID of the
     * object as &#x60;identifier&#x60;, set the &#x60;type&#x60; as &#x60;LOGIAL_TABLE&#x60; in the
     * &#x60;metadata&#x60; array, and set &#x60;export_with_associated_feedbacks&#x60; in
     * &#x60;export_options&#x60; to true. For more information, see [TML
     * Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml). For more
     * information on feedbacks, see [Feedback
     * Documentation](https://docs.thoughtspot.com/cloud/latest/sage-feedback).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportMetadataTMLTest() throws ApiException {
        ExportMetadataTMLRequest exportMetadataTMLRequest = null;
        List<Object> response = api.exportMetadataTML(exportMetadataTMLRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.1.0.cl or later Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml)
     * representation of metadata objects in JSON or YAML format. ### **Permissions Required**
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and &#x60;USERMANAGEMENT&#x60;
     * (**Can manage users**) privileges. #### **Usage Guidelines** This API is only applicable for
     * &#x60;USER&#x60;, &#x60;GROUP&#x60;, and &#x60;ROLES&#x60; metadata types. -
     * &#x60;batch_offset&#x60; Indicates the starting position within the complete dataset from
     * which the API should begin returning objects. Useful for paginating results efficiently. -
     * &#x60;batch_size&#x60; Specifies the number of objects or items to retrieve in a single
     * request. Helps control response size for better performance. - &#x60;edoc_format&#x60;
     * Defines the format of the TML content. The exported metadata can be in JSON or YAML format. -
     * &#x60;export_dependent&#x60; Specifies whether to include dependent metadata objects in the
     * export. Ensures related objects are also retrieved if needed. - &#x60;all_orgs_override&#x60;
     * Indicates whether the export operation applies across all organizations. Useful for
     * multi-tenant environments where cross-org exports are required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportMetadataTMLBatchedTest() throws ApiException {
        ExportMetadataTMLBatchedRequest exportMetadataTMLBatchedRequest = null;
        Object response = api.exportMetadataTMLBatched(exportMetadataTMLBatchedRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches data from a saved Answer. Requires at least view access to
     * the saved Answer. The &#x60;record_size&#x60; attribute determines the number of records to
     * retrieve in an API call. For more information about pagination, record size, and maximum row
     * limit, see [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchAnswerDataTest() throws ApiException {
        FetchAnswerDataRequest fetchAnswerDataRequest = null;
        AnswerDataResponse response = api.fetchAnswerData(fetchAnswerDataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches the underlying SQL query data for an Answer object.
     * Requires at least view access to the Answer object. Upon successful execution, the API
     * returns the SQL queries for the specified object as shown in this example: &#x60;&#x60;&#x60;
     * { \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,
     * \&quot;metadata_name\&quot;:\&quot;Total sales\&quot;,
     * \&quot;metadata_type\&quot;:\&quot;ANSWER\&quot;, \&quot;sql_queries\&quot;:[ {
     * \&quot;metadata_id\&quot;:\&quot;8fbe44a8-46ad-4b16-8d39-184b2fada490\&quot;,
     * \&quot;metadata_name\&quot;:\&quot;Total sales -test\&quot;,
     * \&quot;sql_query\&quot;:\&quot;SELECT \\n \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot;
     * \\\&quot;ca_1\\\&quot;, \\n \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTNAME\\\&quot;
     * \\\&quot;ca_2\\\&quot;, \\n \\\&quot;ta_1\\\&quot;.\\\&quot;STORENAME\\\&quot;
     * \\\&quot;ca_3\\\&quot;, \\n CASE\\n WHEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)
     * IS NOT NULL THEN sum(\\\&quot;ta_3\\\&quot;.\\\&quot;SALES\\\&quot;)\\n ELSE 0\\n END
     * \\\&quot;ca_4\\\&quot;, \\n CASE\\n WHEN
     * sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN
     * sum(\\\&quot;ta_3\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n ELSE 0\\n END
     * \\\&quot;ca_5\\\&quot;\\nFROM
     * \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot;
     * \\\&quot;ta_3\\\&quot;\\n JOIN
     * \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot;
     * \\\&quot;ta_1\\\&quot;\\n ON \\\&quot;ta_3\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D;
     * \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\n JOIN
     * \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_PRODUCTS\\\&quot;
     * \\\&quot;ta_2\\\&quot;\\n ON \\\&quot;ta_3\\\&quot;.\\\&quot;PRODUCTID\\\&quot; &#x3D;
     * \\\&quot;ta_2\\\&quot;.\\\&quot;PRODUCTID\\\&quot;\\nGROUP BY \\n \\\&quot;ca_1\\\&quot;, \\n
     * \\\&quot;ca_2\\\&quot;, \\n \\\&quot;ca_3\\\&quot;\\n\&quot; } ] } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchAnswerSqlQueryTest() throws ApiException {
        FetchAnswerSqlQueryRequest fetchAnswerSqlQueryRequest = null;
        SqlQueryResponse response = api.fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Gets information about the status of the TML async import task
     * scheduled using the &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; API call. To fetch
     * the task details, specify the ID of the TML async import task. Requires access to the task
     * ID. The API allows users who initiated the asynchronous TML import via
     * &#x60;/api/rest/2.0/metadata/tml/async/import&#x60; to view the status of their tasks. Users
     * with administration privilege can view the status of all import tasks initiated by the users
     * in their Org. #### Usage guidelines See [TML API
     * Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task)
     * for usage guidelines.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchAsyncImportTaskStatusTest() throws ApiException {
        FetchAsyncImportTaskStatusRequest fetchAsyncImportTaskStatusRequest = null;
        GetAsyncImportStatusResponse response =
                api.fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Fetches column security rules for specified tables. This API
     * endpoint retrieves column-level security rules configured for tables. It returns information
     * about which columns are secured and which groups have access to those columns. #### Usage
     * guidelines - Provide an array of table identifiers using either &#x60;identifier&#x60; (GUID
     * or name) or &#x60;obj_identifier&#x60; (object ID) - At least one of &#x60;identifier&#x60;
     * or &#x60;obj_identifier&#x60; must be provided for each table - The API returns column
     * security rules for all specified tables - Users must have appropriate permissions to access
     * security rules for the specified tables #### Required permissions -
     * &#x60;ADMINISTRATION&#x60; - Can administer ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can
     * manage data - &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and
     * tables #### Example request &#x60;&#x60;&#x60;json { \&quot;tables\&quot;: [ {
     * \&quot;identifier\&quot;: \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;:
     * \&quot;table-object-id\&quot; } ] } &#x60;&#x60;&#x60; #### Response format The API returns
     * an array of &#x60;ColumnSecurityRuleResponse&#x60; objects wrapped in a &#x60;data&#x60;
     * field. Each &#x60;ColumnSecurityRuleResponse&#x60; object contains: - Table information (GUID
     * and object ID) - Array of column security rules with column details, group access, and source
     * table information #### Example response &#x60;&#x60;&#x60;json { \&quot;data\&quot;: [ {
     * \&quot;guid\&quot;: \&quot;table-guid\&quot;, \&quot;objId\&quot;:
     * \&quot;table-object-id\&quot;, \&quot;columnSecurityRules\&quot;: [ { \&quot;column\&quot;: {
     * \&quot;id\&quot;: \&quot;col_123\&quot;, \&quot;name\&quot;: \&quot;Salary\&quot; },
     * \&quot;groups\&quot;: [ { \&quot;id\&quot;: \&quot;group_1\&quot;, \&quot;name\&quot;:
     * \&quot;HR Department\&quot; } ], \&quot;sourceTableDetails\&quot;: { \&quot;id\&quot;:
     * \&quot;source-table-guid\&quot;, \&quot;name\&quot;: \&quot;Employee_Data\&quot; } } ] } ] }
     * &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchColumnSecurityRulesTest() throws ApiException {
        FetchColumnSecurityRulesRequest fetchColumnSecurityRulesRequest = null;
        List<ColumnSecurityRuleResponse> response =
                api.fetchColumnSecurityRules(fetchColumnSecurityRulesRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Validates the difference in connection metadata between CDW and
     * ThoughtSpot. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the following Data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) Returns a boolean
     * indicating whether there is any difference between the connection metadata at ThoughtSpot and
     * CDW. To get the connection metadata difference status, pass the connection GUID as
     * &#x60;connection_identifier&#x60; in the API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchConnectionDiffStatusTest() throws ApiException {
        String connectionIdentifier = null;
        FetchConnectionDiffStatusResponse response =
                api.fetchConnectionDiffStatus(connectionIdentifier);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets data from a Liveboard object and its visualization. Requires
     * at least view access to the Liveboard. #### Usage guidelines In the request body, specify the
     * GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or
     * names of the visualizations in the API request. To include unsaved changes in the report,
     * pass the &#x60;transient_pinboard_content&#x60; script generated from the
     * &#x60;getExportRequestForCurrentPinboard&#x60; method in the Visual Embed SDK. Upon
     * successful execution, the API returns the report with unsaved changes. If the new Liveboard
     * experience mode, the transient content includes ad hoc changes to visualizations such as
     * sorting, toggling of legends, and data drill down. For more information, and see [Liveboard
     * data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchLiveboardDataTest() throws ApiException {
        FetchLiveboardDataRequest fetchLiveboardDataRequest = null;
        LiveboardDataResponse response = api.fetchLiveboardData(fetchLiveboardDataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches the underlying SQL query data for a Liveboard object and
     * its visualizations. Requires at least view access to the Liveboard object. To get SQL query
     * data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of
     * visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard. Upon
     * successful execution, the API returns the SQL queries for the specified object as shown in
     * this example: &#x60;&#x60;&#x60; { \&quot;metadata_id\&quot;:
     * \&quot;fa68ae91-7588-4136-bacd-d71fb12dda69\&quot;, \&quot;metadata_name\&quot;: \&quot;Total
     * Sales\&quot;, \&quot;metadata_type\&quot;: \&quot;LIVEBOARD\&quot;,
     * \&quot;sql_queries\&quot;: [ { \&quot;metadata_id\&quot;:
     * \&quot;b3b6d2b9-089a-490c-8e16-b144650b7843\&quot;, \&quot;metadata_name\&quot;: \&quot;Total
     * quantity purchased, Total sales by region\&quot;, \&quot;sql_query\&quot;: \&quot;SELECT \\n
     * \\\&quot;ta_1\\\&quot;.\\\&quot;REGION\\\&quot; \\\&quot;ca_1\\\&quot;, \\n CASE\\n WHEN
     * sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;) IS NOT NULL THEN
     * sum(\\\&quot;ta_2\\\&quot;.\\\&quot;QUANTITYPURCHASED\\\&quot;)\\n ELSE 0\\n END
     * \\\&quot;ca_2\\\&quot;, \\n CASE\\n WHEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)
     * IS NOT NULL THEN sum(\\\&quot;ta_2\\\&quot;.\\\&quot;SALES\\\&quot;)\\n ELSE 0\\n END
     * \\\&quot;ca_3\\\&quot;\\nFROM
     * \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;FACT_RETAPP_SALES\\\&quot;
     * \\\&quot;ta_2\\\&quot;\\n JOIN
     * \\\&quot;RETAILAPPAREL\\\&quot;.\\\&quot;PUBLIC\\\&quot;.\\\&quot;DIM_RETAPP_STORES\\\&quot;
     * \\\&quot;ta_1\\\&quot;\\n ON \\\&quot;ta_2\\\&quot;.\\\&quot;STOREID\\\&quot; &#x3D;
     * \\\&quot;ta_1\\\&quot;.\\\&quot;STOREID\\\&quot;\\nGROUP BY \\\&quot;ca_1\\\&quot;\&quot; } ]
     * } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchLiveboardSqlQueryTest() throws ApiException {
        FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest = null;
        SqlQueryResponse response = api.fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches security audit logs. Requires &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin
     * Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are
     * required. #### Usage guidelines By default, the API retrieves logs for the last 24 hours. You
     * can set a custom duration in EPOCH time. Make sure the log duration specified in your API
     * request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the
     * duration and make multiple sequential API requests. Upon successful execution, the API
     * returns logs with the following information: * timestamp of the event * event ID * event type
     * * name and GUID of the user * IP address of ThoughtSpot instance For more information see
     * [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchLogsTest() throws ApiException {
        FetchLogsRequest fetchLogsRequest = null;
        List<LogResponse> response = api.fetchLogs(fetchLogsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches object permission details for a given principal object
     * such as a user and group. Requires view access to the metadata object. #### Usage guidelines
     * * To get a list of all metadata objects that a user or group can access, specify the
     * &#x60;type&#x60; and GUID or name of the principal. * To get permission details for a
     * specific object, add the &#x60;type&#x60; and GUID or name of the metadata object to your API
     * request. Upon successful execution, the API returns a list of metadata objects and permission
     * details for each object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchPermissionsOfPrincipalsTest() throws ApiException {
        FetchPermissionsOfPrincipalsRequest fetchPermissionsOfPrincipalsRequest = null;
        PermissionOfPrincipalsResponse response =
                api.fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Fetches permission details for a given metadata object. Requires
     * view access to the metadata object. #### Usage guidelines * To fetch a list of users and
     * groups for a metadata object, specify &#x60;type&#x60; and GUID or name of the metadata
     * object. * To get permission details for a specific user or group, add &#x60;type&#x60; and
     * GUID or name of the principal object to your API request. Upon successful execution, the API
     * returns permission details and principal information for the object specified in the API
     * request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchPermissionsOnMetadataTest() throws ApiException {
        FetchPermissionsOnMetadataRequest fetchPermissionsOnMetadataRequest = null;
        PermissionOfMetadataResponse response =
                api.fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Enforces logout on current user sessions. Use this API with
     * caution as it may invalidate active user sessions and force users to re-login. Make sure you
     * specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on
     * your cluster become invalid, and the users are forced to re-login. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void forceLogoutUsersTest() throws ApiException {
        ForceLogoutUsersRequest forceLogoutUsersRequest = null;
        api.forceLogoutUsers(forceLogoutUsersRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Exports a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal) in the CSV format.
     * Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60;
     * (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines Use this API to download a custom calendar in
     * the CSV file format. In your API request, specify the following parameters. * Start and end
     * date of the calendar. For \&quot;month offset\&quot; calendars, the start date must match the
     * month defined in the &#x60;month_offset&#x60; attribute. You can also specify optional
     * parameters such as the starting day of the week and prefixes for the quarter and year labels.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateCSVTest() throws ApiException {
        GenerateCSVRequest generateCSVRequest = null;
        Object response = api.generateCSV(generateCSVRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Retrieves details of the current user session for the token
     * provided in the request header. Any ThoughtSpot user can access this endpoint and send an API
     * request. The data returned in the API response varies according to user&#39;s privilege and
     * object access permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserInfoTest() throws ApiException {
        User response = api.getCurrentUserInfo();
        // TODO: test validations
    }

    /**
     * Version: 9.4.0.cl or later Retrieves details of the current session token for the bearer
     * token provided in the request header. This API endpoint does not create a new token. Instead,
     * it returns details about the token, including the token string, creation time, expiration
     * time, and the associated user. Use this endpoint to introspect your current session token,
     * debug authentication issues, or when a frontend application needs session token details. Any
     * ThoughtSpot user with a valid bearer token can access this endpoint and send an API request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserTokenTest() throws ApiException {
        GetTokenResponse response = api.getCurrentUserToken();
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Gets an authentication token with custom rules and security
     * attributes and creates a full session in ThoughtSpot for a given user. By default, the token
     * obtained from ThoughtSpot remains valid for 5 mins. To add a new user and assign privileges
     * during auto creation, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. To assign security attributes with filter
     * rules and Parameters to the JWT token, you&#39;ll need administrator privileges and edit
     * access to the data source (Worksheet or Model). If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * and edit access to the data source is required. #### Usage guidelines You can generate the
     * token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60;, or by using
     * the cluster’s &#x60;secret_key&#x60;. To generate a &#x60;secret_key&#x60; on your cluster,
     * the administrator must enable [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)
     * in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. **Note**: When
     * both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,
     * &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is enabled on
     * your instance, the API login request with basic authentication (&#x60;username&#x60; and
     * &#x60;password&#x60; ) returns an error. You can switch to token-based authentication with
     * &#x60;secret_key&#x60; or contact ThoughtSpot Support for assistance. ##### Attribute-Based
     * Access Control (ABAC) with tokens To implement Attribute-Based Access Control (ABAC) and
     * assign security entitlements to users during session creation, you can generate a token with
     * custom filtering rules and Parameters in the &#x60;filter_rules&#x60; and
     * &#x60;parameter_values&#x60; array respectively. These attributes can be configured to
     * persist on a specific set of objects for user sessions initiated using the token. Once
     * defined, the rules are added to the user&#39;s &#x60;access_control_properties&#x60; object,
     * after which all sessions will use the persisted values. Specify the object type as
     * &#x60;LOGICAL_TABLE&#x60;. For more information, see [ABAC via tokens
     * Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).
     * ##### Just-in-time provisioning For just-in-time user creation and provisioning, define the
     * following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;groups&#x60; Set &#x60;auto_create&#x60;
     * to &#x60;true&#x60; if the user is not available in ThoughtSpot. If the user already exists
     * in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to &#x60;true&#x60; in the
     * API request, the user properties such as the display name, email, Org and group assignment
     * will not be updated with new values. If &#x60;auto_create&#x60; is set to &#x60;true&#x60;,
     * it won&#39;t create formula variables and hence won&#39;t be applicable for
     * &#x60;variable_values&#x60;. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). #####
     * Important point to note All options in the token creation APIs that define access to the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created. Persist options such as &#x60;APPEND&#x60;,
     * &#x60;REPLACE&#x60;, &#x60;RESET&#x60; will persist security parameters on the user profile
     * when the token is created, while Persist option &#x60;NONE&#x60; will not persist anything
     * but will be honoured in the session. ##### Formula Variables Before using variables_values,
     * variables must be created using Create Variable API with type as Formula_Variable
     * (/api/rest/2.0/template/variables/create) The persist_option RESET and NONE cannot be used
     * when variable_values are provided in the request. If you are working with variable_values,
     * you must use other (APPEND, REPLACE) supported modes. If you want to use RESET or NONE, do
     * not pass any variable_values. In such cases, variable_values will remain unaffected. When
     * using object_id with variable_values, models are supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomAccessTokenTest() throws ApiException {
        GetCustomAccessTokenRequest getCustomAccessTokenRequest = null;
        AccessToken response = api.getCustomAccessToken(getCustomAccessTokenRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets an authentication token and creates a full session in
     * ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid
     * for 5 mins. You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret_key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * For more information, see [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullAccessTokenTest() throws ApiException {
        GetFullAccessTokenRequest getFullAccessTokenRequest = null;
        Token response = api.getFullAccessToken(getFullAccessTokenRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets an authentication token that provides access to a specific
     * metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.
     * You can generate the token for a user by providing a &#x60;username&#x60; and
     * &#x60;password&#x60;, or by using the cluster’s &#x60;secret key&#x60; (for [Trusted
     * authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).
     * To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted
     * authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.
     * **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API
     * request, &#x60;password&#x60; takes precedence. If Multi-Factor Authentication (MFA) is
     * enabled on your instance, the API login request with basic authentication
     * (&#x60;username&#x60; and &#x60;password&#x60; ) returns an error. You can switch to
     * token-based authentication with &#x60;secret_key&#x60; or contact ThoughtSpot Support for
     * assistance. #### Just-in-time provisioning For just-in-time user creation and provisioning,
     * define the following attributes: * &#x60;auto_create&#x60; * &#x60;username&#x60; *
     * &#x60;display_name&#x60; * &#x60;email&#x60; * &#x60;group_identifiers&#x60; Set
     * &#x60;auto_create&#x60; to &#x60;True&#x60; if the user is not available in ThoughtSpot. If
     * the user already exists in ThoughtSpot and the &#x60;auto_create&#x60; parameter is set to
     * &#x60;true&#x60;, the API call will update user properties like display name, email and group
     * assignment. For more information, see [Just-in-time
     * provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning). To add a
     * new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the
     * &#x60;CONTROL_TRUSTED_AUTH&#x60;(**Can Enable or Disable Trusted Authentication**) privilege
     * is required. #### Important point to note All options in the token creation APIs changing the
     * content in ThoughtSpot will do so during the token creation and not when the token is being
     * used for authentication. For example, &#x60;auto_create:true&#x60; will create the user when
     * the authentication token is created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getObjectAccessTokenTest() throws ApiException {
        GetObjectAccessTokenRequest getObjectAccessTokenRequest = null;
        Token response = api.getObjectAccessToken(getObjectAccessTokenRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.13.0.cl or later Breaks down a user-submitted query into a series of analytical
     * sub-questions using relevant contextual metadata. To use this API, the user must have at
     * least view-level access to the referenced metadata objects. #### Usage guidelines To
     * accurately generate relevant questions, the request must include at least one of the
     * following metadata identifiers within &#x60;metadata_context&#x60; :
     * &#x60;conversation_identifier&#x60;, &#x60;answer_identifiers&#x60;,
     * &#x60;liveboard_identifiers&#x60;, or &#x60;data_source_identifiers&#x60;. You can further
     * enhance the quality and precision of breakdown by providing additional &#x60;ai_context&#x60;
     * such as: - &#x60;content&#x60;: User provided content like text data, csv data as a string
     * message to provide context &amp; potentially improve the quality of the response. -
     * &#x60;instructions&#x60;: User specific text instructions sent to AI system for processing
     * the query. Additional optional parameters include: - &#x60;limit_relevant_questions&#x60;:
     * Controls the maximum number of relevant questions returned. Defaults to 5 if not specified. -
     * &#x60;bypass_cache&#x60;: If set to true, forces fresh computation instead of returning
     * cached results. If the API request is successful, ThoughtSpot returns a list of relevant
     * analytical queries, each aligned with the user&#39;s original question. Each returned
     * question includes the query string, along with the identifier and name of the corresponding
     * data source. &gt; ###### Note: &gt; * This endpoint is currently in Beta. Breaking changes
     * may be introduced before the endpoint is made Generally Available. &gt; * This endpoint
     * requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRelevantQuestionsTest() throws ApiException {
        GetRelevantQuestionsRequest getRelevantQuestionsRequest = null;
        EurekaGetRelevantQuestionsResponse response =
                api.getRelevantQuestions(getRelevantQuestionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Retrieves the current configuration details of the cluster. If the
     * request is successful, the API returns a list configuration settings applied on the cluster.
     * Requires &#x60;ADMINISTRATION&#x60;(**Can administer ThoughtSpot**) privilege to view these
     * complete configuration settings of the cluster. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is
     * required. This API does not require any parameters to be passed in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemConfigTest() throws ApiException {
        SystemConfig response = api.getSystemConfig();
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets system information such as the release version, locale, time
     * zone, deployment environment, date format, and date time format of the cluster. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;SYSTEM_INFO_ADMINISTRATION&#x60; (**Can view system activities**) privilege is
     * required. This API does not require any parameters to be passed in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemInformationTest() throws ApiException {
        SystemInfo response = api.getSystemInformation();
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets a list of configuration overrides applied on the cluster.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application
     * settings**) privilege is required. This API does not require any parameters to be passed in
     * the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemOverrideInfoTest() throws ApiException {
        SystemOverrideInfo response = api.getSystemOverrideInfo();
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files
     * into ThoughtSpot. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### Usage
     * guidelines * Import all related objects in a single TML Import API call. For example, Tables
     * that use the same Connection object and Worksheets connected to these Tables. * Include the
     * &#x60;fqn&#x60; property to distinguish objects that have the same name. For example, if you
     * have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection
     * or Worksheet referenced in your TML file does not have a unique name to distinguish, it may
     * result in invalid object references. Adding &#x60;fqn&#x60; helps ThoughtSpot differentiate a
     * Table from another with the same name. We recommend [exporting TML with
     * FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import
     * operation. * You can upload multiple TML files at a time. If you import a Worksheet along
     * with Liveboards, Answers, and other dependent objects in a single API call, the imported
     * objects will be immediately available for use. When you import only a Worksheet object, it
     * may take some time for the Worksheet to become available in the ThoughtSpot system. Please
     * wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly
     * imported Worksheet. For more information, see [TML
     * Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importMetadataTMLTest() throws ApiException {
        ImportMetadataTMLRequest importMetadataTMLRequest = null;
        List<Object> response = api.importMetadataTML(importMetadataTMLRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Schedules a task to import
     * [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this
     * API endpoint to process TML objects asynchronously when importing TMLs of large and complex
     * metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API
     * processes TML data in the background and returns a task ID, which can be used to check the
     * status of the import task via &#x60;/api/rest/2.0/metadata/tml/async/status&#x60; API
     * endpoint. Requires &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtsSpot**) privilege, and edit access to
     * the TML objects. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following Data control privileges may be required: -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### Usage
     * guidelines See [Async TML API
     * Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously)
     * for usage guidelines.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importMetadataTMLAsyncTest() throws ApiException {
        ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest = null;
        ImportEPackAsyncTaskStatus response =
                api.importMetadataTMLAsync(importMetadataTMLAsyncRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Imports group objects from external databases into ThoughtSpot.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is
     * required. During the import operation: * If the specified group is not available in
     * ThoughtSpot, it will be added to ThoughtSpot. * If &#x60;delete_unspecified_groups&#x60; is
     * set to &#x60;true&#x60;, the groups not specified in the API request, excluding administrator
     * and system user groups, are deleted. * If the specified groups are already available in
     * ThoughtSpot, the object properties of these groups are modified and synchronized as per the
     * input data in the API request. A successful API call returns the object that represents the
     * changes made in the ThoughtSpot system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importUserGroupsTest() throws ApiException {
        ImportUserGroupsRequest importUserGroupsRequest = null;
        ImportUserGroupsResponse response = api.importUserGroups(importUserGroupsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Imports user data from external databases into ThoughtSpot. During
     * the user import operation: * If the specified users are not available in ThoughtSpot, the
     * users are created and assigned a default password. Defining a &#x60;default_password&#x60; in
     * the API request is optional. * If &#x60;delete_unspecified_users&#x60; is set to
     * &#x60;true&#x60;, the users not specified in the API request, excluding the
     * &#x60;tsadmin&#x60;, &#x60;guest&#x60;, &#x60;system&#x60; and &#x60;su&#x60; users, are
     * deleted. * If the specified user objects are already available in ThoughtSpot, the object
     * properties are updated and synchronized as per the input data in the API request. A
     * successful API call returns the object that represents the changes made in the ThoughtSpot
     * system. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importUsersTest() throws ApiException {
        ImportUsersRequest importUsersRequest = null;
        ImportUsersResponse response = api.importUsers(importUsersRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Creates a login session for a ThoughtSpot user with Basic
     * authentication. In Basic authentication method, REST clients log in to ThoughtSpot using
     * &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with
     * Orgs, users can pass the ID of the Org in the API request to log in to a specific Org
     * context. **Note**: If Multi-Factor Authentication (MFA) is enabled on your instance, the API
     * login request with basic authentication (&#x60;username&#x60; and &#x60;password&#x60; )
     * returns an error. Contact ThoughtSpot Support for assistance. A successful login returns a
     * session cookie that can be used in your subsequent API requests.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginRequest loginRequest = null;
        api.login(loginRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Logs out a user from their current session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        api.logout();
        // TODO: test validations
    }

    /**
     * Parameterize fields in metadata objects. Version: 10.9.0.cl or later Allows parameterizing
     * fields in metadata objects in ThoughtSpot. Requires appropriate permissions to modify the
     * metadata object. The API endpoint allows parameterizing the following types of metadata
     * objects: * Logical Tables * Connections For a Logical Table the field type must be
     * &#x60;ATTRIBUTE&#x60; and field name can be one of: * databaseName * schemaName * tableName
     * For a Connection the field type is always &#x60;CONNECTION_PROPERTY&#x60;. We use the
     * field_name in this case to specify the exact property of a connection which needs to be
     * parameterized.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void parameterizeMetadataTest() throws ApiException {
        ParameterizeMetadataRequest parameterizeMetadataRequest = null;
        api.parameterizeMetadata(parameterizeMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.9.0.cl or later Allows publishing metadata objects across organizations in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint allows
     * publishing the following types of metadata objects: * Liveboards * Answers * Logical Tables
     * This API will essentially share the objects along with it&#39;s dependencies to the org
     * admins of the orgs to which it is being published.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publishMetadataTest() throws ApiException {
        PublishMetadataRequest publishMetadataRequest = null;
        api.publishMetadata(publishMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.7.0.cl or later
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryGetDecomposedQueryTest() throws ApiException {
        QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest = null;
        EurekaDecomposeQueryResponse response =
                api.queryGetDecomposedQuery(queryGetDecomposedQueryRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Resets the password of a user account. Administrators can reset
     * password on behalf of a user. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetUserPasswordTest() throws ApiException {
        ResetUserPasswordRequest resetUserPasswordRequest = null;
        api.resetUserPassword(resetUserPasswordRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Reverts TML objects to a previous commit specified in the API
     * request. Requires at least edit access to objects. In the API request, specify the
     * &#x60;commit_id&#x60;. If the branch name is not specified in the request, the API will
     * consider the default branch configured on your instance. By default, the API reverts all
     * objects. If the revert operation fails for one of the objects provided in the commit, the API
     * returns an error and does not revert any object. For more information, see [Git integration
     * documentation](https://developers.thoughtspot.com/docs/git-integration).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revertCommitTest() throws ApiException {
        String commitId = null;
        RevertCommitRequest revertCommitRequest = null;
        RevertResponse response = api.revertCommit(commitId, revertCommitRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Revokes the authentication token issued for current user session.
     * The token of your current session expires when you make a call to the
     * &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access
     * ThoughtSpot objects until a new token is obtained. To restart your session, request for a new
     * token from ThoughtSpot. See [Get Full Access
     * Token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeTokenTest() throws ApiException {
        RevokeTokenRequest revokeTokenRequest = null;
        api.revokeToken(revokeTokenRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Gets a list of [custom
     * calendars](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines By default, the API returns a list of custom
     * calendars for all connection objects. To retrieve custom calendar details for a particular
     * connection, specify the connection ID. You can also use other search parameters such as
     * &#x60;name_pattern&#x60; and &#x60;sort_options&#x60; as search filters. The
     * &#x60;name_pattern&#x60; parameter filters and returns only those objects that match the
     * specified pattern. Use &#x60;%&#x60; as a wildcard for pattern matching.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCalendarsTest() throws ApiException {
        SearchCalendarsRequest searchCalendarsRequest = null;
        List<CalendarResponse> response = api.searchCalendars(searchCalendarsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets a list of commits for a given metadata object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your
     * instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     * privilege and edit access to the metadata objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCommitsTest() throws ApiException {
        SearchCommitsRequest searchCommitsRequest = null;
        List<CommitHistoryResponse> response = api.searchCommits(searchCommitsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Fetch communication channel preferences. - Use
     * &#x60;cluster_preferences&#x60; to fetch the default preferences for your ThoughtSpot
     * application instance. - If your instance has
     * [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview), use
     * &#x60;org_preferences&#x60; to fetch any Org-specific preferences that override the defaults.
     * Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60;
     * (**Has developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege are
     * also authorized to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCommunicationChannelPreferencesTest() throws ApiException {
        SearchCommunicationChannelPreferencesRequest searchCommunicationChannelPreferencesRequest =
                null;
        CommunicationChannelPreferencesResponse response =
                api.searchCommunicationChannelPreferences(
                        searchCommunicationChannelPreferencesRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets Git repository connections configured on the ThoughtSpot
     * instance. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance on your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up
     * version control**) privilege.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchConfigTest() throws ApiException {
        SearchConfigRequest searchConfigRequest = null;
        List<RepoConfigObject> response = api.searchConfig(searchConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Gets connection objects. Requires &#x60;DATAMANAGEMENT&#x60;
     * (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. - To get a list of all connections available in the ThoughtSpot system, send the
     * API request without any attributes in the request body. - To get the connection objects for a
     * specific type of data warehouse, specify the type in &#x60;data_warehouse_types&#x60;. - To
     * fetch details of a connection object, specify the connection object GUID or name. The
     * &#x60;name_pattern&#x60; attribute allows passing partial text with &#x60;%&#x60; for a
     * wildcard match. - To get details of the database, schemas, tables, or columns from a data
     * connection object, specify &#x60;data_warehouse_object_type&#x60;. - To get a specific
     * database, schema, table, or column from a connection object, define the object type in
     * &#x60;data_warehouse_object_type&#x60; and object properties in the
     * &#x60;data_warehouse_objects&#x60; array. For example, to search for a column, you must pass
     * the database, schema, and table names in the API request. Note that in the following example,
     * object properties are set in a hierarchical order (&#x60;database&#x60; &gt;
     * &#x60;schema&#x60; &gt; &#x60;table&#x60; &gt; &#x60;column&#x60;). &#x60;&#x60;&#x60; {
     * \&quot;connections\&quot;: [ { \&quot;identifier\&quot;:
     * \&quot;b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\&quot;, \&quot;data_warehouse_objects\&quot;: [ {
     * \&quot;database\&quot;: \&quot;NEBULADEV\&quot;, \&quot;schema\&quot;:
     * \&quot;INFORMATION_SCHEMA\&quot;, \&quot;table\&quot;: \&quot;APPLICABLE_ROLES\&quot;,
     * \&quot;column\&quot;: \&quot;ROLE_NAME\&quot; } ] } ],
     * \&quot;data_warehouse_object_type\&quot;: \&quot;COLUMN\&quot; } &#x60;&#x60;&#x60; - To
     * fetch data by &#x60;configuration&#x60;, specify &#x60;data_warehouse_object_type&#x60;. For
     * example, to fetch columns from the &#x60;DEVELOPMENT&#x60; database, specify the
     * &#x60;data_warehouse_object_type&#x60; as &#x60;DATABASE&#x60; and define the
     * &#x60;configuration&#x60; string as
     * &#x60;{\&quot;database\&quot;:\&quot;DEVELOPMENT\&quot;}&#x60;. To get column data for a
     * specific table, specify the table, for
     * example,&#x60;{\&quot;database\&quot;:\&quot;RETAILAPPAREL\&quot;,\&quot;table\&quot;:\&quot;PIPES\&quot;}&#x60;.
     * - To query connections by &#x60;authentication_type&#x60;, specify
     * &#x60;data_warehouse_object_type&#x60;. Supported values for &#x60;authentication_type&#x60;
     * are: - &#x60;SERVICE_ACCOUNT&#x60;: For connections that require service account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. - &#x60;OAUTH&#x60;: For
     * connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth
     * authentication type. - &#x60;IAM&#x60;: For connections that have the IAM OAuth set up. This
     * authentication type is supported on Amazon Redshift connections only. - &#x60;EXTOAUTH&#x60;:
     * For connections that have External OAuth set up. ThoughtSpot supports external [OAuth with
     * Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/
     * connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data
     * connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). -
     * &#x60;KEY_PAIR&#x60;: For connections that require Key Pair account credentials to
     * authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - &#x60;OAUTH_WITH_PKCE&#x60;: For connections that
     * require OAuth with PKCE account credentials to authenticate to the Cloud Data Warehouse and
     * fetch data. This authentication type is supported on Snowflake, Starburst, Databricks, Denodo
     * connections only. - &#x60;EXTOAUTH_WITH_PKCE&#x60;: For connections that require External
     * OAuth With PKCE account credentials to authenticate to the Cloud Data Warehouse and fetch
     * data. This authentication type is supported on Snowflake connections only. -
     * &#x60;OAUTH_WITH_PEZ&#x60;: For connections that require OAuth With PEZ account credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Amazon Redshift connections only. - &#x60;OAUTH_WITH_SERVICE_PRINCIPAL&#x60;:
     * For connections that require OAuth With Service Principal account credentials to authenticate
     * to the Cloud Data Warehouse and fetch data. This authentication type is supported on
     * Databricks connections only. - &#x60;PERSONAL_ACCESS_TOKEN&#x60;: For connections that
     * require Personal Access Token account credentials to authenticate to the Cloud Data Warehouse
     * and fetch data. This authentication type is supported on Databricks connections only. -
     * &#x60;OAUTH_CLIENT_CREDENTIALS&#x60;: For connections that require OAuth Client Credentials
     * to authenticate to the Cloud Data Warehouse and fetch data. This authentication type is
     * supported on Snowflake connections only. - To include more details about connection objects
     * in the API response, set &#x60;include_details&#x60; to &#x60;true&#x60;. - You can also sort
     * the output by field names and filter connections by tags. **NOTE**: When filtering connection
     * records by parameters other than &#x60;data_warehouse_types&#x60; or
     * &#x60;tag_identifiers&#x60;, ensure that you set &#x60;record_size&#x60; to &#x60;-1&#x60;
     * and &#x60;record_offset&#x60; to &#x60;0&#x60; for precise results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchConnectionTest() throws ApiException {
        SearchConnectionRequest searchConnectionRequest = null;
        List<SearchConnectionResponse> response = api.searchConnection(searchConnectionRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.6.0.cl or later Gets custom actions configured on the cluster. Requires
     * &#x60;DEVELOPER&#x60; (**Has Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCustomActionsTest() throws ApiException {
        SearchCustomActionsRequest searchCustomActionsRequest = null;
        List<ResponseCustomAction> response = api.searchCustomActions(searchCustomActionsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Generates an Answer from a given data source. Requires at least
     * view access to the data source object (Worksheet or View). #### Usage guidelines To search
     * data, specify the data source GUID in &#x60;logical_table_identifier&#x60;. The data source
     * can be a Worksheet, View, Table, or SQL view. Pass search tokens in the
     * &#x60;query_string&#x60; attribute in the API request as shown in the following example:
     * &#x60;&#x60;&#x60; { \&quot;query_string\&quot;: \&quot;[sales] by [store]\&quot;,
     * \&quot;logical_table_identifier\&quot;: \&quot;cd252e5c-b552-49a8-821d-3eadaa049cca\&quot;, }
     * &#x60;&#x60;&#x60; For more information about the &#x60;query_string&#x60; format and data
     * source attribute, see [Search data
     * API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).
     * The &#x60;record_size&#x60; attribute determines the number of records to retrieve in an API
     * call. For more information about pagination, record size, and maximum row limit, see
     * [Pagination and record size
     * settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchDataTest() throws ApiException {
        SearchDataRequest searchDataRequest = null;
        SearchDataResponse response = api.searchData(searchDataRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Search the email customization configuration if any set for the
     * ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchEmailCustomizationTest() throws ApiException {
        SearchEmailCustomizationRequest searchEmailCustomizationRequest = null;
        List<CreateEmailCustomizationResponse> response =
                api.searchEmailCustomization(searchEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of metadata objects available on the ThoughtSpot
     * system. This API endpoint is available to all users who have view access to the object. Users
     * with &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view data for
     * all metadata objects, including users and groups. #### Usage guidelines - To get all metadata
     * objects, send the API request without any attributes. - To get metadata objects of a specific
     * type, set the &#x60;type&#x60; attribute. For example, to fetch a Worksheet, set the type as
     * &#x60;LOGICAL_TABLE&#x60;. - To filter metadata objects within type
     * &#x60;LOGICAL_TABLE&#x60;, set the &#x60;subtypes&#x60; attribute. For example, to fetch a
     * Worksheet, set the type as &#x60;LOGICAL_TABLE&#x60; &amp; subtypes as
     * &#x60;[WORKSHEET]&#x60;. - To get a specific metadata object, specify the GUID. - To
     * customize your search and filter the API response, you can use several parameters. You can
     * search for objects created or modified by specific users, by tags applied to the objects, or
     * by using the include parameters like &#x60;include_auto_created_objects&#x60;,
     * &#x60;include_dependent_objects&#x60;, &#x60;include_headers&#x60;,
     * &#x60;include_incomplete_objects&#x60;, and so on. You can also define sorting options to
     * sort the data retrieved in the API response. - To get discoverable objects when linientmodel
     * is enabled you can use &#x60;include_discoverable_objects&#x60; as true else false. Default
     * value is true. - For liveboard metadata type, to get the newer format, set the
     * &#x60;liveboard_response_format&#x60; as V2. Default value is V1. - To retrieve only objects
     * that are published, set the &#x60;include_only_published_objects&#x60; as true. Default value
     * is false. **NOTE**: The following parameters support pagination of metadata records: -
     * &#x60;tag_identifiers&#x60; - &#x60;type&#x60; - &#x60;subtypes&#x60; -
     * &#x60;created_by_user_identifiers&#x60; - &#x60;modified_by_user_identifiers&#x60; -
     * &#x60;owned_by_user_identifiers&#x60; - &#x60;exclude_objects&#x60; -
     * &#x60;include_auto_created_objects&#x60; - &#x60;favorite_object_options&#x60; -
     * &#x60;include_only_published_objects&#x60; If you are using other parameters to search
     * metadata, set &#x60;record_size&#x60; to &#x60;-1&#x60; and &#x60;record_offset&#x60; to
     * &#x60;0&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchMetadataTest() throws ApiException {
        SearchMetadataRequest searchMetadataRequest = null;
        List<MetadataSearchResponse> response = api.searchMetadata(searchMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of Orgs configured on the ThoughtSpot system. To get
     * details of a specific Org, specify the Org ID or name. You can also pass parameters such as
     * status, visibility, and user identifiers to get a specific list of Orgs. Requires cluster
     * administration (**Can administer Org**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchOrgsTest() throws ApiException {
        SearchOrgsRequest searchOrgsRequest = null;
        List<OrgResponse> response = api.searchOrgs(searchOrgsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Gets a list of Role objects from the ThoughtSpot system. Available
     * if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance. To search for Roles, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can
     * manage roles**) privilege is required. To get details of a specific Role object, specify the
     * GUID or name. You can also filter the API response based on user group and Org identifiers,
     * privileges assigned to the Role, and deprecation status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchRolesTest() throws ApiException {
        SearchRolesRequest searchRolesRequest = null;
        List<SearchRoleResponse> response = api.searchRoles(searchRolesRequest);
        // TODO: test validations
    }

    /**
     * Search Schedules Version: 9.4.0.cl or later Gets a list of scheduled jobs configured for a
     * Liveboard. To get details of a specific scheduled job, specify the name or GUID of the
     * scheduled job. Requires at least view access to Liveboards. **NOTE**: When filtering
     * schedules by parameters other than &#x60;metadata&#x60;, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60; and &#x60;record_offset&#x60; to &#x60;0&#x60; for accurate results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSchedulesTest() throws ApiException {
        SearchSchedulesRequest searchSchedulesRequest = null;
        List<ResponseSchedule> response = api.searchSchedules(searchSchedulesRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of tag objects available on the ThoughtSpot system. To
     * get details of a specific tag object, specify the GUID or name. Any authenticated user can
     * search for tag objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTagsTest() throws ApiException {
        SearchTagsRequest searchTagsRequest = null;
        List<Tag> response = api.searchTags(searchTagsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of user group objects from the ThoughtSpot system. To
     * get details of a specific user group, specify the user group GUID or name. You can also
     * filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility,
     * privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.
     * Available to all users. Users with &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. **NOTE**: If
     * you do not get precise results, try setting &#x60;record_size&#x60; to &#x60;-1&#x60; and
     * &#x60;record_offset&#x60; to &#x60;0&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUserGroupsTest() throws ApiException {
        SearchUserGroupsRequest searchUserGroupsRequest = null;
        List<UserGroupResponse> response = api.searchUserGroups(searchUserGroupsRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Gets a list of users available on the ThoughtSpot system. To get
     * details of a specific user, specify the user GUID or name. You can also filter the API
     * response based on groups, Org ID, user visibility, account status, user type, and user
     * preference settings and favorites. Available to all users. Users with
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privileges can view all users
     * properties. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**) privilege is required. **NOTE**: If
     * the API returns an empty list, consider increasing the value of the &#x60;record_size&#x60;
     * parameter. To search across all available users, set &#x60;record_size&#x60; to
     * &#x60;-1&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUsersTest() throws ApiException {
        SearchUsersRequest searchUsersRequest = null;
        List<User> response = api.searchUsers(searchUsersRequest);
        // TODO: test validations
    }

    /**
     * Search variables Version: 10.14.0.cl or later Allows searching for variables in ThoughtSpot.
     * Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES permission allows you to manage
     * Formula Variables in the current organization scope. The API endpoint supports searching
     * variables by: * Variable identifier (ID or name) * Variable type * Name pattern
     * (case-insensitive, supports % for wildcard) The search results can be formatted in three
     * ways: * METADATA - Returns only variable metadata (default) * METADATA_AND_VALUES - Returns
     * variable metadata and values The values can be filtered by scope: * org_identifier *
     * principal_identifier * model_identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchVariablesTest() throws ApiException {
        SearchVariablesRequest searchVariablesRequest = null;
        List<Variable> response = api.searchVariables(searchVariablesRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Searches for webhook configurations based on various criteria
     * such as Org, webhook identifier, event type, with support for pagination and sorting. Returns
     * matching webhook configurations with their complete details. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has
     * developer privilege**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, users with
     * &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage webhooks**) privilege are also authorized to
     * perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchWebhookConfigurationsTest() throws ApiException {
        SearchWebhookConfigurationsRequest searchWebhookConfigurationsRequest = null;
        WebhookSearchResponse response =
                api.searchWebhookConfigurations(searchWebhookConfigurationsRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.13.0.cl or later This API allows users to initiate or continue an agent (Spotter)
     * conversation by submitting one or more natural language messages. To use this API, the user
     * must have access to the relevant conversational session (via conversation_identifier) and
     * submit at least one message. #### Usage guidelines To initiate or continue a conversation,
     * the request must include: - &#x60;conversation_identifier&#x60;: a unique session ID for
     * continuity and message tracking - &#x60;messages&#x60;: an array of one or more text
     * messages, each with a value and type Additionally, user can specify what tool can be included
     * &#x60;conversation_settings&#x60; parameter, which supports: -
     * &#x60;enable_contextual_change_analysis&#x60; (default: false) -
     * &#x60;enable_natural_language_answer_generation&#x60; (default: true) -
     * &#x60;enable_reasoning&#x60; (default: false) If the request is valid, the API returns a
     * stream of messages in real time, including: - &#x60;ack&#x60;: confirms receipt of the
     * request - &#x60;text / text-chunk&#x60;: content chunks, optionally formatted (e.g.,
     * markdown) - &#x60;answer&#x60;: the final structured response with metadata and analytics -
     * &#x60;error&#x60;: if a failure occurs - &#x60;notification&#x60;: notification messages for
     * operation being performed &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster. &gt; * The streaming protocol uses Server-Sent Events (SSE)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendAgentMessageStreamingTest() throws ApiException {
        SendAgentMessageStreamingRequest sendAgentMessageStreamingRequest = null;
        SendAgentMessageResponse response =
                api.sendAgentMessageStreaming(sendAgentMessageStreamingRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Allows sending a follow-up message to an ongoing conversation
     * within the context of the metadata model. Requires at least view access to the metadata
     * object specified in the request. #### Usage guidelines The API requires you to specify the
     * &#x60;conversation_identifier&#x60; in the request path, and a
     * &#x60;metadata_identifier&#x60; and &#x60;message&#x60; string in the request body. If the
     * API request is successful, ThoughtSpot returns the session ID, tokens used in the
     * conversation, and visualization type. &gt; ###### Note: &gt; * This endpoint is currently in
     * Beta. Breaking changes may be introduced before the endpoint is made Generally Available.
     * &gt; * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter
     * on your cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String conversationIdentifier = null;
        SendMessageRequest sendMessageRequest = null;
        List<ResponseMessage> response =
                api.sendMessage(conversationIdentifier, sendMessageRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Allows sharing one or several metadata objects with users and
     * groups in ThoughtSpot. Requires edit access to the metadata object. The API endpoint allows
     * sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers
     * * Worksheets * Views * Connections You can provide &#x60;READ_ONLY&#x60; or
     * &#x60;MODIFY&#x60; access when sharing an object with another user or group. With
     * &#x60;READ_ONLY&#x60; access grants view access to the shared object, whereas
     * &#x60;MODIFY&#x60; provides edit access. To prevent a user or group from accessing the shared
     * object, specify the GUID or name of the principal and set &#x60;shareMode&#x60; to
     * &#x60;NO_ACCESS&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void shareMetadataTest() throws ApiException {
        ShareMetadataRequest shareMetadataRequest = null;
        api.shareMetadata(shareMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Processes a natural language query and returns an AI-generated
     * response based on a specified data model. Requires at least view access to the metadata
     * object specified in the request. &gt; ###### Note: &gt; * This endpoint is currently in Beta.
     * Breaking changes may be introduced before the endpoint is made Generally Available. &gt; *
     * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your
     * cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void singleAnswerTest() throws ApiException {
        SingleAnswerRequest singleAnswerRequest = null;
        ResponseMessage response = api.singleAnswer(singleAnswerRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Removes the tags applied to a Liveboard, Answer, Table, or
     * Worksheet. Requires edit access to the metadata object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignTagTest() throws ApiException {
        AssignTagRequest assignTagRequest = null;
        api.unassignTag(assignTagRequest);
        // TODO: test validations
    }

    /**
     * Remove parameterization from fields in metadata objects. Version: 10.9.0.cl or later Allows
     * removing parameterization from fields in metadata objects in ThoughtSpot. Requires
     * appropriate permissions to modify the metadata object. The API endpoint allows
     * unparameterizing the following types of metadata objects: * Logical Tables * Connections For
     * a Logical Table the field type must be &#x60;ATTRIBUTE&#x60; and field name can be one of: *
     * databaseName * schemaName * tableName For a Connection the field type is always
     * &#x60;CONNECTION_PROPERTY&#x60;. We use the field_name in this case to specify the exact
     * property of a connection which needs to be unparameterized.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unparameterizeMetadataTest() throws ApiException {
        UnparameterizeMetadataRequest unparameterizeMetadataRequest = null;
        api.unparameterizeMetadata(unparameterizeMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.9.0.cl or later Allows unpublishing metadata objects from organizations in
     * ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The API endpoint allows
     * unpublishing the following types of metadata objects: * Liveboards * Answers * Logical Tables
     * When unpublishing objects, you can: * Include dependencies by setting
     * &#x60;include_dependencies&#x60; to true - this will unpublish all dependent objects if no
     * other published object is using them * Force unpublish by setting &#x60;force&#x60; to true -
     * this will break all dependent objects in the unpublished organizations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unpublishMetadataTest() throws ApiException {
        UnpublishMetadataRequest unpublishMetadataRequest = null;
        api.unpublishMetadata(unpublishMetadataRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Updates the properties of a [custom
     * calendar](https://docs.thoughtspot.com/cloud/latest/connections-cust-cal). Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) or &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your ThoughtSpot
     * instance, the &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60; (**Can manage custom calendars**)
     * privilege is required. #### Usage guidelines You can update the properties of a calendar
     * using one of the following methods: * &#x60;FROM_INPUT_PARAMS&#x60; to update the calendar
     * properties with the values defined in the API request. * &#x60;FROM_EXISTING_TABLE&#x60;
     * Creates a calendar from the parameters defined in the API request. To update a custom
     * calendar, specify the calendar ID as a path parameter in the request URL and the following
     * parameters in the request body: * Connection ID and Table name * Database and schema name
     * attributes: For most Cloud Data Warehouse (CDW) connectors, both &#x60;database_name&#x60;
     * and &#x60;schema_name&#x60; attributes are required. However, the attribute requirements are
     * conditional and vary based on the connector type and its metadata structure. For example, for
     * connectors such as Teradata, MySQL, SingleSore, Amazon Aurora MySQL, Amazon RDS MySQL,
     * Oracle, and GCP_MYSQL, the &#x60;schema_name&#x60; is required, whereas the
     * &#x60;database_name&#x60; attribute is not. Similarly, connectors such as ClickHouse require
     * you to specify the &#x60;database_name&#x60; and the schema specification in such cases is
     * optional. The API allows you to modify the calendar type, month offset value, start and end
     * date, starting day of the week, and prefixes assigned to the year and quarter labels. ####
     * Examples Update a custom calendar using an existing Table in ThoughtSpot: &#x60;&#x60;&#x60;
     * { \&quot;update_method\&quot;: \&quot;FROM_EXISTING_TABLE\&quot;,
     * \&quot;table_reference\&quot;: { \&quot;connection_identifier\&quot;:
     * \&quot;Connection1\&quot;, \&quot;database_name\&quot;: \&quot;db1\&quot;,
     * \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;, \&quot;schame_name\&quot;:
     * \&quot;schemaVar\&quot; } } &#x60;&#x60;&#x60; Update a custom calendar with the attributes
     * defined in the API request: &#x60;&#x60;&#x60; { \&quot;update_method\&quot;:
     * \&quot;FROM_INPUT_PARAMS\&quot;, \&quot;table_reference\&quot;: {
     * \&quot;connection_identifier\&quot;: \&quot;Connection1\&quot;, \&quot;database_name\&quot;:
     * \&quot;db1\&quot;, \&quot;table_name\&quot;: \&quot;custom_calendar_2025\&quot;,
     * \&quot;schame_name\&quot;: \&quot;schemaVar\&quot; }, \&quot;month_offset\&quot;:
     * \&quot;August\&quot;, \&quot;start_day_of_week\&quot;: \&quot;Monday\&quot;,
     * \&quot;start_date\&quot;: \&quot;08/01/2025\&quot;, \&quot;end_date\&quot;:
     * \&quot;07/31/2026\&quot; } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCalendarTest() throws ApiException {
        String calendarIdentifier = null;
        UpdateCalendarRequest updateCalendarRequest = null;
        api.updateCalendar(calendarIdentifier, updateCalendarRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Creates, updates, or deletes column security rules for specified
     * tables. This API endpoint allows you to create, update, or delete column-level security rules
     * on columns of a table. The operation follows an \&quot;all or none\&quot; policy: if defining
     * security rules for any of the provided columns fails, the entire operation will be rolled
     * back, and no rules will be created. #### Usage guidelines - Provide table identifier using
     * either &#x60;identifier&#x60; (GUID or name) or &#x60;obj_identifier&#x60; (object ID) - Use
     * &#x60;clear_csr: true&#x60; to remove all column security rules from the table - For each
     * column, specify the security rule using &#x60;column_security_rules&#x60; array - Use
     * &#x60;is_unsecured: true&#x60; to mark a specific column as unprotected - Use
     * &#x60;group_access&#x60; operations to manage group associations: - &#x60;ADD&#x60;: Add
     * groups to the column&#39;s access list - &#x60;REMOVE&#x60;: Remove groups from the
     * column&#39;s access list - &#x60;REPLACE&#x60;: Replace all existing groups with the
     * specified groups #### Required permissions - &#x60;ADMINISTRATION&#x60; - Can administer
     * ThoughtSpot - &#x60;DATAMANAGEMENT&#x60; - Can manage data (if RBAC is disabled) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; - Can manage worksheet views and tables (if
     * RBAC is enabled) #### Example request &#x60;&#x60;&#x60;json { \&quot;identifier\&quot;:
     * \&quot;table-guid\&quot;, \&quot;obj_identifier\&quot;: \&quot;table-object-id\&quot;,
     * \&quot;clear_csr\&quot;: false, \&quot;column_security_rules\&quot;: [ {
     * \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ { \&quot;operation\&quot;:
     * \&quot;ADD\&quot;, \&quot;group_identifiers\&quot;: [\&quot;hr_group_id\&quot;,
     * \&quot;hr_group_name\&quot;, \&quot;finance_group_id\&quot;] } ] }, {
     * \&quot;column_identifier\&quot;: \&quot;col id or col name\&quot;,
     * \&quot;is_unsecured\&quot;: true }, { \&quot;column_identifier\&quot;: \&quot;col id or col
     * name\&quot;, \&quot;is_unsecured\&quot;: false, \&quot;group_access\&quot;: [ {
     * \&quot;operation\&quot;: \&quot;REPLACE\&quot;, \&quot;group_identifiers\&quot;:
     * [\&quot;management_group_id\&quot;, \&quot;management_group_name\&quot;] } ] } ] }
     * &#x60;&#x60;&#x60; #### Request Body Schema - &#x60;identifier&#x60; (string, optional): GUID
     * or name of the table for which we want to create column security rules -
     * &#x60;obj_identifier&#x60; (string, optional): The object ID of the table -
     * &#x60;clear_csr&#x60; (boolean, optional): If true, then all the secured columns will be
     * marked as unprotected, and all the group associations will be removed -
     * &#x60;column_security_rules&#x60; (array of objects, required): An array where each object
     * defines the security rule for a specific column Each column security rule object contains: -
     * &#x60;column_identifier&#x60; (string, required): Column identifier (col_id or name) -
     * &#x60;is_unsecured&#x60; (boolean, optional): If true, the column will be marked as
     * unprotected and all groups associated with it will be removed - &#x60;group_access&#x60;
     * (array of objects, optional): Array of group operation objects Each group operation object
     * contains: - &#x60;operation&#x60; (string, required): Operation type - ADD, REMOVE, or
     * REPLACE - &#x60;group_identifiers&#x60; (array of strings, required): Array of group
     * identifiers (name or GUID) on which the operation will be performed #### Response This API
     * does not return any response body. A successful operation returns HTTP 200 status code. ####
     * Operation Types - **ADD**: Adds the specified groups to the column&#39;s access list -
     * **REMOVE**: Removes the specified groups from the column&#39;s access list - **REPLACE**:
     * Replaces all existing groups with the specified groups
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateColumnSecurityRulesTest() throws ApiException {
        UpdateColumnSecurityRulesRequest updateColumnSecurityRulesRequest = null;
        api.updateColumnSecurityRules(updateColumnSecurityRulesRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Updates Git repository configuration settings. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on
     * your instance, the &#x60;CAN_SETUP_VERSION_CONTROL&#x60; (**Can set up version control**)
     * privilege.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigTest() throws ApiException {
        UpdateConfigRequest updateConfigRequest = null;
        RepoConfigObject response = api.updateConfig(updateConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later **Important**: This endpoint is deprecated and will be removed
     * from ThoughtSpot in September 2025. ThoughtSpot strongly recommends using the [Update
     * connection V2](#/http/api-endpoints/connections/update-connection-v2) endpoint to update your
     * connection objects. #### Usage guidelines Updates a connection object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. To update a connection object, pass these parameters in
     * your API request: 1. GUID of the connection object. 2. If you are updating tables or database
     * schema of a connection object: a. Add the updated JSON map of metadata with database, schema,
     * and tables in &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to
     * &#x60;true&#x60;. 3. If you are updating a configuration attribute, connection name, or
     * description, you can set &#x60;validate&#x60; to &#x60;false&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectionTest() throws ApiException {
        UpdateConnectionRequest updateConnectionRequest = null;
        api.updateConnection(updateConnectionRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Updates a connection configuration object. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) and edit permissions to the connection
     * object, or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit
     * Connections**) privilege is required. #### Supported operations This API endpoint lets you
     * perform the following operations in a single API request: * Edit the name or description of
     * the configuration * Edit the configuration properties * Edit the &#x60;policy_type&#x60; *
     * Edit the type of authentication * Enable or disable a configuration **NOTE**: When updating a
     * configuration where &#x60;disabled&#x60; is &#x60;true&#x60;, you must reset
     * &#x60;disabled&#x60; to &#x60;true&#x60; in your update request payload. If not explicitly
     * set again, the API will default &#x60;disabled&#x60; to &#x60;false&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectionConfigurationTest() throws ApiException {
        String configurationIdentifier = null;
        UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest = null;
        api.updateConnectionConfiguration(
                configurationIdentifier, updateConnectionConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.4.0.cl or later Updates a connection object. Requires &#x60;DATAMANAGEMENT&#x60;
     * (**Can manage data**) and edit permissions to the connection object, or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) privilege is
     * required. To update a connection object, pass these parameters in your API request: 1. GUID
     * of the connection object. 2. If you are updating tables or database schema of a connection
     * object: a. Add the updated JSON map of metadata with database, schema, and tables in
     * &#x60;data_warehouse_config&#x60;. b. Set &#x60;validate&#x60; to &#x60;true&#x60;. **NOTE:**
     * If the &#x60;authentication_type&#x60; is anything other than SERVICE_ACCOUNT, you must
     * explicitly provide the authenticationType property in the payload. If you do not specify
     * authenticationType, the API will default to SERVICE_ACCOUNT as the authentication type. * A
     * JSON map of configuration attributes, database details, and table properties in
     * &#x60;data_warehouse_config&#x60; as shown in the following example: * This is an example of
     * updating a single table in a empty connection: &#x60;&#x60;&#x60; {
     * \&quot;authenticationType\&quot;: \&quot;SERVICE_ACCOUNT\&quot;,
     * \&quot;externalDatabases\&quot;: [ { \&quot;name\&quot;: \&quot;DEVELOPMENT\&quot;,
     * \&quot;isAutoCreated\&quot;: false, \&quot;schemas\&quot;: [ { \&quot;name\&quot;:
     * \&quot;TS_dataset\&quot;, \&quot;tables\&quot;: [ { \&quot;name\&quot;:
     * \&quot;DEMORENAME\&quot;, \&quot;type\&quot;: \&quot;TABLE\&quot;, \&quot;description\&quot;:
     * \&quot;\&quot;, \&quot;selected\&quot;: true, \&quot;linked\&quot;: true, \&quot;gid\&quot;:
     * 0, \&quot;datasetId\&quot;: \&quot;-1\&quot;, \&quot;subType\&quot;: \&quot;\&quot;,
     * \&quot;reportId\&quot;: \&quot;\&quot;, \&quot;viewId\&quot;: \&quot;\&quot;,
     * \&quot;columns\&quot;: [ { \&quot;name\&quot;: \&quot;Col1\&quot;, \&quot;type\&quot;:
     * \&quot;VARCHAR\&quot;, \&quot;canImport\&quot;: true, \&quot;selected\&quot;: true,
     * \&quot;description\&quot;: \&quot;\&quot;, \&quot;isLinkedActive\&quot;: true,
     * \&quot;isAggregate\&quot;: false }, { \&quot;name\&quot;: \&quot;Col2\&quot;,
     * \&quot;type\&quot;: \&quot;VARCHAR\&quot;, \&quot;canImport\&quot;: true,
     * \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false }, { \&quot;name\&quot;:
     * \&quot;Col3\&quot;, \&quot;type\&quot;: \&quot;VARCHAR\&quot;, \&quot;canImport\&quot;: true,
     * \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false }, { \&quot;name\&quot;:
     * \&quot;Col312\&quot;, \&quot;type\&quot;: \&quot;VARCHAR\&quot;, \&quot;canImport\&quot;:
     * true, \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false }, { \&quot;name\&quot;:
     * \&quot;Col4\&quot;, \&quot;type\&quot;: \&quot;VARCHAR\&quot;, \&quot;canImport\&quot;: true,
     * \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false } ],
     * \&quot;relationships\&quot;: [] } ] } ] } ], \&quot;configuration\&quot;: {
     * \&quot;password\&quot;: \&quot;\&quot;, \&quot;database\&quot;: \&quot;DEVELOPMENT\&quot;,
     * \&quot;role\&quot;: \&quot;DEV\&quot;, \&quot;accountName\&quot;:
     * \&quot;thoughtspot_partner\&quot;, \&quot;warehouse\&quot;: \&quot;DEMO_WH\&quot;,
     * \&quot;user\&quot;: \&quot;DEV_USER\&quot; } } &#x60;&#x60;&#x60; * This is an example of
     * updating a single table in an existing connection with tables: &#x60;&#x60;&#x60; {
     * \&quot;authenticationType\&quot;: \&quot;SERVICE_ACCOUNT\&quot;,
     * \&quot;externalDatabases\&quot;: [ { \&quot;name\&quot;: \&quot;DEVELOPMENT\&quot;,
     * \&quot;isAutoCreated\&quot;: false, \&quot;schemas\&quot;: [ { \&quot;name\&quot;:
     * \&quot;TS_dataset\&quot;, \&quot;tables\&quot;: [ { \&quot;name\&quot;:
     * \&quot;CUSTOMER\&quot;, \&quot;type\&quot;: \&quot;TABLE\&quot;, \&quot;description\&quot;:
     * \&quot;\&quot;, \&quot;selected\&quot;: true, \&quot;linked\&quot;: true, \&quot;gid\&quot;:
     * 0, \&quot;datasetId\&quot;: \&quot;-1\&quot;, \&quot;subType\&quot;: \&quot;\&quot;,
     * \&quot;reportId\&quot;: \&quot;\&quot;, \&quot;viewId\&quot;: \&quot;\&quot;,
     * \&quot;columns\&quot;: [], \&quot;relationships\&quot;: [] }, { \&quot;name\&quot;:
     * \&quot;tpch5k_falcon_default_schema_users\&quot;, \&quot;type\&quot;: \&quot;TABLE\&quot;,
     * \&quot;description\&quot;: \&quot;\&quot;, \&quot;selected\&quot;: true,
     * \&quot;linked\&quot;: true, \&quot;gid\&quot;: 0, \&quot;datasetId\&quot;: \&quot;-1\&quot;,
     * \&quot;subType\&quot;: \&quot;\&quot;, \&quot;reportId\&quot;: \&quot;\&quot;,
     * \&quot;viewId\&quot;: \&quot;\&quot;, \&quot;columns\&quot;: [ { \&quot;name\&quot;:
     * \&quot;user_id\&quot;, \&quot;type\&quot;: \&quot;INT64\&quot;, \&quot;canImport\&quot;:
     * true, \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false }, { \&quot;name\&quot;:
     * \&quot;product_id\&quot;, \&quot;type\&quot;: \&quot;INT64\&quot;, \&quot;canImport\&quot;:
     * true, \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false }, { \&quot;name\&quot;:
     * \&quot;user_cost\&quot;, \&quot;type\&quot;: \&quot;INT64\&quot;, \&quot;canImport\&quot;:
     * true, \&quot;selected\&quot;: true, \&quot;description\&quot;: \&quot;\&quot;,
     * \&quot;isLinkedActive\&quot;: true, \&quot;isAggregate\&quot;: false } ],
     * \&quot;relationships\&quot;: [] } ] } ] } ], \&quot;configuration\&quot;: {
     * \&quot;password\&quot;: \&quot;\&quot;, \&quot;database\&quot;: \&quot;DEVELOPMENT\&quot;,
     * \&quot;role\&quot;: \&quot;DEV\&quot;, \&quot;accountName\&quot;:
     * \&quot;thoughtspot_partner\&quot;, \&quot;warehouse\&quot;: \&quot;DEMO_WH\&quot;,
     * \&quot;user\&quot;: \&quot;DEV_USER\&quot; } } &#x60;&#x60;&#x60; 3. If you are updating a
     * configuration attribute, connection name, or description, you can set &#x60;validate&#x60; to
     * &#x60;false&#x60;. **NOTE:** If the &#x60;authentication_type&#x60; is anything other than
     * SERVICE_ACCOUNT, you must explicitly provide the authenticationType property in the payload.
     * If you do not specify authenticationType, the API will default to SERVICE_ACCOUNT as the
     * authentication type. * A JSON map of configuration attributes in
     * &#x60;data_warehouse_config&#x60;. The following example shows the configuration attributes
     * for a Snowflake connection: &#x60;&#x60;&#x60; { \&quot;configuration\&quot;:{
     * \&quot;accountName\&quot;:\&quot;thoughtspot_partner\&quot;,
     * \&quot;user\&quot;:\&quot;tsadmin\&quot;, \&quot;password\&quot;:\&quot;TestConn123\&quot;,
     * \&quot;role\&quot;:\&quot;sysadmin\&quot;, \&quot;warehouse\&quot;:\&quot;MEDIUM_WH\&quot; },
     * \&quot;externalDatabases\&quot;:[ ] } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectionV2Test() throws ApiException {
        String connectionIdentifier = null;
        UpdateConnectionV2Request updateConnectionV2Request = null;
        api.updateConnectionV2(connectionIdentifier, updateConnectionV2Request);
        // TODO: test validations
    }

    /**
     * Version: 9.6.0.cl or later Updates a custom action. Requires &#x60;DEVELOPER&#x60; (**Has
     * Developer privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**)
     * privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. #### Usage
     * Guidelines The API allows you to modify the following properties: * Name of the custom action
     * * Action availability to groups * Association to metadata objects * Authentication settings
     * for a URL-based action For more information, see [Custom
     * actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomActionTest() throws ApiException {
        String customActionIdentifier = null;
        UpdateCustomActionRequest updateCustomActionRequest = null;
        api.updateCustomAction(customActionIdentifier, updateCustomActionRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.9.0.cl or later Updates a DBT connection object. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege or
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data ThoughtSpot**) privilege, along with an
     * existing DBT connection. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * following data control privileges may be required: -
     * &#x60;CAN_MANAGE_CUSTOM_CALENDAR&#x60;(**Can manage custom calendars**) -
     * &#x60;CAN_CREATE_OR_EDIT_CONNECTIONS&#x60; (**Can create/edit Connections**) -
     * &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**) #### About update
     * DBT connection You can modify DBT connection object properties such as embrace connection
     * name, embrace database name, import type, account identifier, access token, project
     * identifier and environment (or) embrace connection, embrace database name, import type,
     * file_content settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDbtConnectionTest() throws ApiException {
        String dbtConnectionIdentifier = null;
        String connectionName = null;
        String databaseName = null;
        String importType = null;
        String accessToken = null;
        String dbtUrl = null;
        String accountId = null;
        String projectId = null;
        String dbtEnvId = null;
        String projectName = null;
        File fileContent = null;
        Object response =
                api.updateDbtConnection(
                        dbtConnectionIdentifier,
                        connectionName,
                        databaseName,
                        importType,
                        accessToken,
                        dbtUrl,
                        accountId,
                        projectId,
                        dbtEnvId,
                        projectName,
                        fileContent);
        // TODO: test validations
    }

    /**
     * Version: 10.12.0.cl or later Updates a customization configuration for the notification
     * email. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer privilege**) or
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is required. **NOTE**:This
     * endpoint in currently in beta. Contact ThoughtSpot support to enable this on your instance.
     * #### Usage guidelines To update a custom configuration pass these parameters in your API
     * request: - A JSON map of configuration attributes &#x60;template_properties&#x60;. The
     * following example shows a sample set of customization configuration: &#x60;&#x60;&#x60; { {
     * \&quot;cta_button_bg_color\&quot;: \&quot;#444DEA\&quot;, \&quot;cta_text_font_color\&quot;:
     * \&quot;#FFFFFF\&quot;, \&quot;primary_bg_color\&quot;: \&quot;#D3DEF0\&quot;,
     * \&quot;logo_url\&quot;:
     * \&quot;https://storage.pardot.com/710713/1642089901EbkRibJq/TS_fullworkmark_darkmode.png\&quot;,
     * \&quot;font_family\&quot;: \&quot;\&quot;, \&quot;product_name\&quot;:
     * \&quot;ThoughtSpot\&quot;, \&quot;footer_address\&quot;: \&quot;444 Castro St, Suite 1000
     * Mountain View, CA 94041\&quot;, \&quot;footer_phone\&quot;: \&quot;(800) 508-7008\&quot;,
     * \&quot;replacement_value_for_liveboard\&quot;: \&quot;Dashboard\&quot;,
     * \&quot;replacement_value_for_answer\&quot;: \&quot;Chart\&quot;,
     * \&quot;replacement_value_for_spot_iq\&quot;: \&quot;AI Insights\&quot;,
     * \&quot;hide_footer_phone\&quot;: false, \&quot;hide_footer_address\&quot;: false,
     * \&quot;hide_product_name\&quot;: false, \&quot;hide_manage_notification\&quot;: false,
     * \&quot;hide_mobile_app_nudge\&quot;: false, \&quot;hide_privacy_policy\&quot;: false,
     * \&quot;hide_ts_vocabulary_definitions\&quot;: false, \&quot;hide_error_message\&quot;: false,
     * \&quot;hide_unsubscribe_link\&quot;: false, \&quot;hide_notification_status\&quot;: false,
     * \&quot;hide_modify_alert\&quot;: false, \&quot;company_website_url\&quot;:
     * \&quot;https://your-website.com/\&quot;, \&quot;company_privacy_policy_url\&quot; :
     * \&quot;https://link-to-privacy-policy.com/\&quot;, \&quot;contact_support_url\&quot;:
     * \&quot;https://link-to-contact-support.com/\&quot;, \&quot;hide_contact_support_url\&quot;:
     * false } } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmailCustomizationTest() throws ApiException {
        UpdateEmailCustomizationRequest updateEmailCustomizationRequest = null;
        api.updateEmailCustomization(updateEmailCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Update header attributes for a given list of header objects. Version: 10.6.0.cl or later ##
     * Prerequisites - **Privileges Required:** - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or
     * &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC
     * is enabled):** - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs). --- ## Usage Guidelines
     * ### Parameters 1. **headers_update** - **Description:** List of header objects with their
     * attributes to be updated. Each object contains a list of attributes to be updated in the
     * header. - **Usage:** - You must provide either &#x60;identifier&#x60; or
     * &#x60;obj_identifier&#x60;, but not both. Both fields cannot be empty. - When
     * &#x60;org_identifier&#x60; is set to &#x60;-1&#x60;, only the &#x60;identifier&#x60; value is
     * accepted; &#x60;obj_identifier&#x60; is not allowed. 2. **org_identifier** - **Description:**
     * GUID (Globally Unique Identifier) or name of the organization. - **Usage:** - Leaving this
     * field empty assumes that the changes should be applied to the current organization - Provide
     * &#x60;org_guid&#x60; or &#x60;org_name&#x60; to uniquely identify the organization where
     * changes need to be applied. . - Provide &#x60;-1&#x60; if changes have to be applied across
     * all the org. --- ## Note Currently, this API is enabled only for updating the
     * &#x60;obj_identifier&#x60; attribute. Only &#x60;text&#x60; will be allowed in
     * attribute&#39;s value. ## Best Practices 1. **Backup Before Conversion:** Always export
     * metadata as a backup before initiating the update process --- ## Examples ### Only
     * &#x60;identifier&#x60; is given &#x60;&#x60;&#x60;json { \&quot;headers_update\&quot;: [ {
     * \&quot;identifier\&quot;: \&quot;guid_1\&quot;, \&quot;obj_identifier\&quot;: \&quot;\&quot;,
     * \&quot;type\&quot;: \&quot;LOGICAL_COLUMN\&quot;, \&quot;attributes\&quot;: [ {
     * \&quot;name\&quot;: \&quot;obj_id\&quot;, \&quot;value\&quot;: \&quot;custom_object_id\&quot;
     * } ] } ], \&quot;org_identifier\&quot;: \&quot;orgGuid\&quot; } &#x60;&#x60;&#x60; ### Only
     * &#x60;obj_identifier&#x60; is given &#x60;&#x60;&#x60;json { \&quot;headers_update\&quot;: [
     * { \&quot;obj_identifier\&quot;: \&quot;custom_object_id\&quot;, \&quot;type\&quot;:
     * \&quot;ANSWER\&quot;, \&quot;attributes\&quot;: [ { \&quot;name\&quot;: \&quot;obj_id\&quot;,
     * \&quot;value\&quot;: \&quot;custom_object_id\&quot; } ] } ], \&quot;org_identifier\&quot;:
     * \&quot;orgName\&quot; } &#x60;&#x60;&#x60; ### Executing update for all org &#x60;-1&#x60;
     * &#x60;&#x60;&#x60;json { \&quot;headers_update\&quot;: [ { \&quot;identifier\&quot;:
     * \&quot;guid_1\&quot;, \&quot;type\&quot;: \&quot;ANSWER\&quot;, \&quot;attributes\&quot;: [ {
     * \&quot;name\&quot;: \&quot;obj_id\&quot;, \&quot;value\&quot;: \&quot;custom_object_id\&quot;
     * } ] } ], \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60; ### Optional &#x60;type&#x60;
     * is not provided &#x60;&#x60;&#x60;json { \&quot;headers_update\&quot;: [ {
     * \&quot;identifier\&quot;: \&quot;guid_1\&quot;, \&quot;attributes\&quot;: [ {
     * \&quot;name\&quot;: \&quot;obj_id\&quot;, \&quot;value\&quot;: \&quot;custom_object_id\&quot;
     * } ] } ], \&quot;org_identifier\&quot;: -1 } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMetadataHeaderTest() throws ApiException {
        UpdateMetadataHeaderRequest updateMetadataHeaderRequest = null;
        api.updateMetadataHeader(updateMetadataHeaderRequest);
        // TODO: test validations
    }

    /**
     * Update object IDs for given metadata objects. Version: 10.8.0.cl or later ## Prerequisites -
     * **Privileges Required:** - &#x60;DATAMANAGEMENT&#x60; (Can manage data) or
     * &#x60;ADMINISTRATION&#x60; (Can administer ThoughtSpot). - **Additional Privileges (if RBAC
     * is enabled):** - &#x60;ORG_ADMINISTRATION&#x60; (Can manage orgs). --- ## Usage Guidelines
     * ### Parameters 1. **metadata** - **Description:** List of metadata objects to update their
     * object IDs. - **Usage:** - Use either &#x60;current_obj_id&#x60; alone OR use
     * &#x60;metadata_identifier&#x60; with &#x60;type&#x60; (when needed). - When using
     * &#x60;metadata_identifier&#x60;, the &#x60;type&#x60; field is required if using a name
     * instead of a GUID. - The &#x60;new_obj_id&#x60; field is always required. --- ## Note This
     * API is specifically designed for updating object IDs of metadata objects. It internally uses
     * the header update mechanism to perform the changes. ## Best Practices 1. **Backup Before
     * Update:** Always export metadata as a backup before initiating the update process. 2.
     * **Validation:** - When using &#x60;current_obj_id&#x60;, ensure it matches the existing
     * object ID exactly. - When using &#x60;metadata_identifier&#x60; with a name, ensure the
     * &#x60;type&#x60; is specified correctly. - Verify that the &#x60;new_obj_id&#x60; follows
     * your naming conventions and is unique within your system. --- ## Examples ### Using
     * current_obj_id &#x60;&#x60;&#x60;json { \&quot;metadata\&quot;: [ {
     * \&quot;current_obj_id\&quot;: \&quot;existing_object_id\&quot;, \&quot;new_obj_id\&quot;:
     * \&quot;new_object_id\&quot; } ] } &#x60;&#x60;&#x60; ### Using metadata_identifier with GUID
     * &#x60;&#x60;&#x60;json { \&quot;metadata\&quot;: [ { \&quot;metadata_identifier\&quot;:
     * \&quot;01234567-89ab-cdef-0123-456789abcdef\&quot;, \&quot;new_obj_id\&quot;:
     * \&quot;new_object_id\&quot; } ] } &#x60;&#x60;&#x60; ### Using metadata_identifier with name
     * and type &#x60;&#x60;&#x60;json { \&quot;metadata\&quot;: [ {
     * \&quot;metadata_identifier\&quot;: \&quot;My Answer\&quot;, \&quot;type\&quot;:
     * \&quot;ANSWER\&quot;, \&quot;new_obj_id\&quot;: \&quot;new_object_id\&quot; } ] }
     * &#x60;&#x60;&#x60; ### Multiple objects update &#x60;&#x60;&#x60;json {
     * \&quot;metadata\&quot;: [ { \&quot;current_obj_id\&quot;: \&quot;existing_object_id_1\&quot;,
     * \&quot;new_obj_id\&quot;: \&quot;new_object_id_1\&quot; }, {
     * \&quot;metadata_identifier\&quot;: \&quot;My Worksheet\&quot;, \&quot;type\&quot;:
     * \&quot;LOGICAL_TABLE\&quot;, \&quot;new_obj_id\&quot;: \&quot;new_object_id_2\&quot; } ] }
     * &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMetadataObjIdTest() throws ApiException {
        UpdateMetadataObjIdRequest updateMetadataObjIdRequest = null;
        api.updateMetadataObjId(updateMetadataObjIdRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates an Org object. You can modify Org properties such as name,
     * description, and user associations. Requires cluster administration (**Can administer Org**)
     * privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;ORG_ADMINISTRATION&#x60; (**Can manage Orgs**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrgTest() throws ApiException {
        String orgIdentifier = null;
        UpdateOrgRequest updateOrgRequest = null;
        api.updateOrg(orgIdentifier, updateOrgRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.5.0.cl or later Updates the properties of a Role object. Available only if
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance. To update a Role, the &#x60;ROLE_ADMINISTRATION&#x60; (**Can manage
     * roles**) privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        String roleIdentifier = null;
        UpdateRoleRequest updateRoleRequest = null;
        RoleResponse response = api.updateRole(roleIdentifier, updateRoleRequest);
        // TODO: test validations
    }

    /**
     * Update schedule. Version: 9.4.0.cl or later Updates a scheduled Liveboard job. Requires at
     * least edit access to Liveboards. To update a schedule on behalf of another user, you need
     * &#x60;ADMINISTRATION&#x60; (**Can administer Org**) or &#x60;JOBSCHEDULING&#x60; (**Can
     * schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;JOBSCHEDULING&#x60; (**Can schedule for others**) privilege is required. The API
     * endpoint allows you to pause a scheduled job, change the status of a paused job. You can also
     * edit the recipients list, frequency of the job, format of the file to send to the recipients
     * in email notifications, PDF options, and time zone setting.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateScheduleTest() throws ApiException {
        String scheduleIdentifier = null;
        UpdateScheduleRequest updateScheduleRequest = null;
        api.updateSchedule(scheduleIdentifier, updateScheduleRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Updates the current configuration of the cluster. You must send
     * the configuration data in JSON format. Requires &#x60;ADMINISTRATION&#x60; (**Can administer
     * ThoughtSpot**) privileges. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;APPLICATION_ADMINISTRATION&#x60; (**Can manage application settings**) privilege is
     * required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSystemConfigTest() throws ApiException {
        UpdateSystemConfigRequest updateSystemConfigRequest = null;
        api.updateSystemConfig(updateSystemConfigRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates a tag object. You can modify the &#x60;name&#x60; and
     * &#x60;color&#x60; properties of a tag object. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the
     * &#x60;TAGMANAGEMENT&#x60; (**Can manage tags**) privilege is required to create, edit, and
     * delete tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTagTest() throws ApiException {
        String tagIdentifier = null;
        UpdateTagRequest updateTagRequest = null;
        api.updateTag(tagIdentifier, updateTagRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a user object. You can modify user
     * properties such as username, email, and share notification settings. You can also assign new
     * groups and Orgs, remove the user from a group or Org, reset password, and modify user
     * preferences. Requires &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, the &#x60;USER_ADMINISTRATION&#x60; (**Can manage users**)
     * privilege is required.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userIdentifier = null;
        UpdateUserRequest updateUserRequest = null;
        api.updateUser(userIdentifier, updateUserRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.0.0.cl or later Updates the properties of a group object in ThoughtSpot. Requires
     * &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If [Role-Based Access
     * Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance,
     * the &#x60;GROUP_ADMINISTRATION&#x60; (**Can manage groups**) privilege is required. ####
     * Supported operations This API endpoint lets you perform the following operations in a single
     * API request: * Edit
     * [privileges](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-user-management#group-privileges)
     * * Add or remove users * Change sharing visibility settings * Add or remove sub-groups *
     * Assign a default Liveboard or update the existing settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserGroupTest() throws ApiException {
        String groupIdentifier = null;
        UpdateUserGroupRequest updateUserGroupRequest = null;
        api.updateUserGroup(groupIdentifier, updateUserGroupRequest);
        // TODO: test validations
    }

    /**
     * Update a variable&#39;s name Version: 10.14.0.cl or later Allows updating a variable&#39;s
     * properties in ThoughtSpot. Requires ADMINISTRATION role and TENANT scope. The
     * CAN_MANAGE_VARIABLES permission allows you to manage Formula Variables in the current
     * organization scope. The API endpoint allows updating: * The variable name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVariableTest() throws ApiException {
        String identifier = null;
        UpdateVariableRequest updateVariableRequest = null;
        api.updateVariable(identifier, updateVariableRequest);
        // TODO: test validations
    }

    /**
     * Update values for multiple variables Version: 10.14.0.cl or later Allows updating values for
     * multiple variables in ThoughtSpot. Requires ADMINISTRATION role. The CAN_MANAGE_VARIABLES
     * permission allows you to manage Formula Variables in the current organization scope. The API
     * endpoint allows: * Adding new values to variables * Replacing existing values * Deleting
     * values from variables When updating variable values, you need to specify: * The variable
     * identifiers * The values to add/replace/remove for each variable * The operation to perform
     * (ADD, REPLACE, REMOVE, CLEAR) Behaviour based on operation type: * ADD - Adds values to the
     * variable if this is a list type variable, else same as replace. * REPLACE - Replaces all
     * values of a given set of constraints with the current set of values. * REMOVE - Removes any
     * values which match the set of conditions of the variables if this is a list type variable,
     * else clears value. * CLEAR - Removes all constrains for a given variable, scope is ignored
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVariableValuesTest() throws ApiException {
        UpdateVariableValuesRequest updateVariableValuesRequest = null;
        api.updateVariableValues(updateVariableValuesRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.14.0.cl or later Updates an existing webhook configuration by its unique id or
     * name. Only the provided fields will be updated. Requires &#x60;ADMINISTRATION&#x60; (**Can
     * administer ThoughtSpot**) or &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege.
     * If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is
     * enabled on your instance, users with &#x60;CAN_MANAGE_WEBHOOKS&#x60; (**Can manage
     * webhooks**) privilege are also authorized to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookConfigurationTest() throws ApiException {
        String webhookIdentifier = null;
        UpdateWebhookConfigurationRequest updateWebhookConfigurationRequest = null;
        api.updateWebhookConfiguration(webhookIdentifier, updateWebhookConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Version: 10.10.0.cl or later Validates the email customization configuration if any set for
     * the ThoughtSpot system. #### Pre-requisites Requires &#x60;DEVELOPER&#x60; (**has developer
     * privilege**) or &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege. If
     * [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled
     * on your instance, the &#x60;DEVELOPER&#x60; (**Has developer privilege**) privilege is
     * required. **NOTE**:This endpoint in currently in beta. Contact ThoughtSpot support to enable
     * this on your instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateEmailCustomizationTest() throws ApiException {
        api.validateEmailCustomization();
        // TODO: test validations
    }

    /**
     * Version: 9.2.0.cl or later Validates the content of your source branch against the objects in
     * your destination environment. Before merging content from your source branch to the
     * destination branch, run this API operation from your destination environment and ensure that
     * the changes from the source branch function in the destination environment. Requires
     * &#x60;DATAMANAGEMENT&#x60; (**Can manage data**) privilege. If [Role-Based Access Control
     * (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your
     * instance, the &#x60;CAN_MANAGE_WORKSHEET_VIEWS_TABLES&#x60; (**Can manage data models**)
     * privilege and edit access to the metadata objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateMergeTest() throws ApiException {
        ValidateMergeRequest validateMergeRequest = null;
        List<DeployResponse> response = api.validateMerge(validateMergeRequest);
        // TODO: test validations
    }

    /**
     * Version: 9.12.0.cl or later Validates the authentication token specified in the API request.
     * If your token is not valid, [Get a new
     * token](#/http/api-endpoints/authentication/get-full-access-token).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateTokenTest() throws ApiException {
        ValidateTokenRequest validateTokenRequest = null;
        TokenValidationResponse response = api.validateToken(validateTokenRequest);
        // TODO: test validations
    }
}
