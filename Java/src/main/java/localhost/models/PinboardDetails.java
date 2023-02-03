/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PinboardDetails type.
 */
public class PinboardDetails {
    private String pinboardId;
    private String pinboardName;
    private String tabId;
    private String tabName;

    /**
     * Default constructor.
     */
    public PinboardDetails() {
    }

    /**
     * Initialization constructor.
     * @param  pinboardId  String value for pinboardId.
     * @param  pinboardName  String value for pinboardName.
     * @param  tabId  String value for tabId.
     * @param  tabName  String value for tabName.
     */
    public PinboardDetails(
            String pinboardId,
            String pinboardName,
            String tabId,
            String tabName) {
        this.pinboardId = pinboardId;
        this.pinboardName = pinboardName;
        this.tabId = tabId;
        this.tabName = tabName;
    }

    /**
     * Getter for PinboardId.
     * pinboard id of recently pinned pinboard
     * @return Returns the String
     */
    @JsonGetter("pinboardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPinboardId() {
        return pinboardId;
    }

    /**
     * Setter for PinboardId.
     * pinboard id of recently pinned pinboard
     * @param pinboardId Value for String
     */
    @JsonSetter("pinboardId")
    public void setPinboardId(String pinboardId) {
        this.pinboardId = pinboardId;
    }

    /**
     * Getter for PinboardName.
     * pinboard name of recently pinned pinboard
     * @return Returns the String
     */
    @JsonGetter("pinboardName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPinboardName() {
        return pinboardName;
    }

    /**
     * Setter for PinboardName.
     * pinboard name of recently pinned pinboard
     * @param pinboardName Value for String
     */
    @JsonSetter("pinboardName")
    public void setPinboardName(String pinboardName) {
        this.pinboardName = pinboardName;
    }

    /**
     * Getter for TabId.
     * tab id of recently pinned tab
     * @return Returns the String
     */
    @JsonGetter("tabId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTabId() {
        return tabId;
    }

    /**
     * Setter for TabId.
     * tab id of recently pinned tab
     * @param tabId Value for String
     */
    @JsonSetter("tabId")
    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    /**
     * Getter for TabName.
     * tab name of recently pinned tab
     * @return Returns the String
     */
    @JsonGetter("tabName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTabName() {
        return tabName;
    }

    /**
     * Setter for TabName.
     * tab name of recently pinned tab
     * @param tabName Value for String
     */
    @JsonSetter("tabName")
    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    /**
     * Converts this PinboardDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PinboardDetails [" + "pinboardId=" + pinboardId + ", pinboardName=" + pinboardName
                + ", tabId=" + tabId + ", tabName=" + tabName + "]";
    }

    /**
     * Builds a new {@link PinboardDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PinboardDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pinboardId(getPinboardId())
                .pinboardName(getPinboardName())
                .tabId(getTabId())
                .tabName(getTabName());
        return builder;
    }

    /**
     * Class to build instances of {@link PinboardDetails}.
     */
    public static class Builder {
        private String pinboardId;
        private String pinboardName;
        private String tabId;
        private String tabName;



        /**
         * Setter for pinboardId.
         * @param  pinboardId  String value for pinboardId.
         * @return Builder
         */
        public Builder pinboardId(String pinboardId) {
            this.pinboardId = pinboardId;
            return this;
        }

        /**
         * Setter for pinboardName.
         * @param  pinboardName  String value for pinboardName.
         * @return Builder
         */
        public Builder pinboardName(String pinboardName) {
            this.pinboardName = pinboardName;
            return this;
        }

        /**
         * Setter for tabId.
         * @param  tabId  String value for tabId.
         * @return Builder
         */
        public Builder tabId(String tabId) {
            this.tabId = tabId;
            return this;
        }

        /**
         * Setter for tabName.
         * @param  tabName  String value for tabName.
         * @return Builder
         */
        public Builder tabName(String tabName) {
            this.tabName = tabName;
            return this;
        }

        /**
         * Builds a new {@link PinboardDetails} object using the set fields.
         * @return {@link PinboardDetails}
         */
        public PinboardDetails build() {
            return new PinboardDetails(pinboardId, pinboardName, tabId, tabName);
        }
    }
}