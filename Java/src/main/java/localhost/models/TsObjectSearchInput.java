/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TsObjectSearchInput type.
 */
public class TsObjectSearchInput {
    private Type2Enum type;
    private List<String> id;

    /**
     * Default constructor.
     */
    public TsObjectSearchInput() {
    }

    /**
     * Initialization constructor.
     * @param  type  Type2Enum value for type.
     * @param  id  List of String value for id.
     */
    public TsObjectSearchInput(
            Type2Enum type,
            List<String> id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Getter for Type.
     * Type of the metadata objec
     * @return Returns the Type2Enum
     */
    @JsonGetter("type")
    public Type2Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the metadata objec
     * @param type Value for Type2Enum
     */
    @JsonSetter("type")
    public void setType(Type2Enum type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * A JSON Array of GUIDs of the metadata object
     * @return Returns the List of String
     */
    @JsonGetter("id")
    public List<String> getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A JSON Array of GUIDs of the metadata object
     * @param id Value for List of String
     */
    @JsonSetter("id")
    public void setId(List<String> id) {
        this.id = id;
    }

    /**
     * Converts this TsObjectSearchInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TsObjectSearchInput [" + "type=" + type + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link TsObjectSearchInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TsObjectSearchInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id);
        return builder;
    }

    /**
     * Class to build instances of {@link TsObjectSearchInput}.
     */
    public static class Builder {
        private Type2Enum type;
        private List<String> id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  Type2Enum value for type.
         * @param  id  List of String value for id.
         */
        public Builder(Type2Enum type, List<String> id) {
            this.type = type;
            this.id = id;
        }

        /**
         * Setter for type.
         * @param  type  Type2Enum value for type.
         * @return Builder
         */
        public Builder type(Type2Enum type) {
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
         * Builds a new {@link TsObjectSearchInput} object using the set fields.
         * @return {@link TsObjectSearchInput}
         */
        public TsObjectSearchInput build() {
            return new TsObjectSearchInput(type, id);
        }
    }
}
