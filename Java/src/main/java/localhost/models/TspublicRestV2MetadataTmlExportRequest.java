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
 * This is a model class for TspublicRestV2MetadataTmlExportRequest type.
 */
public class TspublicRestV2MetadataTmlExportRequest {
    private List<String> id;
    private FormatTypeEnum formatType;
    private ExportAssociatedEnum exportAssociated;

    /**
     * Default constructor.
     */
    public TspublicRestV2MetadataTmlExportRequest() {
        formatType = FormatTypeEnum.YAML;
        exportAssociated = ExportAssociatedEnum.ENUM_FALSE;
    }

    /**
     * Initialization constructor.
     * @param  id  List of String value for id.
     * @param  formatType  FormatTypeEnum value for formatType.
     * @param  exportAssociated  ExportAssociatedEnum value for exportAssociated.
     */
    public TspublicRestV2MetadataTmlExportRequest(
            List<String> id,
            FormatTypeEnum formatType,
            ExportAssociatedEnum exportAssociated) {
        this.id = id;
        this.formatType = formatType;
        this.exportAssociated = exportAssociated;
    }

    /**
     * Getter for Id.
     * A JSON array of GUIDs of the objects.
     * @return Returns the List of String
     */
    @JsonGetter("id")
    public List<String> getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A JSON array of GUIDs of the objects.
     * @param id Value for List of String
     */
    @JsonSetter("id")
    public void setId(List<String> id) {
        this.id = id;
    }

    /**
     * Getter for FormatType.
     * The format in which to export the objects
     * @return Returns the FormatTypeEnum
     */
    @JsonGetter("formatType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FormatTypeEnum getFormatType() {
        return formatType;
    }

    /**
     * Setter for FormatType.
     * The format in which to export the objects
     * @param formatType Value for FormatTypeEnum
     */
    @JsonSetter("formatType")
    public void setFormatType(FormatTypeEnum formatType) {
        this.formatType = formatType;
    }

    /**
     * Getter for ExportAssociated.
     * Specifies if you would like to export the associated objects. To export the objects
     * associated with the objects specified in id, set the value to true. When set to true, the API
     * exports any underlying worksheets, tables, or views for a given object. By default, the API
     * does not export these underlying objects
     * @return Returns the ExportAssociatedEnum
     */
    @JsonGetter("exportAssociated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExportAssociatedEnum getExportAssociated() {
        return exportAssociated;
    }

    /**
     * Setter for ExportAssociated.
     * Specifies if you would like to export the associated objects. To export the objects
     * associated with the objects specified in id, set the value to true. When set to true, the API
     * exports any underlying worksheets, tables, or views for a given object. By default, the API
     * does not export these underlying objects
     * @param exportAssociated Value for ExportAssociatedEnum
     */
    @JsonSetter("exportAssociated")
    public void setExportAssociated(ExportAssociatedEnum exportAssociated) {
        this.exportAssociated = exportAssociated;
    }

    /**
     * Converts this TspublicRestV2MetadataTmlExportRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2MetadataTmlExportRequest [" + "id=" + id + ", formatType="
                + formatType + ", exportAssociated=" + exportAssociated + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2MetadataTmlExportRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2MetadataTmlExportRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id)
                .formatType(getFormatType())
                .exportAssociated(getExportAssociated());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2MetadataTmlExportRequest}.
     */
    public static class Builder {
        private List<String> id;
        private FormatTypeEnum formatType = FormatTypeEnum.YAML;
        private ExportAssociatedEnum exportAssociated = ExportAssociatedEnum.ENUM_FALSE;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  List of String value for id.
         */
        public Builder(List<String> id) {
            this.id = id;
        }

        /**
         * Setter for id.
         * @param  id  List of String value for id.
         * @return Builder
         */
        public Builder id(List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for formatType.
         * @param  formatType  FormatTypeEnum value for formatType.
         * @return Builder
         */
        public Builder formatType(FormatTypeEnum formatType) {
            this.formatType = formatType;
            return this;
        }

        /**
         * Setter for exportAssociated.
         * @param  exportAssociated  ExportAssociatedEnum value for exportAssociated.
         * @return Builder
         */
        public Builder exportAssociated(ExportAssociatedEnum exportAssociated) {
            this.exportAssociated = exportAssociated;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2MetadataTmlExportRequest} object using the set fields.
         * @return {@link TspublicRestV2MetadataTmlExportRequest}
         */
        public TspublicRestV2MetadataTmlExportRequest build() {
            return new TspublicRestV2MetadataTmlExportRequest(id, formatType, exportAssociated);
        }
    }
}