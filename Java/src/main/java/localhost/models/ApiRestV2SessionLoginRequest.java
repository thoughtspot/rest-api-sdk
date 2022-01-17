/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ApiRestV2SessionLoginRequest type.
 */
public class ApiRestV2SessionLoginRequest {
    private String userName;
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean rememberMe;

    /**
     * Default constructor.
     */
    public ApiRestV2SessionLoginRequest() {
        rememberMe = false;
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  password  String value for password.
     * @param  rememberMe  Boolean value for rememberMe.
     */
    public ApiRestV2SessionLoginRequest(
            String userName,
            String password,
            Boolean rememberMe) {
        this.userName = userName;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    /**
     * Getter for UserName.
     * Username of the user account
     * @return Returns the String
     */
    @JsonGetter("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * Username of the user account
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Password.
     * The password of the user account
     * @return Returns the String
     */
    @JsonGetter("password")
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * The password of the user account
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for RememberMe.
     * A flag to remember the user session. When set to true, sets a session cookie that persists in
     * subsequent API calls.
     * @return Returns the Boolean
     */
    @JsonGetter("rememberMe")
    public Boolean getRememberMe() {
        return rememberMe;
    }

    /**
     * Setter for RememberMe.
     * A flag to remember the user session. When set to true, sets a session cookie that persists in
     * subsequent API calls.
     * @param rememberMe Value for Boolean
     */
    @JsonSetter("rememberMe")
    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    /**
     * Converts this ApiRestV2SessionLoginRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2SessionLoginRequest [" + "userName=" + userName + ", password=" + password
                + ", rememberMe=" + rememberMe + "]";
    }

    /**
     * Builds a new {@link ApiRestV2SessionLoginRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2SessionLoginRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(userName, password)
                .rememberMe(getRememberMe());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2SessionLoginRequest}.
     */
    public static class Builder {
        private String userName;
        private String password;
        private Boolean rememberMe = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  userName  String value for userName.
         * @param  password  String value for password.
         */
        public Builder(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Setter for rememberMe.
         * @param  rememberMe  Boolean value for rememberMe.
         * @return Builder
         */
        public Builder rememberMe(Boolean rememberMe) {
            this.rememberMe = rememberMe;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2SessionLoginRequest} object using the set fields.
         * @return {@link ApiRestV2SessionLoginRequest}
         */
        public ApiRestV2SessionLoginRequest build() {
            return new ApiRestV2SessionLoginRequest(userName, password, rememberMe);
        }
    }
}
