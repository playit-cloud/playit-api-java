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
import gg.playit.api.models.AssignedManaged;
import gg.playit.api.models.TunnelOriginOneOf;
import gg.playit.api.models.TunnelOriginOneOf1;
import gg.playit.api.models.TunnelOriginOneOf2;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TunnelOrigin extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TunnelOrigin.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TunnelOrigin.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TunnelOrigin' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TunnelOriginOneOf> adapterTunnelOriginOneOf = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginOneOf.class));
            final TypeAdapter<TunnelOriginOneOf1> adapterTunnelOriginOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginOneOf1.class));
            final TypeAdapter<TunnelOriginOneOf2> adapterTunnelOriginOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginOneOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<TunnelOrigin>() {
                @Override
                public void write(JsonWriter out, TunnelOrigin value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TunnelOriginOneOf`
                    if (value.getActualInstance() instanceof TunnelOriginOneOf) {
                      JsonElement element = adapterTunnelOriginOneOf.toJsonTree((TunnelOriginOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `TunnelOriginOneOf1`
                    if (value.getActualInstance() instanceof TunnelOriginOneOf1) {
                      JsonElement element = adapterTunnelOriginOneOf1.toJsonTree((TunnelOriginOneOf1)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `TunnelOriginOneOf2`
                    if (value.getActualInstance() instanceof TunnelOriginOneOf2) {
                      JsonElement element = adapterTunnelOriginOneOf2.toJsonTree((TunnelOriginOneOf2)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TunnelOriginOneOf, TunnelOriginOneOf1, TunnelOriginOneOf2");
                }

                @Override
                public TunnelOrigin read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TunnelOriginOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelOriginOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelOriginOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelOriginOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelOriginOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelOriginOneOf'", e);
                    }
                    // deserialize TunnelOriginOneOf1
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelOriginOneOf1.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelOriginOneOf1;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelOriginOneOf1'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelOriginOneOf1 failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelOriginOneOf1'", e);
                    }
                    // deserialize TunnelOriginOneOf2
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelOriginOneOf2.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelOriginOneOf2;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelOriginOneOf2'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelOriginOneOf2 failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelOriginOneOf2'", e);
                    }

                    if (match == 1) {
                        TunnelOrigin ret = new TunnelOrigin();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TunnelOrigin: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TunnelOrigin() {
        super("oneOf", Boolean.FALSE);
    }

    public TunnelOrigin(TunnelOriginOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TunnelOrigin(TunnelOriginOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TunnelOrigin(TunnelOriginOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TunnelOriginOneOf", TunnelOriginOneOf.class);
        schemas.put("TunnelOriginOneOf1", TunnelOriginOneOf1.class);
        schemas.put("TunnelOriginOneOf2", TunnelOriginOneOf2.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TunnelOrigin.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TunnelOriginOneOf, TunnelOriginOneOf1, TunnelOriginOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TunnelOriginOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TunnelOriginOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TunnelOriginOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TunnelOriginOneOf, TunnelOriginOneOf1, TunnelOriginOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * TunnelOriginOneOf, TunnelOriginOneOf1, TunnelOriginOneOf2
     *
     * @return The actual instance (TunnelOriginOneOf, TunnelOriginOneOf1, TunnelOriginOneOf2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TunnelOriginOneOf`. If the actual instance is not `TunnelOriginOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelOriginOneOf`
     * @throws ClassCastException if the instance is not `TunnelOriginOneOf`
     */
    public TunnelOriginOneOf getTunnelOriginOneOf() throws ClassCastException {
        return (TunnelOriginOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TunnelOriginOneOf1`. If the actual instance is not `TunnelOriginOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelOriginOneOf1`
     * @throws ClassCastException if the instance is not `TunnelOriginOneOf1`
     */
    public TunnelOriginOneOf1 getTunnelOriginOneOf1() throws ClassCastException {
        return (TunnelOriginOneOf1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TunnelOriginOneOf2`. If the actual instance is not `TunnelOriginOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelOriginOneOf2`
     * @throws ClassCastException if the instance is not `TunnelOriginOneOf2`
     */
    public TunnelOriginOneOf2 getTunnelOriginOneOf2() throws ClassCastException {
        return (TunnelOriginOneOf2)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelOrigin
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TunnelOriginOneOf
    try {
      TunnelOriginOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelOriginOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TunnelOriginOneOf1
    try {
      TunnelOriginOneOf1.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelOriginOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TunnelOriginOneOf2
    try {
      TunnelOriginOneOf2.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelOriginOneOf2 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for TunnelOrigin with oneOf schemas: TunnelOriginOneOf, TunnelOriginOneOf1, TunnelOriginOneOf2. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of TunnelOrigin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelOrigin
  * @throws IOException if the JSON string is invalid with respect to TunnelOrigin
  */
  public static TunnelOrigin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelOrigin.class);
  }

 /**
  * Convert an instance of TunnelOrigin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

