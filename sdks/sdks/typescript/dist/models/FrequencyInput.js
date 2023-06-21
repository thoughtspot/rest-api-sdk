"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FrequencyInput = void 0;
var FrequencyInput = (function () {
    function FrequencyInput() {
    }
    FrequencyInput.getAttributeTypeMap = function () {
        return FrequencyInput.attributeTypeMap;
    };
    FrequencyInput.discriminator = undefined;
    FrequencyInput.attributeTypeMap = [
        {
            "name": "cronExpression",
            "baseName": "cron_expression",
            "type": "CronExpressionInput",
            "format": ""
        }
    ];
    return FrequencyInput;
}());
exports.FrequencyInput = FrequencyInput;
//# sourceMappingURL=FrequencyInput.js.map