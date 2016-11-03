package com.dsp.user.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsp.model.Permission;
import com.dsp.model.Role;
import com.dsp.service.user.PermissionService;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = "classpath:spring-context.xml") // 加载配置
public class PermissionTest extends TestCase {

	@Autowired // 注入
	private PermissionService permissionService;

	@Test
	public void findAllPermissions() {
		List<Permission> list = permissionService.findAllPermissions();
		if (null != list && list.size() > 0) {
			for (Permission P : list) {
				System.out.println(P.getDescription());
			}
		}

	}

	@Test
	public void findPermissionsByUid() {
		List<Permission> list = permissionService.findUserPermissionsById(1);
		if (null != list && list.size() > 0) {
			for (Permission P : list) {
				System.out.println(P.getDescription());
			}
		}
	}

}
