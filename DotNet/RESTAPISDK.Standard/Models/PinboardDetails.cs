// <copyright file="PinboardDetails.cs" company="APIMatic">
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
        public PinboardDetails(
            string pinboardId = null,
            string pinboardName = null)
        {
            this.PinboardId = pinboardId;
            this.PinboardName = pinboardName;
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
                ((this.PinboardName == null && other.PinboardName == null) || (this.PinboardName?.Equals(other.PinboardName) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.PinboardId = {(this.PinboardId == null ? "null" : this.PinboardId == string.Empty ? "" : this.PinboardId)}");
            toStringOutput.Add($"this.PinboardName = {(this.PinboardName == null ? "null" : this.PinboardName == string.Empty ? "" : this.PinboardName)}");
        }
    }
}