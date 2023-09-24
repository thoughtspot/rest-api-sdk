"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DbtConnectionRequest = void 0;
var DbtConnectionRequest = (function () {
    function DbtConnectionRequest() {
    }
    DbtConnectionRequest.getAttributeTypeMap = function () {
        return DbtConnectionRequest.attributeTypeMap;
    };
    DbtConnectionRequest.discriminator = undefined;
    DbtConnectionRequest.attributeTypeMap = [
        {
            "name": "connection_name",
            "baseName": "connection_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "database_name",
            "baseName": "database_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "import_type",
            "baseName": "import_type",
            "type": "DbtConnectionRequestImportTypeEnum",
            "format": ""
        },
        {
            "name": "access_token",
            "baseName": "access_token",
            "type": "string",
            "format": ""
        },
        {
            "name": "dbt_url",
            "baseName": "dbt_url",
            "type": "string",
            "format": ""
        },
        {
            "name": "account_id",
            "baseName": "account_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "project_id",
            "baseName": "project_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "dbt_env_id",
            "baseName": "dbt_env_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "project_name",
            "baseName": "project_name",
            "type": "string",
            "format": ""
        }
    ];
    return DbtConnectionRequest;
}());
exports.DbtConnectionRequest = DbtConnectionRequest;
//# sourceMappingURL=DbtConnectionRequest.js.map