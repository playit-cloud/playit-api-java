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
import gg.playit.api.models.AssignedManagedCreate;
import gg.playit.api.models.TunnelOriginCreateOneOf;
import gg.playit.api.models.TunnelOriginCreateOneOf1;
import gg.playit.api.models.TunnelOriginCreateOneOf2;
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
public class TunnelOriginCreate extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TunnelOriginCreate.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TunnelOriginCreate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TunnelOriginCreate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TunnelOriginCreateOneOf> adapterTunnelOriginCreateOneOf = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginCreateOneOf.class));
            final TypeAdapter<TunnelOriginCreateOneOf1> adapterTunnelOriginCreateOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginCreateOneOf1.class));
            final TypeAdapter<TunnelOriginCreateOneOf2> adapterTunnelOriginCreateOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginCreateOneOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<TunnelOriginCreate>() {
                @Override
                public void write(JsonWriter out, TunnelOriginCreate value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TunnelOriginCreateOneOf`
                    if (value.getActualInstance() instanceof TunnelOriginCreateOneOf) {
                      JsonElement element = adapterTunnelOriginCreateOneOf.toJsonTree((TunnelOriginCreateOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `TunnelOriginCreateOneOf1`
                    if (value.getActualInstance() instanceof TunnelOriginCreateOneOf1) {
                      JsonElement element = adapterTunnelOriginCreateOneOf1.toJsonTree((TunnelOriginCreateOneOf1)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `TunnelOriginCreateOneOf2`
                    if (value.getActualInstance() instanceof TunnelOriginCreateOneOf2) {
                      JsonElement element = adapterTunnelOriginCreateOneOf2.toJsonTree((TunnelOriginCreateOneOf2)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TunnelOriginCreateOneOf, TunnelOriginCreateOneOf1, TunnelOriginCreateOneOf2");
                }

                @Override
                public TunnelOriginCreate read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TunnelOriginCreateOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelOriginCreateOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelOriginCreateOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelOriginCreateOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelOriginCreateOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelOriginCreateOneOf'", e);
                    }
                    // deserialize TunnelOriginCreateOneOf1
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelOriginCreateOneOf1.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelOriginCreateOneOf1;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelOriginCreateOneOf1'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelOriginCreateOneOf1 failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelOriginCreateOneOf1'", e);
                    }
                    // deserialize TunnelOriginCreateOneOf2
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelOriginCreateOneOf2.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelOriginCreateOneOf2;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelOriginCreateOneOf2'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelOriginCreateOneOf2 failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelOriginCreateOneOf2'", e);
                    }

                    if (match == 1) {
                        TunnelOriginCreate ret = new TunnelOriginCreate();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TunnelOriginCreate: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TunnelOriginCreate() {
        super("oneOf", Boolean.FALSE);
    }

    public TunnelOriginCreate(TunnelOriginCreateOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TunnelOriginCreate(TunnelOriginCreateOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TunnelOriginCreate(TunnelOriginCreateOneOf2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TunnelOriginCreateOneOf", TunnelOriginCreateOneOf.class);
        schemas.put("TunnelOriginCreateOneOf1", TunnelOriginCreateOneOf1.class);
        schemas.put("TunnelOriginCreateOneOf2", TunnelOriginCreateOneOf2.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TunnelOriginCreate.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TunnelOriginCreateOneOf, TunnelOriginCreateOneOf1, TunnelOriginCreateOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TunnelOriginCreateOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TunnelOriginCreateOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TunnelOriginCreateOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TunnelOriginCreateOneOf, TunnelOriginCreateOneOf1, TunnelOriginCreateOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * TunnelOriginCreateOneOf, TunnelOriginCreateOneOf1, TunnelOriginCreateOneOf2
     *
     * @return The actual instance (TunnelOriginCreateOneOf, TunnelOriginCreateOneOf1, TunnelOriginCreateOneOf2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TunnelOriginCreateOneOf`. If the actual instance is not `TunnelOriginCreateOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelOriginCreateOneOf`
     * @throws ClassCastException if the instance is not `TunnelOriginCreateOneOf`
     */
    public TunnelOriginCreateOneOf getTunnelOriginCreateOneOf() throws ClassCastException {
        return (TunnelOriginCreateOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TunnelOriginCreateOneOf1`. If the actual instance is not `TunnelOriginCreateOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelOriginCreateOneOf1`
     * @throws ClassCastException if the instance is not `TunnelOriginCreateOneOf1`
     */
    public TunnelOriginCreateOneOf1 getTunnelOriginCreateOneOf1() throws ClassCastException {
        return (TunnelOriginCreateOneOf1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TunnelOriginCreateOneOf2`. If the actual instance is not `TunnelOriginCreateOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelOriginCreateOneOf2`
     * @throws ClassCastException if the instance is not `TunnelOriginCreateOneOf2`
     */
    public TunnelOriginCreateOneOf2 getTunnelOriginCreateOneOf2() throws ClassCastException {
        return (TunnelOriginCreateOneOf2)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelOriginCreate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TunnelOriginCreateOneOf
    try {
      TunnelOriginCreateOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelOriginCreateOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TunnelOriginCreateOneOf1
    try {
      TunnelOriginCreateOneOf1.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelOriginCreateOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TunnelOriginCreateOneOf2
    try {
      TunnelOriginCreateOneOf2.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelOriginCreateOneOf2 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for TunnelOriginCreate with oneOf schemas: TunnelOriginCreateOneOf, TunnelOriginCreateOneOf1, TunnelOriginCreateOneOf2. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of TunnelOriginCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelOriginCreate
  * @throws IOException if the JSON string is invalid with respect to TunnelOriginCreate
  */
  public static TunnelOriginCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelOriginCreate.class);
  }

 /**
  * Convert an instance of TunnelOriginCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

