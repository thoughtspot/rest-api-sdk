"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeleteMetadataRequest = void 0;
var DeleteMetadataRequest = (function () {
    function DeleteMetadataRequest() {
    }
    DeleteMetadataRequest.getAttributeTypeMap = function () {
        return DeleteMetadataRequest.attributeTypeMap;
    };
    DeleteMetadataRequest.discriminator = undefined;
    DeleteMetadataRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<DeleteMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "delete_disabled_objects",
            "baseName": "delete_disabled_objects",
            "type": "boolean",
            "format": ""
        }
    ];
    return DeleteMetadataRequest;
}());
exports.DeleteMetadataRequest = DeleteMetadataRequest;
//# sourceMappingURL=DeleteMetadataRequest.js.map