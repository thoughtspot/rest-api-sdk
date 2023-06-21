import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateCustomActionRequest } from '../models/CreateCustomActionRequest';
import { CreateRoleRequest } from '../models/CreateRoleRequest';
import { ResponseCustomAction } from '../models/ResponseCustomAction';
import { RoleResponse } from '../models/RoleResponse';
import { SearchCustomActionsRequest } from '../models/SearchCustomActionsRequest';
import { SearchRoleResponse } from '../models/SearchRoleResponse';
import { SearchRolesRequest } from '../models/SearchRolesRequest';
import { UpdateCustomActionRequest } from '../models/UpdateCustomActionRequest';
import { UpdateRoleRequest } from '../models/UpdateRoleRequest';
export declare class Class950ClApiRequestFactory extends BaseAPIRequestFactory {
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    searchCustomActions(searchCustomActionsRequest?: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    searchRoles(searchRolesRequest?: SearchRolesRequest, _options?: Configuration): Promise<RequestContext>;
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest?: UpdateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class Class950ClApiResponseProcessor {
    createCustomAction(response: ResponseContext): Promise<ResponseCustomAction>;
    createRole(response: ResponseContext): Promise<RoleResponse>;
    deleteCustomAction(response: ResponseContext): Promise<void>;
    deleteRole(response: ResponseContext): Promise<void>;
    searchCustomActions(response: ResponseContext): Promise<Array<ResponseCustomAction>>;
    searchRoles(response: ResponseContext): Promise<Array<SearchRoleResponse>>;
    updateCustomAction(response: ResponseContext): Promise<void>;
    updateRole(response: ResponseContext): Promise<RoleResponse>;
}
