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
 * VisibilityEnum to be used.
 */
public enum VisibilityEnum {
    DEFAULT,

    NON_SHARABLE,

    SHARABLE;


    private static TreeMap<String, VisibilityEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DEFAULT.value = "DEFAULT";
        NON_SHARABLE.value = "NON_SHARABLE";
        SHARABLE.value = "SHARABLE";

        valueMap.put("DEFAULT", DEFAULT);
        valueMap.put("NON_SHARABLE", NON_SHARABLE);
        valueMap.put("SHARABLE", SHARABLE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static VisibilityEnum fromString(String toConvert) {
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
     * Convert list of VisibilityEnum values to list of string values.
     * @param toConvert The list of VisibilityEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<VisibilityEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (VisibilityEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 