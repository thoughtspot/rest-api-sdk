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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** SearchSemanticIntegrationsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchSemanticIntegrationsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SORT_OPTIONS = "sort_options";

    @SerializedName(SERIALIZED_NAME_SORT_OPTIONS)
    @javax.annotation.Nullable
    private SemanticIntegrationSortOptions sortOptions;

    public static final String SERIALIZED_NAME_RECORD_OFFSET = "record_offset";

    @SerializedName(SERIALIZED_NAME_RECORD_OFFSET)
    @javax.annotation.Nullable
    private Integer recordOffset = 0;

    public static final String SERIALIZED_NAME_RECORD_SIZE = "record_size";

    @SerializedName(SERIALIZED_NAME_RECORD_SIZE)
    @javax.annotation.Nullable
    private Integer recordSize = 10;

    public static final String SERIALIZED_NAME_PATTERN = "pattern";

    @SerializedName(SERIALIZED_NAME_PATTERN)
    @javax.annotation.Nullable
    private String pattern;

    public static final String SERIALIZED_NAME_AUTHOR_IDENTIFIERS = "author_identifiers";

    @SerializedName(SERIALIZED_NAME_AUTHOR_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> authorIdentifiers;

    public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIERS = "connection_identifiers";

    @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> connectionIdentifiers;

    public SearchSemanticIntegrationsRequest() {}

    public SearchSemanticIntegrationsRequest sortOptions(
            @javax.annotation.Nullable SemanticIntegrationSortOptions sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    /**
     * Sort options for the search results.
     *
     * @return sortOptions
     */
    @javax.annotation.Nullable
    public SemanticIntegrationSortOptions getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(
            @javax.annotation.Nullable SemanticIntegrationSortOptions sortOptions) {
        this.sortOptions = sortOptions;
    }

    public SearchSemanticIntegrationsRequest recordOffset(
            @javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
        return this;
    }

    /**
     * Number of records to skip for pagination. Minimum value is 0.
     *
     * @return recordOffset
     */
    @javax.annotation.Nullable
    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(@javax.annotation.Nullable Integer recordOffset) {
        this.recordOffset = recordOffset;
    }

    public SearchSemanticIntegrationsRequest recordSize(
            @javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
        return this;
    }

    /**
     * Maximum number of records to return. Use 0 to return all records (no pagination).
     *
     * @return recordSize
     */
    @javax.annotation.Nullable
    public Integer getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(@javax.annotation.Nullable Integer recordSize) {
        this.recordSize = recordSize;
    }

    public SearchSemanticIntegrationsRequest pattern(@javax.annotation.Nullable String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Name filter substring to narrow search results.
     *
     * @return pattern
     */
    @javax.annotation.Nullable
    public String getPattern() {
        return pattern;
    }

    public void setPattern(@javax.annotation.Nullable String pattern) {
        this.pattern = pattern;
    }

    public SearchSemanticIntegrationsRequest authorIdentifiers(
            @javax.annotation.Nullable List<String> authorIdentifiers) {
        this.authorIdentifiers = authorIdentifiers;
        return this;
    }

    public SearchSemanticIntegrationsRequest addAuthorIdentifiersItem(
            String authorIdentifiersItem) {
        if (this.authorIdentifiers == null) {
            this.authorIdentifiers = new ArrayList<>();
        }
        this.authorIdentifiers.add(authorIdentifiersItem);
        return this;
    }

    /**
     * Filter by author IDs or names who created the integrations.
     *
     * @return authorIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getAuthorIdentifiers() {
        return authorIdentifiers;
    }

    public void setAuthorIdentifiers(@javax.annotation.Nullable List<String> authorIdentifiers) {
        this.authorIdentifiers = authorIdentifiers;
    }

    public SearchSemanticIntegrationsRequest connectionIdentifiers(
            @javax.annotation.Nullable List<String> connectionIdentifiers) {
        this.connectionIdentifiers = connectionIdentifiers;
        return this;
    }

    public SearchSemanticIntegrationsRequest addConnectionIdentifiersItem(
            String connectionIdentifiersItem) {
        if (this.connectionIdentifiers == null) {
            this.connectionIdentifiers = new ArrayList<>();
        }
        this.connectionIdentifiers.add(connectionIdentifiersItem);
        return this;
    }

    /**
     * Filter by connection IDs or names associated with the integrations.
     *
     * @return connectionIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getConnectionIdentifiers() {
        return connectionIdentifiers;
    }

    public void setConnectionIdentifiers(
            @javax.annotation.Nullable List<String> connectionIdentifiers) {
        this.connectionIdentifiers = connectionIdentifiers;
    }

    /**
     * A container for additional, undeclared properties. This is a holder for any undeclared
     * properties as specified with the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value. If the property
     * does not already exist, create it otherwise replace it.
     *
     * @param key name of the property
     * @param value value of the property
     * @return the SearchSemanticIntegrationsRequest instance itself
     */
    public SearchSemanticIntegrationsRequest putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     *
     * @return a map of objects
     */
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     *
     * @param key name of the property
     * @return an object
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchSemanticIntegrationsRequest searchSemanticIntegrationsRequest =
                (SearchSemanticIntegrationsRequest) o;
        return Objects.equals(this.sortOptions, searchSemanticIntegrationsRequest.sortOptions)
                && Objects.equals(this.recordOffset, searchSemanticIntegrationsRequest.recordOffset)
                && Objects.equals(this.recordSize, searchSemanticIntegrationsRequest.recordSize)
                && Objects.equals(this.pattern, searchSemanticIntegrationsRequest.pattern)
                && Objects.equals(
                        this.authorIdentifiers, searchSemanticIntegrationsRequest.authorIdentifiers)
                && Objects.equals(
                        this.connectionIdentifiers,
                        searchSemanticIntegrationsRequest.connectionIdentifiers)
                && Objects.equals(
                        this.additionalProperties,
                        searchSemanticIntegrationsRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sortOptions,
                recordOffset,
                recordSize,
                pattern,
                authorIdentifiers,
                connectionIdentifiers,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSemanticIntegrationsRequest {\n");
        sb.append("    sortOptions: ").append(toIndentedString(sortOptions)).append("\n");
        sb.append("    recordOffset: ").append(toIndentedString(recordOffset)).append("\n");
        sb.append("    recordSize: ").append(toIndentedString(recordSize)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    authorIdentifiers: ")
                .append(toIndentedString(authorIdentifiers))
                .append("\n");
        sb.append("    connectionIdentifiers: ")
                .append(toIndentedString(connectionIdentifiers))
                .append("\n");
        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
        openapiFields.add("sort_options");
        openapiFields.add("record_offset");
        openapiFields.add("record_size");
        openapiFields.add("pattern");
        openapiFields.add("author_identifiers");
        openapiFields.add("connection_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SearchSemanticIntegrationsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchSemanticIntegrationsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SearchSemanticIntegrationsRequest is"
                                        + " not found in the empty JSON string",
                                SearchSemanticIntegrationsRequest.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `sort_options`
        if (jsonObj.get("sort_options") != null && !jsonObj.get("sort_options").isJsonNull()) {
            SemanticIntegrationSortOptions.validateJsonElement(jsonObj.get("sort_options"));
        }
        if ((jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonNull())
                && !jsonObj.get("pattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `pattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("pattern").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("author_identifiers") != null
                && !jsonObj.get("author_identifiers").isJsonNull()
                && !jsonObj.get("author_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_identifiers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("connection_identifiers") != null
                && !jsonObj.get("connection_identifiers").isJsonNull()
                && !jsonObj.get("connection_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connection_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchSemanticIntegrationsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SearchSemanticIntegrationsRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchSemanticIntegrationsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SearchSemanticIntegrationsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchSemanticIntegrationsRequest>() {
                        @Override
                        public void write(JsonWriter out, SearchSemanticIntegrationsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            obj.remove("additionalProperties");
                            // serialize additional properties
                            if (value.getAdditionalProperties() != null) {
                                for (Map.Entry<String, Object> entry :
                                        value.getAdditionalProperties().entrySet()) {
                                    if (entry.getValue() instanceof String)
                                        obj.addProperty(entry.getKey(), (String) entry.getValue());
                                    else if (entry.getValue() instanceof Number)
                                        obj.addProperty(entry.getKey(), (Number) entry.getValue());
                                    else if (entry.getValue() instanceof Boolean)
                                        obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                                    else if (entry.getValue() instanceof Character)
                                        obj.addProperty(
                                                entry.getKey(), (Character) entry.getValue());
                                    else {
                                        JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                                        if (jsonElement.isJsonArray()) {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                                        } else {
                                            obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                                        }
                                    }
                                }
                            }
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchSemanticIntegrationsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SearchSemanticIntegrationsRequest instance =
                                    thisAdapter.fromJsonTree(jsonObj);
                            for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
                                if (!openapiFields.contains(entry.getKey())) {
                                    if (entry.getValue().isJsonPrimitive()) { // primitive type
                                        if (entry.getValue().getAsJsonPrimitive().isString())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsString());
                                        else if (entry.getValue().getAsJsonPrimitive().isNumber())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsNumber());
                                        else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(),
                                                    entry.getValue().getAsBoolean());
                                        else
                                            throw new IllegalArgumentException(
                                                    String.format(
                                                            "The field `%s` has unknown primitive"
                                                                    + " type. Value: %s",
                                                            entry.getKey(),
                                                            entry.getValue().toString()));
                                    } else if (entry.getValue().isJsonArray()) {
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), List.class));
                                    } else { // JSON object
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), HashMap.class));
                                    }
                                }
                            }
                            return instance;
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SearchSemanticIntegrationsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchSemanticIntegrationsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SearchSemanticIntegrationsRequest
     */
    public static SearchSemanticIntegrationsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SearchSemanticIntegrationsRequest.class);
    }

    /**
     * Convert an instance of SearchSemanticIntegrationsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
