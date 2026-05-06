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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Chart color palette configuration for a specific scope. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleChartColorPalette implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLORS = "colors";

    @SerializedName(SERIALIZED_NAME_COLORS)
    @javax.annotation.Nullable
    private List<StyleColorEntry> colors;

    public static final String SERIALIZED_NAME_DISABLE_COLOR_ROTATION = "disable_color_rotation";

    @SerializedName(SERIALIZED_NAME_DISABLE_COLOR_ROTATION)
    @javax.annotation.Nullable
    private Boolean disableColorRotation;

    public static final String SERIALIZED_NAME_IS_OVERRIDDEN = "is_overridden";

    @SerializedName(SERIALIZED_NAME_IS_OVERRIDDEN)
    @javax.annotation.Nullable
    private Boolean isOverridden;

    public StyleChartColorPalette() {}

    public StyleChartColorPalette colors(@javax.annotation.Nullable List<StyleColorEntry> colors) {
        this.colors = colors;
        return this;
    }

    public StyleChartColorPalette addColorsItem(StyleColorEntry colorsItem) {
        if (this.colors == null) {
            this.colors = new ArrayList<>();
        }
        this.colors.add(colorsItem);
        return this;
    }

    /**
     * Ordered array of 8 color entries.
     *
     * @return colors
     */
    @javax.annotation.Nullable
    public List<StyleColorEntry> getColors() {
        return colors;
    }

    public void setColors(@javax.annotation.Nullable List<StyleColorEntry> colors) {
        this.colors = colors;
    }

    public StyleChartColorPalette disableColorRotation(
            @javax.annotation.Nullable Boolean disableColorRotation) {
        this.disableColorRotation = disableColorRotation;
        return this;
    }

    /**
     * When true, automatic color rotation across chart data series is disabled.
     *
     * @return disableColorRotation
     */
    @javax.annotation.Nullable
    public Boolean getDisableColorRotation() {
        return disableColorRotation;
    }

    public void setDisableColorRotation(@javax.annotation.Nullable Boolean disableColorRotation) {
        this.disableColorRotation = disableColorRotation;
    }

    public StyleChartColorPalette isOverridden(@javax.annotation.Nullable Boolean isOverridden) {
        this.isOverridden = isOverridden;
        return this;
    }

    /**
     * True if explicitly set at this scope, overriding any inherited value.
     *
     * @return isOverridden
     */
    @javax.annotation.Nullable
    public Boolean getIsOverridden() {
        return isOverridden;
    }

    public void setIsOverridden(@javax.annotation.Nullable Boolean isOverridden) {
        this.isOverridden = isOverridden;
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
     * @return the StyleChartColorPalette instance itself
     */
    public StyleChartColorPalette putAdditionalProperty(String key, Object value) {
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
        StyleChartColorPalette styleChartColorPalette = (StyleChartColorPalette) o;
        return Objects.equals(this.colors, styleChartColorPalette.colors)
                && Objects.equals(
                        this.disableColorRotation, styleChartColorPalette.disableColorRotation)
                && Objects.equals(this.isOverridden, styleChartColorPalette.isOverridden)
                && Objects.equals(
                        this.additionalProperties, styleChartColorPalette.additionalProperties);
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
        return Objects.hash(colors, disableColorRotation, isOverridden, additionalProperties);
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
        sb.append("class StyleChartColorPalette {\n");
        sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
        sb.append("    disableColorRotation: ")
                .append(toIndentedString(disableColorRotation))
                .append("\n");
        sb.append("    isOverridden: ").append(toIndentedString(isOverridden)).append("\n");
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
        openapiFields.add("colors");
        openapiFields.add("disable_color_rotation");
        openapiFields.add("is_overridden");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StyleChartColorPalette
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleChartColorPalette.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleChartColorPalette is not found"
                                        + " in the empty JSON string",
                                StyleChartColorPalette.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("colors") != null && !jsonObj.get("colors").isJsonNull()) {
            JsonArray jsonArraycolors = jsonObj.getAsJsonArray("colors");
            if (jsonArraycolors != null) {
                // ensure the json data is an array
                if (!jsonObj.get("colors").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `colors` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("colors").toString()));
                }

                // validate the optional field `colors` (array)
                for (int i = 0; i < jsonArraycolors.size(); i++) {
                    StyleColorEntry.validateJsonElement(jsonArraycolors.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StyleChartColorPalette.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleChartColorPalette' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleChartColorPalette> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StyleChartColorPalette.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleChartColorPalette>() {
                        @Override
                        public void write(JsonWriter out, StyleChartColorPalette value)
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
                        public StyleChartColorPalette read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleChartColorPalette instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StyleChartColorPalette given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleChartColorPalette
     * @throws IOException if the JSON string is invalid with respect to StyleChartColorPalette
     */
    public static StyleChartColorPalette fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleChartColorPalette.class);
    }

    /**
     * Convert an instance of StyleChartColorPalette to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
