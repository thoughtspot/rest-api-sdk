// <copyright file="RESTAPISDKClient.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Net;
    using System.Text;
    using RESTAPISDK.Standard.Authentication;
    using RESTAPISDK.Standard.Controllers;
    using RESTAPISDK.Standard.Http.Client;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// The gateway for the SDK. This class acts as a factory for Controller and
    /// holds the configuration of the SDK.
    /// </summary>
    public sealed class RESTAPISDKClient : IConfiguration
    {
        // A map of environments and their corresponding servers/baseurls
        private static readonly Dictionary<Environment, Dictionary<Server, string>> EnvironmentsMap =
            new Dictionary<Environment, Dictionary<Server, string>>
        {
            {
                Environment.Production, new Dictionary<Server, string>
                {
                    { Server.Default, "{base-url}" },
                }
            },
        };

        private readonly IDictionary<string, IAuthManager> authManagers;
        private readonly IHttpClient httpClient;
        private readonly HttpCallBack httpCallBack;
        private readonly BearerAuthManager bearerAuthManager;

        private readonly Lazy<SessionController> session;
        private readonly Lazy<UserController> user;
        private readonly Lazy<GroupController> mGroup;
        private readonly Lazy<MetadataController> metadata;
        private readonly Lazy<DatabaseController> database;
        private readonly Lazy<ConnectionController> connection;
        private readonly Lazy<DataController> data;
        private readonly Lazy<AdminController> admin;

        private RESTAPISDKClient(
            string contentType,
            string acceptLanguage,
            Environment environment,
            string baseUrl,
            string accessToken,
            IDictionary<string, IAuthManager> authManagers,
            IHttpClient httpClient,
            HttpCallBack httpCallBack,
            IHttpClientConfiguration httpClientConfiguration)
        {
            this.ContentType = contentType;
            this.AcceptLanguage = acceptLanguage;
            this.Environment = environment;
            this.BaseUrl = baseUrl;
            this.httpCallBack = httpCallBack;
            this.httpClient = httpClient;
            this.authManagers = (authManagers == null) ? new Dictionary<string, IAuthManager>() : new Dictionary<string, IAuthManager>(authManagers);
            this.HttpClientConfiguration = httpClientConfiguration;

            this.session = new Lazy<SessionController>(
                () => new SessionController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.user = new Lazy<UserController>(
                () => new UserController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.mGroup = new Lazy<GroupController>(
                () => new GroupController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.metadata = new Lazy<MetadataController>(
                () => new MetadataController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.database = new Lazy<DatabaseController>(
                () => new DatabaseController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.connection = new Lazy<ConnectionController>(
                () => new ConnectionController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.data = new Lazy<DataController>(
                () => new DataController(this, this.httpClient, this.authManagers, this.httpCallBack));
            this.admin = new Lazy<AdminController>(
                () => new AdminController(this, this.httpClient, this.authManagers, this.httpCallBack));

            if (this.authManagers.ContainsKey("global"))
            {
                this.bearerAuthManager = (BearerAuthManager)this.authManagers["global"];
            }

            if (!this.authManagers.ContainsKey("global")
                || !this.BearerAuthCredentials.Equals(accessToken))
            {
                this.bearerAuthManager = new BearerAuthManager(accessToken);
                this.authManagers["global"] = this.bearerAuthManager;
            }
        }

        /// <summary>
        /// Gets SessionController controller.
        /// </summary>
        public SessionController SessionController => this.session.Value;

        /// <summary>
        /// Gets UserController controller.
        /// </summary>
        public UserController UserController => this.user.Value;

        /// <summary>
        /// Gets GroupController controller.
        /// </summary>
        public GroupController GroupController => this.mGroup.Value;

        /// <summary>
        /// Gets MetadataController controller.
        /// </summary>
        public MetadataController MetadataController => this.metadata.Value;

        /// <summary>
        /// Gets DatabaseController controller.
        /// </summary>
        public DatabaseController DatabaseController => this.database.Value;

        /// <summary>
        /// Gets ConnectionController controller.
        /// </summary>
        public ConnectionController ConnectionController => this.connection.Value;

        /// <summary>
        /// Gets DataController controller.
        /// </summary>
        public DataController DataController => this.data.Value;

        /// <summary>
        /// Gets AdminController controller.
        /// </summary>
        public AdminController AdminController => this.admin.Value;

        /// <summary>
        /// Gets the configuration of the Http Client associated with this client.
        /// </summary>
        public IHttpClientConfiguration HttpClientConfiguration { get; }

        /// <summary>
        /// Gets ContentType.
        /// body content type for post request.
        /// </summary>
        public string ContentType { get; }

        /// <summary>
        /// Gets AcceptLanguage.
        /// response format.
        /// </summary>
        public string AcceptLanguage { get; }

        /// <summary>
        /// Gets Environment.
        /// Current API environment.
        /// </summary>
        public Environment Environment { get; }

        /// <summary>
        /// Gets BaseUrl.
        /// BaseUrl value.
        /// </summary>
        public string BaseUrl { get; }

        /// <summary>
        /// Gets auth managers.
        /// </summary>
        internal IDictionary<string, IAuthManager> AuthManagers => this.authManagers;

        /// <summary>
        /// Gets http client.
        /// </summary>
        internal IHttpClient HttpClient => this.httpClient;

        /// <summary>
        /// Gets http callback.
        /// </summary>
        internal HttpCallBack HttpCallBack => this.httpCallBack;

        /// <summary>
        /// Gets the credentials to use with BearerAuth.
        /// </summary>
        private IBearerAuthCredentials BearerAuthCredentials => this.bearerAuthManager;

        /// <summary>
        /// Gets the access token to use with OAuth 2 authentication.
        /// </summary>
        public string AccessToken => this.BearerAuthCredentials.AccessToken;

        /// <summary>
        /// Gets the URL for a particular alias in the current environment and appends
        /// it with template parameters.
        /// </summary>
        /// <param name="alias">Default value:DEFAULT.</param>
        /// <returns>Returns the baseurl.</returns>
        public string GetBaseUri(Server alias = Server.Default)
        {
            StringBuilder url = new StringBuilder(EnvironmentsMap[this.Environment][alias]);
            ApiHelper.AppendUrlWithTemplateParameters(url, this.GetBaseUriParameters());

            return url.ToString();
        }

        /// <summary>
        /// Creates an object of the RESTAPISDKClient using the values provided for the builder.
        /// </summary>
        /// <returns>Builder.</returns>
        public Builder ToBuilder()
        {
            Builder builder = new Builder()
                .ContentType(this.ContentType)
                .AcceptLanguage(this.AcceptLanguage)
                .Environment(this.Environment)
                .BaseUrl(this.BaseUrl)
                .AccessToken(this.BearerAuthCredentials.AccessToken)
                .HttpCallBack(this.httpCallBack)
                .HttpClient(this.httpClient)
                .AuthManagers(this.authManagers)
                .HttpClientConfig(config => config.Build());

            return builder;
        }

        /// <inheritdoc/>
        public override string ToString()
        {
            return
                $"ContentType = {this.ContentType}, " +
                $"AcceptLanguage = {this.AcceptLanguage}, " +
                $"Environment = {this.Environment}, " +
                $"BaseUrl = {this.BaseUrl}, " +
                $"HttpClientConfiguration = {this.HttpClientConfiguration}, ";
        }

        /// <summary>
        /// Creates the client using builder.
        /// </summary>
        /// <returns> RESTAPISDKClient.</returns>
        internal static RESTAPISDKClient CreateFromEnvironment()
        {
            var builder = new Builder();

            string contentType = System.Environment.GetEnvironmentVariable("RESTAPISDK_STANDARD_CONTENT_TYPE");
            string acceptLanguage = System.Environment.GetEnvironmentVariable("RESTAPISDK_STANDARD_ACCEPT_LANGUAGE");
            string environment = System.Environment.GetEnvironmentVariable("RESTAPISDK_STANDARD_ENVIRONMENT");
            string baseUrl = System.Environment.GetEnvironmentVariable("RESTAPISDK_STANDARD_BASE_URL");
            string accessToken = System.Environment.GetEnvironmentVariable("RESTAPISDK_STANDARD_ACCESS_TOKEN");

            if (contentType != null)
            {
                builder.ContentType(contentType);
            }

            if (acceptLanguage != null)
            {
                builder.AcceptLanguage(acceptLanguage);
            }

            if (environment != null)
            {
                builder.Environment(ApiHelper.JsonDeserialize<Environment>($"\"{environment}\""));
            }

            if (baseUrl != null)
            {
                builder.BaseUrl(baseUrl);
            }

            if (accessToken != null)
            {
                builder.AccessToken(accessToken);
            }

            return builder.Build();
        }

        /// <summary>
        /// Makes a list of the BaseURL parameters.
        /// </summary>
        /// <returns>Returns the parameters list.</returns>
        private List<KeyValuePair<string, object>> GetBaseUriParameters()
        {
            List<KeyValuePair<string, object>> kvpList = new List<KeyValuePair<string, object>>()
            {
                new KeyValuePair<string, object>("base-url", this.BaseUrl),
            };
            return kvpList;
        }

        /// <summary>
        /// Builder class.
        /// </summary>
        public class Builder
        {
            private string contentType = "application/json";
            private string acceptLanguage = "application/json";
            private Environment environment = RESTAPISDK.Standard.Environment.Production;
            private string baseUrl = "https://localhost:443";
            private string accessToken = "";
            private IDictionary<string, IAuthManager> authManagers = new Dictionary<string, IAuthManager>();
            private HttpClientConfiguration.Builder httpClientConfig = new HttpClientConfiguration.Builder();
            private IHttpClient httpClient;
            private HttpCallBack httpCallBack;

            /// <summary>
            /// Sets credentials for BearerAuth.
            /// </summary>
            /// <param name="accessToken">AccessToken.</param>
            /// <returns>Builder.</returns>
            public Builder AccessToken(string accessToken)
            {
                this.accessToken = accessToken ?? throw new ArgumentNullException(nameof(accessToken));
                return this;
            }

            /// <summary>
            /// Sets ContentType.
            /// </summary>
            /// <param name="contentType"> ContentType. </param>
            /// <returns> Builder. </returns>
            public Builder ContentType(string contentType)
            {
                this.contentType = contentType ?? throw new ArgumentNullException(nameof(contentType));
                return this;
            }

            /// <summary>
            /// Sets AcceptLanguage.
            /// </summary>
            /// <param name="acceptLanguage"> AcceptLanguage. </param>
            /// <returns> Builder. </returns>
            public Builder AcceptLanguage(string acceptLanguage)
            {
                this.acceptLanguage = acceptLanguage ?? throw new ArgumentNullException(nameof(acceptLanguage));
                return this;
            }

            /// <summary>
            /// Sets Environment.
            /// </summary>
            /// <param name="environment"> Environment. </param>
            /// <returns> Builder. </returns>
            public Builder Environment(Environment environment)
            {
                this.environment = environment;
                return this;
            }

            /// <summary>
            /// Sets BaseUrl.
            /// </summary>
            /// <param name="baseUrl"> BaseUrl. </param>
            /// <returns> Builder. </returns>
            public Builder BaseUrl(string baseUrl)
            {
                this.baseUrl = baseUrl ?? throw new ArgumentNullException(nameof(baseUrl));
                return this;
            }

            /// <summary>
            /// Sets HttpClientConfig.
            /// </summary>
            /// <param name="action"> Action. </param>
            /// <returns>Builder.</returns>
            public Builder HttpClientConfig(Action<HttpClientConfiguration.Builder> action)
            {
                if (action is null)
                {
                    throw new ArgumentNullException(nameof(action));
                }

                action(this.httpClientConfig);
                return this;
            }

            /// <summary>
            /// Sets the IHttpClient for the Builder.
            /// </summary>
            /// <param name="httpClient"> http client. </param>
            /// <returns>Builder.</returns>
            internal Builder HttpClient(IHttpClient httpClient)
            {
                this.httpClient = httpClient ?? throw new ArgumentNullException(nameof(httpClient));
                return this;
            }

            /// <summary>
            /// Sets the authentication managers for the Builder.
            /// </summary>
            /// <param name="authManagers"> auth managers. </param>
            /// <returns>Builder.</returns>
            internal Builder AuthManagers(IDictionary<string, IAuthManager> authManagers)
            {
                this.authManagers = authManagers ?? throw new ArgumentNullException(nameof(authManagers));
                return this;
            }

            /// <summary>
            /// Sets the HttpCallBack for the Builder.
            /// </summary>
            /// <param name="httpCallBack"> http callback. </param>
            /// <returns>Builder.</returns>
            internal Builder HttpCallBack(HttpCallBack httpCallBack)
            {
                this.httpCallBack = httpCallBack;
                return this;
            }

            /// <summary>
            /// Creates an object of the RESTAPISDKClient using the values provided for the builder.
            /// </summary>
            /// <returns>RESTAPISDKClient.</returns>
            public RESTAPISDKClient Build()
            {
                this.httpClient = new HttpClientWrapper(this.httpClientConfig.Build());

                return new RESTAPISDKClient(
                    this.contentType,
                    this.acceptLanguage,
                    this.environment,
                    this.baseUrl,
                    this.accessToken,
                    this.authManagers,
                    this.httpClient,
                    this.httpCallBack,
                    this.httpClientConfig.Build());
            }
        }
    }
}
