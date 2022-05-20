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
 * AccessLevelInputTypeEnum to be used.
 */
public enum AccessLevelInputTypeEnum {
    USER,

    USER_GROUP;


    private static TreeMap<String, AccessLevelInputTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        USER.value = "USER";
        USER_GROUP.value = "USER_GROUP";

        valueMap.put("USER", USER);
        valueMap.put("USER_GROUP", USER_GROUP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static AccessLevelInputTypeEnum fromString(String toConvert) {
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
     * Convert list of AccessLevelInputTypeEnum values to list of string values.
     * @param toConvert The list of AccessLevelInputTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AccessLevelInputTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AccessLevelInputTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 