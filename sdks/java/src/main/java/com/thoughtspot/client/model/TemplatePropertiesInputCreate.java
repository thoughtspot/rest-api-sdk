/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thoughtspot.client.JSON;

/**
 * Email customization configuration properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class TemplatePropertiesInputCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CTA_BUTTON_BG_COLOR = "cta_button_bg_color";
  @SerializedName(SERIALIZED_NAME_CTA_BUTTON_BG_COLOR)
  @javax.annotation.Nullable
  private String ctaButtonBgColor;

  public static final String SERIALIZED_NAME_CTA_TEXT_FONT_COLOR = "cta_text_font_color";
  @SerializedName(SERIALIZED_NAME_CTA_TEXT_FONT_COLOR)
  @javax.annotation.Nullable
  private String ctaTextFontColor;

  public static final String SERIALIZED_NAME_PRIMARY_BG_COLOR = "primary_bg_color";
  @SerializedName(SERIALIZED_NAME_PRIMARY_BG_COLOR)
  @javax.annotation.Nullable
  private String primaryBgColor;

  public static final String SERIALIZED_NAME_HOME_URL = "home_url";
  @SerializedName(SERIALIZED_NAME_HOME_URL)
  @javax.annotation.Nullable
  private String homeUrl;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  @javax.annotation.Nullable
  private String logoUrl;

  public static final String SERIALIZED_NAME_FONT_FAMILY = "font_family";
  @SerializedName(SERIALIZED_NAME_FONT_FAMILY)
  @javax.annotation.Nullable
  private String fontFamily;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  @javax.annotation.Nullable
  private String productName;

  public static final String SERIALIZED_NAME_FOOTER_ADDRESS = "footer_address";
  @SerializedName(SERIALIZED_NAME_FOOTER_ADDRESS)
  @javax.annotation.Nullable
  private String footerAddress;

  public static final String SERIALIZED_NAME_FOOTER_PHONE = "footer_phone";
  @SerializedName(SERIALIZED_NAME_FOOTER_PHONE)
  @javax.annotation.Nullable
  private String footerPhone;

  public static final String SERIALIZED_NAME_REPLACEMENT_VALUE_FOR_LIVEBOARD = "replacement_value_for_liveboard";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_VALUE_FOR_LIVEBOARD)
  @javax.annotation.Nullable
  private String replacementValueForLiveboard;

  public static final String SERIALIZED_NAME_REPLACEMENT_VALUE_FOR_ANSWER = "replacement_value_for_answer";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_VALUE_FOR_ANSWER)
  @javax.annotation.Nullable
  private String replacementValueForAnswer;

  public static final String SERIALIZED_NAME_REPLACEMENT_VALUE_FOR_SPOT_IQ = "replacement_value_for_spot_iq";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_VALUE_FOR_SPOT_IQ)
  @javax.annotation.Nullable
  private String replacementValueForSpotIq;

  public static final String SERIALIZED_NAME_HIDE_FOOTER_ADDRESS = "hide_footer_address";
  @SerializedName(SERIALIZED_NAME_HIDE_FOOTER_ADDRESS)
  @javax.annotation.Nullable
  private Boolean hideFooterAddress;

  public static final String SERIALIZED_NAME_HIDE_FOOTER_PHONE = "hide_footer_phone";
  @SerializedName(SERIALIZED_NAME_HIDE_FOOTER_PHONE)
  @javax.annotation.Nullable
  private Boolean hideFooterPhone;

  public static final String SERIALIZED_NAME_HIDE_MANAGE_NOTIFICATION = "hide_manage_notification";
  @SerializedName(SERIALIZED_NAME_HIDE_MANAGE_NOTIFICATION)
  @javax.annotation.Nullable
  private Boolean hideManageNotification;

  public static final String SERIALIZED_NAME_HIDE_MOBILE_APP_NUDGE = "hide_mobile_app_nudge";
  @SerializedName(SERIALIZED_NAME_HIDE_MOBILE_APP_NUDGE)
  @javax.annotation.Nullable
  private Boolean hideMobileAppNudge;

  public static final String SERIALIZED_NAME_HIDE_PRIVACY_POLICY = "hide_privacy_policy";
  @SerializedName(SERIALIZED_NAME_HIDE_PRIVACY_POLICY)
  @javax.annotation.Nullable
  private Boolean hidePrivacyPolicy;

  public static final String SERIALIZED_NAME_HIDE_PRODUCT_NAME = "hide_product_name";
  @SerializedName(SERIALIZED_NAME_HIDE_PRODUCT_NAME)
  @javax.annotation.Nullable
  private Boolean hideProductName;

  public static final String SERIALIZED_NAME_HIDE_TS_VOCABULARY_DEFINITIONS = "hide_ts_vocabulary_definitions";
  @SerializedName(SERIALIZED_NAME_HIDE_TS_VOCABULARY_DEFINITIONS)
  @javax.annotation.Nullable
  private Boolean hideTsVocabularyDefinitions;

  public static final String SERIALIZED_NAME_HIDE_NOTIFICATION_STATUS = "hide_notification_status";
  @SerializedName(SERIALIZED_NAME_HIDE_NOTIFICATION_STATUS)
  @javax.annotation.Nullable
  private Boolean hideNotificationStatus;

  public static final String SERIALIZED_NAME_HIDE_ERROR_MESSAGE = "hide_error_message";
  @SerializedName(SERIALIZED_NAME_HIDE_ERROR_MESSAGE)
  @javax.annotation.Nullable
  private Boolean hideErrorMessage;

  public static final String SERIALIZED_NAME_HIDE_UNSUBSCRIBE_LINK = "hide_unsubscribe_link";
  @SerializedName(SERIALIZED_NAME_HIDE_UNSUBSCRIBE_LINK)
  @javax.annotation.Nullable
  private Boolean hideUnsubscribeLink;

  public static final String SERIALIZED_NAME_HIDE_MODIFY_ALERT = "hide_modify_alert";
  @SerializedName(SERIALIZED_NAME_HIDE_MODIFY_ALERT)
  @javax.annotation.Nullable
  private Boolean hideModifyAlert;

  public static final String SERIALIZED_NAME_COMPANY_PRIVACY_POLICY_URL = "company_privacy_policy_url";
  @SerializedName(SERIALIZED_NAME_COMPANY_PRIVACY_POLICY_URL)
  @javax.annotation.Nullable
  private String companyPrivacyPolicyUrl;

  public static final String SERIALIZED_NAME_COMPANY_WEBSITE_URL = "company_website_url";
  @SerializedName(SERIALIZED_NAME_COMPANY_WEBSITE_URL)
  @javax.annotation.Nullable
  private String companyWebsiteUrl;

  public TemplatePropertiesInputCreate() {
  }

  public TemplatePropertiesInputCreate ctaButtonBgColor(@javax.annotation.Nullable String ctaButtonBgColor) {
    this.ctaButtonBgColor = ctaButtonBgColor;
    return this;
  }

  /**
   * Background color for call-to-action button in hex format
   * @return ctaButtonBgColor
   */
  @javax.annotation.Nullable
  public String getCtaButtonBgColor() {
    return ctaButtonBgColor;
  }

  public void setCtaButtonBgColor(@javax.annotation.Nullable String ctaButtonBgColor) {
    this.ctaButtonBgColor = ctaButtonBgColor;
  }


  public TemplatePropertiesInputCreate ctaTextFontColor(@javax.annotation.Nullable String ctaTextFontColor) {
    this.ctaTextFontColor = ctaTextFontColor;
    return this;
  }

  /**
   * Text color for call-to-action button in hex format
   * @return ctaTextFontColor
   */
  @javax.annotation.Nullable
  public String getCtaTextFontColor() {
    return ctaTextFontColor;
  }

  public void setCtaTextFontColor(@javax.annotation.Nullable String ctaTextFontColor) {
    this.ctaTextFontColor = ctaTextFontColor;
  }


  public TemplatePropertiesInputCreate primaryBgColor(@javax.annotation.Nullable String primaryBgColor) {
    this.primaryBgColor = primaryBgColor;
    return this;
  }

  /**
   * Primary background color in hex format
   * @return primaryBgColor
   */
  @javax.annotation.Nullable
  public String getPrimaryBgColor() {
    return primaryBgColor;
  }

  public void setPrimaryBgColor(@javax.annotation.Nullable String primaryBgColor) {
    this.primaryBgColor = primaryBgColor;
  }


  public TemplatePropertiesInputCreate homeUrl(@javax.annotation.Nullable String homeUrl) {
    this.homeUrl = homeUrl;
    return this;
  }

  /**
   * Home page URL (HTTP/HTTPS only)
   * @return homeUrl
   */
  @javax.annotation.Nullable
  public String getHomeUrl() {
    return homeUrl;
  }

  public void setHomeUrl(@javax.annotation.Nullable String homeUrl) {
    this.homeUrl = homeUrl;
  }


  public TemplatePropertiesInputCreate logoUrl(@javax.annotation.Nullable String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * Logo image URL (HTTP/HTTPS only)
   * @return logoUrl
   */
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(@javax.annotation.Nullable String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public TemplatePropertiesInputCreate fontFamily(@javax.annotation.Nullable String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

  /**
   * Font family for email content (e.g., Arial, sans-serif)
   * @return fontFamily
   */
  @javax.annotation.Nullable
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(@javax.annotation.Nullable String fontFamily) {
    this.fontFamily = fontFamily;
  }


  public TemplatePropertiesInputCreate productName(@javax.annotation.Nullable String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Product name to display
   * @return productName
   */
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(@javax.annotation.Nullable String productName) {
    this.productName = productName;
  }


  public TemplatePropertiesInputCreate footerAddress(@javax.annotation.Nullable String footerAddress) {
    this.footerAddress = footerAddress;
    return this;
  }

  /**
   * Footer address text
   * @return footerAddress
   */
  @javax.annotation.Nullable
  public String getFooterAddress() {
    return footerAddress;
  }

  public void setFooterAddress(@javax.annotation.Nullable String footerAddress) {
    this.footerAddress = footerAddress;
  }


  public TemplatePropertiesInputCreate footerPhone(@javax.annotation.Nullable String footerPhone) {
    this.footerPhone = footerPhone;
    return this;
  }

  /**
   * Footer phone number
   * @return footerPhone
   */
  @javax.annotation.Nullable
  public String getFooterPhone() {
    return footerPhone;
  }

  public void setFooterPhone(@javax.annotation.Nullable String footerPhone) {
    this.footerPhone = footerPhone;
  }


  public TemplatePropertiesInputCreate replacementValueForLiveboard(@javax.annotation.Nullable String replacementValueForLiveboard) {
    this.replacementValueForLiveboard = replacementValueForLiveboard;
    return this;
  }

  /**
   * Replacement value for Liveboard
   * @return replacementValueForLiveboard
   */
  @javax.annotation.Nullable
  public String getReplacementValueForLiveboard() {
    return replacementValueForLiveboard;
  }

  public void setReplacementValueForLiveboard(@javax.annotation.Nullable String replacementValueForLiveboard) {
    this.replacementValueForLiveboard = replacementValueForLiveboard;
  }


  public TemplatePropertiesInputCreate replacementValueForAnswer(@javax.annotation.Nullable String replacementValueForAnswer) {
    this.replacementValueForAnswer = replacementValueForAnswer;
    return this;
  }

  /**
   * Replacement value for Answer
   * @return replacementValueForAnswer
   */
  @javax.annotation.Nullable
  public String getReplacementValueForAnswer() {
    return replacementValueForAnswer;
  }

  public void setReplacementValueForAnswer(@javax.annotation.Nullable String replacementValueForAnswer) {
    this.replacementValueForAnswer = replacementValueForAnswer;
  }


  public TemplatePropertiesInputCreate replacementValueForSpotIq(@javax.annotation.Nullable String replacementValueForSpotIq) {
    this.replacementValueForSpotIq = replacementValueForSpotIq;
    return this;
  }

  /**
   * Replacement value for SpotIQ
   * @return replacementValueForSpotIq
   */
  @javax.annotation.Nullable
  public String getReplacementValueForSpotIq() {
    return replacementValueForSpotIq;
  }

  public void setReplacementValueForSpotIq(@javax.annotation.Nullable String replacementValueForSpotIq) {
    this.replacementValueForSpotIq = replacementValueForSpotIq;
  }


  public TemplatePropertiesInputCreate hideFooterAddress(@javax.annotation.Nullable Boolean hideFooterAddress) {
    this.hideFooterAddress = hideFooterAddress;
    return this;
  }

  /**
   * Whether to hide footer address
   * @return hideFooterAddress
   */
  @javax.annotation.Nullable
  public Boolean getHideFooterAddress() {
    return hideFooterAddress;
  }

  public void setHideFooterAddress(@javax.annotation.Nullable Boolean hideFooterAddress) {
    this.hideFooterAddress = hideFooterAddress;
  }


  public TemplatePropertiesInputCreate hideFooterPhone(@javax.annotation.Nullable Boolean hideFooterPhone) {
    this.hideFooterPhone = hideFooterPhone;
    return this;
  }

  /**
   * Whether to hide footer phone number
   * @return hideFooterPhone
   */
  @javax.annotation.Nullable
  public Boolean getHideFooterPhone() {
    return hideFooterPhone;
  }

  public void setHideFooterPhone(@javax.annotation.Nullable Boolean hideFooterPhone) {
    this.hideFooterPhone = hideFooterPhone;
  }


  public TemplatePropertiesInputCreate hideManageNotification(@javax.annotation.Nullable Boolean hideManageNotification) {
    this.hideManageNotification = hideManageNotification;
    return this;
  }

  /**
   * Whether to hide manage notification link
   * @return hideManageNotification
   */
  @javax.annotation.Nullable
  public Boolean getHideManageNotification() {
    return hideManageNotification;
  }

  public void setHideManageNotification(@javax.annotation.Nullable Boolean hideManageNotification) {
    this.hideManageNotification = hideManageNotification;
  }


  public TemplatePropertiesInputCreate hideMobileAppNudge(@javax.annotation.Nullable Boolean hideMobileAppNudge) {
    this.hideMobileAppNudge = hideMobileAppNudge;
    return this;
  }

  /**
   * Whether to hide mobile app nudge
   * @return hideMobileAppNudge
   */
  @javax.annotation.Nullable
  public Boolean getHideMobileAppNudge() {
    return hideMobileAppNudge;
  }

  public void setHideMobileAppNudge(@javax.annotation.Nullable Boolean hideMobileAppNudge) {
    this.hideMobileAppNudge = hideMobileAppNudge;
  }


  public TemplatePropertiesInputCreate hidePrivacyPolicy(@javax.annotation.Nullable Boolean hidePrivacyPolicy) {
    this.hidePrivacyPolicy = hidePrivacyPolicy;
    return this;
  }

  /**
   * Whether to hide privacy policy link
   * @return hidePrivacyPolicy
   */
  @javax.annotation.Nullable
  public Boolean getHidePrivacyPolicy() {
    return hidePrivacyPolicy;
  }

  public void setHidePrivacyPolicy(@javax.annotation.Nullable Boolean hidePrivacyPolicy) {
    this.hidePrivacyPolicy = hidePrivacyPolicy;
  }


  public TemplatePropertiesInputCreate hideProductName(@javax.annotation.Nullable Boolean hideProductName) {
    this.hideProductName = hideProductName;
    return this;
  }

  /**
   * Whether to hide product name
   * @return hideProductName
   */
  @javax.annotation.Nullable
  public Boolean getHideProductName() {
    return hideProductName;
  }

  public void setHideProductName(@javax.annotation.Nullable Boolean hideProductName) {
    this.hideProductName = hideProductName;
  }


  public TemplatePropertiesInputCreate hideTsVocabularyDefinitions(@javax.annotation.Nullable Boolean hideTsVocabularyDefinitions) {
    this.hideTsVocabularyDefinitions = hideTsVocabularyDefinitions;
    return this;
  }

  /**
   * Whether to hide ThoughtSpot vocabulary definitions
   * @return hideTsVocabularyDefinitions
   */
  @javax.annotation.Nullable
  public Boolean getHideTsVocabularyDefinitions() {
    return hideTsVocabularyDefinitions;
  }

  public void setHideTsVocabularyDefinitions(@javax.annotation.Nullable Boolean hideTsVocabularyDefinitions) {
    this.hideTsVocabularyDefinitions = hideTsVocabularyDefinitions;
  }


  public TemplatePropertiesInputCreate hideNotificationStatus(@javax.annotation.Nullable Boolean hideNotificationStatus) {
    this.hideNotificationStatus = hideNotificationStatus;
    return this;
  }

  /**
   * Whether to hide notification status
   * @return hideNotificationStatus
   */
  @javax.annotation.Nullable
  public Boolean getHideNotificationStatus() {
    return hideNotificationStatus;
  }

  public void setHideNotificationStatus(@javax.annotation.Nullable Boolean hideNotificationStatus) {
    this.hideNotificationStatus = hideNotificationStatus;
  }


  public TemplatePropertiesInputCreate hideErrorMessage(@javax.annotation.Nullable Boolean hideErrorMessage) {
    this.hideErrorMessage = hideErrorMessage;
    return this;
  }

  /**
   * Whether to hide error message
   * @return hideErrorMessage
   */
  @javax.annotation.Nullable
  public Boolean getHideErrorMessage() {
    return hideErrorMessage;
  }

  public void setHideErrorMessage(@javax.annotation.Nullable Boolean hideErrorMessage) {
    this.hideErrorMessage = hideErrorMessage;
  }


  public TemplatePropertiesInputCreate hideUnsubscribeLink(@javax.annotation.Nullable Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
    return this;
  }

  /**
   * Whether to hide unsubscribe link
   * @return hideUnsubscribeLink
   */
  @javax.annotation.Nullable
  public Boolean getHideUnsubscribeLink() {
    return hideUnsubscribeLink;
  }

  public void setHideUnsubscribeLink(@javax.annotation.Nullable Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
  }


  public TemplatePropertiesInputCreate hideModifyAlert(@javax.annotation.Nullable Boolean hideModifyAlert) {
    this.hideModifyAlert = hideModifyAlert;
    return this;
  }

  /**
   * Whether to hide modify alert
   * @return hideModifyAlert
   */
  @javax.annotation.Nullable
  public Boolean getHideModifyAlert() {
    return hideModifyAlert;
  }

  public void setHideModifyAlert(@javax.annotation.Nullable Boolean hideModifyAlert) {
    this.hideModifyAlert = hideModifyAlert;
  }


  public TemplatePropertiesInputCreate companyPrivacyPolicyUrl(@javax.annotation.Nullable String companyPrivacyPolicyUrl) {
    this.companyPrivacyPolicyUrl = companyPrivacyPolicyUrl;
    return this;
  }

  /**
   * Company privacy policy URL (HTTP/HTTPS only)
   * @return companyPrivacyPolicyUrl
   */
  @javax.annotation.Nullable
  public String getCompanyPrivacyPolicyUrl() {
    return companyPrivacyPolicyUrl;
  }

  public void setCompanyPrivacyPolicyUrl(@javax.annotation.Nullable String companyPrivacyPolicyUrl) {
    this.companyPrivacyPolicyUrl = companyPrivacyPolicyUrl;
  }


  public TemplatePropertiesInputCreate companyWebsiteUrl(@javax.annotation.Nullable String companyWebsiteUrl) {
    this.companyWebsiteUrl = companyWebsiteUrl;
    return this;
  }

  /**
   * Company website URL (HTTP/HTTPS only)
   * @return companyWebsiteUrl
   */
  @javax.annotation.Nullable
  public String getCompanyWebsiteUrl() {
    return companyWebsiteUrl;
  }

  public void setCompanyWebsiteUrl(@javax.annotation.Nullable String companyWebsiteUrl) {
    this.companyWebsiteUrl = companyWebsiteUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatePropertiesInputCreate templatePropertiesInputCreate = (TemplatePropertiesInputCreate) o;
    return Objects.equals(this.ctaButtonBgColor, templatePropertiesInputCreate.ctaButtonBgColor) &&
        Objects.equals(this.ctaTextFontColor, templatePropertiesInputCreate.ctaTextFontColor) &&
        Objects.equals(this.primaryBgColor, templatePropertiesInputCreate.primaryBgColor) &&
        Objects.equals(this.homeUrl, templatePropertiesInputCreate.homeUrl) &&
        Objects.equals(this.logoUrl, templatePropertiesInputCreate.logoUrl) &&
        Objects.equals(this.fontFamily, templatePropertiesInputCreate.fontFamily) &&
        Objects.equals(this.productName, templatePropertiesInputCreate.productName) &&
        Objects.equals(this.footerAddress, templatePropertiesInputCreate.footerAddress) &&
        Objects.equals(this.footerPhone, templatePropertiesInputCreate.footerPhone) &&
        Objects.equals(this.replacementValueForLiveboard, templatePropertiesInputCreate.replacementValueForLiveboard) &&
        Objects.equals(this.replacementValueForAnswer, templatePropertiesInputCreate.replacementValueForAnswer) &&
        Objects.equals(this.replacementValueForSpotIq, templatePropertiesInputCreate.replacementValueForSpotIq) &&
        Objects.equals(this.hideFooterAddress, templatePropertiesInputCreate.hideFooterAddress) &&
        Objects.equals(this.hideFooterPhone, templatePropertiesInputCreate.hideFooterPhone) &&
        Objects.equals(this.hideManageNotification, templatePropertiesInputCreate.hideManageNotification) &&
        Objects.equals(this.hideMobileAppNudge, templatePropertiesInputCreate.hideMobileAppNudge) &&
        Objects.equals(this.hidePrivacyPolicy, templatePropertiesInputCreate.hidePrivacyPolicy) &&
        Objects.equals(this.hideProductName, templatePropertiesInputCreate.hideProductName) &&
        Objects.equals(this.hideTsVocabularyDefinitions, templatePropertiesInputCreate.hideTsVocabularyDefinitions) &&
        Objects.equals(this.hideNotificationStatus, templatePropertiesInputCreate.hideNotificationStatus) &&
        Objects.equals(this.hideErrorMessage, templatePropertiesInputCreate.hideErrorMessage) &&
        Objects.equals(this.hideUnsubscribeLink, templatePropertiesInputCreate.hideUnsubscribeLink) &&
        Objects.equals(this.hideModifyAlert, templatePropertiesInputCreate.hideModifyAlert) &&
        Objects.equals(this.companyPrivacyPolicyUrl, templatePropertiesInputCreate.companyPrivacyPolicyUrl) &&
        Objects.equals(this.companyWebsiteUrl, templatePropertiesInputCreate.companyWebsiteUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctaButtonBgColor, ctaTextFontColor, primaryBgColor, homeUrl, logoUrl, fontFamily, productName, footerAddress, footerPhone, replacementValueForLiveboard, replacementValueForAnswer, replacementValueForSpotIq, hideFooterAddress, hideFooterPhone, hideManageNotification, hideMobileAppNudge, hidePrivacyPolicy, hideProductName, hideTsVocabularyDefinitions, hideNotificationStatus, hideErrorMessage, hideUnsubscribeLink, hideModifyAlert, companyPrivacyPolicyUrl, companyWebsiteUrl);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatePropertiesInputCreate {\n");
    sb.append("    ctaButtonBgColor: ").append(toIndentedString(ctaButtonBgColor)).append("\n");
    sb.append("    ctaTextFontColor: ").append(toIndentedString(ctaTextFontColor)).append("\n");
    sb.append("    primaryBgColor: ").append(toIndentedString(primaryBgColor)).append("\n");
    sb.append("    homeUrl: ").append(toIndentedString(homeUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    footerAddress: ").append(toIndentedString(footerAddress)).append("\n");
    sb.append("    footerPhone: ").append(toIndentedString(footerPhone)).append("\n");
    sb.append("    replacementValueForLiveboard: ").append(toIndentedString(replacementValueForLiveboard)).append("\n");
    sb.append("    replacementValueForAnswer: ").append(toIndentedString(replacementValueForAnswer)).append("\n");
    sb.append("    replacementValueForSpotIq: ").append(toIndentedString(replacementValueForSpotIq)).append("\n");
    sb.append("    hideFooterAddress: ").append(toIndentedString(hideFooterAddress)).append("\n");
    sb.append("    hideFooterPhone: ").append(toIndentedString(hideFooterPhone)).append("\n");
    sb.append("    hideManageNotification: ").append(toIndentedString(hideManageNotification)).append("\n");
    sb.append("    hideMobileAppNudge: ").append(toIndentedString(hideMobileAppNudge)).append("\n");
    sb.append("    hidePrivacyPolicy: ").append(toIndentedString(hidePrivacyPolicy)).append("\n");
    sb.append("    hideProductName: ").append(toIndentedString(hideProductName)).append("\n");
    sb.append("    hideTsVocabularyDefinitions: ").append(toIndentedString(hideTsVocabularyDefinitions)).append("\n");
    sb.append("    hideNotificationStatus: ").append(toIndentedString(hideNotificationStatus)).append("\n");
    sb.append("    hideErrorMessage: ").append(toIndentedString(hideErrorMessage)).append("\n");
    sb.append("    hideUnsubscribeLink: ").append(toIndentedString(hideUnsubscribeLink)).append("\n");
    sb.append("    hideModifyAlert: ").append(toIndentedString(hideModifyAlert)).append("\n");
    sb.append("    companyPrivacyPolicyUrl: ").append(toIndentedString(companyPrivacyPolicyUrl)).append("\n");
    sb.append("    companyWebsiteUrl: ").append(toIndentedString(companyWebsiteUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("cta_button_bg_color");
    openapiFields.add("cta_text_font_color");
    openapiFields.add("primary_bg_color");
    openapiFields.add("home_url");
    openapiFields.add("logo_url");
    openapiFields.add("font_family");
    openapiFields.add("product_name");
    openapiFields.add("footer_address");
    openapiFields.add("footer_phone");
    openapiFields.add("replacement_value_for_liveboard");
    openapiFields.add("replacement_value_for_answer");
    openapiFields.add("replacement_value_for_spot_iq");
    openapiFields.add("hide_footer_address");
    openapiFields.add("hide_footer_phone");
    openapiFields.add("hide_manage_notification");
    openapiFields.add("hide_mobile_app_nudge");
    openapiFields.add("hide_privacy_policy");
    openapiFields.add("hide_product_name");
    openapiFields.add("hide_ts_vocabulary_definitions");
    openapiFields.add("hide_notification_status");
    openapiFields.add("hide_error_message");
    openapiFields.add("hide_unsubscribe_link");
    openapiFields.add("hide_modify_alert");
    openapiFields.add("company_privacy_policy_url");
    openapiFields.add("company_website_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplatePropertiesInputCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplatePropertiesInputCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplatePropertiesInputCreate is not found in the empty JSON string", TemplatePropertiesInputCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplatePropertiesInputCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplatePropertiesInputCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cta_button_bg_color") != null && !jsonObj.get("cta_button_bg_color").isJsonNull()) && !jsonObj.get("cta_button_bg_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cta_button_bg_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cta_button_bg_color").toString()));
      }
      if ((jsonObj.get("cta_text_font_color") != null && !jsonObj.get("cta_text_font_color").isJsonNull()) && !jsonObj.get("cta_text_font_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cta_text_font_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cta_text_font_color").toString()));
      }
      if ((jsonObj.get("primary_bg_color") != null && !jsonObj.get("primary_bg_color").isJsonNull()) && !jsonObj.get("primary_bg_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_bg_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_bg_color").toString()));
      }
      if ((jsonObj.get("home_url") != null && !jsonObj.get("home_url").isJsonNull()) && !jsonObj.get("home_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `home_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("home_url").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("font_family") != null && !jsonObj.get("font_family").isJsonNull()) && !jsonObj.get("font_family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `font_family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("font_family").toString()));
      }
      if ((jsonObj.get("product_name") != null && !jsonObj.get("product_name").isJsonNull()) && !jsonObj.get("product_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_name").toString()));
      }
      if ((jsonObj.get("footer_address") != null && !jsonObj.get("footer_address").isJsonNull()) && !jsonObj.get("footer_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footer_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footer_address").toString()));
      }
      if ((jsonObj.get("footer_phone") != null && !jsonObj.get("footer_phone").isJsonNull()) && !jsonObj.get("footer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footer_phone").toString()));
      }
      if ((jsonObj.get("replacement_value_for_liveboard") != null && !jsonObj.get("replacement_value_for_liveboard").isJsonNull()) && !jsonObj.get("replacement_value_for_liveboard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacement_value_for_liveboard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacement_value_for_liveboard").toString()));
      }
      if ((jsonObj.get("replacement_value_for_answer") != null && !jsonObj.get("replacement_value_for_answer").isJsonNull()) && !jsonObj.get("replacement_value_for_answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacement_value_for_answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacement_value_for_answer").toString()));
      }
      if ((jsonObj.get("replacement_value_for_spot_iq") != null && !jsonObj.get("replacement_value_for_spot_iq").isJsonNull()) && !jsonObj.get("replacement_value_for_spot_iq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacement_value_for_spot_iq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacement_value_for_spot_iq").toString()));
      }
      if ((jsonObj.get("company_privacy_policy_url") != null && !jsonObj.get("company_privacy_policy_url").isJsonNull()) && !jsonObj.get("company_privacy_policy_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_privacy_policy_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_privacy_policy_url").toString()));
      }
      if ((jsonObj.get("company_website_url") != null && !jsonObj.get("company_website_url").isJsonNull()) && !jsonObj.get("company_website_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_website_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_website_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplatePropertiesInputCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplatePropertiesInputCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplatePropertiesInputCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplatePropertiesInputCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplatePropertiesInputCreate>() {
           @Override
           public void write(JsonWriter out, TemplatePropertiesInputCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplatePropertiesInputCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplatePropertiesInputCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplatePropertiesInputCreate
   * @throws IOException if the JSON string is invalid with respect to TemplatePropertiesInputCreate
   */
  public static TemplatePropertiesInputCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplatePropertiesInputCreate.class);
  }

  /**
   * Convert an instance of TemplatePropertiesInputCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

