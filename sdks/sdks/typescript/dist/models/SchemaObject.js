"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SchemaObject = void 0;
var SchemaObject = (function () {
    function SchemaObject() {
    }
    SchemaObject.getAttributeTypeMap = function () {
        return SchemaObject.attributeTypeMap;
    };
    SchemaObject.discriminator = undefined;
    SchemaObject.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "tables",
            "baseName": "tables",
            "type": "Array<Table>",
            "format": ""
        }
    ];
    return SchemaObject;
}());
exports.SchemaObject = SchemaObject;
//# sourceMappingURL=SchemaObject.js.map