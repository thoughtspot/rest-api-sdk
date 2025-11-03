/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import okio.ByteString;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter =
            new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder();
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(
            JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException(
                    "missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator
     * value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(
            Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException(
                    "cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.APIKey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.APIKeyInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AccessToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActionConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActionConfigInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActionConfigInputCreate
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActionDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActionDetailsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActionDetailsInputCreate
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ActivateUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AnswerContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AnswerDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AssignChangeAuthorRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AssignTagRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AssociateMetadataInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AssociateMetadataInputCreate
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Authentication.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AuthenticationInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Author.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AuthorMetadataTypeInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.AuthorType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.BasicAuth.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.BasicAuthInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CALLBACK.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CALLBACKInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CALLBACKInputMandatory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ChangeUserPasswordRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Column.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CommitBranchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CommitFileType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CommitHistoryResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CommitResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CommiterType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ConnectionInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Conversation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ConvertWorksheetToModelRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CopyObjectRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateConfigRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateConnectionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateConnectionResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateConversationRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateCustomActionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateOrgRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateRoleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateTagRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateUserGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CreateUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CronExpression.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CronExpressionInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.CustomActionMetadataTypeInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DataWarehouseObjectInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DataWarehouseObjects.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Database.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DbtConnectionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DbtGenerateSyncTmlRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DbtGenerateTmlRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DbtSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeactivateUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DefaultActionConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DefaultActionConfigInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DefaultActionConfigInputCreate
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DefaultActionConfigSearchInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeleteConfigRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeleteConnectionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeleteMetadataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeleteMetadataTypeInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeployCommitRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.DeployResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ErrorResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.EurekaDecomposeQueryResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.EurekaLLMDecomposeQueryResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.EurekaLLMSuggestedQuery
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExcludeMetadataListItemInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExportAnswerReportRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExportLiveboardReportRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExportMetadataTMLBatchedRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExportMetadataTMLRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExportMetadataTypeInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ExportOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FavoriteMetadataInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FavoriteMetadataItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FavoriteObjectOptionsInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchAnswerDataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchAnswerSqlQueryRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchAsyncImportTaskStatusRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchConnectionDiffStatusResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchLiveboardDataRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchLiveboardSqlQueryRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchLogsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchPermissionsOfPrincipalsRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FetchPermissionsOnMetadataRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FilterRules.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ForceLogoutUsersRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Frequency.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.FrequencyInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GenericInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GetAsyncImportStatusResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GetCustomAccessTokenRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GetFullAccessTokenRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GetObjectAccessTokenRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GetTokenResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GroupObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.GroupsImportListInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.HeaderAttributeInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.HeaderUpdateInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportEPackAsyncTaskStatus
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportMetadataTMLAsyncRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportMetadataTMLRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportUserGroupsRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportUserGroupsResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportUserType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportUsersRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ImportUsersResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.InputEurekaNLSRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.JWTMetadataObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.JWTParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.JWTUserOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.JWTUserOptionsFull.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.LiveboardContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.LiveboardDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.LiveboardOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.LiveboardOptionsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.LogResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.LoginRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataAssociationItem
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataListItemInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.MetadataSearchSortOptions
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ModelTableList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ObjectIDAndName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Org.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.OrgInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.OrgResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ParameterValues.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ParametersListItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ParametersListItemInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PdfOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PdfOptionsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PermissionInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PermissionOfMetadataResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PermissionOfPrincipalsResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PermissionsMetadataTypeInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PngOptionsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PrincipalsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PrincipalsListItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.PrincipalsListItemInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.QueryGetDecomposedQueryRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RecipientDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RecipientDetailsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RegionalSettingsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RepoConfigObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResetUserPasswordRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseActivationURL.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseCopyObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseCustomAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseFailedEntities.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseFailedEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseIncompleteEntities
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseIncompleteEntity
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponsePostUpgradeFailedEntities
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponsePostUpgradeFailedEntity
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseSchedule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseScheduleRun.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseSuccessfulEntities
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseSuccessfulEntity
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ResponseWorksheetToModelConversion
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RevertCommitRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RevertResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RevertedMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RevokeTokenRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RiseGQLArgWrapper.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RiseSetter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Role.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RoleResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RuntimeFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RuntimeFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RuntimeParamOverride.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RuntimeParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RuntimeSort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.RuntimeSorts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ScheduleHistoryRunsOptionsInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SchedulesPdfOptionsInput
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SchemaObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Scope.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchCommitsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchConfigRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchConnectionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchConnectionResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchCustomActionsRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchDataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchMetadataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchOrgsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchRoleResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchRolesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchSchedulesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchTagsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchUserGroupsRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SearchUsersRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SendMessageRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ShareMetadataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ShareMetadataTypeInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SharePermissionsInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SingleAnswerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SortOptionInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SortOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SortingOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SqlQuery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SqlQueryResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SystemConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.SystemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Table.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Tag.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.TagMetadataTypeInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.Token.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.TokenAccessScopeObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.TokenValidationResponse
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.URL.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.URLInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.URLInputMandatory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateConfigRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateConnectionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateConnectionV2Request
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateCustomActionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateDbtConnectionRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateMetadataHeaderRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateMetadataObjIdRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateObjIdInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateOrgRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateRoleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateSystemConfigRequest
                        .CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateTagRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateUserGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UpdateUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UserGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UserGroupResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UserObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.UserParameterOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ValidateMergeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(
                new com.thoughtspot.client.model.ValidateTokenRequest.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T> Type
     * @param body The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see
                // https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /** Gson TypeAdapter for Byte Array type */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /** Gson TypeAdapter for JSR310 OffsetDateTime type */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length() - 5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /** Gson TypeAdapter for JSR310 LocalDate type */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type If the dateFormat is null, a simple "yyyy-MM-dd"
     * format will be used (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(
                                ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type If the dateFormat is null, ISO8601Utils will be
     * used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
