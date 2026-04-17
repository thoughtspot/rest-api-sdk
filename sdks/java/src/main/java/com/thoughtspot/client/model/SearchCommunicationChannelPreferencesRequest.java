/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** SearchCommunicationChannelPreferencesRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SearchCommunicationChannelPreferencesRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Gets or Sets clusterPreferences */
    @JsonAdapter(ClusterPreferencesEnum.Adapter.class)
    public enum ClusterPreferencesEnum {
        LIVEBOARD_SCHEDULE("LIVEBOARD_SCHEDULE");

        private String value;

        ClusterPreferencesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ClusterPreferencesEnum fromValue(String value) {
            for (ClusterPreferencesEnum b : ClusterPreferencesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ClusterPreferencesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ClusterPreferencesEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ClusterPreferencesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ClusterPreferencesEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ClusterPreferencesEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CLUSTER_PREFERENCES = "cluster_preferences";

    @SerializedName(SERIALIZED_NAME_CLUSTER_PREFERENCES)
    @javax.annotation.Nullable
    private List<ClusterPreferencesEnum> clusterPreferences;

    public static final String SERIALIZED_NAME_ORG_PREFERENCES = "org_preferences";

    @SerializedName(SERIALIZED_NAME_ORG_PREFERENCES)
    @javax.annotation.Nullable
    private List<OrgPreferenceSearchCriteriaInput> orgPreferences;

    public SearchCommunicationChannelPreferencesRequest() {}

    public SearchCommunicationChannelPreferencesRequest clusterPreferences(
            @javax.annotation.Nullable List<ClusterPreferencesEnum> clusterPreferences) {
        this.clusterPreferences = clusterPreferences;
        return this;
    }

    public SearchCommunicationChannelPreferencesRequest addClusterPreferencesItem(
            ClusterPreferencesEnum clusterPreferencesItem) {
        if (this.clusterPreferences == null) {
            this.clusterPreferences = new ArrayList<>();
        }
        this.clusterPreferences.add(clusterPreferencesItem);
        return this;
    }

    /**
     * Event types to search for in cluster-level preferences.
     *
     * @return clusterPreferences
     */
    @javax.annotation.Nullable
    public List<ClusterPreferencesEnum> getClusterPreferences() {
        return clusterPreferences;
    }

    public void setClusterPreferences(
            @javax.annotation.Nullable List<ClusterPreferencesEnum> clusterPreferences) {
        this.clusterPreferences = clusterPreferences;
    }

    public SearchCommunicationChannelPreferencesRequest orgPreferences(
            @javax.annotation.Nullable List<OrgPreferenceSearchCriteriaInput> orgPreferences) {
        this.orgPreferences = orgPreferences;
        return this;
    }

    public SearchCommunicationChannelPreferencesRequest addOrgPreferencesItem(
            OrgPreferenceSearchCriteriaInput orgPreferencesItem) {
        if (this.orgPreferences == null) {
            this.orgPreferences = new ArrayList<>();
        }
        this.orgPreferences.add(orgPreferencesItem);
        return this;
    }

    /**
     * Org-specific search criteria.
     *
     * @return orgPreferences
     */
    @javax.annotation.Nullable
    public List<OrgPreferenceSearchCriteriaInput> getOrgPreferences() {
        return orgPreferences;
    }

    public void setOrgPreferences(
            @javax.annotation.Nullable List<OrgPreferenceSearchCriteriaInput> orgPreferences) {
        this.orgPreferences = orgPreferences;
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
     * @return the SearchCommunicationChannelPreferencesRequest instance itself
     */
    public SearchCommunicationChannelPreferencesRequest putAdditionalProperty(
            String key, Object value) {
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
        SearchCommunicationChannelPreferencesRequest searchCommunicationChannelPreferencesRequest =
                (SearchCommunicationChannelPreferencesRequest) o;
        return Objects.equals(
                        this.clusterPreferences,
                        searchCommunicationChannelPreferencesRequest.clusterPreferences)
                && Objects.equals(
                        this.orgPreferences,
                        searchCommunicationChannelPreferencesRequest.orgPreferences)
                && Objects.equals(
                        this.additionalProperties,
                        searchCommunicationChannelPreferencesRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterPreferences, orgPreferences, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCommunicationChannelPreferencesRequest {\n");
        sb.append("    clusterPreferences: ")
                .append(toIndentedString(clusterPreferences))
                .append("\n");
        sb.append("    orgPreferences: ").append(toIndentedString(orgPreferences)).append("\n");
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
        openapiFields.add("cluster_preferences");
        openapiFields.add("org_preferences");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SearchCommunicationChannelPreferencesRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SearchCommunicationChannelPreferencesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " SearchCommunicationChannelPreferencesRequest is not found"
                                    + " in the empty JSON string",
                                SearchCommunicationChannelPreferencesRequest.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("cluster_preferences") != null
                && !jsonObj.get("cluster_preferences").isJsonNull()
                && !jsonObj.get("cluster_preferences").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cluster_preferences` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("cluster_preferences").toString()));
        }
        if (jsonObj.get("org_preferences") != null
                && !jsonObj.get("org_preferences").isJsonNull()) {
            JsonArray jsonArrayorgPreferences = jsonObj.getAsJsonArray("org_preferences");
            if (jsonArrayorgPreferences != null) {
                // ensure the json data is an array
                if (!jsonObj.get("org_preferences").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `org_preferences` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("org_preferences").toString()));
                }

                // validate the optional field `org_preferences` (array)
                for (int i = 0; i < jsonArrayorgPreferences.size(); i++) {
                    OrgPreferenceSearchCriteriaInput.validateJsonElement(
                            jsonArrayorgPreferences.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SearchCommunicationChannelPreferencesRequest.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'SearchCommunicationChannelPreferencesRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SearchCommunicationChannelPreferencesRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(SearchCommunicationChannelPreferencesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SearchCommunicationChannelPreferencesRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, SearchCommunicationChannelPreferencesRequest value)
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
                        public SearchCommunicationChannelPreferencesRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SearchCommunicationChannelPreferencesRequest instance =
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
     * Create an instance of SearchCommunicationChannelPreferencesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SearchCommunicationChannelPreferencesRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SearchCommunicationChannelPreferencesRequest
     */
    public static SearchCommunicationChannelPreferencesRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, SearchCommunicationChannelPreferencesRequest.class);
    }

    /**
     * Convert an instance of SearchCommunicationChannelPreferencesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
