"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ConnectionInput = void 0;
var ConnectionInput = (function () {
    function ConnectionInput() {
    }
    ConnectionInput.getAttributeTypeMap = function () {
        return ConnectionInput.attributeTypeMap;
    };
    ConnectionInput.discriminator = undefined;
    ConnectionInput.attributeTypeMap = [
        {
            "name": "identifier",
            "baseName": "identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "namePattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataWarehouseObjects",
            "baseName": "data_warehouse_objects",
            "type": "Array<DataWarehouseObjectInput>",
            "format": ""
        }
    ];
    return ConnectionInput;
}());
exports.ConnectionInput = ConnectionInput;
//# sourceMappingURL=ConnectionInput.js.map