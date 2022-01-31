// <copyright file="ApiRestV2AdminSyncprincipalRequest.cs" company="APIMatic">
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
    /// ApiRestV2AdminSyncprincipalRequest.
    /// </summary>
    public class ApiRestV2AdminSyncprincipalRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2AdminSyncprincipalRequest"/> class.
        /// </summary>
        public ApiRestV2AdminSyncprincipalRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2AdminSyncprincipalRequest"/> class.
        /// </summary>
        /// <param name="principalObject">principalObject.</param>
        /// <param name="updateModified">updateModified.</param>
        /// <param name="deleteRemoved">deleteRemoved.</param>
        /// <param name="newUserPassword">newUserPassword.</param>
        public ApiRestV2AdminSyncprincipalRequest(
            object principalObject,
            bool? updateModified = false,
            bool? deleteRemoved = false,
            string newUserPassword = null)
        {
            this.PrincipalObject = principalObject;
            this.UpdateModified = updateModified;
            this.DeleteRemoved = deleteRemoved;
            this.NewUserPassword = newUserPassword;
        }

        /// <summary>
        /// A JSON array of principal objects containing all users and groups present in the external system.
        ///  Example:
        ///  {
        ///  "name": "Customer Success",
        ///  "displayName": "Customer Success",
        ///  "description": "CS",
        ///  "created": 1568926267025,
        ///  "modified": 1568926982242,
        ///  "principalTypeEnum": "LOCAL_GROUP",
        ///  "groupNames": [],
        ///  "visibility": "DEFAULT"
        ///  },
        ///  {
        ///  "name": "test",
        ///  "displayName": "test one",
        ///  "created": 1587573621279,
        ///  "modified": 1587573621674,
        ///  "mail": "test2@test.com",
        ///  "principalTypeEnum": "LOCAL_USER",
        ///  "groupNames": [ "Administrator", "All" ],
        ///  "visibility": "DEFAULT"
        ///  }
        ///  You can leave the created and modified dates blank for new users.
        ///  You can specify if the principal is a user (LOCAL_USER) or user group (LOCAL_GROUP) in the principalTypeEnum keyword.
        ///  Set visibility to NON_SHARABLE, if you do not want the user to be able to share ThoughtSpot objects with other users in this group.
        /// </summary>
        [JsonProperty("principalObject")]
        public object PrincipalObject { get; set; }

        /// <summary>
        /// Specifies whether to apply the changes to users and groups already in the cluster based on the principal object list input.
        /// </summary>
        [JsonProperty("updateModified", NullValueHandling = NullValueHandling.Ignore)]
        public bool? UpdateModified { get; set; }

        /// <summary>
        /// Specifies whether to delete the users and groups already in the cluster if not present in the principal object list input.
        /// </summary>
        [JsonProperty("deleteRemoved", NullValueHandling = NullValueHandling.Ignore)]
        public bool? DeleteRemoved { get; set; }

        /// <summary>
        /// Assign a password for new users added during the sync operation.
        ///  All new users added will have this password. It is mandatory to provide value for this field if new users are included in the input list.
        /// </summary>
        [JsonProperty("newUserPassword", NullValueHandling = NullValueHandling.Ignore)]
        public string NewUserPassword { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2AdminSyncprincipalRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2AdminSyncprincipalRequest other &&
                ((this.PrincipalObject == null && other.PrincipalObject == null) || (this.PrincipalObject?.Equals(other.PrincipalObject) == true)) &&
                ((this.UpdateModified == null && other.UpdateModified == null) || (this.UpdateModified?.Equals(other.UpdateModified) == true)) &&
                ((this.DeleteRemoved == null && other.DeleteRemoved == null) || (this.DeleteRemoved?.Equals(other.DeleteRemoved) == true)) &&
                ((this.NewUserPassword == null && other.NewUserPassword == null) || (this.NewUserPassword?.Equals(other.NewUserPassword) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"PrincipalObject = {(this.PrincipalObject == null ? "null" : this.PrincipalObject.ToString())}");
            toStringOutput.Add($"this.UpdateModified = {(this.UpdateModified == null ? "null" : this.UpdateModified.ToString())}");
            toStringOutput.Add($"this.DeleteRemoved = {(this.DeleteRemoved == null ? "null" : this.DeleteRemoved.ToString())}");
            toStringOutput.Add($"this.NewUserPassword = {(this.NewUserPassword == null ? "null" : this.NewUserPassword == string.Empty ? "" : this.NewUserPassword)}");
        }
    }
}