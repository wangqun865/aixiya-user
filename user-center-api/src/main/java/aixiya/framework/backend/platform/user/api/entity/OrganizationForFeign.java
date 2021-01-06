package aixiya.framework.backend.platform.user.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
* 组织表 Entity
*
* @author wangqun865@163.com
*/
@Data
@TableName("t_organization")
public class OrganizationForFeign {
    /**
     * 账户名称。
     */
    @TableField("bank_account_name")
    private String bankAccountName;

    /**
     * 账户账号。
     */
    @TableField("bank_account_no")
    private String bankAccountNo;

    /**
     * 开户行名称。
     */
    @TableField("bank_name")
    private String bankName;

    /**
     * 创建时间。
     */
    @TableField("cdt")
    private Date cdt;

    /**
     * 国税税务登记号。
     */
    @TableField("code_gsd")
    private String codeGsd;

    /**
     * 统一社会信用代码。
     */
    @TableField("code_tsx")
    private String codeTsx;

    /**
     * 营业执照注册号。
     */
    @TableField("code_yzz")
    private String codeYzz;

    /**
     * 组织机构代码。
     */
    @TableField("code_zjd")
    private String codeZjd;

    /**
     * 联系地址。
     */
    @TableField("contact_addr")
    private String contactAddr;

    /**
     * 联系邮箱地址。
     */
    @TableField("contact_email")
    private String contactEmail;

    /**
     * 联系传真号码。
     */
    @TableField("contact_fax")
    private String contactFax;

    /**
     * 联系手机号码。
     */
    @TableField("contact_mob")
    private String contactMob;

    /**
     * 联系邮政编码。
     */
    @TableField("contact_post")
    private String contactPost;

    /**
     * 联系固话号码。
     */
    @TableField("contact_tel")
    private String contactTel;

    /**
     * 联系人。
     */
    @TableField("contact_user")
    private String contactUser;

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
     * 法人身份证件号码。
     */
    @TableField("id_card_no_fr")
    private String idCardNoFr;

    /**
     * 法人身份证件类型。
1 – 身份证；
2 – 护照；
3 – 外国人居留证；
4 – 港澳居民来往内地通行证；
5 – 台湾居民来往内地通行证。
     */
    @TableField("id_card_type_fr")
    private String idCardTypeFr;

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
     * 所属母公司组织的数据主键。
逻辑外键：t_organization->did。
     */
    @TableField("parent_did")
    private Long parentDid;

    /**
     * 备注。
     */
    @TableField("remark")
    private String remark;

    /**
     * 原SSOP中组织id。
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

}