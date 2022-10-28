// <copyright file="AdminsyncPrincipalResponse.cs" company="APIMatic">
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
    /// AdminsyncPrincipalResponse.
    /// </summary>
    public class AdminsyncPrincipalResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdminsyncPrincipalResponse"/> class.
        /// </summary>
        public AdminsyncPrincipalResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AdminsyncPrincipalResponse"/> class.
        /// </summary>
        /// <param name="usersAdded">usersAdded.</param>
        /// <param name="usersDeleted">usersDeleted.</param>
        /// <param name="usersUpdated">usersUpdated.</param>
        /// <param name="groupsAdded">groupsAdded.</param>
        /// <param name="groupsDeleted">groupsDeleted.</param>
        /// <param name="groupsUpdated">groupsUpdated.</param>
        public AdminsyncPrincipalResponse(
            List<string> usersAdded = null,
            List<string> usersDeleted = null,
            List<string> usersUpdated = null,
            List<string> groupsAdded = null,
            List<string> groupsDeleted = null,
            List<string> groupsUpdated = null)
        {
            this.UsersAdded = usersAdded;
            this.UsersDeleted = usersDeleted;
            this.UsersUpdated = usersUpdated;
            this.GroupsAdded = groupsAdded;
            this.GroupsDeleted = groupsDeleted;
            this.GroupsUpdated = groupsUpdated;
        }

        /// <summary>
        /// Username of list of users added
        /// </summary>
        [JsonProperty("usersAdded", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> UsersAdded { get; set; }

        /// <summary>
        /// Username of list of users deleted
        /// </summary>
        [JsonProperty("usersDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> UsersDeleted { get; set; }

        /// <summary>
        /// Username of list of users updated
        /// </summary>
        [JsonProperty("usersUpdated", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> UsersUpdated { get; set; }

        /// <summary>
        /// Group name of list of groups added
        /// </summary>
        [JsonProperty("groupsAdded", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> GroupsAdded { get; set; }

        /// <summary>
        /// Group name of list of groups deleted
        /// </summary>
        [JsonProperty("groupsDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> GroupsDeleted { get; set; }

        /// <summary>
        /// Group name of list of groups updated
        /// </summary>
        [JsonProperty("groupsUpdated", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> GroupsUpdated { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"AdminsyncPrincipalResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is AdminsyncPrincipalResponse other &&
                ((this.UsersAdded == null && other.UsersAdded == null) || (this.UsersAdded?.Equals(other.UsersAdded) == true)) &&
                ((this.UsersDeleted == null && other.UsersDeleted == null) || (this.UsersDeleted?.Equals(other.UsersDeleted) == true)) &&
                ((this.UsersUpdated == null && other.UsersUpdated == null) || (this.UsersUpdated?.Equals(other.UsersUpdated) == true)) &&
                ((this.GroupsAdded == null && other.GroupsAdded == null) || (this.GroupsAdded?.Equals(other.GroupsAdded) == true)) &&
                ((this.GroupsDeleted == null && other.GroupsDeleted == null) || (this.GroupsDeleted?.Equals(other.GroupsDeleted) == true)) &&
                ((this.GroupsUpdated == null && other.GroupsUpdated == null) || (this.GroupsUpdated?.Equals(other.GroupsUpdated) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.UsersAdded = {(this.UsersAdded == null ? "null" : $"[{string.Join(", ", this.UsersAdded)} ]")}");
            toStringOutput.Add($"this.UsersDeleted = {(this.UsersDeleted == null ? "null" : $"[{string.Join(", ", this.UsersDeleted)} ]")}");
            toStringOutput.Add($"this.UsersUpdated = {(this.UsersUpdated == null ? "null" : $"[{string.Join(", ", this.UsersUpdated)} ]")}");
            toStringOutput.Add($"this.GroupsAdded = {(this.GroupsAdded == null ? "null" : $"[{string.Join(", ", this.GroupsAdded)} ]")}");
            toStringOutput.Add($"this.GroupsDeleted = {(this.GroupsDeleted == null ? "null" : $"[{string.Join(", ", this.GroupsDeleted)} ]")}");
            toStringOutput.Add($"this.GroupsUpdated = {(this.GroupsUpdated == null ? "null" : $"[{string.Join(", ", this.GroupsUpdated)} ]")}");
        }
    }
}