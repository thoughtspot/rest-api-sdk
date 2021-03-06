/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  AnswerQueryResponse,
  answerQueryResponseSchema,
} from '../models/answerQueryResponse';
import {
  LiveboardQueryResponse,
  liveboardQueryResponseSchema,
} from '../models/liveboardQueryResponse';
import {
  TspublicRestV2DataAnswerRequest,
  tspublicRestV2DataAnswerRequestSchema,
} from '../models/tspublicRestV2DataAnswerRequest';
import {
  TspublicRestV2DataLiveboardRequest,
  tspublicRestV2DataLiveboardRequestSchema,
} from '../models/tspublicRestV2DataLiveboardRequest';
import {
  TspublicRestV2DataSearchRequest,
  tspublicRestV2DataSearchRequestSchema,
} from '../models/tspublicRestV2DataSearchRequest';
import { array, optional, string, unknown } from '../schema';
import { BaseController } from './baseController';

export class DataController extends BaseController {
  /**
   * To programmatically retrieve data from ThoughtSpot using search query string, use this endpoint
   *
   * Permission: Requires at least view access to the dataobject and datadownloading privilege
   *
   * @param body
   * @return Response from the API call
   */
  async searchQueryData(
    body: TspublicRestV2DataSearchRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/data/search');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2DataSearchRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To retrieve data related to a Answer from the ThoughtSpot system, you can use this endpoint.
   *
   * Permission: Requires at least view access to the object and datadownloading privilege
   *
   * @param body
   * @return Response from the API call
   */
  async answerData(
    body: TspublicRestV2DataAnswerRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/data/answer');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2DataAnswerRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To retrieve data related to a Liveboard or visualization from the ThoughtSpot system, you can use
   * this endpoint
   *
   * Permission: Requires at least view access to the object and datadownloading privilege
   *
   * @param body
   * @return Response from the API call
   */
  async liveboardData(
    body: TspublicRestV2DataLiveboardRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/data/liveboard');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2DataLiveboardRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To retrieve the query SQL related to an Answer that is run on the data platform, you can use this
   * endpoint.
   *
   * Permission: Requires at least view access to the object
   *
   * @param id The GUID of the Answer
   * @return Response from the API call
   */
  async answerQuerySql(
    id: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<AnswerQueryResponse>> {
    const req = this.createRequest(
      'GET',
      '/tspublic/rest/v2/data/answer/querysql'
    );
    const mapped = req.prepareArgs({ id: [id, string()] });
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(answerQueryResponseSchema, requestOptions);
  }

  /**
   * To retrieve the query SQL related to a Visualization in a Liveboard that is run on the data platform,
   * you can use this endpoint.
   *
   * Permission: Requires at least view access to the object
   *
   * @param id    The GUID of the Liveboard
   * @param vizId A JSON array of GUIDs of the visualizations in the Liveboard.
   * @return Response from the API call
   */
  async liveboardQuerySql(
    id: string,
    vizId?: string[],
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<LiveboardQueryResponse>> {
    const req = this.createRequest(
      'GET',
      '/tspublic/rest/v2/data/liveboard/querysql'
    );
    const mapped = req.prepareArgs({
      id: [id, string()],
      vizId: [vizId, optional(array(string()))],
    });
    req.query('id', mapped.id);
    req.query('vizId', mapped.vizId);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(liveboardQueryResponseSchema, requestOptions);
  }
}
