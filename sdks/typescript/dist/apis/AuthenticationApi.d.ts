import { BaseAPIRequestFactory } from './baseapi';
import { Configuration } from '../configuration';
import { RequestContext, ResponseContext } from '../http/http';
import { GetFullAccessTokenRequest } from '../models/GetFullAccessTokenRequest';
import { GetObjectAccessTokenRequest } from '../models/GetObjectAccessTokenRequest';
import { GetTokenResponse } from '../models/GetTokenResponse';
import { LoginRequest } from '../models/LoginRequest';
import { RevokeTokenRequest } from '../models/RevokeTokenRequest';
import { Token } from '../models/Token';
import { User } from '../models/User';
export declare class AuthenticationApiRequestFactory extends BaseAPIRequestFactory {
    getCurrentUserInfo(_options?: Configuration): Promise<RequestContext>;
    getCurrentUserToken(_options?: Configuration): Promise<RequestContext>;
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    login(loginRequest?: LoginRequest, _options?: Configuration): Promise<RequestContext>;
    logout(_options?: Configuration): Promise<RequestContext>;
    revokeToken(revokeTokenRequest?: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext>;
}
export declare class AuthenticationApiResponseProcessor {
    getCurrentUserInfo(response: ResponseContext): Promise<User>;
    getCurrentUserToken(response: ResponseContext): Promise<GetTokenResponse>;
    getFullAccessToken(response: ResponseContext): Promise<Token>;
    getObjectAccessToken(response: ResponseContext): Promise<Token>;
    login(response: ResponseContext): Promise<void>;
    logout(response: ResponseContext): Promise<void>;
    revokeToken(response: ResponseContext): Promise<void>;
}
