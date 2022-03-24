// <copyright file="MetaObjectInput.cs" company="APIMatic">
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
    /// MetaObjectInput.
    /// </summary>
    public class MetaObjectInput
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MetaObjectInput"/> class.
        /// </summary>
        public MetaObjectInput()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetaObjectInput"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="type">type.</param>
        public MetaObjectInput(
            string id,
            Models.TypeEnum type)
        {
            this.Id = id;
            this.Type = type;
        }

        /// <summary>
        /// GUID of the metadata object
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// Type of the metadata object
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.TypeEnum Type { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"MetaObjectInput : ({string.Join(", ", toStringOutput)})";
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

            return obj is MetaObjectInput other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                this.Type.Equals(other.Type);
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Type = {this.Type}");
        }
    }
}