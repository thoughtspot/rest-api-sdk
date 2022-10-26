// <copyright file="TspublicRestV2CustomactionAssociationUpdateRequest.cs" company="APIMatic">
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
    /// TspublicRestV2CustomactionAssociationUpdateRequest.
    /// </summary>
    public class TspublicRestV2CustomactionAssociationUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionAssociationUpdateRequest"/> class.
        /// </summary>
        public TspublicRestV2CustomactionAssociationUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2CustomactionAssociationUpdateRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="association">association.</param>
        public TspublicRestV2CustomactionAssociationUpdateRequest(
            string id,
            string association)
        {
            this.Id = id;
            this.Association = association;
        }

        /// <summary>
        /// GUID of the custom action
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// A JSON map of the attributes with association of the action to ThoughtSpot object ID
        /// Example:
        /// {"id":"0dbd5b3a-84c1-4407-9803-cf07d67e6fcf","name":"My worksheet action","version":"v2","type":"URL","detail":{"link":"https://unpkg.com","function":"my-worksheet-action","authSelect":"NONE","authToken":"","encodeUser":"","apiKey":"X-API-KEY","apiValue":"","additionalUrlHeaders":"{}"},"actionAssociationMap":{"WORKSHEET":{"2b9d083a-275c-4984-9cfe-90b036affa17":{"enabled":"true","context":"PRIMARY"}}},"context":"NONE","availability":[ ],"userGroupList":["d0326b56-ef23-4c8a-8327-a30e99bcc72b"]}
        /// </summary>
        [JsonProperty("association")]
        public string Association { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2CustomactionAssociationUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2CustomactionAssociationUpdateRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Association == null && other.Association == null) || (this.Association?.Equals(other.Association) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Association = {(this.Association == null ? "null" : this.Association == string.Empty ? "" : this.Association)}");
        }
    }
}