"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImportUsersResponse = void 0;
var ImportUsersResponse = (function () {
    function ImportUsersResponse() {
    }
    ImportUsersResponse.getAttributeTypeMap = function () {
        return ImportUsersResponse.attributeTypeMap;
    };
    ImportUsersResponse.discriminator = undefined;
    ImportUsersResponse.attributeTypeMap = [
        {
            "name": "users_added",
            "baseName": "users_added",
            "type": "Array<ImportUserType>",
            "format": ""
        },
        {
            "name": "users_updated",
            "baseName": "users_updated",
            "type": "Array<ImportUserType>",
            "format": ""
        },
        {
            "name": "users_deleted",
            "baseName": "users_deleted",
            "type": "Array<ImportUserType>",
            "format": ""
        }
    ];
    return ImportUsersResponse;
}());
exports.ImportUsersResponse = ImportUsersResponse;
//# sourceMappingURL=ImportUsersResponse.js.map