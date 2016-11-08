package com.rx.dsp.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.alibaba.fastjson.JSONObject;
import com.dsp.common.BootPage;
import com.dsp.model.Role;
import com.dsp.service.user.RoleService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value="/admin")
public class AdminController{

	@Resource RoleService roleService;
	
	@RequestMapping(value = "/roles")
    @ResponseBody
    public String roles(Map map,BootPage page){
    	//角色
//    	List<Role> roles = roleService.findAllRoles();
//    	map.put("roles", roles);
    	if(page==null){
    		page = new BootPage<Role>();
    		page.setOffset(1);
    		page.setLimit(3);
    	}
    	page.setOffset(1);
    	BootPage<Role> roles = roleService.findPageRoles(page);
    	JSONObject json = new JSONObject();
    	
    	return json.toJSONString(roles);
    }

}
