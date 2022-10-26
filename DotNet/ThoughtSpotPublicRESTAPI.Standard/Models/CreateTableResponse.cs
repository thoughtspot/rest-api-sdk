// <copyright file="CreateTableResponse.cs" company="APIMatic">
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
    /// CreateTableResponse.
    /// </summary>
    public class CreateTableResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateTableResponse"/> class.
        /// </summary>
        public CreateTableResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateTableResponse"/> class.
        /// </summary>
        /// <param name="logicalTableHeader">logicalTableHeader.</param>
        /// <param name="physicalTableId">physicalTableId.</param>
        public CreateTableResponse(
            Models.LogicalTableHeader logicalTableHeader = null,
            string physicalTableId = null)
        {
            this.LogicalTableHeader = logicalTableHeader;
            this.PhysicalTableId = physicalTableId;
        }

        /// <summary>
        /// Gets or sets LogicalTableHeader.
        /// </summary>
        [JsonProperty("logicalTableHeader", NullValueHandling = NullValueHandling.Ignore)]
        public Models.LogicalTableHeader LogicalTableHeader { get; set; }

        /// <summary>
        /// Gets or sets PhysicalTableId.
        /// </summary>
        [JsonProperty("physicalTableId", NullValueHandling = NullValueHandling.Ignore)]
        public string PhysicalTableId { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"CreateTableResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is CreateTableResponse other &&
                ((this.LogicalTableHeader == null && other.LogicalTableHeader == null) || (this.LogicalTableHeader?.Equals(other.LogicalTableHeader) == true)) &&
                ((this.PhysicalTableId == null && other.PhysicalTableId == null) || (this.PhysicalTableId?.Equals(other.PhysicalTableId) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.LogicalTableHeader = {(this.LogicalTableHeader == null ? "null" : this.LogicalTableHeader.ToString())}");
            toStringOutput.Add($"this.PhysicalTableId = {(this.PhysicalTableId == null ? "null" : this.PhysicalTableId == string.Empty ? "" : this.PhysicalTableId)}");
        }
    }
}