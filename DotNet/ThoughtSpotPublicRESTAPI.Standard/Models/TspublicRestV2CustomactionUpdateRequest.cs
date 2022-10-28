// <copyright file="TspublicRestV2CustomactionUpdateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2CustomactionUpdateRequest.
    /// </summary>
    public class TspublicRestV2CustomactionUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionUpdateRequest"/> class.
        /// </summary>
        public TspublicRestV2CustomactionUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionUpdateRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="configuration">configuration.</param>
        public TspublicRestV2CustomactionUpdateRequest(
            string id,
            string configuration)
        {
            this.Id = id;
            this.Configuration = configuration;
        }

        /// <summary>
        /// GUID of the custom action
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// A JSON object with the key-value pair of configuration attributes
        /// Example:
        /// {"id":"3f7eac93-cce1-4ffc-b7a8-429353edbc6b","name":"unpkg test","version":"v2","type":"URL","detail":{"link":"https://unpkg.com ","function":"unpkg-test","authSelect":"BEARER","authToken":"asdfasadf3q4534534","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{\\"url_header1\\":{\\"id\\":\\"6a82908c-9328-40ff-b347-65adeda12f57\\",\\"key\\":\\"key1\\",\\"value\\":\\"value1\\"}}"},"actionAssociationMap":{"ANSWER":{"e4079d3f-ae71-4b0a-a70a-f17ecaf157a5":{"enabled":"true","context":"MENU"}}},"context":"NONE","availability":["GLOBAL"],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]}
        /// </summary>
        [JsonProperty("configuration")]
        public string Configuration { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2CustomactionUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2CustomactionUpdateRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
        }
    }
}