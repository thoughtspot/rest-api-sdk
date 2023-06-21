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
            "name": "availableDataRowCount",
            "baseName": "available_data_row_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "columnNames",
            "baseName": "column_names",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "dataRows",
            "baseName": "data_rows",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "recordOffset",
            "baseName": "record_offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "recordSize",
            "baseName": "record_size",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "returnedDataRowCount",
            "baseName": "returned_data_row_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "samplingRatio",
            "baseName": "sampling_ratio",
            "type": "number",
            "format": "float"
        },
        {
            "name": "visualizationId",
            "baseName": "visualization_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "visualizationName",
            "baseName": "visualization_name",
            "type": "string",
            "format": ""
        }
    ];
    return LiveboardContent;
}());
exports.LiveboardContent = LiveboardContent;
//# sourceMappingURL=LiveboardContent.js.map