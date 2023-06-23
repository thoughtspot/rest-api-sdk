"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LogResponse = void 0;
var LogResponse = (function () {
    function LogResponse() {
    }
    LogResponse.getAttributeTypeMap = function () {
        return LogResponse.attributeTypeMap;
    };
    LogResponse.discriminator = undefined;
    LogResponse.attributeTypeMap = [
        {
            "name": "date",
            "baseName": "date",
            "type": "string",
            "format": ""
        },
        {
            "name": "log",
            "baseName": "log",
            "type": "string",
            "format": ""
        }
    ];
    return LogResponse;
}());
exports.LogResponse = LogResponse;
//# sourceMappingURL=LogResponse.js.map