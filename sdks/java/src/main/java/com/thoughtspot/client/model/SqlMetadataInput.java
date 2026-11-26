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
 * Object to fetch the SQL query of. Set only the fields that its type uses.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SqlMetadataInput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Type of the object. Required if &lt;code&gt;identifier&lt;/code&gt; is a name. If not set, the type is taken from the request: &lt;code&gt;tml&lt;/code&gt; means &lt;code&gt;ANSWER&lt;/code&gt;, &lt;code&gt;query_string&lt;/code&gt; means &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;, and a GUID in &lt;code&gt;identifier&lt;/code&gt; means the type of that object.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ANSWER("ANSWER"),
    
    LIVEBOARD("LIVEBOARD"),
    
    LOGICAL_TABLE("LOGICAL_TABLE");

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

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  @javax.annotation.Nullable
  private String identifier;

  public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS = "visualization_identifiers";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
  @javax.annotation.Nullable
  private List<String> visualizationIdentifiers;

  public static final String SERIALIZED_NAME_TML = "tml";
  @SerializedName(SERIALIZED_NAME_TML)
  @javax.annotation.Nullable
  private String tml;

  public SqlMetadataInput() {
  }

  public SqlMetadataInput type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the object. Required if &lt;code&gt;identifier&lt;/code&gt; is a name. If not set, the type is taken from the request: &lt;code&gt;tml&lt;/code&gt; means &lt;code&gt;ANSWER&lt;/code&gt;, &lt;code&gt;query_string&lt;/code&gt; means &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;, and a GUID in &lt;code&gt;identifier&lt;/code&gt; means the type of that object.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public SqlMetadataInput identifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * GUID or name of the saved Answer, saved Liveboard, or data source (Model, View, or Table). Required for &lt;code&gt;ANSWER&lt;/code&gt;, &lt;code&gt;LIVEBOARD&lt;/code&gt;, and &lt;code&gt;LOGICAL_TABLE&lt;/code&gt;.
   * @return identifier
   */
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
  }


  public SqlMetadataInput visualizationIdentifiers(@javax.annotation.Nullable List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
    return this;
  }

  public SqlMetadataInput addVisualizationIdentifiersItem(String visualizationIdentifiersItem) {
    if (this.visualizationIdentifiers == null) {
      this.visualizationIdentifiers = new ArrayList<>();
    }
    this.visualizationIdentifiers.add(visualizationIdentifiersItem);
    return this;
  }

  /**
   * GUIDs or names of visualizations on the Liveboard. If not set, the API returns the SQL of all visualizations. Only for &lt;code&gt;LIVEBOARD&lt;/code&gt;.
   * @return visualizationIdentifiers
   */
  @javax.annotation.Nullable
  public List<String> getVisualizationIdentifiers() {
    return visualizationIdentifiers;
  }

  public void setVisualizationIdentifiers(@javax.annotation.Nullable List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
  }


  public SqlMetadataInput tml(@javax.annotation.Nullable String tml) {
    this.tml = tml;
    return this;
  }

  /**
   * The unsaved Answer, as Answer TML in YAML or JSON format. An unsaved Answer is not a saved object in ThoughtSpot and has no GUID. The API does not save the Answer and does not run the query. Only for &lt;code&gt;ANSWER&lt;/code&gt;, and not with &lt;code&gt;identifier&lt;/code&gt;.  **Note: TML in YAML format, when coming directly from our Playground, currently requires manual formatting. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
   * @return tml
   */
  @javax.annotation.Nullable
  public String getTml() {
    return tml;
  }

  public void setTml(@javax.annotation.Nullable String tml) {
    this.tml = tml;
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
   * @return the SqlMetadataInput instance itself
   */
  public SqlMetadataInput putAdditionalProperty(String key, Object value) {
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
    SqlMetadataInput sqlMetadataInput = (SqlMetadataInput) o;
    return Objects.equals(this.type, sqlMetadataInput.type) &&
        Objects.equals(this.identifier, sqlMetadataInput.identifier) &&
        Objects.equals(this.visualizationIdentifiers, sqlMetadataInput.visualizationIdentifiers) &&
        Objects.equals(this.tml, sqlMetadataInput.tml)&&
        Objects.equals(this.additionalProperties, sqlMetadataInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, identifier, visualizationIdentifiers, tml, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlMetadataInput {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    visualizationIdentifiers: ").append(toIndentedString(visualizationIdentifiers)).append("\n");
    sb.append("    tml: ").append(toIndentedString(tml)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("identifier");
    openapiFields.add("visualization_identifiers");
    openapiFields.add("tml");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SqlMetadataInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SqlMetadataInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SqlMetadataInput is not found in the empty JSON string", SqlMetadataInput.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("visualization_identifiers") != null && !jsonObj.get("visualization_identifiers").isJsonNull() && !jsonObj.get("visualization_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visualization_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("visualization_identifiers").toString()));
      }
      if ((jsonObj.get("tml") != null && !jsonObj.get("tml").isJsonNull()) && !jsonObj.get("tml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tml").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SqlMetadataInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SqlMetadataInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SqlMetadataInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SqlMetadataInput.class));

       return (TypeAdapter<T>) new TypeAdapter<SqlMetadataInput>() {
           @Override
           public void write(JsonWriter out, SqlMetadataInput value) throws IOException {
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
           public SqlMetadataInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SqlMetadataInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SqlMetadataInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SqlMetadataInput
   * @throws IOException if the JSON string is invalid with respect to SqlMetadataInput
   */
  public static SqlMetadataInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SqlMetadataInput.class);
  }

  /**
   * Convert an instance of SqlMetadataInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

