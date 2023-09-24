"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AssignTagRequest = void 0;
var AssignTagRequest = (function () {
    function AssignTagRequest() {
    }
    AssignTagRequest.getAttributeTypeMap = function () {
        return AssignTagRequest.attributeTypeMap;
    };
    AssignTagRequest.discriminator = undefined;
    AssignTagRequest.attributeTypeMap = [
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<TagMetadataTypeInput>",
            "format": ""
        },
        {
            "name": "tag_identifiers",
            "baseName": "tag_identifiers",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return AssignTagRequest;
}());
exports.AssignTagRequest = AssignTagRequest;
//# sourceMappingURL=AssignTagRequest.js.map