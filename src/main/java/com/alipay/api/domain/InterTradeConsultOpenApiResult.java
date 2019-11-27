package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批次识别结果
 *
 * @author auto create
 * @since 1.0, 2019-09-26 11:38:36
 */
public class InterTradeConsultOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 1311195713125588469L;

	/**
	 * 合约识别结果
	 */
	@ApiListField("contracts")
	@ApiField("contract_consult_result_v_o")
	private List<ContractConsultResultVO> contracts;

	/**
	 * 是否需要发起审批
	 */
	@ApiField("need_approval")
	private Boolean needApproval;

	public List<ContractConsultResultVO> getContracts() {
		return this.contracts;
	}
	public void setContracts(List<ContractConsultResultVO> contracts) {
		this.contracts = contracts;
	}

	public Boolean getNeedApproval() {
		return this.needApproval;
	}
	public void setNeedApproval(Boolean needApproval) {
		this.needApproval = needApproval;
	}

}
