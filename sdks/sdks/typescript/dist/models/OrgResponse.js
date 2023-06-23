"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.OrgResponse = void 0;
var OrgResponse = (function () {
    function OrgResponse() {
    }
    OrgResponse.getAttributeTypeMap = function () {
        return OrgResponse.attributeTypeMap;
    };
    OrgResponse.discriminator = undefined;
    OrgResponse.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "OrgResponseStatusEnum",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "OrgResponseVisibilityEnum",
            "format": ""
        }
    ];
    return OrgResponse;
}());
exports.OrgResponse = OrgResponse;
//# sourceMappingURL=OrgResponse.js.map