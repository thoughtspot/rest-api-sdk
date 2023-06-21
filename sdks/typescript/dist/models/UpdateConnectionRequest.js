"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateConnectionRequest = void 0;
var UpdateConnectionRequest = (function () {
    function UpdateConnectionRequest() {
    }
    UpdateConnectionRequest.getAttributeTypeMap = function () {
        return UpdateConnectionRequest.attributeTypeMap;
    };
    UpdateConnectionRequest.discriminator = undefined;
    UpdateConnectionRequest.attributeTypeMap = [
        {
            "name": "connectionIdentifier",
            "baseName": "connection_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
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
            "name": "dataWarehouseConfig",
            "baseName": "data_warehouse_config",
            "type": "any",
            "format": ""
        },
        {
            "name": "validate",
            "baseName": "validate",
            "type": "boolean",
            "format": ""
        }
    ];
    return UpdateConnectionRequest;
}());
exports.UpdateConnectionRequest = UpdateConnectionRequest;
//# sourceMappingURL=UpdateConnectionRequest.js.map