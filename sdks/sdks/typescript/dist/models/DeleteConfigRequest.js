"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeleteConfigRequest = void 0;
var DeleteConfigRequest = (function () {
    function DeleteConfigRequest() {
    }
    DeleteConfigRequest.getAttributeTypeMap = function () {
        return DeleteConfigRequest.attributeTypeMap;
    };
    DeleteConfigRequest.discriminator = undefined;
    DeleteConfigRequest.attributeTypeMap = [
        {
            "name": "clusterLevel",
            "baseName": "cluster_level",
            "type": "boolean",
            "format": ""
        }
    ];
    return DeleteConfigRequest;
}());
exports.DeleteConfigRequest = DeleteConfigRequest;
//# sourceMappingURL=DeleteConfigRequest.js.map