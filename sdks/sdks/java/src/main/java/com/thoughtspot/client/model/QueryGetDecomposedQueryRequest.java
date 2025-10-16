/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
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

/** QueryGetDecomposedQueryRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryGetDecomposedQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ANSWER_IDS = "answerIds";

    @SerializedName(SERIALIZED_NAME_ANSWER_IDS)
    @javax.annotation.Nullable
    private List<String> answerIds;

    public static final String SERIALIZED_NAME_CONTENT = "content";

    @SerializedName(SERIALIZED_NAME_CONTENT)
    @javax.annotation.Nullable
    private List<String> content;

    public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversationId";

    @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
    @javax.annotation.Nullable
    private String conversationId;

    public static final String SERIALIZED_NAME_LIVEBOARD_IDS = "liveboardIds";

    @SerializedName(SERIALIZED_NAME_LIVEBOARD_IDS)
    @javax.annotation.Nullable
    private List<String> liveboardIds;

    public static final String SERIALIZED_NAME_MAX_DECOMPOSED_QUERIES = "maxDecomposedQueries";

    @SerializedName(SERIALIZED_NAME_MAX_DECOMPOSED_QUERIES)
    @javax.annotation.Nullable
    private Integer maxDecomposedQueries;

    public static final String SERIALIZED_NAME_NLS_REQUEST = "nlsRequest";

    @SerializedName(SERIALIZED_NAME_NLS_REQUEST)
    @javax.annotation.Nullable
    private InputEurekaNLSRequest nlsRequest;

    public static final String SERIALIZED_NAME_WORKSHEET_IDS = "worksheetIds";

    @SerializedName(SERIALIZED_NAME_WORKSHEET_IDS)
    @javax.annotation.Nullable
    private List<String> worksheetIds;

    public QueryGetDecomposedQueryRequest() {}

    public QueryGetDecomposedQueryRequest answerIds(
            @javax.annotation.Nullable List<String> answerIds) {
        this.answerIds = answerIds;
        return this;
    }

    public QueryGetDecomposedQueryRequest addAnswerIdsItem(String answerIdsItem) {
        if (this.answerIds == null) {
            this.answerIds = new ArrayList<>();
        }
        this.answerIds.add(answerIdsItem);
        return this;
    }

    /**
     * List of answer unique identifiers (GUIDs) whose data will be used to guide the response.
     *
     * @return answerIds
     */
    @javax.annotation.Nullable
    public List<String> getAnswerIds() {
        return answerIds;
    }

    public void setAnswerIds(@javax.annotation.Nullable List<String> answerIds) {
        this.answerIds = answerIds;
    }

    public QueryGetDecomposedQueryRequest content(@javax.annotation.Nullable List<String> content) {
        this.content = content;
        return this;
    }

    public QueryGetDecomposedQueryRequest addContentItem(String contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * User provided content like text data, csv data as a string message to provide context &amp;
     * potentially improve the quality of the response.
     *
     * @return content
     */
    @javax.annotation.Nullable
    public List<String> getContent() {
        return content;
    }

    public void setContent(@javax.annotation.Nullable List<String> content) {
        this.content = content;
    }

    public QueryGetDecomposedQueryRequest conversationId(
            @javax.annotation.Nullable String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * Unique identifier to denote current conversation.
     *
     * @return conversationId
     */
    @javax.annotation.Nullable
    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(@javax.annotation.Nullable String conversationId) {
        this.conversationId = conversationId;
    }

    public QueryGetDecomposedQueryRequest liveboardIds(
            @javax.annotation.Nullable List<String> liveboardIds) {
        this.liveboardIds = liveboardIds;
        return this;
    }

    public QueryGetDecomposedQueryRequest addLiveboardIdsItem(String liveboardIdsItem) {
        if (this.liveboardIds == null) {
            this.liveboardIds = new ArrayList<>();
        }
        this.liveboardIds.add(liveboardIdsItem);
        return this;
    }

    /**
     * List of liveboard unique identifiers (GUIDs) whose data will be used to guide the response.
     *
     * @return liveboardIds
     */
    @javax.annotation.Nullable
    public List<String> getLiveboardIds() {
        return liveboardIds;
    }

    public void setLiveboardIds(@javax.annotation.Nullable List<String> liveboardIds) {
        this.liveboardIds = liveboardIds;
    }

    public QueryGetDecomposedQueryRequest maxDecomposedQueries(
            @javax.annotation.Nullable Integer maxDecomposedQueries) {
        this.maxDecomposedQueries = maxDecomposedQueries;
        return this;
    }

    /**
     * Maximum number of decomposed queries that is allowed in the response, default &#x3D; 5.
     *
     * @return maxDecomposedQueries
     */
    @javax.annotation.Nullable
    public Integer getMaxDecomposedQueries() {
        return maxDecomposedQueries;
    }

    public void setMaxDecomposedQueries(@javax.annotation.Nullable Integer maxDecomposedQueries) {
        this.maxDecomposedQueries = maxDecomposedQueries;
    }

    public QueryGetDecomposedQueryRequest nlsRequest(
            @javax.annotation.Nullable InputEurekaNLSRequest nlsRequest) {
        this.nlsRequest = nlsRequest;
        return this;
    }

    /**
     * NLSRequest object containing user query &amp; instructions.
     *
     * @return nlsRequest
     */
    @javax.annotation.Nullable
    public InputEurekaNLSRequest getNlsRequest() {
        return nlsRequest;
    }

    public void setNlsRequest(@javax.annotation.Nullable InputEurekaNLSRequest nlsRequest) {
        this.nlsRequest = nlsRequest;
    }

    public QueryGetDecomposedQueryRequest worksheetIds(
            @javax.annotation.Nullable List<String> worksheetIds) {
        this.worksheetIds = worksheetIds;
        return this;
    }

    public QueryGetDecomposedQueryRequest addWorksheetIdsItem(String worksheetIdsItem) {
        if (this.worksheetIds == null) {
            this.worksheetIds = new ArrayList<>();
        }
        this.worksheetIds.add(worksheetIdsItem);
        return this;
    }

    /**
     * List of worksheetIds to provide context for decomposing user query into analytical queries
     * that can be run on them.
     *
     * @return worksheetIds
     */
    @javax.annotation.Nullable
    public List<String> getWorksheetIds() {
        return worksheetIds;
    }

    public void setWorksheetIds(@javax.annotation.Nullable List<String> worksheetIds) {
        this.worksheetIds = worksheetIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryGetDecomposedQueryRequest queryGetDecomposedQueryRequest =
                (QueryGetDecomposedQueryRequest) o;
        return Objects.equals(this.answerIds, queryGetDecomposedQueryRequest.answerIds)
                && Objects.equals(this.content, queryGetDecomposedQueryRequest.content)
                && Objects.equals(
                        this.conversationId, queryGetDecomposedQueryRequest.conversationId)
                && Objects.equals(this.liveboardIds, queryGetDecomposedQueryRequest.liveboardIds)
                && Objects.equals(
                        this.maxDecomposedQueries,
                        queryGetDecomposedQueryRequest.maxDecomposedQueries)
                && Objects.equals(this.nlsRequest, queryGetDecomposedQueryRequest.nlsRequest)
                && Objects.equals(this.worksheetIds, queryGetDecomposedQueryRequest.worksheetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                answerIds,
                content,
                conversationId,
                liveboardIds,
                maxDecomposedQueries,
                nlsRequest,
                worksheetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryGetDecomposedQueryRequest {\n");
        sb.append("    answerIds: ").append(toIndentedString(answerIds)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
        sb.append("    liveboardIds: ").append(toIndentedString(liveboardIds)).append("\n");
        sb.append("    maxDecomposedQueries: ")
                .append(toIndentedString(maxDecomposedQueries))
                .append("\n");
        sb.append("    nlsRequest: ").append(toIndentedString(nlsRequest)).append("\n");
        sb.append("    worksheetIds: ").append(toIndentedString(worksheetIds)).append("\n");
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
        openapiFields.add("answerIds");
        openapiFields.add("content");
        openapiFields.add("conversationId");
        openapiFields.add("liveboardIds");
        openapiFields.add("maxDecomposedQueries");
        openapiFields.add("nlsRequest");
        openapiFields.add("worksheetIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryGetDecomposedQueryRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryGetDecomposedQueryRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in QueryGetDecomposedQueryRequest is not"
                                        + " found in the empty JSON string",
                                QueryGetDecomposedQueryRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!QueryGetDecomposedQueryRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `QueryGetDecomposedQueryRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("answerIds") != null
                && !jsonObj.get("answerIds").isJsonNull()
                && !jsonObj.get("answerIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `answerIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("answerIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("content") != null
                && !jsonObj.get("content").isJsonNull()
                && !jsonObj.get("content").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `content` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("content").toString()));
        }
        if ((jsonObj.get("conversationId") != null && !jsonObj.get("conversationId").isJsonNull())
                && !jsonObj.get("conversationId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `conversationId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("conversationId").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("liveboardIds") != null
                && !jsonObj.get("liveboardIds").isJsonNull()
                && !jsonObj.get("liveboardIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liveboardIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("liveboardIds").toString()));
        }
        // validate the optional field `nlsRequest`
        if (jsonObj.get("nlsRequest") != null && !jsonObj.get("nlsRequest").isJsonNull()) {
            InputEurekaNLSRequest.validateJsonElement(jsonObj.get("nlsRequest"));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("worksheetIds") != null
                && !jsonObj.get("worksheetIds").isJsonNull()
                && !jsonObj.get("worksheetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `worksheetIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("worksheetIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryGetDecomposedQueryRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'QueryGetDecomposedQueryRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryGetDecomposedQueryRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(QueryGetDecomposedQueryRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryGetDecomposedQueryRequest>() {
                        @Override
                        public void write(JsonWriter out, QueryGetDecomposedQueryRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryGetDecomposedQueryRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryGetDecomposedQueryRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryGetDecomposedQueryRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryGetDecomposedQueryRequest
     */
    public static QueryGetDecomposedQueryRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, QueryGetDecomposedQueryRequest.class);
    }

    /**
     * Convert an instance of QueryGetDecomposedQueryRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
