"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportUserType = void 0;
var ImportUserType = (function () {
    function ImportUserType() {
    }
    ImportUserType.getAttributeTypeMap = function () {
        return ImportUserType.attributeTypeMap;
    };
    ImportUserType.discriminator = undefined;
    ImportUserType.attributeTypeMap = [
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
        }
    ];
    return ImportUserType;
}());
exports.ImportUserType = ImportUserType;
//# sourceMappingURL=ImportUserType.js.map