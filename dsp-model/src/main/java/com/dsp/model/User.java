package com.dsp.model;

import java.io.Serializable;

public class User implements Serializable{

	
	 /**@Fields serialVersionUID : TODO  
	 */
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String username;
	private String password;
	private String photo;
	private String salt;

	private Boolean locked = Boolean.FALSE;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	
}
