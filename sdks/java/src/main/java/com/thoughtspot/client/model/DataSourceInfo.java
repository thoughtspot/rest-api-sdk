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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A data source descriptor returned by the agent&#39;s &#x60;search_datasets&#x60; tool. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DataSourceInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER = "data_source_identifier";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER)
    @javax.annotation.Nullable
    private String dataSourceIdentifier;

    public static final String SERIALIZED_NAME_DATA_SOURCE_NAME = "data_source_name";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAME)
    @javax.annotation.Nullable
    private String dataSourceName;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";

    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    @javax.annotation.Nullable
    private Float confidence;

    public static final String SERIALIZED_NAME_REASONING = "reasoning";

    @SerializedName(SERIALIZED_NAME_REASONING)
    @javax.annotation.Nullable
    private String reasoning;

    public static final String SERIALIZED_NAME_HEADER = "header";

    @SerializedName(SERIALIZED_NAME_HEADER)
    @javax.annotation.Nullable
    private DataSourceHeader header;

    public static final String SERIALIZED_NAME_RELATED_LIVEBOARD_VISUALIZATIONS =
            "related_liveboard_visualizations";

    @SerializedName(SERIALIZED_NAME_RELATED_LIVEBOARD_VISUALIZATIONS)
    @javax.annotation.Nullable
    private List<Object> relatedLiveboardVisualizations;

    public static final String SERIALIZED_NAME_RELATED_ANSWERS = "related_answers";

    @SerializedName(SERIALIZED_NAME_RELATED_ANSWERS)
    @javax.annotation.Nullable
    private List<Object> relatedAnswers;

    public static final String SERIALIZED_NAME_RELATED_SPOTTER_QUERIES = "related_spotter_queries";

    @SerializedName(SERIALIZED_NAME_RELATED_SPOTTER_QUERIES)
    @javax.annotation.Nullable
    private List<String> relatedSpotterQueries;

    public static final String SERIALIZED_NAME_POPULARITY = "popularity";

    @SerializedName(SERIALIZED_NAME_POPULARITY)
    @javax.annotation.Nullable
    private DataSourcePopularity popularity;

    public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";

    @SerializedName(SERIALIZED_NAME_USER_USAGE)
    @javax.annotation.Nullable
    private DataSourceUserUsage userUsage;

    public DataSourceInfo() {}

    public DataSourceInfo dataSourceIdentifier(
            @javax.annotation.Nullable String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
        return this;
    }

    /**
     * Unique identifier of the data source (mirrors &#x60;header.guid&#x60;).
     *
     * @return dataSourceIdentifier
     */
    @javax.annotation.Nullable
    public String getDataSourceIdentifier() {
        return dataSourceIdentifier;
    }

    public void setDataSourceIdentifier(@javax.annotation.Nullable String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
    }

    public DataSourceInfo dataSourceName(@javax.annotation.Nullable String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * Display name of the data source (mirrors &#x60;header.display_name&#x60;).
     *
     * @return dataSourceName
     */
    @javax.annotation.Nullable
    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(@javax.annotation.Nullable String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public DataSourceInfo description(@javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional description of the data source.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public DataSourceInfo confidence(@javax.annotation.Nullable Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Tool-reported confidence that this data source matches the query, in &#x60;[0, 1]&#x60;.
     *
     * @return confidence
     */
    @javax.annotation.Nullable
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(@javax.annotation.Nullable Float confidence) {
        this.confidence = confidence;
    }

    public DataSourceInfo reasoning(@javax.annotation.Nullable String reasoning) {
        this.reasoning = reasoning;
        return this;
    }

    /**
     * LLM reasoning describing why the data source was selected.
     *
     * @return reasoning
     */
    @javax.annotation.Nullable
    public String getReasoning() {
        return reasoning;
    }

    public void setReasoning(@javax.annotation.Nullable String reasoning) {
        this.reasoning = reasoning;
    }

    public DataSourceInfo header(@javax.annotation.Nullable DataSourceHeader header) {
        this.header = header;
        return this;
    }

    /**
     * Get header
     *
     * @return header
     */
    @javax.annotation.Nullable
    public DataSourceHeader getHeader() {
        return header;
    }

    public void setHeader(@javax.annotation.Nullable DataSourceHeader header) {
        this.header = header;
    }

    public DataSourceInfo relatedLiveboardVisualizations(
            @javax.annotation.Nullable List<Object> relatedLiveboardVisualizations) {
        this.relatedLiveboardVisualizations = relatedLiveboardVisualizations;
        return this;
    }

    public DataSourceInfo addRelatedLiveboardVisualizationsItem(
            Object relatedLiveboardVisualizationsItem) {
        if (this.relatedLiveboardVisualizations == null) {
            this.relatedLiveboardVisualizations = new ArrayList<>();
        }
        this.relatedLiveboardVisualizations.add(relatedLiveboardVisualizationsItem);
        return this;
    }

    /**
     * Related liveboard visualizations for this data source. Open-ended JSON shape driven by the
     * underlying proto.
     *
     * @return relatedLiveboardVisualizations
     */
    @javax.annotation.Nullable
    public List<Object> getRelatedLiveboardVisualizations() {
        return relatedLiveboardVisualizations;
    }

    public void setRelatedLiveboardVisualizations(
            @javax.annotation.Nullable List<Object> relatedLiveboardVisualizations) {
        this.relatedLiveboardVisualizations = relatedLiveboardVisualizations;
    }

    public DataSourceInfo relatedAnswers(@javax.annotation.Nullable List<Object> relatedAnswers) {
        this.relatedAnswers = relatedAnswers;
        return this;
    }

    public DataSourceInfo addRelatedAnswersItem(Object relatedAnswersItem) {
        if (this.relatedAnswers == null) {
            this.relatedAnswers = new ArrayList<>();
        }
        this.relatedAnswers.add(relatedAnswersItem);
        return this;
    }

    /**
     * Related saved answers for this data source. Open-ended JSON shape driven by the underlying
     * proto.
     *
     * @return relatedAnswers
     */
    @javax.annotation.Nullable
    public List<Object> getRelatedAnswers() {
        return relatedAnswers;
    }

    public void setRelatedAnswers(@javax.annotation.Nullable List<Object> relatedAnswers) {
        this.relatedAnswers = relatedAnswers;
    }

    public DataSourceInfo relatedSpotterQueries(
            @javax.annotation.Nullable List<String> relatedSpotterQueries) {
        this.relatedSpotterQueries = relatedSpotterQueries;
        return this;
    }

    public DataSourceInfo addRelatedSpotterQueriesItem(String relatedSpotterQueriesItem) {
        if (this.relatedSpotterQueries == null) {
            this.relatedSpotterQueries = new ArrayList<>();
        }
        this.relatedSpotterQueries.add(relatedSpotterQueriesItem);
        return this;
    }

    /**
     * Related Spotter queries previously run against this data source. Truncated to a small upper
     * bound by the tool.
     *
     * @return relatedSpotterQueries
     */
    @javax.annotation.Nullable
    public List<String> getRelatedSpotterQueries() {
        return relatedSpotterQueries;
    }

    public void setRelatedSpotterQueries(
            @javax.annotation.Nullable List<String> relatedSpotterQueries) {
        this.relatedSpotterQueries = relatedSpotterQueries;
    }

    public DataSourceInfo popularity(@javax.annotation.Nullable DataSourcePopularity popularity) {
        this.popularity = popularity;
        return this;
    }

    /**
     * Get popularity
     *
     * @return popularity
     */
    @javax.annotation.Nullable
    public DataSourcePopularity getPopularity() {
        return popularity;
    }

    public void setPopularity(@javax.annotation.Nullable DataSourcePopularity popularity) {
        this.popularity = popularity;
    }

    public DataSourceInfo userUsage(@javax.annotation.Nullable DataSourceUserUsage userUsage) {
        this.userUsage = userUsage;
        return this;
    }

    /**
     * Get userUsage
     *
     * @return userUsage
     */
    @javax.annotation.Nullable
    public DataSourceUserUsage getUserUsage() {
        return userUsage;
    }

    public void setUserUsage(@javax.annotation.Nullable DataSourceUserUsage userUsage) {
        this.userUsage = userUsage;
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
     * @return the DataSourceInfo instance itself
     */
    public DataSourceInfo putAdditionalProperty(String key, Object value) {
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
        DataSourceInfo dataSourceInfo = (DataSourceInfo) o;
        return Objects.equals(this.dataSourceIdentifier, dataSourceInfo.dataSourceIdentifier)
                && Objects.equals(this.dataSourceName, dataSourceInfo.dataSourceName)
                && Objects.equals(this.description, dataSourceInfo.description)
                && Objects.equals(this.confidence, dataSourceInfo.confidence)
                && Objects.equals(this.reasoning, dataSourceInfo.reasoning)
                && Objects.equals(this.header, dataSourceInfo.header)
                && Objects.equals(
                        this.relatedLiveboardVisualizations,
                        dataSourceInfo.relatedLiveboardVisualizations)
                && Objects.equals(this.relatedAnswers, dataSourceInfo.relatedAnswers)
                && Objects.equals(this.relatedSpotterQueries, dataSourceInfo.relatedSpotterQueries)
                && Objects.equals(this.popularity, dataSourceInfo.popularity)
                && Objects.equals(this.userUsage, dataSourceInfo.userUsage)
                && Objects.equals(this.additionalProperties, dataSourceInfo.additionalProperties);
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
                dataSourceIdentifier,
                dataSourceName,
                description,
                confidence,
                reasoning,
                header,
                relatedLiveboardVisualizations,
                relatedAnswers,
                relatedSpotterQueries,
                popularity,
                userUsage,
                additionalProperties);
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
        sb.append("class DataSourceInfo {\n");
        sb.append("    dataSourceIdentifier: ")
                .append(toIndentedString(dataSourceIdentifier))
                .append("\n");
        sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    relatedLiveboardVisualizations: ")
                .append(toIndentedString(relatedLiveboardVisualizations))
                .append("\n");
        sb.append("    relatedAnswers: ").append(toIndentedString(relatedAnswers)).append("\n");
        sb.append("    relatedSpotterQueries: ")
                .append(toIndentedString(relatedSpotterQueries))
                .append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
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
        openapiFields.add("data_source_identifier");
        openapiFields.add("data_source_name");
        openapiFields.add("description");
        openapiFields.add("confidence");
        openapiFields.add("reasoning");
        openapiFields.add("header");
        openapiFields.add("related_liveboard_visualizations");
        openapiFields.add("related_answers");
        openapiFields.add("related_spotter_queries");
        openapiFields.add("popularity");
        openapiFields.add("user_usage");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DataSourceInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DataSourceInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DataSourceInfo is not found in the"
                                        + " empty JSON string",
                                DataSourceInfo.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("data_source_identifier") != null
                        && !jsonObj.get("data_source_identifier").isJsonNull())
                && !jsonObj.get("data_source_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_source_identifier").toString()));
        }
        if ((jsonObj.get("data_source_name") != null
                        && !jsonObj.get("data_source_name").isJsonNull())
                && !jsonObj.get("data_source_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("data_source_name").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("reasoning") != null && !jsonObj.get("reasoning").isJsonNull())
                && !jsonObj.get("reasoning").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `reasoning` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("reasoning").toString()));
        }
        // validate the optional field `header`
        if (jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) {
            DataSourceHeader.validateJsonElement(jsonObj.get("header"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("related_liveboard_visualizations") != null
                && !jsonObj.get("related_liveboard_visualizations").isJsonNull()
                && !jsonObj.get("related_liveboard_visualizations").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `related_liveboard_visualizations` to be an array"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("related_liveboard_visualizations").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("related_answers") != null
                && !jsonObj.get("related_answers").isJsonNull()
                && !jsonObj.get("related_answers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `related_answers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("related_answers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("related_spotter_queries") != null
                && !jsonObj.get("related_spotter_queries").isJsonNull()
                && !jsonObj.get("related_spotter_queries").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `related_spotter_queries` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("related_spotter_queries").toString()));
        }
        // validate the optional field `popularity`
        if (jsonObj.get("popularity") != null && !jsonObj.get("popularity").isJsonNull()) {
            DataSourcePopularity.validateJsonElement(jsonObj.get("popularity"));
        }
        // validate the optional field `user_usage`
        if (jsonObj.get("user_usage") != null && !jsonObj.get("user_usage").isJsonNull()) {
            DataSourceUserUsage.validateJsonElement(jsonObj.get("user_usage"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DataSourceInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DataSourceInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DataSourceInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DataSourceInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DataSourceInfo>() {
                        @Override
                        public void write(JsonWriter out, DataSourceInfo value) throws IOException {
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
                        public DataSourceInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            DataSourceInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of DataSourceInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DataSourceInfo
     * @throws IOException if the JSON string is invalid with respect to DataSourceInfo
     */
    public static DataSourceInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DataSourceInfo.class);
    }

    /**
     * Convert an instance of DataSourceInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
