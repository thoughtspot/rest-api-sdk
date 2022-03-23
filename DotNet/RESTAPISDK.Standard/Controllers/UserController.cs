// <copyright file="UserController.cs" company="APIMatic">
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
        /// To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user that you want to query.</param>
        /// <param name="id">Optional parameter: The GUID of the user account to query.</param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public Models.UserResponse GetUser(
                string name = null,
                string id = null)
        {
            Task<Models.UserResponse> t = this.GetUserAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user that you want to query.</param>
        /// <param name="id">Optional parameter: The GUID of the user account to query.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public async Task<Models.UserResponse> GetUserAsync(
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

            return ApiHelper.JsonDeserialize<Models.UserResponse>(response.Body);
        }

        /// <summary>
        /// To programmatically create a user account in the ThoughtSpot system, use this API endpoint. .
        ///  Using this API, you can create a user and assign groups. To create a user, you require admin user privileges. .
        ///  All users created in the ThoughtSpot system are added to ALL_GROUP.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public Models.UserResponse CreateUser(
                Models.TspublicRestV2UserCreateRequest body)
        {
            Task<Models.UserResponse> t = this.CreateUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically create a user account in the ThoughtSpot system, use this API endpoint. .
        ///  Using this API, you can create a user and assign groups. To create a user, you require admin user privileges. .
        ///  All users created in the ThoughtSpot system are added to ALL_GROUP.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.UserResponse response from the API call.</returns>
        public async Task<Models.UserResponse> CreateUserAsync(
                Models.TspublicRestV2UserCreateRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/user/create");

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

            return ApiHelper.JsonDeserialize<Models.UserResponse>(response.Body);
        }

        /// <summary>
        /// You can use this endpoint to programmatically modify an existing user account. .
        ///  To modify a user, you require admin user privileges. .
        ///  At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool UpdateUser(
                Models.TspublicRestV2UserUpdateRequest body)
        {
            Task<bool> t = this.UpdateUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// You can use this endpoint to programmatically modify an existing user account. .
        ///  To modify a user, you require admin user privileges. .
        ///  At least one of User Id or username is mandatory. When both are given, then user id will be considered and username will be updated.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> UpdateUserAsync(
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
        /// To remove a user from the ThoughtSpot system, use this endpoint. .
        ///  At least one value is needed. When both are given, then user id will be considered to delete user.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user account.</param>
        /// <param name="id">Optional parameter: The GUID of the user account.</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool DeleteUser(
                string name = null,
                string id = null)
        {
            Task<bool> t = this.DeleteUserAsync(name, id);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To remove a user from the ThoughtSpot system, use this endpoint. .
        ///  At least one value is needed. When both are given, then user id will be considered to delete user.
        /// </summary>
        /// <param name="name">Optional parameter: Username of the user account.</param>
        /// <param name="id">Optional parameter: The GUID of the user account.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> DeleteUserAsync(
                string name = null,
                string id = null,
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
        /// To programmatically add groups to an existing ThoughtSpot user, use this endpoint. .
        ///  When you assign groups to a user, the user inherits the privileges assigned to those groups. .
        ///  At least one of user Id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool AddGroupsToUser(
                Models.TspublicRestV2UserAddgroupRequest body)
        {
            Task<bool> t = this.AddGroupsToUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically add groups to an existing ThoughtSpot user, use this endpoint. .
        ///  When you assign groups to a user, the user inherits the privileges assigned to those groups. .
        ///  At least one of user Id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> AddGroupsToUserAsync(
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
        /// To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint. .
        ///  The API removes only the user association. It does not delete the user or group from the Thoughtspot system. .
        ///  At least one of user id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool RemoveGroupsFromUser(
                Models.TspublicRestV2UserRemovegroupRequest body)
        {
            Task<bool> t = this.RemoveGroupsFromUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint. .
        ///  The API removes only the user association. It does not delete the user or group from the Thoughtspot system. .
        ///  At least one of user id or username is mandatory. When both are given, then user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> RemoveGroupsFromUserAsync(
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
        /// To change the password of a ThoughtSpot user account, use this endpoint. .
        ///  At least one of id or name of user is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the bool response from the API call.</returns>
        public bool ChangePasswordOfUser(
                Models.TspublicRestV2UserChangepasswordRequest body)
        {
            Task<bool> t = this.ChangePasswordOfUserAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To change the password of a ThoughtSpot user account, use this endpoint. .
        ///  At least one of id or name of user is required. When both are given user id will be considered.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the bool response from the API call.</returns>
        public async Task<bool> ChangePasswordOfUserAsync(
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
        /// To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the List of Models.UserResponse response from the API call.</returns>
        public List<Models.UserResponse> SearchUsers(
                Models.TspublicRestV2UserSearchRequest body)
        {
            Task<List<Models.UserResponse>> t = this.SearchUsersAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// To get the details of a specific user account or all users in the ThoughtSpot system, use this endpoint. If no input is provided, then all user are included in the response.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the List of Models.UserResponse response from the API call.</returns>
        public async Task<List<Models.UserResponse>> SearchUsersAsync(
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

            return ApiHelper.JsonDeserialize<List<Models.UserResponse>>(response.Body);
        }
    }
}