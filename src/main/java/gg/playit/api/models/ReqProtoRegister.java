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
import gg.playit.api.models.PlayitAgentVersion;
import java.io.IOException;
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
 * ReqProtoRegister
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T12:14:41.539310597-08:00[America/Los_Angeles]")
public class ReqProtoRegister {
  public static final String SERIALIZED_NAME_AGENT_VERSION = "agent_version";
  @SerializedName(SERIALIZED_NAME_AGENT_VERSION)
  private PlayitAgentVersion agentVersion;

  public static final String SERIALIZED_NAME_CLIENT_ADDR = "client_addr";
  @SerializedName(SERIALIZED_NAME_CLIENT_ADDR)
  private String clientAddr;

  public static final String SERIALIZED_NAME_TUNNEL_ADDR = "tunnel_addr";
  @SerializedName(SERIALIZED_NAME_TUNNEL_ADDR)
  private String tunnelAddr;

  public ReqProtoRegister() {
  }

  public ReqProtoRegister agentVersion(PlayitAgentVersion agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

   /**
   * Get agentVersion
   * @return agentVersion
  **/
  @javax.annotation.Nonnull
  public PlayitAgentVersion getAgentVersion() {
    return agentVersion;
  }

  public void setAgentVersion(PlayitAgentVersion agentVersion) {
    this.agentVersion = agentVersion;
  }


  public ReqProtoRegister clientAddr(String clientAddr) {
    this.clientAddr = clientAddr;
    return this;
  }

   /**
   * Get clientAddr
   * @return clientAddr
  **/
  @javax.annotation.Nonnull
  public String getClientAddr() {
    return clientAddr;
  }

  public void setClientAddr(String clientAddr) {
    this.clientAddr = clientAddr;
  }


  public ReqProtoRegister tunnelAddr(String tunnelAddr) {
    this.tunnelAddr = tunnelAddr;
    return this;
  }

   /**
   * Get tunnelAddr
   * @return tunnelAddr
  **/
  @javax.annotation.Nonnull
  public String getTunnelAddr() {
    return tunnelAddr;
  }

  public void setTunnelAddr(String tunnelAddr) {
    this.tunnelAddr = tunnelAddr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReqProtoRegister reqProtoRegister = (ReqProtoRegister) o;
    return Objects.equals(this.agentVersion, reqProtoRegister.agentVersion) &&
        Objects.equals(this.clientAddr, reqProtoRegister.clientAddr) &&
        Objects.equals(this.tunnelAddr, reqProtoRegister.tunnelAddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentVersion, clientAddr, tunnelAddr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReqProtoRegister {\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
    sb.append("    tunnelAddr: ").append(toIndentedString(tunnelAddr)).append("\n");
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
    openapiFields.add("agent_version");
    openapiFields.add("client_addr");
    openapiFields.add("tunnel_addr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_version");
    openapiRequiredFields.add("client_addr");
    openapiRequiredFields.add("tunnel_addr");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReqProtoRegister
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReqProtoRegister.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReqProtoRegister is not found in the empty JSON string", ReqProtoRegister.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReqProtoRegister.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReqProtoRegister` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReqProtoRegister.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `agent_version`
      PlayitAgentVersion.validateJsonElement(jsonObj.get("agent_version"));
      if (!jsonObj.get("client_addr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_addr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_addr").toString()));
      }
      if (!jsonObj.get("tunnel_addr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tunnel_addr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tunnel_addr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReqProtoRegister.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReqProtoRegister' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReqProtoRegister> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReqProtoRegister.class));

       return (TypeAdapter<T>) new TypeAdapter<ReqProtoRegister>() {
           @Override
           public void write(JsonWriter out, ReqProtoRegister value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReqProtoRegister read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReqProtoRegister given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReqProtoRegister
  * @throws IOException if the JSON string is invalid with respect to ReqProtoRegister
  */
  public static ReqProtoRegister fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReqProtoRegister.class);
  }

 /**
  * Convert an instance of ReqProtoRegister to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

