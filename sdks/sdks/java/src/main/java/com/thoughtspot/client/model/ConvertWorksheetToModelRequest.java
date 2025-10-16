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

/** ConvertWorksheetToModelRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConvertWorksheetToModelRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_WORKSHEET_IDS = "worksheet_ids";

    @SerializedName(SERIALIZED_NAME_WORKSHEET_IDS)
    @javax.annotation.Nullable
    private List<String> worksheetIds;

    public static final String SERIALIZED_NAME_EXCLUDE_WORKSHEET_IDS = "exclude_worksheet_ids";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_WORKSHEET_IDS)
    @javax.annotation.Nullable
    private List<String> excludeWorksheetIds;

    public static final String SERIALIZED_NAME_CONVERT_ALL = "convert_all";

    @SerializedName(SERIALIZED_NAME_CONVERT_ALL)
    @javax.annotation.Nullable
    private Boolean convertAll = false;

    public static final String SERIALIZED_NAME_APPLY_CHANGES = "apply_changes";

    @SerializedName(SERIALIZED_NAME_APPLY_CHANGES)
    @javax.annotation.Nullable
    private Boolean applyChanges = false;

    public ConvertWorksheetToModelRequest() {}

    public ConvertWorksheetToModelRequest worksheetIds(
            @javax.annotation.Nullable List<String> worksheetIds) {
        this.worksheetIds = worksheetIds;
        return this;
    }

    public ConvertWorksheetToModelRequest addWorksheetIdsItem(String worksheetIdsItem) {
        if (this.worksheetIds == null) {
            this.worksheetIds = new ArrayList<>();
        }
        this.worksheetIds.add(worksheetIdsItem);
        return this;
    }

    /**
     * List of Worksheet IDs.
     *
     * @return worksheetIds
     */
    @javax.annotation.Nullable
    public List<String> getWorksheetIds() {
        return worksheetIds;
    }

    public void setWorksheetIds(@javax.annotation.Nullable List<String> worksheetIds) {
        this.worksheetIds = worksheetIds;
    }

    public ConvertWorksheetToModelRequest excludeWorksheetIds(
            @javax.annotation.Nullable List<String> excludeWorksheetIds) {
        this.excludeWorksheetIds = excludeWorksheetIds;
        return this;
    }

    public ConvertWorksheetToModelRequest addExcludeWorksheetIdsItem(
            String excludeWorksheetIdsItem) {
        if (this.excludeWorksheetIds == null) {
            this.excludeWorksheetIds = new ArrayList<>();
        }
        this.excludeWorksheetIds.add(excludeWorksheetIdsItem);
        return this;
    }

    /**
     * List of Worksheet IDs to be excluded.
     *
     * @return excludeWorksheetIds
     */
    @javax.annotation.Nullable
    public List<String> getExcludeWorksheetIds() {
        return excludeWorksheetIds;
    }

    public void setExcludeWorksheetIds(
            @javax.annotation.Nullable List<String> excludeWorksheetIds) {
        this.excludeWorksheetIds = excludeWorksheetIds;
    }

    public ConvertWorksheetToModelRequest convertAll(
            @javax.annotation.Nullable Boolean convertAll) {
        this.convertAll = convertAll;
        return this;
    }

    /**
     * Indicates whether all the worksheet needs to be converted to models.
     *
     * @return convertAll
     */
    @javax.annotation.Nullable
    public Boolean getConvertAll() {
        return convertAll;
    }

    public void setConvertAll(@javax.annotation.Nullable Boolean convertAll) {
        this.convertAll = convertAll;
    }

    public ConvertWorksheetToModelRequest applyChanges(
            @javax.annotation.Nullable Boolean applyChanges) {
        this.applyChanges = applyChanges;
        return this;
    }

    /**
     * Indicates whether the changes should be applied to database.
     *
     * @return applyChanges
     */
    @javax.annotation.Nullable
    public Boolean getApplyChanges() {
        return applyChanges;
    }

    public void setApplyChanges(@javax.annotation.Nullable Boolean applyChanges) {
        this.applyChanges = applyChanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConvertWorksheetToModelRequest convertWorksheetToModelRequest =
                (ConvertWorksheetToModelRequest) o;
        return Objects.equals(this.worksheetIds, convertWorksheetToModelRequest.worksheetIds)
                && Objects.equals(
                        this.excludeWorksheetIds,
                        convertWorksheetToModelRequest.excludeWorksheetIds)
                && Objects.equals(this.convertAll, convertWorksheetToModelRequest.convertAll)
                && Objects.equals(this.applyChanges, convertWorksheetToModelRequest.applyChanges);
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
        return Objects.hash(worksheetIds, excludeWorksheetIds, convertAll, applyChanges);
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
        sb.append("class ConvertWorksheetToModelRequest {\n");
        sb.append("    worksheetIds: ").append(toIndentedString(worksheetIds)).append("\n");
        sb.append("    excludeWorksheetIds: ")
                .append(toIndentedString(excludeWorksheetIds))
                .append("\n");
        sb.append("    convertAll: ").append(toIndentedString(convertAll)).append("\n");
        sb.append("    applyChanges: ").append(toIndentedString(applyChanges)).append("\n");
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
        openapiFields.add("worksheet_ids");
        openapiFields.add("exclude_worksheet_ids");
        openapiFields.add("convert_all");
        openapiFields.add("apply_changes");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ConvertWorksheetToModelRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConvertWorksheetToModelRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConvertWorksheetToModelRequest is not"
                                        + " found in the empty JSON string",
                                ConvertWorksheetToModelRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ConvertWorksheetToModelRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ConvertWorksheetToModelRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("worksheet_ids") != null
                && !jsonObj.get("worksheet_ids").isJsonNull()
                && !jsonObj.get("worksheet_ids").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `worksheet_ids` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("worksheet_ids").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("exclude_worksheet_ids") != null
                && !jsonObj.get("exclude_worksheet_ids").isJsonNull()
                && !jsonObj.get("exclude_worksheet_ids").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `exclude_worksheet_ids` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("exclude_worksheet_ids").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConvertWorksheetToModelRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConvertWorksheetToModelRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConvertWorksheetToModelRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ConvertWorksheetToModelRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConvertWorksheetToModelRequest>() {
                        @Override
                        public void write(JsonWriter out, ConvertWorksheetToModelRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ConvertWorksheetToModelRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ConvertWorksheetToModelRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConvertWorksheetToModelRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ConvertWorksheetToModelRequest
     */
    public static ConvertWorksheetToModelRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConvertWorksheetToModelRequest.class);
    }

    /**
     * Convert an instance of ConvertWorksheetToModelRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
