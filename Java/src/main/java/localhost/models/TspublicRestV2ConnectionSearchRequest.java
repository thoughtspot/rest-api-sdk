/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2ConnectionSearchRequest type.
 */
public class TspublicRestV2ConnectionSearchRequest {
    private Integer offset;
    private Integer batchNumber;
    private Integer batchSize;
    private SearchConnectionSortByEnum sortBy;
    private SearchConnectionSortOrderEnum sortOrder;
    private SearchConnectionTypeEnum type;
    private String namePattern;
    private List<String> fetchId;
    private List<String> skipId;
    private List<TagNameAndIdInput> tag;

    /**
     * Default constructor.
     */
    public TspublicRestV2ConnectionSearchRequest() {
        offset = 0;
        sortBy = SearchConnectionSortByEnum.DEFAULT;
        sortOrder = SearchConnectionSortOrderEnum.DEFAULT;
    }

    /**
     * Initialization constructor.
     * @param  type  SearchConnectionTypeEnum value for type.
     * @param  offset  Integer value for offset.
     * @param  batchNumber  Integer value for batchNumber.
     * @param  batchSize  Integer value for batchSize.
     * @param  sortBy  SearchConnectionSortByEnum value for sortBy.
     * @param  sortOrder  SearchConnectionSortOrderEnum value for sortOrder.
     * @param  namePattern  String value for namePattern.
     * @param  fetchId  List of String value for fetchId.
     * @param  skipId  List of String value for skipId.
     * @param  tag  List of TagNameAndIdInput value for tag.
     */
    public TspublicRestV2ConnectionSearchRequest(
            SearchConnectionTypeEnum type,
            Integer offset,
            Integer batchNumber,
            Integer batchSize,
            SearchConnectionSortByEnum sortBy,
            SearchConnectionSortOrderEnum sortOrder,
            String namePattern,
            List<String> fetchId,
            List<String> skipId,
            List<TagNameAndIdInput> tag) {
        this.offset = offset;
        this.batchNumber = batchNumber;
        this.batchSize = batchSize;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.type = type;
        this.namePattern = namePattern;
        this.fetchId = fetchId;
        this.skipId = skipId;
        this.tag = tag;
    }

    /**
     * Getter for Offset.
     * The offset point, starting from where the records should be included in the response. If no
     * input is provided then offset starts from 0.
     * @return Returns the Integer
     */
    @JsonGetter("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOffset() {
        return offset;
    }

