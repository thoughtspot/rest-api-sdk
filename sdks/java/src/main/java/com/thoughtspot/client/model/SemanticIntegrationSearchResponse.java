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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Single semantic integration entry returned by search. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SemanticIntegrationSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @javax.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nullable
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nullable
    private String description;

    public static final String SERIALIZED_NAME_MODEL_ID = "model_id";

    @SerializedName(SERIALIZED_NAME_MODEL_ID)
    @javax.annotation.Nullable
    private String modelId;

    public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";

    @SerializedName(SERIALIZED_NAME_MODEL_NAME)
    @javax.annotation.Nullable
    private String modelName;

    /** How the semantic definition was sourced. */
    @JsonAdapter(ImportTypeEnum.Adapter.class)
    public enum ImportTypeEnum {
        CDW("CDW"),

        FILE("FILE");

        private String value;

        ImportTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImportTypeEnum fromValue(String value) {
            for (ImportTypeEnum b : ImportTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ImportTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ImportTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImportTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImportTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ImportTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_IMPORT_TYPE = "import_type";

    @SerializedName(SERIALIZED_NAME_IMPORT_TYPE)
    @javax.annotation.Nullable
    private ImportTypeEnum importType;

    /** CDW connector type. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        RDBMS_SNOWFLAKE("RDBMS_SNOWFLAKE");

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
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
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

    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";

    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    @javax.annotation.Nullable
    private String connectionId;

    public static final String SERIALIZED_NAME_CONNECTION_NAME = "connection_name";

    @SerializedName(SERIALIZED_NAME_CONNECTION_NAME)
    @javax.annotation.Nullable
    private String connectionName;

    public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";

    @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
    @javax.annotation.Nullable
    private String authorId;

    public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";

    @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
    @javax.annotation.Nullable
    private String authorName;

    public static final String SERIALIZED_NAME_CREATION_TIME_IN_MILLIS = "creation_time_in_millis";

    @SerializedName(SERIALIZED_NAME_CREATION_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float creationTimeInMillis;

    public static final String SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS =
            "modification_time_in_millis";

    @SerializedName(SERIALIZED_NAME_MODIFICATION_TIME_IN_MILLIS)
    @javax.annotation.Nullable
    private Float modificationTimeInMillis;

    public static final String SERIALIZED_NAME_TAGS = "tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    @javax.annotation.Nullable
    private List<SemanticIntegrationTagReference> tags;

    public SemanticIntegrationSearchResponse() {}

    public SemanticIntegrationSearchResponse id(@javax.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the semantic integration.
     *
     * @return id
     */
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(@javax.annotation.Nullable String id) {
        this.id = id;
    }

    public SemanticIntegrationSearchResponse name(@javax.annotation.Nullable String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the semantic integration.
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

    public SemanticIntegrationSearchResponse description(
            @javax.annotation.Nullable String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional description of the semantic integration.
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

    public SemanticIntegrationSearchResponse modelId(@javax.annotation.Nullable String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * GUID of the associated ThoughtSpot model generated for this integration.
     *
     * @return modelId
     */
    @javax.annotation.Nullable
    public String getModelId() {
        return modelId;
    }

    public void setModelId(@javax.annotation.Nullable String modelId) {
        this.modelId = modelId;
    }

    public SemanticIntegrationSearchResponse modelName(
            @javax.annotation.Nullable String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Name of the associated ThoughtSpot model.
     *
     * @return modelName
     */
    @javax.annotation.Nullable
    public String getModelName() {
        return modelName;
    }

    public void setModelName(@javax.annotation.Nullable String modelName) {
        this.modelName = modelName;
    }

    public SemanticIntegrationSearchResponse importType(
            @javax.annotation.Nullable ImportTypeEnum importType) {
        this.importType = importType;
        return this;
    }

    /**
     * How the semantic definition was sourced.
     *
     * @return importType
     */
    @javax.annotation.Nullable
    public ImportTypeEnum getImportType() {
        return importType;
    }

    public void setImportType(@javax.annotation.Nullable ImportTypeEnum importType) {
        this.importType = importType;
    }

    public SemanticIntegrationSearchResponse type(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * CDW connector type.
     *
     * @return type
     */
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }

    public void setType(@javax.annotation.Nullable TypeEnum type) {
        this.type = type;
    }

    public SemanticIntegrationSearchResponse connectionId(
            @javax.annotation.Nullable String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * GUID of the CDW connection backing the integration.
     *
     * @return connectionId
     */
    @javax.annotation.Nullable
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(@javax.annotation.Nullable String connectionId) {
        this.connectionId = connectionId;
    }

    public SemanticIntegrationSearchResponse connectionName(
            @javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Display name of the CDW connection backing the integration.
     *
     * @return connectionName
     */
    @javax.annotation.Nullable
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(@javax.annotation.Nullable String connectionName) {
        this.connectionName = connectionName;
    }

    public SemanticIntegrationSearchResponse authorId(@javax.annotation.Nullable String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * GUID of the user who created the integration.
     *
     * @return authorId
     */
    @javax.annotation.Nullable
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(@javax.annotation.Nullable String authorId) {
        this.authorId = authorId;
    }

    public SemanticIntegrationSearchResponse authorName(
            @javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * Username of the user who created the integration.
     *
     * @return authorName
     */
    @javax.annotation.Nullable
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(@javax.annotation.Nullable String authorName) {
        this.authorName = authorName;
    }

    public SemanticIntegrationSearchResponse creationTimeInMillis(
            @javax.annotation.Nullable Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
        return this;
    }

    /**
     * Creation time in Unix epoch milliseconds.
     *
     * @return creationTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getCreationTimeInMillis() {
        return creationTimeInMillis;
    }

    public void setCreationTimeInMillis(@javax.annotation.Nullable Float creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    public SemanticIntegrationSearchResponse modificationTimeInMillis(
            @javax.annotation.Nullable Float modificationTimeInMillis) {
        this.modificationTimeInMillis = modificationTimeInMillis;
        return this;
    }

    /**
     * Last modification time in Unix epoch milliseconds.
     *
     * @return modificationTimeInMillis
     */
    @javax.annotation.Nullable
    public Float getModificationTimeInMillis() {
        return modificationTimeInMillis;
    }

    public void setModificationTimeInMillis(
            @javax.annotation.Nullable Float modificationTimeInMillis) {
        this.modificationTimeInMillis = modificationTimeInMillis;
    }

    public SemanticIntegrationSearchResponse tags(
            @javax.annotation.Nullable List<SemanticIntegrationTagReference> tags) {
        this.tags = tags;
        return this;
    }

    public SemanticIntegrationSearchResponse addTagsItem(SemanticIntegrationTagReference tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Tags associated with the integration.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<SemanticIntegrationTagReference> getTags() {
        return tags;
    }

    public void setTags(@javax.annotation.Nullable List<SemanticIntegrationTagReference> tags) {
        this.tags = tags;
    }

    /**
     * A container for additional, undeclared properties. This is a holder for any undeclared
     * properties as specified with the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value. If the property
     * does not already exist, create it otherwise replace it.
     *
     * @param key name of the property
     * @param value value of the property
     * @return the SemanticIntegrationSearchResponse instance itself
     */
    public SemanticIntegrationSearchResponse putAdditionalProperty(String key, Object value) {
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
        SemanticIntegrationSearchResponse semanticIntegrationSearchResponse =
                (SemanticIntegrationSearchResponse) o;
        return Objects.equals(this.id, semanticIntegrationSearchResponse.id)
                && Objects.equals(this.name, semanticIntegrationSearchResponse.name)
                && Objects.equals(this.description, semanticIntegrationSearchResponse.description)
                && Objects.equals(this.modelId, semanticIntegrationSearchResponse.modelId)
                && Objects.equals(this.modelName, semanticIntegrationSearchResponse.modelName)
                && Objects.equals(this.importType, semanticIntegrationSearchResponse.importType)
                && Objects.equals(this.type, semanticIntegrationSearchResponse.type)
                && Objects.equals(this.connectionId, semanticIntegrationSearchResponse.connectionId)
                && Objects.equals(
                        this.connectionName, semanticIntegrationSearchResponse.connectionName)
                && Objects.equals(this.authorId, semanticIntegrationSearchResponse.authorId)
                && Objects.equals(this.authorName, semanticIntegrationSearchResponse.authorName)
                && Objects.equals(
                        this.creationTimeInMillis,
                        semanticIntegrationSearchResponse.creationTimeInMillis)
                && Objects.equals(
                        this.modificationTimeInMillis,
                        semanticIntegrationSearchResponse.modificationTimeInMillis)
                && Objects.equals(this.tags, semanticIntegrationSearchResponse.tags)
                && Objects.equals(
                        this.additionalProperties,
                        semanticIntegrationSearchResponse.additionalProperties);
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
                id,
                name,
                description,
                modelId,
                modelName,
                importType,
                type,
                connectionId,
                connectionName,
                authorId,
                authorName,
                creationTimeInMillis,
                modificationTimeInMillis,
                tags,
                additionalProperties);
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
        sb.append("class SemanticIntegrationSearchResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    creationTimeInMillis: ")
                .append(toIndentedString(creationTimeInMillis))
                .append("\n");
        sb.append("    modificationTimeInMillis: ")
                .append(toIndentedString(modificationTimeInMillis))
                .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
        openapiFields.add("id");
        openapiFields.add("name");
        openapiFields.add("description");
        openapiFields.add("model_id");
        openapiFields.add("model_name");
        openapiFields.add("import_type");
        openapiFields.add("type");
        openapiFields.add("connection_id");
        openapiFields.add("connection_name");
        openapiFields.add("author_id");
        openapiFields.add("author_name");
        openapiFields.add("creation_time_in_millis");
        openapiFields.add("modification_time_in_millis");
        openapiFields.add("tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SemanticIntegrationSearchResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SemanticIntegrationSearchResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SemanticIntegrationSearchResponse is"
                                        + " not found in the empty JSON string",
                                SemanticIntegrationSearchResponse.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
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
        if ((jsonObj.get("model_id") != null && !jsonObj.get("model_id").isJsonNull())
                && !jsonObj.get("model_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `model_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("model_id").toString()));
        }
        if ((jsonObj.get("model_name") != null && !jsonObj.get("model_name").isJsonNull())
                && !jsonObj.get("model_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `model_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("model_name").toString()));
        }
        if ((jsonObj.get("import_type") != null && !jsonObj.get("import_type").isJsonNull())
                && !jsonObj.get("import_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `import_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("import_type").toString()));
        }
        // validate the optional field `import_type`
        if (jsonObj.get("import_type") != null && !jsonObj.get("import_type").isJsonNull()) {
            ImportTypeEnum.validateJsonElement(jsonObj.get("import_type"));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        // validate the optional field `type`
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
            TypeEnum.validateJsonElement(jsonObj.get("type"));
        }
        if ((jsonObj.get("connection_id") != null && !jsonObj.get("connection_id").isJsonNull())
                && !jsonObj.get("connection_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("connection_id").toString()));
        }
        if ((jsonObj.get("connection_name") != null && !jsonObj.get("connection_name").isJsonNull())
                && !jsonObj.get("connection_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `connection_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("connection_name").toString()));
        }
        if ((jsonObj.get("author_id") != null && !jsonObj.get("author_id").isJsonNull())
                && !jsonObj.get("author_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_id").toString()));
        }
        if ((jsonObj.get("author_name") != null && !jsonObj.get("author_name").isJsonNull())
                && !jsonObj.get("author_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `author_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("author_name").toString()));
        }
        if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("tags").toString()));
                }

                // validate the optional field `tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    SemanticIntegrationTagReference.validateJsonElement(jsonArraytags.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SemanticIntegrationSearchResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SemanticIntegrationSearchResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SemanticIntegrationSearchResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SemanticIntegrationSearchResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SemanticIntegrationSearchResponse>() {
                        @Override
                        public void write(JsonWriter out, SemanticIntegrationSearchResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            obj.remove("additionalProperties");
                            // serialize additional properties
                            if (value.getAdditionalProperties() != null) {
                                for (Map.Entry<String, Object> entry :
                                        value.getAdditionalProperties().entrySet()) {
                                    if (entry.getValue() instanceof String)
                                        obj.addProperty(entry.getKey(), (String) entry.getValue());
                                    else if (entry.getValue() instanceof Number)
                                        obj.addProperty(entry.getKey(), (Number) entry.getValue());
                                    else if (entry.getValue() instanceof Boolean)
                                        obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                                    else if (entry.getValue() instanceof Character)
                                        obj.addProperty(
                                                entry.getKey(), (Character) entry.getValue());
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
                        public SemanticIntegrationSearchResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            JsonObject jsonObj = jsonElement.getAsJsonObject();
                            // store additional fields in the deserialized instance
                            SemanticIntegrationSearchResponse instance =
                                    thisAdapter.fromJsonTree(jsonObj);
                            for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
                                if (!openapiFields.contains(entry.getKey())) {
                                    if (entry.getValue().isJsonPrimitive()) { // primitive type
                                        if (entry.getValue().getAsJsonPrimitive().isString())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsString());
                                        else if (entry.getValue().getAsJsonPrimitive().isNumber())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(), entry.getValue().getAsNumber());
                                        else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                                            instance.putAdditionalProperty(
                                                    entry.getKey(),
                                                    entry.getValue().getAsBoolean());
                                        else
                                            throw new IllegalArgumentException(
                                                    String.format(
                                                            "The field `%s` has unknown primitive"
                                                                    + " type. Value: %s",
                                                            entry.getKey(),
                                                            entry.getValue().toString()));
                                    } else if (entry.getValue().isJsonArray()) {
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), List.class));
                                    } else { // JSON object
                                        instance.putAdditionalProperty(
                                                entry.getKey(),
                                                gson.fromJson(entry.getValue(), HashMap.class));
                                    }
                                }
                            }
                            return instance;
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SemanticIntegrationSearchResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SemanticIntegrationSearchResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     SemanticIntegrationSearchResponse
     */
    public static SemanticIntegrationSearchResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SemanticIntegrationSearchResponse.class);
    }

    /**
     * Convert an instance of SemanticIntegrationSearchResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
