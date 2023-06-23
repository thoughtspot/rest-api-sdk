"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActionConfigInputCreate = void 0;
var ActionConfigInputCreate = (function () {
    function ActionConfigInputCreate() {
    }
    ActionConfigInputCreate.getAttributeTypeMap = function () {
        return ActionConfigInputCreate.attributeTypeMap;
    };
    ActionConfigInputCreate.discriminator = undefined;
    ActionConfigInputCreate.attributeTypeMap = [
        {
            "name": "position",
            "baseName": "position",
            "type": "ActionConfigInputCreatePositionEnum",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "boolean",
            "format": ""
        }
    ];
    return ActionConfigInputCreate;
}());
exports.ActionConfigInputCreate = ActionConfigInputCreate;
//# sourceMappingURL=ActionConfigInputCreate.js.map