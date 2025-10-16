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

/** GetAsyncImportStatusResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetAsyncImportStatusResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_STATUS_LIST = "status_list";

    @SerializedName(SERIALIZED_NAME_STATUS_LIST)
    @javax.annotation.Nullable
    private List<ImportEPackAsyncTaskStatus> statusList;

    public static final String SERIALIZED_NAME_LAST_BATCH = "last_batch";

    @SerializedName(SERIALIZED_NAME_LAST_BATCH)
    @javax.annotation.Nullable
    private Boolean lastBatch;

    public GetAsyncImportStatusResponse() {}

    public GetAsyncImportStatusResponse statusList(
            @javax.annotation.Nullable List<ImportEPackAsyncTaskStatus> statusList) {
        this.statusList = statusList;
        return this;
    }

    public GetAsyncImportStatusResponse addStatusListItem(
            ImportEPackAsyncTaskStatus statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    /**
     * List of task statuses.
     *
     * @return statusList
     */
    @javax.annotation.Nullable
    public List<ImportEPackAsyncTaskStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(
            @javax.annotation.Nullable List<ImportEPackAsyncTaskStatus> statusList) {
        this.statusList = statusList;
    }

    public GetAsyncImportStatusResponse lastBatch(@javax.annotation.Nullable Boolean lastBatch) {
        this.lastBatch = lastBatch;
        return this;
    }

    /**
     * Indicates whether there are more task statuses to fetch.
     *
     * @return lastBatch
     */
    @javax.annotation.Nullable
    public Boolean getLastBatch() {
        return lastBatch;
    }

    public void setLastBatch(@javax.annotation.Nullable Boolean lastBatch) {
        this.lastBatch = lastBatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAsyncImportStatusResponse getAsyncImportStatusResponse =
                (GetAsyncImportStatusResponse) o;
        return Objects.equals(this.statusList, getAsyncImportStatusResponse.statusList)
                && Objects.equals(this.lastBatch, getAsyncImportStatusResponse.lastBatch);
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
        return Objects.hash(statusList, lastBatch);
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
        sb.append("class GetAsyncImportStatusResponse {\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    lastBatch: ").append(toIndentedString(lastBatch)).append("\n");
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
        openapiFields.add("status_list");
        openapiFields.add("last_batch");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetAsyncImportStatusResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetAsyncImportStatusResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetAsyncImportStatusResponse is not"
                                        + " found in the empty JSON string",
                                GetAsyncImportStatusResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetAsyncImportStatusResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GetAsyncImportStatusResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("status_list") != null && !jsonObj.get("status_list").isJsonNull()) {
            JsonArray jsonArraystatusList = jsonObj.getAsJsonArray("status_list");
            if (jsonArraystatusList != null) {
                // ensure the json data is an array
                if (!jsonObj.get("status_list").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `status_list` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("status_list").toString()));
                }

                // validate the optional field `status_list` (array)
                for (int i = 0; i < jsonArraystatusList.size(); i++) {
                    ImportEPackAsyncTaskStatus.validateJsonElement(jsonArraystatusList.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetAsyncImportStatusResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetAsyncImportStatusResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetAsyncImportStatusResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetAsyncImportStatusResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetAsyncImportStatusResponse>() {
                        @Override
                        public void write(JsonWriter out, GetAsyncImportStatusResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetAsyncImportStatusResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetAsyncImportStatusResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetAsyncImportStatusResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     GetAsyncImportStatusResponse
     */
    public static GetAsyncImportStatusResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetAsyncImportStatusResponse.class);
    }

    /**
     * Convert an instance of GetAsyncImportStatusResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
