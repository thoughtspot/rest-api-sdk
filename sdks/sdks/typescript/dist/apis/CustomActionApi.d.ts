import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateCustomActionRequest } from '../models/CreateCustomActionRequest';
import { ResponseCustomAction } from '../models/ResponseCustomAction';
import { SearchCustomActionsRequest } from '../models/SearchCustomActionsRequest';
import { UpdateCustomActionRequest } from '../models/UpdateCustomActionRequest';
export declare class CustomActionApiRequestFactory extends BaseAPIRequestFactory {
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class CustomActionApiResponseProcessor {
    createCustomAction(response: ResponseContext): Promise<ResponseCustomAction>;
    deleteCustomAction(response: ResponseContext): Promise<void>;
    searchCustomActions(response: ResponseContext): Promise<Array<ResponseCustomAction>>;
    updateCustomAction(response: ResponseContext): Promise<void>;
}
