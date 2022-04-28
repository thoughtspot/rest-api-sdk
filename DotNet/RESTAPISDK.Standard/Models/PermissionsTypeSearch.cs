// <copyright file="PermissionsTypeSearch.cs" company="APIMatic">
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
    /// PermissionsTypeSearch.
    /// </summary>
    public class PermissionsTypeSearch
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PermissionsTypeSearch"/> class.
        /// </summary>
        public PermissionsTypeSearch()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PermissionsTypeSearch"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="tsObject">tsObject.</param>
        public PermissionsTypeSearch(
            string type = null,
            List<Models.TsObjectTypeSerach> tsObject = null)
        {
            this.Type = type;
            this.TsObject = tsObject;
        }

        /// <summary>
        /// Indicates the type of the object
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// An array of objects of type mentioned in type field
        /// </summary>
        [JsonProperty("tsObject", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.TsObjectTypeSerach> TsObject { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"PermissionsTypeSearch : ({string.Join(", ", toStringOutput)})";
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

            return obj is PermissionsTypeSearch other &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.TsObject == null && other.TsObject == null) || (this.TsObject?.Equals(other.TsObject) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.TsObject = {(this.TsObject == null ? "null" : $"[{string.Join(", ", this.TsObject)} ]")}");
        }
    }
}