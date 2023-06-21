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
            "name": "completeLiveboard",
            "baseName": "complete_liveboard",
            "type": "boolean",
            "format": ""
        },
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
            "name": "pageFooterText",
            "baseName": "page_footer_text",
            "type": "string",
            "format": ""
        },
        {
            "name": "pageOrientation",
            "baseName": "page_orientation",
            "type": "string",
            "format": ""
        },
        {
            "name": "pageSize",
            "baseName": "page_size",
            "type": "PdfOptionsPageSizeEnum",
            "format": ""
        },
        {
            "name": "truncateTable",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        }
    ];
    return PdfOptions;
}());
exports.PdfOptions = PdfOptions;
//# sourceMappingURL=PdfOptions.js.map