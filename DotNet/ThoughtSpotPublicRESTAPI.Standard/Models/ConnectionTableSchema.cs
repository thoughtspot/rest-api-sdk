// <copyright file="ConnectionTableSchema.cs" company="APIMatic">
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
    /// ConnectionTableSchema.
    /// </summary>
    public class ConnectionTableSchema
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionTableSchema"/> class.
        /// </summary>
        public ConnectionTableSchema()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionTableSchema"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="table">table.</param>
        public ConnectionTableSchema(
            string name = null,
            List<Models.ConnectionColumn> table = null)
        {
            this.Name = name;
            this.Table = table;
        }

        /// <summary>
        /// Name of the schema
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// List of table details
        /// </summary>
        [JsonProperty("table", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.ConnectionColumn> Table { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ConnectionTableSchema : ({string.Join(", ", toStringOutput)})";
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

            return obj is ConnectionTableSchema other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Table == null && other.Table == null) || (this.Table?.Equals(other.Table) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Table = {(this.Table == null ? "null" : $"[{string.Join(", ", this.Table)} ]")}");
        }
    }
}