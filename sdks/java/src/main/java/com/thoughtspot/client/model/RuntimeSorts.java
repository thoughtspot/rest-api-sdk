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
import com.google.gson.annotations.JsonAdapter;
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

/** Objects to apply the Runtime_Sorts. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RuntimeSorts implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_COLUMN_NAME = "column_name";

    @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
    @javax.annotation.Nullable
    private String columnName;

    /** Order for the sort. */
    @JsonAdapter(OrderEnum.Adapter.class)
    public enum OrderEnum {
        ASC("ASC"),

        DESC("DESC");

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrderEnum fromValue(String value) {
            for (OrderEnum b : OrderEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrderEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OrderEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            OrderEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_ORDER = "order";

    @SerializedName(SERIALIZED_NAME_ORDER)
    @javax.annotation.Nullable
    private OrderEnum order;

    public static final String SERIALIZED_NAME_PERSIST = "persist";

    @SerializedName(SERIALIZED_NAME_PERSIST)
    @javax.annotation.Nullable
    private Boolean persist = false;

    public static final String SERIALIZED_NAME_OBJECTS = "objects";

    @SerializedName(SERIALIZED_NAME_OBJECTS)
    @javax.annotation.Nullable
    private List<UserObject> objects;

    public RuntimeSorts() {}

    public RuntimeSorts columnName(@javax.annotation.Nullable String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * The column name to apply filter.
     *
     * @return columnName
     */
    @javax.annotation.Nullable
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(@javax.annotation.Nullable String columnName) {
        this.columnName = columnName;
    }

    public RuntimeSorts order(@javax.annotation.Nullable OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * Order for the sort.
     *
     * @return order
     */
    @javax.annotation.Nullable
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(@javax.annotation.Nullable OrderEnum order) {
        this.order = order;
    }

    public RuntimeSorts persist(@javax.annotation.Nullable Boolean persist) {
        this.persist = persist;
        return this;
    }

    /**
     * Flag to persist the runtime sorts. Version: 9.12.0.cl or later
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

    public RuntimeSorts objects(@javax.annotation.Nullable List<UserObject> objects) {
        this.objects = objects;
        return this;
    }

    public RuntimeSorts addObjectsItem(UserObject objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    /**
     * Object to apply the runtime sort.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeSorts runtimeSorts = (RuntimeSorts) o;
        return Objects.equals(this.columnName, runtimeSorts.columnName)
                && Objects.equals(this.order, runtimeSorts.order)
                && Objects.equals(this.persist, runtimeSorts.persist)
                && Objects.equals(this.objects, runtimeSorts.objects);
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
        return Objects.hash(columnName, order, persist, objects);
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
        sb.append("class RuntimeSorts {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    persist: ").append(toIndentedString(persist)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
        openapiFields.add("column_name");
        openapiFields.add("order");
        openapiFields.add("persist");
        openapiFields.add("objects");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RuntimeSorts
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RuntimeSorts.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RuntimeSorts is not found in the"
                                        + " empty JSON string",
                                RuntimeSorts.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RuntimeSorts.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RuntimeSorts` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("column_name") != null && !jsonObj.get("column_name").isJsonNull())
                && !jsonObj.get("column_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `column_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("column_name").toString()));
        }
        if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull())
                && !jsonObj.get("order").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `order` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("order").toString()));
        }
        // validate the optional field `order`
        if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
            OrderEnum.validateJsonElement(jsonObj.get("order"));
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
            if (!RuntimeSorts.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuntimeSorts' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuntimeSorts> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RuntimeSorts.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RuntimeSorts>() {
                        @Override
                        public void write(JsonWriter out, RuntimeSorts value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RuntimeSorts read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RuntimeSorts given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RuntimeSorts
     * @throws IOException if the JSON string is invalid with respect to RuntimeSorts
     */
    public static RuntimeSorts fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RuntimeSorts.class);
    }

    /**
     * Convert an instance of RuntimeSorts to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
