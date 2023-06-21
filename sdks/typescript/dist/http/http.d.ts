import { Observable } from '../rxjsStub';
export * from './isomorphic-fetch';
export declare enum HttpMethod {
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
export type HttpFile = Blob & {
    readonly name: string;
};
export declare class HttpException extends Error {
    constructor(msg: string);
}
export type RequestBody = undefined | string | FormData | URLSearchParams;
export declare class RequestContext {
    private httpMethod;
    private headers;
    private body;
    private url;
    constructor(url: string, httpMethod: HttpMethod);
    getUrl(): string;
    setUrl(url: string): void;
    setBody(body: RequestBody): void;
    getHttpMethod(): HttpMethod;
    getHeaders(): {
        [key: string]: string;
    };
    getBody(): RequestBody;
    setQueryParam(name: string, value: string): void;
    addCookie(name: string, value: string): void;
    setHeaderParam(key: string, value: string): void;
}
export interface ResponseBody {
    text(): Promise<string>;
    binary(): Promise<Blob>;
}
export declare class SelfDecodingBody implements ResponseBody {
    private dataSource;
    constructor(dataSource: Promise<Blob>);
    binary(): Promise<Blob>;
    text(): Promise<string>;
}
export declare class ResponseContext {
    httpStatusCode: number;
    headers: {
        [key: string]: string;
    };
    body: ResponseBody;
    constructor(httpStatusCode: number, headers: {
        [key: string]: string;
    }, body: ResponseBody);
    getParsedHeader(headerName: string): {
        [parameter: string]: string;
    };
    getBodyAsFile(): Promise<HttpFile>;
    getBodyAsAny(): Promise<string | Blob | undefined>;
}
export interface HttpLibrary {
    send(request: RequestContext): Observable<ResponseContext>;
}
export interface PromiseHttpLibrary {
    send(request: RequestContext): Promise<ResponseContext>;
}
export declare function wrapHttpLibrary(promiseHttpLibrary: PromiseHttpLibrary): HttpLibrary;
