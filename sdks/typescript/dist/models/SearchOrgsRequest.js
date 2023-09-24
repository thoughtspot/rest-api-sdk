"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchOrgsRequest = void 0;
var SearchOrgsRequest = (function () {
    function SearchOrgsRequest() {
    }
    SearchOrgsRequest.getAttributeTypeMap = function () {
        return SearchOrgsRequest.attributeTypeMap;
    };
    SearchOrgsRequest.discriminator = undefined;
    SearchOrgsRequest.attributeTypeMap = [
        {
            "name": "org_identifier",
            "baseName": "org_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "SearchOrgsRequestVisibilityEnum",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "SearchOrgsRequestStatusEnum",
            "format": ""
        },
        {
            "name": "user_identifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return SearchOrgsRequest;
}());
exports.SearchOrgsRequest = SearchOrgsRequest;
//# sourceMappingURL=SearchOrgsRequest.js.map