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
import com.thoughtspot.client.model.PublishMetadataListItem;
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
 * UnpublishMetadataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UnpublishMetadataRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  @javax.annotation.Nullable
  private Boolean force;

  public static final String SERIALIZED_NAME_INCLUDE_DEPENDENCIES = "include_dependencies";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DEPENDENCIES)
  @javax.annotation.Nonnull
  private Boolean includeDependencies;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nonnull
  private List<PublishMetadataListItem> metadata;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
  @javax.annotation.Nonnull
  private List<String> orgIdentifiers;

  public UnpublishMetadataRequest() {
  }

  public UnpublishMetadataRequest force(@javax.annotation.Nullable Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Force unpublishes the object. This will break all the dependent objects in the unpublished orgs.
   * @return force
   */
  @javax.annotation.Nullable
  public Boolean getForce() {
    return force;
  }

  public void setForce(@javax.annotation.Nullable Boolean force) {
    this.force = force;
  }


  public UnpublishMetadataRequest includeDependencies(@javax.annotation.Nonnull Boolean includeDependencies) {
    this.includeDependencies = includeDependencies;
    return this;
  }

  /**
   * Should we unpublish all the dependencies for the objects specified. The dependencies will be unpublished if no other published object is using it.
   * @return includeDependencies
   */
  @javax.annotation.Nonnull
  public Boolean getIncludeDependencies() {
    return includeDependencies;
  }

  public void setIncludeDependencies(@javax.annotation.Nonnull Boolean includeDependencies) {
    this.includeDependencies = includeDependencies;
  }


  public UnpublishMetadataRequest metadata(@javax.annotation.Nonnull List<PublishMetadataListItem> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UnpublishMetadataRequest addMetadataItem(PublishMetadataListItem metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Metadata objects.
   * @return metadata
   */
  @javax.annotation.Nonnull
  public List<PublishMetadataListItem> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nonnull List<PublishMetadataListItem> metadata) {
    this.metadata = metadata;
  }


  public UnpublishMetadataRequest orgIdentifiers(@javax.annotation.Nonnull List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
    return this;
  }

  public UnpublishMetadataRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
    if (this.orgIdentifiers == null) {
      this.orgIdentifiers = new ArrayList<>();
    }
    this.orgIdentifiers.add(orgIdentifiersItem);
    return this;
  }

  /**
   * Unique ID or name of orgs.
   * @return orgIdentifiers
   */
  @javax.annotation.Nonnull
  public List<String> getOrgIdentifiers() {
    return orgIdentifiers;
  }

  public void setOrgIdentifiers(@javax.annotation.Nonnull List<String> orgIdentifiers) {
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
    UnpublishMetadataRequest unpublishMetadataRequest = (UnpublishMetadataRequest) o;
    return Objects.equals(this.force, unpublishMetadataRequest.force) &&
        Objects.equals(this.includeDependencies, unpublishMetadataRequest.includeDependencies) &&
        Objects.equals(this.metadata, unpublishMetadataRequest.metadata) &&
        Objects.equals(this.orgIdentifiers, unpublishMetadataRequest.orgIdentifiers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, includeDependencies, metadata, orgIdentifiers);
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
    sb.append("class UnpublishMetadataRequest {\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    includeDependencies: ").append(toIndentedString(includeDependencies)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("force");
    openapiFields.add("include_dependencies");
    openapiFields.add("metadata");
    openapiFields.add("org_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("include_dependencies");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("org_identifiers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UnpublishMetadataRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnpublishMetadataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnpublishMetadataRequest is not found in the empty JSON string", UnpublishMetadataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnpublishMetadataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnpublishMetadataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UnpublishMetadataRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }

      JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
      // validate the required field `metadata` (array)
      for (int i = 0; i < jsonArraymetadata.size(); i++) {
        PublishMetadataListItem.validateJsonElement(jsonArraymetadata.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("org_identifiers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("org_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("org_identifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnpublishMetadataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnpublishMetadataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnpublishMetadataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnpublishMetadataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UnpublishMetadataRequest>() {
           @Override
           public void write(JsonWriter out, UnpublishMetadataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnpublishMetadataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UnpublishMetadataRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UnpublishMetadataRequest
   * @throws IOException if the JSON string is invalid with respect to UnpublishMetadataRequest
   */
  public static UnpublishMetadataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnpublishMetadataRequest.class);
  }

  /**
   * Convert an instance of UnpublishMetadataRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

