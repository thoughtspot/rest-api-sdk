// <copyright file="LogsController.cs" company="APIMatic">
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
    /// LogsController.
    /// </summary>
    public class LogsController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LogsController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal LogsController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// Note: This endpoint is applicable only for SAAS deployments. .
        /// The ThoughtSpot log streaming service API allows you to programmatically get a security audit event log from the ThoughtSpot system. .
        /// To use this API, make sure you have admin user privileges. .
        /// ThoughtSpot cloud deployments allow you to collect security audit events and send them to your Security information and event management (SIEM) application in real-time. .
        /// These events can help your security operations personnel to detect potential security threats or compromised user accounts in your organization.
        /// </summary>
        /// <param name="topic">Required parameter: Type of the log.</param>
        /// <param name="fromEpoch">Optional parameter: The EPOCH time in milliseconds to set the start time for streaming logs.   Example: To set the timestamp as June 1, 2021 8 am, specify 1622534400000..</param>
        /// <param name="toEpoch">Optional parameter: The EPOCH time in milliseconds to set the end time for streaming logs.   Example: To set the timestamp as July 1, 2021, 8 am, specify 1625126400000..</param>
        /// <returns>Returns the Models.LogsResponse response from the API call.</returns>
        public Models.LogsResponse RestapiV2GetLogEvents(
                Models.TopicEnum topic,
                string fromEpoch = null,
                string toEpoch = null)
        {
            Task<Models.LogsResponse> t = this.RestapiV2GetLogEventsAsync(topic, fromEpoch, toEpoch);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for SAAS deployments. .
        /// The ThoughtSpot log streaming service API allows you to programmatically get a security audit event log from the ThoughtSpot system. .
        /// To use this API, make sure you have admin user privileges. .
        /// ThoughtSpot cloud deployments allow you to collect security audit events and send them to your Security information and event management (SIEM) application in real-time. .
        /// These events can help your security operations personnel to detect potential security threats or compromised user accounts in your organization.
        /// </summary>
        /// <param name="topic">Required parameter: Type of the log.</param>
        /// <param name="fromEpoch">Optional parameter: The EPOCH time in milliseconds to set the start time for streaming logs.   Example: To set the timestamp as June 1, 2021 8 am, specify 1622534400000..</param>
        /// <param name="toEpoch">Optional parameter: The EPOCH time in milliseconds to set the end time for streaming logs.   Example: To set the timestamp as July 1, 2021, 8 am, specify 1625126400000..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.LogsResponse response from the API call.</returns>
        public async Task<Models.LogsResponse> RestapiV2GetLogEventsAsync(
                Models.TopicEnum topic,
                string fromEpoch = null,
                string toEpoch = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/logs/events");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "topic", ApiHelper.JsonSerialize(topic).Trim('\"') },
                { "fromEpoch", fromEpoch },
                { "toEpoch", toEpoch },
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

            return ApiHelper.JsonDeserialize<Models.LogsResponse>(response.Body);
        }
    }
}