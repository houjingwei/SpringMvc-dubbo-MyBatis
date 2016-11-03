package com.dsp.user.mapper;

import java.util.List;

import com.dsp.model.Role;


public interface RoleMapper {

	List<Role> findAllRoles();

	List<Role> findUserRolesById(Integer id);
}
