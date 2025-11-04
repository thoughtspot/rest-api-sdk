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
 * Input for variable details in search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VariableDetailInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  @javax.annotation.Nullable
  private String identifier;

  /**
   * Type of variable
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CONNECTION_PROPERTY("CONNECTION_PROPERTY"),
    
    TABLE_MAPPING("TABLE_MAPPING"),
    
    CONNECTION_PROPERTY_PER_PRINCIPAL("CONNECTION_PROPERTY_PER_PRINCIPAL"),
    
    FORMULA_VARIABLE("FORMULA_VARIABLE");

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
      return null;
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

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";
  @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
  @javax.annotation.Nullable
  private String namePattern;

  public VariableDetailInput() {
  }

  public VariableDetailInput identifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Unique ID or name of the variable
   * @return identifier
   */
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
  }


  public VariableDetailInput type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of variable
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public VariableDetailInput namePattern(@javax.annotation.Nullable String namePattern) {
    this.namePattern = namePattern;
    return this;
  }

  /**
   * A pattern to match case-insensitive name of the variable. User % for a wildcard match
   * @return namePattern
   */
  @javax.annotation.Nullable
  public String getNamePattern() {
    return namePattern;
  }

  public void setNamePattern(@javax.annotation.Nullable String namePattern) {
    this.namePattern = namePattern;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableDetailInput variableDetailInput = (VariableDetailInput) o;
    return Objects.equals(this.identifier, variableDetailInput.identifier) &&
        Objects.equals(this.type, variableDetailInput.type) &&
        Objects.equals(this.namePattern, variableDetailInput.namePattern);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, type, namePattern);
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
    sb.append("class VariableDetailInput {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
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
    openapiFields.add("name_pattern");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VariableDetailInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VariableDetailInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariableDetailInput is not found in the empty JSON string", VariableDetailInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VariableDetailInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VariableDetailInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull()) && !jsonObj.get("name_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pattern").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariableDetailInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariableDetailInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariableDetailInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariableDetailInput.class));

       return (TypeAdapter<T>) new TypeAdapter<VariableDetailInput>() {
           @Override
           public void write(JsonWriter out, VariableDetailInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VariableDetailInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VariableDetailInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VariableDetailInput
   * @throws IOException if the JSON string is invalid with respect to VariableDetailInput
   */
  public static VariableDetailInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariableDetailInput.class);
  }

  /**
   * Convert an instance of VariableDetailInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

