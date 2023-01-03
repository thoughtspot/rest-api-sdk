// <copyright file="TspublicRestV2SecurityShareVisualizationRequest.cs" company="APIMatic">
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
    /// TspublicRestV2SecurityShareVisualizationRequest.
    /// </summary>
    public class TspublicRestV2SecurityShareVisualizationRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityShareVisualizationRequest"/> class.
        /// </summary>
        public TspublicRestV2SecurityShareVisualizationRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2SecurityShareVisualizationRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="vizId">vizId.</param>
        /// <param name="principalId">principalId.</param>
        /// <param name="emailId">emailId.</param>
        /// <param name="notify">notify.</param>
        /// <param name="message">message.</param>
        /// <param name="includeCustomEmbedUrl">includeCustomEmbedUrl.</param>
        public TspublicRestV2SecurityShareVisualizationRequest(
            string id,
            string vizId,
            List<string> principalId,
            List<string> emailId = null,
            bool? notify = true,
            string message = null,
            bool? includeCustomEmbedUrl = false)
        {
            this.Id = id;
            this.VizId = vizId;
            this.PrincipalId = principalId;
            this.EmailId = emailId;
            this.Notify = notify;
            this.Message = message;
            this.IncludeCustomEmbedUrl = includeCustomEmbedUrl;
        }

        /// <summary>
        /// A JSON array of the GUIDs of the objects to be shared
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// The GUID of visualization
        /// </summary>
        [JsonProperty("vizId")]
        public string VizId { get; set; }

        /// <summary>
        /// The GUID of the users and user groups with which you want to share the visualization
        /// </summary>
        [JsonProperty("principalId")]
        public List<string> PrincipalId { get; set; }

        /// <summary>
        /// The email addresses that should ne notified when the objects are shared
        /// </summary>
        [JsonProperty("emailId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> EmailId { get; set; }

        /// <summary>
        /// When set to true, a notification is sent to the users after an object is shared.
        /// </summary>
        [JsonProperty("notify", NullValueHandling = NullValueHandling.Ignore)]
        public bool? Notify { get; set; }

        /// <summary>
        /// The message text to send in the notification email.
        /// </summary>
        [JsonProperty("message", NullValueHandling = NullValueHandling.Ignore)]
        public string Message { get; set; }

        /// <summary>
        /// When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.
        /// </summary>
        [JsonProperty("includeCustomEmbedUrl", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IncludeCustomEmbedUrl { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2SecurityShareVisualizationRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2SecurityShareVisualizationRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.VizId == null && other.VizId == null) || (this.VizId?.Equals(other.VizId) == true)) &&
                ((this.PrincipalId == null && other.PrincipalId == null) || (this.PrincipalId?.Equals(other.PrincipalId) == true)) &&
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
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.VizId = {(this.VizId == null ? "null" : this.VizId == string.Empty ? "" : this.VizId)}");
            toStringOutput.Add($"this.PrincipalId = {(this.PrincipalId == null ? "null" : $"[{string.Join(", ", this.PrincipalId)} ]")}");
            toStringOutput.Add($"this.EmailId = {(this.EmailId == null ? "null" : $"[{string.Join(", ", this.EmailId)} ]")}");
            toStringOutput.Add($"this.Notify = {(this.Notify == null ? "null" : this.Notify.ToString())}");
            toStringOutput.Add($"this.Message = {(this.Message == null ? "null" : this.Message == string.Empty ? "" : this.Message)}");
            toStringOutput.Add($"this.IncludeCustomEmbedUrl = {(this.IncludeCustomEmbedUrl == null ? "null" : this.IncludeCustomEmbedUrl.ToString())}");
        }
    }
}