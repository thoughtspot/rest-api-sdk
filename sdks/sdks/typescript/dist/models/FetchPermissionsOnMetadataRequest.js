"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FetchPermissionsOnMetadataRequest = void 0;
var FetchPermissionsOnMetadataRequest = (function () {
    function FetchPermissionsOnMetadataRequest() {
    }
    FetchPermissionsOnMetadataRequest.getAttributeTypeMap = function () {
        return FetchPermissionsOnMetadataRequest.attributeTypeMap;
    };
    FetchPermissionsOnMetadataRequest.discriminator = undefined;
    FetchPermissionsOnMetadataRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<PermissionsMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "principals",
            "baseName": "principals",
            "type": "Array<PrincipalsInput>",
            "format": ""
        },
        {
            "name": "includeDependentObjects",
            "baseName": "include_dependent_objects",
            "type": "boolean",
            "format": ""
        }
    ];
    return FetchPermissionsOnMetadataRequest;
}());
exports.FetchPermissionsOnMetadataRequest = FetchPermissionsOnMetadataRequest;
//# sourceMappingURL=FetchPermissionsOnMetadataRequest.js.map