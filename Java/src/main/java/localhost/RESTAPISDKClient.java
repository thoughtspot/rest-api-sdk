/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import localhost.controllers.AdminController;
import localhost.controllers.ConnectionController;
import localhost.controllers.CustomActionsController;
import localhost.controllers.DataController;
import localhost.controllers.DatabaseController;
import localhost.controllers.GroupController;
import localhost.controllers.LogsController;
import localhost.controllers.MaterializationController;
import localhost.controllers.MetadataController;
import localhost.controllers.ReportController;
import localhost.controllers.SecurityController;
import localhost.controllers.SessionController;
import localhost.controllers.UserController;
import localhost.http.client.HttpCallback;
import localhost.http.client.HttpClient;
import localhost.http.client.HttpClientConfiguration;
import localhost.http.client.OkClient;
import localhost.http.client.ReadonlyHttpClientConfiguration;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class RESTAPISDKClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private SessionController session;
    private UserController user;
    private GroupController group;
    private MetadataController metadata;
    private DatabaseController database;
    private ConnectionController connection;
    private DataController data;
    private ReportController report;
    private AdminController admin;
    private SecurityController security;
    private LogsController logs;
    private MaterializationController materialization;
    private CustomActionsController customActions;

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * baseUrl value.
     */
    private final String baseUrl;

    /**
     * response format.
     */
    private final String acceptLanguage;

    /**
     * body content type for post request.
     */
    private final String contentType;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BearerAuthManager.
     */
    private BearerAuthManager bearerAuthManager;

    /**
     * Map of authentication Managers.
     */
    private Map<String, AuthManager> authManagers;

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private RESTAPISDKClient(Environment environment, String baseUrl, String acceptLanguage,
            String contentType, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, String accessToken,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        this.environment = environment;
        this.baseUrl = baseUrl;
        this.acceptLanguage = acceptLanguage;
        this.contentType = contentType;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.authManagers = (authManagers == null) ? new HashMap<>() : new HashMap<>(authManagers);
        if (this.authManagers.containsKey("global")) {
            this.bearerAuthManager = (BearerAuthManager) this.authManagers.get("global");
        }

        if (!this.authManagers.containsKey("global")
                || !getBearerAuthCredentials().equals(accessToken)) {
            this.bearerAuthManager = new BearerAuthManager(accessToken);
            this.authManagers.put("global", bearerAuthManager);
        }

        session = new SessionController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        user = new UserController(this, this.httpClient, this.authManagers, this.httpCallback);
        group = new GroupController(this, this.httpClient, this.authManagers, this.httpCallback);
        metadata = new MetadataController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        database = new DatabaseController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        connection = new ConnectionController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        data = new DataController(this, this.httpClient, this.authManagers, this.httpCallback);
        report = new ReportController(this, this.httpClient, this.authManagers, this.httpCallback);
        admin = new AdminController(this, this.httpClient, this.authManagers, this.httpCallback);
        security = new SecurityController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        logs = new LogsController(this, this.httpClient, this.authManagers, this.httpCallback);
        materialization = new MaterializationController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        customActions = new CustomActionsController(this, this.httpClient, this.authManagers,
                this.httpCallback);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of SessionController.
     * @return session
     */
    public SessionController getSessionController() {
        return session;
    }

    /**
     * Get the instance of UserController.
     * @return user
     */
    public UserController getUserController() {
        return user;
    }

    /**
     * Get the instance of GroupController.
     * @return group
     */
    public GroupController getGroupController() {
        return group;
    }

    /**
     * Get the instance of MetadataController.
     * @return metadata
     */
    public MetadataController getMetadataController() {
        return metadata;
    }

    /**
     * Get the instance of DatabaseController.
     * @return database
     */
    public DatabaseController getDatabaseController() {
        return database;
    }

    /**
     * Get the instance of ConnectionController.
     * @return connection
     */
    public ConnectionController getConnectionController() {
        return connection;
    }

    /**
     * Get the instance of DataController.
     * @return data
     */
    public DataController getDataController() {
        return data;
    }

    /**
     * Get the instance of ReportController.
     * @return report
     */
    public ReportController getReportController() {
        return report;
    }

    /**
     * Get the instance of AdminController.
     * @return admin
     */
    public AdminController getAdminController() {
        return admin;
    }

    /**
     * Get the instance of SecurityController.
     * @return security
     */
    public SecurityController getSecurityController() {
        return security;
    }

    /**
     * Get the instance of LogsController.
     * @return logs
     */
    public LogsController getLogsController() {
        return logs;
    }

    /**
     * Get the instance of MaterializationController.
     * @return materialization
     */
    public MaterializationController getMaterializationController() {
        return materialization;
    }

    /**
     * Get the instance of CustomActionsController.
     * @return customActions
     */
    public CustomActionsController getCustomActionsController() {
        return customActions;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * baseUrl value.
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * response format.
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * body content type for post request.
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BearerAuth.
     * @return bearerAuthCredentials
     */
    private BearerAuthCredentials getBearerAuthCredentials() {
        return bearerAuthManager;
    }

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    public String getAccessToken() {
        return getBearerAuthCredentials().getAccessToken();
    }

    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("base-url",
                new SimpleEntry<Object, Boolean>(this.baseUrl, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }

    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "{base-url}";
            }
        }
        return "{base-url}";
    }

    /**
     * Converts this RESTAPISDKClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RESTAPISDKClient [" + "environment=" + environment + ", baseUrl=" + baseUrl
                + ", acceptLanguage=" + acceptLanguage + ", contentType=" + contentType
                + ", httpClientConfig=" + httpClientConfig + ", authManagers=" + authManagers + "]";
    }

    /**
     * Builds a new {@link RESTAPISDKClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link RESTAPISDKClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.baseUrl = getBaseUrl();
        builder.acceptLanguage = getAcceptLanguage();
        builder.contentType = getContentType();
        builder.httpClient = getHttpClient();
        builder.accessToken = getBearerAuthCredentials().getAccessToken();
        builder.authManagers = authManagers;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link RESTAPISDKClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private String baseUrl = "https://localhost:443";
        private String acceptLanguage = "application/json";
        private String contentType = "application/json";
        private HttpClient httpClient;
        private String accessToken = "";
        private Map<String, AuthManager> authManagers = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BearerAuth.
         * @param accessToken String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            if (accessToken == null) {
                throw new NullPointerException("AccessToken cannot be null.");
            }
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * baseUrl value.
         * @param baseUrl The baseUrl for client.
         * @return Builder
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * response format.
         * @param acceptLanguage The acceptLanguage for client.
         * @return Builder
         */
        public Builder acceptLanguage(String acceptLanguage) {
            if (acceptLanguage == null) {
                throw new NullPointerException("acceptLanguage cannot be null");
            }
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * body content type for post request.
         * @param contentType The contentType for client.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            if (contentType == null) {
                throw new NullPointerException("contentType cannot be null");
            }
            this.contentType = contentType;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new RESTAPISDKClient object using the set fields.
         * @return RESTAPISDKClient
         */
        public RESTAPISDKClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig);

            return new RESTAPISDKClient(environment, baseUrl, acceptLanguage, contentType,
                    httpClient, httpClientConfig, accessToken, authManagers, httpCallback);
        }
    }
}