import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { SystemConfig } from '../models/SystemConfig';
import { SystemInfo } from '../models/SystemInfo';
import { UpdateSystemConfigRequest } from '../models/UpdateSystemConfigRequest';
export declare class SystemApiRequestFactory extends BaseAPIRequestFactory {
    getSystemConfig(_options?: Configuration): Promise<RequestContext>;
    getSystemInformation(_options?: Configuration): Promise<RequestContext>;
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class SystemApiResponseProcessor {
    getSystemConfig(response: ResponseContext): Promise<SystemConfig>;
    getSystemInformation(response: ResponseContext): Promise<SystemInfo>;
    getSystemOverrideInfo(response: ResponseContext): Promise<any>;
    updateSystemConfig(response: ResponseContext): Promise<void>;
}
