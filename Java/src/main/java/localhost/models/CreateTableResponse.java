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
 * This is a model class for CreateTableResponse type.
 */
public class CreateTableResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LogicalTableHeader logicalTableHeader;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String physicalTableId;

    /**
     * Default constructor.
     */
    public CreateTableResponse() {
    }

    /**
     * Initialization constructor.
     * @param  logicalTableHeader  LogicalTableHeader value for logicalTableHeader.
     * @param  physicalTableId  String value for physicalTableId.
     */
    public CreateTableResponse(
            LogicalTableHeader logicalTableHeader,
            String physicalTableId) {
        this.logicalTableHeader = logicalTableHeader;
        this.physicalTableId = physicalTableId;
    }

    /**
     * Getter for LogicalTableHeader.
     * @return Returns the LogicalTableHeader
     */
    @JsonGetter("logicalTableHeader")
    public LogicalTableHeader getLogicalTableHeader() {
        return logicalTableHeader;
    }

    /**
     * Setter for LogicalTableHeader.
     * @param logicalTableHeader Value for LogicalTableHeader
     */
    @JsonSetter("logicalTableHeader")
    public void setLogicalTableHeader(LogicalTableHeader logicalTableHeader) {
        this.logicalTableHeader = logicalTableHeader;
    }

    /**
     * Getter for PhysicalTableId.
     * @return Returns the String
     */
    @JsonGetter("physicalTableId")
    public String getPhysicalTableId() {
        return physicalTableId;
    }

    /**
     * Setter for PhysicalTableId.
     * @param physicalTableId Value for String
     */
    @JsonSetter("physicalTableId")
    public void setPhysicalTableId(String physicalTableId) {
        this.physicalTableId = physicalTableId;
    }

    /**
     * Converts this CreateTableResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateTableResponse [" + "logicalTableHeader=" + logicalTableHeader
                + ", physicalTableId=" + physicalTableId + "]";
    }

    /**
     * Builds a new {@link CreateTableResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateTableResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .logicalTableHeader(getLogicalTableHeader())
                .physicalTableId(getPhysicalTableId());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateTableResponse}.
     */
    public static class Builder {
        private LogicalTableHeader logicalTableHeader;
        private String physicalTableId;



        /**
         * Setter for logicalTableHeader.
         * @param  logicalTableHeader  LogicalTableHeader value for logicalTableHeader.
         * @return Builder
         */
        public Builder logicalTableHeader(LogicalTableHeader logicalTableHeader) {
            this.logicalTableHeader = logicalTableHeader;
            return this;
        }

        /**
         * Setter for physicalTableId.
         * @param  physicalTableId  String value for physicalTableId.
         * @return Builder
         */
        public Builder physicalTableId(String physicalTableId) {
            this.physicalTableId = physicalTableId;
            return this;
        }

        /**
         * Builds a new {@link CreateTableResponse} object using the set fields.
         * @return {@link CreateTableResponse}
         */
        public CreateTableResponse build() {
            return new CreateTableResponse(logicalTableHeader, physicalTableId);
        }
    }
}
