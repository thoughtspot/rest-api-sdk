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
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "CreateScheduleRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "metadata_identifier",
            "baseName": "metadata_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "file_format",
            "baseName": "file_format",
            "type": "CreateScheduleRequestFileFormatEnum",
            "format": ""
        },
        {
            "name": "liveboard_options",
            "baseName": "liveboard_options",
            "type": "LiveboardOptionsInput",
            "format": ""
        },
        {
            "name": "pdf_options",
            "baseName": "pdf_options",
            "type": "SchedulesPdfOptionsInput",
            "format": ""
        },
        {
            "name": "time_zone",
            "baseName": "time_zone",
            "type": "CreateScheduleRequestTimeZoneEnum",
            "format": ""
        },
        {
            "name": "frequency",
            "baseName": "frequency",
            "type": "FrequencyInput",
            "format": ""
        },
        {
            "name": "recipient_details",
            "baseName": "recipient_details",
            "type": "RecipientDetailsInput",
            "format": ""
        }
    ];
    return CreateScheduleRequest;
}());
exports.CreateScheduleRequest = CreateScheduleRequest;
//# sourceMappingURL=CreateScheduleRequest.js.map