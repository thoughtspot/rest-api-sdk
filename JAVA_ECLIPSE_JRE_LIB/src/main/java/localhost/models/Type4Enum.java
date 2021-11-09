/*
 * TSPublicRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Type4Enum to be used.
 */
public enum Type4Enum {
    LOCAL_GROUP,

    TENANT_GROUP;


    private static TreeMap<String, Type4Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        LOCAL_GROUP.value = "LOCAL_GROUP";
        TENANT_GROUP.value = "TENANT_GROUP";

        valueMap.put("LOCAL_GROUP", LOCAL_GROUP);
        valueMap.put("TENANT_GROUP", TENANT_GROUP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Type4Enum fromString(String toConvert) {
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
     * Convert list of Type4Enum values to list of string values.
     * @param toConvert The list of Type4Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Type4Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Type4Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 