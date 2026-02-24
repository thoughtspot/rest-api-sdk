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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Objects to apply the Runtime_Parameters. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RuntimeParameters implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_VALUES = "values";

    @SerializedName(SERIALIZED_NAME_VALUES)
    @javax.annotation.Nonnull
    private List<String> values;

    public static final String SERIALIZED_NAME_PERSIST = "persist";

    @SerializedName(SERIALIZED_NAME_PERSIST)
    @javax.annotation.Nullable
    private Boolean persist = false;

    public static final String SERIALIZED_NAME_OBJECTS = "objects";

    @SerializedName(SERIALIZED_NAME_OBJECTS)
    @javax.annotation.Nullable
    private List<UserObject> objects;

    public RuntimeParameters() {}

    public RuntimeParameters name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the parameter.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public RuntimeParameters values(@javax.annotation.Nonnull List<String> values) {
        this.values = values;
        return this;
    }

    public RuntimeParameters addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * The array of values.
     *
     * @return values
     */
    @javax.annotation.Nonnull
    public List<String> getValues() {
        return values;
    }

    public void setValues(@javax.annotation.Nonnull List<String> values) {
        this.values = values;
    }

    public RuntimeParameters persist(@javax.annotation.Nullable Boolean persist) {
        this.persist = persist;
        return this;
    }

    /**
     * Flag to persist the parameters. Version: 9.12.0.cl or later
     *
     * @return persist
     */
    @javax.annotation.Nullable
    public Boolean getPersist() {
        return persist;
    }

    public void setPersist(@javax.annotation.Nullable Boolean persist) {
        this.persist = persist;
    }

    public RuntimeParameters objects(@javax.annotation.Nullable List<UserObject> objects) {
        this.objects = objects;
        return this;
    }

    public RuntimeParameters addObjectsItem(UserObject objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    /**
     * Object to apply the runtime parameter.
     *
     * @return objects
     */
    @javax.annotation.Nullable
    public List<UserObject> getObjects() {
        return objects;
    }

    public void setObjects(@javax.annotation.Nullable List<UserObject> objects) {
        this.objects = objects;
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
     * @return the RuntimeParameters instance itself
     */
    public RuntimeParameters putAdditionalProperty(String key, Object value) {
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
        RuntimeParameters runtimeParameters = (RuntimeParameters) o;
        return Objects.equals(this.name, runtimeParameters.name)
                && Objects.equals(this.values, runtimeParameters.values)
                && Objects.equals(this.persist, runtimeParameters.persist)
                && Objects.equals(this.objects, runtimeParameters.objects)
                && Objects.equals(
                        this.additionalProperties, runtimeParameters.additionalProperties);
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
        return Objects.hash(name, values, persist, objects, additionalProperties);
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
        sb.append("class RuntimeParameters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    persist: ").append(toIndentedString(persist)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("values");
        openapiFields.add("persist");
        openapiFields.add("objects");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("values");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RuntimeParameters
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RuntimeParameters.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RuntimeParameters is not found in the"
                                        + " empty JSON string",
                                RuntimeParameters.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : RuntimeParameters.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("values") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `values` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("values").toString()));
        }
        if (jsonObj.get("objects") != null && !jsonObj.get("objects").isJsonNull()) {
            JsonArray jsonArrayobjects = jsonObj.getAsJsonArray("objects");
            if (jsonArrayobjects != null) {
                // ensure the json data is an array
                if (!jsonObj.get("objects").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `objects` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("objects").toString()));
                }

                // validate the optional field `objects` (array)
                for (int i = 0; i < jsonArrayobjects.size(); i++) {
                    UserObject.validateJsonElement(jsonArrayobjects.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RuntimeParameters.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuntimeParameters' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuntimeParameters> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RuntimeParameters.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RuntimeParameters>() {
                        @Override
                        public void write(JsonWriter out, RuntimeParameters value)
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
                        public RuntimeParameters read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            RuntimeParameters instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of RuntimeParameters given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RuntimeParameters
     * @throws IOException if the JSON string is invalid with respect to RuntimeParameters
     */
    public static RuntimeParameters fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RuntimeParameters.class);
    }

    /**
     * Convert an instance of RuntimeParameters to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
