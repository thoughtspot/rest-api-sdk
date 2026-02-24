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

/** Input for cluster-level non-embed access configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ClusterNonEmbedAccessInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BLOCK_FULL_APP_ACCESS = "block_full_app_access";

    @SerializedName(SERIALIZED_NAME_BLOCK_FULL_APP_ACCESS)
    @javax.annotation.Nullable
    private Boolean blockFullAppAccess;

    public static final String SERIALIZED_NAME_GROUPS_IDENTIFIERS_WITH_ACCESS =
            "groups_identifiers_with_access";

    @SerializedName(SERIALIZED_NAME_GROUPS_IDENTIFIERS_WITH_ACCESS)
    @javax.annotation.Nullable
    private List<String> groupsIdentifiersWithAccess;

    public ClusterNonEmbedAccessInput() {}

    public ClusterNonEmbedAccessInput blockFullAppAccess(
            @javax.annotation.Nullable Boolean blockFullAppAccess) {
        this.blockFullAppAccess = blockFullAppAccess;
        return this;
    }

    /**
     * Block full application access for non-embedded usage.
     *
     * @return blockFullAppAccess
     */
    @javax.annotation.Nullable
    public Boolean getBlockFullAppAccess() {
        return blockFullAppAccess;
    }

    public void setBlockFullAppAccess(@javax.annotation.Nullable Boolean blockFullAppAccess) {
        this.blockFullAppAccess = blockFullAppAccess;
    }

    public ClusterNonEmbedAccessInput groupsIdentifiersWithAccess(
            @javax.annotation.Nullable List<String> groupsIdentifiersWithAccess) {
        this.groupsIdentifiersWithAccess = groupsIdentifiersWithAccess;
        return this;
    }

    public ClusterNonEmbedAccessInput addGroupsIdentifiersWithAccessItem(
            String groupsIdentifiersWithAccessItem) {
        if (this.groupsIdentifiersWithAccess == null) {
            this.groupsIdentifiersWithAccess = new ArrayList<>();
        }
        this.groupsIdentifiersWithAccess.add(groupsIdentifiersWithAccessItem);
        return this;
    }

    /**
     * Group identifiers that are allowed non-embed full app access. Can only be set when orgs
     * feature is disabled and block_full_app_access is true.
     *
     * @return groupsIdentifiersWithAccess
     */
    @javax.annotation.Nullable
    public List<String> getGroupsIdentifiersWithAccess() {
        return groupsIdentifiersWithAccess;
    }

    public void setGroupsIdentifiersWithAccess(
            @javax.annotation.Nullable List<String> groupsIdentifiersWithAccess) {
        this.groupsIdentifiersWithAccess = groupsIdentifiersWithAccess;
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
     * @return the ClusterNonEmbedAccessInput instance itself
     */
    public ClusterNonEmbedAccessInput putAdditionalProperty(String key, Object value) {
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
        ClusterNonEmbedAccessInput clusterNonEmbedAccessInput = (ClusterNonEmbedAccessInput) o;
        return Objects.equals(
                        this.blockFullAppAccess, clusterNonEmbedAccessInput.blockFullAppAccess)
                && Objects.equals(
                        this.groupsIdentifiersWithAccess,
                        clusterNonEmbedAccessInput.groupsIdentifiersWithAccess)
                && Objects.equals(
                        this.additionalProperties, clusterNonEmbedAccessInput.additionalProperties);
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
        return Objects.hash(blockFullAppAccess, groupsIdentifiersWithAccess, additionalProperties);
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
        sb.append("class ClusterNonEmbedAccessInput {\n");
        sb.append("    blockFullAppAccess: ")
                .append(toIndentedString(blockFullAppAccess))
                .append("\n");
        sb.append("    groupsIdentifiersWithAccess: ")
                .append(toIndentedString(groupsIdentifiersWithAccess))
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
        openapiFields.add("block_full_app_access");
        openapiFields.add("groups_identifiers_with_access");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ClusterNonEmbedAccessInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ClusterNonEmbedAccessInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ClusterNonEmbedAccessInput is not"
                                        + " found in the empty JSON string",
                                ClusterNonEmbedAccessInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("groups_identifiers_with_access") != null
                && !jsonObj.get("groups_identifiers_with_access").isJsonNull()
                && !jsonObj.get("groups_identifiers_with_access").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `groups_identifiers_with_access` to be an array in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("groups_identifiers_with_access").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ClusterNonEmbedAccessInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ClusterNonEmbedAccessInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ClusterNonEmbedAccessInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ClusterNonEmbedAccessInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ClusterNonEmbedAccessInput>() {
                        @Override
                        public void write(JsonWriter out, ClusterNonEmbedAccessInput value)
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
                        public ClusterNonEmbedAccessInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ClusterNonEmbedAccessInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ClusterNonEmbedAccessInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ClusterNonEmbedAccessInput
     * @throws IOException if the JSON string is invalid with respect to ClusterNonEmbedAccessInput
     */
    public static ClusterNonEmbedAccessInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ClusterNonEmbedAccessInput.class);
    }

    /**
     * Convert an instance of ClusterNonEmbedAccessInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
