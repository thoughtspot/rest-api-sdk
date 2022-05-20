// <copyright file="ApiException.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Exceptions
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Text;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Linq;
    using RESTAPISDK.Standard.Http.Client;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// This is the base class for all exceptions that represent an error response
    /// from the server.
    /// </summary>
    [JsonObject]
    public class ApiException : Exception
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        /// <param name="reason"> The reason for throwing exception.</param>
        /// <param name="context"> The HTTP context that encapsulates request and response objects.</param>
        public ApiException(string reason, HttpContext context)
            : base(reason)
        {
            this.HttpContext = context;

            // If a derived exception class is used, then perform deserialization of response body.
            if ((context == null) || (context.Response == null)
                || (context.Response.RawBody == null)
                || (!context.Response.RawBody.CanRead))
                {
                    return;
                }

            using (var reader = new StreamReader(context.Response.RawBody))
            {
                string responseBody = reader.ReadToEnd();
                if (!string.IsNullOrWhiteSpace(responseBody))
                {
                    try
                    {
                        JObject body = JObject.Parse(responseBody);

                        if (!this.GetType().Name.Equals("ApiException", StringComparison.OrdinalIgnoreCase))
                        {
                            JsonConvert.PopulateObject(responseBody, this);
                        }
                    }
                    catch (JsonReaderException)
                    {
                        // Ignore deserialization and IO issues to prevent exception being thrown when this exception
                        // instance is being constructed.
                    }
                }
            }
        }

        /// <summary>
        /// Gets the HTTP response code from the API request.
        /// </summary>
        [JsonIgnore]
        public int ResponseCode
        {
            get { return this.HttpContext != null ? this.HttpContext.Response.StatusCode : -1; }
        }

        /// <summary>
        /// Gets or sets the HttpContext for the request and response.
        /// </summary>
        [JsonIgnore]
        public HttpContext HttpContext { get; internal set; }
    }
}