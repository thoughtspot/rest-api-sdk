// <copyright file="ApiRestV2SessionLoginRequest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// ApiRestV2SessionLoginRequest.
    /// </summary>
    public class ApiRestV2SessionLoginRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2SessionLoginRequest"/> class.
        /// </summary>
        public ApiRestV2SessionLoginRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2SessionLoginRequest"/> class.
        /// </summary>
        /// <param name="userName">userName.</param>
        /// <param name="password">password.</param>
        /// <param name="rememberMe">rememberMe.</param>
        public ApiRestV2SessionLoginRequest(
            string userName,
            string password,
            bool? rememberMe = false)
        {
            this.UserName = userName;
            this.Password = password;
            this.RememberMe = rememberMe;
        }

        /// <summary>
        /// Username of the user account
        /// </summary>
        [JsonProperty("userName")]
        public string UserName { get; set; }

        /// <summary>
        /// The password of the user account
        /// </summary>
        [JsonProperty("password")]
        public string Password { get; set; }

        /// <summary>
        /// A flag to remember the user session. When set to true, sets a session cookie that persists in subsequent API calls.
        /// </summary>
        [JsonProperty("rememberMe", NullValueHandling = NullValueHandling.Ignore)]
        public bool? RememberMe { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2SessionLoginRequest : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }

            return obj is ApiRestV2SessionLoginRequest other &&
                ((this.UserName == null && other.UserName == null) || (this.UserName?.Equals(other.UserName) == true)) &&
                ((this.Password == null && other.Password == null) || (this.Password?.Equals(other.Password) == true)) &&
                ((this.RememberMe == null && other.RememberMe == null) || (this.RememberMe?.Equals(other.RememberMe) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.UserName = {(this.UserName == null ? "null" : this.UserName == string.Empty ? "" : this.UserName)}");
            toStringOutput.Add($"this.Password = {(this.Password == null ? "null" : this.Password == string.Empty ? "" : this.Password)}");
            toStringOutput.Add($"this.RememberMe = {(this.RememberMe == null ? "null" : this.RememberMe.ToString())}");
        }
    }
}