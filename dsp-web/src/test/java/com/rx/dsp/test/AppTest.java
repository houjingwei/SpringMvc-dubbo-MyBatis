package com.rx.dsp.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsp.model.User;
import com.dsp.service.user.RoleService;
import com.dsp.service.user.UserService;
import com.rx.dsp.shiro.RedisCacheManager;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mvc.xml" }) // 加载配置
public class AppTest extends TestCase {

	@Autowired // 注入
	private UserService userService;
	
	
	@Autowired // 注入
	private RoleService roleService;
	

	@Test
	public void findUserList() {
		List<User> list = userService.findList();
		roleService.findAllRoles();
		System.out.println(list.get(0).getUsername());
	}

}
