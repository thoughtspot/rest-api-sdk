// <copyright file="TspublicRestV2GroupUpdateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2GroupUpdateRequest.
    /// </summary>
    public class TspublicRestV2GroupUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupUpdateRequest"/> class.
        /// </summary>
        public TspublicRestV2GroupUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2GroupUpdateRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="description">description.</param>
        /// <param name="privileges">privileges.</param>
        /// <param name="groups">groups.</param>
        /// <param name="users">users.</param>
        /// <param name="assignedLiveboards">assignedLiveboards.</param>
        /// <param name="type">type.</param>
        public TspublicRestV2GroupUpdateRequest(
            string name = null,
            string id = null,
            string displayName = null,
            Models.Visibility2Enum? visibility = Models.Visibility2Enum.DEFAULT,
            string description = null,
            List<Models.PrivilegeEnum> privileges = null,
            List<Models.GroupNameAndIDInput> groups = null,
            List<Models.UserNameAndIDInput> users = null,
            List<string> assignedLiveboards = null,
            Models.Type10Enum? type = Models.Type10Enum.LOCALGROUP)
        {
            this.Name = name;
            this.Id = id;
            this.DisplayName = displayName;
            this.Visibility = visibility;
            this.Description = description;
            this.Privileges = privileges;
            this.Groups = groups;
            this.Users = users;
            this.AssignedLiveboards = assignedLiveboards;
            this.Type = type;
        }

        /// <summary>
        /// Name of the user group. The group name string must be unique.
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// he GUID of the user account to query.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// A unique display name string for the user group, for example, Developer group.
        /// </summary>
        [JsonProperty("displayName", NullValueHandling = NullValueHandling.Ignore)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.
        /// </summary>
        [JsonProperty("visibility", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.Visibility2Enum? Visibility { get; set; }

        /// <summary>
        /// Description text for the group.
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// A JSON array of privileges assigned to the group
        /// </summary>
        [JsonProperty("privileges", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.PrivilegeEnum> Privileges { get; set; }

        /// <summary>
        /// Array of objects of groups that the user belong to.
        /// </summary>
        [JsonProperty("groups", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.GroupNameAndIDInput> Groups { get; set; }

        /// <summary>
        /// Array of object, A JSON array of name of users of users.
        /// </summary>
        [JsonProperty("users", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.UserNameAndIDInput> Users { get; set; }

        /// <summary>
        /// Array of string. An array of liveboard ids to be assigned to the group.
        /// </summary>
        [JsonProperty("assignedLiveboards", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> AssignedLiveboards { get; set; }

        /// <summary>
        /// Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system.
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.Type10Enum? Type { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2GroupUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2GroupUpdateRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.DisplayName == null && other.DisplayName == null) || (this.DisplayName?.Equals(other.DisplayName) == true)) &&
                ((this.Visibility == null && other.Visibility == null) || (this.Visibility?.Equals(other.Visibility) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.Privileges == null && other.Privileges == null) || (this.Privileges?.Equals(other.Privileges) == true)) &&
                ((this.Groups == null && other.Groups == null) || (this.Groups?.Equals(other.Groups) == true)) &&
                ((this.Users == null && other.Users == null) || (this.Users?.Equals(other.Users) == true)) &&
                ((this.AssignedLiveboards == null && other.AssignedLiveboards == null) || (this.AssignedLiveboards?.Equals(other.AssignedLiveboards) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.DisplayName = {(this.DisplayName == null ? "null" : this.DisplayName == string.Empty ? "" : this.DisplayName)}");
            toStringOutput.Add($"this.Visibility = {(this.Visibility == null ? "null" : this.Visibility.ToString())}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.Privileges = {(this.Privileges == null ? "null" : $"[{string.Join(", ", this.Privileges)} ]")}");
            toStringOutput.Add($"this.Groups = {(this.Groups == null ? "null" : $"[{string.Join(", ", this.Groups)} ]")}");
            toStringOutput.Add($"this.Users = {(this.Users == null ? "null" : $"[{string.Join(", ", this.Users)} ]")}");
            toStringOutput.Add($"this.AssignedLiveboards = {(this.AssignedLiveboards == null ? "null" : $"[{string.Join(", ", this.AssignedLiveboards)} ]")}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type.ToString())}");
        }
    }
}