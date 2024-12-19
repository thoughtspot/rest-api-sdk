declare class Observable<T> {
    private promise;
    constructor(promise: Promise<T>);
    toPromise(): Promise<T>;
    pipe<S>(callback: (value: T) => S | Promise<S>): Observable<S>;
}

declare class IsomorphicFetchHttpLibrary implements HttpLibrary {
    send(request: RequestContext): Observable<ResponseContext>;
}

/**
 * Represents an HTTP method.
 */
declare enum HttpMethod {
    GET = "GET",
    HEAD = "HEAD",
    POST = "POST",
    PUT = "PUT",
    DELETE = "DELETE",
    CONNECT = "CONNECT",
    OPTIONS = "OPTIONS",
    TRACE = "TRACE",
    PATCH = "PATCH"
}
/**
 * Represents an HTTP file which will be transferred from or to a server.
 */
type HttpFile = Blob & {
    readonly name: string;
};
declare class HttpException extends Error {
    constructor(msg: string);
}
/**
 * Represents the body of an outgoing HTTP request.
 */
type RequestBody = undefined | string | FormData | URLSearchParams;
/**
 * Represents an HTTP request context
 */
declare class RequestContext {
    private httpMethod;
    private headers;
    private body;
    private url;
    /**
     * Creates the request context using a http method and request resource url
     *
     * @param url url of the requested resource
     * @param httpMethod http method
     */
    constructor(url: string, httpMethod: HttpMethod);
    getUrl(): string;
    /**
     * Replaces the url set in the constructor with this url.
     *
     */
    setUrl(url: string): void;
    /**
     * Sets the body of the http request either as a string or FormData
     *
     * Note that setting a body on a HTTP GET, HEAD, DELETE, CONNECT or TRACE
     * request is discouraged.
     * https://httpwg.org/http-core/draft-ietf-httpbis-semantics-latest.html#rfc.section.7.3.1
     *
     * @param body the body of the request
     */
    setBody(body: RequestBody): void;
    getHttpMethod(): HttpMethod;
    getHeaders(): {
        [key: string]: string;
    };
    getBody(): RequestBody;
    setQueryParam(name: string, value: string): void;
    /**
     * Sets a cookie with the name and value. NO check  for duplicate cookies is performed
     *
     */
    addCookie(name: string, value: string): void;
    setHeaderParam(key: string, value: string): void;
}
interface ResponseBody {
    text(): Promise<string>;
    binary(): Promise<Blob>;
}
/**
 * Helper class to generate a `ResponseBody` from binary data
 */
declare class SelfDecodingBody implements ResponseBody {
    private dataSource;
    constructor(dataSource: Promise<Blob>);
    binary(): Promise<Blob>;
    text(): Promise<string>;
}
declare class ResponseContext {
    httpStatusCode: number;
    headers: {
        [key: string]: string;
    };
    body: ResponseBody;
    constructor(httpStatusCode: number, headers: {
        [key: string]: string;
    }, body: ResponseBody);
    /**
     * Parse header value in the form `value; param1="value1"`
     *
     * E.g. for Content-Type or Content-Disposition
     * Parameter names are converted to lower case
     * The first parameter is returned with the key `""`
     */
    getParsedHeader(headerName: string): {
        [parameter: string]: string;
    };
    getBodyAsFile(): Promise<HttpFile>;
    /**
     * Use a heuristic to get a body of unknown data structure.
     * Return as string if possible, otherwise as binary.
     */
    getBodyAsAny(): Promise<string | Blob | undefined>;
}
interface HttpLibrary {
    send(request: RequestContext): Observable<ResponseContext>;
}
interface PromiseHttpLibrary {
    send(request: RequestContext): Promise<ResponseContext>;
}
declare function wrapHttpLibrary(promiseHttpLibrary: PromiseHttpLibrary): HttpLibrary;

/**
 * Interface authentication schemes.
 */
interface SecurityAuthentication {
    getName(): string;
    /**
     * Applies the authentication scheme to the request context
     *
     * @params context the request context which should use this authentication scheme
     */
    applySecurityAuthentication(context: RequestContext): void | Promise<void>;
}
interface TokenProvider {
    getToken(): Promise<string> | string;
}
/**
 * Applies http authentication to the request context.
 */
declare class BearerAuthAuthentication implements SecurityAuthentication {
    private tokenProvider;
    /**
     * Configures the http authentication with the required details.
     *
     * @param tokenProvider service that can provide the up-to-date token when needed
     */
    constructor(tokenProvider: TokenProvider);
    getName(): string;
    applySecurityAuthentication(context: RequestContext): Promise<void>;
}
type AuthMethods = {
    "default"?: SecurityAuthentication;
    "bearerAuth"?: SecurityAuthentication;
};
type ApiKeyConfiguration = string;
type HttpBasicConfiguration = {
    "username": string;
    "password": string;
};
type HttpBearerConfiguration = {
    tokenProvider: TokenProvider;
};
type OAuth2Configuration = {
    accessToken: string;
};
type AuthMethodsConfiguration = {
    "default"?: SecurityAuthentication;
    "bearerAuth"?: HttpBearerConfiguration;
};
/**
 * Creates the authentication methods from a swagger description.
 *
 */
