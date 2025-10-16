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

/** DbtSearchResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DbtSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER =
            "dbt_connection_identifier";

    @SerializedName(SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER)
    @javax.annotation.Nullable
    private String dbtConnectionIdentifier;

    public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";

    @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
    @javax.annotation.Nullable
    private String projectName;

    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";

    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    @javax.annotation.Nullable
    private String connectionId;

    public static final String SERIALIZED_NAME_CONNECTION_NAME = "connection_name";

    @SerializedName(SERIALIZED_NAME_CONNECTION_NAME)
    @javax.annotation.Nullable
    private String connectionName;

    public static final String SERIALIZED_NAME_CDW_DATABASE = "cdw_database";

    @SerializedName(SERIALIZED_NAME_CDW_DATABASE)
    @javax.annotation.Nullable
    private String cdwDatabase;

    public static final String SERIALIZED_NAME_IMPORT_TYPE = "import_type";

    @SerializedName(SERIALIZED_NAME_IMPORT_TYPE)
    @javax.annotation.Nullable
    private String importType;

    public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";

    @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
    @javax.annotation.Nullable
    private String authorName;

    public DbtSearchResponse() {}

    public DbtSearchResponse dbtConnectionIdentifier(
            @javax.annotation.Nullable String dbtConnectionIdentifier) {
        this.dbtConnectionIdentifier = dbtConnectionIdentifier;
        return this;
    }

    /**
     * Get dbtConnectionIdentifier
     *
     * @return dbtConnectionIdentifier
     */
    @javax.annotation.Nullable
    public String getDbtConnectionIdentifier() {
        return dbtConnectionIdentifier;
    }

    public void setDbtConnectionIdentifier(
            @javax.annotation.Nullable String dbtConnectionIdentifier) {
        this.dbtConnectionIdentifier = dbtConnectionIdentifier;
    }

    public DbtSearchResponse projectName(@javax.annotation.Nullable String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get projectName
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

    public DbtSearchResponse connectionId(@javax.annotation.Nullable String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Get connectionId
     *
     * @return connectionId
     */
    @javax.annotation.Nullable
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(@javax.annotation.Nullable String connectionId) {
        this.connectionId = connectionId;
    }

    public DbtSearchResponse connectionName(@javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get connectionName
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

    public DbtSearchResponse cdwDatabase(@javax.annotation.Nullable String cdwDatabase) {
        this.cdwDatabase = cdwDatabase;
        return this;
    }

    /**
     * Get cdwDatabase
     *
     * @return cdwDatabase
     */
    @javax.annotation.Nullable
    public String getCdwDatabase() {
        return cdwDatabase;
    }

    public void setCdwDatabase(@javax.annotation.Nullable String cdwDatabase) {
        this.cdwDatabase = cdwDatabase;
    }

    public DbtSearchResponse importType(@javax.annotation.Nullable String importType) {
        this.importType = importType;
        return this;
    }

    /**
     * Get importType
     *
     * @return importType
     */
    @javax.annotation.Nullable
    public String getImportType() {
        return importType;
    }

    public void setImportType(@javax.annotation.Nullable String importType) {
        this.importType = importType;
    }

    public DbtSearchResponse authorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * Get authorName
     *
     * @return authorName
     */
    @javax.annotation.Nullable
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbtSearchResponse dbtSearchResponse = (DbtSearchResponse) o;
        return Objects.equals(
                        this.dbtConnectionIdentifier, dbtSearchResponse.dbtConnectionIdentifier)
                && Objects.equals(this.projectName, dbtSearchResponse.projectName)
                && Objects.equals(this.connectionId, dbtSearchResponse.connectionId)
                && Objects.equals(this.connectionName, dbtSearchResponse.connectionName)
                && Objects.equals(this.cdwDatabase, dbtSearchResponse.cdwDatabase)
                && Objects.equals(this.importType, dbtSearchResponse.importType)
                && Objects.equals(this.authorName, dbtSearchResponse.authorName);
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
                dbtConnectionIdentifier,
                projectName,
                connectionId,
                connectionName,
                cdwDatabase,
                importType,
                authorName);
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
        sb.append("class DbtSearchResponse {\n");
        sb.append("    dbtConnectionIdentifier: ")
                .append(toIndentedString(dbtConnectionIdentifier))
                .append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    cdwDatabase: ").append(toIndentedString(cdwDatabase)).append("\n");
        sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
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
        openapiFields.add("project_name");
        openapiFields.add("connection_id");
        openapiFields.add("connection_name");
        openapiFields.add("cdw_database");
        openapiFields.add("import_type");
        openapiFields.add("author_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DbtSearchResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DbtSearchResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DbtSearchResponse is not found in the"
                                        + " empty JSON string",
                                DbtSearchResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DbtSearchResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DbtSearchResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("dbt_connection_identifier") != null
                        && !jsonObj.get("dbt_connection_identifier").isJsonNull())
                && !jsonObj.get("dbt_connection_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dbt_connection_identifier` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("dbt_connection_identifier").toString()));
        }
        if ((jsonObj.get("project_name") != null && !jsonObj.get("project_name").isJsonNull())
                && !jsonObj.get("project_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `project_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("project_name").toString()));
        }
        if ((jsonObj.get("connection_id") != null && !jsonObj.get("connection_id").isJsonNull())
                && !jsonObj.get("connection_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("connection_id").toString()));
        }
        if ((jsonObj.get("connection_name") != null && !jsonObj.get("connection_name").isJsonNull())
                && !jsonObj.get("connection_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connection_name").toString()));
        }
        if ((jsonObj.get("cdw_database") != null && !jsonObj.get("cdw_database").isJsonNull())
                && !jsonObj.get("cdw_database").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cdw_database` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("cdw_database").toString()));
        }
        if ((jsonObj.get("import_type") != null && !jsonObj.get("import_type").isJsonNull())
                && !jsonObj.get("import_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `import_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("import_type").toString()));
        }
        if ((jsonObj.get("author_name") != null && !jsonObj.get("author_name").isJsonNull())
                && !jsonObj.get("author_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DbtSearchResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DbtSearchResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DbtSearchResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DbtSearchResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DbtSearchResponse>() {
                        @Override
                        public void write(JsonWriter out, DbtSearchResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DbtSearchResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DbtSearchResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DbtSearchResponse
     * @throws IOException if the JSON string is invalid with respect to DbtSearchResponse
     */
    public static DbtSearchResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DbtSearchResponse.class);
    }

    /**
     * Convert an instance of DbtSearchResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
