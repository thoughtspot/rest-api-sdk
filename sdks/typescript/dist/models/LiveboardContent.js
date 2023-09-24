"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LiveboardContent = void 0;
var LiveboardContent = (function () {
    function LiveboardContent() {
    }
    LiveboardContent.getAttributeTypeMap = function () {
        return LiveboardContent.attributeTypeMap;
    };
    LiveboardContent.discriminator = undefined;
    LiveboardContent.attributeTypeMap = [
        {
            "name": "available_data_row_count",
            "baseName": "available_data_row_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "column_names",
            "baseName": "column_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "data_rows",
            "baseName": "data_rows",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "record_offset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "record_size",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "returned_data_row_count",
            "baseName": "returned_data_row_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "sampling_ratio",
            "baseName": "sampling_ratio",
            "type": "number",
            "format": "float"
        },
        {
            "name": "visualization_id",
            "baseName": "visualization_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "visualization_name",
            "baseName": "visualization_name",
            "type": "string",
            "format": ""
        }
    ];
    return LiveboardContent;
}());
exports.LiveboardContent = LiveboardContent;
//# sourceMappingURL=LiveboardContent.js.map