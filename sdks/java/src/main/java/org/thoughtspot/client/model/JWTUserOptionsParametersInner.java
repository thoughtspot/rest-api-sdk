/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.thoughtspot.client.model.RuntimeFilter;
import org.thoughtspot.client.model.RuntimeParamOverride;
import org.thoughtspot.client.model.RuntimeSort;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
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
import com.google.gson.JsonParseException;

import org.thoughtspot.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T10:56:34.609498487Z[Etc/UTC]")
public class JWTUserOptionsParametersInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(JWTUserOptionsParametersInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JWTUserOptionsParametersInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JWTUserOptionsParametersInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuntimeFilter> adapterRuntimeFilter = gson.getDelegateAdapter(this, TypeToken.get(RuntimeFilter.class));
            final TypeAdapter<RuntimeParamOverride> adapterRuntimeParamOverride = gson.getDelegateAdapter(this, TypeToken.get(RuntimeParamOverride.class));
            final TypeAdapter<RuntimeSort> adapterRuntimeSort = gson.getDelegateAdapter(this, TypeToken.get(RuntimeSort.class));

            return (TypeAdapter<T>) new TypeAdapter<JWTUserOptionsParametersInner>() {
                @Override
                public void write(JsonWriter out, JWTUserOptionsParametersInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RuntimeFilter`
                    if (value.getActualInstance() instanceof RuntimeFilter) {
                        JsonObject obj = adapterRuntimeFilter.toJsonTree((RuntimeFilter)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RuntimeParamOverride`
                    if (value.getActualInstance() instanceof RuntimeParamOverride) {
                        JsonObject obj = adapterRuntimeParamOverride.toJsonTree((RuntimeParamOverride)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RuntimeSort`
                    if (value.getActualInstance() instanceof RuntimeSort) {
                        JsonObject obj = adapterRuntimeSort.toJsonTree((RuntimeSort)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: RuntimeFilter, RuntimeParamOverride, RuntimeSort");
                }

                @Override
                public JWTUserOptionsParametersInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize RuntimeFilter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RuntimeFilter.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'RuntimeFilter'");
                        JWTUserOptionsParametersInner ret = new JWTUserOptionsParametersInner();
                        ret.setActualInstance(adapterRuntimeFilter.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'RuntimeFilter'", e);
                    }

                    // deserialize RuntimeParamOverride
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RuntimeParamOverride.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'RuntimeParamOverride'");
                        JWTUserOptionsParametersInner ret = new JWTUserOptionsParametersInner();
                        ret.setActualInstance(adapterRuntimeParamOverride.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'RuntimeParamOverride'", e);
                    }

                    // deserialize RuntimeSort
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RuntimeSort.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'RuntimeSort'");
                        JWTUserOptionsParametersInner ret = new JWTUserOptionsParametersInner();
                        ret.setActualInstance(adapterRuntimeSort.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'RuntimeSort'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for JWTUserOptionsParametersInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public JWTUserOptionsParametersInner() {
        super("anyOf", Boolean.FALSE);
    }

    public JWTUserOptionsParametersInner(RuntimeFilter o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JWTUserOptionsParametersInner(RuntimeParamOverride o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JWTUserOptionsParametersInner(RuntimeSort o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RuntimeFilter", new GenericType<RuntimeFilter>() {
        });
        schemas.put("RuntimeParamOverride", new GenericType<RuntimeParamOverride>() {
        });
        schemas.put("RuntimeSort", new GenericType<RuntimeSort>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return JWTUserOptionsParametersInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * RuntimeFilter, RuntimeParamOverride, RuntimeSort
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RuntimeFilter) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RuntimeParamOverride) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RuntimeSort) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RuntimeFilter, RuntimeParamOverride, RuntimeSort");
    }

    /**
     * Get the actual instance, which can be the following:
     * RuntimeFilter, RuntimeParamOverride, RuntimeSort
     *
     * @return The actual instance (RuntimeFilter, RuntimeParamOverride, RuntimeSort)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RuntimeFilter`. If the actual instance is not `RuntimeFilter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RuntimeFilter`
     * @throws ClassCastException if the instance is not `RuntimeFilter`
     */
    public RuntimeFilter getRuntimeFilter() throws ClassCastException {
        return (RuntimeFilter)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RuntimeParamOverride`. If the actual instance is not `RuntimeParamOverride`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RuntimeParamOverride`
     * @throws ClassCastException if the instance is not `RuntimeParamOverride`
     */
    public RuntimeParamOverride getRuntimeParamOverride() throws ClassCastException {
        return (RuntimeParamOverride)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RuntimeSort`. If the actual instance is not `RuntimeSort`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RuntimeSort`
     * @throws ClassCastException if the instance is not `RuntimeSort`
     */
    public RuntimeSort getRuntimeSort() throws ClassCastException {
        return (RuntimeSort)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JWTUserOptionsParametersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with RuntimeFilter
    try {
      RuntimeFilter.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with RuntimeParamOverride
    try {
      RuntimeParamOverride.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with RuntimeSort
    try {
      RuntimeSort.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for JWTUserOptionsParametersInner with anyOf schemas: RuntimeFilter, RuntimeParamOverride, RuntimeSort. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of JWTUserOptionsParametersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JWTUserOptionsParametersInner
  * @throws IOException if the JSON string is invalid with respect to JWTUserOptionsParametersInner
  */
  public static JWTUserOptionsParametersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JWTUserOptionsParametersInner.class);
  }

 /**
  * Convert an instance of JWTUserOptionsParametersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

