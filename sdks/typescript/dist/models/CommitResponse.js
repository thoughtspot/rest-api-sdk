"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CommitResponse = void 0;
var CommitResponse = (function () {
    function CommitResponse() {
    }
    CommitResponse.getAttributeTypeMap = function () {
        return CommitResponse.attributeTypeMap;
    };
    CommitResponse.discriminator = undefined;
    CommitResponse.attributeTypeMap = [
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
            "name": "commit_time",
            "baseName": "commit_time",
            "type": "string",
            "format": ""
        },
        {
            "name": "commit_id",
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
            "name": "committed_files",
            "baseName": "committed_files",
            "type": "Array<CommitFileType>",
            "format": ""
        }
    ];
    return CommitResponse;
}());
exports.CommitResponse = CommitResponse;
//# sourceMappingURL=CommitResponse.js.map