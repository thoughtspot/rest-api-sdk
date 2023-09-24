"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CommitBranchRequest = void 0;
var CommitBranchRequest = (function () {
    function CommitBranchRequest() {
    }
    CommitBranchRequest.getAttributeTypeMap = function () {
        return CommitBranchRequest.attributeTypeMap;
    };
    CommitBranchRequest.discriminator = undefined;
    CommitBranchRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<MetadataObject>",
            "format": ""
        },
        {
            "name": "delete_aware",
            "baseName": "delete_aware",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "branch_name",
            "baseName": "branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "comment",
            "baseName": "comment",
            "type": "string",
            "format": ""
        }
    ];
    return CommitBranchRequest;
}());
exports.CommitBranchRequest = CommitBranchRequest;
//# sourceMappingURL=CommitBranchRequest.js.map