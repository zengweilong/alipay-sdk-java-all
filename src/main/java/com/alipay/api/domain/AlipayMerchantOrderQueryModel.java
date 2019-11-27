package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单查询接口
 *
 * @author auto create
 * @since 1.0, 2019-04-26 11:02:09
 */
public class AlipayMerchantOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8342278526174942281L;

	/**
	 * 支付宝内部业务订单编号，可以从对应的消息同步接口或查询接口获取。例如租享生活业务从同步消息接口alipay.merchant.order.changed获取订单的order_id，订单创建成功后会有消息发出，消息中包含order_id和创建订单时的out_biz_no。
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
