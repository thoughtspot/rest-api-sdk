// <copyright file="TspublicRestV2UserAddorgRequest.cs" company="APIMatic">
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
    /// TspublicRestV2UserAddorgRequest.
    /// </summary>
    public class TspublicRestV2UserAddorgRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2UserAddorgRequest"/> class.
        /// </summary>
        public TspublicRestV2UserAddorgRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2UserAddorgRequest"/> class.
        /// </summary>
        /// <param name="users">users.</param>
        /// <param name="orgId">orgId.</param>
        public TspublicRestV2UserAddorgRequest(
            List<Models.UserNameAndIDInput> users,
            int? orgId = null)
        {
            this.OrgId = orgId;
            this.Users = users;
        }

        /// <summary>
        /// The ID of the organization.
        /// </summary>
        [JsonProperty("orgId", NullValueHandling = NullValueHandling.Ignore)]
        public int? OrgId { get; set; }

        /// <summary>
        /// Array of objects. A JSON array of name of users or GUIDs of users or both. When both are given then id is considered
        /// </summary>
        [JsonProperty("users")]
        public List<Models.UserNameAndIDInput> Users { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2UserAddorgRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2UserAddorgRequest other &&
                ((this.OrgId == null && other.OrgId == null) || (this.OrgId?.Equals(other.OrgId) == true)) &&
                ((this.Users == null && other.Users == null) || (this.Users?.Equals(other.Users) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.OrgId = {(this.OrgId == null ? "null" : this.OrgId.ToString())}");
            toStringOutput.Add($"this.Users = {(this.Users == null ? "null" : $"[{string.Join(", ", this.Users)} ]")}");
        }
    }
}