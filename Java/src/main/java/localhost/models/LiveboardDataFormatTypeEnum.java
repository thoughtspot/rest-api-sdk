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
 * LiveboardDataFormatTypeEnum to be used.
 */
public enum LiveboardDataFormatTypeEnum {
    COMPACT,

    FULL;


    private static TreeMap<String, LiveboardDataFormatTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        COMPACT.value = "COMPACT";
        FULL.value = "FULL";

        valueMap.put("COMPACT", COMPACT);
        valueMap.put("FULL", FULL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static LiveboardDataFormatTypeEnum fromString(String toConvert) {
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
     * Convert list of LiveboardDataFormatTypeEnum values to list of string values.
     * @param toConvert The list of LiveboardDataFormatTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LiveboardDataFormatTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LiveboardDataFormatTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 