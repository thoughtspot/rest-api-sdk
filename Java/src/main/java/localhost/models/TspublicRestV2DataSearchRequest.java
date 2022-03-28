/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TspublicRestV2DataSearchRequest type.
 */
public class TspublicRestV2DataSearchRequest {
    private Integer offset;
    private Integer batchNumber;
    private Integer batchSize;
    private String queryString;
    private String dataObjectId;
    private FormatType1Enum formatType;

    /**
     * Default constructor.
     */
    public TspublicRestV2DataSearchRequest() {
        offset = 0;
        formatType = FormatType1Enum.COMPACT;
    }

    /**
     * Initialization constructor.
     * @param  queryString  String value for queryString.
     * @param  dataObjectId  String value for dataObjectId.
     * @param  offset  Integer value for offset.
     * @param  batchNumber  Integer value for batchNumber.
     * @param  batchSize  Integer value for batchSize.
     * @param  formatType  FormatType1Enum value for formatType.
     */
    public TspublicRestV2DataSearchRequest(
            String queryString,
            String dataObjectId,
            Integer offset,
            Integer batchNumber,
            Integer batchSize,
            FormatType1Enum formatType) {
        this.offset = offset;
        this.batchNumber = batchNumber;
        this.batchSize = batchSize;
        this.queryString = queryString;
        this.dataObjectId = dataObjectId;
        this.formatType = formatType;
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
     * batchSize with batchNumber. Example: Assume response has 100 records. Now, batchNumber is set
     * as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th
     * record will be considered.
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
     * batchSize with batchNumber. Example: Assume response has 100 records. Now, batchNumber is set
     * as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th
     * record will be considered.
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
     * Getter for QueryString.
     * The data search query string. Example: [revenue] &gt; 1000 [ship mode] = air
     * @return Returns the String
     */
    @JsonGetter("queryString")
    public String getQueryString() {
        return queryString;
    }

    /**
     * Setter for QueryString.
     * The data search query string. Example: [revenue] &gt; 1000 [ship mode] = air
     * @param queryString Value for String
     */
    @JsonSetter("queryString")
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * Getter for DataObjectId.
     * The GUID of the data object, either a worksheet, a view, or a table.
     * @return Returns the String
     */
    @JsonGetter("dataObjectId")
    public String getDataObjectId() {
        return dataObjectId;
    }

    /**
     * Setter for DataObjectId.
     * The GUID of the data object, either a worksheet, a view, or a table.
     * @param dataObjectId Value for String
     */
    @JsonSetter("dataObjectId")
    public void setDataObjectId(String dataObjectId) {
        this.dataObjectId = dataObjectId;
    }

    /**
     * Getter for FormatType.
     * The format of the data in the response. FULL: The response comes in "column":"value" format.
     * COMPACT: The response includes only the value of the columns.
     * @return Returns the FormatType1Enum
     */
    @JsonGetter("formatType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FormatType1Enum getFormatType() {
        return formatType;
    }

    /**
     * Setter for FormatType.
     * The format of the data in the response. FULL: The response comes in "column":"value" format.
     * COMPACT: The response includes only the value of the columns.
     * @param formatType Value for FormatType1Enum
     */
    @JsonSetter("formatType")
    public void setFormatType(FormatType1Enum formatType) {
        this.formatType = formatType;
    }

    /**
     * Converts this TspublicRestV2DataSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2DataSearchRequest [" + "queryString=" + queryString
                + ", dataObjectId=" + dataObjectId + ", offset=" + offset + ", batchNumber="
                + batchNumber + ", batchSize=" + batchSize + ", formatType=" + formatType + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2DataSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2DataSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(queryString, dataObjectId)
                .offset(getOffset())
                .batchNumber(getBatchNumber())
                .batchSize(getBatchSize())
                .formatType(getFormatType());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2DataSearchRequest}.
     */
    public static class Builder {
        private String queryString;
        private String dataObjectId;
        private Integer offset = 0;
        private Integer batchNumber;
        private Integer batchSize;
        private FormatType1Enum formatType = FormatType1Enum.COMPACT;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  queryString  String value for queryString.
         * @param  dataObjectId  String value for dataObjectId.
         */
        public Builder(String queryString, String dataObjectId) {
            this.queryString = queryString;
            this.dataObjectId = dataObjectId;
        }

        /**
         * Setter for queryString.
         * @param  queryString  String value for queryString.
         * @return Builder
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Setter for dataObjectId.
         * @param  dataObjectId  String value for dataObjectId.
         * @return Builder
         */
        public Builder dataObjectId(String dataObjectId) {
            this.dataObjectId = dataObjectId;
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
         * Setter for formatType.
         * @param  formatType  FormatType1Enum value for formatType.
         * @return Builder
         */
        public Builder formatType(FormatType1Enum formatType) {
            this.formatType = formatType;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2DataSearchRequest} object using the set fields.
         * @return {@link TspublicRestV2DataSearchRequest}
         */
        public TspublicRestV2DataSearchRequest build() {
            return new TspublicRestV2DataSearchRequest(queryString, dataObjectId, offset,
                    batchNumber, batchSize, formatType);
        }
    }
}
