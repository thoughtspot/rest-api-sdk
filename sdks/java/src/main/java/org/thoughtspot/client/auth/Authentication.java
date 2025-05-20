/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package org.thoughtspot.client.auth;


import java.net.URI;
import java.util.List;
import java.util.Map;
import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.Pair;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     * @param cookieParams Map of cookie parameters
     * @param payload HTTP request body
     * @param method HTTP method
     * @param uri URI
     * @throws ApiException if failed to update the parameters
     */
    void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri)
            throws ApiException;
}
