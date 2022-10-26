// <copyright file="TspublicRestV2ConnectionTablecoloumnRequest.cs" company="APIMatic">
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
    /// TspublicRestV2ConnectionTablecoloumnRequest.
    /// </summary>
    public class TspublicRestV2ConnectionTablecoloumnRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionTablecoloumnRequest"/> class.
        /// </summary>
        public TspublicRestV2ConnectionTablecoloumnRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionTablecoloumnRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="table">table.</param>
        /// <param name="configuration">configuration.</param>
        public TspublicRestV2ConnectionTablecoloumnRequest(
            string id,
            List<Models.ConnectionTableColumnsInput> table,
            string configuration = null)
        {
            this.Id = id;
            this.Configuration = configuration;
            this.Table = table;
        }

        /// <summary>
        /// The GUID of the connection
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// A JSON object of the connection metadata. If this field is left empty, then the configuration saved in the connection is considered.
        /// To get the tables based on a different configuration, include required attributes in the connection configuration JSON.
        /// Example:
        ///    Get tables from Snowflake with a different user account than specified in the connection: {"user":"test_user","password":"test_pwd","role":"test_role"}
        ///    Get tables from Redshift for different database than specified in the connection: {"database":"test_db"}
        /// </summary>
        [JsonProperty("configuration", NullValueHandling = NullValueHandling.Ignore)]
        public string Configuration { get; set; }

        /// <summary>
        /// List of table details
        /// </summary>
        [JsonProperty("table")]
        public List<Models.ConnectionTableColumnsInput> Table { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2ConnectionTablecoloumnRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2ConnectionTablecoloumnRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true)) &&
                ((this.Table == null && other.Table == null) || (this.Table?.Equals(other.Table) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
            toStringOutput.Add($"this.Table = {(this.Table == null ? "null" : $"[{string.Join(", ", this.Table)} ]")}");
        }
    }
}