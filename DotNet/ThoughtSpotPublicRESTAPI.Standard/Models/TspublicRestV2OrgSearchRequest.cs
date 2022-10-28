// <copyright file="TspublicRestV2OrgSearchRequest.cs" company="APIMatic">
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
    /// TspublicRestV2OrgSearchRequest.
    /// </summary>
    public class TspublicRestV2OrgSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2OrgSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2OrgSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2OrgSearchRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="showDeleted">showDeleted.</param>
        public TspublicRestV2OrgSearchRequest(
            string name = null,
            int? id = null,
            bool? showDeleted = false)
        {
            this.Name = name;
            this.Id = id;
            this.ShowDeleted = showDeleted;
        }

        /// <summary>
        /// Name of the organization.
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The ID of the organization.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public int? Id { get; set; }

        /// <summary>
        /// When set to true, the response will include the details of deleted organization also.
        /// </summary>
        [JsonProperty("showDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public bool? ShowDeleted { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2OrgSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2OrgSearchRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.ShowDeleted == null && other.ShowDeleted == null) || (this.ShowDeleted?.Equals(other.ShowDeleted) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id.ToString())}");
            toStringOutput.Add($"this.ShowDeleted = {(this.ShowDeleted == null ? "null" : this.ShowDeleted.ToString())}");
        }
    }
}