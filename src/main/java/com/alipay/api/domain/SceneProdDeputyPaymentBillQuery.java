package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融银行直投代客还款账单查询明细
 *
 * @author auto create
 * @since 1.0, 2019-08-27 14:21:05
 */
public class SceneProdDeputyPaymentBillQuery extends AlipayObject {

	private static final long serialVersionUID = 1667846391849855122L;

	/**
	 * 代客还款业务类型
DEPUTY 普通代客还款
COMPENSATE 代偿，后续可发起线上追偿
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 代客还款的网商银行结算户信息
	 */
	@ApiField("deputy_account")
	private String deputyAccount;

	/**
	 * 代客还款状态，VALID 代客还款， INVALID 取消代客还款，USING代客还款中，USED已代客还款
	 */
	@ApiField("deputy_status")
	private String deputyStatus;

	/**
	 * 期数
	 */
	@ApiField("term")
	private String term;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDeputyAccount() {
		return this.deputyAccount;
	}
	public void setDeputyAccount(String deputyAccount) {
		this.deputyAccount = deputyAccount;
	}

	public String getDeputyStatus() {
		return this.deputyStatus;
	}
	public void setDeputyStatus(String deputyStatus) {
		this.deputyStatus = deputyStatus;
	}

	public String getTerm() {
		return this.term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

}
