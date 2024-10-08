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
import org.thoughtspot.client.model.PrincipalsInput;

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
 * Details of users or groups.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T14:03:41.316769Z[Etc/UTC]")
public class PermissionInput {
  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private PrincipalsInput principal;

  /**
   * Object share mode.
   */
  @JsonAdapter(ShareModeEnum.Adapter.class)
  public enum ShareModeEnum {
    READ_ONLY("READ_ONLY"),
    
    MODIFY("MODIFY"),
    
    NO_ACCESS("NO_ACCESS");

    private String value;

    ShareModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShareModeEnum fromValue(String value) {
      for (ShareModeEnum b : ShareModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShareModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShareModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShareModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShareModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ShareModeEnum shareMode;

  public PermissionInput() {
  }

  public PermissionInput principal(PrincipalsInput principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @javax.annotation.Nonnull
  public PrincipalsInput getPrincipal() {
    return principal;
  }


  public void setPrincipal(PrincipalsInput principal) {
    this.principal = principal;
  }


  public PermissionInput shareMode(ShareModeEnum shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Object share mode.
   * @return shareMode
  **/
  @javax.annotation.Nonnull
  public ShareModeEnum getShareMode() {
    return shareMode;
  }


  public void setShareMode(ShareModeEnum shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionInput permissionInput = (PermissionInput) o;
    return Objects.equals(this.principal, permissionInput.principal) &&
        Objects.equals(this.shareMode, permissionInput.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionInput {\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("principal");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("principal");
    openapiRequiredFields.add("share_mode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PermissionInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PermissionInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermissionInput is not found in the empty JSON string", PermissionInput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PermissionInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PermissionInput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PermissionInput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `principal`
      PrincipalsInput.validateJsonObject(jsonObj.getAsJsonObject("principal"));
      if (!jsonObj.get("share_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermissionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermissionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermissionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermissionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<PermissionInput>() {
           @Override
           public void write(JsonWriter out, PermissionInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PermissionInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermissionInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermissionInput
  * @throws IOException if the JSON string is invalid with respect to PermissionInput
  */
  public static PermissionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermissionInput.class);
  }

 /**
  * Convert an instance of PermissionInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

