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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

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
                        searchCommunicationChannelPreferencesRequest.orgPreferences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterPreferences, orgPreferences);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCommunicationChannelPreferencesRequest {\n");
        sb.append("    clusterPreferences: ")
                .append(toIndentedString(clusterPreferences))
                .append("\n");
        sb.append("    orgPreferences: ").append(toIndentedString(orgPreferences)).append("\n");
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

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SearchCommunicationChannelPreferencesRequest.openapiFields.contains(
                    entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `SearchCommunicationChannelPreferencesRequest` properties."
                                    + " JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SearchCommunicationChannelPreferencesRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
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
