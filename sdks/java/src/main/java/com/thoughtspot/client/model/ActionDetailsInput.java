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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Action details includes &#x60;Type&#x60; and configuration details of Custom Actions. Either
 * Callback or URL is required.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ActionDetailsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_C_A_L_L_B_A_C_K = "CALLBACK";

    @SerializedName(SERIALIZED_NAME_C_A_L_L_B_A_C_K)
    @javax.annotation.Nullable
    private CALLBACKInput CALLBACK;

    public static final String SERIALIZED_NAME_U_R_L = "URL";

    @SerializedName(SERIALIZED_NAME_U_R_L)
    @javax.annotation.Nullable
    private URLInput URL;

    public ActionDetailsInput() {}

    public ActionDetailsInput CALLBACK(@javax.annotation.Nullable CALLBACKInput CALLBACK) {
        this.CALLBACK = CALLBACK;
        return this;
    }

    /**
     * Get CALLBACK
     *
     * @return CALLBACK
     */
    @javax.annotation.Nullable
    public CALLBACKInput getCALLBACK() {
        return CALLBACK;
    }

    public void setCALLBACK(@javax.annotation.Nullable CALLBACKInput CALLBACK) {
        this.CALLBACK = CALLBACK;
    }

    public ActionDetailsInput URL(@javax.annotation.Nullable URLInput URL) {
        this.URL = URL;
        return this;
    }

    /**
     * Get URL
     *
     * @return URL
     */
    @javax.annotation.Nullable
    public URLInput getURL() {
        return URL;
    }

    public void setURL(@javax.annotation.Nullable URLInput URL) {
        this.URL = URL;
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
     * @return the ActionDetailsInput instance itself
     */
    public ActionDetailsInput putAdditionalProperty(String key, Object value) {
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
        ActionDetailsInput actionDetailsInput = (ActionDetailsInput) o;
        return Objects.equals(this.CALLBACK, actionDetailsInput.CALLBACK)
                && Objects.equals(this.URL, actionDetailsInput.URL)
                && Objects.equals(
                        this.additionalProperties, actionDetailsInput.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CALLBACK, URL, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDetailsInput {\n");
        sb.append("    CALLBACK: ").append(toIndentedString(CALLBACK)).append("\n");
        sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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
        openapiFields.add("CALLBACK");
        openapiFields.add("URL");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ActionDetailsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ActionDetailsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ActionDetailsInput is not found in"
                                        + " the empty JSON string",
                                ActionDetailsInput.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `CALLBACK`
        if (jsonObj.get("CALLBACK") != null && !jsonObj.get("CALLBACK").isJsonNull()) {
            CALLBACKInput.validateJsonElement(jsonObj.get("CALLBACK"));
        }
        // validate the optional field `URL`
        if (jsonObj.get("URL") != null && !jsonObj.get("URL").isJsonNull()) {
            URLInput.validateJsonElement(jsonObj.get("URL"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ActionDetailsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ActionDetailsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ActionDetailsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ActionDetailsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ActionDetailsInput>() {
                        @Override
                        public void write(JsonWriter out, ActionDetailsInput value)
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
                        public ActionDetailsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ActionDetailsInput instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ActionDetailsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ActionDetailsInput
     * @throws IOException if the JSON string is invalid with respect to ActionDetailsInput
     */
    public static ActionDetailsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ActionDetailsInput.class);
    }

    /**
     * Convert an instance of ActionDetailsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
