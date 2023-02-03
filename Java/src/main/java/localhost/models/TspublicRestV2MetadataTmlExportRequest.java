/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for TspublicRestV2MetadataTmlExportRequest type.
 */
public class TspublicRestV2MetadataTmlExportRequest {
    private List<String> id;
    private FormatType3Enum formatType;
    private Boolean exportAssociated;

    /**
     * Default constructor.
     */
    public TspublicRestV2MetadataTmlExportRequest() {
        formatType = FormatType3Enum.YAML;
        exportAssociated = false;
    }

    /**
     * Initialization constructor.
     * @param  id  List of String value for id.
     * @param  formatType  FormatType3Enum value for formatType.
     * @param  exportAssociated  Boolean value for exportAssociated.
     */
    public TspublicRestV2MetadataTmlExportRequest(
            List<String> id,
            FormatType3Enum formatType,
            Boolean exportAssociated) {
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
     * @return Returns the FormatType3Enum
     */
    @JsonGetter("formatType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FormatType3Enum getFormatType() {
        return formatType;
    }

    /**
     * Setter for FormatType.
     * The format in which to export the objects
     * @param formatType Value for FormatType3Enum
     */
    @JsonSetter("formatType")
    public void setFormatType(FormatType3Enum formatType) {
        this.formatType = formatType;
    }

    /**
     * Getter for ExportAssociated.
     * Specifies if you would like to export the associated objects. To export the objects
     * associated with the objects specified in id, set the value to true. When set to true, the API
     * exports any underlying worksheets, tables, or views for a given object. By default, the API
     * does not export these underlying objects
     * @return Returns the Boolean
     */
    @JsonGetter("exportAssociated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExportAssociated() {
        return exportAssociated;
    }

    /**
     * Setter for ExportAssociated.
     * Specifies if you would like to export the associated objects. To export the objects
     * associated with the objects specified in id, set the value to true. When set to true, the API
     * exports any underlying worksheets, tables, or views for a given object. By default, the API
     * does not export these underlying objects
     * @param exportAssociated Value for Boolean
     */
    @JsonSetter("exportAssociated")
    public void setExportAssociated(Boolean exportAssociated) {
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
        private FormatType3Enum formatType = FormatType3Enum.YAML;
        private Boolean exportAssociated = false;

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
         * @param  formatType  FormatType3Enum value for formatType.
         * @return Builder
         */
        public Builder formatType(FormatType3Enum formatType) {
            this.formatType = formatType;
            return this;
        }

        /**
         * Setter for exportAssociated.
         * @param  exportAssociated  Boolean value for exportAssociated.
         * @return Builder
         */
        public Builder exportAssociated(Boolean exportAssociated) {
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