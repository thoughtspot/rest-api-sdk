/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.auth;

import com.thoughtspot.client.ApiException;
import com.thoughtspot.client.Pair;
import java.net.URI;
import java.util.List;
import java.util.Map;
import okhttp3.Credentials;

public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri)
            throws ApiException {
        if (username == null && password == null) {
            return;
        }
        headerParams.put(
                "Authorization",
                Credentials.basic(
                        username == null ? "" : username, password == null ? "" : password));
    }
}
