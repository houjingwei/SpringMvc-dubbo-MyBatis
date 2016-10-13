package com.dsp.user.component;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.User;
import com.dsp.service.user.UserService;
import com.dsp.user.mapper.UserMapper;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	
	@Autowired UserMapper userMapper;
	
	public UserServiceImpl(){
		System.out.println("start service ok");
	}

	public List<User> findList() {
		return userMapper.findList();
	}


	public Set<String> findRoles(String username) {
		return userMapper.findRoles(username);
	}

	public Set<String> findPermissions(String username) {
		return userMapper.findPermissions(username);
	}

	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}


}
