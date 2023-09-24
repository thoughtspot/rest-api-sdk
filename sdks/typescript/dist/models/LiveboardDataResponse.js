"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LiveboardDataResponse = void 0;
var LiveboardDataResponse = (function () {
    function LiveboardDataResponse() {
    }
    LiveboardDataResponse.getAttributeTypeMap = function () {
        return LiveboardDataResponse.attributeTypeMap;
    };
    LiveboardDataResponse.discriminator = undefined;
    LiveboardDataResponse.attributeTypeMap = [
        {
            "name": "metadata_id",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata_name",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "contents",
            "baseName": "contents",
            "type": "Array<LiveboardContent>",
            "format": ""
        }
    ];
    return LiveboardDataResponse;
}());
exports.LiveboardDataResponse = LiveboardDataResponse;
//# sourceMappingURL=LiveboardDataResponse.js.map