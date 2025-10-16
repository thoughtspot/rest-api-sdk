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

/** ImportMetadataTMLAsyncRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ImportMetadataTMLAsyncRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_TMLS = "metadata_tmls";

    @SerializedName(SERIALIZED_NAME_METADATA_TMLS)
    @javax.annotation.Nonnull
    private List<String> metadataTmls;

    public static final String SERIALIZED_NAME_CREATE_NEW = "create_new";

    @SerializedName(SERIALIZED_NAME_CREATE_NEW)
    @javax.annotation.Nullable
    private Boolean createNew = false;

    public static final String SERIALIZED_NAME_ALL_ORGS_OVERRIDE = "all_orgs_override";

    @SerializedName(SERIALIZED_NAME_ALL_ORGS_OVERRIDE)
    @javax.annotation.Nullable
    private Boolean allOrgsOverride = false;

    /**
     * &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt; Policy to be followed while importing the
     * TML. Valid values are [PARTIAL_OBJECT, PARTIAL, VALIDATE_ONLY, ALL_OR_NONE]
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
            public void write(final JsonWriter jsonWriter, final ImportPolicyEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImportPolicyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImportPolicyEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            ImportPolicyEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_IMPORT_POLICY = "import_policy";

    @SerializedName(SERIALIZED_NAME_IMPORT_POLICY)
    @javax.annotation.Nullable
    private ImportPolicyEnum importPolicy = ImportPolicyEnum.PARTIAL_OBJECT;

    public static final String SERIALIZED_NAME_SKIP_DIFF_CHECK = "skip_diff_check";

    @SerializedName(SERIALIZED_NAME_SKIP_DIFF_CHECK)
    @javax.annotation.Nullable
    private Boolean skipDiffCheck = false;

    public static final String SERIALIZED_NAME_ENABLE_LARGE_METADATA_VALIDATION =
            "enable_large_metadata_validation";

    @SerializedName(SERIALIZED_NAME_ENABLE_LARGE_METADATA_VALIDATION)
    @javax.annotation.Nullable
    private Boolean enableLargeMetadataValidation = false;

    public ImportMetadataTMLAsyncRequest() {}

    public ImportMetadataTMLAsyncRequest metadataTmls(
            @javax.annotation.Nonnull List<String> metadataTmls) {
        this.metadataTmls = metadataTmls;
        return this;
    }

    public ImportMetadataTMLAsyncRequest addMetadataTmlsItem(String metadataTmlsItem) {
        if (this.metadataTmls == null) {
            this.metadataTmls = new ArrayList<>();
        }
        this.metadataTmls.add(metadataTmlsItem);
        return this;
    }

    /**
     * Details of TML objects.
     *
     * @return metadataTmls
     */
    @javax.annotation.Nonnull
    public List<String> getMetadataTmls() {
        return metadataTmls;
    }

    public void setMetadataTmls(@javax.annotation.Nonnull List<String> metadataTmls) {
        this.metadataTmls = metadataTmls;
    }

    public ImportMetadataTMLAsyncRequest createNew(@javax.annotation.Nullable Boolean createNew) {
        this.createNew = createNew;
        return this;
    }

    /**
     * If selected, creates TML objects with new GUIDs.
     *
     * @return createNew
     */
    @javax.annotation.Nullable
    public Boolean getCreateNew() {
        return createNew;
    }

    public void setCreateNew(@javax.annotation.Nullable Boolean createNew) {
        this.createNew = createNew;
    }

    public ImportMetadataTMLAsyncRequest allOrgsOverride(
            @javax.annotation.Nullable Boolean allOrgsOverride) {
        this.allOrgsOverride = allOrgsOverride;
        return this;
    }

    /**
     * If import is happening from all orgs context.
     *
     * @return allOrgsOverride
     */
    @javax.annotation.Nullable
    public Boolean getAllOrgsOverride() {
        return allOrgsOverride;
    }

    public void setAllOrgsOverride(@javax.annotation.Nullable Boolean allOrgsOverride) {
        this.allOrgsOverride = allOrgsOverride;
    }

    public ImportMetadataTMLAsyncRequest importPolicy(
            @javax.annotation.Nullable ImportPolicyEnum importPolicy) {
        this.importPolicy = importPolicy;
        return this;
    }

    /**
     * &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt; Policy to be followed while importing the
     * TML. Valid values are [PARTIAL_OBJECT, PARTIAL, VALIDATE_ONLY, ALL_OR_NONE]
     *
     * @return importPolicy
     */
    @javax.annotation.Nullable
    public ImportPolicyEnum getImportPolicy() {
        return importPolicy;
    }

    public void setImportPolicy(@javax.annotation.Nullable ImportPolicyEnum importPolicy) {
        this.importPolicy = importPolicy;
    }

    public ImportMetadataTMLAsyncRequest skipDiffCheck(
            @javax.annotation.Nullable Boolean skipDiffCheck) {
        this.skipDiffCheck = skipDiffCheck;
        return this;
    }

    /**
     * &lt;div&gt;Version: 10.6.0.cl or later &lt;/div&gt; Boolean Flag to skip TML diff check
     * before processing object TMLs.
     *
     * @return skipDiffCheck
     */
    @javax.annotation.Nullable
    public Boolean getSkipDiffCheck() {
        return skipDiffCheck;
    }

    public void setSkipDiffCheck(@javax.annotation.Nullable Boolean skipDiffCheck) {
        this.skipDiffCheck = skipDiffCheck;
    }

    public ImportMetadataTMLAsyncRequest enableLargeMetadataValidation(
            @javax.annotation.Nullable Boolean enableLargeMetadataValidation) {
        this.enableLargeMetadataValidation = enableLargeMetadataValidation;
        return this;
    }

    /**
     * &lt;div&gt;Version: 10.5.0.cl or later &lt;/div&gt; Boolean to indicate if the large metadata
     * validation should be enabled.
     *
     * @return enableLargeMetadataValidation
     */
    @javax.annotation.Nullable
    public Boolean getEnableLargeMetadataValidation() {
        return enableLargeMetadataValidation;
    }

    public void setEnableLargeMetadataValidation(
            @javax.annotation.Nullable Boolean enableLargeMetadataValidation) {
        this.enableLargeMetadataValidation = enableLargeMetadataValidation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportMetadataTMLAsyncRequest importMetadataTMLAsyncRequest =
                (ImportMetadataTMLAsyncRequest) o;
        return Objects.equals(this.metadataTmls, importMetadataTMLAsyncRequest.metadataTmls)
                && Objects.equals(this.createNew, importMetadataTMLAsyncRequest.createNew)
                && Objects.equals(
                        this.allOrgsOverride, importMetadataTMLAsyncRequest.allOrgsOverride)
                && Objects.equals(this.importPolicy, importMetadataTMLAsyncRequest.importPolicy)
                && Objects.equals(this.skipDiffCheck, importMetadataTMLAsyncRequest.skipDiffCheck)
                && Objects.equals(
                        this.enableLargeMetadataValidation,
                        importMetadataTMLAsyncRequest.enableLargeMetadataValidation);
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
                metadataTmls,
                createNew,
                allOrgsOverride,
                importPolicy,
                skipDiffCheck,
                enableLargeMetadataValidation);
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
        sb.append("class ImportMetadataTMLAsyncRequest {\n");
        sb.append("    metadataTmls: ").append(toIndentedString(metadataTmls)).append("\n");
        sb.append("    createNew: ").append(toIndentedString(createNew)).append("\n");
        sb.append("    allOrgsOverride: ").append(toIndentedString(allOrgsOverride)).append("\n");
        sb.append("    importPolicy: ").append(toIndentedString(importPolicy)).append("\n");
        sb.append("    skipDiffCheck: ").append(toIndentedString(skipDiffCheck)).append("\n");
        sb.append("    enableLargeMetadataValidation: ")
                .append(toIndentedString(enableLargeMetadataValidation))
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
        openapiFields.add("metadata_tmls");
        openapiFields.add("create_new");
        openapiFields.add("all_orgs_override");
        openapiFields.add("import_policy");
        openapiFields.add("skip_diff_check");
        openapiFields.add("enable_large_metadata_validation");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("metadata_tmls");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ImportMetadataTMLAsyncRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImportMetadataTMLAsyncRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImportMetadataTMLAsyncRequest is not"
                                        + " found in the empty JSON string",
                                ImportMetadataTMLAsyncRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ImportMetadataTMLAsyncRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ImportMetadataTMLAsyncRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ImportMetadataTMLAsyncRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("metadata_tmls") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("metadata_tmls").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_tmls` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("metadata_tmls").toString()));
        }
        if ((jsonObj.get("import_policy") != null && !jsonObj.get("import_policy").isJsonNull())
                && !jsonObj.get("import_policy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `import_policy` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("import_policy").toString()));
        }
        // validate the optional field `import_policy`
        if (jsonObj.get("import_policy") != null && !jsonObj.get("import_policy").isJsonNull()) {
            ImportPolicyEnum.validateJsonElement(jsonObj.get("import_policy"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImportMetadataTMLAsyncRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImportMetadataTMLAsyncRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportMetadataTMLAsyncRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ImportMetadataTMLAsyncRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImportMetadataTMLAsyncRequest>() {
                        @Override
                        public void write(JsonWriter out, ImportMetadataTMLAsyncRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ImportMetadataTMLAsyncRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ImportMetadataTMLAsyncRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImportMetadataTMLAsyncRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ImportMetadataTMLAsyncRequest
     */
    public static ImportMetadataTMLAsyncRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImportMetadataTMLAsyncRequest.class);
    }

    /**
     * Convert an instance of ImportMetadataTMLAsyncRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
