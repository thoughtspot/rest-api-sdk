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
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "UpdateScheduleRequestMetadataTypeEnum",
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
            "type": "UpdateScheduleRequestFileFormatEnum",
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
            "type": "UpdateScheduleRequestTimeZoneEnum",
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