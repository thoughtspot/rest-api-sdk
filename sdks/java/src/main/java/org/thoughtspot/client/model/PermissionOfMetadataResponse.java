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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PermissionOfMetadataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T10:15:19.022933Z[Etc/UTC]")
public class PermissionOfMetadataResponse {
  public static final String SERIALIZED_NAME_METADATA_PERMISSION_DETAILS = "metadata_permission_details";
  @SerializedName(SERIALIZED_NAME_METADATA_PERMISSION_DETAILS)
  private Object metadataPermissionDetails;

  public PermissionOfMetadataResponse() {
  }

  public PermissionOfMetadataResponse metadataPermissionDetails(Object metadataPermissionDetails) {
    
    this.metadataPermissionDetails = metadataPermissionDetails;
    return this;
  }

   /**
   * Get metadataPermissionDetails
   * @return metadataPermissionDetails
  **/
  @javax.annotation.Nullable
  public Object getMetadataPermissionDetails() {
    return metadataPermissionDetails;
  }


  public void setMetadataPermissionDetails(Object metadataPermissionDetails) {
    this.metadataPermissionDetails = metadataPermissionDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionOfMetadataResponse permissionOfMetadataResponse = (PermissionOfMetadataResponse) o;
    return Objects.equals(this.metadataPermissionDetails, permissionOfMetadataResponse.metadataPermissionDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataPermissionDetails);
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
    sb.append("class PermissionOfMetadataResponse {\n");
    sb.append("    metadataPermissionDetails: ").append(toIndentedString(metadataPermissionDetails)).append("\n");
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
    openapiFields.add("metadata_permission_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PermissionOfMetadataResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PermissionOfMetadataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermissionOfMetadataResponse is not found in the empty JSON string", PermissionOfMetadataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PermissionOfMetadataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PermissionOfMetadataResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermissionOfMetadataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermissionOfMetadataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermissionOfMetadataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermissionOfMetadataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PermissionOfMetadataResponse>() {
           @Override
           public void write(JsonWriter out, PermissionOfMetadataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PermissionOfMetadataResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermissionOfMetadataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermissionOfMetadataResponse
  * @throws IOException if the JSON string is invalid with respect to PermissionOfMetadataResponse
  */
  public static PermissionOfMetadataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermissionOfMetadataResponse.class);
  }

 /**
  * Convert an instance of PermissionOfMetadataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

