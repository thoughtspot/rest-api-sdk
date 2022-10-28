// <copyright file="MetadataTagResponse.cs" company="APIMatic">
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
    /// MetadataTagResponse.
    /// </summary>
    public class MetadataTagResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataTagResponse"/> class.
        /// </summary>
        public MetadataTagResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataTagResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="clientState">clientState.</param>
        /// <param name="indexVersion">indexVersion.</param>
        /// <param name="generationNum">generationNum.</param>
        /// <param name="isDeleted">isDeleted.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="isExternal">isExternal.</param>
        /// <param name="isDeprecated">isDeprecated.</param>
        /// <param name="created">created.</param>
        /// <param name="modified">modified.</param>
        /// <param name="modifiedBy">modifiedBy.</param>
        /// <param name="author">author.</param>
        /// <param name="owner">owner.</param>
        public MetadataTagResponse(
            string name = null,
            string id = null,
            Models.ClientState clientState = null,
            double? indexVersion = null,
            double? generationNum = null,
            bool? isDeleted = null,
            bool? isHidden = null,
            bool? isExternal = null,
            bool? isDeprecated = null,
            double? created = null,
            double? modified = null,
            Models.TagNameAndID modifiedBy = null,
            Models.TagNameAndID author = null,
            Models.TagNameAndID owner = null)
        {
            this.Name = name;
            this.Id = id;
            this.ClientState = clientState;
            this.IndexVersion = indexVersion;
            this.GenerationNum = generationNum;
            this.IsDeleted = isDeleted;
            this.IsHidden = isHidden;
            this.IsExternal = isExternal;
            this.IsDeprecated = isDeprecated;
            this.Created = created;
            this.Modified = modified;
            this.ModifiedBy = modifiedBy;
            this.Author = author;
            this.Owner = owner;
        }

        /// <summary>
        /// Name of the tag
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// GUID of the tag
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets ClientState.
        /// </summary>
        [JsonProperty("clientState", NullValueHandling = NullValueHandling.Ignore)]
        public Models.ClientState ClientState { get; set; }

        /// <summary>
        /// Gets or sets IndexVersion.
        /// </summary>
        [JsonProperty("indexVersion", NullValueHandling = NullValueHandling.Ignore)]
        public double? IndexVersion { get; set; }

        /// <summary>
        /// Gets or sets GenerationNum.
        /// </summary>
        [JsonProperty("generationNum", NullValueHandling = NullValueHandling.Ignore)]
        public double? GenerationNum { get; set; }

        /// <summary>
        /// Indicates if the tag is deleted
        /// </summary>
        [JsonProperty("isDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeleted { get; set; }

        /// <summary>
        /// Indicates if the tag is hidden
        /// </summary>
        [JsonProperty("isHidden", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// Indicates if the tag is from external system
        /// </summary>
        [JsonProperty("isExternal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Gets or sets IsDeprecated.
        /// </summary>
        [JsonProperty("isDeprecated", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeprecated { get; set; }

        /// <summary>
        /// Date and time when group was created
        /// </summary>
        [JsonProperty("created", NullValueHandling = NullValueHandling.Ignore)]
        public double? Created { get; set; }

        /// <summary>
        /// Date and time of last modification of the group
        /// </summary>
        [JsonProperty("modified", NullValueHandling = NullValueHandling.Ignore)]
        public double? Modified { get; set; }

        /// <summary>
        /// Gets or sets ModifiedBy.
        /// </summary>
        [JsonProperty("modifiedBy", NullValueHandling = NullValueHandling.Ignore)]
        public Models.TagNameAndID ModifiedBy { get; set; }

        /// <summary>
        /// Gets or sets Author.
        /// </summary>
        [JsonProperty("author", NullValueHandling = NullValueHandling.Ignore)]
        public Models.TagNameAndID Author { get; set; }

        /// <summary>
        /// Gets or sets Owner.
        /// </summary>
        [JsonProperty("owner", NullValueHandling = NullValueHandling.Ignore)]
        public Models.TagNameAndID Owner { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"MetadataTagResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is MetadataTagResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.ClientState == null && other.ClientState == null) || (this.ClientState?.Equals(other.ClientState) == true)) &&
                ((this.IndexVersion == null && other.IndexVersion == null) || (this.IndexVersion?.Equals(other.IndexVersion) == true)) &&
                ((this.GenerationNum == null && other.GenerationNum == null) || (this.GenerationNum?.Equals(other.GenerationNum) == true)) &&
                ((this.IsDeleted == null && other.IsDeleted == null) || (this.IsDeleted?.Equals(other.IsDeleted) == true)) &&
                ((this.IsHidden == null && other.IsHidden == null) || (this.IsHidden?.Equals(other.IsHidden) == true)) &&
                ((this.IsExternal == null && other.IsExternal == null) || (this.IsExternal?.Equals(other.IsExternal) == true)) &&
                ((this.IsDeprecated == null && other.IsDeprecated == null) || (this.IsDeprecated?.Equals(other.IsDeprecated) == true)) &&
                ((this.Created == null && other.Created == null) || (this.Created?.Equals(other.Created) == true)) &&
                ((this.Modified == null && other.Modified == null) || (this.Modified?.Equals(other.Modified) == true)) &&
                ((this.ModifiedBy == null && other.ModifiedBy == null) || (this.ModifiedBy?.Equals(other.ModifiedBy) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.ClientState = {(this.ClientState == null ? "null" : this.ClientState.ToString())}");
            toStringOutput.Add($"this.IndexVersion = {(this.IndexVersion == null ? "null" : this.IndexVersion.ToString())}");
            toStringOutput.Add($"this.GenerationNum = {(this.GenerationNum == null ? "null" : this.GenerationNum.ToString())}");
            toStringOutput.Add($"this.IsDeleted = {(this.IsDeleted == null ? "null" : this.IsDeleted.ToString())}");
            toStringOutput.Add($"this.IsHidden = {(this.IsHidden == null ? "null" : this.IsHidden.ToString())}");
            toStringOutput.Add($"this.IsExternal = {(this.IsExternal == null ? "null" : this.IsExternal.ToString())}");
            toStringOutput.Add($"this.IsDeprecated = {(this.IsDeprecated == null ? "null" : this.IsDeprecated.ToString())}");
            toStringOutput.Add($"this.Created = {(this.Created == null ? "null" : this.Created.ToString())}");
            toStringOutput.Add($"this.Modified = {(this.Modified == null ? "null" : this.Modified.ToString())}");
            toStringOutput.Add($"this.ModifiedBy = {(this.ModifiedBy == null ? "null" : this.ModifiedBy.ToString())}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author.ToString())}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner.ToString())}");
        }
    }
}