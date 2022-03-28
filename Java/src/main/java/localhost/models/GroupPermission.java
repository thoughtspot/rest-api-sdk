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
 * This is a model class for GroupPermission type.
 */
public class GroupPermission {
    private String id;
    private String name;
    private String permission;

    /**
     * Default constructor.
     */
    public GroupPermission() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  permission  String value for permission.
     */
    public GroupPermission(
            String id,
            String name,
            String permission) {
        this.id = id;
        this.name = name;
        this.permission = permission;
    }

    /**
     * Getter for Id.
     * GUID of the user group
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the user group
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * Name of the user group
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the user group
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Permission.
     * Indicates the permission which user group has on the object
     * @return Returns the String
     */
    @JsonGetter("permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * Indicates the permission which user group has on the object
     * @param permission Value for String
     */
    @JsonSetter("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Converts this GroupPermission into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GroupPermission [" + "id=" + id + ", name=" + name + ", permission=" + permission
                + "]";
    }

    /**
     * Builds a new {@link GroupPermission.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GroupPermission.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .permission(getPermission());
        return builder;
    }

    /**
     * Class to build instances of {@link GroupPermission}.
     */
    public static class Builder {
        private String id;
        private String name;
        private String permission;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for permission.
         * @param  permission  String value for permission.
         * @return Builder
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Builds a new {@link GroupPermission} object using the set fields.
         * @return {@link GroupPermission}
         */
        public GroupPermission build() {
            return new GroupPermission(id, name, permission);
        }
    }
}
