package com.dsp.user.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsp.model.Role;
import com.dsp.service.user.RoleService;
import com.dsp.user.mapper.RoleMapper;

@Service(value="roleService")
public class RoleServiceImpl implements RoleService{

	final Logger logger = Logger.getLogger(RoleServiceImpl.class);
	
	@Autowired RoleMapper roleMapper;
	
	public List<Role> findAllRoles() {
		return roleMapper.findAllRoles();
	}

	public List<Role> findUserRolesById(Integer id) {
		return roleMapper.findUserRolesById(id);
	}

}
