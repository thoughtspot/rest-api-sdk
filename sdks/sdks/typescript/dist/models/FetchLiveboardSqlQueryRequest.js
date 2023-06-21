"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FetchLiveboardSqlQueryRequest = void 0;
var FetchLiveboardSqlQueryRequest = (function () {
    function FetchLiveboardSqlQueryRequest() {
    }
    FetchLiveboardSqlQueryRequest.getAttributeTypeMap = function () {
        return FetchLiveboardSqlQueryRequest.attributeTypeMap;
    };
    FetchLiveboardSqlQueryRequest.discriminator = undefined;
    FetchLiveboardSqlQueryRequest.attributeTypeMap = [
        {
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "visualizationIdentifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return FetchLiveboardSqlQueryRequest;
}());
exports.FetchLiveboardSqlQueryRequest = FetchLiveboardSqlQueryRequest;
//# sourceMappingURL=FetchLiveboardSqlQueryRequest.js.map