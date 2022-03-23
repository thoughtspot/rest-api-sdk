// <copyright file="TspublicRestV2ConnectionRemovetableRequest.cs" company="APIMatic">
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
    /// TspublicRestV2ConnectionRemovetableRequest.
    /// </summary>
    public class TspublicRestV2ConnectionRemovetableRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionRemovetableRequest"/> class.
        /// </summary>
        public TspublicRestV2ConnectionRemovetableRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ConnectionRemovetableRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="table">table.</param>
        public TspublicRestV2ConnectionRemovetableRequest(
            string id,
            List<Models.TableInput> table)
        {
            this.Id = id;
            this.Table = table;
        }

        /// <summary>
        /// GUID of the connection
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets Table.
        /// </summary>
        [JsonProperty("table")]
        public List<Models.TableInput> Table { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2ConnectionRemovetableRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2ConnectionRemovetableRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Table == null && other.Table == null) || (this.Table?.Equals(other.Table) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Table = {(this.Table == null ? "null" : $"[{string.Join(", ", this.Table)} ]")}");
        }
    }
}