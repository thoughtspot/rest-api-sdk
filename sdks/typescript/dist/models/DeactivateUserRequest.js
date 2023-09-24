"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeactivateUserRequest = void 0;
var DeactivateUserRequest = (function () {
    function DeactivateUserRequest() {
    }
    DeactivateUserRequest.getAttributeTypeMap = function () {
        return DeactivateUserRequest.attributeTypeMap;
    };
    DeactivateUserRequest.discriminator = undefined;
    DeactivateUserRequest.attributeTypeMap = [
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "base_url",
            "baseName": "base_url",
            "type": "string",
            "format": ""
        }
    ];
    return DeactivateUserRequest;
}());
exports.DeactivateUserRequest = DeactivateUserRequest;
//# sourceMappingURL=DeactivateUserRequest.js.map