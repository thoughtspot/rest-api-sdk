# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

import json
import dateutil.parser

from tests.controllers.controller_test_base import ControllerTestBase
from tests.test_helper import TestHelper
from restapisdk.api_helper import APIHelper


class UserControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(UserControllerTests, cls).setUpClass()
        cls.controller = cls.client.user
        cls.response_catcher = cls.controller.http_call_back

    # To get the details of a specific user account by username or user id, use this endpoint. At Least one value is needed. When both are given,then user id will be considered to fetch user information 
    #
    # Permission: Requires administration privilege
    def test_get_user(self):
        # Parameters for the API call
        name = None
        id = None

        # Perform the API call through the SDK function
        result = self.controller.get_user(name, id)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


    # To remove a user from the ThoughtSpot system, use this endpoint. 
    #
    # At least one value is needed. When both are given, then user id will be considered to delete user. 
    #
    # Permission: Requires administration privilege
    def test_delete_user(self):
        # Parameters for the API call
        name = None
        id = None

        # Perform the API call through the SDK function
        result = self.controller.delete_user(name, id)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


