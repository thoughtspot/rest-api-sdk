"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CommitFileType = void 0;
var CommitFileType = (function () {
    function CommitFileType() {
    }
    CommitFileType.getAttributeTypeMap = function () {
        return CommitFileType.attributeTypeMap;
    };
    CommitFileType.discriminator = undefined;
    CommitFileType.attributeTypeMap = [
        {
            "name": "fileName",
            "baseName": "file_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusCode",
            "baseName": "status_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusMessage",
            "baseName": "status_message",
            "type": "string",
            "format": ""
        }
    ];
    return CommitFileType;
}());
exports.CommitFileType = CommitFileType;
//# sourceMappingURL=CommitFileType.js.map