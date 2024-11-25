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
import org.thoughtspot.client.model.CustomActionMetadataTypeInput;
import org.thoughtspot.client.model.SearchCustomActionsRequestDefaultActionConfig;

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
 * SearchCustomActionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T15:42:43.362610+05:30[Asia/Kolkata]")
public class SearchCustomActionsRequest {
  public static final String SERIALIZED_NAME_CUSTOM_ACTION_IDENTIFIER = "custom_action_identifier";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ACTION_IDENTIFIER)
  private String customActionIdentifier;

  public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";
  @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
  private String namePattern;

  public static final String SERIALIZED_NAME_DEFAULT_ACTION_CONFIG = "default_action_config";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ACTION_CONFIG)
  private SearchCustomActionsRequestDefaultActionConfig defaultActionConfig;

  public static final String SERIALIZED_NAME_INCLUDE_GROUP_ASSOCIATIONS = "include_group_associations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GROUP_ASSOCIATIONS)
  private Boolean includeGroupAssociations = false;

  public static final String SERIALIZED_NAME_INCLUDE_METADATA_ASSOCIATIONS = "include_metadata_associations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_METADATA_ASSOCIATIONS)
  private Boolean includeMetadataAssociations = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<CustomActionMetadataTypeInput> metadata;

  /**
   * Filter the action objects based on type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CALLBACK("CALLBACK"),
    
    URL("URL");

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

  public SearchCustomActionsRequest() {
  }

  public SearchCustomActionsRequest customActionIdentifier(String customActionIdentifier) {
    
    this.customActionIdentifier = customActionIdentifier;
    return this;
  }

   /**
   * Name or ID of the custom action.
   * @return customActionIdentifier
  **/
  @javax.annotation.Nullable
  public String getCustomActionIdentifier() {
    return customActionIdentifier;
  }


  public void setCustomActionIdentifier(String customActionIdentifier) {
    this.customActionIdentifier = customActionIdentifier;
  }


  public SearchCustomActionsRequest namePattern(String namePattern) {
    
    this.namePattern = namePattern;
    return this;
  }

   /**
   * A pattern to match case-insensitive name of the custom-action object.
   * @return namePattern
  **/
  @javax.annotation.Nullable
  public String getNamePattern() {
    return namePattern;
  }


  public void setNamePattern(String namePattern) {
    this.namePattern = namePattern;
  }


  public SearchCustomActionsRequest defaultActionConfig(SearchCustomActionsRequestDefaultActionConfig defaultActionConfig) {
    
    this.defaultActionConfig = defaultActionConfig;
    return this;
  }

   /**
   * Get defaultActionConfig
   * @return defaultActionConfig
  **/
  @javax.annotation.Nullable
  public SearchCustomActionsRequestDefaultActionConfig getDefaultActionConfig() {
    return defaultActionConfig;
  }


  public void setDefaultActionConfig(SearchCustomActionsRequestDefaultActionConfig defaultActionConfig) {
    this.defaultActionConfig = defaultActionConfig;
  }


  public SearchCustomActionsRequest includeGroupAssociations(Boolean includeGroupAssociations) {
    
    this.includeGroupAssociations = includeGroupAssociations;
    return this;
  }

   /**
   * When set to true, returns the associated groups for a custom action.
   * @return includeGroupAssociations
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeGroupAssociations() {
    return includeGroupAssociations;
  }


  public void setIncludeGroupAssociations(Boolean includeGroupAssociations) {
    this.includeGroupAssociations = includeGroupAssociations;
  }


  public SearchCustomActionsRequest includeMetadataAssociations(Boolean includeMetadataAssociations) {
    
    this.includeMetadataAssociations = includeMetadataAssociations;
    return this;
  }

   /**
   * When set to true, returns the associated metadata for a custom action.
   * @return includeMetadataAssociations
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeMetadataAssociations() {
    return includeMetadataAssociations;
  }


  public void setIncludeMetadataAssociations(Boolean includeMetadataAssociations) {
    this.includeMetadataAssociations = includeMetadataAssociations;
  }


  public SearchCustomActionsRequest metadata(List<CustomActionMetadataTypeInput> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SearchCustomActionsRequest addMetadataItem(CustomActionMetadataTypeInput metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Search with a given metadata identifier.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<CustomActionMetadataTypeInput> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<CustomActionMetadataTypeInput> metadata) {
    this.metadata = metadata;
  }


  public SearchCustomActionsRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Filter the action objects based on type
   * @return type
  **/
  @javax.annotation.Nullable
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
    SearchCustomActionsRequest searchCustomActionsRequest = (SearchCustomActionsRequest) o;
    return Objects.equals(this.customActionIdentifier, searchCustomActionsRequest.customActionIdentifier) &&
        Objects.equals(this.namePattern, searchCustomActionsRequest.namePattern) &&
        Objects.equals(this.defaultActionConfig, searchCustomActionsRequest.defaultActionConfig) &&
        Objects.equals(this.includeGroupAssociations, searchCustomActionsRequest.includeGroupAssociations) &&
        Objects.equals(this.includeMetadataAssociations, searchCustomActionsRequest.includeMetadataAssociations) &&
        Objects.equals(this.metadata, searchCustomActionsRequest.metadata) &&
        Objects.equals(this.type, searchCustomActionsRequest.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customActionIdentifier, namePattern, defaultActionConfig, includeGroupAssociations, includeMetadataAssociations, metadata, type);
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
    sb.append("class SearchCustomActionsRequest {\n");
    sb.append("    customActionIdentifier: ").append(toIndentedString(customActionIdentifier)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
    sb.append("    defaultActionConfig: ").append(toIndentedString(defaultActionConfig)).append("\n");
    sb.append("    includeGroupAssociations: ").append(toIndentedString(includeGroupAssociations)).append("\n");
    sb.append("    includeMetadataAssociations: ").append(toIndentedString(includeMetadataAssociations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("custom_action_identifier");
    openapiFields.add("name_pattern");
    openapiFields.add("default_action_config");
    openapiFields.add("include_group_associations");
    openapiFields.add("include_metadata_associations");
    openapiFields.add("metadata");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchCustomActionsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchCustomActionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchCustomActionsRequest is not found in the empty JSON string", SearchCustomActionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchCustomActionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchCustomActionsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("custom_action_identifier") != null && !jsonObj.get("custom_action_identifier").isJsonNull()) && !jsonObj.get("custom_action_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_action_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_action_identifier").toString()));
      }
      if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull()) && !jsonObj.get("name_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pattern").toString()));
      }
      // validate the optional field `default_action_config`
      if (jsonObj.get("default_action_config") != null && !jsonObj.get("default_action_config").isJsonNull()) {
        SearchCustomActionsRequestDefaultActionConfig.validateJsonObject(jsonObj.getAsJsonObject("default_action_config"));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            CustomActionMetadataTypeInput.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchCustomActionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchCustomActionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchCustomActionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchCustomActionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchCustomActionsRequest>() {
           @Override
           public void write(JsonWriter out, SearchCustomActionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchCustomActionsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchCustomActionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchCustomActionsRequest
  * @throws IOException if the JSON string is invalid with respect to SearchCustomActionsRequest
  */
  public static SearchCustomActionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchCustomActionsRequest.class);
  }

 /**
  * Convert an instance of SearchCustomActionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

