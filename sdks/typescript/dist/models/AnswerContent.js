"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AnswerContent = void 0;
var AnswerContent = (function () {
    function AnswerContent() {
    }
    AnswerContent.getAttributeTypeMap = function () {
        return AnswerContent.attributeTypeMap;
    };
    AnswerContent.discriminator = undefined;
    AnswerContent.attributeTypeMap = [
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
        }
    ];
    return AnswerContent;
}());
exports.AnswerContent = AnswerContent;
//# sourceMappingURL=AnswerContent.js.map