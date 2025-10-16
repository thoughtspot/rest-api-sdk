/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** SystemInfo */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SystemInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_RELEASE_VERSION = "release_version";

    @SerializedName(SERIALIZED_NAME_RELEASE_VERSION)
    @javax.annotation.Nullable
    private String releaseVersion;

    public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";

    @SerializedName(SERIALIZED_NAME_TIME_ZONE)
    @javax.annotation.Nullable
    private String timeZone;

    public static final String SERIALIZED_NAME_LOCALE = "locale";

    @SerializedName(SERIALIZED_NAME_LOCALE)
    @javax.annotation.Nullable
    private String locale;

    public static final String SERIALIZED_NAME_DATE_FORMAT = "date_format";

    @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
    @javax.annotation.Nullable
    private String dateFormat;

    public static final String SERIALIZED_NAME_API_VERSION = "api_version";

    @SerializedName(SERIALIZED_NAME_API_VERSION)
    @javax.annotation.Nullable
    private String apiVersion;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";

    @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
    @javax.annotation.Nullable
    private String environment;

    public static final String SERIALIZED_NAME_LICENSE = "license";

    @SerializedName(SERIALIZED_NAME_LICENSE)
    @javax.annotation.Nullable
    private String license;

    public static final String SERIALIZED_NAME_DATE_TIME_FORMAT = "date_time_format";

    @SerializedName(SERIALIZED_NAME_DATE_TIME_FORMAT)
    @javax.annotation.Nullable
    private String dateTimeFormat;

    public static final String SERIALIZED_NAME_TIME_FORMAT = "time_format";

    @SerializedName(SERIALIZED_NAME_TIME_FORMAT)
    @javax.annotation.Nullable
    private String timeFormat;

    public static final String SERIALIZED_NAME_SYSTEM_USER_ID = "system_user_id";

    @SerializedName(SERIALIZED_NAME_SYSTEM_USER_ID)
    @javax.annotation.Nullable
    private String systemUserId;

    public static final String SERIALIZED_NAME_SUPER_USER_ID = "super_user_id";

    @SerializedName(SERIALIZED_NAME_SUPER_USER_ID)
    @javax.annotation.Nullable
    private String superUserId;

    public static final String SERIALIZED_NAME_HIDDEN_OBJECT_ID = "hidden_object_id";

    @SerializedName(SERIALIZED_NAME_HIDDEN_OBJECT_ID)
    @javax.annotation.Nullable
    private String hiddenObjectId;

    public static final String SERIALIZED_NAME_SYSTEM_GROUP_ID = "system_group_id";

    @SerializedName(SERIALIZED_NAME_SYSTEM_GROUP_ID)
    @javax.annotation.Nullable
    private String systemGroupId;

    public static final String SERIALIZED_NAME_TSADMIN_USER_ID = "tsadmin_user_id";

    @SerializedName(SERIALIZED_NAME_TSADMIN_USER_ID)
    @javax.annotation.Nullable
    private String tsadminUserId;

    public static final String SERIALIZED_NAME_ADMIN_GROUP_ID = "admin_group_id";

    @SerializedName(SERIALIZED_NAME_ADMIN_GROUP_ID)
    @javax.annotation.Nullable
    private String adminGroupId;

    public static final String SERIALIZED_NAME_ALL_TABLES_CONNECTION_ID =
            "all_tables_connection_id";

    @SerializedName(SERIALIZED_NAME_ALL_TABLES_CONNECTION_ID)
    @javax.annotation.Nullable
    private String allTablesConnectionId;

    public static final String SERIALIZED_NAME_ALL_USER_GROUP_ID = "all_user_group_id";

    @SerializedName(SERIALIZED_NAME_ALL_USER_GROUP_ID)
    @javax.annotation.Nullable
    private String allUserGroupId;

    public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "accept_language";

    @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
    @javax.annotation.Nullable
    private String acceptLanguage;

    public static final String SERIALIZED_NAME_ALL_USER_GROUP_MEMBER_USER_COUNT =
            "all_user_group_member_user_count";

    @SerializedName(SERIALIZED_NAME_ALL_USER_GROUP_MEMBER_USER_COUNT)
    @javax.annotation.Nullable
    private Integer allUserGroupMemberUserCount;

    public static final String SERIALIZED_NAME_LOGICAL_MODEL_VERSION = "logical_model_version";

    @SerializedName(SERIALIZED_NAME_LOGICAL_MODEL_VERSION)
    @javax.annotation.Nullable
    private Integer logicalModelVersion;

    public SystemInfo() {}

    public SystemInfo id(@javax.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the object
     *
     * @return id
     */
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nullable String id) {
        this.id = id;
    }

    public SystemInfo name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the cluster.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public SystemInfo releaseVersion(@javax.annotation.Nullable String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * The release version of the cluster.
     *
     * @return releaseVersion
     */
    @javax.annotation.Nullable
    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(@javax.annotation.Nullable String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public SystemInfo timeZone(@javax.annotation.Nullable String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * The timezone of the cluster.
     *
     * @return timeZone
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(@javax.annotation.Nullable String timeZone) {
        this.timeZone = timeZone;
    }

    public SystemInfo locale(@javax.annotation.Nullable String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * The default locale of the cluster.
     *
     * @return locale
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return locale;
    }

    public void setLocale(@javax.annotation.Nullable String locale) {
        this.locale = locale;
    }

    public SystemInfo dateFormat(@javax.annotation.Nullable String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * The default date format representation of the cluster.
     *
     * @return dateFormat
     */
    @javax.annotation.Nullable
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(@javax.annotation.Nullable String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public SystemInfo apiVersion(@javax.annotation.Nullable String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The API version of the cluster.
     *
     * @return apiVersion
     */
    @javax.annotation.Nullable
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(@javax.annotation.Nullable String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public SystemInfo type(@javax.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * The deployment type of the cluster.
     *
     * @return type
     */
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable String type) {
        this.type = type;
    }

    public SystemInfo environment(@javax.annotation.Nullable String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * The deployed environment of the cluster.
     *
     * @return environment
     */
    @javax.annotation.Nullable
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(@javax.annotation.Nullable String environment) {
        this.environment = environment;
    }

    public SystemInfo license(@javax.annotation.Nullable String license) {
        this.license = license;
        return this;
    }

    /**
     * The license applied to the cluster.
     *
     * @return license
     */
    @javax.annotation.Nullable
    public String getLicense() {
        return license;
    }

    public void setLicense(@javax.annotation.Nullable String license) {
        this.license = license;
    }

    public SystemInfo dateTimeFormat(@javax.annotation.Nullable String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
        return this;
    }

    /**
     * The default date time format representation of the cluster.
     *
     * @return dateTimeFormat
     */
    @javax.annotation.Nullable
    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(@javax.annotation.Nullable String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }

    public SystemInfo timeFormat(@javax.annotation.Nullable String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * The default time format representation of the cluster.
     *
     * @return timeFormat
     */
    @javax.annotation.Nullable
    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(@javax.annotation.Nullable String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public SystemInfo systemUserId(@javax.annotation.Nullable String systemUserId) {
        this.systemUserId = systemUserId;
        return this;
    }

    /**
     * The unique identifier of system user.
     *
     * @return systemUserId
     */
    @javax.annotation.Nullable
    public String getSystemUserId() {
        return systemUserId;
    }

    public void setSystemUserId(@javax.annotation.Nullable String systemUserId) {
        this.systemUserId = systemUserId;
    }

    public SystemInfo superUserId(@javax.annotation.Nullable String superUserId) {
        this.superUserId = superUserId;
        return this;
    }

    /**
     * The unique identifier of super user.
     *
     * @return superUserId
     */
    @javax.annotation.Nullable
    public String getSuperUserId() {
        return superUserId;
    }

    public void setSuperUserId(@javax.annotation.Nullable String superUserId) {
        this.superUserId = superUserId;
    }

    public SystemInfo hiddenObjectId(@javax.annotation.Nullable String hiddenObjectId) {
        this.hiddenObjectId = hiddenObjectId;
        return this;
    }

    /**
     * The unique identifier of hidden object.
     *
     * @return hiddenObjectId
     */
    @javax.annotation.Nullable
    public String getHiddenObjectId() {
        return hiddenObjectId;
    }

    public void setHiddenObjectId(@javax.annotation.Nullable String hiddenObjectId) {
        this.hiddenObjectId = hiddenObjectId;
    }

    public SystemInfo systemGroupId(@javax.annotation.Nullable String systemGroupId) {
        this.systemGroupId = systemGroupId;
        return this;
    }

    /**
     * The unique identifier of system group.
     *
     * @return systemGroupId
     */
    @javax.annotation.Nullable
    public String getSystemGroupId() {
        return systemGroupId;
    }

    public void setSystemGroupId(@javax.annotation.Nullable String systemGroupId) {
        this.systemGroupId = systemGroupId;
    }

    public SystemInfo tsadminUserId(@javax.annotation.Nullable String tsadminUserId) {
        this.tsadminUserId = tsadminUserId;
        return this;
    }

    /**
     * The unique identifier of tsadmin user.
     *
     * @return tsadminUserId
     */
    @javax.annotation.Nullable
    public String getTsadminUserId() {
        return tsadminUserId;
    }

    public void setTsadminUserId(@javax.annotation.Nullable String tsadminUserId) {
        this.tsadminUserId = tsadminUserId;
    }

    public SystemInfo adminGroupId(@javax.annotation.Nullable String adminGroupId) {
        this.adminGroupId = adminGroupId;
        return this;
    }

    /**
     * The unique identifier of admin group.
     *
     * @return adminGroupId
     */
    @javax.annotation.Nullable
    public String getAdminGroupId() {
        return adminGroupId;
    }

    public void setAdminGroupId(@javax.annotation.Nullable String adminGroupId) {
        this.adminGroupId = adminGroupId;
    }

    public SystemInfo allTablesConnectionId(
            @javax.annotation.Nullable String allTablesConnectionId) {
        this.allTablesConnectionId = allTablesConnectionId;
        return this;
    }

    /**
     * The unique identifier of all tables connection.
     *
     * @return allTablesConnectionId
     */
    @javax.annotation.Nullable
    public String getAllTablesConnectionId() {
        return allTablesConnectionId;
    }

    public void setAllTablesConnectionId(@javax.annotation.Nullable String allTablesConnectionId) {
        this.allTablesConnectionId = allTablesConnectionId;
    }

    public SystemInfo allUserGroupId(@javax.annotation.Nullable String allUserGroupId) {
        this.allUserGroupId = allUserGroupId;
        return this;
    }

    /**
     * The unique identifier of ALL group.
     *
     * @return allUserGroupId
     */
    @javax.annotation.Nullable
    public String getAllUserGroupId() {
        return allUserGroupId;
    }

    public void setAllUserGroupId(@javax.annotation.Nullable String allUserGroupId) {
        this.allUserGroupId = allUserGroupId;
    }

    public SystemInfo acceptLanguage(@javax.annotation.Nullable String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * The supported accept language by the cluster.
     *
     * @return acceptLanguage
     */
    @javax.annotation.Nullable
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(@javax.annotation.Nullable String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public SystemInfo allUserGroupMemberUserCount(
            @javax.annotation.Nullable Integer allUserGroupMemberUserCount) {
        this.allUserGroupMemberUserCount = allUserGroupMemberUserCount;
        return this;
    }

    /**
     * The count of users of ALL group.
     *
     * @return allUserGroupMemberUserCount
     */
    @javax.annotation.Nullable
    public Integer getAllUserGroupMemberUserCount() {
        return allUserGroupMemberUserCount;
    }

    public void setAllUserGroupMemberUserCount(
            @javax.annotation.Nullable Integer allUserGroupMemberUserCount) {
        this.allUserGroupMemberUserCount = allUserGroupMemberUserCount;
    }

    public SystemInfo logicalModelVersion(@javax.annotation.Nullable Integer logicalModelVersion) {
        this.logicalModelVersion = logicalModelVersion;
        return this;
    }

    /**
     * The version number of logical model of the cluster.
     *
     * @return logicalModelVersion
     */
    @javax.annotation.Nullable
    public Integer getLogicalModelVersion() {
        return logicalModelVersion;
    }

    public void setLogicalModelVersion(@javax.annotation.Nullable Integer logicalModelVersion) {
        this.logicalModelVersion = logicalModelVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) o;
        return Objects.equals(this.id, systemInfo.id)
                && Objects.equals(this.name, systemInfo.name)
                && Objects.equals(this.releaseVersion, systemInfo.releaseVersion)
                && Objects.equals(this.timeZone, systemInfo.timeZone)
                && Objects.equals(this.locale, systemInfo.locale)
                && Objects.equals(this.dateFormat, systemInfo.dateFormat)
                && Objects.equals(this.apiVersion, systemInfo.apiVersion)
                && Objects.equals(this.type, systemInfo.type)
                && Objects.equals(this.environment, systemInfo.environment)
                && Objects.equals(this.license, systemInfo.license)
                && Objects.equals(this.dateTimeFormat, systemInfo.dateTimeFormat)
                && Objects.equals(this.timeFormat, systemInfo.timeFormat)
                && Objects.equals(this.systemUserId, systemInfo.systemUserId)
                && Objects.equals(this.superUserId, systemInfo.superUserId)
                && Objects.equals(this.hiddenObjectId, systemInfo.hiddenObjectId)
                && Objects.equals(this.systemGroupId, systemInfo.systemGroupId)
                && Objects.equals(this.tsadminUserId, systemInfo.tsadminUserId)
                && Objects.equals(this.adminGroupId, systemInfo.adminGroupId)
                && Objects.equals(this.allTablesConnectionId, systemInfo.allTablesConnectionId)
                && Objects.equals(this.allUserGroupId, systemInfo.allUserGroupId)
                && Objects.equals(this.acceptLanguage, systemInfo.acceptLanguage)
                && Objects.equals(
                        this.allUserGroupMemberUserCount, systemInfo.allUserGroupMemberUserCount)
                && Objects.equals(this.logicalModelVersion, systemInfo.logicalModelVersion);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                releaseVersion,
                timeZone,
                locale,
                dateFormat,
                apiVersion,
                type,
                environment,
                license,
                dateTimeFormat,
                timeFormat,
                systemUserId,
                superUserId,
                hiddenObjectId,
                systemGroupId,
                tsadminUserId,
                adminGroupId,
                allTablesConnectionId,
                allUserGroupId,
                acceptLanguage,
                allUserGroupMemberUserCount,
                logicalModelVersion);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    dateTimeFormat: ").append(toIndentedString(dateTimeFormat)).append("\n");
        sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
        sb.append("    systemUserId: ").append(toIndentedString(systemUserId)).append("\n");
        sb.append("    superUserId: ").append(toIndentedString(superUserId)).append("\n");
        sb.append("    hiddenObjectId: ").append(toIndentedString(hiddenObjectId)).append("\n");
        sb.append("    systemGroupId: ").append(toIndentedString(systemGroupId)).append("\n");
        sb.append("    tsadminUserId: ").append(toIndentedString(tsadminUserId)).append("\n");
        sb.append("    adminGroupId: ").append(toIndentedString(adminGroupId)).append("\n");
        sb.append("    allTablesConnectionId: ")
                .append(toIndentedString(allTablesConnectionId))
                .append("\n");
        sb.append("    allUserGroupId: ").append(toIndentedString(allUserGroupId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    allUserGroupMemberUserCount: ")
                .append(toIndentedString(allUserGroupMemberUserCount))
                .append("\n");
        sb.append("    logicalModelVersion: ")
                .append(toIndentedString(logicalModelVersion))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("id");
        openapiFields.add("name");
        openapiFields.add("release_version");
        openapiFields.add("time_zone");
        openapiFields.add("locale");
        openapiFields.add("date_format");
        openapiFields.add("api_version");
        openapiFields.add("type");
        openapiFields.add("environment");
        openapiFields.add("license");
        openapiFields.add("date_time_format");
        openapiFields.add("time_format");
        openapiFields.add("system_user_id");
        openapiFields.add("super_user_id");
        openapiFields.add("hidden_object_id");
        openapiFields.add("system_group_id");
        openapiFields.add("tsadmin_user_id");
        openapiFields.add("admin_group_id");
        openapiFields.add("all_tables_connection_id");
        openapiFields.add("all_user_group_id");
        openapiFields.add("accept_language");
        openapiFields.add("all_user_group_member_user_count");
        openapiFields.add("logical_model_version");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SystemInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SystemInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SystemInfo is not found in the empty"
                                        + " JSON string",
                                SystemInfo.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SystemInfo.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SystemInfo` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("release_version") != null && !jsonObj.get("release_version").isJsonNull())
                && !jsonObj.get("release_version").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `release_version` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("release_version").toString()));
        }
        if ((jsonObj.get("time_zone") != null && !jsonObj.get("time_zone").isJsonNull())
                && !jsonObj.get("time_zone").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `time_zone` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("time_zone").toString()));
        }
        if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull())
                && !jsonObj.get("locale").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `locale` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("locale").toString()));
        }
        if ((jsonObj.get("date_format") != null && !jsonObj.get("date_format").isJsonNull())
                && !jsonObj.get("date_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `date_format` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("date_format").toString()));
        }
        if ((jsonObj.get("api_version") != null && !jsonObj.get("api_version").isJsonNull())
                && !jsonObj.get("api_version").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `api_version` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("api_version").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull())
                && !jsonObj.get("environment").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `environment` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("environment").toString()));
        }
        if ((jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull())
                && !jsonObj.get("license").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `license` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("license").toString()));
        }
        if ((jsonObj.get("date_time_format") != null
                        && !jsonObj.get("date_time_format").isJsonNull())
                && !jsonObj.get("date_time_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `date_time_format` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("date_time_format").toString()));
        }
        if ((jsonObj.get("time_format") != null && !jsonObj.get("time_format").isJsonNull())
                && !jsonObj.get("time_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `time_format` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("time_format").toString()));
        }
        if ((jsonObj.get("system_user_id") != null && !jsonObj.get("system_user_id").isJsonNull())
                && !jsonObj.get("system_user_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `system_user_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("system_user_id").toString()));
        }
        if ((jsonObj.get("super_user_id") != null && !jsonObj.get("super_user_id").isJsonNull())
                && !jsonObj.get("super_user_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `super_user_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("super_user_id").toString()));
        }
        if ((jsonObj.get("hidden_object_id") != null
                        && !jsonObj.get("hidden_object_id").isJsonNull())
                && !jsonObj.get("hidden_object_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `hidden_object_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("hidden_object_id").toString()));
        }
        if ((jsonObj.get("system_group_id") != null && !jsonObj.get("system_group_id").isJsonNull())
                && !jsonObj.get("system_group_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `system_group_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("system_group_id").toString()));
        }
        if ((jsonObj.get("tsadmin_user_id") != null && !jsonObj.get("tsadmin_user_id").isJsonNull())
                && !jsonObj.get("tsadmin_user_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tsadmin_user_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("tsadmin_user_id").toString()));
        }
        if ((jsonObj.get("admin_group_id") != null && !jsonObj.get("admin_group_id").isJsonNull())
                && !jsonObj.get("admin_group_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `admin_group_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("admin_group_id").toString()));
        }
        if ((jsonObj.get("all_tables_connection_id") != null
                        && !jsonObj.get("all_tables_connection_id").isJsonNull())
                && !jsonObj.get("all_tables_connection_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `all_tables_connection_id` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("all_tables_connection_id").toString()));
        }
        if ((jsonObj.get("all_user_group_id") != null
                        && !jsonObj.get("all_user_group_id").isJsonNull())
                && !jsonObj.get("all_user_group_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `all_user_group_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("all_user_group_id").toString()));
        }
        if ((jsonObj.get("accept_language") != null && !jsonObj.get("accept_language").isJsonNull())
                && !jsonObj.get("accept_language").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `accept_language` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("accept_language").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SystemInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SystemInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SystemInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SystemInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SystemInfo>() {
                        @Override
                        public void write(JsonWriter out, SystemInfo value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SystemInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SystemInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SystemInfo
     * @throws IOException if the JSON string is invalid with respect to SystemInfo
     */
    public static SystemInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SystemInfo.class);
    }

    /**
     * Convert an instance of SystemInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
