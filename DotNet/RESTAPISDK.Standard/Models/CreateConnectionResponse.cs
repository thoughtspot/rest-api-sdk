// <copyright file="CreateConnectionResponse.cs" company="APIMatic">
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
    /// CreateConnectionResponse.
    /// </summary>
    public class CreateConnectionResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateConnectionResponse"/> class.
        /// </summary>
        public CreateConnectionResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateConnectionResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="description">description.</param>
        /// <param name="type">type.</param>
        /// <param name="id">id.</param>
        /// <param name="scheduled">scheduled.</param>
        /// <param name="connectionType">connectionType.</param>
        /// <param name="configuration">configuration.</param>
        /// <param name="isExternal">isExternal.</param>
        /// <param name="isDeprecated">isDeprecated.</param>
        /// <param name="isDeleted">isDeleted.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="complete">complete.</param>
        /// <param name="indexVersion">indexVersion.</param>
        /// <param name="generationNum">generationNum.</param>
        /// <param name="created">created.</param>
        /// <param name="modified">modified.</param>
        /// <param name="author">author.</param>
        /// <param name="modifiedBy">modifiedBy.</param>
        /// <param name="owner">owner.</param>
        /// <param name="tags">tags.</param>
        /// <param name="tables">tables.</param>
        public CreateConnectionResponse(
            string name = null,
            string description = null,
            string type = null,
            string id = null,
            bool? scheduled = null,
            string connectionType = null,
            string configuration = null,
            bool? isExternal = null,
            bool? isDeprecated = null,
            bool? isDeleted = null,
            bool? isHidden = null,
            bool? complete = null,
            int? indexVersion = null,
            int? generationNum = null,
            string created = null,
            string modified = null,
            Models.UserNameAndID author = null,
            Models.UserNameAndID modifiedBy = null,
            Models.UserNameAndID owner = null,
            List<string> tags = null,
            List<string> tables = null)
        {
            this.Name = name;
            this.Description = description;
            this.Type = type;
            this.Id = id;
            this.Scheduled = scheduled;
            this.ConnectionType = connectionType;
            this.Configuration = configuration;
            this.IsExternal = isExternal;
            this.IsDeprecated = isDeprecated;
            this.IsDeleted = isDeleted;
            this.IsHidden = isHidden;
            this.Complete = complete;
            this.IndexVersion = indexVersion;
            this.GenerationNum = generationNum;
            this.Created = created;
            this.Modified = modified;
            this.Author = author;
            this.ModifiedBy = modifiedBy;
            this.Owner = owner;
            this.Tags = tags;
            this.Tables = tables;
        }

        /// <summary>
        /// Name of the connection
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Description associated with the connection
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// Type of the connection. The database associated with this type can be obtained from theI response returned by the /api/rest/v2/connection/types API endpoint.
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// GUID of the connection
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Indicates if the data sync is scheduled for this connection
        /// </summary>
        [JsonProperty("scheduled", NullValueHandling = NullValueHandling.Ignore)]
        public bool? Scheduled { get; set; }

        /// <summary>
        /// Gets or sets ConnectionType.
        /// </summary>
        [JsonProperty("connectionType", NullValueHandling = NullValueHandling.Ignore)]
        public string ConnectionType { get; set; }

        /// <summary>
        /// Configuration properties of the connection
        /// </summary>
        [JsonProperty("configuration", NullValueHandling = NullValueHandling.Ignore)]
        public string Configuration { get; set; }

        /// <summary>
        /// Gets or sets IsExternal.
        /// </summary>
        [JsonProperty("isExternal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Indicates if the connection is deprecated
        /// </summary>
        [JsonProperty("isDeprecated", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeprecated { get; set; }

        /// <summary>
        /// Indicates if the connection is deleted
        /// </summary>
        [JsonProperty("isDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeleted { get; set; }

        /// <summary>
        /// Indicates if the connection is hideen
        /// </summary>
        [JsonProperty("isHidden", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// Indicates if the all the properties of connection is provided
        /// </summary>
        [JsonProperty("complete", NullValueHandling = NullValueHandling.Ignore)]
        public bool? Complete { get; set; }

        /// <summary>
        /// Gets or sets IndexVersion.
        /// </summary>
        [JsonProperty("indexVersion", NullValueHandling = NullValueHandling.Ignore)]
        public int? IndexVersion { get; set; }

        /// <summary>
        /// Gets or sets GenerationNum.
        /// </summary>
        [JsonProperty("generationNum", NullValueHandling = NullValueHandling.Ignore)]
        public int? GenerationNum { get; set; }

        /// <summary>
        /// Date and time when user account was created
        /// </summary>
        [JsonProperty("created", NullValueHandling = NullValueHandling.Ignore)]
        public string Created { get; set; }

        /// <summary>
        /// Date and time of last modification of user account
        /// </summary>
        [JsonProperty("modified", NullValueHandling = NullValueHandling.Ignore)]
        public string Modified { get; set; }

        /// <summary>
        /// Gets or sets Author.
        /// </summary>
        [JsonProperty("author", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID Author { get; set; }

        /// <summary>
        /// Gets or sets ModifiedBy.
        /// </summary>
        [JsonProperty("modifiedBy", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID ModifiedBy { get; set; }

        /// <summary>
        /// Gets or sets Owner.
        /// </summary>
        [JsonProperty("owner", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID Owner { get; set; }

        /// <summary>
        /// List of tags assigned to the connection
        /// </summary>
        [JsonProperty("tags", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// List of tables linked to this connection and details of the columns in the table
        /// </summary>
        [JsonProperty("tables", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Tables { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"CreateConnectionResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is CreateConnectionResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Scheduled == null && other.Scheduled == null) || (this.Scheduled?.Equals(other.Scheduled) == true)) &&
                ((this.ConnectionType == null && other.ConnectionType == null) || (this.ConnectionType?.Equals(other.ConnectionType) == true)) &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true)) &&
                ((this.IsExternal == null && other.IsExternal == null) || (this.IsExternal?.Equals(other.IsExternal) == true)) &&
                ((this.IsDeprecated == null && other.IsDeprecated == null) || (this.IsDeprecated?.Equals(other.IsDeprecated) == true)) &&
                ((this.IsDeleted == null && other.IsDeleted == null) || (this.IsDeleted?.Equals(other.IsDeleted) == true)) &&
                ((this.IsHidden == null && other.IsHidden == null) || (this.IsHidden?.Equals(other.IsHidden) == true)) &&
                ((this.Complete == null && other.Complete == null) || (this.Complete?.Equals(other.Complete) == true)) &&
                ((this.IndexVersion == null && other.IndexVersion == null) || (this.IndexVersion?.Equals(other.IndexVersion) == true)) &&
                ((this.GenerationNum == null && other.GenerationNum == null) || (this.GenerationNum?.Equals(other.GenerationNum) == true)) &&
                ((this.Created == null && other.Created == null) || (this.Created?.Equals(other.Created) == true)) &&
                ((this.Modified == null && other.Modified == null) || (this.Modified?.Equals(other.Modified) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.ModifiedBy == null && other.ModifiedBy == null) || (this.ModifiedBy?.Equals(other.ModifiedBy) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true)) &&
                ((this.Tags == null && other.Tags == null) || (this.Tags?.Equals(other.Tags) == true)) &&
                ((this.Tables == null && other.Tables == null) || (this.Tables?.Equals(other.Tables) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Scheduled = {(this.Scheduled == null ? "null" : this.Scheduled.ToString())}");
            toStringOutput.Add($"this.ConnectionType = {(this.ConnectionType == null ? "null" : this.ConnectionType == string.Empty ? "" : this.ConnectionType)}");
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
            toStringOutput.Add($"this.IsExternal = {(this.IsExternal == null ? "null" : this.IsExternal.ToString())}");
            toStringOutput.Add($"this.IsDeprecated = {(this.IsDeprecated == null ? "null" : this.IsDeprecated.ToString())}");
            toStringOutput.Add($"this.IsDeleted = {(this.IsDeleted == null ? "null" : this.IsDeleted.ToString())}");
            toStringOutput.Add($"this.IsHidden = {(this.IsHidden == null ? "null" : this.IsHidden.ToString())}");
            toStringOutput.Add($"this.Complete = {(this.Complete == null ? "null" : this.Complete.ToString())}");
            toStringOutput.Add($"this.IndexVersion = {(this.IndexVersion == null ? "null" : this.IndexVersion.ToString())}");
            toStringOutput.Add($"this.GenerationNum = {(this.GenerationNum == null ? "null" : this.GenerationNum.ToString())}");
            toStringOutput.Add($"this.Created = {(this.Created == null ? "null" : this.Created == string.Empty ? "" : this.Created)}");
            toStringOutput.Add($"this.Modified = {(this.Modified == null ? "null" : this.Modified == string.Empty ? "" : this.Modified)}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author.ToString())}");
            toStringOutput.Add($"this.ModifiedBy = {(this.ModifiedBy == null ? "null" : this.ModifiedBy.ToString())}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner.ToString())}");
            toStringOutput.Add($"this.Tags = {(this.Tags == null ? "null" : $"[{string.Join(", ", this.Tags)} ]")}");
            toStringOutput.Add($"this.Tables = {(this.Tables == null ? "null" : $"[{string.Join(", ", this.Tables)} ]")}");
        }
    }
}