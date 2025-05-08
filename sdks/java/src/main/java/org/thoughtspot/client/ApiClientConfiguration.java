package org.thoughtspot.client;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import javax.net.ssl.KeyManager;

/**
 * Configuration class for the ThoughtSpot client.
 * This class holds various configuration options such as base path, bearer token,
 * default headers, cookies, SSL verification, and key managers.
 */
public class ApiClientConfiguration {
    private final String basePath;
    private final Supplier<String> bearerTokenSupplier;
    private final Map<String, String> defaultHeaderMap;
    private final Map<String, String> defaultCookieMap;
    private final boolean verifyingSsl;
    private final InputStream sslCaCert;
    private final List<KeyManager> keyManagers;

    /**
     * Default constructor that initializes the configuration with default values.
     */
    public ApiClientConfiguration() {
        this("https://localhost:443");
    }

    /**
     * Constructor that initializes the configuration with a specified base path.
     *
     * @param basePath The base path for the API.
     */
    public ApiClientConfiguration(String basePath) {
        this(basePath, (String) null, Collections.emptyMap(), Collections.emptyMap(), true, null, Collections.emptyList());
    }

    /**
     * Constructor that initializes the configuration with all parameters.
     *
     * @param basePath The base path for the API.
     * @param bearerToken The bearer token for authentication.
     * @param defaultHeaderMap Default headers to include in requests.
     * @param defaultCookieMap Default cookies to include in requests.
     * @param verifyingSsl Whether to verify SSL certificates.
     * @param sslCaCert The SSL CA certificate input stream.
     * @param keyManagers List of key managers for SSL configuration.
     */
    public ApiClientConfiguration(
            final String basePath,
            final String bearerToken,
            final Map<String, String> defaultHeaderMap,
            final Map<String, String> defaultCookieMap,
            final boolean verifyingSsl,
            final InputStream sslCaCert,
            final List<KeyManager> keyManagers
    ) {
        this(basePath, () -> bearerToken, defaultHeaderMap, defaultCookieMap, verifyingSsl, sslCaCert, keyManagers);
    }

    /**
     * Constructor that initializes the configuration with all parameters.
     *
     * @param basePath The base path for the API.
     * @param bearerTokenSupplier The bearer token supplier for authentication.
     * @param defaultHeaderMap Default headers to include in requests.
     * @param defaultCookieMap Default cookies to include in requests.
     * @param verifyingSsl Whether to verify SSL certificates.
     * @param sslCaCert The SSL CA certificate input stream.
     * @param keyManagers List of key managers for SSL configuration.
     */
    public ApiClientConfiguration(
            final String basePath,
            final Supplier<String> bearerTokenSupplier,
            final Map<String, String> defaultHeaderMap,
            final Map<String, String> defaultCookieMap,
            final boolean verifyingSsl,
            final InputStream sslCaCert,
            final List<KeyManager> keyManagers
    ) {
        this.basePath = basePath;
        this.bearerTokenSupplier = bearerTokenSupplier;
        this.defaultHeaderMap = defaultHeaderMap != null
                ? Collections.unmodifiableMap(new HashMap<>(defaultHeaderMap))
                : Collections.emptyMap();
        this.defaultCookieMap = defaultCookieMap != null
                ? Collections.unmodifiableMap(new HashMap<>(defaultCookieMap))
                : Collections.emptyMap();
        this.verifyingSsl = verifyingSsl;
        this.sslCaCert = sslCaCert;
        this.keyManagers = keyManagers != null
                ? Collections.unmodifiableList(new ArrayList<>(keyManagers))
                : Collections.emptyList();
    }

    /**
     * @return The base path for the API.
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * @return The bearer token for authentication.
     */
    public String getBearerToken() {
        return bearerTokenSupplier.get();
    }

    /**
     * @return The bearer token supplier for authentication.
     */
    public Supplier<String> getBearerTokenSupplier() {
        return bearerTokenSupplier;
    }

    /**
     * @return An unmodifiable map of default headers.
     */
    public Map<String, String> getDefaultHeaderMap() {
        return defaultHeaderMap;
    }

    /**
     * @return An unmodifiable map of default cookies.
     */
    public Map<String, String> getDefaultCookieMap() {
        return defaultCookieMap;
    }

    /**
     * @return Whether SSL verification is enabled.
     */
    public boolean isVerifyingSsl() {
        return verifyingSsl;
    }

    /**
     * @return The SSL CA certificate input stream.
     */
    public InputStream getSslCaCert() {
        return sslCaCert;
    }

    /**
     * @return An unmodifiable list of key managers.
     */
    public List<KeyManager> getKeyManagers() {
        return keyManagers;
    }

    /**
     * @return A string representation of the client configuration.
     */
    @Override
    public String toString() {
        return "ApiClientConfiguration{" +
                "basePath='" + basePath + '\'' +
                ", defaultHeaderMap=" + defaultHeaderMap +
                ", defaultCookieMap=" + defaultCookieMap +
                ", verifyingSsl=" + verifyingSsl +
                ", sslCaCert=" + sslCaCert +
                ", keyManagers=" + keyManagers +
                '}';
    }

