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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Custom action details */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ResponseCustomAction implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTION_DETAILS = "action_details";

    @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
    @javax.annotation.Nonnull
    private ActionDetails actionDetails;

    public static final String SERIALIZED_NAME_DEFAULT_ACTION_CONFIG = "default_action_config";

    @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION_CONFIG)
    @javax.annotation.Nonnull
    private DefaultActionConfig defaultActionConfig;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_METADATA_ASSOCIATION = "metadata_association";

    @SerializedName(SERIALIZED_NAME_METADATA_ASSOCIATION)
    @javax.annotation.Nullable
    private List<MetadataAssociationItem> metadataAssociation;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_USER_GROUPS = "user_groups";

    @SerializedName(SERIALIZED_NAME_USER_GROUPS)
    @javax.annotation.Nullable
    private List<ObjectIDAndName> userGroups;

    public ResponseCustomAction() {}

    public ResponseCustomAction actionDetails(
            @javax.annotation.Nonnull ActionDetails actionDetails) {
        this.actionDetails = actionDetails;
        return this;
    }

    /**
     * Get actionDetails
     *
     * @return actionDetails
     */
    @javax.annotation.Nonnull
    public ActionDetails getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(@javax.annotation.Nonnull ActionDetails actionDetails) {
        this.actionDetails = actionDetails;
    }

    public ResponseCustomAction defaultActionConfig(
            @javax.annotation.Nonnull DefaultActionConfig defaultActionConfig) {
        this.defaultActionConfig = defaultActionConfig;
        return this;
    }

    /**
     * Get defaultActionConfig
     *
     * @return defaultActionConfig
     */
    @javax.annotation.Nonnull
    public DefaultActionConfig getDefaultActionConfig() {
        return defaultActionConfig;
    }

    public void setDefaultActionConfig(
            @javax.annotation.Nonnull DefaultActionConfig defaultActionConfig) {
        this.defaultActionConfig = defaultActionConfig;
    }

    public ResponseCustomAction id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique Id of the custom action.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public ResponseCustomAction metadataAssociation(
            @javax.annotation.Nullable List<MetadataAssociationItem> metadataAssociation) {
        this.metadataAssociation = metadataAssociation;
        return this;
    }

    public ResponseCustomAction addMetadataAssociationItem(
            MetadataAssociationItem metadataAssociationItem) {
        if (this.metadataAssociation == null) {
            this.metadataAssociation = new ArrayList<>();
        }
        this.metadataAssociation.add(metadataAssociationItem);
        return this;
    }

    /**
     * Metadata objects to assign the the custom action to.
     *
     * @return metadataAssociation
     */
    @javax.annotation.Nullable
    public List<MetadataAssociationItem> getMetadataAssociation() {
        return metadataAssociation;
    }

    public void setMetadataAssociation(
            @javax.annotation.Nullable List<MetadataAssociationItem> metadataAssociation) {
        this.metadataAssociation = metadataAssociation;
    }

    public ResponseCustomAction name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Unique name of the custom action.
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

    public ResponseCustomAction userGroups(
            @javax.annotation.Nullable List<ObjectIDAndName> userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    public ResponseCustomAction addUserGroupsItem(ObjectIDAndName userGroupsItem) {
        if (this.userGroups == null) {
            this.userGroups = new ArrayList<>();
        }
        this.userGroups.add(userGroupsItem);
        return this;
    }

    /**
     * Unique ID or name of the User groups which are associated with the custom action.
     *
     * @return userGroups
     */
    @javax.annotation.Nullable
    public List<ObjectIDAndName> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(@javax.annotation.Nullable List<ObjectIDAndName> userGroups) {
        this.userGroups = userGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseCustomAction responseCustomAction = (ResponseCustomAction) o;
        return Objects.equals(this.actionDetails, responseCustomAction.actionDetails)
                && Objects.equals(
                        this.defaultActionConfig, responseCustomAction.defaultActionConfig)
                && Objects.equals(this.id, responseCustomAction.id)
                && Objects.equals(
                        this.metadataAssociation, responseCustomAction.metadataAssociation)
                && Objects.equals(this.name, responseCustomAction.name)
                && Objects.equals(this.userGroups, responseCustomAction.userGroups);
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
                actionDetails, defaultActionConfig, id, metadataAssociation, name, userGroups);
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
        sb.append("class ResponseCustomAction {\n");
        sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
        sb.append("    defaultActionConfig: ")
                .append(toIndentedString(defaultActionConfig))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    metadataAssociation: ")
                .append(toIndentedString(metadataAssociation))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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
        openapiFields.add("default_action_config");
        openapiFields.add("id");
        openapiFields.add("metadata_association");
        openapiFields.add("name");
        openapiFields.add("user_groups");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("action_details");
        openapiRequiredFields.add("default_action_config");
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ResponseCustomAction
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ResponseCustomAction.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ResponseCustomAction is not found in"
                                        + " the empty JSON string",
                                ResponseCustomAction.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ResponseCustomAction.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ResponseCustomAction` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ResponseCustomAction.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `action_details`
        ActionDetails.validateJsonElement(jsonObj.get("action_details"));
        // validate the required field `default_action_config`
        DefaultActionConfig.validateJsonElement(jsonObj.get("default_action_config"));
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (jsonObj.get("metadata_association") != null
                && !jsonObj.get("metadata_association").isJsonNull()) {
            JsonArray jsonArraymetadataAssociation = jsonObj.getAsJsonArray("metadata_association");
            if (jsonArraymetadataAssociation != null) {
                // ensure the json data is an array
                if (!jsonObj.get("metadata_association").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `metadata_association` to be an array in"
                                            + " the JSON string but got `%s`",
                                    jsonObj.get("metadata_association").toString()));
                }

                // validate the optional field `metadata_association` (array)
                for (int i = 0; i < jsonArraymetadataAssociation.size(); i++) {
                    MetadataAssociationItem.validateJsonElement(
                            jsonArraymetadataAssociation.get(i));
                }
                ;
            }
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (jsonObj.get("user_groups") != null && !jsonObj.get("user_groups").isJsonNull()) {
            JsonArray jsonArrayuserGroups = jsonObj.getAsJsonArray("user_groups");
            if (jsonArrayuserGroups != null) {
                // ensure the json data is an array
                if (!jsonObj.get("user_groups").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `user_groups` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("user_groups").toString()));
                }

                // validate the optional field `user_groups` (array)
                for (int i = 0; i < jsonArrayuserGroups.size(); i++) {
                    ObjectIDAndName.validateJsonElement(jsonArrayuserGroups.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResponseCustomAction.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResponseCustomAction' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResponseCustomAction> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ResponseCustomAction.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ResponseCustomAction>() {
                        @Override
                        public void write(JsonWriter out, ResponseCustomAction value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ResponseCustomAction read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ResponseCustomAction given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ResponseCustomAction
     * @throws IOException if the JSON string is invalid with respect to ResponseCustomAction
     */
    public static ResponseCustomAction fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ResponseCustomAction.class);
    }

    /**
     * Convert an instance of ResponseCustomAction to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
