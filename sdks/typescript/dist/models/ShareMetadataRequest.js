"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ShareMetadataRequest = void 0;
var ShareMetadataRequest = (function () {
    function ShareMetadataRequest() {
    }
    ShareMetadataRequest.getAttributeTypeMap = function () {
        return ShareMetadataRequest.attributeTypeMap;
    };
    ShareMetadataRequest.discriminator = undefined;
    ShareMetadataRequest.attributeTypeMap = [
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "ShareMetadataRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "metadataIdentifiers",
            "baseName": "metadata_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<SharePermissionsInput>",
            "format": ""
        },
        {
            "name": "visualizationIdentifiers",
            "baseName": "visualization_identifiers",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "emails",
            "baseName": "emails",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        },
        {
            "name": "enableCustomUrl",
            "baseName": "enable_custom_url",
            "type": "boolean",
            "format": ""
        }
    ];
    return ShareMetadataRequest;
}());
exports.ShareMetadataRequest = ShareMetadataRequest;
//# sourceMappingURL=ShareMetadataRequest.js.map