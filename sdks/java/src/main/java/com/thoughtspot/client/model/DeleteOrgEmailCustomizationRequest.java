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
 * DeleteOrgEmailCustomizationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class DeleteOrgEmailCustomizationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> orgIdentifiers;

  public DeleteOrgEmailCustomizationRequest() {
  }

  public DeleteOrgEmailCustomizationRequest orgIdentifiers(@javax.annotation.Nullable List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
    return this;
  }

  public DeleteOrgEmailCustomizationRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
    if (this.orgIdentifiers == null) {
      this.orgIdentifiers = new ArrayList<>();
    }
    this.orgIdentifiers.add(orgIdentifiersItem);
    return this;
  }

  /**
   * Unique identifier of the organization.
   * @return orgIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getOrgIdentifiers() {
    return orgIdentifiers;
  }

  public void setOrgIdentifiers(@javax.annotation.Nullable List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOrgEmailCustomizationRequest deleteOrgEmailCustomizationRequest = (DeleteOrgEmailCustomizationRequest) o;
    return Objects.equals(this.orgIdentifiers, deleteOrgEmailCustomizationRequest.orgIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOrgEmailCustomizationRequest {\n");
    sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
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
    openapiFields.add("org_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteOrgEmailCustomizationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteOrgEmailCustomizationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteOrgEmailCustomizationRequest is not found in the empty JSON string", DeleteOrgEmailCustomizationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteOrgEmailCustomizationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteOrgEmailCustomizationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("org_identifiers") != null && !jsonObj.get("org_identifiers").isJsonNull() && !jsonObj.get("org_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("org_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteOrgEmailCustomizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteOrgEmailCustomizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteOrgEmailCustomizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteOrgEmailCustomizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteOrgEmailCustomizationRequest>() {
           @Override
           public void write(JsonWriter out, DeleteOrgEmailCustomizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteOrgEmailCustomizationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteOrgEmailCustomizationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteOrgEmailCustomizationRequest
   * @throws IOException if the JSON string is invalid with respect to DeleteOrgEmailCustomizationRequest
   */
  public static DeleteOrgEmailCustomizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteOrgEmailCustomizationRequest.class);
  }

  /**
   * Convert an instance of DeleteOrgEmailCustomizationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