declare function configureAuthMethods(config: AuthMethodsConfiguration | undefined): AuthMethods;

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* With API key auth, you send a key-value pair to the API either in the request headers or query parameters.
*/
declare class APIKey {
    /**
    * Enter your key name
    */
    'key'?: string | null;
    /**
    * Enter you key value
    */
    'value'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* With API key auth, you send a key-value pair to the API either in the request headers or query parameters.
*/
declare class APIKeyInput {
    /**
    * Enter your key name
    */
    'key'?: string | null;
    /**
    * Enter you key value
    */
    'value'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class OrgInfo {
    /**
    * Id.
    */
    'id': number;
    /**
    * Name.
    */
    'name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UserInfo {
    /**
    * Id.
    */
    'id': string;
    /**
    * Name.
    */
    'name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class AccessToken {
    /**
    * GUID of the auth token.
    */
    'id'?: string | null;
    /**
    * Bearer auth token.
    */
    'token': string;
    'org': OrgInfo;
    'user': UserInfo;
    /**
    * Token creation time in milliseconds.
    */
    'creation_time_in_millis': number;
    /**
    * Token expiration time in milliseconds.
    */
    'expiration_time_in_millis': number;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Specify that the association is enabled for the metadata object
*/
declare class ActionConfig {
    /**
    * Position of the Custom action on the Metadata object. Earlier naming convention: context.
    */
    'position'?: string | null;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Specify that the association is enabled for the metadata object Default
*/
declare class ActionConfigInput {
    /**
    * Position of the Custom action on the Metadata object. Earlier naming convention: context.
    */
    'position'?: ActionConfigInputPositionEnum | null;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ActionConfigInputPositionEnum = "MENU" | "PRIMARY" | "CONTEXT_MENU";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Specify that the association is enabled for the metadata object Default
*/
declare class ActionConfigInputCreate {
    /**
    * Position of the Custom action on the Metadata object. Earlier naming convention: context.
    */
    'position'?: ActionConfigInputCreatePositionEnum | null;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ActionConfigInputCreatePositionEnum = "MENU" | "PRIMARY" | "CONTEXT_MENU";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* CALLBACK Custom Action Type
*/
declare class CALLBACK {
    /**
    * Reference name of the SDK. By default, the value will be set to action name.
    */
    'reference'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Basic Auth: Basic authentication involves sending a verified username and password with your request.
*/
declare class BasicAuth {
    /**
    * Password for the basic authentication
    */
    'password'?: string | null;
    /**
    * Username for the basic authentication
    */
    'username'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Authorization type for the custom action.
*/
declare class Authentication {
    'API_Key'?: APIKey;
    'Basic_Auth'?: BasicAuth;
    /**
    * Bearer tokens enable requests to authenticate using an access key.
    */
    'Bearer_Token'?: string | null;
    /**
    * No authorization. If your request doesn\'t require authorization.
    */
    'No_Auth'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ParametersListItem {
    /**
    * Key for the url query parameter
    */
    'key'?: string | null;
    /**
    * Value for the url query parameter
    */
    'value'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* URL Custom Action Type
*/
declare class URL {
    'authentication'?: Authentication;
    /**
    * Query parameters for url.
    */
    'parameters'?: Array<ParametersListItem> | null;
    /**
    * Request Url for the Custom action.
    */
    'url': string;
    /**
    * Reference name of the SDK. By default, the value will be set to action name.
    */
    'reference'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Type and Configuration for Custom Actions
*/
declare class ActionDetails {
    'CALLBACK'?: CALLBACK;
    'URL'?: URL;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* CALLBACK Custom Action Type
*/
declare class CALLBACKInput {
    /**
    * Reference name. By default, the value will be set to action name.
    */
    'reference'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Basic Auth: Basic authentication involves sending a verified username and password with your request.
*/
declare class BasicAuthInput {
    /**
    * Password for the basic authentication
    */
    'password'?: string | null;
    /**
    * Username for the basic authentication
    */
    'username'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Authorization type for the custom action.
*/
declare class AuthenticationInput {
    'API_Key'?: APIKeyInput;
    'Basic_Auth'?: BasicAuthInput;
    /**
    * Bearer tokens enable requests to authenticate using an access key.
    */
    'Bearer_Token'?: string | null;
    /**
    * No authorization. If your request doesn\'t require authorization.
    */
    'No_Auth'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ParametersListItemInput {
    /**
    * Key for the url query parameter
    */
    'key'?: string | null;
    /**
    * Value for the url query parameter
    */
    'value'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* URL Custom Action Type
*/
declare class URLInput {
    'authentication'?: AuthenticationInput;
    /**
    * Query parameters for url.
    */
    'parameters'?: Array<ParametersListItemInput> | null;
    /**
    * Request Url for the Custom action.
    */
    'url'?: string | null;
    /**
    * Reference name. By default the value will be set to action name
    */
    'reference'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Action details includes `Type` and configuration details of Custom Actions. Either Callback or URL is required.
*/
declare class ActionDetailsInput {
    'CALLBACK'?: CALLBACKInput;
    'URL'?: URLInput;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* CALLBACK Custom Action Type
*/
declare class CALLBACKInputMandatory {
    /**
    * Reference name. By default, the value will be set to action name.
    */
    'reference'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* URL Custom Action Type
*/
declare class URLInputMandatory {
    'authentication'?: AuthenticationInput;
    /**
    * Query parameters for url.
    */
    'parameters'?: Array<ParametersListItemInput> | null;
    /**
    * Request Url for the Custom action.
    */
    'url': string;
    /**
    * Reference name. By default the value will be set to action name
    */
    'reference'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Action details includes Type and Configuration for Custom Actions, either Callback or URL is required. When both callback and url are provided, callback would be considered
*/
declare class ActionDetailsInputCreate {
    'CALLBACK'?: CALLBACKInputMandatory;
    'URL'?: URLInputMandatory;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ActivateUserRequest {
    /**
    * Unique ID or name of the user.
    */
    'user_identifier': string;
    /**
    * Auth token for the user.
    */
    'auth_token': string;
    /**
    * New password for the user to access the account.
    */
    'password': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class AnswerContent {
    /**
    * Total available data row count.
    */
    'available_data_row_count': number;
    /**
    * Name of the columns.
    */
    'column_names': Array<string>;
    /**
    * Rows of data set.
    */
    'data_rows': Array<any>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset': number;
    /**
    * The number of records that should be included.
    */
    'record_size': number;
    /**
    * Total returned data row count.
    */
    'returned_data_row_count': number;
    /**
    * Sampling ratio (0 to 1). If the query was sampled, it is the ratio of keys returned in the data set to the total number of keys expected in the query. If the value is 1.0, this means that the complete result is returned.
    */
    'sampling_ratio': number;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Response format associated with fetch data api
*/
declare class AnswerDataResponse {
    /**
    * The unique identifier of the object
    */
    'metadata_id': string;
    /**
    * Name of the metadata object
    */
    'metadata_name': string;
    /**
    * Data content of metadata objects
    */
    'contents': Array<AnswerContent>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* MetadataType InputType used in Author API\'s
*/
declare class AuthorMetadataTypeInput {
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: AuthorMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type AuthorMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class AssignChangeAuthorRequest {
    /**
    * GUID or name of the metadata object.
    */
    'metadata': Array<AuthorMetadataTypeInput>;
    /**
    * GUID or name of the user who you want to assign as the author.
    */
    'user_identifier': string;
    /**
    * GUID or name of the current author.  When defined, the metadata objects authored by the specified owner are filtered for the API operation.
    */
    'current_owner_identifier'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class TagMetadataTypeInput {
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.   1. LIVEBOARD   2. ANSWERS   3. LOGICAL_TABLE for any data object such as table, worksheet or view.   4. LOGICAL_COLUMN for a column of any data object such as tables, worksheets or views.
    */
    'type'?: TagMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type TagMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class AssignTagRequest {
    /**
    * Metadata objects.
    */
    'metadata': Array<TagMetadataTypeInput>;
    /**
    * GUID or name of the tag.
    */
    'tag_identifiers': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class AssociateMetadataInput {
    'action_config'?: ActionConfigInput;
    /**
    * Unique ID or name of the metadata.
    */
    'identifier'?: string | null;
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: AssociateMetadataInputTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type AssociateMetadataInputTypeEnum = "VISUALIZATION" | "ANSWER" | "WORKSHEET";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class AssociateMetadataInputCreate {
    'action_config'?: ActionConfigInputCreate;
    /**
    * Unique ID or name of the metadata.
    */
    'identifier': string;
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: AssociateMetadataInputCreateTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type AssociateMetadataInputCreateTypeEnum = "VISUALIZATION" | "ANSWER" | "WORKSHEET";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Author of the schedule.
*/
declare class Author {
    /**
    * The unique identifier of the object.
    */
    'id': string;
    /**
    * Name of the object.
    */
    'name': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class AuthorType {
    /**
    * Email id of the committer
    */
    'email'?: string | null;
    /**
    * Username of the committer
    */
    'username'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ChangeUserPasswordRequest {
    /**
    * Current password of the user.
    */
    'current_password': string;
    /**
    * New password for the user.
    */
    'new_password': string;
    /**
    * GUID or name of the user.
    */
    'user_identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class Column {
    /**
    * Name of the column
    */
    'name': string;
    /**
    * Data type of the column
    */
    'data_type': string;
    /**
    * Determines if the column schema is an aggregate
    */
    'is_aggregate'?: string | null;
    /**
    * Determines if the column schema can be imported
    */
    'can_import'?: boolean | null;
    /**
    * Determines if the table is selected
    */
    'selected'?: boolean | null;
    /**
    * Determines if the table is linked
    */
    'is_linked_active'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class MetadataObject {
    /**
    * Unique ID or name of the metadata
    */
    'identifier': string;
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: MetadataObjectTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type MetadataObjectTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "CUSTOM_ACTION";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class CommitBranchRequest {
    /**
    * Metadata objects.
    */
    'metadata': Array<MetadataObject>;
    /**
    * Delete the tml files from version control repo if it does not exist in the ThoughSpot instance
    */
    'delete_aware'?: boolean | null;
    /**
    *    Name of the remote branch where object should be pushed      Note: If no branch_name is specified, then the commit_branch_name will be considered.
    */
    'branch_name'?: string;
    /**
    * Comment to be added to the commit
    */
    'comment': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CommitFileType {
    /**
    * Name of the file deployed
    */
    'file_name': string;
    /**
    * Indicates the status of deployment for the file
    */
    'status_code': string;
    /**
    * Any error or warning with the deployment
    */
    'status_message'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CommiterType {
    /**
    * Email id of the committer
    */
    'email'?: string | null;
    /**
    * Username of the committer
    */
    'username'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class CommitHistoryResponse {
    'committer': CommiterType;
    'author': AuthorType;
    /**
    * Comments associated with the commit
    */
    'comment': string;
    /**
    * Time at which the changes were committed.
    */
    'commit_time': string;
    /**
    * SHA id associated with the commit
    */
    'commit_id': string;
    /**
    * Branch where changes were committed
    */
    'branch': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class CommitResponse {
    'committer'?: CommiterType;
    'author'?: AuthorType;
    /**
    * Comments associated with the commit
    */
    'comment'?: string | null;
    /**
    * Time at which the changes were committed.
    */
    'commit_time'?: string | null;
    /**
    * SHA id associated with the commit
    */
    'commit_id'?: string | null;
    /**
    * Branch where changes were committed
    */
    'branch'?: string | null;
    /**
    * Files that were pushed as part of this commit
    */
    'committed_files'?: Array<CommitFileType> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DataWarehouseObjectInput {
    /**
    * Name of the database.
    */
    'database'?: string | null;
    /**
    * Name of the schema within the database.
    */
    'schema'?: string | null;
    /**
    * Name of the table within the schema.
    */
    'table'?: string | null;
    /**
    * Name of the column within the table.
    */
    'column'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ConnectionInput {
    /**
    * Unique ID or name of the connection.
    */
    'identifier'?: string | null;
    /**
    * A pattern to match case-insensitive name of the connection object. User `%` for a wildcard match.
    */
    'name_pattern'?: string | null;
    /**
    * Filter options for databases, schemas, tables and columns.
    */
    'data_warehouse_objects'?: Array<DataWarehouseObjectInput> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class Conversation {
    /**
    * Unique identifier of the conversation.
    */
    'conversation_identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CopyObjectRequest {
    /**
    * Description of the new object
    */
    'description'?: string;
    /**
    * GUID of metadata object to be copied (answer id or liveboard id)
    */
    'identifier': string;
    /**
    * Type of metadata object
    */
    'type'?: CopyObjectRequestTypeEnum;
    /**
    * Title of the new object
    */
    'title'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CopyObjectRequestTypeEnum = "LIVEBOARD" | "ANSWER";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateConfigRequest {
    /**
    * URL for connecting to remote repository
    */
    'repository_url': string;
    /**
    * Username to authenticate connection to remote repository
    */
    'username': string;
    /**
    * Access token corresponding to the user to authenticate connection to remote repository
    */
    'access_token': string;
    /**
    *    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\"OrgID1-or-Name1\", \"OrgID2-or-Name2\"]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later
    */
    'org_identifier'?: string;
    /**
    * List the remote branches to configure. Example:[development, production]
    */
    'branch_names'?: Array<string>;
    /**
    * Name of the remote branch where objects from this Thoughtspot instance will be versioned.    Version: 9.7.0.cl or later
    */
    'commit_branch_name'?: string;
    /**
    * Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later
    */
    'enable_guid_mapping'?: boolean | null;
    /**
    *    Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.      Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.    Version: 9.7.0.cl or later
    */
    'configuration_branch_name'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateConnectionRequest {
    /**
    * Unique name for the connection.
    */
    'name': string;
    /**
    * Description of the connection.
    */
    'description'?: string;
    /**
    * Type of the data warehouse.
    */
    'data_warehouse_type': CreateConnectionRequestDataWarehouseTypeEnum;
    /**
    * Connection configuration attributes in JSON format. To create a connection with tables, include table attributes. See the documentation above for sample JSON.
    */
    'data_warehouse_config': any;
    /**
    * Validates the connection metadata if tables are included. If you are creating a connection without tables, specify `false`.
    */
    'validate'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateConnectionRequestDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL" | "MODE" | "GOOGLE_SHEETS" | "FALCON" | "FALCON_ONPREM";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateConnectionResponse {
    /**
    * ID of the connection created.
    */
    'id': string;
    /**
    * Name of the connection.
    */
    'name': string;
    /**
    * Type of data warehouse.
    */
    'data_warehouse_type': CreateConnectionResponseDataWarehouseTypeEnum;
    /**
    * Details of the connection.
    */
    'details'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateConnectionResponseDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL" | "MODE" | "GOOGLE_SHEETS" | "FALCON" | "FALCON_ONPREM";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateConversationRequest {
    /**
    * Data model id to start the conversation on.
    */
    'metadata_identifier': string;
    /**
    * Tokens to start the conversation with.
    */
    'tokens'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Action details includes `Type` and Configuration data for Custom Actions, either Callback or URL is required.
*/
declare class CreateCustomActionRequestActionDetails {
    'CALLBACK'?: CALLBACKInputMandatory;
    'URL'?: URLInputMandatory;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes if the custom action is available on all visualizations. By default, a custom action is added to all visualizations and Answers.
*/
declare class CreateCustomActionRequestDefaultActionConfig {
    /**
    * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility. Default: true
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class CreateCustomActionRequest {
    /**
    * Name of the custom action. The custom action name must be unique.
    */
    'name': string;
    'action_details': CreateCustomActionRequestActionDetails;
    /**
    * Metadata objects to which the custom action needs to be associated.
    */
    'associate_metadata'?: Array<AssociateMetadataInputCreate>;
    'default_action_config'?: CreateCustomActionRequestDefaultActionConfig;
    /**
    * Unique ID or name of the groups that can view and access the custom action.
    */
    'group_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateOrgRequest {
    /**
    * Name of the Org.
    */
    'name': string;
    /**
    * Description of the Org.
    */
    'description'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateRoleRequest {
    /**
    * Unique name of the Role.
    */
    'name': string;
    /**
    * Description of the Role.
    */
    'description'?: string;
    /**
    * Privileges granted to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.
    */
    'privileges'?: Array<CreateRoleRequestPrivilegesEnum>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateRoleRequestPrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CAN_CREATE_CATALOG" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Schedule selected cron expression.
*/
declare class CronExpressionInput {
    /**
    * Day of month of the object.
    */
    'day_of_month': string;
    /**
    * Day of Week of the object.
    */
    'day_of_week': string;
    /**
    * Hour of the object.
    */
    'hour': string;
    /**
    * Minute of the object.
    */
    'minute': string;
    /**
    * Month of the object.
    */
    'month': string;
    /**
    * Second of the object.
    */
    'second': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Frequency settings for the scheduled job.
*/
declare class CreateScheduleRequestFrequency {
    'cron_expression': CronExpressionInput;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options to specify details of Liveboard.
*/
declare class CreateScheduleRequestLiveboardOptions {
    /**
    * Unique ID or name of visualizations.
    */
    'visualization_identifiers': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* PDF layout and orientation settings. Applicable only if the `file_format` is specified as `PDF`.
*/
declare class CreateScheduleRequestPdfOptions {
    /**
    * Indicates whether to include complete Liveboard.
    */
    'complete_liveboard'?: boolean | null;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string | null;
    /**
    * Page size.
    */
    'page_size'?: CreateScheduleRequestPdfOptionsPageSizeEnum | null;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateScheduleRequestPdfOptionsPageSizeEnum = "A4";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PrincipalsListItemInput {
    /**
    * Unique ID or name of the user or group.
    */
    'identifier': string;
    /**
    * Principal type.
    */
    'type': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Recipients of the scheduled job notifications. Add the GUID or name of the ThoughtSpot users or groups as recipients in the `principals` array. If a recipient is not a ThoughtSpot user, specify email address.
*/
declare class CreateScheduleRequestRecipientDetails {
    /**
    * Emails of the recipients.
    */
    'emails'?: Array<string> | null;
    /**
    * User or groups to be set as recipients of the schedule notifications.
    */
    'principals'?: Array<PrincipalsListItemInput> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class CreateScheduleRequest {
    /**
    * Name of the scheduled job.
    */
    'name': string;
    /**
    * Description of the job.
    */
    'description': string;
    /**
    * Type of the metadata object.
    */
    'metadata_type': CreateScheduleRequestMetadataTypeEnum;
    /**
    * Unique ID or name of the metadata object.
    */
    'metadata_identifier': string;
    /**
    * Export file format.
    */
    'file_format'?: CreateScheduleRequestFileFormatEnum;
    'liveboard_options'?: CreateScheduleRequestLiveboardOptions;
    'pdf_options'?: CreateScheduleRequestPdfOptions;
    /**
    * Time zone
    */
    'time_zone': CreateScheduleRequestTimeZoneEnum;
    'frequency'?: CreateScheduleRequestFrequency;
    'recipient_details': CreateScheduleRequestRecipientDetails;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateScheduleRequestMetadataTypeEnum = "LIVEBOARD";
type CreateScheduleRequestFileFormatEnum = "CSV" | "PDF" | "XLSX";
type CreateScheduleRequestTimeZoneEnum = "Africa/Abidjan" | "Africa/Accra" | "Africa/Addis_Ababa" | "Africa/Algiers" | "Africa/Asmara" | "Africa/Asmera" | "Africa/Bamako" | "Africa/Bangui" | "Africa/Banjul" | "Africa/Bissau" | "Africa/Blantyre" | "Africa/Brazzaville" | "Africa/Bujumbura" | "Africa/Cairo" | "Africa/Casablanca" | "Africa/Ceuta" | "Africa/Conakry" | "Africa/Dakar" | "Africa/Dar_es_Salaam" | "Africa/Djibouti" | "Africa/Douala" | "Africa/El_Aaiun" | "Africa/Freetown" | "Africa/Gaborone" | "Africa/Harare" | "Africa/Johannesburg" | "Africa/Juba" | "Africa/Kampala" | "Africa/Khartoum" | "Africa/Kigali" | "Africa/Kinshasa" | "Africa/Lagos" | "Africa/Libreville" | "Africa/Lome" | "Africa/Luanda" | "Africa/Lubumbashi" | "Africa/Lusaka" | "Africa/Malabo" | "Africa/Maputo" | "Africa/Maseru" | "Africa/Mbabane" | "Africa/Mogadishu" | "Africa/Monrovia" | "Africa/Nairobi" | "Africa/Ndjamena" | "Africa/Niamey" | "Africa/Nouakchott" | "Africa/Ouagadougou" | "Africa/Porto-Novo" | "Africa/Sao_Tome" | "Africa/Timbuktu" | "Africa/Tripoli" | "Africa/Tunis" | "Africa/Windhoek" | "America/Adak" | "America/Anchorage" | "America/Anguilla" | "America/Antigua" | "America/Araguaina" | "America/Argentina/Buenos_Aires" | "America/Argentina/Catamarca" | "America/Argentina/ComodRivadavia" | "America/Argentina/Cordoba" | "America/Argentina/Jujuy" | "America/Argentina/La_Rioja" | "America/Argentina/Mendoza" | "America/Argentina/Rio_Gallegos" | "America/Argentina/Salta" | "America/Argentina/San_Juan" | "America/Argentina/San_Luis" | "America/Argentina/Tucuman" | "America/Argentina/Ushuaia" | "America/Aruba" | "America/Asuncion" | "America/Atikokan" | "America/Atka" | "America/Bahia" | "America/Bahia_Banderas" | "America/Barbados" | "America/Belem" | "America/Belize" | "America/Blanc-Sablon" | "America/Boa_Vista" | "America/Bogota" | "America/Boise" | "America/Buenos_Aires" | "America/Cambridge_Bay" | "America/Campo_Grande" | "America/Cancun" | "America/Caracas" | "America/Catamarca" | "America/Cayenne" | "America/Cayman" | "America/Chicago" | "America/Chihuahua" | "America/Coral_Harbour" | "America/Cordoba" | "America/Costa_Rica" | "America/Creston" | "America/Cuiaba" | "America/Curacao" | "America/Danmarkshavn" | "America/Dawson" | "America/Dawson_Creek" | "America/Denver" | "America/Detroit" | "America/Dominica" | "America/Edmonton" | "America/Eirunepe" | "America/El_Salvador" | "America/Ensenada" | "America/Fort_Nelson" | "America/Fort_Wayne" | "America/Fortaleza" | "America/Glace_Bay" | "America/Godthab" | "America/Goose_Bay" | "America/Grand_Turk" | "America/Grenada" | "America/Guadeloupe" | "America/Guatemala" | "America/Guayaquil" | "America/Guyana" | "America/Halifax" | "America/Havana" | "America/Hermosillo" | "America/Indiana/Indianapolis" | "America/Indiana/Knox" | "America/Indiana/Marengo" | "America/Indiana/Petersburg" | "America/Indiana/Tell_City" | "America/Indiana/Vevay" | "America/Indiana/Vincennes" | "America/Indiana/Winamac" | "America/Indianapolis" | "America/Inuvik" | "America/Iqaluit" | "America/Jamaica" | "America/Jujuy" | "America/Juneau" | "America/Kentucky/Louisville" | "America/Kentucky/Monticello" | "America/Knox_IN" | "America/Kralendijk" | "America/La_Paz" | "America/Lima" | "America/Los_Angeles" | "America/Louisville" | "America/Lower_Princes" | "America/Maceio" | "America/Managua" | "America/Manaus" | "America/Marigot" | "America/Martinique" | "America/Matamoros" | "America/Mazatlan" | "America/Mendoza" | "America/Menominee" | "America/Merida" | "America/Metlakatla" | "America/Mexico_City" | "America/Miquelon" | "America/Moncton" | "America/Monterrey" | "America/Montevideo" | "America/Montreal" | "America/Montserrat" | "America/Nassau" | "America/New_York" | "America/Nipigon" | "America/Nome" | "America/Noronha" | "America/North_Dakota/Beulah" | "America/North_Dakota/Center" | "America/North_Dakota/New_Salem" | "America/Nuuk" | "America/Ojinaga" | "America/Panama" | "America/Pangnirtung" | "America/Paramaribo" | "America/Phoenix" | "America/Port-au-Prince" | "America/Port_of_Spain" | "America/Porto_Acre" | "America/Porto_Velho" | "America/Puerto_Rico" | "America/Punta_Arenas" | "America/Rainy_River" | "America/Rankin_Inlet" | "America/Recife" | "America/Regina" | "America/Resolute" | "America/Rio_Branco" | "America/Rosario" | "America/Santa_Isabel" | "America/Santarem" | "America/Santiago" | "America/Santo_Domingo" | "America/Sao_Paulo" | "America/Scoresbysund" | "America/Shiprock" | "America/Sitka" | "America/St_Barthelemy" | "America/St_Johns" | "America/St_Kitts" | "America/St_Lucia" | "America/St_Thomas" | "America/St_Vincent" | "America/Swift_Current" | "America/Tegucigalpa" | "America/Thule" | "America/Thunder_Bay" | "America/Tijuana" | "America/Toronto" | "America/Tortola" | "America/Vancouver" | "America/Virgin" | "America/Whitehorse" | "America/Winnipeg" | "America/Yakutat" | "America/Yellowknife" | "Antarctica/Casey" | "Antarctica/Davis" | "Antarctica/DumontDUrville" | "Antarctica/Macquarie" | "Antarctica/Mawson" | "Antarctica/McMurdo" | "Antarctica/Palmer" | "Antarctica/Rothera" | "Antarctica/South_Pole" | "Antarctica/Syowa" | "Antarctica/Troll" | "Antarctica/Vostok" | "Arctic/Longyearbyen" | "Asia/Aden" | "Asia/Almaty" | "Asia/Amman" | "Asia/Anadyr" | "Asia/Aqtau" | "Asia/Aqtobe" | "Asia/Ashgabat" | "Asia/Ashkhabad" | "Asia/Atyrau" | "Asia/Baghdad" | "Asia/Bahrain" | "Asia/Baku" | "Asia/Bangkok" | "Asia/Barnaul" | "Asia/Beirut" | "Asia/Bishkek" | "Asia/Brunei" | "Asia/Calcutta" | "Asia/Chita" | "Asia/Choibalsan" | "Asia/Chongqing" | "Asia/Chungking" | "Asia/Colombo" | "Asia/Dacca" | "Asia/Damascus" | "Asia/Dhaka" | "Asia/Dili" | "Asia/Dubai" | "Asia/Dushanbe" | "Asia/Famagusta" | "Asia/Gaza" | "Asia/Harbin" | "Asia/Hebron" | "Asia/Ho_Chi_Minh" | "Asia/Hong_Kong" | "Asia/Hovd" | "Asia/Irkutsk" | "Asia/Istanbul" | "Asia/Jakarta" | "Asia/Jayapura" | "Asia/Jerusalem" | "Asia/Kabul" | "Asia/Kamchatka" | "Asia/Karachi" | "Asia/Kashgar" | "Asia/Kathmandu" | "Asia/Katmandu" | "Asia/Khandyga" | "Asia/Kolkata" | "Asia/Krasnoyarsk" | "Asia/Kuala_Lumpur" | "Asia/Kuching" | "Asia/Kuwait" | "Asia/Macao" | "Asia/Macau" | "Asia/Magadan" | "Asia/Makassar" | "Asia/Manila" | "Asia/Muscat" | "Asia/Nicosia" | "Asia/Novokuznetsk" | "Asia/Novosibirsk" | "Asia/Omsk" | "Asia/Oral" | "Asia/Phnom_Penh" | "Asia/Pontianak" | "Asia/Pyongyang" | "Asia/Qatar" | "Asia/Qostanay" | "Asia/Qyzylorda" | "Asia/Rangoon" | "Asia/Riyadh" | "Asia/Saigon" | "Asia/Sakhalin" | "Asia/Samarkand" | "Asia/Seoul" | "Asia/Shanghai" | "Asia/Singapore" | "Asia/Srednekolymsk" | "Asia/Taipei" | "Asia/Tashkent" | "Asia/Tbilisi" | "Asia/Tehran" | "Asia/Tel_Aviv" | "Asia/Thimbu" | "Asia/Thimphu" | "Asia/Tokyo" | "Asia/Tomsk" | "Asia/Ujung_Pandang" | "Asia/Ulaanbaatar" | "Asia/Ulan_Bator" | "Asia/Urumqi" | "Asia/Ust-Nera" | "Asia/Vientiane" | "Asia/Vladivostok" | "Asia/Yakutsk" | "Asia/Yangon" | "Asia/Yekaterinburg" | "Asia/Yerevan" | "Atlantic/Azores" | "Atlantic/Bermuda" | "Atlantic/Canary" | "Atlantic/Cape_Verde" | "Atlantic/Faeroe" | "Atlantic/Faroe" | "Atlantic/Jan_Mayen" | "Atlantic/Madeira" | "Atlantic/Reykjavik" | "Atlantic/South_Georgia" | "Atlantic/St_Helena" | "Atlantic/Stanley" | "Australia/ACT" | "Australia/Adelaide" | "Australia/Brisbane" | "Australia/Broken_Hill" | "Australia/Canberra" | "Australia/Currie" | "Australia/Darwin" | "Australia/Eucla" | "Australia/Hobart" | "Australia/LHI" | "Australia/Lindeman" | "Australia/Lord_Howe" | "Australia/Melbourne" | "Australia/NSW" | "Australia/North" | "Australia/Perth" | "Australia/Queensland" | "Australia/South" | "Australia/Sydney" | "Australia/Tasmania" | "Australia/Victoria" | "Australia/West" | "Australia/Yancowinna" | "Brazil/Acre" | "Brazil/DeNoronha" | "Brazil/East" | "Brazil/West" | "CET" | "CST6CDT" | "Canada/Atlantic" | "Canada/Central" | "Canada/Eastern" | "Canada/Mountain" | "Canada/Newfoundland" | "Canada/Pacific" | "Canada/Saskatchewan" | "Canada/Yukon" | "Chile/Continental" | "Chile/EasterIsland" | "Cuba" | "EET" | "EST5EDT" | "Egypt" | "Eire" | "Etc/GMT" | "Etc/GMT+0" | "Etc/GMT+1" | "Etc/GMT+10" | "Etc/GMT+11" | "Etc/GMT+12" | "Etc/GMT+2" | "Etc/GMT+3" | "Etc/GMT+4" | "Etc/GMT+5" | "Etc/GMT+6" | "Etc/GMT+7" | "Etc/GMT+8" | "Etc/GMT+9" | "Etc/GMT-0" | "Etc/GMT-1" | "Etc/GMT-10" | "Etc/GMT-11" | "Etc/GMT-12" | "Etc/GMT-13" | "Etc/GMT-14" | "Etc/GMT-2" | "Etc/GMT-3" | "Etc/GMT-4" | "Etc/GMT-5" | "Etc/GMT-6" | "Etc/GMT-7" | "Etc/GMT-8" | "Etc/GMT-9" | "Etc/GMT0" | "Etc/Greenwich" | "Etc/UCT" | "Etc/UTC" | "Etc/Universal" | "Etc/Zulu" | "Europe/Amsterdam" | "Europe/Andorra" | "Europe/Astrakhan" | "Europe/Athens" | "Europe/Belfast" | "Europe/Belgrade" | "Europe/Berlin" | "Europe/Bratislava" | "Europe/Brussels" | "Europe/Bucharest" | "Europe/Budapest" | "Europe/Busingen" | "Europe/Chisinau" | "Europe/Copenhagen" | "Europe/Dublin" | "Europe/Gibraltar" | "Europe/Guernsey" | "Europe/Helsinki" | "Europe/Isle_of_Man" | "Europe/Istanbul" | "Europe/Jersey" | "Europe/Kaliningrad" | "Europe/Kiev" | "Europe/Kirov" | "Europe/Kyiv" | "Europe/Lisbon" | "Europe/Ljubljana" | "Europe/London" | "Europe/Luxembourg" | "Europe/Madrid" | "Europe/Malta" | "Europe/Mariehamn" | "Europe/Minsk" | "Europe/Monaco" | "Europe/Moscow" | "Europe/Nicosia" | "Europe/Oslo" | "Europe/Paris" | "Europe/Podgorica" | "Europe/Prague" | "Europe/Riga" | "Europe/Rome" | "Europe/Samara" | "Europe/San_Marino" | "Europe/Sarajevo" | "Europe/Saratov" | "Europe/Simferopol" | "Europe/Skopje" | "Europe/Sofia" | "Europe/Stockholm" | "Europe/Tallinn" | "Europe/Tirane" | "Europe/Tiraspol" | "Europe/Ulyanovsk" | "Europe/Uzhgorod" | "Europe/Vaduz" | "Europe/Vatican" | "Europe/Vienna" | "Europe/Vilnius" | "Europe/Volgograd" | "Europe/Warsaw" | "Europe/Zagreb" | "Europe/Zaporozhye" | "Europe/Zurich" | "GB" | "GB-Eire" | "GMT" | "GMT0" | "Greenwich" | "Hongkong" | "Iceland" | "Indian/Antananarivo" | "Indian/Chagos" | "Indian/Christmas" | "Indian/Cocos" | "Indian/Comoro" | "Indian/Kerguelen" | "Indian/Mahe" | "Indian/Maldives" | "Indian/Mauritius" | "Indian/Mayotte" | "Indian/Reunion" | "Iran" | "Israel" | "Jamaica" | "Japan" | "Kwajalein" | "Libya" | "MET" | "MST7MDT" | "Mexico/BajaNorte" | "Mexico/BajaSur" | "Mexico/General" | "NZ" | "NZ-CHAT" | "Navajo" | "PRC" | "PST8PDT" | "Pacific/Apia" | "Pacific/Auckland" | "Pacific/Bougainville" | "Pacific/Chatham" | "Pacific/Chuuk" | "Pacific/Easter" | "Pacific/Efate" | "Pacific/Enderbury" | "Pacific/Fakaofo" | "Pacific/Fiji" | "Pacific/Funafuti" | "Pacific/Galapagos" | "Pacific/Gambier" | "Pacific/Guadalcanal" | "Pacific/Guam" | "Pacific/Honolulu" | "Pacific/Johnston" | "Pacific/Kanton" | "Pacific/Kiritimati" | "Pacific/Kosrae" | "Pacific/Kwajalein" | "Pacific/Majuro" | "Pacific/Marquesas" | "Pacific/Midway" | "Pacific/Nauru" | "Pacific/Niue" | "Pacific/Norfolk" | "Pacific/Noumea" | "Pacific/Pago_Pago" | "Pacific/Palau" | "Pacific/Pitcairn" | "Pacific/Pohnpei" | "Pacific/Ponape" | "Pacific/Port_Moresby" | "Pacific/Rarotonga" | "Pacific/Saipan" | "Pacific/Samoa" | "Pacific/Tahiti" | "Pacific/Tarawa" | "Pacific/Tongatapu" | "Pacific/Truk" | "Pacific/Wake" | "Pacific/Wallis" | "Pacific/Yap" | "Poland" | "Portugal" | "ROK" | "Singapore" | "SystemV/AST4" | "SystemV/AST4ADT" | "SystemV/CST6" | "SystemV/CST6CDT" | "SystemV/EST5" | "SystemV/EST5EDT" | "SystemV/HST10" | "SystemV/MST7" | "SystemV/MST7MDT" | "SystemV/PST8" | "SystemV/PST8PDT" | "SystemV/YST9" | "SystemV/YST9YDT" | "Turkey" | "UCT" | "US/Alaska" | "US/Aleutian" | "US/Arizona" | "US/Central" | "US/East-Indiana" | "US/Eastern" | "US/Hawaii" | "US/Indiana-Starke" | "US/Michigan" | "US/Mountain" | "US/Pacific" | "US/Samoa" | "UTC" | "Universal" | "W-SU" | "WET" | "Zulu" | "EST" | "HST" | "MST" | "ACT" | "AET" | "AGT" | "ART" | "AST" | "BET" | "BST" | "CAT" | "CNT" | "CST" | "CTT" | "EAT" | "ECT" | "IET" | "IST" | "JST" | "MIT" | "NET" | "NST" | "PLT" | "PNT" | "PRT" | "PST" | "SST" | "VST";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateTagRequest {
    /**
    * Name of the tag.
    */
    'name': string;
    /**
    * Hex color code to be assigned to the tag. For example, #ff78a9.
    */
    'color'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class CreateUserGroupRequest {
    /**
    * Name of the group. The group name must be unique.
    */
    'name': string;
    /**
    * Display name for the group.
    */
    'display_name': string;
    /**
    * GUID of the Liveboards to assign as default Liveboards to the users in the group.
    */
    'default_liveboard_identifiers'?: Array<string>;
    /**
    * Description of the group
    */
    'description'?: string;
    /**
    * Privileges to assign to the group
    */
    'privileges'?: Array<CreateUserGroupRequestPrivilegesEnum>;
    /**
    * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
    */
    'sub_group_identifiers'?: Array<string>;
    /**
    * Group type.
    */
    'type'?: CreateUserGroupRequestTypeEnum;
    /**
    * GUID or name of the users to assign to the group.
    */
    'user_identifiers'?: Array<string>;
    /**
    * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
    */
    'visibility'?: CreateUserGroupRequestVisibilityEnum;
    /**
    * Role identifiers of the roles that should be assigned to the group.
    */
    'role_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type CreateUserGroupRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
type CreateUserGroupRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FavoriteMetadataInput {
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier'?: string | null;
    /**
    *   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: FavoriteMetadataInputTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FavoriteMetadataInputTypeEnum = "LIVEBOARD" | "ANSWER";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class CreateUserRequest {
    /**
    * Name of the user. The username string must be unique.
    */
    'name': string;
    /**
    * A unique display name string for the user account, usually their first and last name
    */
    'display_name': string;
    /**
    * Password for the user account. For IAMv2 users, you must set this password if you do not want to trigger an activation email.
    */
    'password'?: string;
    /**
    * Email of the user account
    */
    'email': string;
    /**
    * Type of the account.
    */
    'account_type'?: CreateUserRequestAccountTypeEnum;
    /**
    * Current status of the user account. The `SUSPENDED` user state indicates a transitional state applicable to IAMv2 users only.
    */
    'account_status'?: CreateUserRequestAccountStatusEnum;
    /**
    * List of Org IDs to which the user belongs.
    */
    'org_identifiers'?: Array<string>;
    /**
    * GUIDs or names of the groups to which the newly created user belongs.
    */
    'group_identifiers'?: Array<string>;
    /**
    * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
    */
    'visibility'?: CreateUserRequestVisibilityEnum;
    /**
    * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
    */
    'notify_on_share'?: boolean | null;
    /**
    * The user preference for revisiting the onboarding experience.
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * flag to get the on-boarding experience is completed or not.
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in.
    */
    'home_liveboard_identifier'?: string;
    /**
    * Metadata objects to add to the user\'s favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    /**
    * Locale for the user.
    */
    'preferred_locale'?: CreateUserRequestPreferredLocaleEnum;
    /**
    * Properties for the user
    */
    'extended_properties'?: any;
    /**
    * Preferences for the user
    */
    'extended_preferences'?: any;
    /**
    * Flag to indicate whether welcome email should be sent to user. This parameter is applied only on clusters on which IAM is disabled.
    */
    'trigger_welcome_email'?: boolean | null;
    /**
    * Flag to indicate whether activation email should be sent to the user. Default value for IAMv2 users is set to true. Users must either set this to false, or enter a valid  password if they do not want to trigger an activation email.
    */
    'trigger_activation_email'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CreateUserRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type CreateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" | "SUSPENDED";
type CreateUserRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
type CreateUserRequestPreferredLocaleEnum = "en-CA" | "en-GB" | "en-US" | "de-DE" | "ja-JP" | "zh-CN" | "pt-BR" | "fr-FR" | "fr-CA" | "es-US" | "da-DK" | "es-ES" | "fi-FI" | "sv-SE" | "nb-NO" | "pt-PT" | "nl-NL" | "it-IT" | "ru-RU" | "en-IN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Schedule selected cron expression.
*/
declare class CronExpression {
    /**
    * Day of month of the object.
    */
    'day_of_month': string;
    /**
    * Day of Week of the object.
    */
    'day_of_week': string;
    /**
    * Hour of the object.
    */
    'hour': string;
    /**
    * Minute of the object.
    */
    'minute': string;
    /**
    * Month of the object.
    */
    'month': string;
    /**
    * Second of the object.
    */
    'second': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* MetadataType InputType used in Custom Action API\'s
*/
declare class CustomActionMetadataTypeInput {
    /**
    *   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: CustomActionMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type CustomActionMetadataTypeInputTypeEnum = "VISUALIZATION" | "ANSWER" | "WORKSHEET";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class Table {
    /**
    * Name of the table.
    */
    'name': string;
    /**
    * Columns of the table.
    */
    'columns'?: Array<Column> | null;
    /**
    * Type of table. Either view or table
    */
    'type'?: string | null;
    /**
    * Description of the table
    */
    'description'?: string | null;
    /**
    * Determines if the table is selected
    */
    'selected'?: boolean | null;
    /**
    * Determines if the table is linked
    */
    'linked'?: boolean | null;
    /**
    * List of relationships for the table
    */
    'relationships'?: Array<any> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SchemaObject {
    /**
    * Name of the schema.
    */
    'name': string;
    /**
    * Tables in the schema.
    */
    'tables'?: Array<Table> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class Database {
    /**
    * Name of the database.
    */
    'name': string;
    /**
    * Schemas of the database.
    */
    'schemas'?: Array<SchemaObject> | null;
    /**
    * Determines if the object is auto created.
    */
    'auto_created'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class DataWarehouseObjects {
    /**
    * Databases of the connection.
    */
    'databases': Array<Database>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class DbtConnectionRequest {
    /**
    * Name of the connection.
    */
    'connection_name': string;
    /**
    * Name of the Database.
    */
    'database_name': string;
    /**
    * Mention type of Import
    */
    'import_type'?: DbtConnectionRequestImportTypeEnum;
    /**
    * Access token is mandatory when Import_Type is DBT_CLOUD.
    */
    'access_token'?: string;
    /**
    * DBT URL is mandatory when Import_Type is DBT_CLOUD.
    */
    'dbt_url'?: string;
    /**
    * Account ID is mandatory when Import_Type is DBT_CLOUD
    */
    'account_id'?: string;
    /**
    * Project ID is mandatory when Import_Type is DBT_CLOUD
    */
    'project_id'?: string;
    /**
    * DBT Environment ID\"
    */
    'dbt_env_id'?: string;
    /**
    * Name of the project
    */
    'project_name'?: string;
    /**
    * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \'ZIP_FILE\'
    */
    'file_content'?: HttpFile;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type DbtConnectionRequestImportTypeEnum = "DBT_CLOUD" | "ZIP_FILE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class DbtGenerateSyncTmlRequest {
    /**
    * Unique ID of the DBT connection.
    */
    'dbt_connection_identifier': string;
    /**
    * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
    */
    'file_content'?: HttpFile;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ModelTableList {
    /**
    * Name of the Model.
    */
    'model_name': string;
    /**
    * Model directory path, this is optional param and required if there are duplicate models with the same name.
    */
    'model_path'?: string | null;
    /**
    * List of Tables.
    */
    'tables': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class DbtGenerateTmlRequest {
    /**
    * Unique ID of the DBT connection.
    */
    'dbt_connection_identifier': string;
    /**
    * List of Models and their respective Tables
    */
    'model_tables'?: Array<ModelTableList>;
    /**
    * Mention the worksheet tmls to import
    */
    'import_worksheets': DbtGenerateTmlRequestImportWorksheetsEnum;
    /**
    * List of worksheets is mandatory when import_Worksheets is type SELECTED
    */
    'worksheets'?: Array<string>;
    /**
    * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is mandatory if the connection was created with import_type ‘ZIP_FILE’
    */
    'file_content'?: HttpFile;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type DbtGenerateTmlRequestImportWorksheetsEnum = "ALL" | "NONE" | "SELECTED";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DbtSearchResponse {
    'dbt_connection_identifier'?: string | null;
    'project_name'?: string | null;
    'connection_id'?: string | null;
    'connection_name'?: string | null;
    'cdw_database'?: string | null;
    'import_type'?: string | null;
    'author_name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DeactivateUserRequest {
    /**
    * Unique ID or name of the user.
    */
    'user_identifier': string;
    /**
    * Base url of the cluster.
    */
    'base_url': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes the custom action\'s visibility across all visualizations and Answers. By default, a custom action is added to all visualizations and Answers.
*/
declare class DefaultActionConfig {
    /**
    * Custom action is available on all visualizations. Earlier , the naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes the custom action\'s visibility across all visualizations and Answers. By default, a custom action is added to all visualizations and Answers.
*/
declare class DefaultActionConfigInput {
    /**
    * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes the custom action\'s visibility across all visualizations and Answers. By default, a custom action is added to all visualizations and Answers.
*/
declare class DefaultActionConfigInputCreate {
    /**
    * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility. Default: true
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes the custom action\'s visibility across all visualizations and Answers. By default, a custom action is added to all visualizations and Answers.
*/
declare class DefaultActionConfigSearchInput {
    /**
    * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DeleteConfigRequest {
    /**
    *    Applicable when Orgs is enabled in the cluster      Indicator to consider cluster level or org level config. Set it to false to delete configuration from current org. If set to true, then the configuration at cluster level and orgs that inherited the configuration from cluster level will be deleted.     Version: 9.5.0.cl or later
    */
    'cluster_level'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DeleteConnectionRequest {
    /**
    * Unique ID or name of the connection.
    */
    'connection_identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* MetadataType InputType used in Delete MetadataType API
*/
declare class DeleteMetadataTypeInput {
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: DeleteMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type DeleteMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "LOGICAL_RELATIONSHIP";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class DeleteMetadataRequest {
    /**
    * Metadata objects.
    */
    'metadata': Array<DeleteMetadataTypeInput>;
    /**
    * Indicates whether to delete disabled metadata objects.
    */
    'delete_disabled_objects'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DeployCommitRequest {
    /**
    *    Commit_id against which the files should be picked to deploy.      Note: If no commit_id is specified, then the head of the branch is considered.
    */
    'commit_id'?: string;
    /**
    * Name of the remote branch where changes should be picked
    */
    'branch_name': string;
    /**
    * Indicates if all files or only modified file at specified commit point should be considered
    */
    'deploy_type'?: DeployCommitRequestDeployTypeEnum;
    /**
    * Define the policy to follow while importing TML in the ThoughtSpot environment. Use “ALL_OR_NONE” to cancel the deployment of all ThoughtSpot objects if at least one of them fails to import. Use “Partial” to import ThoughtSpot objects that validate successfully even if other objects in the same deploy operations fail to import.
    */
    'deploy_policy'?: DeployCommitRequestDeployPolicyEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type DeployCommitRequestDeployTypeEnum = "FULL" | "DELTA";
type DeployCommitRequestDeployPolicyEnum = "ALL_OR_NONE" | "PARTIAL" | "VALIDATE_ONLY";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class DeployResponse {
    /**
    * Name of the file deployed
    */
    'file_name'?: string | null;
    /**
    * Name of the metadata object
    */
    'metadata_name'?: string | null;
    /**
    * Type of the metadata object
    */
    'metadata_type'?: string | null;
    /**
    * Indicates the status of deployment for the file
    */
    'status_code'?: string | null;
    /**
    * Any error or warning with the deployment
    */
    'status_message'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ErrorResponse {
    'error'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ExcludeMetadataListItemInput {
    /**
    * Unique ID or name of the metadata.
    */
    'identifier': string;
    /**
    * Type of metadata. Required if the name of the object is set as identifier. This attribute is optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view 5. CONNECTION for connection objects 6. TAG for tag objects 7. USER for user objects 8. USER_GROUP for group objects 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values. 10. INSIGHT_SPEC for SpotIQ objects
    */
    'type': ExcludeMetadataListItemInputTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExcludeMetadataListItemInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP" | "INSIGHT_SPEC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ExportAnswerReportRequest {
    /**
    * Unique ID or name of the metadata object.
    */
    'metadata_identifier'?: string;
    /**
    * Unique ID of the answer session.
    */
    'session_identifier'?: string;
    /**
    * Generation number of the answer session.
    */
    'generation_number'?: number;
    /**
    * Export file format.
    */
    'file_format'?: ExportAnswerReportRequestFileFormatEnum;
    /**
    * JSON string representing runtime filter. { col1:region, op1: EQ, val1: northeast }
    */
    'runtime_filter'?: any;
    /**
    * JSON string representing runtime sort. { sortCol1: region, asc1 :true, sortCol2 : date }
    */
    'runtime_sort'?: any;
    /**
    * JSON object for setting values of parameters in runtime.
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExportAnswerReportRequestFileFormatEnum = "CSV" | "PDF" | "XLSX" | "PNG";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options for PDF export.
*/
declare class ExportLiveboardReportRequestPdfOptions {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page.
    */
    'include_page_number'?: boolean | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: ExportLiveboardReportRequestPdfOptionsPageOrientationEnum | null;
    /**
    * Indicates whether to include only the first page of the tables.
    */
    'truncate_table'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExportLiveboardReportRequestPdfOptionsPageOrientationEnum = "PORTRAIT" | "LANDSCAPE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options for PNG export.
*/
declare class ExportLiveboardReportRequestPngOptions {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ExportLiveboardReportRequest {
    /**
    * GUID or name of the Liveboard object.
    */
    'metadata_identifier': string;
    /**
    * GUID or name of visualizations on the Liveboard. If this parameter is not defined, the API returns a report with all visualizations saved on a Liveboard.
    */
    'visualization_identifiers'?: Array<string>;
    /**
    * Transient content of the Liveboard.
    */
    'transient_content'?: string;
    /**
    * Export file format.
    */
    'file_format'?: ExportLiveboardReportRequestFileFormatEnum;
    /**
    * JSON object with representing filter condition to apply filters at runtime. For example, {\"col1\": \"region\", \"op1\": \"EQ\", \"val1\": \"northeast\" }. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
    */
    'runtime_filter'?: any;
    /**
    * JSON string representing runtime sort. For example, {\"sortCol1\": \"region\", \"asc1\" : true}. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
    */
    'runtime_sort'?: any;
    'pdf_options'?: ExportLiveboardReportRequestPdfOptions;
    'png_options'?: ExportLiveboardReportRequestPngOptions;
    /**
    * JSON object for setting values of parameters at runtime. For example, <code> {\"param1\": \"Double List Param\", \"paramVal1\": 0.5}</code>. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExportLiveboardReportRequestFileFormatEnum = "CSV" | "PDF" | "XLSX" | "PNG";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ExportMetadataTMLBatchedRequest {
    /**
    * Type of metadata object to export, can be one of USER | ROLE | USER_GROUP
    */
    'metadata_type': ExportMetadataTMLBatchedRequestMetadataTypeEnum;
    /**
    * Indicates the position within the complete set from where the API should begin returning objects.
    */
    'batch_offset'?: number;
    /**
    * Determines the number of objects or items to be retrieved in a single request.
    */
    'batch_size'?: number;
    /**
    * TML EDOC content format.
    */
    'edoc_format'?: ExportMetadataTMLBatchedRequestEdocFormatEnum;
    /**
    * Indicates whether to export dependent metadata objects of specified metadata objects.
    */
    'export_dependent'?: boolean | null;
    /**
    * Indicates whether to export is happening from all orgs context.
    */
    'all_orgs_override'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExportMetadataTMLBatchedRequestMetadataTypeEnum = "USER" | "USER_GROUP" | "ROLE";
type ExportMetadataTMLBatchedRequestEdocFormatEnum = "JSON" | "YAML";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Flags to specify additional options for export.    Version: 10.5.0.cl or later
*/
declare class ExportMetadataTMLRequestExportOptions {
    /**
    * Boolean Flag to whether to export user_defined_id of referenced object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'export_with_reference_object_id'?: boolean | null;
    /**
    * Boolean flag to whether to export guid of the object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_guid'?: boolean | null;
    /**
    * Boolean flag to whether to export user_defined_id of the object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_object_id'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* MetadataType InputType used in Export MetadataType API
*/
declare class ExportMetadataTypeInput {
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: ExportMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExportMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "CONNECTION" | "CUSTOM_ACTION" | "USER" | "USER_GROUP" | "ROLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ExportMetadataTMLRequest {
    /**
    * Metadata objects.
    */
    'metadata': Array<ExportMetadataTypeInput>;
    /**
    * Indicates whether to export associated metadata objects of specified metadata objects.
    */
    'export_associated'?: boolean | null;
    /**
    * Adds FQNs of the referenced objects. For example, if you are exporting a Liveboard and its associated objects, the API returns the Liveboard TML data with the FQNs of the referenced worksheet. If the exported TML data includes FQNs, you don\'t need to manually add FQNs of the referenced objects during TML import.
    */
    'export_fqn'?: boolean | null;
    /**
    * TML EDOC content format.  **Note: exporting in YAML format currently requires manual formatting of the output. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
    */
    'edoc_format'?: ExportMetadataTMLRequestEdocFormatEnum;
    /**
    * Indicates whether to export worksheet TML in DEFAULT or V1 or V2 version.
    */
    'export_schema_version'?: ExportMetadataTMLRequestExportSchemaVersionEnum;
    /**
    * Indicates whether to export table while exporting connection.
    */
    'export_dependent'?: boolean | null;
    /**
    * Indicates whether to export connection as dependent while exporting table/worksheet/answer/liveboard. This will only be active when export_associated is true.
    */
    'export_connection_as_dependent'?: boolean | null;
    /**
    * Indicates whether to export is happening from all orgs context.
    */
    'all_orgs_override'?: boolean | null;
    'export_options'?: ExportMetadataTMLRequestExportOptions;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ExportMetadataTMLRequestEdocFormatEnum = "JSON" | "YAML";
type ExportMetadataTMLRequestExportSchemaVersionEnum = "DEFAULT" | "V1" | "V2";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Flags to specify additional options for export. This will only be active when UserDefinedId in TML is enabled.
*/
declare class ExportOptions {
    /**
    * Boolean Flag to whether to export user_defined_id of referenced object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'export_with_reference_object_id'?: boolean | null;
    /**
    * Boolean flag to whether to export guid of the object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_guid'?: boolean | null;
    /**
    * Boolean flag to whether to export user_defined_id of the object. This will only be respected when UserDefinedId in TML is enabled.
    */
    'include_object_id'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FavoriteMetadataItem {
    /**
    * Unique ID of the metadata object.
    */
    'id': string;
    /**
    * name of the metadata object.
    */
    'name': string;
    /**
    *   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type': FavoriteMetadataItemTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FavoriteMetadataItemTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Favorite object options.
*/
declare class FavoriteObjectOptionsInput {
    /**
    * Includes objects marked as favorite for the specified users.
    */
    'include'?: boolean | null;
    /**
    * Unique ID or name of the users. If not specified, the favorite objects of current logged in user are returned.
    */
    'user_identifiers'?: Array<string> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchAnswerDataRequest {
    /**
    * GUID or name of the Answer.
    */
    'metadata_identifier': string;
    /**
    * JSON output in compact or full format. The FULL option is available in 9.12.5.cl or later.
    */
    'data_format'?: FetchAnswerDataRequestDataFormatEnum;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records to include in a batch.
    */
    'record_size'?: number;
    /**
    * JSON object with representing filter condition to apply filters at runtime. For example, <code> {\"col1\": \"item type\", \"op1\": \"EQ\", \"val1\": \"Bags\"} </code>. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort data at runtime. For example, <code> {\"sortCol1\": \"sales\", \"asc1\": true} </code>. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
    */
    'runtime_sort'?: any;
    /**
    * JSON object for setting values of parameters at runtime. For example, <code> {\"param1\": \"Double List Param\", \"paramVal1\": 0.5}</code>. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FetchAnswerDataRequestDataFormatEnum = "FULL" | "COMPACT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchAnswerSqlQueryRequest {
    /**
    * ID or name of an Answer.
    */
    'metadata_identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchAsyncImportTaskStatusRequest {
    /**
    * List of task IDs to fetch status for.
    */
    'task_ids'?: Array<string>;
    /**
    * List of task statuses to filter on. Valid values: [IN_QUEUE, IN_PROGRESS, COMPLETED, FAILED]
    */
    'task_status'?: Array<FetchAsyncImportTaskStatusRequestTaskStatusEnum>;
    /**
    * Author GUID or name of async import tasks to filter on.
    */
    'author_identifier'?: string;
    /**
    * The offset point, starting from where the task status should be included in the response.
    */
    'record_offset'?: number;
    /**
    * The number of task statuses that should be included in the response starting from offset position.
    */
    'record_size'?: number;
    /**
    * Boolean flag to specify whether to include import response in the task status objects.
    */
    'include_import_response'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FetchAsyncImportTaskStatusRequestTaskStatusEnum = "COMPLETED" | "IN_QUEUE" | "IN_PROGRESS" | "FAILED";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchConnectionDiffStatusResponse {
    /**
    * Status of the connection diff.
    */
    'status'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchLiveboardDataRequest {
    /**
    * GUID or name of the Liveboard.
    */
    'metadata_identifier': string;
    /**
    * GUIDs or names of the visualizations on the Liveboard.
    */
    'visualization_identifiers'?: Array<string>;
    /**
    * Transient content of the Liveboard.
    */
    'transient_content'?: string;
    /**
    * JSON output in compact or full format. The FULL option is available in 9.12.5.cl or later.
    */
    'data_format'?: FetchLiveboardDataRequestDataFormatEnum;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records to include in a batch.
    */
    'record_size'?: number;
    /**
    * JSON object with representing filter condition to apply filters at runtime. For example, <code> {\"col1\": \"item type\", \"op1\": \"EQ\", \"val1\": \"Bags\"} </code>. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort data at runtime. For example, <code> {\"sortCol1\": \"sales\", \"asc1\": true} </code>. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
    */
    'runtime_sort'?: any;
    /**
    * JSON object for setting values of parameters at runtime. For example, <code> {\"param1\": \"Double List Param\", \"paramVal1\": 0.5}</code>. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FetchLiveboardDataRequestDataFormatEnum = "FULL" | "COMPACT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchLiveboardSqlQueryRequest {
    /**
    * ID or name of the Liveboard.
    */
    'metadata_identifier': string;
    /**
    * Unique ID or name of visualizations.
    */
    'visualization_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class FetchLogsRequest {
    /**
    * Name of the log type
    */
    'log_type': FetchLogsRequestLogTypeEnum;
    /**
    * Start time in EPOCH format
    */
    'start_epoch_time_in_millis'?: number;
    /**
    * End time in EPOCH format
    */
    'end_epoch_time_in_millis'?: number;
    /**
    * Fetch all the logs. This is available from 9.10.5.cl
    */
    'get_all_logs'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FetchLogsRequestLogTypeEnum = "SECURITY_AUDIT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* MetadataType InputType used in Permission API\'s
*/
declare class PermissionsMetadataTypeInput {
    /**
    *   Type of metadata object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: PermissionsMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type PermissionsMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PrincipalsInput {
    /**
    * Unique ID or name of the principal object such as a user or group.
    */
    'identifier': string;
    /**
    * Principal type.
    */
    'type'?: PrincipalsInputTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type PrincipalsInputTypeEnum = "USER" | "USER_GROUP";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class FetchPermissionsOfPrincipalsRequest {
    /**
    * GUID or name of the user or group.
    */
    'principals': Array<PrincipalsInput>;
    /**
    * Metadata objects for which you want to fetch permission details. If not specified, the API returns permission details for all metadata objects that the specified users and groups can access.
    */
    'metadata'?: Array<PermissionsMetadataTypeInput>;
    /**
    * The starting record number from where the records should be included for each metadata type.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included for each metadata type.
    */
    'record_size'?: number;
    /**
    * When no metadata objects input is passed, metadata objects of this type are fetched.
    */
    'default_metadata_type'?: FetchPermissionsOfPrincipalsRequestDefaultMetadataTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FetchPermissionsOfPrincipalsRequestDefaultMetadataTypeEnum = "ALL" | "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class FetchPermissionsOnMetadataRequest {
    /**
    * GUID or name of the metadata object.
    */
    'metadata': Array<PermissionsMetadataTypeInput>;
    /**
    * User or group objects for which you want to fetch permissions. If not specified, the API returns all users and groups that can access the specified metadata objects.
    */
    'principals'?: Array<PrincipalsInput>;
    /**
    * Indicates whether to fetch permissions of dependent metadata objects.
    */
    'include_dependent_objects'?: boolean | null;
    /**
    * The starting record number from where the records should be included for each metadata type.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included for each metadata type.
    */
    'record_size'?: number;
    /**
    * <div>Version: 10.3.0.cl or later </div>  Specifies the type of permission. Valid values are:     EFFECTIVE - If the user permission to the metadata objects is granted by the privileges assigned to the groups to which they belong.     DEFINED - If a user or user group received access to metadata objects via object sharing by another user.
    */
    'permission_type'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Filter Rules to be applied on Objects.
*/
declare class FilterRules {
    /**
    * The name of the column to apply the filter on.
    */
    'column_name': string;
    /**
    * The operator to use for filtering. Example: EQ (equals), GT(greater than), etc.
    */
    'operator': FilterRulesOperatorEnum;
    /**
    * The values to filter on. To get all records, use TS_WILDCARD_ALL as values.
    */
    'values': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type FilterRulesOperatorEnum = "EQ" | "NE" | "LT" | "LE" | "GT" | "GE" | "IN" | "BW" | "CONTAINS" | "BEGINS_WITH" | "ENDS_WITH" | "BW_INC" | "BW_INC_MIN" | "BW_INC_MAX" | "LIKE" | "NOT_IN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ForceLogoutUsersRequest {
    /**
    * GUID or name of the users for force logging out their sessions.
    */
    'user_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Configuration of schedule with cron expression
*/
declare class Frequency {
    'cron_expression': CronExpression;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Configuration of schedule with cron expression
*/
declare class FrequencyInput {
    'cron_expression': CronExpressionInput;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class GenericInfo {
    'id'?: string | null;
    'name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ImportEPackAsyncTaskStatus {
    /**
    * GUID of tenant from which the task is initiated.
    */
    'tenant_id'?: string | null;
    /**
    * Organisation ID of the user who initiated the task.
    */
    'org_id'?: number | null;
    /**
    * Unique identifier for the task.
    */
    'task_id'?: string | null;
    /**
    * Name of the task.
    */
    'task_name'?: string | null;
    /**
    * Response of imported objects so far.
    */
    'import_response'?: any | null;
    /**
    * Current status of the task.
    */
    'task_status'?: ImportEPackAsyncTaskStatusTaskStatusEnum | null;
    /**
    * ID of the user who initiated the task.
    */
    'author_id'?: string | null;
    /**
    * Policy used for the import task.
    */
    'import_policy'?: ImportEPackAsyncTaskStatusImportPolicyEnum | null;
    /**
    * Time when the task was created (in ms since epoch).
    */
    'created_at'?: number | null;
    /**
    * Time when the task started (in ms since epoch).
    */
    'in_progress_at'?: number | null;
    /**
    * Time when the task was completed (in ms since epoch).
    */
    'completed_at'?: number | null;
    /**
    * Total number of objects to process.
    */
    'total_object_count'?: number | null;
    /**
    * Number of objects processed so far.
    */
    'object_processed_count'?: number | null;
    /**
    * Last time the task status was updated (in ms since epoch).
    */
    'modified_at'?: number | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ImportEPackAsyncTaskStatusTaskStatusEnum = "COMPLETED" | "IN_QUEUE" | "IN_PROGRESS" | "FAILED";
type ImportEPackAsyncTaskStatusImportPolicyEnum = "PARTIAL" | "ALL_OR_NONE" | "VALIDATE_ONLY" | "PARTIAL_OBJECT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class GetAsyncImportStatusResponse {
    /**
    * List of task statuses.
    */
    'status_list'?: Array<ImportEPackAsyncTaskStatus> | null;
    /**
    * Indicates whether there are more task statuses to fetch.
    */
    'last_batch'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Groups objects.
*/
declare class GroupObject {
    'identifier'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Filter Rules to be applied on Objects.
*/
declare class ParameterValues {
    /**
    * The name of the column to apply the filter on.
    */
    'name': string;
    /**
    * The values to filter on. Only single value is supported currently.
    */
    'values': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Objects on which the filter rules and parameters values should be applied to
*/
declare class TokenAccessScopeObject {
    /**
    *   Type of object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: TokenAccessScopeObjectTypeEnum | null;
    /**
    * Unique name/id of the object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type TokenAccessScopeObjectTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class GetCustomAccessTokenRequest {
    /**
    * Username of the ThoughtSpot user. The username is stored in the `name` attribute of the user object.
    */
    'username': string;
    /**
    * Password of the user account
    */
    'password'?: string;
    /**
    * The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled.
    */
    'secret_key'?: string;
    /**
    * Token validity duration in seconds
    */
    'validity_time_in_sec'?: number;
    /**
    * ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session.
    */
    'org_identifier'?: string;
    /**
    * Indicates whether the specified attributes should be persisted or not.
    */
    'persist_option': GetCustomAccessTokenRequestPersistOptionEnum;
    /**
    * Filter rules.
    */
    'filter_rules'?: Array<FilterRules>;
    /**
    * Parameter values.
    */
    'parameter_values'?: Array<ParameterValues>;
    /**
    * Objects on which the filter rules and parameters values should be applied to
    */
    'objects'?: Array<TokenAccessScopeObject>;
    /**
    * (just-in-time (JIT) provisioning)Email address of the user. Specify this attribute when creating a new user.
    */
    'email'?: string;
    /**
    * (just-in-time (JIT) provisioning) Indicates display name of the user. Specify this attribute when creating a new user.
    */
    'display_name'?: string;
    /**
    * (just-in-time (JIT) provisioning) ID or name of the groups to which the newly created user belongs. Specify this attribute when creating a new user.
    */
    'groups'?: Array<GroupObject>;
    /**
    *    Creates a new user if the specified username does not exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.     Version: 10.5.0.cl or later
    */
    'auto_create'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type GetCustomAccessTokenRequestPersistOptionEnum = "APPEND" | "NONE" | "REPLACE" | "RESET";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Objects to apply the User_Object.
*/
declare class UserObject {
    /**
    *   Type of object.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: UserObjectTypeEnum | null;
    /**
    * Unique name/id of the object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UserObjectTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Objects to apply the Runtime_Filters.
*/
declare class RuntimeFilters {
    /**
    * The column name to apply filter.
    */
    'column_name': string;
    /**
    * Value of the filters.
    */
    'values': Array<string>;
    /**
    * Operator value. Example: EQ
    */
    'operator': RuntimeFiltersOperatorEnum;
    /**
    * Flag to persist the runtime filters.    Version: 9.12.0.cl or later
    */
    'persist'?: boolean | null;
    /**
    * Object to apply the runtime filter.
    */
    'objects'?: Array<UserObject> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type RuntimeFiltersOperatorEnum = "EQ" | "NE" | "LT" | "LE" | "GT" | "GE" | "IN" | "BW" | "CONTAINS" | "BEGINS_WITH" | "ENDS_WITH" | "BW_INC" | "BW_INC_MIN" | "BW_INC_MAX" | "LIKE" | "NOT_IN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Objects to apply the Runtime_Parameters.
*/
declare class RuntimeParameters {
    /**
    * The name of the parameter.
    */
    'name': string;
    /**
    * The array of values.
    */
    'values': Array<string>;
    /**
    * Flag to persist the parameters.    Version: 9.12.0.cl or later
    */
    'persist'?: boolean | null;
    /**
    * Object to apply the runtime parameter.
    */
    'objects'?: Array<UserObject> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Objects to apply the Runtime_Sorts.
*/
declare class RuntimeSorts {
    /**
    * The column name to apply filter.
    */
    'column_name'?: string | null;
    /**
    * Order for the sort.
    */
    'order'?: RuntimeSortsOrderEnum | null;
    /**
    * Flag to persist the runtime sorts.    Version: 9.12.0.cl or later
    */
    'persist'?: boolean | null;
    /**
    * Object to apply the runtime sort.
    */
    'objects'?: Array<UserObject> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type RuntimeSortsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* <div>Deprecated: 10.4.0.cl and later </div>  Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).
*/
declare class GetObjectAccessTokenRequestUserParameters {
    'objects'?: Array<UserObject> | null;
    /**
    * Objects to apply the User_Runtime_Filters.  Examples to set the `runtime_filters` : ```json { \"column_name\": \"Color\", \"operator\": \"EQ\", \"values\": [\"red\"], \"persist\": false } ```
    */
    'runtime_filters'?: Array<RuntimeFilters> | null;
    /**
    * Objects to apply the User_Runtime_Sorts.  Examples to set the `runtime_sorts` : ```json { \"column_name\": \"Color\", \"order\": \"ASC\", \"persist\": false } ```
    */
    'runtime_sorts'?: Array<RuntimeSorts> | null;
    /**
    * Objects to apply the Runtime_Parameters.  Examples to set the `parameters` : ```json { \"name\": \"Color\", \"values\": [\"Blue\"], \"persist\": false } ```
    */
    'parameters'?: Array<RuntimeParameters> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class GetFullAccessTokenRequest {
    /**
    * Username of the ThoughtSpot user. The username is stored in the `name` attribute of the user object.
    */
    'username': string;
    /**
    * Password of the user account
    */
    'password'?: string;
    /**
    * The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled.
    */
    'secret_key'?: string;
    /**
    * Token validity duration in seconds
    */
    'validity_time_in_sec'?: number;
    /**
    * ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session.
    */
    'org_id'?: number;
    /**
    * Email address of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning).
    */
    'email'?: string;
    /**
    * Indicates display name of the user. Use this parameter to provision a user just-in-time (JIT).
    */
    'display_name'?: string;
    /**
    *    Creates a new user if the specified username does not already exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.
    */
    'auto_create'?: boolean | null;
    /**
    * ID or name of the groups to which the newly created user belongs. Use this parameter to provision a user just-in-time (JIT).
    */
    'group_identifiers'?: Array<string>;
    'user_parameters'?: GetObjectAccessTokenRequestUserParameters;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class GetObjectAccessTokenRequest {
    /**
    * Username of the ThoughtSpot user. The username is stored in the `name` attribute of the user object.
    */
    'username': string;
    /**
    * GUID of the ThoughtSpot metadata object that the user can access. The bearer will only have access to the object specified in the API request.
    */
    'object_id'?: string;
    /**
    * Password of the user account
    */
    'password'?: string;
    /**
    * The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates a secret key when Trusted authentication is enabled.
    */
    'secret_key'?: string;
    /**
    * Token validity duration in seconds
    */
    'validity_time_in_sec'?: number;
    /**
    * ID of the Org context to log in to. If the Org ID is not specified and secret key is provided then user will be logged into the org corresponding to the secret key, and if secret key is not provided then user will be logged in to the Org context of their previous login session.
    */
    'org_id'?: number;
    /**
    * Email address of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning).
    */
    'email'?: string;
    /**
    * Display name of the user. Specify this attribute when creating a new user (just-in-time (JIT) provisioning).
    */
    'display_name'?: string;
    /**
    *    Creates a new user if the specified username does not exist in ThoughtSpot. To provision a user just-in-time (JIT), set this attribute to true.      Note: For JIT provisioning of a user, the secret_key is required.
    */
    'auto_create'?: boolean | null;
    /**
    * Unique ID or name of the groups to which you want to assign the new user. You can specify this attribute to dynamically assign privileges during just-in-time (JIT) provisioning.
    */
    'group_identifiers'?: Array<string>;
    'user_parameters'?: GetObjectAccessTokenRequestUserParameters;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class GetTokenResponse {
    /**
    * Bearer auth token.
    */
    'token': string;
    /**
    * Token creation time in milliseconds.
    */
    'creation_time_in_millis': number;
    /**
    * Token expiration time in milliseconds.
    */
    'expiration_time_in_millis': number;
    /**
    * Username to whom the token is issued.
    */
    'valid_for_user_id': string;
    /**
    * Unique identifier of the user to whom the token is issued.
    */
    'valid_for_username': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class GroupsImportListInput {
    /**
    * Unique display name of the group.
    */
    'display_name': string;
    /**
    * Unique ID or name of the group.
    */
    'group_identifier': string;
    /**
    * Unique ID of Liveboards that will be assigned as default Liveboards to the users in the group.
    */
    'default_liveboard_identifiers'?: Array<string> | null;
    /**
    * Description of the group.
    */
    'description'?: string | null;
    /**
    * Privileges that will be assigned to the group.
    */
    'privileges'?: Array<GroupsImportListInputPrivilegesEnum> | null;
    /**
    * Unique ID or name of the sub-groups to add to the group.
    */
    'sub_group_identifiers'?: Array<string> | null;
    /**
    * Type of the group.
    */
    'type'?: GroupsImportListInputTypeEnum | null;
    /**
    * Unique ID or name of the users to assign to the group.
    */
    'user_identifiers'?: Array<string> | null;
    /**
    * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects.
    */
    'visibility'?: GroupsImportListInputVisibilityEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type GroupsImportListInputPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type GroupsImportListInputTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
type GroupsImportListInputVisibilityEnum = "SHARABLE" | "NON_SHARABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ImportMetadataTMLAsyncRequest {
    /**
    * Details of TML objects.
    */
    'metadata_tmls': Array<string>;
    /**
    * If selected, creates TML objects with new GUIDs.
    */
    'create_new'?: boolean | null;
    /**
    * If import is happening from all orgs context.
    */
    'all_orgs_context'?: boolean | null;
    /**
    * Boolean to indicate if the CDW validation for table imports should be skipped.
    */
    'skip_cdw_validation_for_tables'?: boolean | null;
    /**
    * <div>Version: 10.5.0.cl or later </div>  Policy to be followed while importing the TML. Valid values are [PARTIAL_OBJECT, PARTIAL, VALIDATE_ONLY, ALL_OR_NONE]
    */
    'import_policy'?: ImportMetadataTMLAsyncRequestImportPolicyEnum;
    /**
    * <div>Version: 10.5.0.cl or later </div>  Boolean to indicate if the large metadata validation should be enabled.
    */
    'enable_large_metadata_validation'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ImportMetadataTMLAsyncRequestImportPolicyEnum = "PARTIAL" | "ALL_OR_NONE" | "VALIDATE_ONLY" | "PARTIAL_OBJECT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ImportMetadataTMLRequest {
    /**
    * Details of TML objects.  **Note: importing TML in YAML format, when coming directly from our Playground, is currently requires manual formatting. For more details on the workaround, please click [here](https://developers.thoughtspot.com/docs/known-issues#_version_9_12_0_cl)**
    */
    'metadata_tmls': Array<string>;
    /**
    * Specifies the import policy for the TML import.
    */
    'import_policy'?: ImportMetadataTMLRequestImportPolicyEnum;
    /**
    * If selected, creates TML objects with new GUIDs.
    */
    'create_new'?: boolean | null;
    /**
    * If import is happening from all orgs context.
    */
    'all_orgs_context'?: boolean | null;
    /**
    * Boolean to indicate if the CDW validation for table imports should be skipped.
    */
    'skip_cdw_validation_for_tables'?: boolean | null;
    /**
    * <div>Version: 10.5.0.cl or later </div>  Boolean to indicate if the large metadata validation should be enabled.
    */
    'enable_large_metadata_validation'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ImportMetadataTMLRequestImportPolicyEnum = "PARTIAL" | "ALL_OR_NONE" | "VALIDATE_ONLY" | "PARTIAL_OBJECT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ImportUser {
    /**
    * Unique ID or name of the user.
    */
    'user_identifier': string;
    /**
    * Display name of the user.
    */
    'display_name': string;
    /**
    * Password of the user.
    */
    'password'?: string | null;
    /**
    * Type of the user account.
    */
    'account_type'?: ImportUserAccountTypeEnum | null;
    /**
    * Status of the user account.
    */
    'account_status'?: ImportUserAccountStatusEnum | null;
    /**
    * Email address of the user.
    */
    'email'?: string | null;
    /**
    * ID or name of the Orgs to which the user belongs.
    */
    'org_identifiers'?: Array<string> | null;
    /**
    * ID or name of the groups to which the user belongs.
    */
    'group_identifiers'?: Array<string> | null;
    /**
    * Visibility of the users. The SHARABLE property makes a user visible to other users and group, who can share objects with the user.
    */
    'visibility'?: ImportUserVisibilityEnum | null;
    /**
    * Notify user when other users or groups share metadata objects
    */
    'notify_on_share'?: boolean | null;
    /**
    * Show or hide the new user onboarding walkthroughs
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * Revisit the new user onboarding walkthroughs
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * Unique ID or name of the default Liveboard assigned to the user.
    */
    'home_liveboard_identifier'?: string | null;
    /**
    * Metadata objects to add to the user\'s favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ImportUserAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type ImportUserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" | "SUSPENDED";
type ImportUserVisibilityEnum = "SHARABLE" | "NON_SHARABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ImportUserGroupsRequest {
    /**
    * Details of groups which are to be imported
    */
    'groups'?: Array<GroupsImportListInput>;
    /**
    * If set to true, removes groups that are not specified in the API request.
    */
    'delete_unspecified_groups'?: boolean | null;
    /**
    * If true, the API performs a test operation and returns user IDs whose data will be edited after the import.
    */
    'dry_run'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UserGroup {
    'id'?: string | null;
    'name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ImportUserGroupsResponse {
    /**
    * The groups which are added into the system.
    */
    'groups_added': Array<UserGroup>;
    /**
    * The groups which are deleted from the system.
    */
    'groups_deleted': Array<UserGroup>;
    /**
    * The groups which are updated in the system.
    */
    'groups_updated': Array<UserGroup>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ImportUserType {
    /**
    * Unique identifier of the user.
    */
    'id'?: string | null;
    /**
    * Name of the user.
    */
    'name': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ImportUsersRequest {
    /**
    * List of users needs to be imported.
    */
    'users': Array<ImportUser>;
    /**
    * The default password to assign to users if they do not have a password assigned in ThoughtSpot.
    */
    'default_password'?: string;
    /**
    * If true, the API performs a test operation and returns user IDs whose data will be edited after the import.
    */
    'dry_run'?: boolean | null;
    /**
    * If set to true, removes the users that are not specified in the API request.
    */
    'delete_unspecified_users'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ImportUsersResponse {
    'users_added'?: Array<ImportUserType> | null;
    'users_updated'?: Array<ImportUserType> | null;
    'users_deleted'?: Array<ImportUserType> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Metadata objects.
*/
declare class JWTMetadataObject {
    'identifier'?: string | null;
    'type'?: JWTMetadataObjectTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type JWTMetadataObjectTypeEnum = "LIVEBOARD" | "ANSWER";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* List of runtime parameters need to set during the session.
*/
declare class JWTParameter {
    /**
    * Runtime filter parameter type in JWT.
    */
    'runtime_filter'?: any | null;
    /**
    * Runtime sort parameter type in JWT.
    */
    'runtime_sort'?: any | null;
    /**
    * Runtime param override type in JWT.
    */
    'runtime_param_override'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class JWTUserOptionsParametersInner {
    /**
    * Runtime filter parameter type in JWT.
    */
    'runtime_filter'?: any;
    /**
    * Runtime sort parameter type in JWT.
    */
    'runtime_sort'?: any;
    /**
    * Runtime param override type in JWT.
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* JWT user options to create a JWT token given the payload.   *Deprecated in 9.12.0.cl. Use user_parameters instead.*
*/
declare class JWTUserOptions {
    'parameters'?: Array<JWTUserOptionsParametersInner>;
    'metadata'?: Array<JWTMetadataObject> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* JWT user options to create a JWT token given the payload.   *Deprecated in 9.12.0.cl. Use user_parameters instead.*
*/
declare class JWTUserOptionsFull {
    'parameters'?: Array<JWTParameter> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class LiveboardContent {
    /**
    * Total available data row count.
    */
    'available_data_row_count': number;
    /**
    * Name of the columns.
    */
    'column_names': Array<string>;
    /**
    * Rows of data set.
    */
    'data_rows': Array<any>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset': number;
    /**
    * The number of records that should be included.
    */
    'record_size': number;
    /**
    * Total returned data row count.
    */
    'returned_data_row_count': number;
    /**
    * Sampling ratio (0 to 1). If the query was sampled, it is the ratio of keys returned in the data set to the total number of keys expected in the query. If the value is 1.0, this means that the complete result is returned.
    */
    'sampling_ratio': number;
    /**
    * Unique ID of the visualization.
    */
    'visualization_id'?: string | null;
    /**
    * Name of the visualization.
    */
    'visualization_name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class LiveboardDataResponse {
    /**
    * The unique identifier of the object
    */
    'metadata_id': string;
    /**
    * Name of the metadata object
    */
    'metadata_name': string;
    /**
    * Data content of metadata objects
    */
    'contents': Array<LiveboardContent>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options to specify details of Liveboard.
*/
declare class LiveboardOptions {
    /**
    * Unique ID or name of visualizations.
    */
    'visualization_identifiers': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options to specify details of Liveboard.
*/
declare class LiveboardOptionsInput {
    /**
    * Unique ID or name of visualizations.
    */
    'visualization_identifiers': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class LogResponse {
    /**
    * Date timestamp of the log entry
    */
    'date': string;
    /**
    * Log data
    */
    'log': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class LoginRequest {
    /**
    * Username of the ThoughtSpot user
    */
    'username'?: string;
    /**
    * Password of the user account
    */
    'password'?: string;
    /**
    * ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session.
    */
    'org_identifier'?: string;
    /**
    * A flag to remember the user session. When set to true, a session cookie is created and used in subsequent API requests.
    */
    'remember_me'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class MetadataAssociationItem {
    'action_config': ActionConfig;
    /**
    * Unique ID or name of the metadata.
    */
    'identifier': string;
    /**
    *   Type of metadata.     Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class MetadataInput {
    'identifier'?: string | null;
    'type'?: MetadataInputTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type MetadataInputTypeEnum = "LIVEBOARD";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class MetadataListItemInput {
    /**
    * Unique ID or name of the metadata.
    */
    'identifier'?: string | null;
    /**
    * CustomObjectId of the metadata.
    */
    'custom_identifier'?: string | null;
    /**
    * A pattern to match the case-insensitive name of the metadata object. User % for a wildcard match.
    */
    'name_pattern'?: string | null;
    /**
    * Type of metadata. Required if the name of the object is set as identifier. This attribute is optional when the object GUID is specified as identifier. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view. 5. CONNECTION for creating or modify data connections. 6. TAG for tag objects. 7. USER for user objects. 8. USER_GROUP for group objects. 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values 10. INSIGHT_SPEC for SpotIQ objects
    */
    'type'?: MetadataListItemInputTypeEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type MetadataListItemInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP" | "INSIGHT_SPEC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class MetadataResponse {
    'name'?: string | null;
    'id': string;
    'type': MetadataResponseTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type MetadataResponseTypeEnum = "LIVEBOARD";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Metadata Search Response Object.
*/
declare class MetadataSearchResponse {
    /**
    * Unique identifier of the metadata.
    */
    'metadata_id'?: string | null;
    /**
    * Name of the metadata.
    */
    'metadata_name'?: string | null;
    /**
    * Type of the metadata.
    */
    'metadata_type': MetadataSearchResponseMetadataTypeEnum;
    /**
    * Details of dependent objects of the metadata objects.
    */
    'dependent_objects'?: any | null;
    /**
    * Details of incomplete information of the metadata objects if any.
    */
    'incomplete_objects'?: Array<any> | null;
    /**
    * Complete details of the metadata objects.
    */
    'metadata_detail'?: any | null;
    /**
    * Header information of the metadata objects.
    */
    'metadata_header'?: any | null;
    /**
    * Visualization header information of the metadata objects.
    */
    'visualization_headers'?: Array<any> | null;
    /**
    * Stats of the metadata object. Includes views, favorites, last_accessed.
    */
    'stats'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type MetadataSearchResponseMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP" | "INSIGHT_SPEC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options.
*/
declare class MetadataSearchSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: MetadataSearchSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: MetadataSearchSortOptionsOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type MetadataSearchSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "VIEWS" | "FAVORITES" | "LAST_ACCESSED";
type MetadataSearchSortOptionsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* The object representation with ID and Name.
*/
declare class ObjectIDAndName {
    /**
    * The unique identifier of the object.
    */
    'id'?: string | null;
    /**
    * Name of the object.
    */
    'name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* The current Org context of the user.
*/
declare class Org {
    /**
    * The ID of the object.
    */
    'id': number;
    /**
    * Name of the object.
    */
    'name': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class OrgResponse {
    /**
    * Unique identifier of the Org.
    */
    'id'?: number | null;
    /**
    * Name of the Org.
    */
    'name'?: string | null;
    /**
    * Status of the Org.
    */
    'status'?: OrgResponseStatusEnum | null;
    /**
    * Description of the Org.
    */
    'description'?: string | null;
    /**
    * Visibility of the Org.
    */
    'visibility'?: OrgResponseVisibilityEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type OrgResponseStatusEnum = "ACTIVE" | "IN_ACTIVE";
type OrgResponseVisibilityEnum = "SHOW" | "HIDDEN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options for PDF export.
*/
declare class PdfOptions {
    /**
    * Indicates whether to include complete Liveboard.
    */
    'complete_liveboard'?: boolean | null;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string | null;
    /**
    * Page size.
    */
    'page_size'?: PdfOptionsPageSizeEnum | null;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type PdfOptionsPageSizeEnum = "A4";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PdfOptionsInput {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page.
    */
    'include_page_number'?: boolean | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: PdfOptionsInputPageOrientationEnum | null;
    /**
    * Indicates whether to include only the first page of the tables.
    */
    'truncate_table'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type PdfOptionsInputPageOrientationEnum = "PORTRAIT" | "LANDSCAPE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Details of users or groups.
*/
declare class PermissionInput {
    'principal': PrincipalsInput;
    /**
    * Object share mode.
    */
    'share_mode': PermissionInputShareModeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type PermissionInputShareModeEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PermissionOfMetadataResponse {
    'metadata_permission_details'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PermissionOfPrincipalsResponse {
    'principal_permission_details'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PngOptionsInput {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class PrincipalsListItem {
    /**
    * Unique ID or name of the user or group.
    */
    'identifier': string;
    /**
    * Principal type. Valid values are
    */
    'type': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Recipient configuration which includes email address, ID or name of the users and groups.
*/
declare class RecipientDetails {
    /**
    * Emails of the recipients. Specify email address if the recipient is not a ThoughtSpot user.
    */
    'emails'?: Array<string> | null;
    /**
    * List of user or groups to subscribe for the scheduled job notifications.
    */
    'principals'?: Array<PrincipalsListItem> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Recipients of the scheduled job notification.
*/
declare class RecipientDetailsInput {
    /**
    * Emails of the recipients.
    */
    'emails'?: Array<string> | null;
    /**
    * User or groups to be set as recipients of the schedule notifications.
    */
    'principals'?: Array<PrincipalsListItemInput> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class RepoConfigObject {
    /**
    * Remote repository URL configured
    */
    'repository_url'?: string | null;
    /**
    * Username to authenticate connection to the version control system
    */
    'username'?: string | null;
    /**
    * Name of the remote branch where objects from this Thoughtspot instance will be versioned.
    */
    'commit_branch_name'?: string | null;
    /**
    * Branches that have been pulled in local repository
    */
    'branches'?: Array<string> | null;
    /**
    * Maintain mapping of guid for the deployment to an instance
    */
    'enable_guid_mapping'?: boolean | null;
    /**
    * Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.
    */
    'configuration_branch_name'?: string | null;
    'org'?: Org;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ResetUserPasswordRequest {
    /**
    * New password for the user.
    */
    'new_password': string;
    /**
    * GUID or name of the user.
    */
    'user_identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* The object representation with activation link.
*/
declare class ResponseActivationURL {
    /**
    * Activation link to activate the user.
    */
    'activation_link'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ResponseCopyObject {
    /**
    * The unique identifier of the object.
    */
    'metadata_id'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Custom action details
*/
declare class ResponseCustomAction {
    'action_details': ActionDetails;
    'default_action_config': DefaultActionConfig;
    /**
    * Unique Id of the custom action.
    */
    'id': string;
    /**
    * Metadata objects to assign the the custom action to.
    */
    'metadata_association'?: Array<MetadataAssociationItem> | null;
    /**
    * Unique name of the custom action.
    */
    'name': string;
    /**
    * Unique ID or name of the User groups which are associated with the custom action.
    */
    'user_groups'?: Array<ObjectIDAndName> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ResponseMessage {
    /**
    * Unique identifier of the generated response.
    */
    'session_identifier'?: string | null;
    /**
    * Generate number of the response.
    */
    'generation_number'?: number | null;
    /**
    * Type of the generated response.
    */
    'message_type': ResponseMessageMessageTypeEnum;
    /**
    * Generated visualization type.
    */
    'visualization_type'?: ResponseMessageVisualizationTypeEnum | null;
    /**
    * Tokens for the response.
    */
    'tokens'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ResponseMessageMessageTypeEnum = "TSAnswer";
type ResponseMessageVisualizationTypeEnum = "Chart" | "Table" | "Undefined";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Schedule run response object
*/
declare class ResponseScheduleRun {
    /**
    * GUID of the scheduled job.
    */
    'id': string;
    /**
    * Schedule run start time in milliseconds.
    */
    'start_time_in_millis': number;
    /**
    * Schedule run end time in milliseconds.
    */
    'end_time_in_millis': number;
    /**
    * Status of the schedule run.
    */
    'status': string;
    /**
    * Message details related to the schedule run.
    */
    'detail'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ResponseSchedule {
    'author': Author;
    /**
    * Schedule creation time in milliseconds.
    */
    'creation_time_in_millis': any;
    /**
    * Description of the job.
    */
    'description'?: string | null;
    /**
    * Export file format.
    */
    'file_format': string;
    'frequency': Frequency;
    /**
    * GUID of the scheduled job.
    */
    'id': string;
    'liveboard_options'?: LiveboardOptions;
    'metadata': MetadataResponse;
    /**
    * Name of the scheduled job.
    */
    'name': string;
    'pdf_options'?: PdfOptions;
    'recipient_details': RecipientDetails;
    /**
    * Status of the job
    */
    'status'?: string | null;
    /**
    * Time zone
    */
    'time_zone': string;
    /**
    * Schedule runs history records.
    */
    'history_runs'?: Array<ResponseScheduleRun> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class RevertCommitRequest {
    /**
    * Metadata objects.
    */
    'metadata'?: Array<MetadataObject>;
    /**
    *    Name of the branch where the reverted version should be committed      Note: If no branch_name is specified, then the commit_branch_name will be considered.
    */
    'branch_name'?: string;
    /**
    * Policy to apply when reverting a commit. Valid values: [ALL_OR_NONE, PARTIAL]
    */
    'revert_policy'?: RevertCommitRequestRevertPolicyEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type RevertCommitRequestRevertPolicyEnum = "ALL_OR_NONE" | "PARTIAL";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class RevertedMetadata {
    /**
    * Name of the file deployed
    */
    'file_name': string;
    /**
    * Name of the metadata object
    */
    'metadata_name': string;
    /**
    * Type of the metadata object
    */
    'metadata_type': string;
    /**
    * Indicates the status of deployment for the file
    */
    'status_code': string;
    /**
    * Any error or warning with the deployment
    */
    'status_message': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class RevertResponse {
    'committer'?: CommiterType;
    'author'?: AuthorType;
    /**
    * Comments associated with the commit
    */
    'comment'?: string | null;
    /**
    * Time at which the changes were committed.
    */
    'commit_time'?: string | null;
    /**
    * SHA id associated with the commit
    */
    'commit_id'?: string | null;
    /**
    * Branch where changes were committed
    */
    'branch'?: string | null;
    /**
    * Files that were pushed as part of this commit
    */
    'committed_files'?: Array<CommitFileType> | null;
    /**
    * Metadata of reverted file of this commit
    */
    'reverted_metadata'?: Array<RevertedMetadata> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class RevokeTokenRequest {
    'user_identifier'?: string;
    'token'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class RiseSetter {
    'field': string;
    'path': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class Role {
    /**
    * id of the role
    */
    'id'?: string | null;
    /**
    * name of the role
    */
    'name'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class RoleResponse {
    /**
    * Unique Id of the role.
    */
    'id': string;
    /**
    * Name of the role
    */
    'name': string;
    /**
    * Description of the role
    */
    'description': string;
    /**
    * number of groups assigned with this role
    */
    'groups_assigned_count'?: number | null;
    /**
    * Orgs in which role exists.
    */
    'orgs'?: Array<GenericInfo> | null;
    /**
    * Details of groups assigned with this role
    */
    'groups'?: Array<GenericInfo> | null;
    /**
    * Privileges granted to the role.
    */
    'privileges': Array<RoleResponsePrivilegesEnum>;
    /**
    * Permission details of the Role
    */
    'permission'?: RoleResponsePermissionEnum | null;
    /**
    * Unique identifier of author of the role.
    */
    'author_id'?: string | null;
    /**
    * Unique identifier of modifier of the role.
    */
    'modifier_id'?: string | null;
    /**
    * Creation time of the role in milliseconds.
    */
    'creation_time_in_millis'?: any | null;
    /**
    * Last modified time of the role in milliseconds.
    */
    'modification_time_in_millis'?: any | null;
    /**
    * Indicates whether the role is deleted.
    */
    'deleted'?: boolean | null;
    /**
    * Indicates whether the role is deprecated.
    */
    'deprecated'?: boolean | null;
    /**
    * Indicates whether the role is external.
    */
    'external'?: boolean | null;
    /**
    * Indicates whether the role is hidden.
    */
    'hidden'?: boolean | null;
    /**
    * Indicates whether the role is shared via connection
    */
    'shared_via_connection'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type RoleResponsePrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CAN_CREATE_CATALOG" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type RoleResponsePermissionEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* List of runtime parameters need to set during the session.
*/
declare class RuntimeFilter {
    /**
    * Runtime filter parameter type in JWT.
    */
    'runtime_filter'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* List of runtime parameters need to set during the session.
*/
declare class RuntimeParamOverride {
    /**
    * Runtime param override type in JWT.
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* List of runtime parameters need to set during the session.
*/
declare class RuntimeSort {
    /**
    * Runtime sort parameter type in JWT.
    */
    'runtime_sort'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ScheduleHistoryRunsOptionsInput {
    /**
    * Indicates whether to fetch history runs for the scheduled notification.
    */
    'include_history_runs'?: boolean | null;
    /**
    * Indicates the max number of records that can be fetched as past runs of any scheduled job.
    */
    'record_size'?: number | null;
    /**
    * Indicates the starting record number from where history runs records should be fetched.
    */
    'record_offset'?: number | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options for PDF export.
*/
declare class SchedulesPdfOptionsInput {
    /**
    * Indicates whether to include complete Liveboard.
    */
    'complete_liveboard'?: boolean | null;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string | null;
    /**
    * Page size.
    */
    'page_size'?: SchedulesPdfOptionsInputPageSizeEnum | null;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SchedulesPdfOptionsInputPageSizeEnum = "A4";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class Scope {
    /**
    * Object access scope type.
    */
    'access_type': string;
    /**
    * Unique identifier of the metadata.
    */
    'org_id'?: number | null;
    /**
    * Unique identifier of the Org.
    */
    'metadata_id'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SearchCommitsRequest {
    /**
    * Unique ID or name of the metadata.
    */
    'metadata_identifier': string;
    /**
    * Type of metadata.
    */
    'metadata_type'?: SearchCommitsRequestMetadataTypeEnum;
    /**
    *    Name of the branch from which commit history needs to be displayed.      Note: If no branch_name is specified, then commits will be returned for the default branch for this configuration.
    */
    'branch_name'?: string;
    /**
    *     Record offset point in the commit history to display the response.       Note: If no record offset is specified, the beginning of the record will be considered.
    */
    'record_offset'?: number;
    /**
    *     Number of history records from record offset point to be displayed in the response.       Note: If no record size is specified, then all the records will be considered.
    */
    'record_size'?: number;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchCommitsRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "CUSTOM_ACTION";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SearchConfigRequest {
    /**
    *    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\"OrgID1-or-Name1\", \"OrgID2-or-Name2\"]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later
    */
    'org_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options.
*/
declare class SearchConnectionRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SearchConnectionRequestSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SearchConnectionRequestSortOptionsOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchConnectionRequestSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "LAST_ACCESSED" | "SYNCED" | "VIEWS" | "USER_STATE" | "ROW_COUNT";
type SearchConnectionRequestSortOptionsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchConnectionRequest {
    /**
    * List of connections and name pattern
    */
    'connections'?: Array<ConnectionInput>;
    /**
    * Array of types of data warehouse defined for the connection.
    */
    'data_warehouse_types'?: Array<SearchConnectionRequestDataWarehouseTypesEnum>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    /**
    * Unique ID or name of tags.
    */
    'tag_identifiers'?: Array<string>;
    /**
    * Data warehouse object type.
    */
    'data_warehouse_object_type'?: SearchConnectionRequestDataWarehouseObjectTypeEnum;
    'sort_options'?: SearchConnectionRequestSortOptions;
    /**
    * Indicates whether to include complete details of the connection objects.
    */
    'include_details'?: boolean | null;
    /**
    * Configuration values. If empty we are fetching configuration from datasource based on given connection id. If required you can provide config details to fetch specific details. Example input: {}, {\"warehouse\":\"SMALL_WH\",\"database\":\"DEVELOPMENT\"}. This is only applicable when data_warehouse_object_type is selected.
    */
    'configuration'?: any;
    /**
    * List of authentication types to fetch data_ware_house_objects from external Data warehouse. This is only applicable when data_warehouse_object_type is selected.
    */
    'authentication_type'?: SearchConnectionRequestAuthenticationTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchConnectionRequestDataWarehouseTypesEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL" | "MODE" | "GOOGLE_SHEETS" | "FALCON" | "FALCON_ONPREM";
type SearchConnectionRequestDataWarehouseObjectTypeEnum = "DATABASE" | "SCHEMA" | "TABLE" | "COLUMN";
type SearchConnectionRequestAuthenticationTypeEnum = "SERVICE_ACCOUNT" | "OAUTH" | "IAM" | "EXTOAUTH" | "OAUTH_WITH_SERVICE_PRINCIPAL" | "PERSONAL_ACCESS_TOKEN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchConnectionResponse {
    /**
    * Unique ID of the connection.
    */
    'id': string;
    /**
    * Name of the connection.
    */
    'name': string;
    /**
    * Description of the connection.
    */
    'description'?: string | null;
    /**
    * Type of data warehouse.
    */
    'data_warehouse_type': SearchConnectionResponseDataWarehouseTypeEnum;
    'data_warehouse_objects'?: DataWarehouseObjects;
    /**
    * Details of the connection.
    */
    'details'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchConnectionResponseDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL" | "MODE" | "GOOGLE_SHEETS" | "FALCON" | "FALCON_ONPREM";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes if the custom action is available on all visualizations. By default, a custom action is added to all visualizations and Answers.
*/
declare class SearchCustomActionsRequestDefaultActionConfig {
    /**
    * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchCustomActionsRequest {
    /**
    * Name or ID of the custom action.
    */
    'custom_action_identifier'?: string;
    /**
    * A pattern to match case-insensitive name of the custom-action object.
    */
    'name_pattern'?: string;
    'default_action_config'?: SearchCustomActionsRequestDefaultActionConfig;
    /**
    * When set to true, returns the associated groups for a custom action.
    */
    'include_group_associations'?: boolean | null;
    /**
    * When set to true, returns the associated metadata for a custom action.
    */
    'include_metadata_associations'?: boolean | null;
    /**
    * Search with a given metadata identifier.
    */
    'metadata'?: Array<CustomActionMetadataTypeInput>;
    /**
    * Filter the action objects based on type
    */
    'type'?: SearchCustomActionsRequestTypeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchCustomActionsRequestTypeEnum = "CALLBACK" | "URL";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SearchDataRequest {
    /**
    * Query string with search tokens. For example, <code>[Sales][Region]</code>. See [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api)
    */
    'query_string': string;
    /**
    * GUID of the data source object, such as a Worksheet, View, or Table. You can find the GUID of a data object from the UI or via API. See [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_query) for more details.
    */
    'logical_table_identifier': string;
    /**
    * JSON output in compact or full format. The FULL option is available in 9.12.5.cl or later.
    */
    'data_format'?: SearchDataRequestDataFormatEnum;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records to include in a batch.
    */
    'record_size'?: number;
    /**
    * JSON object with representing filter condition to apply filters at runtime. For example, <code> {\"col1\": \"item type\", \"op1\": \"EQ\", \"val1\": \"Bags\"} </code>. You can add multiple keys by incrementing the number at the end, for example, col2, op2, val2, and col3, op3, val3. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_filters).
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort data at runtime. For example, <code> {\"sortCol1\": \"sales\", \"asc1\": true} </code>. You can add multiple keys by incrementing the number at the end, for example, sortCol1, asc2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_sort).
    */
    'runtime_sort'?: any;
    /**
    * JSON object for setting values of parameters at runtime. For example, <code> {\"param1\": \"Double List Param\", \"paramVal1\": 0.5}</code>. You can add multiple keys by incrementing the number at the end, for example, param2, paramVal2. For more information, see [API Documentation](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_parameters).
    */
    'runtime_param_override'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchDataRequestDataFormatEnum = "FULL" | "COMPACT";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Response format associated with the search data API.
*/
declare class SearchDataResponse {
    /**
    * Data content of metadata objects
    */
    'contents': Array<AnswerContent>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options to sort the API response by objects set as favorites for the logged-in user or the users specified in the API request.
*/
declare class SearchMetadataRequestFavoriteObjectOptions {
    /**
    * Includes objects marked as favorite for the specified users.
    */
    'include'?: boolean | null;
    /**
    * Unique ID or name of the users. If not specified, the favorite objects of current logged in user are returned.
    */
    'user_identifiers'?: Array<string> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options to filter metadata details.
*/
declare class SearchMetadataRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SearchMetadataRequestSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SearchMetadataRequestSortOptionsOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchMetadataRequestSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "VIEWS" | "FAVORITES" | "LAST_ACCESSED";
type SearchMetadataRequestSortOptionsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchMetadataRequest {
    /**
    * Metadata objects such as Liveboards, Answers, and Worksheets.
    */
    'metadata'?: Array<MetadataListItemInput>;
    /**
    * Object permission details to search by.
    */
    'permissions'?: Array<PermissionInput>;
    /**
    * GUID or name of user who created the metadata object.
    */
    'created_by_user_identifiers'?: Array<string>;
    /**
    * Version of the dependent table of the metadata objects like Worksheets.
    */
    'dependent_object_version'?: SearchMetadataRequestDependentObjectVersionEnum;
    /**
    * List of metadata objects to exclude from search.
    */
    'exclude_objects'?: Array<ExcludeMetadataListItemInput>;
    'favorite_object_options'?: SearchMetadataRequestFavoriteObjectOptions;
    /**
    * Includes system-generated metadata objects.
    */
    'include_auto_created_objects'?: boolean | null;
    /**
    * Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers.
    */
    'include_dependent_objects'?: boolean | null;
    /**
    * The maximum number of dependents to include per metadata object.
    */
    'dependent_objects_record_size'?: number;
    /**
    * Includes complete details of the metadata objects.
    */
    'include_details'?: boolean | null;
    /**
    * Includes headers of the metadata objects.
    */
    'include_headers'?: boolean | null;
    /**
    * Includes details of the hidden objects, such as a column in a worksheet or a table.
    */
    'include_hidden_objects'?: boolean | null;
    /**
    * Includes objects with incomplete metadata.
    */
    'include_incomplete_objects'?: boolean | null;
    /**
    * Includes visualization headers of the specified Liveboard object.
    */
    'include_visualization_headers'?: boolean | null;
    /**
    * If search assistance lessons are configured on a worksheet, the API returns the search assist data for Worksheet objects.
    */
    'include_worksheet_search_assist_data'?: boolean | null;
    /**
    * Includes ID or names of the users who modified the metadata object.
    */
    'modified_by_user_identifiers'?: Array<string>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: SearchMetadataRequestSortOptions;
    /**
    * Tags to filter metadata objects by
    */
    'tag_identifiers'?: Array<string>;
    /**
    * Indicates whether to include stats of the metadata objects.
    */
    'include_stats'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchMetadataRequestDependentObjectVersionEnum = "V1" | "V2";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SearchOrgsRequest {
    /**
    * ID or name of the Org
    */
    'org_identifier'?: string;
    /**
    * Description of the Org
    */
    'description'?: string;
    /**
    * Visibility of the Org
    */
    'visibility'?: SearchOrgsRequestVisibilityEnum;
    /**
    * Status of the Org
    */
    'status'?: SearchOrgsRequestStatusEnum;
    /**
    * GUIDs or names of the users for which you want to retrieve the Orgs data
    */
    'user_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchOrgsRequestVisibilityEnum = "SHOW" | "HIDDEN";
type SearchOrgsRequestStatusEnum = "ACTIVE" | "IN_ACTIVE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Response for search role api should handle hidden privileges as well.
*/
declare class SearchRoleResponse {
    /**
    * Unique Id of the role.
    */
    'id': string;
    /**
    * Name of the role
    */
    'name': string;
    /**
    * Description of the role
    */
    'description': string;
    /**
    * number of groups assigned with this role
    */
    'groups_assigned_count'?: number | null;
    /**
    * Orgs in which role exists.
    */
    'orgs'?: Array<GenericInfo> | null;
    /**
    * Details of groups assigned with this role
    */
    'groups'?: Array<GenericInfo> | null;
    /**
    * Privileges granted to the role.
    */
    'privileges': Array<SearchRoleResponsePrivilegesEnum>;
    /**
    * Permission details of the Role
    */
    'permission'?: SearchRoleResponsePermissionEnum | null;
    /**
    * Unique identifier of author of the role.
    */
    'author_id'?: string | null;
    /**
    * Unique identifier of modifier of the role.
    */
    'modifier_id'?: string | null;
    /**
    * Creation time of the role in milliseconds.
    */
    'creation_time_in_millis'?: any | null;
    /**
    * Last modified time of the role in milliseconds.
    */
    'modification_time_in_millis'?: any | null;
    /**
    * Indicates whether the role is deleted.
    */
    'deleted'?: boolean | null;
    /**
    * Indicates whether the role is deprecated.
    */
    'deprecated'?: boolean | null;
    /**
    * Indicates whether the role is external.
    */
    'external'?: boolean | null;
    /**
    * Indicates whether the role is hidden.
    */
    'hidden'?: boolean | null;
    /**
    * Indicates whether the role is shared via connection
    */
    'shared_via_connection'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchRoleResponsePrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_CONFIGURE_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CONTROL_TRUSTED_AUTH" | "CAN_CREATE_CATALOG" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type SearchRoleResponsePermissionEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SearchRolesRequest {
    /**
    * unique ID or name of the Roles
    */
    'role_identifiers'?: Array<string>;
    /**
    * Unique Id or name of the Organisation
    */
    'org_identifiers'?: Array<string>;
    /**
    * Unique Id or name of the User Group
    */
    'group_identifiers'?: Array<string>;
    /**
    * Privileges assigned to the Role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.
    */
    'privileges'?: Array<SearchRolesRequestPrivilegesEnum>;
    /**
    * Indicates whether the Role is deprecated.
    */
    'deprecated'?: boolean | null;
    /**
    * Indicates whether the Role is external
    */
    'external'?: boolean | null;
    /**
    * Indicates whether the Role is shared via connection
    */
    'shared_via_connection'?: boolean | null;
    /**
    * Permission details of the Role
    */
    'permissions'?: Array<SearchRolesRequestPermissionsEnum>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchRolesRequestPrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_CONFIGURE_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CONTROL_TRUSTED_AUTH" | "CAN_CREATE_CATALOG" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type SearchRolesRequestPermissionsEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options while fetching history runs for the schedule.
*/
declare class SearchSchedulesRequestHistoryRunsOptions {
    /**
    * Indicates whether to fetch history runs for the scheduled notification.
    */
    'include_history_runs'?: boolean | null;
    /**
    * Indicates the max number of records that can be fetched as past runs of any scheduled job.
    */
    'record_size'?: number | null;
    /**
    * Indicates the starting record number from where history runs records should be fetched.
    */
    'record_offset'?: number | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options.
*/
declare class SearchSchedulesRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: string | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchSchedulesRequest {
    /**
    * Metadata objects associated with the scheduled jobs.
    */
    'metadata'?: Array<MetadataInput>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: SearchSchedulesRequestSortOptions;
    'history_runs_options'?: SearchSchedulesRequestHistoryRunsOptions;
    /**
    * unique ID or name of the Schedule
    */
    'schedule_identifiers'?: Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SearchTagsRequest {
    /**
    * Name or Id of the tag.
    */
    'tag_identifier'?: string;
    /**
    * A pattern to match case-insensitive name of the Tag object.
    */
    'name_pattern'?: string;
    /**
    * Color of the tag.
    */
    'color'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options to filter group details.
*/
declare class SearchUserGroupsRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SearchUserGroupsRequestSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SearchUserGroupsRequestSortOptionsOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchUserGroupsRequestSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED";
type SearchUserGroupsRequestSortOptionsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchUserGroupsRequest {
    /**
    * GUID of Liveboards that are assigned as default Liveboards to the users in the group.
    */
    'default_liveboard_identifiers'?: Array<string>;
    /**
    * Description of the group
    */
    'description'?: string;
    /**
    * Display name of the group
    */
    'display_name'?: string;
    /**
    * A pattern to match case-insensitive name of the Group object.
    */
    'name_pattern'?: string;
    /**
    * GUID or name of the group
    */
    'group_identifier'?: string;
    /**
    * ID or name of the Org to which the group belongs
    */
    'org_identifiers'?: Array<string>;
    /**
    * Privileges assigned to the group.
    */
    'privileges'?: Array<SearchUserGroupsRequestPrivilegesEnum>;
    /**
    * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
    */
    'sub_group_identifiers'?: Array<string>;
    /**
    * Group type.
    */
    'type'?: SearchUserGroupsRequestTypeEnum;
    /**
    * GUID or name of the users assigned to the group.
    */
    'user_identifiers'?: Array<string>;
    /**
    * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
    */
    'visibility'?: SearchUserGroupsRequestVisibilityEnum;
    /**
    * Filter groups with a list of Roles assigned to a group
    */
    'role_identifiers'?: Array<string>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: SearchUserGroupsRequestSortOptions;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchUserGroupsRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type SearchUserGroupsRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
type SearchUserGroupsRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options.
*/
declare class SearchUsersRequestSortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SearchUsersRequestSortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SearchUsersRequestSortOptionsOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchUsersRequestSortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED";
type SearchUsersRequestSortOptionsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SearchUsersRequest {
    /**
    * GUID / name of the user to search
    */
    'user_identifier'?: string;
    /**
    * A unique display name string for the user account, usually their first and last name
    */
    'display_name'?: string;
    /**
    * A pattern to match case-insensitive name of the User object.
    */
    'name_pattern'?: string;
    /**
    * Visibility of the user
    */
    'visibility'?: SearchUsersRequestVisibilityEnum;
    /**
    * Email of the user account
    */
    'email'?: string;
    /**
    * GUID or name of the group to which the user belongs
    */
    'group_identifiers'?: Array<string>;
    /**
    * Privileges assigned to the user
    */
    'privileges'?: Array<SearchUsersRequestPrivilegesEnum>;
    /**
    * Type of the account
    */
    'account_type'?: SearchUsersRequestAccountTypeEnum;
    /**
    * Current status of the user account.
    */
    'account_status'?: SearchUsersRequestAccountStatusEnum;
    /**
    * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
    */
    'notify_on_share'?: boolean | null;
    /**
    * The user preference for revisiting the onboarding experience
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * Indicates if the user has completed the onboarding walkthrough
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * IDs or names of the Orgs to which the user belongs
    */
    'org_identifiers'?: Array<string>;
    /**
    * Unique ID or name of the user\'s home Liveboard.
    */
    'home_liveboard_identifier'?: string;
    /**
    * Metadata objects which are assigned as favorites of the user.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    /**
    * The starting record number from where the records should be included.
    */
    'record_offset'?: number;
    /**
    * The number of records that should be included.
    */
    'record_size'?: number;
    'sort_options'?: SearchUsersRequestSortOptions;
    /**
    * Filters by the role assigned to the user.
    */
    'role_identifiers'?: Array<string>;
    /**
    * Indicates if the user\'s favorite objects should be displayed.
    */
    'include_favorite_metadata'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SearchUsersRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
type SearchUsersRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type SearchUsersRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type SearchUsersRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" | "SUSPENDED";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SendMessageRequest {
    /**
    * Data model id to converse on.
    */
    'metadata_identifier': string;
    /**
    * User follow up question.
    */
    'message': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ShareMetadataTypeInput {
    /**
    *   Type of metadata.     Type of metadata. Required if the name of the object is set as the identifier. This attribute is optional when the object GUID is specified as the identifier.
    */
    'type'?: ShareMetadataTypeInputTypeEnum | null;
    /**
    * Unique ID or name of the metadata object.
    */
    'identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ShareMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SharePermissionsInput {
    'principal': PrincipalsInput;
    /**
    * Type of access to the shared object
    */
    'share_mode': SharePermissionsInputShareModeEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SharePermissionsInputShareModeEnum = "READ_ONLY" | "MODIFY" | "NO_ACCESS";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class ShareMetadataRequest {
    /**
    * Type of metadata. Required if identifier in metadata_identifies is a name. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN
    */
    'metadata_type'?: ShareMetadataRequestMetadataTypeEnum;
    /**
    * Unique ID or name of metadata objects. Note: All the names should belong to same metadata_type
    */
    'metadata_identifiers'?: Array<string>;
    /**
    * Metadata details for sharing objects.
    */
    'metadata'?: Array<ShareMetadataTypeInput>;
    /**
    * Permission details for sharing the objects.
    */
    'permissions': Array<SharePermissionsInput>;
    /**
    * Options to specify details of Liveboard. First Liveboard encountered in payload is considered to be the corresponding Liveboard.
    */
    'visualization_identifiers'?: Array<string>;
    /**
    * Email IDs to which notifications will be sent.
    */
    'emails'?: Array<string>;
    /**
    * Message to be included in notification.
    */
    'message': string;
    /**
    * Sends object URLs in the customized format in email notifications.
    */
    'enable_custom_url'?: boolean | null;
    /**
    * Flag to notify user when any object is shared.
    */
    'notify_on_share'?: boolean | null;
    /**
    * Flag to make the object discoverable.
    */
    'has_lenient_discoverability'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type ShareMetadataRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SingleAnswerRequest {
    /**
    * User natural language query.
    */
    'query': string;
    /**
    * Data model id to answer the query on.
    */
    'metadata_identifier': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SortOptionInput {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SortOptionInputFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SortOptionInputOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SortOptionInputFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED" | "LAST_ACCESSED" | "SYNCED" | "VIEWS" | "USER_STATE" | "ROW_COUNT";
type SortOptionInputOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options.
*/
declare class SortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SortOptionsFieldNameEnum | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SortOptionsOrderEnum | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SortOptionsFieldNameEnum = "NAME" | "DISPLAY_NAME" | "AUTHOR" | "CREATED" | "MODIFIED";
type SortOptionsOrderEnum = "ASC" | "DESC";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Sort options.
*/
declare class SortingOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: string | null;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Response format associated with fetch SQL query api
*/
declare class SqlQuery {
    /**
    * Unique identifier of the metadata.
    */
    'metadata_id': string;
    /**
    * Name of the metadata.
    */
    'metadata_name': string;
    /**
    * SQL query of a metadata object.
    */
    'sql_query': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class SqlQueryResponse {
    /**
    * Unique identifier of the metadata.
    */
    'metadata_id': string;
    /**
    * Name of the metadata.
    */
    'metadata_name': string;
    /**
    * Type of the metadata.
    */
    'metadata_type': SqlQueryResponseMetadataTypeEnum;
    /**
    * SQL query details of metadata objects.
    */
    'sql_queries': Array<SqlQuery>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type SqlQueryResponseMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SystemConfig {
    'onboarding_content_url'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class SystemInfo {
    /**
    * The unique identifier of the object
    */
    'id'?: string | null;
    /**
    * Name of the cluster.
    */
    'name'?: string | null;
    /**
    * The release version of the cluster.
    */
    'release_version'?: string | null;
    /**
    * The timezone of the cluster.
    */
    'time_zone'?: string | null;
    /**
    * The default locale of the cluster.
    */
    'locale'?: string | null;
    /**
    * The default date format representation of the cluster.
    */
    'date_format'?: string | null;
    /**
    * The API version of the cluster.
    */
    'api_version'?: string | null;
    /**
    * The deployment type of the cluster.
    */
    'type'?: string | null;
    /**
    * The deployed environment of the cluster.
    */
    'environment'?: string | null;
    /**
    * The license applied to the cluster.
    */
    'license'?: string | null;
    /**
    * The default date time format representation of the cluster.
    */
    'date_time_format'?: string | null;
    /**
    * The default time format representation of the cluster.
    */
    'time_format'?: string | null;
    /**
    * The unique identifier of system user.
    */
    'system_user_id'?: string | null;
    /**
    * The unique identifier of super user.
    */
    'super_user_id'?: string | null;
    /**
    * The unique identifier of hidden object.
    */
    'hidden_object_id'?: string | null;
    /**
    * The unique identifier of system group.
    */
    'system_group_id'?: string | null;
    /**
    * The unique identifier of tsadmin user.
    */
    'tsadmin_user_id'?: string | null;
    /**
    * The unique identifier of admin group.
    */
    'admin_group_id'?: string | null;
    /**
    * The unique identifier of all tables connection.
    */
    'all_tables_connection_id'?: string | null;
    /**
    * The unique identifier of ALL group.
    */
    'all_user_group_id'?: string | null;
    /**
    * The supported accept language by the cluster.
    */
    'accept_language'?: string | null;
    /**
    * The count of users of ALL group.
    */
    'all_user_group_member_user_count'?: number | null;
    /**
    * The version number of logical model of the cluster.
    */
    'logical_model_version'?: number | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class Tag {
    'name': string;
    'id': string;
    'color'?: string | null;
    'deleted'?: boolean | null;
    'hidden'?: boolean | null;
    'external'?: boolean | null;
    'deprecated'?: boolean | null;
    'creation_time_in_millis'?: number | null;
    'modification_time_in_millis'?: number | null;
    'author_id'?: string | null;
    'modifier_id'?: string | null;
    'owner_id'?: string | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class Token {
    /**
    * Bearer auth token.
    */
    'token': string;
    /**
    * Token creation time in milliseconds.
    */
    'creation_time_in_millis': number;
    /**
    * Token expiration time in milliseconds.
    */
    'expiration_time_in_millis': number;
    'scope': Scope;
    /**
    * Username to whom the token is issued.
    */
    'valid_for_user_id': string;
    /**
    * Unique identifier of the user to whom the token is issued.
    */
    'valid_for_username': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class TokenValidationResponse {
    /**
    * Token creation time in milliseconds.
    */
    'creation_time_in_millis': number;
    /**
    * Token expiration time in milliseconds.
    */
    'expiration_time_in_millis': number;
    'scope': Scope;
    /**
    * Username to whom the token is issued.
    */
    'valid_for_user_id': string;
    /**
    * Type of token.
    */
    'token_type': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateConfigRequest {
    /**
    * Username to authenticate connection to version control system
    */
    'username'?: string;
    /**
    * Access token corresponding to the user to authenticate connection to version control system
    */
    'access_token'?: string;
    /**
    *    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\"OrgID1-or-Name1\", \"OrgID2-or-Name2\"]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later
    */
    'org_identifier'?: string;
    /**
    * List the remote branches to configure. Example:[development, production]
    */
    'branch_names'?: Array<string>;
    /**
    * Name of the remote branch where objects from this Thoughtspot instance will be versioned.    Version: 9.7.0.cl or later
    */
    'commit_branch_name'?: string;
    /**
    * Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later
    */
    'enable_guid_mapping'?: boolean | null;
    /**
    * Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.    Version: 9.7.0.cl or later
    */
    'configuration_branch_name'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateConnectionRequest {
    /**
    * Unique ID or name of the connection.
    */
    'connection_identifier': string;
    /**
    * Updated name of the connection.
    */
    'name'?: string;
    /**
    * Updated description of the connection.
    */
    'description'?: string;
    /**
    * Configuration of the data warehouse in JSON.
    */
    'data_warehouse_config'?: any;
    /**
    * Indicates whether to validate the connection details.
    */
    'validate'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateConnectionV2Request {
    /**
    * Updated name of the connection.
    */
    'name'?: string;
    /**
    * Updated description of the connection.
    */
    'description'?: string;
    /**
    * Configuration of the data warehouse in JSON.
    */
    'data_warehouse_config'?: any;
    /**
    * Indicates whether to validate the connection details.
    */
    'validate'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Action details includes `Type` and Configuration for Custom Actions, either Callback or URL is required.
*/
declare class UpdateCustomActionRequestActionDetails {
    'CALLBACK'?: CALLBACKInput;
    'URL'?: URLInput;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Default Custom action configuration. This includes if the custom action available on visualizations and Answers. By default, a custom action is added to all visualizations and Answers.
*/
declare class UpdateCustomActionRequestDefaultActionConfig {
    /**
    * Custom action is available on all visualizations. Earlier naming convention: LOCAL/GLOBAL. TRUE signifies GLOBAL for backward compatibility.
    */
    'visibility'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class UpdateCustomActionRequest {
    'action_details'?: UpdateCustomActionRequestActionDetails;
    /**
    * Metadata objects to which the custom action needs to be associated.
    */
    'associate_metadata'?: Array<AssociateMetadataInput>;
    'default_action_config'?: UpdateCustomActionRequestDefaultActionConfig;
    /**
    * Unique ID or name of the groups that can view and access the custom action.
    */
    'group_identifiers'?: Array<string>;
    /**
    * Name of the custom action. The custom action name must be unique.
    */
    'name'?: string;
    /**
    * Type of update operation. Default operation type is ADD
    */
    'operation'?: UpdateCustomActionRequestOperationEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateCustomActionRequestOperationEnum = "ADD" | "REMOVE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class UpdateDbtConnectionRequest {
    /**
    * Unique ID of the DBT Connection.
    */
    'dbt_connection_identifier': string;
    /**
    * Name of the connection.
    */
    'connection_name'?: string;
    /**
    * Name of the Database.
    */
    'database_name'?: string;
    /**
    * Mention type of Import
    */
    'import_type'?: UpdateDbtConnectionRequestImportTypeEnum;
    /**
    * Access token is mandatory when Import_Type is DBT_CLOUD.
    */
    'access_token'?: string;
    /**
    * DBT URL is mandatory when Import_Type is DBT_CLOUD.
    */
    'dbt_url'?: string;
    /**
    * Account ID is mandatory when Import_Type is DBT_CLOUD
    */
    'account_id'?: string;
    /**
    * Project ID is mandatory when Import_Type is DBT_CLOUD
    */
    'project_id'?: string;
    /**
    * DBT Environment ID\"
    */
    'dbt_env_id'?: string;
    /**
    * Name of the project
    */
    'project_name'?: string;
    /**
    * Upload DBT Manifest and Catalog artifact files as a ZIP file. This field is Mandatory when Import Type is \'ZIP_FILE\'
    */
    'file_content'?: HttpFile;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateDbtConnectionRequestImportTypeEnum = "DBT_CLOUD" | "ZIP_FILE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateOrgRequest {
    /**
    * Name of the Org
    */
    'name'?: string;
    /**
    * Description of the Org
    */
    'description'?: string;
    /**
    * Add Users to an Org
    */
    'user_identifiers'?: Array<string>;
    /**
    * Add Default Groups to an Org
    */
    'group_identifiers'?: Array<string>;
    /**
    * Type of update operation. Default operation type is ADD
    */
    'operation'?: UpdateOrgRequestOperationEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateOrgRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateRoleRequest {
    /**
    * Name of the Role.
    */
    'name': string;
    /**
    * Description of the Role.
    */
    'description'?: string;
    /**
    * Privileges granted to the role. See [Documentation](https://developers.thoughtspot.com/docs/rbac#_role_categories_and_privileges)for supported roles privileges.
    */
    'privileges'?: Array<UpdateRoleRequestPrivilegesEnum>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateRoleRequestPrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT" | "LIVEBOARD_VERIFIER" | "CAN_MANAGE_CUSTOM_CALENDAR" | "CAN_CREATE_OR_EDIT_CONNECTIONS" | "CAN_MANAGE_WORKSHEET_VIEWS_TABLES" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "CAN_CREATE_CATALOG" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Frequency of the scheduled job run.
*/
declare class UpdateScheduleRequestFrequency {
    'cron_expression': CronExpressionInput;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options to specify the details of a Liveboard.
*/
declare class UpdateScheduleRequestLiveboardOptions {
    /**
    * Unique ID or name of visualizations.
    */
    'visualization_identifiers': Array<string>;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
* Options for PDF export.
*/
declare class UpdateScheduleRequestPdfOptions {
    /**
    * Indicates whether to include complete Liveboard.
    */
    'complete_liveboard'?: boolean | null;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean | null;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean | null;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean | null;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean | null;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string | null;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string | null;
    /**
    * Page size.
    */
    'page_size'?: UpdateScheduleRequestPdfOptionsPageSizeEnum | null;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateScheduleRequestPdfOptionsPageSizeEnum = "A4";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Recipients of the scheduled job notifications. You can add the ID or name of the ThoughtSpot users or groups as recipients in the `principals` array. If a recipient is not a ThoughtSpot user, specify email address.
*/
declare class UpdateScheduleRequestRecipientDetails {
    /**
    * Emails of the recipients.
    */
    'emails'?: Array<string> | null;
    /**
    * User or groups to be set as recipients of the schedule notifications.
    */
    'principals'?: Array<PrincipalsListItemInput> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class UpdateScheduleRequest {
    /**
    * Name of the scheduled job.
    */
    'name'?: string;
    /**
    * Description of the scheduled job.
    */
    'description'?: string;
    /**
    * Type of metadata object.
    */
    'metadata_type'?: UpdateScheduleRequestMetadataTypeEnum;
    /**
    * Unique ID or name of the metadata object.
    */
    'metadata_identifier'?: string;
    /**
    * Export file format.
    */
    'file_format'?: UpdateScheduleRequestFileFormatEnum;
    'liveboard_options'?: UpdateScheduleRequestLiveboardOptions;
    'pdf_options'?: UpdateScheduleRequestPdfOptions;
    /**
    * Time zone
    */
    'time_zone'?: UpdateScheduleRequestTimeZoneEnum;
    'frequency'?: UpdateScheduleRequestFrequency;
    'recipient_details'?: UpdateScheduleRequestRecipientDetails;
    /**
    * Status of the schedule
    */
    'status'?: UpdateScheduleRequestStatusEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateScheduleRequestMetadataTypeEnum = "LIVEBOARD";
type UpdateScheduleRequestFileFormatEnum = "CSV" | "PDF" | "XLSX";
type UpdateScheduleRequestTimeZoneEnum = "Africa/Abidjan" | "Africa/Accra" | "Africa/Addis_Ababa" | "Africa/Algiers" | "Africa/Asmara" | "Africa/Asmera" | "Africa/Bamako" | "Africa/Bangui" | "Africa/Banjul" | "Africa/Bissau" | "Africa/Blantyre" | "Africa/Brazzaville" | "Africa/Bujumbura" | "Africa/Cairo" | "Africa/Casablanca" | "Africa/Ceuta" | "Africa/Conakry" | "Africa/Dakar" | "Africa/Dar_es_Salaam" | "Africa/Djibouti" | "Africa/Douala" | "Africa/El_Aaiun" | "Africa/Freetown" | "Africa/Gaborone" | "Africa/Harare" | "Africa/Johannesburg" | "Africa/Juba" | "Africa/Kampala" | "Africa/Khartoum" | "Africa/Kigali" | "Africa/Kinshasa" | "Africa/Lagos" | "Africa/Libreville" | "Africa/Lome" | "Africa/Luanda" | "Africa/Lubumbashi" | "Africa/Lusaka" | "Africa/Malabo" | "Africa/Maputo" | "Africa/Maseru" | "Africa/Mbabane" | "Africa/Mogadishu" | "Africa/Monrovia" | "Africa/Nairobi" | "Africa/Ndjamena" | "Africa/Niamey" | "Africa/Nouakchott" | "Africa/Ouagadougou" | "Africa/Porto-Novo" | "Africa/Sao_Tome" | "Africa/Timbuktu" | "Africa/Tripoli" | "Africa/Tunis" | "Africa/Windhoek" | "America/Adak" | "America/Anchorage" | "America/Anguilla" | "America/Antigua" | "America/Araguaina" | "America/Argentina/Buenos_Aires" | "America/Argentina/Catamarca" | "America/Argentina/ComodRivadavia" | "America/Argentina/Cordoba" | "America/Argentina/Jujuy" | "America/Argentina/La_Rioja" | "America/Argentina/Mendoza" | "America/Argentina/Rio_Gallegos" | "America/Argentina/Salta" | "America/Argentina/San_Juan" | "America/Argentina/San_Luis" | "America/Argentina/Tucuman" | "America/Argentina/Ushuaia" | "America/Aruba" | "America/Asuncion" | "America/Atikokan" | "America/Atka" | "America/Bahia" | "America/Bahia_Banderas" | "America/Barbados" | "America/Belem" | "America/Belize" | "America/Blanc-Sablon" | "America/Boa_Vista" | "America/Bogota" | "America/Boise" | "America/Buenos_Aires" | "America/Cambridge_Bay" | "America/Campo_Grande" | "America/Cancun" | "America/Caracas" | "America/Catamarca" | "America/Cayenne" | "America/Cayman" | "America/Chicago" | "America/Chihuahua" | "America/Coral_Harbour" | "America/Cordoba" | "America/Costa_Rica" | "America/Creston" | "America/Cuiaba" | "America/Curacao" | "America/Danmarkshavn" | "America/Dawson" | "America/Dawson_Creek" | "America/Denver" | "America/Detroit" | "America/Dominica" | "America/Edmonton" | "America/Eirunepe" | "America/El_Salvador" | "America/Ensenada" | "America/Fort_Nelson" | "America/Fort_Wayne" | "America/Fortaleza" | "America/Glace_Bay" | "America/Godthab" | "America/Goose_Bay" | "America/Grand_Turk" | "America/Grenada" | "America/Guadeloupe" | "America/Guatemala" | "America/Guayaquil" | "America/Guyana" | "America/Halifax" | "America/Havana" | "America/Hermosillo" | "America/Indiana/Indianapolis" | "America/Indiana/Knox" | "America/Indiana/Marengo" | "America/Indiana/Petersburg" | "America/Indiana/Tell_City" | "America/Indiana/Vevay" | "America/Indiana/Vincennes" | "America/Indiana/Winamac" | "America/Indianapolis" | "America/Inuvik" | "America/Iqaluit" | "America/Jamaica" | "America/Jujuy" | "America/Juneau" | "America/Kentucky/Louisville" | "America/Kentucky/Monticello" | "America/Knox_IN" | "America/Kralendijk" | "America/La_Paz" | "America/Lima" | "America/Los_Angeles" | "America/Louisville" | "America/Lower_Princes" | "America/Maceio" | "America/Managua" | "America/Manaus" | "America/Marigot" | "America/Martinique" | "America/Matamoros" | "America/Mazatlan" | "America/Mendoza" | "America/Menominee" | "America/Merida" | "America/Metlakatla" | "America/Mexico_City" | "America/Miquelon" | "America/Moncton" | "America/Monterrey" | "America/Montevideo" | "America/Montreal" | "America/Montserrat" | "America/Nassau" | "America/New_York" | "America/Nipigon" | "America/Nome" | "America/Noronha" | "America/North_Dakota/Beulah" | "America/North_Dakota/Center" | "America/North_Dakota/New_Salem" | "America/Nuuk" | "America/Ojinaga" | "America/Panama" | "America/Pangnirtung" | "America/Paramaribo" | "America/Phoenix" | "America/Port-au-Prince" | "America/Port_of_Spain" | "America/Porto_Acre" | "America/Porto_Velho" | "America/Puerto_Rico" | "America/Punta_Arenas" | "America/Rainy_River" | "America/Rankin_Inlet" | "America/Recife" | "America/Regina" | "America/Resolute" | "America/Rio_Branco" | "America/Rosario" | "America/Santa_Isabel" | "America/Santarem" | "America/Santiago" | "America/Santo_Domingo" | "America/Sao_Paulo" | "America/Scoresbysund" | "America/Shiprock" | "America/Sitka" | "America/St_Barthelemy" | "America/St_Johns" | "America/St_Kitts" | "America/St_Lucia" | "America/St_Thomas" | "America/St_Vincent" | "America/Swift_Current" | "America/Tegucigalpa" | "America/Thule" | "America/Thunder_Bay" | "America/Tijuana" | "America/Toronto" | "America/Tortola" | "America/Vancouver" | "America/Virgin" | "America/Whitehorse" | "America/Winnipeg" | "America/Yakutat" | "America/Yellowknife" | "Antarctica/Casey" | "Antarctica/Davis" | "Antarctica/DumontDUrville" | "Antarctica/Macquarie" | "Antarctica/Mawson" | "Antarctica/McMurdo" | "Antarctica/Palmer" | "Antarctica/Rothera" | "Antarctica/South_Pole" | "Antarctica/Syowa" | "Antarctica/Troll" | "Antarctica/Vostok" | "Arctic/Longyearbyen" | "Asia/Aden" | "Asia/Almaty" | "Asia/Amman" | "Asia/Anadyr" | "Asia/Aqtau" | "Asia/Aqtobe" | "Asia/Ashgabat" | "Asia/Ashkhabad" | "Asia/Atyrau" | "Asia/Baghdad" | "Asia/Bahrain" | "Asia/Baku" | "Asia/Bangkok" | "Asia/Barnaul" | "Asia/Beirut" | "Asia/Bishkek" | "Asia/Brunei" | "Asia/Calcutta" | "Asia/Chita" | "Asia/Choibalsan" | "Asia/Chongqing" | "Asia/Chungking" | "Asia/Colombo" | "Asia/Dacca" | "Asia/Damascus" | "Asia/Dhaka" | "Asia/Dili" | "Asia/Dubai" | "Asia/Dushanbe" | "Asia/Famagusta" | "Asia/Gaza" | "Asia/Harbin" | "Asia/Hebron" | "Asia/Ho_Chi_Minh" | "Asia/Hong_Kong" | "Asia/Hovd" | "Asia/Irkutsk" | "Asia/Istanbul" | "Asia/Jakarta" | "Asia/Jayapura" | "Asia/Jerusalem" | "Asia/Kabul" | "Asia/Kamchatka" | "Asia/Karachi" | "Asia/Kashgar" | "Asia/Kathmandu" | "Asia/Katmandu" | "Asia/Khandyga" | "Asia/Kolkata" | "Asia/Krasnoyarsk" | "Asia/Kuala_Lumpur" | "Asia/Kuching" | "Asia/Kuwait" | "Asia/Macao" | "Asia/Macau" | "Asia/Magadan" | "Asia/Makassar" | "Asia/Manila" | "Asia/Muscat" | "Asia/Nicosia" | "Asia/Novokuznetsk" | "Asia/Novosibirsk" | "Asia/Omsk" | "Asia/Oral" | "Asia/Phnom_Penh" | "Asia/Pontianak" | "Asia/Pyongyang" | "Asia/Qatar" | "Asia/Qostanay" | "Asia/Qyzylorda" | "Asia/Rangoon" | "Asia/Riyadh" | "Asia/Saigon" | "Asia/Sakhalin" | "Asia/Samarkand" | "Asia/Seoul" | "Asia/Shanghai" | "Asia/Singapore" | "Asia/Srednekolymsk" | "Asia/Taipei" | "Asia/Tashkent" | "Asia/Tbilisi" | "Asia/Tehran" | "Asia/Tel_Aviv" | "Asia/Thimbu" | "Asia/Thimphu" | "Asia/Tokyo" | "Asia/Tomsk" | "Asia/Ujung_Pandang" | "Asia/Ulaanbaatar" | "Asia/Ulan_Bator" | "Asia/Urumqi" | "Asia/Ust-Nera" | "Asia/Vientiane" | "Asia/Vladivostok" | "Asia/Yakutsk" | "Asia/Yangon" | "Asia/Yekaterinburg" | "Asia/Yerevan" | "Atlantic/Azores" | "Atlantic/Bermuda" | "Atlantic/Canary" | "Atlantic/Cape_Verde" | "Atlantic/Faeroe" | "Atlantic/Faroe" | "Atlantic/Jan_Mayen" | "Atlantic/Madeira" | "Atlantic/Reykjavik" | "Atlantic/South_Georgia" | "Atlantic/St_Helena" | "Atlantic/Stanley" | "Australia/ACT" | "Australia/Adelaide" | "Australia/Brisbane" | "Australia/Broken_Hill" | "Australia/Canberra" | "Australia/Currie" | "Australia/Darwin" | "Australia/Eucla" | "Australia/Hobart" | "Australia/LHI" | "Australia/Lindeman" | "Australia/Lord_Howe" | "Australia/Melbourne" | "Australia/NSW" | "Australia/North" | "Australia/Perth" | "Australia/Queensland" | "Australia/South" | "Australia/Sydney" | "Australia/Tasmania" | "Australia/Victoria" | "Australia/West" | "Australia/Yancowinna" | "Brazil/Acre" | "Brazil/DeNoronha" | "Brazil/East" | "Brazil/West" | "CET" | "CST6CDT" | "Canada/Atlantic" | "Canada/Central" | "Canada/Eastern" | "Canada/Mountain" | "Canada/Newfoundland" | "Canada/Pacific" | "Canada/Saskatchewan" | "Canada/Yukon" | "Chile/Continental" | "Chile/EasterIsland" | "Cuba" | "EET" | "EST5EDT" | "Egypt" | "Eire" | "Etc/GMT" | "Etc/GMT+0" | "Etc/GMT+1" | "Etc/GMT+10" | "Etc/GMT+11" | "Etc/GMT+12" | "Etc/GMT+2" | "Etc/GMT+3" | "Etc/GMT+4" | "Etc/GMT+5" | "Etc/GMT+6" | "Etc/GMT+7" | "Etc/GMT+8" | "Etc/GMT+9" | "Etc/GMT-0" | "Etc/GMT-1" | "Etc/GMT-10" | "Etc/GMT-11" | "Etc/GMT-12" | "Etc/GMT-13" | "Etc/GMT-14" | "Etc/GMT-2" | "Etc/GMT-3" | "Etc/GMT-4" | "Etc/GMT-5" | "Etc/GMT-6" | "Etc/GMT-7" | "Etc/GMT-8" | "Etc/GMT-9" | "Etc/GMT0" | "Etc/Greenwich" | "Etc/UCT" | "Etc/UTC" | "Etc/Universal" | "Etc/Zulu" | "Europe/Amsterdam" | "Europe/Andorra" | "Europe/Astrakhan" | "Europe/Athens" | "Europe/Belfast" | "Europe/Belgrade" | "Europe/Berlin" | "Europe/Bratislava" | "Europe/Brussels" | "Europe/Bucharest" | "Europe/Budapest" | "Europe/Busingen" | "Europe/Chisinau" | "Europe/Copenhagen" | "Europe/Dublin" | "Europe/Gibraltar" | "Europe/Guernsey" | "Europe/Helsinki" | "Europe/Isle_of_Man" | "Europe/Istanbul" | "Europe/Jersey" | "Europe/Kaliningrad" | "Europe/Kiev" | "Europe/Kirov" | "Europe/Kyiv" | "Europe/Lisbon" | "Europe/Ljubljana" | "Europe/London" | "Europe/Luxembourg" | "Europe/Madrid" | "Europe/Malta" | "Europe/Mariehamn" | "Europe/Minsk" | "Europe/Monaco" | "Europe/Moscow" | "Europe/Nicosia" | "Europe/Oslo" | "Europe/Paris" | "Europe/Podgorica" | "Europe/Prague" | "Europe/Riga" | "Europe/Rome" | "Europe/Samara" | "Europe/San_Marino" | "Europe/Sarajevo" | "Europe/Saratov" | "Europe/Simferopol" | "Europe/Skopje" | "Europe/Sofia" | "Europe/Stockholm" | "Europe/Tallinn" | "Europe/Tirane" | "Europe/Tiraspol" | "Europe/Ulyanovsk" | "Europe/Uzhgorod" | "Europe/Vaduz" | "Europe/Vatican" | "Europe/Vienna" | "Europe/Vilnius" | "Europe/Volgograd" | "Europe/Warsaw" | "Europe/Zagreb" | "Europe/Zaporozhye" | "Europe/Zurich" | "GB" | "GB-Eire" | "GMT" | "GMT0" | "Greenwich" | "Hongkong" | "Iceland" | "Indian/Antananarivo" | "Indian/Chagos" | "Indian/Christmas" | "Indian/Cocos" | "Indian/Comoro" | "Indian/Kerguelen" | "Indian/Mahe" | "Indian/Maldives" | "Indian/Mauritius" | "Indian/Mayotte" | "Indian/Reunion" | "Iran" | "Israel" | "Jamaica" | "Japan" | "Kwajalein" | "Libya" | "MET" | "MST7MDT" | "Mexico/BajaNorte" | "Mexico/BajaSur" | "Mexico/General" | "NZ" | "NZ-CHAT" | "Navajo" | "PRC" | "PST8PDT" | "Pacific/Apia" | "Pacific/Auckland" | "Pacific/Bougainville" | "Pacific/Chatham" | "Pacific/Chuuk" | "Pacific/Easter" | "Pacific/Efate" | "Pacific/Enderbury" | "Pacific/Fakaofo" | "Pacific/Fiji" | "Pacific/Funafuti" | "Pacific/Galapagos" | "Pacific/Gambier" | "Pacific/Guadalcanal" | "Pacific/Guam" | "Pacific/Honolulu" | "Pacific/Johnston" | "Pacific/Kanton" | "Pacific/Kiritimati" | "Pacific/Kosrae" | "Pacific/Kwajalein" | "Pacific/Majuro" | "Pacific/Marquesas" | "Pacific/Midway" | "Pacific/Nauru" | "Pacific/Niue" | "Pacific/Norfolk" | "Pacific/Noumea" | "Pacific/Pago_Pago" | "Pacific/Palau" | "Pacific/Pitcairn" | "Pacific/Pohnpei" | "Pacific/Ponape" | "Pacific/Port_Moresby" | "Pacific/Rarotonga" | "Pacific/Saipan" | "Pacific/Samoa" | "Pacific/Tahiti" | "Pacific/Tarawa" | "Pacific/Tongatapu" | "Pacific/Truk" | "Pacific/Wake" | "Pacific/Wallis" | "Pacific/Yap" | "Poland" | "Portugal" | "ROK" | "Singapore" | "SystemV/AST4" | "SystemV/AST4ADT" | "SystemV/CST6" | "SystemV/CST6CDT" | "SystemV/EST5" | "SystemV/EST5EDT" | "SystemV/HST10" | "SystemV/MST7" | "SystemV/MST7MDT" | "SystemV/PST8" | "SystemV/PST8PDT" | "SystemV/YST9" | "SystemV/YST9YDT" | "Turkey" | "UCT" | "US/Alaska" | "US/Aleutian" | "US/Arizona" | "US/Central" | "US/East-Indiana" | "US/Eastern" | "US/Hawaii" | "US/Indiana-Starke" | "US/Michigan" | "US/Mountain" | "US/Pacific" | "US/Samoa" | "UTC" | "Universal" | "W-SU" | "WET" | "Zulu" | "EST" | "HST" | "MST" | "ACT" | "AET" | "AGT" | "ART" | "AST" | "BET" | "BST" | "CAT" | "CNT" | "CST" | "CTT" | "EAT" | "ECT" | "IET" | "IST" | "JST" | "MIT" | "NET" | "NST" | "PLT" | "PNT" | "PRT" | "PST" | "SST" | "VST";
type UpdateScheduleRequestStatusEnum = "ACTIVE" | "PAUSE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateSystemConfigRequest {
    /**
    * Configuration JSON with the key-value pair of configuration attributes to be updated.
    */
    'configuration': any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateTagRequest {
    /**
    * Name of the tag.
    */
    'name'?: string;
    /**
    * Hex color code to be assigned to the tag. For example, #ff78a9.
    */
    'color'?: string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class UpdateUserGroupRequest {
    /**
    * Name of the group to modify.
    */
    'name'?: string;
    /**
    * ID of the Liveboards to be assigned as default Liveboards to the users in the group.
    */
    'default_liveboard_identifiers'?: Array<string>;
    /**
    * Description for the group.
    */
    'description'?: string;
    /**
    * Display name of the group.
    */
    'display_name'?: string;
    /**
    * Privileges to assign to the group.
    */
    'privileges'?: Array<UpdateUserGroupRequestPrivilegesEnum>;
    /**
    * GUID or name of the sub groups. A subgroup is a group assigned to a parent group.
    */
    'sub_group_identifiers'?: Array<string>;
    /**
    * Type of the group
    */
    'type'?: UpdateUserGroupRequestTypeEnum;
    /**
    * GUID or name of the users to assign to the group.
    */
    'user_identifiers'?: Array<string>;
    /**
    * Visibility of the group. To make a group visible to other users and groups, set the visibility to SHAREABLE.
    */
    'visibility'?: UpdateUserGroupRequestVisibilityEnum;
    /**
    * Role identifiers of the Roles that should be assigned to the group.
    */
    'role_identifiers'?: Array<string>;
    /**
    * Type of update operation. Default operation type is REPLACE
    */
    'operation'?: UpdateUserGroupRequestOperationEnum;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE" | "CAN_MANAGE_VERSION_CONTROL" | "THIRDPARTY_ANALYSIS" | "ALLOW_NON_EMBED_FULL_APP_ACCESS" | "CAN_ACCESS_ANALYST_STUDIO" | "CAN_MANAGE_ANALYST_STUDIO" | "PREVIEW_DOCUMENT_SEARCH" | "CAN_SETUP_VERSION_CONTROL";
type UpdateUserGroupRequestTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
type UpdateUserGroupRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
type UpdateUserGroupRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class UpdateUserRequest {
    /**
    * Name of the user. The username string must be unique.
    */
    'name'?: string;
    /**
    * A unique display name string for the user account, usually their first and last name
    */
    'display_name'?: string;
    /**
    * Visibility of the users. When set to SHARABLE, the user is visible to other users and groups when they try to share an object.
    */
    'visibility'?: UpdateUserRequestVisibilityEnum;
    /**
    * Email of the user account
    */
    'email'?: string;
    /**
    * Current status of the user account. The `SUSPENDED` user state indicates a transitional state applicable to IAMv2 users only.
    */
    'account_status'?: UpdateUserRequestAccountStatusEnum;
    /**
    * User preference for receiving email notifications when another ThoughtSpot user shares a metadata object such as Answer, Liveboard, or Worksheet.
    */
    'notify_on_share'?: boolean | null;
    /**
    * The user preference for revisiting the onboarding experience.
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * Indicates if the user has completed the onboarding and allows turning off the onboarding walkthrough.
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * Type of the account.
    */
    'account_type'?: UpdateUserRequestAccountTypeEnum;
    /**
    * GUIDs or names of the groups.
    */
    'group_identifiers'?: Array<string>;
    /**
    * GUID of the Liveboard to set a default Liveboard for the user. ThoughtSpot displays this Liveboard on the Home page when the user logs in.
    */
    'home_liveboard_identifier'?: string;
    /**
    * Metadata objects to add to the user\'s favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
    /**
    * IDs of the Orgs.
    */
    'org_identifiers'?: Array<string>;
    /**
    * Type of update operation. Default operation type is REPLACE
    */
    'operation'?: UpdateUserRequestOperationEnum;
    /**
    * Locale for the user.
    */
    'preferred_locale'?: UpdateUserRequestPreferredLocaleEnum;
    /**
    * Properties for the user
    */
    'extended_properties'?: any;
    /**
    * Preferences for the user
    */
    'extended_preferences'?: any;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UpdateUserRequestVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
type UpdateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" | "SUSPENDED";
type UpdateUserRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type UpdateUserRequestOperationEnum = "ADD" | "REMOVE" | "REPLACE";
type UpdateUserRequestPreferredLocaleEnum = "en-CA" | "en-GB" | "en-US" | "de-DE" | "ja-JP" | "zh-CN" | "pt-BR" | "fr-FR" | "fr-CA" | "es-US" | "da-DK" | "es-ES" | "fi-FI" | "sv-SE" | "nb-NO" | "pt-PT" | "nl-NL" | "it-IT" | "ru-RU" | "en-IN";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class User {
    /**
    * Unique identifier of the user.
    */
    'id': string;
    /**
    * Name of the user.
    */
    'name': string;
    /**
    * Display name of the user.
    */
    'display_name': string;
    /**
    * Visibility of the users. The `SHARABLE` property makes a user visible to other users and group, who can share objects with the user.
    */
    'visibility': UserVisibilityEnum;
    /**
    * Unique identifier of author of the user.
    */
    'author_id'?: string | null;
    /**
    * Defines whether the user can change their password.
    */
    'can_change_password'?: boolean | null;
    /**
    * Defines whether the response has complete detail of the user.
    */
    'complete_detail'?: boolean | null;
    /**
    * Creation time of the user in milliseconds.
    */
    'creation_time_in_millis'?: number | null;
    'current_org'?: Org;
    /**
    * Indicates whether the user is deleted.
    */
    'deleted'?: boolean | null;
    /**
    * Indicates whether the user is deprecated.
    */
    'deprecated'?: boolean | null;
    /**
    * Type of the user account.
    */
    'account_type'?: UserAccountTypeEnum | null;
    /**
    * Status of the user account.
    */
    'account_status'?: UserAccountStatusEnum | null;
    /**
    * Email of the user.
    */
    'email'?: string | null;
    /**
    * Expiration time of the user in milliseconds.
    */
    'expiration_time_in_millis'?: number | null;
    /**
    * Indicates whether the user is external.
    */
    'external'?: boolean | null;
    /**
    * Metadata objects to add to the users\' favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataItem> | null;
    /**
    * Timestamp of the first login session of the user in milliseconds.
    */
    'first_login_time_in_millis'?: number | null;
    /**
    * Group mask of the user.
    */
    'group_mask'?: number | null;
    /**
    * Indicates whether the user is hidden.
    */
    'hidden'?: boolean | null;
    'home_liveboard'?: ObjectIDAndName;
    /**
    * Incomplete details of user if any present.
    */
    'incomplete_details'?: any | null;
    /**
    * Indicates whether it is first login of the user.
    */
    'is_first_login'?: boolean | null;
    /**
    * Last modified time of the user in milliseconds.
    */
    'modification_time_in_millis'?: number | null;
    /**
    * Unique identifier of modifier of the user.
    */
    'modifier_id'?: string | null;
    /**
    * User preference for receiving email notifications on shared Answers or Liveboard.
    */
    'notify_on_share'?: boolean | null;
    /**
    * The user preference for turning off the onboarding experience.
    */
    'onboarding_experience_completed'?: boolean | null;
    /**
    * Orgs to which the user belongs.
    */
    'orgs'?: Array<Org> | null;
    /**
    * Unique identifier of owner of the user.
    */
    'owner_id'?: string | null;
    /**
    * Parent type of the user.
    */
    'parent_type'?: UserParentTypeEnum | null;
    /**
    * Privileges which are assigned to the user.
    */
    'privileges'?: Array<string> | null;
    /**
    * User\'s preference to revisit the new user onboarding experience.
    */
    'show_onboarding_experience'?: boolean | null;
    /**
    * Indicates whether the user is a super user.
    */
    'super_user'?: boolean | null;
    /**
    * Indicates whether the user is a system user.
    */
    'system_user'?: boolean | null;
    /**
    * Tags associated with the user.
    */
    'tags'?: Array<ObjectIDAndName> | null;
    /**
    * Unique identifier of tenant of the user.
    */
    'tenant_id'?: string | null;
    /**
    * Groups to which the user is assigned.
    */
    'user_groups'?: Array<ObjectIDAndName> | null;
    /**
    * Inherited User Groups which the user is part of.
    */
    'user_inherited_groups'?: Array<ObjectIDAndName> | null;
    /**
    * Indicates whether welcome email is sent for the user.
    */
    'welcome_email_sent'?: boolean | null;
    /**
    * Privileges which are assigned to the user with org.
    */
    'org_privileges'?: any | null;
    /**
    * Locale for the user.
    */
    'preferred_locale'?: string | null;
    /**
    * Properties for the user
    */
    'extended_properties'?: any | null;
    /**
    * Preferences for the user
    */
    'extended_preferences'?: any | null;
    /**
    * User Parameters which are specified for the user via JWToken
    */
    'user_parameters'?: any | null;
    /**
    * Access Control Properties which are specified for the user via JWToken
    */
    'access_control_properties'?: any | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UserVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
type UserAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type UserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING" | "SUSPENDED";
type UserParentTypeEnum = "USER" | "GROUP";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

declare class UserGroupResponse {
    /**
    * The unique identifier of the object
    */
    'author_id'?: string | null;
    /**
    * Indicates whether the response has complete detail of the group.
    */
    'complete_detail'?: boolean | null;
    /**
    * Content details of the group
    */
    'content'?: any | null;
    /**
    * Creation time of the group in milliseconds
    */
    'creation_time_in_millis'?: number | null;
    /**
    * Liveboards that are assigned as default Liveboards to the group.
    */
    'default_liveboards'?: Array<UserGroup> | null;
    /**
    * Indicates whether the group is deleted
    */
    'deleted'?: boolean | null;
    /**
    * Indicates whether the group is deprecated
    */
    'deprecated'?: boolean | null;
    /**
    * Description of the group
    */
    'description'?: string | null;
    /**
    * Display name of the group.
    */
    'display_name': string;
    /**
    * Indicates whether the group is external
    */
    'external'?: boolean | null;
    /**
    * Generation number of the group
    */
    'generation_number'?: number | null;
    /**
    * Indicates whether the group is hidden
    */
    'hidden'?: boolean | null;
    /**
    * The unique identifier of the object
    */
    'id': string;
    /**
    * Index number of the group
    */
    'index'?: number | null;
    /**
    * Index version number of the group
    */
    'index_version'?: number | null;
    /**
    * Metadata version number of the group
    */
    'metadata_version'?: number | null;
    /**
    * Last modified time of the group in milliseconds.
    */
    'modification_time_in_millis'?: number | null;
    /**
    * The unique identifier of the object
    */
    'modifier_id'?: string | null;
    /**
    * Name of the group.
    */
    'name': string;
    /**
    * Orgs in which group exists.
    */
    'orgs'?: Array<UserGroup> | null;
    /**
    * The unique identifier of the object
    */
    'owner_id'?: string | null;
    /**
    * Parent type of the group.
    */
    'parent_type'?: UserGroupResponseParentTypeEnum | null;
    /**
    * Privileges which are assigned to the group
    */
    'privileges'?: Array<string> | null;
    /**
    * Groups who are part of the group
    */
    'sub_groups'?: Array<UserGroup> | null;
    /**
    * Indicates whether the group is a system group.
    */
    'system_group'?: boolean | null;
    /**
    * Tags associated with the group.
    */
    'tags'?: Array<UserGroup> | null;
    /**
    * Type of the group.
    */
    'type'?: UserGroupResponseTypeEnum | null;
    /**
    * Users who are part of the group.
    */
    'users'?: Array<UserGroup> | null;
    /**
    * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects.
    */
    'visibility': UserGroupResponseVisibilityEnum;
    /**
    * List of roles assgined to the user
    */
    'roles'?: Array<Role> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
type UserGroupResponseParentTypeEnum = "USER" | "GROUP";
type UserGroupResponseTypeEnum = "LOCAL_GROUP" | "LDAP_GROUP";
type UserGroupResponseVisibilityEnum = "SHARABLE" | "NON_SHARABLE";

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
* Define attributes such as Runtime filters and Runtime parameters to send security entitlements to a user session. For more information, see [Documentation](https://developers.thoughtspot.com/docs/abac-user-parameters).
*/
declare class UserParameterOptions {
    'objects'?: Array<UserObject> | null;
    /**
    * Objects to apply the User_Runtime_Filters.  Examples to set the `runtime_filters` : ```json { \"column_name\": \"Color\", \"operator\": \"EQ\", \"values\": [\"red\"], \"persist\": false } ```
    */
    'runtime_filters'?: Array<RuntimeFilters> | null;
    /**
    * Objects to apply the User_Runtime_Sorts.  Examples to set the `runtime_sorts` : ```json { \"column_name\": \"Color\", \"order\": \"ASC\", \"persist\": false } ```
    */
    'runtime_sorts'?: Array<RuntimeSorts> | null;
    /**
    * Objects to apply the Runtime_Parameters.  Examples to set the `parameters` : ```json { \"name\": \"Color\", \"values\": [\"Blue\"], \"persist\": false } ```
    */
    'parameters'?: Array<RuntimeParameters> | null;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ValidateMergeRequest {
    /**
    * Name of the branch from which changes need to be picked for validation
    */
    'source_branch_name': string;
    /**
    * Name of the branch where files will be merged
    */
    'target_branch_name': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
declare class ValidateTokenRequest {
    'token': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}

/**
 * Defines the contract for a middleware intercepting requests before
 * they are sent (but after the RequestContext was created)
 * and before the ResponseContext is unwrapped.
 *
 */
interface Middleware {
    /**
     * Modifies the request before the request is sent.
     *
     * @param context RequestContext of a request which is about to be sent to the server
     * @returns an observable of the updated request context
     *
     */
    pre(context: RequestContext): Observable<RequestContext>;
    /**
     * Modifies the returned response before it is deserialized.
     *
     * @param context ResponseContext of a sent request
     * @returns an observable of the modified response context
     */
    post(context: ResponseContext): Observable<ResponseContext>;
}
/**
 * Defines the contract for a middleware intercepting requests before
 * they are sent (but after the RequestContext was created)
 * and before the ResponseContext is unwrapped.
 *
 */
interface PromiseMiddleware {
    /**
     * Modifies the request before the request is sent.
     *
     * @param context RequestContext of a request which is about to be sent to the server
     * @returns an observable of the updated request context
     *
     */
    pre(context: RequestContext): Promise<RequestContext>;
    /**
 * Modifies the returned response before it is deserialized.
 *
 * @param context ResponseContext of a sent request
 * @returns an observable of the modified response context
 */
    post(context: ResponseContext): Promise<ResponseContext>;
}

interface BaseServerConfiguration {
    makeRequestContext(endpoint: string, httpMethod: HttpMethod): RequestContext;
}
/**
 *
 * Represents the configuration of a server including its
 * url template and variable configuration based on the url.
 *
 */
declare class ServerConfiguration<T extends {
    [key: string]: string;
}> implements BaseServerConfiguration {
    private url;
    private variableConfiguration;
    constructor(url: string, variableConfiguration: T);
    /**
     * Sets the value of the variables of this server. Variables are included in
     * the `url` of this ServerConfiguration in the form `{variableName}`
     *
     * @param variableConfiguration a partial variable configuration for the
     * variables contained in the url
     */
    setVariables(variableConfiguration: Partial<T>): void;
    getConfiguration(): T;
    private getUrl;
    /**
     * Creates a new request context for this server using the url with variables
     * replaced with their respective values and the endpoint of the request appended.
     *
     * @param endpoint the endpoint to be queried on the server
     * @param httpMethod httpMethod to be used
     *
     */
    makeRequestContext(endpoint: string, httpMethod: HttpMethod): RequestContext;
}
declare const server1: ServerConfiguration<{
    "base-url": string;
}>;
declare const servers: ServerConfiguration<{
    "base-url": string;
}>[];

interface Configuration {
    readonly baseServer: BaseServerConfiguration;
    readonly httpApi: HttpLibrary;
    readonly middleware: Middleware[];
    readonly authMethods: AuthMethods;
}
/**
 * Interface with which a configuration object can be configured.
 */
interface ConfigurationParameters {
    /**
     * Default server to use - a list of available servers (according to the
     * OpenAPI yaml definition) is included in the `servers` const in `./servers`. You can also
     * create your own server with the `ServerConfiguration` class from the same
     * file.
     */
    baseServer?: BaseServerConfiguration;
    /**
     * HTTP library to use e.g. IsomorphicFetch. This can usually be skipped as
     * all generators come with a default library.
     * If available, additional libraries can be imported from `./http/*`
     */
    httpApi?: HttpLibrary;
    /**
     * The middlewares which will be applied to requests and responses. You can
     * add any number of middleware components to modify requests before they
     * are sent or before they are deserialized by implementing the `Middleware`
     * interface defined in `./middleware`
     */
    middleware?: Middleware[];
    /**
     * Configures middleware functions that return promises instead of
     * Observables (which are used by `middleware`). Otherwise allows for the
     * same functionality as `middleware`, i.e., modifying requests before they
     * are sent and before they are deserialized.
     */
    promiseMiddleware?: PromiseMiddleware[];
    /**
     * Configuration for the available authentication methods (e.g., api keys)
     * according to the OpenAPI yaml definition. For the definition, please refer to
     * `./auth/auth`
     */
    authMethods?: AuthMethodsConfiguration;
}
/**
 * Provide your `ConfigurationParameters` to this function to get a `Configuration`
 * object that can be used to configure your APIs (in the constructor or
 * for each request individually).
 *
 * If a property is not included in conf, a default is used:
 *    - baseServer: server1
 *    - httpApi: IsomorphicFetchHttpLibrary
 *    - middleware: []
 *    - promiseMiddleware: []
 *    - authMethods: {}
 *
 * @param conf partial configuration
 */
declare function createConfiguration(conf?: ConfigurationParameters): Configuration;

/**
 * Represents an error caused by an api call i.e. it has attributes for a HTTP status code
 * and the returned body object.
 *
 * Example
 * API returns a ErrorMessageObject whenever HTTP status code is not in [200, 299]
 * => ApiException(404, someErrorMessageObject)
 *
 */
declare class ApiException<T> extends Error {
    code: number;
    body: T;
    headers: {
        [key: string]: string;
    };
    constructor(code: number, message: string, body: T, headers: {
        [key: string]: string;
    });
}

/**
 *
 * @export
 * @class BaseAPI
 */
declare class BaseAPIRequestFactory {
    protected configuration: Configuration;
    constructor(configuration: Configuration);
}
/**
 *
 * @export
 * @class RequiredError
 * @extends {Error}
 */
declare class RequiredError extends Error {
    api: string;
    method: string;
    field: string;
    name: "RequiredError";
    constructor(api: string, method: string, field: string);
}

/**
 * no description
 */
declare class AIApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param createConversationRequest
     */
    createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest
     */
    sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param singleAnswerRequest
     */
    singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class AIApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConversation
     * @throws ApiException if the response code was not in [200, 299]
     */
    createConversation(response: ResponseContext): Promise<Conversation>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
    sendMessage(response: ResponseContext): Promise<Array<ResponseMessage>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to singleAnswer
     * @throws ApiException if the response code was not in [200, 299]
     */
    singleAnswer(response: ResponseContext): Promise<ResponseMessage>;
}

/**
 * no description
 */
declare class AuthenticationApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.
     */
    getCurrentUserInfo(_options?: Configuration): Promise<RequestContext>;
    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.
     */
    getCurrentUserToken(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.
     * @param getCustomAccessTokenRequest
     */
    getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getObjectAccessTokenRequest
     */
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.
     * @param loginRequest
     */
    login(loginRequest: LoginRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.
     */
    logout(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param validateTokenRequest
     */
    validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class AuthenticationApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCurrentUserInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
    getCurrentUserInfo(response: ResponseContext): Promise<User>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCurrentUserToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getCurrentUserToken(response: ResponseContext): Promise<GetTokenResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCustomAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getCustomAccessToken(response: ResponseContext): Promise<AccessToken>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getFullAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getFullAccessToken(response: ResponseContext): Promise<Token>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getObjectAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getObjectAccessToken(response: ResponseContext): Promise<Token>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to login
     * @throws ApiException if the response code was not in [200, 299]
     */
    login(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to logout
     * @throws ApiException if the response code was not in [200, 299]
     */
    logout(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to revokeToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    revokeToken(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to validateToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    validateToken(response: ResponseContext): Promise<TokenValidationResponse>;
}

/**
 * no description
 */
declare class ConnectionsApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request
     */
    updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<RequestContext>;
}
declare class ConnectionsApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    createConnection(response: ResponseContext): Promise<CreateConnectionResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteConnection(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConnectionV2
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteConnectionV2(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to downloadConnectionMetadataChanges
     * @throws ApiException if the response code was not in [200, 299]
     */
    downloadConnectionMetadataChanges(response: ResponseContext): Promise<HttpFile>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchConnectionDiffStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchConnectionDiffStatus(response: ResponseContext): Promise<FetchConnectionDiffStatusResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchConnection(response: ResponseContext): Promise<Array<SearchConnectionResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateConnection(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConnectionV2
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateConnectionV2(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class CustomActionApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class CustomActionApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    createCustomAction(response: ResponseContext): Promise<ResponseCustomAction>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteCustomAction(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchCustomActions
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchCustomActions(response: ResponseContext): Promise<Array<ResponseCustomAction>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateCustomAction(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class DBTApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.
     * @param dbtConnectionRequest
     */
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtGenerateSyncTmlRequest
     */
    dbtGenerateSyncTml(dbtGenerateSyncTmlRequest: DbtGenerateSyncTmlRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.
     * @param dbtGenerateTmlRequest
     */
    dbtGenerateTml(dbtGenerateTmlRequest: DbtGenerateTmlRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.
     */
    dbtSearch(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.
     * @param updateDbtConnectionRequest
     */
    updateDbtConnection(updateDbtConnectionRequest: UpdateDbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class DBTApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtConnection(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtGenerateSyncTml
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtGenerateSyncTml(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtGenerateTml
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtGenerateTml(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtSearch
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtSearch(response: ResponseContext): Promise<Array<DbtSearchResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteDbtConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteDbtConnection(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateDbtConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateDbtConnection(response: ResponseContext): Promise<any>;
}

/**
 * no description
 */
declare class DataApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class DataApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAnswerData
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAnswerData(response: ResponseContext): Promise<AnswerDataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLiveboardData
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchLiveboardData(response: ResponseContext): Promise<LiveboardDataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchData
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchData(response: ResponseContext): Promise<SearchDataResponse>;
}

/**
 * no description
 */
declare class GroupsApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class GroupsApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
    createUserGroup(response: ResponseContext): Promise<UserGroupResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteUserGroup(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
    importUserGroups(response: ResponseContext): Promise<ImportUserGroupsResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchUserGroups(response: ResponseContext): Promise<Array<UserGroupResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateUserGroup(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class LogApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class LogApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchLogs(response: ResponseContext): Promise<Array<LogResponse>>;
}

/**
 * no description
 */
declare class MetadataApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *  Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.
     * @param copyObjectRequest
     */
    copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLBatchedRequest
     */
    exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.
     * @param fetchAsyncImportTaskStatusRequest
     */
    fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.
     * @param importMetadataTMLAsyncRequest
     */
    importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class MetadataApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to copyObject
     * @throws ApiException if the response code was not in [200, 299]
     */
    copyObject(response: ResponseContext): Promise<ResponseCopyObject>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteMetadata(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportMetadataTML
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportMetadataTML(response: ResponseContext): Promise<Array<any>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportMetadataTMLBatched
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportMetadataTMLBatched(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAnswerSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAnswerSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAsyncImportTaskStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAsyncImportTaskStatus(response: ResponseContext): Promise<GetAsyncImportStatusResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLiveboardSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchLiveboardSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importMetadataTML
     * @throws ApiException if the response code was not in [200, 299]
     */
    importMetadataTML(response: ResponseContext): Promise<Array<any>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importMetadataTMLAsync
     * @throws ApiException if the response code was not in [200, 299]
     */
    importMetadataTMLAsync(response: ResponseContext): Promise<ImportEPackAsyncTaskStatus>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchMetadata(response: ResponseContext): Promise<Array<MetadataSearchResponse>>;
}

/**
 * no description
 */
declare class OrgsApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class OrgsApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
    createOrg(response: ResponseContext): Promise<OrgResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteOrg(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchOrgs
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchOrgs(response: ResponseContext): Promise<Array<OrgResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateOrg(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class ReportsApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Answer.  #### Usage guidelines   In the request body, either provide the GUID or name of the answer, or provide the answer session id. By default, answer is exported from latest generation number of answer session. Optionally, you can also provide the generation number of the session. Also provide the `file_format` for the report. The default file format is CSV. In case of session id, only PNG & CSV file format are allowed.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG. Liveboard download as XLSX and CSV is not supported.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is PDF. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class ReportsApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportAnswerReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportAnswerReport(response: ResponseContext): Promise<HttpFile>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportLiveboardReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportLiveboardReport(response: ResponseContext): Promise<HttpFile>;
}

/**
 * no description
 */
declare class RolesApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *  Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.
     * @param searchRolesRequest
     */
    searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class RolesApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createRole
     * @throws ApiException if the response code was not in [200, 299]
     */
    createRole(response: ResponseContext): Promise<RoleResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteRole
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteRole(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchRoles
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchRoles(response: ResponseContext): Promise<Array<SearchRoleResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateRole
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateRole(response: ResponseContext): Promise<RoleResponse>;
}

/**
 * no description
 */
declare class SchedulesApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.
     * @param searchSchedulesRequest
     */
    searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class SchedulesApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createSchedule
     * @throws ApiException if the response code was not in [200, 299]
     */
    createSchedule(response: ResponseContext): Promise<ResponseSchedule>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteSchedule
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteSchedule(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchSchedules
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchSchedules(response: ResponseContext): Promise<Array<ResponseSchedule>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateSchedule
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateSchedule(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class SecurityApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.
     * @param shareMetadataRequest
     */
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class SecurityApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assignChangeAuthor
     * @throws ApiException if the response code was not in [200, 299]
     */
    assignChangeAuthor(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOfPrincipals
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchPermissionsOfPrincipals(response: ResponseContext): Promise<PermissionOfPrincipalsResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOnMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchPermissionsOnMetadata(response: ResponseContext): Promise<PermissionOfMetadataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to shareMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    shareMetadata(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class SystemApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.
     * @param updateSystemConfigRequest
     */
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class SystemApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    getSystemConfig(response: ResponseContext): Promise<SystemConfig>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemInformation
     * @throws ApiException if the response code was not in [200, 299]
     */
    getSystemInformation(response: ResponseContext): Promise<SystemInfo>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemOverrideInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
    getSystemOverrideInfo(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateSystemConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateSystemConfig(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class TagsApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.
     * @param searchTagsRequest
     */
    searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class TagsApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assignTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    assignTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    createTag(response: ResponseContext): Promise<Tag>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchTags
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchTags(response: ResponseContext): Promise<Array<Tag>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to unassignTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    unassignTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateTag(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class ThoughtSpotRestApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.
     * @param activateUserRequest
     */
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.
     * @param copyObjectRequest
     */
    copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param createConversationRequest
     */
    createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.
     * @param dbtConnectionRequest
     */
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtGenerateSyncTmlRequest
     */
    dbtGenerateSyncTml(dbtGenerateSyncTmlRequest: DbtGenerateSyncTmlRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.
     * @param dbtGenerateTmlRequest
     */
    dbtGenerateTml(dbtGenerateTmlRequest: DbtGenerateTmlRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.
     */
    dbtSearch(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.
     * @param deactivateUserRequest
     */
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Answer.  #### Usage guidelines   In the request body, either provide the GUID or name of the answer, or provide the answer session id. By default, answer is exported from latest generation number of answer session. Optionally, you can also provide the generation number of the session. Also provide the `file_format` for the report. The default file format is CSV. In case of session id, only PNG & CSV file format are allowed.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG. Liveboard download as XLSX and CSV is not supported.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is PDF. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLBatchedRequest
     */
    exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.
     * @param fetchAsyncImportTaskStatusRequest
     */
    fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param forceLogoutUsersRequest
     */
    forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.
     */
    getCurrentUserInfo(_options?: Configuration): Promise<RequestContext>;
    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.
     */
    getCurrentUserToken(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.
     * @param getCustomAccessTokenRequest
     */
    getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getObjectAccessTokenRequest
     */
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.
     * @param importMetadataTMLAsyncRequest
     */
    importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param importUsersRequest
     */
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.
     * @param loginRequest
     */
    login(loginRequest: LoginRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.
     */
    logout(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.
     * @param searchRolesRequest
     */
    searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.
     * @param searchSchedulesRequest
     */
    searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.
     * @param searchTagsRequest
     */
    searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest
     */
    sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.
     * @param shareMetadataRequest
     */
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param singleAnswerRequest
     */
    singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request
     */
    updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.
     * @param updateDbtConnectionRequest
     */
    updateDbtConnection(updateDbtConnectionRequest: UpdateDbtConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.
     * @param updateSystemConfigRequest
     */
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param validateMergeRequest
     */
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param validateTokenRequest
     */
    validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class ThoughtSpotRestApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to activateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    activateUser(response: ResponseContext): Promise<User>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assignChangeAuthor
     * @throws ApiException if the response code was not in [200, 299]
     */
    assignChangeAuthor(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assignTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    assignTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to changeUserPassword
     * @throws ApiException if the response code was not in [200, 299]
     */
    changeUserPassword(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to commitBranch
     * @throws ApiException if the response code was not in [200, 299]
     */
    commitBranch(response: ResponseContext): Promise<CommitResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to copyObject
     * @throws ApiException if the response code was not in [200, 299]
     */
    copyObject(response: ResponseContext): Promise<ResponseCopyObject>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    createConfig(response: ResponseContext): Promise<RepoConfigObject>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    createConnection(response: ResponseContext): Promise<CreateConnectionResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConversation
     * @throws ApiException if the response code was not in [200, 299]
     */
    createConversation(response: ResponseContext): Promise<Conversation>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    createCustomAction(response: ResponseContext): Promise<ResponseCustomAction>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
    createOrg(response: ResponseContext): Promise<OrgResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createRole
     * @throws ApiException if the response code was not in [200, 299]
     */
    createRole(response: ResponseContext): Promise<RoleResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createSchedule
     * @throws ApiException if the response code was not in [200, 299]
     */
    createSchedule(response: ResponseContext): Promise<ResponseSchedule>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    createTag(response: ResponseContext): Promise<Tag>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    createUser(response: ResponseContext): Promise<User>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
    createUserGroup(response: ResponseContext): Promise<UserGroupResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtConnection(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtGenerateSyncTml
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtGenerateSyncTml(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtGenerateTml
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtGenerateTml(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dbtSearch
     * @throws ApiException if the response code was not in [200, 299]
     */
    dbtSearch(response: ResponseContext): Promise<Array<DbtSearchResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deactivateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    deactivateUser(response: ResponseContext): Promise<ResponseActivationURL>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteConfig(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteConnection(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConnectionV2
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteConnectionV2(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteCustomAction(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteDbtConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteDbtConnection(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteMetadata(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteOrg(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteRole
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteRole(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteSchedule
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteSchedule(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteUser(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteUserGroup(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deployCommit
     * @throws ApiException if the response code was not in [200, 299]
     */
    deployCommit(response: ResponseContext): Promise<Array<DeployResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to downloadConnectionMetadataChanges
     * @throws ApiException if the response code was not in [200, 299]
     */
    downloadConnectionMetadataChanges(response: ResponseContext): Promise<HttpFile>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportAnswerReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportAnswerReport(response: ResponseContext): Promise<HttpFile>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportLiveboardReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportLiveboardReport(response: ResponseContext): Promise<HttpFile>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportMetadataTML
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportMetadataTML(response: ResponseContext): Promise<Array<any>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportMetadataTMLBatched
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportMetadataTMLBatched(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAnswerData
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAnswerData(response: ResponseContext): Promise<AnswerDataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAnswerSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAnswerSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchAsyncImportTaskStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAsyncImportTaskStatus(response: ResponseContext): Promise<GetAsyncImportStatusResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchConnectionDiffStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchConnectionDiffStatus(response: ResponseContext): Promise<FetchConnectionDiffStatusResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLiveboardData
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchLiveboardData(response: ResponseContext): Promise<LiveboardDataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLiveboardSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchLiveboardSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchLogs(response: ResponseContext): Promise<Array<LogResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOfPrincipals
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchPermissionsOfPrincipals(response: ResponseContext): Promise<PermissionOfPrincipalsResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOnMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchPermissionsOnMetadata(response: ResponseContext): Promise<PermissionOfMetadataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to forceLogoutUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
    forceLogoutUsers(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCurrentUserInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
    getCurrentUserInfo(response: ResponseContext): Promise<User>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCurrentUserToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getCurrentUserToken(response: ResponseContext): Promise<GetTokenResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getCustomAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getCustomAccessToken(response: ResponseContext): Promise<AccessToken>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getFullAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getFullAccessToken(response: ResponseContext): Promise<Token>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getObjectAccessToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    getObjectAccessToken(response: ResponseContext): Promise<Token>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    getSystemConfig(response: ResponseContext): Promise<SystemConfig>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemInformation
     * @throws ApiException if the response code was not in [200, 299]
     */
    getSystemInformation(response: ResponseContext): Promise<SystemInfo>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getSystemOverrideInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
    getSystemOverrideInfo(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importMetadataTML
     * @throws ApiException if the response code was not in [200, 299]
     */
    importMetadataTML(response: ResponseContext): Promise<Array<any>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importMetadataTMLAsync
     * @throws ApiException if the response code was not in [200, 299]
     */
    importMetadataTMLAsync(response: ResponseContext): Promise<ImportEPackAsyncTaskStatus>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
    importUserGroups(response: ResponseContext): Promise<ImportUserGroupsResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
    importUsers(response: ResponseContext): Promise<ImportUsersResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to login
     * @throws ApiException if the response code was not in [200, 299]
     */
    login(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to logout
     * @throws ApiException if the response code was not in [200, 299]
     */
    logout(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resetUserPassword
     * @throws ApiException if the response code was not in [200, 299]
     */
    resetUserPassword(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to revertCommit
     * @throws ApiException if the response code was not in [200, 299]
     */
    revertCommit(response: ResponseContext): Promise<RevertResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to revokeToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    revokeToken(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchCommits
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchCommits(response: ResponseContext): Promise<Array<CommitHistoryResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchConfig(response: ResponseContext): Promise<Array<RepoConfigObject>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchConnection(response: ResponseContext): Promise<Array<SearchConnectionResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchCustomActions
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchCustomActions(response: ResponseContext): Promise<Array<ResponseCustomAction>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchData
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchData(response: ResponseContext): Promise<SearchDataResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchMetadata(response: ResponseContext): Promise<Array<MetadataSearchResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchOrgs
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchOrgs(response: ResponseContext): Promise<Array<OrgResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchRoles
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchRoles(response: ResponseContext): Promise<Array<SearchRoleResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchSchedules
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchSchedules(response: ResponseContext): Promise<Array<ResponseSchedule>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchTags
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchTags(response: ResponseContext): Promise<Array<Tag>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchUserGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchUserGroups(response: ResponseContext): Promise<Array<UserGroupResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchUsers(response: ResponseContext): Promise<Array<User>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
    sendMessage(response: ResponseContext): Promise<Array<ResponseMessage>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to shareMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    shareMetadata(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to singleAnswer
     * @throws ApiException if the response code was not in [200, 299]
     */
    singleAnswer(response: ResponseContext): Promise<ResponseMessage>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to unassignTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    unassignTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateConfig(response: ResponseContext): Promise<RepoConfigObject>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateConnection(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConnectionV2
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateConnectionV2(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateCustomAction(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateDbtConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateDbtConnection(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateOrg
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateOrg(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateRole
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateRole(response: ResponseContext): Promise<RoleResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateSchedule
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateSchedule(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateSystemConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateSystemConfig(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateTag
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateTag(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateUser(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUserGroup
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateUserGroup(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to validateMerge
     * @throws ApiException if the response code was not in [200, 299]
     */
    validateMerge(response: ResponseContext): Promise<Array<DeployResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to validateToken
     * @throws ApiException if the response code was not in [200, 299]
     */
    validateToken(response: ResponseContext): Promise<TokenValidationResponse>;
}

/**
 * no description
 */
declare class UsersApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.
     * @param activateUserRequest
     */
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.
     * @param deactivateUserRequest
     */
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param forceLogoutUsersRequest
     */
    forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param importUsersRequest
     */
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class UsersApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to activateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    activateUser(response: ResponseContext): Promise<User>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to changeUserPassword
     * @throws ApiException if the response code was not in [200, 299]
     */
    changeUserPassword(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    createUser(response: ResponseContext): Promise<User>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deactivateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    deactivateUser(response: ResponseContext): Promise<ResponseActivationURL>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteUser(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to forceLogoutUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
    forceLogoutUsers(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to importUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
    importUsers(response: ResponseContext): Promise<ImportUsersResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resetUserPassword
     * @throws ApiException if the response code was not in [200, 299]
     */
    resetUserPassword(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchUsers
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchUsers(response: ResponseContext): Promise<Array<User>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateUser
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateUser(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class VersionControlApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param validateMergeRequest
     */
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class VersionControlApiResponseProcessor {
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to commitBranch
     * @throws ApiException if the response code was not in [200, 299]
     */
    commitBranch(response: ResponseContext): Promise<CommitResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    createConfig(response: ResponseContext): Promise<RepoConfigObject>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteConfig(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deployCommit
     * @throws ApiException if the response code was not in [200, 299]
     */
    deployCommit(response: ResponseContext): Promise<Array<DeployResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to revertCommit
     * @throws ApiException if the response code was not in [200, 299]
     */
    revertCommit(response: ResponseContext): Promise<RevertResponse>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchCommits
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchCommits(response: ResponseContext): Promise<Array<CommitHistoryResponse>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to searchConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    searchConfig(response: ResponseContext): Promise<Array<RepoConfigObject>>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateConfig(response: ResponseContext): Promise<RepoConfigObject>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to validateMerge
     * @throws ApiException if the response code was not in [200, 299]
     */
    validateMerge(response: ResponseContext): Promise<Array<DeployResponse>>;
}

declare class PromiseAIApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: AIApiRequestFactory, responseProcessor?: AIApiResponseProcessor);
    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param createConversationRequest
     */
    createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<Conversation>;
    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest
     */
    sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<Array<ResponseMessage>>;
    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param singleAnswerRequest
     */
    singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<ResponseMessage>;
}

declare class PromiseAuthenticationApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: AuthenticationApiRequestFactory, responseProcessor?: AuthenticationApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.
     */
    getCurrentUserInfo(_options?: Configuration): Promise<User>;
    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.
     */
    getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse>;
    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.
     * @param getCustomAccessTokenRequest
     */
    getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Promise<AccessToken>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getObjectAccessTokenRequest
     */
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later    Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.
     * @param loginRequest
     */
    login(loginRequest: LoginRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.
     */
    logout(_options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param validateTokenRequest
     */
    validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Promise<TokenValidationResponse>;
}

declare class PromiseConnectionsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ConnectionsApiRequestFactory, responseProcessor?: ConnectionsApiResponseProcessor);
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<HttpFile>;
    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<FetchConnectionDiffStatusResponse>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request
     */
    updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<void>;
}

declare class PromiseCustomActionApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: CustomActionApiRequestFactory, responseProcessor?: CustomActionApiResponseProcessor);
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseDBTApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: DBTApiRequestFactory, responseProcessor?: DBTApiResponseProcessor);
    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.
     * @param dbtConnectionRequest
     */
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtGenerateSyncTmlRequest
     */
    dbtGenerateSyncTml(dbtGenerateSyncTmlRequest: DbtGenerateSyncTmlRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.
     * @param dbtGenerateTmlRequest
     */
    dbtGenerateTml(dbtGenerateTmlRequest: DbtGenerateTmlRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.
     */
    dbtSearch(_options?: Configuration): Promise<Array<DbtSearchResponse>>;
    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.
     * @param updateDbtConnectionRequest
     */
    updateDbtConnection(updateDbtConnectionRequest: UpdateDbtConnectionRequest, _options?: Configuration): Promise<any>;
}

declare class PromiseDataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: DataApiRequestFactory, responseProcessor?: DataApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse>;
}

declare class PromiseGroupsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: GroupsApiRequestFactory, responseProcessor?: GroupsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseLogApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: LogApiRequestFactory, responseProcessor?: LogApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>>;
}

declare class PromiseMetadataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: MetadataApiRequestFactory, responseProcessor?: MetadataApiResponseProcessor);
    /**
     *  Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.
     * @param copyObjectRequest
     */
    copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Promise<ResponseCopyObject>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLBatchedRequest
     */
    exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.
     * @param fetchAsyncImportTaskStatusRequest
     */
    fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Promise<GetAsyncImportStatusResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.
     * @param importMetadataTMLAsyncRequest
     */
    importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Promise<ImportEPackAsyncTaskStatus>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>>;
}

declare class PromiseOrgsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: OrgsApiRequestFactory, responseProcessor?: OrgsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseReportsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ReportsApiRequestFactory, responseProcessor?: ReportsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Answer.  #### Usage guidelines   In the request body, either provide the GUID or name of the answer, or provide the answer session id. By default, answer is exported from latest generation number of answer session. Optionally, you can also provide the generation number of the session. Also provide the `file_format` for the report. The default file format is CSV. In case of session id, only PNG & CSV file format are allowed.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<HttpFile>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG. Liveboard download as XLSX and CSV is not supported.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is PDF. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<HttpFile>;
}

declare class PromiseRolesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: RolesApiRequestFactory, responseProcessor?: RolesApiResponseProcessor);
    /**
     *  Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    /**
     *  Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *  Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.
     * @param searchRolesRequest
     */
    searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>>;
    /**
     *  Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
}

declare class PromiseSchedulesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SchedulesApiRequestFactory, responseProcessor?: SchedulesApiResponseProcessor);
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.
     * @param searchSchedulesRequest
     */
    searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseSecurityApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SecurityApiRequestFactory, responseProcessor?: SecurityApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<PermissionOfPrincipalsResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<PermissionOfMetadataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.
     * @param shareMetadataRequest
     */
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseSystemApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SystemApiRequestFactory, responseProcessor?: SystemApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<SystemConfig>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<SystemInfo>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<any>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.
     * @param updateSystemConfigRequest
     */
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseTagsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: TagsApiRequestFactory, responseProcessor?: TagsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.
     * @param searchTagsRequest
     */
    searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>>;
    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseThoughtSpotRestApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ThoughtSpotRestApiRequestFactory, responseProcessor?: ThoughtSpotRestApiResponseProcessor);
    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.
     * @param activateUserRequest
     */
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<User>;
    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege and edit access to the objects are required.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse>;
    /**
     *  Makes a copy of an Answer or Liveboard saved in Atlas    Version: 10.3.0.cl or later   Creates a copy of a metadata object.  Requires at least view access to the metadata object being copied.  Upon successful execution, the API creates a copy of the metadata object specified in the API request and returns the ID of the new object.
     * @param copyObjectRequest
     */
    copyObject(copyObjectRequest: CopyObjectRequest, _options?: Configuration): Promise<ResponseCopyObject>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse>;
    /**
     *  Version: 10.4.0.cl or later   Creates a Conversation object to start an AI-driven conversation based on a specific data model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  This API requires the `metadata_identifier` parameter to define the context for the conversation.  You can also specify the tokens to initiate the conversation as shown in this example:  `\"tokens\": \"[tea],[sales],[type]\"`  If the API request is successful, ThoughtSpot returns the ID of the conversation.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param createConversationRequest
     */
    createConversation(createConversationRequest: CreateConversationRequest, _options?: Configuration): Promise<Conversation>;
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction>;
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse>;
    /**
     *  Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Creates a Role object in ThoughtSpot.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To create a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule>;
    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User>;
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign privileges * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse>;
    /**
     *   Version: 9.9.0.cl or later   Creates a DBT connection object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About create DBT connection DBT connection in ThoughtSpot is used by the user to define DBT credentials for cloud . The API needs  embrace connection, embrace database name, DBT url, import type, DBT account identifier, DBT project identifier, DBT access token and environment details (or) embrace connection, embrace database name, import type, file_content to create a connection object. To know more about DBT, see ThoughtSpot Product Documentation.
     * @param dbtConnectionRequest
     */
    dbtConnection(dbtConnectionRequest: DbtConnectionRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.9.0.cl or later   Resynchronize the existing list of models, tables, worksheet tml’s and import them to Thoughtspot based on the DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtGenerateSyncTmlRequest
     */
    dbtGenerateSyncTml(dbtGenerateSyncTmlRequest: DbtGenerateSyncTmlRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.9.0.cl or later   Generate required table and worksheet and import them.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About generate TML Models and Worksheets to be imported can be selected by the user as part of the API.
     * @param dbtGenerateTmlRequest
     */
    dbtGenerateTml(dbtGenerateTmlRequest: DbtGenerateTmlRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.9.0.cl or later   Gets a list of DBT connection objects by user and organization, available on the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About search DBT connection To get details of a specific DBT connection identifier, database connection identifier, database connection name, database name, project name, project identifier, environment identifier , import type and author.
     */
    dbtSearch(_options?: Configuration): Promise<Array<DbtSearchResponse>>;
    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.
     * @param deactivateUserRequest
     */
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<ResponseActivationURL>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 10.4.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.
     * @param connectionIdentifier Unique ID or name of the connection.
     */
    deleteConnectionV2(connectionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.9.0.cl or later   Removes the specified DBT connection object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)
     * @param dbtConnectionIdentifier Unique ID of the DBT Connection.
     */
    deleteDbtConnection(dbtConnectionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *  Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Deletes a Role object from the ThoughtSpot system.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To delete a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.    If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    /**
     *   Version: 9.9.0.cl or later   Exports the difference in connection metadata between CDW and ThoughtSpot  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:   - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  To download the connection metadata difference between ThoughtSpot and CDW, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    downloadConnectionMetadataChanges(connectionIdentifier: string, _options?: Configuration): Promise<HttpFile>;
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Answer.  #### Usage guidelines   In the request body, either provide the GUID or name of the answer, or provide the answer session id. By default, answer is exported from latest generation number of answer session. Optionally, you can also provide the generation number of the session. Also provide the `file_format` for the report. The default file format is CSV. In case of session id, only PNG & CSV file format are allowed.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<HttpFile>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG. Liveboard download as XLSX and CSV is not supported.  Requires `DATADOWNLOADING` (**Can download data**) privilege and view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is PDF. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  Optionally, you can define [runtime overrides](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_runtime_overrides) to apply to the Answer data.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes, including ad hoc changes to visualizations. For more information, see [Liveboard Report API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_liveboard_report_api).
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<HttpFile>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATADOWNLOADING` (**Can download Data**) and at least view access to the metadata object.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_export_a_tml).
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 10.1.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLBatchedRequest
     */
    exportMetadataTMLBatched(exportMetadataTMLBatchedRequest: ExportMetadataTMLBatchedRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.  The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_apis).
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 10.4.0.cl or later   Gets information about the status of the TML async import task scheduled using the `/api/rest/2.0/metadata/tml/async/import` API call.  To fetch the task details, specify the ID of the TML async import task.    Requires access to the task ID. The API allows users who initiated the asynchronous TML import via `/api/rest/2.0/metadata/tml/async/import` to view the status of their tasks.  Users with administration privilege can view the status of all import tasks initiated by the users in their Org.  #### Usage guidelines  See [TML API Documentation](https://developers.thoughtspot.com/docs/tml#_fetch_status_of_the_tml_import_task) for usage guidelines.
     * @param fetchAsyncImportTaskStatusRequest
     */
    fetchAsyncImportTaskStatus(fetchAsyncImportTaskStatusRequest: FetchAsyncImportTaskStatusRequest, _options?: Configuration): Promise<GetAsyncImportStatusResponse>;
    /**
     *   Version: 9.9.0.cl or later   Validates the difference in connection metadata between CDW and ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  Returns a boolean indicating whether there is any difference between the connection metadata at ThoughtSpot and CDW.  To get the connection metadata difference status, pass the connection GUID as `connection_identifier` in the API request.
     * @param connectionIdentifier GUID of the connection
     */
    fetchConnectionDiffStatus(connectionIdentifier: string, _options?: Configuration): Promise<FetchConnectionDiffStatusResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.  For more information, and see [Liveboard data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_fetch_liveboard_data_api).
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the [Admin Control](https://developers.thoughtspot.com/docs/rbac#_admin_control) privileges are required.   #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance  For more information see [Audit logs Documentation](https://developers.thoughtspot.com/docs/audit-logs).
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.   #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<PermissionOfPrincipalsResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<PermissionOfMetadataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param forceLogoutUsersRequest
     */
    forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user\'s privilege and object access permissions.
     */
    getCurrentUserInfo(_options?: Configuration): Promise<User>;
    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user\'s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.
     */
    getCurrentUserToken(_options?: Configuration): Promise<GetTokenResponse>;
    /**
     *   Version: 10.4.0.cl or later   Gets an authentication token with custom rules and security attributes and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  To add a new user and assign privileges during auto creation, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  To assign security attributes with filter rules and Parameters to the JWT token, you\'ll need administrator privileges and edit access to the data source (Worksheet or Model). If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege and edit access to the data source is required.  #### Usage guidelines  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key`.  To generate a `secret_key` on your cluster, the administrator must enable [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable) in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  ##### Attribute-Based Access Control (ABAC) with tokens  To implement Attribute-Based Access Control (ABAC) and assign security entitlements to users during session creation, you can generate a token with custom filtering rules and Parameters in the `filter_rules` and `parameter_values` array respectively. These attributes can be configured to persist on a specific set of objects for user sessions initiated using the token. Once defined, the rules are added to the user\'s `access_control_properties` object, after which all sessions will use the persisted values.  For more information, see [ABAC via tokens Documentation](https://developers.thoughtspot.com/docs/api-authv2#_get_tokens_with_custom_rules_and_filter_conditions).  ##### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `groups`  Set `auto_create` to `true` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true` in the API request, the user properties such as the display name, email, Org and group assignment will not be updated with new values.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  ##### Important point to note All options in the token creation APIs that define access to the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Persist options such as  `APPEND`, `REPLACE`, `RESET` will persist security parameters on the user profile when the token is created, while Persist option `NONE` will not persist anything but will be honoured in the session.
     * @param getCustomAccessTokenRequest
     */
    getCustomAccessToken(getCustomAccessTokenRequest: GetCustomAccessTokenRequest, _options?: Configuration): Promise<AccessToken>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password`, or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, define the following attributes:  * `auto_create` * `username` * `display_name` * `email` * `group_identifiers`  Set `auto_create` to `True` if the user is not available in ThoughtSpot. If the user already exists in ThoughtSpot and the `auto_create` parameter is set to `true`, the API call will update user properties like display name, email and group assignment.  For more information, see [Just-in-time provisioning](https://developers.thoughtspot.com/docs/just-in-time-provisioning).  To add a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled, the `CONTROL_TRUSTED_AUTH`(**Can Enable or Disable Trusted Authentication**) privilege is required.  #### Attribute-Based Access Control (ABAC) with tokens  You can define Attribute-Based Access Control (ABAC) parameters to assign security entitlements to users during session creation. For more information, see [ABAC via token](https://developers.thoughtspot.com/docs/abac-user-parameters).  #### Important point to note All options in the token creation APIs changing the content in ThoughtSpot will do so during the token creation and not when the token is being used for authentication. For example, `auto_create:true` will create the user when the authentication token is created. Similarly, using `user_parameters` with `persist: true` persists security parameters on the user profile when the token is created and not during authentication.
     * @param getObjectAccessTokenRequest
     */
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<SystemConfig>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `SYSTEM_INFO_ADMINISTRATION` (**Can view system activities**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<SystemInfo>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.  For more information, see [TML Documentation](https://developers.thoughtspot.com/docs/tml#_import_a_tml).
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 10.4.0.cl or later   Schedules a task to import [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot. You can use this API endpoint to process TML objects asynchronously when importing TMLs of large and complex metadata objects into ThoughtSpot. Unlike the synchronous import TML operation, the API processes TML data in the background and returns a task ID, which can be used to check the status of the import task via `/api/rest/2.0/metadata/tml/async/status` API endpoint.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege, and edit access to the TML objects.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following Data control privileges may be required: - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### Usage guidelines  See [Async TML API Documentation](https://developers.thoughtspot.com/docs/tml#_import_tml_objects_asynchronously) for usage guidelines.
     * @param importMetadataTMLAsyncRequest
     */
    importMetadataTMLAsync(importMetadataTMLAsyncRequest: ImportMetadataTMLAsyncRequest, _options?: Configuration): Promise<ImportEPackAsyncTaskStatus>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param importUsersRequest
     */
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse>;
    /**
     *   Version: 9.0.0.cl or later    Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using `username` and `password` attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.
     * @param loginRequest
     */
    login(loginRequest: LoginRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.
     */
    logout(_options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse>;
    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source object (Worksheet or View).  #### Usage guidelines  To search data, specify the data source GUID in `logical_table_identifier`. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example:  ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```  For more information about the `query_string` format and data source attribute, see [Search data API](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_search_data_api).    The `record_size` attribute determines the number of records to retrieve in an API call. For more information about pagination, record size, and maximum row limit, see [Pagination and record size settings](https://developers.thoughtspot.com/docs/fetch-data-and-report-apis#_pagination_settings_for_data_and_report_api).
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records:  - `tag_identifiers` - `type` - `created_by_user_identifiers` - `modified_by_user_identifiers` - `owned_by_user_identifiers` - `exclude_objects` - `include_auto_created_objects` - `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>>;
    /**
     *  Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later   Gets a list of Role objects from the ThoughtSpot system.  Available if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To search for Roles, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.  To get details of a specific Role object, specify the GUID or name. You can also filter the API response based on user group and Org identifiers, privileges assigned to the Role, and deprecation status.
     * @param searchRolesRequest
     */
    searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>>;
    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.
     * @param searchSchedulesRequest
     */
    searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of tag objects available on the ThoughtSpot system. To get details of a specific tag object, specify the GUID or name.  Any authenticated user can search for tag objects.
     * @param searchTagsRequest
     */
    searchTags(searchTagsRequest: SearchTagsRequest, _options?: Configuration): Promise<Array<Tag>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of user group objects from the ThoughtSpot system.  To get details of a specific user group, specify the user group GUID or name. You can also filter the API response based on User ID, Org ID, Role ID, type of group, sharing visibility, privileges assigned to the group, and the Liveboard IDs assigned to the users in the group.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<Array<User>>;
    /**
     *  Version: 10.4.0.cl or later   Allows sending a follow-up message to an ongoing conversation within the context of the metadata model.  Requires at least view access to the metadata object specified in the request.  #### Usage guidelines  The API requires you to specify the `conversation_identifier` in the request path, and a `metadata_identifier` and `message` string in the request body.  If the API request is successful, ThoughtSpot returns the session ID, tokens used in the conversation, and visualization type.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param conversationIdentifier Unique identifier of the conversation.
     * @param sendMessageRequest
     */
    sendMessage(conversationIdentifier: string, sendMessageRequest: SendMessageRequest, _options?: Configuration): Promise<Array<ResponseMessage>>;
    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.
     * @param shareMetadataRequest
     */
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void>;
    /**
     *  Version: 10.4.0.cl or later   Processes a natural language query and returns an AI-generated response based on a specified data model.  Requires at least view access to the metadata object specified in the request.  > ###### Note: > * This endpoint is currently in Beta. Breaking changes may be introduced before the endpoint is made Generally Available. > * This endpoint requires Spotter - please contact ThoughtSpot support to enable Spotter on your cluster.
     * @param singleAnswerRequest
     */
    singleAnswer(singleAnswerRequest: SingleAnswerRequest, _options?: Configuration): Promise<ResponseMessage>;
    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 10.4.0.cl or later   Updates a connection object.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) privilege is required.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param connectionIdentifier Unique ID or name of the connection.
     * @param updateConnectionV2Request
     */
    updateConnectionV2(connectionIdentifier: string, updateConnectionV2Request: UpdateConnectionV2Request, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `DEVELOPER` (**Has developer privilege**) privilege is required.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.9.0.cl or later   Updates a DBT connection object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege or `DATAMANAGEMENT` (**Can manage data ThoughtSpot**) privilege, along with an existing DBT connection. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the following data control privileges may be required:  - `CAN_MANAGE_CUSTOM_CALENDAR`(**Can manage custom calendars**) - `CAN_CREATE_OR_EDIT_CONNECTIONS` (**Can create/edit Connections**) - `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**)  #### About update DBT connection You can modify DBT connection object properties such as embrace connection name, embrace database name, import type, account identifier, access token, project identifier and environment (or) embrace connection, embrace database name, import type, file_content settings.
     * @param updateDbtConnectionRequest
     */
    updateDbtConnection(updateDbtConnectionRequest: UpdateDbtConnectionRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `ORG_ADMINISTRATION` (**Can manage Orgs**) privilege is required.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<void>;
    /**
     *  Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later   Updates the properties of a Role object.  Available only if [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance. To update a Role, the `ROLE_ADMINISTRATION` (**Can manage roles**) privilege is required.
     * @param roleIdentifier Unique ID or name of the Role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `JOBSCHEDULING` (**Can schedule for others**) privilege is required.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration data in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `APPLICATION_ADMINISTRATION` (**Can manage application settings**) privilege is required.
     * @param updateSystemConfigRequest
     */
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `TAGMANAGEMENT` (**Can manage tags**) privilege is required to create, edit, and delete tags.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `GROUP_ADMINISTRATION` (**Can manage groups**) privilege is required.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param validateMergeRequest
     */
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    /**
     *   Version: 9.12.0.cl or later    Validates the authentication token specified in the API request.  If your token is not valid, [Get a new token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param validateTokenRequest
     */
    validateToken(validateTokenRequest: ValidateTokenRequest, _options?: Configuration): Promise<TokenValidationResponse>;
}

declare class PromiseUsersApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor);
    /**
     *   Version: 9.7.0.cl or later   Activates a deactivated user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To activate an inactive user account, the API request body must include the following information:  - Username or the GUID of the user account. - Auth token generated for the deactivated user. The auth token is sent in the API response when a user is deactivated. - Password for the user account.
     * @param activateUserRequest
     */
    activateUser(activateUserRequest: ActivateUserRequest, _options?: Configuration): Promise<User>;
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User>;
    /**
     *   Version: 9.7.0.cl or later   Deactivates a user account.  Requires `ADMINISTRATION` (**Can administer Thoughtspot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  To deactivate a user account, the API request body must include the following information:  - Username or the GUID of the user account - Base URL of the ThoughtSpot instance  If the API request is successful, ThoughtSpot returns the activation URL in the response. The activation URL is valid for 14 days and can be used to re-activate the account and reset the password of the deactivated account.
     * @param deactivateUserRequest
     */
    deactivateUser(deactivateUserRequest: DeactivateUserRequest, _options?: Configuration): Promise<ResponseActivationURL>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param forceLogoutUsersRequest
     */
    forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param importUsersRequest
     */
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse>;
    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<Array<User>>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege. If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance, the `USER_ADMINISTRATION` (**Can manage users**) privilege is required.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseVersionControlApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: VersionControlApiRequestFactory, responseProcessor?: VersionControlApiResponseProcessor);
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires at least edit access to objects used in the commit operation.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).  **Note**: ThoughtSpot supports only GitHub / GitHub Enterprise for CI/CD.
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires at least edit access to the objects used in the deploy operation.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires at least edit access to objects.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/git-integration).
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_VERSION_CONTROL` (**Can toggle version control for objects**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `DATAMANAGEMENT` (**Can manage data**) privilege.  If [Role-Based Access Control (RBAC)](https://developers.thoughtspot.com/docs/rbac) is enabled on your instance on your instance, the `CAN_MANAGE_WORKSHEET_VIEWS_TABLES` (**Can manage data models**) privilege and edit access to the metadata objects.
     * @param validateMergeRequest
     */
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
}

/**
 * creates a bearer authentication configuration using params or a token provider
 * @param url the base url of the server
 * @param paramOrTokenProvider either a GetFullAccessTokenRequest or a TokenProvider ,
 * Pass a GetFullAccessTokenRequest which contains the object body required to get a full access token , or
 * funtion which retuns a promise of a string which is the full access token
 * @beta
 */
declare const createBearerAuthenticationConfig: (url: string, paramOrTokenProvider: GetFullAccessTokenRequest | (() => Promise<string>)) => Configuration;

export { PromiseAIApi as AIApi, APIKey, APIKeyInput, AccessToken, ActionConfig, ActionConfigInput, ActionConfigInputCreate, ActionConfigInputCreatePositionEnum, ActionConfigInputPositionEnum, ActionDetails, ActionDetailsInput, ActionDetailsInputCreate, ActivateUserRequest, AnswerContent, AnswerDataResponse, ApiException, ApiKeyConfiguration, AssignChangeAuthorRequest, AssignTagRequest, AssociateMetadataInput, AssociateMetadataInputCreate, AssociateMetadataInputCreateTypeEnum, AssociateMetadataInputTypeEnum, AuthMethods, AuthMethodsConfiguration, Authentication, PromiseAuthenticationApi as AuthenticationApi, AuthenticationInput, Author, AuthorMetadataTypeInput, AuthorMetadataTypeInputTypeEnum, AuthorType, BaseServerConfiguration, BasicAuth, BasicAuthInput, BearerAuthAuthentication, CALLBACK, CALLBACKInput, CALLBACKInputMandatory, ChangeUserPasswordRequest, Column, CommitBranchRequest, CommitFileType, CommitHistoryResponse, CommitResponse, CommiterType, Configuration, ConnectionInput, PromiseConnectionsApi as ConnectionsApi, Conversation, CopyObjectRequest, CopyObjectRequestTypeEnum, CreateConfigRequest, CreateConnectionRequest, CreateConnectionRequestDataWarehouseTypeEnum, CreateConnectionResponse, CreateConnectionResponseDataWarehouseTypeEnum, CreateConversationRequest, CreateCustomActionRequest, CreateCustomActionRequestActionDetails, CreateCustomActionRequestDefaultActionConfig, CreateOrgRequest, CreateRoleRequest, CreateRoleRequestPrivilegesEnum, CreateScheduleRequest, CreateScheduleRequestFileFormatEnum, CreateScheduleRequestFrequency, CreateScheduleRequestLiveboardOptions, CreateScheduleRequestMetadataTypeEnum, CreateScheduleRequestPdfOptions, CreateScheduleRequestPdfOptionsPageSizeEnum, CreateScheduleRequestRecipientDetails, CreateScheduleRequestTimeZoneEnum, CreateTagRequest, CreateUserGroupRequest, CreateUserGroupRequestPrivilegesEnum, CreateUserGroupRequestTypeEnum, CreateUserGroupRequestVisibilityEnum, CreateUserRequest, CreateUserRequestAccountStatusEnum, CreateUserRequestAccountTypeEnum, CreateUserRequestPreferredLocaleEnum, CreateUserRequestVisibilityEnum, CronExpression, CronExpressionInput, PromiseCustomActionApi as CustomActionApi, CustomActionMetadataTypeInput, CustomActionMetadataTypeInputTypeEnum, PromiseDBTApi as DBTApi, PromiseDataApi as DataApi, DataWarehouseObjectInput, DataWarehouseObjects, Database, DbtConnectionRequest, DbtConnectionRequestImportTypeEnum, DbtGenerateSyncTmlRequest, DbtGenerateTmlRequest, DbtGenerateTmlRequestImportWorksheetsEnum, DbtSearchResponse, DeactivateUserRequest, DefaultActionConfig, DefaultActionConfigInput, DefaultActionConfigInputCreate, DefaultActionConfigSearchInput, DeleteConfigRequest, DeleteConnectionRequest, DeleteMetadataRequest, DeleteMetadataTypeInput, DeleteMetadataTypeInputTypeEnum, DeployCommitRequest, DeployCommitRequestDeployPolicyEnum, DeployCommitRequestDeployTypeEnum, DeployResponse, ErrorResponse, ExcludeMetadataListItemInput, ExcludeMetadataListItemInputTypeEnum, ExportAnswerReportRequest, ExportAnswerReportRequestFileFormatEnum, ExportLiveboardReportRequest, ExportLiveboardReportRequestFileFormatEnum, ExportLiveboardReportRequestPdfOptions, ExportLiveboardReportRequestPdfOptionsPageOrientationEnum, ExportLiveboardReportRequestPngOptions, ExportMetadataTMLBatchedRequest, ExportMetadataTMLBatchedRequestEdocFormatEnum, ExportMetadataTMLBatchedRequestMetadataTypeEnum, ExportMetadataTMLRequest, ExportMetadataTMLRequestEdocFormatEnum, ExportMetadataTMLRequestExportOptions, ExportMetadataTMLRequestExportSchemaVersionEnum, ExportMetadataTypeInput, ExportMetadataTypeInputTypeEnum, ExportOptions, FavoriteMetadataInput, FavoriteMetadataInputTypeEnum, FavoriteMetadataItem, FavoriteMetadataItemTypeEnum, FavoriteObjectOptionsInput, FetchAnswerDataRequest, FetchAnswerDataRequestDataFormatEnum, FetchAnswerSqlQueryRequest, FetchAsyncImportTaskStatusRequest, FetchAsyncImportTaskStatusRequestTaskStatusEnum, FetchConnectionDiffStatusResponse, FetchLiveboardDataRequest, FetchLiveboardDataRequestDataFormatEnum, FetchLiveboardSqlQueryRequest, FetchLogsRequest, FetchLogsRequestLogTypeEnum, FetchPermissionsOfPrincipalsRequest, FetchPermissionsOfPrincipalsRequestDefaultMetadataTypeEnum, FetchPermissionsOnMetadataRequest, FilterRules, FilterRulesOperatorEnum, ForceLogoutUsersRequest, Frequency, FrequencyInput, GenericInfo, GetAsyncImportStatusResponse, GetCustomAccessTokenRequest, GetCustomAccessTokenRequestPersistOptionEnum, GetFullAccessTokenRequest, GetObjectAccessTokenRequest, GetObjectAccessTokenRequestUserParameters, GetTokenResponse, GroupObject, PromiseGroupsApi as GroupsApi, GroupsImportListInput, GroupsImportListInputPrivilegesEnum, GroupsImportListInputTypeEnum, GroupsImportListInputVisibilityEnum, HttpBasicConfiguration, HttpBearerConfiguration, HttpException, HttpFile, HttpLibrary, HttpMethod, ImportEPackAsyncTaskStatus, ImportEPackAsyncTaskStatusImportPolicyEnum, ImportEPackAsyncTaskStatusTaskStatusEnum, ImportMetadataTMLAsyncRequest, ImportMetadataTMLAsyncRequestImportPolicyEnum, ImportMetadataTMLRequest, ImportMetadataTMLRequestImportPolicyEnum, ImportUser, ImportUserAccountStatusEnum, ImportUserAccountTypeEnum, ImportUserGroupsRequest, ImportUserGroupsResponse, ImportUserType, ImportUserVisibilityEnum, ImportUsersRequest, ImportUsersResponse, IsomorphicFetchHttpLibrary, JWTMetadataObject, JWTMetadataObjectTypeEnum, JWTParameter, JWTUserOptions, JWTUserOptionsFull, JWTUserOptionsParametersInner, LiveboardContent, LiveboardDataResponse, LiveboardOptions, LiveboardOptionsInput, PromiseLogApi as LogApi, LogResponse, LoginRequest, PromiseMetadataApi as MetadataApi, MetadataAssociationItem, MetadataInput, MetadataInputTypeEnum, MetadataListItemInput, MetadataListItemInputTypeEnum, MetadataObject, MetadataObjectTypeEnum, MetadataResponse, MetadataResponseTypeEnum, MetadataSearchResponse, MetadataSearchResponseMetadataTypeEnum, MetadataSearchSortOptions, MetadataSearchSortOptionsFieldNameEnum, MetadataSearchSortOptionsOrderEnum, PromiseMiddleware as Middleware, ModelTableList, OAuth2Configuration, ObjectIDAndName, Org, OrgInfo, OrgResponse, OrgResponseStatusEnum, OrgResponseVisibilityEnum, PromiseOrgsApi as OrgsApi, ParameterValues, ParametersListItem, ParametersListItemInput, PdfOptions, PdfOptionsInput, PdfOptionsInputPageOrientationEnum, PdfOptionsPageSizeEnum, PermissionInput, PermissionInputShareModeEnum, PermissionOfMetadataResponse, PermissionOfPrincipalsResponse, PermissionsMetadataTypeInput, PermissionsMetadataTypeInputTypeEnum, PngOptionsInput, PrincipalsInput, PrincipalsInputTypeEnum, PrincipalsListItem, PrincipalsListItemInput, PromiseHttpLibrary, RecipientDetails, RecipientDetailsInput, RepoConfigObject, PromiseReportsApi as ReportsApi, RequestBody, RequestContext, RequiredError, ResetUserPasswordRequest, ResponseActivationURL, ResponseBody, ResponseContext, ResponseCopyObject, ResponseCustomAction, ResponseMessage, ResponseMessageMessageTypeEnum, ResponseMessageVisualizationTypeEnum, ResponseSchedule, ResponseScheduleRun, RevertCommitRequest, RevertCommitRequestRevertPolicyEnum, RevertResponse, RevertedMetadata, RevokeTokenRequest, RiseSetter, Role, RoleResponse, RoleResponsePermissionEnum, RoleResponsePrivilegesEnum, PromiseRolesApi as RolesApi, RuntimeFilter, RuntimeFilters, RuntimeFiltersOperatorEnum, RuntimeParamOverride, RuntimeParameters, RuntimeSort, RuntimeSorts, RuntimeSortsOrderEnum, ScheduleHistoryRunsOptionsInput, PromiseSchedulesApi as SchedulesApi, SchedulesPdfOptionsInput, SchedulesPdfOptionsInputPageSizeEnum, SchemaObject, Scope, SearchCommitsRequest, SearchCommitsRequestMetadataTypeEnum, SearchConfigRequest, SearchConnectionRequest, SearchConnectionRequestAuthenticationTypeEnum, SearchConnectionRequestDataWarehouseObjectTypeEnum, SearchConnectionRequestDataWarehouseTypesEnum, SearchConnectionRequestSortOptions, SearchConnectionRequestSortOptionsFieldNameEnum, SearchConnectionRequestSortOptionsOrderEnum, SearchConnectionResponse, SearchConnectionResponseDataWarehouseTypeEnum, SearchCustomActionsRequest, SearchCustomActionsRequestDefaultActionConfig, SearchCustomActionsRequestTypeEnum, SearchDataRequest, SearchDataRequestDataFormatEnum, SearchDataResponse, SearchMetadataRequest, SearchMetadataRequestDependentObjectVersionEnum, SearchMetadataRequestFavoriteObjectOptions, SearchMetadataRequestSortOptions, SearchMetadataRequestSortOptionsFieldNameEnum, SearchMetadataRequestSortOptionsOrderEnum, SearchOrgsRequest, SearchOrgsRequestStatusEnum, SearchOrgsRequestVisibilityEnum, SearchRoleResponse, SearchRoleResponsePermissionEnum, SearchRoleResponsePrivilegesEnum, SearchRolesRequest, SearchRolesRequestPermissionsEnum, SearchRolesRequestPrivilegesEnum, SearchSchedulesRequest, SearchSchedulesRequestHistoryRunsOptions, SearchSchedulesRequestSortOptions, SearchTagsRequest, SearchUserGroupsRequest, SearchUserGroupsRequestPrivilegesEnum, SearchUserGroupsRequestSortOptions, SearchUserGroupsRequestSortOptionsFieldNameEnum, SearchUserGroupsRequestSortOptionsOrderEnum, SearchUserGroupsRequestTypeEnum, SearchUserGroupsRequestVisibilityEnum, SearchUsersRequest, SearchUsersRequestAccountStatusEnum, SearchUsersRequestAccountTypeEnum, SearchUsersRequestPrivilegesEnum, SearchUsersRequestSortOptions, SearchUsersRequestSortOptionsFieldNameEnum, SearchUsersRequestSortOptionsOrderEnum, SearchUsersRequestVisibilityEnum, PromiseSecurityApi as SecurityApi, SecurityAuthentication, SelfDecodingBody, SendMessageRequest, ServerConfiguration, ShareMetadataRequest, ShareMetadataRequestMetadataTypeEnum, ShareMetadataTypeInput, ShareMetadataTypeInputTypeEnum, SharePermissionsInput, SharePermissionsInputShareModeEnum, SingleAnswerRequest, SortOptionInput, SortOptionInputFieldNameEnum, SortOptionInputOrderEnum, SortOptions, SortOptionsFieldNameEnum, SortOptionsOrderEnum, SortingOptions, SqlQuery, SqlQueryResponse, SqlQueryResponseMetadataTypeEnum, PromiseSystemApi as SystemApi, SystemConfig, SystemInfo, Table, Tag, TagMetadataTypeInput, TagMetadataTypeInputTypeEnum, PromiseTagsApi as TagsApi, PromiseThoughtSpotRestApi as ThoughtSpotRestApi, Token, TokenAccessScopeObject, TokenAccessScopeObjectTypeEnum, TokenProvider, TokenValidationResponse, URL, URLInput, URLInputMandatory, UpdateConfigRequest, UpdateConnectionRequest, UpdateConnectionV2Request, UpdateCustomActionRequest, UpdateCustomActionRequestActionDetails, UpdateCustomActionRequestDefaultActionConfig, UpdateCustomActionRequestOperationEnum, UpdateDbtConnectionRequest, UpdateDbtConnectionRequestImportTypeEnum, UpdateOrgRequest, UpdateOrgRequestOperationEnum, UpdateRoleRequest, UpdateRoleRequestPrivilegesEnum, UpdateScheduleRequest, UpdateScheduleRequestFileFormatEnum, UpdateScheduleRequestFrequency, UpdateScheduleRequestLiveboardOptions, UpdateScheduleRequestMetadataTypeEnum, UpdateScheduleRequestPdfOptions, UpdateScheduleRequestPdfOptionsPageSizeEnum, UpdateScheduleRequestRecipientDetails, UpdateScheduleRequestStatusEnum, UpdateScheduleRequestTimeZoneEnum, UpdateSystemConfigRequest, UpdateTagRequest, UpdateUserGroupRequest, UpdateUserGroupRequestOperationEnum, UpdateUserGroupRequestPrivilegesEnum, UpdateUserGroupRequestTypeEnum, UpdateUserGroupRequestVisibilityEnum, UpdateUserRequest, UpdateUserRequestAccountStatusEnum, UpdateUserRequestAccountTypeEnum, UpdateUserRequestOperationEnum, UpdateUserRequestPreferredLocaleEnum, UpdateUserRequestVisibilityEnum, User, UserAccountStatusEnum, UserAccountTypeEnum, UserGroup, UserGroupResponse, UserGroupResponseParentTypeEnum, UserGroupResponseTypeEnum, UserGroupResponseVisibilityEnum, UserInfo, UserObject, UserObjectTypeEnum, UserParameterOptions, UserParentTypeEnum, UserVisibilityEnum, PromiseUsersApi as UsersApi, ValidateMergeRequest, ValidateTokenRequest, PromiseVersionControlApi as VersionControlApi, configureAuthMethods, createBearerAuthenticationConfig, createConfiguration, server1, servers, wrapHttpLibrary };
