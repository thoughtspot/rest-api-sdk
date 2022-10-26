// <copyright file="ReportController.cs" company="APIMatic">
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
    /// ReportController.
    /// </summary>
    public class ReportController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal ReportController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To programmatically download Answer data as a file, use this endpoint. .
        /// The PDF will download data in the tabular format even if Answer is saved as chart.
        /// </summary>
        /// <param name="id">Required parameter: GUID of the Answer to download..</param>
        /// <param name="type">Required parameter: Type of file to be generated..</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object RestapiV2AnswerReport(
                string id,
                Models.Type16Enum type)
        {
            Task<object> t = this.RestapiV2AnswerReportAsync(id, type);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically download Answer data as a file, use this endpoint. .
        /// The PDF will download data in the tabular format even if Answer is saved as chart.
        /// </summary>
        /// <param name="id">Required parameter: GUID of the Answer to download..</param>
        /// <param name="type">Required parameter: Type of file to be generated..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> RestapiV2AnswerReportAsync(
                string id,
                Models.Type16Enum type,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (id == null)
            {
                throw new ArgumentNullException("id", "The parameter \"id\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/report/answer");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "id", id },
                { "type", ApiHelper.JsonSerialize(type).Trim('\"') },
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

            return response.Body;
        }

        /// <summary>
        /// To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint.
        /// </summary>
        /// <param name="type">Required parameter: Type of file to be generated. Valid values: CSV/XLSX/PDF/PNG..</param>
        /// <param name="id">Optional parameter: GUID of the Liveboard to download.   This field is considered only when no input is provided for transientContent field..</param>
        /// <param name="vizId">Optional parameter: JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.   For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.   Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered..</param>
        /// <param name="transientContent">Optional parameter: If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard..</param>
        /// <param name="runtimeFilter">Optional parameter: If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard ..</param>
        /// <param name="runtimeSort">Optional parameter: JSON object which provides columns to sort the data at the time of data retrieval.   Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}   For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters.</param>
        /// <param name="pdfOptions">Optional parameter: Additional options that are applicable for PDF type..</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object RestapiV2LiveboardReport(
                Models.Type16Enum type,
                string id = null,
                List<string> vizId = null,
                string transientContent = null,
                string runtimeFilter = null,
                string runtimeSort = null,
                Models.PdfOptionsInput pdfOptions = null)
        {
            Task<object> t = this.RestapiV2LiveboardReportAsync(type, id, vizId, transientContent, runtimeFilter, runtimeSort, pdfOptions);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically download Liveboard data or specific Visualization data from Liveboard as a file, use this endpoint.
        /// </summary>
        /// <param name="type">Required parameter: Type of file to be generated. Valid values: CSV/XLSX/PDF/PNG..</param>
        /// <param name="id">Optional parameter: GUID of the Liveboard to download.   This field is considered only when no input is provided for transientContent field..</param>
        /// <param name="vizId">Optional parameter: JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.   For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.   Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered..</param>
        /// <param name="transientContent">Optional parameter: If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard..</param>
        /// <param name="runtimeFilter">Optional parameter: If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard ..</param>
        /// <param name="runtimeSort">Optional parameter: JSON object which provides columns to sort the data at the time of data retrieval.   Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}   For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters.</param>
        /// <param name="pdfOptions">Optional parameter: Additional options that are applicable for PDF type..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> RestapiV2LiveboardReportAsync(
                Models.Type16Enum type,
                string id = null,
                List<string> vizId = null,
                string transientContent = null,
                string runtimeFilter = null,
                string runtimeSort = null,
                Models.PdfOptionsInput pdfOptions = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/report/liveboard");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "type", ApiHelper.JsonSerialize(type).Trim('\"') },
                { "id", id },
                { "vizId", vizId },
                { "transientContent", transientContent },
                { "runtimeFilter", runtimeFilter },
                { "runtimeSort", runtimeSort },
                { "pdfOptions", pdfOptions },
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

            return response.Body;
        }
    }
}