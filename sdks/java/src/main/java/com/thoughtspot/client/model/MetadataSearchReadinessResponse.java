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
 * Search readiness of a metadata object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class MetadataSearchReadinessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Readiness state of the object. OBJECT_READY means the object is available in Search; OBJECT_NOT_READY means Search has not yet indexed its latest version; OBJECT_NOT_VALID means the identifier is not a valid GUID or no such object exists.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OBJECT_NOT_VALID("OBJECT_NOT_VALID"),
    
    TYPE_NOT_SUPPORTED("TYPE_NOT_SUPPORTED"),
    
    OBJECT_NOT_READY("OBJECT_NOT_READY"),
    
    OBJECT_READY("OBJECT_READY");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nonnull
  private StateEnum state;

  public static final String SERIALIZED_NAME_METADATA_ID = "metadata_id";
  @SerializedName(SERIALIZED_NAME_METADATA_ID)
  @javax.annotation.Nonnull
  private String metadataId;

  public static final String SERIALIZED_NAME_OBJECT_VERSION = "object_version";
  @SerializedName(SERIALIZED_NAME_OBJECT_VERSION)
  @javax.annotation.Nonnull
  private Float objectVersion;

  public static final String SERIALIZED_NAME_INDEXED_VERSION = "indexed_version";
  @SerializedName(SERIALIZED_NAME_INDEXED_VERSION)
  @javax.annotation.Nonnull
  private Float indexedVersion;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  @javax.annotation.Nullable
  private String detail;

  public MetadataSearchReadinessResponse() {
  }

  public MetadataSearchReadinessResponse state(@javax.annotation.Nonnull StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Readiness state of the object. OBJECT_READY means the object is available in Search; OBJECT_NOT_READY means Search has not yet indexed its latest version; OBJECT_NOT_VALID means the identifier is not a valid GUID or no such object exists.
   * @return state
   */
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }

  public void setState(@javax.annotation.Nonnull StateEnum state) {
    this.state = state;
  }


  public MetadataSearchReadinessResponse metadataId(@javax.annotation.Nonnull String metadataId) {
    this.metadataId = metadataId;
    return this;
  }

  /**
   * GUID of the metadata object that was checked.
   * @return metadataId
   */
  @javax.annotation.Nonnull
  public String getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(@javax.annotation.Nonnull String metadataId) {
    this.metadataId = metadataId;
  }


  public MetadataSearchReadinessResponse objectVersion(@javax.annotation.Nonnull Float objectVersion) {
    this.objectVersion = objectVersion;
    return this;
  }

  /**
   * Metadata commit version at which the object was last written. Returns -1 when the state is OBJECT_NOT_VALID or TYPE_NOT_SUPPORTED.
   * @return objectVersion
   */
  @javax.annotation.Nonnull
  public Float getObjectVersion() {
    return objectVersion;
  }

  public void setObjectVersion(@javax.annotation.Nonnull Float objectVersion) {
    this.objectVersion = objectVersion;
  }


  public MetadataSearchReadinessResponse indexedVersion(@javax.annotation.Nonnull Float indexedVersion) {
    this.indexedVersion = indexedVersion;
    return this;
  }

  /**
   * Latest metadata version indexed by Search. The object is ready once this is greater than or equal to object_version. Returns -1 when the state is OBJECT_NOT_VALID or TYPE_NOT_SUPPORTED, or when the Search service is unavailable.
   * @return indexedVersion
   */
  @javax.annotation.Nonnull
  public Float getIndexedVersion() {
    return indexedVersion;
  }

  public void setIndexedVersion(@javax.annotation.Nonnull Float indexedVersion) {
    this.indexedVersion = indexedVersion;
  }


  public MetadataSearchReadinessResponse detail(@javax.annotation.Nullable String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Human-readable explanation of the readiness state.
   * @return detail
   */
  @javax.annotation.Nullable
  public String getDetail() {
    return detail;
  }

  public void setDetail(@javax.annotation.Nullable String detail) {
    this.detail = detail;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MetadataSearchReadinessResponse instance itself
   */
  public MetadataSearchReadinessResponse putAdditionalProperty(String key, Object value) {
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
    MetadataSearchReadinessResponse metadataSearchReadinessResponse = (MetadataSearchReadinessResponse) o;
    return Objects.equals(this.state, metadataSearchReadinessResponse.state) &&
        Objects.equals(this.metadataId, metadataSearchReadinessResponse.metadataId) &&
        Objects.equals(this.objectVersion, metadataSearchReadinessResponse.objectVersion) &&
        Objects.equals(this.indexedVersion, metadataSearchReadinessResponse.indexedVersion) &&
        Objects.equals(this.detail, metadataSearchReadinessResponse.detail)&&
        Objects.equals(this.additionalProperties, metadataSearchReadinessResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, metadataId, objectVersion, indexedVersion, detail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataSearchReadinessResponse {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    indexedVersion: ").append(toIndentedString(indexedVersion)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("metadata_id");
    openapiFields.add("object_version");
    openapiFields.add("indexed_version");
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("metadata_id");
    openapiRequiredFields.add("object_version");
    openapiRequiredFields.add("indexed_version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MetadataSearchReadinessResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MetadataSearchReadinessResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetadataSearchReadinessResponse is not found in the empty JSON string", MetadataSearchReadinessResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetadataSearchReadinessResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `state`
      StateEnum.validateJsonElement(jsonObj.get("state"));
      if (!jsonObj.get("metadata_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_id").toString()));
      }
      if ((jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataSearchReadinessResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataSearchReadinessResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataSearchReadinessResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataSearchReadinessResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataSearchReadinessResponse>() {
           @Override
           public void write(JsonWriter out, MetadataSearchReadinessResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
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
           public MetadataSearchReadinessResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MetadataSearchReadinessResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MetadataSearchReadinessResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MetadataSearchReadinessResponse
   * @throws IOException if the JSON string is invalid with respect to MetadataSearchReadinessResponse
   */
  public static MetadataSearchReadinessResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataSearchReadinessResponse.class);
  }

  /**
   * Convert an instance of MetadataSearchReadinessResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

