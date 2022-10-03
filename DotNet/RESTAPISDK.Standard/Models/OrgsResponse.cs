// <copyright file="OrgsResponse.cs" company="APIMatic">
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
    /// OrgsResponse.
    /// </summary>
    public class OrgsResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrgsResponse"/> class.
        /// </summary>
        public OrgsResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="OrgsResponse"/> class.
        /// </summary>
        /// <param name="orgId">orgId.</param>
        /// <param name="orgName">orgName.</param>
        /// <param name="description">description.</param>
        /// <param name="allGroupUserId">allGroupUserId.</param>
        /// <param name="defaultAdminUserGroupId">defaultAdminUserGroupId.</param>
        /// <param name="active">active.</param>
        public OrgsResponse(
            int? orgId = null,
            string orgName = null,
            string description = null,
            string allGroupUserId = null,
            string defaultAdminUserGroupId = null,
            bool? active = null)
        {
            this.OrgId = orgId;
            this.OrgName = orgName;
            this.Description = description;
            this.AllGroupUserId = allGroupUserId;
            this.DefaultAdminUserGroupId = defaultAdminUserGroupId;
            this.Active = active;
        }

        /// <summary>
        /// ID of the organization searched for
        /// </summary>
        [JsonProperty("orgId", NullValueHandling = NullValueHandling.Ignore)]
        public int? OrgId { get; set; }

        /// <summary>
        /// Name of the organization searched for
        /// </summary>
        [JsonProperty("orgName", NullValueHandling = NullValueHandling.Ignore)]
        public string OrgName { get; set; }

        /// <summary>
        /// Description associated with the organization
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// GUID of the ALL group in the organization
        /// </summary>
        [JsonProperty("allGroupUserId", NullValueHandling = NullValueHandling.Ignore)]
        public string AllGroupUserId { get; set; }

        /// <summary>
        /// GUID of the admin group in the organization
        /// </summary>
        [JsonProperty("defaultAdminUserGroupId", NullValueHandling = NullValueHandling.Ignore)]
        public string DefaultAdminUserGroupId { get; set; }

        /// <summary>
        /// Indicates if the organization is active or not
        /// </summary>
        [JsonProperty("active", NullValueHandling = NullValueHandling.Ignore)]
        public bool? Active { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"OrgsResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is OrgsResponse other &&
                ((this.OrgId == null && other.OrgId == null) || (this.OrgId?.Equals(other.OrgId) == true)) &&
                ((this.OrgName == null && other.OrgName == null) || (this.OrgName?.Equals(other.OrgName) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.AllGroupUserId == null && other.AllGroupUserId == null) || (this.AllGroupUserId?.Equals(other.AllGroupUserId) == true)) &&
                ((this.DefaultAdminUserGroupId == null && other.DefaultAdminUserGroupId == null) || (this.DefaultAdminUserGroupId?.Equals(other.DefaultAdminUserGroupId) == true)) &&
                ((this.Active == null && other.Active == null) || (this.Active?.Equals(other.Active) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.OrgId = {(this.OrgId == null ? "null" : this.OrgId.ToString())}");
            toStringOutput.Add($"this.OrgName = {(this.OrgName == null ? "null" : this.OrgName == string.Empty ? "" : this.OrgName)}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.AllGroupUserId = {(this.AllGroupUserId == null ? "null" : this.AllGroupUserId == string.Empty ? "" : this.AllGroupUserId)}");
            toStringOutput.Add($"this.DefaultAdminUserGroupId = {(this.DefaultAdminUserGroupId == null ? "null" : this.DefaultAdminUserGroupId == string.Empty ? "" : this.DefaultAdminUserGroupId)}");
            toStringOutput.Add($"this.Active = {(this.Active == null ? "null" : this.Active.ToString())}");
        }
    }
}