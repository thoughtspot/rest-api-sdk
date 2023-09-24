"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MetadataSearchResponse = void 0;
var MetadataSearchResponse = (function () {
    function MetadataSearchResponse() {
    }
    MetadataSearchResponse.getAttributeTypeMap = function () {
        return MetadataSearchResponse.attributeTypeMap;
    };
    MetadataSearchResponse.discriminator = undefined;
    MetadataSearchResponse.attributeTypeMap = [
        {
            "name": "metadata_id",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata_name",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "MetadataSearchResponseMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "dependent_objects",
            "baseName": "dependent_objects",
            "type": "any",
            "format": ""
        },
        {
            "name": "incomplete_objects",
            "baseName": "incomplete_objects",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "metadata_detail",
            "baseName": "metadata_detail",
            "type": "any",
            "format": ""
        },
        {
            "name": "metadata_header",
            "baseName": "metadata_header",
            "type": "any",
            "format": ""
        },
        {
            "name": "visualization_headers",
            "baseName": "visualization_headers",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "stats",
            "baseName": "stats",
            "type": "any",
            "format": ""
        }
    ];
    return MetadataSearchResponse;
}());
exports.MetadataSearchResponse = MetadataSearchResponse;
//# sourceMappingURL=MetadataSearchResponse.js.map