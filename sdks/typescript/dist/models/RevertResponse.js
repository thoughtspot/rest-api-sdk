"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RevertResponse = void 0;
var RevertResponse = (function () {
    function RevertResponse() {
    }
    RevertResponse.getAttributeTypeMap = function () {
        return RevertResponse.attributeTypeMap;
    };
    RevertResponse.discriminator = undefined;
    RevertResponse.attributeTypeMap = [
        {
            "name": "committer",
            "baseName": "committer",
            "type": "CommiterType",
            "format": ""
        },
        {
            "name": "author",
            "baseName": "author",
            "type": "AuthorType",
            "format": ""
        },
        {
            "name": "comment",
            "baseName": "comment",
            "type": "string",
            "format": ""
        },
        {
            "name": "commitTime",
            "baseName": "commit_time",
            "type": "string",
            "format": ""
        },
        {
            "name": "commitId",
            "baseName": "commit_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "branch",
            "baseName": "branch",
            "type": "string",
            "format": ""
        },
        {
            "name": "committedFiles",
            "baseName": "committed_files",
            "type": "Array<CommitFileType>",
            "format": ""
        },
        {
            "name": "revertedMetadata",
            "baseName": "reverted_metadata",
            "type": "Array<RevertedMetadata>",
            "format": ""
        }
    ];
    return RevertResponse;
}());
exports.RevertResponse = RevertResponse;
//# sourceMappingURL=RevertResponse.js.map