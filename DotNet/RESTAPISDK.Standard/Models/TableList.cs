// <copyright file="TableList.cs" company="APIMatic">
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
    /// TableList.
    /// </summary>
    public class TableList
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TableList"/> class.
        /// </summary>
        public TableList()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TableList"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="type">type.</param>
        /// <param name="id">id.</param>
        /// <param name="databaseStripe">databaseStripe.</param>
        /// <param name="schemaStripe">schemaStripe.</param>
        /// <param name="isExternal">isExternal.</param>
        /// <param name="isDeprecated">isDeprecated.</param>
        /// <param name="isDeleted">isDeleted.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="indexVersion">indexVersion.</param>
        /// <param name="generationNum">generationNum.</param>
        /// <param name="created">created.</param>
        /// <param name="modified">modified.</param>
        /// <param name="author">author.</param>
        /// <param name="modifiedBy">modifiedBy.</param>
        /// <param name="owner">owner.</param>
        /// <param name="tags">tags.</param>
        public TableList(
            string name = null,
            string type = null,
            string id = null,
            string databaseStripe = null,
            string schemaStripe = null,
            bool? isExternal = null,
            bool? isDeprecated = null,
            bool? isDeleted = null,
            bool? isHidden = null,
            int? indexVersion = null,
            int? generationNum = null,
            string created = null,
            string modified = null,
            Models.UserNameAndID author = null,
            Models.UserNameAndID modifiedBy = null,
            Models.UserNameAndID owner = null,
            List<string> tags = null)
        {
            this.Name = name;
            this.Type = type;
            this.Id = id;
            this.DatabaseStripe = databaseStripe;
            this.SchemaStripe = schemaStripe;
            this.IsExternal = isExternal;
            this.IsDeprecated = isDeprecated;
            this.IsDeleted = isDeleted;
            this.IsHidden = isHidden;
            this.IndexVersion = indexVersion;
            this.GenerationNum = generationNum;
            this.Created = created;
            this.Modified = modified;
            this.Author = author;
            this.ModifiedBy = modifiedBy;
            this.Owner = owner;
            this.Tags = tags;
        }

        /// <summary>
        /// Name of the table
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Type of the table
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// GUID of the table
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the database to which the table belongs
        /// </summary>
        [JsonProperty("databaseStripe", NullValueHandling = NullValueHandling.Ignore)]
        public string DatabaseStripe { get; set; }

        /// <summary>
        /// Name of the schema to which the table belongs
        /// </summary>
        [JsonProperty("schemaStripe", NullValueHandling = NullValueHandling.Ignore)]
        public string SchemaStripe { get; set; }

        /// <summary>
        /// Gets or sets IsExternal.
        /// </summary>
        [JsonProperty("isExternal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Indicates if the table is deprecated
        /// </summary>
        [JsonProperty("isDeprecated", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeprecated { get; set; }

        /// <summary>
        /// Indicates if the table is deleted
        /// </summary>
        [JsonProperty("isDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeleted { get; set; }

        /// <summary>
        /// Indicates if the table is hideen
        /// </summary>
        [JsonProperty("isHidden", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsHidden { get; set; }

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
        /// Date and time when the table was created
        /// </summary>
        [JsonProperty("created", NullValueHandling = NullValueHandling.Ignore)]
        public string Created { get; set; }

        /// <summary>
        /// Date and time of last modification of the table
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
        /// List of tags assigned to the table
        /// </summary>
        [JsonProperty("tags", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Tags { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TableList : ({string.Join(", ", toStringOutput)})";
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

            return obj is TableList other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.DatabaseStripe == null && other.DatabaseStripe == null) || (this.DatabaseStripe?.Equals(other.DatabaseStripe) == true)) &&
                ((this.SchemaStripe == null && other.SchemaStripe == null) || (this.SchemaStripe?.Equals(other.SchemaStripe) == true)) &&
                ((this.IsExternal == null && other.IsExternal == null) || (this.IsExternal?.Equals(other.IsExternal) == true)) &&
                ((this.IsDeprecated == null && other.IsDeprecated == null) || (this.IsDeprecated?.Equals(other.IsDeprecated) == true)) &&
                ((this.IsDeleted == null && other.IsDeleted == null) || (this.IsDeleted?.Equals(other.IsDeleted) == true)) &&
                ((this.IsHidden == null && other.IsHidden == null) || (this.IsHidden?.Equals(other.IsHidden) == true)) &&
                ((this.IndexVersion == null && other.IndexVersion == null) || (this.IndexVersion?.Equals(other.IndexVersion) == true)) &&
                ((this.GenerationNum == null && other.GenerationNum == null) || (this.GenerationNum?.Equals(other.GenerationNum) == true)) &&
                ((this.Created == null && other.Created == null) || (this.Created?.Equals(other.Created) == true)) &&
                ((this.Modified == null && other.Modified == null) || (this.Modified?.Equals(other.Modified) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.ModifiedBy == null && other.ModifiedBy == null) || (this.ModifiedBy?.Equals(other.ModifiedBy) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true)) &&
                ((this.Tags == null && other.Tags == null) || (this.Tags?.Equals(other.Tags) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.DatabaseStripe = {(this.DatabaseStripe == null ? "null" : this.DatabaseStripe == string.Empty ? "" : this.DatabaseStripe)}");
            toStringOutput.Add($"this.SchemaStripe = {(this.SchemaStripe == null ? "null" : this.SchemaStripe == string.Empty ? "" : this.SchemaStripe)}");
            toStringOutput.Add($"this.IsExternal = {(this.IsExternal == null ? "null" : this.IsExternal.ToString())}");
            toStringOutput.Add($"this.IsDeprecated = {(this.IsDeprecated == null ? "null" : this.IsDeprecated.ToString())}");
            toStringOutput.Add($"this.IsDeleted = {(this.IsDeleted == null ? "null" : this.IsDeleted.ToString())}");
            toStringOutput.Add($"this.IsHidden = {(this.IsHidden == null ? "null" : this.IsHidden.ToString())}");
            toStringOutput.Add($"this.IndexVersion = {(this.IndexVersion == null ? "null" : this.IndexVersion.ToString())}");
            toStringOutput.Add($"this.GenerationNum = {(this.GenerationNum == null ? "null" : this.GenerationNum.ToString())}");
            toStringOutput.Add($"this.Created = {(this.Created == null ? "null" : this.Created == string.Empty ? "" : this.Created)}");
            toStringOutput.Add($"this.Modified = {(this.Modified == null ? "null" : this.Modified == string.Empty ? "" : this.Modified)}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author.ToString())}");
            toStringOutput.Add($"this.ModifiedBy = {(this.ModifiedBy == null ? "null" : this.ModifiedBy.ToString())}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner.ToString())}");
            toStringOutput.Add($"this.Tags = {(this.Tags == null ? "null" : $"[{string.Join(", ", this.Tags)} ]")}");
        }
    }
}