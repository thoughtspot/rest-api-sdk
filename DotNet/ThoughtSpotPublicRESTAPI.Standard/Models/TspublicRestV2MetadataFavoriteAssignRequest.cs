// <copyright file="TspublicRestV2MetadataFavoriteAssignRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataFavoriteAssignRequest.
    /// </summary>
    public class TspublicRestV2MetadataFavoriteAssignRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataFavoriteAssignRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataFavoriteAssignRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataFavoriteAssignRequest"/> class.
        /// </summary>
        /// <param name="tsObject">tsObject.</param>
        /// <param name="userName">userName.</param>
        /// <param name="userId">userId.</param>
        public TspublicRestV2MetadataFavoriteAssignRequest(
            List<Models.TsObjectInput> tsObject,
            string userName = null,
            string userId = null)
        {
            this.UserName = userName;
            this.UserId = userId;
            this.TsObject = tsObject;
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
        /// A JSON Array of GUIDs and type of metadata object.
        /// </summary>
        [JsonProperty("tsObject")]
        public List<Models.TsObjectInput> TsObject { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataFavoriteAssignRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataFavoriteAssignRequest other &&
                ((this.UserName == null && other.UserName == null) || (this.UserName?.Equals(other.UserName) == true)) &&
                ((this.UserId == null && other.UserId == null) || (this.UserId?.Equals(other.UserId) == true)) &&
                ((this.TsObject == null && other.TsObject == null) || (this.TsObject?.Equals(other.TsObject) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.UserName = {(this.UserName == null ? "null" : this.UserName == string.Empty ? "" : this.UserName)}");
            toStringOutput.Add($"this.UserId = {(this.UserId == null ? "null" : this.UserId == string.Empty ? "" : this.UserId)}");
            toStringOutput.Add($"this.TsObject = {(this.TsObject == null ? "null" : $"[{string.Join(", ", this.TsObject)} ]")}");
        }
    }
}