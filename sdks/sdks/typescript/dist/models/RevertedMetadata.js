"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RevertedMetadata = void 0;
var RevertedMetadata = (function () {
    function RevertedMetadata() {
    }
    RevertedMetadata.getAttributeTypeMap = function () {
        return RevertedMetadata.attributeTypeMap;
    };
    RevertedMetadata.discriminator = undefined;
    RevertedMetadata.attributeTypeMap = [
        {
            "name": "file_name",
            "baseName": "file_name",
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
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "status_code",
            "baseName": "status_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "status_message",
            "baseName": "status_message",
            "type": "string",
            "format": ""
        }
    ];
    return RevertedMetadata;
}());
exports.RevertedMetadata = RevertedMetadata;
//# sourceMappingURL=RevertedMetadata.js.map