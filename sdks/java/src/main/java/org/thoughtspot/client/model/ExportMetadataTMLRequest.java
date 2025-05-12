/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.ExportMetadataTypeInput;
import org.thoughtspot.client.model.ExportOptions;
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

import org.thoughtspot.client.JSON;

/**
 * ExportMetadataTMLRequest
 */

public class ExportMetadataTMLRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nonnull
  private List<ExportMetadataTypeInput> metadata;

  public static final String SERIALIZED_NAME_EXPORT_ASSOCIATED = "export_associated";
  @SerializedName(SERIALIZED_NAME_EXPORT_ASSOCIATED)
  @javax.annotation.Nullable
  private Boolean exportAssociated = false;

  public static final String SERIALIZED_NAME_EXPORT_FQN = "export_fqn";
  @SerializedName(SERIALIZED_NAME_EXPORT_FQN)
  @javax.annotation.Nullable
  private Boolean exportFqn = false;

  /**
   * TML EDOC content format.  **Note: exporting in YAML format currently requires manual formatting of the output. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
   */
  @JsonAdapter(EdocFormatEnum.Adapter.class)
  public enum EdocFormatEnum {
    JSON("JSON"),
    
    YAML("YAML");

    private String value;

    EdocFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EdocFormatEnum fromValue(String value) {
      for (EdocFormatEnum b : EdocFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EdocFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EdocFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EdocFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EdocFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EdocFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EDOC_FORMAT = "edoc_format";
  @SerializedName(SERIALIZED_NAME_EDOC_FORMAT)
  @javax.annotation.Nullable
  private EdocFormatEnum edocFormat = EdocFormatEnum.JSON;

  /**
   * Indicates whether to export worksheet TML in DEFAULT or V1 or V2 version.
   */
  @JsonAdapter(ExportSchemaVersionEnum.Adapter.class)
  public enum ExportSchemaVersionEnum {
    DEFAULT("DEFAULT"),
    
    V1("V1"),
    
    V2("V2");

    private String value;

    ExportSchemaVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExportSchemaVersionEnum fromValue(String value) {
      for (ExportSchemaVersionEnum b : ExportSchemaVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExportSchemaVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExportSchemaVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExportSchemaVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExportSchemaVersionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExportSchemaVersionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXPORT_SCHEMA_VERSION = "export_schema_version";
  @SerializedName(SERIALIZED_NAME_EXPORT_SCHEMA_VERSION)
  @javax.annotation.Nullable
  private ExportSchemaVersionEnum exportSchemaVersion = ExportSchemaVersionEnum.DEFAULT;

  public static final String SERIALIZED_NAME_EXPORT_DEPENDENT = "export_dependent";
  @SerializedName(SERIALIZED_NAME_EXPORT_DEPENDENT)
  @javax.annotation.Nullable
  private Boolean exportDependent = false;

  public static final String SERIALIZED_NAME_EXPORT_CONNECTION_AS_DEPENDENT = "export_connection_as_dependent";
  @SerializedName(SERIALIZED_NAME_EXPORT_CONNECTION_AS_DEPENDENT)
  @javax.annotation.Nullable
  private Boolean exportConnectionAsDependent = false;

  public static final String SERIALIZED_NAME_ALL_ORGS_OVERRIDE = "all_orgs_override";
  @SerializedName(SERIALIZED_NAME_ALL_ORGS_OVERRIDE)
  @javax.annotation.Nullable
  private Boolean allOrgsOverride = false;

  public static final String SERIALIZED_NAME_EXPORT_OPTIONS = "export_options";
  @SerializedName(SERIALIZED_NAME_EXPORT_OPTIONS)
  @javax.annotation.Nullable
  private ExportOptions exportOptions;

  public ExportMetadataTMLRequest() {
  }

  public ExportMetadataTMLRequest metadata(@javax.annotation.Nonnull List<ExportMetadataTypeInput> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ExportMetadataTMLRequest addMetadataItem(ExportMetadataTypeInput metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Metadata objects.
   * @return metadata
   */
  @javax.annotation.Nonnull
  public List<ExportMetadataTypeInput> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nonnull List<ExportMetadataTypeInput> metadata) {
    this.metadata = metadata;
  }


  public ExportMetadataTMLRequest exportAssociated(@javax.annotation.Nullable Boolean exportAssociated) {
    this.exportAssociated = exportAssociated;
    return this;
  }

  /**
   * Indicates whether to export associated metadata objects of specified metadata objects.
   * @return exportAssociated
   */
  @javax.annotation.Nullable
  public Boolean getExportAssociated() {
    return exportAssociated;
  }

  public void setExportAssociated(@javax.annotation.Nullable Boolean exportAssociated) {
    this.exportAssociated = exportAssociated;
  }


  public ExportMetadataTMLRequest exportFqn(@javax.annotation.Nullable Boolean exportFqn) {
    this.exportFqn = exportFqn;
    return this;
  }

  /**
   * Adds FQNs of the referenced objects. For example, if you are exporting a Liveboard and its associated objects, the API returns the Liveboard TML data with the FQNs of the referenced worksheet. If the exported TML data includes FQNs, you don&#39;t need to manually add FQNs of the referenced objects during TML import.
   * @return exportFqn
   */
  @javax.annotation.Nullable
  public Boolean getExportFqn() {
    return exportFqn;
  }

  public void setExportFqn(@javax.annotation.Nullable Boolean exportFqn) {
    this.exportFqn = exportFqn;
  }


  public ExportMetadataTMLRequest edocFormat(@javax.annotation.Nullable EdocFormatEnum edocFormat) {
    this.edocFormat = edocFormat;
    return this;
  }

  /**
   * TML EDOC content format.  **Note: exporting in YAML format currently requires manual formatting of the output. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
   * @return edocFormat
   */
  @javax.annotation.Nullable
  public EdocFormatEnum getEdocFormat() {
    return edocFormat;
  }

  public void setEdocFormat(@javax.annotation.Nullable EdocFormatEnum edocFormat) {
    this.edocFormat = edocFormat;
  }


  public ExportMetadataTMLRequest exportSchemaVersion(@javax.annotation.Nullable ExportSchemaVersionEnum exportSchemaVersion) {
    this.exportSchemaVersion = exportSchemaVersion;
    return this;
  }

  /**
   * Indicates whether to export worksheet TML in DEFAULT or V1 or V2 version.
   * @return exportSchemaVersion
   */
  @javax.annotation.Nullable
  public ExportSchemaVersionEnum getExportSchemaVersion() {
    return exportSchemaVersion;
  }

  public void setExportSchemaVersion(@javax.annotation.Nullable ExportSchemaVersionEnum exportSchemaVersion) {
    this.exportSchemaVersion = exportSchemaVersion;
  }


  public ExportMetadataTMLRequest exportDependent(@javax.annotation.Nullable Boolean exportDependent) {
    this.exportDependent = exportDependent;
    return this;
  }

  /**
   * Indicates whether to export table while exporting connection.
   * @return exportDependent
   */
  @javax.annotation.Nullable
  public Boolean getExportDependent() {
    return exportDependent;
  }

  public void setExportDependent(@javax.annotation.Nullable Boolean exportDependent) {
    this.exportDependent = exportDependent;
  }


  public ExportMetadataTMLRequest exportConnectionAsDependent(@javax.annotation.Nullable Boolean exportConnectionAsDependent) {
    this.exportConnectionAsDependent = exportConnectionAsDependent;
    return this;
  }

  /**
   * Indicates whether to export connection as dependent while exporting table/worksheet/answer/liveboard. This will only be active when export_associated is true.
   * @return exportConnectionAsDependent
   */
  @javax.annotation.Nullable
  public Boolean getExportConnectionAsDependent() {
    return exportConnectionAsDependent;
  }

  public void setExportConnectionAsDependent(@javax.annotation.Nullable Boolean exportConnectionAsDependent) {
    this.exportConnectionAsDependent = exportConnectionAsDependent;
  }


  public ExportMetadataTMLRequest allOrgsOverride(@javax.annotation.Nullable Boolean allOrgsOverride) {
    this.allOrgsOverride = allOrgsOverride;
    return this;
  }

  /**
   * Indicates whether to export is happening from all orgs context.
   * @return allOrgsOverride
   */
  @javax.annotation.Nullable
  public Boolean getAllOrgsOverride() {
    return allOrgsOverride;
  }

  public void setAllOrgsOverride(@javax.annotation.Nullable Boolean allOrgsOverride) {
    this.allOrgsOverride = allOrgsOverride;
  }


  public ExportMetadataTMLRequest exportOptions(@javax.annotation.Nullable ExportOptions exportOptions) {
    this.exportOptions = exportOptions;
    return this;
  }

  /**
   * Flags to specify additional options for export.    Version: 10.6.0.cl or later 
   * @return exportOptions
   */
  @javax.annotation.Nullable
  public ExportOptions getExportOptions() {
    return exportOptions;
  }

  public void setExportOptions(@javax.annotation.Nullable ExportOptions exportOptions) {
    this.exportOptions = exportOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportMetadataTMLRequest exportMetadataTMLRequest = (ExportMetadataTMLRequest) o;
    return Objects.equals(this.metadata, exportMetadataTMLRequest.metadata) &&
        Objects.equals(this.exportAssociated, exportMetadataTMLRequest.exportAssociated) &&
        Objects.equals(this.exportFqn, exportMetadataTMLRequest.exportFqn) &&
        Objects.equals(this.edocFormat, exportMetadataTMLRequest.edocFormat) &&
        Objects.equals(this.exportSchemaVersion, exportMetadataTMLRequest.exportSchemaVersion) &&
        Objects.equals(this.exportDependent, exportMetadataTMLRequest.exportDependent) &&
        Objects.equals(this.exportConnectionAsDependent, exportMetadataTMLRequest.exportConnectionAsDependent) &&
        Objects.equals(this.allOrgsOverride, exportMetadataTMLRequest.allOrgsOverride) &&
        Objects.equals(this.exportOptions, exportMetadataTMLRequest.exportOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, exportAssociated, exportFqn, edocFormat, exportSchemaVersion, exportDependent, exportConnectionAsDependent, allOrgsOverride, exportOptions);
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
    sb.append("class ExportMetadataTMLRequest {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    exportAssociated: ").append(toIndentedString(exportAssociated)).append("\n");
    sb.append("    exportFqn: ").append(toIndentedString(exportFqn)).append("\n");
    sb.append("    edocFormat: ").append(toIndentedString(edocFormat)).append("\n");
    sb.append("    exportSchemaVersion: ").append(toIndentedString(exportSchemaVersion)).append("\n");
    sb.append("    exportDependent: ").append(toIndentedString(exportDependent)).append("\n");
    sb.append("    exportConnectionAsDependent: ").append(toIndentedString(exportConnectionAsDependent)).append("\n");
    sb.append("    allOrgsOverride: ").append(toIndentedString(allOrgsOverride)).append("\n");
    sb.append("    exportOptions: ").append(toIndentedString(exportOptions)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("export_associated");
    openapiFields.add("export_fqn");
    openapiFields.add("edoc_format");
    openapiFields.add("export_schema_version");
    openapiFields.add("export_dependent");
    openapiFields.add("export_connection_as_dependent");
    openapiFields.add("all_orgs_override");
    openapiFields.add("export_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExportMetadataTMLRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportMetadataTMLRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportMetadataTMLRequest is not found in the empty JSON string", ExportMetadataTMLRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportMetadataTMLRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportMetadataTMLRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportMetadataTMLRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }

      JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
      // validate the required field `metadata` (array)
      for (int i = 0; i < jsonArraymetadata.size(); i++) {
        ExportMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
      };
      if ((jsonObj.get("edoc_format") != null && !jsonObj.get("edoc_format").isJsonNull()) && !jsonObj.get("edoc_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edoc_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edoc_format").toString()));
      }
      // validate the optional field `edoc_format`
      if (jsonObj.get("edoc_format") != null && !jsonObj.get("edoc_format").isJsonNull()) {
        EdocFormatEnum.validateJsonElement(jsonObj.get("edoc_format"));
      }
      if ((jsonObj.get("export_schema_version") != null && !jsonObj.get("export_schema_version").isJsonNull()) && !jsonObj.get("export_schema_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `export_schema_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("export_schema_version").toString()));
      }
      // validate the optional field `export_schema_version`
      if (jsonObj.get("export_schema_version") != null && !jsonObj.get("export_schema_version").isJsonNull()) {
        ExportSchemaVersionEnum.validateJsonElement(jsonObj.get("export_schema_version"));
      }
      // validate the optional field `export_options`
      if (jsonObj.get("export_options") != null && !jsonObj.get("export_options").isJsonNull()) {
        ExportOptions.validateJsonElement(jsonObj.get("export_options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportMetadataTMLRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportMetadataTMLRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportMetadataTMLRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportMetadataTMLRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportMetadataTMLRequest>() {
           @Override
           public void write(JsonWriter out, ExportMetadataTMLRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportMetadataTMLRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExportMetadataTMLRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportMetadataTMLRequest
   * @throws IOException if the JSON string is invalid with respect to ExportMetadataTMLRequest
   */
  public static ExportMetadataTMLRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportMetadataTMLRequest.class);
  }

  /**
   * Convert an instance of ExportMetadataTMLRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

