// <copyright file="LogsResponse.cs" company="APIMatic">
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
    /// LogsResponse.
    /// </summary>
    public class LogsResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LogsResponse"/> class.
        /// </summary>
        public LogsResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LogsResponse"/> class.
        /// </summary>
        /// <param name="date">date.</param>
        /// <param name="log">log.</param>
        public LogsResponse(
            string date = null,
            string log = null)
        {
            this.Date = date;
            this.Log = log;
        }

        /// <summary>
        /// Date and time for the event in the log
        /// </summary>
        [JsonProperty("date", NullValueHandling = NullValueHandling.Ignore)]
        public string Date { get; set; }

        /// <summary>
        /// Logged event at the time specified in JSON format. This includes, Event ID, A unique description of the event, for example, User login failed, Timestamp, User ID of the person initiating the event and IP address of the ThoughtSpot instance.
        /// </summary>
        [JsonProperty("log", NullValueHandling = NullValueHandling.Ignore)]
        public string Log { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"LogsResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is LogsResponse other &&
                ((this.Date == null && other.Date == null) || (this.Date?.Equals(other.Date) == true)) &&
                ((this.Log == null && other.Log == null) || (this.Log?.Equals(other.Log) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Date = {(this.Date == null ? "null" : this.Date == string.Empty ? "" : this.Date)}");
            toStringOutput.Add($"this.Log = {(this.Log == null ? "null" : this.Log == string.Empty ? "" : this.Log)}");
        }
    }
}