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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** FetchLiveboardSqlQueryRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchLiveboardSqlQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nonnull
    private String metadataIdentifier;

    public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS =
            "visualization_identifiers";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> visualizationIdentifiers;

    public FetchLiveboardSqlQueryRequest() {}

    public FetchLiveboardSqlQueryRequest metadataIdentifier(
            @javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * ID or name of the Liveboard.
     *
     * @return metadataIdentifier
     */
    @javax.annotation.Nonnull
    public String getMetadataIdentifier() {
        return metadataIdentifier;
    }

    public void setMetadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
    }

    public FetchLiveboardSqlQueryRequest visualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
        return this;
    }

    public FetchLiveboardSqlQueryRequest addVisualizationIdentifiersItem(
            String visualizationIdentifiersItem) {
        if (this.visualizationIdentifiers == null) {
            this.visualizationIdentifiers = new ArrayList<>();
        }
        this.visualizationIdentifiers.add(visualizationIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of visualizations.
     *
     * @return visualizationIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getVisualizationIdentifiers() {
        return visualizationIdentifiers;
    }

    public void setVisualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchLiveboardSqlQueryRequest fetchLiveboardSqlQueryRequest =
                (FetchLiveboardSqlQueryRequest) o;
        return Objects.equals(
                        this.metadataIdentifier, fetchLiveboardSqlQueryRequest.metadataIdentifier)
                && Objects.equals(
                        this.visualizationIdentifiers,
                        fetchLiveboardSqlQueryRequest.visualizationIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataIdentifier, visualizationIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchLiveboardSqlQueryRequest {\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    visualizationIdentifiers: ")
                .append(toIndentedString(visualizationIdentifiers))
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
        openapiFields.add("metadata_identifier");
        openapiFields.add("visualization_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     FetchLiveboardSqlQueryRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchLiveboardSqlQueryRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FetchLiveboardSqlQueryRequest is not"
                                        + " found in the empty JSON string",
                                FetchLiveboardSqlQueryRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!FetchLiveboardSqlQueryRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FetchLiveboardSqlQueryRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FetchLiveboardSqlQueryRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("metadata_identifier").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("visualization_identifiers") != null
                && !jsonObj.get("visualization_identifiers").isJsonNull()
                && !jsonObj.get("visualization_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchLiveboardSqlQueryRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FetchLiveboardSqlQueryRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchLiveboardSqlQueryRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(FetchLiveboardSqlQueryRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchLiveboardSqlQueryRequest>() {
                        @Override
                        public void write(JsonWriter out, FetchLiveboardSqlQueryRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchLiveboardSqlQueryRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchLiveboardSqlQueryRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchLiveboardSqlQueryRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     FetchLiveboardSqlQueryRequest
     */
    public static FetchLiveboardSqlQueryRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FetchLiveboardSqlQueryRequest.class);
    }

    /**
     * Convert an instance of FetchLiveboardSqlQueryRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
