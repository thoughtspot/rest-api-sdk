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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.thoughtspot.client.JSON;

/** LogResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class LogResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATE = "date";

    @SerializedName(SERIALIZED_NAME_DATE)
    @javax.annotation.Nonnull
    private String date;

    public static final String SERIALIZED_NAME_LOG = "log";

    @SerializedName(SERIALIZED_NAME_LOG)
    @javax.annotation.Nonnull
    private String log;

    public LogResponse() {}

    public LogResponse date(@javax.annotation.Nonnull String date) {
        this.date = date;
        return this;
    }

    /**
     * Date timestamp of the log entry
     *
     * @return date
     */
    @javax.annotation.Nonnull
    public String getDate() {
        return date;
    }

    public void setDate(@javax.annotation.Nonnull String date) {
        this.date = date;
    }

    public LogResponse log(@javax.annotation.Nonnull String log) {
        this.log = log;
        return this;
    }

    /**
     * Log data
     *
     * @return log
     */
    @javax.annotation.Nonnull
    public String getLog() {
        return log;
    }

    public void setLog(@javax.annotation.Nonnull String log) {
        this.log = log;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogResponse logResponse = (LogResponse) o;
        return Objects.equals(this.date, logResponse.date)
                && Objects.equals(this.log, logResponse.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, log);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogResponse {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
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
        openapiFields.add("date");
        openapiFields.add("log");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("date");
        openapiRequiredFields.add("log");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LogResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LogResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LogResponse is not found in the empty"
                                        + " JSON string",
                                LogResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LogResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LogResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LogResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("date").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `date` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("date").toString()));
        }
        if (!jsonObj.get("log").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `log` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("log").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LogResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LogResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LogResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LogResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LogResponse>() {
                        @Override
                        public void write(JsonWriter out, LogResponse value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LogResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LogResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LogResponse
     * @throws IOException if the JSON string is invalid with respect to LogResponse
     */
    public static LogResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LogResponse.class);
    }

    /**
     * Convert an instance of LogResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
