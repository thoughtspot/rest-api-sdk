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
import com.thoughtspot.client.model.ColumnSecurityRuleGroupOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ColumnSecurityRuleUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ColumnSecurityRuleUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLUMN_IDENTIFIER = "column_identifier";
  @SerializedName(SERIALIZED_NAME_COLUMN_IDENTIFIER)
  @javax.annotation.Nonnull
  private String columnIdentifier;

  public static final String SERIALIZED_NAME_IS_UNSECURED = "is_unsecured";
  @SerializedName(SERIALIZED_NAME_IS_UNSECURED)
  @javax.annotation.Nullable
  private Boolean isUnsecured;

  public static final String SERIALIZED_NAME_GROUP_ACCESS = "group_access";
  @SerializedName(SERIALIZED_NAME_GROUP_ACCESS)
  @javax.annotation.Nullable
  private List<ColumnSecurityRuleGroupOperation> groupAccess;

  public ColumnSecurityRuleUpdate() {
  }

  public ColumnSecurityRuleUpdate columnIdentifier(@javax.annotation.Nonnull String columnIdentifier) {
    this.columnIdentifier = columnIdentifier;
    return this;
  }

  /**
   * Column identifier (col_id or name)
   * @return columnIdentifier
   */
  @javax.annotation.Nonnull
  public String getColumnIdentifier() {
    return columnIdentifier;
  }

  public void setColumnIdentifier(@javax.annotation.Nonnull String columnIdentifier) {
    this.columnIdentifier = columnIdentifier;
  }


  public ColumnSecurityRuleUpdate isUnsecured(@javax.annotation.Nullable Boolean isUnsecured) {
    this.isUnsecured = isUnsecured;
    return this;
  }

  /**
   * If true, the column will be marked as unprotected and all groups associated with it will be removed
   * @return isUnsecured
   */
  @javax.annotation.Nullable
  public Boolean getIsUnsecured() {
    return isUnsecured;
  }

  public void setIsUnsecured(@javax.annotation.Nullable Boolean isUnsecured) {
    this.isUnsecured = isUnsecured;
  }


  public ColumnSecurityRuleUpdate groupAccess(@javax.annotation.Nullable List<ColumnSecurityRuleGroupOperation> groupAccess) {
    this.groupAccess = groupAccess;
    return this;
  }

  public ColumnSecurityRuleUpdate addGroupAccessItem(ColumnSecurityRuleGroupOperation groupAccessItem) {
    if (this.groupAccess == null) {
      this.groupAccess = new ArrayList<>();
    }
    this.groupAccess.add(groupAccessItem);
    return this;
  }

  /**
   * Array of group operation objects that specifies the actions for groups to be associated with a column
   * @return groupAccess
   */
  @javax.annotation.Nullable
  public List<ColumnSecurityRuleGroupOperation> getGroupAccess() {
    return groupAccess;
  }

  public void setGroupAccess(@javax.annotation.Nullable List<ColumnSecurityRuleGroupOperation> groupAccess) {
    this.groupAccess = groupAccess;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnSecurityRuleUpdate columnSecurityRuleUpdate = (ColumnSecurityRuleUpdate) o;
    return Objects.equals(this.columnIdentifier, columnSecurityRuleUpdate.columnIdentifier) &&
        Objects.equals(this.isUnsecured, columnSecurityRuleUpdate.isUnsecured) &&
        Objects.equals(this.groupAccess, columnSecurityRuleUpdate.groupAccess);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIdentifier, isUnsecured, groupAccess);
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
    sb.append("class ColumnSecurityRuleUpdate {\n");
    sb.append("    columnIdentifier: ").append(toIndentedString(columnIdentifier)).append("\n");
    sb.append("    isUnsecured: ").append(toIndentedString(isUnsecured)).append("\n");
    sb.append("    groupAccess: ").append(toIndentedString(groupAccess)).append("\n");
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
    openapiFields.add("column_identifier");
    openapiFields.add("is_unsecured");
    openapiFields.add("group_access");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("column_identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ColumnSecurityRuleUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ColumnSecurityRuleUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColumnSecurityRuleUpdate is not found in the empty JSON string", ColumnSecurityRuleUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ColumnSecurityRuleUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ColumnSecurityRuleUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColumnSecurityRuleUpdate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("column_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column_identifier").toString()));
      }
      if (jsonObj.get("group_access") != null && !jsonObj.get("group_access").isJsonNull()) {
        JsonArray jsonArraygroupAccess = jsonObj.getAsJsonArray("group_access");
        if (jsonArraygroupAccess != null) {
          // ensure the json data is an array
          if (!jsonObj.get("group_access").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `group_access` to be an array in the JSON string but got `%s`", jsonObj.get("group_access").toString()));
          }

          // validate the optional field `group_access` (array)
          for (int i = 0; i < jsonArraygroupAccess.size(); i++) {
            ColumnSecurityRuleGroupOperation.validateJsonElement(jsonArraygroupAccess.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColumnSecurityRuleUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColumnSecurityRuleUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColumnSecurityRuleUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColumnSecurityRuleUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<ColumnSecurityRuleUpdate>() {
           @Override
           public void write(JsonWriter out, ColumnSecurityRuleUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ColumnSecurityRuleUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ColumnSecurityRuleUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ColumnSecurityRuleUpdate
   * @throws IOException if the JSON string is invalid with respect to ColumnSecurityRuleUpdate
   */
  public static ColumnSecurityRuleUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColumnSecurityRuleUpdate.class);
  }

  /**
   * Convert an instance of ColumnSecurityRuleUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

