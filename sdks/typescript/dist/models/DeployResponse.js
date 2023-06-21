"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeployResponse = void 0;
var DeployResponse = (function () {
    function DeployResponse() {
    }
    DeployResponse.getAttributeTypeMap = function () {
        return DeployResponse.attributeTypeMap;
    };
    DeployResponse.discriminator = undefined;
    DeployResponse.attributeTypeMap = [
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
    return DeployResponse;
}());
exports.DeployResponse = DeployResponse;
//# sourceMappingURL=DeployResponse.js.map