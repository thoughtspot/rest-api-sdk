"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SchedulesPdfOptionsInput = void 0;
var SchedulesPdfOptionsInput = (function () {
    function SchedulesPdfOptionsInput() {
    }
    SchedulesPdfOptionsInput.getAttributeTypeMap = function () {
        return SchedulesPdfOptionsInput.attributeTypeMap;
    };
    SchedulesPdfOptionsInput.discriminator = undefined;
    SchedulesPdfOptionsInput.attributeTypeMap = [
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
            "type": "SchedulesPdfOptionsInputPageSizeEnum",
            "format": ""
        },
        {
            "name": "truncateTable",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        }
    ];
    return SchedulesPdfOptionsInput;
}());
exports.SchedulesPdfOptionsInput = SchedulesPdfOptionsInput;
//# sourceMappingURL=SchedulesPdfOptionsInput.js.map