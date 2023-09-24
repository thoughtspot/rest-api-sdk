import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { AnswerDataResponse } from '../models/AnswerDataResponse';
import { FetchAnswerDataRequest } from '../models/FetchAnswerDataRequest';
import { FetchLiveboardDataRequest } from '../models/FetchLiveboardDataRequest';
import { LiveboardDataResponse } from '../models/LiveboardDataResponse';
import { SearchDataRequest } from '../models/SearchDataRequest';
import { SearchDataResponse } from '../models/SearchDataResponse';
export declare class DataApiRequestFactory extends BaseAPIRequestFactory {
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext>;
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext>;
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class DataApiResponseProcessor {
    fetchAnswerData(response: ResponseContext): Promise<AnswerDataResponse>;
    fetchLiveboardData(response: ResponseContext): Promise<LiveboardDataResponse>;
    searchData(response: ResponseContext): Promise<SearchDataResponse>;
}
