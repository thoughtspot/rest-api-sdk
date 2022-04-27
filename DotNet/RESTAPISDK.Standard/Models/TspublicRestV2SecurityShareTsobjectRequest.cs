// <copyright file="TspublicRestV2SecurityShareTsobjectRequest.cs" company="APIMatic">
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
    /// TspublicRestV2SecurityShareTsobjectRequest.
    /// </summary>
    public class TspublicRestV2SecurityShareTsobjectRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityShareTsobjectRequest"/> class.
        /// </summary>
        public TspublicRestV2SecurityShareTsobjectRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityShareTsobjectRequest"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="id">id.</param>
        /// <param name="permission">permission.</param>
        /// <param name="emailId">emailId.</param>
        /// <param name="notify">notify.</param>
        /// <param name="message">message.</param>
        /// <param name="includeCustomEmbedUrl">includeCustomEmbedUrl.</param>
        public TspublicRestV2SecurityShareTsobjectRequest(
            Models.ShareObjectTypeEnum type,
            List<string> id,
            string permission,
            List<string> emailId = null,
            Models.ShareObjectNotifyEnum? notify = Models.ShareObjectNotifyEnum.True,
            string message = null,
            Models.ShareObjectIncludeCustomEmbedUrlEnum? includeCustomEmbedUrl = Models.ShareObjectIncludeCustomEmbedUrlEnum.False)
        {
            this.Type = type;
            this.Id = id;
            this.Permission = permission;
            this.EmailId = emailId;
            this.Notify = notify;
            this.Message = message;
            this.IncludeCustomEmbedUrl = includeCustomEmbedUrl;
        }

        /// <summary>
        /// Type of metadata object
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.ShareObjectTypeEnum Type { get; set; }

        /// <summary>
        /// A JSON array of the GUIDs of the objects to be shared
        /// </summary>
        [JsonProperty("id")]
        public List<string> Id { get; set; }

        /// <summary>
        /// A JSON object with GUIDs of user and user group, and the type of access privilge.
        ///  You can provide READ_ONLY or MODIFY access to the objects. With READ_ONLY access, the user or user group can view the shared object, whereas MODIFY access enables users to modify the object.
        ///  To remove access to a shared object, you can set the shareMode in the permission string to NO_ACCESS. Example:
        ///  {"permissions": {"e7040a64-7ff1-4ab9-a1b0-f1acac596866": {"shareMode": "READ_ONLY"}, "f7b8f511-317c-485d-8131-26cf084ef47b": {"shareMode": "MODIFY"}, "7a9a6715-e154-431b-baaf-7b58246c13dd":{"shareMode":"NO_ACCESS"}}}
        /// </summary>
        [JsonProperty("permission")]
        public string Permission { get; set; }

        /// <summary>
        /// The email addresses that should ne notified when the objects are shared.
        /// </summary>
        [JsonProperty("emailId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> EmailId { get; set; }

        /// <summary>
        /// When set to true, a notification is sent to the users after an object is shared.
        /// </summary>
        [JsonProperty("notify", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ShareObjectNotifyEnum? Notify { get; set; }

        /// <summary>
        /// The message text to send in the notification email
        /// </summary>
        [JsonProperty("message", NullValueHandling = NullValueHandling.Ignore)]
        public string Message { get; set; }

        /// <summary>
        /// When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.
        /// </summary>
        [JsonProperty("includeCustomEmbedUrl", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ShareObjectIncludeCustomEmbedUrlEnum? IncludeCustomEmbedUrl { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2SecurityShareTsobjectRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2SecurityShareTsobjectRequest other &&
                this.Type.Equals(other.Type) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Permission == null && other.Permission == null) || (this.Permission?.Equals(other.Permission) == true)) &&
                ((this.EmailId == null && other.EmailId == null) || (this.EmailId?.Equals(other.EmailId) == true)) &&
                ((this.Notify == null && other.Notify == null) || (this.Notify?.Equals(other.Notify) == true)) &&
                ((this.Message == null && other.Message == null) || (this.Message?.Equals(other.Message) == true)) &&
                ((this.IncludeCustomEmbedUrl == null && other.IncludeCustomEmbedUrl == null) || (this.IncludeCustomEmbedUrl?.Equals(other.IncludeCustomEmbedUrl) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : $"[{string.Join(", ", this.Id)} ]")}");
            toStringOutput.Add($"this.Permission = {(this.Permission == null ? "null" : this.Permission == string.Empty ? "" : this.Permission)}");
            toStringOutput.Add($"this.EmailId = {(this.EmailId == null ? "null" : $"[{string.Join(", ", this.EmailId)} ]")}");
            toStringOutput.Add($"this.Notify = {(this.Notify == null ? "null" : this.Notify.ToString())}");
            toStringOutput.Add($"this.Message = {(this.Message == null ? "null" : this.Message == string.Empty ? "" : this.Message)}");
            toStringOutput.Add($"this.IncludeCustomEmbedUrl = {(this.IncludeCustomEmbedUrl == null ? "null" : this.IncludeCustomEmbedUrl.ToString())}");
        }
    }
}