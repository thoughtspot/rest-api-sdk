// <copyright file="OrgControllerTest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Tests
{
    using System;
    using System.Collections.Generic;
    using System.Globalization;
    using System.IO;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Converters;
    using NUnit.Framework;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Controllers;
    using ThoughtSpotPublicRESTAPI.Standard.Exceptions;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Client;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Response;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;
    using ThoughtSpotPublicRESTAPI.Tests.Helpers;

    /// <summary>
    /// OrgControllerTest.
    /// </summary>
    [TestFixture]
    public class OrgControllerTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests).
        /// </summary>
        private OrgController controller;

        /// <summary>
        /// Setup test class.
        /// </summary>
        [OneTimeSetUp]
        public void SetUpDerived()
        {
            this.controller = this.Client.OrgController;
        }

        /// <summary>
        /// To get the details of a specific organization by name or id, use this endpoint. 
        ///
        ///At least one value needed. When both are given,then id will be considered to fetch organization information. 
        ///
        ///Requires Administration privilege for tenant..
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestRestapiV2GetOrg()
        {
            // Parameters for the API call
            string name = null;
            int? id = null;

            // Perform API call
            Standard.Models.OrgsResponse result = null;
            try
            {
                result = await this.controller.RestapiV2GetOrgAsync(name, id);
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

        /// <summary>
        /// To remove an organization from the ThoughtSpot system, send a DELETE request to this endpoint. 
        ///
        ///At least one value is needed. When both id and name are given, then id will be considered. 
        ///
        ///Requires Administration privilege for tenant..
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestRestapiV2DeleteOrg()
        {
            // Parameters for the API call
            string name = null;
            int? id = null;

            // Perform API call
            bool result = false;
            try
            {
                result = await this.controller.RestapiV2DeleteOrgAsync(name, id);
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