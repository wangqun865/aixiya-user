package aixiya.framewrok.backend.platform.user.intercepter;


import com.aixiya.framework.backend.common.entity.CurrentUser;
import com.aixiya.framework.backend.common.exception.AixiyaFwException;
import com.aixiya.framework.backend.common.utils.AixiyaFwUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class ManagerIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        if(path.indexOf("/manager")>-1){
            CurrentUser currentUser = AixiyaFwUtil.getCurrentUser();
            if(currentUser == null){
                throw new AixiyaFwException("没有权限访问该资源");
            }else{
                if("1".equals(currentUser.getManager())){
                    return true;
                }else{
                    throw new AixiyaFwException("没有权限访问该资源");
                }
            }
        }else{
            return true;
        }
    }
}
