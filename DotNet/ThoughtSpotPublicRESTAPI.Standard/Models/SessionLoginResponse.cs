// <copyright file="SessionLoginResponse.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Models
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
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// SessionLoginResponse.
    /// </summary>
    public class SessionLoginResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionLoginResponse"/> class.
        /// </summary>
        public SessionLoginResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SessionLoginResponse"/> class.
        /// </summary>
        /// <param name="userName">userName.</param>
        /// <param name="token">token.</param>
        /// <param name="tokenCreatedTime">tokenCreatedTime.</param>
        /// <param name="tokenExpiryDuration">tokenExpiryDuration.</param>
        /// <param name="tokenType">tokenType.</param>
        public SessionLoginResponse(
            string userName = null,
            string token = null,
            string tokenCreatedTime = null,
            string tokenExpiryDuration = null,
            string tokenType = null)
        {
            this.UserName = userName;
            this.Token = token;
            this.TokenCreatedTime = tokenCreatedTime;
            this.TokenExpiryDuration = tokenExpiryDuration;
            this.TokenType = tokenType;
        }

        /// <summary>
        /// Username of the user account for which token is generated
        /// </summary>
        [JsonProperty("userName", NullValueHandling = NullValueHandling.Ignore)]
        public string UserName { get; set; }

        /// <summary>
        /// Bearer token generated. This will be blank when token type is Cookie
        /// </summary>
        [JsonProperty("token", NullValueHandling = NullValueHandling.Ignore)]
        public string Token { get; set; }

        /// <summary>
        /// Date and time at which the token is generated
        /// </summary>
        [JsonProperty("tokenCreatedTime", NullValueHandling = NullValueHandling.Ignore)]
        public string TokenCreatedTime { get; set; }

        /// <summary>
        /// Duration in seconds after which the token expires
        /// </summary>
        [JsonProperty("tokenExpiryDuration", NullValueHandling = NullValueHandling.Ignore)]
        public string TokenExpiryDuration { get; set; }

        /// <summary>
        /// Type of token generated
        /// </summary>
        [JsonProperty("tokenType", NullValueHandling = NullValueHandling.Ignore)]
        public string TokenType { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"SessionLoginResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is SessionLoginResponse other &&
                ((this.UserName == null && other.UserName == null) || (this.UserName?.Equals(other.UserName) == true)) &&
                ((this.Token == null && other.Token == null) || (this.Token?.Equals(other.Token) == true)) &&
                ((this.TokenCreatedTime == null && other.TokenCreatedTime == null) || (this.TokenCreatedTime?.Equals(other.TokenCreatedTime) == true)) &&
                ((this.TokenExpiryDuration == null && other.TokenExpiryDuration == null) || (this.TokenExpiryDuration?.Equals(other.TokenExpiryDuration) == true)) &&
                ((this.TokenType == null && other.TokenType == null) || (this.TokenType?.Equals(other.TokenType) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.UserName = {(this.UserName == null ? "null" : this.UserName == string.Empty ? "" : this.UserName)}");
            toStringOutput.Add($"this.Token = {(this.Token == null ? "null" : this.Token == string.Empty ? "" : this.Token)}");
            toStringOutput.Add($"this.TokenCreatedTime = {(this.TokenCreatedTime == null ? "null" : this.TokenCreatedTime == string.Empty ? "" : this.TokenCreatedTime)}");
            toStringOutput.Add($"this.TokenExpiryDuration = {(this.TokenExpiryDuration == null ? "null" : this.TokenExpiryDuration == string.Empty ? "" : this.TokenExpiryDuration)}");
            toStringOutput.Add($"this.TokenType = {(this.TokenType == null ? "null" : this.TokenType == string.Empty ? "" : this.TokenType)}");
        }
    }
}