"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Table = void 0;
var Table = (function () {
    function Table() {
    }
    Table.getAttributeTypeMap = function () {
        return Table.attributeTypeMap;
    };
    Table.discriminator = undefined;
    Table.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "columns",
            "baseName": "columns",
            "type": "Array<Column>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
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
            "name": "selected",
            "baseName": "selected",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "linked",
            "baseName": "linked",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "relationships",
            "baseName": "relationships",
            "type": "Array<any>",
            "format": ""
        }
    ];
    return Table;
}());
exports.Table = Table;
//# sourceMappingURL=Table.js.map