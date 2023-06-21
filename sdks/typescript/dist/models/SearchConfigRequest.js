"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchConfigRequest = void 0;
var SearchConfigRequest = (function () {
    function SearchConfigRequest() {
    }
    SearchConfigRequest.getAttributeTypeMap = function () {
        return SearchConfigRequest.attributeTypeMap;
    };
    SearchConfigRequest.discriminator = undefined;
    SearchConfigRequest.attributeTypeMap = [
        {
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return SearchConfigRequest;
}());
exports.SearchConfigRequest = SearchConfigRequest;
//# sourceMappingURL=SearchConfigRequest.js.map