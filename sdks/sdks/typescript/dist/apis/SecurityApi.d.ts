import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { AssignChangeAuthorRequest } from '../models/AssignChangeAuthorRequest';
import { FetchPermissionsOfPrincipalsRequest } from '../models/FetchPermissionsOfPrincipalsRequest';
import { FetchPermissionsOnMetadataRequest } from '../models/FetchPermissionsOnMetadataRequest';
import { ShareMetadataRequest } from '../models/ShareMetadataRequest';
export declare class SecurityApiRequestFactory extends BaseAPIRequestFactory {
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext>;
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext>;
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class SecurityApiResponseProcessor {
    assignChangeAuthor(response: ResponseContext): Promise<void>;
    fetchPermissionsOfPrincipals(response: ResponseContext): Promise<any>;
    fetchPermissionsOnMetadata(response: ResponseContext): Promise<any>;
    shareMetadata(response: ResponseContext): Promise<void>;
}
