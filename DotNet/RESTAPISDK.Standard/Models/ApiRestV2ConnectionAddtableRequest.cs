// <copyright file="ApiRestV2ConnectionAddtableRequest.cs" company="APIMatic">
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
    /// ApiRestV2ConnectionAddtableRequest.
    /// </summary>
    public class ApiRestV2ConnectionAddtableRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2ConnectionAddtableRequest"/> class.
        /// </summary>
        public ApiRestV2ConnectionAddtableRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2ConnectionAddtableRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="tables">tables.</param>
        public ApiRestV2ConnectionAddtableRequest(
            string id,
            List<Models.AddTableInput> tables)
        {
            this.Id = id;
            this.Tables = tables;
        }

        /// <summary>
        /// GUID of the connection
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// A JSON array of table details
        /// </summary>
        [JsonProperty("tables")]
        public List<Models.AddTableInput> Tables { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2ConnectionAddtableRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2ConnectionAddtableRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Tables == null && other.Tables == null) || (this.Tables?.Equals(other.Tables) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Tables = {(this.Tables == null ? "null" : $"[{string.Join(", ", this.Tables)} ]")}");
        }
    }
}