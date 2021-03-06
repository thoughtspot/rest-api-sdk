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
 * GetLogEventsTopicEnum to be used.
 */
public enum GetLogEventsTopicEnum {
    SECURITY_LOGS;


    private static TreeMap<String, GetLogEventsTopicEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        SECURITY_LOGS.value = "security_logs";

        valueMap.put("security_logs", SECURITY_LOGS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static GetLogEventsTopicEnum fromString(String toConvert) {
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
     * Convert list of GetLogEventsTopicEnum values to list of string values.
     * @param toConvert The list of GetLogEventsTopicEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GetLogEventsTopicEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GetLogEventsTopicEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 