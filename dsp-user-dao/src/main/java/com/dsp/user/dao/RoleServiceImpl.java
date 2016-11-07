package com.dsp.user.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.Role;
import com.dsp.service.cache.CacheService;
import com.dsp.service.user.RoleService;
import com.dsp.user.mapper.RoleMapper;

@Service(value="roleService")
public class RoleServiceImpl implements RoleService{

	final Logger logger = Logger.getLogger(RoleServiceImpl.class);
	
	@Autowired RoleMapper roleMapper;
	
	@Autowired CacheService cacheService;
	
	public List<Role> findAllRoles() {
		List<Role> list = null;
		if(!cacheService.exists("findAllRoles")){
			System.out.println("数据库获取");
			list = roleMapper.findAllRoles();
			if(null!=list){
				cacheService.addList("findAllRoles", list,1);
			}
		}else{
			System.out.println("redis获取");
			list = (List<Role>) cacheService.getList("findAllRoles");
		}
		return list;
		
	}

	public List<Role> findUserRolesById(Integer id) {
		
		List<Role> list = null;
		if(!cacheService.exists("findAllRoles")){
			System.out.println("数据库获取");
			list = roleMapper.findUserRolesById(id);
			if(null!=list){
				cacheService.addList("findUserRolesById", list,1);
			}
		}else{
			System.out.println("redis获取");
			list = (List<Role>) cacheService.getList("findUserRolesById");
		}
		return list;
	}

}
