// <copyright file="TsObjectSearchInput.cs" company="APIMatic">
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
    /// TsObjectSearchInput.
    /// </summary>
    public class TsObjectSearchInput
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TsObjectSearchInput"/> class.
        /// </summary>
        public TsObjectSearchInput()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TsObjectSearchInput"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="id">id.</param>
        public TsObjectSearchInput(
            Models.TsObjectSearchInputTypeEnum type,
            List<string> id)
        {
            this.Type = type;
            this.Id = id;
        }

        /// <summary>
        /// Type of the metadata objec
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.TsObjectSearchInputTypeEnum Type { get; set; }

        /// <summary>
        /// A JSON Array of GUIDs of the metadata object
        /// </summary>
        [JsonProperty("id")]
        public List<string> Id { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TsObjectSearchInput : ({string.Join(", ", toStringOutput)})";
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

            return obj is TsObjectSearchInput other &&
                this.Type.Equals(other.Type) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : $"[{string.Join(", ", this.Id)} ]")}");
        }
    }
}