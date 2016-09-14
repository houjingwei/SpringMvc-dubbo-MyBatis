package org.dsp.user.component;

import java.util.List;

import org.dsp.model.User;
import org.dsp.service.user.UserService;
import org.dsp.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
