// <copyright file="GroupResponse.cs" company="APIMatic">
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
    /// GroupResponse.
    /// </summary>
    public class GroupResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GroupResponse"/> class.
        /// </summary>
        public GroupResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GroupResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="id">id.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="description">description.</param>
        /// <param name="privileges">privileges.</param>
        /// <param name="orgs">orgs.</param>
        /// <param name="groups">groups.</param>
        /// <param name="users">users.</param>
        /// <param name="assignedLiveboards">assignedLiveboards.</param>
        /// <param name="userGroupContent">userGroupContent.</param>
        /// <param name="tags">tags.</param>
        /// <param name="isDeleted">isDeleted.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="isExternal">isExternal.</param>
        /// <param name="isDeprecated">isDeprecated.</param>
        /// <param name="complete">complete.</param>
        /// <param name="isSystemPrincipal">isSystemPrincipal.</param>
        /// <param name="type">type.</param>
        /// <param name="parenttype">parenttype.</param>
        /// <param name="groupIdx">groupIdx.</param>
        /// <param name="metadataVersion">metadataVersion.</param>
        /// <param name="tenantId">tenantId.</param>
        /// <param name="indexVersion">indexVersion.</param>
        /// <param name="generationNum">generationNum.</param>
        /// <param name="created">created.</param>
        /// <param name="modified">modified.</param>
        /// <param name="author">author.</param>
        /// <param name="modifiedBy">modifiedBy.</param>
        /// <param name="owner">owner.</param>
        public GroupResponse(
            string name = null,
            string displayName = null,
            string id = null,
            string visibility = null,
            string description = null,
            List<string> privileges = null,
            List<Models.OrgType> orgs = null,
            List<Models.GroupNameAndID> groups = null,
            List<Models.UserNameAndID> users = null,
            List<Models.LiveboardNameAndID> assignedLiveboards = null,
            object userGroupContent = null,
            List<string> tags = null,
            bool? isDeleted = null,
            bool? isHidden = null,
            bool? isExternal = null,
            bool? isDeprecated = null,
            bool? complete = null,
            bool? isSystemPrincipal = null,
            string type = null,
            string parenttype = null,
            int? groupIdx = null,
            int? metadataVersion = null,
            string tenantId = null,
            double? indexVersion = null,
            double? generationNum = null,
            double? created = null,
            double? modified = null,
            Models.UserNameAndID author = null,
            Models.UserNameAndID modifiedBy = null,
            Models.UserNameAndID owner = null)
        {
            this.Name = name;
            this.DisplayName = displayName;
            this.Id = id;
            this.Visibility = visibility;
            this.Description = description;
            this.Privileges = privileges;
            this.Orgs = orgs;
            this.Groups = groups;
            this.Users = users;
            this.AssignedLiveboards = assignedLiveboards;
            this.UserGroupContent = userGroupContent;
            this.Tags = tags;
            this.IsDeleted = isDeleted;
            this.IsHidden = isHidden;
            this.IsExternal = isExternal;
            this.IsDeprecated = isDeprecated;
            this.Complete = complete;
            this.IsSystemPrincipal = isSystemPrincipal;
            this.Type = type;
            this.Parenttype = parenttype;
            this.GroupIdx = groupIdx;
            this.MetadataVersion = metadataVersion;
            this.TenantId = tenantId;
            this.IndexVersion = indexVersion;
            this.GenerationNum = generationNum;
            this.Created = created;
            this.Modified = modified;
            this.Author = author;
            this.ModifiedBy = modifiedBy;
            this.Owner = owner;
        }

        /// <summary>
        /// Name of the group
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// A unique display name string for the user group
        /// </summary>
        [JsonProperty("displayName", NullValueHandling = NullValueHandling.Ignore)]
        public string DisplayName { get; set; }

        /// <summary>
        /// GUID of the group
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Visibility of the group
        /// </summary>
        [JsonProperty("visibility", NullValueHandling = NullValueHandling.Ignore)]
        public string Visibility { get; set; }

        /// <summary>
        /// Description of the group
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// Privileges assigned to the group
        /// </summary>
        [JsonProperty("privileges", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Privileges { get; set; }

        /// <summary>
        /// The organizations that user belongs to
        /// </summary>
        [JsonProperty("orgs", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.OrgType> Orgs { get; set; }

        /// <summary>
        /// Name of the group to which is added
        /// </summary>
        [JsonProperty("groups", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.GroupNameAndID> Groups { get; set; }

        /// <summary>
        /// User Group Information by Id or Name.
        /// </summary>
        [JsonProperty("users", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.UserNameAndID> Users { get; set; }

        /// <summary>
        /// Liveboards assigned to the group
        /// </summary>
        [JsonProperty("assignedLiveboards", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.LiveboardNameAndID> AssignedLiveboards { get; set; }

        /// <summary>
        /// Gets or sets UserGroupContent.
        /// </summary>
        [JsonProperty("userGroupContent", NullValueHandling = NullValueHandling.Ignore)]
        public object UserGroupContent { get; set; }

        /// <summary>
        /// Tags assigned to the group
        /// </summary>
        [JsonProperty("tags", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Indicates if the group is deleted
        /// </summary>
        [JsonProperty("isDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeleted { get; set; }

        /// <summary>
        /// Indicates if the group is hidden
        /// </summary>
        [JsonProperty("isHidden", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// Indicates if the group is from external system
        /// </summary>
        [JsonProperty("isExternal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Gets or sets IsDeprecated.
        /// </summary>
        [JsonProperty("isDeprecated", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeprecated { get; set; }

        /// <summary>
        /// Indicates if the all the properties of group is provided
        /// </summary>
        [JsonProperty("complete", NullValueHandling = NullValueHandling.Ignore)]
        public bool? Complete { get; set; }

        /// <summary>
        /// Indicates if the group is system principal
        /// </summary>
        [JsonProperty("isSystemPrincipal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsSystemPrincipal { get; set; }

        /// <summary>
        /// Indicates the type of group
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// Indicates the type of parent object
        /// </summary>
        [JsonProperty("parenttype", NullValueHandling = NullValueHandling.Ignore)]
        public string Parenttype { get; set; }

        /// <summary>
        /// Gets or sets GroupIdx.
        /// </summary>
        [JsonProperty("groupIdx", NullValueHandling = NullValueHandling.Ignore)]
        public int? GroupIdx { get; set; }

        /// <summary>
        /// Gets or sets MetadataVersion.
        /// </summary>
        [JsonProperty("metadataVersion", NullValueHandling = NullValueHandling.Ignore)]
        public int? MetadataVersion { get; set; }

        /// <summary>
        /// Tenant id associated with the group
        /// </summary>
        [JsonProperty("tenantId", NullValueHandling = NullValueHandling.Ignore)]
        public string TenantId { get; set; }

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

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"GroupResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is GroupResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.DisplayName == null && other.DisplayName == null) || (this.DisplayName?.Equals(other.DisplayName) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Visibility == null && other.Visibility == null) || (this.Visibility?.Equals(other.Visibility) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.Privileges == null && other.Privileges == null) || (this.Privileges?.Equals(other.Privileges) == true)) &&
                ((this.Orgs == null && other.Orgs == null) || (this.Orgs?.Equals(other.Orgs) == true)) &&
                ((this.Groups == null && other.Groups == null) || (this.Groups?.Equals(other.Groups) == true)) &&
                ((this.Users == null && other.Users == null) || (this.Users?.Equals(other.Users) == true)) &&
                ((this.AssignedLiveboards == null && other.AssignedLiveboards == null) || (this.AssignedLiveboards?.Equals(other.AssignedLiveboards) == true)) &&
                ((this.UserGroupContent == null && other.UserGroupContent == null) || (this.UserGroupContent?.Equals(other.UserGroupContent) == true)) &&
                ((this.Tags == null && other.Tags == null) || (this.Tags?.Equals(other.Tags) == true)) &&
                ((this.IsDeleted == null && other.IsDeleted == null) || (this.IsDeleted?.Equals(other.IsDeleted) == true)) &&
                ((this.IsHidden == null && other.IsHidden == null) || (this.IsHidden?.Equals(other.IsHidden) == true)) &&
                ((this.IsExternal == null && other.IsExternal == null) || (this.IsExternal?.Equals(other.IsExternal) == true)) &&
                ((this.IsDeprecated == null && other.IsDeprecated == null) || (this.IsDeprecated?.Equals(other.IsDeprecated) == true)) &&
                ((this.Complete == null && other.Complete == null) || (this.Complete?.Equals(other.Complete) == true)) &&
                ((this.IsSystemPrincipal == null && other.IsSystemPrincipal == null) || (this.IsSystemPrincipal?.Equals(other.IsSystemPrincipal) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Parenttype == null && other.Parenttype == null) || (this.Parenttype?.Equals(other.Parenttype) == true)) &&
                ((this.GroupIdx == null && other.GroupIdx == null) || (this.GroupIdx?.Equals(other.GroupIdx) == true)) &&
                ((this.MetadataVersion == null && other.MetadataVersion == null) || (this.MetadataVersion?.Equals(other.MetadataVersion) == true)) &&
                ((this.TenantId == null && other.TenantId == null) || (this.TenantId?.Equals(other.TenantId) == true)) &&
                ((this.IndexVersion == null && other.IndexVersion == null) || (this.IndexVersion?.Equals(other.IndexVersion) == true)) &&
                ((this.GenerationNum == null && other.GenerationNum == null) || (this.GenerationNum?.Equals(other.GenerationNum) == true)) &&
                ((this.Created == null && other.Created == null) || (this.Created?.Equals(other.Created) == true)) &&
                ((this.Modified == null && other.Modified == null) || (this.Modified?.Equals(other.Modified) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.ModifiedBy == null && other.ModifiedBy == null) || (this.ModifiedBy?.Equals(other.ModifiedBy) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.DisplayName = {(this.DisplayName == null ? "null" : this.DisplayName == string.Empty ? "" : this.DisplayName)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Visibility = {(this.Visibility == null ? "null" : this.Visibility == string.Empty ? "" : this.Visibility)}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.Privileges = {(this.Privileges == null ? "null" : $"[{string.Join(", ", this.Privileges)} ]")}");
            toStringOutput.Add($"this.Orgs = {(this.Orgs == null ? "null" : $"[{string.Join(", ", this.Orgs)} ]")}");
            toStringOutput.Add($"this.Groups = {(this.Groups == null ? "null" : $"[{string.Join(", ", this.Groups)} ]")}");
            toStringOutput.Add($"this.Users = {(this.Users == null ? "null" : $"[{string.Join(", ", this.Users)} ]")}");
            toStringOutput.Add($"this.AssignedLiveboards = {(this.AssignedLiveboards == null ? "null" : $"[{string.Join(", ", this.AssignedLiveboards)} ]")}");
            toStringOutput.Add($"UserGroupContent = {(this.UserGroupContent == null ? "null" : this.UserGroupContent.ToString())}");
            toStringOutput.Add($"this.Tags = {(this.Tags == null ? "null" : $"[{string.Join(", ", this.Tags)} ]")}");
            toStringOutput.Add($"this.IsDeleted = {(this.IsDeleted == null ? "null" : this.IsDeleted.ToString())}");
            toStringOutput.Add($"this.IsHidden = {(this.IsHidden == null ? "null" : this.IsHidden.ToString())}");
            toStringOutput.Add($"this.IsExternal = {(this.IsExternal == null ? "null" : this.IsExternal.ToString())}");
            toStringOutput.Add($"this.IsDeprecated = {(this.IsDeprecated == null ? "null" : this.IsDeprecated.ToString())}");
            toStringOutput.Add($"this.Complete = {(this.Complete == null ? "null" : this.Complete.ToString())}");
            toStringOutput.Add($"this.IsSystemPrincipal = {(this.IsSystemPrincipal == null ? "null" : this.IsSystemPrincipal.ToString())}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.Parenttype = {(this.Parenttype == null ? "null" : this.Parenttype == string.Empty ? "" : this.Parenttype)}");
            toStringOutput.Add($"this.GroupIdx = {(this.GroupIdx == null ? "null" : this.GroupIdx.ToString())}");
            toStringOutput.Add($"this.MetadataVersion = {(this.MetadataVersion == null ? "null" : this.MetadataVersion.ToString())}");
            toStringOutput.Add($"this.TenantId = {(this.TenantId == null ? "null" : this.TenantId == string.Empty ? "" : this.TenantId)}");
            toStringOutput.Add($"this.IndexVersion = {(this.IndexVersion == null ? "null" : this.IndexVersion.ToString())}");
            toStringOutput.Add($"this.GenerationNum = {(this.GenerationNum == null ? "null" : this.GenerationNum.ToString())}");
            toStringOutput.Add($"this.Created = {(this.Created == null ? "null" : this.Created.ToString())}");
            toStringOutput.Add($"this.Modified = {(this.Modified == null ? "null" : this.Modified.ToString())}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author.ToString())}");
            toStringOutput.Add($"this.ModifiedBy = {(this.ModifiedBy == null ? "null" : this.ModifiedBy.ToString())}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner.ToString())}");
        }
    }
}