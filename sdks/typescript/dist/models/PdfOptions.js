"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PdfOptions = void 0;
var PdfOptions = (function () {
    function PdfOptions() {
    }
    PdfOptions.getAttributeTypeMap = function () {
        return PdfOptions.attributeTypeMap;
    };
    PdfOptions.discriminator = undefined;
    PdfOptions.attributeTypeMap = [
        {
            "name": "complete_liveboard",
            "baseName": "complete_liveboard",
            "type": "boolean",
            "format": ""
        },
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
            "name": "page_footer_text",
            "baseName": "page_footer_text",
            "type": "string",
            "format": ""
        },
        {
            "name": "page_orientation",
            "baseName": "page_orientation",
            "type": "string",
            "format": ""
        },
        {
            "name": "page_size",
            "baseName": "page_size",
            "type": "PdfOptionsPageSizeEnum",
            "format": ""
        },
        {
            "name": "truncate_table",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        }
    ];
    return PdfOptions;
}());
exports.PdfOptions = PdfOptions;
//# sourceMappingURL=PdfOptions.js.map