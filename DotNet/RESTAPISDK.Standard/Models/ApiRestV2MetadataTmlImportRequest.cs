// <copyright file="ApiRestV2MetadataTmlImportRequest.cs" company="APIMatic">
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
    /// ApiRestV2MetadataTmlImportRequest.
    /// </summary>
    public class ApiRestV2MetadataTmlImportRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2MetadataTmlImportRequest"/> class.
        /// </summary>
        public ApiRestV2MetadataTmlImportRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2MetadataTmlImportRequest"/> class.
        /// </summary>
        /// <param name="objectTML">objectTML.</param>
        /// <param name="importPolicy">importPolicy.</param>
        /// <param name="forceCreate">forceCreate.</param>
        public ApiRestV2MetadataTmlImportRequest(
            List<string> objectTML,
            Models.ImportPolicyEnum? importPolicy = Models.ImportPolicyEnum.PARTIAL,
            bool? forceCreate = false)
        {
            this.ObjectTML = objectTML;
            this.ImportPolicy = importPolicy;
            this.ForceCreate = forceCreate;
        }

        /// <summary>
        /// A JSON array of TML objects to upload, in YAML or JSON format.
        ///  If in YAML format within the JSON array, use escape characters for YAML quotes, and new line characters when there is a new line.
        ///  Example:
        ///  To import a single object, ["guid: 3729c085-8659-48fd-9479-a67bd7307496\npinboard:\n name: …"]
        ///  To import multiple objects, ["guid: 3729c085-8659-48fd-9479-a67bd7307496\npinboard:\n name: …", "guid: 5739d025-8659-48fd-9479-a67bd7704212\npinboard:\n name: …"]
        /// </summary>
        [JsonProperty("objectTML")]
        public List<string> ObjectTML { get; set; }

        /// <summary>
        /// Policy to follow during import.
        ///  PARTIAL - Imports all objects that validate successfully, and ignores objects that do not validate successfully.
        ///  ALL_OR_NONE Imports the objects that validate successfully.
        ///  VALIDATE_ONLY Validates the objects but does not import them.
        /// </summary>
        [JsonProperty("importPolicy", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.ImportPolicyEnum? ImportPolicy { get; set; }

        /// <summary>
        /// Specifies if you are updating or creating objects. To create new objects, specify true.
        ///  By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true.
        /// </summary>
        [JsonProperty("forceCreate", NullValueHandling = NullValueHandling.Ignore)]
        public bool? ForceCreate { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2MetadataTmlImportRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2MetadataTmlImportRequest other &&
                ((this.ObjectTML == null && other.ObjectTML == null) || (this.ObjectTML?.Equals(other.ObjectTML) == true)) &&
                ((this.ImportPolicy == null && other.ImportPolicy == null) || (this.ImportPolicy?.Equals(other.ImportPolicy) == true)) &&
                ((this.ForceCreate == null && other.ForceCreate == null) || (this.ForceCreate?.Equals(other.ForceCreate) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.ObjectTML = {(this.ObjectTML == null ? "null" : $"[{string.Join(", ", this.ObjectTML)} ]")}");
            toStringOutput.Add($"this.ImportPolicy = {(this.ImportPolicy == null ? "null" : this.ImportPolicy.ToString())}");
            toStringOutput.Add($"this.ForceCreate = {(this.ForceCreate == null ? "null" : this.ForceCreate.ToString())}");
        }
    }
}