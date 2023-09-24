"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AnswerDataResponse = void 0;
var AnswerDataResponse = (function () {
    function AnswerDataResponse() {
    }
    AnswerDataResponse.getAttributeTypeMap = function () {
        return AnswerDataResponse.attributeTypeMap;
    };
    AnswerDataResponse.discriminator = undefined;
    AnswerDataResponse.attributeTypeMap = [
        {
            "name": "metadata_id",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata_name",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "contents",
            "baseName": "contents",
            "type": "Array<AnswerContent>",
            "format": ""
        }
    ];
    return AnswerDataResponse;
}());
exports.AnswerDataResponse = AnswerDataResponse;
//# sourceMappingURL=AnswerDataResponse.js.map