// <copyright file="SecurityPermissionResponse.cs" company="APIMatic">
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
    /// SecurityPermissionResponse.
    /// </summary>
    public class SecurityPermissionResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityPermissionResponse"/> class.
        /// </summary>
        public SecurityPermissionResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityPermissionResponse"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="type">type.</param>
        /// <param name="owner">owner.</param>
        /// <param name="author">author.</param>
        /// <param name="permissions">permissions.</param>
        /// <param name="dependents">dependents.</param>
        public SecurityPermissionResponse(
            string id = null,
            string name = null,
            string type = null,
            string owner = null,
            Models.UserNameAndID author = null,
            List<Models.SecurityPermission> permissions = null,
            List<Models.SecuirityDependents> dependents = null)
        {
            this.Id = id;
            this.Name = name;
            this.Type = type;
            this.Owner = owner;
            this.Author = author;
            this.Permissions = permissions;
            this.Dependents = dependents;
        }

        /// <summary>
        /// GUID of the object
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the object
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Indicates the type of the object
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// GUID of the owner of the object
        /// </summary>
        [JsonProperty("owner", NullValueHandling = NullValueHandling.Ignore)]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or sets Author.
        /// </summary>
        [JsonProperty("author", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID Author { get; set; }

        /// <summary>
        /// An array of object with details of permission on users and user groups
        /// </summary>
        [JsonProperty("permissions", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.SecurityPermission> Permissions { get; set; }

        /// <summary>
        /// The objects on which the primary object is dependent on
        /// </summary>
        [JsonProperty("dependents", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.SecuirityDependents> Dependents { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"SecurityPermissionResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is SecurityPermissionResponse other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.Permissions == null && other.Permissions == null) || (this.Permissions?.Equals(other.Permissions) == true)) &&
                ((this.Dependents == null && other.Dependents == null) || (this.Dependents?.Equals(other.Dependents) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner == string.Empty ? "" : this.Owner)}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author.ToString())}");
            toStringOutput.Add($"this.Permissions = {(this.Permissions == null ? "null" : $"[{string.Join(", ", this.Permissions)} ]")}");
            toStringOutput.Add($"this.Dependents = {(this.Dependents == null ? "null" : $"[{string.Join(", ", this.Dependents)} ]")}");
        }
    }
}