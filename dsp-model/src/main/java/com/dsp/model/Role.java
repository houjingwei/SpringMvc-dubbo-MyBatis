package com.dsp.model;

import java.util.List;

public class Role extends BaseModel{

	
	 /**@Fields serialVersionUID : TODO  
	 */
	
	private static final long serialVersionUID = 1L;
	private Integer rId;
	private String rName;
	private String rRemark;
	private String rAvailable;
	private List<Permission> pList;
	
	
	
	public Integer getrId() {
		return rId;
	}
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrRemark() {
		return rRemark;
	}
	public void setrRemark(String rRemark) {
		this.rRemark = rRemark;
	}
	public String getrAvailable() {
		return rAvailable;
	}
	public void setrAvailable(String rAvailable) {
		this.rAvailable = rAvailable;
	}
	public List<Permission> getpList() {
		return pList;
	}
	public void setpList(List<Permission> pList) {
		this.pList = pList;
	}
	
	
	
}
