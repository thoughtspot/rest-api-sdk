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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Metadata Search Response Object. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class MetadataSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";

    @SerializedName(SERIALIZED_NAME_METADATA_ID)
    @javax.annotation.Nullable
    private String metadataId;

    public static final String SERIALIZED_NAME_METADATA_NAME = "metadata_name";

    @SerializedName(SERIALIZED_NAME_METADATA_NAME)
    @javax.annotation.Nullable
    private String metadataName;

    /** Type of the metadata. */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LIVEBOARD("LIVEBOARD"),

        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        LOGICAL_COLUMN("LOGICAL_COLUMN"),

        CONNECTION("CONNECTION"),

        TAG("TAG"),

        USER("USER"),

        USER_GROUP("USER_GROUP"),

        LOGICAL_RELATIONSHIP("LOGICAL_RELATIONSHIP"),

        INSIGHT_SPEC("INSIGHT_SPEC");

        private String value;

        MetadataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MetadataTypeEnum fromValue(String value) {
            for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MetadataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MetadataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nonnull
    private MetadataTypeEnum metadataType;

    public static final String SERIALIZED_NAME_METADATA_OBJ_ID = "metadata_obj_id";

    @SerializedName(SERIALIZED_NAME_METADATA_OBJ_ID)
    @javax.annotation.Nullable
    private String metadataObjId;

    public static final String SERIALIZED_NAME_DEPENDENT_OBJECTS = "dependent_objects";

    @SerializedName(SERIALIZED_NAME_DEPENDENT_OBJECTS)
    @javax.annotation.Nullable
    private Object dependentObjects;

    public static final String SERIALIZED_NAME_INCOMPLETE_OBJECTS = "incomplete_objects";

    @SerializedName(SERIALIZED_NAME_INCOMPLETE_OBJECTS)
    @javax.annotation.Nullable
    private List<Object> incompleteObjects;

    public static final String SERIALIZED_NAME_METADATA_DETAIL = "metadata_detail";

    @SerializedName(SERIALIZED_NAME_METADATA_DETAIL)
    @javax.annotation.Nullable
    private Object metadataDetail;

    public static final String SERIALIZED_NAME_METADATA_HEADER = "metadata_header";

    @SerializedName(SERIALIZED_NAME_METADATA_HEADER)
    @javax.annotation.Nullable
    private Object metadataHeader;

    public static final String SERIALIZED_NAME_VISUALIZATION_HEADERS = "visualization_headers";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_HEADERS)
    @javax.annotation.Nullable
    private List<Object> visualizationHeaders;

    public static final String SERIALIZED_NAME_STATS = "stats";

    @SerializedName(SERIALIZED_NAME_STATS)
    @javax.annotation.Nullable
    private Object stats;

    public MetadataSearchResponse() {}

    public MetadataSearchResponse metadataId(@javax.annotation.Nullable String metadataId) {
        this.metadataId = metadataId;
        return this;
    }

    /**
     * Unique identifier of the metadata.
     *
     * @return metadataId
     */
    @javax.annotation.Nullable
    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(@javax.annotation.Nullable String metadataId) {
        this.metadataId = metadataId;
    }

    public MetadataSearchResponse metadataName(@javax.annotation.Nullable String metadataName) {
        this.metadataName = metadataName;
        return this;
    }

    /**
     * Name of the metadata.
     *
     * @return metadataName
     */
    @javax.annotation.Nullable
    public String getMetadataName() {
        return metadataName;
    }

    public void setMetadataName(@javax.annotation.Nullable String metadataName) {
        this.metadataName = metadataName;
    }

    public MetadataSearchResponse metadataType(
            @javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of the metadata.
     *
     * @return metadataType
     */
    @javax.annotation.Nonnull
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public MetadataSearchResponse metadataObjId(@javax.annotation.Nullable String metadataObjId) {
        this.metadataObjId = metadataObjId;
        return this;
    }

    /**
     * Custom identifier of the metadata. (Available from 10.8.0.cl onwards)
     *
     * @return metadataObjId
     */
    @javax.annotation.Nullable
    public String getMetadataObjId() {
        return metadataObjId;
    }

    public void setMetadataObjId(@javax.annotation.Nullable String metadataObjId) {
        this.metadataObjId = metadataObjId;
    }

    public MetadataSearchResponse dependentObjects(
            @javax.annotation.Nullable Object dependentObjects) {
        this.dependentObjects = dependentObjects;
        return this;
    }

    /**
     * Details of dependent objects of the metadata objects.
     *
     * @return dependentObjects
     */
    @javax.annotation.Nullable
    public Object getDependentObjects() {
        return dependentObjects;
    }

    public void setDependentObjects(@javax.annotation.Nullable Object dependentObjects) {
        this.dependentObjects = dependentObjects;
    }

    public MetadataSearchResponse incompleteObjects(
            @javax.annotation.Nullable List<Object> incompleteObjects) {
        this.incompleteObjects = incompleteObjects;
        return this;
    }

    public MetadataSearchResponse addIncompleteObjectsItem(Object incompleteObjectsItem) {
        if (this.incompleteObjects == null) {
            this.incompleteObjects = new ArrayList<>();
        }
        this.incompleteObjects.add(incompleteObjectsItem);
        return this;
    }

    /**
     * Details of incomplete information of the metadata objects if any.
     *
     * @return incompleteObjects
     */
    @javax.annotation.Nullable
    public List<Object> getIncompleteObjects() {
        return incompleteObjects;
    }

    public void setIncompleteObjects(@javax.annotation.Nullable List<Object> incompleteObjects) {
        this.incompleteObjects = incompleteObjects;
    }

    public MetadataSearchResponse metadataDetail(@javax.annotation.Nullable Object metadataDetail) {
        this.metadataDetail = metadataDetail;
        return this;
    }

    /**
     * Complete details of the metadata objects.
     *
     * @return metadataDetail
     */
    @javax.annotation.Nullable
    public Object getMetadataDetail() {
        return metadataDetail;
    }

    public void setMetadataDetail(@javax.annotation.Nullable Object metadataDetail) {
        this.metadataDetail = metadataDetail;
    }

    public MetadataSearchResponse metadataHeader(@javax.annotation.Nullable Object metadataHeader) {
        this.metadataHeader = metadataHeader;
        return this;
    }

    /**
     * Header information of the metadata objects.
     *
     * @return metadataHeader
     */
    @javax.annotation.Nullable
    public Object getMetadataHeader() {
        return metadataHeader;
    }

    public void setMetadataHeader(@javax.annotation.Nullable Object metadataHeader) {
        this.metadataHeader = metadataHeader;
    }

    public MetadataSearchResponse visualizationHeaders(
            @javax.annotation.Nullable List<Object> visualizationHeaders) {
        this.visualizationHeaders = visualizationHeaders;
        return this;
    }

    public MetadataSearchResponse addVisualizationHeadersItem(Object visualizationHeadersItem) {
        if (this.visualizationHeaders == null) {
            this.visualizationHeaders = new ArrayList<>();
        }
        this.visualizationHeaders.add(visualizationHeadersItem);
        return this;
    }

    /**
     * Visualization header information of the metadata objects.
     *
     * @return visualizationHeaders
     */
    @javax.annotation.Nullable
    public List<Object> getVisualizationHeaders() {
        return visualizationHeaders;
    }

    public void setVisualizationHeaders(
            @javax.annotation.Nullable List<Object> visualizationHeaders) {
        this.visualizationHeaders = visualizationHeaders;
    }

    public MetadataSearchResponse stats(@javax.annotation.Nullable Object stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Stats of the metadata object. Includes views, favorites, last_accessed.
     *
     * @return stats
     */
    @javax.annotation.Nullable
    public Object getStats() {
        return stats;
    }

    public void setStats(@javax.annotation.Nullable Object stats) {
        this.stats = stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataSearchResponse metadataSearchResponse = (MetadataSearchResponse) o;
        return Objects.equals(this.metadataId, metadataSearchResponse.metadataId)
                && Objects.equals(this.metadataName, metadataSearchResponse.metadataName)
                && Objects.equals(this.metadataType, metadataSearchResponse.metadataType)
                && Objects.equals(this.metadataObjId, metadataSearchResponse.metadataObjId)
                && Objects.equals(this.dependentObjects, metadataSearchResponse.dependentObjects)
                && Objects.equals(this.incompleteObjects, metadataSearchResponse.incompleteObjects)
                && Objects.equals(this.metadataDetail, metadataSearchResponse.metadataDetail)
                && Objects.equals(this.metadataHeader, metadataSearchResponse.metadataHeader)
                && Objects.equals(
                        this.visualizationHeaders, metadataSearchResponse.visualizationHeaders)
                && Objects.equals(this.stats, metadataSearchResponse.stats);
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
        return Objects.hash(
                metadataId,
                metadataName,
                metadataType,
                metadataObjId,
                dependentObjects,
                incompleteObjects,
                metadataDetail,
                metadataHeader,
                visualizationHeaders,
                stats);
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
        sb.append("class MetadataSearchResponse {\n");
        sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
        sb.append("    metadataName: ").append(toIndentedString(metadataName)).append("\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    metadataObjId: ").append(toIndentedString(metadataObjId)).append("\n");
        sb.append("    dependentObjects: ").append(toIndentedString(dependentObjects)).append("\n");
        sb.append("    incompleteObjects: ")
                .append(toIndentedString(incompleteObjects))
                .append("\n");
        sb.append("    metadataDetail: ").append(toIndentedString(metadataDetail)).append("\n");
        sb.append("    metadataHeader: ").append(toIndentedString(metadataHeader)).append("\n");
        sb.append("    visualizationHeaders: ")
                .append(toIndentedString(visualizationHeaders))
                .append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
        openapiFields.add("metadata_id");
        openapiFields.add("metadata_name");
        openapiFields.add("metadata_type");
        openapiFields.add("metadata_obj_id");
        openapiFields.add("dependent_objects");
        openapiFields.add("incomplete_objects");
        openapiFields.add("metadata_detail");
        openapiFields.add("metadata_header");
        openapiFields.add("visualization_headers");
        openapiFields.add("stats");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MetadataSearchResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!MetadataSearchResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in MetadataSearchResponse is not found"
                                        + " in the empty JSON string",
                                MetadataSearchResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!MetadataSearchResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `MetadataSearchResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : MetadataSearchResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("metadata_id") != null && !jsonObj.get("metadata_id").isJsonNull())
                && !jsonObj.get("metadata_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_id").toString()));
        }
        if ((jsonObj.get("metadata_name") != null && !jsonObj.get("metadata_name").isJsonNull())
                && !jsonObj.get("metadata_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_name").toString()));
        }
        if (!jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the required field `metadata_type`
        MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        if ((jsonObj.get("metadata_obj_id") != null && !jsonObj.get("metadata_obj_id").isJsonNull())
                && !jsonObj.get("metadata_obj_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_obj_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("metadata_obj_id").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("incomplete_objects") != null
                && !jsonObj.get("incomplete_objects").isJsonNull()
                && !jsonObj.get("incomplete_objects").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `incomplete_objects` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("incomplete_objects").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("visualization_headers") != null
                && !jsonObj.get("visualization_headers").isJsonNull()
                && !jsonObj.get("visualization_headers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_headers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("visualization_headers").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MetadataSearchResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MetadataSearchResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MetadataSearchResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(MetadataSearchResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<MetadataSearchResponse>() {
                        @Override
                        public void write(JsonWriter out, MetadataSearchResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public MetadataSearchResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of MetadataSearchResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MetadataSearchResponse
     * @throws IOException if the JSON string is invalid with respect to MetadataSearchResponse
     */
    public static MetadataSearchResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MetadataSearchResponse.class);
    }

    /**
     * Convert an instance of MetadataSearchResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
