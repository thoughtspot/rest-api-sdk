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
import com.thoughtspot.client.model.AgentEvent;
import com.thoughtspot.client.model.AgentProgress;
import com.thoughtspot.client.model.AgentStreamDone;
import com.thoughtspot.client.model.AgentStreamError;
import com.thoughtspot.client.model.AgentStreamFrame;
import com.thoughtspot.client.model.AgentToolCall;
import com.thoughtspot.client.model.AgentToolResult;
import com.thoughtspot.client.model.SendAgentMessageResponse;
import java.io.IOException;
import java.util.Arrays;
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
public class SendAgentConversationMessageStreaming200Response extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(SendAgentConversationMessageStreaming200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SendAgentConversationMessageStreaming200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SendAgentConversationMessageStreaming200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SendAgentMessageResponse> adapterSendAgentMessageResponse = gson.getDelegateAdapter(this, TypeToken.get(SendAgentMessageResponse.class));
            final TypeAdapter<AgentStreamFrame> adapterAgentStreamFrame = gson.getDelegateAdapter(this, TypeToken.get(AgentStreamFrame.class));

            return (TypeAdapter<T>) new TypeAdapter<SendAgentConversationMessageStreaming200Response>() {
                @Override
                public void write(JsonWriter out, SendAgentConversationMessageStreaming200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SendAgentMessageResponse`
                    if (value.getActualInstance() instanceof SendAgentMessageResponse) {
                        JsonElement element = adapterSendAgentMessageResponse.toJsonTree((SendAgentMessageResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AgentStreamFrame`
                    if (value.getActualInstance() instanceof AgentStreamFrame) {
                        JsonElement element = adapterAgentStreamFrame.toJsonTree((AgentStreamFrame)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AgentStreamFrame, SendAgentMessageResponse");
                }

                @Override
                public SendAgentConversationMessageStreaming200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SendAgentMessageResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SendAgentMessageResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterSendAgentMessageResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SendAgentMessageResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SendAgentMessageResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SendAgentMessageResponse'", e);
                    }
                    // deserialize AgentStreamFrame
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AgentStreamFrame.validateJsonElement(jsonElement);
                        actualAdapter = adapterAgentStreamFrame;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AgentStreamFrame'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AgentStreamFrame failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AgentStreamFrame'", e);
                    }

                    if (match == 1) {
                        SendAgentConversationMessageStreaming200Response ret = new SendAgentConversationMessageStreaming200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SendAgentConversationMessageStreaming200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SendAgentConversationMessageStreaming200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public SendAgentConversationMessageStreaming200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SendAgentMessageResponse", SendAgentMessageResponse.class);
        schemas.put("AgentStreamFrame", AgentStreamFrame.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SendAgentConversationMessageStreaming200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AgentStreamFrame, SendAgentMessageResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SendAgentMessageResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AgentStreamFrame) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AgentStreamFrame, SendAgentMessageResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * AgentStreamFrame, SendAgentMessageResponse
     *
     * @return The actual instance (AgentStreamFrame, SendAgentMessageResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SendAgentMessageResponse`. If the actual instance is not `SendAgentMessageResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SendAgentMessageResponse`
     * @throws ClassCastException if the instance is not `SendAgentMessageResponse`
     */
    public SendAgentMessageResponse getSendAgentMessageResponse() throws ClassCastException {
        return (SendAgentMessageResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AgentStreamFrame`. If the actual instance is not `AgentStreamFrame`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AgentStreamFrame`
     * @throws ClassCastException if the instance is not `AgentStreamFrame`
     */
    public AgentStreamFrame getAgentStreamFrame() throws ClassCastException {
        return (AgentStreamFrame)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SendAgentConversationMessageStreaming200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with SendAgentMessageResponse
        try {
            SendAgentMessageResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SendAgentMessageResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AgentStreamFrame
        try {
            AgentStreamFrame.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AgentStreamFrame failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for SendAgentConversationMessageStreaming200Response with oneOf schemas: AgentStreamFrame, SendAgentMessageResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of SendAgentConversationMessageStreaming200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SendAgentConversationMessageStreaming200Response
     * @throws IOException if the JSON string is invalid with respect to SendAgentConversationMessageStreaming200Response
     */
    public static SendAgentConversationMessageStreaming200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SendAgentConversationMessageStreaming200Response.class);
    }

    /**
     * Convert an instance of SendAgentConversationMessageStreaming200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

