// <copyright file="TspublicRestV2GroupAddprivilegeRequest.cs" company="APIMatic">
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
    /// TspublicRestV2GroupAddprivilegeRequest.
    /// </summary>
    public class TspublicRestV2GroupAddprivilegeRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupAddprivilegeRequest"/> class.
        /// </summary>
        public TspublicRestV2GroupAddprivilegeRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupAddprivilegeRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="privileges">privileges.</param>
        public TspublicRestV2GroupAddprivilegeRequest(
            string name = null,
            string id = null,
            List<Models.PrivilegeEnum> privileges = null)
        {
            this.Name = name;
            this.Id = id;
            this.Privileges = privileges;
        }

        /// <summary>
        /// Name of the group
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the group to query.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// List of privileges
        /// </summary>
        [JsonProperty("privileges", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.PrivilegeEnum> Privileges { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2GroupAddprivilegeRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2GroupAddprivilegeRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Privileges == null && other.Privileges == null) || (this.Privileges?.Equals(other.Privileges) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Privileges = {(this.Privileges == null ? "null" : $"[{string.Join(", ", this.Privileges)} ]")}");
        }
    }
}