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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.JSON;

/** UserInfo */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public UserInfo() {}

    public UserInfo id(@javax.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Id.
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

    public UserInfo name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(this.id, userInfo.id) && Objects.equals(this.name, userInfo.name);
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
        return Objects.hash(id, name);
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
        sb.append("class UserInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        openapiFields.add("name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UserInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UserInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UserInfo is not found in the empty"
                                        + " JSON string",
                                UserInfo.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UserInfo.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UserInfo` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UserInfo.openapiRequiredFields) {
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
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UserInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UserInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UserInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UserInfo>() {
                        @Override
                        public void write(JsonWriter out, UserInfo value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UserInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UserInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UserInfo
     * @throws IOException if the JSON string is invalid with respect to UserInfo
     */
    public static UserInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UserInfo.class);
    }

    /**
     * Convert an instance of UserInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
