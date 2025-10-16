/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** RegionalSettingsInput */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RegionalSettingsInput implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ISO code to be appended with currency values. */
    @JsonAdapter(CurrencyFormatEnum.Adapter.class)
    public enum CurrencyFormatEnum {
        ADP("ADP"),

        AED("AED"),

        AFN("AFN"),

        ALL("ALL"),

        AMD("AMD"),

        ANG("ANG"),

        AOA("AOA"),

        ARA("ARA"),

        ARS("ARS"),

        ATS("ATS"),

        AUD("AUD"),

        AWG("AWG"),

        AZN("AZN"),

        BAM("BAM"),

        BBD("BBD"),

        BDT("BDT"),

        BEF("BEF"),

        BGL("BGL"),

        BGM("BGM"),

        BGN("BGN"),

        BHD("BHD"),

        BIF("BIF"),

        BMD("BMD"),

        BND("BND"),

        BOB("BOB"),

        BOP("BOP"),

        BOV("BOV"),

        BRL("BRL"),

        BSD("BSD"),

        BTN("BTN"),

        BUK("BUK"),

        BWP("BWP"),

        BYN("BYN"),

        BZD("BZD"),

        CAD("CAD"),

        CDF("CDF"),

        CHE("CHE"),

        CHF("CHF"),

        CHW("CHW"),

        CLE("CLE"),

        CLP("CLP"),

        CNX("CNX"),

        CNY("CNY"),

        COP("COP"),

        COU("COU"),

        CRC("CRC"),

        CSK("CSK"),

        CUC("CUC"),

        CUP("CUP"),

        CVE("CVE"),

        CYP("CYP"),

        CZK("CZK"),

        DDM("DDM"),

        DEM("DEM"),

        DJF("DJF"),

        DKK("DKK"),

        DOP("DOP"),

        DZD("DZD"),

        ECS("ECS"),

        ECV("ECV"),

        EEK("EEK"),

        EGP("EGP"),

        ERN("ERN"),

        ESP("ESP"),

        ETB("ETB"),

        EUR("EUR"),

        FIM("FIM"),

        FJD("FJD"),

        FKP("FKP"),

        FRF("FRF"),

        GBP("GBP"),

        GEK("GEK"),

        GEL("GEL"),

        GHS("GHS"),

        GIP("GIP"),

        GMD("GMD"),

        GNF("GNF"),

        GNS("GNS"),

        GQE("GQE"),

        GRD("GRD"),

        GTQ("GTQ"),

        GWE("GWE"),

        GWP("GWP"),

        GYD("GYD"),

        HKD("HKD"),

        HNL("HNL"),

        HRD("HRD"),

        HRK("HRK"),

        HTG("HTG"),

        HUF("HUF"),

        IDR("IDR"),

        IEP("IEP"),

        ILP("ILP"),

        ILS("ILS"),

        INR("INR"),

        IQD("IQD"),

        IRR("IRR"),

        ISK("ISK"),

        ITL("ITL"),

        JMD("JMD"),

        JOD("JOD"),

        JPY("JPY"),

        KES("KES"),

        KGS("KGS"),

        KHR("KHR"),

        KMF("KMF"),

        KPW("KPW"),

        KRW("KRW"),

        KWD("KWD"),

        KYD("KYD"),

        KZT("KZT"),

        LAK("LAK"),

        LBP("LBP"),

        LKR("LKR"),

        LRD("LRD"),

        LSL("LSL"),

        LTL("LTL"),

        LTT("LTT"),

        LUC("LUC"),

        LUF("LUF"),

        LUL("LUL"),

        LVL("LVL"),

        LVR("LVR"),

        LYD("LYD"),

        MAD("MAD"),

        MAF("MAF"),

        MCF("MCF"),

        MDC("MDC"),

        MDL("MDL"),

        MGA("MGA"),

        MGF("MGF"),

        MKD("MKD"),

        MLF("MLF"),

        MMK("MMK"),

        MNT("MNT"),

        MOP("MOP"),

        MRU("MRU"),

        MTL("MTL"),

        MTP("MTP"),

        MUR("MUR"),

        MVR("MVR"),

        MWK("MWK"),

        MXN("MXN"),

        MXV("MXV"),

        MYR("MYR"),

        MZE("MZE"),

        MZN("MZN"),

        NAD("NAD"),

        NGN("NGN"),

        NIO("NIO"),

        NLG("NLG"),

        NOK("NOK"),

        NPR("NPR"),

        NZD("NZD"),

        OMR("OMR"),

        PAB("PAB"),

        PEI("PEI"),

        PEN("PEN"),

        PGK("PGK"),

        PHP("PHP"),

        PKR("PKR"),

        PLN("PLN"),

        PTE("PTE"),

        PYG("PYG"),

        QAR("QAR"),

        RHD("RHD"),

        RON("RON"),

        RSD("RSD"),

        RUB("RUB"),

        RWF("RWF"),

        SAR("SAR"),

        SBD("SBD"),

        SCR("SCR"),

        SDG("SDG"),

        SEK("SEK"),

        SGD("SGD"),

        SHP("SHP"),

        SIT("SIT"),

        SKK("SKK"),

        SLL("SLL"),

        SOS("SOS"),

        SRD("SRD"),

        SRG("SRG"),

        SSP("SSP"),

        STN("STN"),

        SUR("SUR"),

        SVC("SVC"),

        SYP("SYP"),

        SZL("SZL"),

        THB("THB"),

        TJR("TJR"),

        TJS("TJS"),

        TMT("TMT"),

        TND("TND"),

        TOP("TOP"),

        TPE("TPE"),

        TRY("TRY"),

        TTD("TTD"),

        TWD("TWD"),

        TZS("TZS"),

        UAH("UAH"),

        UAK("UAK"),

        UGX("UGX"),

        USD("USD"),

        UYU("UYU"),

        UYW("UYW"),

        UZS("UZS"),

        VES("VES"),

        VND("VND"),

        VUV("VUV"),

        WST("WST"),

        XAF("XAF"),

        XAG("XAG"),

        XAU("XAU"),

        XBA("XBA"),

        XBB("XBB"),

        XCD("XCD"),

        XDR("XDR"),

        XEU("XEU"),

        XFO("XFO"),

        XFU("XFU"),

        XOF("XOF"),

        XPD("XPD"),

        XPF("XPF"),

        XPT("XPT"),

        XRE("XRE"),

        XSU("XSU"),

        XTS("XTS"),

        XUA("XUA"),

        XXX("XXX"),

        YDD("YDD"),

        YER("YER"),

        ZAR("ZAR"),

        ZMW("ZMW");

        private String value;

        CurrencyFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CurrencyFormatEnum fromValue(String value) {
            for (CurrencyFormatEnum b : CurrencyFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CurrencyFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CurrencyFormatEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CurrencyFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CurrencyFormatEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            CurrencyFormatEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_CURRENCY_FORMAT = "currency_format";

    @SerializedName(SERIALIZED_NAME_CURRENCY_FORMAT)
    @javax.annotation.Nullable
    private CurrencyFormatEnum currencyFormat;

    /** Indicates the locale to be used for all formattings. */
    @JsonAdapter(UserLocaleEnum.Adapter.class)
    public enum UserLocaleEnum {
        EN_CA("en-CA"),

        EN_GB("en-GB"),

        EN_US("en-US"),

        DE_DE("de-DE"),

        JA_JP("ja-JP"),

        ZH_CN("zh-CN"),

        PT_BR("pt-BR"),

        FR_FR("fr-FR"),

        FR_CA("fr-CA"),

        ES_US("es-US"),

        DA_DK("da-DK"),

        ES_ES("es-ES"),

        FI_FI("fi-FI"),

        SV_SE("sv-SE"),

        NB_NO("nb-NO"),

        PT_PT("pt-PT"),

        NL_NL("nl-NL"),

        IT_IT("it-IT"),

        RU_RU("ru-RU"),

        EN_IN("en-IN"),

        DE_CH("de-CH"),

        EN_NZ("en-NZ"),

        ES_MX("es-MX"),

        EN_AU("en-AU"),

        ZH_HANT("zh-Hant"),

        KO_KR("ko-KR"),

        EN_DE("en-DE");

        private String value;

        UserLocaleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UserLocaleEnum fromValue(String value) {
            for (UserLocaleEnum b : UserLocaleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<UserLocaleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UserLocaleEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UserLocaleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return UserLocaleEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            UserLocaleEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_USER_LOCALE = "user_locale";

    @SerializedName(SERIALIZED_NAME_USER_LOCALE)
    @javax.annotation.Nullable
    private UserLocaleEnum userLocale;

    /** Indicates the locale to be used for number formatting. */
    @JsonAdapter(NumberFormatLocaleEnum.Adapter.class)
    public enum NumberFormatLocaleEnum {
        EN_CA("en-CA"),

        EN_GB("en-GB"),

        EN_US("en-US"),

        DE_DE("de-DE"),

        JA_JP("ja-JP"),

        ZH_CN("zh-CN"),

        PT_BR("pt-BR"),

        FR_FR("fr-FR"),

        FR_CA("fr-CA"),

        ES_US("es-US"),

        DA_DK("da-DK"),

        ES_ES("es-ES"),

        FI_FI("fi-FI"),

        SV_SE("sv-SE"),

        NB_NO("nb-NO"),

        PT_PT("pt-PT"),

        NL_NL("nl-NL"),

        IT_IT("it-IT"),

        RU_RU("ru-RU"),

        EN_IN("en-IN"),

        DE_CH("de-CH"),

        EN_NZ("en-NZ"),

        ES_MX("es-MX"),

        EN_AU("en-AU"),

        ZH_HANT("zh-Hant"),

        KO_KR("ko-KR"),

        EN_DE("en-DE");

        private String value;

        NumberFormatLocaleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static NumberFormatLocaleEnum fromValue(String value) {
            for (NumberFormatLocaleEnum b : NumberFormatLocaleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<NumberFormatLocaleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final NumberFormatLocaleEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NumberFormatLocaleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return NumberFormatLocaleEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            NumberFormatLocaleEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_NUMBER_FORMAT_LOCALE = "number_format_locale";

    @SerializedName(SERIALIZED_NAME_NUMBER_FORMAT_LOCALE)
    @javax.annotation.Nullable
    private NumberFormatLocaleEnum numberFormatLocale;

    /** Indicates the locale to be used for date formatting. */
    @JsonAdapter(DateFormatLocaleEnum.Adapter.class)
    public enum DateFormatLocaleEnum {
        EN_CA("en-CA"),

        EN_GB("en-GB"),

        EN_US("en-US"),

        DE_DE("de-DE"),

        JA_JP("ja-JP"),

        ZH_CN("zh-CN"),

        PT_BR("pt-BR"),

        FR_FR("fr-FR"),

        FR_CA("fr-CA"),

        ES_US("es-US"),

        DA_DK("da-DK"),

        ES_ES("es-ES"),

        FI_FI("fi-FI"),

        SV_SE("sv-SE"),

        NB_NO("nb-NO"),

        PT_PT("pt-PT"),

        NL_NL("nl-NL"),

        IT_IT("it-IT"),

        RU_RU("ru-RU"),

        EN_IN("en-IN"),

        DE_CH("de-CH"),

        EN_NZ("en-NZ"),

        ES_MX("es-MX"),

        EN_AU("en-AU"),

        ZH_HANT("zh-Hant"),

        KO_KR("ko-KR"),

        EN_DE("en-DE");

        private String value;

        DateFormatLocaleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DateFormatLocaleEnum fromValue(String value) {
            for (DateFormatLocaleEnum b : DateFormatLocaleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<DateFormatLocaleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DateFormatLocaleEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DateFormatLocaleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DateFormatLocaleEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            DateFormatLocaleEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_DATE_FORMAT_LOCALE = "date_format_locale";

    @SerializedName(SERIALIZED_NAME_DATE_FORMAT_LOCALE)
    @javax.annotation.Nullable
    private DateFormatLocaleEnum dateFormatLocale;

    public RegionalSettingsInput() {}

    public RegionalSettingsInput currencyFormat(
            @javax.annotation.Nullable CurrencyFormatEnum currencyFormat) {
        this.currencyFormat = currencyFormat;
        return this;
    }

    /**
     * ISO code to be appended with currency values.
     *
     * @return currencyFormat
     */
    @javax.annotation.Nullable
    public CurrencyFormatEnum getCurrencyFormat() {
        return currencyFormat;
    }

    public void setCurrencyFormat(@javax.annotation.Nullable CurrencyFormatEnum currencyFormat) {
        this.currencyFormat = currencyFormat;
    }

    public RegionalSettingsInput userLocale(@javax.annotation.Nullable UserLocaleEnum userLocale) {
        this.userLocale = userLocale;
        return this;
    }

    /**
     * Indicates the locale to be used for all formattings.
     *
     * @return userLocale
     */
    @javax.annotation.Nullable
    public UserLocaleEnum getUserLocale() {
        return userLocale;
    }

    public void setUserLocale(@javax.annotation.Nullable UserLocaleEnum userLocale) {
        this.userLocale = userLocale;
    }

    public RegionalSettingsInput numberFormatLocale(
            @javax.annotation.Nullable NumberFormatLocaleEnum numberFormatLocale) {
        this.numberFormatLocale = numberFormatLocale;
        return this;
    }

    /**
     * Indicates the locale to be used for number formatting.
     *
     * @return numberFormatLocale
     */
    @javax.annotation.Nullable
    public NumberFormatLocaleEnum getNumberFormatLocale() {
        return numberFormatLocale;
    }

    public void setNumberFormatLocale(
            @javax.annotation.Nullable NumberFormatLocaleEnum numberFormatLocale) {
        this.numberFormatLocale = numberFormatLocale;
    }

    public RegionalSettingsInput dateFormatLocale(
            @javax.annotation.Nullable DateFormatLocaleEnum dateFormatLocale) {
        this.dateFormatLocale = dateFormatLocale;
        return this;
    }

    /**
     * Indicates the locale to be used for date formatting.
     *
     * @return dateFormatLocale
     */
    @javax.annotation.Nullable
    public DateFormatLocaleEnum getDateFormatLocale() {
        return dateFormatLocale;
    }

    public void setDateFormatLocale(
            @javax.annotation.Nullable DateFormatLocaleEnum dateFormatLocale) {
        this.dateFormatLocale = dateFormatLocale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionalSettingsInput regionalSettingsInput = (RegionalSettingsInput) o;
        return Objects.equals(this.currencyFormat, regionalSettingsInput.currencyFormat)
                && Objects.equals(this.userLocale, regionalSettingsInput.userLocale)
                && Objects.equals(this.numberFormatLocale, regionalSettingsInput.numberFormatLocale)
                && Objects.equals(this.dateFormatLocale, regionalSettingsInput.dateFormatLocale);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyFormat, userLocale, numberFormatLocale, dateFormatLocale);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionalSettingsInput {\n");
        sb.append("    currencyFormat: ").append(toIndentedString(currencyFormat)).append("\n");
        sb.append("    userLocale: ").append(toIndentedString(userLocale)).append("\n");
        sb.append("    numberFormatLocale: ")
                .append(toIndentedString(numberFormatLocale))
                .append("\n");
        sb.append("    dateFormatLocale: ").append(toIndentedString(dateFormatLocale)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("currency_format");
        openapiFields.add("user_locale");
        openapiFields.add("number_format_locale");
        openapiFields.add("date_format_locale");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RegionalSettingsInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RegionalSettingsInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RegionalSettingsInput is not found in"
                                        + " the empty JSON string",
                                RegionalSettingsInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RegionalSettingsInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RegionalSettingsInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("currency_format") != null && !jsonObj.get("currency_format").isJsonNull())
                && !jsonObj.get("currency_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `currency_format` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("currency_format").toString()));
        }
        // validate the optional field `currency_format`
        if (jsonObj.get("currency_format") != null
                && !jsonObj.get("currency_format").isJsonNull()) {
            CurrencyFormatEnum.validateJsonElement(jsonObj.get("currency_format"));
        }
        if ((jsonObj.get("user_locale") != null && !jsonObj.get("user_locale").isJsonNull())
                && !jsonObj.get("user_locale").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `user_locale` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("user_locale").toString()));
        }
        // validate the optional field `user_locale`
        if (jsonObj.get("user_locale") != null && !jsonObj.get("user_locale").isJsonNull()) {
            UserLocaleEnum.validateJsonElement(jsonObj.get("user_locale"));
        }
        if ((jsonObj.get("number_format_locale") != null
                        && !jsonObj.get("number_format_locale").isJsonNull())
                && !jsonObj.get("number_format_locale").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `number_format_locale` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("number_format_locale").toString()));
        }
        // validate the optional field `number_format_locale`
        if (jsonObj.get("number_format_locale") != null
                && !jsonObj.get("number_format_locale").isJsonNull()) {
            NumberFormatLocaleEnum.validateJsonElement(jsonObj.get("number_format_locale"));
        }
        if ((jsonObj.get("date_format_locale") != null
                        && !jsonObj.get("date_format_locale").isJsonNull())
                && !jsonObj.get("date_format_locale").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `date_format_locale` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("date_format_locale").toString()));
        }
        // validate the optional field `date_format_locale`
        if (jsonObj.get("date_format_locale") != null
                && !jsonObj.get("date_format_locale").isJsonNull()) {
            DateFormatLocaleEnum.validateJsonElement(jsonObj.get("date_format_locale"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RegionalSettingsInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RegionalSettingsInput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RegionalSettingsInput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RegionalSettingsInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RegionalSettingsInput>() {
                        @Override
                        public void write(JsonWriter out, RegionalSettingsInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RegionalSettingsInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RegionalSettingsInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RegionalSettingsInput
     * @throws IOException if the JSON string is invalid with respect to RegionalSettingsInput
     */
    public static RegionalSettingsInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RegionalSettingsInput.class);
    }

    /**
     * Convert an instance of RegionalSettingsInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
