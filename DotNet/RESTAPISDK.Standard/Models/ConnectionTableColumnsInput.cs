// <copyright file="ConnectionTableColumnsInput.cs" company="APIMatic">
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
    /// ConnectionTableColumnsInput.
    /// </summary>
    public class ConnectionTableColumnsInput
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionTableColumnsInput"/> class.
        /// </summary>
        public ConnectionTableColumnsInput()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionTableColumnsInput"/> class.
        /// </summary>
        /// <param name="dbName">dbName.</param>
        /// <param name="schemaName">schemaName.</param>
        /// <param name="name">name.</param>
        public ConnectionTableColumnsInput(
            string dbName,
            string schemaName,
            string name)
        {
            this.DbName = dbName;
            this.SchemaName = schemaName;
            this.Name = name;
        }

        /// <summary>
        /// Name of the database
        /// </summary>
        [JsonProperty("dbName")]
        public string DbName { get; set; }

        /// <summary>
        /// Name of the schema
        /// </summary>
        [JsonProperty("schemaName")]
        public string SchemaName { get; set; }

        /// <summary>
        /// Name of the table
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ConnectionTableColumnsInput : ({string.Join(", ", toStringOutput)})";
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

            return obj is ConnectionTableColumnsInput other &&
                ((this.DbName == null && other.DbName == null) || (this.DbName?.Equals(other.DbName) == true)) &&
                ((this.SchemaName == null && other.SchemaName == null) || (this.SchemaName?.Equals(other.SchemaName) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.DbName = {(this.DbName == null ? "null" : this.DbName == string.Empty ? "" : this.DbName)}");
            toStringOutput.Add($"this.SchemaName = {(this.SchemaName == null ? "null" : this.SchemaName == string.Empty ? "" : this.SchemaName)}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
        }
    }
}