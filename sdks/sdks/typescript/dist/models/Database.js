"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Database = void 0;
var Database = (function () {
    function Database() {
    }
    Database.getAttributeTypeMap = function () {
        return Database.attributeTypeMap;
    };
    Database.discriminator = undefined;
    Database.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "schemas",
            "baseName": "schemas",
            "type": "Array<SchemaObject>",
            "format": ""
        },
        {
            "name": "autoCreated",
            "baseName": "auto_created",
            "type": "boolean",
            "format": ""
        }
    ];
    return Database;
}());
exports.Database = Database;
//# sourceMappingURL=Database.js.map