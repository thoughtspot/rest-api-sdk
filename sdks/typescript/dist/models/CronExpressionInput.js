"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CronExpressionInput = void 0;
var CronExpressionInput = (function () {
    function CronExpressionInput() {
    }
    CronExpressionInput.getAttributeTypeMap = function () {
        return CronExpressionInput.attributeTypeMap;
    };
    CronExpressionInput.discriminator = undefined;
    CronExpressionInput.attributeTypeMap = [
        {
            "name": "day_of_month",
            "baseName": "day_of_month",
            "type": "string",
            "format": ""
        },
        {
            "name": "day_of_week",
            "baseName": "day_of_week",
            "type": "string",
            "format": ""
        },
        {
            "name": "hour",
            "baseName": "hour",
            "type": "string",
            "format": ""
        },
        {
            "name": "minute",
            "baseName": "minute",
            "type": "string",
            "format": ""
        },
        {
            "name": "month",
            "baseName": "month",
            "type": "string",
            "format": ""
        },
        {
            "name": "second",
            "baseName": "second",
            "type": "string",
            "format": ""
        }
    ];
    return CronExpressionInput;
}());
exports.CronExpressionInput = CronExpressionInput;
//# sourceMappingURL=CronExpressionInput.js.map