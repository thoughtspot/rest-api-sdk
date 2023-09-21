"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PdfOptionsInput = void 0;
var PdfOptionsInput = (function () {
    function PdfOptionsInput() {
    }
    PdfOptionsInput.getAttributeTypeMap = function () {
        return PdfOptionsInput.attributeTypeMap;
    };
    PdfOptionsInput.discriminator = undefined;
    PdfOptionsInput.attributeTypeMap = [
        {
            "name": "include_cover_page",
            "baseName": "include_cover_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_custom_logo",
            "baseName": "include_custom_logo",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_filter_page",
            "baseName": "include_filter_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "include_page_number",
            "baseName": "include_page_number",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "page_orientation",
            "baseName": "page_orientation",
            "type": "PdfOptionsInputPageOrientationEnum",
            "format": ""
        },
        {
            "name": "truncate_table",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "page_footer_text",
            "baseName": "page_footer_text",
            "type": "string",
            "format": ""
        }
    ];
    return PdfOptionsInput;
}());
exports.PdfOptionsInput = PdfOptionsInput;
//# sourceMappingURL=PdfOptionsInput.js.map