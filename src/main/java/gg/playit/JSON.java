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


package gg.playit;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.TimeZone;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    private static final StdDateFormat sdf = new StdDateFormat()
        .withTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()))
        .withColonInTimeZone(true);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AccountTunnel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AccountTunnelAllocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AccountTunnelAllocationOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AccountTunnelAllocationOneOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AccountTunnels.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentAccepted.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentClaimDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentPendingTunnel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentRouting.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentRunData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentSecretKey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentTunnel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentsRoutingGetPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentsRoutingGetPost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentsRoutingGetPost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AgentsRundataPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AllocatedPorts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AssignedAgent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AssignedAgentCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AssignedDefault.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AssignedDefaultCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AssignedManaged.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.AssignedManagedCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimAcceptPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimAcceptPost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimAcceptPost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimDetailsPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimDetailsPost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimDetailsPost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimExchangePost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimExchangePost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimExchangePost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimRejectPost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimRejectPost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimSetupPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimSetupPost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ClaimSetupPost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.LoginGuestPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ObjectId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.PlayitAgentVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.PortRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ProtoRegisterPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.Ratelimit.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqAgentsRoutingGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqClaimAccept.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqClaimDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqClaimExchange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqClaimReject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqClaimSetup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqProtoRegister.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqTunnelsCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqTunnelsDelete.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.ReqTunnelsList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.SignedAgentKey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.SignedEpoch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.SubscriptionId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TotpStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TotpStatusOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelAllocated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelAssignment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelAssignmentOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelAssignmentOneOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelCreateUseAllocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelCreateUseAllocationOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelCreateUseAllocationOneOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelCreateUseAllocationOneOf2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelDedicatedIp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelDisabled.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelDomain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelExpireNotice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOrigin.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginCreateOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginCreateOneOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginCreateOneOf2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginOneOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelOriginOneOf2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost400ResponseOneOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost400ResponseOneOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost400ResponseOneOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost401Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost401ResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost500Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsCreatePost500ResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsDeletePost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsDeletePost400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.TunnelsListPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.UseAllocDedicatedIp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.UseAllocPortAlloc.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.UseRegion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.WebAuth.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new gg.playit.api.models.WebSession.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(sdf.parse(date).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, DateTimeFormatter will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toInstant().atOffset(ZoneOffset.UTC).format(dtf);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return sdf.parse(date);
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
