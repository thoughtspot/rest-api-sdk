"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Scope = void 0;
var Scope = (function () {
    function Scope() {
    }
    Scope.getAttributeTypeMap = function () {
        return Scope.attributeTypeMap;
    };
    Scope.discriminator = undefined;
    Scope.attributeTypeMap = [
        {
            "name": "access_type",
            "baseName": "access_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "org_id",
            "baseName": "org_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "metadata_id",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        }
    ];
    return Scope;
}());
exports.Scope = Scope;
//# sourceMappingURL=Scope.js.map