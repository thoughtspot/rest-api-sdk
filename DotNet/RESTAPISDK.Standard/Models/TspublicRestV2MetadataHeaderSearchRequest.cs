// <copyright file="TspublicRestV2MetadataHeaderSearchRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataHeaderSearchRequest.
    /// </summary>
    public class TspublicRestV2MetadataHeaderSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataHeaderSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataHeaderSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataHeaderSearchRequest"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="outputFields">outputFields.</param>
        /// <param name="offset">offset.</param>
        /// <param name="batchNumber">batchNumber.</param>
        /// <param name="batchSize">batchSize.</param>
        /// <param name="sortBy">sortBy.</param>
        /// <param name="sortOrder">sortOrder.</param>
        /// <param name="namePattern">namePattern.</param>
        /// <param name="fetchId">fetchId.</param>
        /// <param name="skipId">skipId.</param>
        /// <param name="showHidden">showHidden.</param>
        /// <param name="autoCreated">autoCreated.</param>
        /// <param name="accessLevel">accessLevel.</param>
        /// <param name="tag">tag.</param>
        /// <param name="favoriteFor">favoriteFor.</param>
        /// <param name="author">author.</param>
        /// <param name="lastModifiedBy">lastModifiedBy.</param>
        public TspublicRestV2MetadataHeaderSearchRequest(
            Models.SearchObjectHeaderTypeEnum type,
            List<string> outputFields = null,
            int? offset = 0,
            int? batchNumber = null,
            int? batchSize = null,
            Models.SearchObjectHeaderSortByEnum? sortBy = Models.SearchObjectHeaderSortByEnum.DEFAULT,
            Models.SearchObjectHeaderSortOrderEnum? sortOrder = Models.SearchObjectHeaderSortOrderEnum.DEFAULT,
            string namePattern = null,
            List<string> fetchId = null,
            List<string> skipId = null,
            Models.SearchObjectHeaderShowHiddenEnum? showHidden = Models.SearchObjectHeaderShowHiddenEnum.False,
            Models.SearchObjectHeaderAutoCreatedEnum? autoCreated = null,
            List<Models.AccessLevelInput> accessLevel = null,
            List<Models.TagNameAndIdInput> tag = null,
            List<Models.NameAndIdInput> favoriteFor = null,
            List<Models.NameAndIdInput> author = null,
            List<Models.NameAndIdInput> lastModifiedBy = null)
        {
            this.OutputFields = outputFields;
            this.Offset = offset;
            this.BatchNumber = batchNumber;
            this.BatchSize = batchSize;
            this.SortBy = sortBy;
            this.SortOrder = sortOrder;
            this.Type = type;
            this.NamePattern = namePattern;
            this.FetchId = fetchId;
            this.SkipId = skipId;
            this.ShowHidden = showHidden;
            this.AutoCreated = autoCreated;
            this.AccessLevel = accessLevel;
            this.Tag = tag;
            this.FavoriteFor = favoriteFor;
            this.Author = author;
            this.LastModifiedBy = lastModifiedBy;
        }

        /// <summary>
        /// Array of header field names that need to be included in the header response
        /// </summary>
        [JsonProperty("outputFields", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> OutputFields { get; set; }

        /// <summary>
        /// The offset point, starting from where the records should be included in the response.
        ///  If no input is provided then offset starts from 0.
        /// </summary>
        [JsonProperty("offset", NullValueHandling = NullValueHandling.Ignore)]
        public int? Offset { get; set; }

        /// <summary>
        /// An alternate way to set offset for the starting point of the response.
        ///  The value in offset field will not be considered if batchNumber field has value greater than 0.
        ///  Offset value will be calculated as (batchNumber - 1) * batchSize.
        ///  It is mandatory to provide a value for batchSize with batchNumber.
        ///  Example:
        ///  Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.
        /// </summary>
        [JsonProperty("batchNumber", NullValueHandling = NullValueHandling.Ignore)]
        public int? BatchNumber { get; set; }

        /// <summary>
        /// The number of records that should be included in the response starting from offset position.
        ///  If no input is provided, then all records starting from the value provided in offset is included in the response.
        /// </summary>
        [JsonProperty("batchSize", NullValueHandling = NullValueHandling.Ignore)]
        public int? BatchSize { get; set; }

        /// <summary>
        /// Field based on which the response needs to be ordered.
        /// </summary>
        [JsonProperty("sortBy", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.SearchObjectHeaderSortByEnum? SortBy { get; set; }

        /// <summary>
        /// Order in which sortBy should be applied.
        /// </summary>
        [JsonProperty("sortOrder", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.SearchObjectHeaderSortOrderEnum? SortOrder { get; set; }

        /// <summary>
        /// Type of the metadata object being searched.
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.SearchObjectHeaderTypeEnum Type { get; set; }

        /// <summary>
        /// A pattern to match the name of the metadata object. This parameter supports matching case-insensitive strings. For a wildcard match, use %.
        /// </summary>
        [JsonProperty("namePattern", NullValueHandling = NullValueHandling.Ignore)]
        public string NamePattern { get; set; }

        /// <summary>
        /// A JSON array containing the GUIDs of the metadata objects that you want to fetch.
        /// </summary>
        [JsonProperty("fetchId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> FetchId { get; set; }

        /// <summary>
        /// A JSON array containing the GUIDs of the metadata objects that you want to skip.
        /// </summary>
        [JsonProperty("skipId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> SkipId { get; set; }

        /// <summary>
        /// When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.
        /// </summary>
        [JsonProperty("showHidden", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.SearchObjectHeaderShowHiddenEnum? ShowHidden { get; set; }

        /// <summary>
        /// A flag to indicate whether to list only the auto created objects. When no value is provided as input then all objects are returned.
        /// </summary>
        [JsonProperty("autoCreated", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.SearchObjectHeaderAutoCreatedEnum? AutoCreated { get; set; }

        /// <summary>
        /// A JSON array of objects with user details for which the metadata objects should be considered from the repository If you specify ID or name of user and set the type parameter to USER, the API returns metadata objects associated with the user If you specify ID or name of user group and set the type parameter to USER_GROUP, the API returns metadata objects for all the users mapped to the specified user group. If the id or name parameter is not defined, but the type attribute is set to USER or USER_GROUP, then the API will not return and response. If no input is provided for any field for this object, then the API returns headers for all users. If both name and id is provided, then id will be considered.
        /// </summary>
        [JsonProperty("accessLevel", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.AccessLevelInput> AccessLevel { get; set; }

        /// <summary>
        /// A JSON array of name or GUID of tags or both. When both are given then id is considered.
        /// </summary>
        [JsonProperty("tag", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.TagNameAndIdInput> Tag { get; set; }

        /// <summary>
        /// A JSON array of name or GUID of the user or both for whom the object is assigned as favorite. When both are given then id is considered.
        /// </summary>
        [JsonProperty("favoriteFor", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.NameAndIdInput> FavoriteFor { get; set; }

        /// <summary>
        /// A JSON array of name or GUID of the user or both who created the object. When both are given then id is considered.
        /// </summary>
        [JsonProperty("author", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.NameAndIdInput> Author { get; set; }

        /// <summary>
        /// A JSON array of name or GUID of the user or both who last modified the object. When both are given then id is considered.
        /// </summary>
        [JsonProperty("lastModifiedBy", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.NameAndIdInput> LastModifiedBy { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataHeaderSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataHeaderSearchRequest other &&
                ((this.OutputFields == null && other.OutputFields == null) || (this.OutputFields?.Equals(other.OutputFields) == true)) &&
                ((this.Offset == null && other.Offset == null) || (this.Offset?.Equals(other.Offset) == true)) &&
                ((this.BatchNumber == null && other.BatchNumber == null) || (this.BatchNumber?.Equals(other.BatchNumber) == true)) &&
                ((this.BatchSize == null && other.BatchSize == null) || (this.BatchSize?.Equals(other.BatchSize) == true)) &&
                ((this.SortBy == null && other.SortBy == null) || (this.SortBy?.Equals(other.SortBy) == true)) &&
                ((this.SortOrder == null && other.SortOrder == null) || (this.SortOrder?.Equals(other.SortOrder) == true)) &&
                this.Type.Equals(other.Type) &&
                ((this.NamePattern == null && other.NamePattern == null) || (this.NamePattern?.Equals(other.NamePattern) == true)) &&
                ((this.FetchId == null && other.FetchId == null) || (this.FetchId?.Equals(other.FetchId) == true)) &&
                ((this.SkipId == null && other.SkipId == null) || (this.SkipId?.Equals(other.SkipId) == true)) &&
                ((this.ShowHidden == null && other.ShowHidden == null) || (this.ShowHidden?.Equals(other.ShowHidden) == true)) &&
                ((this.AutoCreated == null && other.AutoCreated == null) || (this.AutoCreated?.Equals(other.AutoCreated) == true)) &&
                ((this.AccessLevel == null && other.AccessLevel == null) || (this.AccessLevel?.Equals(other.AccessLevel) == true)) &&
                ((this.Tag == null && other.Tag == null) || (this.Tag?.Equals(other.Tag) == true)) &&
                ((this.FavoriteFor == null && other.FavoriteFor == null) || (this.FavoriteFor?.Equals(other.FavoriteFor) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.LastModifiedBy == null && other.LastModifiedBy == null) || (this.LastModifiedBy?.Equals(other.LastModifiedBy) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.OutputFields = {(this.OutputFields == null ? "null" : $"[{string.Join(", ", this.OutputFields)} ]")}");
            toStringOutput.Add($"this.Offset = {(this.Offset == null ? "null" : this.Offset.ToString())}");
            toStringOutput.Add($"this.BatchNumber = {(this.BatchNumber == null ? "null" : this.BatchNumber.ToString())}");
            toStringOutput.Add($"this.BatchSize = {(this.BatchSize == null ? "null" : this.BatchSize.ToString())}");
            toStringOutput.Add($"this.SortBy = {(this.SortBy == null ? "null" : this.SortBy.ToString())}");
            toStringOutput.Add($"this.SortOrder = {(this.SortOrder == null ? "null" : this.SortOrder.ToString())}");
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.NamePattern = {(this.NamePattern == null ? "null" : this.NamePattern == string.Empty ? "" : this.NamePattern)}");
            toStringOutput.Add($"this.FetchId = {(this.FetchId == null ? "null" : $"[{string.Join(", ", this.FetchId)} ]")}");
            toStringOutput.Add($"this.SkipId = {(this.SkipId == null ? "null" : $"[{string.Join(", ", this.SkipId)} ]")}");
            toStringOutput.Add($"this.ShowHidden = {(this.ShowHidden == null ? "null" : this.ShowHidden.ToString())}");
            toStringOutput.Add($"this.AutoCreated = {(this.AutoCreated == null ? "null" : this.AutoCreated.ToString())}");
            toStringOutput.Add($"this.AccessLevel = {(this.AccessLevel == null ? "null" : $"[{string.Join(", ", this.AccessLevel)} ]")}");
            toStringOutput.Add($"this.Tag = {(this.Tag == null ? "null" : $"[{string.Join(", ", this.Tag)} ]")}");
            toStringOutput.Add($"this.FavoriteFor = {(this.FavoriteFor == null ? "null" : $"[{string.Join(", ", this.FavoriteFor)} ]")}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : $"[{string.Join(", ", this.Author)} ]")}");
            toStringOutput.Add($"this.LastModifiedBy = {(this.LastModifiedBy == null ? "null" : $"[{string.Join(", ", this.LastModifiedBy)} ]")}");
        }
    }
}