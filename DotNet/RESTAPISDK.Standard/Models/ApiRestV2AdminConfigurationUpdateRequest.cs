// <copyright file="ApiRestV2AdminConfigurationUpdateRequest.cs" company="APIMatic">
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
    /// ApiRestV2AdminConfigurationUpdateRequest.
    /// </summary>
    public class ApiRestV2AdminConfigurationUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2AdminConfigurationUpdateRequest"/> class.
        /// </summary>
        public ApiRestV2AdminConfigurationUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2AdminConfigurationUpdateRequest"/> class.
        /// </summary>
        /// <param name="config">config.</param>
        public ApiRestV2AdminConfigurationUpdateRequest(
            string config = null)
        {
            this.Config = config;
        }

        /// <summary>
        /// A JSON file with the key-value pair of configuration attributes to be updated. For example, {"defaultChartDataSize": 5000}
        /// </summary>
        [JsonProperty("config", NullValueHandling = NullValueHandling.Ignore)]
        public string Config { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2AdminConfigurationUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2AdminConfigurationUpdateRequest other &&
                ((this.Config == null && other.Config == null) || (this.Config?.Equals(other.Config) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Config = {(this.Config == null ? "null" : this.Config == string.Empty ? "" : this.Config)}");
        }
    }
}