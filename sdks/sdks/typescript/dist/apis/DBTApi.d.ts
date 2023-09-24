import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { DbtConnectionRequest } from '../models/DbtConnectionRequest';
import { GenerateSyncTmlRequest } from '../models/GenerateSyncTmlRequest';
import { GenerateTmlRequest } from '../models/GenerateTmlRequest';
import { UpdateDbtConnectionRequest } from '../models/UpdateDbtConnectionRequest';
export declare class DBTApiRequestFactory extends BaseAPIRequestFactory {
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    dbtSearch(_options?: Configuration): Promise<RequestContext>;
    generateSyncTml(generateSyncTmlRequest: GenerateSyncTmlRequest, _options?: Configuration): Promise<RequestContext>;
    generateTml(generateTmlRequest: GenerateTmlRequest, _options?: Configuration): Promise<RequestContext>;
    updateDbtConnection(dbtConnectionIdentifier: string, updateDbtConnectionRequest?: UpdateDbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class DBTApiResponseProcessor {
    dbtConnection(response: ResponseContext): Promise<any>;
    dbtSearch(response: ResponseContext): Promise<any>;
    generateSyncTml(response: ResponseContext): Promise<any>;
    generateTml(response: ResponseContext): Promise<any>;
    updateDbtConnection(response: ResponseContext): Promise<void>;
}
