"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeleteConnectionRequest = void 0;
var DeleteConnectionRequest = (function () {
    function DeleteConnectionRequest() {
    }
    DeleteConnectionRequest.getAttributeTypeMap = function () {
        return DeleteConnectionRequest.attributeTypeMap;
    };
    DeleteConnectionRequest.discriminator = undefined;
    DeleteConnectionRequest.attributeTypeMap = [
        {
            "name": "connectionIdentifier",
            "baseName": "connection_identifier",
            "type": "string",
            "format": ""
        }
    ];
    return DeleteConnectionRequest;
}());
exports.DeleteConnectionRequest = DeleteConnectionRequest;
//# sourceMappingURL=DeleteConnectionRequest.js.map