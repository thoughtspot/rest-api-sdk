// <copyright file="SearchGroupsPrivilegesEnum.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// SearchGroupsPrivilegesEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SearchGroupsPrivilegesEnum
    {
        /// <summary>
        /// ADMINISTRATION.
        /// </summary>
        [EnumMember(Value = "ADMINISTRATION")]
        ADMINISTRATION,

        /// <summary>
        /// AUTHORING.
        /// </summary>
        [EnumMember(Value = "AUTHORING")]
        AUTHORING,

        /// <summary>
        /// DEVELOPER.
        /// </summary>
        [EnumMember(Value = "DEVELOPER")]
        DEVELOPER,

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
        /// DATAMANAGEMENT.
        /// </summary>
        [EnumMember(Value = "DATAMANAGEMENT")]
        DATAMANAGEMENT,

        /// <summary>
        /// SHAREWITHALL.
        /// </summary>
        [EnumMember(Value = "SHAREWITHALL")]
        SHAREWITHALL,

        /// <summary>
        /// EXPERIMENTALFEATUREPRIVILEGE.
        /// </summary>
        [EnumMember(Value = "EXPERIMENTALFEATUREPRIVILEGE")]
        EXPERIMENTALFEATUREPRIVILEGE,

        /// <summary>
        /// JOBSCHEDULING.
        /// </summary>
        [EnumMember(Value = "JOBSCHEDULING")]
        JOBSCHEDULING,

        /// <summary>
        /// RANALYSIS.
        /// </summary>
        [EnumMember(Value = "RANALYSIS")]
        RANALYSIS,

        /// <summary>
        /// A3ANALYSIS.
        /// </summary>
        [EnumMember(Value = "A3ANALYSIS")]
        A3ANALYSIS,

        /// <summary>
        /// BYPASSRLS.
        /// </summary>
        [EnumMember(Value = "BYPASSRLS")]
        BYPASSRLS
    }
}