// <copyright file="PdfOptionsInput.cs" company="APIMatic">
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
    /// PdfOptionsInput.
    /// </summary>
    public class PdfOptionsInput
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PdfOptionsInput"/> class.
        /// </summary>
        public PdfOptionsInput()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PdfOptionsInput"/> class.
        /// </summary>
        /// <param name="orientation">orientation.</param>
        /// <param name="truncateTables">truncateTables.</param>
        /// <param name="includeLogo">includeLogo.</param>
        /// <param name="footerText">footerText.</param>
        /// <param name="includePageNumber">includePageNumber.</param>
        /// <param name="includeCoverPage">includeCoverPage.</param>
        /// <param name="includeFilterPage">includeFilterPage.</param>
        public PdfOptionsInput(
            Models.OrientationEnum? orientation = null,
            bool? truncateTables = null,
            bool? includeLogo = null,
            string footerText = null,
            bool? includePageNumber = null,
            bool? includeCoverPage = null,
            bool? includeFilterPage = null)
        {
            this.Orientation = orientation;
            this.TruncateTables = truncateTables;
            this.IncludeLogo = includeLogo;
            this.FooterText = footerText;
            this.IncludePageNumber = includePageNumber;
            this.IncludeCoverPage = includeCoverPage;
            this.IncludeFilterPage = includeFilterPage;
        }

        /// <summary>
        /// Page orientation for the PDF. Default: PORTRAIT
        /// </summary>
        [JsonProperty("orientation", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.OrientationEnum? Orientation { get; set; }

        /// <summary>
        /// When set to true, only the first page of the tables is displayed in the file.
        /// This setting is applicable only when generating report for specific visualization ids. Default: false
        /// </summary>
        [JsonProperty("truncateTables", NullValueHandling = NullValueHandling.Ignore)]
        public bool? TruncateTables { get; set; }

        /// <summary>
        /// Include customized wide logo if available in the footer. Default: true
        /// </summary>
        [JsonProperty("includeLogo", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IncludeLogo { get; set; }

        /// <summary>
        /// Footer text to include in the footer of each page of the PDF.
        /// </summary>
        [JsonProperty("footerText", NullValueHandling = NullValueHandling.Ignore)]
        public string FooterText { get; set; }

        /// <summary>
        /// When set to true, the page number is included in the footer of each page. Default: true
        /// </summary>
        [JsonProperty("includePageNumber", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IncludePageNumber { get; set; }

        /// <summary>
        /// When set to true, a cover page with the Liveboard title is added in the PDF. Default: true
        /// </summary>
        [JsonProperty("includeCoverPage", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IncludeCoverPage { get; set; }

        /// <summary>
        /// When set to true, a second page with a list of all applied filters is added in the PDF. Default: true
        /// </summary>
        [JsonProperty("includeFilterPage", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IncludeFilterPage { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"PdfOptionsInput : ({string.Join(", ", toStringOutput)})";
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

            return obj is PdfOptionsInput other &&
                ((this.Orientation == null && other.Orientation == null) || (this.Orientation?.Equals(other.Orientation) == true)) &&
                ((this.TruncateTables == null && other.TruncateTables == null) || (this.TruncateTables?.Equals(other.TruncateTables) == true)) &&
                ((this.IncludeLogo == null && other.IncludeLogo == null) || (this.IncludeLogo?.Equals(other.IncludeLogo) == true)) &&
                ((this.FooterText == null && other.FooterText == null) || (this.FooterText?.Equals(other.FooterText) == true)) &&
                ((this.IncludePageNumber == null && other.IncludePageNumber == null) || (this.IncludePageNumber?.Equals(other.IncludePageNumber) == true)) &&
                ((this.IncludeCoverPage == null && other.IncludeCoverPage == null) || (this.IncludeCoverPage?.Equals(other.IncludeCoverPage) == true)) &&
                ((this.IncludeFilterPage == null && other.IncludeFilterPage == null) || (this.IncludeFilterPage?.Equals(other.IncludeFilterPage) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Orientation = {(this.Orientation == null ? "null" : this.Orientation.ToString())}");
            toStringOutput.Add($"this.TruncateTables = {(this.TruncateTables == null ? "null" : this.TruncateTables.ToString())}");
            toStringOutput.Add($"this.IncludeLogo = {(this.IncludeLogo == null ? "null" : this.IncludeLogo.ToString())}");
            toStringOutput.Add($"this.FooterText = {(this.FooterText == null ? "null" : this.FooterText == string.Empty ? "" : this.FooterText)}");
            toStringOutput.Add($"this.IncludePageNumber = {(this.IncludePageNumber == null ? "null" : this.IncludePageNumber.ToString())}");
            toStringOutput.Add($"this.IncludeCoverPage = {(this.IncludeCoverPage == null ? "null" : this.IncludeCoverPage.ToString())}");
            toStringOutput.Add($"this.IncludeFilterPage = {(this.IncludeFilterPage == null ? "null" : this.IncludeFilterPage.ToString())}");
        }
    }
}