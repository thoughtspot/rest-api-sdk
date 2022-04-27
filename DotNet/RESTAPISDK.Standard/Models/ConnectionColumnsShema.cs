// <copyright file="ConnectionColumnsShema.cs" company="APIMatic">
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
    /// ConnectionColumnsShema.
    /// </summary>
    public class ConnectionColumnsShema
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionColumnsShema"/> class.
        /// </summary>
        public ConnectionColumnsShema()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionColumnsShema"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="dbName">dbName.</param>
        /// <param name="schemaName">schemaName.</param>
        /// <param name="columns">columns.</param>
        public ConnectionColumnsShema(
            string name = null,
            string dbName = null,
            string schemaName = null,
            List<Models.TableColumns> columns = null)
        {
            this.Name = name;
            this.DbName = dbName;
            this.SchemaName = schemaName;
            this.Columns = columns;
        }

        /// <summary>
        /// Name of the table
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Name of the database
        /// </summary>
        [JsonProperty("dbName", NullValueHandling = NullValueHandling.Ignore)]
        public string DbName { get; set; }

        /// <summary>
        /// Name of the schema
        /// </summary>
        [JsonProperty("schemaName", NullValueHandling = NullValueHandling.Ignore)]
        public string SchemaName { get; set; }

        /// <summary>
        /// List of columns in the table
        /// </summary>
        [JsonProperty("columns", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.TableColumns> Columns { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ConnectionColumnsShema : ({string.Join(", ", toStringOutput)})";
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

            return obj is ConnectionColumnsShema other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.DbName == null && other.DbName == null) || (this.DbName?.Equals(other.DbName) == true)) &&
                ((this.SchemaName == null && other.SchemaName == null) || (this.SchemaName?.Equals(other.SchemaName) == true)) &&
                ((this.Columns == null && other.Columns == null) || (this.Columns?.Equals(other.Columns) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.DbName = {(this.DbName == null ? "null" : this.DbName == string.Empty ? "" : this.DbName)}");
            toStringOutput.Add($"this.SchemaName = {(this.SchemaName == null ? "null" : this.SchemaName == string.Empty ? "" : this.SchemaName)}");
            toStringOutput.Add($"this.Columns = {(this.Columns == null ? "null" : $"[{string.Join(", ", this.Columns)} ]")}");
        }
    }
}