"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActionDetails = void 0;
var ActionDetails = (function () {
    function ActionDetails() {
    }
    ActionDetails.getAttributeTypeMap = function () {
        return ActionDetails.attributeTypeMap;
    };
    ActionDetails.discriminator = undefined;
    ActionDetails.attributeTypeMap = [
        {
            "name": "CALLBACK",
            "baseName": "CALLBACK",
            "type": "CALLBACK",
            "format": ""
        },
        {
            "name": "URL",
            "baseName": "URL",
            "type": "URL",
            "format": ""
        }
    ];
    return ActionDetails;
}());
exports.ActionDetails = ActionDetails;
//# sourceMappingURL=ActionDetails.js.map