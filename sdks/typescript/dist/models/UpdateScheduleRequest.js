"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.UpdateScheduleRequest = void 0;
var UpdateScheduleRequest = (function () {
    function UpdateScheduleRequest() {
    }
    UpdateScheduleRequest.getAttributeTypeMap = function () {
        return UpdateScheduleRequest.attributeTypeMap;
    };
    UpdateScheduleRequest.discriminator = undefined;
    UpdateScheduleRequest.attributeTypeMap = [
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
            "type": "UpdateScheduleRequestMetadataTypeEnum",
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
            "type": "UpdateScheduleRequestFileFormatEnum",
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
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "UpdateScheduleRequestStatusEnum",
            "format": ""
        }
    ];
    return UpdateScheduleRequest;
}());
exports.UpdateScheduleRequest = UpdateScheduleRequest;
//# sourceMappingURL=UpdateScheduleRequest.js.map