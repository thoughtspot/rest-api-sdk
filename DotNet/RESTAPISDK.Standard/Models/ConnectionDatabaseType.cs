// <copyright file="ConnectionDatabaseType.cs" company="APIMatic">
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
    /// ConnectionDatabaseType.
    /// </summary>
    public class ConnectionDatabaseType
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionDatabaseType"/> class.
        /// </summary>
        public ConnectionDatabaseType()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionDatabaseType"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="schema">schema.</param>
        public ConnectionDatabaseType(
            string name = null,
            List<Models.ConnectionTableSchema> schema = null)
        {
            this.Name = name;
            this.Schema = schema;
        }

        /// <summary>
        /// Name of the database
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// List of schemas
        /// </summary>
        [JsonProperty("schema", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.ConnectionTableSchema> Schema { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ConnectionDatabaseType : ({string.Join(", ", toStringOutput)})";
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

            return obj is ConnectionDatabaseType other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Schema == null && other.Schema == null) || (this.Schema?.Equals(other.Schema) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Schema = {(this.Schema == null ? "null" : $"[{string.Join(", ", this.Schema)} ]")}");
        }
    }
}