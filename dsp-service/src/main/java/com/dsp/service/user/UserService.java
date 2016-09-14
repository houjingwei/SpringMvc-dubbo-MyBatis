package com.dsp.service.user;

import java.util.List;

import com.dsp.model.User;


/**
 * 用户接口类
 * @author Houjingwei
 *
 */
public interface UserService {
	
	/**
	 * 用户集合
	 * @return
	 */
	public List<User> findList();
	
	
	
	

}
