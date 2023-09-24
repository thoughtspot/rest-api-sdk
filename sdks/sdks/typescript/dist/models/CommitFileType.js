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
            "name": "file_name",
            "baseName": "file_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "status_code",
            "baseName": "status_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "status_message",
            "baseName": "status_message",
            "type": "string",
            "format": ""
        }
    ];
    return CommitFileType;
}());
exports.CommitFileType = CommitFileType;
//# sourceMappingURL=CommitFileType.js.map