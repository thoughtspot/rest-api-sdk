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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** CreateScheduleRequest */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CreateScheduleRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    @javax.annotation.Nonnull
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    @javax.annotation.Nonnull
    private String description;

    /** Type of the metadata object. */
    @JsonAdapter(MetadataTypeEnum.Adapter.class)
    public enum MetadataTypeEnum {
        LIVEBOARD("LIVEBOARD");

        private String value;

        MetadataTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MetadataTypeEnum fromValue(String value) {
            for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MetadataTypeEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            MetadataTypeEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";

    @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
    @javax.annotation.Nonnull
    private MetadataTypeEnum metadataType;

    public static final String SERIALIZED_NAME_METADATA_IDENTIFIER = "metadata_identifier";

    @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIER)
    @javax.annotation.Nonnull
    private String metadataIdentifier;

    /** Export file format. */
    @JsonAdapter(FileFormatEnum.Adapter.class)
    public enum FileFormatEnum {
        CSV("CSV"),

        PDF("PDF"),

        XLSX("XLSX");

        private String value;

        FileFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FileFormatEnum fromValue(String value) {
            for (FileFormatEnum b : FileFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<FileFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FileFormatEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FileFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FileFormatEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            FileFormatEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";

    @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
    @javax.annotation.Nullable
    private FileFormatEnum fileFormat = FileFormatEnum.PDF;

    public static final String SERIALIZED_NAME_LIVEBOARD_OPTIONS = "liveboard_options";

    @SerializedName(SERIALIZED_NAME_LIVEBOARD_OPTIONS)
    @javax.annotation.Nullable
    private LiveboardOptionsInput liveboardOptions;

    public static final String SERIALIZED_NAME_PDF_OPTIONS = "pdf_options";

    @SerializedName(SERIALIZED_NAME_PDF_OPTIONS)
    @javax.annotation.Nullable
    private SchedulesPdfOptionsInput pdfOptions;

    /** Time zone */
    @JsonAdapter(TimeZoneEnum.Adapter.class)
    public enum TimeZoneEnum {
        AFRICA_ABIDJAN("Africa/Abidjan"),

        AFRICA_ACCRA("Africa/Accra"),

        AFRICA_ADDIS_ABABA("Africa/Addis_Ababa"),

        AFRICA_ALGIERS("Africa/Algiers"),

        AFRICA_ASMARA("Africa/Asmara"),

        AFRICA_ASMERA("Africa/Asmera"),

        AFRICA_BAMAKO("Africa/Bamako"),

        AFRICA_BANGUI("Africa/Bangui"),

        AFRICA_BANJUL("Africa/Banjul"),

        AFRICA_BISSAU("Africa/Bissau"),

        AFRICA_BLANTYRE("Africa/Blantyre"),

        AFRICA_BRAZZAVILLE("Africa/Brazzaville"),

        AFRICA_BUJUMBURA("Africa/Bujumbura"),

        AFRICA_CAIRO("Africa/Cairo"),

        AFRICA_CASABLANCA("Africa/Casablanca"),

        AFRICA_CEUTA("Africa/Ceuta"),

        AFRICA_CONAKRY("Africa/Conakry"),

        AFRICA_DAKAR("Africa/Dakar"),

        AFRICA_DAR_ES_SALAAM("Africa/Dar_es_Salaam"),

        AFRICA_DJIBOUTI("Africa/Djibouti"),

        AFRICA_DOUALA("Africa/Douala"),

        AFRICA_EL_AAIUN("Africa/El_Aaiun"),

        AFRICA_FREETOWN("Africa/Freetown"),

        AFRICA_GABORONE("Africa/Gaborone"),

        AFRICA_HARARE("Africa/Harare"),

        AFRICA_JOHANNESBURG("Africa/Johannesburg"),

        AFRICA_JUBA("Africa/Juba"),

        AFRICA_KAMPALA("Africa/Kampala"),

        AFRICA_KHARTOUM("Africa/Khartoum"),

        AFRICA_KIGALI("Africa/Kigali"),

        AFRICA_KINSHASA("Africa/Kinshasa"),

        AFRICA_LAGOS("Africa/Lagos"),

        AFRICA_LIBREVILLE("Africa/Libreville"),

        AFRICA_LOME("Africa/Lome"),

        AFRICA_LUANDA("Africa/Luanda"),

        AFRICA_LUBUMBASHI("Africa/Lubumbashi"),

        AFRICA_LUSAKA("Africa/Lusaka"),

        AFRICA_MALABO("Africa/Malabo"),

        AFRICA_MAPUTO("Africa/Maputo"),

        AFRICA_MASERU("Africa/Maseru"),

        AFRICA_MBABANE("Africa/Mbabane"),

        AFRICA_MOGADISHU("Africa/Mogadishu"),

        AFRICA_MONROVIA("Africa/Monrovia"),

        AFRICA_NAIROBI("Africa/Nairobi"),

        AFRICA_NDJAMENA("Africa/Ndjamena"),

        AFRICA_NIAMEY("Africa/Niamey"),

        AFRICA_NOUAKCHOTT("Africa/Nouakchott"),

        AFRICA_OUAGADOUGOU("Africa/Ouagadougou"),

        AFRICA_PORTO_NOVO("Africa/Porto-Novo"),

        AFRICA_SAO_TOME("Africa/Sao_Tome"),

        AFRICA_TIMBUKTU("Africa/Timbuktu"),

        AFRICA_TRIPOLI("Africa/Tripoli"),

        AFRICA_TUNIS("Africa/Tunis"),

        AFRICA_WINDHOEK("Africa/Windhoek"),

        AMERICA_ADAK("America/Adak"),

        AMERICA_ANCHORAGE("America/Anchorage"),

        AMERICA_ANGUILLA("America/Anguilla"),

        AMERICA_ANTIGUA("America/Antigua"),

        AMERICA_ARAGUAINA("America/Araguaina"),

        AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),

        AMERICA_ARGENTINA_CATAMARCA("America/Argentina/Catamarca"),

        AMERICA_ARGENTINA_COMOD_RIVADAVIA("America/Argentina/ComodRivadavia"),

        AMERICA_ARGENTINA_CORDOBA("America/Argentina/Cordoba"),

        AMERICA_ARGENTINA_JUJUY("America/Argentina/Jujuy"),

        AMERICA_ARGENTINA_LA_RIOJA("America/Argentina/La_Rioja"),

        AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),

        AMERICA_ARGENTINA_RIO_GALLEGOS("America/Argentina/Rio_Gallegos"),

        AMERICA_ARGENTINA_SALTA("America/Argentina/Salta"),

        AMERICA_ARGENTINA_SAN_JUAN("America/Argentina/San_Juan"),

        AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),

        AMERICA_ARGENTINA_TUCUMAN("America/Argentina/Tucuman"),

        AMERICA_ARGENTINA_USHUAIA("America/Argentina/Ushuaia"),

        AMERICA_ARUBA("America/Aruba"),

        AMERICA_ASUNCION("America/Asuncion"),

        AMERICA_ATIKOKAN("America/Atikokan"),

        AMERICA_ATKA("America/Atka"),

        AMERICA_BAHIA("America/Bahia"),

        AMERICA_BAHIA_BANDERAS("America/Bahia_Banderas"),

        AMERICA_BARBADOS("America/Barbados"),

        AMERICA_BELEM("America/Belem"),

        AMERICA_BELIZE("America/Belize"),

        AMERICA_BLANC_SABLON("America/Blanc-Sablon"),

        AMERICA_BOA_VISTA("America/Boa_Vista"),

        AMERICA_BOGOTA("America/Bogota"),

        AMERICA_BOISE("America/Boise"),

        AMERICA_BUENOS_AIRES("America/Buenos_Aires"),

        AMERICA_CAMBRIDGE_BAY("America/Cambridge_Bay"),

        AMERICA_CAMPO_GRANDE("America/Campo_Grande"),

        AMERICA_CANCUN("America/Cancun"),

        AMERICA_CARACAS("America/Caracas"),

        AMERICA_CATAMARCA("America/Catamarca"),

        AMERICA_CAYENNE("America/Cayenne"),

        AMERICA_CAYMAN("America/Cayman"),

        AMERICA_CHICAGO("America/Chicago"),

        AMERICA_CHIHUAHUA("America/Chihuahua"),

        AMERICA_CORAL_HARBOUR("America/Coral_Harbour"),

        AMERICA_CORDOBA("America/Cordoba"),

        AMERICA_COSTA_RICA("America/Costa_Rica"),

        AMERICA_CRESTON("America/Creston"),

        AMERICA_CUIABA("America/Cuiaba"),

        AMERICA_CURACAO("America/Curacao"),

        AMERICA_DANMARKSHAVN("America/Danmarkshavn"),

        AMERICA_DAWSON("America/Dawson"),

        AMERICA_DAWSON_CREEK("America/Dawson_Creek"),

        AMERICA_DENVER("America/Denver"),

        AMERICA_DETROIT("America/Detroit"),

        AMERICA_DOMINICA("America/Dominica"),

        AMERICA_EDMONTON("America/Edmonton"),

        AMERICA_EIRUNEPE("America/Eirunepe"),

        AMERICA_EL_SALVADOR("America/El_Salvador"),

        AMERICA_ENSENADA("America/Ensenada"),

        AMERICA_FORT_NELSON("America/Fort_Nelson"),

        AMERICA_FORT_WAYNE("America/Fort_Wayne"),

        AMERICA_FORTALEZA("America/Fortaleza"),

        AMERICA_GLACE_BAY("America/Glace_Bay"),

        AMERICA_GODTHAB("America/Godthab"),

        AMERICA_GOOSE_BAY("America/Goose_Bay"),

        AMERICA_GRAND_TURK("America/Grand_Turk"),

        AMERICA_GRENADA("America/Grenada"),

        AMERICA_GUADELOUPE("America/Guadeloupe"),

        AMERICA_GUATEMALA("America/Guatemala"),

        AMERICA_GUAYAQUIL("America/Guayaquil"),

        AMERICA_GUYANA("America/Guyana"),

        AMERICA_HALIFAX("America/Halifax"),

        AMERICA_HAVANA("America/Havana"),

        AMERICA_HERMOSILLO("America/Hermosillo"),

        AMERICA_INDIANA_INDIANAPOLIS("America/Indiana/Indianapolis"),

        AMERICA_INDIANA_KNOX("America/Indiana/Knox"),

        AMERICA_INDIANA_MARENGO("America/Indiana/Marengo"),

        AMERICA_INDIANA_PETERSBURG("America/Indiana/Petersburg"),

        AMERICA_INDIANA_TELL_CITY("America/Indiana/Tell_City"),

        AMERICA_INDIANA_VEVAY("America/Indiana/Vevay"),

        AMERICA_INDIANA_VINCENNES("America/Indiana/Vincennes"),

        AMERICA_INDIANA_WINAMAC("America/Indiana/Winamac"),

        AMERICA_INDIANAPOLIS("America/Indianapolis"),

        AMERICA_INUVIK("America/Inuvik"),

        AMERICA_IQALUIT("America/Iqaluit"),

        AMERICA_JAMAICA("America/Jamaica"),

        AMERICA_JUJUY("America/Jujuy"),

        AMERICA_JUNEAU("America/Juneau"),

        AMERICA_KENTUCKY_LOUISVILLE("America/Kentucky/Louisville"),

        AMERICA_KENTUCKY_MONTICELLO("America/Kentucky/Monticello"),

        AMERICA_KNOX_IN("America/Knox_IN"),

        AMERICA_KRALENDIJK("America/Kralendijk"),

        AMERICA_LA_PAZ("America/La_Paz"),

        AMERICA_LIMA("America/Lima"),

        AMERICA_LOS_ANGELES("America/Los_Angeles"),

        AMERICA_LOUISVILLE("America/Louisville"),

        AMERICA_LOWER_PRINCES("America/Lower_Princes"),

        AMERICA_MACEIO("America/Maceio"),

        AMERICA_MANAGUA("America/Managua"),

        AMERICA_MANAUS("America/Manaus"),

        AMERICA_MARIGOT("America/Marigot"),

        AMERICA_MARTINIQUE("America/Martinique"),

        AMERICA_MATAMOROS("America/Matamoros"),

        AMERICA_MAZATLAN("America/Mazatlan"),

        AMERICA_MENDOZA("America/Mendoza"),

        AMERICA_MENOMINEE("America/Menominee"),

        AMERICA_MERIDA("America/Merida"),

        AMERICA_METLAKATLA("America/Metlakatla"),

        AMERICA_MEXICO_CITY("America/Mexico_City"),

        AMERICA_MIQUELON("America/Miquelon"),

        AMERICA_MONCTON("America/Moncton"),

        AMERICA_MONTERREY("America/Monterrey"),

        AMERICA_MONTEVIDEO("America/Montevideo"),

        AMERICA_MONTREAL("America/Montreal"),

        AMERICA_MONTSERRAT("America/Montserrat"),

        AMERICA_NASSAU("America/Nassau"),

        AMERICA_NEW_YORK("America/New_York"),

        AMERICA_NIPIGON("America/Nipigon"),

        AMERICA_NOME("America/Nome"),

        AMERICA_NORONHA("America/Noronha"),

        AMERICA_NORTH_DAKOTA_BEULAH("America/North_Dakota/Beulah"),

        AMERICA_NORTH_DAKOTA_CENTER("America/North_Dakota/Center"),

        AMERICA_NORTH_DAKOTA_NEW_SALEM("America/North_Dakota/New_Salem"),

        AMERICA_NUUK("America/Nuuk"),

        AMERICA_OJINAGA("America/Ojinaga"),

        AMERICA_PANAMA("America/Panama"),

        AMERICA_PANGNIRTUNG("America/Pangnirtung"),

        AMERICA_PARAMARIBO("America/Paramaribo"),

        AMERICA_PHOENIX("America/Phoenix"),

        AMERICA_PORT_AU_PRINCE("America/Port-au-Prince"),

        AMERICA_PORT_OF_SPAIN("America/Port_of_Spain"),

        AMERICA_PORTO_ACRE("America/Porto_Acre"),

        AMERICA_PORTO_VELHO("America/Porto_Velho"),

        AMERICA_PUERTO_RICO("America/Puerto_Rico"),

        AMERICA_PUNTA_ARENAS("America/Punta_Arenas"),

        AMERICA_RAINY_RIVER("America/Rainy_River"),

        AMERICA_RANKIN_INLET("America/Rankin_Inlet"),

        AMERICA_RECIFE("America/Recife"),

        AMERICA_REGINA("America/Regina"),

        AMERICA_RESOLUTE("America/Resolute"),

        AMERICA_RIO_BRANCO("America/Rio_Branco"),

        AMERICA_ROSARIO("America/Rosario"),

        AMERICA_SANTA_ISABEL("America/Santa_Isabel"),

        AMERICA_SANTAREM("America/Santarem"),

        AMERICA_SANTIAGO("America/Santiago"),

        AMERICA_SANTO_DOMINGO("America/Santo_Domingo"),

        AMERICA_SAO_PAULO("America/Sao_Paulo"),

        AMERICA_SCORESBYSUND("America/Scoresbysund"),

        AMERICA_SHIPROCK("America/Shiprock"),

        AMERICA_SITKA("America/Sitka"),

        AMERICA_ST_BARTHELEMY("America/St_Barthelemy"),

        AMERICA_ST_JOHNS("America/St_Johns"),

        AMERICA_ST_KITTS("America/St_Kitts"),

        AMERICA_ST_LUCIA("America/St_Lucia"),

        AMERICA_ST_THOMAS("America/St_Thomas"),

        AMERICA_ST_VINCENT("America/St_Vincent"),

        AMERICA_SWIFT_CURRENT("America/Swift_Current"),

        AMERICA_TEGUCIGALPA("America/Tegucigalpa"),

        AMERICA_THULE("America/Thule"),

        AMERICA_THUNDER_BAY("America/Thunder_Bay"),

        AMERICA_TIJUANA("America/Tijuana"),

        AMERICA_TORONTO("America/Toronto"),

        AMERICA_TORTOLA("America/Tortola"),

        AMERICA_VANCOUVER("America/Vancouver"),

        AMERICA_VIRGIN("America/Virgin"),

        AMERICA_WHITEHORSE("America/Whitehorse"),

        AMERICA_WINNIPEG("America/Winnipeg"),

        AMERICA_YAKUTAT("America/Yakutat"),

        AMERICA_YELLOWKNIFE("America/Yellowknife"),

        ANTARCTICA_CASEY("Antarctica/Casey"),

        ANTARCTICA_DAVIS("Antarctica/Davis"),

        ANTARCTICA_DUMONT_D_URVILLE("Antarctica/DumontDUrville"),

        ANTARCTICA_MACQUARIE("Antarctica/Macquarie"),

        ANTARCTICA_MAWSON("Antarctica/Mawson"),

        ANTARCTICA_MC_MURDO("Antarctica/McMurdo"),

        ANTARCTICA_PALMER("Antarctica/Palmer"),

        ANTARCTICA_ROTHERA("Antarctica/Rothera"),

        ANTARCTICA_SOUTH_POLE("Antarctica/South_Pole"),

        ANTARCTICA_SYOWA("Antarctica/Syowa"),

        ANTARCTICA_TROLL("Antarctica/Troll"),

        ANTARCTICA_VOSTOK("Antarctica/Vostok"),

        ARCTIC_LONGYEARBYEN("Arctic/Longyearbyen"),

        ASIA_ADEN("Asia/Aden"),

        ASIA_ALMATY("Asia/Almaty"),

        ASIA_AMMAN("Asia/Amman"),

        ASIA_ANADYR("Asia/Anadyr"),

        ASIA_AQTAU("Asia/Aqtau"),

        ASIA_AQTOBE("Asia/Aqtobe"),

        ASIA_ASHGABAT("Asia/Ashgabat"),

        ASIA_ASHKHABAD("Asia/Ashkhabad"),

        ASIA_ATYRAU("Asia/Atyrau"),

        ASIA_BAGHDAD("Asia/Baghdad"),

        ASIA_BAHRAIN("Asia/Bahrain"),

        ASIA_BAKU("Asia/Baku"),

        ASIA_BANGKOK("Asia/Bangkok"),

        ASIA_BARNAUL("Asia/Barnaul"),

        ASIA_BEIRUT("Asia/Beirut"),

        ASIA_BISHKEK("Asia/Bishkek"),

        ASIA_BRUNEI("Asia/Brunei"),

        ASIA_CALCUTTA("Asia/Calcutta"),

        ASIA_CHITA("Asia/Chita"),

        ASIA_CHOIBALSAN("Asia/Choibalsan"),

        ASIA_CHONGQING("Asia/Chongqing"),

        ASIA_CHUNGKING("Asia/Chungking"),

        ASIA_COLOMBO("Asia/Colombo"),

        ASIA_DACCA("Asia/Dacca"),

        ASIA_DAMASCUS("Asia/Damascus"),

        ASIA_DHAKA("Asia/Dhaka"),

        ASIA_DILI("Asia/Dili"),

        ASIA_DUBAI("Asia/Dubai"),

        ASIA_DUSHANBE("Asia/Dushanbe"),

        ASIA_FAMAGUSTA("Asia/Famagusta"),

        ASIA_GAZA("Asia/Gaza"),

        ASIA_HARBIN("Asia/Harbin"),

        ASIA_HEBRON("Asia/Hebron"),

        ASIA_HO_CHI_MINH("Asia/Ho_Chi_Minh"),

        ASIA_HONG_KONG("Asia/Hong_Kong"),

        ASIA_HOVD("Asia/Hovd"),

        ASIA_IRKUTSK("Asia/Irkutsk"),

        ASIA_ISTANBUL("Asia/Istanbul"),

        ASIA_JAKARTA("Asia/Jakarta"),

        ASIA_JAYAPURA("Asia/Jayapura"),

        ASIA_JERUSALEM("Asia/Jerusalem"),

        ASIA_KABUL("Asia/Kabul"),

        ASIA_KAMCHATKA("Asia/Kamchatka"),

        ASIA_KARACHI("Asia/Karachi"),

        ASIA_KASHGAR("Asia/Kashgar"),

        ASIA_KATHMANDU("Asia/Kathmandu"),

        ASIA_KATMANDU("Asia/Katmandu"),

        ASIA_KHANDYGA("Asia/Khandyga"),

        ASIA_KOLKATA("Asia/Kolkata"),

        ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),

        ASIA_KUALA_LUMPUR("Asia/Kuala_Lumpur"),

        ASIA_KUCHING("Asia/Kuching"),

        ASIA_KUWAIT("Asia/Kuwait"),

        ASIA_MACAO("Asia/Macao"),

        ASIA_MACAU("Asia/Macau"),

        ASIA_MAGADAN("Asia/Magadan"),

        ASIA_MAKASSAR("Asia/Makassar"),

        ASIA_MANILA("Asia/Manila"),

        ASIA_MUSCAT("Asia/Muscat"),

        ASIA_NICOSIA("Asia/Nicosia"),

        ASIA_NOVOKUZNETSK("Asia/Novokuznetsk"),

        ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),

        ASIA_OMSK("Asia/Omsk"),

        ASIA_ORAL("Asia/Oral"),

        ASIA_PHNOM_PENH("Asia/Phnom_Penh"),

        ASIA_PONTIANAK("Asia/Pontianak"),

        ASIA_PYONGYANG("Asia/Pyongyang"),

        ASIA_QATAR("Asia/Qatar"),

        ASIA_QOSTANAY("Asia/Qostanay"),

        ASIA_QYZYLORDA("Asia/Qyzylorda"),

        ASIA_RANGOON("Asia/Rangoon"),

        ASIA_RIYADH("Asia/Riyadh"),

        ASIA_SAIGON("Asia/Saigon"),

        ASIA_SAKHALIN("Asia/Sakhalin"),

        ASIA_SAMARKAND("Asia/Samarkand"),

        ASIA_SEOUL("Asia/Seoul"),

        ASIA_SHANGHAI("Asia/Shanghai"),

        ASIA_SINGAPORE("Asia/Singapore"),

        ASIA_SREDNEKOLYMSK("Asia/Srednekolymsk"),

        ASIA_TAIPEI("Asia/Taipei"),

        ASIA_TASHKENT("Asia/Tashkent"),

        ASIA_TBILISI("Asia/Tbilisi"),

        ASIA_TEHRAN("Asia/Tehran"),

        ASIA_TEL_AVIV("Asia/Tel_Aviv"),

        ASIA_THIMBU("Asia/Thimbu"),

        ASIA_THIMPHU("Asia/Thimphu"),

        ASIA_TOKYO("Asia/Tokyo"),

        ASIA_TOMSK("Asia/Tomsk"),

        ASIA_UJUNG_PANDANG("Asia/Ujung_Pandang"),

        ASIA_ULAANBAATAR("Asia/Ulaanbaatar"),

        ASIA_ULAN_BATOR("Asia/Ulan_Bator"),

        ASIA_URUMQI("Asia/Urumqi"),

        ASIA_UST_NERA("Asia/Ust-Nera"),

        ASIA_VIENTIANE("Asia/Vientiane"),

        ASIA_VLADIVOSTOK("Asia/Vladivostok"),

        ASIA_YAKUTSK("Asia/Yakutsk"),

        ASIA_YANGON("Asia/Yangon"),

        ASIA_YEKATERINBURG("Asia/Yekaterinburg"),

        ASIA_YEREVAN("Asia/Yerevan"),

        ATLANTIC_AZORES("Atlantic/Azores"),

        ATLANTIC_BERMUDA("Atlantic/Bermuda"),

        ATLANTIC_CANARY("Atlantic/Canary"),

        ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),

        ATLANTIC_FAEROE("Atlantic/Faeroe"),

        ATLANTIC_FAROE("Atlantic/Faroe"),

        ATLANTIC_JAN_MAYEN("Atlantic/Jan_Mayen"),

        ATLANTIC_MADEIRA("Atlantic/Madeira"),

        ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),

        ATLANTIC_SOUTH_GEORGIA("Atlantic/South_Georgia"),

        ATLANTIC_ST_HELENA("Atlantic/St_Helena"),

        ATLANTIC_STANLEY("Atlantic/Stanley"),

        AUSTRALIA_ACT("Australia/ACT"),

        AUSTRALIA_ADELAIDE("Australia/Adelaide"),

        AUSTRALIA_BRISBANE("Australia/Brisbane"),

        AUSTRALIA_BROKEN_HILL("Australia/Broken_Hill"),

        AUSTRALIA_CANBERRA("Australia/Canberra"),

        AUSTRALIA_CURRIE("Australia/Currie"),

        AUSTRALIA_DARWIN("Australia/Darwin"),

        AUSTRALIA_EUCLA("Australia/Eucla"),

        AUSTRALIA_HOBART("Australia/Hobart"),

        AUSTRALIA_LHI("Australia/LHI"),

        AUSTRALIA_LINDEMAN("Australia/Lindeman"),

        AUSTRALIA_LORD_HOWE("Australia/Lord_Howe"),

        AUSTRALIA_MELBOURNE("Australia/Melbourne"),

        AUSTRALIA_NSW("Australia/NSW"),

        AUSTRALIA_NORTH("Australia/North"),

        AUSTRALIA_PERTH("Australia/Perth"),

        AUSTRALIA_QUEENSLAND("Australia/Queensland"),

        AUSTRALIA_SOUTH("Australia/South"),

        AUSTRALIA_SYDNEY("Australia/Sydney"),

        AUSTRALIA_TASMANIA("Australia/Tasmania"),

        AUSTRALIA_VICTORIA("Australia/Victoria"),

        AUSTRALIA_WEST("Australia/West"),

        AUSTRALIA_YANCOWINNA("Australia/Yancowinna"),

        BRAZIL_ACRE("Brazil/Acre"),

        BRAZIL_DE_NORONHA("Brazil/DeNoronha"),

        BRAZIL_EAST("Brazil/East"),

        BRAZIL_WEST("Brazil/West"),

        CET("CET"),

        CST6_CDT("CST6CDT"),

        CANADA_ATLANTIC("Canada/Atlantic"),

        CANADA_CENTRAL("Canada/Central"),

        CANADA_EASTERN("Canada/Eastern"),

        CANADA_MOUNTAIN("Canada/Mountain"),

        CANADA_NEWFOUNDLAND("Canada/Newfoundland"),

        CANADA_PACIFIC("Canada/Pacific"),

        CANADA_SASKATCHEWAN("Canada/Saskatchewan"),

        CANADA_YUKON("Canada/Yukon"),

        CHILE_CONTINENTAL("Chile/Continental"),

        CHILE_EASTER_ISLAND("Chile/EasterIsland"),

        CUBA("Cuba"),

        EET("EET"),

        EST5_EDT("EST5EDT"),

        EGYPT("Egypt"),

        EIRE("Eire"),

        ETC_GMT("Etc/GMT"),

        ETC_GMT_0("Etc/GMT+0"),

        ETC_GMT_1("Etc/GMT+1"),

        ETC_GMT_10("Etc/GMT+10"),

        ETC_GMT_11("Etc/GMT+11"),

        ETC_GMT_121("Etc/GMT+12"),

        ETC_GMT_2("Etc/GMT+2"),

        ETC_GMT_3("Etc/GMT+3"),

        ETC_GMT_4("Etc/GMT+4"),

        ETC_GMT_5("Etc/GMT+5"),

        ETC_GMT_6("Etc/GMT+6"),

        ETC_GMT_7("Etc/GMT+7"),

        ETC_GMT_8("Etc/GMT+8"),

        ETC_GMT_9("Etc/GMT+9"),

        ETC_GMT_02("Etc/GMT-0"),

        ETC_GMT_12("Etc/GMT-1"),

        ETC_GMT_102("Etc/GMT-10"),

        ETC_GMT_112("Etc/GMT-11"),

        ETC_GMT_122("Etc/GMT-12"),

        ETC_GMT_13("Etc/GMT-13"),

        ETC_GMT_14("Etc/GMT-14"),

        ETC_GMT_22("Etc/GMT-2"),

        ETC_GMT_32("Etc/GMT-3"),

        ETC_GMT_42("Etc/GMT-4"),

        ETC_GMT_52("Etc/GMT-5"),

        ETC_GMT_62("Etc/GMT-6"),

        ETC_GMT_72("Etc/GMT-7"),

        ETC_GMT_82("Etc/GMT-8"),

        ETC_GMT_92("Etc/GMT-9"),

        ETC_GMT0("Etc/GMT0"),

        ETC_GREENWICH("Etc/Greenwich"),

        ETC_UCT("Etc/UCT"),

        ETC_UTC("Etc/UTC"),

        ETC_UNIVERSAL("Etc/Universal"),

        ETC_ZULU("Etc/Zulu"),

        EUROPE_AMSTERDAM("Europe/Amsterdam"),

        EUROPE_ANDORRA("Europe/Andorra"),

        EUROPE_ASTRAKHAN("Europe/Astrakhan"),

        EUROPE_ATHENS("Europe/Athens"),

        EUROPE_BELFAST("Europe/Belfast"),

        EUROPE_BELGRADE("Europe/Belgrade"),

        EUROPE_BERLIN("Europe/Berlin"),

        EUROPE_BRATISLAVA("Europe/Bratislava"),

        EUROPE_BRUSSELS("Europe/Brussels"),

        EUROPE_BUCHAREST("Europe/Bucharest"),

        EUROPE_BUDAPEST("Europe/Budapest"),

        EUROPE_BUSINGEN("Europe/Busingen"),

        EUROPE_CHISINAU("Europe/Chisinau"),

        EUROPE_COPENHAGEN("Europe/Copenhagen"),

        EUROPE_DUBLIN("Europe/Dublin"),

        EUROPE_GIBRALTAR("Europe/Gibraltar"),

        EUROPE_GUERNSEY("Europe/Guernsey"),

        EUROPE_HELSINKI("Europe/Helsinki"),

        EUROPE_ISLE_OF_MAN("Europe/Isle_of_Man"),

        EUROPE_ISTANBUL("Europe/Istanbul"),

        EUROPE_JERSEY("Europe/Jersey"),

        EUROPE_KALININGRAD("Europe/Kaliningrad"),

        EUROPE_KIEV("Europe/Kiev"),

        EUROPE_KIROV("Europe/Kirov"),

        EUROPE_KYIV("Europe/Kyiv"),

        EUROPE_LISBON("Europe/Lisbon"),

        EUROPE_LJUBLJANA("Europe/Ljubljana"),

        EUROPE_LONDON("Europe/London"),

        EUROPE_LUXEMBOURG("Europe/Luxembourg"),

        EUROPE_MADRID("Europe/Madrid"),

        EUROPE_MALTA("Europe/Malta"),

        EUROPE_MARIEHAMN("Europe/Mariehamn"),

        EUROPE_MINSK("Europe/Minsk"),

        EUROPE_MONACO("Europe/Monaco"),

        EUROPE_MOSCOW("Europe/Moscow"),

        EUROPE_NICOSIA("Europe/Nicosia"),

        EUROPE_OSLO("Europe/Oslo"),

        EUROPE_PARIS("Europe/Paris"),

        EUROPE_PODGORICA("Europe/Podgorica"),

        EUROPE_PRAGUE("Europe/Prague"),

        EUROPE_RIGA("Europe/Riga"),

        EUROPE_ROME("Europe/Rome"),

        EUROPE_SAMARA("Europe/Samara"),

        EUROPE_SAN_MARINO("Europe/San_Marino"),

        EUROPE_SARAJEVO("Europe/Sarajevo"),

        EUROPE_SARATOV("Europe/Saratov"),

        EUROPE_SIMFEROPOL("Europe/Simferopol"),

        EUROPE_SKOPJE("Europe/Skopje"),

        EUROPE_SOFIA("Europe/Sofia"),

        EUROPE_STOCKHOLM("Europe/Stockholm"),

        EUROPE_TALLINN("Europe/Tallinn"),

        EUROPE_TIRANE("Europe/Tirane"),

        EUROPE_TIRASPOL("Europe/Tiraspol"),

        EUROPE_ULYANOVSK("Europe/Ulyanovsk"),

        EUROPE_UZHGOROD("Europe/Uzhgorod"),

        EUROPE_VADUZ("Europe/Vaduz"),

        EUROPE_VATICAN("Europe/Vatican"),

        EUROPE_VIENNA("Europe/Vienna"),

        EUROPE_VILNIUS("Europe/Vilnius"),

        EUROPE_VOLGOGRAD("Europe/Volgograd"),

        EUROPE_WARSAW("Europe/Warsaw"),

        EUROPE_ZAGREB("Europe/Zagreb"),

        EUROPE_ZAPOROZHYE("Europe/Zaporozhye"),

        EUROPE_ZURICH("Europe/Zurich"),

        GB("GB"),

        GB_EIRE("GB-Eire"),

        GMT("GMT"),

        GMT0("GMT0"),

        GREENWICH("Greenwich"),

        HONGKONG("Hongkong"),

        ICELAND("Iceland"),

        INDIAN_ANTANANARIVO("Indian/Antananarivo"),

        INDIAN_CHAGOS("Indian/Chagos"),

        INDIAN_CHRISTMAS("Indian/Christmas"),

        INDIAN_COCOS("Indian/Cocos"),

        INDIAN_COMORO("Indian/Comoro"),

        INDIAN_KERGUELEN("Indian/Kerguelen"),

        INDIAN_MAHE("Indian/Mahe"),

        INDIAN_MALDIVES("Indian/Maldives"),

        INDIAN_MAURITIUS("Indian/Mauritius"),

        INDIAN_MAYOTTE("Indian/Mayotte"),

        INDIAN_REUNION("Indian/Reunion"),

        IRAN("Iran"),

        ISRAEL("Israel"),

        JAMAICA("Jamaica"),

        JAPAN("Japan"),

        KWAJALEIN("Kwajalein"),

        LIBYA("Libya"),

        MET("MET"),

        MST7_MDT("MST7MDT"),

        MEXICO_BAJA_NORTE("Mexico/BajaNorte"),

        MEXICO_BAJA_SUR("Mexico/BajaSur"),

        MEXICO_GENERAL("Mexico/General"),

        NZ("NZ"),

        NZ_CHAT("NZ-CHAT"),

        NAVAJO("Navajo"),

        PRC("PRC"),

        PST8_PDT("PST8PDT"),

        PACIFIC_APIA("Pacific/Apia"),

        PACIFIC_AUCKLAND("Pacific/Auckland"),

        PACIFIC_BOUGAINVILLE("Pacific/Bougainville"),

        PACIFIC_CHATHAM("Pacific/Chatham"),

        PACIFIC_CHUUK("Pacific/Chuuk"),

        PACIFIC_EASTER("Pacific/Easter"),

        PACIFIC_EFATE("Pacific/Efate"),

        PACIFIC_ENDERBURY("Pacific/Enderbury"),

        PACIFIC_FAKAOFO("Pacific/Fakaofo"),

        PACIFIC_FIJI("Pacific/Fiji"),

        PACIFIC_FUNAFUTI("Pacific/Funafuti"),

        PACIFIC_GALAPAGOS("Pacific/Galapagos"),

        PACIFIC_GAMBIER("Pacific/Gambier"),

        PACIFIC_GUADALCANAL("Pacific/Guadalcanal"),

        PACIFIC_GUAM("Pacific/Guam"),

        PACIFIC_HONOLULU("Pacific/Honolulu"),

        PACIFIC_JOHNSTON("Pacific/Johnston"),

        PACIFIC_KANTON("Pacific/Kanton"),

        PACIFIC_KIRITIMATI("Pacific/Kiritimati"),

        PACIFIC_KOSRAE("Pacific/Kosrae"),

        PACIFIC_KWAJALEIN("Pacific/Kwajalein"),

        PACIFIC_MAJURO("Pacific/Majuro"),

        PACIFIC_MARQUESAS("Pacific/Marquesas"),

        PACIFIC_MIDWAY("Pacific/Midway"),

        PACIFIC_NAURU("Pacific/Nauru"),

        PACIFIC_NIUE("Pacific/Niue"),

        PACIFIC_NORFOLK("Pacific/Norfolk"),

        PACIFIC_NOUMEA("Pacific/Noumea"),

        PACIFIC_PAGO_PAGO("Pacific/Pago_Pago"),

        PACIFIC_PALAU("Pacific/Palau"),

        PACIFIC_PITCAIRN("Pacific/Pitcairn"),

        PACIFIC_POHNPEI("Pacific/Pohnpei"),

        PACIFIC_PONAPE("Pacific/Ponape"),

        PACIFIC_PORT_MORESBY("Pacific/Port_Moresby"),

        PACIFIC_RAROTONGA("Pacific/Rarotonga"),

        PACIFIC_SAIPAN("Pacific/Saipan"),

        PACIFIC_SAMOA("Pacific/Samoa"),

        PACIFIC_TAHITI("Pacific/Tahiti"),

        PACIFIC_TARAWA("Pacific/Tarawa"),

        PACIFIC_TONGATAPU("Pacific/Tongatapu"),

        PACIFIC_TRUK("Pacific/Truk"),

        PACIFIC_WAKE("Pacific/Wake"),

        PACIFIC_WALLIS("Pacific/Wallis"),

        PACIFIC_YAP("Pacific/Yap"),

        POLAND("Poland"),

        PORTUGAL("Portugal"),

        ROK("ROK"),

        SINGAPORE("Singapore"),

        SYSTEM_V_AST4("SystemV/AST4"),

        SYSTEM_V_AST4_ADT("SystemV/AST4ADT"),

        SYSTEM_V_CST6("SystemV/CST6"),

        SYSTEM_V_CST6_CDT("SystemV/CST6CDT"),

        SYSTEM_V_EST5("SystemV/EST5"),

        SYSTEM_V_EST5_EDT("SystemV/EST5EDT"),

        SYSTEM_V_HST10("SystemV/HST10"),

        SYSTEM_V_MST7("SystemV/MST7"),

        SYSTEM_V_MST7_MDT("SystemV/MST7MDT"),

        SYSTEM_V_PST8("SystemV/PST8"),

        SYSTEM_V_PST8_PDT("SystemV/PST8PDT"),

        SYSTEM_V_YST9("SystemV/YST9"),

        SYSTEM_V_YST9_YDT("SystemV/YST9YDT"),

        TURKEY("Turkey"),

        UCT("UCT"),

        US_ALASKA("US/Alaska"),

        US_ALEUTIAN("US/Aleutian"),

        US_ARIZONA("US/Arizona"),

        US_CENTRAL("US/Central"),

        US_EAST_INDIANA("US/East-Indiana"),

        US_EASTERN("US/Eastern"),

        US_HAWAII("US/Hawaii"),

        US_INDIANA_STARKE("US/Indiana-Starke"),

        US_MICHIGAN("US/Michigan"),

        US_MOUNTAIN("US/Mountain"),

        US_PACIFIC("US/Pacific"),

        US_SAMOA("US/Samoa"),

        UTC("UTC"),

        UNIVERSAL("Universal"),

        W_SU("W-SU"),

        WET("WET"),

        ZULU("Zulu"),

        EST("EST"),

        HST("HST"),

        MST("MST"),

        ACT("ACT"),

        AET("AET"),

        AGT("AGT"),

        ART("ART"),

        AST("AST"),

        BET("BET"),

        BST("BST"),

        CAT("CAT"),

        CNT("CNT"),

        CST("CST"),

        CTT("CTT"),

        EAT("EAT"),

        ECT("ECT"),

        IET("IET"),

        IST("IST"),

        JST("JST"),

        MIT("MIT"),

        NET("NET"),

        NST("NST"),

        PLT("PLT"),

        PNT("PNT"),

        PRT("PRT"),

        PST("PST"),

        SST("SST"),

        VST("VST");

        private String value;

        TimeZoneEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TimeZoneEnum fromValue(String value) {
            for (TimeZoneEnum b : TimeZoneEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TimeZoneEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TimeZoneEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TimeZoneEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TimeZoneEnum.fromValue(value);
            }
        }

        public static void validateJsonElement(JsonElement jsonElement) throws IOException {
            String value = jsonElement.getAsString();
            TimeZoneEnum.fromValue(value);
        }
    }

    public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";

    @SerializedName(SERIALIZED_NAME_TIME_ZONE)
    @javax.annotation.Nonnull
    private TimeZoneEnum timeZone = TimeZoneEnum.AMERICA_LOS_ANGELES;

    public static final String SERIALIZED_NAME_FREQUENCY = "frequency";

    @SerializedName(SERIALIZED_NAME_FREQUENCY)
    @javax.annotation.Nullable
    private FrequencyInput frequency;

    public static final String SERIALIZED_NAME_RECIPIENT_DETAILS = "recipient_details";

    @SerializedName(SERIALIZED_NAME_RECIPIENT_DETAILS)
    @javax.annotation.Nonnull
    private RecipientDetailsInput recipientDetails;

    public CreateScheduleRequest() {}

    public CreateScheduleRequest name(@javax.annotation.Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the scheduled job.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    public CreateScheduleRequest description(@javax.annotation.Nonnull String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the job.
     *
     * @return description
     */
    @javax.annotation.Nonnull
    public String getDescription() {
        return description;
    }

    public void setDescription(@javax.annotation.Nonnull String description) {
        this.description = description;
    }

    public CreateScheduleRequest metadataType(
            @javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
        return this;
    }

    /**
     * Type of the metadata object.
     *
     * @return metadataType
     */
    @javax.annotation.Nonnull
    public MetadataTypeEnum getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(@javax.annotation.Nonnull MetadataTypeEnum metadataType) {
        this.metadataType = metadataType;
    }

    public CreateScheduleRequest metadataIdentifier(
            @javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
        return this;
    }

    /**
     * Unique ID or name of the metadata object.
     *
     * @return metadataIdentifier
     */
    @javax.annotation.Nonnull
    public String getMetadataIdentifier() {
        return metadataIdentifier;
    }

    public void setMetadataIdentifier(@javax.annotation.Nonnull String metadataIdentifier) {
        this.metadataIdentifier = metadataIdentifier;
    }

    public CreateScheduleRequest fileFormat(@javax.annotation.Nullable FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Export file format.
     *
     * @return fileFormat
     */
    @javax.annotation.Nullable
    public FileFormatEnum getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(@javax.annotation.Nullable FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
    }

    public CreateScheduleRequest liveboardOptions(
            @javax.annotation.Nullable LiveboardOptionsInput liveboardOptions) {
        this.liveboardOptions = liveboardOptions;
        return this;
    }

    /**
     * Options to specify details of Liveboard.
     *
     * @return liveboardOptions
     */
    @javax.annotation.Nullable
    public LiveboardOptionsInput getLiveboardOptions() {
        return liveboardOptions;
    }

    public void setLiveboardOptions(
            @javax.annotation.Nullable LiveboardOptionsInput liveboardOptions) {
        this.liveboardOptions = liveboardOptions;
    }

    public CreateScheduleRequest pdfOptions(
            @javax.annotation.Nullable SchedulesPdfOptionsInput pdfOptions) {
        this.pdfOptions = pdfOptions;
        return this;
    }

    /**
     * PDF layout and orientation settings. Applicable only if the &#x60;file_format&#x60; is
     * specified as &#x60;PDF&#x60;.
     *
     * @return pdfOptions
     */
    @javax.annotation.Nullable
    public SchedulesPdfOptionsInput getPdfOptions() {
        return pdfOptions;
    }

    public void setPdfOptions(@javax.annotation.Nullable SchedulesPdfOptionsInput pdfOptions) {
        this.pdfOptions = pdfOptions;
    }

    public CreateScheduleRequest timeZone(@javax.annotation.Nonnull TimeZoneEnum timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Time zone
     *
     * @return timeZone
     */
    @javax.annotation.Nonnull
    public TimeZoneEnum getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(@javax.annotation.Nonnull TimeZoneEnum timeZone) {
        this.timeZone = timeZone;
    }

    public CreateScheduleRequest frequency(@javax.annotation.Nullable FrequencyInput frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Frequency settings for the scheduled job.
     *
     * @return frequency
     */
    @javax.annotation.Nullable
    public FrequencyInput getFrequency() {
        return frequency;
    }

    public void setFrequency(@javax.annotation.Nullable FrequencyInput frequency) {
        this.frequency = frequency;
    }

    public CreateScheduleRequest recipientDetails(
            @javax.annotation.Nonnull RecipientDetailsInput recipientDetails) {
        this.recipientDetails = recipientDetails;
        return this;
    }

    /**
     * Recipients of the scheduled job notifications. Add the GUID or name of the ThoughtSpot users
     * or groups as recipients in the &#x60;principals&#x60; array. If a recipient is not a
     * ThoughtSpot user, specify email address.
     *
     * @return recipientDetails
     */
    @javax.annotation.Nonnull
    public RecipientDetailsInput getRecipientDetails() {
        return recipientDetails;
    }

    public void setRecipientDetails(
            @javax.annotation.Nonnull RecipientDetailsInput recipientDetails) {
        this.recipientDetails = recipientDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateScheduleRequest createScheduleRequest = (CreateScheduleRequest) o;
        return Objects.equals(this.name, createScheduleRequest.name)
                && Objects.equals(this.description, createScheduleRequest.description)
                && Objects.equals(this.metadataType, createScheduleRequest.metadataType)
                && Objects.equals(this.metadataIdentifier, createScheduleRequest.metadataIdentifier)
                && Objects.equals(this.fileFormat, createScheduleRequest.fileFormat)
                && Objects.equals(this.liveboardOptions, createScheduleRequest.liveboardOptions)
                && Objects.equals(this.pdfOptions, createScheduleRequest.pdfOptions)
                && Objects.equals(this.timeZone, createScheduleRequest.timeZone)
                && Objects.equals(this.frequency, createScheduleRequest.frequency)
                && Objects.equals(this.recipientDetails, createScheduleRequest.recipientDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                metadataType,
                metadataIdentifier,
                fileFormat,
                liveboardOptions,
                pdfOptions,
                timeZone,
                frequency,
                recipientDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScheduleRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
        sb.append("    metadataIdentifier: ")
                .append(toIndentedString(metadataIdentifier))
                .append("\n");
        sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
        sb.append("    liveboardOptions: ").append(toIndentedString(liveboardOptions)).append("\n");
        sb.append("    pdfOptions: ").append(toIndentedString(pdfOptions)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    recipientDetails: ").append(toIndentedString(recipientDetails)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("description");
        openapiFields.add("metadata_type");
        openapiFields.add("metadata_identifier");
        openapiFields.add("file_format");
        openapiFields.add("liveboard_options");
        openapiFields.add("pdf_options");
        openapiFields.add("time_zone");
        openapiFields.add("frequency");
        openapiFields.add("recipient_details");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("description");
        openapiRequiredFields.add("metadata_type");
        openapiRequiredFields.add("metadata_identifier");
        openapiRequiredFields.add("time_zone");
        openapiRequiredFields.add("recipient_details");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateScheduleRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateScheduleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateScheduleRequest is not found in"
                                        + " the empty JSON string",
                                CreateScheduleRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateScheduleRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateScheduleRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateScheduleRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if (!jsonObj.get("metadata_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_type` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("metadata_type").toString()));
        }
        // validate the required field `metadata_type`
        MetadataTypeEnum.validateJsonElement(jsonObj.get("metadata_type"));
        if (!jsonObj.get("metadata_identifier").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `metadata_identifier` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("metadata_identifier").toString()));
        }
        if ((jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull())
                && !jsonObj.get("file_format").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `file_format` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("file_format").toString()));
        }
        // validate the optional field `file_format`
        if (jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull()) {
            FileFormatEnum.validateJsonElement(jsonObj.get("file_format"));
        }
        // validate the optional field `liveboard_options`
        if (jsonObj.get("liveboard_options") != null
                && !jsonObj.get("liveboard_options").isJsonNull()) {
            LiveboardOptionsInput.validateJsonElement(jsonObj.get("liveboard_options"));
        }
        // validate the optional field `pdf_options`
        if (jsonObj.get("pdf_options") != null && !jsonObj.get("pdf_options").isJsonNull()) {
            SchedulesPdfOptionsInput.validateJsonElement(jsonObj.get("pdf_options"));
        }
        if (!jsonObj.get("time_zone").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `time_zone` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("time_zone").toString()));
        }
        // validate the required field `time_zone`
        TimeZoneEnum.validateJsonElement(jsonObj.get("time_zone"));
        // validate the optional field `frequency`
        if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
            FrequencyInput.validateJsonElement(jsonObj.get("frequency"));
        }
        // validate the required field `recipient_details`
        RecipientDetailsInput.validateJsonElement(jsonObj.get("recipient_details"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateScheduleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateScheduleRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateScheduleRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateScheduleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateScheduleRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateScheduleRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateScheduleRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateScheduleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateScheduleRequest
     * @throws IOException if the JSON string is invalid with respect to CreateScheduleRequest
     */
    public static CreateScheduleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateScheduleRequest.class);
    }

    /**
     * Convert an instance of CreateScheduleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
