// <copyright file="PinboardDetails.cs" company="APIMatic">
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
    /// PinboardDetails.
    /// </summary>
    public class PinboardDetails
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PinboardDetails"/> class.
        /// </summary>
        public PinboardDetails()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PinboardDetails"/> class.
        /// </summary>
        /// <param name="pinboardId">pinboardId.</param>
        /// <param name="pinboardName">pinboardName.</param>
        /// <param name="tabId">tabId.</param>
        /// <param name="tabName">tabName.</param>
        public PinboardDetails(
            string pinboardId = null,
            string pinboardName = null,
            string tabId = null,
            string tabName = null)
        {
            this.PinboardId = pinboardId;
            this.PinboardName = pinboardName;
            this.TabId = tabId;
            this.TabName = tabName;
        }

        /// <summary>
        /// pinboard id of recently pinned pinboard
        /// </summary>
        [JsonProperty("pinboardId", NullValueHandling = NullValueHandling.Ignore)]
        public string PinboardId { get; set; }

        /// <summary>
        /// pinboard name of recently pinned pinboard
        /// </summary>
        [JsonProperty("pinboardName", NullValueHandling = NullValueHandling.Ignore)]
        public string PinboardName { get; set; }

        /// <summary>
        /// tab id of recently pinned tab
        /// </summary>
        [JsonProperty("tabId", NullValueHandling = NullValueHandling.Ignore)]
        public string TabId { get; set; }

        /// <summary>
        /// tab name of recently pinned tab
        /// </summary>
        [JsonProperty("tabName", NullValueHandling = NullValueHandling.Ignore)]
        public string TabName { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"PinboardDetails : ({string.Join(", ", toStringOutput)})";
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

            return obj is PinboardDetails other &&
                ((this.PinboardId == null && other.PinboardId == null) || (this.PinboardId?.Equals(other.PinboardId) == true)) &&
                ((this.PinboardName == null && other.PinboardName == null) || (this.PinboardName?.Equals(other.PinboardName) == true)) &&
                ((this.TabId == null && other.TabId == null) || (this.TabId?.Equals(other.TabId) == true)) &&
                ((this.TabName == null && other.TabName == null) || (this.TabName?.Equals(other.TabName) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.PinboardId = {(this.PinboardId == null ? "null" : this.PinboardId == string.Empty ? "" : this.PinboardId)}");
            toStringOutput.Add($"this.PinboardName = {(this.PinboardName == null ? "null" : this.PinboardName == string.Empty ? "" : this.PinboardName)}");
            toStringOutput.Add($"this.TabId = {(this.TabId == null ? "null" : this.TabId == string.Empty ? "" : this.TabId)}");
            toStringOutput.Add($"this.TabName = {(this.TabName == null ? "null" : this.TabName == string.Empty ? "" : this.TabName)}");
        }
    }
}