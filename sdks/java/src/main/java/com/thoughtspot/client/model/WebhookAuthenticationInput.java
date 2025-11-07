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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** WebhookAuthenticationInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class WebhookAuthenticationInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_A_P_I_K_E_Y = "API_KEY";

    @SerializedName(SERIALIZED_NAME_A_P_I_K_E_Y)
    @javax.annotation.Nullable
    private WebhookAuthApiKeyInput API_KEY;

    public static final String SERIALIZED_NAME_B_A_S_I_C_A_U_T_H = "BASIC_AUTH";

    @SerializedName(SERIALIZED_NAME_B_A_S_I_C_A_U_T_H)
    @javax.annotation.Nullable
    private WebhookAuthBasicAuthInput BASIC_AUTH;

    public static final String SERIALIZED_NAME_B_E_A_R_E_R_T_O_K_E_N = "BEARER_TOKEN";

    @SerializedName(SERIALIZED_NAME_B_E_A_R_E_R_T_O_K_E_N)
    @javax.annotation.Nullable
    private String BEARER_TOKEN;

    public static final String SERIALIZED_NAME_O_A_U_T_H2 = "OAUTH2";

    @SerializedName(SERIALIZED_NAME_O_A_U_T_H2)
    @javax.annotation.Nullable
    private WebhookAuthOAuth2Input OAUTH2;

    public WebhookAuthenticationInput() {}

    public WebhookAuthenticationInput API_KEY(
            @javax.annotation.Nullable WebhookAuthApiKeyInput API_KEY) {
        this.API_KEY = API_KEY;
        return this;
    }

    /**
     * Get API_KEY
     *
     * @return API_KEY
     */
    @javax.annotation.Nullable
    public WebhookAuthApiKeyInput getAPIKEY() {
        return API_KEY;
    }

    public void setAPIKEY(@javax.annotation.Nullable WebhookAuthApiKeyInput API_KEY) {
        this.API_KEY = API_KEY;
    }

    public WebhookAuthenticationInput BASIC_AUTH(
            @javax.annotation.Nullable WebhookAuthBasicAuthInput BASIC_AUTH) {
        this.BASIC_AUTH = BASIC_AUTH;
        return this;
    }

    /**
     * Get BASIC_AUTH
     *
     * @return BASIC_AUTH
     */
    @javax.annotation.Nullable
    public WebhookAuthBasicAuthInput getBASICAUTH() {
        return BASIC_AUTH;
    }

    public void setBASICAUTH(@javax.annotation.Nullable WebhookAuthBasicAuthInput BASIC_AUTH) {
        this.BASIC_AUTH = BASIC_AUTH;
    }

    public WebhookAuthenticationInput BEARER_TOKEN(@javax.annotation.Nullable String BEARER_TOKEN) {
        this.BEARER_TOKEN = BEARER_TOKEN;
        return this;
    }

    /**
     * Bearer token authentication configuration.
     *
     * @return BEARER_TOKEN
     */
    @javax.annotation.Nullable
    public String getBEARERTOKEN() {
        return BEARER_TOKEN;
    }

    public void setBEARERTOKEN(@javax.annotation.Nullable String BEARER_TOKEN) {
        this.BEARER_TOKEN = BEARER_TOKEN;
    }

    public WebhookAuthenticationInput OAUTH2(
            @javax.annotation.Nullable WebhookAuthOAuth2Input OAUTH2) {
        this.OAUTH2 = OAUTH2;
        return this;
    }

    /**
     * Get OAUTH2
     *
     * @return OAUTH2
     */
    @javax.annotation.Nullable
    public WebhookAuthOAuth2Input getOAUTH2() {
        return OAUTH2;
    }

    public void setOAUTH2(@javax.annotation.Nullable WebhookAuthOAuth2Input OAUTH2) {
        this.OAUTH2 = OAUTH2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookAuthenticationInput webhookAuthenticationInput = (WebhookAuthenticationInput) o;
        return Objects.equals(this.API_KEY, webhookAuthenticationInput.API_KEY)
                && Objects.equals(this.BASIC_AUTH, webhookAuthenticationInput.BASIC_AUTH)
                && Objects.equals(this.BEARER_TOKEN, webhookAuthenticationInput.BEARER_TOKEN)
                && Objects.equals(this.OAUTH2, webhookAuthenticationInput.OAUTH2);
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
        return Objects.hash(API_KEY, BASIC_AUTH, BEARER_TOKEN, OAUTH2);
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
        sb.append("class WebhookAuthenticationInput {\n");
        sb.append("    API_KEY: ").append(toIndentedString(API_KEY)).append("\n");
        sb.append("    BASIC_AUTH: ").append(toIndentedString(BASIC_AUTH)).append("\n");
        sb.append("    BEARER_TOKEN: ").append(toIndentedString(BEARER_TOKEN)).append("\n");
        sb.append("    OAUTH2: ").append(toIndentedString(OAUTH2)).append("\n");
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
        openapiFields.add("API_KEY");
        openapiFields.add("BASIC_AUTH");
        openapiFields.add("BEARER_TOKEN");
        openapiFields.add("OAUTH2");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookAuthenticationInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!WebhookAuthenticationInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in WebhookAuthenticationInput is not"
                                        + " found in the empty JSON string",
                                WebhookAuthenticationInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!WebhookAuthenticationInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `WebhookAuthenticationInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `API_KEY`
        if (jsonObj.get("API_KEY") != null && !jsonObj.get("API_KEY").isJsonNull()) {
            WebhookAuthApiKeyInput.validateJsonElement(jsonObj.get("API_KEY"));
        }
        // validate the optional field `BASIC_AUTH`
        if (jsonObj.get("BASIC_AUTH") != null && !jsonObj.get("BASIC_AUTH").isJsonNull()) {
            WebhookAuthBasicAuthInput.validateJsonElement(jsonObj.get("BASIC_AUTH"));
        }
        if ((jsonObj.get("BEARER_TOKEN") != null && !jsonObj.get("BEARER_TOKEN").isJsonNull())
                && !jsonObj.get("BEARER_TOKEN").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `BEARER_TOKEN` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("BEARER_TOKEN").toString()));
        }
        // validate the optional field `OAUTH2`
        if (jsonObj.get("OAUTH2") != null && !jsonObj.get("OAUTH2").isJsonNull()) {
            WebhookAuthOAuth2Input.validateJsonElement(jsonObj.get("OAUTH2"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookAuthenticationInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookAuthenticationInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WebhookAuthenticationInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(WebhookAuthenticationInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<WebhookAuthenticationInput>() {
                        @Override
                        public void write(JsonWriter out, WebhookAuthenticationInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public WebhookAuthenticationInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of WebhookAuthenticationInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookAuthenticationInput
     * @throws IOException if the JSON string is invalid with respect to WebhookAuthenticationInput
     */
    public static WebhookAuthenticationInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookAuthenticationInput.class);
    }

    /**
     * Convert an instance of WebhookAuthenticationInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
