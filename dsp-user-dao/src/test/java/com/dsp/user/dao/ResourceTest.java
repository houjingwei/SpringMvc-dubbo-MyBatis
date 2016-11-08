package com.dsp.user.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dsp.model.Resource;
import com.dsp.model.Role;
import com.dsp.service.user.ResourceService;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = "classpath:spring-context.xml") // 加载配置
public class ResourceTest extends TestCase {

	@Autowired // 注入
	private ResourceService resourceService;

	@Test
	public void findAllPermissions() {
		List<Resource> list = resourceService.findAllResources();
		if (null != list && list.size() > 0) {
			for (Resource P : list) {
				System.out.println(P.getRemark());
			}
		}

	}
	
	@Test
	public void findAll() {
		List<Resource> list = resourceService.findAllResourcesAndMenuAndItem();
		if (null != list && list.size() > 0) {
			for (Resource P : list) {
				System.out.println(P.getRemark());
			}
		}

	}

	@Test
	public void findPermissionsByUid() {
		List<Resource> list = resourceService.findUserResourcesById(1);
		if (null != list && list.size() > 0) {
			for (Resource P : list) {
				System.out.println(P.getRemark());
			}
		}
	}

}