    /**
     * Converts the current configuration to a builder for modification.
     *
     * @return A builder initialized with the current configuration.
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * Builder class for constructing a {@link ApiClientConfiguration} instance.
     */
    public static class Builder {
        private String basePath;
        private Supplier<String> bearerTokenSupplier;
        private Map<String, String> defaultHeaderMap;
        private Map<String, String> defaultCookieMap;
        private boolean verifyingSsl;
        private InputStream sslCaCert;
        private List<KeyManager> keyManagers;

        /**
         * Default constructor that initializes the builder with default values.
         */
        public Builder() {
            this.basePath = "https://localhost:443";
            this.bearerTokenSupplier = () -> null;
            this.defaultHeaderMap = new HashMap<>();
            this.defaultCookieMap = new HashMap<>();
            this.verifyingSsl = true;
            this.keyManagers = new ArrayList<>();
        }

        /**
         * Constructor that initializes the builder with an existing configuration.
         *
         * @param config The existing {@link ApiClientConfiguration}.
         */
        public Builder(ApiClientConfiguration config) {
            this.basePath = config.getBasePath();
            this.bearerTokenSupplier = config.getBearerTokenSupplier();
            this.defaultHeaderMap = new HashMap<>(config.getDefaultHeaderMap());
            this.defaultCookieMap = new HashMap<>(config.getDefaultCookieMap());
            this.verifyingSsl = config.isVerifyingSsl();
            this.sslCaCert = config.getSslCaCert();
            this.keyManagers = new ArrayList<>(config.getKeyManagers());
        }

        /**
         * Sets the base path for the API.
         *
         * @param basePath The base path.
         * @return The builder instance.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * Sets the bearer token for authentication.
         *
         * @param bearerToken The bearer token.
         * @return The builder instance.
         */
        public Builder bearerToken(String bearerToken) {
            this.bearerTokenSupplier = () -> bearerToken;
            return this;
        }

        /**
         * Sets the bearer token supplier for authentication.
         *
         * @param bearerTokenSupplier The bearer token supplier.
         * @return The builder instance.
         */
        public Builder bearerTokenSupplier(Supplier<String> bearerTokenSupplier) {
            this.bearerTokenSupplier = bearerTokenSupplier;
            return this;
        }

        /**
         * Adds a default header to the configuration.
         *
         * @param key The header key.
         * @param value The header value.
         * @return The builder instance.
         */
        public Builder defaultHeader(String key, String value) {
            this.defaultHeaderMap.put(key, value);
            return this;
        }

        /**
         * Sets the default headers map.
         *
         * @param map The headers map.
         * @return The builder instance.
         */
        public Builder defaultHeaderMap(Map<String, String> map) {
            this.defaultHeaderMap = map != null ? new HashMap<>(map) : new HashMap<>();
            return this;
        }

        /**
         * Adds a default cookie to the configuration.
         *
         * @param key The cookie key.
         * @param value The cookie value.
         * @return The builder instance.
         */
        public Builder defaultCookie(String key, String value) {
            this.defaultCookieMap.put(key, value);
            return this;
        }

        /**
         * Sets the default cookies map.
         *
         * @param map The cookies map.
         * @return The builder instance.
         */
        public Builder defaultCookieMap(Map<String, String> map) {
            this.defaultCookieMap = map != null ? new HashMap<>(map) : new HashMap<>();
            return this;
        }

        /**
         * Sets whether SSL verification is enabled.
         *
         * @param verifyingSsl True to enable SSL verification, false otherwise.
         * @return The builder instance.
         */
        public Builder verifyingSsl(boolean verifyingSsl) {
            this.verifyingSsl = verifyingSsl;
            return this;
        }

        /**
         * Sets the SSL CA certificate input stream.
         *
         * @param sslCaCert The input stream.
         * @return The builder instance.
         */
        public Builder sslCaCert(InputStream sslCaCert) {
            this.sslCaCert = sslCaCert;
            return this;
        }

        /**
         * Adds a key manager to the configuration.
         *
         * @param keyManager The key manager.
         * @return The builder instance.
         */
        public Builder keyManager(KeyManager keyManager) {
            this.keyManagers.add(keyManager);
            return this;
        }

        /**
         * Sets the list of key managers.
         *
         * @param keyManagers The list of key managers.
         * @return The builder instance.
         */
        public Builder keyManagers(List<KeyManager> keyManagers) {
            this.keyManagers = keyManagers != null ? new ArrayList<>(keyManagers) : new ArrayList<>();
            return this;
        }

        /**
         * Builds a {@link ApiClientConfiguration} instance with the current builder values.
         *
         * @return A new {@link ApiClientConfiguration} instance.
         */
        public ApiClientConfiguration build() {
            return new ApiClientConfiguration(
                    basePath,
                    bearerTokenSupplier,
                    defaultHeaderMap,
                    defaultCookieMap,
                    verifyingSsl,
                    sslCaCert,
                    keyManagers
            );
        }
    }
}
