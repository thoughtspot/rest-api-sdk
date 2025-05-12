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
import org.thoughtspot.client.model.HeaderUpdateInput;
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
 * UpdateMetadataHeaderRequest
 */

public class UpdateMetadataHeaderRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HEADERS_UPDATE = "headers_update";
  @SerializedName(SERIALIZED_NAME_HEADERS_UPDATE)
  @javax.annotation.Nonnull
  private List<HeaderUpdateInput> headersUpdate;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nullable
  private String orgIdentifier;

  public UpdateMetadataHeaderRequest() {
  }

  public UpdateMetadataHeaderRequest headersUpdate(@javax.annotation.Nonnull List<HeaderUpdateInput> headersUpdate) {
    this.headersUpdate = headersUpdate;
    return this;
  }

  public UpdateMetadataHeaderRequest addHeadersUpdateItem(HeaderUpdateInput headersUpdateItem) {
    if (this.headersUpdate == null) {
      this.headersUpdate = new ArrayList<>();
    }
    this.headersUpdate.add(headersUpdateItem);
    return this;
  }

  /**
   * List of header objects to update.
   * @return headersUpdate
   */
  @javax.annotation.Nonnull
  public List<HeaderUpdateInput> getHeadersUpdate() {
    return headersUpdate;
  }

  public void setHeadersUpdate(@javax.annotation.Nonnull List<HeaderUpdateInput> headersUpdate) {
    this.headersUpdate = headersUpdate;
  }


  public UpdateMetadataHeaderRequest orgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the organization.
   * @return orgIdentifier
   */
  @javax.annotation.Nullable
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMetadataHeaderRequest updateMetadataHeaderRequest = (UpdateMetadataHeaderRequest) o;
    return Objects.equals(this.headersUpdate, updateMetadataHeaderRequest.headersUpdate) &&
        Objects.equals(this.orgIdentifier, updateMetadataHeaderRequest.orgIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headersUpdate, orgIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMetadataHeaderRequest {\n");
    sb.append("    headersUpdate: ").append(toIndentedString(headersUpdate)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
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
    openapiFields.add("headers_update");
    openapiFields.add("org_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("headers_update");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateMetadataHeaderRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateMetadataHeaderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMetadataHeaderRequest is not found in the empty JSON string", UpdateMetadataHeaderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateMetadataHeaderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMetadataHeaderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateMetadataHeaderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("headers_update").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers_update` to be an array in the JSON string but got `%s`", jsonObj.get("headers_update").toString()));
      }

      JsonArray jsonArrayheadersUpdate = jsonObj.getAsJsonArray("headers_update");
      // validate the required field `headers_update` (array)
      for (int i = 0; i < jsonArrayheadersUpdate.size(); i++) {
        HeaderUpdateInput.validateJsonElement(jsonArrayheadersUpdate.get(i));
      };
      if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull()) && !jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMetadataHeaderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMetadataHeaderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMetadataHeaderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMetadataHeaderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMetadataHeaderRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMetadataHeaderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMetadataHeaderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateMetadataHeaderRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMetadataHeaderRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateMetadataHeaderRequest
   */
  public static UpdateMetadataHeaderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMetadataHeaderRequest.class);
  }

  /**
   * Convert an instance of UpdateMetadataHeaderRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

