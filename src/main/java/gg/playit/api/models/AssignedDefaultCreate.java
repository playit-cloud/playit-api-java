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
 * AssignedDefaultCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T12:14:41.539310597-08:00[America/Los_Angeles]")
public class AssignedDefaultCreate {
  public static final String SERIALIZED_NAME_LOCAL_IP = "local_ip";
  @SerializedName(SERIALIZED_NAME_LOCAL_IP)
  private String localIp;

  public static final String SERIALIZED_NAME_LOCAL_PORT = "local_port";
  @SerializedName(SERIALIZED_NAME_LOCAL_PORT)
  private BigDecimal localPort;

  public AssignedDefaultCreate() {
  }

  public AssignedDefaultCreate localIp(String localIp) {
    this.localIp = localIp;
    return this;
  }

   /**
   * Get localIp
   * @return localIp
  **/
  @javax.annotation.Nonnull
  public String getLocalIp() {
    return localIp;
  }

  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }


  public AssignedDefaultCreate localPort(BigDecimal localPort) {
    this.localPort = localPort;
    return this;
  }

   /**
   * Get localPort
   * @return localPort
  **/
  @javax.annotation.Nullable
  public BigDecimal getLocalPort() {
    return localPort;
  }

  public void setLocalPort(BigDecimal localPort) {
    this.localPort = localPort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedDefaultCreate assignedDefaultCreate = (AssignedDefaultCreate) o;
    return Objects.equals(this.localIp, assignedDefaultCreate.localIp) &&
        Objects.equals(this.localPort, assignedDefaultCreate.localPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localIp, localPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedDefaultCreate {\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    localPort: ").append(toIndentedString(localPort)).append("\n");
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
    openapiFields.add("local_ip");
    openapiFields.add("local_port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("local_ip");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssignedDefaultCreate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssignedDefaultCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssignedDefaultCreate is not found in the empty JSON string", AssignedDefaultCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssignedDefaultCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssignedDefaultCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssignedDefaultCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("local_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `local_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("local_ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssignedDefaultCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssignedDefaultCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssignedDefaultCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssignedDefaultCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<AssignedDefaultCreate>() {
           @Override
           public void write(JsonWriter out, AssignedDefaultCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssignedDefaultCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssignedDefaultCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssignedDefaultCreate
  * @throws IOException if the JSON string is invalid with respect to AssignedDefaultCreate
  */
  public static AssignedDefaultCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssignedDefaultCreate.class);
  }

 /**
  * Convert an instance of AssignedDefaultCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

