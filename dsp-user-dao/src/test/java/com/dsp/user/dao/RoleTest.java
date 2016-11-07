package com.dsp.user.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsp.model.Role;
import com.dsp.service.user.RoleService;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "classpath:spring-context.xml") // 加载配置
public class RoleTest extends TestCase {

	@Autowired // 注入
	private RoleService roleService;

	@Test
	public void findAllRoles() {
		List<Role> list = roleService.findAllRoles();
		if (null != list && list.size() > 0) {
			for (Role role : list) {
				System.out.println(role.getrRemark());
			}
		}

	}

	@Test
	public void findRolsByUid() {
		List<Role> list = roleService.findUserRolesById(1);
		if (null != list && list.size() > 0) {
			for (Role role : list) {
				System.out.println(role.getrRemark());
			}
		}
	}

}
