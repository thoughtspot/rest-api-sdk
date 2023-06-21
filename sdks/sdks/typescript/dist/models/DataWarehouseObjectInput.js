"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DataWarehouseObjectInput = void 0;
var DataWarehouseObjectInput = (function () {
    function DataWarehouseObjectInput() {
    }
    DataWarehouseObjectInput.getAttributeTypeMap = function () {
        return DataWarehouseObjectInput.attributeTypeMap;
    };
    DataWarehouseObjectInput.discriminator = undefined;
    DataWarehouseObjectInput.attributeTypeMap = [
        {
            "name": "database",
            "baseName": "database",
            "type": "string",
            "format": ""
        },
        {
            "name": "schema",
            "baseName": "schema",
            "type": "string",
            "format": ""
        },
        {
            "name": "table",
            "baseName": "table",
            "type": "string",
            "format": ""
        },
        {
            "name": "column",
            "baseName": "column",
            "type": "string",
            "format": ""
        }
    ];
    return DataWarehouseObjectInput;
}());
exports.DataWarehouseObjectInput = DataWarehouseObjectInput;
//# sourceMappingURL=DataWarehouseObjectInput.js.map