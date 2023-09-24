"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeployCommitRequest = void 0;
var DeployCommitRequest = (function () {
    function DeployCommitRequest() {
    }
    DeployCommitRequest.getAttributeTypeMap = function () {
        return DeployCommitRequest.attributeTypeMap;
    };
    DeployCommitRequest.discriminator = undefined;
    DeployCommitRequest.attributeTypeMap = [
        {
            "name": "commit_id",
            "baseName": "commit_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "branch_name",
            "baseName": "branch_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "deploy_type",
            "baseName": "deploy_type",
            "type": "DeployCommitRequestDeployTypeEnum",
            "format": ""
        },
        {
            "name": "deploy_policy",
            "baseName": "deploy_policy",
            "type": "DeployCommitRequestDeployPolicyEnum",
            "format": ""
        }
    ];
    return DeployCommitRequest;
}());
exports.DeployCommitRequest = DeployCommitRequest;
//# sourceMappingURL=DeployCommitRequest.js.map