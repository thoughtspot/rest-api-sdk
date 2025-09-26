/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thoughtspot.client.JSON;

/**
 * Flags to specify additional options for export. This will only be active when UserDefinedId in TML is enabled.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
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

  public static final String SERIALIZED_NAME_EXPORT_WITH_ASSOCIATED_FEEDBACKS = "export_with_associated_feedbacks";
  @SerializedName(SERIALIZED_NAME_EXPORT_WITH_ASSOCIATED_FEEDBACKS)
  @javax.annotation.Nullable
  private Boolean exportWithAssociatedFeedbacks = false;

  public static final String SERIALIZED_NAME_EXPORT_COLUMN_SECURITY_RULES = "export_column_security_rules";
  @SerializedName(SERIALIZED_NAME_EXPORT_COLUMN_SECURITY_RULES)
  @javax.annotation.Nullable
  private Boolean exportColumnSecurityRules = false;

  public static final String SERIALIZED_NAME_EXPORT_WITH_COLUMN_ALIASES = "export_with_column_aliases";
  @SerializedName(SERIALIZED_NAME_EXPORT_WITH_COLUMN_ALIASES)
  @javax.annotation.Nullable
  private Boolean exportWithColumnAliases = false;

  public ExportOptions() {
  }

  public ExportOptions includeObjIdRef(@javax.annotation.Nullable Boolean includeObjIdRef) {
    this.includeObjIdRef = includeObjIdRef;
    return this;
  }

  /**
   * Boolean Flag to export Object ID of referenced object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature.
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
   * Boolean flag to export guid of the object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature.
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
   * Boolean flag to export Object ID of the object. This flag will work only after the Object ID feature has been enabled. Please contact support to enable the feature.
   * @return includeObjId
   */
  @javax.annotation.Nullable
  public Boolean getIncludeObjId() {
    return includeObjId;
  }

  public void setIncludeObjId(@javax.annotation.Nullable Boolean includeObjId) {
    this.includeObjId = includeObjId;
  }


  public ExportOptions exportWithAssociatedFeedbacks(@javax.annotation.Nullable Boolean exportWithAssociatedFeedbacks) {
    this.exportWithAssociatedFeedbacks = exportWithAssociatedFeedbacks;
    return this;
  }

  /**
   * Boolean flag indicating whether to export associated feedbacks of the object. This will only be respected when the object can have feedbacks.    Version: 10.7.0.cl or later 
   * @return exportWithAssociatedFeedbacks
   */
  @javax.annotation.Nullable
  public Boolean getExportWithAssociatedFeedbacks() {
    return exportWithAssociatedFeedbacks;
  }

  public void setExportWithAssociatedFeedbacks(@javax.annotation.Nullable Boolean exportWithAssociatedFeedbacks) {
    this.exportWithAssociatedFeedbacks = exportWithAssociatedFeedbacks;
  }


  public ExportOptions exportColumnSecurityRules(@javax.annotation.Nullable Boolean exportColumnSecurityRules) {
    this.exportColumnSecurityRules = exportColumnSecurityRules;
    return this;
  }

  /**
   * Boolean flag indicating whether to export column security rules of the object. This will only be respected when the object can have column security rules and export_associated is true.   Version: 10.12.0.cl or later 
   * @return exportColumnSecurityRules
   */
  @javax.annotation.Nullable
  public Boolean getExportColumnSecurityRules() {
    return exportColumnSecurityRules;
  }

  public void setExportColumnSecurityRules(@javax.annotation.Nullable Boolean exportColumnSecurityRules) {
    this.exportColumnSecurityRules = exportColumnSecurityRules;
  }


  public ExportOptions exportWithColumnAliases(@javax.annotation.Nullable Boolean exportWithColumnAliases) {
    this.exportWithColumnAliases = exportWithColumnAliases;
    return this;
  }

  /**
   * Boolean flag indicating whether to export column aliases of the model. This will only be respected when the object can have column aliases.   Version: 10.13.0.cl or later 
   * @return exportWithColumnAliases
   */
  @javax.annotation.Nullable
  public Boolean getExportWithColumnAliases() {
    return exportWithColumnAliases;
  }

  public void setExportWithColumnAliases(@javax.annotation.Nullable Boolean exportWithColumnAliases) {
    this.exportWithColumnAliases = exportWithColumnAliases;
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
    return Objects.equals(this.includeObjIdRef, exportOptions.includeObjIdRef) &&
        Objects.equals(this.includeGuid, exportOptions.includeGuid) &&
        Objects.equals(this.includeObjId, exportOptions.includeObjId) &&
        Objects.equals(this.exportWithAssociatedFeedbacks, exportOptions.exportWithAssociatedFeedbacks) &&
        Objects.equals(this.exportColumnSecurityRules, exportOptions.exportColumnSecurityRules) &&
        Objects.equals(this.exportWithColumnAliases, exportOptions.exportWithColumnAliases);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeObjIdRef, includeGuid, includeObjId, exportWithAssociatedFeedbacks, exportColumnSecurityRules, exportWithColumnAliases);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportOptions {\n");
    sb.append("    includeObjIdRef: ").append(toIndentedString(includeObjIdRef)).append("\n");
    sb.append("    includeGuid: ").append(toIndentedString(includeGuid)).append("\n");
    sb.append("    includeObjId: ").append(toIndentedString(includeObjId)).append("\n");
    sb.append("    exportWithAssociatedFeedbacks: ").append(toIndentedString(exportWithAssociatedFeedbacks)).append("\n");
    sb.append("    exportColumnSecurityRules: ").append(toIndentedString(exportColumnSecurityRules)).append("\n");
    sb.append("    exportWithColumnAliases: ").append(toIndentedString(exportWithColumnAliases)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
        if (!ExportOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportOptions is not found in the empty JSON string", ExportOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       final TypeAdapter<ExportOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportOptions>() {
           @Override
           public void write(JsonWriter out, ExportOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

