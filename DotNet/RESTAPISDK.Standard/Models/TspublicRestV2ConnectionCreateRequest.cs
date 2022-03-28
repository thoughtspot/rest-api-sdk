// <copyright file="TspublicRestV2ConnectionCreateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2ConnectionCreateRequest.
    /// </summary>
    public class TspublicRestV2ConnectionCreateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionCreateRequest"/> class.
        /// </summary>
        public TspublicRestV2ConnectionCreateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionCreateRequest"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="name">name.</param>
        /// <param name="configuration">configuration.</param>
        /// <param name="description">description.</param>
        public TspublicRestV2ConnectionCreateRequest(
            Models.Type15Enum type,
            string name,
            string configuration,
            string description = null)
        {
            this.Type = type;
            this.Name = name;
            this.Description = description;
            this.Configuration = configuration;
        }

        /// <summary>
        /// Type of the data connection.
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.Type15Enum Type { get; set; }

        /// <summary>
        /// Name of the connection
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }

        /// <summary>
        /// A short description of the connection.
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// A JSON object of the connection metadata. The metadata must include configuration attributes required to create the connection.
        ///  Example:
        ///  Snowflake: {"accountName":"testaccount","user":"test_user","password":"test_pwd","role":"test_role","warehouse":"test_wh","database":"test_db"}
        ///   Redshift: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Google BigQuery: {"project_id":"test_project","oauth_pvt_key":"test_key"}
        ///  Azure Synapse: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Teradata: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Oracle ADW: {"user":"test_user","password":"test_pwd","net_service_name":"test_srvc_name","tns_admin":"test_tns","schema":"test_schema"}
        ///  Starburst: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Databricks: {"host":"test_host","http_path":"https://test ","user":"test_user","password":"test_pwd"}
        ///  SAP HANA: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Denodo: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd"}
        /// </summary>
        [JsonProperty("configuration")]
        public string Configuration { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2ConnectionCreateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2ConnectionCreateRequest other &&
                this.Type.Equals(other.Type) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
        }
    }
}