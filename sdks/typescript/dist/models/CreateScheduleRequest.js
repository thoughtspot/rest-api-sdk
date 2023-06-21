"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreateScheduleRequest = void 0;
var CreateScheduleRequest = (function () {
    function CreateScheduleRequest() {
    }
    CreateScheduleRequest.getAttributeTypeMap = function () {
        return CreateScheduleRequest.attributeTypeMap;
    };
    CreateScheduleRequest.discriminator = undefined;
    CreateScheduleRequest.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "CreateScheduleRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "metadataIdentifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "fileFormat",
            "baseName": "file_format",
            "type": "CreateScheduleRequestFileFormatEnum",
            "format": ""
        },
        {
            "name": "liveboardOptions",
            "baseName": "liveboard_options",
            "type": "LiveboardOptionsInput",
            "format": ""
        },
        {
            "name": "pdfOptions",
            "baseName": "pdf_options",
            "type": "SchedulesPdfOptionsInput",
            "format": ""
        },
        {
            "name": "timeZone",
            "baseName": "time_zone",
            "type": "string",
            "format": ""
        },
        {
            "name": "frequency",
            "baseName": "frequency",
            "type": "FrequencyInput",
            "format": ""
        },
        {
            "name": "recipientDetails",
            "baseName": "recipient_details",
            "type": "RecipientDetailsInput",
            "format": ""
        }
    ];
    return CreateScheduleRequest;
}());
exports.CreateScheduleRequest = CreateScheduleRequest;
//# sourceMappingURL=CreateScheduleRequest.js.map