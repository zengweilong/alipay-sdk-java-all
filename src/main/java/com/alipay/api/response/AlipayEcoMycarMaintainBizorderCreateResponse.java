package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.bizorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 11:19:58
 */
public class AlipayEcoMycarMaintainBizorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7323896872233585191L;

	/** 
	 * 业务订单编号，规则28位；
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
