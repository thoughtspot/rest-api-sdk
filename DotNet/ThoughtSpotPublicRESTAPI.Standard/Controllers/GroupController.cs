// <copyright file="GroupController.cs" company="APIMatic">
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
    /// GroupController.
    /// </summary>
    public class GroupController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GroupController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal GroupController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To get the details of a specific group by name or id, use this endpoint.
        /// At Least one value needed.  When both are given id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the group.</param>
        /// <param name="id">Optional parameter: The GUID of the group to query..</param>
        /// <returns>Returns the Models.GroupResponse response from the API call.</returns>
        public Models.GroupResponse RestapiV2GetGroup(
                string name = null,
                string id = null)
        {
            Task<Models.GroupResponse> t = this.RestapiV2GetGroupAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the details of a specific group by name or id, use this endpoint.
        /// At Least one value needed.  When both are given id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the group.</param>
        /// <param name="id">Optional parameter: The GUID of the group to query..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.GroupResponse response from the API call.</returns>
        public async Task<Models.GroupResponse> RestapiV2GetGroupAsync(
                string name = null,
                string id = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/group");

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

            return ApiHelper.JsonDeserialize<Models.GroupResponse>(response.Body);
        }

        /// <summary>
        /// To programmatically create a group in the ThoughtSpot system, use this API endpoint. Using this API, you can create a group and assign privileges and users. For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups. The privileges determine the actions that the users belonging to a group are allowed to do. ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.GroupResponse response from the API call.</returns>
        public Models.GroupResponse RestapiV2CreateGroup(
                Models.TspublicRestV2GroupCreateRequest body)
        {
            Task<Models.GroupResponse> t = this.RestapiV2CreateGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically create a group in the ThoughtSpot system, use this API endpoint. Using this API, you can create a group and assign privileges and users. For ease of user management and access control, ThoughtSpot administrators can create groups and assign privileges to these groups. The privileges determine the actions that the users belonging to a group are allowed to do. ThoughtSpot also has a default group called ALL_GROUP. When you create new group in ThoughtSpot, they are automatically added to ALL_GROUP. You cannot delete the ALL_GROUP or remove members from it.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.GroupResponse response from the API call.</returns>
        public async Task<Models.GroupResponse> RestapiV2CreateGroupAsync(
                Models.TspublicRestV2GroupCreateRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/create");

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

            return ApiHelper.JsonDeserialize<Models.GroupResponse>(response.Body);
        }

        /// <summary>
        /// You can use this endpoint to programmatically modify an existing user account.
        /// To modify a user, you require admin user privileges.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2UpdateGroup(
                Models.TspublicRestV2GroupUpdateRequest body)
        {
            Task<bool> t = this.RestapiV2UpdateGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// You can use this endpoint to programmatically modify an existing user account.
        /// To modify a user, you require admin user privileges.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2UpdateGroupAsync(
                Models.TspublicRestV2GroupUpdateRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/update");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one value needed.  When both are given user id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the group..</param>
        /// <param name="id">Optional parameter: The GUID of the group.</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2DeleteGroup(
                string name = null,
                string id = null)
        {
            Task<bool> t = this.RestapiV2DeleteGroupAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint. At Least one value needed.  When both are given user id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Name of the group..</param>
        /// <param name="id">Optional parameter: The GUID of the group.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2DeleteGroupAsync(
                string name = null,
                string id = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/group/delete");

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
            };

            // prepare the API call request to fetch the response.
            HttpRequest httpRequest = this.GetClientInstance().Delete(queryBuilder.ToString(), headers, null, queryParameters: queryParams);

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
        /// To programmatically add privileges to an existing group, use API endpoint.
        /// When you assign privileges to a group,  all the users under to this group inherits the privileges assigned to that group.
        /// At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2AddPrivilegesToGroup(
                Models.TspublicRestV2GroupAddprivilegeRequest body)
        {
            Task<bool> t = this.RestapiV2AddPrivilegesToGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically add privileges to an existing group, use API endpoint.
        /// When you assign privileges to a group,  all the users under to this group inherits the privileges assigned to that group.
        /// At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2AddPrivilegesToGroupAsync(
                Models.TspublicRestV2GroupAddprivilegeRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/addprivilege");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To programmatically remove privileges from a group, use API endpoint. The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2RemovePrivilegesFromGroup(
                Models.TspublicRestV2GroupRemoveprivilegeRequest body)
        {
            Task<bool> t = this.RestapiV2RemovePrivilegesFromGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically remove privileges from a group, use API endpoint. The API removes only the privilege association. It does not delete the privilege or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2RemovePrivilegesFromGroupAsync(
                Models.TspublicRestV2GroupRemoveprivilegeRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/removeprivilege");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To programmatically add existing ThoughtSpot users to a group, use this API endpoint. When you assign users to a group, the users inherits the privileges assigned to that group. At least one of id or name of the group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2AddUsersToGroup(
                Models.TspublicRestV2GroupAdduserRequest body)
        {
            Task<bool> t = this.RestapiV2AddUsersToGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically add existing ThoughtSpot users to a group, use this API endpoint. When you assign users to a group, the users inherits the privileges assigned to that group. At least one of id or name of the group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2AddUsersToGroupAsync(
                Models.TspublicRestV2GroupAdduserRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/adduser");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To programmatically remove users from a group, use API endpoint.The API removes only the user association. It does not delete the users or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2RemoveUsersFromGroup(
                Models.TspublicRestV2GroupRemoveuserRequest body)
        {
            Task<bool> t = this.RestapiV2RemoveUsersFromGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically remove users from a group, use API endpoint.The API removes only the user association. It does not delete the users or group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2RemoveUsersFromGroupAsync(
                Models.TspublicRestV2GroupRemoveuserRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/removeuser");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To programmatically add existing groups to a group, use API endpoint. When you assign groups to a group, the group inherits the privileges assigned to those groups. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2AddGroupsToGroup(
                Models.TspublicRestV2GroupAddgroupRequest body)
        {
            Task<bool> t = this.RestapiV2AddGroupsToGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically add existing groups to a group, use API endpoint. When you assign groups to a group, the group inherits the privileges assigned to those groups. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2AddGroupsToGroupAsync(
                Models.TspublicRestV2GroupAddgroupRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/addgroup");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To programmatically remove groups from a group, use API endpoint.The API removes only the group association. It does not delete the group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2RemoveGroupsFromGroup(
                Models.TspublicRestV2GroupRemovegroupRequest body)
        {
            Task<bool> t = this.RestapiV2RemoveGroupsFromGroupAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically remove groups from a group, use API endpoint.The API removes only the group association. It does not delete the group from the Thoughtspot system. At least one of id or name of group is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2RemoveGroupsFromGroupAsync(
                Models.TspublicRestV2GroupRemovegroupRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/removegroup");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "Content-Type", "application/json" },
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
        /// To get the details of a specific group account or all groups in the ThoughtSpot system, use this end point.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object RestapiV2SearchGroups(
                Models.TspublicRestV2GroupSearchRequest body)
        {
            Task<object> t = this.RestapiV2SearchGroupsAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the details of a specific group account or all groups in the ThoughtSpot system, use this end point.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> RestapiV2SearchGroupsAsync(
                Models.TspublicRestV2GroupSearchRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/group/search");

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

            return response.Body;
        }
    }
}