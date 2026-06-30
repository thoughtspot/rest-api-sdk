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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A single color entry in the chart color palette. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class StyleColorEntry implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PRIMARY = "primary";

    @SerializedName(SERIALIZED_NAME_PRIMARY)
    @javax.annotation.Nullable
    private String primary;

    public static final String SERIALIZED_NAME_SECONDARY = "secondary";

    @SerializedName(SERIALIZED_NAME_SECONDARY)
    @javax.annotation.Nullable
    private List<String> secondary;

    public StyleColorEntry() {}

    public StyleColorEntry primary(@javax.annotation.Nullable String primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Primary color as a 6-digit hex string.
     *
     * @return primary
     */
    @javax.annotation.Nullable
    public String getPrimary() {
        return primary;
    }

    public void setPrimary(@javax.annotation.Nullable String primary) {
        this.primary = primary;
    }

    public StyleColorEntry secondary(@javax.annotation.Nullable List<String> secondary) {
        this.secondary = secondary;
        return this;
    }

    public StyleColorEntry addSecondaryItem(String secondaryItem) {
        if (this.secondary == null) {
            this.secondary = new ArrayList<>();
        }
        this.secondary.add(secondaryItem);
        return this;
    }

    /**
     * Array of 4 secondary shade hex strings.
     *
     * @return secondary
     */
    @javax.annotation.Nullable
    public List<String> getSecondary() {
        return secondary;
    }

    public void setSecondary(@javax.annotation.Nullable List<String> secondary) {
        this.secondary = secondary;
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
     * @return the StyleColorEntry instance itself
     */
    public StyleColorEntry putAdditionalProperty(String key, Object value) {
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
        StyleColorEntry styleColorEntry = (StyleColorEntry) o;
        return Objects.equals(this.primary, styleColorEntry.primary)
                && Objects.equals(this.secondary, styleColorEntry.secondary)
                && Objects.equals(this.additionalProperties, styleColorEntry.additionalProperties);
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
        return Objects.hash(primary, secondary, additionalProperties);
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
        sb.append("class StyleColorEntry {\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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
        openapiFields.add("primary");
        openapiFields.add("secondary");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StyleColorEntry
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!StyleColorEntry.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in StyleColorEntry is not found in the"
                                        + " empty JSON string",
                                StyleColorEntry.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("primary") != null && !jsonObj.get("primary").isJsonNull())
                && !jsonObj.get("primary").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `primary` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("primary").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("secondary") != null
                && !jsonObj.get("secondary").isJsonNull()
                && !jsonObj.get("secondary").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `secondary` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("secondary").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StyleColorEntry.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StyleColorEntry' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StyleColorEntry> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(StyleColorEntry.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<StyleColorEntry>() {
                        @Override
                        public void write(JsonWriter out, StyleColorEntry value)
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
                        public StyleColorEntry read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            StyleColorEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of StyleColorEntry given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StyleColorEntry
     * @throws IOException if the JSON string is invalid with respect to StyleColorEntry
     */
    public static StyleColorEntry fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StyleColorEntry.class);
    }

    /**
     * Convert an instance of StyleColorEntry to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
