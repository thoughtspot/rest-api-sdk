/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.thoughtspot.client.JSON;

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
                && Objects.equals(this.URL, actionDetailsInput.URL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CALLBACK, URL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDetailsInput {\n");
        sb.append("    CALLBACK: ").append(toIndentedString(CALLBACK)).append("\n");
        sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ActionDetailsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ActionDetailsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
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
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ActionDetailsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
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
