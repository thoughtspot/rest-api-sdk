# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.configuration import Server
from thoughtspotpublicrestapi.controllers.base_controller import BaseController
from apimatic_core.request_builder import RequestBuilder
from apimatic_core.response_handler import ResponseHandler
from apimatic_core.types.parameter import Parameter
from thoughtspotpublicrestapi.http.http_method_enum import HttpMethodEnum
from apimatic_core.types.array_serialization_format import SerializationFormats
from apimatic_core.authentication.multiple.single_auth import Single
from apimatic_core.authentication.multiple.and_auth_group import And
from apimatic_core.authentication.multiple.or_auth_group import Or
from thoughtspotpublicrestapi.models.answer_query_response import AnswerQueryResponse
from thoughtspotpublicrestapi.models.liveboard_query_response import LiveboardQueryResponse
from thoughtspotpublicrestapi.exceptions.error_response_exception import ErrorResponseException


class DataController(BaseController):

    """A Controller to access Endpoints in the thoughtspotpublicrestapi API."""
    def __init__(self, config):
        super(DataController, self).__init__(config)

    def restapi_v_2__search_query_data(self,
                                       body):
        """Does a POST request to /tspublic/rest/v2/data/search.

        To programmatically retrieve data from ThoughtSpot using search query
        string, use this endpoint

        Args:
            body (TspublicRestV2DataSearchRequest): TODO: type description
                here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/data/search')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__liveboard_data(self,
                                    body):
        """Does a POST request to /tspublic/rest/v2/data/liveboard.

        To retrieve data related to a Liveboard or visualization from the
        ThoughtSpot system, you can use this endpoint

        Args:
            body (TspublicRestV2DataLiveboardRequest): TODO: type description
                here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/data/liveboard')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__answer_data(self,
                                 body):
        """Does a POST request to /tspublic/rest/v2/data/answer.

        To retrieve data related to a Answer from the ThoughtSpot system, you
        can use this endpoint

        Args:
            body (TspublicRestV2DataAnswerRequest): TODO: type description
                here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/data/answer')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__answer_query_sql(self,
                                      id):
        """Does a GET request to /tspublic/rest/v2/data/answer/querysql.

        To retrieve the query SQL related to an Answer that is run on the data
        platform, you can use this endpoint

        Args:
            id (string): The GUID of the Answer

        Returns:
            AnswerQueryResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/data/answer/querysql')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(AnswerQueryResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__liveboard_query_sql(self,
                                         id,
                                         viz_id=None):
        """Does a GET request to /tspublic/rest/v2/data/liveboard/querysql.

        To retrieve the query SQL related to a Visualization in a Liveboard
        that is run on the data platform, you can use this endpoint

        Args:
            id (string): The GUID of the Answer
            viz_id (list of string, optional): A JSON array of GUIDs of the
                visualizations in the Liveboard.

        Returns:
            LiveboardQueryResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/data/liveboard/querysql')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .query_param(Parameter()
                         .key('vizId')
                         .value(viz_id))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .array_serialization_format(SerializationFormats.PLAIN)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(LiveboardQueryResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()