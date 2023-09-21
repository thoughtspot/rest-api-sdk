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
        }
    ];
    return AnswerContent;
}());
exports.AnswerContent = AnswerContent;
//# sourceMappingURL=AnswerContent.js.map