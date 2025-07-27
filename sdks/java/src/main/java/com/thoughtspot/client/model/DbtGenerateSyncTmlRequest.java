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
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** DbtGenerateSyncTmlRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DbtGenerateSyncTmlRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER =
            "dbt_connection_identifier";

    @SerializedName(SERIALIZED_NAME_DBT_CONNECTION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String dbtConnectionIdentifier;

    public static final String SERIALIZED_NAME_FILE_CONTENT = "file_content";

    @SerializedName(SERIALIZED_NAME_FILE_CONTENT)
    @javax.annotation.Nullable
    private File fileContent;

    public DbtGenerateSyncTmlRequest() {}

    public DbtGenerateSyncTmlRequest dbtConnectionIdentifier(
            @javax.annotation.Nonnull String dbtConnectionIdentifier) {
        this.dbtConnectionIdentifier = dbtConnectionIdentifier;
        return this;
    }

    /**
     * Unique ID of the DBT connection.
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

    public DbtGenerateSyncTmlRequest fileContent(@javax.annotation.Nullable File fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the
     * connection was created with import_type ‘ZIP_FILE’
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
        DbtGenerateSyncTmlRequest dbtGenerateSyncTmlRequest = (DbtGenerateSyncTmlRequest) o;
        return Objects.equals(
                        this.dbtConnectionIdentifier,
                        dbtGenerateSyncTmlRequest.dbtConnectionIdentifier)
                && Objects.equals(this.fileContent, dbtGenerateSyncTmlRequest.fileContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbtConnectionIdentifier, fileContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbtGenerateSyncTmlRequest {\n");
        sb.append("    dbtConnectionIdentifier: ")
                .append(toIndentedString(dbtConnectionIdentifier))
                .append("\n");
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
        openapiFields.add("file_content");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("dbt_connection_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DbtGenerateSyncTmlRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DbtGenerateSyncTmlRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DbtGenerateSyncTmlRequest is not"
                                        + " found in the empty JSON string",
                                DbtGenerateSyncTmlRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DbtGenerateSyncTmlRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DbtGenerateSyncTmlRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DbtGenerateSyncTmlRequest.openapiRequiredFields) {
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DbtGenerateSyncTmlRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DbtGenerateSyncTmlRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DbtGenerateSyncTmlRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DbtGenerateSyncTmlRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DbtGenerateSyncTmlRequest>() {
                        @Override
                        public void write(JsonWriter out, DbtGenerateSyncTmlRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DbtGenerateSyncTmlRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DbtGenerateSyncTmlRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DbtGenerateSyncTmlRequest
     * @throws IOException if the JSON string is invalid with respect to DbtGenerateSyncTmlRequest
     */
    public static DbtGenerateSyncTmlRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DbtGenerateSyncTmlRequest.class);
    }

    /**
     * Convert an instance of DbtGenerateSyncTmlRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
