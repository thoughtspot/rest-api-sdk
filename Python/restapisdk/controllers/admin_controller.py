# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.api_helper import APIHelper
from restapisdk.configuration import Server
from restapisdk.controllers.base_controller import BaseController
from restapisdk.models.adminsync_principal_response import AdminsyncPrincipalResponse
from restapisdk.exceptions.error_response_exception import ErrorResponseException


class AdminController(BaseController):

    """A Controller to access Endpoints in the restapisdk API."""
    def __init__(self, config, auth_managers):
        super(AdminController, self).__init__(config, auth_managers)

    def get_cluster_config(self):
        """Does a GET request to /tspublic/rest/v2/admin/configuration.

        To get details of the current configuration of a Thoughtspot cluster,
        use this endpoint. 
         Permission: Requires administration privilege

        Returns:
            object: Response from the API. Details of cluster configuration
                settings

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/configuration'
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

    def get_cluster_config_overrides(self):
        """Does a GET request to /tspublic/rest/v2/admin/configuration/overrides.

        To get the details of overrides to the Thoughtspot cluster
        configuration, use this endpoint. 
         Permission: Requires administration privilege

        Returns:
            object: Response from the API. Details of overrides of cluster
                configuration settings

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/configuration/overrides'
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

    def update_cluster_config(self,
                              body):
        """Does a PUT request to /tspublic/rest/v2/admin/configuration/update.

        To update the Thoughtspot cluster configuration, use this endpoint. 
         Permission: Requires administration privilege

        Args:
            body (TspublicRestV2AdminConfigurationUpdateRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API. Successfully updated the cluster
                configuration settings

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/configuration/update'
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

    def reset_user_password(self,
                            body):
        """Does a PUT request to /tspublic/rest/v2/admin/resetpassword.

        To reset the password of a ThoughtSpot user account, use this
        endpoint. 
         It is mandatory to use Authorization header with token of a user with
         admin access to successfully run this endpoint. 
         At least one of User Id or username is mandatory. When both are
         given, then user id will be considered. 
         Permission: Requires administration privilege

        Args:
            body (TspublicRestV2AdminResetpasswordRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API. Password reset successful

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/resetpassword'
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

    def sync_principal(self,
                       body):
        """Does a PUT request to /tspublic/rest/v2/admin/syncprincipal.

        To programmatically synchronize user accounts and user groups from
        external system with ThoughtSpot, use this endpoint. 
         The payload takes principals containing all users and groups present
         in the external system. 
         The users and user groups in Thoughtspot get updated for any matching
         inputs. 
         Any user and user group present in the input, but not present in the
         cluster, gets created in cluster. 
        n You can optionally choose to delete the user and groups from the
        cluster, that are not present in the input. 
         Permission: Requires administration privilege

        Args:
            body (TspublicRestV2AdminSyncprincipalRequest): TODO: type
                description here.

        Returns:
            AdminsyncPrincipalResponse: Response from the API. Successfully
                synced the principals provided as input with the users and
                user groups in your Thoughtspot cluster.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/syncprincipal'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
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

        decoded = APIHelper.json_deserialize(_response.text, AdminsyncPrincipalResponse.from_dictionary)

        return decoded

    def change_author_of_objects(self,
                                 body):
        """Does a PUT request to /tspublic/rest/v2/admin/changeauthor.

        To programmatically change the author of one or several objects from
        one user account to another, use this endpoint. 
         You might want to change the author of objects from one user to
         another active user, when the account is removed from the ThoughtSpot
         application. 
         Permission: Requires administration privilege

        Args:
            body (TspublicRestV2AdminChangeauthorRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API. Successfully changed the author for
                the objects provided in the request

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/changeauthor'
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

    def assign_author_to_objects(self,
                                 body):
        """Does a PUT request to /tspublic/rest/v2/admin/assignauthor.

        To programmatically assign an author to one or several objects, use
        this endpoint. 
         Provide either user name or id as input. When both are given user id
         will be considered. 
         Requires administration privilege.

        Args:
            body (TspublicRestV2AdminAssignauthorRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API. Successfully assigned the author to
                the objects provided in the request

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/assignauthor'
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

    def force_logout_users(self,
                           body):
        """Does a POST request to /tspublic/rest/v2/admin/forcelogout.

        To logout one or more users from logged in session, use this endpoint.
        If no input is provided then all logged in users are force logged out.
                 Requires administration privilege

        Args:
            body (TspublicRestV2AdminForcelogoutRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API. Successfully logged out the users
                included in the request

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/admin/forcelogout'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
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

        decoded = _response.text == 'true'

        return decoded
