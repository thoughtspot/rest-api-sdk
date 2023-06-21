"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActionConfig = void 0;
var ActionConfig = (function () {
    function ActionConfig() {
    }
    ActionConfig.getAttributeTypeMap = function () {
        return ActionConfig.attributeTypeMap;
    };
    ActionConfig.discriminator = undefined;
    ActionConfig.attributeTypeMap = [
        {
            "name": "position",
            "baseName": "position",
            "type": "string",
            "format": ""
        },
        {
            "name": "visibility",
            "baseName": "visibility",
            "type": "boolean",
            "format": ""
        }
    ];
    return ActionConfig;
}());
exports.ActionConfig = ActionConfig;
//# sourceMappingURL=ActionConfig.js.map