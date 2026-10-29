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
import com.thoughtspot.client.model.AgentMessagesResponse;
import com.thoughtspot.client.model.AgentStreamFrame;
import com.thoughtspot.client.model.AgentTurnResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.thoughtspot.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SendAgentConversationMessageResponse extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(SendAgentConversationMessageResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SendAgentConversationMessageResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SendAgentConversationMessageResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AgentMessagesResponse> adapterAgentMessagesResponse = gson.getDelegateAdapter(this, TypeToken.get(AgentMessagesResponse.class));
            final TypeAdapter<AgentTurnResponse> adapterAgentTurnResponse = gson.getDelegateAdapter(this, TypeToken.get(AgentTurnResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<SendAgentConversationMessageResponse>() {
                @Override
                public void write(JsonWriter out, SendAgentConversationMessageResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AgentMessagesResponse`
                    if (value.getActualInstance() instanceof AgentMessagesResponse) {
                        JsonElement element = adapterAgentMessagesResponse.toJsonTree((AgentMessagesResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AgentTurnResponse`
                    if (value.getActualInstance() instanceof AgentTurnResponse) {
                        JsonElement element = adapterAgentTurnResponse.toJsonTree((AgentTurnResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AgentMessagesResponse, AgentTurnResponse");
                }

                @Override
                public SendAgentConversationMessageResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AgentMessagesResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AgentMessagesResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterAgentMessagesResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AgentMessagesResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AgentMessagesResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AgentMessagesResponse'", e);
                    }
                    // deserialize AgentTurnResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AgentTurnResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterAgentTurnResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AgentTurnResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AgentTurnResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AgentTurnResponse'", e);
                    }

                    if (match == 1) {
                        SendAgentConversationMessageResponse ret = new SendAgentConversationMessageResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SendAgentConversationMessageResponse: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SendAgentConversationMessageResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public SendAgentConversationMessageResponse(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AgentMessagesResponse", AgentMessagesResponse.class);
        schemas.put("AgentTurnResponse", AgentTurnResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SendAgentConversationMessageResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AgentMessagesResponse, AgentTurnResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AgentMessagesResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AgentTurnResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AgentMessagesResponse, AgentTurnResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * AgentMessagesResponse, AgentTurnResponse
     *
     * @return The actual instance (AgentMessagesResponse, AgentTurnResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AgentMessagesResponse`. If the actual instance is not `AgentMessagesResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AgentMessagesResponse`
     * @throws ClassCastException if the instance is not `AgentMessagesResponse`
     */
    public AgentMessagesResponse getAgentMessagesResponse() throws ClassCastException {
        return (AgentMessagesResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AgentTurnResponse`. If the actual instance is not `AgentTurnResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AgentTurnResponse`
     * @throws ClassCastException if the instance is not `AgentTurnResponse`
     */
    public AgentTurnResponse getAgentTurnResponse() throws ClassCastException {
        return (AgentTurnResponse)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SendAgentConversationMessageResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AgentMessagesResponse
        try {
            AgentMessagesResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AgentMessagesResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AgentTurnResponse
        try {
            AgentTurnResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AgentTurnResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for SendAgentConversationMessageResponse with oneOf schemas: AgentMessagesResponse, AgentTurnResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of SendAgentConversationMessageResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SendAgentConversationMessageResponse
     * @throws IOException if the JSON string is invalid with respect to SendAgentConversationMessageResponse
     */
    public static SendAgentConversationMessageResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SendAgentConversationMessageResponse.class);
    }

    /**
     * Convert an instance of SendAgentConversationMessageResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

