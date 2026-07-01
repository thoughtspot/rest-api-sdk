/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
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

/** Navigation panel color configuration for a specific scope. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleNavigationPanel implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Navigation panel color mode. */
    @JsonAdapter(ThemeEnum.Adapter.class)
    public enum ThemeEnum {
        DARK("DARK"),

        TWO_TONE("TWO_TONE"),

        CUSTOM("CUSTOM");

        private String value;

        ThemeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ThemeEnum fromValue(String value) {
            for (ThemeEnum b : ThemeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ThemeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ThemeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ThemeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ThemeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ThemeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_THEME = "theme";

    @SerializedName(SERIALIZED_NAME_THEME)
    @javax.annotation.Nullable
    private ThemeEnum theme;

    public static final String SERIALIZED_NAME_BASE_COLOR = "base_color";

    @SerializedName(SERIALIZED_NAME_BASE_COLOR)
    @javax.annotation.Nullable
    private String baseColor;

    public static final String SERIALIZED_NAME_IS_OVERRIDDEN = "is_overridden";

    @SerializedName(SERIALIZED_NAME_IS_OVERRIDDEN)
    @javax.annotation.Nullable
    private Boolean isOverridden;

    public StyleNavigationPanel() {}

    public StyleNavigationPanel theme(@javax.annotation.Nullable ThemeEnum theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Navigation panel color mode.
     *
     * @return theme
     */
    @javax.annotation.Nullable
    public ThemeEnum getTheme() {
        return theme;
    }

    public void setTheme(@javax.annotation.Nullable ThemeEnum theme) {
        this.theme = theme;
    }

    public StyleNavigationPanel baseColor(@javax.annotation.Nullable String baseColor) {
        this.baseColor = baseColor;
        return this;
    }

    /**
     * Base color as a 6-digit hex string. Present only when theme is CUSTOM.
     *
     * @return baseColor
     */
    @javax.annotation.Nullable
    public String getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(@javax.annotation.Nullable String baseColor) {
        this.baseColor = baseColor;
    }

    public StyleNavigationPanel isOverridden(@javax.annotation.Nullable Boolean isOverridden) {
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
     * @return the StyleNavigationPanel instance itself
     */
    public StyleNavigationPanel putAdditionalProperty(String key, Object value) {
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
        StyleNavigationPanel styleNavigationPanel = (StyleNavigationPanel) o;
        return Objects.equals(this.theme, styleNavigationPanel.theme)
                && Objects.equals(this.baseColor, styleNavigationPanel.baseColor)
                && Objects.equals(this.isOverridden, styleNavigationPanel.isOverridden)
                && Objects.equals(
                        this.additionalProperties, styleNavigationPanel.additionalProperties);
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
        return Objects.hash(theme, baseColor, isOverridden, additionalProperties);
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
        sb.append("class StyleNavigationPanel {\n");
        sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
        sb.append("    baseColor: ").append(toIndentedString(baseColor)).append("\n");
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
        openapiFields.add("theme");
        openapiFields.add("base_color");
        openapiFields.add("is_overridden");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StyleNavigationPanel
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleNavigationPanel.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleNavigationPanel is not found in"
                                        + " the empty JSON string",
                                StyleNavigationPanel.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull())
                && !jsonObj.get("theme").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `theme` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("theme").toString()));
        }
        // validate the optional field `theme`
        if (jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) {
            ThemeEnum.validateJsonElement(jsonObj.get("theme"));
        }
        if ((jsonObj.get("base_color") != null && !jsonObj.get("base_color").isJsonNull())
                && !jsonObj.get("base_color").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `base_color` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("base_color").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StyleNavigationPanel.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleNavigationPanel' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleNavigationPanel> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StyleNavigationPanel.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleNavigationPanel>() {
                        @Override
                        public void write(JsonWriter out, StyleNavigationPanel value)
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
                        public StyleNavigationPanel read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleNavigationPanel instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StyleNavigationPanel given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleNavigationPanel
     * @throws IOException if the JSON string is invalid with respect to StyleNavigationPanel
     */
    public static StyleNavigationPanel fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleNavigationPanel.class);
    }

    /**
     * Convert an instance of StyleNavigationPanel to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
