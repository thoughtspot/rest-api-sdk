// <copyright file="ApiRestV2DatabaseTableRunqueryRequest.cs" company="APIMatic">
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
    /// ApiRestV2DatabaseTableRunqueryRequest.
    /// </summary>
    public class ApiRestV2DatabaseTableRunqueryRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2DatabaseTableRunqueryRequest"/> class.
        /// </summary>
        public ApiRestV2DatabaseTableRunqueryRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2DatabaseTableRunqueryRequest"/> class.
        /// </summary>
        /// <param name="statement">statement.</param>
        public ApiRestV2DatabaseTableRunqueryRequest(
            List<string> statement)
        {
            this.Statement = statement;
        }

        /// <summary>
        /// A JSON array of TQL statements.
        ///  Each TQL statement should end with semi-colon (;).
        ///  The TQL operations that can be run through this API are restricted to create database and schema, alter table, delete and update table rows.
        ///  If a TQL statement fails, then the subsequent statements in the array are not run.
        ///  Example:
        ///  alter table test_db.test_schema.test_table drop contraint primary key;
        /// </summary>
        [JsonProperty("statement")]
        public List<string> Statement { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2DatabaseTableRunqueryRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2DatabaseTableRunqueryRequest other &&
                ((this.Statement == null && other.Statement == null) || (this.Statement?.Equals(other.Statement) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Statement = {(this.Statement == null ? "null" : $"[{string.Join(", ", this.Statement)} ]")}");
        }
    }
}