package com.dsp.user.mapper;

import java.util.List;

import com.dsp.model.Permission;


public interface PermissionMapper {


	List<Permission> findAllPermissions();

	List<Permission> findUserPermissionsById(Integer id);
}
