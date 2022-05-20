// <copyright file="SecurityControllerTest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Tests
{
    using System;
    using System.Collections.Generic;
    using System.Globalization;
    using System.IO;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Converters;
    using NUnit.Framework;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Controllers;
    using RESTAPISDK.Standard.Exceptions;
    using RESTAPISDK.Standard.Http.Client;
    using RESTAPISDK.Standard.Http.Response;
    using RESTAPISDK.Standard.Utilities;
    using RESTAPISDK.Tests.Helpers;

    /// <summary>
    /// SecurityControllerTest.
    /// </summary>
    [TestFixture]
    public class SecurityControllerTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests).
        /// </summary>
        private SecurityController controller;

        /// <summary>
        /// Setup test class.
        /// </summary>
        [OneTimeSetUp]
        public void SetUpDerived()
        {
            this.controller = this.Client.SecurityController;
        }

        /// <summary>
        /// Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission. 
        ///
        /// Provide at least one of id or name. When both are given then id is considered.
        ///
        /// Requires administration privilege.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestGetPermissionForPrincipal()
        {
            // Parameters for the API call
            string id = null;
            string name = null;

            // Perform API call
            Standard.Models.PrincipalSearchResponse result = null;
            try
            {
                result = await this.controller.GetPermissionForPrincipalAsync(id, name);
            }
            catch (ApiException)
            {
            }

            // Test response code
            Assert.AreEqual(200, this.HttpCallBackHandler.Response.StatusCode, "Status should be 200");

            // Test headers
            Dictionary<string, string> headers = new Dictionary<string, string>();
            headers.Add("Content-Type", "application/json");

            Assert.IsTrue(
                    TestHelper.AreHeadersProperSubsetOf (
                    headers,
                    this.HttpCallBackHandler.Response.Headers),
                    "Headers should match");
        }
    }
}