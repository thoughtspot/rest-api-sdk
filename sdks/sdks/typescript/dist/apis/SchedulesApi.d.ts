import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateScheduleRequest } from '../models/CreateScheduleRequest';
import { ResponseSchedule } from '../models/ResponseSchedule';
import { SearchSchedulesRequest } from '../models/SearchSchedulesRequest';
import { UpdateScheduleRequest } from '../models/UpdateScheduleRequest';
export declare class SchedulesApiRequestFactory extends BaseAPIRequestFactory {
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    searchSchedules(searchSchedulesRequest?: SearchSchedulesRequest, _options?: Configuration): Promise<RequestContext>;
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest?: UpdateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class SchedulesApiResponseProcessor {
    createSchedule(response: ResponseContext): Promise<ResponseSchedule>;
    deleteSchedule(response: ResponseContext): Promise<void>;
    searchSchedules(response: ResponseContext): Promise<Array<ResponseSchedule>>;
    updateSchedule(response: ResponseContext): Promise<void>;
}
