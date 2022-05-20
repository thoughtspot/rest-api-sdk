// <copyright file="TspublicRestV2SessionGettokenRequest.cs" company="APIMatic">
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
    /// TspublicRestV2SessionGettokenRequest.
    /// </summary>
    public class TspublicRestV2SessionGettokenRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SessionGettokenRequest"/> class.
        /// </summary>
        public TspublicRestV2SessionGettokenRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SessionGettokenRequest"/> class.
        /// </summary>
        /// <param name="userName">userName.</param>
        /// <param name="password">password.</param>
        /// <param name="secretKey">secretKey.</param>
        /// <param name="accessLevel">accessLevel.</param>
        /// <param name="tsObjectId">tsObjectId.</param>
        /// <param name="tokenExpiryDuration">tokenExpiryDuration.</param>
        public TspublicRestV2SessionGettokenRequest(
            string userName,
            string password = null,
            string secretKey = null,
            Models.GetTokenAccessLevelEnum? accessLevel = Models.GetTokenAccessLevelEnum.FULL,
            string tsObjectId = null,
            string tokenExpiryDuration = null)
        {
            this.UserName = userName;
            this.Password = password;
            this.SecretKey = secretKey;
            this.AccessLevel = accessLevel;
            this.TsObjectId = tsObjectId;
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
        [JsonProperty("password", NullValueHandling = NullValueHandling.Ignore)]
        public string Password { get; set; }

        /// <summary>
        /// The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication.
        /// </summary>
        [JsonProperty("secretKey", NullValueHandling = NullValueHandling.Ignore)]
        public string SecretKey { get; set; }

        /// <summary>
        /// User access privilege.
        ///  FULL - Creates a session with full access.
        ///  REPORT_BOOK_VIEW - Allow view access to the specified visualizations.
        /// </summary>
        [JsonProperty("accessLevel", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.GetTokenAccessLevelEnum? AccessLevel { get; set; }

        /// <summary>
        /// GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object.
        /// </summary>
        [JsonProperty("tsObjectId", NullValueHandling = NullValueHandling.Ignore)]
        public string TsObjectId { get; set; }

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

            return $"TspublicRestV2SessionGettokenRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2SessionGettokenRequest other &&
                ((this.UserName == null && other.UserName == null) || (this.UserName?.Equals(other.UserName) == true)) &&
                ((this.Password == null && other.Password == null) || (this.Password?.Equals(other.Password) == true)) &&
                ((this.SecretKey == null && other.SecretKey == null) || (this.SecretKey?.Equals(other.SecretKey) == true)) &&
                ((this.AccessLevel == null && other.AccessLevel == null) || (this.AccessLevel?.Equals(other.AccessLevel) == true)) &&
                ((this.TsObjectId == null && other.TsObjectId == null) || (this.TsObjectId?.Equals(other.TsObjectId) == true)) &&
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
            toStringOutput.Add($"this.SecretKey = {(this.SecretKey == null ? "null" : this.SecretKey == string.Empty ? "" : this.SecretKey)}");
            toStringOutput.Add($"this.AccessLevel = {(this.AccessLevel == null ? "null" : this.AccessLevel.ToString())}");
            toStringOutput.Add($"this.TsObjectId = {(this.TsObjectId == null ? "null" : this.TsObjectId == string.Empty ? "" : this.TsObjectId)}");
            toStringOutput.Add($"this.TokenExpiryDuration = {(this.TokenExpiryDuration == null ? "null" : this.TokenExpiryDuration == string.Empty ? "" : this.TokenExpiryDuration)}");
        }
    }
}