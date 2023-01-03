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
 * This is a model class for TspublicRestV2MetadataDependencyRequest type.
 */
public class TspublicRestV2MetadataDependencyRequest {
    private Type13Enum type;
    private List<String> id;
    private Integer batchSize;

    /**
     * Default constructor.
     */
    public TspublicRestV2MetadataDependencyRequest() {
        batchSize = -1;
    }

    /**
     * Initialization constructor.
     * @param  type  Type13Enum value for type.
     * @param  id  List of String value for id.
     * @param  batchSize  Integer value for batchSize.
     */
    public TspublicRestV2MetadataDependencyRequest(
            Type13Enum type,
            List<String> id,
            Integer batchSize) {
        this.type = type;
        this.id = id;
        this.batchSize = batchSize;
    }

    /**
     * Getter for Type.
     * Type of the data object
     * @return Returns the Type13Enum
     */
    @JsonGetter("type")
    public Type13Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the data object
     * @param type Value for Type13Enum
     */
    @JsonSetter("type")
    public void setType(Type13Enum type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * A JSON array of GUIDs of the objects
     * @return Returns the List of String
     */
    @JsonGetter("id")
    public List<String> getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A JSON array of GUIDs of the objects
     * @param id Value for List of String
     */
    @JsonSetter("id")
    public void setId(List<String> id) {
        this.id = id;
    }

    /**
     * Getter for BatchSize.
     * The maximum number of batches to fetch in a query. If this attribute is not defined, the
     * value specified in the cluster configuration is used. To get the list of all dependent
     * objects in a single query, define the batch size attribute as -1
     * @return Returns the Integer
     */
    @JsonGetter("batchSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Setter for BatchSize.
     * The maximum number of batches to fetch in a query. If this attribute is not defined, the
     * value specified in the cluster configuration is used. To get the list of all dependent
     * objects in a single query, define the batch size attribute as -1
     * @param batchSize Value for Integer
     */
    @JsonSetter("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Converts this TspublicRestV2MetadataDependencyRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2MetadataDependencyRequest [" + "type=" + type + ", id=" + id
                + ", batchSize=" + batchSize + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2MetadataDependencyRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2MetadataDependencyRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id)
                .batchSize(getBatchSize());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2MetadataDependencyRequest}.
     */
    public static class Builder {
        private Type13Enum type;
        private List<String> id;
        private Integer batchSize = -1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  Type13Enum value for type.
         * @param  id  List of String value for id.
         */
        public Builder(Type13Enum type, List<String> id) {
            this.type = type;
            this.id = id;
        }

        /**
         * Setter for type.
         * @param  type  Type13Enum value for type.
         * @return Builder
         */
        public Builder type(Type13Enum type) {
            this.type = type;
            return this;
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
         * Setter for batchSize.
         * @param  batchSize  Integer value for batchSize.
         * @return Builder
         */
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2MetadataDependencyRequest} object using the set fields.
         * @return {@link TspublicRestV2MetadataDependencyRequest}
         */
        public TspublicRestV2MetadataDependencyRequest build() {
            return new TspublicRestV2MetadataDependencyRequest(type, id, batchSize);
        }
    }
}
