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
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "ShareMetadataRequestMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "metadata_identifiers",
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
            "name": "visualization_identifiers",
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
            "name": "enable_custom_url",
            "baseName": "enable_custom_url",
            "type": "boolean",
            "format": ""
        }
    ];
    return ShareMetadataRequest;
}());
exports.ShareMetadataRequest = ShareMetadataRequest;
//# sourceMappingURL=ShareMetadataRequest.js.map