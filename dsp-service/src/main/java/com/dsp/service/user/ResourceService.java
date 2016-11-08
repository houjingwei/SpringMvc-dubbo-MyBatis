package com.dsp.service.user;

import java.util.List;

import com.dsp.model.Permission;

public interface PermissionService {
	

	List<Permission> findAllPermissions();
	
	List<Permission> findUserPermissionsById(Integer id);
	
}
