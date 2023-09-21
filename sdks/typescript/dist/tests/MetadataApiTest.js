"use strict";
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
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
var chai_1 = __importDefault(require("chai"));
var chai_as_promised_1 = __importDefault(require("chai-as-promised"));
var config_1 = require("../utils/config");
var PromiseAPI_1 = require("../types/PromiseAPI");
chai_1.default.use(chai_as_promised_1.default);
var expect = chai_1.default.expect;
var testDataUpdated_json_1 = __importDefault(require("./testDataUpdated.json"));
var BASE_URL = "http://127.0.0.1:4123";
var config = (0, config_1.createBearerAuthenticationConfig)(BASE_URL, {
    username: "tsadmin",
    password: "admin",
});
var instance = new PromiseAPI_1.PromiseMetadataApi(config);
describe('MetadataApi', function () {
    describe('deleteMetadata', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteMetadata"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_1;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteMetadata(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_1 = _a.sent();
                                    console.error(er_1, "Response", data);
                                    expect(er_1).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteMetadata(test.Body)).to.be.rejectedWith(Error)];
                                case 6:
                                    _a.sent();
                                    _a.label = 7;
                                case 7: return [2];
                            }
                        });
                    });
                });
                return [2];
            });
        }); });
    });
    describe('exportMetadataTML', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "exportMetadataTML"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_2;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.exportMetadataTML(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_2 = _a.sent();
                                    console.error(er_2, "Response", data);
                                    expect(er_2).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.exportMetadataTML(test.Body)).to.be.rejectedWith(Error)];
                                case 6:
                                    _a.sent();
                                    _a.label = 7;
                                case 7: return [2];
                            }
                        });
                    });
                });
                return [2];
            });
        }); });
    });
    describe('fetchAnswerSqlQuery', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchAnswerSqlQuery"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_3;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchAnswerSqlQuery(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_3 = _a.sent();
                                    console.error(er_3, "Response", data);
                                    expect(er_3).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchAnswerSqlQuery(test.Body)).to.be.rejectedWith(Error)];
                                case 6:
                                    _a.sent();
                                    _a.label = 7;
                                case 7: return [2];
                            }
                        });
                    });
                });
                return [2];
            });
        }); });
    });
    describe('fetchLiveboardSqlQuery', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchLiveboardSqlQuery"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_4;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchLiveboardSqlQuery(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_4 = _a.sent();
                                    console.error(er_4, "Response", data);
                                    expect(er_4).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchLiveboardSqlQuery(test.Body)).to.be.rejectedWith(Error)];
                                case 6:
                                    _a.sent();
                                    _a.label = 7;
                                case 7: return [2];
                            }
                        });
                    });
                });
                return [2];
            });
        }); });
    });
    describe('importMetadataTML', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "importMetadataTML"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_5;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.importMetadataTML(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_5 = _a.sent();
                                    console.error(er_5, "Response", data);
                                    expect(er_5).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.importMetadataTML(test.Body)).to.be.rejectedWith(Error)];
                                case 6:
                                    _a.sent();
                                    _a.label = 7;
                                case 7: return [2];
                            }
                        });
                    });
                });
                return [2];
            });
        }); });
    });
    describe('searchMetadata', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchMetadata"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_6;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchMetadata(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_6 = _a.sent();
                                    console.error(er_6, "Response", data);
                                    expect(er_6).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchMetadata(test.Body)).to.be.rejectedWith(Error)];
                                case 6:
                                    _a.sent();
                                    _a.label = 7;
                                case 7: return [2];
                            }
                        });
                    });
                });
                return [2];
            });
        }); });
    });
});
//# sourceMappingURL=MetadataApiTest.js.map