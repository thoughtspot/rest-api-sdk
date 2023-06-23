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
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "SearchCommitsRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "branchName",
            "baseName": "branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "recordOffset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "recordSize",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        }
    ];
    return SearchCommitsRequest;
}());
exports.SearchCommitsRequest = SearchCommitsRequest;
//# sourceMappingURL=SearchCommitsRequest.js.map