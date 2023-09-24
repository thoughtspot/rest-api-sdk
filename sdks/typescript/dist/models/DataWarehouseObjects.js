"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DataWarehouseObjects = void 0;
var DataWarehouseObjects = (function () {
    function DataWarehouseObjects() {
    }
    DataWarehouseObjects.getAttributeTypeMap = function () {
        return DataWarehouseObjects.attributeTypeMap;
    };
    DataWarehouseObjects.discriminator = undefined;
    DataWarehouseObjects.attributeTypeMap = [
        {
            "name": "databases",
            "baseName": "databases",
            "type": "Array<Database>",
            "format": ""
        }
    ];
    return DataWarehouseObjects;
}());
exports.DataWarehouseObjects = DataWarehouseObjects;
//# sourceMappingURL=DataWarehouseObjects.js.map