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
 * ColumnSecurityRuleGroupOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ColumnSecurityRuleGroupOperation implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Type of operation to be performed on the groups
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ADD("ADD"),
    
    REMOVE("REMOVE"),
    
    REPLACE("REPLACE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  @javax.annotation.Nonnull
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  @javax.annotation.Nonnull
  private List<String> groupIdentifiers;

  public ColumnSecurityRuleGroupOperation() {
  }

  public ColumnSecurityRuleGroupOperation operation(@javax.annotation.Nonnull OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Type of operation to be performed on the groups
   * @return operation
   */
  @javax.annotation.Nonnull
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(@javax.annotation.Nonnull OperationEnum operation) {
    this.operation = operation;
  }


  public ColumnSecurityRuleGroupOperation groupIdentifiers(@javax.annotation.Nonnull List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public ColumnSecurityRuleGroupOperation addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

  /**
   * Array of group identifiers (name or GUID) on which the operation will be performed
   * @return groupIdentifiers
   */
  @javax.annotation.Nonnull
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }

  public void setGroupIdentifiers(@javax.annotation.Nonnull List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnSecurityRuleGroupOperation columnSecurityRuleGroupOperation = (ColumnSecurityRuleGroupOperation) o;
    return Objects.equals(this.operation, columnSecurityRuleGroupOperation.operation) &&
        Objects.equals(this.groupIdentifiers, columnSecurityRuleGroupOperation.groupIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, groupIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnSecurityRuleGroupOperation {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("group_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
    openapiRequiredFields.add("group_identifiers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ColumnSecurityRuleGroupOperation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ColumnSecurityRuleGroupOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColumnSecurityRuleGroupOperation is not found in the empty JSON string", ColumnSecurityRuleGroupOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ColumnSecurityRuleGroupOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ColumnSecurityRuleGroupOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColumnSecurityRuleGroupOperation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the required field `operation`
      OperationEnum.validateJsonElement(jsonObj.get("operation"));
      // ensure the required json array is present
      if (jsonObj.get("group_identifiers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColumnSecurityRuleGroupOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColumnSecurityRuleGroupOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColumnSecurityRuleGroupOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColumnSecurityRuleGroupOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<ColumnSecurityRuleGroupOperation>() {
           @Override
           public void write(JsonWriter out, ColumnSecurityRuleGroupOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ColumnSecurityRuleGroupOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ColumnSecurityRuleGroupOperation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ColumnSecurityRuleGroupOperation
   * @throws IOException if the JSON string is invalid with respect to ColumnSecurityRuleGroupOperation
   */
  public static ColumnSecurityRuleGroupOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColumnSecurityRuleGroupOperation.class);
  }

  /**
   * Convert an instance of ColumnSecurityRuleGroupOperation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

