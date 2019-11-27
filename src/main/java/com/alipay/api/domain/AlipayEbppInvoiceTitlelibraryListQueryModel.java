package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票抬头库模糊列表模糊查询
 *
 * @author auto create
 * @since 1.0, 2019-11-08 11:30:45
 */
public class AlipayEbppInvoiceTitlelibraryListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1615263927229692671L;

	/**
	 * 模糊查询的抬头名称
	 */
	@ApiField("title_simple_name")
	private String titleSimpleName;

	public String getTitleSimpleName() {
		return this.titleSimpleName;
	}
	public void setTitleSimpleName(String titleSimpleName) {
		this.titleSimpleName = titleSimpleName;
	}

}
