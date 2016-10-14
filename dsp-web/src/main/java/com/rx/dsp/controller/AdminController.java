package com.rx.dsp.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dsp.service.user.UserService;

@Controller
@RequestMapping(value="/admin")
public class AdminController{

	@Resource // 注入
	private UserService userService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
    public String home(String username,String password){
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);   
        Subject currentUser = SecurityUtils.getSubject();   
        currentUser.login(token);  
        return  "redirect:/"; 
    }

}
