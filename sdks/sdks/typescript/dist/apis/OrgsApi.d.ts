import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateOrgRequest } from '../models/CreateOrgRequest';
import { OrgResponse } from '../models/OrgResponse';
import { SearchOrgsRequest } from '../models/SearchOrgsRequest';
import { UpdateOrgRequest } from '../models/UpdateOrgRequest';
export declare class OrgsApiRequestFactory extends BaseAPIRequestFactory {
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    searchOrgs(searchOrgsRequest?: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext>;
    updateOrg(orgIdentifier: string, updateOrgRequest?: UpdateOrgRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class OrgsApiResponseProcessor {
    createOrg(response: ResponseContext): Promise<OrgResponse>;
    deleteOrg(response: ResponseContext): Promise<void>;
    searchOrgs(response: ResponseContext): Promise<Array<OrgResponse>>;
    updateOrg(response: ResponseContext): Promise<void>;
}
