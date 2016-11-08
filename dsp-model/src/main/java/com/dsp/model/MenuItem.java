package com.dsp.model;

public class MenuItem extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer iid;;
	private Integer ipid;
	private String iname;
	private String iurl;
	private String itype;
	private String iorder;
	private String iremark;
	private Integer istatus;
	public Integer getIid() {
		return iid;
	}
	public void setIid(Integer iid) {
		this.iid = iid;
	}
	public Integer getIpid() {
		return ipid;
	}
	public void setIpid(Integer ipid) {
		this.ipid = ipid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIurl() {
		return iurl;
	}
	public void setIurl(String iurl) {
		this.iurl = iurl;
	}
	public String getItype() {
		return itype;
	}
	public void setItype(String itype) {
		this.itype = itype;
	}
	public String getIorder() {
		return iorder;
	}
	public void setIorder(String iorder) {
		this.iorder = iorder;
	}
	public String getIremark() {
		return iremark;
	}
	public void setIremark(String iremark) {
		this.iremark = iremark;
	}
	public Integer getIstatus() {
		return istatus;
	}
	public void setIstatus(Integer istatus) {
		this.istatus = istatus;
	}
	
	
}
