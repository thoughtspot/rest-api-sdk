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
    return DeployResponse;
}());
exports.DeployResponse = DeployResponse;
//# sourceMappingURL=DeployResponse.js.map