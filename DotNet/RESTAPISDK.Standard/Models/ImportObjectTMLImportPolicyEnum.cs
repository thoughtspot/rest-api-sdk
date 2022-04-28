// <copyright file="ImportObjectTMLImportPolicyEnum.cs" company="APIMatic">
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
    /// ImportObjectTMLImportPolicyEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ImportObjectTMLImportPolicyEnum
    {
        /// <summary>
        /// PARTIAL.
        /// </summary>
        [EnumMember(Value = "PARTIAL")]
        PARTIAL,

        /// <summary>
        /// ALLORNONE.
        /// </summary>
        [EnumMember(Value = "ALL_OR_NONE")]
        ALLORNONE,

        /// <summary>
        /// VALIDATEONLY.
        /// </summary>
        [EnumMember(Value = "VALIDATE_ONLY")]
        VALIDATEONLY
    }
}