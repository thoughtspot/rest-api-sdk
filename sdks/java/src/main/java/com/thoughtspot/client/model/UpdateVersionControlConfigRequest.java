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
import com.thoughtspot.client.model.VersionControlCredentialInput;
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
 * UpdateVersionControlConfigRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UpdateVersionControlConfigRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Version control provider hosting the repository. Omit this to leave the stored provider unchanged.
   */
  @JsonAdapter(ProviderEnum.Adapter.class)
  public enum ProviderEnum {
    GITHUB("GITHUB"),
    
    GITLAB("GITLAB"),
    
    BITBUCKET("BITBUCKET"),
    
    AZURE_DEVOPS("AZURE_DEVOPS");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProviderEnum fromValue(String value) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProviderEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProviderEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  @javax.annotation.Nullable
  private ProviderEnum provider;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  @javax.annotation.Nullable
  private String repositoryUrl;

  public static final String SERIALIZED_NAME_COMMIT_BRANCH = "commit_branch";
  @SerializedName(SERIALIZED_NAME_COMMIT_BRANCH)
  @javax.annotation.Nullable
  private String commitBranch;

  public static final String SERIALIZED_NAME_ROOT_DIR = "root_dir";
  @SerializedName(SERIALIZED_NAME_ROOT_DIR)
  @javax.annotation.Nullable
  private String rootDir;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  @javax.annotation.Nullable
  private VersionControlCredentialInput credential;

  /**
   * Gets or Sets disabledOperations
   */
  @JsonAdapter(DisabledOperationsEnum.Adapter.class)
  public enum DisabledOperationsEnum {
    COMMIT("COMMIT"),
    
    DEPLOY("DEPLOY");

    private String value;

    DisabledOperationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisabledOperationsEnum fromValue(String value) {
      for (DisabledOperationsEnum b : DisabledOperationsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisabledOperationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisabledOperationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisabledOperationsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisabledOperationsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DisabledOperationsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DISABLED_OPERATIONS = "disabled_operations";
  @SerializedName(SERIALIZED_NAME_DISABLED_OPERATIONS)
  @javax.annotation.Nullable
  private List<DisabledOperationsEnum> disabledOperations;

  public UpdateVersionControlConfigRequest() {
  }

  public UpdateVersionControlConfigRequest provider(@javax.annotation.Nullable ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Version control provider hosting the repository. Omit this to leave the stored provider unchanged.
   * @return provider
   */
  @javax.annotation.Nullable
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(@javax.annotation.Nullable ProviderEnum provider) {
    this.provider = provider;
  }


  public UpdateVersionControlConfigRequest repositoryUrl(@javax.annotation.Nullable String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * HTTPS URL of the repository your Org versions to. Omit this to leave the stored repository unchanged.
   * @return repositoryUrl
   */
  @javax.annotation.Nullable
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(@javax.annotation.Nullable String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public UpdateVersionControlConfigRequest commitBranch(@javax.annotation.Nullable String commitBranch) {
    this.commitBranch = commitBranch;
    return this;
  }

  /**
   * Branch that versioning runs commit to. Omit this to leave the stored branch unchanged.
   * @return commitBranch
   */
  @javax.annotation.Nullable
  public String getCommitBranch() {
    return commitBranch;
  }

  public void setCommitBranch(@javax.annotation.Nullable String commitBranch) {
    this.commitBranch = commitBranch;
  }


  public UpdateVersionControlConfigRequest rootDir(@javax.annotation.Nullable String rootDir) {
    this.rootDir = rootDir;
    return this;
  }

  /**
   * Repository-relative directory that every write must resolve under. Omit this to leave the stored directory unchanged.
   * @return rootDir
   */
  @javax.annotation.Nullable
  public String getRootDir() {
    return rootDir;
  }

  public void setRootDir(@javax.annotation.Nullable String rootDir) {
    this.rootDir = rootDir;
  }


  public UpdateVersionControlConfigRequest credential(@javax.annotation.Nullable VersionControlCredentialInput credential) {
    this.credential = credential;
    return this;
  }

  /**
   * Credential ThoughtSpot uses to reach the repository. Omit this to keep the stored credential, unless the provider, host or repository owner changed, in which case a new credential is required.
   * @return credential
   */
  @javax.annotation.Nullable
  public VersionControlCredentialInput getCredential() {
    return credential;
  }

  public void setCredential(@javax.annotation.Nullable VersionControlCredentialInput credential) {
    this.credential = credential;
  }


  public UpdateVersionControlConfigRequest disabledOperations(@javax.annotation.Nullable List<DisabledOperationsEnum> disabledOperations) {
    this.disabledOperations = disabledOperations;
    return this;
  }

  public UpdateVersionControlConfigRequest addDisabledOperationsItem(DisabledOperationsEnum disabledOperationsItem) {
    if (this.disabledOperations == null) {
      this.disabledOperations = new ArrayList<>();
    }
    this.disabledOperations.add(disabledOperationsItem);
    return this;
  }

  /**
   * Operations to turn off for this Org, replacing whatever is stored. Send an empty array to disable nothing. Omit this to leave the stored set unchanged.
   * @return disabledOperations
   */
  @javax.annotation.Nullable
  public List<DisabledOperationsEnum> getDisabledOperations() {
    return disabledOperations;
  }

  public void setDisabledOperations(@javax.annotation.Nullable List<DisabledOperationsEnum> disabledOperations) {
    this.disabledOperations = disabledOperations;
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
   * @return the UpdateVersionControlConfigRequest instance itself
   */
  public UpdateVersionControlConfigRequest putAdditionalProperty(String key, Object value) {
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
    UpdateVersionControlConfigRequest updateVersionControlConfigRequest = (UpdateVersionControlConfigRequest) o;
    return Objects.equals(this.provider, updateVersionControlConfigRequest.provider) &&
        Objects.equals(this.repositoryUrl, updateVersionControlConfigRequest.repositoryUrl) &&
        Objects.equals(this.commitBranch, updateVersionControlConfigRequest.commitBranch) &&
        Objects.equals(this.rootDir, updateVersionControlConfigRequest.rootDir) &&
        Objects.equals(this.credential, updateVersionControlConfigRequest.credential) &&
        Objects.equals(this.disabledOperations, updateVersionControlConfigRequest.disabledOperations)&&
        Objects.equals(this.additionalProperties, updateVersionControlConfigRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, repositoryUrl, commitBranch, rootDir, credential, disabledOperations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVersionControlConfigRequest {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    commitBranch: ").append(toIndentedString(commitBranch)).append("\n");
    sb.append("    rootDir: ").append(toIndentedString(rootDir)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    disabledOperations: ").append(toIndentedString(disabledOperations)).append("\n");
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
    openapiFields.add("provider");
    openapiFields.add("repository_url");
    openapiFields.add("commit_branch");
    openapiFields.add("root_dir");
    openapiFields.add("credential");
    openapiFields.add("disabled_operations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateVersionControlConfigRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateVersionControlConfigRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVersionControlConfigRequest is not found in the empty JSON string", UpdateVersionControlConfigRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) && !jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      // validate the optional field `provider`
      if (jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) {
        ProviderEnum.validateJsonElement(jsonObj.get("provider"));
      }
      if ((jsonObj.get("repository_url") != null && !jsonObj.get("repository_url").isJsonNull()) && !jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if ((jsonObj.get("commit_branch") != null && !jsonObj.get("commit_branch").isJsonNull()) && !jsonObj.get("commit_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_branch").toString()));
      }
      if ((jsonObj.get("root_dir") != null && !jsonObj.get("root_dir").isJsonNull()) && !jsonObj.get("root_dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `root_dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("root_dir").toString()));
      }
      // validate the optional field `credential`
      if (jsonObj.get("credential") != null && !jsonObj.get("credential").isJsonNull()) {
        VersionControlCredentialInput.validateJsonElement(jsonObj.get("credential"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("disabled_operations") != null && !jsonObj.get("disabled_operations").isJsonNull() && !jsonObj.get("disabled_operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disabled_operations` to be an array in the JSON string but got `%s`", jsonObj.get("disabled_operations").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVersionControlConfigRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVersionControlConfigRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVersionControlConfigRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVersionControlConfigRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVersionControlConfigRequest>() {
           @Override
           public void write(JsonWriter out, UpdateVersionControlConfigRequest value) throws IOException {
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
           public UpdateVersionControlConfigRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdateVersionControlConfigRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdateVersionControlConfigRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateVersionControlConfigRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateVersionControlConfigRequest
   */
  public static UpdateVersionControlConfigRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVersionControlConfigRequest.class);
  }

  /**
   * Convert an instance of UpdateVersionControlConfigRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

