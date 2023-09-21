import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { ActivateUserRequest } from '../models/ActivateUserRequest';
import { ChangeUserPasswordRequest } from '../models/ChangeUserPasswordRequest';
import { CreateUserRequest } from '../models/CreateUserRequest';
import { DeactivateUserRequest } from '../models/DeactivateUserRequest';
import { ForceLogoutUsersRequest } from '../models/ForceLogoutUsersRequest';
import { ImportUsersRequest } from '../models/ImportUsersRequest';
import { ImportUsersResponse } from '../models/ImportUsersResponse';
import { ResetUserPasswordRequest } from '../models/ResetUserPasswordRequest';
import { ResponseActivationURL } from '../models/ResponseActivationURL';
import { SearchUsersRequest } from '../models/SearchUsersRequest';
import { UpdateUserRequest } from '../models/UpdateUserRequest';
import { User } from '../models/User';
export declare class UsersApiRequestFactory extends BaseAPIRequestFactory {
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext>;
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    forceLogoutUsers(forceLogoutUsersRequest?: ForceLogoutUsersRequest, _options?: Configuration): Promise<RequestContext>;
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<RequestContext>;
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    searchUsers(searchUsersRequest?: SearchUsersRequest, _options?: Configuration): Promise<RequestContext>;
    updateUser(userIdentifier: string, updateUserRequest?: UpdateUserRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class UsersApiResponseProcessor {
    activateUser(response: ResponseContext): Promise<User>;
    changeUserPassword(response: ResponseContext): Promise<void>;
    createUser(response: ResponseContext): Promise<User>;
    deactivateUser(response: ResponseContext): Promise<ResponseActivationURL>;
    deleteUser(response: ResponseContext): Promise<void>;
    forceLogoutUsers(response: ResponseContext): Promise<void>;
    importUsers(response: ResponseContext): Promise<ImportUsersResponse>;
    resetUserPassword(response: ResponseContext): Promise<void>;
    searchUsers(response: ResponseContext): Promise<Array<User>>;
    updateUser(response: ResponseContext): Promise<void>;
}
