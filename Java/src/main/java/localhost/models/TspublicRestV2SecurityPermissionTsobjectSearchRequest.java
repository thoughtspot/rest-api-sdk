/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2SecurityPermissionTsobjectSearchRequest type.
 */
public class TspublicRestV2SecurityPermissionTsobjectSearchRequest {
    private List<TsObjectSearchInput> tsObject;
    private List<UserNameAndIDInput> principal;
    private SearchPermissionOnObjectsIncludeDependentEnum includeDependent;

    /**
     * Default constructor.
     */
    public TspublicRestV2SecurityPermissionTsobjectSearchRequest() {
        includeDependent = SearchPermissionOnObjectsIncludeDependentEnum.ENUM_FALSE;
    }

    /**
     * Initialization constructor.
     * @param  tsObject  List of TsObjectSearchInput value for tsObject.
     * @param  principal  List of UserNameAndIDInput value for principal.
     * @param  includeDependent  SearchPermissionOnObjectsIncludeDependentEnum value for
     *         includeDependent.
     */
    public TspublicRestV2SecurityPermissionTsobjectSearchRequest(
            List<TsObjectSearchInput> tsObject,
            List<UserNameAndIDInput> principal,
            SearchPermissionOnObjectsIncludeDependentEnum includeDependent) {
        this.tsObject = tsObject;
        this.principal = principal;
        this.includeDependent = includeDependent;
    }

    /**
     * Getter for TsObject.
     * A JSON Array of GUIDs and type of metadata object.
     * @return Returns the List of TsObjectSearchInput
     */
    @JsonGetter("tsObject")
    public List<TsObjectSearchInput> getTsObject() {
        return tsObject;
    }

    /**
     * Setter for TsObject.
     * A JSON Array of GUIDs and type of metadata object.
     * @param tsObject Value for List of TsObjectSearchInput
     */
    @JsonSetter("tsObject")
    public void setTsObject(List<TsObjectSearchInput> tsObject) {
        this.tsObject = tsObject;
    }

    /**
     * Getter for Principal.
     * A JSON array of principal names or GUIDs. When both are given then id is considered.
     * @return Returns the List of UserNameAndIDInput
     */
    @JsonGetter("principal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserNameAndIDInput> getPrincipal() {
        return principal;
    }

    /**
     * Setter for Principal.
     * A JSON array of principal names or GUIDs. When both are given then id is considered.
     * @param principal Value for List of UserNameAndIDInput
     */
    @JsonSetter("principal")
    public void setPrincipal(List<UserNameAndIDInput> principal) {
        this.principal = principal;
    }

    /**
     * Getter for IncludeDependent.
     * When this field is set to true, the API response includes the permission details for the
     * dependent objects
     * @return Returns the SearchPermissionOnObjectsIncludeDependentEnum
     */
    @JsonGetter("includeDependent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchPermissionOnObjectsIncludeDependentEnum getIncludeDependent() {
        return includeDependent;
    }

    /**
     * Setter for IncludeDependent.
     * When this field is set to true, the API response includes the permission details for the
     * dependent objects
     * @param includeDependent Value for SearchPermissionOnObjectsIncludeDependentEnum
     */
    @JsonSetter("includeDependent")
    public void setIncludeDependent(SearchPermissionOnObjectsIncludeDependentEnum includeDependent) {
        this.includeDependent = includeDependent;
    }

    /**
     * Converts this TspublicRestV2SecurityPermissionTsobjectSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2SecurityPermissionTsobjectSearchRequest [" + "tsObject=" + tsObject
                + ", principal=" + principal + ", includeDependent=" + includeDependent + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2SecurityPermissionTsobjectSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2SecurityPermissionTsobjectSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tsObject)
                .principal(getPrincipal())
                .includeDependent(getIncludeDependent());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2SecurityPermissionTsobjectSearchRequest}.
     */
    public static class Builder {
        private List<TsObjectSearchInput> tsObject;
        private List<UserNameAndIDInput> principal;
        private SearchPermissionOnObjectsIncludeDependentEnum includeDependent =
                SearchPermissionOnObjectsIncludeDependentEnum.ENUM_FALSE;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tsObject  List of TsObjectSearchInput value for tsObject.
         */
        public Builder(List<TsObjectSearchInput> tsObject) {
            this.tsObject = tsObject;
        }

        /**
         * Setter for tsObject.
         * @param  tsObject  List of TsObjectSearchInput value for tsObject.
         * @return Builder
         */
        public Builder tsObject(List<TsObjectSearchInput> tsObject) {
            this.tsObject = tsObject;
            return this;
        }

        /**
         * Setter for principal.
         * @param  principal  List of UserNameAndIDInput value for principal.
         * @return Builder
         */
        public Builder principal(List<UserNameAndIDInput> principal) {
            this.principal = principal;
            return this;
        }

        /**
         * Setter for includeDependent.
         * @param  includeDependent  SearchPermissionOnObjectsIncludeDependentEnum value for
         *         includeDependent.
         * @return Builder
         */
        public Builder includeDependent(
                SearchPermissionOnObjectsIncludeDependentEnum includeDependent) {
            this.includeDependent = includeDependent;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2SecurityPermissionTsobjectSearchRequest} object using
         * the set fields.
         * @return {@link TspublicRestV2SecurityPermissionTsobjectSearchRequest}
         */
        public TspublicRestV2SecurityPermissionTsobjectSearchRequest build() {
            return new TspublicRestV2SecurityPermissionTsobjectSearchRequest(tsObject, principal,
                    includeDependent);
        }
    }
}
