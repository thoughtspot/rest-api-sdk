"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchRolesRequest = void 0;
var SearchRolesRequest = (function () {
    function SearchRolesRequest() {
    }
    SearchRolesRequest.getAttributeTypeMap = function () {
        return SearchRolesRequest.attributeTypeMap;
    };
    SearchRolesRequest.discriminator = undefined;
    SearchRolesRequest.attributeTypeMap = [
        {
            "name": "roleIdentifiers",
            "baseName": "role_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "orgIdentifiers",
            "baseName": "org_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "groupIdentifiers",
            "baseName": "group_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "privileges",
            "baseName": "privileges",
            "type": "Array<SearchRolesRequestPrivilegesEnum>",
            "format": ""
        },
        {
            "name": "deprecated",
            "baseName": "deprecated",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "sharedViaConnection",
            "baseName": "shared_via_connection",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<SearchRolesRequestPermissionsEnum>",
            "format": ""
        }
    ];
    return SearchRolesRequest;
}());
exports.SearchRolesRequest = SearchRolesRequest;
//# sourceMappingURL=SearchRolesRequest.js.map