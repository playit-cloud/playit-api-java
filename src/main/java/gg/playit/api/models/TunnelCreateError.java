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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TunnelCreateError
 */
@JsonAdapter(TunnelCreateError.Adapter.class)
public enum TunnelCreateError {
  
  AGENTIDREQUIRED("AgentIdRequired"),
  
  AGENTNOTFOUND("AgentNotFound"),
  
  INVALIDAGENTID("InvalidAgentId"),
  
  DEDICATEDIPNOTFOUND("DedicatedIpNotFound"),
  
  DEDICATEDIPPORTNOTAVAILABLE("DedicatedIpPortNotAvailable"),
  
  DEDICATEDIPNOTENOUGHSPACE("DedicatedIpNotEnoughSpace"),
  
  PORTALLOCNOTFOUND("PortAllocNotFound"),
  
  INVALIDIPHOSTNAME("InvalidIpHostname"),
  
  MANAGEDMISSINGAGENTID("ManagedMissingAgentId");

  private String value;

  TunnelCreateError(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TunnelCreateError fromValue(String value) {
    for (TunnelCreateError b : TunnelCreateError.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TunnelCreateError> {
    @Override
    public void write(final JsonWriter jsonWriter, final TunnelCreateError enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TunnelCreateError read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TunnelCreateError.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TunnelCreateError.fromValue(value);
  }
}

