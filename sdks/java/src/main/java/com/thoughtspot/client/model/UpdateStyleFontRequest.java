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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** UpdateStyleFontRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateStyleFontRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Scope of the font library containing this font. CLUSTER targets the cluster-level library.
     * ORG targets the authenticated user&#39;s org library. Defaults to ORG if omitted.
     */
    @JsonAdapter(ScopeEnum.Adapter.class)
    public enum ScopeEnum {
        CLUSTER("CLUSTER"),

        ORG("ORG");

        private String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ScopeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ScopeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ScopeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ScopeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_SCOPE = "scope";

    @SerializedName(SERIALIZED_NAME_SCOPE)
    @javax.annotation.Nullable
    private ScopeEnum scope = ScopeEnum.ORG;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    /** New weight for the font. Supported values: NORMAL, LIGHT, BOLD. */
    @JsonAdapter(WeightEnum.Adapter.class)
    public enum WeightEnum {
        NORMAL("NORMAL"),

        LIGHT("LIGHT"),

        BOLD("BOLD");

        private String value;

        WeightEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static WeightEnum fromValue(String value) {
            for (WeightEnum b : WeightEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<WeightEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final WeightEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public WeightEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return WeightEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            WeightEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_WEIGHT = "weight";

    @SerializedName(SERIALIZED_NAME_WEIGHT)
    @javax.annotation.Nullable
    private WeightEnum weight;

    /** New style for the font. Supported values: NORMAL, ITALIC, OBLIQUE. */
    @JsonAdapter(StyleEnum.Adapter.class)
    public enum StyleEnum {
        NORMAL("NORMAL"),

        ITALIC("ITALIC"),

        OBLIQUE("OBLIQUE");

        private String value;

        StyleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StyleEnum fromValue(String value) {
            for (StyleEnum b : StyleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StyleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StyleEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StyleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StyleEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            StyleEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_STYLE = "style";

    @SerializedName(SERIALIZED_NAME_STYLE)
    @javax.annotation.Nullable
    private StyleEnum style;

    public static final String SERIALIZED_NAME_COLOR = "color";

    @SerializedName(SERIALIZED_NAME_COLOR)
    @javax.annotation.Nullable
    private String color;

    public UpdateStyleFontRequest() {}

    public UpdateStyleFontRequest scope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Scope of the font library containing this font. CLUSTER targets the cluster-level library.
     * ORG targets the authenticated user&#39;s org library. Defaults to ORG if omitted.
     *
     * @return scope
     */
    @javax.annotation.Nullable
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
    }

    public UpdateStyleFontRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * New display name for the font.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public UpdateStyleFontRequest weight(@javax.annotation.Nullable WeightEnum weight) {
        this.weight = weight;
        return this;
    }

    /**
     * New weight for the font. Supported values: NORMAL, LIGHT, BOLD.
     *
     * @return weight
     */
    @javax.annotation.Nullable
    public WeightEnum getWeight() {
        return weight;
    }

    public void setWeight(@javax.annotation.Nullable WeightEnum weight) {
        this.weight = weight;
    }

    public UpdateStyleFontRequest style(@javax.annotation.Nullable StyleEnum style) {
        this.style = style;
        return this;
    }

    /**
     * New style for the font. Supported values: NORMAL, ITALIC, OBLIQUE.
     *
     * @return style
     */
    @javax.annotation.Nullable
    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(@javax.annotation.Nullable StyleEnum style) {
        this.style = style;
    }

    public UpdateStyleFontRequest color(@javax.annotation.Nullable String color) {
        this.color = color;
        return this;
    }

    /**
     * New color for the font as a 6-digit hex string (e.g. \&quot;#333333\&quot;). Returns an error
     * if the value is malformed.
     *
     * @return color
     */
    @javax.annotation.Nullable
    public String getColor() {
        return color;
    }

    public void setColor(@javax.annotation.Nullable String color) {
        this.color = color;
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
     * @return the UpdateStyleFontRequest instance itself
     */
    public UpdateStyleFontRequest putAdditionalProperty(String key, Object value) {
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
        UpdateStyleFontRequest updateStyleFontRequest = (UpdateStyleFontRequest) o;
        return Objects.equals(this.scope, updateStyleFontRequest.scope)
                && Objects.equals(this.name, updateStyleFontRequest.name)
                && Objects.equals(this.weight, updateStyleFontRequest.weight)
                && Objects.equals(this.style, updateStyleFontRequest.style)
                && Objects.equals(this.color, updateStyleFontRequest.color)
                && Objects.equals(
                        this.additionalProperties, updateStyleFontRequest.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, name, weight, style, color, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStyleFontRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
        openapiFields.add("scope");
        openapiFields.add("name");
        openapiFields.add("weight");
        openapiFields.add("style");
        openapiFields.add("color");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateStyleFontRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateStyleFontRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateStyleFontRequest is not found"
                                        + " in the empty JSON string",
                                UpdateStyleFontRequest.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull())
                && !jsonObj.get("scope").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `scope` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("scope").toString()));
        }
        // validate the optional field `scope`
        if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
            ScopeEnum.validateJsonElement(jsonObj.get("scope"));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("weight") != null && !jsonObj.get("weight").isJsonNull())
                && !jsonObj.get("weight").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `weight` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("weight").toString()));
        }
        // validate the optional field `weight`
        if (jsonObj.get("weight") != null && !jsonObj.get("weight").isJsonNull()) {
            WeightEnum.validateJsonElement(jsonObj.get("weight"));
        }
        if ((jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull())
                && !jsonObj.get("style").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `style` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("style").toString()));
        }
        // validate the optional field `style`
        if (jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) {
            StyleEnum.validateJsonElement(jsonObj.get("style"));
        }
        if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull())
                && !jsonObj.get("color").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `color` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("color").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateStyleFontRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateStyleFontRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateStyleFontRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateStyleFontRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateStyleFontRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateStyleFontRequest value)
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
                        public UpdateStyleFontRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            UpdateStyleFontRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of UpdateStyleFontRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateStyleFontRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateStyleFontRequest
     */
    public static UpdateStyleFontRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateStyleFontRequest.class);
    }

    /**
     * Convert an instance of UpdateStyleFontRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
