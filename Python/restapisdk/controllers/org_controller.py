# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.api_helper import APIHelper
from restapisdk.configuration import Server
from restapisdk.controllers.base_controller import BaseController
from restapisdk.models.orgs_response import OrgsResponse
from restapisdk.exceptions.error_response_exception import ErrorResponseException


class OrgController(BaseController):

    """A Controller to access Endpoints in the restapisdk API."""
    def __init__(self, config, auth_managers):
        super(OrgController, self).__init__(config, auth_managers)

    def get_org(self,
                name=None,
                id=None):
        """Does a GET request to /tspublic/rest/v2/org.

        This is endpoint is applicable only if organization feature is enabled
        in the cluster. 
         To get the details of a specific organization by name or id, use this
         endpoint. 
         At least one value needed. When both are given,then id will be
         considered to fetch organization information. 
         Requires Administration privilege for tenant.

        Args:
            name (string, optional): Name of the organization.
            id (int, optional): The ID of the organization.

        Returns:
            OrgsResponse: Response from the API. Details of the organization

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/org'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_parameters = {
            'name': name,
            'id': id
        }
        _query_builder = APIHelper.append_url_with_query_parameters(
            _query_builder,
            _query_parameters
        )
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

        decoded = APIHelper.json_deserialize(_response.text, OrgsResponse.from_dictionary)

        return decoded

    def create_org(self,
                   body):
        """Does a POST request to /tspublic/rest/v2/org/create.

        This is endpoint is applicable only if organization feature is enabled
        in the cluster. 
         To programmatically create an organization in the ThoughtSpot system,
         use this API endpoint.

        Args:
            body (TspublicRestV2OrgCreateRequest): TODO: type description
                here.

        Returns:
            OrgsResponse: Response from the API. Details of the organization
                created

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/org/create'
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

        decoded = APIHelper.json_deserialize(_response.text, OrgsResponse.from_dictionary)

        return decoded

    def update_org(self,
                   body):
        """Does a PUT request to /tspublic/rest/v2/org/update.

        This is endpoint is applicable only if organization feature is enabled
        in the cluster. 
         You can use this endpoint to programmatically modify an existing org.
                  Provide name or id of the organization to update the properties. When
         both id and name are given, then id will be considered and name of
         the organization will be updated. 
         Requires Administration privilege for tenant.

        Args:
            body (TspublicRestV2OrgUpdateRequest): TODO: type description
                here.

        Returns:
            OrgsResponse: Response from the API. Organization successfully
                updated

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/org/update'
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

        decoded = APIHelper.json_deserialize(_response.text, OrgsResponse.from_dictionary)

        return decoded

    def delete_org(self,
                   name=None,
                   id=None):
        """Does a DELETE request to /tspublic/rest/v2/org/delete.

        This is endpoint is applicable only if organization feature is enabled
        in the cluster. 
         To remove an organization from the ThoughtSpot system, send a DELETE
         request to this endpoint. 
         At least one value is needed. When both id and name are given, then
         id will be considered. 
         Requires Administration privilege for tenant.

        Args:
            name (string, optional): Name of the organization.
            id (int, optional): The ID of the organization.

        Returns:
            bool: Response from the API. Organization successfully deleted

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/org/delete'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_parameters = {
            'name': name,
            'id': id
        }
        _query_builder = APIHelper.append_url_with_query_parameters(
            _query_builder,
            _query_parameters
        )
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': self.config.content_type
        }

        # Prepare and execute request
        _request = self.config.http_client.delete(_query_url, headers=_headers)
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def search_orgs(self,
                    body):
        """Does a POST request to /tspublic/rest/v2/org/search.

        This is endpoint is applicable only if organization feature is enabled
        in the cluster. 
         To get the details of a specific organization or all organizations in
         the ThoughtSpot system use this end point. 
         If no input is provided, then all organizations are included in the
         response. 
         Requires Administration privilege for tenant.

        Args:
            body (TspublicRestV2OrgSearchRequest): TODO: type description
                here.

        Returns:
            list of OrgsResponse: Response from the API. Array of organization
                details matching the search criteria

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/org/search'
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

        decoded = APIHelper.json_deserialize(_response.text, OrgsResponse.from_dictionary)

        return decoded