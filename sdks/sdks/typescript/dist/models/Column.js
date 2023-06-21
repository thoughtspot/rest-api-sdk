"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Column = void 0;
var Column = (function () {
    function Column() {
    }
    Column.getAttributeTypeMap = function () {
        return Column.attributeTypeMap;
    };
    Column.discriminator = undefined;
    Column.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataType",
            "baseName": "data_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "isAggregate",
            "baseName": "is_aggregate",
            "type": "string",
            "format": ""
        },
        {
            "name": "canImport",
            "baseName": "can_import",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "selected",
            "baseName": "selected",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "isLinkedActive",
            "baseName": "is_linked_active",
            "type": "boolean",
            "format": ""
        }
    ];
    return Column;
}());
exports.Column = Column;
//# sourceMappingURL=Column.js.map