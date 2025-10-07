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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** LBContextInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class LBContextInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LIVEBOARD_IDENTIFIER = "liveboard_identifier";

    @SerializedName(SERIALIZED_NAME_LIVEBOARD_IDENTIFIER)
    @javax.annotation.Nonnull
    private String liveboardIdentifier;

    public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIER =
            "visualization_identifier";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String visualizationIdentifier;

    public LBContextInput() {}

    public LBContextInput liveboardIdentifier(
            @javax.annotation.Nonnull String liveboardIdentifier) {
        this.liveboardIdentifier = liveboardIdentifier;
        return this;
    }

    /**
     * Unique identifier of the liveboard.
     *
     * @return liveboardIdentifier
     */
    @javax.annotation.Nonnull
    public String getLiveboardIdentifier() {
        return liveboardIdentifier;
    }

    public void setLiveboardIdentifier(@javax.annotation.Nonnull String liveboardIdentifier) {
        this.liveboardIdentifier = liveboardIdentifier;
    }

    public LBContextInput visualizationIdentifier(
            @javax.annotation.Nonnull String visualizationIdentifier) {
        this.visualizationIdentifier = visualizationIdentifier;
        return this;
    }

    /**
     * Unique identifier of the visualization.
     *
     * @return visualizationIdentifier
     */
    @javax.annotation.Nonnull
    public String getVisualizationIdentifier() {
        return visualizationIdentifier;
    }

    public void setVisualizationIdentifier(
            @javax.annotation.Nonnull String visualizationIdentifier) {
        this.visualizationIdentifier = visualizationIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LBContextInput lbContextInput = (LBContextInput) o;
        return Objects.equals(this.liveboardIdentifier, lbContextInput.liveboardIdentifier)
                && Objects.equals(
                        this.visualizationIdentifier, lbContextInput.visualizationIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveboardIdentifier, visualizationIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LBContextInput {\n");
        sb.append("    liveboardIdentifier: ")
                .append(toIndentedString(liveboardIdentifier))
                .append("\n");
        sb.append("    visualizationIdentifier: ")
                .append(toIndentedString(visualizationIdentifier))
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
        openapiFields.add("liveboard_identifier");
        openapiFields.add("visualization_identifier");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("liveboard_identifier");
        openapiRequiredFields.add("visualization_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LBContextInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LBContextInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LBContextInput is not found in the"
                                        + " empty JSON string",
                                LBContextInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LBContextInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LBContextInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LBContextInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("liveboard_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liveboard_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("liveboard_identifier").toString()));
        }
        if (!jsonObj.get("visualization_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_identifier` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("visualization_identifier").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LBContextInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LBContextInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LBContextInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LBContextInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LBContextInput>() {
                        @Override
                        public void write(JsonWriter out, LBContextInput value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LBContextInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LBContextInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LBContextInput
     * @throws IOException if the JSON string is invalid with respect to LBContextInput
     */
    public static LBContextInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LBContextInput.class);
    }

    /**
     * Convert an instance of LBContextInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
