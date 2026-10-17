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
import com.thoughtspot.client.model.Org;
import com.thoughtspot.client.model.VersionControlCredentialStatus;
import com.thoughtspot.client.model.VersionControlPrincipal;
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
 * An Org&#39;s stored version control configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class VersionControlConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nonnull
  private Org org;

  /**
   * Version control provider hosting the repository.
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
  @javax.annotation.Nonnull
  private ProviderEnum provider;

  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  @javax.annotation.Nonnull
  private String repositoryUrl;

  public static final String SERIALIZED_NAME_COMMIT_BRANCH = "commit_branch";
  @SerializedName(SERIALIZED_NAME_COMMIT_BRANCH)
  @javax.annotation.Nonnull
  private String commitBranch;

  public static final String SERIALIZED_NAME_ROOT_DIR = "root_dir";
  @SerializedName(SERIALIZED_NAME_ROOT_DIR)
  @javax.annotation.Nullable
  private String rootDir;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  @javax.annotation.Nonnull
  private VersionControlCredentialStatus credential;

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
  @javax.annotation.Nonnull
  private List<DisabledOperationsEnum> disabledOperations;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  @javax.annotation.Nonnull
  private VersionControlPrincipal createdBy;

  public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float creationTimeInMillis;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "last_modified_by";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  @javax.annotation.Nonnull
  private VersionControlPrincipal lastModifiedBy;

  public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS = "modification_time_in_millis";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
  @javax.annotation.Nonnull
  private Float modificationTimeInMillis;

  public VersionControlConfig() {
  }

  public VersionControlConfig org(@javax.annotation.Nonnull Org org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @javax.annotation.Nonnull
  public Org getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nonnull Org org) {
    this.org = org;
  }


  public VersionControlConfig provider(@javax.annotation.Nonnull ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Version control provider hosting the repository.
   * @return provider
   */
  @javax.annotation.Nonnull
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(@javax.annotation.Nonnull ProviderEnum provider) {
    this.provider = provider;
  }


  public VersionControlConfig repositoryUrl(@javax.annotation.Nonnull String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * HTTPS URL of the repository this Org versions to.
   * @return repositoryUrl
   */
  @javax.annotation.Nonnull
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(@javax.annotation.Nonnull String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public VersionControlConfig commitBranch(@javax.annotation.Nonnull String commitBranch) {
    this.commitBranch = commitBranch;
    return this;
  }

  /**
   * Branch that versioning runs commit to.
   * @return commitBranch
   */
  @javax.annotation.Nonnull
  public String getCommitBranch() {
    return commitBranch;
  }

  public void setCommitBranch(@javax.annotation.Nonnull String commitBranch) {
    this.commitBranch = commitBranch;
  }


  public VersionControlConfig rootDir(@javax.annotation.Nullable String rootDir) {
    this.rootDir = rootDir;
    return this;
  }

  /**
   * Repository-relative directory that every write resolves under. Empty when writes go to the repository root.
   * @return rootDir
   */
  @javax.annotation.Nullable
  public String getRootDir() {
    return rootDir;
  }

  public void setRootDir(@javax.annotation.Nullable String rootDir) {
    this.rootDir = rootDir;
  }


  public VersionControlConfig credential(@javax.annotation.Nonnull VersionControlCredentialStatus credential) {
    this.credential = credential;
    return this;
  }

  /**
   * Get credential
   * @return credential
   */
  @javax.annotation.Nonnull
  public VersionControlCredentialStatus getCredential() {
    return credential;
  }

  public void setCredential(@javax.annotation.Nonnull VersionControlCredentialStatus credential) {
    this.credential = credential;
  }


  public VersionControlConfig disabledOperations(@javax.annotation.Nonnull List<DisabledOperationsEnum> disabledOperations) {
    this.disabledOperations = disabledOperations;
    return this;
  }

  public VersionControlConfig addDisabledOperationsItem(DisabledOperationsEnum disabledOperationsItem) {
    if (this.disabledOperations == null) {
      this.disabledOperations = new ArrayList<>();
    }
    this.disabledOperations.add(disabledOperationsItem);
    return this;
  }

  /**
   * Operations turned off for this Org. Empty when none are.
   * @return disabledOperations
   */
  @javax.annotation.Nonnull
  public List<DisabledOperationsEnum> getDisabledOperations() {
    return disabledOperations;
  }

  public void setDisabledOperations(@javax.annotation.Nonnull List<DisabledOperationsEnum> disabledOperations) {
    this.disabledOperations = disabledOperations;
  }


  public VersionControlConfig createdBy(@javax.annotation.Nonnull VersionControlPrincipal createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nonnull
  public VersionControlPrincipal getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@javax.annotation.Nonnull VersionControlPrincipal createdBy) {
    this.createdBy = createdBy;
  }


  public VersionControlConfig creationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
    return this;
  }

  /**
   * Creation time, in milliseconds since the Unix epoch.
   * @return creationTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getCreationTimeInMillis() {
    return creationTimeInMillis;
  }

  public void setCreationTimeInMillis(@javax.annotation.Nonnull Float creationTimeInMillis) {
    this.creationTimeInMillis = creationTimeInMillis;
  }


  public VersionControlConfig lastModifiedBy(@javax.annotation.Nonnull VersionControlPrincipal lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   */
  @javax.annotation.Nonnull
  public VersionControlPrincipal getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(@javax.annotation.Nonnull VersionControlPrincipal lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public VersionControlConfig modificationTimeInMillis(@javax.annotation.Nonnull Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
    return this;
  }

  /**
   * Last write time, in milliseconds since the Unix epoch.
   * @return modificationTimeInMillis
   */
  @javax.annotation.Nonnull
  public Float getModificationTimeInMillis() {
    return modificationTimeInMillis;
  }

  public void setModificationTimeInMillis(@javax.annotation.Nonnull Float modificationTimeInMillis) {
    this.modificationTimeInMillis = modificationTimeInMillis;
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
   * @return the VersionControlConfig instance itself
   */
  public VersionControlConfig putAdditionalProperty(String key, Object value) {
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
    VersionControlConfig versionControlConfig = (VersionControlConfig) o;
    return Objects.equals(this.org, versionControlConfig.org) &&
        Objects.equals(this.provider, versionControlConfig.provider) &&
        Objects.equals(this.repositoryUrl, versionControlConfig.repositoryUrl) &&
        Objects.equals(this.commitBranch, versionControlConfig.commitBranch) &&
        Objects.equals(this.rootDir, versionControlConfig.rootDir) &&
        Objects.equals(this.credential, versionControlConfig.credential) &&
        Objects.equals(this.disabledOperations, versionControlConfig.disabledOperations) &&
        Objects.equals(this.createdBy, versionControlConfig.createdBy) &&
        Objects.equals(this.creationTimeInMillis, versionControlConfig.creationTimeInMillis) &&
        Objects.equals(this.lastModifiedBy, versionControlConfig.lastModifiedBy) &&
        Objects.equals(this.modificationTimeInMillis, versionControlConfig.modificationTimeInMillis)&&
        Objects.equals(this.additionalProperties, versionControlConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, provider, repositoryUrl, commitBranch, rootDir, credential, disabledOperations, createdBy, creationTimeInMillis, lastModifiedBy, modificationTimeInMillis, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlConfig {\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    commitBranch: ").append(toIndentedString(commitBranch)).append("\n");
    sb.append("    rootDir: ").append(toIndentedString(rootDir)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    disabledOperations: ").append(toIndentedString(disabledOperations)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationTimeInMillis: ").append(toIndentedString(creationTimeInMillis)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    modificationTimeInMillis: ").append(toIndentedString(modificationTimeInMillis)).append("\n");
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
    openapiFields.add("org");
    openapiFields.add("provider");
    openapiFields.add("repository_url");
    openapiFields.add("commit_branch");
    openapiFields.add("root_dir");
    openapiFields.add("credential");
    openapiFields.add("disabled_operations");
    openapiFields.add("created_by");
    openapiFields.add("creation_time_in_millis");
    openapiFields.add("last_modified_by");
    openapiFields.add("modification_time_in_millis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("org");
    openapiRequiredFields.add("provider");
    openapiRequiredFields.add("repository_url");
    openapiRequiredFields.add("commit_branch");
    openapiRequiredFields.add("credential");
    openapiRequiredFields.add("disabled_operations");
    openapiRequiredFields.add("created_by");
    openapiRequiredFields.add("creation_time_in_millis");
    openapiRequiredFields.add("last_modified_by");
    openapiRequiredFields.add("modification_time_in_millis");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionControlConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionControlConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionControlConfig is not found in the empty JSON string", VersionControlConfig.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionControlConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `org`
      Org.validateJsonElement(jsonObj.get("org"));
      if (!jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      // validate the required field `provider`
      ProviderEnum.validateJsonElement(jsonObj.get("provider"));
      if (!jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if (!jsonObj.get("commit_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_branch").toString()));
      }
      if ((jsonObj.get("root_dir") != null && !jsonObj.get("root_dir").isJsonNull()) && !jsonObj.get("root_dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `root_dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("root_dir").toString()));
      }
      // validate the required field `credential`
      VersionControlCredentialStatus.validateJsonElement(jsonObj.get("credential"));
      // ensure the required json array is present
      if (jsonObj.get("disabled_operations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("disabled_operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disabled_operations` to be an array in the JSON string but got `%s`", jsonObj.get("disabled_operations").toString()));
      }
      // validate the required field `created_by`
      VersionControlPrincipal.validateJsonElement(jsonObj.get("created_by"));
      // validate the required field `last_modified_by`
      VersionControlPrincipal.validateJsonElement(jsonObj.get("last_modified_by"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionControlConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionControlConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionControlConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionControlConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionControlConfig>() {
           @Override
           public void write(JsonWriter out, VersionControlConfig value) throws IOException {
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
           public VersionControlConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VersionControlConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VersionControlConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionControlConfig
   * @throws IOException if the JSON string is invalid with respect to VersionControlConfig
   */
  public static VersionControlConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionControlConfig.class);
  }

  /**
   * Convert an instance of VersionControlConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

