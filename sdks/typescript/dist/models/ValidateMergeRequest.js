"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ValidateMergeRequest = void 0;
var ValidateMergeRequest = (function () {
    function ValidateMergeRequest() {
    }
    ValidateMergeRequest.getAttributeTypeMap = function () {
        return ValidateMergeRequest.attributeTypeMap;
    };
    ValidateMergeRequest.discriminator = undefined;
    ValidateMergeRequest.attributeTypeMap = [
        {
            "name": "source_branch_name",
            "baseName": "source_branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "target_branch_name",
            "baseName": "target_branch_name",
            "type": "string",
            "format": ""
        }
    ];
    return ValidateMergeRequest;
}());
exports.ValidateMergeRequest = ValidateMergeRequest;
//# sourceMappingURL=ValidateMergeRequest.js.map