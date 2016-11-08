package com.dsp.user.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.Permission;
import com.dsp.model.Role;
import com.dsp.service.cache.CacheService;
import com.dsp.service.user.PermissionService;
import com.dsp.user.mapper.PermissionMapper;

@Service(value="permissionService")
public class PermissionServiceImpl implements PermissionService {

	

	final Logger logger = Logger.getLogger(PermissionServiceImpl.class);
	
	@Autowired PermissionMapper permissionMapper;
	@Autowired CacheService cacheService;
	
	public List<Permission> findAllPermissions() {
		List<Permission> list = null;
		if(!cacheService.exists("findAllPermissions")){
			System.out.println("数据库获取");
			list = permissionMapper.findAllPermissions();
			if(null!=list){
				cacheService.addList("findAllPermissions", list,1);
			}
			list = (List<Permission>) cacheService.getList("findAllPermissions");
		}else{
			System.out.println("redis获取");
			list = (List<Permission>) cacheService.getList("findAllPermissions");
		}
		return list;
		
	}

	public List<Permission> findUserPermissionsById(Integer id) {
		List<Permission> list = null;
		if(!cacheService.exists("findUserPermissionsById")){
			System.out.println("数据库获取");
			list = permissionMapper.findUserPermissionsById(id);
			if(null!=list){
				cacheService.addList("findUserPermissionsById", list,1);
			}
			list = (List<Permission>) cacheService.getList("findUserPermissionsById");
		}else{
			System.out.println("redis获取");
			list = (List<Permission>) cacheService.getList("findUserPermissionsById");
		}
		return list;
	}

}
