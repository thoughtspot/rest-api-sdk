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
 * This is a model class for TspublicRestV2ConnectionCreateRequest type.
 */
public class TspublicRestV2ConnectionCreateRequest {
    private CreateConnectionTypeEnum type;
    private String name;
    private String description;
    private String configuration;

    /**
     * Default constructor.
     */
    public TspublicRestV2ConnectionCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  type  CreateConnectionTypeEnum value for type.
     * @param  name  String value for name.
     * @param  configuration  String value for configuration.
     * @param  description  String value for description.
     */
    public TspublicRestV2ConnectionCreateRequest(
            CreateConnectionTypeEnum type,
            String name,
            String configuration,
            String description) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.configuration = configuration;
    }

    /**
     * Getter for Type.
     * Type of the data connection.
     * @return Returns the CreateConnectionTypeEnum
     */
    @JsonGetter("type")
    public CreateConnectionTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the data connection.
     * @param type Value for CreateConnectionTypeEnum
     */
    @JsonSetter("type")
    public void setType(CreateConnectionTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Name.
     * Name of the connection
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the connection
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * A short description of the connection.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A short description of the connection.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Configuration.
     * A JSON object of the connection metadata. The metadata must include configuration attributes
     * required to create the connection. Example: Snowflake:
     * {"accountName":"testaccount","user":"test_user","password":"test_pwd","role":"test_role","warehouse":"test_wh","database":"test_db"}
     * Redshift:
     * {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
     * Google BigQuery: {"project_id":"test_project","oauth_pvt_key":"test_key"} Azure Synapse:
     * {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
     * Teradata: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
     * Oracle ADW:
     * {"user":"test_user","password":"test_pwd","net_service_name":"test_srvc_name","tns_admin":"test_tns","schema":"test_schema"}
     * Starburst: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
     * Databricks: {"host":"test_host","http_path":"https://test
     * ","user":"test_user","password":"test_pwd"} SAP HANA:
     * {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"} Denodo:
     * {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd"}
     * @return Returns the String
     */
    @JsonGetter("configuration")
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * A JSON object of the connection metadata. The metadata must include configuration attributes
     * required to create the connection. Example: Snowflake:
     * {"accountName":"testaccount","user":"test_user","password":"test_pwd","role":"test_role","warehouse":"test_wh","database":"test_db"}
     * Redshift:
     * {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
     * Google BigQuery: {"project_id":"test_project","oauth_pvt_key":"test_key"} Azure Synapse:
     * {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
     * Teradata: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
     * Oracle ADW:
     * {"user":"test_user","password":"test_pwd","net_service_name":"test_srvc_name","tns_admin":"test_tns","schema":"test_schema"}
     * Starburst: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
     * Databricks: {"host":"test_host","http_path":"https://test
     * ","user":"test_user","password":"test_pwd"} SAP HANA:
     * {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"} Denodo:
     * {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd"}
     * @param configuration Value for String
     */
    @JsonSetter("configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * Converts this TspublicRestV2ConnectionCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2ConnectionCreateRequest [" + "type=" + type + ", name=" + name
                + ", configuration=" + configuration + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2ConnectionCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2ConnectionCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, name, configuration)
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2ConnectionCreateRequest}.
     */
    public static class Builder {
        private CreateConnectionTypeEnum type;
        private String name;
        private String configuration;
        private String description;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  CreateConnectionTypeEnum value for type.
         * @param  name  String value for name.
         * @param  configuration  String value for configuration.
         */
        public Builder(CreateConnectionTypeEnum type, String name, String configuration) {
            this.type = type;
            this.name = name;
            this.configuration = configuration;
        }

        /**
         * Setter for type.
         * @param  type  CreateConnectionTypeEnum value for type.
         * @return Builder
         */
        public Builder type(CreateConnectionTypeEnum type) {
            this.type = type;
            return this;
        }

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
         * Setter for configuration.
         * @param  configuration  String value for configuration.
         * @return Builder
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
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
         * Builds a new {@link TspublicRestV2ConnectionCreateRequest} object using the set fields.
         * @return {@link TspublicRestV2ConnectionCreateRequest}
         */
        public TspublicRestV2ConnectionCreateRequest build() {
            return new TspublicRestV2ConnectionCreateRequest(type, name, configuration,
                    description);
        }
    }
}