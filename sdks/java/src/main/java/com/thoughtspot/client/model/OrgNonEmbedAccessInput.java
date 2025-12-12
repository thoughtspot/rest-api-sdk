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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Input for org-level non-embed access configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrgNonEmbedAccessInput implements Serializable {
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

    public OrgNonEmbedAccessInput() {}

    public OrgNonEmbedAccessInput blockFullAppAccess(
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

    public OrgNonEmbedAccessInput groupsIdentifiersWithAccess(
            @javax.annotation.Nullable List<String> groupsIdentifiersWithAccess) {
        this.groupsIdentifiersWithAccess = groupsIdentifiersWithAccess;
        return this;
    }

    public OrgNonEmbedAccessInput addGroupsIdentifiersWithAccessItem(
            String groupsIdentifiersWithAccessItem) {
        if (this.groupsIdentifiersWithAccess == null) {
            this.groupsIdentifiersWithAccess = new ArrayList<>();
        }
        this.groupsIdentifiersWithAccess.add(groupsIdentifiersWithAccessItem);
        return this;
    }

    /**
     * Group identifiers that are allowed non-embed full app access. Can only be set if
     * block_full_app_access is true.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgNonEmbedAccessInput orgNonEmbedAccessInput = (OrgNonEmbedAccessInput) o;
        return Objects.equals(this.blockFullAppAccess, orgNonEmbedAccessInput.blockFullAppAccess)
                && Objects.equals(
                        this.groupsIdentifiersWithAccess,
                        orgNonEmbedAccessInput.groupsIdentifiersWithAccess);
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
        return Objects.hash(blockFullAppAccess, groupsIdentifiersWithAccess);
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
        sb.append("class OrgNonEmbedAccessInput {\n");
        sb.append("    blockFullAppAccess: ")
                .append(toIndentedString(blockFullAppAccess))
                .append("\n");
        sb.append("    groupsIdentifiersWithAccess: ")
                .append(toIndentedString(groupsIdentifiersWithAccess))
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
     * @throws IOException if the JSON Element is invalid with respect to OrgNonEmbedAccessInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OrgNonEmbedAccessInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OrgNonEmbedAccessInput is not found"
                                        + " in the empty JSON string",
                                OrgNonEmbedAccessInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!OrgNonEmbedAccessInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OrgNonEmbedAccessInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
            if (!OrgNonEmbedAccessInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrgNonEmbedAccessInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OrgNonEmbedAccessInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(OrgNonEmbedAccessInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OrgNonEmbedAccessInput>() {
                        @Override
                        public void write(JsonWriter out, OrgNonEmbedAccessInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OrgNonEmbedAccessInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OrgNonEmbedAccessInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrgNonEmbedAccessInput
     * @throws IOException if the JSON string is invalid with respect to OrgNonEmbedAccessInput
     */
    public static OrgNonEmbedAccessInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OrgNonEmbedAccessInput.class);
    }

    /**
     * Convert an instance of OrgNonEmbedAccessInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
