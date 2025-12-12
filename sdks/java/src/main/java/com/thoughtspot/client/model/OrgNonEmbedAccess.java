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

/** Org-level non-embed access configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrgNonEmbedAccess implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BLOCK_FULL_APP_ACCESS = "block_full_app_access";

    @SerializedName(SERIALIZED_NAME_BLOCK_FULL_APP_ACCESS)
    @javax.annotation.Nullable
    private Boolean blockFullAppAccess;

    public static final String SERIALIZED_NAME_GROUPS_WITH_ACCESS = "groups_with_access";

    @SerializedName(SERIALIZED_NAME_GROUPS_WITH_ACCESS)
    @javax.annotation.Nullable
    private List<GroupInfo> groupsWithAccess;

    public OrgNonEmbedAccess() {}

    public OrgNonEmbedAccess blockFullAppAccess(
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

    public OrgNonEmbedAccess groupsWithAccess(
            @javax.annotation.Nullable List<GroupInfo> groupsWithAccess) {
        this.groupsWithAccess = groupsWithAccess;
        return this;
    }

    public OrgNonEmbedAccess addGroupsWithAccessItem(GroupInfo groupsWithAccessItem) {
        if (this.groupsWithAccess == null) {
            this.groupsWithAccess = new ArrayList<>();
        }
        this.groupsWithAccess.add(groupsWithAccessItem);
        return this;
    }

    /**
     * Groups that have non-embed full app access.
     *
     * @return groupsWithAccess
     */
    @javax.annotation.Nullable
    public List<GroupInfo> getGroupsWithAccess() {
        return groupsWithAccess;
    }

    public void setGroupsWithAccess(@javax.annotation.Nullable List<GroupInfo> groupsWithAccess) {
        this.groupsWithAccess = groupsWithAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgNonEmbedAccess orgNonEmbedAccess = (OrgNonEmbedAccess) o;
        return Objects.equals(this.blockFullAppAccess, orgNonEmbedAccess.blockFullAppAccess)
                && Objects.equals(this.groupsWithAccess, orgNonEmbedAccess.groupsWithAccess);
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
        return Objects.hash(blockFullAppAccess, groupsWithAccess);
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
        sb.append("class OrgNonEmbedAccess {\n");
        sb.append("    blockFullAppAccess: ")
                .append(toIndentedString(blockFullAppAccess))
                .append("\n");
        sb.append("    groupsWithAccess: ").append(toIndentedString(groupsWithAccess)).append("\n");
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
        openapiFields.add("groups_with_access");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to OrgNonEmbedAccess
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OrgNonEmbedAccess.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OrgNonEmbedAccess is not found in the"
                                        + " empty JSON string",
                                OrgNonEmbedAccess.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!OrgNonEmbedAccess.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OrgNonEmbedAccess` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("groups_with_access") != null
                && !jsonObj.get("groups_with_access").isJsonNull()) {
            JsonArray jsonArraygroupsWithAccess = jsonObj.getAsJsonArray("groups_with_access");
            if (jsonArraygroupsWithAccess != null) {
                // ensure the json data is an array
                if (!jsonObj.get("groups_with_access").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `groups_with_access` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("groups_with_access").toString()));
                }

                // validate the optional field `groups_with_access` (array)
                for (int i = 0; i < jsonArraygroupsWithAccess.size(); i++) {
                    GroupInfo.validateJsonElement(jsonArraygroupsWithAccess.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrgNonEmbedAccess.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrgNonEmbedAccess' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OrgNonEmbedAccess> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(OrgNonEmbedAccess.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OrgNonEmbedAccess>() {
                        @Override
                        public void write(JsonWriter out, OrgNonEmbedAccess value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OrgNonEmbedAccess read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OrgNonEmbedAccess given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrgNonEmbedAccess
     * @throws IOException if the JSON string is invalid with respect to OrgNonEmbedAccess
     */
    public static OrgNonEmbedAccess fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OrgNonEmbedAccess.class);
    }

    /**
     * Convert an instance of OrgNonEmbedAccess to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
