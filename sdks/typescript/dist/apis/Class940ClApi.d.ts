import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateScheduleRequest } from '../models/CreateScheduleRequest';
import { GetTokenResponse } from '../models/GetTokenResponse';
import { ResponseSchedule } from '../models/ResponseSchedule';
import { SearchSchedulesRequest } from '../models/SearchSchedulesRequest';
import { UpdateScheduleRequest } from '../models/UpdateScheduleRequest';
export declare class Class940ClApiRequestFactory extends BaseAPIRequestFactory {
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    getCurrentUserToken(_options?: Configuration): Promise<RequestContext>;
    searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<RequestContext>;
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class Class940ClApiResponseProcessor {
    createSchedule(response: ResponseContext): Promise<ResponseSchedule>;
    deleteSchedule(response: ResponseContext): Promise<void>;
    getCurrentUserToken(response: ResponseContext): Promise<GetTokenResponse>;
    searchSchedules(response: ResponseContext): Promise<Array<ResponseSchedule>>;
    updateSchedule(response: ResponseContext): Promise<void>;
}
