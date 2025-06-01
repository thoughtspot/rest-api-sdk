/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** UpdateDbtConnectionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateDbtConnectionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER =
            "dbt_connection_identifier";

    @SerializedName(SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String dbtConnectionIdentifier;

    public static final String SERIALIZED_NAME_CONNECTION_NAME = "connection_name";

    @SerializedName(SERIALIZED_NAME_CONNECTION_NAME)
    @javax.annotation.Nullable
    private String connectionName;

    public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";

    @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
    @javax.annotation.Nullable
    private String databaseName;

    /** Mention type of Import */
    @JsonAdapter(ImportTypeEnum.Adapter.class)
    public enum ImportTypeEnum {
        DBT_CLOUD("DBT_CLOUD"),

        ZIP_FILE("ZIP_FILE");

        private String value;

        ImportTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImportTypeEnum fromValue(String value) {
            for (ImportTypeEnum b : ImportTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ImportTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ImportTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImportTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImportTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ImportTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_IMPORT_TYPE = "import_type";

    @SerializedName(SERIALIZED_NAME_IMPORT_TYPE)
    @javax.annotation.Nullable
    private ImportTypeEnum importType = ImportTypeEnum.DBT_CLOUD;

    public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";

    @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
    @javax.annotation.Nullable
    private String accessToken;

    public static final String SERIALIZED_NAME_DBT_URL = "dbt_url";

    @SerializedName(SERIALIZED_NAME_DBT_URL)
    @javax.annotation.Nullable
    private String dbtUrl;

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    @javax.annotation.Nullable
    private String accountId;

    public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";

    @SerializedName(SERIALIZED_NAME_PROJECT_ID)
    @javax.annotation.Nullable
    private String projectId;

    public static final String SERIALIZED_NAME_DBT_ENV_ID = "dbt_env_id";

    @SerializedName(SERIALIZED_NAME_DBT_ENV_ID)
    @javax.annotation.Nullable
    private String dbtEnvId;

    public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";

    @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
    @javax.annotation.Nullable
    private String projectName;

    public static final String SERIALIZED_NAME_FILE_CONTENT = "file_content";

    @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
    @javax.annotation.Nullable
    private File fileContent;

    public UpdateDbtConnectionRequest() {}

    public UpdateDbtConnectionRequest dbtConnectionIdentifier(
            @javax.annotation.Nonnull String dbtConnectionIdentifier) {
        this.dbtConnectionIdentifier = dbtConnectionIdentifier;
        return this;
    }

    /**
     * Unique ID of the DBT Connection.
     *
     * @return dbtConnectionIdentifier
     */
    @javax.annotation.Nonnull
    public String getDbtConnectionIdentifier() {
        return dbtConnectionIdentifier;
    }

    public void setDbtConnectionIdentifier(
            @javax.annotation.Nonnull String dbtConnectionIdentifier) {
        this.dbtConnectionIdentifier = dbtConnectionIdentifier;
    }

    public UpdateDbtConnectionRequest connectionName(
            @javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Name of the connection.
     *
     * @return connectionName
     */
    @javax.annotation.Nullable
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(@javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
    }

    public UpdateDbtConnectionRequest databaseName(@javax.annotation.Nullable String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Name of the Database.
     *
     * @return databaseName
     */
    @javax.annotation.Nullable
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(@javax.annotation.Nullable String databaseName) {
        this.databaseName = databaseName;
    }

    public UpdateDbtConnectionRequest importType(
            @javax.annotation.Nullable ImportTypeEnum importType) {
        this.importType = importType;
        return this;
    }

    /**
     * Mention type of Import
     *
     * @return importType
     */
    @javax.annotation.Nullable
    public ImportTypeEnum getImportType() {
        return importType;
    }

    public void setImportType(@javax.annotation.Nullable ImportTypeEnum importType) {
        this.importType = importType;
    }

    public UpdateDbtConnectionRequest accessToken(@javax.annotation.Nullable String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Access token is mandatory when Import_Type is DBT_CLOUD.
     *
     * @return accessToken
     */
    @javax.annotation.Nullable
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(@javax.annotation.Nullable String accessToken) {
        this.accessToken = accessToken;
    }

    public UpdateDbtConnectionRequest dbtUrl(@javax.annotation.Nullable String dbtUrl) {
        this.dbtUrl = dbtUrl;
        return this;
    }

    /**
     * DBT URL is mandatory when Import_Type is DBT_CLOUD.
     *
     * @return dbtUrl
     */
    @javax.annotation.Nullable
    public String getDbtUrl() {
        return dbtUrl;
    }

    public void setDbtUrl(@javax.annotation.Nullable String dbtUrl) {
        this.dbtUrl = dbtUrl;
    }

    public UpdateDbtConnectionRequest accountId(@javax.annotation.Nullable String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Account ID is mandatory when Import_Type is DBT_CLOUD
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(@javax.annotation.Nullable String accountId) {
        this.accountId = accountId;
    }

    public UpdateDbtConnectionRequest projectId(@javax.annotation.Nullable String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Project ID is mandatory when Import_Type is DBT_CLOUD
     *
     * @return projectId
     */
    @javax.annotation.Nullable
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(@javax.annotation.Nullable String projectId) {
        this.projectId = projectId;
    }

    public UpdateDbtConnectionRequest dbtEnvId(@javax.annotation.Nullable String dbtEnvId) {
        this.dbtEnvId = dbtEnvId;
        return this;
    }

    /**
     * DBT Environment ID\&quot;
     *
     * @return dbtEnvId
     */
    @javax.annotation.Nullable
    public String getDbtEnvId() {
        return dbtEnvId;
    }

    public void setDbtEnvId(@javax.annotation.Nullable String dbtEnvId) {
        this.dbtEnvId = dbtEnvId;
    }

    public UpdateDbtConnectionRequest projectName(@javax.annotation.Nullable String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Name of the project
     *
     * @return projectName
     */
    @javax.annotation.Nullable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(@javax.annotation.Nullable String projectName) {
        this.projectName = projectName;
    }

    public UpdateDbtConnectionRequest fileContent(@javax.annotation.Nullable File fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when
     * Import Type is &#39;ZIP_FILE&#39;
     *
     * @return fileContent
     */
    @javax.annotation.Nullable
    public File getFileContent() {
        return fileContent;
    }

    public void setFileContent(@javax.annotation.Nullable File fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDbtConnectionRequest updateDbtConnectionRequest = (UpdateDbtConnectionRequest) o;
        return Objects.equals(
                        this.dbtConnectionIdentifier,
                        updateDbtConnectionRequest.dbtConnectionIdentifier)
                && Objects.equals(this.connectionName, updateDbtConnectionRequest.connectionName)
                && Objects.equals(this.databaseName, updateDbtConnectionRequest.databaseName)
                && Objects.equals(this.importType, updateDbtConnectionRequest.importType)
                && Objects.equals(this.accessToken, updateDbtConnectionRequest.accessToken)
                && Objects.equals(this.dbtUrl, updateDbtConnectionRequest.dbtUrl)
                && Objects.equals(this.accountId, updateDbtConnectionRequest.accountId)
                && Objects.equals(this.projectId, updateDbtConnectionRequest.projectId)
                && Objects.equals(this.dbtEnvId, updateDbtConnectionRequest.dbtEnvId)
                && Objects.equals(this.projectName, updateDbtConnectionRequest.projectName)
                && Objects.equals(this.fileContent, updateDbtConnectionRequest.fileContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
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
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDbtConnectionRequest {\n");
        sb.append("    dbtConnectionIdentifier: ")
                .append(toIndentedString(dbtConnectionIdentifier))
                .append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    dbtUrl: ").append(toIndentedString(dbtUrl)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dbtEnvId: ").append(toIndentedString(dbtEnvId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
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
        openapiFields.add("dbt_connection_identifier");
        openapiFields.add("connection_name");
        openapiFields.add("database_name");
        openapiFields.add("import_type");
        openapiFields.add("access_token");
        openapiFields.add("dbt_url");
        openapiFields.add("account_id");
        openapiFields.add("project_id");
        openapiFields.add("dbt_env_id");
        openapiFields.add("project_name");
        openapiFields.add("file_content");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("dbt_connection_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateDbtConnectionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateDbtConnectionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateDbtConnectionRequest is not"
                                        + " found in the empty JSON string",
                                UpdateDbtConnectionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateDbtConnectionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateDbtConnectionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateDbtConnectionRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("dbt_connection_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dbt_connection_identifier` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("dbt_connection_identifier").toString()));
        }
        if ((jsonObj.get("connection_name") != null && !jsonObj.get("connection_name").isJsonNull())
                && !jsonObj.get("connection_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connection_name").toString()));
        }
        if ((jsonObj.get("database_name") != null && !jsonObj.get("database_name").isJsonNull())
                && !jsonObj.get("database_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `database_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("database_name").toString()));
        }
        if ((jsonObj.get("import_type") != null && !jsonObj.get("import_type").isJsonNull())
                && !jsonObj.get("import_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `import_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("import_type").toString()));
        }
        // validate the optional field `import_type`
        if (jsonObj.get("import_type") != null && !jsonObj.get("import_type").isJsonNull()) {
            ImportTypeEnum.validateJsonElement(jsonObj.get("import_type"));
        }
        if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull())
                && !jsonObj.get("access_token").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `access_token` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("access_token").toString()));
        }
        if ((jsonObj.get("dbt_url") != null && !jsonObj.get("dbt_url").isJsonNull())
                && !jsonObj.get("dbt_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dbt_url` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("dbt_url").toString()));
        }
        if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull())
                && !jsonObj.get("account_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `account_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("account_id").toString()));
        }
        if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull())
                && !jsonObj.get("project_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `project_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("project_id").toString()));
        }
        if ((jsonObj.get("dbt_env_id") != null && !jsonObj.get("dbt_env_id").isJsonNull())
                && !jsonObj.get("dbt_env_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dbt_env_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("dbt_env_id").toString()));
        }
        if ((jsonObj.get("project_name") != null && !jsonObj.get("project_name").isJsonNull())
                && !jsonObj.get("project_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `project_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("project_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateDbtConnectionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateDbtConnectionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateDbtConnectionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateDbtConnectionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateDbtConnectionRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateDbtConnectionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateDbtConnectionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateDbtConnectionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateDbtConnectionRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateDbtConnectionRequest
     */
    public static UpdateDbtConnectionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateDbtConnectionRequest.class);
    }

    /**
     * Convert an instance of UpdateDbtConnectionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
