// <copyright file="ClientState.cs" company="APIMatic">
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
    /// ClientState.
    /// </summary>
    public class ClientState
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientState"/> class.
        /// </summary>
        public ClientState()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ClientState"/> class.
        /// </summary>
        /// <param name="color">color.</param>
        public ClientState(
            string color = null)
        {
            this.Color = color;
        }

        /// <summary>
        /// Color assigned to the tag
        /// </summary>
        [JsonProperty("color", NullValueHandling = NullValueHandling.Ignore)]
        public string Color { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ClientState : ({string.Join(", ", toStringOutput)})";
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

            return obj is ClientState other &&
                ((this.Color == null && other.Color == null) || (this.Color?.Equals(other.Color) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Color = {(this.Color == null ? "null" : this.Color == string.Empty ? "" : this.Color)}");
        }
    }
}