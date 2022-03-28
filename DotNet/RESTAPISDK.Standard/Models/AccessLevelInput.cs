// <copyright file="AccessLevelInput.cs" company="APIMatic">
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
    /// AccessLevelInput.
    /// </summary>
    public class AccessLevelInput
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccessLevelInput"/> class.
        /// </summary>
        public AccessLevelInput()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AccessLevelInput"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="type">type.</param>
        /// <param name="access">access.</param>
        public AccessLevelInput(
            string name = null,
            string id = null,
            Models.Type1Enum? type = null,
            Models.AccessEnum? access = null)
        {
            this.Name = name;
            this.Id = id;
            this.Type = type;
            this.Access = access;
        }

        /// <summary>
        /// Username or name of the user group
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// GUID of the user or user group
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Type of access detail provided
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.Type1Enum? Type { get; set; }

        /// <summary>
        /// Minimum access level that the specified user or user group has. If no input is provided then minimum access of READ_ONLY will be considered.
        /// </summary>
        [JsonProperty("access", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.AccessEnum? Access { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"AccessLevelInput : ({string.Join(", ", toStringOutput)})";
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

            return obj is AccessLevelInput other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Access == null && other.Access == null) || (this.Access?.Equals(other.Access) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type.ToString())}");
            toStringOutput.Add($"this.Access = {(this.Access == null ? "null" : this.Access.ToString())}");
        }
    }
}