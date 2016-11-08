package com.dsp.model;

public class Permission extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pId;
	private String pName;
	private String pRemark;
	private String pAvailable;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpRemark() {
		return pRemark;
	}
	public void setpRemark(String pRemark) {
		this.pRemark = pRemark;
	}
	public String getpAvailable() {
		return pAvailable;
	}
	public void setpAvailable(String pAvailable) {
		this.pAvailable = pAvailable;
	}

	
	
	
	
}
