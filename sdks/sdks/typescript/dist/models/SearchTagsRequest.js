"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchTagsRequest = void 0;
var SearchTagsRequest = (function () {
    function SearchTagsRequest() {
    }
    SearchTagsRequest.getAttributeTypeMap = function () {
        return SearchTagsRequest.attributeTypeMap;
    };
    SearchTagsRequest.discriminator = undefined;
    SearchTagsRequest.attributeTypeMap = [
        {
            "name": "tag_identifier",
            "baseName": "tag_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "color",
            "baseName": "color",
            "type": "string",
            "format": ""
        }
    ];
    return SearchTagsRequest;
}());
exports.SearchTagsRequest = SearchTagsRequest;
//# sourceMappingURL=SearchTagsRequest.js.map