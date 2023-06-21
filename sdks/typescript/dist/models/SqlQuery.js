"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SqlQuery = void 0;
var SqlQuery = (function () {
    function SqlQuery() {
    }
    SqlQuery.getAttributeTypeMap = function () {
        return SqlQuery.attributeTypeMap;
    };
    SqlQuery.discriminator = undefined;
    SqlQuery.attributeTypeMap = [
        {
            "name": "metadataId",
            "baseName": "metadata_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataName",
            "baseName": "metadata_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "sqlQuery",
            "baseName": "sql_query",
            "type": "string",
            "format": ""
        }
    ];
    return SqlQuery;
}());
exports.SqlQuery = SqlQuery;
//# sourceMappingURL=SqlQuery.js.map