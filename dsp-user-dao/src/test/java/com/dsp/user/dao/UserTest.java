package com.dsp.user.dao;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsp.model.User;
import com.dsp.service.cache.CacheService;
import com.dsp.service.user.UserService;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = "classpath:spring-context.xml") // 加载配置
public class UserTest extends TestCase {

	@Autowired 
	private UserService userService;
	
	@Autowired 
	private CacheService cacheService;

	@Test
	public void findUserList() {
		List<User> list = userService.findList();
		System.out.println(list.get(0).getUsername());
	}

	@Test
	public void findRoles() {
		Set<String> list = userService.findRoles("hjw");
		System.out.println(list.size());
	}

	@Test
	public void findPe() {
		Set<String> list = userService.findPermissions("hjw");
		System.out.println(list.size());
	}
	
	@Test
	public void findUser() {
		User user  = userService.findByUsername("hjw");
		System.out.println(user.getUsername());
	}

}
