/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface LogsResponse {
  /** Date and time for the event in the log */
  date?: string;
  /** Logged event at the time specified in JSON format. This includes, Event ID, A unique description of the event, for example, User login failed, Timestamp, User ID of the person initiating the event and IP address of the ThoughtSpot instance. */
  log?: string;
}

export const logsResponseSchema: Schema<LogsResponse> = object({
  date: ['date', optional(string())],
  log: ['log', optional(string())],
});
