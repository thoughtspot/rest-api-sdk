// <copyright file="TspublicRestV2AdminAssignauthorRequest.cs" company="APIMatic">
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
    /// TspublicRestV2AdminAssignauthorRequest.
    /// </summary>
    public class TspublicRestV2AdminAssignauthorRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminAssignauthorRequest"/> class.
        /// </summary>
        public TspublicRestV2AdminAssignauthorRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminAssignauthorRequest"/> class.
        /// </summary>
        /// <param name="tsObjectId">tsObjectId.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        public TspublicRestV2AdminAssignauthorRequest(
            List<string> tsObjectId,
            string name = null,
            string id = null)
        {
            this.TsObjectId = tsObjectId;
            this.Name = name;
            this.Id = id;
        }

        /// <summary>
        /// A JSON array of GUIDs of the metadata objects.
        /// </summary>
        [JsonProperty("tsObjectId")]
        public List<string> TsObjectId { get; set; }

        /// <summary>
        /// User name of the user account.
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the user account.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2AdminAssignauthorRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2AdminAssignauthorRequest other &&
                ((this.TsObjectId == null && other.TsObjectId == null) || (this.TsObjectId?.Equals(other.TsObjectId) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.TsObjectId = {(this.TsObjectId == null ? "null" : $"[{string.Join(", ", this.TsObjectId)} ]")}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
        }
    }
}