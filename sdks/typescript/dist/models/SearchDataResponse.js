"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchDataResponse = void 0;
var SearchDataResponse = (function () {
    function SearchDataResponse() {
    }
    SearchDataResponse.getAttributeTypeMap = function () {
        return SearchDataResponse.attributeTypeMap;
    };
    SearchDataResponse.discriminator = undefined;
    SearchDataResponse.attributeTypeMap = [
        {
            "name": "contents",
            "baseName": "contents",
            "type": "Array<AnswerContent>",
            "format": ""
        }
    ];
    return SearchDataResponse;
}());
exports.SearchDataResponse = SearchDataResponse;
//# sourceMappingURL=SearchDataResponse.js.map