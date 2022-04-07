// <copyright file="IConfiguration.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard
{
    using System;
    using System.Net;
    using RESTAPISDK.Standard.Authentication;
    using RESTAPISDK.Standard.Models;

    /// <summary>
    /// IConfiguration.
    /// </summary>
    public interface IConfiguration
    {
        /// <summary>
        /// Gets Mandatory header with value Thougtspot to accept the external RestAPI requests
        /// </summary>
        string XRequestedBy { get; }

        /// <summary>
        /// Gets response format
        /// </summary>
        string AcceptLanguage { get; }

        /// <summary>
        /// Gets body content type for post request
        /// </summary>
        string ContentType { get; }

        /// <summary>
        /// Gets Current API environment.
        /// </summary>
        Environment Environment { get; }

        /// <summary>
        /// Gets BaseUrl value.
        /// </summary>
        string BaseUrl { get; }

        /// <summary>
        /// Gets the OAuth 2.0 Access Token.
        /// </summary>
        string AccessToken { get; }

        /// <summary>
        /// Gets the URL for a particular alias in the current environment and appends it with template parameters.
        /// </summary>
        /// <param name="alias">Default value:DEFAULT.</param>
        /// <returns>Returns the baseurl.</returns>
        string GetBaseUri(Server alias = Server.Default);
    }
}