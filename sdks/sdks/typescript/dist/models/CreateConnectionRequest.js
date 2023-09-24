"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateConnectionRequest = void 0;
var CreateConnectionRequest = (function () {
    function CreateConnectionRequest() {
    }
    CreateConnectionRequest.getAttributeTypeMap = function () {
        return CreateConnectionRequest.attributeTypeMap;
    };
    CreateConnectionRequest.discriminator = undefined;
    CreateConnectionRequest.attributeTypeMap = [
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
            "name": "data_warehouse_type",
            "baseName": "data_warehouse_type",
            "type": "CreateConnectionRequestDataWarehouseTypeEnum",
            "format": ""
        },
        {
            "name": "data_warehouse_config",
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
    return CreateConnectionRequest;
}());
exports.CreateConnectionRequest = CreateConnectionRequest;
//# sourceMappingURL=CreateConnectionRequest.js.map