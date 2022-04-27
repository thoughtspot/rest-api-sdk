// <copyright file="TspublicRestV2MetadataTmlExportRequest.cs" company="APIMatic">
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
    /// TspublicRestV2MetadataTmlExportRequest.
    /// </summary>
    public class TspublicRestV2MetadataTmlExportRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataTmlExportRequest"/> class.
        /// </summary>
        public TspublicRestV2MetadataTmlExportRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2MetadataTmlExportRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="formatType">formatType.</param>
        /// <param name="exportAssociated">exportAssociated.</param>
        public TspublicRestV2MetadataTmlExportRequest(
            List<string> id,
            Models.ExportObjectTMLFormatTypeEnum? formatType = Models.ExportObjectTMLFormatTypeEnum.YAML,
            Models.ExportObjectTMLExportAssociatedEnum? exportAssociated = Models.ExportObjectTMLExportAssociatedEnum.False)
        {
            this.Id = id;
            this.FormatType = formatType;
            this.ExportAssociated = exportAssociated;
        }

        /// <summary>
        /// A JSON array of GUIDs of the objects.
        /// </summary>
        [JsonProperty("id")]
        public List<string> Id { get; set; }

        /// <summary>
        /// The format in which to export the objects
        /// </summary>
        [JsonProperty("formatType", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ExportObjectTMLFormatTypeEnum? FormatType { get; set; }

        /// <summary>
        /// Specifies if you would like to export the associated objects. To export the objects associated with the objects specified in id, set the value to true. When set to true, the API exports any underlying worksheets, tables, or views for a given object.
        ///  By default, the API does not export these underlying objects
        /// </summary>
        [JsonProperty("exportAssociated", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ExportObjectTMLExportAssociatedEnum? ExportAssociated { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2MetadataTmlExportRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2MetadataTmlExportRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.FormatType == null && other.FormatType == null) || (this.FormatType?.Equals(other.FormatType) == true)) &&
                ((this.ExportAssociated == null && other.ExportAssociated == null) || (this.ExportAssociated?.Equals(other.ExportAssociated) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : $"[{string.Join(", ", this.Id)} ]")}");
            toStringOutput.Add($"this.FormatType = {(this.FormatType == null ? "null" : this.FormatType.ToString())}");
            toStringOutput.Add($"this.ExportAssociated = {(this.ExportAssociated == null ? "null" : this.ExportAssociated.ToString())}");
        }
    }
}