"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchConnectionResponse = void 0;
var SearchConnectionResponse = (function () {
    function SearchConnectionResponse() {
    }
    SearchConnectionResponse.getAttributeTypeMap = function () {
        return SearchConnectionResponse.attributeTypeMap;
    };
    SearchConnectionResponse.discriminator = undefined;
    SearchConnectionResponse.attributeTypeMap = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "data_warehouse_type",
            "baseName": "data_warehouse_type",
            "type": "SearchConnectionResponseDataWarehouseTypeEnum",
            "format": ""
        },
        {
            "name": "data_warehouse_objects",
            "baseName": "data_warehouse_objects",
            "type": "DataWarehouseObjects",
            "format": ""
        },
        {
            "name": "details",
            "baseName": "details",
            "type": "any",
            "format": ""
        }
    ];
    return SearchConnectionResponse;
}());
exports.SearchConnectionResponse = SearchConnectionResponse;
//# sourceMappingURL=SearchConnectionResponse.js.map