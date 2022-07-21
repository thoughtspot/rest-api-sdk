// <copyright file="TspublicRestV2AdminForcelogoutRequest.cs" company="APIMatic">
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
    /// TspublicRestV2AdminForcelogoutRequest.
    /// </summary>
    public class TspublicRestV2AdminForcelogoutRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminForcelogoutRequest"/> class.
        /// </summary>
        public TspublicRestV2AdminForcelogoutRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminForcelogoutRequest"/> class.
        /// </summary>
        /// <param name="user">user.</param>
        public TspublicRestV2AdminForcelogoutRequest(
            List<Models.NameAndIdInput> user = null)
        {
            this.User = user;
        }

        /// <summary>
        /// A JSON array of name of users or GUIDs of groups or both. When both are given then id is considered.
        /// </summary>
        [JsonProperty("user", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.NameAndIdInput> User { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2AdminForcelogoutRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2AdminForcelogoutRequest other &&
                ((this.User == null && other.User == null) || (this.User?.Equals(other.User) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.User = {(this.User == null ? "null" : $"[{string.Join(", ", this.User)} ]")}");
        }
    }
}