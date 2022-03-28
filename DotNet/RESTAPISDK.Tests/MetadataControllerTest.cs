// <copyright file="MetadataControllerTest.cs" company="APIMatic">
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
    /// MetadataControllerTest.
    /// </summary>
    [TestFixture]
    public class MetadataControllerTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests).
        /// </summary>
        private MetadataController controller;

        /// <summary>
        /// Setup test class.
        /// </summary>
        [OneTimeSetUp]
        public void SetUpDerived()
        {
            this.controller = this.Client.MetadataController;
        }

        /// <summary>
        /// To get details of a specific tag, use this endpoint. 
        ///
        /// At least one of id or name of tag is required. When both are given, then id will be considered..
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestGetTag()
        {
            // Parameters for the API call
            string name = null;
            string id = null;

            // Perform API call
            Standard.Models.MetadataTagResponse result = null;
            try
            {
                result = await this.controller.GetTagAsync(name, id);
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
        /// To programmatically delete tags, use this endpoint. 
        ///
        /// At least one of id or name of tag is required. When both are given, then id will be considered. 
        ///
        /// Permission: Requires administration privilege.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestDeleteTag()
        {
            // Parameters for the API call
            string name = null;
            string id = null;

            // Perform API call
            bool result = false;
            try
            {
                result = await this.controller.DeleteTagAsync(name, id);
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
        /// To get the name and id of liveboard that is set as a home liveboard for a user, use this endpoint. 
        ///
        /// At least one of user id or username is required. When both are given, then id will be considered. 
        ///
        /// Permission: Requires at least view access to the object.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestGetHomeLiveboard()
        {
            // Parameters for the API call
            string userName = null;
            string userId = null;

            // Perform API call
            Standard.Models.HomeLiveboardResponse result = null;
            try
            {
                result = await this.controller.GetHomeLiveboardAsync(userName, userId);
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
        /// To get a list of objects with incomplete metadata, use this endpoint.
        /// </summary>
        /// <returns>A <see cref="Task"/> representing the asynchronous unit test.</returns>
        [Test]
        public async Task TestTestGetIncompleteObjects()
        {
            // Perform API call
            object result = null;
            try
            {
                result = await this.controller.GetIncompleteObjectsAsync();
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