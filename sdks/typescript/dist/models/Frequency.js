"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Frequency = void 0;
var Frequency = (function () {
    function Frequency() {
    }
    Frequency.getAttributeTypeMap = function () {
        return Frequency.attributeTypeMap;
    };
    Frequency.discriminator = undefined;
    Frequency.attributeTypeMap = [
        {
            "name": "cronExpression",
            "baseName": "cron_expression",
            "type": "CronExpression",
            "format": ""
        }
    ];
    return Frequency;
}());
exports.Frequency = Frequency;
//# sourceMappingURL=Frequency.js.map