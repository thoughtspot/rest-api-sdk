// <copyright file="TspublicRestV2MetadataTmlImportRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataTmlImportRequest.
    /// </summary>
    public class TspublicRestV2MetadataTmlImportRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataTmlImportRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataTmlImportRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataTmlImportRequest"/> class.
        /// </summary>
        /// <param name="objectTML">objectTML.</param>
        /// <param name="importPolicy">importPolicy.</param>
        /// <param name="forceCreate">forceCreate.</param>
        public TspublicRestV2MetadataTmlImportRequest(
            List<string> objectTML,
            Models.ImportObjectTMLImportPolicyEnum? importPolicy = Models.ImportObjectTMLImportPolicyEnum.PARTIAL,
            Models.ImportObjectTMLForceCreateEnum? forceCreate = Models.ImportObjectTMLForceCreateEnum.False)
        {
            this.ObjectTML = objectTML;
            this.ImportPolicy = importPolicy;
            this.ForceCreate = forceCreate;
        }

        /// <summary>
        /// A string array of TML objects to upload, in YAML or JSON format.
        ///  If TML is in YAML format, then use new line characters when there is new line.
        ///  Example TML:
        ///  guid: 6d2c1c9b-a407-409c-8c0c-819aeb51350f\ntable:\n  name: TESTINT\n  db: SUPPLYCHAIN_MAIN\n  schema: PUBLIC\n  db_table: TESTINT\n  connection:\n    name: SnowflakeConnection\n  columns:\n  - name: C1\n    db_column_name: C1\n    properties:\n      column_type: MEASURE\n      aggregation: SUM\n      index_type: DONT_INDEX\n    db_column_properties:\n      data_type: INT64\n
        ///  Example TML in JSON format:
        ///  {"guid": "6d2c1c9b-a407-409c-8c0c-819aeb51350f", "table": {"name": "TESTINT", "db": "SUPPLYCHAIN_MAIN", "schema": "PUBLIC", "db_table": "TESTINT","connection": { "name": "SnowflakeConnection" }, "columns": [ { "name": "C1", "db_column_name": "C1", "properties": { "column_type": "MEASURE", "aggregation": "SUM", "index_type": "DONT_INDEX" }, "db_column_properties": { "data_type": "INT64" } } ] } }
        /// </summary>
        [JsonProperty("objectTML")]
        public List<string> ObjectTML { get; set; }

        /// <summary>
        /// Policy to follow during import.
        ///  PARTIAL - Imports all objects that validate successfully, and ignores objects that do not validate successfully.
        ///  ALL_OR_NONE Imports the objects that validate successfully.
        ///  VALIDATE_ONLY Validates the objects but does not import them.
        /// </summary>
        [JsonProperty("importPolicy", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ImportObjectTMLImportPolicyEnum? ImportPolicy { get; set; }

        /// <summary>
        /// Specifies if you are updating or creating objects. To create new objects, specify true.
        ///  By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true.
        /// </summary>
        [JsonProperty("forceCreate", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ImportObjectTMLForceCreateEnum? ForceCreate { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataTmlImportRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataTmlImportRequest other &&
                ((this.ObjectTML == null && other.ObjectTML == null) || (this.ObjectTML?.Equals(other.ObjectTML) == true)) &&
                ((this.ImportPolicy == null && other.ImportPolicy == null) || (this.ImportPolicy?.Equals(other.ImportPolicy) == true)) &&
                ((this.ForceCreate == null && other.ForceCreate == null) || (this.ForceCreate?.Equals(other.ForceCreate) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.ObjectTML = {(this.ObjectTML == null ? "null" : $"[{string.Join(", ", this.ObjectTML)} ]")}");
            toStringOutput.Add($"this.ImportPolicy = {(this.ImportPolicy == null ? "null" : this.ImportPolicy.ToString())}");
            toStringOutput.Add($"this.ForceCreate = {(this.ForceCreate == null ? "null" : this.ForceCreate.ToString())}");
        }
    }
}