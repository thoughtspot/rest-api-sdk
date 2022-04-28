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
 * This is a model class for LiveboardNameAndID type.
 */
public class LiveboardNameAndID {
    private String name;
    private String id;

    /**
     * Default constructor.
     */
    public LiveboardNameAndID() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     */
    public LiveboardNameAndID(
            String name,
            String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Getter for Name.
     * Name of the liveboard
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the liveboard
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * GUID of the liveboard
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the liveboard
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this LiveboardNameAndID into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LiveboardNameAndID [" + "name=" + name + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link LiveboardNameAndID.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LiveboardNameAndID.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link LiveboardNameAndID}.
     */
    public static class Builder {
        private String name;
        private String id;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link LiveboardNameAndID} object using the set fields.
         * @return {@link LiveboardNameAndID}
         */
        public LiveboardNameAndID build() {
            return new LiveboardNameAndID(name, id);
        }
    }
}
