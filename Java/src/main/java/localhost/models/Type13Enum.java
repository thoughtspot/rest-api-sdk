/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Type13Enum to be used.
 */
public enum Type13Enum {
    LIVEBOARD,

    DATAOBJECT,

    COLUMN,

    JOIN;


    private static TreeMap<String, Type13Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        LIVEBOARD.value = "LIVEBOARD";
        DATAOBJECT.value = "DATAOBJECT";
        COLUMN.value = "COLUMN";
        JOIN.value = "JOIN";

        valueMap.put("LIVEBOARD", LIVEBOARD);
        valueMap.put("DATAOBJECT", DATAOBJECT);
        valueMap.put("COLUMN", COLUMN);
        valueMap.put("JOIN", JOIN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Type13Enum fromString(String toConvert) {
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
     * Convert list of Type13Enum values to list of string values.
     * @param toConvert The list of Type13Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Type13Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Type13Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 