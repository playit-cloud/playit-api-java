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
import gg.playit.api.models.ClaimDetailsError;
import gg.playit.api.models.ClaimDetailsPost400ResponseOneOf;
import gg.playit.api.models.TunnelsCreatePost400ResponseOneOf;
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
public class ClaimDetailsPost400Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ClaimDetailsPost400Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ClaimDetailsPost400Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ClaimDetailsPost400Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TunnelsCreatePost400ResponseOneOf> adapterTunnelsCreatePost400ResponseOneOf = gson.getDelegateAdapter(this, TypeToken.get(TunnelsCreatePost400ResponseOneOf.class));
            final TypeAdapter<ClaimDetailsPost400ResponseOneOf> adapterClaimDetailsPost400ResponseOneOf = gson.getDelegateAdapter(this, TypeToken.get(ClaimDetailsPost400ResponseOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<ClaimDetailsPost400Response>() {
                @Override
                public void write(JsonWriter out, ClaimDetailsPost400Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TunnelsCreatePost400ResponseOneOf`
                    if (value.getActualInstance() instanceof TunnelsCreatePost400ResponseOneOf) {
                      JsonElement element = adapterTunnelsCreatePost400ResponseOneOf.toJsonTree((TunnelsCreatePost400ResponseOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ClaimDetailsPost400ResponseOneOf`
                    if (value.getActualInstance() instanceof ClaimDetailsPost400ResponseOneOf) {
                      JsonElement element = adapterClaimDetailsPost400ResponseOneOf.toJsonTree((ClaimDetailsPost400ResponseOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ClaimDetailsPost400ResponseOneOf, TunnelsCreatePost400ResponseOneOf");
                }

                @Override
                public ClaimDetailsPost400Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TunnelsCreatePost400ResponseOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TunnelsCreatePost400ResponseOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterTunnelsCreatePost400ResponseOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TunnelsCreatePost400ResponseOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TunnelsCreatePost400ResponseOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TunnelsCreatePost400ResponseOneOf'", e);
                    }
                    // deserialize ClaimDetailsPost400ResponseOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ClaimDetailsPost400ResponseOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterClaimDetailsPost400ResponseOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ClaimDetailsPost400ResponseOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ClaimDetailsPost400ResponseOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ClaimDetailsPost400ResponseOneOf'", e);
                    }

                    if (match == 1) {
                        ClaimDetailsPost400Response ret = new ClaimDetailsPost400Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ClaimDetailsPost400Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ClaimDetailsPost400Response() {
        super("oneOf", Boolean.FALSE);
    }

    public ClaimDetailsPost400Response(ClaimDetailsPost400ResponseOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ClaimDetailsPost400Response(TunnelsCreatePost400ResponseOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TunnelsCreatePost400ResponseOneOf", TunnelsCreatePost400ResponseOneOf.class);
        schemas.put("ClaimDetailsPost400ResponseOneOf", ClaimDetailsPost400ResponseOneOf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ClaimDetailsPost400Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ClaimDetailsPost400ResponseOneOf, TunnelsCreatePost400ResponseOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TunnelsCreatePost400ResponseOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ClaimDetailsPost400ResponseOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ClaimDetailsPost400ResponseOneOf, TunnelsCreatePost400ResponseOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * ClaimDetailsPost400ResponseOneOf, TunnelsCreatePost400ResponseOneOf
     *
     * @return The actual instance (ClaimDetailsPost400ResponseOneOf, TunnelsCreatePost400ResponseOneOf)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TunnelsCreatePost400ResponseOneOf`. If the actual instance is not `TunnelsCreatePost400ResponseOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelsCreatePost400ResponseOneOf`
     * @throws ClassCastException if the instance is not `TunnelsCreatePost400ResponseOneOf`
     */
    public TunnelsCreatePost400ResponseOneOf getTunnelsCreatePost400ResponseOneOf() throws ClassCastException {
        return (TunnelsCreatePost400ResponseOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ClaimDetailsPost400ResponseOneOf`. If the actual instance is not `ClaimDetailsPost400ResponseOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ClaimDetailsPost400ResponseOneOf`
     * @throws ClassCastException if the instance is not `ClaimDetailsPost400ResponseOneOf`
     */
    public ClaimDetailsPost400ResponseOneOf getClaimDetailsPost400ResponseOneOf() throws ClassCastException {
        return (ClaimDetailsPost400ResponseOneOf)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClaimDetailsPost400Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TunnelsCreatePost400ResponseOneOf
    try {
      TunnelsCreatePost400ResponseOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TunnelsCreatePost400ResponseOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ClaimDetailsPost400ResponseOneOf
    try {
      ClaimDetailsPost400ResponseOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ClaimDetailsPost400ResponseOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ClaimDetailsPost400Response with oneOf schemas: ClaimDetailsPost400ResponseOneOf, TunnelsCreatePost400ResponseOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ClaimDetailsPost400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClaimDetailsPost400Response
  * @throws IOException if the JSON string is invalid with respect to ClaimDetailsPost400Response
  */
  public static ClaimDetailsPost400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClaimDetailsPost400Response.class);
  }

 /**
  * Convert an instance of ClaimDetailsPost400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

