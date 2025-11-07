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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * SearchOrgsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SearchOrgsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nullable
  private String orgIdentifier;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  /**
   * Visibility of the Org
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    SHOW("SHOW"),
    
    HIDDEN("HIDDEN");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VisibilityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  @javax.annotation.Nullable
  private VisibilityEnum visibility;

  /**
   * Status of the Org
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    IN_ACTIVE("IN_ACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_USER_IDENTIFIERS = "user_identifiers";
  @SerializedName(SERIALIZED_NAME_USER_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> userIdentifiers;

  public SearchOrgsRequest() {
  }

  public SearchOrgsRequest orgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

  /**
   * ID or name of the Org
   * @return orgIdentifier
   */
  @javax.annotation.Nullable
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }


  public SearchOrgsRequest description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Org
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public SearchOrgsRequest visibility(@javax.annotation.Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the Org
   * @return visibility
   */
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@javax.annotation.Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public SearchOrgsRequest status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the Org
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public SearchOrgsRequest userIdentifiers(@javax.annotation.Nullable List<String> userIdentifiers) {
    this.userIdentifiers = userIdentifiers;
    return this;
  }

  public SearchOrgsRequest addUserIdentifiersItem(String userIdentifiersItem) {
    if (this.userIdentifiers == null) {
      this.userIdentifiers = new ArrayList<>();
    }
    this.userIdentifiers.add(userIdentifiersItem);
    return this;
  }

  /**
   * GUIDs or names of the users for which you want to retrieve the Orgs data
   * @return userIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getUserIdentifiers() {
    return userIdentifiers;
  }

  public void setUserIdentifiers(@javax.annotation.Nullable List<String> userIdentifiers) {
    this.userIdentifiers = userIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOrgsRequest searchOrgsRequest = (SearchOrgsRequest) o;
    return Objects.equals(this.orgIdentifier, searchOrgsRequest.orgIdentifier) &&
        Objects.equals(this.description, searchOrgsRequest.description) &&
        Objects.equals(this.visibility, searchOrgsRequest.visibility) &&
        Objects.equals(this.status, searchOrgsRequest.status) &&
        Objects.equals(this.userIdentifiers, searchOrgsRequest.userIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdentifier, description, visibility, status, userIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrgsRequest {\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userIdentifiers: ").append(toIndentedString(userIdentifiers)).append("\n");
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
    openapiFields.add("org_identifier");
    openapiFields.add("description");
    openapiFields.add("visibility");
    openapiFields.add("status");
    openapiFields.add("user_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchOrgsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchOrgsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOrgsRequest is not found in the empty JSON string", SearchOrgsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchOrgsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchOrgsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull()) && !jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the optional field `visibility`
      if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) {
        VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_identifiers") != null && !jsonObj.get("user_identifiers").isJsonNull() && !jsonObj.get("user_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("user_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOrgsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOrgsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOrgsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOrgsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOrgsRequest>() {
           @Override
           public void write(JsonWriter out, SearchOrgsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchOrgsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchOrgsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchOrgsRequest
   * @throws IOException if the JSON string is invalid with respect to SearchOrgsRequest
   */
  public static SearchOrgsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOrgsRequest.class);
  }

  /**
   * Convert an instance of SearchOrgsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

