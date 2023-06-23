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
            "name": "metadataId",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataName",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataType",
            "baseName": "metadata_type",
            "type": "MetadataSearchResponseMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "dependentObjects",
            "baseName": "dependent_objects",
            "type": "any",
            "format": ""
        },
        {
            "name": "incompleteObjects",
            "baseName": "incomplete_objects",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "metadataDetail",
            "baseName": "metadata_detail",
            "type": "any",
            "format": ""
        },
        {
            "name": "metadataHeader",
            "baseName": "metadata_header",
            "type": "any",
            "format": ""
        },
        {
            "name": "visualizationHeaders",
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