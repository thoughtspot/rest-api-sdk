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
            "name": "name_pattern",
            "baseName": "name_pattern",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_warehouse_objects",
            "baseName": "data_warehouse_objects",
            "type": "Array<DataWarehouseObjectInput>",
            "format": ""
        }
    ];
    return ConnectionInput;
}());
exports.ConnectionInput = ConnectionInput;
//# sourceMappingURL=ConnectionInput.js.map