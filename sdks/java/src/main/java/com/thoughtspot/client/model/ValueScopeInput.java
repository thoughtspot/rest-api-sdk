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
import org.openapitools.jackson.nullable.JsonNullable;
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
 * Input for variable scope in search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ValueScopeInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  @javax.annotation.Nullable
  private String orgIdentifier;

  /**
   * Principal type
   */
  @JsonAdapter(PrincipalTypeEnum.Adapter.class)
  public enum PrincipalTypeEnum {
    USER("USER"),
    
    USER_GROUP("USER_GROUP");

    private String value;

    PrincipalTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrincipalTypeEnum fromValue(String value) {
      for (PrincipalTypeEnum b : PrincipalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrincipalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrincipalTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrincipalTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrincipalTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PrincipalTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PRINCIPAL_TYPE = "principal_type";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_TYPE)
  @javax.annotation.Nullable
  private PrincipalTypeEnum principalType;

  public static final String SERIALIZED_NAME_PRINCIPAL_IDENTIFIER = "principal_identifier";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_IDENTIFIER)
  @javax.annotation.Nullable
  private String principalIdentifier;

  public static final String SERIALIZED_NAME_MODEL_IDENTIFIER = "model_identifier";
  @SerializedName(SERIALIZED_NAME_MODEL_IDENTIFIER)
  @javax.annotation.Nullable
  private String modelIdentifier;

  public ValueScopeInput() {
  }

  public ValueScopeInput orgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

  /**
   * The unique name of the org
   * @return orgIdentifier
   */
  @javax.annotation.Nullable
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(@javax.annotation.Nullable String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }


  public ValueScopeInput principalType(@javax.annotation.Nullable PrincipalTypeEnum principalType) {
    this.principalType = principalType;
    return this;
  }

  /**
   * Principal type
   * @return principalType
   */
  @javax.annotation.Nullable
  public PrincipalTypeEnum getPrincipalType() {
    return principalType;
  }

  public void setPrincipalType(@javax.annotation.Nullable PrincipalTypeEnum principalType) {
    this.principalType = principalType;
  }


  public ValueScopeInput principalIdentifier(@javax.annotation.Nullable String principalIdentifier) {
    this.principalIdentifier = principalIdentifier;
    return this;
  }

  /**
   * Unique ID or name of the principal
   * @return principalIdentifier
   */
  @javax.annotation.Nullable
  public String getPrincipalIdentifier() {
    return principalIdentifier;
  }

  public void setPrincipalIdentifier(@javax.annotation.Nullable String principalIdentifier) {
    this.principalIdentifier = principalIdentifier;
  }


  public ValueScopeInput modelIdentifier(@javax.annotation.Nullable String modelIdentifier) {
    this.modelIdentifier = modelIdentifier;
    return this;
  }

  /**
   * Model Identifier
   * @return modelIdentifier
   */
  @javax.annotation.Nullable
  public String getModelIdentifier() {
    return modelIdentifier;
  }

  public void setModelIdentifier(@javax.annotation.Nullable String modelIdentifier) {
    this.modelIdentifier = modelIdentifier;
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
   * @return the ValueScopeInput instance itself
   */
  public ValueScopeInput putAdditionalProperty(String key, Object value) {
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
    ValueScopeInput valueScopeInput = (ValueScopeInput) o;
    return Objects.equals(this.orgIdentifier, valueScopeInput.orgIdentifier) &&
        Objects.equals(this.principalType, valueScopeInput.principalType) &&
        Objects.equals(this.principalIdentifier, valueScopeInput.principalIdentifier) &&
        Objects.equals(this.modelIdentifier, valueScopeInput.modelIdentifier)&&
        Objects.equals(this.additionalProperties, valueScopeInput.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgIdentifier, principalType, principalIdentifier, modelIdentifier, additionalProperties);
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
    sb.append("class ValueScopeInput {\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
    sb.append("    principalIdentifier: ").append(toIndentedString(principalIdentifier)).append("\n");
    sb.append("    modelIdentifier: ").append(toIndentedString(modelIdentifier)).append("\n");
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
    openapiFields.add("org_identifier");
    openapiFields.add("principal_type");
    openapiFields.add("principal_identifier");
    openapiFields.add("model_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValueScopeInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValueScopeInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueScopeInput is not found in the empty JSON string", ValueScopeInput.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull()) && !jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
      if ((jsonObj.get("principal_type") != null && !jsonObj.get("principal_type").isJsonNull()) && !jsonObj.get("principal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal_type").toString()));
      }
      // validate the optional field `principal_type`
      if (jsonObj.get("principal_type") != null && !jsonObj.get("principal_type").isJsonNull()) {
        PrincipalTypeEnum.validateJsonElement(jsonObj.get("principal_type"));
      }
      if ((jsonObj.get("principal_identifier") != null && !jsonObj.get("principal_identifier").isJsonNull()) && !jsonObj.get("principal_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal_identifier").toString()));
      }
      if ((jsonObj.get("model_identifier") != null && !jsonObj.get("model_identifier").isJsonNull()) && !jsonObj.get("model_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueScopeInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueScopeInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueScopeInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueScopeInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueScopeInput>() {
           @Override
           public void write(JsonWriter out, ValueScopeInput value) throws IOException {
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
           public ValueScopeInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ValueScopeInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ValueScopeInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValueScopeInput
   * @throws IOException if the JSON string is invalid with respect to ValueScopeInput
   */
  public static ValueScopeInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueScopeInput.class);
  }

  /**
   * Convert an instance of ValueScopeInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

