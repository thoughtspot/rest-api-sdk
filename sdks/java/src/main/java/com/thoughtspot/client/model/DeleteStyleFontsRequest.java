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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DeleteStyleFontsRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DeleteStyleFontsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Scope of the font library to delete from. CLUSTER deletes from the cluster-level library. ORG
     * deletes from the authenticated user&#39;s org library. Defaults to ORG if omitted.
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
    private ScopeEnum scope;

    public static final String SERIALIZED_NAME_FONT_IDENTIFIERS = "font_identifiers";

    @SerializedName(SERIALIZED_NAME_FONT_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> fontIdentifiers;

    public static final String SERIALIZED_NAME_DRY_RUN = "dry_run";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    @javax.annotation.Nullable
    private Boolean dryRun;

    public DeleteStyleFontsRequest() {}

    public DeleteStyleFontsRequest scope(@javax.annotation.Nullable ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Scope of the font library to delete from. CLUSTER deletes from the cluster-level library. ORG
     * deletes from the authenticated user&#39;s org library. Defaults to ORG if omitted.
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

    public DeleteStyleFontsRequest fontIdentifiers(
            @javax.annotation.Nonnull List<String> fontIdentifiers) {
        this.fontIdentifiers = fontIdentifiers;
        return this;
    }

    public DeleteStyleFontsRequest addFontIdentifiersItem(String fontIdentifiersItem) {
        if (this.fontIdentifiers == null) {
            this.fontIdentifiers = new ArrayList<>();
        }
        this.fontIdentifiers.add(fontIdentifiersItem);
        return this;
    }

    /**
     * UUIDs or names of the fonts to delete. At least one identifier is required.
     *
     * @return fontIdentifiers
     */
    @javax.annotation.Nonnull
    public List<String> getFontIdentifiers() {
        return fontIdentifiers;
    }

    public void setFontIdentifiers(@javax.annotation.Nonnull List<String> fontIdentifiers) {
        this.fontIdentifiers = fontIdentifiers;
    }

    public DeleteStyleFontsRequest dryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * When true, returns affected assignments without applying the deletion. Use this to preview
     * the impact before committing. Defaults to true if omitted.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(@javax.annotation.Nullable Boolean dryRun) {
        this.dryRun = dryRun;
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
     * @return the DeleteStyleFontsRequest instance itself
     */
    public DeleteStyleFontsRequest putAdditionalProperty(String key, Object value) {
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
        DeleteStyleFontsRequest deleteStyleFontsRequest = (DeleteStyleFontsRequest) o;
        return Objects.equals(this.scope, deleteStyleFontsRequest.scope)
                && Objects.equals(this.fontIdentifiers, deleteStyleFontsRequest.fontIdentifiers)
                && Objects.equals(this.dryRun, deleteStyleFontsRequest.dryRun)
                && Objects.equals(
                        this.additionalProperties, deleteStyleFontsRequest.additionalProperties);
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
        return Objects.hash(scope, fontIdentifiers, dryRun, additionalProperties);
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
        sb.append("class DeleteStyleFontsRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    fontIdentifiers: ").append(toIndentedString(fontIdentifiers)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
        openapiFields.add("font_identifiers");
        openapiFields.add("dry_run");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("font_identifiers");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DeleteStyleFontsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeleteStyleFontsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteStyleFontsRequest is not found"
                                        + " in the empty JSON string",
                                DeleteStyleFontsRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeleteStyleFontsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
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
        // ensure the required json array is present
        if (jsonObj.get("font_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("font_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `font_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("font_identifiers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteStyleFontsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteStyleFontsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteStyleFontsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DeleteStyleFontsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteStyleFontsRequest>() {
                        @Override
                        public void write(JsonWriter out, DeleteStyleFontsRequest value)
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
                        public DeleteStyleFontsRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            DeleteStyleFontsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of DeleteStyleFontsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteStyleFontsRequest
     * @throws IOException if the JSON string is invalid with respect to DeleteStyleFontsRequest
     */
    public static DeleteStyleFontsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteStyleFontsRequest.class);
    }

    /**
     * Convert an instance of DeleteStyleFontsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
