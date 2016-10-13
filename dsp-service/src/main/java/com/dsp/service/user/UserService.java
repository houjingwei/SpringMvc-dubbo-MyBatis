package com.dsp.service.user;

import java.util.List;
import java.util.Set;

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
	List<User> findList();


	/**
	 * 获取用户角色集合
	 * @param username
	 * @return
	 */
    Set<String> findRoles(String username);


	/**
	 * 获取用户权限集合
	 * @param username
	 * @return
	 */
	Set<String> findPermissions(String username);

	/**
	 * 通过用户名获取用户
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
}