    /**
     * Setter for Offset.
     * The offset point, starting from where the records should be included in the response. If no
     * input is provided then offset starts from 0.
     * @param offset Value for Integer
     */
    @JsonSetter("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Getter for BatchNumber.
     * An alternate way to set offset for the starting point of the response. The value in offset
     * field will not be considered if batchNumber field has value greater than 0. Offset value will
     * be calculated as (batchNumber - 1) * batchSize. It is mandatory to provide a value for
     * batchSize with batchNumber.
     * @return Returns the Integer
     */
    @JsonGetter("batchNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBatchNumber() {
        return batchNumber;
    }

    /**
     * Setter for BatchNumber.
     * An alternate way to set offset for the starting point of the response. The value in offset
     * field will not be considered if batchNumber field has value greater than 0. Offset value will
     * be calculated as (batchNumber - 1) * batchSize. It is mandatory to provide a value for
     * batchSize with batchNumber.
     * @param batchNumber Value for Integer
     */
    @JsonSetter("batchNumber")
    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * Getter for BatchSize.
     * The number of records that should be included in the response starting from offset position.
     * If no input is provided, then all records starting from the value provided in offset is
     * included in the response.
     * @return Returns the Integer
     */
    @JsonGetter("batchSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Setter for BatchSize.
     * The number of records that should be included in the response starting from offset position.
     * If no input is provided, then all records starting from the value provided in offset is
     * included in the response.
     * @param batchSize Value for Integer
     */
    @JsonSetter("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Getter for SortBy.
     * Field based on which the response needs to be ordered.
     * @return Returns the SearchConnectionSortByEnum
     */
    @JsonGetter("sortBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchConnectionSortByEnum getSortBy() {
        return sortBy;
    }

    /**
     * Setter for SortBy.
     * Field based on which the response needs to be ordered.
     * @param sortBy Value for SearchConnectionSortByEnum
     */
    @JsonSetter("sortBy")
    public void setSortBy(SearchConnectionSortByEnum sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * Getter for SortOrder.
     * Order in which sortBy should be applied.
     * @return Returns the SearchConnectionSortOrderEnum
     */
    @JsonGetter("sortOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchConnectionSortOrderEnum getSortOrder() {
        return sortOrder;
    }

    /**
     * Setter for SortOrder.
     * Order in which sortBy should be applied.
     * @param sortOrder Value for SearchConnectionSortOrderEnum
     */
    @JsonSetter("sortOrder")
    public void setSortOrder(SearchConnectionSortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * Getter for Type.
     * Type of the connect being searched. Valid values:
     * @return Returns the SearchConnectionTypeEnum
     */
    @JsonGetter("type")
    public SearchConnectionTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the connect being searched. Valid values:
     * @param type Value for SearchConnectionTypeEnum
     */
    @JsonSetter("type")
    public void setType(SearchConnectionTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for NamePattern.
     * A pattern to match the name of the connection. This parameter supports matching
     * case-insensitive strings. For a wildcard match, use %.
     * @return Returns the String
     */
    @JsonGetter("namePattern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNamePattern() {
        return namePattern;
    }

    /**
     * Setter for NamePattern.
     * A pattern to match the name of the connection. This parameter supports matching
     * case-insensitive strings. For a wildcard match, use %.
     * @param namePattern Value for String
     */
    @JsonSetter("namePattern")
    public void setNamePattern(String namePattern) {
        this.namePattern = namePattern;
    }

    /**
     * Getter for FetchId.
     * A JSON array containing the GUIDs of the connections that you want to fetch.
     * @return Returns the List of String
     */
    @JsonGetter("fetchId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getFetchId() {
        return fetchId;
    }

    /**
     * Setter for FetchId.
     * A JSON array containing the GUIDs of the connections that you want to fetch.
     * @param fetchId Value for List of String
     */
    @JsonSetter("fetchId")
    public void setFetchId(List<String> fetchId) {
        this.fetchId = fetchId;
    }

    /**
     * Getter for SkipId.
     * A JSON array containing the GUIDs of the connections that you want to skip.
     * @return Returns the List of String
     */
    @JsonGetter("skipId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSkipId() {
        return skipId;
    }

    /**
     * Setter for SkipId.
     * A JSON array containing the GUIDs of the connections that you want to skip.
     * @param skipId Value for List of String
     */
    @JsonSetter("skipId")
    public void setSkipId(List<String> skipId) {
        this.skipId = skipId;
    }

    /**
     * Getter for Tag.
     * A JSON array of name or GUID of tags or both. When both are given then id is considered
     * @return Returns the List of TagNameAndIdInput
     */
    @JsonGetter("tag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TagNameAndIdInput> getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * A JSON array of name or GUID of tags or both. When both are given then id is considered
     * @param tag Value for List of TagNameAndIdInput
     */
    @JsonSetter("tag")
    public void setTag(List<TagNameAndIdInput> tag) {
        this.tag = tag;
    }

    /**
     * Converts this TspublicRestV2ConnectionSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2ConnectionSearchRequest [" + "type=" + type + ", offset=" + offset
                + ", batchNumber=" + batchNumber + ", batchSize=" + batchSize + ", sortBy=" + sortBy
                + ", sortOrder=" + sortOrder + ", namePattern=" + namePattern + ", fetchId="
                + fetchId + ", skipId=" + skipId + ", tag=" + tag + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2ConnectionSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2ConnectionSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .offset(getOffset())
                .batchNumber(getBatchNumber())
                .batchSize(getBatchSize())
                .sortBy(getSortBy())
                .sortOrder(getSortOrder())
                .namePattern(getNamePattern())
                .fetchId(getFetchId())
                .skipId(getSkipId())
                .tag(getTag());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2ConnectionSearchRequest}.
     */
    public static class Builder {
        private SearchConnectionTypeEnum type;
        private Integer offset = 0;
        private Integer batchNumber;
        private Integer batchSize;
        private SearchConnectionSortByEnum sortBy = SearchConnectionSortByEnum.DEFAULT;
        private SearchConnectionSortOrderEnum sortOrder = SearchConnectionSortOrderEnum.DEFAULT;
        private String namePattern;
        private List<String> fetchId;
        private List<String> skipId;
        private List<TagNameAndIdInput> tag;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  SearchConnectionTypeEnum value for type.
         */
        public Builder(SearchConnectionTypeEnum type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  SearchConnectionTypeEnum value for type.
         * @return Builder
         */
        public Builder type(SearchConnectionTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for offset.
         * @param  offset  Integer value for offset.
         * @return Builder
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Setter for batchNumber.
         * @param  batchNumber  Integer value for batchNumber.
         * @return Builder
         */
        public Builder batchNumber(Integer batchNumber) {
            this.batchNumber = batchNumber;
            return this;
        }

        /**
         * Setter for batchSize.
         * @param  batchSize  Integer value for batchSize.
         * @return Builder
         */
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Setter for sortBy.
         * @param  sortBy  SearchConnectionSortByEnum value for sortBy.
         * @return Builder
         */
        public Builder sortBy(SearchConnectionSortByEnum sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Setter for sortOrder.
         * @param  sortOrder  SearchConnectionSortOrderEnum value for sortOrder.
         * @return Builder
         */
        public Builder sortOrder(SearchConnectionSortOrderEnum sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Setter for namePattern.
         * @param  namePattern  String value for namePattern.
         * @return Builder
         */
        public Builder namePattern(String namePattern) {
            this.namePattern = namePattern;
            return this;
        }

        /**
         * Setter for fetchId.
         * @param  fetchId  List of String value for fetchId.
         * @return Builder
         */
        public Builder fetchId(List<String> fetchId) {
            this.fetchId = fetchId;
            return this;
        }

        /**
         * Setter for skipId.
         * @param  skipId  List of String value for skipId.
         * @return Builder
         */
        public Builder skipId(List<String> skipId) {
            this.skipId = skipId;
            return this;
        }

        /**
         * Setter for tag.
         * @param  tag  List of TagNameAndIdInput value for tag.
         * @return Builder
         */
        public Builder tag(List<TagNameAndIdInput> tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2ConnectionSearchRequest} object using the set fields.
         * @return {@link TspublicRestV2ConnectionSearchRequest}
         */
        public TspublicRestV2ConnectionSearchRequest build() {
            return new TspublicRestV2ConnectionSearchRequest(type, offset, batchNumber, batchSize,
                    sortBy, sortOrder, namePattern, fetchId, skipId, tag);
        }
    }
}