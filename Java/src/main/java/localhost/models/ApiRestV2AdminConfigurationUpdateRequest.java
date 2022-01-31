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
 * This is a model class for ApiRestV2AdminConfigurationUpdateRequest type.
 */
public class ApiRestV2AdminConfigurationUpdateRequest {
    private String config;

    /**
     * Default constructor.
     */
    public ApiRestV2AdminConfigurationUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  config  String value for config.
     */
    public ApiRestV2AdminConfigurationUpdateRequest(
            String config) {
        this.config = config;
    }

    /**
     * Getter for Config.
     * A JSON file with the key-value pair of configuration attributes to be updated. For example,
     * {"defaultChartDataSize": 5000}
     * @return Returns the String
     */
    @JsonGetter("config")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConfig() {
        return config;
    }

    /**
     * Setter for Config.
     * A JSON file with the key-value pair of configuration attributes to be updated. For example,
     * {"defaultChartDataSize": 5000}
     * @param config Value for String
     */
    @JsonSetter("config")
    public void setConfig(String config) {
        this.config = config;
    }

    /**
     * Converts this ApiRestV2AdminConfigurationUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2AdminConfigurationUpdateRequest [" + "config=" + config + "]";
    }

    /**
     * Builds a new {@link ApiRestV2AdminConfigurationUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2AdminConfigurationUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .config(getConfig());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2AdminConfigurationUpdateRequest}.
     */
    public static class Builder {
        private String config;



        /**
         * Setter for config.
         * @param  config  String value for config.
         * @return Builder
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2AdminConfigurationUpdateRequest} object using the set
         * fields.
         * @return {@link ApiRestV2AdminConfigurationUpdateRequest}
         */
        public ApiRestV2AdminConfigurationUpdateRequest build() {
            return new ApiRestV2AdminConfigurationUpdateRequest(config);
        }
    }
}