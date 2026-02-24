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
 * AWS S3 storage configuration details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class AwsS3Config implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUCKET_NAME = "bucket_name";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  @javax.annotation.Nonnull
  private String bucketName;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  @javax.annotation.Nonnull
  private String region;

  public static final String SERIALIZED_NAME_ROLE_ARN = "role_arn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  @javax.annotation.Nonnull
  private String roleArn;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_PATH_PREFIX = "path_prefix";
  @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
  @javax.annotation.Nullable
  private String pathPrefix;

  public AwsS3Config() {
  }

  public AwsS3Config bucketName(@javax.annotation.Nonnull String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Name of the S3 bucket where webhook payloads are stored.
   * @return bucketName
   */
  @javax.annotation.Nonnull
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(@javax.annotation.Nonnull String bucketName) {
    this.bucketName = bucketName;
  }


  public AwsS3Config region(@javax.annotation.Nonnull String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region where the S3 bucket is located.
   * @return region
   */
  @javax.annotation.Nonnull
  public String getRegion() {
    return region;
  }

  public void setRegion(@javax.annotation.Nonnull String region) {
    this.region = region;
  }


  public AwsS3Config roleArn(@javax.annotation.Nonnull String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * ARN of the IAM role used for S3 access.
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(@javax.annotation.Nonnull String roleArn) {
    this.roleArn = roleArn;
  }


  public AwsS3Config externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External ID for secure cross-account role assumption.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public AwsS3Config pathPrefix(@javax.annotation.Nullable String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * Path prefix for organizing objects within the bucket.
   * @return pathPrefix
   */
  @javax.annotation.Nullable
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(@javax.annotation.Nullable String pathPrefix) {
    this.pathPrefix = pathPrefix;
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
   * @return the AwsS3Config instance itself
   */
  public AwsS3Config putAdditionalProperty(String key, Object value) {
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
    AwsS3Config awsS3Config = (AwsS3Config) o;
    return Objects.equals(this.bucketName, awsS3Config.bucketName) &&
        Objects.equals(this.region, awsS3Config.region) &&
        Objects.equals(this.roleArn, awsS3Config.roleArn) &&
        Objects.equals(this.externalId, awsS3Config.externalId) &&
        Objects.equals(this.pathPrefix, awsS3Config.pathPrefix)&&
        Objects.equals(this.additionalProperties, awsS3Config.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, region, roleArn, externalId, pathPrefix, additionalProperties);
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
    sb.append("class AwsS3Config {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
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
    openapiFields.add("bucket_name");
    openapiFields.add("region");
    openapiFields.add("role_arn");
    openapiFields.add("external_id");
    openapiFields.add("path_prefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bucket_name");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("role_arn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsS3Config
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsS3Config.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsS3Config is not found in the empty JSON string", AwsS3Config.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AwsS3Config.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("bucket_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucket_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucket_name").toString()));
      }
      if (!jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if (!jsonObj.get("role_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_arn").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("path_prefix") != null && !jsonObj.get("path_prefix").isJsonNull()) && !jsonObj.get("path_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path_prefix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsS3Config.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsS3Config' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsS3Config> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsS3Config.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsS3Config>() {
           @Override
           public void write(JsonWriter out, AwsS3Config value) throws IOException {
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
           public AwsS3Config read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AwsS3Config instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AwsS3Config given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsS3Config
   * @throws IOException if the JSON string is invalid with respect to AwsS3Config
   */
  public static AwsS3Config fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsS3Config.class);
  }

  /**
   * Convert an instance of AwsS3Config to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

