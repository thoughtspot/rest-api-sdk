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
 * ExcludeMetadataListItemInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T16:12:37.188804+05:30[Asia/Kolkata]")
public class ExcludeMetadataListItemInput {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  /**
   * Type of metadata. Required if the name of the object is set as identifier. This attribute is optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view 5. CONNECTION for connection objects 6. TAG for tag objects 7. USER for user objects 8. USER_GROUP for group objects 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values. 10. INSIGHT_SPEC for SpotIQ objects
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
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

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public ExcludeMetadataListItemInput() {
  }

  public ExcludeMetadataListItemInput identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Unique ID or name of the metadata.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ExcludeMetadataListItemInput type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of metadata. Required if the name of the object is set as identifier. This attribute is optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view 5. CONNECTION for connection objects 6. TAG for tag objects 7. USER for user objects 8. USER_GROUP for group objects 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values. 10. INSIGHT_SPEC for SpotIQ objects
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludeMetadataListItemInput excludeMetadataListItemInput = (ExcludeMetadataListItemInput) o;
    return Objects.equals(this.identifier, excludeMetadataListItemInput.identifier) &&
        Objects.equals(this.type, excludeMetadataListItemInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludeMetadataListItemInput {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExcludeMetadataListItemInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExcludeMetadataListItemInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExcludeMetadataListItemInput is not found in the empty JSON string", ExcludeMetadataListItemInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExcludeMetadataListItemInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExcludeMetadataListItemInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExcludeMetadataListItemInput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExcludeMetadataListItemInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExcludeMetadataListItemInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExcludeMetadataListItemInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExcludeMetadataListItemInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ExcludeMetadataListItemInput>() {
           @Override
           public void write(JsonWriter out, ExcludeMetadataListItemInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExcludeMetadataListItemInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExcludeMetadataListItemInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExcludeMetadataListItemInput
  * @throws IOException if the JSON string is invalid with respect to ExcludeMetadataListItemInput
  */
  public static ExcludeMetadataListItemInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExcludeMetadataListItemInput.class);
  }

 /**
  * Convert an instance of ExcludeMetadataListItemInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

