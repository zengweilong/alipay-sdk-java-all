package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 为用户外部账号打上标签
 *
 * @author auto create
 * @since 1.0, 2017-09-13 22:02:13
 */
public class AlipayEbppIndustryUserBillkeytagCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3899338226948166744L;

	/**
	 * 水电煤户号、纳税人识别号等机构端用于识别用户的编码。
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 机构简称，例如杭州电力HZELECTRIC
	 */
	@ApiField("biz_inst_short_name")
	private String bizInstShortName;

	/**
	 * 业务类型，缴费业务为JF，还款业务HK，社保公积金为IND
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展属性，JSON格式
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 子业务类型，水费为WATER，燃气费为GAS，社保为SI，公积金为HF，社保和公积金为SIHF
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 标签，例如废弃（DEPRECATED）
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizInstShortName() {
		return this.bizInstShortName;
	}
	public void setBizInstShortName(String bizInstShortName) {
		this.bizInstShortName = bizInstShortName;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
