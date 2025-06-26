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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Specify that the association is enabled for the metadata object Default */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ActionConfigInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Position of the Custom action on the Metadata object. Earlier naming convention: context. */
    @JsonAdapter(PositionEnum.Adapter.class)
    public enum PositionEnum {
        MENU("MENU"),

        PRIMARY("PRIMARY"),

        CONTEXT_MENU("CONTEXT_MENU");

        private String value;

        PositionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PositionEnum fromValue(String value) {
            for (PositionEnum b : PositionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PositionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PositionEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PositionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PositionEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PositionEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    @javax.annotation.Nullable
    private PositionEnum position;

    public static final String SERIALIZED_NAME_VISIBILITY = "visibility";

    @SerializedName(SERIALIZED_NAME_VISIBILITY)
    @javax.annotation.Nullable
    private Boolean visibility;

    public ActionConfigInput() {}

    public ActionConfigInput position(@javax.annotation.Nullable PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * Position of the Custom action on the Metadata object. Earlier naming convention: context.
     *
     * @return position
     */
    @javax.annotation.Nullable
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(@javax.annotation.Nullable PositionEnum position) {
        this.position = position;
    }

    public ActionConfigInput visibility(@javax.annotation.Nullable Boolean visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of the metadata association with custom action. Earlier naming convention: enabled
     *
     * @return visibility
     */
    @javax.annotation.Nullable
    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(@javax.annotation.Nullable Boolean visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionConfigInput actionConfigInput = (ActionConfigInput) o;
        return Objects.equals(this.position, actionConfigInput.position)
                && Objects.equals(this.visibility, actionConfigInput.visibility);
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
        return Objects.hash(position, visibility);
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
        sb.append("class ActionConfigInput {\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
        openapiFields.add("position");
        openapiFields.add("visibility");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ActionConfigInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ActionConfigInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ActionConfigInput is not found in the"
                                        + " empty JSON string",
                                ActionConfigInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ActionConfigInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ActionConfigInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull())
                && !jsonObj.get("position").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `position` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("position").toString()));
        }
        // validate the optional field `position`
        if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) {
            PositionEnum.validateJsonElement(jsonObj.get("position"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ActionConfigInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ActionConfigInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ActionConfigInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ActionConfigInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ActionConfigInput>() {
                        @Override
                        public void write(JsonWriter out, ActionConfigInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ActionConfigInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ActionConfigInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ActionConfigInput
     * @throws IOException if the JSON string is invalid with respect to ActionConfigInput
     */
    public static ActionConfigInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ActionConfigInput.class);
    }

    /**
     * Convert an instance of ActionConfigInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
