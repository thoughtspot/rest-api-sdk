// <copyright file="TspublicRestV2MetadataDetailSearchRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataDetailSearchRequest.
    /// </summary>
    public class TspublicRestV2MetadataDetailSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataDetailSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataDetailSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataDetailSearchRequest"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="id">id.</param>
        /// <param name="showHidden">showHidden.</param>
        /// <param name="dropQuestionDetails">dropQuestionDetails.</param>
        /// <param name="version">version.</param>
        public TspublicRestV2MetadataDetailSearchRequest(
            Models.Type6Enum type,
            List<string> id,
            bool? showHidden = false,
            bool? dropQuestionDetails = false,
            string version = null)
        {
            this.Type = type;
            this.Id = id;
            this.ShowHidden = showHidden;
            this.DropQuestionDetails = dropQuestionDetails;
            this.Version = version;
        }

        /// <summary>
        /// Type of the metadata object being searched.
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.Type6Enum Type { get; set; }

        /// <summary>
        /// A JSON array of GUIDs of the objects.
        /// </summary>
        [JsonProperty("id")]
        public List<string> Id { get; set; }

        /// <summary>
        /// When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.
        /// </summary>
        [JsonProperty("showHidden", NullValueHandling = NullValueHandling.Ignore)]
        public bool? ShowHidden { get; set; }

        /// <summary>
        /// When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for DATAOBJECT data type.
        /// </summary>
        [JsonProperty("dropQuestionDetails", NullValueHandling = NullValueHandling.Ignore)]
        public bool? DropQuestionDetails { get; set; }

        /// <summary>
        /// Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object.
        /// </summary>
        [JsonProperty("version", NullValueHandling = NullValueHandling.Ignore)]
        public string Version { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataDetailSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataDetailSearchRequest other &&
                this.Type.Equals(other.Type) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.ShowHidden == null && other.ShowHidden == null) || (this.ShowHidden?.Equals(other.ShowHidden) == true)) &&
                ((this.DropQuestionDetails == null && other.DropQuestionDetails == null) || (this.DropQuestionDetails?.Equals(other.DropQuestionDetails) == true)) &&
                ((this.Version == null && other.Version == null) || (this.Version?.Equals(other.Version) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : $"[{string.Join(", ", this.Id)} ]")}");
            toStringOutput.Add($"this.ShowHidden = {(this.ShowHidden == null ? "null" : this.ShowHidden.ToString())}");
            toStringOutput.Add($"this.DropQuestionDetails = {(this.DropQuestionDetails == null ? "null" : this.DropQuestionDetails.ToString())}");
            toStringOutput.Add($"this.Version = {(this.Version == null ? "null" : this.Version == string.Empty ? "" : this.Version)}");
        }
    }
}