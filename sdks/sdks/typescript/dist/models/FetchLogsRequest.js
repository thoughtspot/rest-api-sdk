"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FetchLogsRequest = void 0;
var FetchLogsRequest = (function () {
    function FetchLogsRequest() {
    }
    FetchLogsRequest.getAttributeTypeMap = function () {
        return FetchLogsRequest.attributeTypeMap;
    };
    FetchLogsRequest.discriminator = undefined;
    FetchLogsRequest.attributeTypeMap = [
        {
            "name": "logType",
            "baseName": "log_type",
            "type": "FetchLogsRequestLogTypeEnum",
            "format": ""
        },
        {
            "name": "startEpochTimeInMillis",
            "baseName": "start_epoch_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "endEpochTimeInMillis",
            "baseName": "end_epoch_time_in_millis",
            "type": "number",
            "format": "float"
        }
    ];
    return FetchLogsRequest;
}());
exports.FetchLogsRequest = FetchLogsRequest;
//# sourceMappingURL=FetchLogsRequest.js.map