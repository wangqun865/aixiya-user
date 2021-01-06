package aixiya.framework.backend.platform.user.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
* 产品信息 Entity
*
* @author wangqun865@163.com
*/
@Data
@TableName("t_production")
public class Production {

    /**
     * 创建时间。
     */
    @TableField("cdt")
    private Date cdt;

    /**
     * 创建操作人。
逻辑外键：t_user->login_name。
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
     * 实现类型。
W - WEB应用；
A - APP应用。
     */
    @TableField("impl_type")
    private String implType;

    /**
     * WEB应用的域名。
     */
    @TableField("impl_web_domain")
    private String implWebDomain;

    /**
     * 是否使用SSL协议（https）。
0 - 否；
1 - 是。
     */
    @TableField("impl_web_ssl")
    private Byte implWebSsl;

    /**
     * WEB应用的首页路径。
     */
    @TableField("impl_web_url_index")
    private String implWebUrlIndex;

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
     * OAtuh2的授权类型。
C - Code方式；
P - Password方式。
     */
    @TableField("oauth2_gt")
    private String oauth2Gt;

    /**
     * OAtuh2的id。
     */
    @TableField("oauth2_id")
    private String oauth2Id;

    /**
     * OAtuh2的refreshtoken的有效时长，单位：分。
     */
    @TableField("oauth2_overtime_refresh_token")
    private Integer oauth2OvertimeRefreshToken;

    /**
     * OAtuh2的token的有效时长，单位：分。
     */
    @TableField("oauth2_overtime_token")
    private Integer oauth2OvertimeToken;

    /**
     * OAtuh2的权限范围。
     */
    @TableField("oauth2_scope")
    private String oauth2Scope;

    /**
     * OAtuh2的密钥。
     */
    @TableField("oauth2_sk")
    private String oauth2Sk;

    /**
     * 所属组织的数据主键。
逻辑外键：t_organization->did。
     */
    @TableField("orga_id")
    private Long orgaId;

    /**
     * 备注。
     */
    @TableField("remark")
    private String remark;

    /**
     * 原SSOP中产品id。
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
逻辑外键：t_user->login_name。
     */
    @TableField("updated_operator")
    private String updatedOperator;

    /**
     * 数据版本。
     */
    @TableField("ver")
    private Integer ver;

}