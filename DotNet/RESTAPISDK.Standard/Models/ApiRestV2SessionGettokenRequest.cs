// <copyright file="ApiRestV2SessionGettokenRequest.cs" company="APIMatic">
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
    /// ApiRestV2SessionGettokenRequest.
    /// </summary>
    public class ApiRestV2SessionGettokenRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2SessionGettokenRequest"/> class.
        /// </summary>
        public ApiRestV2SessionGettokenRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2SessionGettokenRequest"/> class.
        /// </summary>
        /// <param name="userName">userName.</param>
        /// <param name="password">password.</param>
        /// <param name="tokenExpiryDuration">tokenExpiryDuration.</param>
        public ApiRestV2SessionGettokenRequest(
            string userName,
            string password,
            string tokenExpiryDuration = null)
        {
            this.UserName = userName;
            this.Password = password;
            this.TokenExpiryDuration = tokenExpiryDuration;
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
        /// Provide duration in seconds after which the token should expire
        /// </summary>
        [JsonProperty("tokenExpiryDuration", NullValueHandling = NullValueHandling.Ignore)]
        public string TokenExpiryDuration { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2SessionGettokenRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2SessionGettokenRequest other &&
                ((this.UserName == null && other.UserName == null) || (this.UserName?.Equals(other.UserName) == true)) &&
                ((this.Password == null && other.Password == null) || (this.Password?.Equals(other.Password) == true)) &&
                ((this.TokenExpiryDuration == null && other.TokenExpiryDuration == null) || (this.TokenExpiryDuration?.Equals(other.TokenExpiryDuration) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.UserName = {(this.UserName == null ? "null" : this.UserName == string.Empty ? "" : this.UserName)}");
            toStringOutput.Add($"this.Password = {(this.Password == null ? "null" : this.Password == string.Empty ? "" : this.Password)}");
            toStringOutput.Add($"this.TokenExpiryDuration = {(this.TokenExpiryDuration == null ? "null" : this.TokenExpiryDuration == string.Empty ? "" : this.TokenExpiryDuration)}");
        }
    }
}