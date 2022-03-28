// <copyright file="SecurityPermission.cs" company="APIMatic">
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
    /// SecurityPermission.
    /// </summary>
    public class SecurityPermission
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityPermission"/> class.
        /// </summary>
        public SecurityPermission()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityPermission"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="type">type.</param>
        /// <param name="permission">permission.</param>
        /// <param name="sharedPermission">sharedPermission.</param>
        /// <param name="groupPermission">groupPermission.</param>
        public SecurityPermission(
            string id = null,
            string name = null,
            string type = null,
            string permission = null,
            string sharedPermission = null,
            List<Models.GroupPermission> groupPermission = null)
        {
            this.Id = id;
            this.Name = name;
            this.Type = type;
            this.Permission = permission;
            this.SharedPermission = sharedPermission;
            this.GroupPermission = groupPermission;
        }

        /// <summary>
        /// GUID of the user or user group
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the user or user group
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Indicates the type of principal
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// Indicates the permission which user or user group has on the object
        /// </summary>
        [JsonProperty("permission", NullValueHandling = NullValueHandling.Ignore)]
        public string Permission { get; set; }

        /// <summary>
        /// Indicates the permission which user or user group has on the object through sharing of the object with this user or user group
        /// </summary>
        [JsonProperty("sharedPermission", NullValueHandling = NullValueHandling.Ignore)]
        public string SharedPermission { get; set; }

        /// <summary>
        /// An array of object with details of permission on the user groups to which the user or user group belongs
        /// </summary>
        [JsonProperty("groupPermission", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.GroupPermission> GroupPermission { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"SecurityPermission : ({string.Join(", ", toStringOutput)})";
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

            return obj is SecurityPermission other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Permission == null && other.Permission == null) || (this.Permission?.Equals(other.Permission) == true)) &&
                ((this.SharedPermission == null && other.SharedPermission == null) || (this.SharedPermission?.Equals(other.SharedPermission) == true)) &&
                ((this.GroupPermission == null && other.GroupPermission == null) || (this.GroupPermission?.Equals(other.GroupPermission) == true));
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
            toStringOutput.Add($"this.Permission = {(this.Permission == null ? "null" : this.Permission == string.Empty ? "" : this.Permission)}");
            toStringOutput.Add($"this.SharedPermission = {(this.SharedPermission == null ? "null" : this.SharedPermission == string.Empty ? "" : this.SharedPermission)}");
            toStringOutput.Add($"this.GroupPermission = {(this.GroupPermission == null ? "null" : $"[{string.Join(", ", this.GroupPermission)} ]")}");
        }
    }
}