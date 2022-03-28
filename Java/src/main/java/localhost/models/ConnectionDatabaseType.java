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
 * This is a model class for ConnectionDatabaseType type.
 */
public class ConnectionDatabaseType {
    private String name;
    private List<ConnectionTableSchema> schema;

    /**
     * Default constructor.
     */
    public ConnectionDatabaseType() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  schema  List of ConnectionTableSchema value for schema.
     */
    public ConnectionDatabaseType(
            String name,
            List<ConnectionTableSchema> schema) {
        this.name = name;
        this.schema = schema;
    }

    /**
     * Getter for Name.
     * Name of the database
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the database
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Schema.
     * List of schemas
     * @return Returns the List of ConnectionTableSchema
     */
    @JsonGetter("schema")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ConnectionTableSchema> getSchema() {
        return schema;
    }

    /**
     * Setter for Schema.
     * List of schemas
     * @param schema Value for List of ConnectionTableSchema
     */
    @JsonSetter("schema")
    public void setSchema(List<ConnectionTableSchema> schema) {
        this.schema = schema;
    }

    /**
     * Converts this ConnectionDatabaseType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionDatabaseType [" + "name=" + name + ", schema=" + schema + "]";
    }

    /**
     * Builds a new {@link ConnectionDatabaseType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectionDatabaseType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .schema(getSchema());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionDatabaseType}.
     */
    public static class Builder {
        private String name;
        private List<ConnectionTableSchema> schema;



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
         * Setter for schema.
         * @param  schema  List of ConnectionTableSchema value for schema.
         * @return Builder
         */
        public Builder schema(List<ConnectionTableSchema> schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Builds a new {@link ConnectionDatabaseType} object using the set fields.
         * @return {@link ConnectionDatabaseType}
         */
        public ConnectionDatabaseType build() {
            return new ConnectionDatabaseType(name, schema);
        }
    }
}
