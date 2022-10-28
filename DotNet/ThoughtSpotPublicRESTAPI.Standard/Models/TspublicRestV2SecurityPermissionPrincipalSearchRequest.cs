// <copyright file="TspublicRestV2SecurityPermissionPrincipalSearchRequest.cs" company="APIMatic">
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
    /// TspublicRestV2SecurityPermissionPrincipalSearchRequest.
    /// </summary>
    public class TspublicRestV2SecurityPermissionPrincipalSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityPermissionPrincipalSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2SecurityPermissionPrincipalSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityPermissionPrincipalSearchRequest"/> class.
        /// </summary>
        /// <param name="principal">principal.</param>
        /// <param name="tsObject">tsObject.</param>
        public TspublicRestV2SecurityPermissionPrincipalSearchRequest(
            List<Models.UserNameAndIDInput> principal,
            List<Models.TsObjectSearchInput> tsObject = null)
        {
            this.Principal = principal;
            this.TsObject = tsObject;
        }

        /// <summary>
        /// A JSON array of principal names or GUIDs to be included in the request. When both are given then id is considered.
        /// </summary>
        [JsonProperty("principal")]
        public List<Models.UserNameAndIDInput> Principal { get; set; }

        /// <summary>
        /// A JSON Array of GUIDs and type of metadata object.
        /// </summary>
        [JsonProperty("tsObject", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.TsObjectSearchInput> TsObject { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2SecurityPermissionPrincipalSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2SecurityPermissionPrincipalSearchRequest other &&
                ((this.Principal == null && other.Principal == null) || (this.Principal?.Equals(other.Principal) == true)) &&
                ((this.TsObject == null && other.TsObject == null) || (this.TsObject?.Equals(other.TsObject) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Principal = {(this.Principal == null ? "null" : $"[{string.Join(", ", this.Principal)} ]")}");
            toStringOutput.Add($"this.TsObject = {(this.TsObject == null ? "null" : $"[{string.Join(", ", this.TsObject)} ]")}");
        }
    }
}