package com.dsp.user.component;

import java.util.List;

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
		// TODO Auto-generated method stub
		return userMapper.findList();
	}

	

}
