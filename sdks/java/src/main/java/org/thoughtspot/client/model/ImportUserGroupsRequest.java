/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;


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
import org.thoughtspot.client.JSON;

/** ImportUserGroupsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ImportUserGroupsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_GROUPS = "groups";

    @SerializedName(SERIALIZED_NAME_GROUPS)
    @javax.annotation.Nullable
    private List<GroupsImportListInput> groups;

    public static final String SERIALIZED_NAME_DELETE_UNSPECIFIED_GROUPS =
            "delete_unspecified_groups";

    @SerializedName(SERIALIZED_NAME_DELETE_UNSPECIFIED_GROUPS)
    @javax.annotation.Nullable
    private Boolean deleteUnspecifiedGroups = false;

    public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    @javax.annotation.Nullable
    private Boolean dryRun = true;

    public ImportUserGroupsRequest() {}

    public ImportUserGroupsRequest groups(
            @javax.annotation.Nullable List<GroupsImportListInput> groups) {
        this.groups = groups;
        return this;
    }

    public ImportUserGroupsRequest addGroupsItem(GroupsImportListInput groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Details of groups which are to be imported
     *
     * @return groups
     */
    @javax.annotation.Nullable
    public List<GroupsImportListInput> getGroups() {
        return groups;
    }

    public void setGroups(@javax.annotation.Nullable List<GroupsImportListInput> groups) {
        this.groups = groups;
    }

    public ImportUserGroupsRequest deleteUnspecifiedGroups(
            @javax.annotation.Nullable Boolean deleteUnspecifiedGroups) {
        this.deleteUnspecifiedGroups = deleteUnspecifiedGroups;
        return this;
    }

    /**
     * If set to true, removes groups that are not specified in the API request.
     *
     * @return deleteUnspecifiedGroups
     */
    @javax.annotation.Nullable
    public Boolean getDeleteUnspecifiedGroups() {
        return deleteUnspecifiedGroups;
    }

    public void setDeleteUnspecifiedGroups(
            @javax.annotation.Nullable Boolean deleteUnspecifiedGroups) {
        this.deleteUnspecifiedGroups = deleteUnspecifiedGroups;
    }

    public ImportUserGroupsRequest dryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * If true, the API performs a test operation and returns user IDs whose data will be edited
     * after the import.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportUserGroupsRequest importUserGroupsRequest = (ImportUserGroupsRequest) o;
        return Objects.equals(this.groups, importUserGroupsRequest.groups)
                && Objects.equals(
                        this.deleteUnspecifiedGroups,
                        importUserGroupsRequest.deleteUnspecifiedGroups)
                && Objects.equals(this.dryRun, importUserGroupsRequest.dryRun);
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
        return Objects.hash(groups, deleteUnspecifiedGroups, dryRun);
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
        sb.append("class ImportUserGroupsRequest {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    deleteUnspecifiedGroups: ")
                .append(toIndentedString(deleteUnspecifiedGroups))
                .append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
        openapiFields.add("groups");
        openapiFields.add("delete_unspecified_groups");
        openapiFields.add("dry_run");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ImportUserGroupsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImportUserGroupsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImportUserGroupsRequest is not found"
                                        + " in the empty JSON string",
                                ImportUserGroupsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ImportUserGroupsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ImportUserGroupsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
            JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
            if (jsonArraygroups != null) {
                // ensure the json data is an array
                if (!jsonObj.get("groups").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `groups` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("groups").toString()));
                }

                // validate the optional field `groups` (array)
                for (int i = 0; i < jsonArraygroups.size(); i++) {
                    GroupsImportListInput.validateJsonElement(jsonArraygroups.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImportUserGroupsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImportUserGroupsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportUserGroupsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImportUserGroupsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImportUserGroupsRequest>() {
                        @Override
                        public void write(JsonWriter out, ImportUserGroupsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ImportUserGroupsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ImportUserGroupsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImportUserGroupsRequest
     * @throws IOException if the JSON string is invalid with respect to ImportUserGroupsRequest
     */
    public static ImportUserGroupsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImportUserGroupsRequest.class);
    }

    /**
     * Convert an instance of ImportUserGroupsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
