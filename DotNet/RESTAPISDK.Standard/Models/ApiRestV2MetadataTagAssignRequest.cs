// <copyright file="ApiRestV2MetadataTagAssignRequest.cs" company="APIMatic">
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
    /// ApiRestV2MetadataTagAssignRequest.
    /// </summary>
    public class ApiRestV2MetadataTagAssignRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2MetadataTagAssignRequest"/> class.
        /// </summary>
        public ApiRestV2MetadataTagAssignRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2MetadataTagAssignRequest"/> class.
        /// </summary>
        /// <param name="metaObject">metaObject.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        public ApiRestV2MetadataTagAssignRequest(
            List<Models.MetaObjectInput> metaObject,
            string name = null,
            string id = null)
        {
            this.Name = name;
            this.Id = id;
            this.MetaObject = metaObject;
        }

        /// <summary>
        /// Name of the tag
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the tag
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Metadata object details
        /// </summary>
        [JsonProperty("metaObject")]
        public List<Models.MetaObjectInput> MetaObject { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2MetadataTagAssignRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2MetadataTagAssignRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.MetaObject == null && other.MetaObject == null) || (this.MetaObject?.Equals(other.MetaObject) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.MetaObject = {(this.MetaObject == null ? "null" : $"[{string.Join(", ", this.MetaObject)} ]")}");
        }
    }
}