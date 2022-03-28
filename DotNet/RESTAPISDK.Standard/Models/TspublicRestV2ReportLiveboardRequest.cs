// <copyright file="TspublicRestV2ReportLiveboardRequest.cs" company="APIMatic">
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
    /// TspublicRestV2ReportLiveboardRequest.
    /// </summary>
    public class TspublicRestV2ReportLiveboardRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ReportLiveboardRequest"/> class.
        /// </summary>
        public TspublicRestV2ReportLiveboardRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2ReportLiveboardRequest"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="id">id.</param>
        /// <param name="vizId">vizId.</param>
        /// <param name="transientContent">transientContent.</param>
        /// <param name="runtimeFilter">runtimeFilter.</param>
        /// <param name="runtimeSort">runtimeSort.</param>
        /// <param name="pdfOptions">pdfOptions.</param>
        public TspublicRestV2ReportLiveboardRequest(
            Models.Type17Enum type,
            string id = null,
            List<string> vizId = null,
            string transientContent = null,
            string runtimeFilter = null,
            string runtimeSort = null,
            Models.PdfOptionsInput pdfOptions = null)
        {
            this.Id = id;
            this.VizId = vizId;
            this.TransientContent = transientContent;
            this.RuntimeFilter = runtimeFilter;
            this.RuntimeSort = runtimeSort;
            this.Type = type;
            this.PdfOptions = pdfOptions;
        }

        /// <summary>
        /// GUID of the Liveboard to download.
        ///  This field is considered only when no input is provided for transientContent field.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded file.
        ///  For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is valid only for visualization of type table and PNG is valid for charts.
        ///  Only one value will be accepted for these formats. If multiple values are provided then first value in the array will be considered.
        /// </summary>
        [JsonProperty("vizId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> VizId { get; set; }

        /// <summary>
        /// If you have embedded ThoughtSpot in your host application, and you want to download Liveboards with unsaved changes as a file, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard.
        /// </summary>
        [JsonProperty("transientContent", NullValueHandling = NullValueHandling.Ignore)]
        public string TransientContent { get; set; }

        /// <summary>
        /// JSON object which contains filter condition to filter the data at the time of data retrieval.
        ///  Example: {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":"BET","val2":["1625126400000","1625126400000"]}
        ///  For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters
        /// </summary>
        [JsonProperty("runtimeFilter", NullValueHandling = NullValueHandling.Ignore)]
        public string RuntimeFilter { get; set; }

        /// <summary>
        /// JSON object which provides columns to sort the data at the time of data retrieval.
        ///  Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}
        ///  For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters
        /// </summary>
        [JsonProperty("runtimeSort", NullValueHandling = NullValueHandling.Ignore)]
        public string RuntimeSort { get; set; }

        /// <summary>
        /// Type of file to be generated.
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.Type17Enum Type { get; set; }

        /// <summary>
        /// Gets or sets PdfOptions.
        /// </summary>
        [JsonProperty("pdfOptions", NullValueHandling = NullValueHandling.Ignore)]
        public Models.PdfOptionsInput PdfOptions { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2ReportLiveboardRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2ReportLiveboardRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.VizId == null && other.VizId == null) || (this.VizId?.Equals(other.VizId) == true)) &&
                ((this.TransientContent == null && other.TransientContent == null) || (this.TransientContent?.Equals(other.TransientContent) == true)) &&
                ((this.RuntimeFilter == null && other.RuntimeFilter == null) || (this.RuntimeFilter?.Equals(other.RuntimeFilter) == true)) &&
                ((this.RuntimeSort == null && other.RuntimeSort == null) || (this.RuntimeSort?.Equals(other.RuntimeSort) == true)) &&
                this.Type.Equals(other.Type) &&
                ((this.PdfOptions == null && other.PdfOptions == null) || (this.PdfOptions?.Equals(other.PdfOptions) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.VizId = {(this.VizId == null ? "null" : $"[{string.Join(", ", this.VizId)} ]")}");
            toStringOutput.Add($"this.TransientContent = {(this.TransientContent == null ? "null" : this.TransientContent == string.Empty ? "" : this.TransientContent)}");
            toStringOutput.Add($"this.RuntimeFilter = {(this.RuntimeFilter == null ? "null" : this.RuntimeFilter == string.Empty ? "" : this.RuntimeFilter)}");
            toStringOutput.Add($"this.RuntimeSort = {(this.RuntimeSort == null ? "null" : this.RuntimeSort == string.Empty ? "" : this.RuntimeSort)}");
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.PdfOptions = {(this.PdfOptions == null ? "null" : this.PdfOptions.ToString())}");
        }
    }
}