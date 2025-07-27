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

/** PermissionOfPrincipalsResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PermissionOfPrincipalsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PRINCIPAL_PERMISSION_DETAILS =
            "principal_permission_details";

    @SerializedName(SERIALIZED_NAME_PRINCIPAL_PERMISSION_DETAILS)
    @javax.annotation.Nullable
    private Object principalPermissionDetails;

    public PermissionOfPrincipalsResponse() {}

    public PermissionOfPrincipalsResponse principalPermissionDetails(
            @javax.annotation.Nullable Object principalPermissionDetails) {
        this.principalPermissionDetails = principalPermissionDetails;
        return this;
    }

    /**
     * Get principalPermissionDetails
     *
     * @return principalPermissionDetails
     */
    @javax.annotation.Nullable
    public Object getPrincipalPermissionDetails() {
        return principalPermissionDetails;
    }

    public void setPrincipalPermissionDetails(
            @javax.annotation.Nullable Object principalPermissionDetails) {
        this.principalPermissionDetails = principalPermissionDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionOfPrincipalsResponse permissionOfPrincipalsResponse =
                (PermissionOfPrincipalsResponse) o;
        return Objects.equals(
                this.principalPermissionDetails,
                permissionOfPrincipalsResponse.principalPermissionDetails);
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
        return Objects.hash(principalPermissionDetails);
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
        sb.append("class PermissionOfPrincipalsResponse {\n");
        sb.append("    principalPermissionDetails: ")
                .append(toIndentedString(principalPermissionDetails))
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
        openapiFields.add("principal_permission_details");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     PermissionOfPrincipalsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PermissionOfPrincipalsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PermissionOfPrincipalsResponse is not"
                                        + " found in the empty JSON string",
                                PermissionOfPrincipalsResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PermissionOfPrincipalsResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PermissionOfPrincipalsResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PermissionOfPrincipalsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PermissionOfPrincipalsResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PermissionOfPrincipalsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(PermissionOfPrincipalsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PermissionOfPrincipalsResponse>() {
                        @Override
                        public void write(JsonWriter out, PermissionOfPrincipalsResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PermissionOfPrincipalsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PermissionOfPrincipalsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PermissionOfPrincipalsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     PermissionOfPrincipalsResponse
     */
    public static PermissionOfPrincipalsResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PermissionOfPrincipalsResponse.class);
    }

    /**
     * Convert an instance of PermissionOfPrincipalsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
