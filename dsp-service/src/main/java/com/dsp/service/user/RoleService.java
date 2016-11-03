package com.dsp.service.user;

import java.util.List;

import com.dsp.model.Role;

public interface RoleService {
	

	List<Role> findAllRoles();
	
	List<Role> findUserRolesById(Integer id);
	
}
