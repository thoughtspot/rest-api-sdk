// <copyright file="TspublicRestV2ConnectionTableRequest.cs" company="APIMatic">
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
    /// TspublicRestV2ConnectionTableRequest.
    /// </summary>
    public class TspublicRestV2ConnectionTableRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionTableRequest"/> class.
        /// </summary>
        public TspublicRestV2ConnectionTableRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionTableRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="configuration">configuration.</param>
        /// <param name="includeColumn">includeColumn.</param>
        public TspublicRestV2ConnectionTableRequest(
            string id,
            string configuration = null,
            Models.GetConnectionTablesIncludeColumnEnum? includeColumn = Models.GetConnectionTablesIncludeColumnEnum.True)
        {
            this.Id = id;
            this.Configuration = configuration;
            this.IncludeColumn = includeColumn;
        }

        /// <summary>
        /// GUID of the connection
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// A JSON object of the connection metadata. If this field is left empty, then the configuration saved in the connection is considered.
        ///  To get the tables based on a different configuration, include required attributes in the connection configuration JSON.
        ///  Example:
        ///  Get tables from Snowflake with a different user account than specified in the connection: {"user":"test_user","password":"test_pwd","role":"test_role"}
        ///  Get tables from Redshift for different database than specified in the connection: {"database":"test_db"}
        /// </summary>
        [JsonProperty("configuration", NullValueHandling = NullValueHandling.Ignore)]
        public string Configuration { get; set; }

        /// <summary>
        /// When set to true, the response will include column level details as well.
        /// </summary>
        [JsonProperty("includeColumn", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.GetConnectionTablesIncludeColumnEnum? IncludeColumn { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2ConnectionTableRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2ConnectionTableRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true)) &&
                ((this.IncludeColumn == null && other.IncludeColumn == null) || (this.IncludeColumn?.Equals(other.IncludeColumn) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
            toStringOutput.Add($"this.IncludeColumn = {(this.IncludeColumn == null ? "null" : this.IncludeColumn.ToString())}");
        }
    }
}