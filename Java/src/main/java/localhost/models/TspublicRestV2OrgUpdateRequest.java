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
 * This is a model class for TspublicRestV2OrgUpdateRequest type.
 */
public class TspublicRestV2OrgUpdateRequest {
    private String name;
    private String id;
    private String description;

    /**
     * Default constructor.
     */
    public TspublicRestV2OrgUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  description  String value for description.
     */
    public TspublicRestV2OrgUpdateRequest(
            String name,
            String id,
            String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    /**
     * Getter for Name.
     * Name of the organization.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the organization.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The ID of the organization.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the organization.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Description.
     * Description text for the organization.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description text for the organization.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this TspublicRestV2OrgUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2OrgUpdateRequest [" + "name=" + name + ", id=" + id + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2OrgUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2OrgUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2OrgUpdateRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private String description;



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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2OrgUpdateRequest} object using the set fields.
         * @return {@link TspublicRestV2OrgUpdateRequest}
         */
        public TspublicRestV2OrgUpdateRequest build() {
            return new TspublicRestV2OrgUpdateRequest(name, id, description);
        }
    }
}
