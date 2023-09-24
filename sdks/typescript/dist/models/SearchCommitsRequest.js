"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchCommitsRequest = void 0;
var SearchCommitsRequest = (function () {
    function SearchCommitsRequest() {
    }
    SearchCommitsRequest.getAttributeTypeMap = function () {
        return SearchCommitsRequest.attributeTypeMap;
    };
    SearchCommitsRequest.discriminator = undefined;
    SearchCommitsRequest.attributeTypeMap = [
        {
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "SearchCommitsRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "branch_name",
            "baseName": "branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        }
    ];
    return SearchCommitsRequest;
}());
exports.SearchCommitsRequest = SearchCommitsRequest;
//# sourceMappingURL=SearchCommitsRequest.js.map