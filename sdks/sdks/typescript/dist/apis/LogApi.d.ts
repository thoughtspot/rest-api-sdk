import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { FetchLogsRequest } from '../models/FetchLogsRequest';
import { LogResponse } from '../models/LogResponse';
export declare class LogApiRequestFactory extends BaseAPIRequestFactory {
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class LogApiResponseProcessor {
    fetchLogs(response: ResponseContext): Promise<Array<LogResponse>>;
}
