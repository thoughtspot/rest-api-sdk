"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActionConfigInput = void 0;
var ActionConfigInput = (function () {
    function ActionConfigInput() {
    }
    ActionConfigInput.getAttributeTypeMap = function () {
        return ActionConfigInput.attributeTypeMap;
    };
    ActionConfigInput.discriminator = undefined;
    ActionConfigInput.attributeTypeMap = [
        {
            "name": "position",
            "baseName": "position",
            "type": "ActionConfigInputPositionEnum",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "boolean",
            "format": ""
        }
    ];
    return ActionConfigInput;
}());
exports.ActionConfigInput = ActionConfigInput;
//# sourceMappingURL=ActionConfigInput.js.map