// <copyright file="TspublicRestV2AdminConfigurationUpdateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2AdminConfigurationUpdateRequest.
    /// </summary>
    public class TspublicRestV2AdminConfigurationUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminConfigurationUpdateRequest"/> class.
        /// </summary>
        public TspublicRestV2AdminConfigurationUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminConfigurationUpdateRequest"/> class.
        /// </summary>
        /// <param name="configuration">configuration.</param>
        public TspublicRestV2AdminConfigurationUpdateRequest(
            string configuration = null)
        {
            this.Configuration = configuration;
        }

        /// <summary>
        /// A JSON file with the key-value pair of configuration attributes to be updated.
        /// Example: {"defaultChartDataSize": 5000}
        /// </summary>
        [JsonProperty("configuration", NullValueHandling = NullValueHandling.Ignore)]
        public string Configuration { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2AdminConfigurationUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2AdminConfigurationUpdateRequest other &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
        }
    }
}