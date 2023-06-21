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
            "name": "accessType",
            "baseName": "access_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "orgId",
            "baseName": "org_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "metadataId",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        }
    ];
    return Scope;
}());
exports.Scope = Scope;
//# sourceMappingURL=Scope.js.map