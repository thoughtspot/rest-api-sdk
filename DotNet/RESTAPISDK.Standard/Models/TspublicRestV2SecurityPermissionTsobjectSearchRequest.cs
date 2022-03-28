// <copyright file="TspublicRestV2SecurityPermissionTsobjectSearchRequest.cs" company="APIMatic">
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
    /// TspublicRestV2SecurityPermissionTsobjectSearchRequest.
    /// </summary>
    public class TspublicRestV2SecurityPermissionTsobjectSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityPermissionTsobjectSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2SecurityPermissionTsobjectSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityPermissionTsobjectSearchRequest"/> class.
        /// </summary>
        /// <param name="tsObject">tsObject.</param>
        /// <param name="principal">principal.</param>
        /// <param name="includeDependent">includeDependent.</param>
        public TspublicRestV2SecurityPermissionTsobjectSearchRequest(
            List<Models.TsObjectSearchInput> tsObject,
            List<Models.UserNameAndIDInput> principal = null,
            Models.IncludeDependentEnum? includeDependent = Models.IncludeDependentEnum.False)
        {
            this.TsObject = tsObject;
            this.Principal = principal;
            this.IncludeDependent = includeDependent;
        }

        /// <summary>
        /// A JSON Array of GUIDs and type of metadata object.
        /// </summary>
        [JsonProperty("tsObject")]
        public List<Models.TsObjectSearchInput> TsObject { get; set; }

        /// <summary>
        /// A JSON array of principal names or GUIDs. When both are given then id is considered.
        /// </summary>
        [JsonProperty("principal", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.UserNameAndIDInput> Principal { get; set; }

        /// <summary>
        /// When this field is set to true, the API response includes the permission details for the dependent objects
        /// </summary>
        [JsonProperty("includeDependent", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.IncludeDependentEnum? IncludeDependent { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2SecurityPermissionTsobjectSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2SecurityPermissionTsobjectSearchRequest other &&
                ((this.TsObject == null && other.TsObject == null) || (this.TsObject?.Equals(other.TsObject) == true)) &&
                ((this.Principal == null && other.Principal == null) || (this.Principal?.Equals(other.Principal) == true)) &&
                ((this.IncludeDependent == null && other.IncludeDependent == null) || (this.IncludeDependent?.Equals(other.IncludeDependent) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.TsObject = {(this.TsObject == null ? "null" : $"[{string.Join(", ", this.TsObject)} ]")}");
            toStringOutput.Add($"this.Principal = {(this.Principal == null ? "null" : $"[{string.Join(", ", this.Principal)} ]")}");
            toStringOutput.Add($"this.IncludeDependent = {(this.IncludeDependent == null ? "null" : this.IncludeDependent.ToString())}");
        }
    }
}