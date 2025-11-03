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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** ShareMetadataRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ShareMetadataRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Type of metadata. Required if identifier in metadata_identifies is a name. 1. Liveboard 2.
     * Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4.
     * LOGICAL_COLUMN
     */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LIVEBOARD("LIVEBOARD"),

        ANSWER("ANSWER"),

        LOGICAL_TABLE("LOGICAL_TABLE"),

        LOGICAL_COLUMN("LOGICAL_COLUMN"),

        CONNECTION("CONNECTION");

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
    @javax.annotation.Nullable
    private MetadataTypeEnum metadataType;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIERS = "metadata_identifiers";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> metadataIdentifiers;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    @javax.annotation.Nullable
    private List<ShareMetadataTypeInput> metadata;

    public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";

    @SerializedName(SERIALIZED_NAME_PERMISSIONS)
    @javax.annotation.Nonnull
    private List<SharePermissionsInput> permissions;

    public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS =
            "visualization_identifiers";

    @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
    @javax.annotation.Nullable
    private List<String> visualizationIdentifiers;

    public static final String SERIALIZED_NAME_EMAILS = "emails";

    @SerializedName(SERIALIZED_NAME_EMAILS)
    @javax.annotation.Nullable
    private List<String> emails = new ArrayList<>();

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    @javax.annotation.Nonnull
    private String message;

    public static final String SERIALIZED_NAME_ENABLE_CUSTOM_URL = "enable_custom_url";

    @SerializedName(SERIALIZED_NAME_ENABLE_CUSTOM_URL)
    @javax.annotation.Nullable
    private Boolean enableCustomUrl = false;

    public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";

    @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
    @javax.annotation.Nullable
    private Boolean notifyOnShare = true;

    public static final String SERIALIZED_NAME_HAS_LENIENT_DISCOVERABILITY =
            "has_lenient_discoverability";

    @SerializedName(SERIALIZED_NAME_HAS_LENIENT_DISCOVERABILITY)
    @javax.annotation.Nullable
    private Boolean hasLenientDiscoverability = false;

    public ShareMetadataRequest() {}

    public ShareMetadataRequest metadataType(
            @javax.annotation.Nullable MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of metadata. Required if identifier in metadata_identifies is a name. 1. Liveboard 2.
     * Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4.
     * LOGICAL_COLUMN
     *
     * @return metadataType
     */
    @javax.annotation.Nullable
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nullable MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public ShareMetadataRequest metadataIdentifiers(
            @javax.annotation.Nullable List<String> metadataIdentifiers) {
        this.metadataIdentifiers = metadataIdentifiers;
        return this;
    }

    public ShareMetadataRequest addMetadataIdentifiersItem(String metadataIdentifiersItem) {
        if (this.metadataIdentifiers == null) {
            this.metadataIdentifiers = new ArrayList<>();
        }
        this.metadataIdentifiers.add(metadataIdentifiersItem);
        return this;
    }

    /**
     * Unique ID or name of metadata objects. Note: All the names should belong to same
     * metadata_type
     *
     * @return metadataIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getMetadataIdentifiers() {
        return metadataIdentifiers;
    }

    public void setMetadataIdentifiers(
            @javax.annotation.Nullable List<String> metadataIdentifiers) {
        this.metadataIdentifiers = metadataIdentifiers;
    }

    public ShareMetadataRequest metadata(
            @javax.annotation.Nullable List<ShareMetadataTypeInput> metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShareMetadataRequest addMetadataItem(ShareMetadataTypeInput metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    /**
     * Metadata details for sharing objects.
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    public List<ShareMetadataTypeInput> getMetadata() {
        return metadata;
    }

    public void setMetadata(@javax.annotation.Nullable List<ShareMetadataTypeInput> metadata) {
        this.metadata = metadata;
    }

    public ShareMetadataRequest permissions(
            @javax.annotation.Nonnull List<SharePermissionsInput> permissions) {
        this.permissions = permissions;
        return this;
    }

    public ShareMetadataRequest addPermissionsItem(SharePermissionsInput permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Permission details for sharing the objects.
     *
     * @return permissions
     */
    @javax.annotation.Nonnull
    public List<SharePermissionsInput> getPermissions() {
        return permissions;
    }

    public void setPermissions(@javax.annotation.Nonnull List<SharePermissionsInput> permissions) {
        this.permissions = permissions;
    }

    public ShareMetadataRequest visualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
        return this;
    }

    public ShareMetadataRequest addVisualizationIdentifiersItem(
            String visualizationIdentifiersItem) {
        if (this.visualizationIdentifiers == null) {
            this.visualizationIdentifiers = new ArrayList<>();
        }
        this.visualizationIdentifiers.add(visualizationIdentifiersItem);
        return this;
    }

    /**
     * Options to specify details of Liveboard. First Liveboard encountered in payload is considered
     * to be the corresponding Liveboard.
     *
     * @return visualizationIdentifiers
     */
    @javax.annotation.Nullable
    public List<String> getVisualizationIdentifiers() {
        return visualizationIdentifiers;
    }

    public void setVisualizationIdentifiers(
            @javax.annotation.Nullable List<String> visualizationIdentifiers) {
        this.visualizationIdentifiers = visualizationIdentifiers;
    }

    public ShareMetadataRequest emails(@javax.annotation.Nullable List<String> emails) {
        this.emails = emails;
        return this;
    }

    public ShareMetadataRequest addEmailsItem(String emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
     * Email IDs to which notifications will be sent.
     *
     * @return emails
     */
    @javax.annotation.Nullable
    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(@javax.annotation.Nullable List<String> emails) {
        this.emails = emails;
    }

    public ShareMetadataRequest message(@javax.annotation.Nonnull String message) {
        this.message = message;
        return this;
    }

    /**
     * Message to be included in notification.
     *
     * @return message
     */
    @javax.annotation.Nonnull
    public String getMessage() {
        return message;
    }

    public void setMessage(@javax.annotation.Nonnull String message) {
        this.message = message;
    }

    public ShareMetadataRequest enableCustomUrl(
            @javax.annotation.Nullable Boolean enableCustomUrl) {
        this.enableCustomUrl = enableCustomUrl;
        return this;
    }

    /**
     * Sends object URLs in the customized format in email notifications.
     *
     * @return enableCustomUrl
     */
    @javax.annotation.Nullable
    public Boolean getEnableCustomUrl() {
        return enableCustomUrl;
    }

    public void setEnableCustomUrl(@javax.annotation.Nullable Boolean enableCustomUrl) {
        this.enableCustomUrl = enableCustomUrl;
    }

    public ShareMetadataRequest notifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
        return this;
    }

    /**
     * Flag to notify user when any object is shared.
     *
     * @return notifyOnShare
     */
    @javax.annotation.Nullable
    public Boolean getNotifyOnShare() {
        return notifyOnShare;
    }

    public void setNotifyOnShare(@javax.annotation.Nullable Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
    }

    public ShareMetadataRequest hasLenientDiscoverability(
            @javax.annotation.Nullable Boolean hasLenientDiscoverability) {
        this.hasLenientDiscoverability = hasLenientDiscoverability;
        return this;
    }

    /**
     * Flag to make the object discoverable.
     *
     * @return hasLenientDiscoverability
     */
    @javax.annotation.Nullable
    public Boolean getHasLenientDiscoverability() {
        return hasLenientDiscoverability;
    }

    public void setHasLenientDiscoverability(
            @javax.annotation.Nullable Boolean hasLenientDiscoverability) {
        this.hasLenientDiscoverability = hasLenientDiscoverability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShareMetadataRequest shareMetadataRequest = (ShareMetadataRequest) o;
        return Objects.equals(this.metadataType, shareMetadataRequest.metadataType)
                && Objects.equals(
                        this.metadataIdentifiers, shareMetadataRequest.metadataIdentifiers)
                && Objects.equals(this.metadata, shareMetadataRequest.metadata)
                && Objects.equals(this.permissions, shareMetadataRequest.permissions)
                && Objects.equals(
                        this.visualizationIdentifiers,
                        shareMetadataRequest.visualizationIdentifiers)
                && Objects.equals(this.emails, shareMetadataRequest.emails)
                && Objects.equals(this.message, shareMetadataRequest.message)
                && Objects.equals(this.enableCustomUrl, shareMetadataRequest.enableCustomUrl)
                && Objects.equals(this.notifyOnShare, shareMetadataRequest.notifyOnShare)
                && Objects.equals(
                        this.hasLenientDiscoverability,
                        shareMetadataRequest.hasLenientDiscoverability);
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
                metadataType,
                metadataIdentifiers,
                metadata,
                permissions,
                visualizationIdentifiers,
                emails,
                message,
                enableCustomUrl,
                notifyOnShare,
                hasLenientDiscoverability);
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
        sb.append("class ShareMetadataRequest {\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    metadataIdentifiers: ")
                .append(toIndentedString(metadataIdentifiers))
                .append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    visualizationIdentifiers: ")
                .append(toIndentedString(visualizationIdentifiers))
                .append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    enableCustomUrl: ").append(toIndentedString(enableCustomUrl)).append("\n");
        sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
        sb.append("    hasLenientDiscoverability: ")
                .append(toIndentedString(hasLenientDiscoverability))
                .append("\n");
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
        openapiFields.add("metadata_type");
        openapiFields.add("metadata_identifiers");
        openapiFields.add("metadata");
        openapiFields.add("permissions");
        openapiFields.add("visualization_identifiers");
        openapiFields.add("emails");
        openapiFields.add("message");
        openapiFields.add("enable_custom_url");
        openapiFields.add("notify_on_share");
        openapiFields.add("has_lenient_discoverability");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("permissions");
        openapiRequiredFields.add("message");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ShareMetadataRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ShareMetadataRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ShareMetadataRequest is not found in"
                                        + " the empty JSON string",
                                ShareMetadataRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ShareMetadataRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ShareMetadataRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ShareMetadataRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull())
                && !jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the optional field `metadata_type`
        if (jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull()) {
            MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("metadata_identifiers") != null
                && !jsonObj.get("metadata_identifiers").isJsonNull()
                && !jsonObj.get("metadata_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifiers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_identifiers").toString()));
        }
        if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
            JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
            if (jsonArraymetadata != null) {
                // ensure the json data is an array
                if (!jsonObj.get("metadata").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `metadata` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("metadata").toString()));
                }

                // validate the optional field `metadata` (array)
                for (int i = 0; i < jsonArraymetadata.size(); i++) {
                    ShareMetadataTypeInput.validateJsonElement(jsonArraymetadata.get(i));
                }
                ;
            }
        }
        // ensure the json data is an array
        if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `permissions` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("permissions").toString()));
        }

        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        // validate the required field `permissions` (array)
        for (int i = 0; i < jsonArraypermissions.size(); i++) {
            SharePermissionsInput.validateJsonElement(jsonArraypermissions.get(i));
        }
        ;
        // ensure the optional json data is an array if present
        if (jsonObj.get("visualization_identifiers") != null
                && !jsonObj.get("visualization_identifiers").isJsonNull()
                && !jsonObj.get("visualization_identifiers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `visualization_identifiers` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("visualization_identifiers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("emails") != null
                && !jsonObj.get("emails").isJsonNull()
                && !jsonObj.get("emails").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `emails` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("emails").toString()));
        }
        if (!jsonObj.get("message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("message").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ShareMetadataRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ShareMetadataRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ShareMetadataRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ShareMetadataRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ShareMetadataRequest>() {
                        @Override
                        public void write(JsonWriter out, ShareMetadataRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ShareMetadataRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ShareMetadataRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ShareMetadataRequest
     * @throws IOException if the JSON string is invalid with respect to ShareMetadataRequest
     */
    public static ShareMetadataRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ShareMetadataRequest.class);
    }

    /**
     * Convert an instance of ShareMetadataRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
