import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateRoleRequest } from '../models/CreateRoleRequest';
import { RoleResponse } from '../models/RoleResponse';
import { SearchRoleResponse } from '../models/SearchRoleResponse';
import { SearchRolesRequest } from '../models/SearchRolesRequest';
import { UpdateRoleRequest } from '../models/UpdateRoleRequest';
export declare class RolesApiRequestFactory extends BaseAPIRequestFactory {
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<RequestContext>;
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class RolesApiResponseProcessor {
    createRole(response: ResponseContext): Promise<RoleResponse>;
    deleteRole(response: ResponseContext): Promise<void>;
    searchRoles(response: ResponseContext): Promise<Array<SearchRoleResponse>>;
    updateRole(response: ResponseContext): Promise<RoleResponse>;
}
