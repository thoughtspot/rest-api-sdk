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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** URL Custom Action Type */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class URL implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";

    @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
    @javax.annotation.Nullable
    private Authentication authentication;

    public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

    @SerializedName(SERIALIZED_NAME_PARAMETERS)
    @javax.annotation.Nullable
    private List<ParametersListItem> parameters;

    public static final String SERIALIZED_NAME_URL = "url";

    @SerializedName(SERIALIZED_NAME_URL)
    @javax.annotation.Nonnull
    private String url;

    public static final String SERIALIZED_NAME_REFERENCE = "reference";

    @SerializedName(SERIALIZED_NAME_REFERENCE)
    @javax.annotation.Nullable
    private String reference;

    public URL() {}

    public URL authentication(@javax.annotation.Nullable Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get authentication
     *
     * @return authentication
     */
    @javax.annotation.Nullable
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(@javax.annotation.Nullable Authentication authentication) {
        this.authentication = authentication;
    }

    public URL parameters(@javax.annotation.Nullable List<ParametersListItem> parameters) {
        this.parameters = parameters;
        return this;
    }

    public URL addParametersItem(ParametersListItem parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Query parameters for url.
     *
     * @return parameters
     */
    @javax.annotation.Nullable
    public List<ParametersListItem> getParameters() {
        return parameters;
    }

    public void setParameters(@javax.annotation.Nullable List<ParametersListItem> parameters) {
        this.parameters = parameters;
    }

    public URL url(@javax.annotation.Nonnull String url) {
        this.url = url;
        return this;
    }

    /**
     * Request Url for the Custom action.
     *
     * @return url
     */
    @javax.annotation.Nonnull
    public String getUrl() {
        return url;
    }

    public void setUrl(@javax.annotation.Nonnull String url) {
        this.url = url;
    }

    public URL reference(@javax.annotation.Nullable String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Reference name of the SDK. By default, the value will be set to action name.
     *
     * @return reference
     */
    @javax.annotation.Nullable
    public String getReference() {
        return reference;
    }

    public void setReference(@javax.annotation.Nullable String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        URL URL = (URL) o;
        return Objects.equals(this.authentication, URL.authentication)
                && Objects.equals(this.parameters, URL.parameters)
                && Objects.equals(this.url, URL.url)
                && Objects.equals(this.reference, URL.reference);
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
        return Objects.hash(authentication, parameters, url, reference);
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
        sb.append("class URL {\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
        openapiFields.add("authentication");
        openapiFields.add("parameters");
        openapiFields.add("url");
        openapiFields.add("reference");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("url");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to URL
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!URL.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in URL is not found in the empty JSON"
                                        + " string",
                                URL.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!URL.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `URL`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : URL.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `authentication`
        if (jsonObj.get("authentication") != null && !jsonObj.get("authentication").isJsonNull()) {
            Authentication.validateJsonElement(jsonObj.get("authentication"));
        }
        if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
            JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
            if (jsonArrayparameters != null) {
                // ensure the json data is an array
                if (!jsonObj.get("parameters").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `parameters` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("parameters").toString()));
                }

                // validate the optional field `parameters` (array)
                for (int i = 0; i < jsonArrayparameters.size(); i++) {
                    ParametersListItem.validateJsonElement(jsonArrayparameters.get(i));
                }
                ;
            }
        }
        if (!jsonObj.get("url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `url` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("url").toString()));
        }
        if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull())
                && !jsonObj.get("reference").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `reference` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("reference").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!URL.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'URL' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<URL> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(URL.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<URL>() {
                        @Override
                        public void write(JsonWriter out, URL value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public URL read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of URL given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of URL
     * @throws IOException if the JSON string is invalid with respect to URL
     */
    public static URL fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, URL.class);
    }

    /**
     * Convert an instance of URL to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
