// <copyright file="ApiRestV2MetadataTagUpdateRequest.cs" company="APIMatic">
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
    /// ApiRestV2MetadataTagUpdateRequest.
    /// </summary>
    public class ApiRestV2MetadataTagUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2MetadataTagUpdateRequest"/> class.
        /// </summary>
        public ApiRestV2MetadataTagUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2MetadataTagUpdateRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="color">color.</param>
        public ApiRestV2MetadataTagUpdateRequest(
            string name = null,
            string id = null,
            string color = null)
        {
            this.Name = name;
            this.Id = id;
            this.Color = color;
        }

        /// <summary>
        /// Name of the tag
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the tag
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Hex color code to be assigned to the tag
        /// </summary>
        [JsonProperty("color", NullValueHandling = NullValueHandling.Ignore)]
        public string Color { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2MetadataTagUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2MetadataTagUpdateRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Color == null && other.Color == null) || (this.Color?.Equals(other.Color) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Color = {(this.Color == null ? "null" : this.Color == string.Empty ? "" : this.Color)}");
        }
    }
}