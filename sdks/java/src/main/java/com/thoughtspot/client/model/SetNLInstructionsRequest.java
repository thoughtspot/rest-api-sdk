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

/** SetNLInstructionsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SetNLInstructionsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER = "data_source_identifier";

    @SerializedName(SERIALIZED_NAME_DATA_SOURCE_IDENTIFIER)
    @javax.annotation.Nonnull
    private String dataSourceIdentifier;

    public static final String SERIALIZED_NAME_NL_INSTRUCTIONS_INFO = "nl_instructions_info";

    @SerializedName(SERIALIZED_NAME_NL_INSTRUCTIONS_INFO)
    @javax.annotation.Nonnull
    private List<NLInstructionsInfoInput> nlInstructionsInfo;

    public SetNLInstructionsRequest() {}

    public SetNLInstructionsRequest dataSourceIdentifier(
            @javax.annotation.Nonnull String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the data-model for which to set NL instructions.
     *
     * @return dataSourceIdentifier
     */
    @javax.annotation.Nonnull
    public String getDataSourceIdentifier() {
        return dataSourceIdentifier;
    }

    public void setDataSourceIdentifier(@javax.annotation.Nonnull String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
    }

    public SetNLInstructionsRequest nlInstructionsInfo(
            @javax.annotation.Nonnull List<NLInstructionsInfoInput> nlInstructionsInfo) {
        this.nlInstructionsInfo = nlInstructionsInfo;
        return this;
    }

    public SetNLInstructionsRequest addNlInstructionsInfoItem(
            NLInstructionsInfoInput nlInstructionsInfoItem) {
        if (this.nlInstructionsInfo == null) {
            this.nlInstructionsInfo = new ArrayList<>();
        }
        this.nlInstructionsInfo.add(nlInstructionsInfoItem);
        return this;
    }

    /**
     * List of NL instructions to set for the data-model.
     *
     * @return nlInstructionsInfo
     */
    @javax.annotation.Nonnull
    public List<NLInstructionsInfoInput> getNlInstructionsInfo() {
        return nlInstructionsInfo;
    }

    public void setNlInstructionsInfo(
            @javax.annotation.Nonnull List<NLInstructionsInfoInput> nlInstructionsInfo) {
        this.nlInstructionsInfo = nlInstructionsInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetNLInstructionsRequest setNLInstructionsRequest = (SetNLInstructionsRequest) o;
        return Objects.equals(
                        this.dataSourceIdentifier, setNLInstructionsRequest.dataSourceIdentifier)
                && Objects.equals(
                        this.nlInstructionsInfo, setNLInstructionsRequest.nlInstructionsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceIdentifier, nlInstructionsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetNLInstructionsRequest {\n");
        sb.append("    dataSourceIdentifier: ")
                .append(toIndentedString(dataSourceIdentifier))
                .append("\n");
        sb.append("    nlInstructionsInfo: ")
                .append(toIndentedString(nlInstructionsInfo))
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
        openapiFields.add("data_source_identifier");
        openapiFields.add("nl_instructions_info");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("data_source_identifier");
        openapiRequiredFields.add("nl_instructions_info");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SetNLInstructionsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SetNLInstructionsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SetNLInstructionsRequest is not found"
                                        + " in the empty JSON string",
                                SetNLInstructionsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SetNLInstructionsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SetNLInstructionsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SetNLInstructionsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("data_source_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `data_source_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("data_source_identifier").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("nl_instructions_info").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `nl_instructions_info` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("nl_instructions_info").toString()));
        }

        JsonArray jsonArraynlInstructionsInfo = jsonObj.getAsJsonArray("nl_instructions_info");
        // validate the required field `nl_instructions_info` (array)
        for (int i = 0; i < jsonArraynlInstructionsInfo.size(); i++) {
            NLInstructionsInfoInput.validateJsonElement(jsonArraynlInstructionsInfo.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SetNLInstructionsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SetNLInstructionsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SetNLInstructionsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SetNLInstructionsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SetNLInstructionsRequest>() {
                        @Override
                        public void write(JsonWriter out, SetNLInstructionsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SetNLInstructionsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SetNLInstructionsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SetNLInstructionsRequest
     * @throws IOException if the JSON string is invalid with respect to SetNLInstructionsRequest
     */
    public static SetNLInstructionsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SetNLInstructionsRequest.class);
    }

    /**
     * Convert an instance of SetNLInstructionsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
