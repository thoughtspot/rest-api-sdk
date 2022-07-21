// <copyright file="LiveboardQueryResponse.cs" company="APIMatic">
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
    /// LiveboardQueryResponse.
    /// </summary>
    public class LiveboardQueryResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveboardQueryResponse"/> class.
        /// </summary>
        public LiveboardQueryResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LiveboardQueryResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="viz">viz.</param>
        public LiveboardQueryResponse(
            string name = null,
            string id = null,
            List<Models.VizType> viz = null)
        {
            this.Name = name;
            this.Id = id;
            this.Viz = viz;
        }

        /// <summary>
        /// The name of the Liveboard
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the Liveboard
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// SQL query associated with the saved Answer
        /// </summary>
        [JsonProperty("viz", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.VizType> Viz { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"LiveboardQueryResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is LiveboardQueryResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Viz == null && other.Viz == null) || (this.Viz?.Equals(other.Viz) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Viz = {(this.Viz == null ? "null" : $"[{string.Join(", ", this.Viz)} ]")}");
        }
    }
}