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
    'key'?: string;
    /**
    * Enter you key value
    */
    'value'?: string;
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
    'key'?: string;
    /**
    * Enter you key value
    */
    'value'?: string;
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
    'position'?: string;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean;
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
    'position'?: ActionConfigInputPositionEnum;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean;
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
    'position'?: ActionConfigInputCreatePositionEnum;
    /**
    * Visibility of the metadata association with custom action. Earlier naming convention: enabled
    */
    'visibility'?: boolean;
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
    'reference'?: string;
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
    'password'?: string;
    /**
    * Username for the basic authentication
    */
    'username'?: string;
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
    'Bearer_Token'?: string;
    /**
    * No authorization. If your request doesn\'t require authorization.
    */
    'No_Auth'?: string;
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
    'key'?: string;
    /**
    * Value for the url query parameter
    */
    'value'?: string;
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
    'parameters'?: Array<ParametersListItem>;
    /**
    * Request Url for the Custom action.
    */
    'url': string;
    /**
    * Reference name of the SDK. By default, the value will be set to action name.
    */
    'reference'?: string;
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
    'reference'?: string;
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
    'password'?: string;
    /**
    * Username for the basic authentication
    */
    'username'?: string;
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
    'Bearer_Token'?: string;
    /**
    * No authorization. If your request doesn\'t require authorization.
    */
    'No_Auth'?: string;
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
    'key'?: string;
    /**
    * Value for the url query parameter
    */
    'value'?: string;
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
    'parameters'?: Array<ParametersListItemInput>;
    /**
    * Request Url for the Custom action.
    */
    'url'?: string;
    /**
    * Reference name. By default the value will be set to action name
    */
    'reference'?: string;
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
    'reference'?: string;
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
    'parameters'?: Array<ParametersListItemInput>;
    /**
    * Request Url for the Custom action.
    */
    'url': string;
    /**
    * Reference name. By default the value will be set to action name
    */
    'reference'?: string;
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
    * Type of metadata.
    */
    'type'?: AuthorMetadataTypeInputTypeEnum;
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
    * Type of metadata (Optional when given identifier is ID). 1. LIVEBOARD 2. ANSWERS 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN for a column of any data object such as tables, worksheets or views.
    */
    'type'?: TagMetadataTypeInputTypeEnum;
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
    'identifier'?: string;
    /**
    * Type of metadata.
    */
    'type'?: AssociateMetadataInputTypeEnum;
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
    * Type of metadata.
    */
    'type'?: AssociateMetadataInputCreateTypeEnum;
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
    'email'?: string;
    /**
    * Username of the committer
    */
    'username'?: string;
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
    'is_aggregate'?: string;
    /**
    * Determines if the column schema can be imported
    */
    'can_import'?: boolean;
    /**
    * Determines if the table is selected
    */
    'selected'?: boolean;
    /**
    * Determines if the table is linked
    */
    'is_linked_active'?: boolean;
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
    * Type of metadata.
    */
    'type'?: MetadataObjectTypeEnum;
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
type MetadataObjectTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";

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
    'status_message'?: string;
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
    'email'?: string;
    /**
    * Username of the committer
    */
    'username'?: string;
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
    'comment'?: string;
    /**
    * Time at which the changes were committed.
    */
    'commit_time'?: string;
    /**
    * SHA id associated with the commit
    */
    'commit_id'?: string;
    /**
    * Branch where changes were committed
    */
    'branch'?: string;
    /**
    * Files that were pushed as part of this commit
    */
    'committed_files'?: Array<CommitFileType>;
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
    'database'?: string;
    /**
    * Name of the schema within the database.
    */
    'schema'?: string;
    /**
    * Name of the table within the schema.
    */
    'table'?: string;
    /**
    * Name of the column within the table.
    */
    'column'?: string;
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
    'identifier'?: string;
    /**
    * A pattern to match case-insensitive name of the connection object. User `%` for a wildcard match.
    */
    'name_pattern'?: string;
    /**
    * Filter options for databases, schemas, tables and columns.
    */
    'data_warehouse_objects'?: Array<DataWarehouseObjectInput>;
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
    *    Use commit_branch_name instead.      Name of the remote branch where objects from this Thoughtspot instance will be versioned.        *Deprecated from 10.0.0.cl : Replaced by commit_branch_name*
    */
    'default_branch_name'?: string;
    /**
    * Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later
    */
    'enable_guid_mapping'?: boolean | null;
    /**
    *    Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.      Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.    Version: 9.7.0.cl or later
    */
    'configuration_branch_name'?: string;
    /**
    *    Use configuration_branch_name instead.      Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.        Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.         *Deprecated from 10.0.0.cl : Replaced by configuration_branch_name*     Version: 9.4.0.cl or later
    */
    'guid_mapping_branch_name'?: string;
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
type CreateConnectionRequestDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL";

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
    'details'?: any;
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
type CreateConnectionResponseDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL";

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
    'visibility'?: boolean;
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
    'action_details': ActionDetailsInputCreate;
    /**
    * Metadata objects to which the custom action needs to be associated.
    */
    'associate_metadata'?: Array<AssociateMetadataInputCreate>;
    'default_action_config'?: DefaultActionConfigInputCreate;
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
    * Unique name of the role.
    */
    'name': string;
    /**
    * Description of the role.
    */
    'description'?: string;
    /**
    * Privileges granted to the role.
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
type CreateRoleRequestPrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT";

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
* Recipients of the scheduled job notification.
*/
declare class RecipientDetailsInput {
    /**
    * Emails of the recipients.
    */
    'emails'?: Array<string>;
    /**
    * User or groups to be set as recipients of the schedule notifications.
    */
    'principals'?: Array<PrincipalsListItemInput>;
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
    'complete_liveboard'?: boolean;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string;
    /**
    * Page size.
    */
    'page_size'?: SchedulesPdfOptionsInputPageSizeEnum;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean;
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
    'liveboard_options'?: LiveboardOptionsInput;
    'pdf_options'?: SchedulesPdfOptionsInput;
    /**
    * Time zone
    */
    'time_zone': CreateScheduleRequestTimeZoneEnum;
    'frequency'?: FrequencyInput;
    'recipient_details': RecipientDetailsInput;
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
type CreateScheduleRequestFileFormatEnum = "CSV" | "PDF";
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
type CreateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
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
    'identifier'?: string;
    /**
    * Type of metadata object.
    */
    'type'?: FavoriteMetadataInputTypeEnum;
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
    * Password for the user account.
    */
    'password': string;
    /**
    * Email of the user account
    */
    'email': string;
    /**
    * Type of the account.
    */
    'account_type'?: CreateUserRequestAccountTypeEnum;
    /**
    * Current status of the user account.
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
    * Flag to indicate whether welcome email should be sent to user
    */
    'trigger_welcome_email'?: boolean | null;
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
type CreateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
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
    * Type of metadata object.
    */
    'type'?: CustomActionMetadataTypeInputTypeEnum;
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
    'columns'?: Array<Column>;
    /**
    * Type of table. Either view or table
    */
    'type'?: string;
    /**
    * Description of the table
    */
    'description'?: string;
    /**
    * Determines if the table is selected
    */
    'selected'?: boolean;
    /**
    * Determines if the table is linked
    */
    'linked'?: boolean;
    /**
    * List of relationships for the table
    */
    'relationships'?: Array<any>;
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
    'tables'?: Array<Table>;
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
    'schemas'?: Array<SchemaObject>;
    /**
    * Determines if the object is auto created.
    */
    'auto_created'?: boolean;
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
declare class DbtSearchResponse {
    'dbt_connection_identifier'?: string;
    'project_name'?: string;
    'connection_id'?: string;
    'connection_name'?: string;
    'cdw_database'?: string;
    'import_type'?: string;
    'author_name'?: string;
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
    'visibility'?: boolean;
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
    'visibility'?: boolean;
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
    'visibility'?: boolean;
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
    * Type of metadata (Optional when given identifier is ID).
    */
    'type'?: DeleteMetadataTypeInputTypeEnum;
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
    'file_name'?: string;
    /**
    * Name of the metadata object
    */
    'metadata_name'?: string;
    /**
    * Type of the metadata object
    */
    'metadata_type'?: string;
    /**
    * Indicates the status of deployment for the file
    */
    'status_code'?: string;
    /**
    * Any error or warning with the deployment
    */
    'status_message'?: string;
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
    'error'?: any;
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
    * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view 5. CONNECTION for connection objects 6. TAG for tag objects 7. USER for user objects 8. USER_GROUP for group objects 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values.
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
type ExcludeMetadataListItemInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";

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
    'metadata_identifier': string;
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
declare class PdfOptionsInput {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean;
    /**
    * Indicates whether to include page number in the footer of each page.
    */
    'include_page_number'?: boolean;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: PdfOptionsInputPageOrientationEnum;
    /**
    * Indicates whether to include only the first page of the tables.
    */
    'truncate_table'?: boolean;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string;
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
declare class PngOptionsInput {
    /**
    * Indicates whether to include the cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean;
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
    * JSON string representing runtime filter. { col1:\'region\', op1: \'EQ\', val1: \'northeast\' }
    */
    'runtime_filter'?: any;
    /**
    * JSON string representing runtime sort. { sortCol1: \'region\', asc1 : true, sortCol2 : \'date\' }
    */
    'runtime_sort'?: any;
    'pdf_options'?: PdfOptionsInput;
    'png_options'?: PngOptionsInput;
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
/**
* MetadataType InputType used in Export MetadataType API
*/
declare class ExportMetadataTypeInput {
    /**
    * Type of metadata (Optional when given identifier is ID).
    */
    'type'?: ExportMetadataTypeInputTypeEnum;
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
type ExportMetadataTypeInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "CONNECTION" | "CUSTOM_ACTION";

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
    * TML EDOC content format.
    */
    'edoc_format'?: ExportMetadataTMLRequestEdocFormatEnum;
    /**
    * Indicates whether to export worksheet TML in V1 or V2 version.
    */
    'export_schema_version'?: ExportMetadataTMLRequestExportSchemaVersionEnum;
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
type ExportMetadataTMLRequestExportSchemaVersionEnum = "V1" | "V2";

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
    * Type of metadata object.
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
    'include'?: boolean;
    /**
    * Unique ID or name of the users. If not specified, the favorite objects of current logged in user are returned.
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
declare class FetchAnswerDataRequest {
    /**
    * GUID or name of the Answer.
    */
    'metadata_identifier': string;
    /**
    * JSON output format. By default, the API returns full data in the JSON.
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
    * JSON object representing filter condition to filter the data.
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort the data.
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
type FetchAnswerDataRequestDataFormatEnum = "COMPACT";

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
declare class FetchConnectionDiffStatusResponse {
    /**
    * Status of the connection diff.
    */
    'status'?: boolean;
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
    * JSON output format. By default, the API returns full data in the JSON.
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
    * JSON object representing filter condition to filter the data.
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort the data.
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
type FetchLiveboardDataRequestDataFormatEnum = "COMPACT";

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
    * Type of metadata object.
    */
    'type'?: PermissionsMetadataTypeInputTypeEnum;
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
    'type'?: PrincipalsInputTypeEnum;
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
declare class GenericInfo {
    'id'?: string;
    'name'?: string;
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
    'identifier'?: string;
    'type'?: JWTMetadataObjectTypeEnum;
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
* JWT user options to create a JWT token given the payload.
*/
declare class JWTUserOptions {
    'parameters'?: Array<JWTUserOptionsParametersInner>;
    'metadata'?: Array<JWTMetadataObject>;
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
    * Username of the ThoughtSpot user
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
    * ID of the Org context to log in to. If the Org ID is not specified, the user will be logged in to the Org context of their previous login session.
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
    'jwt_user_options'?: JWTUserOptions;
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
    * Username of the ThoughtSpot user
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
    * ID of the Org context to log in to. If Org ID is not specified, the user will be logged in to the Org context of their previous login session.
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
    'jwt_user_options'?: JWTUserOptions;
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
    'default_liveboard_identifiers'?: Array<string>;
    /**
    * Description of the group.
    */
    'description'?: string;
    /**
    * Privileges that will be assigned to the group.
    */
    'privileges'?: Array<GroupsImportListInputPrivilegesEnum>;
    /**
    * Unique ID or name of the sub-groups to add to the group.
    */
    'sub_group_identifiers'?: Array<string>;
    /**
    * Type of the group.
    */
    'type'?: GroupsImportListInputTypeEnum;
    /**
    * Unique ID or name of the users to assign to the group.
    */
    'user_identifiers'?: Array<string>;
    /**
    * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects.
    */
    'visibility'?: GroupsImportListInputVisibilityEnum;
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
type GroupsImportListInputPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
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
declare class ImportMetadataTMLRequest {
    /**
    * Details of TML objects.
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
type ImportMetadataTMLRequestImportPolicyEnum = "PARTIAL" | "ALL_OR_NONE" | "VALIDATE_ONLY";

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
    'password'?: string;
    /**
    * Type of the user account.
    */
    'account_type'?: ImportUserAccountTypeEnum;
    /**
    * Status of the user account.
    */
    'account_status'?: ImportUserAccountStatusEnum;
    /**
    * Email address of the user.
    */
    'email'?: string;
    /**
    * ID or name of the Orgs to which the user belongs.
    */
    'org_identifiers'?: Array<string>;
    /**
    * ID or name of the groups to which the user belongs.
    */
    'group_identifiers'?: Array<string>;
    /**
    * Visibility of the users. The SHARABLE property makes a user visible to other users and group, who can share objects with the user.
    */
    'visibility'?: ImportUserVisibilityEnum;
    /**
    * Notify user when other users or groups share metadata objects
    */
    'notify_on_share'?: boolean;
    /**
    * Show or hide the new user onboarding walkthroughs
    */
    'show_onboarding_experience'?: boolean;
    /**
    * Revisit the new user onboarding walkthroughs
    */
    'onboarding_experience_completed'?: boolean;
    /**
    * Unique ID or name of the default Liveboard assigned to the user.
    */
    'home_liveboard_identifier'?: string;
    /**
    * Metadata objects to add to the user\'s favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataInput>;
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
type ImportUserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
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
    'id'?: string;
    'name'?: string;
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
    'id'?: string;
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
    'users_added'?: Array<ImportUserType>;
    'users_updated'?: Array<ImportUserType>;
    'users_deleted'?: Array<ImportUserType>;
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
declare class JWTParameter {
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
    'visualization_id'?: string;
    /**
    * Name of the visualization.
    */
    'visualization_name'?: string;
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
    * Type of metadata.
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
    'identifier'?: string;
    'type'?: MetadataInputTypeEnum;
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
    'identifier'?: string;
    /**
    * A pattern to match the case-insensitive name of the metadata object. User % for a wildcard match.
    */
    'name_pattern'?: string;
    /**
    * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view. 4. LOGICAL_COLUMN for a column of any data object such as table, worksheet or view. 5. CONNECTION for creating or modify data connections. 6. TAG for tag objects. 7. USER for user objects. 8. USER_GROUP for group objects. 9. LOGICAL_RELATIONSHIP for table or worksheet joins. A join combines from one or several data object by using matching values
    */
    'type'?: MetadataListItemInputTypeEnum;
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
type MetadataListItemInputTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";

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
    'name'?: string;
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
    'metadata_id'?: string;
    /**
    * Name of the metadata.
    */
    'metadata_name'?: string;
    /**
    * Type of the metadata.
    */
    'metadata_type': MetadataSearchResponseMetadataTypeEnum;
    /**
    * Details of dependent objects of the metadata objects.
    */
    'dependent_objects'?: any;
    /**
    * Details of incomplete information of the metadata objects if any.
    */
    'incomplete_objects'?: Array<any>;
    /**
    * Complete details of the metadata objects.
    */
    'metadata_detail'?: any;
    /**
    * Header information of the metadata objects.
    */
    'metadata_header'?: any;
    /**
    * Visualization header information of the metadata objects.
    */
    'visualization_headers'?: Array<any>;
    /**
    * Stats of the metadata object. Includes views, favorites, last_accessed.
    */
    'stats'?: any;
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
type MetadataSearchResponseMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE" | "LOGICAL_COLUMN" | "CONNECTION" | "TAG" | "USER" | "USER_GROUP" | "LOGICAL_RELATIONSHIP";

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
    'field_name'?: MetadataSearchSortOptionsFieldNameEnum;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: MetadataSearchSortOptionsOrderEnum;
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
declare class ModelTableList {
    /**
    * Name of the Model.
    */
    'model_name': string;
    /**
    * Model directory path, this is optional param and required if there are duplicate models with the same name.
    */
    'model_path'?: string;
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
/**
* The object representation with ID and Name.
*/
declare class ObjectIDAndName {
    /**
    * The unique identifier of the object.
    */
    'id'?: string;
    /**
    * Name of the object.
    */
    'name'?: string;
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
    'id'?: number;
    /**
    * Name of the Org.
    */
    'name'?: string;
    /**
    * Status of the Org.
    */
    'status'?: OrgResponseStatusEnum;
    /**
    * Description of the Org.
    */
    'description'?: string;
    /**
    * Visibility of the Org.
    */
    'visibility'?: OrgResponseVisibilityEnum;
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
    'complete_liveboard'?: boolean;
    /**
    * Indicates whether to include cover page with the Liveboard title.
    */
    'include_cover_page'?: boolean;
    /**
    * Indicates whether to include customized wide logo in the footer if available.
    */
    'include_custom_logo'?: boolean;
    /**
    * Indicates whether to include a page with all applied filters.
    */
    'include_filter_page'?: boolean;
    /**
    * Indicates whether to include page number in the footer of each page
    */
    'include_page_number'?: boolean;
    /**
    * Text to include in the footer of each page.
    */
    'page_footer_text'?: string;
    /**
    * Page orientation of the PDF.
    */
    'page_orientation'?: string;
    /**
    * Page size.
    */
    'page_size'?: PdfOptionsPageSizeEnum;
    /**
    * Indicates whether to include only first page of the tables.
    */
    'truncate_table'?: boolean;
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
    'emails'?: Array<string>;
    /**
    * List of user or groups to subscribe for the scheduled job notifications.
    */
    'principals'?: Array<PrincipalsListItem>;
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
    'repository_url'?: string;
    /**
    * Username to authenticate connection to the version control system
    */
    'username'?: string;
    /**
    * Name of the remote branch where objects from this Thoughtspot instance will be versioned.
    */
    'commit_branch_name'?: string;
    /**
    * Branches that have been pulled in local repository
    */
    'branches'?: Array<string>;
    /**
    * Maintain mapping of guid for the deployment to an instance
    */
    'enable_guid_mapping'?: boolean;
    /**
    * Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.
    */
    'configuration_branch_name'?: string;
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
    'activation_link'?: string;
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
    'metadata_association'?: Array<MetadataAssociationItem>;
    /**
    * Unique name of the custom action.
    */
    'name': string;
    /**
    * Unique ID or name of the User groups which are associated with the custom action.
    */
    'user_groups'?: Array<ObjectIDAndName>;
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
    'detail'?: string;
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
    'description'?: string;
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
    'status'?: string;
    /**
    * Time zone
    */
    'time_zone': string;
    /**
    * Schedule runs history records.
    */
    'history_runs'?: Array<ResponseScheduleRun>;
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
    'comment'?: string;
    /**
    * Time at which the changes were committed.
    */
    'commit_time'?: string;
    /**
    * SHA id associated with the commit
    */
    'commit_id'?: string;
    /**
    * Branch where changes were committed
    */
    'branch'?: string;
    /**
    * Files that were pushed as part of this commit
    */
    'committed_files'?: Array<CommitFileType>;
    /**
    * Metadata of reverted file of this commit
    */
    'reverted_metadata'?: Array<RevertedMetadata>;
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
    'id'?: string;
    /**
    * name of the role
    */
    'name'?: string;
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
    'groups_assigned_count'?: number;
    /**
    * Orgs in which role exists.
    */
    'orgs'?: Array<GenericInfo>;
    /**
    * Details of groups assigned with this role
    */
    'groups'?: Array<GenericInfo>;
    /**
    * Privileges granted to the role.
    */
    'privileges': Array<RoleResponsePrivilegesEnum>;
    /**
    * Permission details of the Role
    */
    'permission'?: RoleResponsePermissionEnum;
    /**
    * Unique identifier of author of the role.
    */
    'author_id'?: string;
    /**
    * Unique identifier of modifier of the role.
    */
    'modifier_id'?: string;
    /**
    * Creation time of the role in milliseconds.
    */
    'creation_time_in_millis'?: any;
    /**
    * Last modified time of the role in milliseconds.
    */
    'modification_time_in_millis'?: any;
    /**
    * Indicates whether the role is deleted.
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the role is deprecated.
    */
    'deprecated'?: boolean;
    /**
    * Indicates whether the role is external.
    */
    'external'?: boolean;
    /**
    * Indicates whether the role is hidden.
    */
    'hidden'?: boolean;
    /**
    * Indicates whether the role is shared via connection
    */
    'shared_via_connection'?: boolean;
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
type RoleResponsePrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT";
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
    'include_history_runs'?: boolean;
    /**
    * Indicates the max number of records that can be fetched as past runs of any scheduled job.
    */
    'record_size'?: number;
    /**
    * Indicates the starting record number from where history runs records should be fetched.
    */
    'record_offset'?: number;
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
declare class Scope {
    /**
    * Object access scope type.
    */
    'access_type': string;
    /**
    * Unique identifier of the metadata.
    */
    'org_id'?: number;
    /**
    * Unique identifier of the Org.
    */
    'metadata_id'?: string;
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
type SearchCommitsRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";

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
declare class SortOptionInput {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SortOptionInputFieldNameEnum;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SortOptionInputOrderEnum;
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
    'sort_options'?: SortOptionInput;
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
type SearchConnectionRequestDataWarehouseTypesEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL";
type SearchConnectionRequestDataWarehouseObjectTypeEnum = "DATABASE" | "SCHEMA" | "TABLE" | "COLUMN";
type SearchConnectionRequestAuthenticationTypeEnum = "SERVICE_ACCOUNT" | "OAUTH" | "IAM" | "EXTOAUTH";

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
    'description'?: string;
    /**
    * Type of data warehouse.
    */
    'data_warehouse_type': SearchConnectionResponseDataWarehouseTypeEnum;
    'data_warehouse_objects'?: DataWarehouseObjects;
    /**
    * Details of the connection.
    */
    'details'?: any;
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
type SearchConnectionResponseDataWarehouseTypeEnum = "SNOWFLAKE" | "AMAZON_REDSHIFT" | "GOOGLE_BIGQUERY" | "AZURE_SYNAPSE" | "TERADATA" | "SAP_HANA" | "STARBURST" | "ORACLE_ADW" | "DATABRICKS" | "DENODO" | "DREMIO" | "TRINO" | "PRESTO" | "POSTGRES" | "SQLSERVER" | "MYSQL" | "GENERIC_JDBC" | "AMAZON_RDS_POSTGRESQL" | "AMAZON_AURORA_POSTGRESQL" | "AMAZON_RDS_MYSQL" | "AMAZON_AURORA_MYSQL" | "LOOKER" | "AMAZON_ATHENA" | "SINGLESTORE" | "GCP_SQLSERVER" | "GCP_ALLOYDB_POSTGRESQL" | "GCP_POSTGRESQL" | "GCP_MYSQL";

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
    'default_action_config'?: DefaultActionConfigSearchInput;
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
    * Data search query string token.
    */
    'query_string': string;
    /**
    * GUID of the data source object, such as a Worksheet, View, or Table.
    */
    'logical_table_identifier': string;
    /**
    * JSON output format. By default, the API returns full data in the JSON.
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
    * JSON object representing filter condition to filter the data.
    */
    'runtime_filter'?: any;
    /**
    * JSON object representing columns to sort the data.
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
type SearchDataRequestDataFormatEnum = "COMPACT";

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
    'favorite_object_options'?: FavoriteObjectOptionsInput;
    /**
    * Includes system-generated metadata objects.
    */
    'include_auto_created_objects'?: boolean | null;
    /**
    * Includes dependents of the metadata object specified in the API request. For example, a worksheet can consist of dependent objects such as Liveboards or Answers.
    */
    'include_dependent_objects'?: boolean | null;
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
    'sort_options'?: MetadataSearchSortOptions;
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
    'groups_assigned_count'?: number;
    /**
    * Orgs in which role exists.
    */
    'orgs'?: Array<GenericInfo>;
    /**
    * Details of groups assigned with this role
    */
    'groups'?: Array<GenericInfo>;
    /**
    * Privileges granted to the role.
    */
    'privileges': Array<SearchRoleResponsePrivilegesEnum>;
    /**
    * Permission details of the Role
    */
    'permission'?: SearchRoleResponsePermissionEnum;
    /**
    * Unique identifier of author of the role.
    */
    'author_id'?: string;
    /**
    * Unique identifier of modifier of the role.
    */
    'modifier_id'?: string;
    /**
    * Creation time of the role in milliseconds.
    */
    'creation_time_in_millis'?: any;
    /**
    * Last modified time of the role in milliseconds.
    */
    'modification_time_in_millis'?: any;
    /**
    * Indicates whether the role is deleted.
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the role is deprecated.
    */
    'deprecated'?: boolean;
    /**
    * Indicates whether the role is external.
    */
    'external'?: boolean;
    /**
    * Indicates whether the role is hidden.
    */
    'hidden'?: boolean;
    /**
    * Indicates whether the role is shared via connection
    */
    'shared_via_connection'?: boolean;
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
type SearchRoleResponsePrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE";
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
    * unique ID or name of the roles
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
    * Privileges assigned to the Role.
    */
    'privileges'?: Array<SearchRolesRequestPrivilegesEnum>;
    /**
    * Indicates whether the role is deprecated.
    */
    'deprecated'?: boolean | null;
    /**
    * Indicates whether the Role is external
    */
    'external'?: boolean | null;
    /**
    * Indicates whether the role is shared via connection
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
type SearchRolesRequestPrivilegesEnum = "UNKNOWN" | "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "SECURITYMANAGEMENT" | "LOGICALMODELING" | "DATAMANAGEMENT" | "TAGMANAGEMENT" | "SHAREWITHALL" | "SYSTEMMANAGEMENT" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "BACKUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ENABLESPOTAPPCREATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "PREVIEW_THOUGHTSPOT_SAGE";
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
* Sort options.
*/
declare class SortingOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: string;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: string;
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
    'sort_options'?: SortingOptions;
    'history_runs_options'?: ScheduleHistoryRunsOptionsInput;
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
* Sort options.
*/
declare class SortOptions {
    /**
    * Name of the field to apply the sort on.
    */
    'field_name'?: SortOptionsFieldNameEnum;
    /**
    * Sort order : ASC(Ascending) or DESC(Descending).
    */
    'order'?: SortOptionsOrderEnum;
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
    * Filter groups with a list of roles assigned to a group
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
    'sort_options'?: SortOptions;
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
type SearchUserGroupsRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "ENABLESPOTAPPCREATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION";
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
    'sort_options'?: SortOptions;
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
type SearchUsersRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "LIVEBOARD_VERIFIER" | "ENABLESPOTAPPCREATION" | "PREVIEW_THOUGHTSPOT_SAGE" | "APPLICATION_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION";
type SearchUsersRequestAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type SearchUsersRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";

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
    * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
    */
    'metadata_type'?: ShareMetadataRequestMetadataTypeEnum;
    /**
    * Unique ID or name of metadata objects. Note: All the identifiers should belong to same metadata_type
    */
    'metadata_identifiers': Array<string>;
    /**
    * Permission details for sharing the objects.
    */
    'permissions': Array<SharePermissionsInput>;
    /**
    * Options to specify details of Liveboard.
    */
    'visualization_identifiers'?: Array<string>;
    /**
    * Email IDs to which notifications will be sent.
    */
    'emails': Array<string>;
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
type ShareMetadataRequestMetadataTypeEnum = "LIVEBOARD" | "ANSWER" | "LOGICAL_TABLE";

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
    'onboarding_content_url'?: string;
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
    'id'?: string;
    /**
    * Name of the cluster.
    */
    'name'?: string;
    /**
    * The release version of the cluster.
    */
    'release_version'?: string;
    /**
    * The timezone of the cluster.
    */
    'time_zone'?: string;
    /**
    * The default locale of the cluster.
    */
    'locale'?: string;
    /**
    * The default date format representation of the cluster.
    */
    'date_format'?: string;
    /**
    * The API version of the cluster.
    */
    'api_version'?: string;
    /**
    * The deployment type of the cluster.
    */
    'type'?: string;
    /**
    * The deployed environment of the cluster.
    */
    'environment'?: string;
    /**
    * The license applied to the cluster.
    */
    'license'?: string;
    /**
    * The default date time format representation of the cluster.
    */
    'date_time_format'?: string;
    /**
    * The default time format representation of the cluster.
    */
    'time_format'?: string;
    /**
    * The unique identifier of system user.
    */
    'system_user_id'?: string;
    /**
    * The unique identifier of super user.
    */
    'super_user_id'?: string;
    /**
    * The unique identifier of hidden object.
    */
    'hidden_object_id'?: string;
    /**
    * The unique identifier of system group.
    */
    'system_group_id'?: string;
    /**
    * The unique identifier of tsadmin user.
    */
    'tsadmin_user_id'?: string;
    /**
    * The unique identifier of admin group.
    */
    'admin_group_id'?: string;
    /**
    * The unique identifier of all tables connection.
    */
    'all_tables_connection_id'?: string;
    /**
    * The unique identifier of ALL group.
    */
    'all_user_group_id'?: string;
    /**
    * The supported accept language by the cluster.
    */
    'accept_language'?: string;
    /**
    * The count of users of ALL group.
    */
    'all_user_group_member_user_count'?: number;
    /**
    * The version number of logical model of the cluster.
    */
    'logical_model_version'?: number;
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
    'color'?: string;
    'deleted'?: boolean;
    'hidden'?: boolean;
    'external'?: boolean;
    'deprecated'?: boolean;
    'creation_time_in_millis'?: number;
    'modification_time_in_millis'?: number;
    'author_id'?: string;
    'modifier_id'?: string;
    'owner_id'?: string;
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
    *    Use commit_branch_name instead.      Name of the remote branch where objects from this Thoughtspot instance will be versioned.        *Deprecated from 10.0.0.cl : Replaced by commit_branch_name*
    */
    'default_branch_name'?: string;
    /**
    * Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later
    */
    'enable_guid_mapping'?: boolean | null;
    /**
    * Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.    Version: 9.7.0.cl or later
    */
    'configuration_branch_name'?: string;
    /**
    *    Use configuration_branch_name instead.      Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.        *Deprecated from 10.0.0.cl : Replaced by configuration_branch_name*     Version: 9.4.0.cl or later
    */
    'guid_mapping_branch_name'?: string;
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

declare class UpdateCustomActionRequest {
    'action_details'?: ActionDetailsInput;
    /**
    * Metadata objects to which the custom action needs to be associated.
    */
    'associate_metadata'?: Array<AssociateMetadataInput>;
    'default_action_config'?: DefaultActionConfigInput;
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
    * Description of the Role
    */
    'description'?: string;
    /**
    * Privileges granted to the role.
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
type UpdateRoleRequestPrivilegesEnum = "USERDATAUPLOADING" | "DATADOWNLOADING" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "DISABLE_PINBOARD_CREATION" | "DEVELOPER" | "APPLICATION_ADMINISTRATION" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYSTEM_INFO_ADMINISTRATION" | "SYNCMANAGEMENT" | "ORG_ADMINISTRATION" | "ROLE_ADMINISTRATION" | "AUTHENTICATION_ADMINISTRATION" | "BILLING_INFO_ADMINISTRATION" | "CONTROL_TRUSTED_AUTH" | "TAGMANAGEMENT";

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
    'liveboard_options'?: LiveboardOptionsInput;
    'pdf_options'?: SchedulesPdfOptionsInput;
    /**
    * Time zone
    */
    'time_zone'?: UpdateScheduleRequestTimeZoneEnum;
    'frequency'?: FrequencyInput;
    'recipient_details'?: RecipientDetailsInput;
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
type UpdateScheduleRequestFileFormatEnum = "CSV" | "PDF";
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
    * Role identifiers of the roles that should be assigned to the group.
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
type UpdateUserGroupRequestPrivilegesEnum = "ADMINISTRATION" | "AUTHORING" | "USERDATAUPLOADING" | "DATADOWNLOADING" | "USERMANAGEMENT" | "DATAMANAGEMENT" | "SHAREWITHALL" | "JOBSCHEDULING" | "A3ANALYSIS" | "EXPERIMENTALFEATUREPRIVILEGE" | "BYPASSRLS" | "RANALYSIS" | "DEVELOPER" | "USER_ADMINISTRATION" | "GROUP_ADMINISTRATION" | "SYNCMANAGEMENT" | "CAN_CREATE_CATALOG" | "DISABLE_PINBOARD_CREATION" | "ENABLESPOTAPPCREATION" | "LIVEBOARD_VERIFIER" | "PREVIEW_THOUGHTSPOT_SAGE";
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
    * Current status of the user account.
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
type UpdateUserRequestAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
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
    'author_id'?: string;
    /**
    * Defines whether the user can change their password.
    */
    'can_change_password'?: boolean;
    /**
    * Defines whether the response has complete detail of the user.
    */
    'complete_detail'?: boolean;
    /**
    * Creation time of the user in milliseconds.
    */
    'creation_time_in_millis'?: number;
    'current_org'?: Org;
    /**
    * Indicates whether the user is deleted.
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the user is deprecated.
    */
    'deprecated'?: boolean;
    /**
    * Type of the user account.
    */
    'account_type'?: UserAccountTypeEnum;
    /**
    * Status of the user account.
    */
    'account_status'?: UserAccountStatusEnum;
    /**
    * Email of the user.
    */
    'email'?: string;
    /**
    * Expiration time of the user in milliseconds.
    */
    'expiration_time_in_millis'?: number;
    /**
    * Indicates whether the user is external.
    */
    'external'?: boolean;
    /**
    * Metadata objects to add to the users\' favorites list.
    */
    'favorite_metadata'?: Array<FavoriteMetadataItem>;
    /**
    * Timestamp of the first login session of the user in milliseconds.
    */
    'first_login_time_in_millis'?: number;
    /**
    * Group mask of the user.
    */
    'group_mask'?: number;
    /**
    * Indicates whether the user is hidden.
    */
    'hidden'?: boolean;
    'home_liveboard'?: ObjectIDAndName;
    /**
    * Incomplete details of user if any present.
    */
    'incomplete_details'?: any;
    /**
    * Indicates whether it is first login of the user.
    */
    'is_first_login'?: boolean;
    /**
    * Last modified time of the user in milliseconds.
    */
    'modification_time_in_millis'?: number;
    /**
    * Unique identifier of modifier of the user.
    */
    'modifier_id'?: string;
    /**
    * User preference for receiving email notifications on shared Answers or Liveboard.
    */
    'notify_on_share'?: boolean;
    /**
    * The user preference for turning off the onboarding experience.
    */
    'onboarding_experience_completed'?: boolean;
    /**
    * Orgs to which the user belongs.
    */
    'orgs'?: Array<Org>;
    /**
    * Unique identifier of owner of the user.
    */
    'owner_id'?: string;
    /**
    * Parent type of the user.
    */
    'parent_type'?: UserParentTypeEnum;
    /**
    * Privileges which are assigned to the user.
    */
    'privileges'?: Array<string>;
    /**
    * User\'s preference to revisit the new user onboarding experience.
    */
    'show_onboarding_experience'?: boolean;
    /**
    * Indicates whether the user is a super user.
    */
    'super_user'?: boolean;
    /**
    * Indicates whether the user is a system user.
    */
    'system_user'?: boolean;
    /**
    * Tags associated with the user.
    */
    'tags'?: Array<ObjectIDAndName>;
    /**
    * Unique identifier of tenant of the user.
    */
    'tenant_id'?: string;
    /**
    * Groups to which the user is assigned.
    */
    'user_groups'?: Array<ObjectIDAndName>;
    /**
    * Inherited User Groups which the user is part of.
    */
    'user_inherited_groups'?: Array<ObjectIDAndName>;
    /**
    * Indicates whether welcome email is sent for the user.
    */
    'welcome_email_sent'?: boolean;
    /**
    * Privileges which are assigned to the user with org.
    */
    'org_privileges'?: any;
    /**
    * Locale for the user.
    */
    'preferred_locale'?: string;
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
type UserVisibilityEnum = "SHARABLE" | "NON_SHARABLE";
type UserAccountTypeEnum = "LOCAL_USER" | "LDAP_USER" | "SAML_USER" | "OIDC_USER" | "REMOTE_USER";
type UserAccountStatusEnum = "ACTIVE" | "INACTIVE" | "EXPIRED" | "LOCKED" | "PENDING";
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
    'author_id'?: string;
    /**
    * Indicates whether the response has complete detail of the group.
    */
    'complete_detail'?: boolean;
    /**
    * Content details of the group
    */
    'content'?: any;
    /**
    * Creation time of the group in milliseconds
    */
    'creation_time_in_millis'?: number;
    /**
    * Liveboards that are assigned as default Liveboards to the group.
    */
    'default_liveboards'?: Array<UserGroup>;
    /**
    * Indicates whether the group is deleted
    */
    'deleted'?: boolean;
    /**
    * Indicates whether the group is deprecated
    */
    'deprecated'?: boolean;
    /**
    * Description of the group
    */
    'description'?: string;
    /**
    * Display name of the group.
    */
    'display_name': string;
    /**
    * Indicates whether the group is external
    */
    'external'?: boolean;
    /**
    * Generation number of the group
    */
    'generation_number'?: number;
    /**
    * Indicates whether the group is hidden
    */
    'hidden'?: boolean;
    /**
    * The unique identifier of the object
    */
    'id': string;
    /**
    * Index number of the group
    */
    'index'?: number;
    /**
    * Index version number of the group
    */
    'index_version'?: number;
    /**
    * Metadata version number of the group
    */
    'metadata_version'?: number;
    /**
    * Last modified time of the group in milliseconds.
    */
    'modification_time_in_millis'?: number;
    /**
    * The unique identifier of the object
    */
    'modifier_id'?: string;
    /**
    * Name of the group.
    */
    'name': string;
    /**
    * Orgs in which group exists.
    */
    'orgs'?: Array<UserGroup>;
    /**
    * The unique identifier of the object
    */
    'owner_id'?: string;
    /**
    * Parent type of the group.
    */
    'parent_type'?: UserGroupResponseParentTypeEnum;
    /**
    * Privileges which are assigned to the group
    */
    'privileges'?: Array<string>;
    /**
    * Groups who are part of the group
    */
    'sub_groups'?: Array<UserGroup>;
    /**
    * Indicates whether the group is a system group.
    */
    'system_group'?: boolean;
    /**
    * Tags associated with the group.
    */
    'tags'?: Array<UserGroup>;
    /**
    * Type of the group.
    */
    'type'?: UserGroupResponseTypeEnum;
    /**
    * Users who are part of the group.
    */
    'users'?: Array<UserGroup>;
    /**
    * Visibility of the group. The SHARABLE makes a group visible to other users and groups, and thus allows them to share objects.
    */
    'visibility': UserGroupResponseVisibilityEnum;
    /**
    * List of roles assgined to the user
    */
    'roles'?: Array<Role>;
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
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext>;
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
}

/**
 * no description
 */
declare class ConnectionsApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
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
}

/**
 * no description
 */
declare class CustomActionApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
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
declare class DataApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```
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
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
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
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance
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
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records: `tag_identifiers` `type` `created_by_user_identifiers` `modified_by_user_identifiers` `owned_by_user_identifiers` `exclude_objects` `include_auto_created_objects` `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class MetadataApiResponseProcessor {
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
     * @params response Response returned by the server for a request to fetchAnswerSqlQuery
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchAnswerSqlQuery(response: ResponseContext): Promise<SqlQueryResponse>;
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
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.
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
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
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
    exportAnswerReport(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportLiveboardReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportLiveboardReport(response: ResponseContext): Promise<void>;
}

/**
 * no description
 */
declare class RolesApiRequestFactory extends BaseAPIRequestFactory {
    /**
     * Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     * Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     * Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later
     * @param searchRolesRequest
     */
    searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     * Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
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
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.
     * @param searchSchedulesRequest
     */
    searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
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
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
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
    fetchPermissionsOfPrincipals(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOnMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchPermissionsOnMetadata(response: ResponseContext): Promise<any>;
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
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.
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
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     * Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     * Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param getObjectAccessTokenRequest
     */
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records: `tag_identifiers` `type` `created_by_user_identifiers` `modified_by_user_identifiers` `owned_by_user_identifiers` `exclude_objects` `include_auto_created_objects` `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     * Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later
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
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.
     * @param shareMetadataRequest
     */
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     * Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.
     * @param updateSystemConfigRequest
     */
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param validateMergeRequest
     */
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<RequestContext>;
}
declare class ThoughtSpotRestApiResponseProcessor {
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
     * @params response Response returned by the server for a request to deleteCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    deleteCustomAction(response: ResponseContext): Promise<void>;
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
     * @params response Response returned by the server for a request to exportAnswerReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportAnswerReport(response: ResponseContext): Promise<void>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to exportLiveboardReport
     * @throws ApiException if the response code was not in [200, 299]
     */
    exportLiveboardReport(response: ResponseContext): Promise<void>;
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
    fetchPermissionsOfPrincipals(response: ResponseContext): Promise<any>;
    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to fetchPermissionsOnMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    fetchPermissionsOnMetadata(response: ResponseContext): Promise<any>;
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
     * @params response Response returned by the server for a request to shareMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
    shareMetadata(response: ResponseContext): Promise<void>;
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
     * @params response Response returned by the server for a request to updateCustomAction
     * @throws ApiException if the response code was not in [200, 299]
     */
    updateCustomAction(response: ResponseContext): Promise<void>;
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
}

/**
 * no description
 */
declare class UsersApiRequestFactory extends BaseAPIRequestFactory {
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param forceLogoutUsersRequest
     */
    forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param importUsersRequest
     */
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.0.0.cl or later   Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RequestContext>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseConnectionsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ConnectionsApiRequestFactory, responseProcessor?: ConnectionsApiResponseProcessor);
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseCustomActionApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: CustomActionApiRequestFactory, responseProcessor?: CustomActionApiResponseProcessor);
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseDataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: DataApiRequestFactory, responseProcessor?: DataApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse>;
}

declare class PromiseGroupsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: GroupsApiRequestFactory, responseProcessor?: GroupsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseLogApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: LogApiRequestFactory, responseProcessor?: LogApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>>;
}

declare class PromiseMetadataApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: MetadataApiRequestFactory, responseProcessor?: MetadataApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records: `tag_identifiers` `type` `created_by_user_identifiers` `modified_by_user_identifiers` `owned_by_user_identifiers` `exclude_objects` `include_auto_created_objects` `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>>;
}

declare class PromiseOrgsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: OrgsApiRequestFactory, responseProcessor?: OrgsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseReportsApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ReportsApiRequestFactory, responseProcessor?: ReportsApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseRolesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: RolesApiRequestFactory, responseProcessor?: RolesApiResponseProcessor);
    /**
     * Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    /**
     * Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     * Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later
     * @param searchRolesRequest
     */
    searchRoles(searchRolesRequest: SearchRolesRequest, _options?: Configuration): Promise<Array<SearchRoleResponse>>;
    /**
     * Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
}

declare class PromiseSchedulesApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SchedulesApiRequestFactory, responseProcessor?: SchedulesApiResponseProcessor);
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *  Search Schedules    Version: 9.4.0.cl or later   Gets a list of scheduled jobs configured for a Liveboard.  To get details of a specific scheduled job, specify the name or GUID of the scheduled job.  Requires at least view access to Liveboards.  **NOTE**: When filtering schedules by parameters other than `metadata`, set `record_size` to `-1` and `record_offset` to `0` for accurate results.
     * @param searchSchedulesRequest
     */
    searchSchedules(searchSchedulesRequest: SearchSchedulesRequest, _options?: Configuration): Promise<Array<ResponseSchedule>>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseSecurityApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: SecurityApiRequestFactory, responseProcessor?: SecurityApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<any>;
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
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<SystemConfig>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<SystemInfo>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<any>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.
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
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseThoughtSpotRestApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: ThoughtSpotRestApiRequestFactory, responseProcessor?: ThoughtSpotRestApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Transfers the ownership of one or several objects from one user to another.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param assignChangeAuthorRequest
     */
    assignChangeAuthor(assignChangeAuthorRequest: AssignChangeAuthorRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Assigns tags to Liveboards, Answers, Tables, and Worksheets.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    assignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Creates a connection to a data warehouse for live query services.    Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Create a connection without tables  To create a connection without tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes in `data_warehouse_config`. The following example shows the configuration attributes for a SnowFlake connection:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[       ]   }   ``` 2. Set `validate` to `false`.  #### Create a connection with tables  To create a connection with tables:  1. Pass these parameters in your API request.  * Name of the connection.  * Type of the data warehouse to connect to.  * A JSON map of configuration attributes, database details, and table properties in `data_warehouse_config` as shown in the following example:   ```   {      \"configuration\":{         \"accountName\":\"thoughtspot_partner\",         \"user\":\"tsadmin\",         \"password\":\"TestConn123\",         \"role\":\"sysadmin\",         \"warehouse\":\"MEDIUM_WH\"      },      \"externalDatabases\":[         {            \"name\":\"AllDatatypes\",            \"isAutoCreated\":false,            \"schemas\":[               {                  \"name\":\"alldatatypes\",                  \"tables\":[                     {                        \"name\":\"allDatatypes\",                        \"type\":\"TABLE\",                        \"description\":\"\",                        \"selected\":true,                        \"linked\":true,                        \"columns\":[                           {                              \"name\":\"CNUMBER\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           },                           {                              \"name\":\"CDECIMAL\",                              \"type\":\"INT64\",                              \"canImport\":true,                              \"selected\":true,                              \"isLinkedActive\":true,                              \"isImported\":false,                              \"tableName\":\"allDatatypes\",                              \"schemaName\":\"alldatatypes\",                              \"dbName\":\"AllDatatypes\"                           }                        ]                     }                  ]               }            ]         }      ]   }   ``` 2. Set `validate` to `true`.
     * @param createConnectionRequest
     */
    createConnection(createConnectionRequest: CreateConnectionRequest, _options?: Configuration): Promise<CreateConnectionResponse>;
    /**
     *   Version: 9.6.0.cl or later   Creates a custom action that appears as a menu action on a saved Answer or Liveboard visualization.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API lets you create the following types of custom actions:  * URL-based action        Allows pushing data to an external URL. * Callback action           Triggers a callback to the host application and initiates a response payload on an embedded ThoughtSpot instance.  By default, custom actions are visible to only administrator or developer users. To make a custom action available to other users, and specify the groups in `group_identifiers`.  By default, the custom action is set as a _global_ action on all visualizations and saved Answers. To assign a custom action to specific Liveboard visualization, saved Answer, or Worksheet, set `visibility` to `false` in `default_action_config` property and specify the GUID or name of the object in `associate_metadata`.  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param createCustomActionRequest
     */
    createCustomAction(createCustomActionRequest: CreateCustomActionRequest, _options?: Configuration): Promise<ResponseCustomAction>;
    /**
     *   Version: 9.0.0.cl or later   Creates an Org object.  To use this API, the [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview) feature must be enabled in your cluster.  Requires cluster administration (**Can administer Org**) privileges.
     * @param createOrgRequest
     */
    createOrg(createOrgRequest: CreateOrgRequest, _options?: Configuration): Promise<OrgResponse>;
    /**
     * Creates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param createRoleRequest
     */
    createRole(createRoleRequest: CreateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    /**
     *  Create schedule.    Version: 9.4.0.cl or later   Creates a Liveboard schedule job.  Requires at least edit access to Liveboards. To create a schedule on behalf of another user, you need  `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  #### Usage guidelines  * The description text is mandatory.  The description text appears as **Description: <your content>** in the Liveboard schedule email notifications. * The API endpoint supports exporting Liveboard data to the recipients in CSV or PDF format. If your Liveboard has tables, you can set `file_format` to CSV to send CSV files in the email notification to the recipients. For PDF generation, you can define PDF layout options. * To include only specific visualizations, specify the visualization GUIDs in the `visualization_identifiers` array. * You can schedule a Liveboard job to run periodically by setting frequency parameters. You can set the schedule to run daily, weekly, monthly or every n minutes or hours. The scheduled job can also be configured to run at a specific time of the day or on specific days of the week or month. * If the `frequency` parameters are defined, you can set the time zone to a value that matches your server\'s time zone. For example, `US/Central`, `Etc/UTC`, `CET`. The default time zone is `America/Los_Angeles`.  For more information about Liveboard jobs, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/liveboard-schedule).
     * @param createScheduleRequest
     */
    createSchedule(createScheduleRequest: CreateScheduleRequest, _options?: Configuration): Promise<ResponseSchedule>;
    /**
     *   Version: 9.0.0.cl or later   Creates a tag object.  Tags are labels that identify a metadata object. For example, you can create a tag to designate subject areas, such as sales, HR, marketing, and finance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createTagRequest
     */
    createTag(createTagRequest: CreateTagRequest, _options?: Configuration): Promise<Tag>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User>;
    /**
     *   Version: 9.0.0.cl or later   Creates a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### About groups Groups in ThoughtSpot are used by the administrators to define privileges and organize users based on their roles and access requirements. To know more about groups and privileges, see [ThoughtSpot Product Documentation](https://docs.thoughtspot.com/cloud/latest/groups-privileges).  #### Supported operations  The API endpoint lets you perform the following operations:  * Assign [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add users * Define sharing visibility * Add sub-groups * Assign a default Liveboard
     * @param createUserGroupRequest
     */
    createUserGroup(createUserGroupRequest: CreateUserGroupRequest, _options?: Configuration): Promise<UserGroupResponse>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Deletes a connection object.  **Note**: If a connection has dependent objects, make sure you remove its associations before the delete operation.  Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConnectionRequest
     */
    deleteConnection(deleteConnectionRequest: DeleteConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.6.0.cl or later   Removes the custom action specified in the API request.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param customActionIdentifier Unique ID or name of the custom action.
     */
    deleteCustomAction(customActionIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified metadata object from the ThoughtSpot system.  Requires edit access to the metadata object or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteMetadataRequest
     */
    deleteMetadata(deleteMetadataRequest: DeleteMetadataRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Deletes an Org object from the ThoughtSpot system.  Requires cluster administration (**Can administer Org**) privilege.  When you delete an Org, all its users and objects created in that Org context are removed. However, if the users in the deleted Org also exists in other Orgs, they are removed only from the deleted Org.
     * @param orgIdentifier ID or name of the Org
     */
    deleteOrg(orgIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     * Deletes a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     */
    deleteRole(roleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *  Deletes a scheduled job.    Version: 9.4.0.cl or later   Deletes a scheduled Liveboard job.  Requires at least edit access to Liveboard or `ADMINISTRATION` (**Can administer Org**) privilege.
     * @param scheduleIdentifier Unique ID or name of the scheduled job.
     */
    deleteSchedule(scheduleIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a tag object from the ThoughtSpot system  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param tagIdentifier Tag identifier Tag name or Tag id.
     */
    deleteTag(tagIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Removes the specified group object from the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param groupIdentifier GUID or name of the group.
     */
    deleteUserGroup(groupIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Exports an Answer in the given file format. You can download the Answer data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, the GUID or name of the Answer and set `file_format`. The default file format is CSV.  You can apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.
     * @param exportAnswerReportRequest
     */
    exportAnswerReport(exportAnswerReportRequest: ExportAnswerReportRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Exports the data from a Liveboard and its visualization in a given file format. You can download the Liveboard data as a PDF, PNG, CSV, or XLSX file.  Requires `DATADOWNLOADING` (**Can download data**) privilege.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To generate a Liveboard report with specific visualizations, add GUIDs or names of the visualizations.  The default `file_format` is CSV. For PDF file format, you can specify additional parameters to customize the page orientation and include or exclude the cover page, logo, footer text, and page numbers. Similar customization options are also available for PNG output.  You can also apply [runtime filter](https://developers.thoughtspot.com/docs/?pageid=runtime-filters#_apply_runtime_filters_via_rest_api_v2_0_endpoints) overrides and [sort columns](https://developers.thoughtspot.com/docs/?pageid=runtime-sort#_rest_api_v2_0) to the data retrieved in the API response.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param exportLiveboardReportRequest
     */
    exportLiveboardReport(exportLiveboardReportRequest: ExportLiveboardReportRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Exports the [TML](https://docs.thoughtspot.com/cloud/latest/tml) representation of metadata objects in JSON or YAML format.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  * You can export one or several objects by passing metadata object GUIDs in the `metadata` array. * When exporting TML content for a Liveboard or Answer object, you can set `export_associated` to `true` to retrieve TML content for underlying Worksheets, Tables, or Views, including the GUID of each object within the headers. When   `export_associated` is set to `true`, consider retrieving one metadata object at a time. * Set `export_fqns` to `true` to add FQNs of the referenced objects in the TML content. For example, if you send an API request to retrieve TML for a Liveboard and its associated objects, the API returns the TML content with FQNs of the referenced Worksheet. Exporting TML with FQNs is useful if ThoughtSpot has multiple objects with the same name and you want to eliminate ambiguity when importing TML files into ThoughtSpot. It eliminates the need for adding FQNs of the referenced objects manually during the import operation.
     * @param exportMetadataTMLRequest
     */
    exportMetadataTML(exportMetadataTMLRequest: ExportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 9.0.0.cl or later   Fetches data from a saved Answer.  Requires at least view access to the saved Answer.
     * @param fetchAnswerDataRequest
     */
    fetchAnswerData(fetchAnswerDataRequest: FetchAnswerDataRequest, _options?: Configuration): Promise<AnswerDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for an Answer object.  Requires at least view access to the Answer object.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {    \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",    \"metadata_name\":\"Total sales\",    \"metadata_type\":\"ANSWER\",    \"sql_queries\":[       {          \"metadata_id\":\"8fbe44a8-46ad-4b16-8d39-184b2fada490\",          \"metadata_name\":\"Total sales -test\",          \"sql_query\":\"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  \\\"ta_2\\\".\\\"PRODUCTNAME\\\" \\\"ca_2\\\", \\n  \\\"ta_1\\\".\\\"STORENAME\\\" \\\"ca_3\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_4\\\", \\n  CASE\\n    WHEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_3\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_5\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_3\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_3\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_PRODUCTS\\\" \\\"ta_2\\\"\\n    ON \\\"ta_3\\\".\\\"PRODUCTID\\\" = \\\"ta_2\\\".\\\"PRODUCTID\\\"\\nGROUP BY \\n  \\\"ca_1\\\", \\n  \\\"ca_2\\\", \\n  \\\"ca_3\\\"\\n\"       }    ] } ```
     * @param fetchAnswerSqlQueryRequest
     */
    fetchAnswerSqlQuery(fetchAnswerSqlQueryRequest: FetchAnswerSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets data from a Liveboard object and its visualization.    Requires at least view access to the Liveboard.  #### Usage guidelines  In the request body, specify the GUID or name of the Liveboard. To get data for specific visualizations, add the GUIDs or names of the visualizations in the API request.  To include unsaved changes in the report, pass the `transient_pinboard_content` script generated from the `getExportRequestForCurrentPinboard` method in the Visual Embed SDK. Upon successful execution, the API returns the report with unsaved changes. If the new Liveboard experience mode, the transient content includes ad hoc changes to visualizations such as sorting, toggling of legends, and data drill down.
     * @param fetchLiveboardDataRequest
     */
    fetchLiveboardData(fetchLiveboardDataRequest: FetchLiveboardDataRequest, _options?: Configuration): Promise<LiveboardDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches the underlying SQL query data for a Liveboard object and its visualizations.  Requires at least view access to the Liveboard object.  To get SQL query data for a Liveboard, specify the GUID of the Liveboard. Optionally, you can add an array of visualization GUIDs to retrieve the SQL query data for visualizations in the Liveboard.  Upon successful execution, the API returns the SQL queries for the specified object as shown in this example: ``` {   \"metadata_id\": \"fa68ae91-7588-4136-bacd-d71fb12dda69\",   \"metadata_name\": \"Total Sales\",   \"metadata_type\": \"LIVEBOARD\",   \"sql_queries\": [     {       \"metadata_id\": \"b3b6d2b9-089a-490c-8e16-b144650b7843\",       \"metadata_name\": \"Total quantity purchased, Total sales by region\",       \"sql_query\": \"SELECT \\n  \\\"ta_1\\\".\\\"REGION\\\" \\\"ca_1\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"QUANTITYPURCHASED\\\")\\n    ELSE 0\\n  END \\\"ca_2\\\", \\n  CASE\\n    WHEN sum(\\\"ta_2\\\".\\\"SALES\\\") IS NOT NULL THEN sum(\\\"ta_2\\\".\\\"SALES\\\")\\n    ELSE 0\\n  END \\\"ca_3\\\"\\nFROM \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"FACT_RETAPP_SALES\\\" \\\"ta_2\\\"\\n  JOIN \\\"RETAILAPPAREL\\\".\\\"PUBLIC\\\".\\\"DIM_RETAPP_STORES\\\" \\\"ta_1\\\"\\n    ON \\\"ta_2\\\".\\\"STOREID\\\" = \\\"ta_1\\\".\\\"STOREID\\\"\\nGROUP BY \\\"ca_1\\\"\"     }   ] } ```
     * @param fetchLiveboardSqlQueryRequest
     */
    fetchLiveboardSqlQuery(fetchLiveboardSqlQueryRequest: FetchLiveboardSqlQueryRequest, _options?: Configuration): Promise<SqlQueryResponse>;
    /**
     *   Version: 9.0.0.cl or later   Fetches security audit logs.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage guidelines  By default, the API retrieves logs for the last 24 hours. You can set a custom duration in EPOCH time. Make sure the log duration specified in your API request doesn’t exceed 24 hours. If you must fetch logs for a longer time range, modify the duration and make multiple sequential API requests.  Upon successful execution, the API returns logs with the following information: * timestamp of the event * event ID * event type * name and GUID of the user * IP address of ThoughtSpot instance
     * @param fetchLogsRequest
     */
    fetchLogs(fetchLogsRequest: FetchLogsRequest, _options?: Configuration): Promise<Array<LogResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Fetches object permission details for a given principal object such as a user and group.  Requires view access to the metadata object.  #### Usage guidelines  * To get a list of all metadata objects that a user or group can access, specify the `type` and GUID or name of the principal. * To get permission details for a specific object, add the `type` and GUID or name of the metadata object to your API request.  Upon successful execution, the API returns a list of metadata objects and permission details for each object.
     * @param fetchPermissionsOfPrincipalsRequest
     */
    fetchPermissionsOfPrincipals(fetchPermissionsOfPrincipalsRequest: FetchPermissionsOfPrincipalsRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Fetches permission details for a given metadata object.  Requires view access to the metadata object.  #### Usage guidelines  * To fetch a list of users and groups for a metadata object, specify `type` and GUID or name of the metadata object. * To get permission details for a specific user or group, add `type` and GUID or name of the principal object to your API request.  Upon successful execution, the API returns permission details and principal information for the object specified in the API request.
     * @param fetchPermissionsOnMetadataRequest
     */
    fetchPermissionsOnMetadata(fetchPermissionsOnMetadataRequest: FetchPermissionsOnMetadataRequest, _options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret_key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable).  **Note**: When both `password` and `secret_key` are included in the API request, `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, specify the Org ID in the `org_id` attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param getFullAccessTokenRequest
     */
    getFullAccessToken(getFullAccessTokenRequest: GetFullAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a `username` and `password` (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid=api-authv2#bearerToken)), or by using the cluster’s `secret key` (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid=trusted-auth#trusted-auth-enable)).  To generate a `secret_key` on your cluster, the administrator must enable **Trusted authentication** in the **Develop** > **Customizations** > **Security Settings** page.  **Note**: When both `password` and `secret_key` are included in the API request,  `password` takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * `auto_create` * `username`  To assign privileges to the new user, specify the group name or GUID in `group_identifiers`.  To add the user to an Org, send the `Org ID` in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param getObjectAccessTokenRequest
     */
    getObjectAccessToken(getObjectAccessTokenRequest: GetObjectAccessTokenRequest, _options?: Configuration): Promise<Token>;
    /**
     *   Version: 9.0.0.cl or later   Retrieves the current configuration details of the cluster. If the request is successful, the API returns a list configuration settings applied on the cluster.  Requires `ADMINISTRATION`(**Can administer ThoughtSpot**) privilege to view these complete configuration settings of the cluster.  This API does not require any parameters to be passed in the request.
     */
    getSystemConfig(_options?: Configuration): Promise<SystemConfig>;
    /**
     *   Version: 9.0.0.cl or later   Gets system information such as the release version, locale, time zone, deployment environment, date format, and date time format of the cluster.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.  This API does not require any parameters to be passed in the request.
     */
    getSystemInformation(_options?: Configuration): Promise<SystemInfo>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of configuration overrides applied on the cluster.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  This API does not require any parameters to be passed in the request.
     */
    getSystemOverrideInfo(_options?: Configuration): Promise<any>;
    /**
     *   Version: 9.0.0.cl or later   Imports [TML](https://docs.thoughtspot.com/cloud/latest/tml) files into ThoughtSpot.  Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtsSpot**) privilege.  #### Usage guidelines  *  Import all related objects in a single TML Import API call. For example, Tables that use the same Connection object and Worksheets connected to these Tables. * Include the `fqn` property to distinguish objects that have the same name.   For example, if you have multiple Connections or Worksheets with the same name on ThoughtSpot and the Connection or Worksheet referenced in your TML file does not have a unique name to distinguish, it may result in invalid object references.   Adding `fqn` helps ThoughtSpot differentiate a Table from another with the same name.   We recommend [exporting TML with FQNs](#/http/api-endpoints/metadata/export-metadata-tml) and using these during the import operation. * You can upload multiple TML files at a time.   If you import a Worksheet along with Liveboards, Answers, and other dependent objects in a single API call, the imported objects will be immediately available for use.   When you import only a Worksheet object, it may take some time for the Worksheet to become available in the ThoughtSpot system. Please wait for a few minutes, and then proceed to create an Answer and Liveboard from the newly imported Worksheet.
     * @param importMetadataTMLRequest
     */
    importMetadataTML(importMetadataTMLRequest: ImportMetadataTMLRequest, _options?: Configuration): Promise<Array<any>>;
    /**
     *   Version: 9.0.0.cl or later   Imports group objects from external databases into ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  During the import operation:  * If the specified group is not available in ThoughtSpot, it will be added to ThoughtSpot. * If `delete_unspecified_groups` is set to `true`, the groups not specified in the API request, excluding administrator and system user groups, are deleted. * If the specified groups are already available in ThoughtSpot, the object properties of these groups are modified and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.
     * @param importUserGroupsRequest
     */
    importUserGroups(importUserGroupsRequest: ImportUserGroupsRequest, _options?: Configuration): Promise<ImportUserGroupsResponse>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse>;
    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the `/api/rest/2.0/auth/token/revoke` endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).
     * @param revokeTokenRequest
     */
    revokeToken(revokeTokenRequest: RevokeTokenRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>>;
    /**
     *   Version: 9.2.0.cl or later   Gets connection objects. Requires `DATAMANAGEMENT` (**Can manage data**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  - To get a list of all connections available in the ThoughtSpot system, send the API request without any attributes in the request body. - To get the connection objects for a specific type of data warehouse, specify the type in `data_warehouse_types`. - To fetch details of a connection object, specify the connection object GUID or name. The `name_pattern` attribute allows passing partial text with `%` for a wildcard match. - To get details of the database, schemas, tables, or columns from a data connection object, specify `data_warehouse_object_type`. - To get a specific database, schema, table, or column from a connection object, define the object type in `data_warehouse_object_type` and object properties in the `data_warehouse_objects` array. For example, to search for a column, you must pass the database, schema, and table names in the API request.   Note that in the following example, object properties are set in a hierarchical order (`database` > `schema` > `table` > `column`).  ``` {   \"connections\": [     {       \"identifier\": \"b9d1f2ef-fa65-4a4b-994e-30fa2d57b0c2\",       \"data_warehouse_objects\": [         {           \"database\": \"NEBULADEV\",           \"schema\": \"INFORMATION_SCHEMA\",           \"table\": \"APPLICABLE_ROLES\",           \"column\": \"ROLE_NAME\"         }       ]     }   ],   \"data_warehouse_object_type\": \"COLUMN\" } ```  - To fetch data by `configuration`, specify `data_warehouse_object_type`. For example, to fetch columns from the `DEVELOPMENT` database, specify the `data_warehouse_object_type` as `DATABASE` and define the `configuration` string as `{\"database\":\"DEVELOPMENT\"}`. To get column data for a specific table, specify the table, for example,`{\"database\":\"RETAILAPPAREL\",\"table\":\"PIPES\"}`. - To query connections by `authentication_type`, specify `data_warehouse_object_type`. Supported values for `authentication_type` are:   - `SERVICE_ACCOUNT`: For connections that require service account credentials to authenticate to the Cloud Data Warehouse and fetch data.   - `OAUTH`: For connections that require OAuth credentials to authenticate to the Cloud Data Warehouse and fetch data. Teradata, Oracle, and Presto Cloud Data Warehouses do not support the OAuth authentication type.   - `IAM`: For connections that have the IAM OAuth set up. This authentication type is supported on Amazon Redshift connections only.   - `EXTOAUTH`: For connections that have external OAuth set up. ThoughtSpot supports external [OAuth with Microsoft Azure Active Directory (AD)](https://docs.thoughtspot.com/cloud/latest/ connections-snowflake-azure-ad-oauth) and [Okta for Snowflake data connections](https://docs.thoughtspot.com/cloud/latest/connections-snowflake-okta-oauth). - To include more details about connection objects in the API response, set `include_details` to `true`. - You can also sort the output by field names and filter connections by tags.  **NOTE**: When filtering connection records by parameters other than `data_warehouse_types` or `tag_identifiers`, ensure that you set `record_size` to `-1` and `record_offset` to `0` for precise results.
     * @param searchConnectionRequest
     */
    searchConnection(searchConnectionRequest: SearchConnectionRequest, _options?: Configuration): Promise<Array<SearchConnectionResponse>>;
    /**
     *   Version: 9.6.0.cl or later   Gets custom actions configured on the cluster.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCustomActionsRequest
     */
    searchCustomActions(searchCustomActionsRequest: SearchCustomActionsRequest, _options?: Configuration): Promise<Array<ResponseCustomAction>>;
    /**
     *   Version: 9.0.0.cl or later   Generates an Answer from a given data source.  Requires at least view access to the data source.  #### Usage guidelines  To generate a new Answer, specify the data source GUID. The data source can be a Worksheet, View, Table, or SQL view.  Pass search tokens in the `query_string` attribute in the API request as shown in the following example. For more information passing search query string in API requests, see [`Components of a search query`](https://developers.thoughtspot.com/docs/?pageid=search-data-api#components).   ``` {   \"query_string\": \"[sales] by [store]\",   \"logical_table_identifier\": \"cd252e5c-b552-49a8-821d-3eadaa049cca\", } ```
     * @param searchDataRequest
     */
    searchData(searchDataRequest: SearchDataRequest, _options?: Configuration): Promise<SearchDataResponse>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of metadata objects available on the ThoughtSpot system.  This API endpoint is available to all users who have view access to the object. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view data for all metadata objects, including users and groups.  #### Usage guidelines  - To get all metadata objects, send the API request without any attributes. - To get metadata objects of a specific type, set the `type` attribute. For example, to fetch a Worksheet, set the type as `LOGICAL_TABLE`. - To get a specific metadata object, specify the GUID. - To customize your search and filter the API response, you can use several parameters.   You can search for objects created or modified by specific users, by tags applied to the objects, or by using the include parameters like `include_auto_created_objects`, `include_dependent_objects`, `include_headers`, `include_incomplete_objects`, and so on.   You can also define sorting options to sort the data retrieved in the API response.  **NOTE**: The following parameters support pagination of metadata records: `tag_identifiers` `type` `created_by_user_identifiers` `modified_by_user_identifiers` `owned_by_user_identifiers` `exclude_objects` `include_auto_created_objects` `favorite_object_options` If you are using other parameters to search metadata, set `record_size` to `-1` and `record_offset` to `0`.
     * @param searchMetadataRequest
     */
    searchMetadata(searchMetadataRequest: SearchMetadataRequest, _options?: Configuration): Promise<Array<MetadataSearchResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of Orgs configured on the ThoughtSpot system. To get details of a specific Org, specify the Org ID or name. You can also pass parameters such as status, visibility, and user identifiers to get a specific list of Orgs.  Requires cluster administration (**Can administer Org**) privileges.
     * @param searchOrgsRequest
     */
    searchOrgs(searchOrgsRequest: SearchOrgsRequest, _options?: Configuration): Promise<Array<OrgResponse>>;
    /**
     * Gets Roles configured on a ThoughtSpot instance. Requires cluster Administration, Role Administration or Group Administration privileges.    Version: 9.5.0.cl or later
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
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If you do not get precise results, try setting `record_size` to `-1` and `record_offset` to `0`.
     * @param searchUserGroupsRequest
     */
    searchUserGroups(searchUserGroupsRequest: SearchUserGroupsRequest, _options?: Configuration): Promise<Array<UserGroupResponse>>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<Array<User>>;
    /**
     *   Version: 9.0.0.cl or later   Allows sharing one or several metadata objects with users and groups in ThoughtSpot.  Requires edit access to the metadata object.  The API endpoint allows sharing only the following types of metadata objects: * Liveboards * Visualizations * Answers * Worksheets * Views  You can provide `READ_ONLY` or `MODIFY` access when sharing an object with another user or group. With `READ_ONLY` access grants view access to the shared object, whereas `MODIFY` provides edit access.  To prevent a user or group from accessing the shared object, specify the GUID or name of the principal and set `shareMode` to `NO_ACCESS`.
     * @param shareMetadataRequest
     */
    shareMetadata(shareMetadataRequest: ShareMetadataRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Removes the tags applied to a Liveboard, Answer, Table, or Worksheet.  Requires edit access to the metadata object.
     * @param assignTagRequest
     */
    unassignTag(assignTagRequest: AssignTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Updates a connection object.    Requires `DATAMANAGEMENT` (**Can manage data**) and edit permissions to the connection object, or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  To update a connection object, pass these parameters in your API request:  1. GUID of the connection object. 2. If you are updating tables or database schema of a connection object:    a. Add the updated JSON map of metadata with database, schema, and tables in `data_warehouse_config`.    b. Set `validate` to `true`. 3. If you are updating a configuration attribute, connection name, or description, you can set `validate` to `false`.
     * @param updateConnectionRequest
     */
    updateConnection(updateConnectionRequest: UpdateConnectionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.6.0.cl or later   Updates a custom action.  Requires `DEVELOPER` (**Has Developer privilege**) or `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Usage Guidelines  The API allows you to modify the following properties:  * Name of the custom action * Action availability to groups * Association to metadata objects * Authentication settings for a URL-based action  For more information, see [Custom actions](https://developers.thoughtspot.com/docs/?pageid=custom-action-intro).
     * @param customActionIdentifier Unique ID or name of the custom action.
     * @param updateCustomActionRequest
     */
    updateCustomAction(customActionIdentifier: string, updateCustomActionRequest: UpdateCustomActionRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates an Org object. You can modify Org properties such as name, description, and user associations.  Requires cluster administration (**Can administer Org**) privileges.
     * @param orgIdentifier ID or name of the Org
     * @param updateOrgRequest
     */
    updateOrg(orgIdentifier: string, updateOrgRequest: UpdateOrgRequest, _options?: Configuration): Promise<void>;
    /**
     * Updates a Role. Requires cluster Administration or Role Administration privileges.    Version: 9.5.0.cl or later
     * @param roleIdentifier Unique ID or name of the role.
     * @param updateRoleRequest
     */
    updateRole(roleIdentifier: string, updateRoleRequest: UpdateRoleRequest, _options?: Configuration): Promise<RoleResponse>;
    /**
     *  Update schedule.    Version: 9.4.0.cl or later   Updates a scheduled Liveboard job.  Requires at least edit access to Liveboards. To update a schedule on behalf of another user, you need `ADMINISTRATION` (**Can administer Org**) or `JOBSCHEDULING` (**Can schedule for others**) privilege and edit access to the Liveboard.  The API endpoint allows you to pause a scheduled job, change the status of a paused job. You can also edit the recipients list, frequency of the job, format of the file to send to the recipients in email notifications, PDF options, and time zone setting.
     * @param scheduleIdentifier Unique ID or name of the schedule.
     * @param updateScheduleRequest
     */
    updateSchedule(scheduleIdentifier: string, updateScheduleRequest: UpdateScheduleRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Updates the current configuration of the cluster. You must send the configuration settings in JSON format.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges.
     * @param updateSystemConfigRequest
     */
    updateSystemConfig(updateSystemConfigRequest: UpdateSystemConfigRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates a tag object.  You can modify the `name` and `color` properties of a tag object.    Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param tagIdentifier Name or Id of the tag.
     * @param updateTagRequest
     */
    updateTag(tagIdentifier: string, updateTagRequest: UpdateTagRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Updates the properties of a group object in ThoughtSpot.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  #### Supported operations  This API endpoint lets you perform the following operations in a single API request:  * Edit [privileges](https://developers.thoughtspot.com/docs/?pageid=api-user-management#group-privileges) * Add or remove users * Change sharing visibility settings * Add or remove sub-groups * Assign a default Liveboard  or update the existing settings
     * @param groupIdentifier GUID or name of the group.
     * @param updateUserGroupRequest
     */
    updateUserGroup(groupIdentifier: string, updateUserGroupRequest: UpdateUserGroupRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param validateMergeRequest
     */
    validateMerge(validateMergeRequest: ValidateMergeRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
}

declare class PromiseUsersApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor);
    /**
     *   Version: 9.0.0.cl or later   Updates the current password of the user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param changeUserPasswordRequest
     */
    changeUserPassword(changeUserPasswordRequest: ChangeUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Creates a user in ThoughtSpot.  The API endpoint allows you to configure several user properties such as email address, account status, share notification preferences, and sharing visibility. You can provision the user to [groups](https://docs.thoughtspot.com/cloud/latest/groups-privileges) and [Orgs](https://docs.thoughtspot.com/cloud/latest/orgs-overview). You can also add Liveboard, Answer, and Worksheet objects to the user’s favorites list, assign a default Liveboard for the user, and set user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param createUserRequest
     */
    createUser(createUserRequest: CreateUserRequest, _options?: Configuration): Promise<User>;
    /**
     *   Version: 9.0.0.cl or later   Deletes a user from the ThoughtSpot system.  If you want to remove a user from a specific Org but not from ThoughtSpot, update the group and Org mapping properties of the user object via a POST API call to the [/api/rest/2.0/users/{user_identifier}/update](#/http/api-endpoints/users/update-user) endpoint.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     */
    deleteUser(userIdentifier: string, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Enforces logout on current user sessions.    Use this API with caution as it may invalidate active user sessions and force users to re-login. Make sure you specify the usernames or GUIDs. If you pass null values in the API call, all user sessions on your cluster become invalid, and the users are forced to re-login.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param forceLogoutUsersRequest
     */
    forceLogoutUsers(forceLogoutUsersRequest: ForceLogoutUsersRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Imports user data from external databases into ThoughtSpot. During the user import operation:  * If the specified users are not available in ThoughtSpot, the users are created and assigned a default password. Defining a `default_password` in the API request is optional. * If `delete_unspecified_users` is set to `true`, the users not specified in the API request, excluding the `tsadmin`, `guest`, `system` and `su` users, are deleted. * If the specified user objects are already available in ThoughtSpot, the object properties are updated and synchronized as per the input data in the API request.  A successful API call returns the object that represents the changes made in the ThoughtSpot system.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param importUsersRequest
     */
    importUsers(importUsersRequest: ImportUsersRequest, _options?: Configuration): Promise<ImportUsersResponse>;
    /**
     *   Version: 9.0.0.cl or later   Resets the password of a user account. Administrators can reset password on behalf of a user.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param resetUserPasswordRequest
     */
    resetUserPassword(resetUserPasswordRequest: ResetUserPasswordRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.0.0.cl or later   Gets a list of users available on the ThoughtSpot system.  To get details of a specific user, specify the user GUID or name. You can also filter the API response based on groups, Org ID, user visibility, account status, user type, and user preference settings and favorites.  Available to all users. Users with `ADMINISTRATION` (**Can administer ThoughtSpot**) privileges can view all users properties.  **NOTE**: If the API returns an empty list, consider increasing the value of the `record_size` parameter. To search across all available users, set `record_size` to `-1`.
     * @param searchUsersRequest
     */
    searchUsers(searchUsersRequest: SearchUsersRequest, _options?: Configuration): Promise<Array<User>>;
    /**
     *   Version: 9.0.0.cl or later   Updates a user object.  You can modify user properties such as username, email, and share notification settings. You can also assign new groups and Orgs, remove the user from a group or Org, reset password, and modify user preferences.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param userIdentifier GUID / name of the user
     * @param updateUserRequest
     */
    updateUser(userIdentifier: string, updateUserRequest: UpdateUserRequest, _options?: Configuration): Promise<void>;
}

declare class PromiseVersionControlApi {
    private api;
    constructor(configuration: Configuration, requestFactory?: VersionControlApiRequestFactory, responseProcessor?: VersionControlApiResponseProcessor);
    /**
     *   Version: 9.2.0.cl or later   Commits TML files of metadata objects to the Git branch configured on your instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  Before using this endpoint to push your commits:  * Enable Git integration on your instance. * Make sure the Git repository and branch details are configured on your instance.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param commitBranchRequest
     */
    commitBranch(commitBranchRequest: CommitBranchRequest, _options?: Configuration): Promise<CommitResponse>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to connect a ThoughtSpot instance to a Git repository.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  You can use this API endpoint to connect your ThoughtSpot development and production environments to the development and production branches of a Git repository.  Before using this endpoint to connect your ThoughtSpot instance to a Git repository, check the following prerequisites:  * You have a Git repository. If you are using GitHub, make sure you have a valid account and an access token to connect ThoughtSpot to GitHub. For information about generating a token, see [GitHub Documentation](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens).  * Your access token has `repo` scope that grants full access to public and private repositories. * Your Git repository has a branch that can be configured as a default branch in ThoughtSpot.  For more information, see [Git integration documentation](https://developers.thoughtspot.com/docs/?pageid=git-integration).
     * @param createConfigRequest
     */
    createConfig(createConfigRequest: CreateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Deletes Git repository configuration from your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param deleteConfigRequest
     */
    deleteConfig(deleteConfigRequest: DeleteConfigRequest, _options?: Configuration): Promise<void>;
    /**
     *   Version: 9.2.0.cl or later   Allows you to deploy a commit and publish TML content to your ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  The API deploys the head of the branch unless a `commit_id` is specified in the API request. If the branch name is not defined in the request, the default branch is considered for deploying commits.
     * @param deployCommitRequest
     */
    deployCommit(deployCommitRequest: DeployCommitRequest, _options?: Configuration): Promise<Array<DeployResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Reverts TML objects to a previous commit specified in the API request.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.  In the API request, specify the `commit_id`. If the branch name is not specified in the request, the API will consider the default branch configured on your instance.  By default, the API reverts all objects. If the revert operation fails for one of the objects provided in the commit, the API returns an error and does not revert any object.
     * @param commitId Commit id to which the object should be reverted
     * @param revertCommitRequest
     */
    revertCommit(commitId: string, revertCommitRequest: RevertCommitRequest, _options?: Configuration): Promise<RevertResponse>;
    /**
     *   Version: 9.2.0.cl or later   Gets a list of commits for a given metadata object.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchCommitsRequest
     */
    searchCommits(searchCommitsRequest: SearchCommitsRequest, _options?: Configuration): Promise<Array<CommitHistoryResponse>>;
    /**
     *   Version: 9.2.0.cl or later   Gets Git repository connections configured on the ThoughtSpot instance.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param searchConfigRequest
     */
    searchConfig(searchConfigRequest: SearchConfigRequest, _options?: Configuration): Promise<Array<RepoConfigObject>>;
    /**
     *   Version: 9.2.0.cl or later   Updates Git repository configuration settings.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
     * @param updateConfigRequest
     */
    updateConfig(updateConfigRequest: UpdateConfigRequest, _options?: Configuration): Promise<RepoConfigObject>;
    /**
     *   Version: 9.2.0.cl or later   Validates the content of your source branch against the objects in your destination environment.  Before merging content from your source branch to the destination branch, run this API operation from your destination environment and ensure that the changes from the source branch function in the destination environment.  Requires `ADMINISTRATION` (**Can administer ThoughtSpot**) privilege.
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

export { APIKey, APIKeyInput, ActionConfig, ActionConfigInput, ActionConfigInputCreate, ActionConfigInputCreatePositionEnum, ActionConfigInputPositionEnum, ActionDetails, ActionDetailsInput, ActionDetailsInputCreate, AnswerContent, AnswerDataResponse, ApiException, ApiKeyConfiguration, AssignChangeAuthorRequest, AssignTagRequest, AssociateMetadataInput, AssociateMetadataInputCreate, AssociateMetadataInputCreateTypeEnum, AssociateMetadataInputTypeEnum, AuthMethods, AuthMethodsConfiguration, Authentication, PromiseAuthenticationApi as AuthenticationApi, AuthenticationInput, Author, AuthorMetadataTypeInput, AuthorMetadataTypeInputTypeEnum, AuthorType, BaseServerConfiguration, BasicAuth, BasicAuthInput, BearerAuthAuthentication, CALLBACK, CALLBACKInput, CALLBACKInputMandatory, ChangeUserPasswordRequest, Column, CommitBranchRequest, CommitFileType, CommitHistoryResponse, CommitResponse, CommiterType, Configuration, ConnectionInput, PromiseConnectionsApi as ConnectionsApi, CreateConfigRequest, CreateConnectionRequest, CreateConnectionRequestDataWarehouseTypeEnum, CreateConnectionResponse, CreateConnectionResponseDataWarehouseTypeEnum, CreateCustomActionRequest, CreateOrgRequest, CreateRoleRequest, CreateRoleRequestPrivilegesEnum, CreateScheduleRequest, CreateScheduleRequestFileFormatEnum, CreateScheduleRequestMetadataTypeEnum, CreateScheduleRequestTimeZoneEnum, CreateTagRequest, CreateUserGroupRequest, CreateUserGroupRequestPrivilegesEnum, CreateUserGroupRequestTypeEnum, CreateUserGroupRequestVisibilityEnum, CreateUserRequest, CreateUserRequestAccountStatusEnum, CreateUserRequestAccountTypeEnum, CreateUserRequestPreferredLocaleEnum, CreateUserRequestVisibilityEnum, CronExpression, CronExpressionInput, PromiseCustomActionApi as CustomActionApi, CustomActionMetadataTypeInput, CustomActionMetadataTypeInputTypeEnum, PromiseDataApi as DataApi, DataWarehouseObjectInput, DataWarehouseObjects, Database, DbtSearchResponse, DefaultActionConfig, DefaultActionConfigInput, DefaultActionConfigInputCreate, DefaultActionConfigSearchInput, DeleteConfigRequest, DeleteConnectionRequest, DeleteMetadataRequest, DeleteMetadataTypeInput, DeleteMetadataTypeInputTypeEnum, DeployCommitRequest, DeployCommitRequestDeployPolicyEnum, DeployCommitRequestDeployTypeEnum, DeployResponse, ErrorResponse, ExcludeMetadataListItemInput, ExcludeMetadataListItemInputTypeEnum, ExportAnswerReportRequest, ExportAnswerReportRequestFileFormatEnum, ExportLiveboardReportRequest, ExportLiveboardReportRequestFileFormatEnum, ExportMetadataTMLRequest, ExportMetadataTMLRequestEdocFormatEnum, ExportMetadataTMLRequestExportSchemaVersionEnum, ExportMetadataTypeInput, ExportMetadataTypeInputTypeEnum, FavoriteMetadataInput, FavoriteMetadataInputTypeEnum, FavoriteMetadataItem, FavoriteMetadataItemTypeEnum, FavoriteObjectOptionsInput, FetchAnswerDataRequest, FetchAnswerDataRequestDataFormatEnum, FetchAnswerSqlQueryRequest, FetchConnectionDiffStatusResponse, FetchLiveboardDataRequest, FetchLiveboardDataRequestDataFormatEnum, FetchLiveboardSqlQueryRequest, FetchLogsRequest, FetchLogsRequestLogTypeEnum, FetchPermissionsOfPrincipalsRequest, FetchPermissionsOnMetadataRequest, ForceLogoutUsersRequest, Frequency, FrequencyInput, GenericInfo, GetFullAccessTokenRequest, GetObjectAccessTokenRequest, GetTokenResponse, PromiseGroupsApi as GroupsApi, GroupsImportListInput, GroupsImportListInputPrivilegesEnum, GroupsImportListInputTypeEnum, GroupsImportListInputVisibilityEnum, HttpBasicConfiguration, HttpBearerConfiguration, HttpException, HttpFile, HttpLibrary, HttpMethod, ImportMetadataTMLRequest, ImportMetadataTMLRequestImportPolicyEnum, ImportUser, ImportUserAccountStatusEnum, ImportUserAccountTypeEnum, ImportUserGroupsRequest, ImportUserGroupsResponse, ImportUserType, ImportUserVisibilityEnum, ImportUsersRequest, ImportUsersResponse, IsomorphicFetchHttpLibrary, JWTMetadataObject, JWTMetadataObjectTypeEnum, JWTParameter, JWTUserOptions, JWTUserOptionsParametersInner, LiveboardContent, LiveboardDataResponse, LiveboardOptions, LiveboardOptionsInput, PromiseLogApi as LogApi, LogResponse, LoginRequest, PromiseMetadataApi as MetadataApi, MetadataAssociationItem, MetadataInput, MetadataInputTypeEnum, MetadataListItemInput, MetadataListItemInputTypeEnum, MetadataObject, MetadataObjectTypeEnum, MetadataResponse, MetadataResponseTypeEnum, MetadataSearchResponse, MetadataSearchResponseMetadataTypeEnum, MetadataSearchSortOptions, MetadataSearchSortOptionsFieldNameEnum, MetadataSearchSortOptionsOrderEnum, PromiseMiddleware as Middleware, ModelTableList, OAuth2Configuration, ObjectIDAndName, Org, OrgResponse, OrgResponseStatusEnum, OrgResponseVisibilityEnum, PromiseOrgsApi as OrgsApi, ParametersListItem, ParametersListItemInput, PdfOptions, PdfOptionsInput, PdfOptionsInputPageOrientationEnum, PdfOptionsPageSizeEnum, PermissionInput, PermissionInputShareModeEnum, PermissionsMetadataTypeInput, PermissionsMetadataTypeInputTypeEnum, PngOptionsInput, PrincipalsInput, PrincipalsInputTypeEnum, PrincipalsListItem, PrincipalsListItemInput, PromiseHttpLibrary, RecipientDetails, RecipientDetailsInput, RepoConfigObject, PromiseReportsApi as ReportsApi, RequestBody, RequestContext, RequiredError, ResetUserPasswordRequest, ResponseActivationURL, ResponseBody, ResponseContext, ResponseCustomAction, ResponseSchedule, ResponseScheduleRun, RevertCommitRequest, RevertCommitRequestRevertPolicyEnum, RevertResponse, RevertedMetadata, RevokeTokenRequest, RiseSetter, Role, RoleResponse, RoleResponsePermissionEnum, RoleResponsePrivilegesEnum, PromiseRolesApi as RolesApi, RuntimeFilter, RuntimeParamOverride, RuntimeSort, ScheduleHistoryRunsOptionsInput, PromiseSchedulesApi as SchedulesApi, SchedulesPdfOptionsInput, SchedulesPdfOptionsInputPageSizeEnum, SchemaObject, Scope, SearchCommitsRequest, SearchCommitsRequestMetadataTypeEnum, SearchConfigRequest, SearchConnectionRequest, SearchConnectionRequestAuthenticationTypeEnum, SearchConnectionRequestDataWarehouseObjectTypeEnum, SearchConnectionRequestDataWarehouseTypesEnum, SearchConnectionResponse, SearchConnectionResponseDataWarehouseTypeEnum, SearchCustomActionsRequest, SearchCustomActionsRequestTypeEnum, SearchDataRequest, SearchDataRequestDataFormatEnum, SearchDataResponse, SearchMetadataRequest, SearchMetadataRequestDependentObjectVersionEnum, SearchOrgsRequest, SearchOrgsRequestStatusEnum, SearchOrgsRequestVisibilityEnum, SearchRoleResponse, SearchRoleResponsePermissionEnum, SearchRoleResponsePrivilegesEnum, SearchRolesRequest, SearchRolesRequestPermissionsEnum, SearchRolesRequestPrivilegesEnum, SearchSchedulesRequest, SearchTagsRequest, SearchUserGroupsRequest, SearchUserGroupsRequestPrivilegesEnum, SearchUserGroupsRequestTypeEnum, SearchUserGroupsRequestVisibilityEnum, SearchUsersRequest, SearchUsersRequestAccountStatusEnum, SearchUsersRequestAccountTypeEnum, SearchUsersRequestPrivilegesEnum, SearchUsersRequestVisibilityEnum, PromiseSecurityApi as SecurityApi, SecurityAuthentication, SelfDecodingBody, ServerConfiguration, ShareMetadataRequest, ShareMetadataRequestMetadataTypeEnum, SharePermissionsInput, SharePermissionsInputShareModeEnum, SortOptionInput, SortOptionInputFieldNameEnum, SortOptionInputOrderEnum, SortOptions, SortOptionsFieldNameEnum, SortOptionsOrderEnum, SortingOptions, SqlQuery, SqlQueryResponse, SqlQueryResponseMetadataTypeEnum, PromiseSystemApi as SystemApi, SystemConfig, SystemInfo, Table, Tag, TagMetadataTypeInput, TagMetadataTypeInputTypeEnum, PromiseTagsApi as TagsApi, PromiseThoughtSpotRestApi as ThoughtSpotRestApi, Token, TokenProvider, URL, URLInput, URLInputMandatory, UpdateConfigRequest, UpdateConnectionRequest, UpdateCustomActionRequest, UpdateCustomActionRequestOperationEnum, UpdateOrgRequest, UpdateOrgRequestOperationEnum, UpdateRoleRequest, UpdateRoleRequestPrivilegesEnum, UpdateScheduleRequest, UpdateScheduleRequestFileFormatEnum, UpdateScheduleRequestMetadataTypeEnum, UpdateScheduleRequestStatusEnum, UpdateScheduleRequestTimeZoneEnum, UpdateSystemConfigRequest, UpdateTagRequest, UpdateUserGroupRequest, UpdateUserGroupRequestOperationEnum, UpdateUserGroupRequestPrivilegesEnum, UpdateUserGroupRequestTypeEnum, UpdateUserGroupRequestVisibilityEnum, UpdateUserRequest, UpdateUserRequestAccountStatusEnum, UpdateUserRequestAccountTypeEnum, UpdateUserRequestOperationEnum, UpdateUserRequestPreferredLocaleEnum, UpdateUserRequestVisibilityEnum, User, UserAccountStatusEnum, UserAccountTypeEnum, UserGroup, UserGroupResponse, UserGroupResponseParentTypeEnum, UserGroupResponseTypeEnum, UserGroupResponseVisibilityEnum, UserParentTypeEnum, UserVisibilityEnum, PromiseUsersApi as UsersApi, ValidateMergeRequest, PromiseVersionControlApi as VersionControlApi, configureAuthMethods, createBearerAuthenticationConfig, createConfiguration, server1, servers, wrapHttpLibrary };
