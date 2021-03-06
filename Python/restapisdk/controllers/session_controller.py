# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.api_helper import APIHelper
from restapisdk.configuration import Server
from restapisdk.controllers.base_controller import BaseController
from restapisdk.models.session_login_response import SessionLoginResponse
from restapisdk.exceptions.error_response_exception import ErrorResponseException


class SessionController(BaseController):

    """A Controller to access Endpoints in the restapisdk API."""
    def __init__(self, config, auth_managers):
        super(SessionController, self).__init__(config, auth_managers)

    def get_session_info(self):
        """Does a GET request to /tspublic/rest/v2/session.

        To get session object information, use this endpoint

        Returns:
            object: Response from the API. Session object information

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/session'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'Content-Type': self.config.content_type
        }

        # Prepare and execute request
        _request = self.config.http_client.get(_query_url, headers=_headers)
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text

        return decoded

    def login(self,
              body):
        """Does a POST request to /tspublic/rest/v2/session/login.

        You can programmatically create login session for a user in
        ThoughtSpot using this endpoint. 
         You can create session by either providing userName and password as
         inputs in this request body or by including "Authorization" header
         with the token generated through the endpoint
         /tspublic/rest/v2/session/getToken. 
         userName and password input is given precedence over "Authorization"
         header, when both are included in the request.

        Args:
            body (TspublicRestV2SessionLoginRequest): TODO: type description
                here.

        Returns:
            SessionLoginResponse: Response from the API. Successful login and
                token generated

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/session/login'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = APIHelper.json_deserialize(_response.text, SessionLoginResponse.from_dictionary)

        return decoded

    def logout(self):
        """Does a POST request to /tspublic/rest/v2/session/logout.

        To log a user out of the current session, use this endpoint

        Returns:
            bool: Response from the API. Successfully logged out and token
                invalidated

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/session/logout'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': self.config.content_type
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers)
        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def get_token(self,
                  body):
        """Does a POST request to /tspublic/rest/v2/session/gettoken.

        To programmatically create session token for a user in ThoughtSpot,
        use this endpoint. 
         You can generate the token for a user by providing password or secret
         key from the cluster. 
         You need to enable trusted authentication to generate secret key. To
         generate secret key, follow below steps. 
         1. Click the Develop tab. 
         2. Under Customizations, click Settings. 
         3. To enable trusted authentication, turn on the toggle. 
         4. A secret_key for trusted authentication is generated. 
         5. Click the clipboard icon to copy the token. 
         
         Password is given precedence over secretKey input, when both are
         included in the request.

        Args:
            body (TspublicRestV2SessionGettokenRequest): TODO: type
                description here.

        Returns:
            SessionLoginResponse: Response from the API. Token generated
                successfully

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/session/gettoken'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = APIHelper.json_deserialize(_response.text, SessionLoginResponse.from_dictionary)

        return decoded

    def revoke_token(self):
        """Does a POST request to /tspublic/rest/v2/session/revoketoken.

        To expire or revoke a token for a user, use this endpoint

        Returns:
            bool: Response from the API. Token revoked successfully

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/session/revoketoken'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': self.config.content_type
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers)
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def switch_org(self,
                   body):
        """Does a PUT request to /tspublic/rest/v2/session/org.

        This is endpoint is applicable only if organization feature is enabled
        in the cluster. 
         To programmatically switch the organization context for the logged in
         session, use this endpoint. 
         The original session is reused even after changing the organization.
                  The logged in user should have access to the organization being
         switched to. 
         This endpoint can be used to switch organization only when using
         session cookies for authentication.

        Args:
            body (TspublicRestV2SessionOrgRequest): TODO: type description
                here.

        Returns:
            bool: Response from the API. Organization set successfully

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/session/org'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded
