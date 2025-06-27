/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Configuration {
    public static final String VERSION = "2.15.0";

    private static volatile ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API instances without providing
     * an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API instances without providing
     * an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
