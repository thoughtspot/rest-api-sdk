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

/** CreateCustomActionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateCustomActionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_ACTION_DETAILS = "action_details";

    @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
    @javax.annotation.Nonnull
    private ActionDetailsInputCreate actionDetails;

    public static final String SERIALIZED_NAME_ASSOCIATE_METADATA = "associate_metadata";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_METADATA)
    @javax.annotation.Nullable
    private List<AssociateMetadataInputCreate> associateMetadata;

    public static final String SERIALIZED_NAME_DEFAULT_ACTION_CONFIG = "default_action_config";

    @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION_CONFIG)
    @javax.annotation.Nullable
    private DefaultActionConfigInputCreate defaultActionConfig;

    public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";

    @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> groupIdentifiers;

    public CreateCustomActionRequest() {}

    public CreateCustomActionRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the custom action. The custom action name must be unique.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public CreateCustomActionRequest actionDetails(
            @javax.annotation.Nonnull ActionDetailsInputCreate actionDetails) {
        this.actionDetails = actionDetails;
        return this;
    }

    /**
     * Action details includes &#x60;Type&#x60; and Configuration data for Custom Actions, either
     * Callback or URL is required.
     *
     * @return actionDetails
     */
    @javax.annotation.Nonnull
    public ActionDetailsInputCreate getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(@javax.annotation.Nonnull ActionDetailsInputCreate actionDetails) {
        this.actionDetails = actionDetails;
    }

    public CreateCustomActionRequest associateMetadata(
            @javax.annotation.Nullable List<AssociateMetadataInputCreate> associateMetadata) {
        this.associateMetadata = associateMetadata;
        return this;
    }

    public CreateCustomActionRequest addAssociateMetadataItem(
            AssociateMetadataInputCreate associateMetadataItem) {
        if (this.associateMetadata == null) {
            this.associateMetadata = new ArrayList<>();
        }
        this.associateMetadata.add(associateMetadataItem);
        return this;
    }

    /**
     * Metadata objects to which the custom action needs to be associated.
     *
     * @return associateMetadata
     */
    @javax.annotation.Nullable
    public List<AssociateMetadataInputCreate> getAssociateMetadata() {
        return associateMetadata;
    }

    public void setAssociateMetadata(
            @javax.annotation.Nullable List<AssociateMetadataInputCreate> associateMetadata) {
        this.associateMetadata = associateMetadata;
    }

    public CreateCustomActionRequest defaultActionConfig(
            @javax.annotation.Nullable DefaultActionConfigInputCreate defaultActionConfig) {
        this.defaultActionConfig = defaultActionConfig;
        return this;
    }

    /**
     * Default Custom action configuration. This includes if the custom action is available on all
     * visualizations. By default, a custom action is added to all visualizations and Answers.
     *
     * @return defaultActionConfig
     */
    @javax.annotation.Nullable
    public DefaultActionConfigInputCreate getDefaultActionConfig() {
        return defaultActionConfig;
    }

    public void setDefaultActionConfig(
            @javax.annotation.Nullable DefaultActionConfigInputCreate defaultActionConfig) {
        this.defaultActionConfig = defaultActionConfig;
    }

    public CreateCustomActionRequest groupIdentifiers(
            @javax.annotation.Nullable List<String> groupIdentifiers) {
        this.groupIdentifiers = groupIdentifiers;
        return this;
    }

    public CreateCustomActionRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
        if (this.groupIdentifiers == null) {
            this.groupIdentifiers = new ArrayList<>();
        }
        this.groupIdentifiers.add(groupIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of the groups that can view and access the custom action.
     *
     * @return groupIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getGroupIdentifiers() {
        return groupIdentifiers;
    }

    public void setGroupIdentifiers(@javax.annotation.Nullable List<String> groupIdentifiers) {
        this.groupIdentifiers = groupIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomActionRequest createCustomActionRequest = (CreateCustomActionRequest) o;
        return Objects.equals(this.name, createCustomActionRequest.name)
                && Objects.equals(this.actionDetails, createCustomActionRequest.actionDetails)
                && Objects.equals(
                        this.associateMetadata, createCustomActionRequest.associateMetadata)
                && Objects.equals(
                        this.defaultActionConfig, createCustomActionRequest.defaultActionConfig)
                && Objects.equals(
                        this.groupIdentifiers, createCustomActionRequest.groupIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, actionDetails, associateMetadata, defaultActionConfig, groupIdentifiers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomActionRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
        sb.append("    associateMetadata: ")
                .append(toIndentedString(associateMetadata))
                .append("\n");
        sb.append("    defaultActionConfig: ")
                .append(toIndentedString(defaultActionConfig))
                .append("\n");
        sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("action_details");
        openapiFields.add("associate_metadata");
        openapiFields.add("default_action_config");
        openapiFields.add("group_identifiers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("action_details");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateCustomActionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateCustomActionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateCustomActionRequest is not"
                                        + " found in the empty JSON string",
                                CreateCustomActionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateCustomActionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateCustomActionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateCustomActionRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        // validate the required field `action_details`
        ActionDetailsInputCreate.validateJsonElement(jsonObj.get("action_details"));
        if (jsonObj.get("associate_metadata") != null
                && !jsonObj.get("associate_metadata").isJsonNull()) {
            JsonArray jsonArrayassociateMetadata = jsonObj.getAsJsonArray("associate_metadata");
            if (jsonArrayassociateMetadata != null) {
                // ensure the json data is an array
                if (!jsonObj.get("associate_metadata").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `associate_metadata` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("associate_metadata").toString()));
                }

                // validate the optional field `associate_metadata` (array)
                for (int i = 0; i < jsonArrayassociateMetadata.size(); i++) {
                    AssociateMetadataInputCreate.validateJsonElement(
                            jsonArrayassociateMetadata.get(i));
                }
                ;
            }
        }
        // validate the optional field `default_action_config`
        if (jsonObj.get("default_action_config") != null
                && !jsonObj.get("default_action_config").isJsonNull()) {
            DefaultActionConfigInputCreate.validateJsonElement(
                    jsonObj.get("default_action_config"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("group_identifiers") != null
                && !jsonObj.get("group_identifiers").isJsonNull()
                && !jsonObj.get("group_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `group_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("group_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateCustomActionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateCustomActionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateCustomActionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateCustomActionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateCustomActionRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateCustomActionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateCustomActionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateCustomActionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateCustomActionRequest
     * @throws IOException if the JSON string is invalid with respect to CreateCustomActionRequest
     */
    public static CreateCustomActionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateCustomActionRequest.class);
    }

    /**
     * Convert an instance of CreateCustomActionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
