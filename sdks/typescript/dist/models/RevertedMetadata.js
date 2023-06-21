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
            "name": "fileName",
            "baseName": "file_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataName",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusCode",
            "baseName": "status_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusMessage",
            "baseName": "status_message",
            "type": "string",
            "format": ""
        }
    ];
    return RevertedMetadata;
}());
exports.RevertedMetadata = RevertedMetadata;
//# sourceMappingURL=RevertedMetadata.js.map