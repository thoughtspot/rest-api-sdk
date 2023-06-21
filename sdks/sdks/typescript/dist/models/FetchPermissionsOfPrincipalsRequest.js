"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FetchPermissionsOfPrincipalsRequest = void 0;
var FetchPermissionsOfPrincipalsRequest = (function () {
    function FetchPermissionsOfPrincipalsRequest() {
    }
    FetchPermissionsOfPrincipalsRequest.getAttributeTypeMap = function () {
        return FetchPermissionsOfPrincipalsRequest.attributeTypeMap;
    };
    FetchPermissionsOfPrincipalsRequest.discriminator = undefined;
    FetchPermissionsOfPrincipalsRequest.attributeTypeMap = [
        {
            "name": "principals",
            "baseName": "principals",
            "type": "Array<PrincipalsInput>",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<PermissionsMetadataTypeInput>",
            "format": ""
        }
    ];
    return FetchPermissionsOfPrincipalsRequest;
}());
exports.FetchPermissionsOfPrincipalsRequest = FetchPermissionsOfPrincipalsRequest;
//# sourceMappingURL=FetchPermissionsOfPrincipalsRequest.js.map