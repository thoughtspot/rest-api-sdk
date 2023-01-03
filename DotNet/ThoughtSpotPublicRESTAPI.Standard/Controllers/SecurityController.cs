// <copyright file="SecurityController.cs" company="APIMatic">
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
    /// SecurityController.
    /// </summary>
    public class SecurityController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal SecurityController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission. .
        /// You can optionally see the permission on the dependent objects as well by enabling includeDependent field.
        /// </summary>
        /// <param name="id">Required parameter: GUID of the metadata object for which the permission needs to be obtained..</param>
        /// <param name="type">Required parameter: Type of metadata object. Valid values: Liveboard|Answer|DataObject|Column.</param>
        /// <param name="includeDependent">Optional parameter: When this field is set to true, the API returns the permission details for the dependent objects for the the object included in the request.</param>
        /// <returns>Returns the Models.SecurityPermissionResponse response from the API call.</returns>
        public Models.SecurityPermissionResponse RestapiV2GetPermissionOnObject(
                string id,
                Models.Type7Enum type,
                bool? includeDependent = null)
        {
            Task<Models.SecurityPermissionResponse> t = this.RestapiV2GetPermissionOnObjectAsync(id, type, includeDependent);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To list the permissions for user and user groups on an object, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission. .
        /// You can optionally see the permission on the dependent objects as well by enabling includeDependent field.
        /// </summary>
        /// <param name="id">Required parameter: GUID of the metadata object for which the permission needs to be obtained..</param>
        /// <param name="type">Required parameter: Type of metadata object. Valid values: Liveboard|Answer|DataObject|Column.</param>
        /// <param name="includeDependent">Optional parameter: When this field is set to true, the API returns the permission details for the dependent objects for the the object included in the request.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.SecurityPermissionResponse response from the API call.</returns>
        public async Task<Models.SecurityPermissionResponse> RestapiV2GetPermissionOnObjectAsync(
                string id,
                Models.Type7Enum type,
                bool? includeDependent = null,
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
            queryBuilder.Append("/tspublic/rest/v2/security/permission/tsobject");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "id", id },
                { "type", ApiHelper.JsonSerialize(type).Trim('\"') },
                { "includeDependent", includeDependent },
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

            return ApiHelper.JsonDeserialize<Models.SecurityPermissionResponse>(response.Body);
        }

        /// <summary>
        /// Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission. .
        /// Requires administration privilege.
        /// </summary>
        /// <param name="id">Optional parameter: GUID of the user or user group for which the object permission needs to be obtained.</param>
        /// <param name="name">Optional parameter: Name of the ser or user group for which the object permission needs to be obtained.</param>
        /// <returns>Returns the Models.PrincipalSearchResponse response from the API call.</returns>
        public Models.PrincipalSearchResponse RestapiV2GetPermissionForPrincipal(
                string id = null,
                string name = null)
        {
            Task<Models.PrincipalSearchResponse> t = this.RestapiV2GetPermissionForPrincipalAsync(id, name);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission. .
        /// Requires administration privilege.
        /// </summary>
        /// <param name="id">Optional parameter: GUID of the user or user group for which the object permission needs to be obtained.</param>
        /// <param name="name">Optional parameter: Name of the ser or user group for which the object permission needs to be obtained.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.PrincipalSearchResponse response from the API call.</returns>
        public async Task<Models.PrincipalSearchResponse> RestapiV2GetPermissionForPrincipalAsync(
                string id = null,
                string name = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/security/permission/principal");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "id", id },
                { "name", name },
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

            return ApiHelper.JsonDeserialize<Models.PrincipalSearchResponse>(response.Body);
        }

        /// <summary>
        /// To programmatically share ThoughtSpot objects with another user or user group, use this endpoint. .
        /// When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2ShareObject(
                Models.TspublicRestV2SecurityShareTsobjectRequest body)
        {
            Task<bool> t = this.RestapiV2ShareObjectAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically share ThoughtSpot objects with another user or user group, use this endpoint. .
        /// When you share an object like a Liveboard or visualization, a notification with a live link is sent to the user. When the users access this object, they can view the last saved version of the object.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2ShareObjectAsync(
                Models.TspublicRestV2SecurityShareTsobjectRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/security/share/tsobject");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint. .
        /// Requires privilege to share the visualization.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2ShareVisualization(
                Models.TspublicRestV2SecurityShareVisualizationRequest body)
        {
            Task<bool> t = this.RestapiV2ShareVisualizationAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// If you want to share a specific visualization from a Liveboard with another user or user group, then use this endpoint. .
        /// Requires privilege to share the visualization.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2ShareVisualizationAsync(
                Models.TspublicRestV2SecurityShareVisualizationRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/security/share/visualization");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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

            return bool.Parse(response.Body);
        }

        /// <summary>
        /// To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission. .
        /// You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred. .
        /// You can optionally provide users or user groups for which the persmission needs to be displayed. .
        /// You can optionally see the permission on the dependent objects as well by enabling includeDependent field. .
        /// Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the List of Models.SecurityPermissionResponse response from the API call.</returns>
        public List<Models.SecurityPermissionResponse> RestapiV2SearchPermissionOnObjects(
                Models.TspublicRestV2SecurityPermissionTsobjectSearchRequest body)
        {
            Task<List<Models.SecurityPermissionResponse>> t = this.RestapiV2SearchPermissionOnObjectsAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission. .
        /// You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred. .
        /// You can optionally provide users or user groups for which the persmission needs to be displayed. .
        /// You can optionally see the permission on the dependent objects as well by enabling includeDependent field. .
        /// Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the List of Models.SecurityPermissionResponse response from the API call.</returns>
        public async Task<List<Models.SecurityPermissionResponse>> RestapiV2SearchPermissionOnObjectsAsync(
                Models.TspublicRestV2SecurityPermissionTsobjectSearchRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/security/permission/tsobject/search");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Content-Type", "application/json" },
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

            return ApiHelper.JsonDeserialize<List<Models.SecurityPermissionResponse>>(response.Body);
        }

        /// <summary>
        /// To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission. .
        /// You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred. .
        /// You can optionally provide users or user groups for which the persmission needs to be displayed. .
        /// You can optionally see the permission on the dependent objects as well by enabling includeDependent field. .
        /// Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the List of Models.PrincipalSearchResponse response from the API call.</returns>
        public List<Models.PrincipalSearchResponse> RestapiV2SearchPermissionForPrincipals(
                Models.TspublicRestV2SecurityPermissionPrincipalSearchRequest body)
        {
            Task<List<Models.PrincipalSearchResponse>> t = this.RestapiV2SearchPermissionForPrincipalsAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To list the permissions for user and user groups on a list of objects, use this endpoint. The response will include only those users and groups with have either VIEW OR MODIFY permission. .
        /// You can either provide list of object ids or type of objects to list the permissions for. One of these inputs is mandatory. If both are provided then only object ids will be considred. .
        /// You can optionally provide users or user groups for which the persmission needs to be displayed. .
        /// You can optionally see the permission on the dependent objects as well by enabling includeDependent field. .
        /// Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the List of Models.PrincipalSearchResponse response from the API call.</returns>
        public async Task<List<Models.PrincipalSearchResponse>> RestapiV2SearchPermissionForPrincipalsAsync(
                Models.TspublicRestV2SecurityPermissionPrincipalSearchRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/security/permission/principal/search");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Content-Type", "application/json" },
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

            return ApiHelper.JsonDeserialize<List<Models.PrincipalSearchResponse>>(response.Body);
        }
    }
}