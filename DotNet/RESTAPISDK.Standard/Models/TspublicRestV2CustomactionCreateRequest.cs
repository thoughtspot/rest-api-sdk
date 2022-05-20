// <copyright file="TspublicRestV2CustomactionCreateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2CustomactionCreateRequest.
    /// </summary>
    public class TspublicRestV2CustomactionCreateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionCreateRequest"/> class.
        /// </summary>
        public TspublicRestV2CustomactionCreateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionCreateRequest"/> class.
        /// </summary>
        /// <param name="configuration">configuration.</param>
        public TspublicRestV2CustomactionCreateRequest(
            string configuration)
        {
            this.Configuration = configuration;
        }

        /// <summary>
        /// A JSON object with the key-value pair of configuration attributes
        ///  Example:
        ///  {"id":"3f7eac93-cce1-4ffc-b7a8-429353edbc6b","name":"unpkg test","version":"v2","type":"URL","detail":{"link":"https://unpkg.com ","function":"unpkg-test","authSelect":"BEARER","authToken":"asdfasadf3q4534534","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{\\"url_header1\\":{\\"id\\":\\"6a82908c-9328-40ff-b347-65adeda12f57\\",\\"key\\":\\"key1\\",\\"value\\":\\"value1\\"}}"},"actionAssociationMap":{"ANSWER":{"e4079d3f-ae71-4b0a-a70a-f17ecaf157a5":{"enabled":"true","context":"MENU"}}},"context":"NONE","availability":["GLOBAL"],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]}
        /// </summary>
        [JsonProperty("configuration")]
        public string Configuration { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2CustomactionCreateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2CustomactionCreateRequest other &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
        }
    }
}