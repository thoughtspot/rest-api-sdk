// <copyright file="TspublicRestV2DatabaseTableCreateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2DatabaseTableCreateRequest.
    /// </summary>
    public class TspublicRestV2DatabaseTableCreateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2DatabaseTableCreateRequest"/> class.
        /// </summary>
        public TspublicRestV2DatabaseTableCreateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2DatabaseTableCreateRequest"/> class.
        /// </summary>
        /// <param name="createDatabase">createDatabase.</param>
        /// <param name="schema">schema.</param>
        public TspublicRestV2DatabaseTableCreateRequest(
            bool? createDatabase = true,
            string schema = null)
        {
            this.CreateDatabase = createDatabase;
            this.Schema = schema;
        }

        /// <summary>
        /// Flag to indicate if the database and schema should be created if they do not exist in Falcon. (Valid values: True/False)
        /// </summary>
        [JsonProperty("createDatabase", NullValueHandling = NullValueHandling.Ignore)]
        public bool? CreateDatabase { get; set; }

        /// <summary>
        /// DDL of the table to be created. Example: {"database":{"name":"test_db"},"schema":{"name":"test_schema"},"table":{"id":{"name":"test_table"},"primary_key":[{"name":"test_pk"}],"column":[{"id":{"name":"test_pk"},"size":0,"data_type":"TYPE_INT32"},{"id":{"name":"test_col1"},"size":0,"data_type":"TYPE_FLOAT"},{"id":{"name":"test_col2"},"data_type":"TYPE_INT64","datetime":"TYPE_DATE"}{"id":{"name":"test_col3"},"size":10,"data_type":"TYPE_VAR_CHAR"}]}}
        /// </summary>
        [JsonProperty("schema", NullValueHandling = NullValueHandling.Ignore)]
        public string Schema { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2DatabaseTableCreateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2DatabaseTableCreateRequest other &&
                ((this.CreateDatabase == null && other.CreateDatabase == null) || (this.CreateDatabase?.Equals(other.CreateDatabase) == true)) &&
                ((this.Schema == null && other.Schema == null) || (this.Schema?.Equals(other.Schema) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.CreateDatabase = {(this.CreateDatabase == null ? "null" : this.CreateDatabase.ToString())}");
            toStringOutput.Add($"this.Schema = {(this.Schema == null ? "null" : this.Schema == string.Empty ? "" : this.Schema)}");
        }
    }
}