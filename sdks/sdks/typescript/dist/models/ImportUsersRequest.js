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
            "name": "default_password",
            "baseName": "default_password",
            "type": "string",
            "format": ""
        },
        {
            "name": "dry_run",
            "baseName": "dry_run",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "delete_unspecified_users",
            "baseName": "delete_unspecified_users",
            "type": "boolean",
            "format": ""
        }
    ];
    return ImportUsersRequest;
}());
exports.ImportUsersRequest = ImportUsersRequest;
//# sourceMappingURL=ImportUsersRequest.js.map