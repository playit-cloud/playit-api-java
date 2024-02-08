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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import gg.playit.JSON;

/**
 * UseAllocDedicatedIp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T12:14:41.539310597-08:00[America/Los_Angeles]")
public class UseAllocDedicatedIp {
  public static final String SERIALIZED_NAME_IP_HOSTNAME = "ip_hostname";
  @SerializedName(SERIALIZED_NAME_IP_HOSTNAME)
  private String ipHostname;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private BigDecimal port;

  public UseAllocDedicatedIp() {
  }

  public UseAllocDedicatedIp ipHostname(String ipHostname) {
    this.ipHostname = ipHostname;
    return this;
  }

   /**
   * Get ipHostname
   * @return ipHostname
  **/
  @javax.annotation.Nonnull
  public String getIpHostname() {
    return ipHostname;
  }

  public void setIpHostname(String ipHostname) {
    this.ipHostname = ipHostname;
  }


  public UseAllocDedicatedIp port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseAllocDedicatedIp useAllocDedicatedIp = (UseAllocDedicatedIp) o;
    return Objects.equals(this.ipHostname, useAllocDedicatedIp.ipHostname) &&
        Objects.equals(this.port, useAllocDedicatedIp.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipHostname, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseAllocDedicatedIp {\n");
    sb.append("    ipHostname: ").append(toIndentedString(ipHostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("ip_hostname");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ip_hostname");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UseAllocDedicatedIp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UseAllocDedicatedIp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UseAllocDedicatedIp is not found in the empty JSON string", UseAllocDedicatedIp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UseAllocDedicatedIp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UseAllocDedicatedIp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UseAllocDedicatedIp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ip_hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_hostname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UseAllocDedicatedIp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UseAllocDedicatedIp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UseAllocDedicatedIp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UseAllocDedicatedIp.class));

       return (TypeAdapter<T>) new TypeAdapter<UseAllocDedicatedIp>() {
           @Override
           public void write(JsonWriter out, UseAllocDedicatedIp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UseAllocDedicatedIp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UseAllocDedicatedIp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UseAllocDedicatedIp
  * @throws IOException if the JSON string is invalid with respect to UseAllocDedicatedIp
  */
  public static UseAllocDedicatedIp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UseAllocDedicatedIp.class);
  }

 /**
  * Convert an instance of UseAllocDedicatedIp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

