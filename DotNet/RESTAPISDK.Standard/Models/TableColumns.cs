// <copyright file="TableColumns.cs" company="APIMatic">
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
    /// TableColumns.
    /// </summary>
    public class TableColumns
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TableColumns"/> class.
        /// </summary>
        public TableColumns()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TableColumns"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="dataType">dataType.</param>
        public TableColumns(
            string name = null,
            string dataType = null)
        {
            this.Name = name;
            this.DataType = dataType;
        }

        /// <summary>
        /// Name of the column
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Datatype of the column
        /// </summary>
        [JsonProperty("dataType", NullValueHandling = NullValueHandling.Ignore)]
        public string DataType { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TableColumns : ({string.Join(", ", toStringOutput)})";
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

            return obj is TableColumns other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.DataType == null && other.DataType == null) || (this.DataType?.Equals(other.DataType) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.DataType = {(this.DataType == null ? "null" : this.DataType == string.Empty ? "" : this.DataType)}");
        }
    }
}