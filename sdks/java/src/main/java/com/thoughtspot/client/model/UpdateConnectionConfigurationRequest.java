/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** UpdateConnectionConfigurationRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UpdateConnectionConfigurationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CONNECTION_IDENTIFIER = "connection_identifier";

    @SerializedName(SERIALIZED_NAME_CONNECTION_IDENTIFIER)
    @javax.annotation.Nonnull
    private String connectionIdentifier;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    /** Type of authentication. */
    @JsonAdapter(AuthenticationTypeEnum.Adapter.class)
    public enum AuthenticationTypeEnum {
        SERVICE_ACCOUNT("SERVICE_ACCOUNT"),

        OAUTH("OAUTH"),

        OAUTH_WITH_SERVICE_PRINCIPAL("OAUTH_WITH_SERVICE_PRINCIPAL"),

        EXTOAUTH("EXTOAUTH"),

        KEY_PAIR("KEY_PAIR"),

        EXTOAUTH_WITH_PKCE("EXTOAUTH_WITH_PKCE"),

        OAUTH_WITH_PKCE("OAUTH_WITH_PKCE"),

        PERSONAL_ACCESS_TOKEN("PERSONAL_ACCESS_TOKEN");

        private String value;

        AuthenticationTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AuthenticationTypeEnum fromValue(String value) {
            for (AuthenticationTypeEnum b : AuthenticationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AuthenticationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AuthenticationTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AuthenticationTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AuthenticationTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            AuthenticationTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authentication_type";

    @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
    @javax.annotation.Nullable
    private AuthenticationTypeEnum authenticationType;

    public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION)
    @javax.annotation.Nullable
    private Object _configuration;

    /** Type of policy. */
    @JsonAdapter(PolicyTypeEnum.Adapter.class)
    public enum PolicyTypeEnum {
        NO_POLICY("NO_POLICY"),

        PRINCIPALS("PRINCIPALS"),

        PROCESSES("PROCESSES");

        private String value;

        PolicyTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PolicyTypeEnum fromValue(String value) {
            for (PolicyTypeEnum b : PolicyTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PolicyTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PolicyTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PolicyTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PolicyTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PolicyTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";

    @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
    @javax.annotation.Nullable
    private PolicyTypeEnum policyType;

    public static final String SERIALIZED_NAME_POLICY_PRINCIPALS = "policy_principals";

    @SerializedName(SERIALIZED_NAME_POLICY_PRINCIPALS)
    @javax.annotation.Nullable
    private List<String> policyPrincipals;

    /** Gets or Sets policyProcesses */
    @JsonAdapter(PolicyProcessesEnum.Adapter.class)
    public enum PolicyProcessesEnum {
        SAGE_INDEXING("SAGE_INDEXING"),

        ROW_COUNT_STATS("ROW_COUNT_STATS");

        private String value;

        PolicyProcessesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PolicyProcessesEnum fromValue(String value) {
            for (PolicyProcessesEnum b : PolicyProcessesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PolicyProcessesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PolicyProcessesEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PolicyProcessesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PolicyProcessesEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            PolicyProcessesEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_POLICY_PROCESSES = "policy_processes";

    @SerializedName(SERIALIZED_NAME_POLICY_PROCESSES)
    @javax.annotation.Nullable
    private List<PolicyProcessesEnum> policyProcesses;

    public static final String SERIALIZED_NAME_DISABLE = "disable";

    @SerializedName(SERIALIZED_NAME_DISABLE)
    @javax.annotation.Nullable
    private Boolean disable = false;

    public UpdateConnectionConfigurationRequest() {}

    public UpdateConnectionConfigurationRequest connectionIdentifier(
            @javax.annotation.Nonnull String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the connection.
     *
     * @return connectionIdentifier
     */
    @javax.annotation.Nonnull
    public String getConnectionIdentifier() {
        return connectionIdentifier;
    }

    public void setConnectionIdentifier(@javax.annotation.Nonnull String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
    }

    public UpdateConnectionConfigurationRequest name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the configuration to update.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nullable String name) {
        this.name = name;
    }

    public UpdateConnectionConfigurationRequest description(
            @javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the configuration.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nullable String description) {
        this.description = description;
    }

    public UpdateConnectionConfigurationRequest authenticationType(
            @javax.annotation.Nullable AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Type of authentication.
     *
     * @return authenticationType
     */
    @javax.annotation.Nullable
    public AuthenticationTypeEnum getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(
            @javax.annotation.Nullable AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
    }

    public UpdateConnectionConfigurationRequest _configuration(
            @javax.annotation.Nullable Object _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Configuration properties in JSON.
     *
     * @return _configuration
     */
    @javax.annotation.Nullable
    public Object getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(@javax.annotation.Nullable Object _configuration) {
        this._configuration = _configuration;
    }

    public UpdateConnectionConfigurationRequest policyType(
            @javax.annotation.Nullable PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Type of policy.
     *
     * @return policyType
     */
    @javax.annotation.Nullable
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(@javax.annotation.Nullable PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public UpdateConnectionConfigurationRequest policyPrincipals(
            @javax.annotation.Nullable List<String> policyPrincipals) {
        this.policyPrincipals = policyPrincipals;
        return this;
    }

    public UpdateConnectionConfigurationRequest addPolicyPrincipalsItem(
            String policyPrincipalsItem) {
        if (this.policyPrincipals == null) {
            this.policyPrincipals = new ArrayList<>();
        }
        this.policyPrincipals.add(policyPrincipalsItem);
        return this;
    }

    /**
     * Unique ID or name of the User and User Groups.
     *
     * @return policyPrincipals
     */
    @javax.annotation.Nullable
    public List<String> getPolicyPrincipals() {
        return policyPrincipals;
    }

    public void setPolicyPrincipals(@javax.annotation.Nullable List<String> policyPrincipals) {
        this.policyPrincipals = policyPrincipals;
    }

    public UpdateConnectionConfigurationRequest policyProcesses(
            @javax.annotation.Nullable List<PolicyProcessesEnum> policyProcesses) {
        this.policyProcesses = policyProcesses;
        return this;
    }

    public UpdateConnectionConfigurationRequest addPolicyProcessesItem(
            PolicyProcessesEnum policyProcessesItem) {
        if (this.policyProcesses == null) {
            this.policyProcesses = new ArrayList<>();
        }
        this.policyProcesses.add(policyProcessesItem);
        return this;
    }

    /**
     * Action that the query performed on the data warehouse, such as SAGE_INDEXING and
     * ROW_COUNT_STATS.
     *
     * @return policyProcesses
     */
    @javax.annotation.Nullable
    public List<PolicyProcessesEnum> getPolicyProcesses() {
        return policyProcesses;
    }

    public void setPolicyProcesses(
            @javax.annotation.Nullable List<PolicyProcessesEnum> policyProcesses) {
        this.policyProcesses = policyProcesses;
    }

    public UpdateConnectionConfigurationRequest disable(
            @javax.annotation.Nullable Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * Indicates whether the configuration enable/disable.
     *
     * @return disable
     */
    @javax.annotation.Nullable
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(@javax.annotation.Nullable Boolean disable) {
        this.disable = disable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateConnectionConfigurationRequest updateConnectionConfigurationRequest =
                (UpdateConnectionConfigurationRequest) o;
        return Objects.equals(
                        this.connectionIdentifier,
                        updateConnectionConfigurationRequest.connectionIdentifier)
                && Objects.equals(this.name, updateConnectionConfigurationRequest.name)
                && Objects.equals(
                        this.description, updateConnectionConfigurationRequest.description)
                && Objects.equals(
                        this.authenticationType,
                        updateConnectionConfigurationRequest.authenticationType)
                && Objects.equals(
                        this._configuration, updateConnectionConfigurationRequest._configuration)
                && Objects.equals(this.policyType, updateConnectionConfigurationRequest.policyType)
                && Objects.equals(
                        this.policyPrincipals,
                        updateConnectionConfigurationRequest.policyPrincipals)
                && Objects.equals(
                        this.policyProcesses, updateConnectionConfigurationRequest.policyProcesses)
                && Objects.equals(this.disable, updateConnectionConfigurationRequest.disable);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                connectionIdentifier,
                name,
                description,
                authenticationType,
                _configuration,
                policyType,
                policyPrincipals,
                policyProcesses,
                disable);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectionConfigurationRequest {\n");
        sb.append("    connectionIdentifier: ")
                .append(toIndentedString(connectionIdentifier))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authenticationType: ")
                .append(toIndentedString(authenticationType))
                .append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    policyPrincipals: ").append(toIndentedString(policyPrincipals)).append("\n");
        sb.append("    policyProcesses: ").append(toIndentedString(policyProcesses)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("connection_identifier");
        openapiFields.add("name");
        openapiFields.add("description");
        openapiFields.add("authentication_type");
        openapiFields.add("configuration");
        openapiFields.add("policy_type");
        openapiFields.add("policy_principals");
        openapiFields.add("policy_processes");
        openapiFields.add("disable");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("connection_identifier");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UpdateConnectionConfigurationRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateConnectionConfigurationRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateConnectionConfigurationRequest"
                                        + " is not found in the empty JSON string",
                                UpdateConnectionConfigurationRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateConnectionConfigurationRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `UpdateConnectionConfigurationRequest` properties. JSON:"
                                    + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateConnectionConfigurationRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("connection_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("connection_identifier").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("authentication_type") != null
                        && !jsonObj.get("authentication_type").isJsonNull())
                && !jsonObj.get("authentication_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `authentication_type` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("authentication_type").toString()));
        }
        // validate the optional field `authentication_type`
        if (jsonObj.get("authentication_type") != null
                && !jsonObj.get("authentication_type").isJsonNull()) {
            AuthenticationTypeEnum.validateJsonElement(jsonObj.get("authentication_type"));
        }
        if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull())
                && !jsonObj.get("policy_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `policy_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("policy_type").toString()));
        }
        // validate the optional field `policy_type`
        if (jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) {
            PolicyTypeEnum.validateJsonElement(jsonObj.get("policy_type"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("policy_principals") != null
                && !jsonObj.get("policy_principals").isJsonNull()
                && !jsonObj.get("policy_principals").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `policy_principals` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("policy_principals").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("policy_processes") != null
                && !jsonObj.get("policy_processes").isJsonNull()
                && !jsonObj.get("policy_processes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `policy_processes` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("policy_processes").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateConnectionConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateConnectionConfigurationRequest'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateConnectionConfigurationRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UpdateConnectionConfigurationRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateConnectionConfigurationRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, UpdateConnectionConfigurationRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateConnectionConfigurationRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateConnectionConfigurationRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateConnectionConfigurationRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateConnectionConfigurationRequest
     */
    public static UpdateConnectionConfigurationRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateConnectionConfigurationRequest.class);
    }

    /**
     * Convert an instance of UpdateConnectionConfigurationRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
