// <copyright file="TspublicRestV2GroupAddgroupRequest.cs" company="APIMatic">
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
    /// TspublicRestV2GroupAddgroupRequest.
    /// </summary>
    public class TspublicRestV2GroupAddgroupRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupAddgroupRequest"/> class.
        /// </summary>
        public TspublicRestV2GroupAddgroupRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupAddgroupRequest"/> class.
        /// </summary>
        /// <param name="groups">groups.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        public TspublicRestV2GroupAddgroupRequest(
            List<Models.GroupNameAndIDInput> groups,
            string name = null,
            string id = null)
        {
            this.Name = name;
            this.Id = id;
            this.Groups = groups;
        }

        /// <summary>
        /// Name of the group
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the group
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// A JSON array of group names or GUIDs or both. When both are given then id is considered
        /// </summary>
        [JsonProperty("groups")]
        public List<Models.GroupNameAndIDInput> Groups { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2GroupAddgroupRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2GroupAddgroupRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Groups == null && other.Groups == null) || (this.Groups?.Equals(other.Groups) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Groups = {(this.Groups == null ? "null" : $"[{string.Join(", ", this.Groups)} ]")}");
        }
    }
}