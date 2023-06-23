"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ScheduleHistoryRunsOptionsInput = void 0;
var ScheduleHistoryRunsOptionsInput = (function () {
    function ScheduleHistoryRunsOptionsInput() {
    }
    ScheduleHistoryRunsOptionsInput.getAttributeTypeMap = function () {
        return ScheduleHistoryRunsOptionsInput.attributeTypeMap;
    };
    ScheduleHistoryRunsOptionsInput.discriminator = undefined;
    ScheduleHistoryRunsOptionsInput.attributeTypeMap = [
        {
            "name": "includeHistoryRuns",
            "baseName": "include_history_runs",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "recordSize",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "recordOffset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        }
    ];
    return ScheduleHistoryRunsOptionsInput;
}());
exports.ScheduleHistoryRunsOptionsInput = ScheduleHistoryRunsOptionsInput;
//# sourceMappingURL=ScheduleHistoryRunsOptionsInput.js.map