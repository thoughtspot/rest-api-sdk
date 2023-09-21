"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResponseScheduleRun = void 0;
var ResponseScheduleRun = (function () {
    function ResponseScheduleRun() {
    }
    ResponseScheduleRun.getAttributeTypeMap = function () {
        return ResponseScheduleRun.attributeTypeMap;
    };
    ResponseScheduleRun.discriminator = undefined;
    ResponseScheduleRun.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "start_time_in_millis",
            "baseName": "start_time_in_millis",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "end_time_in_millis",
            "baseName": "end_time_in_millis",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string",
            "format": ""
        },
        {
            "name": "detail",
            "baseName": "detail",
            "type": "string",
            "format": ""
        }
    ];
    return ResponseScheduleRun;
}());
exports.ResponseScheduleRun = ResponseScheduleRun;
//# sourceMappingURL=ResponseScheduleRun.js.map