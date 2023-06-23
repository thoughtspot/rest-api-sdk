"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (g && (g = 0, op[0] && (_ = 0)), _) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.ThoughtSpotRestApiResponseProcessor = exports.ThoughtSpotRestApiRequestFactory = void 0;
var baseapi_1 = require("./baseapi");
var http_1 = require("../http/http");
var ObjectSerializer_1 = require("../models/ObjectSerializer");
var exception_1 = require("./exception");
var util_1 = require("../util");
var ThoughtSpotRestApiRequestFactory = (function (_super) {
    __extends(ThoughtSpotRestApiRequestFactory, _super);
    function ThoughtSpotRestApiRequestFactory() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    ThoughtSpotRestApiRequestFactory.prototype.assignChangeAuthor = function (assignChangeAuthorRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (assignChangeAuthorRequest === null || assignChangeAuthorRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "assignChangeAuthor", "assignChangeAuthorRequest");
                        }
                        localVarPath = '/api/rest/2.0/security/metadata/assign';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(assignChangeAuthorRequest, "AssignChangeAuthorRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.assignTag = function (assignTagRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (assignTagRequest === null || assignTagRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "assignTag", "assignTagRequest");
                        }
                        localVarPath = '/api/rest/2.0/tags/assign';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(assignTagRequest, "AssignTagRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.changeUserPassword = function (changeUserPasswordRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (changeUserPasswordRequest === null || changeUserPasswordRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "changeUserPassword", "changeUserPasswordRequest");
                        }
                        localVarPath = '/api/rest/2.0/users/change-password';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(changeUserPasswordRequest, "ChangeUserPasswordRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.commitBranch = function (commitBranchRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (commitBranchRequest === null || commitBranchRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "commitBranch", "commitBranchRequest");
                        }
                        localVarPath = '/api/rest/2.0/vcs/git/branches/commit';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(commitBranchRequest, "CommitBranchRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createConfig = function (createConfigRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createConfigRequest === null || createConfigRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createConfig", "createConfigRequest");
                        }
                        localVarPath = '/api/rest/2.0/vcs/git/config/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createConfigRequest, "CreateConfigRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createConnection = function (createConnectionRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createConnectionRequest === null || createConnectionRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createConnection", "createConnectionRequest");
                        }
                        localVarPath = '/api/rest/2.0/connection/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createConnectionRequest, "CreateConnectionRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createCustomAction = function (createCustomActionRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createCustomActionRequest === null || createCustomActionRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createCustomAction", "createCustomActionRequest");
                        }
                        localVarPath = '/api/rest/2.0/customization/custom-actions';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createCustomActionRequest, "CreateCustomActionRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createOrg = function (createOrgRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createOrgRequest === null || createOrgRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createOrg", "createOrgRequest");
                        }
                        localVarPath = '/api/rest/2.0/orgs/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createOrgRequest, "CreateOrgRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createRole = function (createRoleRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createRoleRequest === null || createRoleRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createRole", "createRoleRequest");
                        }
                        localVarPath = '/api/rest/2.0/roles/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createRoleRequest, "CreateRoleRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createSchedule = function (createScheduleRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createScheduleRequest === null || createScheduleRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createSchedule", "createScheduleRequest");
                        }
                        localVarPath = '/api/rest/2.0/schedules/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createScheduleRequest, "CreateScheduleRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createTag = function (createTagRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createTagRequest === null || createTagRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createTag", "createTagRequest");
                        }
                        localVarPath = '/api/rest/2.0/tags/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createTagRequest, "CreateTagRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createUser = function (createUserRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createUserRequest === null || createUserRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createUser", "createUserRequest");
                        }
                        localVarPath = '/api/rest/2.0/users/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createUserRequest, "CreateUserRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.createUserGroup = function (createUserGroupRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (createUserGroupRequest === null || createUserGroupRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "createUserGroup", "createUserGroupRequest");
                        }
                        localVarPath = '/api/rest/2.0/groups/create';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(createUserGroupRequest, "CreateUserGroupRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteConfig = function (deleteConfigRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/vcs/git/config/delete';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(deleteConfigRequest, "DeleteConfigRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteConnection = function (deleteConnectionRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (deleteConnectionRequest === null || deleteConnectionRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteConnection", "deleteConnectionRequest");
                        }
                        localVarPath = '/api/rest/2.0/connection/delete';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(deleteConnectionRequest, "DeleteConnectionRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteCustomAction = function (customActionIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (customActionIdentifier === null || customActionIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteCustomAction", "customActionIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/customization/custom-actions/{custom_action_identifier}/delete'
                            .replace('{' + 'custom_action_identifier' + '}', encodeURIComponent(String(customActionIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteMetadata = function (deleteMetadataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (deleteMetadataRequest === null || deleteMetadataRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteMetadata", "deleteMetadataRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/delete';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(deleteMetadataRequest, "DeleteMetadataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteOrg = function (orgIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (orgIdentifier === null || orgIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteOrg", "orgIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/orgs/{org_identifier}/delete'
                            .replace('{' + 'org_identifier' + '}', encodeURIComponent(String(orgIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteRole = function (roleIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (roleIdentifier === null || roleIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteRole", "roleIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/roles/{role_identifier}/delete'
                            .replace('{' + 'role_identifier' + '}', encodeURIComponent(String(roleIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteSchedule = function (scheduleIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (scheduleIdentifier === null || scheduleIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteSchedule", "scheduleIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/schedules/{schedule_identifier}/delete'
                            .replace('{' + 'schedule_identifier' + '}', encodeURIComponent(String(scheduleIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteTag = function (tagIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (tagIdentifier === null || tagIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteTag", "tagIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/tags/{tag_identifier}/delete'
                            .replace('{' + 'tag_identifier' + '}', encodeURIComponent(String(tagIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteUser = function (userIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (userIdentifier === null || userIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteUser", "userIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/users/{user_identifier}/delete'
                            .replace('{' + 'user_identifier' + '}', encodeURIComponent(String(userIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deleteUserGroup = function (groupIdentifier, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (groupIdentifier === null || groupIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "deleteUserGroup", "groupIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/groups/{group_identifier}/delete'
                            .replace('{' + 'group_identifier' + '}', encodeURIComponent(String(groupIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.deployCommit = function (deployCommitRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/vcs/git/commits/deploy';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(deployCommitRequest, "DeployCommitRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.exportAnswerReport = function (exportAnswerReportRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (exportAnswerReportRequest === null || exportAnswerReportRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "exportAnswerReport", "exportAnswerReportRequest");
                        }
                        localVarPath = '/api/rest/2.0/report/answer';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(exportAnswerReportRequest, "ExportAnswerReportRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.exportLiveboardReport = function (exportLiveboardReportRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (exportLiveboardReportRequest === null || exportLiveboardReportRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "exportLiveboardReport", "exportLiveboardReportRequest");
                        }
                        localVarPath = '/api/rest/2.0/report/liveboard';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(exportLiveboardReportRequest, "ExportLiveboardReportRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.exportMetadataTML = function (exportMetadataTMLRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (exportMetadataTMLRequest === null || exportMetadataTMLRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "exportMetadataTML", "exportMetadataTMLRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/tml/export';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(exportMetadataTMLRequest, "ExportMetadataTMLRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchAnswerData = function (fetchAnswerDataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchAnswerDataRequest === null || fetchAnswerDataRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchAnswerData", "fetchAnswerDataRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/answer/data';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchAnswerDataRequest, "FetchAnswerDataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchAnswerSqlQuery = function (fetchAnswerSqlQueryRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchAnswerSqlQueryRequest === null || fetchAnswerSqlQueryRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchAnswerSqlQuery", "fetchAnswerSqlQueryRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/answer/sql';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchAnswerSqlQueryRequest, "FetchAnswerSqlQueryRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchLiveboardData = function (fetchLiveboardDataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchLiveboardDataRequest === null || fetchLiveboardDataRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchLiveboardData", "fetchLiveboardDataRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/liveboard/data';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchLiveboardDataRequest, "FetchLiveboardDataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchLiveboardSqlQuery = function (fetchLiveboardSqlQueryRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchLiveboardSqlQueryRequest === null || fetchLiveboardSqlQueryRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchLiveboardSqlQuery", "fetchLiveboardSqlQueryRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/liveboard/sql';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchLiveboardSqlQueryRequest, "FetchLiveboardSqlQueryRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchLogs = function (fetchLogsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchLogsRequest === null || fetchLogsRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchLogs", "fetchLogsRequest");
                        }
                        localVarPath = '/api/rest/2.0/logs/fetch';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchLogsRequest, "FetchLogsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchPermissionsOfPrincipals = function (fetchPermissionsOfPrincipalsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchPermissionsOfPrincipalsRequest === null || fetchPermissionsOfPrincipalsRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchPermissionsOfPrincipals", "fetchPermissionsOfPrincipalsRequest");
                        }
                        localVarPath = '/api/rest/2.0/security/principals/fetch-permissions';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchPermissionsOfPrincipalsRequest, "FetchPermissionsOfPrincipalsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.fetchPermissionsOnMetadata = function (fetchPermissionsOnMetadataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (fetchPermissionsOnMetadataRequest === null || fetchPermissionsOnMetadataRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "fetchPermissionsOnMetadata", "fetchPermissionsOnMetadataRequest");
                        }
                        localVarPath = '/api/rest/2.0/security/metadata/fetch-permissions';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(fetchPermissionsOnMetadataRequest, "FetchPermissionsOnMetadataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.forceLogoutUsers = function (forceLogoutUsersRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/users/force-logout';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(forceLogoutUsersRequest, "ForceLogoutUsersRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getCurrentUserInfo = function (_options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/auth/session/user';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.GET);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getCurrentUserToken = function (_options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/auth/session/token';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.GET);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getFullAccessToken = function (getFullAccessTokenRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (getFullAccessTokenRequest === null || getFullAccessTokenRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "getFullAccessToken", "getFullAccessTokenRequest");
                        }
                        localVarPath = '/api/rest/2.0/auth/token/full';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(getFullAccessTokenRequest, "GetFullAccessTokenRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 2];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getObjectAccessToken = function (getObjectAccessTokenRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (getObjectAccessTokenRequest === null || getObjectAccessTokenRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "getObjectAccessToken", "getObjectAccessTokenRequest");
                        }
                        localVarPath = '/api/rest/2.0/auth/token/object';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(getObjectAccessTokenRequest, "GetObjectAccessTokenRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 2];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getSystemConfig = function (_options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/system/config';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.GET);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getSystemInformation = function (_options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/system';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.GET);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.getSystemOverrideInfo = function (_options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/system/config-overrides';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.GET);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.importMetadataTML = function (importMetadataTMLRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (importMetadataTMLRequest === null || importMetadataTMLRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "importMetadataTML", "importMetadataTMLRequest");
                        }
                        localVarPath = '/api/rest/2.0/metadata/tml/import';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(importMetadataTMLRequest, "ImportMetadataTMLRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.importUserGroups = function (importUserGroupsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/groups/import';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(importUserGroupsRequest, "ImportUserGroupsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.importUsers = function (importUsersRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (importUsersRequest === null || importUsersRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "importUsers", "importUsersRequest");
                        }
                        localVarPath = '/api/rest/2.0/users/import';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(importUsersRequest, "ImportUsersRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.login = function (loginRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/auth/session/login';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(loginRequest, "LoginRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.logout = function (_options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/auth/session/logout';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.resetUserPassword = function (resetUserPasswordRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (resetUserPasswordRequest === null || resetUserPasswordRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "resetUserPassword", "resetUserPasswordRequest");
                        }
                        localVarPath = '/api/rest/2.0/users/reset-password';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(resetUserPasswordRequest, "ResetUserPasswordRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.revertCommit = function (commitId, revertCommitRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (commitId === null || commitId === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "revertCommit", "commitId");
                        }
                        localVarPath = '/api/rest/2.0/vcs/git/commits/{commit_id}/revert'
                            .replace('{' + 'commit_id' + '}', encodeURIComponent(String(commitId)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(revertCommitRequest, "RevertCommitRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.revokeToken = function (revokeTokenRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/auth/token/revoke';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(revokeTokenRequest, "RevokeTokenRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchCommits = function (searchCommitsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (searchCommitsRequest === null || searchCommitsRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "searchCommits", "searchCommitsRequest");
                        }
                        localVarPath = '/api/rest/2.0/vcs/git/commits/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchCommitsRequest, "SearchCommitsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchConfig = function (searchConfigRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/vcs/git/config/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchConfigRequest, "SearchConfigRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchConnection = function (searchConnectionRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/connection/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchConnectionRequest, "SearchConnectionRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchCustomActions = function (searchCustomActionsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/customization/custom-actions/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchCustomActionsRequest, "SearchCustomActionsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchData = function (searchDataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (searchDataRequest === null || searchDataRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "searchData", "searchDataRequest");
                        }
                        localVarPath = '/api/rest/2.0/searchdata';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchDataRequest, "SearchDataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchMetadata = function (searchMetadataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/metadata/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchMetadataRequest, "SearchMetadataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchOrgs = function (searchOrgsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/orgs/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchOrgsRequest, "SearchOrgsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchRoles = function (searchRolesRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/roles/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchRolesRequest, "SearchRolesRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchSchedules = function (searchSchedulesRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/schedules/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchSchedulesRequest, "SearchSchedulesRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchTags = function (searchTagsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/tags/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchTagsRequest, "SearchTagsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchUserGroups = function (searchUserGroupsRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/groups/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchUserGroupsRequest, "SearchUserGroupsRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.searchUsers = function (searchUsersRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/users/search';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(searchUsersRequest, "SearchUsersRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.shareMetadata = function (shareMetadataRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (shareMetadataRequest === null || shareMetadataRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "shareMetadata", "shareMetadataRequest");
                        }
                        localVarPath = '/api/rest/2.0/security/metadata/share';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(shareMetadataRequest, "ShareMetadataRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.unassignTag = function (assignTagRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (assignTagRequest === null || assignTagRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "unassignTag", "assignTagRequest");
                        }
                        localVarPath = '/api/rest/2.0/tags/unassign';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(assignTagRequest, "AssignTagRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateConfig = function (updateConfigRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        localVarPath = '/api/rest/2.0/vcs/git/config/update';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateConfigRequest, "UpdateConfigRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateConnection = function (updateConnectionRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (updateConnectionRequest === null || updateConnectionRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateConnection", "updateConnectionRequest");
                        }
                        localVarPath = '/api/rest/2.0/connection/update';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateConnectionRequest, "UpdateConnectionRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateCustomAction = function (customActionIdentifier, updateCustomActionRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (customActionIdentifier === null || customActionIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateCustomAction", "customActionIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/customization/custom-actions/{custom_action_identifier}/update'
                            .replace('{' + 'custom_action_identifier' + '}', encodeURIComponent(String(customActionIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateCustomActionRequest, "UpdateCustomActionRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateOrg = function (orgIdentifier, updateOrgRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (orgIdentifier === null || orgIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateOrg", "orgIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/orgs/{org_identifier}/update'
                            .replace('{' + 'org_identifier' + '}', encodeURIComponent(String(orgIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateOrgRequest, "UpdateOrgRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateRole = function (roleIdentifier, updateRoleRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (roleIdentifier === null || roleIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateRole", "roleIdentifier");
                        }
                        if (updateRoleRequest === null || updateRoleRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateRole", "updateRoleRequest");
                        }
                        localVarPath = '/api/rest/2.0/roles/{role_identifier}/update'
                            .replace('{' + 'role_identifier' + '}', encodeURIComponent(String(roleIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateRoleRequest, "UpdateRoleRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateSchedule = function (scheduleIdentifier, updateScheduleRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (scheduleIdentifier === null || scheduleIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateSchedule", "scheduleIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/schedules/{schedule_identifier}/update'
                            .replace('{' + 'schedule_identifier' + '}', encodeURIComponent(String(scheduleIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateScheduleRequest, "UpdateScheduleRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateSystemConfig = function (updateSystemConfigRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (updateSystemConfigRequest === null || updateSystemConfigRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateSystemConfig", "updateSystemConfigRequest");
                        }
                        localVarPath = '/api/rest/2.0/system/config-update';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateSystemConfigRequest, "UpdateSystemConfigRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateTag = function (tagIdentifier, updateTagRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (tagIdentifier === null || tagIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateTag", "tagIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/tags/{tag_identifier}/update'
                            .replace('{' + 'tag_identifier' + '}', encodeURIComponent(String(tagIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateTagRequest, "UpdateTagRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateUser = function (userIdentifier, updateUserRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (userIdentifier === null || userIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateUser", "userIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/users/{user_identifier}/update'
                            .replace('{' + 'user_identifier' + '}', encodeURIComponent(String(userIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateUserRequest, "UpdateUserRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.updateUserGroup = function (groupIdentifier, updateUserGroupRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (groupIdentifier === null || groupIdentifier === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "updateUserGroup", "groupIdentifier");
                        }
                        localVarPath = '/api/rest/2.0/groups/{group_identifier}/update'
                            .replace('{' + 'group_identifier' + '}', encodeURIComponent(String(groupIdentifier)));
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(updateUserGroupRequest, "UpdateUserGroupRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    ThoughtSpotRestApiRequestFactory.prototype.validateMerge = function (validateMergeRequest, _options) {
        var _a, _b, _c;
        return __awaiter(this, void 0, void 0, function () {
            var _config, localVarPath, requestContext, contentType, serializedBody, authMethod, defaultAuth;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        _config = _options || this.configuration;
                        if (validateMergeRequest === null || validateMergeRequest === undefined) {
                            throw new baseapi_1.RequiredError("ThoughtSpotRestApi", "validateMerge", "validateMergeRequest");
                        }
                        localVarPath = '/api/rest/2.0/vcs/git/branches/validate';
                        requestContext = _config.baseServer.makeRequestContext(localVarPath, http_1.HttpMethod.POST);
                        requestContext.setHeaderParam("User-Agent", "ThoughtSpot-ts-client");
                        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8");
                        contentType = ObjectSerializer_1.ObjectSerializer.getPreferredMediaType([
                            "application/json"
                        ]);
                        requestContext.setHeaderParam("Content-Type", contentType);
                        serializedBody = ObjectSerializer_1.ObjectSerializer.stringify(ObjectSerializer_1.ObjectSerializer.serialize(validateMergeRequest, "ValidateMergeRequest", ""), contentType);
                        requestContext.setBody(serializedBody);
                        authMethod = _config.authMethods["bearerAuth"];
                        if (!(authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication)) return [3, 2];
                        return [4, (authMethod === null || authMethod === void 0 ? void 0 : authMethod.applySecurityAuthentication(requestContext))];
                    case 1:
                        _d.sent();
                        _d.label = 2;
                    case 2:
                        defaultAuth = ((_a = _options === null || _options === void 0 ? void 0 : _options.authMethods) === null || _a === void 0 ? void 0 : _a.default) || ((_c = (_b = this.configuration) === null || _b === void 0 ? void 0 : _b.authMethods) === null || _c === void 0 ? void 0 : _c.default);
                        if (!(defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication)) return [3, 4];
                        return [4, (defaultAuth === null || defaultAuth === void 0 ? void 0 : defaultAuth.applySecurityAuthentication(requestContext))];
                    case 3:
                        _d.sent();
                        _d.label = 4;
                    case 4: return [2, requestContext];
                }
            });
        });
    };
    return ThoughtSpotRestApiRequestFactory;
}(baseapi_1.BaseAPIRequestFactory));
exports.ThoughtSpotRestApiRequestFactory = ThoughtSpotRestApiRequestFactory;
var ThoughtSpotRestApiResponseProcessor = (function () {
    function ThoughtSpotRestApiResponseProcessor() {
    }
    ThoughtSpotRestApiResponseProcessor.prototype.assignChangeAuthor = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.assignTag = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.changeUserPassword = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.commitBranch = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "CommitResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "CommitResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createConfig = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "RepoConfigObject", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "RepoConfigObject", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createConnection = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "CreateConnectionResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "CreateConnectionResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createCustomAction = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "ResponseCustomAction", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "ResponseCustomAction", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createOrg = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "OrgResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "OrgResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createRole = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "RoleResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid parameters.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Internal error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "RoleResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createSchedule = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "ResponseSchedule", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "ResponseSchedule", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createTag = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Tag", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Tag", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createUser = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "User", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "User", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.createUserGroup = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "UserGroupResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "UserGroupResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteConfig = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteConnection = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteCustomAction = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteMetadata = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteOrg = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteRole = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Internal error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteSchedule = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteTag = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteUser = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deleteUserGroup = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.deployCommit = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<DeployResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<DeployResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.exportAnswerReport = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.exportLiveboardReport = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.exportMetadataTML = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<any>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<any>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchAnswerData = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "AnswerDataResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "AnswerDataResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchAnswerSqlQuery = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "SqlQueryResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "SqlQueryResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchLiveboardData = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "LiveboardDataResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "LiveboardDataResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchLiveboardSqlQuery = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "SqlQueryResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "SqlQueryResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchLogs = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<LogResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<LogResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchPermissionsOfPrincipals = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.fetchPermissionsOnMetadata = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.forceLogoutUsers = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getCurrentUserInfo = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "User", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "User", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getCurrentUserToken = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "GetTokenResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "GetTokenResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getFullAccessToken = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Token", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Token", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getObjectAccessToken = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Token", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Token", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getSystemConfig = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "SystemConfig", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "SystemConfig", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getSystemInformation = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "SystemInfo", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "SystemInfo", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.getSystemOverrideInfo = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "any", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.importMetadataTML = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<any>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<any>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.importUserGroups = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "ImportUserGroupsResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "ImportUserGroupsResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.importUsers = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "ImportUsersResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "ImportUsersResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.login = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.logout = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.resetUserPassword = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.revertCommit = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "RevertResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "RevertResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.revokeToken = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchCommits = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<CommitHistoryResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<CommitHistoryResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchConfig = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<RepoConfigObject>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<RepoConfigObject>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchConnection = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<SearchConnectionResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<SearchConnectionResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchCustomActions = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<ResponseCustomAction>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<ResponseCustomAction>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchData = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "SearchDataResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "SearchDataResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchMetadata = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<MetadataSearchResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<MetadataSearchResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchOrgs = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<OrgResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<OrgResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchRoles = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<SearchRoleResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Internal error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<SearchRoleResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchSchedules = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<ResponseSchedule>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<ResponseSchedule>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchTags = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<Tag>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<Tag>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchUserGroups = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<UserGroupResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<UserGroupResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.searchUsers = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<User>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<User>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.shareMetadata = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.unassignTag = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateConfig = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "RepoConfigObject", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "RepoConfigObject", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateConnection = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateCustomAction = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateOrg = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateRole = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "RoleResponse", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "RoleResponse", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateSchedule = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateSystemConfig = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateTag = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateUser = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.updateUserGroup = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, _w, _x;
            return __generator(this, function (_y) {
                switch (_y.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if ((0, util_1.isCodeInRange)("204", response.httpStatusCode)) {
                            return [2];
                        }
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 2:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_y.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 8:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_y.sent(), contentType]),
                            "void", ""]);
                        return [2, body];
                    case 10:
                        _w = exception_1.ApiException.bind;
                        _x = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 11: throw new (_w.apply(exception_1.ApiException, _x.concat([_y.sent(), response.headers])))();
                }
            });
        });
    };
    ThoughtSpotRestApiResponseProcessor.prototype.validateMerge = function (response) {
        return __awaiter(this, void 0, void 0, function () {
            var contentType, body, _a, _b, _c, _d, body, _e, _f, _g, _h, body, _j, _k, _l, _m, body, _o, _p, _q, _r, body, _s, _t, _u, _v, body, _w, _x, _y, _z, _0, _1;
            return __generator(this, function (_2) {
                switch (_2.label) {
                    case 0:
                        contentType = ObjectSerializer_1.ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
                        if (!(0, util_1.isCodeInRange)("200", response.httpStatusCode)) return [3, 2];
                        _b = (_a = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _d = (_c = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 1:
                        body = _b.apply(_a, [_d.apply(_c, [_2.sent(), contentType]),
                            "Array<DeployResponse>", ""]);
                        return [2, body];
                    case 2:
                        if (!(0, util_1.isCodeInRange)("400", response.httpStatusCode)) return [3, 4];
                        _f = (_e = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _h = (_g = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 3:
                        body = _f.apply(_e, [_h.apply(_g, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Invalid request.", body, response.headers);
                    case 4:
                        if (!(0, util_1.isCodeInRange)("401", response.httpStatusCode)) return [3, 6];
                        _k = (_j = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _m = (_l = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 5:
                        body = _k.apply(_j, [_m.apply(_l, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unauthorized access.", body, response.headers);
                    case 6:
                        if (!(0, util_1.isCodeInRange)("403", response.httpStatusCode)) return [3, 8];
                        _p = (_o = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _r = (_q = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 7:
                        body = _p.apply(_o, [_r.apply(_q, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Forbidden access.", body, response.headers);
                    case 8:
                        if (!(0, util_1.isCodeInRange)("500", response.httpStatusCode)) return [3, 10];
                        _t = (_s = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _v = (_u = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 9:
                        body = _t.apply(_s, [_v.apply(_u, [_2.sent(), contentType]),
                            "ErrorResponse", ""]);
                        throw new exception_1.ApiException(response.httpStatusCode, "Unexpected error", body, response.headers);
                    case 10:
                        if (!(response.httpStatusCode >= 200 && response.httpStatusCode <= 299)) return [3, 12];
                        _x = (_w = ObjectSerializer_1.ObjectSerializer).deserialize;
                        _z = (_y = ObjectSerializer_1.ObjectSerializer).parse;
                        return [4, response.body.text()];
                    case 11:
                        body = _x.apply(_w, [_z.apply(_y, [_2.sent(), contentType]),
                            "Array<DeployResponse>", ""]);
                        return [2, body];
                    case 12:
                        _0 = exception_1.ApiException.bind;
                        _1 = [void 0, response.httpStatusCode, "Unknown API Status Code!"];
                        return [4, response.getBodyAsAny()];
                    case 13: throw new (_0.apply(exception_1.ApiException, _1.concat([_2.sent(), response.headers])))();
                }
            });
        });
    };
    return ThoughtSpotRestApiResponseProcessor;
}());
exports.ThoughtSpotRestApiResponseProcessor = ThoughtSpotRestApiResponseProcessor;
//# sourceMappingURL=ThoughtSpotRestApi.js.map