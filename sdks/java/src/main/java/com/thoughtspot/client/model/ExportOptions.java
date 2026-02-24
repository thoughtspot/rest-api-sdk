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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Flags to specify additional options for export. This will only be active when UserDefinedId in
 * TML is enabled.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExportOptions implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_INCLUDE_OBJ_ID_REF = "include_obj_id_ref";

    @SerializedName(SERIALIZED_NAME_INCLUDE_OBJ_ID_REF)
    @javax.annotation.Nullable
    private Boolean includeObjIdRef = false;

    public static final String SERIALIZED_NAME_INCLUDE_GUID = "include_guid";

    @SerializedName(SERIALIZED_NAME_INCLUDE_GUID)
    @javax.annotation.Nullable
    private Boolean includeGuid = true;

    public static final String SERIALIZED_NAME_INCLUDE_OBJ_ID = "include_obj_id";

    @SerializedName(SERIALIZED_NAME_INCLUDE_OBJ_ID)
    @javax.annotation.Nullable
    private Boolean includeObjId = false;

    public static final String SERIALIZED_NAME_EXPORT_WITH_ASSOCIATED_FEEDBACKS =
            "export_with_associated_feedbacks";

    @SerializedName(SERIALIZED_NAME_EXPORT_WITH_ASSOCIATED_FEEDBACKS)
    @javax.annotation.Nullable
    private Boolean exportWithAssociatedFeedbacks = false;

    public static final String SERIALIZED_NAME_EXPORT_COLUMN_SECURITY_RULES =
            "export_column_security_rules";

    @SerializedName(SERIALIZED_NAME_EXPORT_COLUMN_SECURITY_RULES)
    @javax.annotation.Nullable
    private Boolean exportColumnSecurityRules = false;

    public static final String SERIALIZED_NAME_EXPORT_WITH_COLUMN_ALIASES =
            "export_with_column_aliases";

    @SerializedName(SERIALIZED_NAME_EXPORT_WITH_COLUMN_ALIASES)
    @javax.annotation.Nullable
    private Boolean exportWithColumnAliases = false;

    public ExportOptions() {}

    public ExportOptions includeObjIdRef(@javax.annotation.Nullable Boolean includeObjIdRef) {
        this.includeObjIdRef = includeObjIdRef;
        return this;
    }

    /**
     * Boolean Flag to export Object ID of referenced object. This flag will work only after the
     * Object ID feature has been enabled. Please contact support to enable the feature.
     *
     * @return includeObjIdRef
     */
    @javax.annotation.Nullable
    public Boolean getIncludeObjIdRef() {
        return includeObjIdRef;
    }

    public void setIncludeObjIdRef(@javax.annotation.Nullable Boolean includeObjIdRef) {
        this.includeObjIdRef = includeObjIdRef;
    }

    public ExportOptions includeGuid(@javax.annotation.Nullable Boolean includeGuid) {
        this.includeGuid = includeGuid;
        return this;
    }

    /**
     * Boolean flag to export guid of the object. This flag will work only after the Object ID
     * feature has been enabled. Please contact support to enable the feature.
     *
     * @return includeGuid
     */
    @javax.annotation.Nullable
    public Boolean getIncludeGuid() {
        return includeGuid;
    }

    public void setIncludeGuid(@javax.annotation.Nullable Boolean includeGuid) {
        this.includeGuid = includeGuid;
    }

    public ExportOptions includeObjId(@javax.annotation.Nullable Boolean includeObjId) {
        this.includeObjId = includeObjId;
        return this;
    }

    /**
     * Boolean flag to export Object ID of the object. This flag will work only after the Object ID
     * feature has been enabled. Please contact support to enable the feature.
     *
     * @return includeObjId
     */
    @javax.annotation.Nullable
    public Boolean getIncludeObjId() {
        return includeObjId;
    }

    public void setIncludeObjId(@javax.annotation.Nullable Boolean includeObjId) {
        this.includeObjId = includeObjId;
    }

    public ExportOptions exportWithAssociatedFeedbacks(
            @javax.annotation.Nullable Boolean exportWithAssociatedFeedbacks) {
        this.exportWithAssociatedFeedbacks = exportWithAssociatedFeedbacks;
        return this;
    }

    /**
     * Boolean flag indicating whether to export associated feedbacks of the object. This will only
     * be respected when the object can have feedbacks. Version: 10.7.0.cl or later
     *
     * @return exportWithAssociatedFeedbacks
     */
    @javax.annotation.Nullable
    public Boolean getExportWithAssociatedFeedbacks() {
        return exportWithAssociatedFeedbacks;
    }

    public void setExportWithAssociatedFeedbacks(
            @javax.annotation.Nullable Boolean exportWithAssociatedFeedbacks) {
        this.exportWithAssociatedFeedbacks = exportWithAssociatedFeedbacks;
    }

    public ExportOptions exportColumnSecurityRules(
            @javax.annotation.Nullable Boolean exportColumnSecurityRules) {
        this.exportColumnSecurityRules = exportColumnSecurityRules;
        return this;
    }

    /**
     * Boolean flag indicating whether to export column security rules of the object. This will only
     * be respected when the object can have column security rules and export_associated is true.
     * Version: 10.12.0.cl or later
     *
     * @return exportColumnSecurityRules
     */
    @javax.annotation.Nullable
    public Boolean getExportColumnSecurityRules() {
        return exportColumnSecurityRules;
    }

    public void setExportColumnSecurityRules(
            @javax.annotation.Nullable Boolean exportColumnSecurityRules) {
        this.exportColumnSecurityRules = exportColumnSecurityRules;
    }

    public ExportOptions exportWithColumnAliases(
            @javax.annotation.Nullable Boolean exportWithColumnAliases) {
        this.exportWithColumnAliases = exportWithColumnAliases;
        return this;
    }

    /**
     * Boolean flag indicating whether to export column aliases of the model. This will only be
     * respected when the object can have column aliases. Version: 10.13.0.cl or later
     *
     * @return exportWithColumnAliases
     */
    @javax.annotation.Nullable
    public Boolean getExportWithColumnAliases() {
        return exportWithColumnAliases;
    }

    public void setExportWithColumnAliases(
            @javax.annotation.Nullable Boolean exportWithColumnAliases) {
        this.exportWithColumnAliases = exportWithColumnAliases;
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
     * @return the ExportOptions instance itself
     */
    public ExportOptions putAdditionalProperty(String key, Object value) {
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
        ExportOptions exportOptions = (ExportOptions) o;
        return Objects.equals(this.includeObjIdRef, exportOptions.includeObjIdRef)
                && Objects.equals(this.includeGuid, exportOptions.includeGuid)
                && Objects.equals(this.includeObjId, exportOptions.includeObjId)
                && Objects.equals(
                        this.exportWithAssociatedFeedbacks,
                        exportOptions.exportWithAssociatedFeedbacks)
                && Objects.equals(
                        this.exportColumnSecurityRules, exportOptions.exportColumnSecurityRules)
                && Objects.equals(
                        this.exportWithColumnAliases, exportOptions.exportWithColumnAliases)
                && Objects.equals(this.additionalProperties, exportOptions.additionalProperties);
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
                includeObjIdRef,
                includeGuid,
                includeObjId,
                exportWithAssociatedFeedbacks,
                exportColumnSecurityRules,
                exportWithColumnAliases,
                additionalProperties);
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
        sb.append("class ExportOptions {\n");
        sb.append("    includeObjIdRef: ").append(toIndentedString(includeObjIdRef)).append("\n");
        sb.append("    includeGuid: ").append(toIndentedString(includeGuid)).append("\n");
        sb.append("    includeObjId: ").append(toIndentedString(includeObjId)).append("\n");
        sb.append("    exportWithAssociatedFeedbacks: ")
                .append(toIndentedString(exportWithAssociatedFeedbacks))
                .append("\n");
        sb.append("    exportColumnSecurityRules: ")
                .append(toIndentedString(exportColumnSecurityRules))
                .append("\n");
        sb.append("    exportWithColumnAliases: ")
                .append(toIndentedString(exportWithColumnAliases))
                .append("\n");
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
        openapiFields.add("include_obj_id_ref");
        openapiFields.add("include_guid");
        openapiFields.add("include_obj_id");
        openapiFields.add("export_with_associated_feedbacks");
        openapiFields.add("export_column_security_rules");
        openapiFields.add("export_with_column_aliases");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ExportOptions
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExportOptions.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ExportOptions is not found in the"
                                        + " empty JSON string",
                                ExportOptions.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExportOptions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExportOptions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExportOptions> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ExportOptions.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExportOptions>() {
                        @Override
                        public void write(JsonWriter out, ExportOptions value) throws IOException {
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
                        public ExportOptions read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            ExportOptions instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of ExportOptions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ExportOptions
     * @throws IOException if the JSON string is invalid with respect to ExportOptions
     */
    public static ExportOptions fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ExportOptions.class);
    }

    /**
     * Convert an instance of ExportOptions to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
