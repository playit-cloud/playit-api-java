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
 * Gets or Sets AgentAccountStatus
 */
@JsonAdapter(AgentAccountStatus.Adapter.class)
public enum AgentAccountStatus {
  
  ACCOUNT_DELETE_SCHEDULED("account-delete-scheduled"),
  
  BANNED("banned"),
  
  HAS_MESSAGE("has-message"),
  
  EMAIL_NOT_VERIFIED("email-not-verified"),
  
  GUEST("guest"),
  
  READY("ready"),
  
  AGENT_OVER_LIMIT("agent-over-limit"),
  
  AGENT_DISABLED("agent-disabled");

  private String value;

  AgentAccountStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAccountStatus fromValue(String value) {
    for (AgentAccountStatus b : AgentAccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAccountStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAccountStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAccountStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAccountStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AgentAccountStatus.fromValue(value);
  }
}

