// <copyright file="ConnectionTableResponse.cs" company="APIMatic">
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
    /// ConnectionTableResponse.
    /// </summary>
    public class ConnectionTableResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionTableResponse"/> class.
        /// </summary>
        public ConnectionTableResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectionTableResponse"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="database">database.</param>
        public ConnectionTableResponse(
            string id = null,
            List<Models.ConnectionDatabaseType> database = null)
        {
            this.Id = id;
            this.Database = database;
        }

        /// <summary>
        /// Connection id
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// List of databases
        /// </summary>
        [JsonProperty("database", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.ConnectionDatabaseType> Database { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ConnectionTableResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is ConnectionTableResponse other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Database == null && other.Database == null) || (this.Database?.Equals(other.Database) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Database = {(this.Database == null ? "null" : $"[{string.Join(", ", this.Database)} ]")}");
        }
    }
}