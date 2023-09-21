import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { CreateUserGroupRequest } from '../models/CreateUserGroupRequest';
import { ImportUserGroupsRequest } from '../models/ImportUserGroupsRequest';
import { ImportUserGroupsResponse } from '../models/ImportUserGroupsResponse';
import { SearchUserGroupsRequest } from '../models/SearchUserGroupsRequest';
import { UpdateUserGroupRequest } from '../models/UpdateUserGroupRequest';
import { UserGroupResponse } from '../models/UserGroupResponse';
export declare class GroupsApiRequestFactory extends BaseAPIRequestFactory {
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    importUserGroups(importUserGroupsRequest?: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    searchUserGroups(searchUserGroupsRequest?: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest?: UpdateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class GroupsApiResponseProcessor {
    createUserGroup(response: ResponseContext): Promise<UserGroupResponse>;
    deleteUserGroup(response: ResponseContext): Promise<void>;
    importUserGroups(response: ResponseContext): Promise<ImportUserGroupsResponse>;
    searchUserGroups(response: ResponseContext): Promise<Array<UserGroupResponse>>;
    updateUserGroup(response: ResponseContext): Promise<void>;
}
