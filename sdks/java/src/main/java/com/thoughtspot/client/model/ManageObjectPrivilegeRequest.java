/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ManageObjectPrivilegeRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ManageObjectPrivilegeRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Operation to perform to manage object privileges. Available operations are: &#x60;ADD&#x60;,
     * &#x60;REMOVE&#x60;.
     */
    @JsonAdapter(OperationEnum.Adapter.class)
    public enum OperationEnum {
        ADD("ADD"),

        REMOVE("REMOVE");

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
            public void write(final JsonWriter jsonWriter, final OperationEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OperationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
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

    /**
     * Type of metadata objects on which you want to perform the operation. For now only
     * LOGICAL_TABLE is supported. It may be extended to other metadata types in the future.
     */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LOGICAL_TABLE("LOGICAL_TABLE");

        private String value;

        MetadataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MetadataTypeEnum fromValue(String value) {
            for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MetadataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MetadataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nonnull
    private MetadataTypeEnum metadataType;

    /** Gets or Sets objectPrivilegeTypes */
    @JsonAdapter(ObjectPrivilegeTypesEnum.Adapter.class)
    public enum ObjectPrivilegeTypesEnum {
        SPOTTER_COACHING_PRIVILEGE("SPOTTER_COACHING_PRIVILEGE");

        private String value;

        ObjectPrivilegeTypesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ObjectPrivilegeTypesEnum fromValue(String value) {
            for (ObjectPrivilegeTypesEnum b : ObjectPrivilegeTypesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ObjectPrivilegeTypesEnum> {
            @Override
            public void write(
                    final JsonWriter jsonWriter, final ObjectPrivilegeTypesEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ObjectPrivilegeTypesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ObjectPrivilegeTypesEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ObjectPrivilegeTypesEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_OBJECT_PRIVILEGE_TYPES = "object_privilege_types";

    @SerializedName(SERIALIZED_NAME_OBJECT_PRIVILEGE_TYPES)
    @javax.annotation.Nonnull
    private List<ObjectPrivilegeTypesEnum> objectPrivilegeTypes;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIERS = "metadata_identifiers";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIERS)
    @javax.annotation.Nonnull
    private List<String> metadataIdentifiers;

    public static final String SERIALIZED_NAME_PRINCIPALS = "principals";

    @SerializedName(SERIALIZED_NAME_PRINCIPALS)
    @javax.annotation.Nonnull
    private List<PrincipalsInput> principals;

    public ManageObjectPrivilegeRequest() {}

    public ManageObjectPrivilegeRequest operation(
            @javax.annotation.Nonnull OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Operation to perform to manage object privileges. Available operations are: &#x60;ADD&#x60;,
     * &#x60;REMOVE&#x60;.
     *
     * @return operation
     */
    @javax.annotation.Nonnull
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(@javax.annotation.Nonnull OperationEnum operation) {
        this.operation = operation;
    }

    public ManageObjectPrivilegeRequest metadataType(
            @javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of metadata objects on which you want to perform the operation. For now only
     * LOGICAL_TABLE is supported. It may be extended to other metadata types in the future.
     *
     * @return metadataType
     */
    @javax.annotation.Nonnull
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public ManageObjectPrivilegeRequest objectPrivilegeTypes(
            @javax.annotation.Nonnull List<ObjectPrivilegeTypesEnum> objectPrivilegeTypes) {
        this.objectPrivilegeTypes = objectPrivilegeTypes;
        return this;
    }

    public ManageObjectPrivilegeRequest addObjectPrivilegeTypesItem(
            ObjectPrivilegeTypesEnum objectPrivilegeTypesItem) {
        if (this.objectPrivilegeTypes == null) {
            this.objectPrivilegeTypes = new ArrayList<>();
        }
        this.objectPrivilegeTypes.add(objectPrivilegeTypesItem);
        return this;
    }

    /**
     * List of object privilege types on which you want to perform the operation.
     *
     * @return objectPrivilegeTypes
     */
    @javax.annotation.Nonnull
    public List<ObjectPrivilegeTypesEnum> getObjectPrivilegeTypes() {
        return objectPrivilegeTypes;
    }

    public void setObjectPrivilegeTypes(
            @javax.annotation.Nonnull List<ObjectPrivilegeTypesEnum> objectPrivilegeTypes) {
        this.objectPrivilegeTypes = objectPrivilegeTypes;
    }

    public ManageObjectPrivilegeRequest metadataIdentifiers(
            @javax.annotation.Nonnull List<String> metadataIdentifiers) {
        this.metadataIdentifiers = metadataIdentifiers;
        return this;
    }

    public ManageObjectPrivilegeRequest addMetadataIdentifiersItem(String metadataIdentifiersItem) {
        if (this.metadataIdentifiers == null) {
            this.metadataIdentifiers = new ArrayList<>();
        }
        this.metadataIdentifiers.add(metadataIdentifiersItem);
        return this;
    }

    /**
     * List of metadata identifiers (GUID or name) on which you want to perform the operation.
     *
     * @return metadataIdentifiers
     */
    @javax.annotation.Nonnull
    public List<String> getMetadataIdentifiers() {
        return metadataIdentifiers;
    }

    public void setMetadataIdentifiers(@javax.annotation.Nonnull List<String> metadataIdentifiers) {
        this.metadataIdentifiers = metadataIdentifiers;
    }

    public ManageObjectPrivilegeRequest principals(
            @javax.annotation.Nonnull List<PrincipalsInput> principals) {
        this.principals = principals;
        return this;
    }

    public ManageObjectPrivilegeRequest addPrincipalsItem(PrincipalsInput principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    /**
     * User or group objects (GUID or name) to which you want to apply the given operation and given
     * object privileges.
     *
     * @return principals
     */
    @javax.annotation.Nonnull
    public List<PrincipalsInput> getPrincipals() {
        return principals;
    }

    public void setPrincipals(@javax.annotation.Nonnull List<PrincipalsInput> principals) {
        this.principals = principals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManageObjectPrivilegeRequest manageObjectPrivilegeRequest =
                (ManageObjectPrivilegeRequest) o;
        return Objects.equals(this.operation, manageObjectPrivilegeRequest.operation)
                && Objects.equals(this.metadataType, manageObjectPrivilegeRequest.metadataType)
                && Objects.equals(
                        this.objectPrivilegeTypes,
                        manageObjectPrivilegeRequest.objectPrivilegeTypes)
                && Objects.equals(
                        this.metadataIdentifiers, manageObjectPrivilegeRequest.metadataIdentifiers)
                && Objects.equals(this.principals, manageObjectPrivilegeRequest.principals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                operation, metadataType, objectPrivilegeTypes, metadataIdentifiers, principals);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManageObjectPrivilegeRequest {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    objectPrivilegeTypes: ")
                .append(toIndentedString(objectPrivilegeTypes))
                .append("\n");
        sb.append("    metadataIdentifiers: ")
                .append(toIndentedString(metadataIdentifiers))
                .append("\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
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
        openapiFields.add("operation");
        openapiFields.add("metadata_type");
        openapiFields.add("object_privilege_types");
        openapiFields.add("metadata_identifiers");
        openapiFields.add("principals");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("operation");
        openapiRequiredFields.add("metadata_type");
        openapiRequiredFields.add("object_privilege_types");
        openapiRequiredFields.add("metadata_identifiers");
        openapiRequiredFields.add("principals");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ManageObjectPrivilegeRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ManageObjectPrivilegeRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ManageObjectPrivilegeRequest is not"
                                        + " found in the empty JSON string",
                                ManageObjectPrivilegeRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ManageObjectPrivilegeRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ManageObjectPrivilegeRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ManageObjectPrivilegeRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("operation").toString()));
        }
        // validate the required field `operation`
        OperationEnum.validateJsonElement(jsonObj.get("operation"));
        if (!jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the required field `metadata_type`
        MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        // ensure the required json array is present
        if (jsonObj.get("object_privilege_types") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("object_privilege_types").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `object_privilege_types` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("object_privilege_types").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("metadata_identifiers") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("metadata_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_identifiers").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("principals").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `principals` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("principals").toString()));
        }

        JsonArray jsonArrayprincipals = jsonObj.getAsJsonArray("principals");
        // validate the required field `principals` (array)
        for (int i = 0; i < jsonArrayprincipals.size(); i++) {
            PrincipalsInput.validateJsonElement(jsonArrayprincipals.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ManageObjectPrivilegeRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ManageObjectPrivilegeRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ManageObjectPrivilegeRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ManageObjectPrivilegeRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ManageObjectPrivilegeRequest>() {
                        @Override
                        public void write(JsonWriter out, ManageObjectPrivilegeRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ManageObjectPrivilegeRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ManageObjectPrivilegeRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ManageObjectPrivilegeRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ManageObjectPrivilegeRequest
     */
    public static ManageObjectPrivilegeRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ManageObjectPrivilegeRequest.class);
    }

    /**
     * Convert an instance of ManageObjectPrivilegeRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
