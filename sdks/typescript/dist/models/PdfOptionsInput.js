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
            "name": "includeCoverPage",
            "baseName": "include_cover_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeCustomLogo",
            "baseName": "include_custom_logo",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeFilterPage",
            "baseName": "include_filter_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includePageNumber",
            "baseName": "include_page_number",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "pageOrientation",
            "baseName": "page_orientation",
            "type": "PdfOptionsInputPageOrientationEnum",
            "format": ""
        },
        {
            "name": "truncateTable",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "pageFooterText",
            "baseName": "page_footer_text",
            "type": "string",
            "format": ""
        }
    ];
    return PdfOptionsInput;
}());
exports.PdfOptionsInput = PdfOptionsInput;
//# sourceMappingURL=PdfOptionsInput.js.map