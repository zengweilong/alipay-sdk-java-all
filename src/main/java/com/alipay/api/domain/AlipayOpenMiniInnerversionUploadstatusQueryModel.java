package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询构建状态
 *
 * @author auto create
 * @since 1.0, 2018-07-23 20:38:16
 */
public class AlipayOpenMiniInnerversionUploadstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5565759861919554713L;

	/**
	 * 包管理ID，用于查询打包状态
	 */
	@ApiField("build_package_id")
	private String buildPackageId;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getBuildPackageId() {
		return this.buildPackageId;
	}
	public void setBuildPackageId(String buildPackageId) {
		this.buildPackageId = buildPackageId;
	}

	public String getBuildVersion() {
		return this.buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}