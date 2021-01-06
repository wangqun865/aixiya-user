package aixiya.framework.backend.platform.user.api.entity;

import aixiya.framework.backend.platform.user.api.vo.OrganizationVO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
* 用户表 Entity
*
* @author wangqun865@163.com
*/
@Data
@TableName("t_user")
public class User {

    /**
     * 创建时间。
     */
    @TableField("cdt")
    private Date cdt;

    /**
     * 联系邮箱地址。
     */
    @TableField("contact_email")
    private String contactEmail;

    /**
     * 联系手机号码。
     */
    @TableField("contact_mob")
    private String contactMob;

    /**
     * 联系固话号码。
     */
    @TableField("contact_tel")
    private String contactTel;

    /**
     * 创建操作人。
逻辑外键：t_user->login_name
或：t_organization_mgr->login_name。
     */
    @TableField("created_operator")
    private String createdOperator;

    /**
     * 数据主键。
     */
    @TableId(value = "did", type = IdType.AUTO)
    private Long did;

    /**
     * 是否禁用。
0 - 否；
1 - 是。
     */
    @TableField("disabled")
    private Byte disabled;

    /**
     * 禁用时间。
     */
    @TableField("disabled_dt")
    private Date disabledDt;

    /**
     * 禁用操作人。
逻辑外键：t_user->login_name。
     */
    @TableField("disabled_operator")
    private String disabledOperator;

    /**
     * 禁用原因。
     */
    @TableField("disabled_reason")
    private String disabledReason;

    /**
     * 是否废弃（逻辑删除）。
0 - 否；
1 - 是。
     */
    @TableField("discarded")
    private Byte discarded;

    /**
     * 废弃时间。
     */
    @TableField("discarded_dt")
    private Date discardedDt;

    /**
     * 废弃操作人。
逻辑外键：t_user->login_name。
     */
    @TableField("discarded_operator")
    private String discardedOperator;

    /**
     * 废弃原因。
     */
    @TableField("discarded_reason")
    private String discardedReason;

    /**
     * 身份证件号码。
     */
    @TableField("id_card_no")
    private String idCardNo;

    /**
     * 身份证件类型。
1 – 身份证；
2 – 护照；
3 – 外国人居留证；
4 – 港澳居民来往内地通行证；
5 – 台湾居民来往内地通行证。
     */
    @TableField("id_card_type")
    private String idCardType;

    /**
     * 登录用户名。
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 登录密码，须加盐加密存储。
     */
    @TableField("login_pwd")
    private String loginPwd;

    /**
     * 中文名称。
     */
    @TableField("name_cn")
    private String nameCn;

    /**
     * 英文名称。
     */
    @TableField("name_en")
    private String nameEn;

    /**
     * 备注。
     */
    @TableField("remark")
    private String remark;

    /**
     * 性别。
M - 男；
F - 女。
     */
    @TableField("sex")
    private String sex;

    /**
     * 原SSOP中用户id。
     */
    @TableField("ssop_id")
    private String ssopId;

    /**
     * 更新时间。
     */
    @TableField("udt")
    private Date udt;

    /**
     * 更新操作人。
逻辑外键：t_user->login_name
或：t_organization_mgr->login_name。
     */
    @TableField("updated_operator")
    private String updatedOperator;

    /**
     * 数据版本。
     */
    @TableField("ver")
    private Integer ver;

    /**
     * 用户所属组织信息
     */
    private OrganizationVO organization;

}