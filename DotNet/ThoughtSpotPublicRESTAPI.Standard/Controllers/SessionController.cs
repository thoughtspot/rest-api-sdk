// <copyright file="SessionController.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Controllers
{
    using System;
    using System.Collections.Generic;
    using System.Dynamic;
    using System.Globalization;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Converters;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Authentication;
    using ThoughtSpotPublicRESTAPI.Standard.Exceptions;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Client;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Request;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Request.Configuration;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Response;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// SessionController.
    /// </summary>
    public class SessionController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal SessionController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// You can programmatically create login session for a user in ThoughtSpot using this endpoint. .
        /// You can create session by either providing userName and password as inputs in this request body or by including "Authorization" header with the token generated through the endpoint /tspublic/rest/v2/session/gettoken. .
        /// userName and password input is given precedence over "Authorization" header, when both are included in the request.
        /// </summary>
        /// <param name="userName">Optional parameter: Username of the user account.</param>
        /// <param name="password">Optional parameter: The password of the user account.</param>
        /// <param name="rememberMe">Optional parameter: A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls..</param>
        /// <returns>Returns the Models.SessionLoginResponse response from the API call.</returns>
        public Models.SessionLoginResponse RestapiV2Login(
                string userName = null,
                string password = null,
                bool? rememberMe = null)
        {
            Task<Models.SessionLoginResponse> t = this.RestapiV2LoginAsync(userName, password, rememberMe);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// You can programmatically create login session for a user in ThoughtSpot using this endpoint. .
        /// You can create session by either providing userName and password as inputs in this request body or by including "Authorization" header with the token generated through the endpoint /tspublic/rest/v2/session/gettoken. .
        /// userName and password input is given precedence over "Authorization" header, when both are included in the request.
        /// </summary>
        /// <param name="userName">Optional parameter: Username of the user account.</param>
        /// <param name="password">Optional parameter: The password of the user account.</param>
        /// <param name="rememberMe">Optional parameter: A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.SessionLoginResponse response from the API call.</returns>
        public async Task<Models.SessionLoginResponse> RestapiV2LoginAsync(
                string userName = null,
                string password = null,
                bool? rememberMe = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/session/login");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "userName", userName },
                { "password", password },
                { "rememberMe", rememberMe },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.SessionLoginResponse>(response.Body);
        }

        /// <summary>
        ///  To programmatically create session token for a user in ThoughtSpot, use this endpoint. .
        /// You can generate the token for a user by providing password or secret key from the cluster. .
        /// You need to enable trusted authentication to generate secret key. To generate secret key, follow below steps. .
        ///  1. Click the Develop tab. .
        ///  2. Under Customizations, click Settings. .
        ///  3. To enable trusted authentication, turn on the toggle. .
        ///  4. A secret_key for trusted authentication is generated. .
        ///  5. Click the clipboard icon to copy the token. .
        ///  .
        /// Password is given precedence over secretKey input, when both are included in the request.
        /// </summary>
        /// <param name="userName">Required parameter: Username of the user account.</param>
        /// <param name="password">Optional parameter: The password of the user account.</param>
        /// <param name="secretKey">Optional parameter: The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication..</param>
        /// <param name="accessLevel">Optional parameter: User access privilege.   FULL - Creates a session with full access.   REPORT_BOOK_VIEW - Allow view access to the specified visualizations..</param>
        /// <param name="tsObjectId">Optional parameter: GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object..</param>
        /// <param name="tokenExpiryDuration">Optional parameter: Duration in seconds after which the token expires.</param>
        /// <param name="orgId">Optional parameter: Id of the organization to be associated with the user login. If no input is provided then last logged in organization will be considered.</param>
        /// <returns>Returns the Models.SessionLoginResponse response from the API call.</returns>
        public Models.SessionLoginResponse RestapiV2GetToken(
                string userName,
                string password = null,
                string secretKey = null,
                Models.AccessLevelEnum? accessLevel = null,
                string tsObjectId = null,
                string tokenExpiryDuration = null,
                string orgId = null)
        {
            Task<Models.SessionLoginResponse> t = this.RestapiV2GetTokenAsync(userName, password, secretKey, accessLevel, tsObjectId, tokenExpiryDuration, orgId);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        ///  To programmatically create session token for a user in ThoughtSpot, use this endpoint. .
        /// You can generate the token for a user by providing password or secret key from the cluster. .
        /// You need to enable trusted authentication to generate secret key. To generate secret key, follow below steps. .
        ///  1. Click the Develop tab. .
        ///  2. Under Customizations, click Settings. .
        ///  3. To enable trusted authentication, turn on the toggle. .
        ///  4. A secret_key for trusted authentication is generated. .
        ///  5. Click the clipboard icon to copy the token. .
        ///  .
        /// Password is given precedence over secretKey input, when both are included in the request.
        /// </summary>
        /// <param name="userName">Required parameter: Username of the user account.</param>
        /// <param name="password">Optional parameter: The password of the user account.</param>
        /// <param name="secretKey">Optional parameter: The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication..</param>
        /// <param name="accessLevel">Optional parameter: User access privilege.   FULL - Creates a session with full access.   REPORT_BOOK_VIEW - Allow view access to the specified visualizations..</param>
        /// <param name="tsObjectId">Optional parameter: GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object..</param>
        /// <param name="tokenExpiryDuration">Optional parameter: Duration in seconds after which the token expires.</param>
        /// <param name="orgId">Optional parameter: Id of the organization to be associated with the user login. If no input is provided then last logged in organization will be considered.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.SessionLoginResponse response from the API call.</returns>
        public async Task<Models.SessionLoginResponse> RestapiV2GetTokenAsync(
                string userName,
                string password = null,
                string secretKey = null,
                Models.AccessLevelEnum? accessLevel = null,
                string tsObjectId = null,
                string tokenExpiryDuration = null,
                string orgId = null,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (userName == null)
            {
                throw new ArgumentNullException("userName", "The parameter \"userName\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/session/gettoken");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "userName", userName },
                { "password", password },
                { "secretKey", secretKey },
                { "accessLevel", (accessLevel.HasValue) ? ApiHelper.JsonSerialize(accessLevel.Value).Trim('\"') : null },
                { "tsObjectId", tsObjectId },
                { "tokenExpiryDuration", tokenExpiryDuration },
                { "orgId", orgId },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.SessionLoginResponse>(response.Body);
        }
    }
}