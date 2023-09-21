"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ModelTableList = void 0;
var ModelTableList = (function () {
    function ModelTableList() {
    }
    ModelTableList.getAttributeTypeMap = function () {
        return ModelTableList.attributeTypeMap;
    };
    ModelTableList.discriminator = undefined;
    ModelTableList.attributeTypeMap = [
        {
            "name": "model_name",
            "baseName": "model_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "tables",
            "baseName": "tables",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return ModelTableList;
}());
exports.ModelTableList = ModelTableList;
//# sourceMappingURL=ModelTableList.js.map