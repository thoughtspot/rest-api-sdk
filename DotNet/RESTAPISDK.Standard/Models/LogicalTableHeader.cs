// <copyright file="LogicalTableHeader.cs" company="APIMatic">
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
    /// LogicalTableHeader.
    /// </summary>
    public class LogicalTableHeader
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LogicalTableHeader"/> class.
        /// </summary>
        public LogicalTableHeader()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LogicalTableHeader"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="author">author.</param>
        /// <param name="authorName">authorName.</param>
        /// <param name="authorDisplayName">authorDisplayName.</param>
        /// <param name="created">created.</param>
        /// <param name="modified">modified.</param>
        /// <param name="modifiedBy">modifiedBy.</param>
        /// <param name="generationNum">generationNum.</param>
        /// <param name="owner">owner.</param>
        /// <param name="deleted">deleted.</param>
        /// <param name="hidden">hidden.</param>
        /// <param name="database">database.</param>
        /// <param name="schema">schema.</param>
        /// <param name="type">type.</param>
        /// <param name="subType">subType.</param>
        public LogicalTableHeader(
            string id = null,
            string name = null,
            string author = null,
            string authorName = null,
            string authorDisplayName = null,
            double? created = null,
            double? modified = null,
            string modifiedBy = null,
            int? generationNum = null,
            string owner = null,
            Models.LogicalTableHeaderDeletedEnum? deleted = null,
            Models.LogicalTableHeaderHiddenEnum? hidden = null,
            string database = null,
            string schema = null,
            string type = null,
            string subType = null)
        {
            this.Id = id;
            this.Name = name;
            this.Author = author;
            this.AuthorName = authorName;
            this.AuthorDisplayName = authorDisplayName;
            this.Created = created;
            this.Modified = modified;
            this.ModifiedBy = modifiedBy;
            this.GenerationNum = generationNum;
            this.Owner = owner;
            this.Deleted = deleted;
            this.Hidden = hidden;
            this.Database = database;
            this.Schema = schema;
            this.Type = type;
            this.SubType = subType;
        }

        /// <summary>
        /// Gets or sets Id.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets Name.
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets Author.
        /// </summary>
        [JsonProperty("author", NullValueHandling = NullValueHandling.Ignore)]
        public string Author { get; set; }

        /// <summary>
        /// Gets or sets AuthorName.
        /// </summary>
        [JsonProperty("authorName", NullValueHandling = NullValueHandling.Ignore)]
        public string AuthorName { get; set; }

        /// <summary>
        /// Gets or sets AuthorDisplayName.
        /// </summary>
        [JsonProperty("authorDisplayName", NullValueHandling = NullValueHandling.Ignore)]
        public string AuthorDisplayName { get; set; }

        /// <summary>
        /// Gets or sets Created.
        /// </summary>
        [JsonProperty("created", NullValueHandling = NullValueHandling.Ignore)]
        public double? Created { get; set; }

        /// <summary>
        /// Gets or sets Modified.
        /// </summary>
        [JsonProperty("modified", NullValueHandling = NullValueHandling.Ignore)]
        public double? Modified { get; set; }

        /// <summary>
        /// Gets or sets ModifiedBy.
        /// </summary>
        [JsonProperty("modifiedBy", NullValueHandling = NullValueHandling.Ignore)]
        public string ModifiedBy { get; set; }

        /// <summary>
        /// Gets or sets GenerationNum.
        /// </summary>
        [JsonProperty("generationNum", NullValueHandling = NullValueHandling.Ignore)]
        public int? GenerationNum { get; set; }

        /// <summary>
        /// Gets or sets Owner.
        /// </summary>
        [JsonProperty("owner", NullValueHandling = NullValueHandling.Ignore)]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or sets Deleted.
        /// </summary>
        [JsonProperty("deleted", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.LogicalTableHeaderDeletedEnum? Deleted { get; set; }

        /// <summary>
        /// Gets or sets Hidden.
        /// </summary>
        [JsonProperty("hidden", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.LogicalTableHeaderHiddenEnum? Hidden { get; set; }

        /// <summary>
        /// Gets or sets Database.
        /// </summary>
        [JsonProperty("database", NullValueHandling = NullValueHandling.Ignore)]
        public string Database { get; set; }

        /// <summary>
        /// Gets or sets Schema.
        /// </summary>
        [JsonProperty("schema", NullValueHandling = NullValueHandling.Ignore)]
        public string Schema { get; set; }

        /// <summary>
        /// Gets or sets Type.
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets SubType.
        /// </summary>
        [JsonProperty("subType", NullValueHandling = NullValueHandling.Ignore)]
        public string SubType { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"LogicalTableHeader : ({string.Join(", ", toStringOutput)})";
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

            return obj is LogicalTableHeader other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.AuthorName == null && other.AuthorName == null) || (this.AuthorName?.Equals(other.AuthorName) == true)) &&
                ((this.AuthorDisplayName == null && other.AuthorDisplayName == null) || (this.AuthorDisplayName?.Equals(other.AuthorDisplayName) == true)) &&
                ((this.Created == null && other.Created == null) || (this.Created?.Equals(other.Created) == true)) &&
                ((this.Modified == null && other.Modified == null) || (this.Modified?.Equals(other.Modified) == true)) &&
                ((this.ModifiedBy == null && other.ModifiedBy == null) || (this.ModifiedBy?.Equals(other.ModifiedBy) == true)) &&
                ((this.GenerationNum == null && other.GenerationNum == null) || (this.GenerationNum?.Equals(other.GenerationNum) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true)) &&
                ((this.Deleted == null && other.Deleted == null) || (this.Deleted?.Equals(other.Deleted) == true)) &&
                ((this.Hidden == null && other.Hidden == null) || (this.Hidden?.Equals(other.Hidden) == true)) &&
                ((this.Database == null && other.Database == null) || (this.Database?.Equals(other.Database) == true)) &&
                ((this.Schema == null && other.Schema == null) || (this.Schema?.Equals(other.Schema) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.SubType == null && other.SubType == null) || (this.SubType?.Equals(other.SubType) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author == string.Empty ? "" : this.Author)}");
            toStringOutput.Add($"this.AuthorName = {(this.AuthorName == null ? "null" : this.AuthorName == string.Empty ? "" : this.AuthorName)}");
            toStringOutput.Add($"this.AuthorDisplayName = {(this.AuthorDisplayName == null ? "null" : this.AuthorDisplayName == string.Empty ? "" : this.AuthorDisplayName)}");
            toStringOutput.Add($"this.Created = {(this.Created == null ? "null" : this.Created.ToString())}");
            toStringOutput.Add($"this.Modified = {(this.Modified == null ? "null" : this.Modified.ToString())}");
            toStringOutput.Add($"this.ModifiedBy = {(this.ModifiedBy == null ? "null" : this.ModifiedBy == string.Empty ? "" : this.ModifiedBy)}");
            toStringOutput.Add($"this.GenerationNum = {(this.GenerationNum == null ? "null" : this.GenerationNum.ToString())}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner == string.Empty ? "" : this.Owner)}");
            toStringOutput.Add($"this.Deleted = {(this.Deleted == null ? "null" : this.Deleted.ToString())}");
            toStringOutput.Add($"this.Hidden = {(this.Hidden == null ? "null" : this.Hidden.ToString())}");
            toStringOutput.Add($"this.Database = {(this.Database == null ? "null" : this.Database == string.Empty ? "" : this.Database)}");
            toStringOutput.Add($"this.Schema = {(this.Schema == null ? "null" : this.Schema == string.Empty ? "" : this.Schema)}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.SubType = {(this.SubType == null ? "null" : this.SubType == string.Empty ? "" : this.SubType)}");
        }
    }
}