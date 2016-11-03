package com.dsp.model;

import java.io.Serializable;

public class Role implements Serializable{

	
	 /**@Fields serialVersionUID : TODO  
	 */
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String role;
	private String description;
	private String available;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
