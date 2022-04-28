// <copyright file="TspublicRestV2CustomactionSearchRequest.cs" company="APIMatic">
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
    /// TspublicRestV2CustomactionSearchRequest.
    /// </summary>
    public class TspublicRestV2CustomactionSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2CustomactionSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionSearchRequest"/> class.
        /// </summary>
        /// <param name="tag">tag.</param>
        public TspublicRestV2CustomactionSearchRequest(
            List<string> tag = null)
        {
            this.Tag = tag;
        }

        /// <summary>
        /// A JSON array of tag GUIDs.
        ///  If tags are applied to worksheets, search answers, or Liveboard visualizations, and custom actions are associated to these objects, you can use this parameter to filter the custom action data by tags.
        /// </summary>
        [JsonProperty("tag", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Tag { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2CustomactionSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2CustomactionSearchRequest other &&
                ((this.Tag == null && other.Tag == null) || (this.Tag?.Equals(other.Tag) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Tag = {(this.Tag == null ? "null" : $"[{string.Join(", ", this.Tag)} ]")}");
        }
    }
}