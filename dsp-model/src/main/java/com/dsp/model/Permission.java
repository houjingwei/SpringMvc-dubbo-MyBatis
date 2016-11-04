package com.dsp.model;

public class Permission extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String permission;
	private String description;
	private String available;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	
	
	
}
