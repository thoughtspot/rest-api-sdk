/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiError } from '../core';

/**
 * Creates an instance of ErrorResponse
 */
interface ErrorResponse {
  error?: unknown;
}

export class ErrorResponseError extends ApiError<ErrorResponse> {}
