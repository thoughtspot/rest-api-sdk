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

/** SystemOverrideInfo */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SystemOverrideInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONFIG_OVERRIDE_INFO = "config_override_info";

    @SerializedName(SERIALIZED_NAME_CONFIG_OVERRIDE_INFO)
    @javax.annotation.Nullable
    private Object configOverrideInfo;

    public SystemOverrideInfo() {}

    public SystemOverrideInfo configOverrideInfo(
            @javax.annotation.Nullable Object configOverrideInfo) {
        this.configOverrideInfo = configOverrideInfo;
        return this;
    }

    /**
     * Get configOverrideInfo
     *
     * @return configOverrideInfo
     */
    @javax.annotation.Nullable
    public Object getConfigOverrideInfo() {
        return configOverrideInfo;
    }

    public void setConfigOverrideInfo(@javax.annotation.Nullable Object configOverrideInfo) {
        this.configOverrideInfo = configOverrideInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemOverrideInfo systemOverrideInfo = (SystemOverrideInfo) o;
        return Objects.equals(this.configOverrideInfo, systemOverrideInfo.configOverrideInfo);
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
        return Objects.hash(configOverrideInfo);
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
        sb.append("class SystemOverrideInfo {\n");
        sb.append("    configOverrideInfo: ")
                .append(toIndentedString(configOverrideInfo))
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
        openapiFields.add("config_override_info");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SystemOverrideInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SystemOverrideInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SystemOverrideInfo is not found in"
                                        + " the empty JSON string",
                                SystemOverrideInfo.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SystemOverrideInfo.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SystemOverrideInfo` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SystemOverrideInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SystemOverrideInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SystemOverrideInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SystemOverrideInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SystemOverrideInfo>() {
                        @Override
                        public void write(JsonWriter out, SystemOverrideInfo value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SystemOverrideInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SystemOverrideInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SystemOverrideInfo
     * @throws IOException if the JSON string is invalid with respect to SystemOverrideInfo
     */
    public static SystemOverrideInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SystemOverrideInfo.class);
    }

    /**
     * Convert an instance of SystemOverrideInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
