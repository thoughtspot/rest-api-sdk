// <copyright file="TspublicRestV2MetadataHomeliveboardAssignRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataHomeliveboardAssignRequest.
    /// </summary>
    public class TspublicRestV2MetadataHomeliveboardAssignRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataHomeliveboardAssignRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataHomeliveboardAssignRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataHomeliveboardAssignRequest"/> class.
        /// </summary>
        /// <param name="userName">userName.</param>
        /// <param name="userId">userId.</param>
        /// <param name="liveboardId">liveboardId.</param>
        public TspublicRestV2MetadataHomeliveboardAssignRequest(
            string userName = null,
            string userId = null,
            string liveboardId = null)
        {
            this.UserName = userName;
            this.UserId = userId;
            this.LiveboardId = liveboardId;
        }

        /// <summary>
        /// Name of the user
        /// </summary>
        [JsonProperty("userName", NullValueHandling = NullValueHandling.Ignore)]
        public string UserName { get; set; }

        /// <summary>
        /// The GUID of the user
        /// </summary>
        [JsonProperty("userId", NullValueHandling = NullValueHandling.Ignore)]
        public string UserId { get; set; }

        /// <summary>
        /// The GUID of the liveboard
        /// </summary>
        [JsonProperty("liveboardId", NullValueHandling = NullValueHandling.Ignore)]
        public string LiveboardId { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataHomeliveboardAssignRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataHomeliveboardAssignRequest other &&
                ((this.UserName == null && other.UserName == null) || (this.UserName?.Equals(other.UserName) == true)) &&
                ((this.UserId == null && other.UserId == null) || (this.UserId?.Equals(other.UserId) == true)) &&
                ((this.LiveboardId == null && other.LiveboardId == null) || (this.LiveboardId?.Equals(other.LiveboardId) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.UserName = {(this.UserName == null ? "null" : this.UserName == string.Empty ? "" : this.UserName)}");
            toStringOutput.Add($"this.UserId = {(this.UserId == null ? "null" : this.UserId == string.Empty ? "" : this.UserId)}");
            toStringOutput.Add($"this.LiveboardId = {(this.LiveboardId == null ? "null" : this.LiveboardId == string.Empty ? "" : this.LiveboardId)}");
        }
    }
}