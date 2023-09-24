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
            "type": "SchedulesPdfOptionsInputPageSizeEnum",
            "format": ""
        },
        {
            "name": "truncate_table",
            "baseName": "truncate_table",
            "type": "boolean",
            "format": ""
        }
    ];
    return SchedulesPdfOptionsInput;
}());
exports.SchedulesPdfOptionsInput = SchedulesPdfOptionsInput;
//# sourceMappingURL=SchedulesPdfOptionsInput.js.map