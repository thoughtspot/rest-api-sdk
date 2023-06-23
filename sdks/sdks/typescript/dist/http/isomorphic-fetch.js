"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.IsomorphicFetchHttpLibrary = void 0;
var http_1 = require("./http");
var rxjsStub_1 = require("../rxjsStub");
require("whatwg-fetch");
var IsomorphicFetchHttpLibrary = (function () {
    function IsomorphicFetchHttpLibrary() {
    }
    IsomorphicFetchHttpLibrary.prototype.send = function (request) {
        var method = request.getHttpMethod().toString();
        var body = request.getBody();
        var resultPromise = fetch(request.getUrl(), {
            method: method,
            body: body,
            headers: request.getHeaders(),
            credentials: "include"
        }).then(function (resp) {
            var headers = {};
            resp.headers.forEach(function (value, name) {
                headers[name] = value;
            });
            var body = {
                text: function () { return resp.text(); },
                binary: function () { return resp.blob(); }
            };
            return new http_1.ResponseContext(resp.status, headers, body);
        });
        return (0, rxjsStub_1.from)(resultPromise);
    };
    return IsomorphicFetchHttpLibrary;
}());
exports.IsomorphicFetchHttpLibrary = IsomorphicFetchHttpLibrary;
//# sourceMappingURL=isomorphic-fetch.js.map