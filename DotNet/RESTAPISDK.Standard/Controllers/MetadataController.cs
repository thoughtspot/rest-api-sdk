// <copyright file="MetadataController.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Controllers
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
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Authentication;
    using RESTAPISDK.Standard.Exceptions;
    using RESTAPISDK.Standard.Http.Client;
    using RESTAPISDK.Standard.Http.Request;
    using RESTAPISDK.Standard.Http.Response;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// MetadataController.
    /// </summary>
    public class MetadataController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal MetadataController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To get details of a specific tag, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the tag.</param>
        /// <param name="id">Optional parameter: The GUID of the tag.</param>
        /// <returns>Returns the Models.MetadataTagResponse response from the API call.</returns>
        public Models.MetadataTagResponse GetTag(
                string name = null,
                string id = null)
        {
            Task<Models.MetadataTagResponse> t = this.GetTagAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get details of a specific tag, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the tag.</param>
        /// <param name="id">Optional parameter: The GUID of the tag.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.MetadataTagResponse response from the API call.</returns>
        public async Task<Models.MetadataTagResponse> GetTagAsync(
                string name = null,
                string id = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tag");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "name", name },
                { "id", id },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.MetadataTagResponse>(response.Body);
        }

        /// <summary>
        /// To programmatically create tags, use this endpoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.MetadataTagResponse response from the API call.</returns>
        public Models.MetadataTagResponse CreateTag(
                Models.TspublicRestV2MetadataTagCreateRequest body)
        {
            Task<Models.MetadataTagResponse> t = this.CreateTagAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically create tags, use this endpoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.MetadataTagResponse response from the API call.</returns>
        public async Task<Models.MetadataTagResponse> CreateTagAsync(
                Models.TspublicRestV2MetadataTagCreateRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tag/create");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.MetadataTagResponse>(response.Body);
        }

        /// <summary>
        /// To programmatically update tags, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool UpdateTag(
                Models.TspublicRestV2MetadataTagUpdateRequest body)
        {
            Task<bool> t = this.UpdateTagAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically update tags, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> UpdateTagAsync(
                Models.TspublicRestV2MetadataTagUpdateRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tag/update");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To programmatically delete tags, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the tag.</param>
        /// <param name="id">Optional parameter: The GUID of the tag.</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool DeleteTag(
                string name = null,
                string id = null)
        {
            Task<bool> t = this.DeleteTagAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically delete tags, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the tag.</param>
        /// <param name="id">Optional parameter: The GUID of the tag.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> DeleteTagAsync(
                string name = null,
                string id = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tag/delete");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "name", name },
                { "id", id },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Delete(queryBuilder.ToString(), headers, null, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool AssignTag(
                Models.TspublicRestV2MetadataTagAssignRequest body)
        {
            Task<bool> t = this.AssignTagAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically assign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> AssignTagAsync(
                Models.TspublicRestV2MetadataTagAssignRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tag/assign");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool UnassignTag(
                Models.TspublicRestV2MetadataTagUnassignRequest body)
        {
            Task<bool> t = this.UnassignTagAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically unassign tags to a metadata object, such as a liveboard, search answer, table, worksheet, or view, use this endpoint. .
        ///  At least one of id or name of tag is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> UnassignTagAsync(
                Models.TspublicRestV2MetadataTagUnassignRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tag/unassign");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To programmatically assign objects to favorites for a given user account, use this endpoint. .
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool AssignFavorite(
                Models.TspublicRestV2MetadataFavoriteAssignRequest body)
        {
            Task<bool> t = this.AssignFavoriteAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically assign objects to favorites for a given user account, use this endpoint. .
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> AssignFavoriteAsync(
                Models.TspublicRestV2MetadataFavoriteAssignRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/favorite/assign");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To programmatically unassign objects to favorites for a given user account, use this endpoint. .
        ///  At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool UnassignFavorite(
                Models.TspublicRestV2MetadataFavoriteUnassignRequest body)
        {
            Task<bool> t = this.UnassignFavoriteAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically unassign objects to favorites for a given user account, use this endpoint. .
        ///  At least one of user id or username is required. When both are given, then id will be considered. Screen reader support enabled.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> UnassignFavoriteAsync(
                Models.TspublicRestV2MetadataFavoriteUnassignRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/favorite/unassign");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. .
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="userName">Optional parameter: Example: .</param>
        /// <param name="userId">Optional parameter: The GUID of the user.</param>
        /// <returns>Returns the Models.HomeLiveboardResponse response from the API call.</returns>
        public Models.HomeLiveboardResponse GetHomeLiveboard(
                string userName = null,
                string userId = null)
        {
            Task<Models.HomeLiveboardResponse> t = this.GetHomeLiveboardAsync(userName, userId);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. .
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="userName">Optional parameter: Example: .</param>
        /// <param name="userId">Optional parameter: The GUID of the user.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.HomeLiveboardResponse response from the API call.</returns>
        public async Task<Models.HomeLiveboardResponse> GetHomeLiveboardAsync(
                string userName = null,
                string userId = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/homeliveboard");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "userName", userName },
                { "userId", userId },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<Models.HomeLiveboardResponse>(response.Body);
        }

        /// <summary>
        /// To assign a specific liveboard as a home liveboard for a user, use this endpoint.
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool AssignHomeLiveboard(
                Models.TspublicRestV2MetadataHomeliveboardAssignRequest body)
        {
            Task<bool> t = this.AssignHomeLiveboardAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To assign a specific liveboard as a home liveboard for a user, use this endpoint.
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> AssignHomeLiveboardAsync(
                Models.TspublicRestV2MetadataHomeliveboardAssignRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/homeliveboard/assign");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To unassign the home liveboard set for a user, use this endpoint.
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool UnassignHomeLiveboard(
                Models.TspublicRestV2MetadataHomeliveboardUnassignRequest body)
        {
            Task<bool> t = this.UnassignHomeLiveboardAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To unassign the home liveboard set for a user, use this endpoint.
        ///  At least one of user id or username is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> UnassignHomeLiveboardAsync(
                Models.TspublicRestV2MetadataHomeliveboardUnassignRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/homeliveboard/unassign");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PutBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To get a list of objects with incomplete metadata, use this endpoint.
        /// </summary>
        /// <returns>Returns the object response from the API call.</returns>
        public object GetIncompleteObjects()
        {
            Task<object> t = this.GetIncompleteObjectsAsync();
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get a list of objects with incomplete metadata, use this endpoint.
        /// </summary>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> GetIncompleteObjectsAsync(CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/incomplete");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.
        /// </summary>
        /// <param name="type">Required parameter: Type of the metadata object being searched..</param>
        /// <param name="id">Required parameter: GUID of the metadata object.</param>
        /// <param name="outputFields">Optional parameter: Array of header field names that need to be included in the header response.</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object GetObjectHeader(
                Models.Type8Enum type,
                string id,
                List<string> outputFields = null)
        {
            Task<object> t = this.GetObjectHeaderAsync(type, id, outputFields);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get header detail of a metadata object, use this endpoint. You can provide as input selective fields to get the data for.
        /// </summary>
        /// <param name="type">Required parameter: Type of the metadata object being searched..</param>
        /// <param name="id">Required parameter: GUID of the metadata object.</param>
        /// <param name="outputFields">Optional parameter: Array of header field names that need to be included in the header response.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> GetObjectHeaderAsync(
                Models.Type8Enum type,
                string id,
                List<string> outputFields = null,
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
            queryBuilder.Append("/tspublic/rest/v2/metadata/header");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "type", ApiHelper.JsonSerialize(type).Trim('\"') },
                { "id", id },
                { "outputFields", outputFields },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// Use this endpoint to get full details of metadata objects.
        /// </summary>
        /// <param name="type">Required parameter: Type of the metadata object being searched. Valid values.</param>
        /// <param name="id">Required parameter: A JSON array of GUIDs of the objects..</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object GetObjectDetail(
                Models.Type9Enum type,
                List<string> id)
        {
            Task<object> t = this.GetObjectDetailAsync(type, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Use this endpoint to get full details of metadata objects.
        /// </summary>
        /// <param name="type">Required parameter: Type of the metadata object being searched. Valid values.</param>
        /// <param name="id">Required parameter: A JSON array of GUIDs of the objects..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> GetObjectDetailAsync(
                Models.Type9Enum type,
                List<string> id,
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
            queryBuilder.Append("/tspublic/rest/v2/metadata/detail");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "type", ApiHelper.JsonSerialize(type).Trim('\"') },
                { "id", id },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// Use this endpoint to get header details of visualization charts for a given liveboard or answer. .
        ///  At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="id">Required parameter: The GUID of the liveboard or answer.</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object GetObjectVisualizationHeader(
                string id)
        {
            Task<object> t = this.GetObjectVisualizationHeaderAsync(id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Use this endpoint to get header details of visualization charts for a given liveboard or answer. .
        ///  At least one of id or name of liveboard or answer is required. When both are given, then id will be considered.
        /// </summary>
        /// <param name="id">Required parameter: The GUID of the liveboard or answer.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> GetObjectVisualizationHeaderAsync(
                string id,
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
            queryBuilder.Append("/tspublic/rest/v2/metadata/vizheader");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "id", id },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Get(queryBuilder.ToString(), headers, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return ApiHelper.JsonDeserialize<object>(response.Body);
        }

        /// <summary>
        /// To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object SearchObjectHeader(
                Models.TspublicRestV2MetadataHeaderSearchRequest body)
        {
            Task<object> t = this.SearchObjectHeaderAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get header details for metadata objects, use this endpoint. You can provide as input selective fields to get the data for.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> SearchObjectHeaderAsync(
                Models.TspublicRestV2MetadataHeaderSearchRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/header/search");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// Use this endpoint to get full details of metadata objects.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object SearchObjectDetail(
                Models.TspublicRestV2MetadataDetailSearchRequest body)
        {
            Task<object> t = this.SearchObjectDetailAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Use this endpoint to get full details of metadata objects.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> SearchObjectDetailAsync(
                Models.TspublicRestV2MetadataDetailSearchRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/detail/search");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// Use this endpoint to delete the metadata objects.
        /// </summary>
        /// <param name="type">Required parameter: Type of the metadata object being searched..</param>
        /// <param name="id">Required parameter: A JSON array of GUIDs of the objects..</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool DeleteObject(
                Models.Type9Enum type,
                List<string> id)
        {
            Task<bool> t = this.DeleteObjectAsync(type, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Use this endpoint to delete the metadata objects.
        /// </summary>
        /// <param name="type">Required parameter: Type of the metadata object being searched..</param>
        /// <param name="id">Required parameter: A JSON array of GUIDs of the objects..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> DeleteObjectAsync(
                Models.Type9Enum type,
                List<string> id,
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
            queryBuilder.Append("/tspublic/rest/v2/metadata/delete");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "type", ApiHelper.JsonSerialize(type).Trim('\"') },
                { "id", id },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
                { "Content-Type", this.Config.ContentType },
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Delete(queryBuilder.ToString(), headers, null, queryParameters: queryParams);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To query the details of dependent objects and associate objects as dependents, you can use this API.
        ///  Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. .
        ///  Example: .
        ///  Consider a worksheet W1 that has a derived logical column C1 that has a reference to a base logical column C2. This can be shown diagramatically as: W1-->C1-->C2. .
        ///  W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1s column C1 and C2. .
        /// Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object GetObjectDependency(
                Models.TspublicRestV2MetadataDependencyRequest body)
        {
            Task<object> t = this.GetObjectDependencyAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To query the details of dependent objects and associate objects as dependents, you can use this API.
        ///  Dependency is defined as relation between referenced and referencing objects. A referencing object is said to have a dependency on a referenced object, if the referenced object cannot be deleted without first deleting the referencing object. .
        ///  Example: .
        ///  Consider a worksheet W1 that has a derived logical column C1 that has a reference to a base logical column C2. This can be shown diagramatically as: W1-->C1-->C2. .
        ///  W1 has a dependency on C2 i.e. W1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting W1 because deletion of C2 will be prevented by the relationship between W1s column C1 and C2. .
        /// Similarly C1 is said to have a dependency on C2 i.e. C1 is a referencing object and C2 is a referenced object. It is not possible to delete C2 without first deleting C1.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> GetObjectDependencyAsync(
                Models.TspublicRestV2MetadataDependencyRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/dependency");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object ExportObjectTML(
                Models.TspublicRestV2MetadataTmlExportRequest body)
        {
            Task<object> t = this.ExportObjectTMLAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To export ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> ExportObjectTMLAsync(
                Models.TspublicRestV2MetadataTmlExportRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tml/export");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }

        /// <summary>
        /// To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object ImportObjectTML(
                Models.TspublicRestV2MetadataTmlImportRequest body)
        {
            Task<object> t = this.ImportObjectTMLAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To import ThoughtSpot objects represented in ThoughtSpot Modeling Language (TML), use this endpoint.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> ImportObjectTMLAsync(
                Models.TspublicRestV2MetadataTmlImportRequest body,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (body == null)
            {
                throw new ArgumentNullException("body", "The parameter \"body\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/metadata/tml/import");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
                { "X-Requested-By", this.Config.XRequestedBy },
                { "Accept-Language", this.Config.AcceptLanguage },
            };

            // append body params.
            var bodyText = ApiHelper.JsonSerialize(body);

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().PostBody(queryBuilder.ToString(), headers, bodyText);

            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnBeforeHttpRequestEventHandler(this.GetClientInstance(), httpRequest);
            }

            httpRequest = await this.AuthManagers["global"].ApplyAsync(httpRequest).ConfigureAwait(false);

            // invoke request and get response.
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken).ConfigureAwait(false);
            HttpContext context = new HttpContext(httpRequest, response);
            if (this.HttpCallBack != null)
            {
                this.HttpCallBack.OnAfterHttpResponseEventHandler(this.GetClientInstance(), response);
            }

            if (response.StatusCode == 500)
            {
                throw new ErrorResponseException("Operation failed or unauthorized request", context);
            }

            // handle errors defined at the API level.
            this.ValidateResponse(response, context);

            return response.Body;
        }
    }
}