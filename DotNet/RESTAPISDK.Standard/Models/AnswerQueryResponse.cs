// <copyright file="AnswerQueryResponse.cs" company="APIMatic">
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
    /// AnswerQueryResponse.
    /// </summary>
    public class AnswerQueryResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnswerQueryResponse"/> class.
        /// </summary>
        public AnswerQueryResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AnswerQueryResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="querySql">querySql.</param>
        public AnswerQueryResponse(
            string name = null,
            string id = null,
            string querySql = null)
        {
            this.Name = name;
            this.Id = id;
            this.QuerySql = querySql;
        }

        /// <summary>
        /// The name of the saved Answer
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the saved Answer
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// SQL query associated with the saved Answer
        /// </summary>
        [JsonProperty("querySql", NullValueHandling = NullValueHandling.Ignore)]
        public string QuerySql { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"AnswerQueryResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is AnswerQueryResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.QuerySql == null && other.QuerySql == null) || (this.QuerySql?.Equals(other.QuerySql) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.QuerySql = {(this.QuerySql == null ? "null" : this.QuerySql == string.Empty ? "" : this.QuerySql)}");
        }
    }
}