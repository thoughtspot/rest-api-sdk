// <copyright file="PrivilegeEnum.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// PrivilegeEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PrivilegeEnum
    {
        /// <summary>
        /// RANALYSIS.
        /// </summary>
        [EnumMember(Value = "RANALYSIS")]
        RANALYSIS,

        /// <summary>
        /// DATAMANAGEMENT.
        /// </summary>
        [EnumMember(Value = "DATAMANAGEMENT")]
        DATAMANAGEMENT,

        /// <summary>
        /// APPLICATIONADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "APPLICATION_ADMINISTRATION")]
        APPLICATIONADMINISTRATION,

        /// <summary>
        /// USERADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "USER_ADMINISTRATION")]
        USERADMINISTRATION,

        /// <summary>
        /// SYSTEMMANAGEMENT.
        /// </summary>
        [EnumMember(Value = "SYSTEMMANAGEMENT")]
        SYSTEMMANAGEMENT,

        /// <summary>
        /// SYSTEMINFOADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "SYSTEM_INFO_ADMINISTRATION")]
        SYSTEMINFOADMINISTRATION,

        /// <summary>
        /// AUTHORING.
        /// </summary>
        [EnumMember(Value = "AUTHORING")]
        AUTHORING,

        /// <summary>
        /// BACKUPADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "BACKUP_ADMINISTRATION")]
        BACKUPADMINISTRATION,

        /// <summary>
        /// SHAREWITHALL.
        /// </summary>
        [EnumMember(Value = "SHAREWITHALL")]
        SHAREWITHALL,

        /// <summary>
        /// DEVELOPER.
        /// </summary>
        [EnumMember(Value = "DEVELOPER")]
        DEVELOPER,

        /// <summary>
        /// JOBSCHEDULING.
        /// </summary>
        [EnumMember(Value = "JOBSCHEDULING")]
        JOBSCHEDULING,

        /// <summary>
        /// GROUPADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "GROUP_ADMINISTRATION")]
        GROUPADMINISTRATION,

        /// <summary>
        /// BYPASSRLS.
        /// </summary>
        [EnumMember(Value = "BYPASSRLS")]
        BYPASSRLS,

        /// <summary>
        /// EXPERIMENTALFEATUREPRIVILEGE.
        /// </summary>
        [EnumMember(Value = "EXPERIMENTALFEATUREPRIVILEGE")]
        EXPERIMENTALFEATUREPRIVILEGE,

        /// <summary>
        /// A3ANALYSIS.
        /// </summary>
        [EnumMember(Value = "A3ANALYSIS")]
        A3ANALYSIS,

        /// <summary>
        /// USERDATAUPLOADING.
        /// </summary>
        [EnumMember(Value = "USERDATAUPLOADING")]
        USERDATAUPLOADING,

        /// <summary>
        /// DATADOWNLOADING.
        /// </summary>
        [EnumMember(Value = "DATADOWNLOADING")]
        DATADOWNLOADING,

        /// <summary>
        /// DISABLEPINBOARDCREATION.
        /// </summary>
        [EnumMember(Value = "DISABLE_PINBOARD_CREATION")]
        DISABLEPINBOARDCREATION,

        /// <summary>
        /// ADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "ADMINISTRATION")]
        ADMINISTRATION
    }
}