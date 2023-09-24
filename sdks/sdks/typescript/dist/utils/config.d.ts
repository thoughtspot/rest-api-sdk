import { GetFullAccessTokenRequest } from "../models/GetFullAccessTokenRequest";
export declare const createBearerAuthenticationConfig: (url: string, paramOrTokenProvider: GetFullAccessTokenRequest | (() => Promise<string>)) => import("../configuration").Configuration;
