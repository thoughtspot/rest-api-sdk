// <copyright file="UserController.cs" company="APIMatic">
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
    /// UserController.
    /// </summary>
    public class UserController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal UserController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed.  When both are given, user id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user that you want to query..</param>
        /// <param name="id">Optional parameter: The GUID of the user account to query.</param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public Models.UserResponse RestapiV2GetUser(
                string name = null,
                string id = null)
        {
            Task<Models.UserResponse> t = this.RestapiV2GetUserAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed.  When both are given, user id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user that you want to query..</param>
        /// <param name="id">Optional parameter: The GUID of the user account to query.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public async Task<Models.UserResponse> RestapiV2GetUserAsync(
                string name = null,
                string id = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/user");

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

            return ApiHelper.JsonDeserialize<Models.UserResponse>(response.Body);
        }

        /// <summary>
        /// To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
        /// To create a user, you require admin user privileges.
        /// All users created in the ThoughtSpot system are added to ALL_GROUP.
        /// </summary>
        /// <param name="name">Required parameter: Name of the user. The username string must be unique..</param>
        /// <param name="displayName">Required parameter: A unique display name string for the user account, usually their first and last name.</param>
        /// <param name="password">Required parameter: Password for the user account..</param>
        /// <param name="visibility">Optional parameter: Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and this allows them to share objects.</param>
        /// <param name="mail">Optional parameter: Email of the user account.</param>
        /// <param name="orgIds">Optional parameter: Array of org identifiers. If no value is provided then user will be created in the organization associated with the login session..</param>
        /// <param name="groups">Optional parameter: Array of objects of groups that the user belong to..</param>
        /// <param name="state">Optional parameter: Status of user account. acitve or inactive..</param>
        /// <param name="notifyOnShare">Optional parameter: User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards..</param>
        /// <param name="showWalkMe">Optional parameter: The user preference for revisiting the onboarding experience..</param>
        /// <param name="analystOnboardingComplete">Optional parameter: ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI..</param>
        /// <param name="type">Optional parameter: Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system..</param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public Models.UserResponse RestapiV2CreateUser(
                string name,
                string displayName,
                string password,
                Models.VisibilityEnum? visibility = null,
                string mail = null,
                List<int> orgIds = null,
                List<Models.GroupNameAndIDInput> groups = null,
                Models.StateEnum? state = null,
                bool? notifyOnShare = null,
                bool? showWalkMe = null,
                bool? analystOnboardingComplete = null,
                Models.Type8Enum? type = null)
        {
            Task<Models.UserResponse> t = this.RestapiV2CreateUserAsync(name, displayName, password, visibility, mail, orgIds, groups, state, notifyOnShare, showWalkMe, analystOnboardingComplete, type);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically create a user account in the ThoughtSpot system use this API endpoint. Using this API, you can create a user and assign groups.
        /// To create a user, you require admin user privileges.
        /// All users created in the ThoughtSpot system are added to ALL_GROUP.
        /// </summary>
        /// <param name="name">Required parameter: Name of the user. The username string must be unique..</param>
        /// <param name="displayName">Required parameter: A unique display name string for the user account, usually their first and last name.</param>
        /// <param name="password">Required parameter: Password for the user account..</param>
        /// <param name="visibility">Optional parameter: Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and this allows them to share objects.</param>
        /// <param name="mail">Optional parameter: Email of the user account.</param>
        /// <param name="orgIds">Optional parameter: Array of org identifiers. If no value is provided then user will be created in the organization associated with the login session..</param>
        /// <param name="groups">Optional parameter: Array of objects of groups that the user belong to..</param>
        /// <param name="state">Optional parameter: Status of user account. acitve or inactive..</param>
        /// <param name="notifyOnShare">Optional parameter: User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards..</param>
        /// <param name="showWalkMe">Optional parameter: The user preference for revisiting the onboarding experience..</param>
        /// <param name="analystOnboardingComplete">Optional parameter: ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI..</param>
        /// <param name="type">Optional parameter: Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public async Task<Models.UserResponse> RestapiV2CreateUserAsync(
                string name,
                string displayName,
                string password,
                Models.VisibilityEnum? visibility = null,
                string mail = null,
                List<int> orgIds = null,
                List<Models.GroupNameAndIDInput> groups = null,
                Models.StateEnum? state = null,
                bool? notifyOnShare = null,
                bool? showWalkMe = null,
                bool? analystOnboardingComplete = null,
                Models.Type8Enum? type = null,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (name == null)
            {
                throw new ArgumentNullException("name", "The parameter \"name\" is a required parameter and cannot be null.");
            }

            if (displayName == null)
            {
                throw new ArgumentNullException("displayName", "The parameter \"displayName\" is a required parameter and cannot be null.");
            }

            if (password == null)
            {
                throw new ArgumentNullException("password", "The parameter \"password\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/user/create");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "name", name },
                { "displayName", displayName },
                { "password", password },
                { "visibility", (visibility.HasValue) ? ApiHelper.JsonSerialize(visibility.Value).Trim('\"') : null },
                { "mail", mail },
                { "orgIds", orgIds },
                { "groups", groups },
                { "state", (state.HasValue) ? ApiHelper.JsonSerialize(state.Value).Trim('\"') : null },
                { "notifyOnShare", notifyOnShare },
                { "showWalkMe", showWalkMe },
                { "analystOnboardingComplete", analystOnboardingComplete },
                { "type", (type.HasValue) ? ApiHelper.JsonSerialize(type.Value).Trim('\"') : null },
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

            return ApiHelper.JsonDeserialize<Models.UserResponse>(response.Body);
        }

        /// <summary>
        /// You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2UpdateUser(
                Models.TspublicRestV2UserUpdateRequest body)
        {
            Task<bool> t = this.RestapiV2UpdateUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// You can use this endpoint to programmatically modify an existing user account.  To modify a user, you require admin user privileges.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2UpdateUserAsync(
                Models.TspublicRestV2UserUpdateRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/update");

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
        /// To remove a user from the ThoughtSpot system, use this endpoint.
        /// At Least one value needed.  When both are given user id will be considered to delete user.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user that you want to query..</param>
        /// <param name="id">Optional parameter: The GUID of the user account to query.</param>
        /// <param name="orgId">Optional parameter: Unique identifier of the organization from which the user would be deleted. If no value is provided then user will be deleted from the organization associated with the login session..</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2DeleteUser(
                string name = null,
                string id = null,
                int? orgId = null)
        {
            Task<bool> t = this.RestapiV2DeleteUserAsync(name, id, orgId);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To remove a user from the ThoughtSpot system, use this endpoint.
        /// At Least one value needed.  When both are given user id will be considered to delete user.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user that you want to query..</param>
        /// <param name="id">Optional parameter: The GUID of the user account to query.</param>
        /// <param name="orgId">Optional parameter: Unique identifier of the organization from which the user would be deleted. If no value is provided then user will be deleted from the organization associated with the login session..</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2DeleteUserAsync(
                string name = null,
                string id = null,
                int? orgId = null,
                CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/user/delete");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "name", name },
                { "id", id },
                { "orgId", orgId },
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
        /// To programmatically add groups to an existing ThoughtSpot user use this endpoint.
        /// When you assign groups to a user, the user inherits the privileges assigned to those groups.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2AddUserToGroups(
                Models.TspublicRestV2UserAddgroupRequest body)
        {
            Task<bool> t = this.RestapiV2AddUserToGroupsAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically add groups to an existing ThoughtSpot user use this endpoint.
        /// When you assign groups to a user, the user inherits the privileges assigned to those groups.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2AddUserToGroupsAsync(
                Models.TspublicRestV2UserAddgroupRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/addgroup");

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
        /// To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
        /// The API removes only the user association. It does not delete the user or group from the Thoughtspot system.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2RemoveUserFromGroups(
                Models.TspublicRestV2UserRemovegroupRequest body)
        {
            Task<bool> t = this.RestapiV2RemoveUserFromGroupsAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
        /// The API removes only the user association. It does not delete the user or group from the Thoughtspot system.
        /// At least one of User Id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2RemoveUserFromGroupsAsync(
                Models.TspublicRestV2UserRemovegroupRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/removegroup");

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
        /// To get the details of a specific user account or all users in the ThoughtSpot system use this end point.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object RestapiV2SearchUsers(
                Models.TspublicRestV2UserSearchRequest body)
        {
            Task<object> t = this.RestapiV2SearchUsersAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the details of a specific user account or all users in the ThoughtSpot system use this end point.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> RestapiV2SearchUsersAsync(
                Models.TspublicRestV2UserSearchRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/search");

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

        /// <summary>
        /// To change the password of a ThoughtSpot user account, use this endpoint. .
        /// At least one of id or name of user is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2ChangePasswordOfUser(
                Models.TspublicRestV2UserChangepasswordRequest body)
        {
            Task<bool> t = this.RestapiV2ChangePasswordOfUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To change the password of a ThoughtSpot user account, use this endpoint. .
        /// At least one of id or name of user is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2ChangePasswordOfUserAsync(
                Models.TspublicRestV2UserChangepasswordRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/changepassword");

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
        /// To programmatically add existing ThoughtSpot users to an organization, use this API endpoint. .
        /// At least one of id or name of the organization is required. When both are given, then organization id will be considered. .
        /// Requires Administration access for the organization to which users need to be added.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RestapiV2AddUserToOrgs(
                Models.TspublicRestV2UserAddorgRequest body)
        {
            Task<bool> t = this.RestapiV2AddUserToOrgsAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically add existing ThoughtSpot users to an organization, use this API endpoint. .
        /// At least one of id or name of the organization is required. When both are given, then organization id will be considered. .
        /// Requires Administration access for the organization to which users need to be added.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RestapiV2AddUserToOrgsAsync(
                Models.TspublicRestV2UserAddorgRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/addorg");

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
    }
}