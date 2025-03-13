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
 * SearchRolesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T11:03:56.651712770Z[Etc/UTC]")
public class SearchRolesRequest {
  public static final String SERIALIZED_NAME_ROLE_IDENTIFIERS = "role_identifiers";
  @SerializedName(SERIALIZED_NAME_ROLE_IDENTIFIERS)
  private List<String> roleIdentifiers;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIERS = "org_identifiers";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIERS)
  private List<String> orgIdentifiers;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIERS = "group_identifiers";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIERS)
  private List<String> groupIdentifiers;

  /**
   * Gets or Sets privileges
   */
  @JsonAdapter(PrivilegesEnum.Adapter.class)
  public enum PrivilegesEnum {
    UNKNOWN("UNKNOWN"),
    
    ADMINISTRATION("ADMINISTRATION"),
    
    AUTHORING("AUTHORING"),
    
    USERDATAUPLOADING("USERDATAUPLOADING"),
    
    DATADOWNLOADING("DATADOWNLOADING"),
    
    USERMANAGEMENT("USERMANAGEMENT"),
    
    SECURITYMANAGEMENT("SECURITYMANAGEMENT"),
    
    LOGICALMODELING("LOGICALMODELING"),
    
    DATAMANAGEMENT("DATAMANAGEMENT"),
    
    TAGMANAGEMENT("TAGMANAGEMENT"),
    
    SHAREWITHALL("SHAREWITHALL"),
    
    SYSTEMMANAGEMENT("SYSTEMMANAGEMENT"),
    
    JOBSCHEDULING("JOBSCHEDULING"),
    
    A3ANALYSIS("A3ANALYSIS"),
    
    EXPERIMENTALFEATUREPRIVILEGE("EXPERIMENTALFEATUREPRIVILEGE"),
    
    BYPASSRLS("BYPASSRLS"),
    
    RANALYSIS("RANALYSIS"),
    
    DISABLE_PINBOARD_CREATION("DISABLE_PINBOARD_CREATION"),
    
    DEVELOPER("DEVELOPER"),
    
    APPLICATION_ADMINISTRATION("APPLICATION_ADMINISTRATION"),
    
    USER_ADMINISTRATION("USER_ADMINISTRATION"),
    
    GROUP_ADMINISTRATION("GROUP_ADMINISTRATION"),
    
    BACKUP_ADMINISTRATION("BACKUP_ADMINISTRATION"),
    
    SYSTEM_INFO_ADMINISTRATION("SYSTEM_INFO_ADMINISTRATION"),
    
    ENABLESPOTAPPCREATION("ENABLESPOTAPPCREATION"),
    
    SYNCMANAGEMENT("SYNCMANAGEMENT"),
    
    ORG_ADMINISTRATION("ORG_ADMINISTRATION"),
    
    ROLE_ADMINISTRATION("ROLE_ADMINISTRATION"),
    
    AUTHENTICATION_ADMINISTRATION("AUTHENTICATION_ADMINISTRATION"),
    
    BILLING_INFO_ADMINISTRATION("BILLING_INFO_ADMINISTRATION"),
    
    PREVIEW_THOUGHTSPOT_SAGE("PREVIEW_THOUGHTSPOT_SAGE"),
    
    LIVEBOARD_VERIFIER("LIVEBOARD_VERIFIER"),
    
    CAN_MANAGE_CUSTOM_CALENDAR("CAN_MANAGE_CUSTOM_CALENDAR"),
    
    CAN_CREATE_OR_EDIT_CONNECTIONS("CAN_CREATE_OR_EDIT_CONNECTIONS"),
    
    CAN_CONFIGURE_CONNECTIONS("CAN_CONFIGURE_CONNECTIONS"),
    
    CAN_MANAGE_WORKSHEET_VIEWS_TABLES("CAN_MANAGE_WORKSHEET_VIEWS_TABLES"),
    
    CAN_MANAGE_VERSION_CONTROL("CAN_MANAGE_VERSION_CONTROL"),
    
    THIRDPARTY_ANALYSIS("THIRDPARTY_ANALYSIS"),
    
    CONTROL_TRUSTED_AUTH("CONTROL_TRUSTED_AUTH"),
    
    CAN_CREATE_CATALOG("CAN_CREATE_CATALOG"),
    
    ALLOW_NON_EMBED_FULL_APP_ACCESS("ALLOW_NON_EMBED_FULL_APP_ACCESS"),
    
    CAN_ACCESS_ANALYST_STUDIO("CAN_ACCESS_ANALYST_STUDIO"),
    
    CAN_MANAGE_ANALYST_STUDIO("CAN_MANAGE_ANALYST_STUDIO"),
    
    PREVIEW_DOCUMENT_SEARCH("PREVIEW_DOCUMENT_SEARCH"),
    
    CAN_SETUP_VERSION_CONTROL("CAN_SETUP_VERSION_CONTROL");

    private String value;

    PrivilegesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivilegesEnum fromValue(String value) {
      for (PrivilegesEnum b : PrivilegesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivilegesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivilegesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivilegesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES)
  private List<PrivilegesEnum> privileges;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private Boolean deprecated;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private Boolean external;

  public static final String SERIALIZED_NAME_SHARED_VIA_CONNECTION = "shared_via_connection";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_SHARED_VIA_CONNECTION)
  private Boolean sharedViaConnection;

  /**
   * Gets or Sets permissions
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    READ_ONLY("READ_ONLY"),
    
    MODIFY("MODIFY"),
    
    NO_ACCESS("NO_ACCESS");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<PermissionsEnum> permissions;

  public SearchRolesRequest() {
  }

  public SearchRolesRequest roleIdentifiers(List<String> roleIdentifiers) {
    
    this.roleIdentifiers = roleIdentifiers;
    return this;
  }

  public SearchRolesRequest addRoleIdentifiersItem(String roleIdentifiersItem) {
    if (this.roleIdentifiers == null) {
      this.roleIdentifiers = new ArrayList<>();
    }
    this.roleIdentifiers.add(roleIdentifiersItem);
    return this;
  }

   /**
   * unique ID or name of the Roles
   * @return roleIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getRoleIdentifiers() {
    return roleIdentifiers;
  }


  public void setRoleIdentifiers(List<String> roleIdentifiers) {
    this.roleIdentifiers = roleIdentifiers;
  }


  public SearchRolesRequest orgIdentifiers(List<String> orgIdentifiers) {
    
    this.orgIdentifiers = orgIdentifiers;
    return this;
  }

  public SearchRolesRequest addOrgIdentifiersItem(String orgIdentifiersItem) {
    if (this.orgIdentifiers == null) {
      this.orgIdentifiers = new ArrayList<>();
    }
    this.orgIdentifiers.add(orgIdentifiersItem);
    return this;
  }

   /**
   * Unique Id or name of the Organisation
   * @return orgIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getOrgIdentifiers() {
    return orgIdentifiers;
  }


  public void setOrgIdentifiers(List<String> orgIdentifiers) {
    this.orgIdentifiers = orgIdentifiers;
  }


  public SearchRolesRequest groupIdentifiers(List<String> groupIdentifiers) {
    
    this.groupIdentifiers = groupIdentifiers;
    return this;
  }

  public SearchRolesRequest addGroupIdentifiersItem(String groupIdentifiersItem) {
    if (this.groupIdentifiers == null) {
      this.groupIdentifiers = new ArrayList<>();
    }
    this.groupIdentifiers.add(groupIdentifiersItem);
    return this;
  }

   /**
   * Unique Id or name of the User Group
   * @return groupIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getGroupIdentifiers() {
    return groupIdentifiers;
  }


  public void setGroupIdentifiers(List<String> groupIdentifiers) {
    this.groupIdentifiers = groupIdentifiers;
  }


  public SearchRolesRequest privileges(List<PrivilegesEnum> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public SearchRolesRequest addPrivilegesItem(PrivilegesEnum privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Privileges assigned to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.
   * @return privileges
  **/
  @javax.annotation.Nullable
  public List<PrivilegesEnum> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(List<PrivilegesEnum> privileges) {
    this.privileges = privileges;
  }


  @Deprecated
  public SearchRolesRequest deprecated(Boolean deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Indicates whether the Role is deprecated.
   * @return deprecated
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public Boolean getDeprecated() {
    return deprecated;
  }


  @Deprecated
  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  @Deprecated
  public SearchRolesRequest external(Boolean external) {
    
    this.external = external;
    return this;
  }

   /**
   * Indicates whether the Role is external
   * @return external
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public Boolean getExternal() {
    return external;
  }


  @Deprecated
  public void setExternal(Boolean external) {
    this.external = external;
  }


  @Deprecated
  public SearchRolesRequest sharedViaConnection(Boolean sharedViaConnection) {
    
    this.sharedViaConnection = sharedViaConnection;
    return this;
  }

   /**
   * Indicates whether the Role is shared via connection
   * @return sharedViaConnection
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public Boolean getSharedViaConnection() {
    return sharedViaConnection;
  }


  @Deprecated
  public void setSharedViaConnection(Boolean sharedViaConnection) {
    this.sharedViaConnection = sharedViaConnection;
  }


  @Deprecated
  public SearchRolesRequest permissions(List<PermissionsEnum> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public SearchRolesRequest addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permission details of the Role
   * @return permissions
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }


  @Deprecated
  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRolesRequest searchRolesRequest = (SearchRolesRequest) o;
    return Objects.equals(this.roleIdentifiers, searchRolesRequest.roleIdentifiers) &&
        Objects.equals(this.orgIdentifiers, searchRolesRequest.orgIdentifiers) &&
        Objects.equals(this.groupIdentifiers, searchRolesRequest.groupIdentifiers) &&
        Objects.equals(this.privileges, searchRolesRequest.privileges) &&
        Objects.equals(this.deprecated, searchRolesRequest.deprecated) &&
        Objects.equals(this.external, searchRolesRequest.external) &&
        Objects.equals(this.sharedViaConnection, searchRolesRequest.sharedViaConnection) &&
        Objects.equals(this.permissions, searchRolesRequest.permissions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleIdentifiers, orgIdentifiers, groupIdentifiers, privileges, deprecated, external, sharedViaConnection, permissions);
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
    sb.append("class SearchRolesRequest {\n");
    sb.append("    roleIdentifiers: ").append(toIndentedString(roleIdentifiers)).append("\n");
    sb.append("    orgIdentifiers: ").append(toIndentedString(orgIdentifiers)).append("\n");
    sb.append("    groupIdentifiers: ").append(toIndentedString(groupIdentifiers)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    sharedViaConnection: ").append(toIndentedString(sharedViaConnection)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("role_identifiers");
    openapiFields.add("org_identifiers");
    openapiFields.add("group_identifiers");
    openapiFields.add("privileges");
    openapiFields.add("deprecated");
    openapiFields.add("external");
    openapiFields.add("shared_via_connection");
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchRolesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchRolesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchRolesRequest is not found in the empty JSON string", SearchRolesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchRolesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchRolesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("role_identifiers") != null && !jsonObj.get("role_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("role_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("org_identifiers") != null && !jsonObj.get("org_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("org_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_identifiers") != null && !jsonObj.get("group_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("group_identifiers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("privileges") != null && !jsonObj.get("privileges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privileges` to be an array in the JSON string but got `%s`", jsonObj.get("privileges").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchRolesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchRolesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchRolesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchRolesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchRolesRequest>() {
           @Override
           public void write(JsonWriter out, SearchRolesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchRolesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchRolesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchRolesRequest
  * @throws IOException if the JSON string is invalid with respect to SearchRolesRequest
  */
  public static SearchRolesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchRolesRequest.class);
  }

 /**
  * Convert an instance of SearchRolesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

