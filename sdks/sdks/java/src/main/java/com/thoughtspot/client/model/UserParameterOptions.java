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

/**
 * Define attributes such as Runtime filters and Runtime parameters to send security entitlements to
 * a user session. For more information, see
 * [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UserParameterOptions implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_OBJECTS = "objects";

    @SerializedName(SERIALIZED_NAME_OBJECTS)
    @javax.annotation.Nullable
    private List<UserObject> objects;

    public static final String SERIALIZED_NAME_RUNTIME_FILTERS = "runtime_filters";

    @SerializedName(SERIALIZED_NAME_RUNTIME_FILTERS)
    @javax.annotation.Nullable
    private List<RuntimeFilters> runtimeFilters;

    public static final String SERIALIZED_NAME_RUNTIME_SORTS = "runtime_sorts";

    @SerializedName(SERIALIZED_NAME_RUNTIME_SORTS)
    @javax.annotation.Nullable
    private List<RuntimeSorts> runtimeSorts;

    public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

    @SerializedName(SERIALIZED_NAME_PARAMETERS)
    @javax.annotation.Nullable
    private List<RuntimeParameters> parameters;

    public UserParameterOptions() {}

    public UserParameterOptions objects(@javax.annotation.Nullable List<UserObject> objects) {
        this.objects = objects;
        return this;
    }

    public UserParameterOptions addObjectsItem(UserObject objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    /**
     * Get objects
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

    public UserParameterOptions runtimeFilters(
            @javax.annotation.Nullable List<RuntimeFilters> runtimeFilters) {
        this.runtimeFilters = runtimeFilters;
        return this;
    }

    public UserParameterOptions addRuntimeFiltersItem(RuntimeFilters runtimeFiltersItem) {
        if (this.runtimeFilters == null) {
            this.runtimeFilters = new ArrayList<>();
        }
        this.runtimeFilters.add(runtimeFiltersItem);
        return this;
    }

    /**
     * Objects to apply the User_Runtime_Filters. Examples to set the &#x60;runtime_filters&#x60; :
     * &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;,
     * \&quot;operator\&quot;: \&quot;EQ\&quot;, \&quot;values\&quot;: [\&quot;red\&quot;],
     * \&quot;persist\&quot;: false } &#x60;&#x60;&#x60;
     *
     * @return runtimeFilters
     */
    @javax.annotation.Nullable
    public List<RuntimeFilters> getRuntimeFilters() {
        return runtimeFilters;
    }

    public void setRuntimeFilters(@javax.annotation.Nullable List<RuntimeFilters> runtimeFilters) {
        this.runtimeFilters = runtimeFilters;
    }

    public UserParameterOptions runtimeSorts(
            @javax.annotation.Nullable List<RuntimeSorts> runtimeSorts) {
        this.runtimeSorts = runtimeSorts;
        return this;
    }

    public UserParameterOptions addRuntimeSortsItem(RuntimeSorts runtimeSortsItem) {
        if (this.runtimeSorts == null) {
            this.runtimeSorts = new ArrayList<>();
        }
        this.runtimeSorts.add(runtimeSortsItem);
        return this;
    }

    /**
     * Objects to apply the User_Runtime_Sorts. Examples to set the &#x60;runtime_sorts&#x60; :
     * &#x60;&#x60;&#x60;json { \&quot;column_name\&quot;: \&quot;Color\&quot;, \&quot;order\&quot;:
     * \&quot;ASC\&quot;, \&quot;persist\&quot;: false } &#x60;&#x60;&#x60;
     *
     * @return runtimeSorts
     */
    @javax.annotation.Nullable
    public List<RuntimeSorts> getRuntimeSorts() {
        return runtimeSorts;
    }

    public void setRuntimeSorts(@javax.annotation.Nullable List<RuntimeSorts> runtimeSorts) {
        this.runtimeSorts = runtimeSorts;
    }

    public UserParameterOptions parameters(
            @javax.annotation.Nullable List<RuntimeParameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public UserParameterOptions addParametersItem(RuntimeParameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Objects to apply the Runtime_Parameters. Examples to set the &#x60;parameters&#x60; :
     * &#x60;&#x60;&#x60;json { \&quot;name\&quot;: \&quot;Color\&quot;, \&quot;values\&quot;:
     * [\&quot;Blue\&quot;], \&quot;persist\&quot;: false } &#x60;&#x60;&#x60;
     *
     * @return parameters
     */
    @javax.annotation.Nullable
    public List<RuntimeParameters> getParameters() {
        return parameters;
    }

    public void setParameters(@javax.annotation.Nullable List<RuntimeParameters> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserParameterOptions userParameterOptions = (UserParameterOptions) o;
        return Objects.equals(this.objects, userParameterOptions.objects)
                && Objects.equals(this.runtimeFilters, userParameterOptions.runtimeFilters)
                && Objects.equals(this.runtimeSorts, userParameterOptions.runtimeSorts)
                && Objects.equals(this.parameters, userParameterOptions.parameters);
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
        return Objects.hash(objects, runtimeFilters, runtimeSorts, parameters);
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
        sb.append("class UserParameterOptions {\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("    runtimeFilters: ").append(toIndentedString(runtimeFilters)).append("\n");
        sb.append("    runtimeSorts: ").append(toIndentedString(runtimeSorts)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
        openapiFields.add("objects");
        openapiFields.add("runtime_filters");
        openapiFields.add("runtime_sorts");
        openapiFields.add("parameters");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UserParameterOptions
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UserParameterOptions.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UserParameterOptions is not found in"
                                        + " the empty JSON string",
                                UserParameterOptions.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UserParameterOptions.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UserParameterOptions` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        if (jsonObj.get("runtime_filters") != null
                && !jsonObj.get("runtime_filters").isJsonNull()) {
            JsonArray jsonArrayruntimeFilters = jsonObj.getAsJsonArray("runtime_filters");
            if (jsonArrayruntimeFilters != null) {
                // ensure the json data is an array
                if (!jsonObj.get("runtime_filters").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `runtime_filters` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("runtime_filters").toString()));
                }

                // validate the optional field `runtime_filters` (array)
                for (int i = 0; i < jsonArrayruntimeFilters.size(); i++) {
                    RuntimeFilters.validateJsonElement(jsonArrayruntimeFilters.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("runtime_sorts") != null && !jsonObj.get("runtime_sorts").isJsonNull()) {
            JsonArray jsonArrayruntimeSorts = jsonObj.getAsJsonArray("runtime_sorts");
            if (jsonArrayruntimeSorts != null) {
                // ensure the json data is an array
                if (!jsonObj.get("runtime_sorts").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `runtime_sorts` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("runtime_sorts").toString()));
                }

                // validate the optional field `runtime_sorts` (array)
                for (int i = 0; i < jsonArrayruntimeSorts.size(); i++) {
                    RuntimeSorts.validateJsonElement(jsonArrayruntimeSorts.get(i));
                }
                ;
            }
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
                    RuntimeParameters.validateJsonElement(jsonArrayparameters.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UserParameterOptions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UserParameterOptions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserParameterOptions> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UserParameterOptions.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UserParameterOptions>() {
                        @Override
                        public void write(JsonWriter out, UserParameterOptions value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UserParameterOptions read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UserParameterOptions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UserParameterOptions
     * @throws IOException if the JSON string is invalid with respect to UserParameterOptions
     */
    public static UserParameterOptions fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UserParameterOptions.class);
    }

    /**
     * Convert an instance of UserParameterOptions to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
