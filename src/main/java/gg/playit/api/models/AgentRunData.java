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
import gg.playit.api.models.AgentAccountStatus;
import gg.playit.api.models.AgentPendingTunnel;
import gg.playit.api.models.AgentTunnel;
import gg.playit.api.models.AgentType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AgentRunData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T12:14:41.539310597-08:00[America/Los_Angeles]")
public class AgentRunData {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_AGENT_TYPE = "agent_type";
  @SerializedName(SERIALIZED_NAME_AGENT_TYPE)
  private AgentType agentType;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AgentAccountStatus accountStatus;

  public static final String SERIALIZED_NAME_TUNNELS = "tunnels";
  @SerializedName(SERIALIZED_NAME_TUNNELS)
  private List<AgentTunnel> tunnels = new ArrayList<>();

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private List<AgentPendingTunnel> pending = new ArrayList<>();

  public AgentRunData() {
  }

  public AgentRunData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public AgentRunData agentType(AgentType agentType) {
    this.agentType = agentType;
    return this;
  }

   /**
   * Get agentType
   * @return agentType
  **/
  @javax.annotation.Nonnull
  public AgentType getAgentType() {
    return agentType;
  }

  public void setAgentType(AgentType agentType) {
    this.agentType = agentType;
  }


  public AgentRunData accountStatus(AgentAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nonnull
  public AgentAccountStatus getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(AgentAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public AgentRunData tunnels(List<AgentTunnel> tunnels) {
    this.tunnels = tunnels;
    return this;
  }

  public AgentRunData addTunnelsItem(AgentTunnel tunnelsItem) {
    if (this.tunnels == null) {
      this.tunnels = new ArrayList<>();
    }
    this.tunnels.add(tunnelsItem);
    return this;
  }

   /**
   * Get tunnels
   * @return tunnels
  **/
  @javax.annotation.Nonnull
  public List<AgentTunnel> getTunnels() {
    return tunnels;
  }

  public void setTunnels(List<AgentTunnel> tunnels) {
    this.tunnels = tunnels;
  }


  public AgentRunData pending(List<AgentPendingTunnel> pending) {
    this.pending = pending;
    return this;
  }

  public AgentRunData addPendingItem(AgentPendingTunnel pendingItem) {
    if (this.pending == null) {
      this.pending = new ArrayList<>();
    }
    this.pending.add(pendingItem);
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @javax.annotation.Nonnull
  public List<AgentPendingTunnel> getPending() {
    return pending;
  }

  public void setPending(List<AgentPendingTunnel> pending) {
    this.pending = pending;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentRunData agentRunData = (AgentRunData) o;
    return Objects.equals(this.agentId, agentRunData.agentId) &&
        Objects.equals(this.agentType, agentRunData.agentType) &&
        Objects.equals(this.accountStatus, agentRunData.accountStatus) &&
        Objects.equals(this.tunnels, agentRunData.tunnels) &&
        Objects.equals(this.pending, agentRunData.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentType, accountStatus, tunnels, pending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRunData {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    tunnels: ").append(toIndentedString(tunnels)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("agent_type");
    openapiFields.add("account_status");
    openapiFields.add("tunnels");
    openapiFields.add("pending");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("agent_type");
    openapiRequiredFields.add("account_status");
    openapiRequiredFields.add("tunnels");
    openapiRequiredFields.add("pending");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AgentRunData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgentRunData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentRunData is not found in the empty JSON string", AgentRunData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgentRunData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentRunData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgentRunData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("agent_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_id").toString()));
      }
      // validate the required field `agent_type`
      AgentType.validateJsonElement(jsonObj.get("agent_type"));
      // validate the required field `account_status`
      AgentAccountStatus.validateJsonElement(jsonObj.get("account_status"));
      // ensure the json data is an array
      if (!jsonObj.get("tunnels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tunnels` to be an array in the JSON string but got `%s`", jsonObj.get("tunnels").toString()));
      }

      JsonArray jsonArraytunnels = jsonObj.getAsJsonArray("tunnels");
      // validate the required field `tunnels` (array)
      for (int i = 0; i < jsonArraytunnels.size(); i++) {
        AgentTunnel.validateJsonElement(jsonArraytunnels.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("pending").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pending` to be an array in the JSON string but got `%s`", jsonObj.get("pending").toString()));
      }

      JsonArray jsonArraypending = jsonObj.getAsJsonArray("pending");
      // validate the required field `pending` (array)
      for (int i = 0; i < jsonArraypending.size(); i++) {
        AgentPendingTunnel.validateJsonElement(jsonArraypending.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentRunData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentRunData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentRunData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentRunData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentRunData>() {
           @Override
           public void write(JsonWriter out, AgentRunData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentRunData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentRunData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentRunData
  * @throws IOException if the JSON string is invalid with respect to AgentRunData
  */
  public static AgentRunData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentRunData.class);
  }

 /**
  * Convert an instance of AgentRunData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
