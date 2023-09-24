"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActionDetailsInputCreate = void 0;
var ActionDetailsInputCreate = (function () {
    function ActionDetailsInputCreate() {
    }
    ActionDetailsInputCreate.getAttributeTypeMap = function () {
        return ActionDetailsInputCreate.attributeTypeMap;
    };
    ActionDetailsInputCreate.discriminator = undefined;
    ActionDetailsInputCreate.attributeTypeMap = [
        {
            "name": "CALLBACK",
            "baseName": "CALLBACK",
            "type": "CALLBACKInputMandatory",
            "format": ""
        },
        {
            "name": "URL",
            "baseName": "URL",
            "type": "URLInputMandatory",
            "format": ""
        }
    ];
    return ActionDetailsInputCreate;
}());
exports.ActionDetailsInputCreate = ActionDetailsInputCreate;
//# sourceMappingURL=ActionDetailsInputCreate.js.map