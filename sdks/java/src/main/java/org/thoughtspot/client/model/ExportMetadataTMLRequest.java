/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.thoughtspot.client.model.ExportMetadataTypeInput;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * ExportMetadataTMLRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T10:25:25.563+05:30[Asia/Kolkata]")
public class ExportMetadataTMLRequest {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<ExportMetadataTypeInput> metadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPORT_ASSOCIATED = "export_associated";
  @SerializedName(SERIALIZED_NAME_EXPORT_ASSOCIATED)
  private Boolean exportAssociated = false;

  public static final String SERIALIZED_NAME_EXPORT_FQN = "export_fqn";
  @SerializedName(SERIALIZED_NAME_EXPORT_FQN)
  private Boolean exportFqn = false;

  /**
   * TML EDOC content format.
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
  }

  public static final String SERIALIZED_NAME_EDOC_FORMAT = "edoc_format";
  @SerializedName(SERIALIZED_NAME_EDOC_FORMAT)
  private EdocFormatEnum edocFormat = EdocFormatEnum.JSON;

  /**
   * Indicates whether to export worksheet TML in V1 or V2 version.
   */
  @JsonAdapter(ExportSchemaVersionEnum.Adapter.class)
  public enum ExportSchemaVersionEnum {
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
  }

  public static final String SERIALIZED_NAME_EXPORT_SCHEMA_VERSION = "export_schema_version";
  @SerializedName(SERIALIZED_NAME_EXPORT_SCHEMA_VERSION)
  private ExportSchemaVersionEnum exportSchemaVersion = ExportSchemaVersionEnum.V1;

  public static final String SERIALIZED_NAME_EXPORT_DEPENDENT = "export_dependent";
  @SerializedName(SERIALIZED_NAME_EXPORT_DEPENDENT)
  private Boolean exportDependent = false;

  public static final String SERIALIZED_NAME_EXPORT_CONNECTION_AS_DEPENDENT = "export_connection_as_dependent";
  @SerializedName(SERIALIZED_NAME_EXPORT_CONNECTION_AS_DEPENDENT)
  private Boolean exportConnectionAsDependent = false;

  public ExportMetadataTMLRequest() {
  }

  public ExportMetadataTMLRequest metadata(List<ExportMetadataTypeInput> metadata) {
    
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
  **/
  @javax.annotation.Nonnull
  public List<ExportMetadataTypeInput> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<ExportMetadataTypeInput> metadata) {
    this.metadata = metadata;
  }


  public ExportMetadataTMLRequest exportAssociated(Boolean exportAssociated) {
    
    this.exportAssociated = exportAssociated;
    return this;
  }

   /**
   * Indicates whether to export associated metadata objects of specified metadata objects.
   * @return exportAssociated
  **/
  @javax.annotation.Nullable
  public Boolean getExportAssociated() {
    return exportAssociated;
  }


  public void setExportAssociated(Boolean exportAssociated) {
    this.exportAssociated = exportAssociated;
  }


  public ExportMetadataTMLRequest exportFqn(Boolean exportFqn) {
    
    this.exportFqn = exportFqn;
    return this;
  }

   /**
   * Adds FQNs of the referenced objects. For example, if you are exporting a Liveboard and its associated objects, the API returns the Liveboard TML data with the FQNs of the referenced worksheet. If the exported TML data includes FQNs, you don&#39;t need to manually add FQNs of the referenced objects during TML import.
   * @return exportFqn
  **/
  @javax.annotation.Nullable
  public Boolean getExportFqn() {
    return exportFqn;
  }


  public void setExportFqn(Boolean exportFqn) {
    this.exportFqn = exportFqn;
  }


  public ExportMetadataTMLRequest edocFormat(EdocFormatEnum edocFormat) {
    
    this.edocFormat = edocFormat;
    return this;
  }

   /**
   * TML EDOC content format.
   * @return edocFormat
  **/
  @javax.annotation.Nullable
  public EdocFormatEnum getEdocFormat() {
    return edocFormat;
  }


  public void setEdocFormat(EdocFormatEnum edocFormat) {
    this.edocFormat = edocFormat;
  }


  public ExportMetadataTMLRequest exportSchemaVersion(ExportSchemaVersionEnum exportSchemaVersion) {
    
    this.exportSchemaVersion = exportSchemaVersion;
    return this;
  }

   /**
   * Indicates whether to export worksheet TML in V1 or V2 version.
   * @return exportSchemaVersion
  **/
  @javax.annotation.Nullable
  public ExportSchemaVersionEnum getExportSchemaVersion() {
    return exportSchemaVersion;
  }


  public void setExportSchemaVersion(ExportSchemaVersionEnum exportSchemaVersion) {
    this.exportSchemaVersion = exportSchemaVersion;
  }


  public ExportMetadataTMLRequest exportDependent(Boolean exportDependent) {
    
    this.exportDependent = exportDependent;
    return this;
  }

   /**
   * Indicates whether to export table while exporting connection.
   * @return exportDependent
  **/
  @javax.annotation.Nullable
  public Boolean getExportDependent() {
    return exportDependent;
  }


  public void setExportDependent(Boolean exportDependent) {
    this.exportDependent = exportDependent;
  }


  public ExportMetadataTMLRequest exportConnectionAsDependent(Boolean exportConnectionAsDependent) {
    
    this.exportConnectionAsDependent = exportConnectionAsDependent;
    return this;
  }

   /**
   * Indicates whether to export connection as dependent while exporting table/worksheet/answer/liveboard. This will only be active when export_associated is true.
   * @return exportConnectionAsDependent
  **/
  @javax.annotation.Nullable
  public Boolean getExportConnectionAsDependent() {
    return exportConnectionAsDependent;
  }


  public void setExportConnectionAsDependent(Boolean exportConnectionAsDependent) {
    this.exportConnectionAsDependent = exportConnectionAsDependent;
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
        Objects.equals(this.exportConnectionAsDependent, exportMetadataTMLRequest.exportConnectionAsDependent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, exportAssociated, exportFqn, edocFormat, exportSchemaVersion, exportDependent, exportConnectionAsDependent);
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportMetadataTMLRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExportMetadataTMLRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportMetadataTMLRequest is not found in the empty JSON string", ExportMetadataTMLRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExportMetadataTMLRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportMetadataTMLRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportMetadataTMLRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }

      JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
      // validate the required field `metadata` (array)
      for (int i = 0; i < jsonArraymetadata.size(); i++) {
        ExportMetadataTypeInput.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("edoc_format") != null && !jsonObj.get("edoc_format").isJsonNull()) && !jsonObj.get("edoc_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edoc_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edoc_format").toString()));
      }
      if ((jsonObj.get("export_schema_version") != null && !jsonObj.get("export_schema_version").isJsonNull()) && !jsonObj.get("export_schema_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `export_schema_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("export_schema_version").toString()));
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

