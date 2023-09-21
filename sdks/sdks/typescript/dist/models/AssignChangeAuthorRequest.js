"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AssignChangeAuthorRequest = void 0;
var AssignChangeAuthorRequest = (function () {
    function AssignChangeAuthorRequest() {
    }
    AssignChangeAuthorRequest.getAttributeTypeMap = function () {
        return AssignChangeAuthorRequest.attributeTypeMap;
    };
    AssignChangeAuthorRequest.discriminator = undefined;
    AssignChangeAuthorRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<AuthorMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "user_identifier",
            "baseName": "user_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "current_owner_identifier",
            "baseName": "current_owner_identifier",
            "type": "string",
            "format": ""
        }
    ];
    return AssignChangeAuthorRequest;
}());
exports.AssignChangeAuthorRequest = AssignChangeAuthorRequest;
//# sourceMappingURL=AssignChangeAuthorRequest.js.map