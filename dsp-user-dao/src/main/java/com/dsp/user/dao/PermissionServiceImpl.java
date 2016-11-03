package com.dsp.user.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.Permission;
import com.dsp.service.user.PermissionService;
import com.dsp.user.mapper.PermissionMapper;

@Service(value="permissionService")
public class PermissionServiceImpl implements PermissionService {

	

	final Logger logger = Logger.getLogger(PermissionServiceImpl.class);
	
	@Autowired PermissionMapper permissionMapper;
	
	public List<Permission> findAllPermissions() {
		return permissionMapper.findAllPermissions();
	}

	public List<Permission> findUserPermissionsById(Integer id) {
		return permissionMapper.findUserPermissionsById(id);
	}

}
