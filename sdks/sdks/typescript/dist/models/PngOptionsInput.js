"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PngOptionsInput = void 0;
var PngOptionsInput = (function () {
    function PngOptionsInput() {
    }
    PngOptionsInput.getAttributeTypeMap = function () {
        return PngOptionsInput.attributeTypeMap;
    };
    PngOptionsInput.discriminator = undefined;
    PngOptionsInput.attributeTypeMap = [
        {
            "name": "includeCoverPage",
            "baseName": "include_cover_page",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "includeFilterPage",
            "baseName": "include_filter_page",
            "type": "boolean",
            "format": ""
        }
    ];
    return PngOptionsInput;
}());
exports.PngOptionsInput = PngOptionsInput;
//# sourceMappingURL=PngOptionsInput.js.map