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
 * Gets or Sets ClaimSetupError
 */
@JsonAdapter(ClaimSetupError.Adapter.class)
public enum ClaimSetupError {
  
  INVALIDCODE("InvalidCode"),
  
  CODEEXPIRED("CodeExpired"),
  
  VERSIONTEXTTOOLONG("VersionTextTooLong");

  private String value;

  ClaimSetupError(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClaimSetupError fromValue(String value) {
    for (ClaimSetupError b : ClaimSetupError.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClaimSetupError> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClaimSetupError enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClaimSetupError read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClaimSetupError.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ClaimSetupError.fromValue(value);
  }
}

