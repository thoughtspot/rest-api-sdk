// <copyright file="OrientationEnum.cs" company="APIMatic">
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
    /// OrientationEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OrientationEnum
    {
        /// <summary>
        /// PORTRAIT.
        /// </summary>
        [EnumMember(Value = "PORTRAIT")]
        PORTRAIT,

        /// <summary>
        /// LANDSCAPE.
        /// </summary>
        [EnumMember(Value = "LANDSCAPE")]
        LANDSCAPE
    }
}