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
var instance = new PromiseAPI_1.PromiseThoughtSpotRestApi(config);
describe('ThoughtSpotRestApi', function () {
    describe('assignChangeAuthor', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "assignChangeAuthor"; });
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
                                    return [4, instance.assignChangeAuthor(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_1 = _a.sent();
                                    console.error(er_1, "Response", data);
                                    expect(er_1).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.assignChangeAuthor(test.Body)).to.be.rejectedWith(Error)];
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
    describe('assignTag', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "assignTag"; });
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
                                    return [4, instance.assignTag(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_2 = _a.sent();
                                    console.error(er_2, "Response", data);
                                    expect(er_2).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.assignTag(test.Body)).to.be.rejectedWith(Error)];
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
    describe('changeUserPassword', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "changeUserPassword"; });
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
                                    return [4, instance.changeUserPassword(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_3 = _a.sent();
                                    console.error(er_3, "Response", data);
                                    expect(er_3).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.changeUserPassword(test.Body)).to.be.rejectedWith(Error)];
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
    describe('commitBranch', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "commitBranch"; });
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
                                    return [4, instance.commitBranch(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_4 = _a.sent();
                                    console.error(er_4, "Response", data);
                                    expect(er_4).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.commitBranch(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createConfig', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createConfig"; });
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
                                    return [4, instance.createConfig(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_5 = _a.sent();
                                    console.error(er_5, "Response", data);
                                    expect(er_5).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createConfig(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createConnection', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createConnection"; });
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
                                    return [4, instance.createConnection(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_6 = _a.sent();
                                    console.error(er_6, "Response", data);
                                    expect(er_6).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createConnection(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createCustomAction', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createCustomAction"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_7;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createCustomAction(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_7 = _a.sent();
                                    console.error(er_7, "Response", data);
                                    expect(er_7).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createCustomAction(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createOrg', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createOrg"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_8;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createOrg(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_8 = _a.sent();
                                    console.error(er_8, "Response", data);
                                    expect(er_8).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createOrg(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createRole', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createRole"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_9;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createRole(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_9 = _a.sent();
                                    console.error(er_9, "Response", data);
                                    expect(er_9).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createRole(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createSchedule', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createSchedule"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_10;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createSchedule(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_10 = _a.sent();
                                    console.error(er_10, "Response", data);
                                    expect(er_10).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createSchedule(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createTag', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createTag"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_11;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createTag(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_11 = _a.sent();
                                    console.error(er_11, "Response", data);
                                    expect(er_11).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createTag(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createUser', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createUser"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_12;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createUser(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_12 = _a.sent();
                                    console.error(er_12, "Response", data);
                                    expect(er_12).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createUser(test.Body)).to.be.rejectedWith(Error)];
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
    describe('createUserGroup', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "createUserGroup"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_13;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.createUserGroup(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_13 = _a.sent();
                                    console.error(er_13, "Response", data);
                                    expect(er_13).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.createUserGroup(test.Body)).to.be.rejectedWith(Error)];
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
    describe('deleteConfig', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteConfig"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_14;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteConfig(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_14 = _a.sent();
                                    console.error(er_14, "Response", data);
                                    expect(er_14).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteConfig(test.Body)).to.be.rejectedWith(Error)];
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
    describe('deleteConnection', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteConnection"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_15;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteConnection(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_15 = _a.sent();
                                    console.error(er_15, "Response", data);
                                    expect(er_15).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteConnection(test.Body)).to.be.rejectedWith(Error)];
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
    describe('deleteCustomAction', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteCustomAction"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_16;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteCustomAction(test.Path_Variables.custom_action_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_16 = _a.sent();
                                    console.error(er_16, "Response", data);
                                    expect(er_16).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteCustomAction(test.Path_Variables.custom_action_identifier)).to.be.rejectedWith(Error)];
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
    describe('deleteMetadata', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteMetadata"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_17;
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
                                    er_17 = _a.sent();
                                    console.error(er_17, "Response", data);
                                    expect(er_17).to.be.undefined;
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
    describe('deleteOrg', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteOrg"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_18;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteOrg(test.Path_Variables.org_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_18 = _a.sent();
                                    console.error(er_18, "Response", data);
                                    expect(er_18).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteOrg(test.Path_Variables.org_identifier)).to.be.rejectedWith(Error)];
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
    describe('deleteRole', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteRole"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_19;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteRole(test.Path_Variables.role_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_19 = _a.sent();
                                    console.error(er_19, "Response", data);
                                    expect(er_19).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteRole(test.Path_Variables.role_identifier)).to.be.rejectedWith(Error)];
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
    describe('deleteSchedule', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteSchedule"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_20;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteSchedule(test.Path_Variables.schedule_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_20 = _a.sent();
                                    console.error(er_20, "Response", data);
                                    expect(er_20).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteSchedule(test.Path_Variables.schedule_identifier)).to.be.rejectedWith(Error)];
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
    describe('deleteTag', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteTag"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_21;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteTag(test.Path_Variables.tag_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_21 = _a.sent();
                                    console.error(er_21, "Response", data);
                                    expect(er_21).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteTag(test.Path_Variables.tag_identifier)).to.be.rejectedWith(Error)];
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
    describe('deleteUser', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteUser"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_22;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteUser(test.Path_Variables.user_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_22 = _a.sent();
                                    console.error(er_22, "Response", data);
                                    expect(er_22).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteUser(test.Path_Variables.user_identifier)).to.be.rejectedWith(Error)];
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
    describe('deleteUserGroup', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deleteUserGroup"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_23;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deleteUserGroup(test.Path_Variables.group_identifier)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_23 = _a.sent();
                                    console.error(er_23, "Response", data);
                                    expect(er_23).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deleteUserGroup(test.Path_Variables.group_identifier)).to.be.rejectedWith(Error)];
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
    describe('deployCommit', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "deployCommit"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_24;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.deployCommit(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_24 = _a.sent();
                                    console.error(er_24, "Response", data);
                                    expect(er_24).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.deployCommit(test.Body)).to.be.rejectedWith(Error)];
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
    describe('exportAnswerReport', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "exportAnswerReport"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_25;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.exportAnswerReport(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_25 = _a.sent();
                                    console.error(er_25, "Response", data);
                                    expect(er_25).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.exportAnswerReport(test.Body)).to.be.rejectedWith(Error)];
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
    describe('exportLiveboardReport', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "exportLiveboardReport"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_26;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.exportLiveboardReport(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_26 = _a.sent();
                                    console.error(er_26, "Response", data);
                                    expect(er_26).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.exportLiveboardReport(test.Body)).to.be.rejectedWith(Error)];
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
                        var data, er_27;
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
                                    er_27 = _a.sent();
                                    console.error(er_27, "Response", data);
                                    expect(er_27).to.be.undefined;
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
    describe('fetchAnswerData', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchAnswerData"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_28;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchAnswerData(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_28 = _a.sent();
                                    console.error(er_28, "Response", data);
                                    expect(er_28).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchAnswerData(test.Body)).to.be.rejectedWith(Error)];
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
                        var data, er_29;
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
                                    er_29 = _a.sent();
                                    console.error(er_29, "Response", data);
                                    expect(er_29).to.be.undefined;
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
    describe('fetchLiveboardData', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchLiveboardData"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_30;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchLiveboardData(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_30 = _a.sent();
                                    console.error(er_30, "Response", data);
                                    expect(er_30).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchLiveboardData(test.Body)).to.be.rejectedWith(Error)];
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
                        var data, er_31;
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
                                    er_31 = _a.sent();
                                    console.error(er_31, "Response", data);
                                    expect(er_31).to.be.undefined;
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
    describe('fetchLogs', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchLogs"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_32;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchLogs(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_32 = _a.sent();
                                    console.error(er_32, "Response", data);
                                    expect(er_32).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchLogs(test.Body)).to.be.rejectedWith(Error)];
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
    describe('fetchPermissionsOfPrincipals', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchPermissionsOfPrincipals"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_33;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchPermissionsOfPrincipals(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_33 = _a.sent();
                                    console.error(er_33, "Response", data);
                                    expect(er_33).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchPermissionsOfPrincipals(test.Body)).to.be.rejectedWith(Error)];
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
    describe('fetchPermissionsOnMetadata', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "fetchPermissionsOnMetadata"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_34;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.fetchPermissionsOnMetadata(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_34 = _a.sent();
                                    console.error(er_34, "Response", data);
                                    expect(er_34).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.fetchPermissionsOnMetadata(test.Body)).to.be.rejectedWith(Error)];
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
    describe('forceLogoutUsers', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "forceLogoutUsers"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_35;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.forceLogoutUsers(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_35 = _a.sent();
                                    console.error(er_35, "Response", data);
                                    expect(er_35).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.forceLogoutUsers(test.Body)).to.be.rejectedWith(Error)];
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
    describe('getCurrentUserInfo', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getCurrentUserInfo"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_36;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getCurrentUserInfo()];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_36 = _a.sent();
                                    console.error(er_36, "Response", data);
                                    expect(er_36).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getCurrentUserInfo()).to.be.rejectedWith(Error)];
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
    describe('getCurrentUserToken', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getCurrentUserToken"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_37;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getCurrentUserToken()];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_37 = _a.sent();
                                    console.error(er_37, "Response", data);
                                    expect(er_37).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getCurrentUserToken()).to.be.rejectedWith(Error)];
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
    describe('getFullAccessToken', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getFullAccessToken"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_38;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getFullAccessToken(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_38 = _a.sent();
                                    console.error(er_38, "Response", data);
                                    expect(er_38).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getFullAccessToken(test.Body)).to.be.rejectedWith(Error)];
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
    describe('getObjectAccessToken', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getObjectAccessToken"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_39;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getObjectAccessToken(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_39 = _a.sent();
                                    console.error(er_39, "Response", data);
                                    expect(er_39).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getObjectAccessToken(test.Body)).to.be.rejectedWith(Error)];
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
    describe('getSystemConfig', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getSystemConfig"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_40;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getSystemConfig()];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_40 = _a.sent();
                                    console.error(er_40, "Response", data);
                                    expect(er_40).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getSystemConfig()).to.be.rejectedWith(Error)];
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
    describe('getSystemInformation', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getSystemInformation"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_41;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getSystemInformation()];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_41 = _a.sent();
                                    console.error(er_41, "Response", data);
                                    expect(er_41).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getSystemInformation()).to.be.rejectedWith(Error)];
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
    describe('getSystemOverrideInfo', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "getSystemOverrideInfo"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_42;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.getSystemOverrideInfo()];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_42 = _a.sent();
                                    console.error(er_42, "Response", data);
                                    expect(er_42).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.getSystemOverrideInfo()).to.be.rejectedWith(Error)];
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
                        var data, er_43;
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
                                    er_43 = _a.sent();
                                    console.error(er_43, "Response", data);
                                    expect(er_43).to.be.undefined;
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
    describe('importUserGroups', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "importUserGroups"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_44;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.importUserGroups(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_44 = _a.sent();
                                    console.error(er_44, "Response", data);
                                    expect(er_44).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.importUserGroups(test.Body)).to.be.rejectedWith(Error)];
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
    describe('importUsers', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "importUsers"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_45;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.importUsers(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_45 = _a.sent();
                                    console.error(er_45, "Response", data);
                                    expect(er_45).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.importUsers(test.Body)).to.be.rejectedWith(Error)];
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
    describe('login', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "login"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_46;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.login(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_46 = _a.sent();
                                    console.error(er_46, "Response", data);
                                    expect(er_46).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.login(test.Body)).to.be.rejectedWith(Error)];
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
    describe('logout', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "logout"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_47;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.logout()];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_47 = _a.sent();
                                    console.error(er_47, "Response", data);
                                    expect(er_47).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.logout()).to.be.rejectedWith(Error)];
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
    describe('resetUserPassword', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "resetUserPassword"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_48;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.resetUserPassword(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_48 = _a.sent();
                                    console.error(er_48, "Response", data);
                                    expect(er_48).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.resetUserPassword(test.Body)).to.be.rejectedWith(Error)];
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
    describe('revertCommit', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "revertCommit"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_49;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.revertCommit(test.Path_Variables.commit_id, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_49 = _a.sent();
                                    console.error(er_49, "Response", data);
                                    expect(er_49).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.revertCommit(test.Path_Variables.commit_id, test.Body)).to.be.rejectedWith(Error)];
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
    describe('revokeToken', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "revokeToken"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_50;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.revokeToken(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_50 = _a.sent();
                                    console.error(er_50, "Response", data);
                                    expect(er_50).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.revokeToken(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchCommits', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchCommits"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_51;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchCommits(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_51 = _a.sent();
                                    console.error(er_51, "Response", data);
                                    expect(er_51).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchCommits(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchConfig', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchConfig"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_52;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchConfig(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_52 = _a.sent();
                                    console.error(er_52, "Response", data);
                                    expect(er_52).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchConfig(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchConnection', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchConnection"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_53;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchConnection(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_53 = _a.sent();
                                    console.error(er_53, "Response", data);
                                    expect(er_53).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchConnection(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchCustomActions', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchCustomActions"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_54;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchCustomActions(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_54 = _a.sent();
                                    console.error(er_54, "Response", data);
                                    expect(er_54).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchCustomActions(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchData', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchData"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_55;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchData(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_55 = _a.sent();
                                    console.error(er_55, "Response", data);
                                    expect(er_55).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchData(test.Body)).to.be.rejectedWith(Error)];
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
                        var data, er_56;
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
                                    er_56 = _a.sent();
                                    console.error(er_56, "Response", data);
                                    expect(er_56).to.be.undefined;
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
    describe('searchOrgs', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchOrgs"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_57;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchOrgs(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_57 = _a.sent();
                                    console.error(er_57, "Response", data);
                                    expect(er_57).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchOrgs(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchRoles', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchRoles"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_58;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchRoles(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_58 = _a.sent();
                                    console.error(er_58, "Response", data);
                                    expect(er_58).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchRoles(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchSchedules', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchSchedules"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_59;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchSchedules(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_59 = _a.sent();
                                    console.error(er_59, "Response", data);
                                    expect(er_59).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchSchedules(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchTags', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchTags"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_60;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchTags(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_60 = _a.sent();
                                    console.error(er_60, "Response", data);
                                    expect(er_60).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchTags(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchUserGroups', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchUserGroups"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_61;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchUserGroups(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_61 = _a.sent();
                                    console.error(er_61, "Response", data);
                                    expect(er_61).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchUserGroups(test.Body)).to.be.rejectedWith(Error)];
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
    describe('searchUsers', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "searchUsers"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_62;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.searchUsers(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_62 = _a.sent();
                                    console.error(er_62, "Response", data);
                                    expect(er_62).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.searchUsers(test.Body)).to.be.rejectedWith(Error)];
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
    describe('shareMetadata', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "shareMetadata"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_63;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.shareMetadata(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_63 = _a.sent();
                                    console.error(er_63, "Response", data);
                                    expect(er_63).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.shareMetadata(test.Body)).to.be.rejectedWith(Error)];
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
    describe('unassignTag', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "unassignTag"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_64;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.unassignTag(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_64 = _a.sent();
                                    console.error(er_64, "Response", data);
                                    expect(er_64).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.unassignTag(test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateConfig', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateConfig"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_65;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateConfig(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_65 = _a.sent();
                                    console.error(er_65, "Response", data);
                                    expect(er_65).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateConfig(test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateConnection', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateConnection"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_66;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateConnection(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_66 = _a.sent();
                                    console.error(er_66, "Response", data);
                                    expect(er_66).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateConnection(test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateCustomAction', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateCustomAction"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_67;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateCustomAction(test.Path_Variables.custom_action_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_67 = _a.sent();
                                    console.error(er_67, "Response", data);
                                    expect(er_67).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateCustomAction(test.Path_Variables.custom_action_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateOrg', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateOrg"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_68;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateOrg(test.Path_Variables.org_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_68 = _a.sent();
                                    console.error(er_68, "Response", data);
                                    expect(er_68).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateOrg(test.Path_Variables.org_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateRole', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateRole"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_69;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateRole(test.Path_Variables.role_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_69 = _a.sent();
                                    console.error(er_69, "Response", data);
                                    expect(er_69).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateRole(test.Path_Variables.role_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateSchedule', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateSchedule"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_70;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateSchedule(test.Path_Variables.schedule_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_70 = _a.sent();
                                    console.error(er_70, "Response", data);
                                    expect(er_70).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateSchedule(test.Path_Variables.schedule_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateSystemConfig', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateSystemConfig"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_71;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateSystemConfig(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_71 = _a.sent();
                                    console.error(er_71, "Response", data);
                                    expect(er_71).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateSystemConfig(test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateTag', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateTag"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_72;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateTag(test.Path_Variables.tag_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_72 = _a.sent();
                                    console.error(er_72, "Response", data);
                                    expect(er_72).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateTag(test.Path_Variables.tag_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateUser', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateUser"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_73;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateUser(test.Path_Variables.user_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_73 = _a.sent();
                                    console.error(er_73, "Response", data);
                                    expect(er_73).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateUser(test.Path_Variables.user_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('updateUserGroup', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "updateUserGroup"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_74;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.updateUserGroup(test.Path_Variables.group_identifier, test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_74 = _a.sent();
                                    console.error(er_74, "Response", data);
                                    expect(er_74).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.updateUserGroup(test.Path_Variables.group_identifier, test.Body)).to.be.rejectedWith(Error)];
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
    describe('validateMerge', function () {
        var _this = this;
        var testReqBodies = testDataUpdated_json_1.default.filter(function (body) { return body.Metadata.operationId === "validateMerge"; });
        testReqBodies.forEach(function (test) { return __awaiter(_this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                it("".concat(test.Metadata.operationId, " - ").concat(test.Metadata.scenario, " : Testid - ").concat(test.Metadata.testId), function () {
                    return __awaiter(this, void 0, void 0, function () {
                        var data, er_75;
                        return __generator(this, function (_a) {
                            switch (_a.label) {
                                case 0:
                                    if (!(test.Metadata.scenario === "positive")) return [3, 5];
                                    _a.label = 1;
                                case 1:
                                    _a.trys.push([1, 3, , 4]);
                                    return [4, instance.validateMerge(test.Body)];
                                case 2:
                                    data = _a.sent();
                                    return [3, 4];
                                case 3:
                                    er_75 = _a.sent();
                                    console.error(er_75, "Response", data);
                                    expect(er_75).to.be.undefined;
                                    return [3, 4];
                                case 4: return [3, 7];
                                case 5: return [4, expect(instance.validateMerge(test.Body)).to.be.rejectedWith(Error)];
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
//# sourceMappingURL=ThoughtSpotRestApiTest.js.map