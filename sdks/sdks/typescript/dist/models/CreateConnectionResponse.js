"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateConnectionResponse = void 0;
var CreateConnectionResponse = (function () {
    function CreateConnectionResponse() {
    }
    CreateConnectionResponse.getAttributeTypeMap = function () {
        return CreateConnectionResponse.attributeTypeMap;
    };
    CreateConnectionResponse.discriminator = undefined;
    CreateConnectionResponse.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
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
            "name": "dataWarehouseType",
            "baseName": "data_warehouse_type",
            "type": "CreateConnectionResponseDataWarehouseTypeEnum",
            "format": ""
        },
        {
            "name": "details",
            "baseName": "details",
            "type": "any",
            "format": ""
        }
    ];
    return CreateConnectionResponse;
}());
exports.CreateConnectionResponse = CreateConnectionResponse;
//# sourceMappingURL=CreateConnectionResponse.js.map