// <copyright file="TspublicRestV2DataLiveboardRequest.cs" company="APIMatic">
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
    /// TspublicRestV2DataLiveboardRequest.
    /// </summary>
    public class TspublicRestV2DataLiveboardRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2DataLiveboardRequest"/> class.
        /// </summary>
        public TspublicRestV2DataLiveboardRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2DataLiveboardRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="offset">offset.</param>
        /// <param name="batchNumber">batchNumber.</param>
        /// <param name="batchSize">batchSize.</param>
        /// <param name="vizId">vizId.</param>
        /// <param name="formatType">formatType.</param>
        public TspublicRestV2DataLiveboardRequest(
            string id,
            int? offset = 0,
            int? batchNumber = null,
            int? batchSize = null,
            List<string> vizId = null,
            Models.FormatType1Enum? formatType = Models.FormatType1Enum.COMPACT)
        {
            this.Offset = offset;
            this.BatchNumber = batchNumber;
            this.BatchSize = batchSize;
            this.Id = id;
            this.VizId = vizId;
            this.FormatType = formatType;
        }

        /// <summary>
        /// The offset point, starting from where the records should be included in the response.
        ///  If no input is provided then offset starts from 0.
        /// </summary>
        [JsonProperty("offset", NullValueHandling = NullValueHandling.Ignore)]
        public int? Offset { get; set; }

        /// <summary>
        /// An alternate way to set offset for the starting point of the response.
        ///  The value in offset field will not be considered if batchNumber field has value greater than 0.
        ///  Offset value will be calculated as (batchNumber - 1) * batchSize.
        ///  It is mandatory to provide a value for batchSize with batchNumber.
        ///  Example:
        ///  Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.
        /// </summary>
        [JsonProperty("batchNumber", NullValueHandling = NullValueHandling.Ignore)]
        public int? BatchNumber { get; set; }

        /// <summary>
        /// The number of records that should be included in the response starting from offset position.
        ///  If no input is provided, then all records starting from the value provided in offset is included in the response.
        /// </summary>
        [JsonProperty("batchSize", NullValueHandling = NullValueHandling.Ignore)]
        public int? BatchSize { get; set; }

        /// <summary>
        /// The GUID of the Liveboard
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// A JSON array of GUIDs of the visualizations in the Liveboard.
        /// </summary>
        [JsonProperty("vizId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> VizId { get; set; }

        /// <summary>
        /// The format of the data in the response.
        ///  FULL: The response comes in "column":"value" format.
        ///  COMPACT: The response includes only the value of the columns.
        /// </summary>
        [JsonProperty("formatType", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.FormatType1Enum? FormatType { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2DataLiveboardRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2DataLiveboardRequest other &&
                ((this.Offset == null && other.Offset == null) || (this.Offset?.Equals(other.Offset) == true)) &&
                ((this.BatchNumber == null && other.BatchNumber == null) || (this.BatchNumber?.Equals(other.BatchNumber) == true)) &&
                ((this.BatchSize == null && other.BatchSize == null) || (this.BatchSize?.Equals(other.BatchSize) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.VizId == null && other.VizId == null) || (this.VizId?.Equals(other.VizId) == true)) &&
                ((this.FormatType == null && other.FormatType == null) || (this.FormatType?.Equals(other.FormatType) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Offset = {(this.Offset == null ? "null" : this.Offset.ToString())}");
            toStringOutput.Add($"this.BatchNumber = {(this.BatchNumber == null ? "null" : this.BatchNumber.ToString())}");
            toStringOutput.Add($"this.BatchSize = {(this.BatchSize == null ? "null" : this.BatchSize.ToString())}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.VizId = {(this.VizId == null ? "null" : $"[{string.Join(", ", this.VizId)} ]")}");
            toStringOutput.Add($"this.FormatType = {(this.FormatType == null ? "null" : this.FormatType.ToString())}");
        }
    }
}