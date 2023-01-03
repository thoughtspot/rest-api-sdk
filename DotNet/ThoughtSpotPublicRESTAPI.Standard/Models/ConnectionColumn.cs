// <copyright file="ConnectionColumn.cs" company="APIMatic">
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
    /// ConnectionColumn.
    /// </summary>
    public class ConnectionColumn
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionColumn"/> class.
        /// </summary>
        public ConnectionColumn()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionColumn"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="type">type.</param>
        /// <param name="column">column.</param>
        public ConnectionColumn(
            string name = null,
            string type = null,
            List<Models.TableColumns> column = null)
        {
            this.Name = name;
            this.Type = type;
            this.Column = column;
        }

        /// <summary>
        /// Name of the table
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Type of the Table
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// List of columns in the table
        /// </summary>
        [JsonProperty("column", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.TableColumns> Column { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ConnectionColumn : ({string.Join(", ", toStringOutput)})";
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

            return obj is ConnectionColumn other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Column == null && other.Column == null) || (this.Column?.Equals(other.Column) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.Column = {(this.Column == null ? "null" : $"[{string.Join(", ", this.Column)} ]")}");
        }
    }
}