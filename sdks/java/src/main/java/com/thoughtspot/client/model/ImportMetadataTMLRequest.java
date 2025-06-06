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

/** ImportMetadataTMLRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ImportMetadataTMLRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_METADATA_TMLS = "metadata_tmls";

    @SerializedName(SERIALIZED_NAME_METADATA_TMLS)
    @javax.annotation.Nonnull
    private List<String> metadataTmls;

    /** Specifies the import policy for the TML import. */
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
    private ImportPolicyEnum importPolicy = ImportPolicyEnum.PARTIAL;

    public static final String SERIALIZED_NAME_CREATE_NEW = "create_new";

    @SerializedName(SERIALIZED_NAME_CREATE_NEW)
    @javax.annotation.Nullable
    private Boolean createNew = false;

    public static final String SERIALIZED_NAME_ALL_ORGS_OVERRIDE = "all_orgs_override";

    @SerializedName(SERIALIZED_NAME_ALL_ORGS_OVERRIDE)
    @javax.annotation.Nullable
    private Boolean allOrgsOverride = false;

    public static final String SERIALIZED_NAME_SKIP_DIFF_CHECK = "skip_diff_check";

    @SerializedName(SERIALIZED_NAME_SKIP_DIFF_CHECK)
    @javax.annotation.Nullable
    private Boolean skipDiffCheck = false;

    public static final String SERIALIZED_NAME_ENABLE_LARGE_METADATA_VALIDATION =
            "enable_large_metadata_validation";

    @SerializedName(SERIALIZED_NAME_ENABLE_LARGE_METADATA_VALIDATION)
    @javax.annotation.Nullable
    private Boolean enableLargeMetadataValidation = false;

    public ImportMetadataTMLRequest() {}

    public ImportMetadataTMLRequest metadataTmls(
            @javax.annotation.Nonnull List<String> metadataTmls) {
        this.metadataTmls = metadataTmls;
        return this;
    }

    public ImportMetadataTMLRequest addMetadataTmlsItem(String metadataTmlsItem) {
        if (this.metadataTmls == null) {
            this.metadataTmls = new ArrayList<>();
        }
        this.metadataTmls.add(metadataTmlsItem);
        return this;
    }

    /**
     * Details of TML objects. **Note: importing TML in YAML format, when coming directly from our
     * Playground, is currently requires manual formatting. For more details on the workaround,
     * please click
     * [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
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

    public ImportMetadataTMLRequest importPolicy(
            @javax.annotation.Nullable ImportPolicyEnum importPolicy) {
        this.importPolicy = importPolicy;
        return this;
    }

    /**
     * Specifies the import policy for the TML import.
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

    public ImportMetadataTMLRequest createNew(@javax.annotation.Nullable Boolean createNew) {
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

    public ImportMetadataTMLRequest allOrgsOverride(
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

    public ImportMetadataTMLRequest skipDiffCheck(
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

    public ImportMetadataTMLRequest enableLargeMetadataValidation(
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
        ImportMetadataTMLRequest importMetadataTMLRequest = (ImportMetadataTMLRequest) o;
        return Objects.equals(this.metadataTmls, importMetadataTMLRequest.metadataTmls)
                && Objects.equals(this.importPolicy, importMetadataTMLRequest.importPolicy)
                && Objects.equals(this.createNew, importMetadataTMLRequest.createNew)
                && Objects.equals(this.allOrgsOverride, importMetadataTMLRequest.allOrgsOverride)
                && Objects.equals(this.skipDiffCheck, importMetadataTMLRequest.skipDiffCheck)
                && Objects.equals(
                        this.enableLargeMetadataValidation,
                        importMetadataTMLRequest.enableLargeMetadataValidation);
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
                importPolicy,
                createNew,
                allOrgsOverride,
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
        sb.append("class ImportMetadataTMLRequest {\n");
        sb.append("    metadataTmls: ").append(toIndentedString(metadataTmls)).append("\n");
        sb.append("    importPolicy: ").append(toIndentedString(importPolicy)).append("\n");
        sb.append("    createNew: ").append(toIndentedString(createNew)).append("\n");
        sb.append("    allOrgsOverride: ").append(toIndentedString(allOrgsOverride)).append("\n");
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
        openapiFields.add("import_policy");
        openapiFields.add("create_new");
        openapiFields.add("all_orgs_override");
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
     * @throws IOException if the JSON Element is invalid with respect to ImportMetadataTMLRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ImportMetadataTMLRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImportMetadataTMLRequest is not found"
                                        + " in the empty JSON string",
                                ImportMetadataTMLRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ImportMetadataTMLRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ImportMetadataTMLRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ImportMetadataTMLRequest.openapiRequiredFields) {
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
            if (!ImportMetadataTMLRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImportMetadataTMLRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImportMetadataTMLRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImportMetadataTMLRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImportMetadataTMLRequest>() {
                        @Override
                        public void write(JsonWriter out, ImportMetadataTMLRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ImportMetadataTMLRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ImportMetadataTMLRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImportMetadataTMLRequest
     * @throws IOException if the JSON string is invalid with respect to ImportMetadataTMLRequest
     */
    public static ImportMetadataTMLRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImportMetadataTMLRequest.class);
    }

    /**
     * Convert an instance of ImportMetadataTMLRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
