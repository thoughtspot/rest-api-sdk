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
import com.google.gson.annotations.JsonAdapter;
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

/** A custom font record in the font library. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleFontRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    /** Scope indicating whether this font belongs to the cluster or org library. */
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
            return null;
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
    private ScopeEnum scope;

    public static final String SERIALIZED_NAME_ORG = "org";

    @SerializedName(SERIALIZED_NAME_ORG)
    @javax.annotation.Nullable
    private StyleOrgInfo org;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    /** Weight of the font. */
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
            return null;
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

    /** Style of the font. */
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
            return null;
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

    public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";

    @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float creationTimeInMillis;

    public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";

    @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
    @javax.annotation.Nullable
    private List<StyleFontAssignment> assignments;

    public StyleFontRecord() {}

    public StyleFontRecord id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique UUID identifier of the font.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nonnull String id) {
        this.id = id;
    }

    public StyleFontRecord scope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Scope indicating whether this font belongs to the cluster or org library.
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

    public StyleFontRecord org(@javax.annotation.Nullable StyleOrgInfo org) {
        this.org = org;
        return this;
    }

    /**
     * Get org
     *
     * @return org
     */
    @javax.annotation.Nullable
    public StyleOrgInfo getOrg() {
        return org;
    }

    public void setOrg(@javax.annotation.Nullable StyleOrgInfo org) {
        this.org = org;
    }

    public StyleFontRecord name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Display name of the font.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public StyleFontRecord weight(@javax.annotation.Nullable WeightEnum weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Weight of the font.
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

    public StyleFontRecord style(@javax.annotation.Nullable StyleEnum style) {
        this.style = style;
        return this;
    }

    /**
     * Style of the font.
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

    public StyleFontRecord color(@javax.annotation.Nullable String color) {
        this.color = color;
        return this;
    }

    /**
     * Color of the font as a 6-digit hex string.
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

    public StyleFontRecord creationTimeInMillis(
            @javax.annotation.Nullable Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
        return this;
    }

    /**
     * Timestamp in milliseconds when the font was uploaded.
     *
     * @return creationTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getCreationTimeInMillis() {
        return creationTimeInMillis;
    }

    public void setCreationTimeInMillis(@javax.annotation.Nullable Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    public StyleFontRecord assignments(
            @javax.annotation.Nullable List<StyleFontAssignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    public StyleFontRecord addAssignmentsItem(StyleFontAssignment assignmentsItem) {
        if (this.assignments == null) {
            this.assignments = new ArrayList<>();
        }
        this.assignments.add(assignmentsItem);
        return this;
    }

    /**
     * Visualization areas currently assigned to this font. Empty if not assigned to any area.
     * Populated only when include_font_assignments is true.
     *
     * @return assignments
     */
    @javax.annotation.Nullable
    public List<StyleFontAssignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(@javax.annotation.Nullable List<StyleFontAssignment> assignments) {
        this.assignments = assignments;
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
     * @return the StyleFontRecord instance itself
     */
    public StyleFontRecord putAdditionalProperty(String key, Object value) {
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
        StyleFontRecord styleFontRecord = (StyleFontRecord) o;
        return Objects.equals(this.id, styleFontRecord.id)
                && Objects.equals(this.scope, styleFontRecord.scope)
                && Objects.equals(this.org, styleFontRecord.org)
                && Objects.equals(this.name, styleFontRecord.name)
                && Objects.equals(this.weight, styleFontRecord.weight)
                && Objects.equals(this.style, styleFontRecord.style)
                && Objects.equals(this.color, styleFontRecord.color)
                && Objects.equals(this.creationTimeInMillis, styleFontRecord.creationTimeInMillis)
                && Objects.equals(this.assignments, styleFontRecord.assignments)
                && Objects.equals(this.additionalProperties, styleFontRecord.additionalProperties);
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
        return Objects.hash(
                id,
                scope,
                org,
                name,
                weight,
                style,
                color,
                creationTimeInMillis,
                assignments,
                additionalProperties);
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
        sb.append("class StyleFontRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    org: ").append(toIndentedString(org)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    creationTimeInMillis: ")
                .append(toIndentedString(creationTimeInMillis))
                .append("\n");
        sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("scope");
        openapiFields.add("org");
        openapiFields.add("name");
        openapiFields.add("weight");
        openapiFields.add("style");
        openapiFields.add("color");
        openapiFields.add("creation_time_in_millis");
        openapiFields.add("assignments");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StyleFontRecord
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleFontRecord.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleFontRecord is not found in the"
                                        + " empty JSON string",
                                StyleFontRecord.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : StyleFontRecord.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
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
        // validate the optional field `org`
        if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
            StyleOrgInfo.validateJsonElement(jsonObj.get("org"));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
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
        if (jsonObj.get("assignments") != null && !jsonObj.get("assignments").isJsonNull()) {
            JsonArray jsonArrayassignments = jsonObj.getAsJsonArray("assignments");
            if (jsonArrayassignments != null) {
                // ensure the json data is an array
                if (!jsonObj.get("assignments").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `assignments` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("assignments").toString()));
                }

                // validate the optional field `assignments` (array)
                for (int i = 0; i < jsonArrayassignments.size(); i++) {
                    StyleFontAssignment.validateJsonElement(jsonArrayassignments.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StyleFontRecord.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleFontRecord' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleFontRecord> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StyleFontRecord.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleFontRecord>() {
                        @Override
                        public void write(JsonWriter out, StyleFontRecord value)
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
                        public StyleFontRecord read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleFontRecord instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StyleFontRecord given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleFontRecord
     * @throws IOException if the JSON string is invalid with respect to StyleFontRecord
     */
    public static StyleFontRecord fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleFontRecord.class);
    }

    /**
     * Convert an instance of StyleFontRecord to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
