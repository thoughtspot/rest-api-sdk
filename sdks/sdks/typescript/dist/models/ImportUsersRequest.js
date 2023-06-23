"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportUsersRequest = void 0;
var ImportUsersRequest = (function () {
    function ImportUsersRequest() {
    }
    ImportUsersRequest.getAttributeTypeMap = function () {
        return ImportUsersRequest.attributeTypeMap;
    };
    ImportUsersRequest.discriminator = undefined;
    ImportUsersRequest.attributeTypeMap = [
        {
            "name": "users",
            "baseName": "users",
            "type": "Array<ImportUser>",
            "format": ""
        },
        {
            "name": "defaultPassword",
            "baseName": "default_password",
            "type": "string",
            "format": ""
        },
        {
            "name": "dryRun",
            "baseName": "dry_run",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "deleteUnspecifiedUsers",
            "baseName": "delete_unspecified_users",
            "type": "boolean",
            "format": ""
        }
    ];
    return ImportUsersRequest;
}());
exports.ImportUsersRequest = ImportUsersRequest;
//# sourceMappingURL=ImportUsersRequest.js.map