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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** AnswerPngOptionsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AnswerPngOptionsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_X_RESOLUTION = "x_resolution";

    @SerializedName(SERIALIZED_NAME_X_RESOLUTION)
    @javax.annotation.Nullable
    private Integer xResolution;

    public static final String SERIALIZED_NAME_Y_RESOLUTION = "y_resolution";

    @SerializedName(SERIALIZED_NAME_Y_RESOLUTION)
    @javax.annotation.Nullable
    private Integer yResolution;

    public static final String SERIALIZED_NAME_SCALING = "scaling";

    @SerializedName(SERIALIZED_NAME_SCALING)
    @javax.annotation.Nullable
    private Integer scaling;

    public AnswerPngOptionsInput() {}

    public AnswerPngOptionsInput xResolution(@javax.annotation.Nullable Integer xResolution) {
        this.xResolution = xResolution;
        return this;
    }

    /**
     * Desired width of the answer image in pixels. Ex. 1920 for Full HD image Version: 26.6.0.cl or
     * later
     *
     * @return xResolution
     */
    @javax.annotation.Nullable
    public Integer getxResolution() {
        return xResolution;
    }

    public void setxResolution(@javax.annotation.Nullable Integer xResolution) {
        this.xResolution = xResolution;
    }

    public AnswerPngOptionsInput yResolution(@javax.annotation.Nullable Integer yResolution) {
        this.yResolution = yResolution;
        return this;
    }

    /**
     * Desired height of the answer image in pixels. Ex. 1080 for Full HD image Version: 26.6.0.cl
     * or later
     *
     * @return yResolution
     */
    @javax.annotation.Nullable
    public Integer getyResolution() {
        return yResolution;
    }

    public void setyResolution(@javax.annotation.Nullable Integer yResolution) {
        this.yResolution = yResolution;
    }

    public AnswerPngOptionsInput scaling(@javax.annotation.Nullable Integer scaling) {
        this.scaling = scaling;
        return this;
    }

    /**
     * The scale of the image in percentage. Ex. 100 for 100% scale. Version: 26.6.0.cl or later
     *
     * @return scaling
     */
    @javax.annotation.Nullable
    public Integer getScaling() {
        return scaling;
    }

    public void setScaling(@javax.annotation.Nullable Integer scaling) {
        this.scaling = scaling;
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
     * @return the AnswerPngOptionsInput instance itself
     */
    public AnswerPngOptionsInput putAdditionalProperty(String key, Object value) {
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
        AnswerPngOptionsInput answerPngOptionsInput = (AnswerPngOptionsInput) o;
        return Objects.equals(this.xResolution, answerPngOptionsInput.xResolution)
                && Objects.equals(this.yResolution, answerPngOptionsInput.yResolution)
                && Objects.equals(this.scaling, answerPngOptionsInput.scaling)
                && Objects.equals(
                        this.additionalProperties, answerPngOptionsInput.additionalProperties);
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
        return Objects.hash(xResolution, yResolution, scaling, additionalProperties);
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
        sb.append("class AnswerPngOptionsInput {\n");
        sb.append("    xResolution: ").append(toIndentedString(xResolution)).append("\n");
        sb.append("    yResolution: ").append(toIndentedString(yResolution)).append("\n");
        sb.append("    scaling: ").append(toIndentedString(scaling)).append("\n");
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
        openapiFields.add("x_resolution");
        openapiFields.add("y_resolution");
        openapiFields.add("scaling");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AnswerPngOptionsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AnswerPngOptionsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AnswerPngOptionsInput is not found in"
                                        + " the empty JSON string",
                                AnswerPngOptionsInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AnswerPngOptionsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AnswerPngOptionsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AnswerPngOptionsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AnswerPngOptionsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AnswerPngOptionsInput>() {
                        @Override
                        public void write(JsonWriter out, AnswerPngOptionsInput value)
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
                        public AnswerPngOptionsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            AnswerPngOptionsInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of AnswerPngOptionsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AnswerPngOptionsInput
     * @throws IOException if the JSON string is invalid with respect to AnswerPngOptionsInput
     */
    public static AnswerPngOptionsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AnswerPngOptionsInput.class);
    }

    /**
     * Convert an instance of AnswerPngOptionsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
