"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GenerateTmlRequest = void 0;
var GenerateTmlRequest = (function () {
    function GenerateTmlRequest() {
    }
    GenerateTmlRequest.getAttributeTypeMap = function () {
        return GenerateTmlRequest.attributeTypeMap;
    };
    GenerateTmlRequest.discriminator = undefined;
    GenerateTmlRequest.attributeTypeMap = [
        {
            "name": "dbt_connection_identifier",
            "baseName": "dbt_connection_identifier",
            "type": "string",
            "format": ""
        },
        {
            "name": "model_tables",
            "baseName": "model_tables",
            "type": "Array<ModelTableList>",
            "format": ""
        },
        {
            "name": "import_worksheets",
            "baseName": "import_worksheets",
            "type": "GenerateTmlRequestImportWorksheetsEnum",
            "format": ""
        },
        {
            "name": "worksheets",
            "baseName": "worksheets",
            "type": "Array<string>",
            "format": ""
        }
    ];
    return GenerateTmlRequest;
}());
exports.GenerateTmlRequest = GenerateTmlRequest;
//# sourceMappingURL=GenerateTmlRequest.js.map