// <copyright file="DatabaseController.cs" company="APIMatic">
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
    using RESTAPISDK.Standard.Http.Request.Configuration;
    using RESTAPISDK.Standard.Http.Response;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// DatabaseController.
    /// </summary>
    public class DatabaseController : BaseController
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DatabaseController"/> class.
        /// </summary>
        /// <param name="config"> config instance. </param>
        /// <param name="httpClient"> httpClient. </param>
        /// <param name="authManagers"> authManager. </param>
        /// <param name="httpCallBack"> httpCallBack. </param>
        internal DatabaseController(IConfiguration config, IHttpClient httpClient, IDictionary<string, IAuthManager> authManagers, HttpCallBack httpCallBack = null)
            : base(config, httpClient, authManagers, httpCallBack)
        {
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments .
        ///  To list all the databases in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <returns>Returns the List of string response from the API call.</returns>
        public List<string> GetDatabases()
        {
            Task<List<string>> t = this.GetDatabasesAsync();
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments .
        ///  To list all the databases in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the List of string response from the API call.</returns>
        public async Task<List<string>> GetDatabasesAsync(CancellationToken cancellationToken = default)
        {
            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/database");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
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
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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

            return ApiHelper.JsonDeserialize<List<string>>(response.Body);
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments .
        ///  To list all the schemas in a database in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="database">Required parameter: Name of the Falcon database.</param>
        /// <returns>Returns the List of string response from the API call.</returns>
        public List<string> GetSchemas(
                string database)
        {
            Task<List<string>> t = this.GetSchemasAsync(database);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments .
        ///  To list all the schemas in a database in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="database">Required parameter: Name of the Falcon database.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the List of string response from the API call.</returns>
        public async Task<List<string>> GetSchemasAsync(
                string database,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (database == null)
            {
                throw new ArgumentNullException("database", "The parameter \"database\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/database/schema");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "database", database },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
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
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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

            return ApiHelper.JsonDeserialize<List<string>>(response.Body);
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To list all the tables in a schema of a database in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="database">Required parameter: Name of the Falcon database.</param>
        /// <param name="schema">Required parameter: Name of the schema in Falcon database.</param>
        /// <returns>Returns the List of string response from the API call.</returns>
        public List<string> GetTables(
                string database,
                string schema)
        {
            Task<List<string>> t = this.GetTablesAsync(database, schema);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To list all the tables in a schema of a database in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="database">Required parameter: Name of the Falcon database.</param>
        /// <param name="schema">Required parameter: Name of the schema in Falcon database.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the List of string response from the API call.</returns>
        public async Task<List<string>> GetTablesAsync(
                string database,
                string schema,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (database == null)
            {
                throw new ArgumentNullException("database", "The parameter \"database\" is a required parameter and cannot be null.");
            }

            if (schema == null)
            {
                throw new ArgumentNullException("schema", "The parameter \"schema\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/database/table");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "database", database },
                { "schema", schema },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
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
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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

            return ApiHelper.JsonDeserialize<List<string>>(response.Body);
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To provide details of a table in a schema of a database in Falcon, use this endpoint.
        /// </summary>
        /// <param name="database">Required parameter: Name of the Falcon database.</param>
        /// <param name="table">Required parameter: Name of the table in Falcon database.</param>
        /// <param name="schema">Optional parameter: Name of the schema in Falcon database.</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object GetTableDetails(
                string database,
                string table,
                string schema = null)
        {
            Task<object> t = this.GetTableDetailsAsync(database, table, schema);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To provide details of a table in a schema of a database in Falcon, use this endpoint.
        /// </summary>
        /// <param name="database">Required parameter: Name of the Falcon database.</param>
        /// <param name="table">Required parameter: Name of the table in Falcon database.</param>
        /// <param name="schema">Optional parameter: Name of the schema in Falcon database.</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> GetTableDetailsAsync(
                string database,
                string table,
                string schema = null,
                CancellationToken cancellationToken = default)
        {
            // validating required parameters.
            if (database == null)
            {
                throw new ArgumentNullException("database", "The parameter \"database\" is a required parameter and cannot be null.");
            }

            if (table == null)
            {
                throw new ArgumentNullException("table", "The parameter \"table\" is a required parameter and cannot be null.");
            }

            // the base uri for api requests.
            string baseUri = this.Config.GetBaseUri();

            // prepare query string for API call.
            StringBuilder queryBuilder = new StringBuilder(baseUri);
            queryBuilder.Append("/tspublic/rest/v2/database/table/detail");

            // prepare specfied query parameters.
            var queryParams = new Dictionary<string, object>()
            {
                { "database", database },
                { "table", table },
                { "schema", schema },
            };

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
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
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To create a table in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the Models.CreateTableResponse response from the API call.</returns>
        public Models.CreateTableResponse CreateTable(
                Models.TspublicRestV2DatabaseTableCreateRequest body)
        {
            Task<Models.CreateTableResponse> t = this.CreateTableAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To create a table in Falcon, use this endpoint. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the Models.CreateTableResponse response from the API call.</returns>
        public async Task<Models.CreateTableResponse> CreateTableAsync(
                Models.TspublicRestV2DatabaseTableCreateRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/database/table/create");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Content-Type", "application/json" },
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
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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

            return ApiHelper.JsonDeserialize<Models.CreateTableResponse>(response.Body);
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To run a TQL statement in Falcon, use this endpoint. .
        ///  You can run only following type of statements - Table DDL alter and Table rows update and delete. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <returns>Returns the object response from the API call.</returns>
        public object RunQuery(
                Models.TspublicRestV2DatabaseTableRunqueryRequest body)
        {
            Task<object> t = this.RunQueryAsync(body);
            ApiHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Note: This endpoint is applicable only for on-prem deployments. .
        ///  To run a TQL statement in Falcon, use this endpoint. .
        ///  You can run only following type of statements - Table DDL alter and Table rows update and delete. .
        ///  Permission: Requires administration privilege.
        /// </summary>
        /// <param name="body">Required parameter: Example: .</param>
        /// <param name="cancellationToken"> cancellationToken. </param>
        /// <returns>Returns the object response from the API call.</returns>
        public async Task<object> RunQueryAsync(
                Models.TspublicRestV2DatabaseTableRunqueryRequest body,
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
            queryBuilder.Append("/tspublic/rest/v2/database/table/runquery");

            // append request with appropriate headers and parameters
            var headers = new Dictionary<string, string>()
            {
                { "user-agent", this.UserAgent },
                { "accept", "application/json" },
                { "Content-Type", "application/json" },
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
            HttpStringResponse response = await this.GetClientInstance().ExecuteAsStringAsync(httpRequest, cancellationToken: cancellationToken).ConfigureAwait(false);
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
    }
}