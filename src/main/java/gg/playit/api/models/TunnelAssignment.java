/*
 * playit.gg's api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: unstable
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package gg.playit.api.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import gg.playit.api.models.SubscriptionId;
import gg.playit.api.models.TunnelAssignmentOneOf;
import gg.playit.api.models.TunnelAssignmentOneOf1;
import java.io.IOException;
import java.util.Arrays;



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

import gg.playit.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T12:14:41.539310597-08:00[America/Los_Angeles]")
public class TunnelAssignment extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TunnelAssignment.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TunnelAssignment.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TunnelAssignment' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TunnelAssignmentOneOf> adapterTunnelAssignmentOneOf = gson.getDelegateAdapter(this, TypeToken.get(TunnelAssignmentOneOf.class));
            final TypeAdapter<TunnelAssignmentOneOf1> adapterTunnelAssignmentOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(TunnelAssignmentOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<TunnelAssignment>() {
                @Override
                public void write(JsonWriter out, TunnelAssignment value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TunnelAssignmentOneOf`
                    if (value.getActualInstance() instanceof TunnelAssignmentOneOf) {
                      JsonElement element = adapterTunnelAssignmentOneOf.toJsonTree((TunnelAssignmentOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `TunnelAssignmentOneOf1`
                    if (value.getActualInstance() instanceof TunnelAssignmentOneOf1) {
                      JsonElement element = adapterTunnelAssignmentOneOf1.toJsonTree((TunnelAssignmentOneOf1)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TunnelAssignmentOneOf, TunnelAssignmentOneOf1");
                }

                @Override
                public TunnelAssignment read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TunnelAssignmentOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelAssignmentOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelAssignmentOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelAssignmentOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelAssignmentOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelAssignmentOneOf'", e);
                    }
                    // deserialize TunnelAssignmentOneOf1
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelAssignmentOneOf1.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelAssignmentOneOf1;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelAssignmentOneOf1'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelAssignmentOneOf1 failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelAssignmentOneOf1'", e);
                    }

                    if (match == 1) {
                        TunnelAssignment ret = new TunnelAssignment();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TunnelAssignment: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TunnelAssignment() {
        super("oneOf", Boolean.FALSE);
    }

    public TunnelAssignment(TunnelAssignmentOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TunnelAssignment(TunnelAssignmentOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TunnelAssignmentOneOf", TunnelAssignmentOneOf.class);
        schemas.put("TunnelAssignmentOneOf1", TunnelAssignmentOneOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TunnelAssignment.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TunnelAssignmentOneOf, TunnelAssignmentOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TunnelAssignmentOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TunnelAssignmentOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TunnelAssignmentOneOf, TunnelAssignmentOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * TunnelAssignmentOneOf, TunnelAssignmentOneOf1
     *
     * @return The actual instance (TunnelAssignmentOneOf, TunnelAssignmentOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TunnelAssignmentOneOf`. If the actual instance is not `TunnelAssignmentOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelAssignmentOneOf`
     * @throws ClassCastException if the instance is not `TunnelAssignmentOneOf`
     */
    public TunnelAssignmentOneOf getTunnelAssignmentOneOf() throws ClassCastException {
        return (TunnelAssignmentOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TunnelAssignmentOneOf1`. If the actual instance is not `TunnelAssignmentOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelAssignmentOneOf1`
     * @throws ClassCastException if the instance is not `TunnelAssignmentOneOf1`
     */
    public TunnelAssignmentOneOf1 getTunnelAssignmentOneOf1() throws ClassCastException {
        return (TunnelAssignmentOneOf1)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelAssignment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TunnelAssignmentOneOf
    try {
      TunnelAssignmentOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelAssignmentOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TunnelAssignmentOneOf1
    try {
      TunnelAssignmentOneOf1.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelAssignmentOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for TunnelAssignment with oneOf schemas: TunnelAssignmentOneOf, TunnelAssignmentOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of TunnelAssignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelAssignment
  * @throws IOException if the JSON string is invalid with respect to TunnelAssignment
  */
  public static TunnelAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelAssignment.class);
  }

 /**
  * Convert an instance of TunnelAssignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
