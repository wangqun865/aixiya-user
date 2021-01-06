package aixiya.framewrok.backend.platform.user.aspect;


import com.aixiya.framework.backend.common.annotation.ControllerEndpoint;
import com.aixiya.framework.backend.common.aspect.BaseAspectSupport;
import com.aixiya.framework.backend.common.exception.AixiyaFwException;
import com.aixiya.framework.backend.common.utils.AixiyaFwUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author wangqun865@163.com
 */
@Aspect
@Slf4j
@Component
@RequiredArgsConstructor
public class ControllerEndpointAspect extends BaseAspectSupport {

    //private final ILogService logService;
    //private final KafkaTemplate template;

    @Pointcut("@annotation(com.aixiya.framework.backend.common.annotation.ControllerEndpoint)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws AixiyaFwException {
        Object result;
        Method targetMethod = resolveMethod(point);
        ControllerEndpoint annotation = targetMethod.getAnnotation(ControllerEndpoint.class);
        String operation = annotation.operation();
        long start = System.currentTimeMillis();
        try {
            result = point.proceed();
            if (StringUtils.isNotBlank(operation)) {
                String username = AixiyaFwUtil.getCurrentUser().getUsername();
                String ip = AixiyaFwUtil.getHttpServletRequestIpAddress();
                //template.send(operationLogMessage.TOPIC,operationLogMessage);
                //logService.saveLog(point, targetMethod, ip, operation, username, start);
            }
            return result;
        } catch (Throwable throwable) {
            String exceptionMessage = annotation.exceptionMessage();
            String message = throwable.getMessage();
            String error = AixiyaFwUtil.containChinese(message) ? exceptionMessage + "，" + message : exceptionMessage;
            throw new AixiyaFwException(error);
        }
    }
}



