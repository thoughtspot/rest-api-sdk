// <copyright file="TspublicRestV2AdminChangeauthorRequest.cs" company="APIMatic">
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
    /// TspublicRestV2AdminChangeauthorRequest.
    /// </summary>
    public class TspublicRestV2AdminChangeauthorRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminChangeauthorRequest"/> class.
        /// </summary>
        public TspublicRestV2AdminChangeauthorRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminChangeauthorRequest"/> class.
        /// </summary>
        /// <param name="tsObjectId">tsObjectId.</param>
        /// <param name="fromUser">fromUser.</param>
        /// <param name="toUser">toUser.</param>
        public TspublicRestV2AdminChangeauthorRequest(
            List<string> tsObjectId,
            Models.FromUserNameAndIDInput fromUser,
            Models.ToUserNameAndIDInput toUser)
        {
            this.TsObjectId = tsObjectId;
            this.FromUser = fromUser;
            this.ToUser = toUser;
        }

        /// <summary>
        /// A JSON array of GUIDs of the metadata objects.
        ///  To change author of all the objects owned by a user, provide single input as ALL.
        ///  If multiple object ids along with ALL is provided as input, then ALL will be considered.
        /// </summary>
        [JsonProperty("tsObjectId")]
        public List<string> TsObjectId { get; set; }

        /// <summary>
        /// A JSON object of name or GUIDs of the current owner of the objects. When both are given then id is considered.
        /// If a list of object ids are provided as input for TsObjectId, then only for those ids that have owner as the value provided in fromUser, the owner will be changed.
        /// Provide either name or id as input. When both are given user id will be considered.
        /// </summary>
        [JsonProperty("fromUser")]
        public Models.FromUserNameAndIDInput FromUser { get; set; }

        /// <summary>
        /// A JSON object of name or GUIDs of the new owner for the objects. When both are given then id is considered.
        /// </summary>
        [JsonProperty("toUser")]
        public Models.ToUserNameAndIDInput ToUser { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2AdminChangeauthorRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2AdminChangeauthorRequest other &&
                ((this.TsObjectId == null && other.TsObjectId == null) || (this.TsObjectId?.Equals(other.TsObjectId) == true)) &&
                ((this.FromUser == null && other.FromUser == null) || (this.FromUser?.Equals(other.FromUser) == true)) &&
                ((this.ToUser == null && other.ToUser == null) || (this.ToUser?.Equals(other.ToUser) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.TsObjectId = {(this.TsObjectId == null ? "null" : $"[{string.Join(", ", this.TsObjectId)} ]")}");
            toStringOutput.Add($"this.FromUser = {(this.FromUser == null ? "null" : this.FromUser.ToString())}");
            toStringOutput.Add($"this.ToUser = {(this.ToUser == null ? "null" : this.ToUser.ToString())}");
        }
    }
}