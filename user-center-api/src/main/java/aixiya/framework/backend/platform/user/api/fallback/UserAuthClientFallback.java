package aixiya.framework.backend.platform.user.api.fallback;


import aixiya.framework.backend.platform.user.api.UserAuthClient;
import aixiya.framework.backend.platform.user.api.entity.Production;
import aixiya.framework.backend.platform.user.api.entity.User;
import aixiya.framework.backend.platform.user.api.vo.UserCheckLoginVO;
import com.aixiya.framework.backend.common.api.AixiyaFwResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wangqun865@163.com
 */
@Slf4j
@Component
public class UserAuthClientFallback implements UserAuthClient {


    @Override
    public UserCheckLoginVO checkLogin(String loginName, String password, Long orgId) {
        UserCheckLoginVO userCheckLoginVO = new UserCheckLoginVO();
        userCheckLoginVO.setIfSuccess(false);
        userCheckLoginVO.setErrorMessage("服务降级错误");
        log.error("checkLogin接口链接错误，服务降级");
        return userCheckLoginVO;
    }

    @Override
    public AixiyaFwResponse checkLoginByPhone(String phone, String code) {
        return null;
    }

    @Override
    public String[] getResourceCode(String loginName, Long orgId, String oath2Id) {
        log.error("getResourceCode接口链接错误，服务降级");
        String[] strings = new String[0];
        return strings;
    }

    @Override
    public Production getProductionByOAuth2Id(String oauth2Id) {
        return null;
    }

    @Override
    public User getUserByLoginName(String loginName, String orgId) {
        return null;
    }
}
