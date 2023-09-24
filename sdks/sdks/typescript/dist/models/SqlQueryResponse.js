"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SqlQueryResponse = void 0;
var SqlQueryResponse = (function () {
    function SqlQueryResponse() {
    }
    SqlQueryResponse.getAttributeTypeMap = function () {
        return SqlQueryResponse.attributeTypeMap;
    };
    SqlQueryResponse.discriminator = undefined;
    SqlQueryResponse.attributeTypeMap = [
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
            "name": "metadata_type",
            "baseName": "metadata_type",
            "type": "SqlQueryResponseMetadataTypeEnum",
            "format": ""
        },
        {
            "name": "sql_queries",
            "baseName": "sql_queries",
            "type": "Array<SqlQuery>",
            "format": ""
        }
    ];
    return SqlQueryResponse;
}());
exports.SqlQueryResponse = SqlQueryResponse;
//# sourceMappingURL=SqlQueryResponse.js.map