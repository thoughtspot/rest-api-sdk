// <copyright file="TspublicRestV2UserRemovegroupRequest.cs" company="APIMatic">
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
    /// TspublicRestV2UserRemovegroupRequest.
    /// </summary>
    public class TspublicRestV2UserRemovegroupRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2UserRemovegroupRequest"/> class.
        /// </summary>
        public TspublicRestV2UserRemovegroupRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2UserRemovegroupRequest"/> class.
        /// </summary>
        /// <param name="groups">groups.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        public TspublicRestV2UserRemovegroupRequest(
            List<Models.GroupNameAndIDInput> groups,
            string name = null,
            string id = null)
        {
            this.Name = name;
            this.Id = id;
            this.Groups = groups;
        }

        /// <summary>
        /// User name of the user account
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the user account
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Array of objects of groups that the user belong to.
        /// </summary>
        [JsonProperty("groups")]
        public List<Models.GroupNameAndIDInput> Groups { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2UserRemovegroupRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2UserRemovegroupRequest other &&
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