package com.dsp.user.dao;

import java.util.List;

import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.Resource;
import com.dsp.service.cache.CacheService;
import com.dsp.service.user.ResourceService;
import com.dsp.user.mapper.ResourceMapper;

@Service(value = "resourceService")
public class ResourceServiceImpl implements ResourceService {

	final Logger logger = Logger.getLogger(ResourceServiceImpl.class);

	@Autowired
	ResourceMapper resourceMapper;
	@Autowired
	CacheService cacheService;

	public List<Resource> findUserResourcesById(Integer id) {
		List<Resource> list = null;
		if (!cacheService.exists("findUserResourcesById")) {
			System.out.println("数据库获取");
			list = resourceMapper.findUserResourcesById(id);
			if (null != list) {
				cacheService.addList("findUserResourcesById", list, 1);
			}
		} else {
			System.out.println("redis获取");
			list = (List<Resource>) cacheService.getList("findUserResourcesById");
		}
		return list;
	}

	public List<Resource> findAllResources() {
		List<Resource> list = null;
		if (!cacheService.exists("findAllResources")) {
			System.out.println("数据库获取");
			list = resourceMapper.findAllResources();
			if (null != list) {
				cacheService.addList("findAllResources", list, 1);
			}
		} else {
			System.out.println("redis获取");
			list = (List<Resource>) cacheService.getList("findAllResources");
		}
		return list;

	}

	public List<Resource> findAllResourcesAndMenu() {
		List<Resource> resourceList = null;
		if (!cacheService.exists("findAllResourcesAndMenu")) {
			System.out.println("数据库获取");
			resourceList = resourceMapper.findAllResources();
			List<Resource> menuList = resourceMapper.findAllResourcesAndMenu();
			resourceAndMenu(resourceList, menuList);
			cacheService.addList("findAllResourcesAndMenu", resourceList, 1);
		} else {
			System.out.println("redis获取");
			resourceList = (List<Resource>) cacheService.getList("findAllResourcesAndMenu");
		}
		return resourceList;
	}


	public List<Resource> findAllResourcesAndMenuAndItem() {
		List<Resource> resourceList = null;
		if (!cacheService.exists("findAllResourcesAndMenuAndItem")) {
			System.out.println("数据库获取");
			resourceList = resourceMapper.findAllResources();
			List<Resource> menuList = resourceMapper.findAllResourcesAndMenu();
			List<Resource> itemList = resourceMapper.findAllResourcesAndMenuAndItem();
			resourceAndMenu(menuList, itemList);
			resourceAndMenu(resourceList, menuList);
			if (null != resourceList) {
				cacheService.addList("findAllResourcesAndMenuAndItem", resourceList, 1);
			}
		} else {
			System.out.println("redis获取");
			resourceList = (List<Resource>) cacheService.getList("findAllResourcesAndMenuAndItem");
		}
		return resourceList;
	}
	
	
	

	/**
	 * 设置资源菜单操作
	 * @param pList
	 * @param sList
	 */
	private void resourceAndMenu(List<Resource> pList, List<Resource> sList) {
		if (null != pList && null != sList) {
			for (Resource resource : pList) {
				for (Resource r : sList) {
					if (r.getPid() == resource.getId()) {
						resource.getmList().add(r);
					}
				}
			}
		}
	}

}
