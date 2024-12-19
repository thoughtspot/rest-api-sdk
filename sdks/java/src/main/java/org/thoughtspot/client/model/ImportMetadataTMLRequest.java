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
import java.util.ArrayList;
import java.util.List;
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
 * ImportMetadataTMLRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-06T10:15:19.022933Z[Etc/UTC]")
public class ImportMetadataTMLRequest {
  public static final String SERIALIZED_NAME_METADATA_TMLS = "metadata_tmls";
  @SerializedName(SERIALIZED_NAME_METADATA_TMLS)
  private List<String> metadataTmls = new ArrayList<>();

  /**
   * Specifies the import policy for the TML import.
   */
  @JsonAdapter(ImportPolicyEnum.Adapter.class)
  public enum ImportPolicyEnum {
    PARTIAL("PARTIAL"),
    
    ALL_OR_NONE("ALL_OR_NONE"),
    
    VALIDATE_ONLY("VALIDATE_ONLY"),
    
    PARTIAL_OBJECT("PARTIAL_OBJECT");

    private String value;

    ImportPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImportPolicyEnum fromValue(String value) {
      for (ImportPolicyEnum b : ImportPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImportPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImportPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImportPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImportPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMPORT_POLICY = "import_policy";
  @SerializedName(SERIALIZED_NAME_IMPORT_POLICY)
  private ImportPolicyEnum importPolicy = ImportPolicyEnum.PARTIAL;

  public static final String SERIALIZED_NAME_CREATE_NEW = "create_new";
  @SerializedName(SERIALIZED_NAME_CREATE_NEW)
  private Boolean createNew = false;

  public static final String SERIALIZED_NAME_ALL_ORGS_CONTEXT = "all_orgs_context";
  @SerializedName(SERIALIZED_NAME_ALL_ORGS_CONTEXT)
  private Boolean allOrgsContext = false;

  public ImportMetadataTMLRequest() {
  }

  public ImportMetadataTMLRequest metadataTmls(List<String> metadataTmls) {
    
    this.metadataTmls = metadataTmls;
    return this;
  }

  public ImportMetadataTMLRequest addMetadataTmlsItem(String metadataTmlsItem) {
    if (this.metadataTmls == null) {
      this.metadataTmls = new ArrayList<>();
    }
    this.metadataTmls.add(metadataTmlsItem);
    return this;
  }

   /**
   * Details of TML objects. **Note: importing TML in YAML format, when coming directly from our Playground, is currently requires manual formatting. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
   * @return metadataTmls
  **/
  @javax.annotation.Nonnull
  public List<String> getMetadataTmls() {
    return metadataTmls;
  }


  public void setMetadataTmls(List<String> metadataTmls) {
    this.metadataTmls = metadataTmls;
  }


  public ImportMetadataTMLRequest importPolicy(ImportPolicyEnum importPolicy) {
    
    this.importPolicy = importPolicy;
    return this;
  }

   /**
   * Specifies the import policy for the TML import.
   * @return importPolicy
  **/
  @javax.annotation.Nullable
  public ImportPolicyEnum getImportPolicy() {
    return importPolicy;
  }


  public void setImportPolicy(ImportPolicyEnum importPolicy) {
    this.importPolicy = importPolicy;
  }


  public ImportMetadataTMLRequest createNew(Boolean createNew) {
    
    this.createNew = createNew;
    return this;
  }

   /**
   * If selected, creates TML objects with new GUIDs.
   * @return createNew
  **/
  @javax.annotation.Nullable
  public Boolean getCreateNew() {
    return createNew;
  }


  public void setCreateNew(Boolean createNew) {
    this.createNew = createNew;
  }


  public ImportMetadataTMLRequest allOrgsContext(Boolean allOrgsContext) {
    
    this.allOrgsContext = allOrgsContext;
    return this;
  }

   /**
   * If import is happening from all orgs context.
   * @return allOrgsContext
  **/
  @javax.annotation.Nullable
  public Boolean getAllOrgsContext() {
    return allOrgsContext;
  }


  public void setAllOrgsContext(Boolean allOrgsContext) {
    this.allOrgsContext = allOrgsContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportMetadataTMLRequest importMetadataTMLRequest = (ImportMetadataTMLRequest) o;
    return Objects.equals(this.metadataTmls, importMetadataTMLRequest.metadataTmls) &&
        Objects.equals(this.importPolicy, importMetadataTMLRequest.importPolicy) &&
        Objects.equals(this.createNew, importMetadataTMLRequest.createNew) &&
        Objects.equals(this.allOrgsContext, importMetadataTMLRequest.allOrgsContext);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataTmls, importPolicy, createNew, allOrgsContext);
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
    sb.append("class ImportMetadataTMLRequest {\n");
    sb.append("    metadataTmls: ").append(toIndentedString(metadataTmls)).append("\n");
    sb.append("    importPolicy: ").append(toIndentedString(importPolicy)).append("\n");
    sb.append("    createNew: ").append(toIndentedString(createNew)).append("\n");
    sb.append("    allOrgsContext: ").append(toIndentedString(allOrgsContext)).append("\n");
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
    openapiFields.add("metadata_tmls");
    openapiFields.add("import_policy");
    openapiFields.add("create_new");
    openapiFields.add("all_orgs_context");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_tmls");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImportMetadataTMLRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImportMetadataTMLRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImportMetadataTMLRequest is not found in the empty JSON string", ImportMetadataTMLRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ImportMetadataTMLRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImportMetadataTMLRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImportMetadataTMLRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("metadata_tmls") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metadata_tmls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_tmls` to be an array in the JSON string but got `%s`", jsonObj.get("metadata_tmls").toString()));
      }
      if ((jsonObj.get("import_policy") != null && !jsonObj.get("import_policy").isJsonNull()) && !jsonObj.get("import_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_policy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImportMetadataTMLRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImportMetadataTMLRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImportMetadataTMLRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImportMetadataTMLRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImportMetadataTMLRequest>() {
           @Override
           public void write(JsonWriter out, ImportMetadataTMLRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImportMetadataTMLRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImportMetadataTMLRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImportMetadataTMLRequest
  * @throws IOException if the JSON string is invalid with respect to ImportMetadataTMLRequest
  */
  public static ImportMetadataTMLRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImportMetadataTMLRequest.class);
  }

 /**
  * Convert an instance of ImportMetadataTMLRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

