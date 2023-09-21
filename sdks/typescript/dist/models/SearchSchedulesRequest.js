"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchSchedulesRequest = void 0;
var SearchSchedulesRequest = (function () {
    function SearchSchedulesRequest() {
    }
    SearchSchedulesRequest.getAttributeTypeMap = function () {
        return SearchSchedulesRequest.attributeTypeMap;
    };
    SearchSchedulesRequest.discriminator = undefined;
    SearchSchedulesRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<MetadataInput>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sort_options",
            "baseName": "sort_options",
            "type": "SortingOptions",
            "format": ""
        },
        {
            "name": "history_runs_options",
            "baseName": "history_runs_options",
            "type": "ScheduleHistoryRunsOptionsInput",
            "format": ""
        },
        {
            "name": "schedule_identifiers",
            "baseName": "schedule_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return SearchSchedulesRequest;
}());
exports.SearchSchedulesRequest = SearchSchedulesRequest;
//# sourceMappingURL=SearchSchedulesRequest.js.map