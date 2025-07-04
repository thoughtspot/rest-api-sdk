/*
 * NOTE: This class is auto generated. Do not edit the class manually.
 */

package com.thoughtspot.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thoughtspot.client.JSON;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** Recipient configuration which includes email address, ID or name of the users and groups. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RecipientDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_EMAILS = "emails";

    @SerializedName(SERIALIZED_NAME_EMAILS)
    @javax.annotation.Nullable
    private List<String> emails;

    public static final String SERIALIZED_NAME_PRINCIPALS = "principals";

    @SerializedName(SERIALIZED_NAME_PRINCIPALS)
    @javax.annotation.Nullable
    private List<PrincipalsListItem> principals;

    public RecipientDetails() {}

    public RecipientDetails emails(@javax.annotation.Nullable List<String> emails) {
        this.emails = emails;
        return this;
    }

    public RecipientDetails addEmailsItem(String emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
     * Emails of the recipients. Specify email address if the recipient is not a ThoughtSpot user.
     *
     * @return emails
     */
    @javax.annotation.Nullable
    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(@javax.annotation.Nullable List<String> emails) {
        this.emails = emails;
    }

    public RecipientDetails principals(
            @javax.annotation.Nullable List<PrincipalsListItem> principals) {
        this.principals = principals;
        return this;
    }

    public RecipientDetails addPrincipalsItem(PrincipalsListItem principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    /**
     * List of user or groups to subscribe for the scheduled job notifications.
     *
     * @return principals
     */
    @javax.annotation.Nullable
    public List<PrincipalsListItem> getPrincipals() {
        return principals;
    }

    public void setPrincipals(@javax.annotation.Nullable List<PrincipalsListItem> principals) {
        this.principals = principals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientDetails recipientDetails = (RecipientDetails) o;
        return Objects.equals(this.emails, recipientDetails.emails)
                && Objects.equals(this.principals, recipientDetails.principals);
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
        return Objects.hash(emails, principals);
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
        sb.append("class RecipientDetails {\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
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
        openapiFields.add("emails");
        openapiFields.add("principals");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RecipientDetails
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RecipientDetails.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RecipientDetails is not found in the"
                                        + " empty JSON string",
                                RecipientDetails.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!RecipientDetails.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RecipientDetails` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("emails") != null
                && !jsonObj.get("emails").isJsonNull()
                && !jsonObj.get("emails").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `emails` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("emails").toString()));
        }
        if (jsonObj.get("principals") != null && !jsonObj.get("principals").isJsonNull()) {
            JsonArray jsonArrayprincipals = jsonObj.getAsJsonArray("principals");
            if (jsonArrayprincipals != null) {
                // ensure the json data is an array
                if (!jsonObj.get("principals").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `principals` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("principals").toString()));
                }

                // validate the optional field `principals` (array)
                for (int i = 0; i < jsonArrayprincipals.size(); i++) {
                    PrincipalsListItem.validateJsonElement(jsonArrayprincipals.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RecipientDetails.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RecipientDetails' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RecipientDetails> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RecipientDetails.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RecipientDetails>() {
                        @Override
                        public void write(JsonWriter out, RecipientDetails value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RecipientDetails read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RecipientDetails given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RecipientDetails
     * @throws IOException if the JSON string is invalid with respect to RecipientDetails
     */
    public static RecipientDetails fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RecipientDetails.class);
    }

    /**
     * Convert an instance of RecipientDetails to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
