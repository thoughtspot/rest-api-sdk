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

/** UpdateCustomActionRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateCustomActionRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTION_DETAILS = "action_details";

    @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
    @javax.annotation.Nullable
    private ActionDetailsInput actionDetails;

    public static final String SERIALIZED_NAME_ASSOCIATE_METADATA = "associate_metadata";

    @SerializedName(SERIALIZED_NAME_ASSOCIATE_METADATA)
    @javax.annotation.Nullable
    private List<AssociateMetadataInput> associateMetadata;

    public static final String SERIALIZED_NAME_DEFAULT_ACTION_CONFIG = "default_action_config";

    @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION_CONFIG)
    @javax.annotation.Nullable
    private DefaultActionConfigInput defaultActionConfig;

    public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";

    @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> groupIdentifiers;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    /** Type of update operation. Default operation type is ADD */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE");

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OperationEnum fromValue(String value) {
            for (OperationEnum b : OperationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OperationEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OperationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OperationEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OperationEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OPERATION = "operation";

    @SerializedName(SERIALIZED_NAME_OPERATION)
    @javax.annotation.Nullable
    private OperationEnum operation = OperationEnum.ADD;

    public UpdateCustomActionRequest() {}

    public UpdateCustomActionRequest actionDetails(
            @javax.annotation.Nullable ActionDetailsInput actionDetails) {
        this.actionDetails = actionDetails;
        return this;
    }

    /**
     * Action details includes &#x60;Type&#x60; and Configuration for Custom Actions, either
     * Callback or URL is required.
     *
     * @return actionDetails
     */
    @javax.annotation.Nullable
    public ActionDetailsInput getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(@javax.annotation.Nullable ActionDetailsInput actionDetails) {
        this.actionDetails = actionDetails;
    }

    public UpdateCustomActionRequest associateMetadata(
            @javax.annotation.Nullable List<AssociateMetadataInput> associateMetadata) {
        this.associateMetadata = associateMetadata;
        return this;
    }

    public UpdateCustomActionRequest addAssociateMetadataItem(
            AssociateMetadataInput associateMetadataItem) {
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
    public List<AssociateMetadataInput> getAssociateMetadata() {
        return associateMetadata;
    }

    public void setAssociateMetadata(
            @javax.annotation.Nullable List<AssociateMetadataInput> associateMetadata) {
        this.associateMetadata = associateMetadata;
    }

    public UpdateCustomActionRequest defaultActionConfig(
            @javax.annotation.Nullable DefaultActionConfigInput defaultActionConfig) {
        this.defaultActionConfig = defaultActionConfig;
        return this;
    }

    /**
     * Default Custom action configuration. This includes if the custom action available on
     * visualizations and Answers. By default, a custom action is added to all visualizations and
     * Answers.
     *
     * @return defaultActionConfig
     */
    @javax.annotation.Nullable
    public DefaultActionConfigInput getDefaultActionConfig() {
        return defaultActionConfig;
    }

    public void setDefaultActionConfig(
            @javax.annotation.Nullable DefaultActionConfigInput defaultActionConfig) {
        this.defaultActionConfig = defaultActionConfig;
    }

    public UpdateCustomActionRequest groupIdentifiers(
            @javax.annotation.Nullable List<String> groupIdentifiers) {
        this.groupIdentifiers = groupIdentifiers;
        return this;
    }

    public UpdateCustomActionRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
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

    public UpdateCustomActionRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the custom action. The custom action name must be unique.
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

    public UpdateCustomActionRequest operation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Type of update operation. Default operation type is ADD
     *
     * @return operation
     */
    @javax.annotation.Nullable
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nullable OperationEnum operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCustomActionRequest updateCustomActionRequest = (UpdateCustomActionRequest) o;
        return Objects.equals(this.actionDetails, updateCustomActionRequest.actionDetails)
                && Objects.equals(
                        this.associateMetadata, updateCustomActionRequest.associateMetadata)
                && Objects.equals(
                        this.defaultActionConfig, updateCustomActionRequest.defaultActionConfig)
                && Objects.equals(this.groupIdentifiers, updateCustomActionRequest.groupIdentifiers)
                && Objects.equals(this.name, updateCustomActionRequest.name)
                && Objects.equals(this.operation, updateCustomActionRequest.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actionDetails,
                associateMetadata,
                defaultActionConfig,
                groupIdentifiers,
                name,
                operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomActionRequest {\n");
        sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
        sb.append("    associateMetadata: ")
                .append(toIndentedString(associateMetadata))
                .append("\n");
        sb.append("    defaultActionConfig: ")
                .append(toIndentedString(defaultActionConfig))
                .append("\n");
        sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
        openapiFields.add("action_details");
        openapiFields.add("associate_metadata");
        openapiFields.add("default_action_config");
        openapiFields.add("group_identifiers");
        openapiFields.add("name");
        openapiFields.add("operation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateCustomActionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateCustomActionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateCustomActionRequest is not"
                                        + " found in the empty JSON string",
                                UpdateCustomActionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateCustomActionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateCustomActionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `action_details`
        if (jsonObj.get("action_details") != null && !jsonObj.get("action_details").isJsonNull()) {
            ActionDetailsInput.validateJsonElement(jsonObj.get("action_details"));
        }
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
                    AssociateMetadataInput.validateJsonElement(jsonArrayassociateMetadata.get(i));
                }
                ;
            }
        }
        // validate the optional field `default_action_config`
        if (jsonObj.get("default_action_config") != null
                && !jsonObj.get("default_action_config").isJsonNull()) {
            DefaultActionConfigInput.validateJsonElement(jsonObj.get("default_action_config"));
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
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull())
                && !jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the optional field `operation`
        if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
            OperationEnum.validateJsonElement(jsonObj.get("operation"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateCustomActionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateCustomActionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateCustomActionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateCustomActionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateCustomActionRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateCustomActionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateCustomActionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateCustomActionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateCustomActionRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateCustomActionRequest
     */
    public static UpdateCustomActionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateCustomActionRequest.class);
    }

    /**
     * Convert an instance of UpdateCustomActionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
