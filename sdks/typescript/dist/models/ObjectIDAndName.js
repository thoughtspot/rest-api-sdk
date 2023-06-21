"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ObjectIDAndName = void 0;
var ObjectIDAndName = (function () {
    function ObjectIDAndName() {
    }
    ObjectIDAndName.getAttributeTypeMap = function () {
        return ObjectIDAndName.attributeTypeMap;
    };
    ObjectIDAndName.discriminator = undefined;
    ObjectIDAndName.attributeTypeMap = [
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
    return ObjectIDAndName;
}());
exports.ObjectIDAndName = ObjectIDAndName;
//# sourceMappingURL=ObjectIDAndName.js.map