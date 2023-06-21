"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActionDetailsInput = void 0;
var ActionDetailsInput = (function () {
    function ActionDetailsInput() {
    }
    ActionDetailsInput.getAttributeTypeMap = function () {
        return ActionDetailsInput.attributeTypeMap;
    };
    ActionDetailsInput.discriminator = undefined;
    ActionDetailsInput.attributeTypeMap = [
        {
            "name": "CALLBACK",
            "baseName": "CALLBACK",
            "type": "CALLBACKInput",
            "format": ""
        },
        {
            "name": "URL",
            "baseName": "URL",
            "type": "URLInput",
            "format": ""
        }
    ];
    return ActionDetailsInput;
}());
exports.ActionDetailsInput = ActionDetailsInput;
//# sourceMappingURL=ActionDetailsInput.js.map