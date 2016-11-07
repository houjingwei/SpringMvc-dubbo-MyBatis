package com.dsp.user.dao;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.User;
import com.dsp.service.user.UserService;
import com.dsp.user.mapper.UserMapper;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	
	final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired UserMapper userMapper;
	
	public UserServiceImpl(){
		System.out.println("start service ok");
	}

	public List<User> findList() {
		System.out.println("request findList()");
		return userMapper.findList();
	}


	public Set<String> findRoles(String username) {
		System.out.println("request findRoles() >> param: username -- "+username);
		return userMapper.findRoles(username);
	}

	public Set<String> findPermissions(String username) {
		System.out.println("request findPermissions() >> param: username -- "+username);
		return userMapper.findPermissions(username);
	}

	public User findByUsername(String username) {
		System.out.println("request findByUsername() >> param: username -- "+username);
		User user = userMapper.findByUsername(username);
		System.out.println("response result user photo: >> " +user.getPhoto() );
		return user;
	}

	public User saveUser() {
		System.out.println("execute.......");
		Integer a = null;
		int b = a/10;
		return null;
	}


}
