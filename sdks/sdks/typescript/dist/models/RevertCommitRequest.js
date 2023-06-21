"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RevertCommitRequest = void 0;
var RevertCommitRequest = (function () {
    function RevertCommitRequest() {
    }
    RevertCommitRequest.getAttributeTypeMap = function () {
        return RevertCommitRequest.attributeTypeMap;
    };
    RevertCommitRequest.discriminator = undefined;
    RevertCommitRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<MetadataObject>",
            "format": ""
        },
        {
            "name": "branchName",
            "baseName": "branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "revertPolicy",
            "baseName": "revert_policy",
            "type": "RevertCommitRequestRevertPolicyEnum",
            "format": ""
        }
    ];
    return RevertCommitRequest;
}());
exports.RevertCommitRequest = RevertCommitRequest;
//# sourceMappingURL=RevertCommitRequest.js.map