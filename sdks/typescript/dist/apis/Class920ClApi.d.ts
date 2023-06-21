import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateConnectionRequest } from '../models/CreateConnectionRequest';
import { CreateConnectionResponse } from '../models/CreateConnectionResponse';
import { DeleteConnectionRequest } from '../models/DeleteConnectionRequest';
import { SearchConnectionRequest } from '../models/SearchConnectionRequest';
import { SearchConnectionResponse } from '../models/SearchConnectionResponse';
import { UpdateConnectionRequest } from '../models/UpdateConnectionRequest';
import { UpdateSystemConfigRequest } from '../models/UpdateSystemConfigRequest';
export declare class Class920ClApiRequestFactory extends BaseAPIRequestFactory {
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    searchConnection(searchConnectionRequest?: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class Class920ClApiResponseProcessor {
    createConnection(response: ResponseContext): Promise<CreateConnectionResponse>;
    deleteConnection(response: ResponseContext): Promise<void>;
    getSystemOverrideInfo(response: ResponseContext): Promise<any>;
    searchConnection(response: ResponseContext): Promise<Array<SearchConnectionResponse>>;
    updateConnection(response: ResponseContext): Promise<void>;
    updateSystemConfig(response: ResponseContext): Promise<void>;
}
