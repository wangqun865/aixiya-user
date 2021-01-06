package aixiya.framework.backend.platform.user.api;


import aixiya.framework.backend.platform.user.api.entity.Production;
import aixiya.framework.backend.platform.user.api.entity.User;
import aixiya.framework.backend.platform.user.api.fallback.UserAuthClientFallback;
import aixiya.framework.backend.platform.user.api.vo.UserCheckLoginVO;
import com.aixiya.framework.backend.common.api.AixiyaFwResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangqun865@163.com
 */
@FeignClient(value = "user-center", contextId = "userAuthClient", fallback = UserAuthClientFallback.class)
public interface UserAuthClient {

    String API_PREFIX = "/userClient";
    String CHECK_LOGIN = API_PREFIX + "/auth/checkLogin";
    String CHECK_LOGIN_BY_PHONE = API_PREFIX + "/auth/checkLoginByPhone";
    String GET_RESOURCE_CODE = API_PREFIX + "/auth/getResourceCode";
    String GET_PRODUCTION_BY_OAUTH2_ID = API_PREFIX + "/auth/production/info";
    String GET_USER_BY_LOGIN_NAME = API_PREFIX + "/auth/user/info";
    /**
     * 登录校验(非手机号验证码）
     *
     */
    @PostMapping(CHECK_LOGIN)
    UserCheckLoginVO checkLogin(@RequestParam("loginName") String loginName, @RequestParam("password") String password, @RequestParam(value = "orgId", required = false) Long orgId);
    /**
     * 登录校验(手机号验证码）
     *
     */
    @PostMapping(CHECK_LOGIN_BY_PHONE)
    AixiyaFwResponse checkLoginByPhone(@RequestParam("phone") String phone, @RequestParam("code") String code);
    /**
     * 根据用户名 组织 产品oath2Id 查询权限列表
     *
     */
    @PostMapping(GET_RESOURCE_CODE)
    String[] getResourceCode(@RequestParam("loginName") String loginName, @RequestParam(value = "orgId", required = false) Long orgId, @RequestParam(value = "oath2Id", required = false) String oath2Id);
    /**
     * 获取产品信息
     *
     */
    @PostMapping(GET_PRODUCTION_BY_OAUTH2_ID)
    Production getProductionByOAuth2Id(@RequestParam("oauth2Id") String oauth2Id);

    /**
     * 获取用户信息
     *
     */
    @PostMapping(GET_USER_BY_LOGIN_NAME)
    User getUserByLoginName(@RequestParam("loginName") String loginName, @RequestParam("orgId") String orgId);
}
