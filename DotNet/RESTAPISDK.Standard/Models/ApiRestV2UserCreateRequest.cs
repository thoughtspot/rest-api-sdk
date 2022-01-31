// <copyright file="ApiRestV2UserCreateRequest.cs" company="APIMatic">
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
    /// ApiRestV2UserCreateRequest.
    /// </summary>
    public class ApiRestV2UserCreateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2UserCreateRequest"/> class.
        /// </summary>
        public ApiRestV2UserCreateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2UserCreateRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="password">password.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="mail">mail.</param>
        /// <param name="groups">groups.</param>
        /// <param name="state">state.</param>
        /// <param name="notifyOnShare">notifyOnShare.</param>
        /// <param name="showWalkMe">showWalkMe.</param>
        /// <param name="analystOnboardingComplete">analystOnboardingComplete.</param>
        /// <param name="type">type.</param>
        public ApiRestV2UserCreateRequest(
            string name,
            string displayName,
            string password,
            Models.VisibilityEnum? visibility = Models.VisibilityEnum.DEFAULT,
            string mail = null,
            List<Models.GroupNameAndIDInput> groups = null,
            Models.StateEnum? state = Models.StateEnum.ACTIVE,
            bool? notifyOnShare = true,
            bool? showWalkMe = true,
            bool? analystOnboardingComplete = true,
            Models.Type2Enum? type = Models.Type2Enum.LOCALUSER)
        {
            this.Name = name;
            this.DisplayName = displayName;
            this.Visibility = visibility;
            this.Mail = mail;
            this.Password = password;
            this.Groups = groups;
            this.State = state;
            this.NotifyOnShare = notifyOnShare;
            this.ShowWalkMe = showWalkMe;
            this.AnalystOnboardingComplete = analystOnboardingComplete;
            this.Type = type;
        }

        /// <summary>
        /// Name of the user account. The username string must be unique.
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }

        /// <summary>
        /// A display name string for the user, usually their first and last name.
        /// </summary>
        [JsonProperty("displayName")]
        public string DisplayName { get; set; }

        /// <summary>
        /// Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.
        ///  The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.
        /// </summary>
        [JsonProperty("visibility", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.VisibilityEnum? Visibility { get; set; }

        /// <summary>
        /// Email id associated with the user account
        /// </summary>
        [JsonProperty("mail", NullValueHandling = NullValueHandling.Ignore)]
        public string Mail { get; set; }

        /// <summary>
        /// Password for the user account.
        /// </summary>
        [JsonProperty("password")]
        public string Password { get; set; }

        /// <summary>
        /// A JSON array of group names or GUIDs or both. When both are given then id is considered
        /// </summary>
        [JsonProperty("groups", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.GroupNameAndIDInput> Groups { get; set; }

        /// <summary>
        /// Status of user account. acitve or inactive.
        /// </summary>
        [JsonProperty("state", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.StateEnum? State { get; set; }

        /// <summary>
        /// User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.
        /// </summary>
        [JsonProperty("notifyOnShare", NullValueHandling = NullValueHandling.Ignore)]
        public bool? NotifyOnShare { get; set; }

        /// <summary>
        /// The user preference for revisiting the onboarding experience.
        /// </summary>
        [JsonProperty("showWalkMe", NullValueHandling = NullValueHandling.Ignore)]
        public bool? ShowWalkMe { get; set; }

        /// <summary>
        /// ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly.
        ///  The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.
        /// </summary>
        [JsonProperty("analystOnboardingComplete", NullValueHandling = NullValueHandling.Ignore)]
        public bool? AnalystOnboardingComplete { get; set; }

        /// <summary>
        /// Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.Type2Enum? Type { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2UserCreateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2UserCreateRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.DisplayName == null && other.DisplayName == null) || (this.DisplayName?.Equals(other.DisplayName) == true)) &&
                ((this.Visibility == null && other.Visibility == null) || (this.Visibility?.Equals(other.Visibility) == true)) &&
                ((this.Mail == null && other.Mail == null) || (this.Mail?.Equals(other.Mail) == true)) &&
                ((this.Password == null && other.Password == null) || (this.Password?.Equals(other.Password) == true)) &&
                ((this.Groups == null && other.Groups == null) || (this.Groups?.Equals(other.Groups) == true)) &&
                ((this.State == null && other.State == null) || (this.State?.Equals(other.State) == true)) &&
                ((this.NotifyOnShare == null && other.NotifyOnShare == null) || (this.NotifyOnShare?.Equals(other.NotifyOnShare) == true)) &&
                ((this.ShowWalkMe == null && other.ShowWalkMe == null) || (this.ShowWalkMe?.Equals(other.ShowWalkMe) == true)) &&
                ((this.AnalystOnboardingComplete == null && other.AnalystOnboardingComplete == null) || (this.AnalystOnboardingComplete?.Equals(other.AnalystOnboardingComplete) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.DisplayName = {(this.DisplayName == null ? "null" : this.DisplayName == string.Empty ? "" : this.DisplayName)}");
            toStringOutput.Add($"this.Visibility = {(this.Visibility == null ? "null" : this.Visibility.ToString())}");
            toStringOutput.Add($"this.Mail = {(this.Mail == null ? "null" : this.Mail == string.Empty ? "" : this.Mail)}");
            toStringOutput.Add($"this.Password = {(this.Password == null ? "null" : this.Password == string.Empty ? "" : this.Password)}");
            toStringOutput.Add($"this.Groups = {(this.Groups == null ? "null" : $"[{string.Join(", ", this.Groups)} ]")}");
            toStringOutput.Add($"this.State = {(this.State == null ? "null" : this.State.ToString())}");
            toStringOutput.Add($"this.NotifyOnShare = {(this.NotifyOnShare == null ? "null" : this.NotifyOnShare.ToString())}");
            toStringOutput.Add($"this.ShowWalkMe = {(this.ShowWalkMe == null ? "null" : this.ShowWalkMe.ToString())}");
            toStringOutput.Add($"this.AnalystOnboardingComplete = {(this.AnalystOnboardingComplete == null ? "null" : this.AnalystOnboardingComplete.ToString())}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type.ToString())}");
        }
    }
}