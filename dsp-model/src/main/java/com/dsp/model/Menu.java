package com.dsp.model;

import java.util.ArrayList;
import java.util.List;

public class Menu extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer mid;
	private Integer mpid;
	private String mname;
	private String murl;
	private String mtype;
	private String morder;
	private String mremark;
	private Integer mstatus;
	private List<MenuItem> miList = new ArrayList<MenuItem>();
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getMpid() {
		return mpid;
	}
	public void setMpid(Integer mpid) {
		this.mpid = mpid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMurl() {
		return murl;
	}
	public void setMurl(String murl) {
		this.murl = murl;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getMorder() {
		return morder;
	}
	public void setMorder(String morder) {
		this.morder = morder;
	}
	public String getMremark() {
		return mremark;
	}
	public void setMremark(String mremark) {
		this.mremark = mremark;
	}
	public Integer getMstatus() {
		return mstatus;
	}
	public void setMstatus(Integer mstatus) {
		this.mstatus = mstatus;
	}
	public List<MenuItem> getMiList() {
		return miList;
	}
	public void setMiList(List<MenuItem> miList) {
		this.miList = miList;
	}	
	
}
