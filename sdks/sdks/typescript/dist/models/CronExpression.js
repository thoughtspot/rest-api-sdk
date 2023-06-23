"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CronExpression = void 0;
var CronExpression = (function () {
    function CronExpression() {
    }
    CronExpression.getAttributeTypeMap = function () {
        return CronExpression.attributeTypeMap;
    };
    CronExpression.discriminator = undefined;
    CronExpression.attributeTypeMap = [
        {
            "name": "dayOfMonth",
            "baseName": "day_of_month",
            "type": "string",
            "format": ""
        },
        {
            "name": "dayOfWeek",
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
    return CronExpression;
}());
exports.CronExpression = CronExpression;
//# sourceMappingURL=CronExpression.js.map