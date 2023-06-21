"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ForceLogoutUsersRequest = void 0;
var ForceLogoutUsersRequest = (function () {
    function ForceLogoutUsersRequest() {
    }
    ForceLogoutUsersRequest.getAttributeTypeMap = function () {
        return ForceLogoutUsersRequest.attributeTypeMap;
    };
    ForceLogoutUsersRequest.discriminator = undefined;
    ForceLogoutUsersRequest.attributeTypeMap = [
        {
            "name": "userIdentifiers",
            "baseName": "user_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return ForceLogoutUsersRequest;
}());
exports.ForceLogoutUsersRequest = ForceLogoutUsersRequest;
//# sourceMappingURL=ForceLogoutUsersRequest.js.map