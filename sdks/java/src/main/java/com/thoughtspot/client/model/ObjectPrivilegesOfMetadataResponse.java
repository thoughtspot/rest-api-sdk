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

/** ObjectPrivilegesOfMetadataResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ObjectPrivilegesOfMetadataResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_OBJECT_PRIVILEGES =
            "metadata_object_privileges";

    @SerializedName(SERIALIZED_NAME_METADATA_OBJECT_PRIVILEGES)
    @javax.annotation.Nullable
    private Object metadataObjectPrivileges;

    public ObjectPrivilegesOfMetadataResponse() {}

    public ObjectPrivilegesOfMetadataResponse metadataObjectPrivileges(
            @javax.annotation.Nullable Object metadataObjectPrivileges) {
        this.metadataObjectPrivileges = metadataObjectPrivileges;
        return this;
    }

    /**
     * Get metadataObjectPrivileges
     *
     * @return metadataObjectPrivileges
     */
    @javax.annotation.Nullable
    public Object getMetadataObjectPrivileges() {
        return metadataObjectPrivileges;
    }

    public void setMetadataObjectPrivileges(
            @javax.annotation.Nullable Object metadataObjectPrivileges) {
        this.metadataObjectPrivileges = metadataObjectPrivileges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObjectPrivilegesOfMetadataResponse objectPrivilegesOfMetadataResponse =
                (ObjectPrivilegesOfMetadataResponse) o;
        return Objects.equals(
                this.metadataObjectPrivileges,
                objectPrivilegesOfMetadataResponse.metadataObjectPrivileges);
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
        return Objects.hash(metadataObjectPrivileges);
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
        sb.append("class ObjectPrivilegesOfMetadataResponse {\n");
        sb.append("    metadataObjectPrivileges: ")
                .append(toIndentedString(metadataObjectPrivileges))
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
        openapiFields.add("metadata_object_privileges");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ObjectPrivilegesOfMetadataResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ObjectPrivilegesOfMetadataResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ObjectPrivilegesOfMetadataResponse is"
                                        + " not found in the empty JSON string",
                                ObjectPrivilegesOfMetadataResponse.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ObjectPrivilegesOfMetadataResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `ObjectPrivilegesOfMetadataResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ObjectPrivilegesOfMetadataResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ObjectPrivilegesOfMetadataResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ObjectPrivilegesOfMetadataResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ObjectPrivilegesOfMetadataResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ObjectPrivilegesOfMetadataResponse>() {
                        @Override
                        public void write(JsonWriter out, ObjectPrivilegesOfMetadataResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ObjectPrivilegesOfMetadataResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ObjectPrivilegesOfMetadataResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ObjectPrivilegesOfMetadataResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     ObjectPrivilegesOfMetadataResponse
     */
    public static ObjectPrivilegesOfMetadataResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, ObjectPrivilegesOfMetadataResponse.class);
    }

    /**
     * Convert an instance of ObjectPrivilegesOfMetadataResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
