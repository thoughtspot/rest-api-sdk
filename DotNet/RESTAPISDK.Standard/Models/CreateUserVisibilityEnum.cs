// <copyright file="CreateUserVisibilityEnum.cs" company="APIMatic">
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
    /// CreateUserVisibilityEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CreateUserVisibilityEnum
    {
        /// <summary>
        /// DEFAULT.
        /// </summary>
        [EnumMember(Value = "DEFAULT")]
        DEFAULT,

        /// <summary>
        /// NONSHARABLE.
        /// </summary>
        [EnumMember(Value = "NON_SHARABLE")]
        NONSHARABLE,

        /// <summary>
        /// SHARABLE.
        /// </summary>
        [EnumMember(Value = "SHARABLE")]
        SHARABLE
    }
}