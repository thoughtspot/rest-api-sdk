/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * CreateUserTypeEnum to be used.
 */
public enum CreateUserTypeEnum {
    UNKNOWN,

    LDAP_USER,

    SAML_USER,

    OIDC_USER,

    LOCAL_USER;


    private static TreeMap<String, CreateUserTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UNKNOWN.value = "UNKNOWN";
        LDAP_USER.value = "LDAP_USER";
        SAML_USER.value = "SAML_USER";
        OIDC_USER.value = "OIDC_USER";
        LOCAL_USER.value = "LOCAL_USER";

        valueMap.put("UNKNOWN", UNKNOWN);
        valueMap.put("LDAP_USER", LDAP_USER);
        valueMap.put("SAML_USER", SAML_USER);
        valueMap.put("OIDC_USER", OIDC_USER);
        valueMap.put("LOCAL_USER", LOCAL_USER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CreateUserTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of CreateUserTypeEnum values to list of string values.
     * @param toConvert The list of CreateUserTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreateUserTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreateUserTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 