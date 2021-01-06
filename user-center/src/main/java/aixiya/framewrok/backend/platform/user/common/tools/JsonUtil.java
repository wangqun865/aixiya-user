package aixiya.framewrok.backend.platform.user.common.tools;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;

@Slf4j
public abstract class JsonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // 自定义日期的格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    public static String toJson(Object obj) {
        try {
            if (obj != null) {
                return mapper.writeValueAsString(obj);
            }
        } catch (JsonProcessingException e) {
            log.error("JsonUtil fromJson toJson error ,msg {}", e);
        }
        return "";
    }

    public static <T> T fromJson(String jsonStr, Class<T> clzs) {
        try {
            return mapper.readValue(jsonStr, clzs);
        } catch (JsonProcessingException e) {
            log.error("JsonUtil fromJson clzs error ,msg {}", e);
        }
        return null;
    }

    public static <T> T fromJson(String jsonStr, TypeReference<T> valueTypeRef) {
        try {
            return mapper.readValue(jsonStr, valueTypeRef);
        } catch (JsonProcessingException e) {
            log.error("JsonUtil fromJson valueTypeRef  error,msg {}", e);
        }
        return null;
    }

}
