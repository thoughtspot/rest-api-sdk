"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Tag = void 0;
var Tag = (function () {
    function Tag() {
    }
    Tag.getAttributeTypeMap = function () {
        return Tag.attributeTypeMap;
    };
    Tag.discriminator = undefined;
    Tag.attributeTypeMap = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "color",
            "baseName": "color",
            "type": "string",
            "format": ""
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "hidden",
            "baseName": "hidden",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "external",
            "baseName": "external",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "deprecated",
            "baseName": "deprecated",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "creationTimeInMillis",
            "baseName": "creation_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "modificationTimeInMillis",
            "baseName": "modification_time_in_millis",
            "type": "number",
            "format": "float"
        },
        {
            "name": "authorId",
            "baseName": "author_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "modifierId",
            "baseName": "modifier_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "ownerId",
            "baseName": "owner_id",
            "type": "string",
            "format": ""
        }
    ];
    return Tag;
}());
exports.Tag = Tag;
//# sourceMappingURL=Tag.js.map