// <copyright file="HttpCallBackEventsHandler.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Tests.Helpers
{
    using ThoughtSpotPublicRESTAPI.Standard.Http.Client;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Request;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Response;

    /// <summary>
    /// HttpCallBackEventsHandler Class.
    /// </summary>
    public class HttpCallBackEventsHandler
    {
        /// <summary>
        /// Gets Http Request.
        /// </summary>
        public HttpRequest Request { get; private set; }

        /// <summary>
        /// Gets Http Response.
        /// </summary>
        public HttpResponse Response { get; private set; }

        /// <summary>
        /// OnBeforeHttpRequestEventHandler.
        /// </summary>
        /// <param name="source">IHttpClient object.</param>
        /// <param name="request">Http request object.</param>
        internal void OnBeforeHttpRequestEventHandler(IHttpClient source, HttpRequest request)
        {
            this.Request = request;
        }

        /// <summary>
        /// OnAfterHttpResponseEventHandler.
        /// </summary>
        /// <param name="source">IHttpClient object.</param>
        /// <param name="response">Http response object.</param>
        internal void OnAfterHttpResponseEventHandler(IHttpClient source, HttpResponse response)
        {
            this.Response = response;
        }
    }
}
