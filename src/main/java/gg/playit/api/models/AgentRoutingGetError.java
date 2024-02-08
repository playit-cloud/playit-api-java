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
 * Gets or Sets AgentRoutingGetError
 */
@JsonAdapter(AgentRoutingGetError.Adapter.class)
public enum AgentRoutingGetError {
  
  MISSINGAGENTID("MissingAgentId"),
  
  AGENTIDNOTSUPPORTED("AgentIdNotSupported"),
  
  INVALIDAGENTID("InvalidAgentId");

  private String value;

  AgentRoutingGetError(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentRoutingGetError fromValue(String value) {
    for (AgentRoutingGetError b : AgentRoutingGetError.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentRoutingGetError> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentRoutingGetError enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentRoutingGetError read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentRoutingGetError.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AgentRoutingGetError.fromValue(value);
  }
}

