package aixiya.framework.backend.platform.user.api.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 登录校验返回vo
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserCheckLoginVO {
    //用户id，可能为组织管理员id也可能位用户id
    private String userId;
    //登录账号
    private String loginName;
    //是否为组织管理员 1-是 0- 不是
    private String ifManager;
    //是否登录成功
    private Boolean ifSuccess;
    //登录失败提示
    private String errorMessage;
    //用户中文名
    private String nameCn;
    //用户所属组织机构列表
    List<OrganizationVO> organizationForFeigns;
}
