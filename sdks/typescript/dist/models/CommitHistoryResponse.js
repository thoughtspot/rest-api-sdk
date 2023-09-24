"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CommitHistoryResponse = void 0;
var CommitHistoryResponse = (function () {
    function CommitHistoryResponse() {
    }
    CommitHistoryResponse.getAttributeTypeMap = function () {
        return CommitHistoryResponse.attributeTypeMap;
    };
    CommitHistoryResponse.discriminator = undefined;
    CommitHistoryResponse.attributeTypeMap = [
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
        }
    ];
    return CommitHistoryResponse;
}());
exports.CommitHistoryResponse = CommitHistoryResponse;
//# sourceMappingURL=CommitHistoryResponse.js.map