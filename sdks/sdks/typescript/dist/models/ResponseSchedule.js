"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResponseSchedule = void 0;
var ResponseSchedule = (function () {
    function ResponseSchedule() {
    }
    ResponseSchedule.getAttributeTypeMap = function () {
        return ResponseSchedule.attributeTypeMap;
    };
    ResponseSchedule.discriminator = undefined;
    ResponseSchedule.attributeTypeMap = [
        {
            "name": "author",
            "baseName": "author",
            "type": "Author",
            "format": ""
        },
        {
            "name": "creationTimeInMillis",
            "baseName": "creation_time_in_millis",
            "type": "any",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "fileFormat",
            "baseName": "file_format",
            "type": "string",
            "format": ""
        },
        {
            "name": "frequency",
            "baseName": "frequency",
            "type": "Frequency",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "liveboardOptions",
            "baseName": "liveboard_options",
            "type": "LiveboardOptions",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "MetadataResponse",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "pdfOptions",
            "baseName": "pdf_options",
            "type": "PdfOptions",
            "format": ""
        },
        {
            "name": "recipientDetails",
            "baseName": "recipient_details",
            "type": "RecipientDetails",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string",
            "format": ""
        },
        {
            "name": "timeZone",
            "baseName": "time_zone",
            "type": "string",
            "format": ""
        },
        {
            "name": "historyRuns",
            "baseName": "history_runs",
            "type": "Array<ResponseScheduleRun>",
            "format": ""
        }
    ];
    return ResponseSchedule;
}());
exports.ResponseSchedule = ResponseSchedule;
//# sourceMappingURL=ResponseSchedule.js.map